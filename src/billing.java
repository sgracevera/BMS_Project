
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author sgrac
 */
import java.io.FileOutputStream;
import project.connectionprovider;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;
import java.util.Date;
import javax.swing.table.DefaultTableModel;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;


public class billing extends javax.swing.JFrame implements Runnable {
        int hour,minute,second;
        public int finalTotal=0;
    /**
     * Creates new form billing
     */
    public billing() {
        initComponents();
        Thread t=new Thread(this);
        t.start();
        
        SimpleDateFormat dFormat= new SimpleDateFormat("dd-MM-yyyy"); 
        Date date= new Date();
        jLabel4.setText(dFormat.format(date));
        
        
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(200, 160));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1164, 550));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/billingg.jpg.png"))); // NOI18N
        jLabel1.setText("B");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 272, 84));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-bill-60.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 61, -1));

        jLabel3.setFont(new java.awt.Font("Montserrat Medium", 3, 12)); // NOI18N
        jLabel3.setText("Date:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 20, 95, -1));

        jLabel4.setFont(new java.awt.Font("Montserrat Medium", 3, 12)); // NOI18N
        jLabel4.setText("jLabel3");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 20, 95, -1));

        jLabel5.setFont(new java.awt.Font("Montserrat Medium", 3, 12)); // NOI18N
        jLabel5.setText("Time:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(735, 60, 100, -1));

        jLabel6.setFont(new java.awt.Font("Montserrat Medium", 3, 12)); // NOI18N
        jLabel6.setText("jLabel3");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 60, 95, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 1135, 10));

        jLabel7.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        jLabel7.setText("Buyer Details");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        jLabel8.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        jLabel8.setText("Name");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        jLabel9.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        jLabel9.setText("Contact No.");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, -1, -1));

        jLabel10.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        jLabel10.setText("Email");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 130, -1, -1));

        jTextField1.setBackground(new java.awt.Color(242, 242, 242));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 217, -1));

        jTextField2.setBackground(new java.awt.Color(242, 242, 242));
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 130, 160, -1));

        jTextField3.setBackground(new java.awt.Color(242, 242, 242));
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 130, 209, -1));

        jLabel11.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        jLabel11.setText("Address");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 130, -1, -1));

        jTextField4.setBackground(new java.awt.Color(242, 242, 242));
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 130, 246, -1));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 1135, 10));

        jLabel12.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        jLabel12.setText("Product Details");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        jLabel13.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        jLabel13.setText("ID");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        jTextField5.setBackground(new java.awt.Color(242, 242, 242));
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 217, -1));

        jLabel14.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        jLabel14.setText("Name");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, -1, -1));

        jTextField6.setBackground(new java.awt.Color(242, 242, 242));
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 210, 183, -1));

        jLabel15.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        jLabel15.setText("Rate");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 210, -1, -1));

        jTextField7.setBackground(new java.awt.Color(242, 242, 242));
        getContentPane().add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 210, 81, -1));

        jLabel16.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        jLabel16.setText("Description");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 210, -1, -1));

        jTextField8.setBackground(new java.awt.Color(242, 242, 242));
        getContentPane().add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(876, 210, 260, -1));

        jLabel18.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        jLabel18.setText("Quantity");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 210, -1, -1));

        jTextField9.setBackground(new java.awt.Color(242, 242, 242));
        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 210, 71, -1));

        jButton1.setBackground(new java.awt.Color(242, 242, 242));
        jButton1.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        jButton1.setText("ADD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 240, 70, -1));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 1135, 10));

        jScrollPane1.setPreferredSize(new java.awt.Dimension(1164, 650));

        jTable1.setBackground(new java.awt.Color(242, 242, 242));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Description", "Rate", "Quantity", "Total"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 723, 190));

        jLabel19.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        jLabel19.setText("Calculation Details:");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(761, 327, -1, -1));

        jLabel20.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        jLabel20.setText("Total:");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(761, 361, -1, -1));

        jLabel21.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        jLabel21.setText("Paid Amount:");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(761, 402, -1, -1));

        jLabel22.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        jLabel22.setText("Return Amount:");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(761, 443, -1, -1));

        jTextField10.setBackground(new java.awt.Color(242, 242, 242));
        jTextField10.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        jTextField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField10ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(877, 358, 77, -1));

        jTextField11.setBackground(new java.awt.Color(242, 242, 242));
        jTextField11.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        jTextField11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField11ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(877, 399, 77, -1));

        jTextField12.setBackground(new java.awt.Color(242, 242, 242));
        jTextField12.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        getContentPane().add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(877, 440, 77, -1));

        jButton2.setBackground(new java.awt.Color(242, 242, 242));
        jButton2.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        jButton2.setText("Save");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 310, -1, -1));

        jButton3.setBackground(new java.awt.Color(242, 242, 242));
        jButton3.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        jButton3.setText("Reset");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 380, -1, -1));

        jButton4.setBackground(new java.awt.Color(242, 242, 242));
        jButton4.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        jButton4.setText("Close");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 450, -1, -1));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Zz0zZTliMjQ4MzhlNGExMWViYmJiMjFiZTI2ZWNmN2MzZA==.png"))); // NOI18N
        jLabel17.setText("jLabel17");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(-170, -90, 1600, 1050));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        String name=jTextField1.getText();
        try{
           Connection con= connectionprovider.getcon(); 
           Statement st= con.createStatement();
           ResultSet rs=st.executeQuery("select *from buyer where name like '"+name+"%'" );  
            if (rs.next()){
                jTextField1.setText(rs.getString(1));
                jTextField2.setText(rs.getString(2));
                jTextField3.setText(rs.getString(3));
                jTextField4.setText(rs.getString(4));
            }
            else{
                jTextField2.setText("-");
                jTextField3.setText("-");
                jTextField4.setText("-");
            }
        }
        
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e); 
        }
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        String pId=jTextField5.getText();
        try{
           Connection con= connectionprovider.getcon(); 
           Statement st= con.createStatement();
           ResultSet rs=st.executeQuery("select *from product where pId='"+pId+"'" );  
            if (rs.next()){
                
                jTextField6.setText(rs.getString(2));
                jTextField7.setText(rs.getString(3));
                jTextField9.setText("1");
                jTextField8.setText(rs.getString(4));
            }
            else{
                jTextField6.setText("-");
                jTextField7.setText("-");
                jTextField8.setText("-");
                jTextField9.setText("-");
            }
        }
        
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e); 
        }
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        String name=jTextField1.getText();
        String contactno=jTextField2.getText();
        String email=jTextField3.getText();
        String address=jTextField4.getText();
        String path="C:\\Users\\sgrac\\OneDrive\\Desktop\\";
        com.itextpdf.text.Document doc= new com.itextpdf.text.Document();
        try
        {
            PdfWriter.getInstance(doc,new FileOutputStream(path+""+name+""+jLabel4.getText()+".pdf"));
            doc.open();
            Paragraph paragraph1=new Paragraph("                                          GNS(Billing Managament System)\n                                            Contact No: (+91)6006975268\n\n");
            doc.add(paragraph1);
            Paragraph paragraph2=new Paragraph("Date & Time:"+jLabel4.getText()+" "+jLabel6.getText()+"\nBuyer Details:\nName: "+name+"\nContact No: "+contactno+"\nEmail: "+email+"\nAddress: "+address+"\n\n");
            doc.add(paragraph2);
            PdfPTable tbl=new PdfPTable(5);
            tbl.addCell("Name");
            tbl.addCell("Description");
            tbl.addCell("Rate");
            tbl.addCell("Quantity");
            tbl.addCell("SubTotal");
            for (int i=0;i<jTable1.getRowCount();i++)
            {
                String n=jTable1.getValueAt(i, 0).toString();
                String d=jTable1.getValueAt(i, 1).toString();
                String r=jTable1.getValueAt(i, 2).toString();
                String q=jTable1.getValueAt(i, 3).toString();
                String s=jTable1.getValueAt(i, 4).toString();
                tbl.addCell(n);
                tbl.addCell(d);
                tbl.addCell(r);
                tbl.addCell(q);
                tbl.addCell(s);
                
                
            }
            
            doc.add(tbl);
            Paragraph paragraph3= new Paragraph("\nTotal: "+jTextField10.getText()+"\nPaid Amount: "+jTextField11.getText()+"\nReturn Amount: "+jTextField12.getText()+"\n\nThank You for Visiting! Come Again.\nGNS");
            doc.add(paragraph3);
            JOptionPane.showMessageDialog(null,"Bill Generated");
            setVisible(false);
            new billing().setVisible(true);
            
            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
        doc.close();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
         String contactno=jTextField2.getText();
        try{
           Connection con= connectionprovider.getcon(); 
           Statement st= con.createStatement();
           ResultSet rs=st.executeQuery("select *from buyer where contactno='"+contactno+"'" );  
            if (rs.next()){
                jTextField1.setText(rs.getString(1));
                jTextField2.setText(rs.getString(2));
                jTextField3.setText(rs.getString(3));
                jTextField4.setText(rs.getString(4));
            }
            else{
                jTextField1.setText("-");
                jTextField3.setText("-");
                jTextField4.setText("-");
            }
        }
        
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e); 
        }
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     int price=Integer.parseInt(jTextField7.getText());
     int quantity=Integer.parseInt(jTextField9.getText());
     int total=price*quantity;
     DefaultTableModel model=(DefaultTableModel)jTable1.getModel();
     model.addRow(new Object[]{jTextField6.getText(),jTextField8.getText(),price,quantity,total});
     finalTotal=finalTotal+total;
     String finalTotal1=String.valueOf(finalTotal);
     
     jTextField10.setText(finalTotal1);
     jTextField10.setEditable(false);
     
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField11ActionPerformed
        String paidamt=jTextField11.getText();
        int z=Integer.parseInt(paidamt);
        finalTotal=z-finalTotal;
        String finalTotal1=String.valueOf(finalTotal);
        
        jTextField12.setText(finalTotal1);
        jTextField12.setEditable(false);
        
    }//GEN-LAST:event_jTextField11ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        setVisible(false);
        new billing().setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField10ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new billing().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
public void run()
{
 while(true){
    Calendar cal= Calendar.getInstance();
    hour=cal.get(Calendar.HOUR_OF_DAY);
    minute=cal.get(Calendar.MINUTE);
    second=cal.get(Calendar.SECOND);
    
    SimpleDateFormat sdf24= new SimpleDateFormat("hh:mm:ss aa"); 
        Date dat= cal.getTime();
        String time=sdf24.format(dat); 
        jLabel6.setText(time);
        
        
    
}
}
}