/*     */ package democlick;
/*     */ import java.awt.Color;
/*     */ import java.awt.Font;
/*     */ import java.awt.event.ActionEvent;
/*     */ import java.awt.event.ActionListener;
/*     */ import java.sql.Connection;
/*     */ import java.sql.ResultSet;
/*     */ import java.sql.Statement;
/*     */ import java.util.logging.Level;
/*     */ import java.util.logging.Logger;
/*     */ import java.util.regex.Matcher;
/*     */ import java.util.regex.Pattern;
/*     */ import javax.swing.BorderFactory;
/*     */ import javax.swing.GroupLayout;
/*     */ import javax.swing.JButton;
/*     */ import javax.swing.JLabel;
/*     */ import javax.swing.JOptionPane;
/*     */ import javax.swing.JPanel;
/*     */ import javax.swing.JTextField;
/*     */ import javax.swing.UIManager;
/*     */ import javax.swing.UnsupportedLookAndFeelException;
/*     */ 
/*     */ public class registration extends JFrame {
/*     */   private JButton jButton1;
/*     */   
/*     */   public registration() {
/*  27 */     initComponents();
/*  28 */     setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("logo.png")));
/*  29 */     setTitle("ĐĂNG KÝ HỆ THỐNG SEO GOOGLE TOP 1 - CLICK ADS");
/*     */   }
/*     */   private JButton jButton2; private JLabel jLabel1;
/*     */   private JLabel jLabel2;
/*     */   private JLabel jLabel3;
/*     */   private JLabel jLabel4;
/*     */   private JPanel jPanel1;
/*     */   private JPanel jPanel2;
/*     */   private JTextField pass;
/*     */   private JTextField phone;
/*     */   
/*     */   private void initComponents() {
/*  41 */     this.jPanel2 = new JPanel();
/*  42 */     this.phone = new JTextField();
/*  43 */     this.pass = new JTextField();
/*  44 */     this.jButton1 = new JButton();
/*  45 */     this.jLabel4 = new JLabel();
/*  46 */     this.jButton2 = new JButton();
/*  47 */     this.jLabel3 = new JLabel();
/*  48 */     this.jLabel2 = new JLabel();
/*  49 */     this.jPanel1 = new JPanel();
/*  50 */     this.jLabel1 = new JLabel();
/*     */     
/*  52 */     setDefaultCloseOperation(3);
/*     */     
/*  54 */     this.jPanel2.setBackground(new Color(255, 255, 255));
/*     */     
/*  56 */     this.jButton1.setBackground(new Color(245, 61, 45));
/*  57 */     this.jButton1.setFont(new Font("Tahoma", 1, 14));
/*  58 */     this.jButton1.setForeground(new Color(255, 255, 255));
/*  59 */     this.jButton1.setText("Đăng Ký");
/*  60 */     this.jButton1.setBorder(BorderFactory.createTitledBorder(null, "", 0, 0, new Font("Tahoma", 0, 11), new Color(255, 255, 255)));
/*  61 */     this.jButton1.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/*  63 */             registration.this.jButton1ActionPerformed(evt);
/*     */           }
/*     */         });
/*     */     
/*  67 */     this.jLabel4.setFont(new Font("Tahoma", 1, 18));
/*  68 */     this.jLabel4.setText("ĐĂNG KÝ ACOUT");
/*     */     
/*  70 */     this.jButton2.setBackground(new Color(255, 255, 255));
/*  71 */     this.jButton2.setFont(new Font("Tahoma", 1, 14));
/*  72 */     this.jButton2.setForeground(new Color(245, 61, 45));
/*  73 */     this.jButton2.setText("Đăng Nhập");
/*  74 */     this.jButton2.setBorder(BorderFactory.createTitledBorder(""));
/*  75 */     this.jButton2.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/*  77 */             registration.this.jButton2ActionPerformed(evt);
/*     */           }
/*     */         });
/*     */     
/*  81 */     this.jLabel3.setText("Password");
/*     */     
/*  83 */     this.jLabel2.setText("Phone");
/*     */     
/*  85 */     GroupLayout jPanel2Layout = new GroupLayout(this.jPanel2);
/*  86 */     this.jPanel2.setLayout(jPanel2Layout);
/*  87 */     jPanel2Layout.setHorizontalGroup(jPanel2Layout
/*  88 */         .createParallelGroup(GroupLayout.Alignment.LEADING)
/*  89 */         .addGroup(GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
/*  90 */           .addContainerGap(40, 32767)
/*  91 */           .addComponent(this.jButton1, -2, 125, -2)
/*  92 */           .addGap(34, 34, 34)
/*  93 */           .addComponent(this.jButton2, -2, 128, -2)
/*  94 */           .addGap(30, 30, 30))
/*  95 */         .addGroup(jPanel2Layout.createSequentialGroup()
/*  96 */           .addGap(42, 42, 42)
/*  97 */           .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
/*  98 */             .addComponent(this.jLabel2)
/*  99 */             .addComponent(this.jLabel3))
/* 100 */           .addGap(40, 40, 40)
/* 101 */           .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/* 102 */             .addComponent(this.jLabel4)
/* 103 */             .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/* 104 */               .addComponent(this.pass, GroupLayout.Alignment.TRAILING, -2, 184, -2)
/* 105 */               .addComponent(this.phone, GroupLayout.Alignment.TRAILING, -2, 184, -2)))
/* 106 */           .addContainerGap(-1, 32767)));
/*     */     
/* 108 */     jPanel2Layout.setVerticalGroup(jPanel2Layout
/* 109 */         .createParallelGroup(GroupLayout.Alignment.LEADING)
/* 110 */         .addGroup(jPanel2Layout.createSequentialGroup()
/* 111 */           .addContainerGap(-1, 32767)
/* 112 */           .addComponent(this.jLabel4)
/* 113 */           .addGap(26, 26, 26)
/* 114 */           .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
/* 115 */             .addComponent(this.phone, -2, 40, -2)
/* 116 */             .addComponent(this.jLabel2))
/* 117 */           .addGap(27, 27, 27)
/* 118 */           .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
/* 119 */             .addComponent(this.pass, -2, 40, -2)
/* 120 */             .addComponent(this.jLabel3))
/* 121 */           .addGap(44, 44, 44)
/* 122 */           .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
/* 123 */             .addComponent(this.jButton1, -2, 44, -2)
/* 124 */             .addComponent(this.jButton2, -2, 44, -2))
/* 125 */           .addGap(89, 89, 89)));
/*     */ 
/*     */     
/* 128 */     this.jPanel1.setBackground(new Color(248, 249, 250));
/*     */     
/* 130 */     this.jLabel1.setIcon(new ImageIcon(getClass().getResource("/democlick/image/google.png")));
/*     */     
/* 132 */     GroupLayout jPanel1Layout = new GroupLayout(this.jPanel1);
/* 133 */     this.jPanel1.setLayout(jPanel1Layout);
/* 134 */     jPanel1Layout.setHorizontalGroup(jPanel1Layout
/* 135 */         .createParallelGroup(GroupLayout.Alignment.LEADING)
/* 136 */         .addGroup(jPanel1Layout.createSequentialGroup()
/* 137 */           .addGap(28, 28, 28)
/* 138 */           .addComponent(this.jLabel1)
/* 139 */           .addContainerGap(-1, 32767)));
/*     */     
/* 141 */     jPanel1Layout.setVerticalGroup(jPanel1Layout
/* 142 */         .createParallelGroup(GroupLayout.Alignment.LEADING)
/* 143 */         .addGroup(jPanel1Layout.createSequentialGroup()
/* 144 */           .addGap(108, 108, 108)
/* 145 */           .addComponent(this.jLabel1)
/* 146 */           .addContainerGap(-1, 32767)));
/*     */ 
/*     */     
/* 149 */     GroupLayout layout = new GroupLayout(getContentPane());
/* 150 */     getContentPane().setLayout(layout);
/* 151 */     layout.setHorizontalGroup(layout
/* 152 */         .createParallelGroup(GroupLayout.Alignment.LEADING)
/* 153 */         .addGroup(layout.createSequentialGroup()
/* 154 */           .addComponent(this.jPanel1, -2, -1, -2)
/* 155 */           .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
/* 156 */           .addComponent(this.jPanel2, -1, -1, 32767)
/* 157 */           .addGap(0, 0, 0)));
/*     */     
/* 159 */     layout.setVerticalGroup(layout
/* 160 */         .createParallelGroup(GroupLayout.Alignment.LEADING)
/* 161 */         .addComponent(this.jPanel1, GroupLayout.Alignment.TRAILING, -1, -1, 32767)
/* 162 */         .addGroup(layout.createSequentialGroup()
/* 163 */           .addComponent(this.jPanel2, -2, 320, -2)
/* 164 */           .addGap(0, 0, 32767)));
/*     */ 
/*     */     
/* 167 */     pack();
/*     */   }
/*     */   public static boolean checkPhoneNumber(String value) {
/* 170 */     Pattern pattern = Pattern.compile("[0]{1}[3,9,5,7,8]{1}[0-9]{8}");
/* 171 */     Matcher matcher = pattern.matcher(value);
/* 172 */     if (!matcher.find()) {
/* 173 */       return false;
/*     */     }
/* 175 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   private void jButton1ActionPerformed(ActionEvent evt) {
/* 180 */     String phone_value = this.phone.getText();
/* 181 */     String pass_value = this.pass.getText();
/* 182 */     if (phone_value.equals("")) {
/* 183 */       JOptionPane.showMessageDialog(this.rootPane, "Phone không được để trống");
/*     */     }
/* 185 */     else if (pass_value.equals("")) {
/* 186 */       JOptionPane.showMessageDialog(this.rootPane, "Mật khẩu không được để trống");
/*     */     }
/* 188 */     else if (checkPhoneNumber(phone_value)) {
/*     */       try {
/* 190 */         connect b = new connect();
/* 191 */         Connection connb = b.getConnection();
/* 192 */         Statement stmtb = connb.createStatement();
/* 193 */         ResultSet rs = stmtb.executeQuery("select id,x,y from user where phone='" + phone_value + "'");
/* 194 */         if (!rs.next()) {
/* 195 */           String sql = "INSERT INTO user(`phone`,`password`,`status`)VALUES ('" + phone_value + "', '" + pass_value + "', '0')";
/* 196 */           stmtb.executeUpdate(sql);
/* 197 */           String[] info = new String[1];
/* 198 */           info[0] = "";
/* 199 */           expiry dr = new expiry();
/* 200 */           expiry.main(info);
/* 201 */           dr.setVisible(true);
/* 202 */           dr.pack();
/* 203 */           dispose();
/* 204 */           dr.setDefaultCloseOperation(3);
/* 205 */           dr.hide();
/*     */         } else {
/* 207 */           JOptionPane.showMessageDialog(this.rootPane, "Số Điện Thoại Đã Tồn Tại");
/*     */         } 
/*     */         
/* 210 */         connb.close();
/* 211 */       } catch (Exception exception) {}
/*     */     } else {
/*     */       
/* 214 */       JOptionPane.showMessageDialog(this.rootPane, "Số Điện Thoại Không Đúng Định Dạng");
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void jButton2ActionPerformed(ActionEvent evt) {
/* 225 */     String[] info = new String[1];
/* 226 */     info[0] = "";
/* 227 */     login dr = new login();
/* 228 */     login.main(info);
/* 229 */     dr.setVisible(true);
/* 230 */     dr.pack();
/* 231 */     dispose();
/* 232 */     dr.setDefaultCloseOperation(3);
/* 233 */     dr.hide();
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
/* 246 */       for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
/* 247 */         if ("Nimbus".equals(info.getName())) {
/* 248 */           UIManager.setLookAndFeel(info.getClassName());
/*     */           break;
/*     */         } 
/*     */       } 
/* 252 */     } catch (ClassNotFoundException ex) {
/* 253 */       Logger.getLogger(registration.class.getName()).log(Level.SEVERE, (String)null, ex);
/* 254 */     } catch (InstantiationException ex) {
/* 255 */       Logger.getLogger(registration.class.getName()).log(Level.SEVERE, (String)null, ex);
/* 256 */     } catch (IllegalAccessException ex) {
/* 257 */       Logger.getLogger(registration.class.getName()).log(Level.SEVERE, (String)null, ex);
/* 258 */     } catch (UnsupportedLookAndFeelException ex) {
/* 259 */       Logger.getLogger(registration.class.getName()).log(Level.SEVERE, (String)null, ex);
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 264 */     EventQueue.invokeLater(new Runnable() {
/*     */           public void run() {
/* 266 */             (new registration()).setVisible(true);
/*     */           }
/*     */         });
/*     */   }
/*     */ }

