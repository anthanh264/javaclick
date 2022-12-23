/*     */ package democlick;
/*     */ import java.awt.Color;
/*     */ import java.awt.EventQueue;
/*     */ import java.awt.event.ActionEvent;
/*     */ import java.awt.event.ActionListener;
/*     */ import java.io.File;
/*     */ import java.io.FileNotFoundException;
/*     */ import java.util.Scanner;
/*     */ import java.util.logging.Level;
/*     */ import java.util.logging.Logger;
/*     */ import javax.swing.GroupLayout;
/*     */ import javax.swing.JButton;
/*     */ import javax.swing.JFrame;
/*     */ import javax.swing.JScrollPane;
/*     */ import javax.swing.JTable;
/*     */ import javax.swing.UIManager;
/*     */ import javax.swing.UnsupportedLookAndFeelException;
/*     */ import javax.swing.table.DefaultTableModel;
/*     */ 
/*     */ public class history extends JFrame {
/*     */   private JButton jButton1;
/*     */   
/*     */   public history() {
/*  24 */     initComponents();
/*  25 */     Show_Mac_Ip();
/*  26 */     setResizable(false);
/*  27 */     setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("logo.png")));
/*  28 */     setTitle("ĐĂNG NHẬP HỆ THỐNG SEO GOOGLE TOP 1 - CLICK ADS");
/*     */   }
/*     */   private JScrollPane jScrollPane1; private JTable tblog;
/*     */   
/*     */   public void Show_Mac_Ip() {
/*  33 */     DefaultTableModel model = (DefaultTableModel)this.tblog.getModel();
/*  34 */     Object[] row = new Object[5];
/*     */     
/*     */     try {
/*  37 */       File myObj = new File("history.txt");
/*  38 */       Scanner myReader = new Scanner(myObj);
/*  39 */       while (myReader.hasNextLine()) {
/*  40 */         String data = myReader.nextLine();
/*  41 */         if (!data.equals("")) {
/*  42 */           String[] strArray = data.split("\\|");
/*  43 */           row[0] = strArray[0];
/*  44 */           row[1] = strArray[1];
/*  45 */           row[2] = strArray[2];
/*  46 */           row[3] = strArray[3];
/*  47 */           row[4] = strArray[4];
/*  48 */           model.addRow(row);
/*  49 */           System.out.println(data);
/*     */         } 
/*     */       } 
/*  52 */       myReader.close();
/*  53 */     } catch (FileNotFoundException e) {
/*  54 */       System.out.println("An error occurred.");
/*  55 */       e.printStackTrace();
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void initComponents() {
/*  69 */     this.jScrollPane1 = new JScrollPane();
/*  70 */     this.tblog = new JTable();
/*  71 */     this.jButton1 = new JButton();
/*     */     
/*  73 */     setDefaultCloseOperation(3);
/*     */     
/*  75 */     this.tblog.setModel(new DefaultTableModel(new Object[0][], (Object[])new String[] { "Keyword", "Ip", "device", "Hành Động", "Thời Gian" }));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  83 */     this.jScrollPane1.setViewportView(this.tblog);
/*     */     
/*  85 */     this.jButton1.setBackground(new Color(246, 67, 47));
/*  86 */     this.jButton1.setFont(new Font("Tahoma", 1, 14));
/*  87 */     this.jButton1.setForeground(new Color(255, 255, 255));
/*  88 */     this.jButton1.setText("Tắt Lịch Sử");
/*  89 */     this.jButton1.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/*  91 */             history.this.jButton1ActionPerformed(evt);
/*     */           }
/*     */         });
/*     */     
/*  95 */     GroupLayout layout = new GroupLayout(getContentPane());
/*  96 */     getContentPane().setLayout(layout);
/*  97 */     layout.setHorizontalGroup(layout
/*  98 */         .createParallelGroup(GroupLayout.Alignment.LEADING)
/*  99 */         .addComponent(this.jScrollPane1, -1, 801, 32767)
/* 100 */         .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
/* 101 */           .addContainerGap(-1, 32767)
/* 102 */           .addComponent(this.jButton1, -2, 293, -2)
/* 103 */           .addGap(268, 268, 268)));
/*     */     
/* 105 */     layout.setVerticalGroup(layout
/* 106 */         .createParallelGroup(GroupLayout.Alignment.LEADING)
/* 107 */         .addGroup(layout.createSequentialGroup()
/* 108 */           .addComponent(this.jScrollPane1, -2, 324, -2)
/* 109 */           .addGap(18, 18, 18)
/* 110 */           .addComponent(this.jButton1, -1, 43, 32767)
/* 111 */           .addContainerGap()));
/*     */ 
/*     */     
/* 114 */     pack();
/*     */   }
/*     */ 
/*     */   
/*     */   private void jButton1ActionPerformed(ActionEvent evt) {
/* 119 */     setVisible(false);
/* 120 */     dispose();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void main(String[] args) {
/*     */     try {
/* 133 */       for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
/* 134 */         if ("Nimbus".equals(info.getName())) {
/* 135 */           UIManager.setLookAndFeel(info.getClassName());
/*     */           break;
/*     */         } 
/*     */       } 
/* 139 */     } catch (ClassNotFoundException ex) {
/* 140 */       Logger.getLogger(history.class.getName()).log(Level.SEVERE, (String)null, ex);
/* 141 */     } catch (InstantiationException ex) {
/* 142 */       Logger.getLogger(history.class.getName()).log(Level.SEVERE, (String)null, ex);
/* 143 */     } catch (IllegalAccessException ex) {
/* 144 */       Logger.getLogger(history.class.getName()).log(Level.SEVERE, (String)null, ex);
/* 145 */     } catch (UnsupportedLookAndFeelException ex) {
/* 146 */       Logger.getLogger(history.class.getName()).log(Level.SEVERE, (String)null, ex);
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 152 */     EventQueue.invokeLater(new Runnable() {
/*     */           public void run() {
/* 154 */             (new history()).setVisible(true);
/*     */           }
/*     */         });
/*     */   }
/*     */ }


/* Location:              D:\googleads\googleads.jar!\democlick\history.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */