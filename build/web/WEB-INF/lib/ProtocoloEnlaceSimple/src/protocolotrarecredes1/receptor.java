/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package protocolotrarecredes1;


public class receptor {
    private Ventana ventana;
    private trama tramaR;
    private trama tramaE;
    private int cantidad_trama_recibir;
    private String mensaje;
    
    public receptor(Ventana v){
        this.ventana = v;
        tramaR = null;
        tramaE = null;
        this.mensaje = "MENSAJE RECEPTOR --> ";
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
    
    public void imprimir_mensaje(){
        System.out.println("");
        System.out.println("");
        System.out.println("EL MENSAJE HASTA EL MOMENTO ES :  "+ this.mensaje);
        ventana.getjTextMensajes().setText(mensaje);
        System.out.println("");
        System.out.println("");
    }
    
    public trama responder(trama trama){
        
        
        this.tramaR = trama;
        imprimirR();
        //SI YA PUEDE TRANSMITIR ENVIEME LOS DATOS
        if(tramaR.isPTP() && tramaR.isTDAT()){
            this.cantidad_trama_recibir = tramaR.getNUM();
            this.tramaE = new trama("", true, true, true, true, 1);
            String mensaje1 = "Trama "+ventana.getNumero_trama()+": (Rx) \n Control listo \n para recibir. \n\n";
            ventana.getjTextAreaINFOTRAMA().setText(ventana.getjTextAreaINFOTRAMA().getText() + mensaje1);
            ventana.setNumero_trama(ventana.getNumero_trama()+1);
            imprimirE();
            return tramaE;
        }
        //DATOS RECIBIDO CON EXITO
        if(tramaR.getNUM()<=cantidad_trama_recibir){
            if(!tramaR.isACK() && !tramaR.isPTP() && !tramaR.isLPR() && !tramaR.isTDAT()){
            this.mensaje += tramaR.getMensaje()+"";
            this.tramaE = new trama("", true, false, true, true, tramaR.getNUM());
            imprimirE();
            String mensaje1 = "Trama "+ventana.getNumero_trama()+": (Rx) \n Control \n Frame: "+tramaR.getNUM()+"\n recibida con éxito \n\n";
            ventana.getjTextAreaINFOTRAMA().setText(ventana.getjTextAreaINFOTRAMA().getText() + mensaje1);
            ventana.setNumero_trama(ventana.getNumero_trama()+1);
            imprimir_mensaje();
            return tramaE;
        }
        }
        
        return null;
    }
    
    public void imprimirE(){
        System.out.println("RECEPTOR ENVIA");
        System.out.println("Mensaje: " + tramaE.getMensaje());
        System.out.println("ACK: " + tramaE.isACK());
        System.out.println("PTP: " + tramaE.isPTP());
        System.out.println("LPR: " + tramaE.isLPR());
        System.out.println("TDAT: " + tramaE.isTDAT());
        System.out.println("NUM: " + tramaE.getNUM());
        System.out.println("");
        System.out.println("");
        System.out.println("");
        setVentanaInfo(tramaE);
    }
    
    public void imprimirR(){
        System.out.println("RECEPTOR RECIBE");
        System.out.println("Mensaje: " + tramaR.getMensaje());
        System.out.println("ACK: " + tramaR.isACK());
        System.out.println("PTP: " + tramaR.isPTP());
        System.out.println("LPR: " + tramaR.isLPR());
        System.out.println("TDAT: " + tramaR.isTDAT());
        System.out.println("NUM: " + tramaR.getNUM());
        System.out.println("");
        System.out.println("");
        System.out.println("");
        setVentanaInfo(tramaR);
        
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
    
    public void setVentanaInfo(trama trama){
        ventana.getCheckboxACK().setState(trama.isACK());
        ventana.getCheckboxRPTP().setState(trama.isPTP());
        ventana.getCheckboxRLPR().setState(trama.isLPR());
        ventana.getCheckboxRTDAT().setState(trama.isTDAT());
        ventana.getjTextFieldRIndInicio().setText(String.valueOf(trama.getIndicadorInicio()));
        ventana.getjTextFieldRACK().setText(convertir(trama.isACK()));
        ventana.getjTextFieldRPTP().setText(convertir(trama.isPTP()));
        ventana.getjTextFieldRLRP().setText(convertir(trama.isLPR()));
        ventana.getjTextFieldRTDAT().setText(convertir(trama.isTDAT()));
        ventana.getjTextFieldRNUM().setText(String.valueOf(trama.getNUM()));
        ventana.getjTextFieldRIndFin().setText(String.valueOf(trama.getInidicadorFin()));
        ventana.getjTextFieldInfoFrame().setText(infoFrame(trama));
    }
    
    public String convertir(boolean a){
        if(a){
            return "1";
        }else{
            return "0";
        }
    }

    
    
    
    
}
