/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package protocolotrarecredes1;

public class trama {
    private String mensaje;
    private boolean ACK;
    private boolean PTP;
    private boolean LPR;
    private boolean TDAT;
    private int NUM;
    private int indicadorInicio;
    private int inidicadorFin;
    
    public trama (String mensaje, boolean ACK, boolean PTP, boolean LPR, boolean TDAT, int NUM){
        this.mensaje= mensaje;
        this.ACK = ACK;
        this.PTP = PTP;
        this.TDAT = TDAT;
        this.LPR = LPR;
        this.NUM = NUM;
        this.inidicadorFin = 10001;
        this.indicadorInicio = 10001;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public boolean isACK() {
        return ACK;
    }

    public void setACK(boolean ACK) {
        this.ACK = ACK;
    }

    public boolean isPTP() {
        return PTP;
    }

    public void setPTP(boolean PTP) {
        this.PTP = PTP;
    }

    public boolean isLPR() {
        return LPR;
    }

    public void setLPR(boolean LPR) {
        this.LPR = LPR;
    }

    public boolean isTDAT() {
        return TDAT;
    }

    public void setTDAT(boolean TDAT) {
        this.TDAT = TDAT;
    }

    public int getNUM() {
        return NUM;
    }

    public void setNUM(int NUM) {
        this.NUM = NUM;
    }

    public int getIndicadorInicio() {
        return indicadorInicio;
    }

    public void setIndicadorInicio(int indicadorInicio) {
        this.indicadorInicio = indicadorInicio;
    }

    public int getInidicadorFin() {
        return inidicadorFin;
    }

    public void setInidicadorFin(int inidicadorFin) {
        this.inidicadorFin = inidicadorFin;
    }
    
    
}
