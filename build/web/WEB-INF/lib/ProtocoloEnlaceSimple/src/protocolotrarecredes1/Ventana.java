/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package protocolotrarecredes1;

import java.awt.Checkbox;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSlider;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author juank
 */
public final class Ventana extends javax.swing.JFrame {
    private int numero_frame;
    emisor e;
    receptor r;
    protocolo p;
    private int numero_trama;
    private boolean fin;
    /**
     * Creates new form Ventana
     */
    public Ventana() {
        //this.setLocationRelativeTo(null);
        initComponents();
        e = new emisor(this);
        r = new receptor(this);
        jButtonSiguiente.setEnabled(false);
        jButtonRESPONDER.setEnabled(false);
        jSliderFrame.setValue(this.numero_frame);
        jTextFieldFrame.setText(String.valueOf(this.numero_frame));
        iniciar_slider();
        this.numero_frame = 0;
        this.p = null;
        this.numero_trama = 1;
        this.fin = false;
        
    }

    public boolean isFin() {
        return fin;
    }

    public void setFin(boolean fin) {
        this.fin = fin;
    }

    public int getNumero_trama() {
        return numero_trama;
    }

    public void setNumero_trama(int numero_trama) {
        this.numero_trama = numero_trama;
    }
    
    public void initComponents1(){
        
    }

    public int getNumero_frame() {
        return numero_frame;
    }

    public void setNumero_frame(int numero_frame) {
        this.numero_frame = numero_frame;
    }

    public ButtonGroup getButtonGroup1() {
        return buttonGroup1;
    }

    public void setButtonGroup1(ButtonGroup buttonGroup1) {
        this.buttonGroup1 = buttonGroup1;
    }

    public ButtonGroup getButtonGroup2() {
        return buttonGroup2;
    }

    public JTextField getjTextFieldInfoFrame() {
        return jTextFieldInfoFrame;
    }

    public void setjTextFieldInfoFrame(JTextField jTextFieldInfoFrame) {
        this.jTextFieldInfoFrame = jTextFieldInfoFrame;
    }

    public JTextArea getjTextAreaINFOTRAMA() {
        return jTextAreaINFOTRAMA;
    }

    public void setjTextAreaINFOTRAMA(JTextArea jTextAreaINFOTRAMA) {
        this.jTextAreaINFOTRAMA = jTextAreaINFOTRAMA;
    }

    
    
    public void setButtonGroup2(ButtonGroup buttonGroup2) {
        this.buttonGroup2 = buttonGroup2;
    }

    public Checkbox getCheckboxACK() {
        return checkboxACK;
    }

    public void setCheckboxACK(Checkbox checkboxACK) {
        this.checkboxACK = checkboxACK;
    }

    public Checkbox getCheckboxEACK() {
        return checkboxEACK;
    }

    public void setCheckboxEACK(Checkbox checkboxEACK) {
        this.checkboxEACK = checkboxEACK;
    }

    public Checkbox getCheckboxELPR() {
        return checkboxELPR;
    }

    public void setCheckboxELPR(Checkbox checkboxELPR) {
        this.checkboxELPR = checkboxELPR;
    }

    public Checkbox getCheckboxENUM() {
        return checkboxENUM;
    }

    public void setCheckboxENUM(Checkbox checkboxENUM) {
        this.checkboxENUM = checkboxENUM;
    }

    public Checkbox getCheckboxEPTP() {
        return checkboxRPTP;
    }

    public void setCheckboxEPTP(Checkbox checkboxEPTP) {
        this.checkboxRPTP = checkboxEPTP;
    }

    public Checkbox getCheckboxETDAT() {
        return checkboxETDAT;
    }

    public void setCheckboxETDAT(Checkbox checkboxETDAT) {
        this.checkboxETDAT = checkboxETDAT;
    }

    public Checkbox getCheckboxRLPR() {
        return checkboxRLPR;
    }

    public void setCheckboxRLPR(Checkbox checkboxRLPR) {
        this.checkboxRLPR = checkboxRLPR;
    }

    public Checkbox getCheckboxRNUM() {
        return checkboxRNUM;
    }

    public void setCheckboxRNUM(Checkbox checkboxRNUM) {
        this.checkboxRNUM = checkboxRNUM;
    }

    public Checkbox getCheckboxRPTP() {
        return checkboxRPTP;
    }

    public void setCheckboxRPTP(Checkbox checkboxRPTP) {
        this.checkboxRPTP = checkboxRPTP;
    }

    public Checkbox getCheckboxRTDAT() {
        return checkboxRTDAT;
    }

    public void setCheckboxRTDAT(Checkbox checkboxRTDAT) {
        this.checkboxRTDAT = checkboxRTDAT;
    }

    public JButton getjButtonEnviar() {
        return jButtonEnviar;
    }

    public void setjButtonEnviar(JButton jButtonEnviar) {
        this.jButtonEnviar = jButtonEnviar;
    }

    public JButton getjButtonRESPONDER() {
        return jButtonRESPONDER;
    }

    public void setjButtonRESPONDER(JButton jButtonRESPONDER) {
        this.jButtonRESPONDER = jButtonRESPONDER;
    }

    public JButton getjButtonSiguiente() {
        return jButtonSiguiente;
    }

    public void setjButtonSiguiente(JButton jButtonSiguiente) {
        this.jButtonSiguiente = jButtonSiguiente;
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public void setjLabel1(JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    public JLabel getjLabel10() {
        return jLabel10;
    }

    public void setjLabel10(JLabel jLabel10) {
        this.jLabel10 = jLabel10;
    }

    public JLabel getjLabel11() {
        return jLabel11;
    }

    public void setjLabel11(JLabel jLabel11) {
        this.jLabel11 = jLabel11;
    }

    public JLabel getjLabel12() {
        return jLabel12;
    }

    public void setjLabel12(JLabel jLabel12) {
        this.jLabel12 = jLabel12;
    }

    public JLabel getjLabel13() {
        return jLabel13;
    }

    public void setjLabel13(JLabel jLabel13) {
        this.jLabel13 = jLabel13;
    }

    public JLabel getjLabel14() {
        return jLabel14;
    }

    public void setjLabel14(JLabel jLabel14) {
        this.jLabel14 = jLabel14;
    }

    public JLabel getjLabel15() {
        return jLabel15;
    }

    public void setjLabel15(JLabel jLabel15) {
        this.jLabel15 = jLabel15;
    }

    public JLabel getjLabel16() {
        return jLabel16;
    }

    public void setjLabel16(JLabel jLabel16) {
        this.jLabel16 = jLabel16;
    }

    public JLabel getjLabel17() {
        return jLabel17;
    }

    public void setjLabel17(JLabel jLabel17) {
        this.jLabel17 = jLabel17;
    }

    public JLabel getjLabel18() {
        return jLabel18;
    }

    public void setjLabel18(JLabel jLabel18) {
        this.jLabel18 = jLabel18;
    }

    public JLabel getjLabel19() {
        return jLabel19;
    }

    public void setjLabel19(JLabel jLabel19) {
        this.jLabel19 = jLabel19;
    }

    public JLabel getjLabel2() {
        return jLabel2;
    }

    public void setjLabel2(JLabel jLabel2) {
        this.jLabel2 = jLabel2;
    }

    public JLabel getjLabel20() {
        return jLabel20;
    }

    public void setjLabel20(JLabel jLabel20) {
        this.jLabel20 = jLabel20;
    }

    public JLabel getjLabel21() {
        return jLabel21;
    }

    public void setjLabel21(JLabel jLabel21) {
        this.jLabel21 = jLabel21;
    }

    public JLabel getjLabel22() {
        return jLabel22;
    }

    public void setjLabel22(JLabel jLabel22) {
        this.jLabel22 = jLabel22;
    }

    public JLabel getjLabel23() {
        return jLabel23;
    }

    public void setjLabel23(JLabel jLabel23) {
        this.jLabel23 = jLabel23;
    }

    public JLabel getjLabel24() {
        return jLabel24;
    }

    public void setjLabel24(JLabel jLabel24) {
        this.jLabel24 = jLabel24;
    }

    public JLabel getjLabel25() {
        return jLabel25;
    }

    public void setjLabel25(JLabel jLabel25) {
        this.jLabel25 = jLabel25;
    }

    public JLabel getjLabel26() {
        return jLabel26;
    }

    public void setjLabel26(JLabel jLabel26) {
        this.jLabel26 = jLabel26;
    }

    public JLabel getjLabel3() {
        return jLabel3;
    }

    public void setjLabel3(JLabel jLabel3) {
        this.jLabel3 = jLabel3;
    }

    public JLabel getjLabel4() {
        return jLabel4;
    }

    public void setjLabel4(JLabel jLabel4) {
        this.jLabel4 = jLabel4;
    }

    public JLabel getjLabel5() {
        return jLabel5;
    }

    public void setjLabel5(JLabel jLabel5) {
        this.jLabel5 = jLabel5;
    }

    public JLabel getjLabel6() {
        return jLabel6;
    }

    public void setjLabel6(JLabel jLabel6) {
        this.jLabel6 = jLabel6;
    }

    public JLabel getjLabel8() {
        return jLabel8;
    }

    public void setjLabel8(JLabel jLabel8) {
        this.jLabel8 = jLabel8;
    }

    public JLabel getjLabel9() {
        return jLabel9;
    }

    public void setjLabel9(JLabel jLabel9) {
        this.jLabel9 = jLabel9;
    }

    public JPanel getjPanel1() {
        return jPanel1;
    }

    public void setjPanel1(JPanel jPanel1) {
        this.jPanel1 = jPanel1;
    }

    public JPanel getjPanel2() {
        return jPanel2;
    }

    public void setjPanel2(JPanel jPanel2) {
        this.jPanel2 = jPanel2;
    }

    public JPanel getjPanel3() {
        return jPanel3;
    }

    public void setjPanel3(JPanel jPanel3) {
        this.jPanel3 = jPanel3;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public void setjScrollPane1(JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    public JScrollPane getjScrollPane2() {
        return jScrollPane2;
    }

    public void setjScrollPane2(JScrollPane jScrollPane2) {
        this.jScrollPane2 = jScrollPane2;
    }

    public JScrollPane getjScrollPane3() {
        return jScrollPane3;
    }

    public void setjScrollPane3(JScrollPane jScrollPane3) {
        this.jScrollPane3 = jScrollPane3;
    }

    public JSlider getjSliderFrame() {
        return jSliderFrame;
    }

    public void setjSliderFrame(JSlider jSliderFrame) {
        this.jSliderFrame = jSliderFrame;
    }

    public JTextArea getjTextArea2() {
        return jTextAreaINFOTRAMA;
    }

    public void setjTextArea2(JTextArea jTextArea2) {
        this.jTextAreaINFOTRAMA = jTextArea2;
    }

    public JTextField getjTextField8() {
        return jTextFieldInfoFrame;
    }

    public void setjTextField8(JTextField jTextField8) {
        this.jTextFieldInfoFrame = jTextField8;
    }

    public JTextField getjTextFieldEACK() {
        return jTextFieldEACK;
    }

    public void setjTextFieldEACK(JTextField jTextFieldEACK) {
        this.jTextFieldEACK = jTextFieldEACK;
    }

    public JTextField getjTextFieldEIndFin() {
        return jTextFieldEIndFin;
    }

    public void setjTextFieldEIndFin(JTextField jTextFieldEIndFin) {
        this.jTextFieldEIndFin = jTextFieldEIndFin;
    }

    public JTextField getjTextFieldEIndInicio() {
        return jTextFieldEIndInicio;
    }

    public void setjTextFieldEIndInicio(JTextField jTextFieldEIndInicio) {
        this.jTextFieldEIndInicio = jTextFieldEIndInicio;
    }

    public JTextField getjTextFieldELPR() {
        return jTextFieldELPR;
    }

    public void setjTextFieldELPR(JTextField jTextFieldELPR) {
        this.jTextFieldELPR = jTextFieldELPR;
    }

    public JTextField getjTextFieldENUM() {
        return jTextFieldENUM;
    }

    public void setjTextFieldENUM(JTextField jTextFieldENUM) {
        this.jTextFieldENUM = jTextFieldENUM;
    }

    public JTextField getjTextFieldEPTP() {
        return jTextFieldRPTP;
    }

    public void setjTextFieldEPTP(JTextField jTextFieldEPTP) {
        this.jTextFieldRPTP = jTextFieldEPTP;
    }

    public JTextField getjTextFieldETDAT() {
        return jTextFieldETDAT;
    }

    public void setjTextFieldETDAT(JTextField jTextFieldETDAT) {
        this.jTextFieldETDAT = jTextFieldETDAT;
    }

    public JTextField getjTextFieldFrame() {
        return jTextFieldFrame;
    }

    public void setjTextFieldFrame(JTextField jTextFieldFrame) {
        this.jTextFieldFrame = jTextFieldFrame;
    }

    public JTextField getjTextFieldRACK() {
        return jTextFieldRACK;
    }

    public void setjTextFieldRACK(JTextField jTextFieldRACK) {
        this.jTextFieldRACK = jTextFieldRACK;
    }

    public JTextField getjTextFieldRHeader() {
        return jTextFieldRHeader;
    }

    public void setjTextFieldRHeader(JTextField jTextFieldRHeader) {
        this.jTextFieldRHeader = jTextFieldRHeader;
    }

    public JTextField getjTextFieldRIndFin() {
        return jTextFieldRIndFin;
    }

    public void setjTextFieldRIndFin(JTextField jTextFieldRIndFin) {
        this.jTextFieldRIndFin = jTextFieldRIndFin;
    }

    public JTextField getjTextFieldRIndInicio() {
        return jTextFieldRIndInicio;
    }

    public void setjTextFieldRIndInicio(JTextField jTextFieldRIndInicio) {
        this.jTextFieldRIndInicio = jTextFieldRIndInicio;
    }

    public JTextField getjTextFieldRInfo() {
        return jTextFieldRInfo;
    }

    public void setjTextFieldRInfo(JTextField jTextFieldRInfo) {
        this.jTextFieldRInfo = jTextFieldRInfo;
    }

    public JTextField getjTextFieldRLRP() {
        return jTextFieldRLRP;
    }

    public void setjTextFieldRLRP(JTextField jTextFieldRLRP) {
        this.jTextFieldRLRP = jTextFieldRLRP;
    }

    public JTextField getjTextFieldRNUM() {
        return jTextFieldRNUM;
    }

    public void setjTextFieldRNUM(JTextField jTextFieldRNUM) {
        this.jTextFieldRNUM = jTextFieldRNUM;
    }

    public JTextField getjTextFieldRPTP() {
        return jTextFieldRPTP;
    }

    public void setjTextFieldRPTP(JTextField jTextFieldRPTP) {
        this.jTextFieldRPTP = jTextFieldRPTP;
    }

    public JTextField getjTextFieldRTDAT() {
        return jTextFieldRTDAT;
    }

    public void setjTextFieldRTDAT(JTextField jTextFieldRTDAT) {
        this.jTextFieldRTDAT = jTextFieldRTDAT;
    }

    public JTextField getjTextFieldRTrailer() {
        return jTextFieldRTrailer;
    }

    public void setjTextFieldRTrailer(JTextField jTextFieldRTrailer) {
        this.jTextFieldRTrailer = jTextFieldRTrailer;
    }

    public JTextArea getjTextMensajeTransmitir() {
        return jTextMensajeTransmitir;
    }

    public void setjTextMensajeTransmitir(JTextArea jTextMensajeTransmitir) {
        this.jTextMensajeTransmitir = jTextMensajeTransmitir;
    }

    public JTextArea getjTextMensajes() {
        return jTextMensajes;
    }

    public void setjTextMensajes(JTextArea jTextMensajes) {
        this.jTextMensajes = jTextMensajes;
    }

    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextMensajeTransmitir = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldEIndInicio = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldEACK = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldEPTP = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldELPR = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldETDAT = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldENUM = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextFieldInfoFrame = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jButtonEnviar = new javax.swing.JButton();
        jSliderFrame = new javax.swing.JSlider();
        jTextFieldEIndFin = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        checkboxEACK = new java.awt.Checkbox();
        checkboxEPTP = new java.awt.Checkbox();
        checkboxELPR = new java.awt.Checkbox();
        checkboxETDAT = new java.awt.Checkbox();
        checkboxENUM = new java.awt.Checkbox();
        jTextFieldFrame = new javax.swing.JTextField();
        jButtonSiguiente = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldRHeader = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jTextFieldRInfo = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jTextFieldRTrailer = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jTextFieldRIndInicio = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jTextFieldRACK = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jTextFieldRPTP = new javax.swing.JTextField();
        jTextFieldRLRP = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jTextFieldRTDAT = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jTextFieldRNUM = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jTextFieldRIndFin = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jButtonRESPONDER = new javax.swing.JButton();
        checkboxACK = new java.awt.Checkbox();
        checkboxRLPR = new java.awt.Checkbox();
        checkboxRTDAT = new java.awt.Checkbox();
        checkboxRNUM = new java.awt.Checkbox();
        checkboxRPTP = new java.awt.Checkbox();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextMensajes = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaINFOTRAMA = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Protocolo de Transmisión");

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 3, 12)); // NOI18N
        jLabel1.setText("EMISOR");

        jTextMensajeTransmitir.setColumns(20);
        jTextMensajeTransmitir.setRows(5);
        jTextMensajeTransmitir.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                jTextMensajeTransmitirInputMethodTextChanged(evt);
            }
        });
        jTextMensajeTransmitir.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextMensajeTransmitirKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextMensajeTransmitirKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTextMensajeTransmitir);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("¡Ingresa un mensaje!");

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Semibold", 3, 14)); // NOI18N
        jLabel4.setText("FRAMES");

        jTextFieldEIndInicio.setEditable(false);
        jTextFieldEIndInicio.setText("                 ");

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jLabel5.setText("Ind Inicio");

        jTextFieldEACK.setEditable(false);
        jTextFieldEACK.setText("0");
        jTextFieldEACK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEACKActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jLabel6.setText("ACK");

        jTextFieldEPTP.setEditable(false);
        jTextFieldEPTP.setText("                  ");
        jTextFieldEPTP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEPTPActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jLabel8.setText("PTP");

        jTextFieldELPR.setEditable(false);
        jTextFieldELPR.setText("                        ");

        jLabel9.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jLabel9.setText("LPR");

        jTextFieldETDAT.setEditable(false);
        jTextFieldETDAT.setText("                       ");

        jLabel10.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jLabel10.setText("TDAT");

        jTextFieldENUM.setEditable(false);
        jTextFieldENUM.setText("                      ");

        jLabel11.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jLabel11.setText("NUM");

        jTextFieldInfoFrame.setEditable(false);

        jLabel12.setFont(new java.awt.Font("Yu Gothic UI Semibold", 2, 14)); // NOI18N
        jLabel12.setText("INFORMACIÓN DEL FRAME");

        jButtonEnviar.setBackground(new java.awt.Color(204, 204, 255));
        jButtonEnviar.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jButtonEnviar.setText("ENVIAR");
        jButtonEnviar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButtonEnviar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEnviarActionPerformed(evt);
            }
        });

        jSliderFrame.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jSliderFrame.setMaximum(30);
        jSliderFrame.setPaintLabels(true);
        jSliderFrame.setPaintTicks(true);
        jSliderFrame.setSnapToTicks(true);
        jSliderFrame.setToolTipText("");
        jSliderFrame.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jSliderFrame.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jSliderFrameMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jSliderFrameMouseReleased(evt);
            }
        });

        jTextFieldEIndFin.setEditable(false);
        jTextFieldEIndFin.setText("                  ");

        jLabel13.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jLabel13.setText("Ind Final");

        checkboxEACK.setLabel("checkbox1");
        checkboxEACK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                checkboxEACKMouseClicked(evt);
            }
        });

        jTextFieldFrame.setEditable(false);
        jTextFieldFrame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldFrameActionPerformed(evt);
            }
        });

        jButtonSiguiente.setBackground(new java.awt.Color(255, 204, 204));
        jButtonSiguiente.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jButtonSiguiente.setText("Siguiente");
        jButtonSiguiente.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButtonSiguiente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSiguienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(4, 4, 4)
                                        .addComponent(jLabel5)
                                        .addGap(22, 22, 22))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(12, 12, 12)
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel11)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jSliderFrame, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextFieldFrame, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextFieldEIndInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 69, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextFieldEACK, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(checkboxEACK, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextFieldEPTP, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(checkboxEPTP, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(checkboxELPR, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextFieldELPR, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(checkboxETDAT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(checkboxENUM, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(jTextFieldETDAT, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jTextFieldENUM, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel13)
                                                    .addComponent(jTextFieldEIndFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
                        .addGap(37, 37, 37))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextFieldInfoFrame, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(19, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonEnviar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonSiguiente, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(12, 12, 12)
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel2)
                            .addGap(10, 10, 10))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGap(25, 25, 25)
                            .addComponent(jLabel4)
                            .addGap(25, 25, 25)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jSliderFrame, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jTextFieldFrame, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel5)
                                .addComponent(jLabel6)
                                .addComponent(jLabel8)
                                .addComponent(jLabel9)
                                .addComponent(jLabel10)
                                .addComponent(jLabel11)))
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldEIndInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldEACK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldEPTP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldELPR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldETDAT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldENUM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldEIndFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(checkboxEACK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(checkboxEPTP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(checkboxELPR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(checkboxETDAT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(checkboxENUM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldInfoFrame, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12))
        );

        jPanel2.setBackground(new java.awt.Color(204, 255, 247));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 3, 12)); // NOI18N
        jLabel3.setText("RECEPTOR");

        jTextFieldRHeader.setEditable(false);
        jTextFieldRHeader.setText("               ");

        jLabel14.setFont(new java.awt.Font("Yu Gothic UI Semibold", 2, 12)); // NOI18N
        jLabel14.setText("HEADER");

        jTextFieldRInfo.setEditable(false);
        jTextFieldRInfo.setText("                        ");

        jLabel15.setFont(new java.awt.Font("Yu Gothic UI Semibold", 2, 12)); // NOI18N
        jLabel15.setText("INFO");

        jTextFieldRTrailer.setEditable(false);
        jTextFieldRTrailer.setText("                   ");

        jLabel16.setFont(new java.awt.Font("Yu Gothic UI Semibold", 2, 12)); // NOI18N
        jLabel16.setText("TRAILER");

        jLabel17.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jLabel17.setText("DATOS RECIBIDOS");

        jLabel18.setFont(new java.awt.Font("Yu Gothic UI Semibold", 2, 12)); // NOI18N
        jLabel18.setText("DATOS DE RESPUESTA");

        jTextFieldRIndInicio.setEditable(false);
        jTextFieldRIndInicio.setText("                    ");

        jLabel19.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jLabel19.setText("Ind Inicio");

        jTextFieldRACK.setEditable(false);
        jTextFieldRACK.setText("            ");
        jTextFieldRACK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldRACKActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jLabel20.setText("ACK");

        jTextFieldRPTP.setEditable(false);
        jTextFieldRPTP.setText("            ");
        jTextFieldRPTP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldRPTPActionPerformed(evt);
            }
        });

        jTextFieldRLRP.setEditable(false);
        jTextFieldRLRP.setText("            ");
        jTextFieldRLRP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldRLRPActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jLabel21.setText("PTP");

        jLabel22.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jLabel22.setText("LPR");

        jTextFieldRTDAT.setEditable(false);
        jTextFieldRTDAT.setText("            ");

        jLabel23.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jLabel23.setText("TDAT");

        jTextFieldRNUM.setEditable(false);
        jTextFieldRNUM.setText("            ");
        jTextFieldRNUM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldRNUMActionPerformed(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jLabel24.setText("NUM");

        jTextFieldRIndFin.setEditable(false);
        jTextFieldRIndFin.setText("                ");
        jTextFieldRIndFin.setToolTipText("");

        jLabel25.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jLabel25.setText("Ind Final");

        jLabel26.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel26.setText("Mensaje recibido");

        jButtonRESPONDER.setBackground(new java.awt.Color(255, 204, 0));
        jButtonRESPONDER.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jButtonRESPONDER.setText("RESPONDER");
        jButtonRESPONDER.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButtonRESPONDER.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonRESPONDER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRESPONDERActionPerformed(evt);
            }
        });

        jTextMensajes.setEditable(false);
        jTextMensajes.setColumns(20);
        jTextMensajes.setRows(5);
        jScrollPane3.setViewportView(jTextMensajes);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jTextFieldRIndInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(checkboxACK, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(checkboxRPTP, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(checkboxRLPR, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(30, 30, 30))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jTextFieldRACK, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextFieldRPTP, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextFieldRLRP, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextFieldRTDAT, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldRNUM, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel25)
                                    .addComponent(jTextFieldRIndFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jTextFieldRHeader)
                                            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextFieldRInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(27, 27, 27)
                                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(33, 33, 33)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextFieldRTrailer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(162, 162, 162)
                                        .addComponent(checkboxRTDAT, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(20, 20, 20)
                                        .addComponent(checkboxRNUM, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel18)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(jLabel19)
                                            .addGap(18, 18, 18)
                                            .addComponent(jLabel20)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel21)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel22)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel23)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jLabel24)
                                            .addGap(16, 16, 16)))
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(59, 59, 59)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(100, 100, 100)
                                .addComponent(jLabel17))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addComponent(jButtonRESPONDER, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel26)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(2, 2, 2)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jLabel26))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldRHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldRInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldRTrailer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel18)
                        .addGap(11, 11, 11)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(jLabel20)
                            .addComponent(jLabel21)
                            .addComponent(jLabel22)
                            .addComponent(jLabel25)
                            .addComponent(jLabel24)
                            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldRIndInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldRACK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldRPTP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldRLRP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldRTDAT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldRNUM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldRIndFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(checkboxACK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(checkboxRLPR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(checkboxRTDAT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(checkboxRNUM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(checkboxRPTP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addComponent(jButtonRESPONDER, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3))
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(243, 238, 187));

        jTextAreaINFOTRAMA.setEditable(false);
        jTextAreaINFOTRAMA.setColumns(20);
        jTextAreaINFOTRAMA.setRows(5);
        jScrollPane2.setViewportView(jTextAreaINFOTRAMA);

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(204, 253, 245));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(51, 0, 51));
        jTextArea1.setRows(5);
        jTextArea1.setText("Protocolo de interacción de mensajes de control \nRedes de comunicaciones I \nIntegrantes \n- Laura Sofia Dueñas Bulla – 20172020102 \n- David Martínez González - 20171020036 ");
        jTextArea1.setToolTipText("");
        jTextArea1.setAlignmentX(0.0F);
        jTextArea1.setAlignmentY(0.0F);
        jTextArea1.setAutoscrolls(false);
        jTextArea1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTextArea1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextArea1.setFocusable(false);
        jTextArea1.setMargin(new java.awt.Insets(6, 6, 6, 6));
        jScrollPane4.setViewportView(jTextArea1);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/protocolotrarecredes1/img.jpeg"))); // NOI18N
        jLabel7.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 612, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(jLabel7)
                .addGap(43, 43, 43))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                .addGap(14, 14, 14))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEnviarActionPerformed
        
        
        String mensaje_original = "";
        if(this.numero_frame == 0){
            JOptionPane.showMessageDialog(null, "No ha ingresado mensaje");
        }else{
            
            this.jTextMensajeTransmitir.setEditable(false);
            this.jButtonEnviar.setEnabled(false);
            mensaje_original = jTextMensajeTransmitir.getText();
            
            
            e = new emisor(mensaje_original,this.numero_frame,this);
            p = new protocolo(e, r, this.numero_frame);
            p.iniciar();
            jSliderFrame.setEnabled(false);
            jButtonRESPONDER.setEnabled(true);
        }
    }//GEN-LAST:event_jButtonEnviarActionPerformed

    public void protocolo(){
        
    }
    
    
    private void jButtonRESPONDERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRESPONDERActionPerformed
        p.receptor();
        jButtonSiguiente.setEnabled(true);
        jButtonRESPONDER.setEnabled(false);
    }//GEN-LAST:event_jButtonRESPONDERActionPerformed

    private void jTextMensajeTransmitirInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jTextMensajeTransmitirInputMethodTextChanged
        // TODO add your handling code here:
        //this.jSlider1
    }//GEN-LAST:event_jTextMensajeTransmitirInputMethodTextChanged

    private void jTextFieldEACKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEACKActionPerformed
       
    }//GEN-LAST:event_jTextFieldEACKActionPerformed

    private void jTextFieldEPTPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEPTPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEPTPActionPerformed

    private void checkboxEACKMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkboxEACKMouseClicked
        System.out.println(checkboxEACK.getState());
        System.out.println("____________________");
        if(checkboxEACK.getState()==true){
            jTextFieldEACK.setText("1");
        }else if(checkboxEACK.getState()==false){
            jTextFieldEACK.setText("0");
        }
    }//GEN-LAST:event_checkboxEACKMouseClicked

    private void jTextMensajeTransmitirKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextMensajeTransmitirKeyPressed
//        System.out.println(jTextMensajeTransmitir.getText());
    }//GEN-LAST:event_jTextMensajeTransmitirKeyPressed

    private void jTextMensajeTransmitirKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextMensajeTransmitirKeyReleased
        //AQUI SE CUENTAN EL NUMERO DE FRAMES
        String cadena = jTextMensajeTransmitir.getText();
        jSliderFrame.setMaximum(cadena.length());
        
    }//GEN-LAST:event_jTextMensajeTransmitirKeyReleased

    private void jSliderFrameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSliderFrameMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jSliderFrameMouseClicked

    private void jSliderFrameMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSliderFrameMouseReleased
        jSliderFrame.setValue(jSliderFrame.getValue());
        jTextFieldFrame.setText(String.valueOf(jSliderFrame.getValue()));
        this.numero_frame = jSliderFrame.getValue();
    }//GEN-LAST:event_jSliderFrameMouseReleased

    private void jButtonSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSiguienteActionPerformed
        p.emisor();
        jButtonSiguiente.setEnabled(false);
        
        if(!fin){
            jButtonRESPONDER.setEnabled(true);
        }
    }//GEN-LAST:event_jButtonSiguienteActionPerformed

    private void jTextFieldFrameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldFrameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldFrameActionPerformed

    private void jTextFieldRACKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldRACKActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldRACKActionPerformed

    private void jTextFieldRNUMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldRNUMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldRNUMActionPerformed

    private void jTextFieldRPTPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldRPTPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldRPTPActionPerformed

    private void jTextFieldRLRPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldRLRPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldRLRPActionPerformed

    public void iniciar_slider(){
        jSliderFrame.setMaximum(40);
        jSliderFrame.setPaintTicks(true);
        jSliderFrame.setPaintLabels(false);
        jSliderFrame.setMajorTickSpacing(1);
    }
    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private java.awt.Checkbox checkboxACK;
    private java.awt.Checkbox checkboxEACK;
    private java.awt.Checkbox checkboxELPR;
    private java.awt.Checkbox checkboxENUM;
    private java.awt.Checkbox checkboxEPTP;
    private java.awt.Checkbox checkboxETDAT;
    private java.awt.Checkbox checkboxRLPR;
    private java.awt.Checkbox checkboxRNUM;
    private java.awt.Checkbox checkboxRPTP;
    private java.awt.Checkbox checkboxRTDAT;
    private javax.swing.JButton jButtonEnviar;
    private javax.swing.JButton jButtonRESPONDER;
    private javax.swing.JButton jButtonSiguiente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSlider jSliderFrame;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextAreaINFOTRAMA;
    private javax.swing.JTextField jTextFieldEACK;
    private javax.swing.JTextField jTextFieldEIndFin;
    private javax.swing.JTextField jTextFieldEIndInicio;
    private javax.swing.JTextField jTextFieldELPR;
    private javax.swing.JTextField jTextFieldENUM;
    private javax.swing.JTextField jTextFieldEPTP;
    private javax.swing.JTextField jTextFieldETDAT;
    private javax.swing.JTextField jTextFieldFrame;
    private javax.swing.JTextField jTextFieldInfoFrame;
    private javax.swing.JTextField jTextFieldRACK;
    private javax.swing.JTextField jTextFieldRHeader;
    private javax.swing.JTextField jTextFieldRIndFin;
    private javax.swing.JTextField jTextFieldRIndInicio;
    private javax.swing.JTextField jTextFieldRInfo;
    private javax.swing.JTextField jTextFieldRLRP;
    private javax.swing.JTextField jTextFieldRNUM;
    private javax.swing.JTextField jTextFieldRPTP;
    private javax.swing.JTextField jTextFieldRTDAT;
    private javax.swing.JTextField jTextFieldRTrailer;
    private javax.swing.JTextArea jTextMensajeTransmitir;
    private javax.swing.JTextArea jTextMensajes;
    // End of variables declaration//GEN-END:variables
}
