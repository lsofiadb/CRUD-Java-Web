/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package protocolotrarecredes1;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class emisor {

    private final Ventana ventana;
    String mensaje;
    int frames;
    private trama tramaR;
    private trama tramaE;
    private String[] marcos;
    private int marcos_enviados = 0;
    private boolean isMensajeToVentana;

    public emisor(Ventana ventana) {
        this.ventana = ventana;
    }

    public emisor(String mensaje, int frames, Ventana v) {
        this.ventana = v;
        this.mensaje = mensaje;
        this.frames = frames;
        tramaR = null;
        tramaE = null;
        this.isMensajeToVentana = false;

    }

    public void cambiarDatosDeVentana() {

    }

    public trama enviar(trama trama) {
        tramaR = trama;
        imprimirR();
        if (marcos_enviados >= frames) {
            ventana.setFin(true);
            JOptionPane.showMessageDialog(null, "Fin de la transmision");
            
        } else {
            //RECEPTOR LISTO PARA RECIBIR
            if (tramaR.isACK() && tramaR.isPTP() && tramaR.isLPR() && tramaR.isTDAT()) {
                if (!isMensajeToVentana) {
                    transformar_mensaje_ventanas();
                }
                if (marcos_enviados <= frames) {
                    tramaE = new trama(marcos[marcos_enviados], false, false, false, false, marcos_enviados + 1);
                    marcos_enviados += 1;
                    String mensaje1 = "Trama "+ventana.getNumero_trama()+": (Tx) \n Datos \n Frame: "+tramaE.getNUM()+". \n\n";
                    ventana.getjTextAreaINFOTRAMA().setText(ventana.getjTextAreaINFOTRAMA().getText() + mensaje1);
                    ventana.setNumero_trama(ventana.getNumero_trama()+1);
                    imprimirE();
                    return tramaE;
                }

            }
            //SIGUEME ENVIANDO EL MENSAJE
            if (tramaR.isACK() && !tramaR.isPTP() && tramaR.isLPR() && tramaR.isTDAT()) {
                if (marcos_enviados <= frames) {
                    tramaE = new trama(marcos[marcos_enviados], false, false, false, false, marcos_enviados + 1);
                    marcos_enviados += 1;
                    imprimirE();
                    String mensaje1 = "Trama "+ventana.getNumero_trama()+": (Tx) \n Datos \n Frame: "+tramaE.getNUM()+". \n\n";
                    ventana.getjTextAreaINFOTRAMA().setText(ventana.getjTextAreaINFOTRAMA().getText() + mensaje1);
                    ventana.setNumero_trama(ventana.getNumero_trama()+1);
                    return tramaE;
                }
            }
        }

        return null;
    }

    public void transformar_mensaje_ventanas() {
        System.out.println("");
        System.out.println("TRANSFORMANDO MENSAJES EN VENTANAS... PORQUE NO SE HABIAN TRANSOFRMADO...");
        System.out.println("");

        //--------------------------------------
        String mensaje_original = this.mensaje;
        int numero_frame = frames;

        int mod = mensaje_original.length() % numero_frame;
        int cantidad_de_letras_por_frame = 0;
        if (mod != 0) {
            cantidad_de_letras_por_frame = Math.floorDiv(mensaje_original.length(), numero_frame) + 1;
        } else {
            cantidad_de_letras_por_frame = Math.floorDiv(mensaje_original.length(), numero_frame);
        }
        String[] ventanas = new String[numero_frame];
        String[] mensajeTemporal = mensaje_original.split("");

        //System.out.println("CANTIDAD DE LETRAS POR FRAME: " + cantidad_de_letras_por_frame);
        //System.out.println("NUMERO DE VENTANAS: " + ventanas.length);
        int cont = 0;
        for (int i = 0; i < ventanas.length; i++) {
            String temporal = "";
            for (int j = 0; j < cantidad_de_letras_por_frame; j++) {
                if (cont < mensaje_original.length()) {
                    temporal = temporal + mensajeTemporal[cont];
                    cont += 1;
                }

            }
            ventanas[i] = temporal;
            temporal = "";
        }
        //VENTANAS QUE VAMOS A ENVIAR ESTA EN VENTANAS

//        for (int i = 0; i < ventanas.length; i++) {
//            System.out.println("VENTANA: " + ventanas[i]);
//        }
        this.isMensajeToVentana = true;
        this.marcos = ventanas;
    }

    public trama getTramaInicial() {
        tramaE = new trama("", false, true, false, true, this.frames);
        String mensaje1 = "Trama "+ventana.getNumero_trama()+": (Tx) \n Control permiso \n para transmitir. \n\n";
        ventana.getjTextAreaINFOTRAMA().setText(ventana.getjTextAreaINFOTRAMA().getText() + mensaje1);
        ventana.setNumero_trama(ventana.getNumero_trama()+1);
        imprimirE();

        return tramaE;
    }

    public trama getTramaR() {
        return tramaR;
    }

    public void setTramaR(trama tramaR) {
        this.tramaR = tramaR;
    }

    public trama getTramaE() {
        return tramaE;
    }

    public void setTramaE(trama tramaE) {
        this.tramaE = tramaE;
    }

    public void imprimirE() {
        System.out.println("EMISOR ENVIA");
        System.out.println("Mensaje: " + tramaE.getMensaje());
        System.out.println("ACK: " + tramaE.isACK());
        System.out.println("PTP: " + tramaE.isPTP());
        System.out.println("LRP: " + tramaE.isLPR());
        System.out.println("TDAT: " + tramaE.isTDAT());
        System.out.println("NUM: " + tramaE.getNUM());
        System.out.println("");
        System.out.println("");
        System.out.println("");
        
        setVentanaInfo(tramaE);
    
    }
    
    public String infoFrame(trama trama){
        String cadena = "";
        cadena += String.valueOf(trama.getIndicadorInicio())+"";
        cadena += convertir(trama.isACK())+"";
        cadena += convertir(trama.isPTP()) + "";
        cadena += convertir(trama.isLPR()) + "";
        cadena += convertir(trama.isTDAT()) + "";
        cadena += String.valueOf(trama.getNUM()) + "";
        cadena += String.valueOf(trama.getInidicadorFin()) + "";
        return cadena;
    }
    
    public String Info(trama trama){
        String cadena = "";
        cadena += convertir(trama.isACK())+"";
        cadena += convertir(trama.isPTP()) + "";
        cadena += convertir(trama.isLPR()) + "";
        cadena += convertir(trama.isTDAT()) + "";
        cadena += String.valueOf(trama.getNUM()) + "";
        return cadena;
    }
    
    public void setVentanaInfo(trama trama){
        ventana.getCheckboxEACK().setState(trama.isACK());
        ventana.getCheckboxEPTP().setState(trama.isPTP());
        ventana.getCheckboxELPR().setState(trama.isLPR());
        ventana.getCheckboxETDAT().setState(trama.isTDAT());
        //ventana.getCheckboxENUM().setState(trama.getNUM());
        ventana.getjTextFieldEIndInicio().setText(String.valueOf(trama.getIndicadorInicio()));
        ventana.getjTextFieldEACK().setText(convertir(trama.isACK()));
        ventana.getjTextFieldEPTP().setText(convertir(trama.isPTP()));
        ventana.getjTextFieldELPR().setText(convertir(trama.isLPR()));
        ventana.getjTextFieldETDAT().setText(convertir(trama.isTDAT()));
        ventana.getjTextFieldENUM().setText(String.valueOf(trama.getNUM()));
        ventana.getjTextFieldEIndFin().setText(String.valueOf(trama.getInidicadorFin()));
        ventana.getjTextFieldInfoFrame().setText(infoFrame(trama));
        ventana.getjTextFieldRHeader().setText(String.valueOf(trama.getIndicadorInicio()));
        ventana.getjTextFieldRTrailer().setText(String.valueOf(trama.getInidicadorFin()));
        ventana.getjTextFieldRInfo().setText(Info(trama));
        
        
        
    }
    
    public String convertir(boolean a){
        if(a){
            return "1";
        }else{
            return "0";
        }
    }

    public void imprimirR() {
        System.out.println("EMISOR RECIBE");
        System.out.println("Mensaje: " + tramaR.getMensaje());
        System.out.println("ACK: " + tramaR.isACK());
        System.out.println("PTP: " + tramaR.isPTP());
        System.out.println("LRP: " + tramaR.isLPR());
        System.out.println("TDAT: " + tramaR.isTDAT());
        System.out.println("NUM: " + tramaR.getNUM());
        System.out.println("");
        System.out.println("");
        System.out.println("");
        
        
        setVentanaInfo(tramaR);
        
        

    }

}
