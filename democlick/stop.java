/*    */ package democlick;
/*    */ 
/*    */ import java.awt.EventQueue;
/*    */ import java.awt.event.ActionEvent;
/*    */ import java.awt.event.ActionListener;
/*    */ import java.util.logging.Level;
/*    */ import java.util.logging.Logger;
/*    */ import javax.swing.GroupLayout;
/*    */ import javax.swing.JButton;
/*    */ import javax.swing.JFrame;
/*    */ import javax.swing.UIManager;
/*    */ import javax.swing.UnsupportedLookAndFeelException;
/*    */ 
/*    */ public class stop extends JFrame {
/*    */   private JButton jButton1;
/*    */   
/*    */   public stop() {
/* 18 */     initComponents();
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   private void initComponents() {
/* 30 */     this.jButton1 = new JButton();
/*    */     
/* 32 */     setDefaultCloseOperation(3);
/*    */     
/* 34 */     this.jButton1.setText("Stop");
/* 35 */     this.jButton1.addActionListener(new ActionListener() {
/*    */           public void actionPerformed(ActionEvent evt) {
/* 37 */             stop.this.jButton1ActionPerformed(evt);
/*    */           }
/*    */         });
/*    */     
/* 41 */     GroupLayout layout = new GroupLayout(getContentPane());
/* 42 */     getContentPane().setLayout(layout);
/* 43 */     layout.setHorizontalGroup(layout
/* 44 */         .createParallelGroup(GroupLayout.Alignment.LEADING)
/* 45 */         .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
/* 46 */           .addContainerGap(91, 32767)
/* 47 */           .addComponent(this.jButton1, -2, 242, -2)
/* 48 */           .addGap(67, 67, 67)));
/*    */     
/* 50 */     layout.setVerticalGroup(layout
/* 51 */         .createParallelGroup(GroupLayout.Alignment.LEADING)
/* 52 */         .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
/* 53 */           .addContainerGap(106, 32767)
/* 54 */           .addComponent(this.jButton1, -2, 107, -2)
/* 55 */           .addGap(87, 87, 87)));
/*    */ 
/*    */     
/* 58 */     pack();
/*    */   }
/*    */   
/*    */   private void jButton1ActionPerformed(ActionEvent evt) {
/* 62 */     System.exit(0);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static void main(String[] args) {
/*    */     try {
/* 75 */       for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
/* 76 */         if ("Nimbus".equals(info.getName())) {
/* 77 */           UIManager.setLookAndFeel(info.getClassName());
/*    */           break;
/*    */         } 
/*    */       } 
/* 81 */     } catch (ClassNotFoundException ex) {
/* 82 */       Logger.getLogger(stop.class.getName()).log(Level.SEVERE, (String)null, ex);
/* 83 */     } catch (InstantiationException ex) {
/* 84 */       Logger.getLogger(stop.class.getName()).log(Level.SEVERE, (String)null, ex);
/* 85 */     } catch (IllegalAccessException ex) {
/* 86 */       Logger.getLogger(stop.class.getName()).log(Level.SEVERE, (String)null, ex);
/* 87 */     } catch (UnsupportedLookAndFeelException ex) {
/* 88 */       Logger.getLogger(stop.class.getName()).log(Level.SEVERE, (String)null, ex);
/*    */     } 
/*    */ 
/*    */ 
/*    */     
/* 93 */     EventQueue.invokeLater(new Runnable() {
/*    */           public void run() {
/* 95 */             (new stop()).setVisible(true);
/*    */           }
/*    */         });
/*    */   }
/*    */ }


/* Location:              D:\googleads\googleads.jar!\democlick\stop.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */