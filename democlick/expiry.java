/*     */ package democlick;
/*     */ import java.awt.Color;
/*     */ import java.awt.Font;
/*     */ import java.awt.event.ActionEvent;
/*     */ import java.awt.event.ActionListener;
/*     */ import java.util.logging.Level;
/*     */ import java.util.logging.Logger;
/*     */ import javax.swing.GroupLayout;
/*     */ import javax.swing.JButton;
/*     */ import javax.swing.JLabel;
/*     */ import javax.swing.JPanel;
/*     */ import javax.swing.LayoutStyle;
/*     */ import javax.swing.UIManager;
/*     */ 
/*     */ public class expiry extends JFrame {
/*     */   private JButton jButton1;
/*     */   private JLabel jLabel1;
/*     */   private JLabel jLabel10;
/*     */   
/*     */   public expiry() {
/*  21 */     initComponents();
/*  22 */     setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("logo.png")));
/*  23 */     setTitle("SEO GOOGLE TOP 1 - Liên Hệ Admin Để Kích Hoạt");
/*     */   }
/*     */   private JLabel jLabel2; private JLabel jLabel3; private JLabel jLabel4;
/*     */   private JLabel jLabel5;
/*     */   private JLabel jLabel6;
/*     */   private JLabel jLabel7;
/*     */   private JLabel jLabel8;
/*     */   private JLabel jLabel9;
/*     */   private JPanel jPanel1;
/*     */   private JPanel jPanel3;
/*     */   
/*     */   private void initComponents() {
/*  35 */     this.jPanel3 = new JPanel();
/*  36 */     this.jLabel5 = new JLabel();
/*  37 */     this.jButton1 = new JButton();
/*  38 */     this.jLabel6 = new JLabel();
/*  39 */     this.jLabel7 = new JLabel();
/*  40 */     this.jLabel8 = new JLabel();
/*  41 */     this.jLabel9 = new JLabel();
/*  42 */     this.jLabel10 = new JLabel();
/*  43 */     this.jPanel1 = new JPanel();
/*  44 */     this.jLabel1 = new JLabel();
/*  45 */     this.jLabel2 = new JLabel();
/*  46 */     this.jLabel3 = new JLabel();
/*  47 */     this.jLabel4 = new JLabel();
/*     */     
/*  49 */     setDefaultCloseOperation(3);
/*     */     
/*  51 */     this.jPanel3.setBackground(new Color(255, 255, 255));
/*     */     
/*  53 */     this.jLabel5.setFont(new Font("Tahoma", 1, 24));
/*  54 */     this.jLabel5.setText("LIÊN HỆ ACTIVE ACOUT");
/*     */     
/*  56 */     this.jButton1.setBackground(new Color(245, 61, 45));
/*  57 */     this.jButton1.setFont(new Font("Tahoma", 1, 14));
/*  58 */     this.jButton1.setForeground(new Color(255, 255, 255));
/*  59 */     this.jButton1.setText("Quay Về Đăng Nhập");
/*  60 */     this.jButton1.setBorder(BorderFactory.createTitledBorder(""));
/*  61 */     this.jButton1.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/*  63 */             expiry.this.jButton1ActionPerformed(evt);
/*     */           }
/*     */         });
/*     */     
/*  67 */     this.jLabel6.setFont(new Font("Tahoma", 0, 14));
/*  68 */     this.jLabel6.setText("Quý Khách Vui Lòng Liên Hệ Qua SĐT/Zalo");
/*     */     
/*  70 */     this.jLabel7.setFont(new Font("Tahoma", 0, 14));
/*  71 */     this.jLabel7.setText(" Để Được Active Tài Khoản");
/*     */     
/*  73 */     this.jLabel8.setText("Seo auto là giúp các sản phẩm của bạn được ");
/*     */     
/*  75 */     this.jLabel9.setText("tìm thấy khi người dùng tìm kiếm từ khoá sản phẩm trên");
/*     */     
/*  77 */     this.jLabel10.setText(" tìm kiếm từ khoá sản phẩm trên Google.");
/*     */     
/*  79 */     GroupLayout jPanel3Layout = new GroupLayout(this.jPanel3);
/*  80 */     this.jPanel3.setLayout(jPanel3Layout);
/*  81 */     jPanel3Layout.setHorizontalGroup(jPanel3Layout
/*  82 */         .createParallelGroup(GroupLayout.Alignment.LEADING)
/*  83 */         .addGroup(jPanel3Layout.createSequentialGroup()
/*  84 */           .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/*  85 */             .addGroup(jPanel3Layout.createSequentialGroup()
/*  86 */               .addGap(30, 30, 30)
/*  87 */               .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/*  88 */                 .addGroup(jPanel3Layout.createSequentialGroup()
/*  89 */                   .addGap(12, 12, 12)
/*  90 */                   .addComponent(this.jLabel5))
/*  91 */                 .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
/*  92 */                   .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/*  93 */                     .addComponent(this.jLabel9)
/*  94 */                     .addGroup(jPanel3Layout.createSequentialGroup()
/*  95 */                       .addGap(25, 25, 25)
/*  96 */                       .addComponent(this.jLabel8)))
/*  97 */                   .addComponent(this.jLabel6, -2, 287, -2))))
/*  98 */             .addGroup(jPanel3Layout.createSequentialGroup()
/*  99 */               .addGap(97, 97, 97)
/* 100 */               .addComponent(this.jLabel7))
/* 101 */             .addGroup(jPanel3Layout.createSequentialGroup()
/* 102 */               .addGap(85, 85, 85)
/* 103 */               .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
/* 104 */                 .addComponent(this.jLabel10)
/* 105 */                 .addComponent(this.jButton1, -2, 174, -2))))
/* 106 */           .addContainerGap(30, 32767)));
/*     */     
/* 108 */     jPanel3Layout.setVerticalGroup(jPanel3Layout
/* 109 */         .createParallelGroup(GroupLayout.Alignment.LEADING)
/* 110 */         .addGroup(jPanel3Layout.createSequentialGroup()
/* 111 */           .addGap(65, 65, 65)
/* 112 */           .addComponent(this.jLabel5)
/* 113 */           .addGap(41, 41, 41)
/* 114 */           .addComponent(this.jLabel6)
/* 115 */           .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
/* 116 */           .addComponent(this.jLabel7)
/* 117 */           .addGap(45, 45, 45)
/* 118 */           .addComponent(this.jLabel8)
/* 119 */           .addGap(18, 18, 18)
/* 120 */           .addComponent(this.jLabel9)
/* 121 */           .addGap(18, 18, 18)
/* 122 */           .addComponent(this.jLabel10)
/* 123 */           .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 101, 32767)
/* 124 */           .addComponent(this.jButton1, -2, 53, -2)
/* 125 */           .addGap(75, 75, 75)));
/*     */ 
/*     */     
/* 128 */     this.jPanel1.setBackground(new Color(255, 255, 255));
/*     */     
/* 130 */     this.jLabel1.setFont(new Font("Tahoma", 1, 18));
/* 131 */     this.jLabel1.setText("Điện Thoại/Zalo");
/*     */     
/* 133 */     this.jLabel2.setFont(new Font("Tahoma", 1, 18));
/* 134 */     this.jLabel2.setText("0968214802");
/*     */     
/* 136 */     this.jLabel3.setIcon(new ImageIcon(getClass().getResource("/democlick/image/phone.jpg")));
/*     */     
/* 138 */     GroupLayout jPanel1Layout = new GroupLayout(this.jPanel1);
/* 139 */     this.jPanel1.setLayout(jPanel1Layout);
/* 140 */     jPanel1Layout.setHorizontalGroup(jPanel1Layout
/* 141 */         .createParallelGroup(GroupLayout.Alignment.LEADING)
/* 142 */         .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
/* 143 */           .addGap(43, 43, 43)
/* 144 */           .addComponent(this.jLabel3)
/* 145 */           .addGap(18, 18, 18)
/* 146 */           .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/* 147 */             .addComponent(this.jLabel1)
/* 148 */             .addComponent(this.jLabel2))
/* 149 */           .addContainerGap(56, 32767)));
/*     */     
/* 151 */     jPanel1Layout.setVerticalGroup(jPanel1Layout
/* 152 */         .createParallelGroup(GroupLayout.Alignment.LEADING)
/* 153 */         .addGroup(jPanel1Layout.createSequentialGroup()
/* 154 */           .addGap(27, 27, 27)
/* 155 */           .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/* 156 */             .addComponent(this.jLabel3)
/* 157 */             .addGroup(jPanel1Layout.createSequentialGroup()
/* 158 */               .addComponent(this.jLabel1)
/* 159 */               .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
/* 160 */               .addComponent(this.jLabel2)))
/* 161 */           .addContainerGap(32, 32767)));
/*     */ 
/*     */     
/* 164 */     this.jLabel4.setIcon(new ImageIcon(getClass().getResource("/democlick/image/zalo.jpg")));
/*     */     
/* 166 */     GroupLayout layout = new GroupLayout(getContentPane());
/* 167 */     getContentPane().setLayout(layout);
/* 168 */     layout.setHorizontalGroup(layout
/* 169 */         .createParallelGroup(GroupLayout.Alignment.LEADING)
/* 170 */         .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
/* 171 */           .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/* 172 */             .addGroup(layout.createSequentialGroup()
/* 173 */               .addGap(33, 33, 33)
/* 174 */               .addComponent(this.jPanel1, -2, -1, -2))
/* 175 */             .addGroup(layout.createSequentialGroup()
/* 176 */               .addGap(63, 63, 63)
/* 177 */               .addComponent(this.jLabel4)))
/* 178 */           .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 41, 32767)
/* 179 */           .addComponent(this.jPanel3, -2, -1, -2)));
/*     */     
/* 181 */     layout.setVerticalGroup(layout
/* 182 */         .createParallelGroup(GroupLayout.Alignment.LEADING)
/* 183 */         .addGroup(layout.createSequentialGroup()
/* 184 */           .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/* 185 */             .addComponent(this.jPanel3, -2, -1, -2)
/* 186 */             .addGroup(layout.createSequentialGroup()
/* 187 */               .addGap(78, 78, 78)
/* 188 */               .addComponent(this.jPanel1, -2, -1, -2)
/* 189 */               .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
/* 190 */               .addComponent(this.jLabel4)))
/* 191 */           .addGap(0, 0, 0)));
/*     */ 
/*     */     
/* 194 */     pack();
/*     */   }
/*     */   
/*     */   private void jButton1ActionPerformed(ActionEvent evt) {
/* 198 */     String[] info = new String[1];
/* 199 */     info[0] = "";
/* 200 */     login dr = new login();
/* 201 */     login.main(info);
/* 202 */     dr.setVisible(true);
/* 203 */     dr.pack();
/* 204 */     dispose();
/* 205 */     dr.setDefaultCloseOperation(3);
/* 206 */     dr.hide();
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
/* 219 */       for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
/* 220 */         if ("Nimbus".equals(info.getName())) {
/* 221 */           UIManager.setLookAndFeel(info.getClassName());
/*     */           break;
/*     */         } 
/*     */       } 
/* 225 */     } catch (ClassNotFoundException ex) {
/* 226 */       Logger.getLogger(expiry.class.getName()).log(Level.SEVERE, (String)null, ex);
/* 227 */     } catch (InstantiationException ex) {
/* 228 */       Logger.getLogger(expiry.class.getName()).log(Level.SEVERE, (String)null, ex);
/* 229 */     } catch (IllegalAccessException ex) {
/* 230 */       Logger.getLogger(expiry.class.getName()).log(Level.SEVERE, (String)null, ex);
/* 231 */     } catch (UnsupportedLookAndFeelException ex) {
/* 232 */       Logger.getLogger(expiry.class.getName()).log(Level.SEVERE, (String)null, ex);
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 237 */     EventQueue.invokeLater(new Runnable() {
/*     */           public void run() {
/* 239 */             (new expiry()).setVisible(true);
/*     */           }
/*     */         });
/*     */   }
/*     */ }


/* Location:              D:\googleads\googleads.jar!\democlick\expiry.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */