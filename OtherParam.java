/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TransmissionLines;

import javax.swing.JOptionPane;
import pack1.Complex;
import TransmissionLines.OtherMathops;
/**
 *
 * @author shahe
 */
public class OtherParam extends javax.swing.JFrame {
OtherMathops obj;
static Complex Zin, Zo, Zl, yota, Tl, aTl;
static Complex minus = new Complex(-1,0);
Complex one = new Complex(1,0);
static double length, alpha, beta, yotaMag, ZlR, ZlI, ZinR, ZinI, ZoR, ZoI, Z0, ZL, ZIN;
static double TL, aTL, SWR, Pave, Pinc, Pref, V0, magTl; 
static String use, type;
    /**
     * Creates new form OtherParam
     */
    public OtherParam() {
        initComponents();
        setLocationRelativeTo(rootPane);
        use = JOptionPane.showInputDialog("Enter 1 for input impedance or 2 for other line parameters"); 
        type = JOptionPane.showInputDialog("Enter 1 for lossy line, \n Enter 2 for Lossless Line");
        if (use.equals("1")){
            
            jButton3.setEnabled(false);
            jButton4.setEnabled(false);
            jButton5.setEnabled(false);
            jButton6.setEnabled(false);
            jButton7.setEnabled(false);
            jButton8.setEnabled(false);
            jButton9.setEnabled(false);
            jButton13.setEnabled(false);
            jButton14.setEnabled(false);
            jButton15.setEnabled(false);
        }
        else{
            jButton1.setEnabled(false);
            jButton2.setEnabled(false);
            jButton10.setEnabled(false);
            jButton11.setEnabled(false);
            jButton12.setEnabled(false);
        }
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("INPUT PARAMETERS");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton1.setText("Propagation Constant");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Length");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Standing Wave Ratio");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Reflection Coefficient");

        jButton5.setText("Max Voltage");

        jButton6.setText("Min Voltage");

        jButton7.setText("Max Current");

        jButton8.setText("Min Current");

        jButton9.setText("Output Voltage");

        jButton10.setText("Load Impedance");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setText("Input Impedance");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setText("Characteristic Impedance");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton13.setText("Total Power");

        jButton14.setText("Reflected Power");

        jButton15.setText("Incident Power");

        jButton16.setBackground(new java.awt.Color(0, 51, 255));
        jButton16.setText("CALCULATE");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jButton17.setBackground(new java.awt.Color(0, 51, 255));
        jButton17.setText("BACK");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton1)
                                    .addComponent(jButton4)
                                    .addComponent(jButton7)
                                    .addComponent(jButton10))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(38, 38, 38)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jButton5)
                                                .addGap(31, 31, 31)
                                                .addComponent(jButton6))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jButton2)
                                                .addGap(37, 37, 37)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jButton9)
                                                    .addComponent(jButton3)
                                                    .addComponent(jButton12)
                                                    .addComponent(jButton15)
                                                    .addComponent(jButton17)))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(4, 4, 4)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButton11)
                                            .addComponent(jButton8)))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton13)
                                .addGap(37, 37, 37)
                                .addComponent(jButton14))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(jButton16)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton5)
                    .addComponent(jButton6))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7)
                    .addComponent(jButton8)
                    .addComponent(jButton9))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton10)
                    .addComponent(jButton11)
                    .addComponent(jButton12))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton13)
                    .addComponent(jButton14)
                    .addComponent(jButton15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton16)
                    .addComponent(jButton17))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
String ans = JOptionPane.showInputDialog("Enter 1 for GENERAL LINES, 2 for CO-AXIAL, 3 for TWO-WIRE, \n 4 for QUATERWAVE TRANSFORMER");

switch (ans){
    case "1":
        this.dispose();
        new General().setVisible(true);
        break;
    case "2":
        this.dispose();
        new Coax().setVisible(true);
        break;
    case "3":
        this.dispose();
        new TwoWire().setVisible(true);
        break;
    case "4":
        this.dispose();
        new QuaterWaveTrans().setVisible(true);
        break;
    
    default:
        JOptionPane.showMessageDialog(null, "Option is INVALID! \n PLEASE RE-ENTER!");
}// TODO add your handling code here:
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
if (use.equalsIgnoreCase("1")){
    if (type.equalsIgnoreCase("1")){
        if (!Zin.equals(0) && !Zo.equals(0) && !yota.equals(0) && length!=0){
            ZIN = Zin.abs(); Z0 = Zo.abs(); yotaMag = yota.abs();
            ZL = ((Math.pow(Z0, 2)*Math.tanh(yotaMag*length))-(ZIN*Z0))/(ZIN*Math.tanh(yotaMag*length)-Z0);
            JOptionPane.showMessageDialog(null, "Zin="+Zin+"\n ZL="+ZL);
        }
        else if (!yota.equals(0) && length!=0 && !Zin.equals(0) && !Zl.equals(0)){
            Complex minone = new Complex(-1,0);
            ZIN = Zin.abs(); ZL = Zl.abs(); yotaMag = yota.abs();
            Complex a, b, c, d, e;
            double ans1,ans2, ans3,ans4,ans5,ans6,ans7,ans8,ans9, denom, Z01, Z02;
            a = Zl.minus(Zin);
            b = a.times(a);
            c = new Complex(Math.tanh(yotaMag*length),0);
            d = new Complex(4*Math.tanh(yotaMag*length),0);
            e = b.plus(c.times(d));
            ans1 = a.abs();
            ans2 = b.abs();
            ans3 = e.abs();
            ans4 = Math.sqrt(ans2+ans3);
            ans5 = a.Phase();
            ans6 = b.Phase();
            ans7 = e.Phase();
            ans8 = ans1 + ans4;
            denom = 2*Math.tanh(yotaMag*length);
            ans9 = ans1-ans4;
            Z01 = ans8/denom;
            Z02 = ans9/denom;
            if (Z01 < 0){
                JOptionPane.showMessageDialog(null, "Z0=\t" +Z02);
            }
            else if (Z02 < 0){
                JOptionPane.showMessageDialog(null, "Z0=\t" +Z01);
            }
        }
        else if (!yota.equals(0) && length!=0 && !Zo.equals(0) && !Zl.equals(0)){
            Complex a = new Complex(Math.tanh(yotaMag*length),0), b = new Complex(Math.tanh(yotaMag*length),0);
            Z0 = Zo.abs(); ZL = Zl.abs(); yotaMag = yota.abs();
            ZIN = Z0*((ZL+Z0*Math.tanh(yotaMag*length))/(Z0+ZL*Math.tanh(yotaMag*length)));
            JOptionPane.showMessageDialog(null, "Zin="+ZIN);
        }
        else if (!yota.equals(0) && !Zin.equals(0) && !Zo.equals(0) && !Zl.equals(0)){
            Z0 = Zo.abs(); ZL = Zl.abs(); yotaMag = yota.abs(); ZIN = Zin.abs();
            double ans = ((Z0*ZIN)-(Z0*ZL))/((Math.pow(Z0, 2))-(ZIN*ZL));
            length = obj.arctanh(ans)/yotaMag;
            JOptionPane.showMessageDialog(null, "Length="+length+"\n Ans="+ans);
        }
        else if (length!=0 && !Zin.equals(0) && !Zo.equals(0) && !Zl.equals(0)){
            Z0 = Zo.abs(); ZL = Zl.abs(); ZIN = Zin.abs();
            double ans = ((Z0*ZIN)-(Z0*ZL))/((Math.pow(Z0, 2))-(ZIN*ZL));
            double angle;//find out how to use angles here
            yotaMag = Math.atan(ans)/length;
        }
    }
    else if (type.equalsIgnoreCase("2")){
        if (!Zo.equals(0) && !Zl.equals(0) && beta!=0 && length!=0){
            Z0 = Zo.abs(); ZL = Zl.abs(); beta = yota.im();
            Complex a = new Complex(0, Math.tan(beta*length));
            Complex b = Zl.plus(a.times(Zo));
            Complex c = Zo.plus(a.times(Zl));
            Zin = Zo.times(b.divides(c));
            JOptionPane.showMessageDialog(null, "Zin="+Zin);
        }
        else if (!Zin.equals(0) && !Zo.equals(0) && beta!=0 && length!=0){
            Z0 = Zo.abs(); ZIN = Zin.abs(); beta = yota.im();
            Complex a = new Complex(0, Math.tan(beta*length));
            Complex b, c;
            b = Zin.times(Zo).minus(a.times(Zo.times(Zo)));
            c = Zo.minus(a.times(Zin));
            Zl = b.divides(c);
            JOptionPane.showMessageDialog(null, "ZL="+Zl);
        }
        else if (!Zl.equals(0) && !Zin.equals(0) && beta!=0 && length!=0){
            ZL = Zl.abs(); ZIN = Zin.abs(); beta = yota.im();
            Complex a = Zin.minus(Zl);
            Complex b = a.times(a);
            double ans = b.abs();
            double pp = a.abs();
            double ans1 = 4*Math.tan(beta*length)*ZIN*ZL*Math.tan(beta*length);
            Complex c = new Complex(0,2*Math.tan(beta*length));
            double ans2  = c.abs();
            double sqrt = Math.sqrt(ans-ans1);
            
            double Z01 = (pp+sqrt)/ans2;
            double Z02 = (pp-sqrt)/ans2;
            
            if (Z01 < 0)
                JOptionPane.showMessageDialog(null, "Z0="+Z02);
            else if (Z02 < 0)
                JOptionPane.showMessageDialog(null, "Z0="+Z01);
        }
        else if (!Zo.equals(0) && !Zin.equals(0) && !Zl.equals(0) && beta!=0){
            ZL = Zl.abs(); ZIN = Zin.abs(); beta = yota.im(); Z0 = Zo.abs();
            double num = (Z0*ZIN - Z0*ZL);
            Complex a = new Complex(0, (Math.pow(Z0,2)-ZIN*ZL));
            double denom = a.abs();
            length = Math.atan(num/denom)/beta;
            JOptionPane.showMessageDialog(null, length);
        }
        else if (!Zo.equals(0) && !Zin.equals(0) && !Zl.equals(0) && length!=0){
            ZL = Zl.abs(); ZIN = Zin.abs(); beta = yota.im(); Z0 = Zo.abs();
            double num = (Z0*ZIN - Z0*ZL);
            Complex a = new Complex(0, (Math.pow(Z0,2)-ZIN*ZL));
            double denom = a.abs();
            beta = Math.atan(num/denom)/length;
            JOptionPane.showMessageDialog(null, beta);
        }
    }
}
else if (use.equalsIgnoreCase("2")){
    if (!Zo.equals(0) && !Zl.equals(0) && V0!=0){
        Tl = (Zl.minus(Zo)).divides((Zl.plus(Zo)));
        magTl = Tl.abs();
        SWR = (1+magTl)/(1-magTl);
        aTl = aTl.times(minus);
        Z0 = Zo.abs();
        Pave = (Math.pow(V0,2)/(2*Z0))*(1-magTl);
        Pinc = Math.pow(V0,2)/(2*Z0);
        Pref = (Math.pow(V0,2)/(2*Z0))*-magTl;
        JOptionPane.showMessageDialog(null, "Refelction Co-efficient="+Tl+"\n SWR="+SWR+"\n Average power="+Pave+"\n Pinc="+Pinc+"\n Pref="+Pref);
    }
    else if (!Tl.equals(0) && !Zo.equals(0) && V0!=0){
        Zl = Zo.times((Tl.plus(one)).divides((Tl.minus(one)))); 
        magTl = Tl.abs();
        aTl = aTl.times(minus);
        SWR = (1+magTl)/(1-magTl);
        Pave = (Math.pow(V0,2)/(2*Z0))*(1-magTl);
        Pinc = Math.pow(V0,2)/(2*Z0);
        Pref = (Math.pow(V0,2)/(2*Z0))*-magTl;
        JOptionPane.showMessageDialog(null, "ZL="+Zl+"\n SWR="+SWR+"\n Pave="+Pave+"Pinc="+Pinc+"Pref="+Pref);
    }
    else if (!Tl.equals(0) && !Zl.equals(0) && V0!=0){
        Zo = Zl.times((Tl.minus(one)).divides(Tl.plus(one)));
        magTl = Tl.abs();
        aTl = aTl.times(minus);
        SWR = (1+magTl)/(1-magTl);
        Pave = (Math.pow(V0,2)/(2*Z0))*(1-magTl);
        Pinc = Math.pow(V0,2)/(2*Z0);
        Pref = (Math.pow(V0,2)/(2*Z0))*-magTl;
        JOptionPane.showMessageDialog(null, "Z0="+Zo+"\n SWR="+SWR+"\n Pave="+Pave+"Pinc="+Pinc+"Pref="+Pref);
    }
    else if (Pinc!=0 && Pref!=0 && !Zo.equals(0)){
        Pave = Pinc + Pref;
        Z0 = Zo.abs();
        V0 = Math.sqrt(2*Pinc*Z0);
        magTl = Math.sqrt((2*Pref*Z0)/Math.pow(V0,2));
        ZL = Z0*((1+magTl)/(1-magTl));
        aTl = aTl.times(minus);
        SWR = (1+magTl)/(1-magTl);
        JOptionPane.showMessageDialog(null, "Pave="+Pave+"\n Vo="+V0+"\n ZL="+ZL+"\n SWR="+SWR);
    }
    else if (Pinc!=0 && Pref!=0 && !Zl.equals(0)){
        Pave = Pinc + Pref;
        ZL = Zl.abs();
        V0 = Math.sqrt(2*Pinc*Z0);
        magTl = Math.sqrt((2*Pref*Z0)/Math.pow(V0,2));
        Z0 = ZL*((1-magTl)/(1+magTl));
        aTl = aTl.times(minus);
        SWR = (1+magTl)/(1-magTl);
        JOptionPane.showMessageDialog(null, "Pave="+Pave+"\n Vo="+V0+"\n Zo="+Z0+"\n SWR="+SWR);
    }
    else if (!Tl.equals(0) && Pave!=0 && !Zo.equals(0)){
        Z0 = Zo.abs();
        magTl = Tl.abs();
        Zl = Zo.times((Tl.plus(one)).divides((Tl.minus(one)))); 
        V0 = Math.sqrt((2*Pave*Z0)/(1-Math.pow(magTl,2)));
        Pinc = Math.pow(V0,2)/(2*Z0);
        Pref = Pinc - Pave;
        aTl = aTl.times(minus);
        SWR = (1+magTl)/(1-magTl);
        JOptionPane.showMessageDialog(null, "Zl="+Zl+"\n Vo="+V0+"\n Pinc="+Pinc+"\n Pref="+Pref+"\n SWR="+SWR);
    }
    else if (!Tl.equals(0) && Pave!=0 && !Zl.equals(0)){
        ZL = Zl.abs();
        Zo = Zl.times((Tl.minus(one)).divides(Tl.plus(one))); Z0 = Zo.abs();
        V0 = Math.sqrt((2*Pave*Z0)/(1-Math.pow(magTl,2)));
        Pinc = Math.pow(V0,2)/(2*Z0);
        Pref = Pinc - Pave;
        aTl = aTl.times(minus);
        SWR = (1+magTl)/(1-magTl);
        JOptionPane.showMessageDialog(null, "Zo="+Zo+"\n V0="+V0+"\n Pinc="+Pinc+"\n Pref="+Pref+"\n SWR="+SWR);
    }
    else if (!aTl.equals(0) && !Zo.equals(0) && V0!=0){
        aTL = aTl.abs();
        Tl = aTl.times(minus);
        Z0 = Zo.abs();
        Pinc = Math.pow(V0, 2)/(2*Z0);
        Pref = (Math.pow(V0,2)*Math.pow(-aTL, 2))/(2*Z0);
        Pave = Pinc + Pref;
        SWR = (1+magTl)/(1-magTl);
        Zl = Zo.times((Tl.plus(one)).divides((Tl.minus(one)))); 
        JOptionPane.showMessageDialog(null, "Pinc="+Pinc+"\n Pref="+Pref+"\n Pave="+Pave+"SWR="+SWR+"ZL="+Zl);
    }
    else if (!aTl.equals(0) && !Zl.equals(0) && V0!=0){
        aTL = aTl.abs();
        Tl = aTl.times(minus);
        ZL = Zl.abs();
        Zo = Zl.times((Tl.minus(one)).divides(Tl.plus(one))); Z0 = Zo.abs();
        Pinc = Math.pow(V0, 2)/(2*Z0);
        Pref = (Math.pow(V0,2)*Math.pow(-aTL, 2))/(2*Z0);
        Pave = Pinc + Pref;
        SWR = (1+magTl)/(1-magTl);
        JOptionPane.showMessageDialog(null, "Zo="+Zo+"\n Pinc="+Pinc+"\n Pref="+Pref+"\n Pave="+Pave+"\n SWR="+SWR);
    }
    else if (Pave!=0 && Pinc!=0 && !Zo.equals(0)){
        Pref = Pinc - Pave;
        Z0 = Zo.abs();
        magTl = Math.sqrt((2*Pref*Z0)/(Math.pow(V0,2)));
        aTL = -magTl;
        SWR = (1+magTl)/(1-magTl);
        Zl = Zo.times((Tl.plus(one)).divides((Tl.minus(one)))); 
        JOptionPane.showMessageDialog(null, "Pref="+Pref+"\n SWR="+SWR+"\n ZL="+Zl);
    }
    else if (Pave!=0 && Pinc!=0 && !Zl.equals(0)){
        Pref = Pinc - Pave;
        ZL = Zl.abs();
        Zo = Zl.times((Tl.minus(one)).divides(Tl.plus(one))); Z0 = Zo.abs();
        magTl = Math.sqrt((2*Pref*Z0)/(Math.pow(V0,2)));
        aTL = -magTl;
        SWR = (1+magTl)/(1-magTl);
        JOptionPane.showMessageDialog(null, "Pref="+Pref+"\n Zo="+Zo+"\n Reflection Co-efficient Magnitude="+magTl+"\n SWR="+SWR);
    }
    else{
        JOptionPane.showMessageDialog(null, "Cannot Compute!");
    }
}// TODO add your handling code here:
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
alpha = Double.parseDouble(JOptionPane.showInputDialog("Enter the real part of propagation constant"));
beta = Double.parseDouble(JOptionPane.showInputDialog("Enter the imaginary part of propagation constant"));
yota = new Complex(alpha, beta);
yotaMag = yota.abs();// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
length = Double.parseDouble(JOptionPane.showInputDialog("Enter the length of the line"));        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
ZlR = Double.parseDouble(JOptionPane.showInputDialog("Enter real part of the load impedance"));
ZlI = Double.parseDouble(JOptionPane.showInputDialog("Enter imaginary part of the load impedance"));
Zl = new Complex(ZlR, ZlI);// TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
ZinR = Double.parseDouble(JOptionPane.showInputDialog("Enter real part of input impedance")); 
ZinI = Double.parseDouble(JOptionPane.showInputDialog("Enter the imaginary part of input impedance"));
Zin = new Complex(ZinR, ZinI);// TODO add your handling code here:
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
ZoR = Double.parseDouble(JOptionPane.showInputDialog("Enter real part of characteristic impedance"));
ZoI = Double.parseDouble(JOptionPane.showInputDialog("Enter imaginary part of characteristic impedance"));
Zo = new Complex(ZoR, ZoI);// TODO add your handling code here:
    }//GEN-LAST:event_jButton12ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(OtherParam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OtherParam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OtherParam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OtherParam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new OtherParam().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
