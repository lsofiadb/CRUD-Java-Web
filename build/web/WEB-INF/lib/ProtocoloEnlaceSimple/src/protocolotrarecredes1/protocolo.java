/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package protocolotrarecredes1;

public class protocolo {
    private int frame;
    private emisor emisor;
    private receptor receptor;
    private boolean paso;
    private trama trama;
    
    
    public protocolo(emisor e, receptor r, int frame){
        this.emisor = e;
        this.receptor = r;
        this.frame = frame;
        this.paso = false;
        this.trama = null;
    }
    
    
    
    public void iniciar(){
        this.trama = emisor.getTramaInicial();
        
    }
    
    public void emisor(){
        this.trama = emisor.enviar(this.trama);
    }
    
    public void receptor(){
        this.trama = receptor.responder(this.trama);
    }
    
    
    public void solicitarTransmision(){
        emisor.enviar(receptor.responder(emisor.enviar(receptor.responder(emisor.enviar(receptor.responder(emisor.getTramaInicial()))))));
    }
}
