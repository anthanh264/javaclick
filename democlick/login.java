/*     */ package democlick;
/*     */ 
/*     */ import java.awt.Color;
/*     */ import java.awt.EventQueue;
/*     */ import java.awt.Font;
/*     */ import java.awt.Robot;
/*     */ import java.awt.Toolkit;
/*     */ import java.awt.event.ActionEvent;
/*     */ import java.awt.event.ActionListener;
/*     */ import java.io.File;
/*     */ import java.io.FileNotFoundException;
/*     */ import java.io.FileWriter;
/*     */ import java.io.IOException;
/*     */ import java.sql.Connection;
/*     */ import java.sql.ResultSet;
/*     */ import java.sql.Statement;
/*     */ import java.text.SimpleDateFormat;
/*     */ import java.util.Date;
/*     */ import java.util.Scanner;
/*     */ import java.util.logging.Level;
/*     */ import java.util.logging.Logger;
/*     */ import javax.swing.GroupLayout;
/*     */ import javax.swing.ImageIcon;
/*     */ import javax.swing.JButton;
/*     */ import javax.swing.JFrame;
/*     */ import javax.swing.JLabel;
/*     */ import javax.swing.JOptionPane;
/*     */ import javax.swing.JPanel;
/*     */ import javax.swing.JPasswordField;
/*     */ import javax.swing.JTextField;
/*     */ import javax.swing.LayoutStyle;
/*     */ import javax.swing.UIManager;
/*     */ import javax.swing.UnsupportedLookAndFeelException;
/*     */ import org.openqa.selenium.WebDriver;
/*     */ 
/*     */ public class login
/*     */   extends JFrame
/*     */ {
/*     */   public login() {
/*  40 */     initComponents();
/*  41 */     Showpass();
/*  42 */     setResizable(false);
/*  43 */     setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("logo.png")));
/*  44 */     setTitle("ĐĂNG NHẬP HỆ THỐNG SEO GOOGLE TOP 1 - CLICK ADS");
/*     */   }
/*  46 */   private static WebDriver driver = null;
/*     */   
/*     */   private Robot robot;
/*     */   
/*     */   private Runtime runtime;
/*     */   private JTextField email;
/*     */   private JButton jButton1;
/*     */   private JButton jButton2;
/*     */   private JButton jButton3;
/*     */   
/*     */   private void initComponents() {
/*  57 */     this.jButton1 = new JButton();
/*  58 */     this.jPanel1 = new JPanel();
/*  59 */     this.email = new JTextField();
/*  60 */     this.password = new JPasswordField();
/*  61 */     this.jButton2 = new JButton();
/*  62 */     this.jButton3 = new JButton();
/*  63 */     this.jLabel2 = new JLabel();
/*  64 */     this.jLabel3 = new JLabel();
/*  65 */     this.jLabel4 = new JLabel();
/*  66 */     this.jPanel3 = new JPanel();
/*  67 */     this.jLabel1 = new JLabel();
/*     */     
/*  69 */     this.jButton1.setText("jButton1");
/*     */     
/*  71 */     setDefaultCloseOperation(3);
/*     */     
/*  73 */     this.jPanel1.setBackground(new Color(255, 255, 255));
/*  74 */     this.jPanel1.setAlignmentX(0.0F);
/*  75 */     this.jPanel1.setAlignmentY(0.0F);
/*     */     
/*  77 */     this.email.setName("email");
/*  78 */     this.email.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/*  80 */             login.this.emailActionPerformed(evt);
/*     */           }
/*     */         });
/*     */     
/*  84 */     this.password.setName("password");
/*     */     
/*  86 */     this.jButton2.setBackground(new Color(245, 61, 45));
/*  87 */     this.jButton2.setFont(new Font("Tahoma", 1, 14));
/*  88 */     this.jButton2.setForeground(new Color(255, 255, 255));
/*  89 */     this.jButton2.setText("Đăng Nhập");
/*  90 */     this.jButton2.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/*  92 */             login.this.jButton2ActionPerformed(evt);
/*     */           }
/*     */         });
/*     */     
/*  96 */     this.jButton3.setBackground(new Color(255, 255, 255));
/*  97 */     this.jButton3.setFont(new Font("Tahoma", 1, 14));
/*  98 */     this.jButton3.setForeground(new Color(245, 61, 45));
/*  99 */     this.jButton3.setText("Đăng Ký");
/* 100 */     this.jButton3.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/* 102 */             login.this.jButton3ActionPerformed(evt);
/*     */           }
/*     */         });
/*     */     
/* 106 */     this.jLabel2.setText("Phone");
/*     */     
/* 108 */     this.jLabel3.setText("Password");
/*     */     
/* 110 */     this.jLabel4.setFont(new Font("Tahoma", 1, 24));
/* 111 */     this.jLabel4.setText("ĐĂNG NHẬP");
/*     */     
/* 113 */     GroupLayout jPanel1Layout = new GroupLayout(this.jPanel1);
/* 114 */     this.jPanel1.setLayout(jPanel1Layout);
/* 115 */     jPanel1Layout.setHorizontalGroup(jPanel1Layout
/* 116 */         .createParallelGroup(GroupLayout.Alignment.LEADING)
/* 117 */         .addGroup(jPanel1Layout.createSequentialGroup()
/* 118 */           .addContainerGap()
/* 119 */           .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
/* 120 */             .addComponent(this.jLabel3)
/* 121 */             .addComponent(this.jLabel2))
/* 122 */           .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767)
/* 123 */           .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/* 124 */             .addComponent(this.email, GroupLayout.Alignment.TRAILING, -2, 225, -2)
/* 125 */             .addComponent(this.password, GroupLayout.Alignment.TRAILING, -2, 225, -2))
/* 126 */           .addGap(64, 64, 64))
/* 127 */         .addGroup(jPanel1Layout.createSequentialGroup()
/* 128 */           .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/* 129 */             .addGroup(jPanel1Layout.createSequentialGroup()
/* 130 */               .addGap(25, 25, 25)
/* 131 */               .addComponent(this.jButton2, -2, 140, -2)
/* 132 */               .addGap(46, 46, 46)
/* 133 */               .addComponent(this.jButton3, -2, 145, -2))
/* 134 */             .addGroup(jPanel1Layout.createSequentialGroup()
/* 135 */               .addGap(114, 114, 114)
/* 136 */               .addComponent(this.jLabel4)))
/* 137 */           .addContainerGap(26, 32767)));
/*     */     
/* 139 */     jPanel1Layout.setVerticalGroup(jPanel1Layout
/* 140 */         .createParallelGroup(GroupLayout.Alignment.LEADING)
/* 141 */         .addGroup(jPanel1Layout.createSequentialGroup()
/* 142 */           .addGap(33, 33, 33)
/* 143 */           .addComponent(this.jLabel4)
/* 144 */           .addGap(35, 35, 35)
/* 145 */           .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
/* 146 */             .addComponent(this.email, -2, 44, -2)
/* 147 */             .addComponent(this.jLabel2))
/* 148 */           .addGap(34, 34, 34)
/* 149 */           .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
/* 150 */             .addComponent(this.password, -2, 48, -2)
/* 151 */             .addComponent(this.jLabel3))
/* 152 */           .addGap(32, 32, 32)
/* 153 */           .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
/* 154 */             .addComponent(this.jButton2, -2, 44, -2)
/* 155 */             .addComponent(this.jButton3, -2, 44, -2))
/* 156 */           .addContainerGap(45, 32767)));
/*     */ 
/*     */     
/* 159 */     this.jPanel3.setBackground(new Color(248, 249, 250));
/*     */     
/* 161 */     this.jLabel1.setIcon(new ImageIcon(getClass().getResource("/democlick/image/google.png")));
/*     */     
/* 163 */     GroupLayout jPanel3Layout = new GroupLayout(this.jPanel3);
/* 164 */     this.jPanel3.setLayout(jPanel3Layout);
/* 165 */     jPanel3Layout.setHorizontalGroup(jPanel3Layout
/* 166 */         .createParallelGroup(GroupLayout.Alignment.LEADING)
/* 167 */         .addGroup(jPanel3Layout.createSequentialGroup()
/* 168 */           .addGap(32, 32, 32)
/* 169 */           .addComponent(this.jLabel1)
/* 170 */           .addContainerGap(40, 32767)));
/*     */     
/* 172 */     jPanel3Layout.setVerticalGroup(jPanel3Layout
/* 173 */         .createParallelGroup(GroupLayout.Alignment.LEADING)
/* 174 */         .addGroup(jPanel3Layout.createSequentialGroup()
/* 175 */           .addGap(122, 122, 122)
/* 176 */           .addComponent(this.jLabel1)
/* 177 */           .addContainerGap(-1, 32767)));
/*     */ 
/*     */     
/* 180 */     GroupLayout layout = new GroupLayout(getContentPane());
/* 181 */     getContentPane().setLayout(layout);
/* 182 */     layout.setHorizontalGroup(layout
/* 183 */         .createParallelGroup(GroupLayout.Alignment.LEADING)
/* 184 */         .addGroup(layout.createSequentialGroup()
/* 185 */           .addComponent(this.jPanel3, -2, -1, -2)
/* 186 */           .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
/* 187 */           .addComponent(this.jPanel1, -2, -1, -2)
/* 188 */           .addContainerGap(-1, 32767)));
/*     */     
/* 190 */     layout.setVerticalGroup(layout
/* 191 */         .createParallelGroup(GroupLayout.Alignment.LEADING)
/* 192 */         .addGroup(layout.createSequentialGroup()
/* 193 */           .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
/* 194 */             .addComponent(this.jPanel1, -1, -1, 32767)
/* 195 */             .addComponent(this.jPanel3, -1, -1, 32767))
/* 196 */           .addGap(0, 0, 32767)));
/*     */ 
/*     */     
/* 199 */     pack();
/*     */   }
/*     */ 
/*     */   
/*     */   private JLabel jLabel1;
/*     */   private JLabel jLabel2;
/*     */   private JLabel jLabel3;
/*     */   private JLabel jLabel4;
/*     */   
/*     */   public void Showpass() {
/*     */     try {
/* 210 */       File myObj = new File("regkey.txt");
/* 211 */       Scanner myReader = new Scanner(myObj);
/* 212 */       while (myReader.hasNextLine()) {
/* 213 */         String data = myReader.nextLine();
/* 214 */         if (!data.equals("")) {
/* 215 */           String[] strArrayUser = data.split("\\|");
/* 216 */           this.email.setText(strArrayUser[0]);
/* 217 */           this.password.setText(strArrayUser[1]);
/* 218 */           System.out.println(strArrayUser[0]);
/*     */         } 
/*     */       } 
/* 221 */       myReader.close();
/* 222 */     } catch (FileNotFoundException e) {
/* 223 */       System.out.println("An error occurred.");
/* 224 */       e.printStackTrace();
/*     */     } 
/*     */   }
/*     */   
/*     */   private JPanel jPanel1;
/*     */   private JPanel jPanel3;
/*     */   
/*     */   private void jButton2ActionPerformed(ActionEvent evt) {
/* 232 */     String email_value = this.email.getText();
/* 233 */     String password_value = this.password.getText();
/* 234 */     if (email_value.equals("")) {
/* 235 */       JOptionPane.showMessageDialog(this.rootPane, "Email không được để trống");
/*     */     }
/* 237 */     if (password_value.equals("")) {
/* 238 */       JOptionPane.showMessageDialog(this.rootPane, "Mật khẩu không được để trống");
/*     */     }
/* 240 */     this.jButton2.setText("Đang Đăng Nhập");
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
/*     */ 
/*     */     
/*     */     try {
/* 264 */       connect a = new connect();
/* 265 */       Connection conn = a.getConnection();
/* 266 */       Statement stmt = conn.createStatement();
/* 267 */       ResultSet rs = stmt.executeQuery("select `user`.id as user_id,register_service.date as date,user.money as money from user INNER JOIN register_service ON register_service.user_id=`user`.id where status=1 and phone='" + email_value + "' and password='" + password_value + "' ORDER BY register_service.date DESC LIMIT 1");
/* 268 */       System.out.println("select `user`.id as user_id,register_service.date as date,user.money as money from user INNER JOIN register_service ON register_service.user_id=`user`.id where status=1 and phone='" + email_value + "' and password='" + password_value + "' ORDER BY register_service.date DESC LIMIT 1");
/* 269 */       int time = (int)((new Date()).getTime() / 1000L);
/* 270 */       if (rs.next()) {
/* 271 */         if (Integer.parseInt(rs.getString("date")) - time >= 0) {
/*     */           try {
/* 273 */             FileWriter myWriter = new FileWriter("regkey.txt");
/* 274 */             myWriter.write(email_value + "|" + password_value);
/* 275 */             myWriter.close();
/* 276 */             System.out.println("Successfully wrote to the file.");
/* 277 */           } catch (IOException e) {
/* 278 */             System.out.println("An error occurred.");
/* 279 */             e.printStackTrace();
/*     */           } 
/*     */           try {
/* 282 */             FileWriter myWriter = new FileWriter("history.txt");
/* 283 */             myWriter.write("");
/* 284 */             myWriter.close();
/* 285 */             System.out.println("Successfully wrote to the file.");
/* 286 */           } catch (IOException e) {
/* 287 */             System.out.println("An error occurred.");
/* 288 */             e.printStackTrace();
/*     */           } 
/* 290 */           Long date = Long.valueOf(Long.parseLong(rs.getString("date")));
/* 291 */           SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
/* 292 */           String convetdata = sdf.format(new Date(date.longValue() * 1000L));
/*     */           
/* 294 */           System.out.println("money" + rs.getString("money"));
/* 295 */           String[] info = new String[5];
/* 296 */           info[0] = rs.getString(1);
/* 297 */           info[1] = rs.getString("date");
/* 298 */           info[2] = Integer.toString((Integer.parseInt(rs.getString("date")) - time) / 86400);
/* 299 */           info[3] = email_value;
/* 300 */           info[4] = rs.getString("money");
/*     */           
/* 302 */           System.out.println("");
/* 303 */           dashboard dr = new dashboard();
/* 304 */           dashboard.main(info);
/* 305 */           dr.setVisible(true);
/* 306 */           dr.pack();
/* 307 */           dispose();
/* 308 */           dr.setDefaultCloseOperation(3);
/* 309 */           dr.hide();
/*     */         } else {
/*     */           
/* 312 */           String[] info = new String[1];
/* 313 */           info[0] = "1";
/* 314 */           expiry dr = new expiry();
/* 315 */           expiry.main(info);
/* 316 */           dr.setVisible(true);
/* 317 */           dr.pack();
/* 318 */           dispose();
/* 319 */           dr.setDefaultCloseOperation(3);
/* 320 */           dr.hide();
/*     */         } 
/*     */       } else {
/*     */         
/* 324 */         this.jButton2.setText("Đăng Nhập");
/* 325 */         JOptionPane.showMessageDialog(this.rootPane, "Tài Khoản Đã Hết Hạn Hoặc Acout Đăng Nhập Không Chính Xác Liên Hệ:0968214802");
/*     */       } 
/* 327 */       conn.close();
/* 328 */     } catch (Exception exception) {}
/*     */   }
/*     */   
/*     */   private JPasswordField password;
/*     */   
/*     */   private void jButton3ActionPerformed(ActionEvent evt) {
/* 334 */     String[] info = new String[1];
/* 335 */     info[0] = "";
/* 336 */     registration dr = new registration();
/* 337 */     registration.main(info);
/* 338 */     dr.setVisible(true);
/* 339 */     dr.pack();
/* 340 */     dispose();
/* 341 */     dr.setDefaultCloseOperation(3);
/* 342 */     dr.hide();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void emailActionPerformed(ActionEvent evt) {}
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void main(String[] args) {
/*     */     try {
/* 355 */       for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
/* 356 */         if ("Nimbus".equals(info.getName())) {
/* 357 */           UIManager.setLookAndFeel(info.getClassName());
/*     */           break;
/*     */         } 
/*     */       } 
/* 361 */     } catch (ClassNotFoundException ex) {
/* 362 */       Logger.getLogger(login.class.getName()).log(Level.SEVERE, (String)null, ex);
/* 363 */     } catch (InstantiationException ex) {
/* 364 */       Logger.getLogger(login.class.getName()).log(Level.SEVERE, (String)null, ex);
/* 365 */     } catch (IllegalAccessException ex) {
/* 366 */       Logger.getLogger(login.class.getName()).log(Level.SEVERE, (String)null, ex);
/* 367 */     } catch (UnsupportedLookAndFeelException ex) {
/* 368 */       Logger.getLogger(login.class.getName()).log(Level.SEVERE, (String)null, ex);
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 373 */     EventQueue.invokeLater(new Runnable() {
/*     */           public void run() {
/* 375 */             (new login()).setVisible(true);
/*     */           }
/*     */         });
/*     */   }
/*     */ }


/* Location:              D:\googleads\googleads.jar!\democlick\login.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */