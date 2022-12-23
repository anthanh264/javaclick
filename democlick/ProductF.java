/*     */ package democlick;
/*     */ import java.awt.event.ActionEvent;
/*     */ import java.awt.event.ActionListener;
/*     */ import java.awt.event.MouseEvent;
/*     */ import java.sql.Connection;
/*     */ import java.sql.ResultSet;
/*     */ import java.sql.Statement;
/*     */ import java.util.ArrayList;
/*     */ import java.util.logging.Level;
/*     */ import java.util.logging.Logger;
/*     */ import javax.swing.GroupLayout;
/*     */ import javax.swing.JButton;
/*     */ import javax.swing.JLabel;
/*     */ import javax.swing.JOptionPane;
/*     */ import javax.swing.JPanel;
/*     */ import javax.swing.JRadioButton;
/*     */ import javax.swing.LayoutStyle;
/*     */ import javax.swing.UIManager;
/*     */ import javax.swing.table.DefaultTableModel;
/*     */ import javax.swing.table.TableModel;
/*     */ 
/*     */ public class ProductF extends JFrame {
/*     */   private static String user_id;
/*     */   private JCheckBox active;
/*     */   private ButtonGroup buttonGroup1;
/*     */   private JLabel id_text;
/*     */   private JButton jButton1;
/*     */   
/*     */   public ProductF(String user) {
/*  30 */     initComponents();
/*  31 */     setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("logo.png")));
/*  32 */     setTitle("HỆ THỐNG SEO GOOGLE TOP 1 - Chiến Dịch");
/*  33 */     user_id = user;
/*  34 */     Show_Product_Table();
/*     */   }
/*     */   private JButton jButton2; private JButton jButton3; private JButton jButton4; private JLabel jLabel1; private JLabel jLabel2; private JLabel jLabel3; private JPanel jPanel1; private JPanel jPanel2;
/*     */   private JScrollPane jScrollPane1;
/*     */   private JScrollPane jScrollPane2;
/*     */   private JTextArea link_website;
/*     */   private JTextField name_product;
/*     */   private JRadioButton qc;
/*     */   private JRadioButton seo;
/*     */   private JTable tbproduct;
/*     */   
/*     */   private void initComponents() {
/*  46 */     this.buttonGroup1 = new ButtonGroup();
/*  47 */     this.jPanel2 = new JPanel();
/*  48 */     this.jScrollPane2 = new JScrollPane();
/*  49 */     this.tbproduct = new JTable();
/*  50 */     this.jButton4 = new JButton();
/*  51 */     this.jPanel1 = new JPanel();
/*  52 */     this.jLabel1 = new JLabel();
/*  53 */     this.jScrollPane1 = new JScrollPane();
/*  54 */     this.link_website = new JTextArea();
/*  55 */     this.name_product = new JTextField();
/*  56 */     this.jLabel2 = new JLabel();
/*  57 */     this.jButton1 = new JButton();
/*  58 */     this.jButton2 = new JButton();
/*  59 */     this.jButton3 = new JButton();
/*  60 */     this.qc = new JRadioButton();
/*  61 */     this.seo = new JRadioButton();
/*  62 */     this.active = new JCheckBox();
/*  63 */     this.id_text = new JLabel();
/*  64 */     this.jLabel3 = new JLabel();
/*     */     
/*  66 */     setDefaultCloseOperation(3);
/*     */     
/*  68 */     this.jPanel2.setBackground(new Color(255, 255, 255));
/*     */     
/*  70 */     this.tbproduct.setModel(new DefaultTableModel(new Object[0][], (Object[])new String[] { "id", "Tên Chiến Dịch", "Link", "Click", "Trạng Thái" }));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  78 */     this.tbproduct.addMouseListener(new MouseAdapter() {
/*     */           public void mouseClicked(MouseEvent evt) {
/*  80 */             ProductF.this.tbproductMouseClicked(evt);
/*     */           }
/*     */         });
/*  83 */     this.jScrollPane2.setViewportView(this.tbproduct);
/*  84 */     if (this.tbproduct.getColumnModel().getColumnCount() > 0) {
/*  85 */       this.tbproduct.getColumnModel().getColumn(0).setResizable(false);
/*  86 */       this.tbproduct.getColumnModel().getColumn(2).setResizable(false);
/*     */     } 
/*     */     
/*  89 */     this.jButton4.setText("Về Trang Chạy");
/*  90 */     this.jButton4.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/*  92 */             ProductF.this.jButton4ActionPerformed(evt);
/*     */           }
/*     */         });
/*     */     
/*  96 */     this.jPanel1.setBackground(new Color(255, 255, 255));
/*     */     
/*  98 */     this.jLabel1.setText("Tên chiến dịch");
/*     */     
/* 100 */     this.link_website.setColumns(20);
/* 101 */     this.link_website.setRows(5);
/* 102 */     this.jScrollPane1.setViewportView(this.link_website);
/*     */     
/* 104 */     this.jLabel2.setText("Link các website");
/*     */     
/* 106 */     this.jButton1.setText("Thêm");
/* 107 */     this.jButton1.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/* 109 */             ProductF.this.jButton1ActionPerformed(evt);
/*     */           }
/*     */         });
/*     */     
/* 113 */     this.jButton2.setText("Sửa");
/* 114 */     this.jButton2.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/* 116 */             ProductF.this.jButton2ActionPerformed(evt);
/*     */           }
/*     */         });
/*     */     
/* 120 */     this.jButton3.setText("Xoá");
/* 121 */     this.jButton3.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/* 123 */             ProductF.this.jButton3ActionPerformed(evt);
/*     */           }
/*     */         });
/*     */     
/* 127 */     this.buttonGroup1.add(this.qc);
/* 128 */     this.qc.setText("Click Quảng Cáo");
/*     */     
/* 130 */     this.buttonGroup1.add(this.seo);
/* 131 */     this.seo.setSelected(true);
/* 132 */     this.seo.setText("Click Seo");
/*     */     
/* 134 */     this.active.setText("Hoạt Động");
/*     */     
/* 136 */     this.id_text.setText("id");
/*     */     
/* 138 */     GroupLayout jPanel1Layout = new GroupLayout(this.jPanel1);
/* 139 */     this.jPanel1.setLayout(jPanel1Layout);
/* 140 */     jPanel1Layout.setHorizontalGroup(jPanel1Layout
/* 141 */         .createParallelGroup(GroupLayout.Alignment.LEADING)
/* 142 */         .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
/* 143 */           .addGap(28, 28, 28)
/* 144 */           .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
/* 145 */             .addComponent(this.jScrollPane1)
/* 146 */             .addGroup(GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
/* 147 */               .addGap(0, 0, 32767)
/* 148 */               .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/* 149 */                 .addComponent(this.name_product, -2, 266, -2)
/* 150 */                 .addComponent(this.jLabel2)
/* 151 */                 .addGroup(jPanel1Layout.createSequentialGroup()
/* 152 */                   .addComponent(this.jLabel1)
/* 153 */                   .addGap(18, 18, 18)
/* 154 */                   .addComponent(this.id_text)))
/* 155 */               .addGap(0, 0, 32767))
/* 156 */             .addGroup(GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
/* 157 */               .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
/* 158 */                 .addGroup(jPanel1Layout.createSequentialGroup()
/* 159 */                   .addComponent(this.qc)
/* 160 */                   .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
/* 161 */                   .addComponent(this.seo))
/* 162 */                 .addGroup(jPanel1Layout.createSequentialGroup()
/* 163 */                   .addGap(14, 14, 14)
/* 164 */                   .addComponent(this.jButton1)
/* 165 */                   .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767)
/* 166 */                   .addComponent(this.jButton2)))
/* 167 */               .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767)
/* 168 */               .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/* 169 */                 .addComponent(this.active, GroupLayout.Alignment.TRAILING)
/* 170 */                 .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
/* 171 */                   .addComponent(this.jButton3)
/* 172 */                   .addGap(10, 10, 10)))))
/* 173 */           .addContainerGap()));
/*     */     
/* 175 */     jPanel1Layout.setVerticalGroup(jPanel1Layout
/* 176 */         .createParallelGroup(GroupLayout.Alignment.LEADING)
/* 177 */         .addGroup(jPanel1Layout.createSequentialGroup()
/* 178 */           .addGap(22, 22, 22)
/* 179 */           .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
/* 180 */             .addComponent(this.jLabel1)
/* 181 */             .addComponent(this.id_text))
/* 182 */           .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
/* 183 */           .addComponent(this.name_product, -2, 28, -2)
/* 184 */           .addGap(18, 18, 18)
/* 185 */           .addComponent(this.jLabel2)
/* 186 */           .addGap(18, 18, 18)
/* 187 */           .addComponent(this.jScrollPane1, -2, -1, -2)
/* 188 */           .addGap(18, 18, 18)
/* 189 */           .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
/* 190 */             .addComponent(this.qc)
/* 191 */             .addComponent(this.seo)
/* 192 */             .addComponent(this.active))
/* 193 */           .addGap(18, 18, 18)
/* 194 */           .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
/* 195 */             .addComponent(this.jButton1)
/* 196 */             .addComponent(this.jButton2)
/* 197 */             .addComponent(this.jButton3))
/* 198 */           .addContainerGap(26, 32767)));
/*     */ 
/*     */     
/* 201 */     this.jLabel3.setBackground(new Color(255, 255, 255));
/* 202 */     this.jLabel3.setIcon(new ImageIcon(getClass().getResource("/democlick/image/google.png")));
/*     */     
/* 204 */     GroupLayout jPanel2Layout = new GroupLayout(this.jPanel2);
/* 205 */     this.jPanel2.setLayout(jPanel2Layout);
/* 206 */     jPanel2Layout.setHorizontalGroup(jPanel2Layout
/* 207 */         .createParallelGroup(GroupLayout.Alignment.LEADING)
/* 208 */         .addGroup(jPanel2Layout.createSequentialGroup()
/* 209 */           .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/* 210 */             .addGroup(jPanel2Layout.createSequentialGroup()
/* 211 */               .addContainerGap()
/* 212 */               .addComponent(this.jScrollPane2, -2, 293, -2))
/* 213 */             .addGroup(jPanel2Layout.createSequentialGroup()
/* 214 */               .addGap(37, 37, 37)
/* 215 */               .addComponent(this.jButton4, -2, 235, -2))
/* 216 */             .addGroup(jPanel2Layout.createSequentialGroup()
/* 217 */               .addGap(29, 29, 29)
/* 218 */               .addComponent(this.jLabel3)))
/* 219 */           .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
/* 220 */           .addComponent(this.jPanel1, -2, -1, -2)
/* 221 */           .addContainerGap(23, 32767)));
/*     */     
/* 223 */     jPanel2Layout.setVerticalGroup(jPanel2Layout
/* 224 */         .createParallelGroup(GroupLayout.Alignment.LEADING)
/* 225 */         .addGroup(jPanel2Layout.createSequentialGroup()
/* 226 */           .addContainerGap()
/* 227 */           .addComponent(this.jLabel3)
/* 228 */           .addGap(22, 22, 22)
/* 229 */           .addComponent(this.jScrollPane2, -2, 141, -2)
/* 230 */           .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
/* 231 */           .addComponent(this.jButton4, -2, 50, -2)
/* 232 */           .addContainerGap(-1, 32767))
/* 233 */         .addGroup(jPanel2Layout.createSequentialGroup()
/* 234 */           .addComponent(this.jPanel1, -2, -1, -2)
/* 235 */           .addGap(0, 0, 32767)));
/*     */ 
/*     */     
/* 238 */     GroupLayout layout = new GroupLayout(getContentPane());
/* 239 */     getContentPane().setLayout(layout);
/* 240 */     layout.setHorizontalGroup(layout
/* 241 */         .createParallelGroup(GroupLayout.Alignment.LEADING)
/* 242 */         .addComponent(this.jPanel2, GroupLayout.Alignment.TRAILING, -2, -1, -2));
/*     */     
/* 244 */     layout.setVerticalGroup(layout
/* 245 */         .createParallelGroup(GroupLayout.Alignment.LEADING)
/* 246 */         .addGroup(layout.createSequentialGroup()
/* 247 */           .addComponent(this.jPanel2, -2, -1, -2)
/* 248 */           .addGap(0, 0, 32767)));
/*     */ 
/*     */     
/* 251 */     pack();
/*     */   }
/*     */ 
/*     */   
/*     */   private void jButton4ActionPerformed(ActionEvent evt) {
/* 256 */     setVisible(false);
/* 257 */     dispose();
/*     */   }
/*     */   public ArrayList<Product> productList() {
/* 260 */     ArrayList<Product> productList = new ArrayList<>();
/*     */     try {
/* 262 */       connect a = new connect();
/* 263 */       Connection conn = a.getConnection();
/* 264 */       Statement stmt = conn.createStatement();
/* 265 */       System.out.println("select name as `name`,link as link,click_qc as click_qc,action as action from product WHERE product.user_id=" + user_id + " ORDER BY product.id DESC");
/* 266 */       ResultSet rs = stmt.executeQuery("select id as id, name as `name`,link as link,click_qc as click_qc,action as action from product WHERE product.user_id=" + user_id + " ORDER BY product.id DESC");
/*     */       
/* 268 */       while (rs.next()) {
/* 269 */         String Click_qc = "Seo";
/* 270 */         if (Integer.parseInt(rs.getString("click_qc")) == 1) {
/* 271 */           Click_qc = "Ads";
/*     */         }
/* 273 */         String Active = "Tắt";
/* 274 */         if (Integer.parseInt(rs.getString("action")) == 1) {
/* 275 */           Active = "Bật";
/*     */         }
/*     */         
/* 278 */         Product product = new Product(rs.getString("id"), rs.getString("name"), rs.getString("link"), Click_qc, Active);
/*     */         
/* 280 */         productList.add(product);
/*     */       } 
/* 282 */       conn.close();
/* 283 */     } catch (Exception exception) {}
/*     */     
/* 285 */     return productList;
/*     */   }
/*     */ 
/*     */   
/*     */   public void Show_Product_Table() {
/* 290 */     ArrayList<Product> list = productList();
/* 291 */     DefaultTableModel model = (DefaultTableModel)this.tbproduct.getModel();
/*     */     
/* 293 */     Object[] row = new Object[5];
/* 294 */     for (int i = 0; i < list.size(); i++) {
/* 295 */       row[0] = ((Product)list.get(i)).getId();
/* 296 */       row[1] = ((Product)list.get(i)).getName();
/* 297 */       row[2] = ((Product)list.get(i)).getLink();
/* 298 */       row[3] = ((Product)list.get(i)).getClick_qc();
/* 299 */       row[4] = ((Product)list.get(i)).getAction();
/* 300 */       model.addRow(row);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   private void jButton1ActionPerformed(ActionEvent evt) {
/* 306 */     String get_name = this.name_product.getText();
/* 307 */     String get_link = this.link_website.getText();
/* 308 */     String click = "0";
/* 309 */     if (this.qc.isSelected()) {
/* 310 */       click = "1";
/*     */     } else {
/* 312 */       click = "0";
/*     */     } 
/* 314 */     String get_action = "1";
/* 315 */     if (this.active.isSelected()) {
/* 316 */       get_action = "1";
/*     */     } else {
/* 318 */       get_action = "0";
/*     */     } 
/* 320 */     if (get_link.equals("")) {
/* 321 */       JOptionPane.showMessageDialog(this.rootPane, "Link Sản Phẩm Cần Tìm Không Để Trống");
/*     */     }
/* 323 */     else if (get_name.equals("")) {
/* 324 */       JOptionPane.showMessageDialog(this.rootPane, "Tên Chiến Dịch Không Được Để Trống");
/*     */     } else {
/*     */       try {
/* 327 */         connect b = new connect();
/* 328 */         Connection connb = b.getConnection();
/* 329 */         Statement stmtb = connb.createStatement();
/* 330 */         String sql = "INSERT INTO product (name,link,action,user_id,click_qc)VALUES ('" + get_name + "','" + get_link + "', '" + get_action + "', '" + user_id + "','" + click + "')";
/*     */         
/* 332 */         stmtb.executeUpdate(sql);
/*     */         
/* 334 */         DefaultTableModel model = (DefaultTableModel)this.tbproduct.getModel();
/* 335 */         model.getDataVector().removeAllElements();
/* 336 */         revalidate();
/* 337 */         Show_Product_Table();
/* 338 */         connb.close();
/* 339 */         this.link_website.setText("");
/* 340 */         this.name_product.setText("");
/* 341 */       } catch (Exception exception) {}
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void tbproductMouseClicked(MouseEvent evt) {
/* 350 */     int i = this.tbproduct.getSelectedRow();
/* 351 */     TableModel model = this.tbproduct.getModel();
/* 352 */     this.name_product.setText(model.getValueAt(i, 1).toString());
/* 353 */     this.id_text.setText(model.getValueAt(i, 0).toString());
/*     */     
/* 355 */     if (model.getValueAt(i, 3).toString().equals("Ads")) {
/* 356 */       this.qc.setSelected(true);
/*     */     } else {
/* 358 */       this.seo.setSelected(true);
/*     */     } 
/*     */     
/* 361 */     if (model.getValueAt(i, 4).toString().equals("Bật")) {
/* 362 */       this.active.setSelected(true);
/*     */     }
/*     */     
/* 365 */     this.link_website.setText(model.getValueAt(i, 2).toString());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void jButton3ActionPerformed(ActionEvent evt) {
/* 372 */     String id = this.id_text.getText();
/*     */     
/* 374 */     if (id.equals("")) {
/* 375 */       JOptionPane.showMessageDialog(this.rootPane, "Chọn Chiến Dịch Cần Xoá");
/*     */     } else {
/* 377 */       System.out.println(id);
/*     */       try {
/* 379 */         connect b = new connect();
/* 380 */         Connection connb = b.getConnection();
/* 381 */         Statement stmtb = connb.createStatement();
/* 382 */         System.out.println("");
/* 383 */         String sql = "DELETE FROM product WHERE id=" + id + " and user_id=" + user_id;
/* 384 */         stmtb.executeUpdate(sql);
/* 385 */         String sqlk = "DELETE FROM key_word WHERE product_id=" + id + " and user_id=" + user_id;
/* 386 */         stmtb.executeUpdate(sqlk);
/*     */         
/* 388 */         DefaultTableModel model = (DefaultTableModel)this.tbproduct.getModel();
/* 389 */         model.getDataVector().removeAllElements();
/* 390 */         revalidate();
/* 391 */         Show_Product_Table();
/* 392 */         connb.close();
/* 393 */         this.link_website.setText("");
/* 394 */         this.name_product.setText("");
/* 395 */       } catch (Exception exception) {}
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void jButton2ActionPerformed(ActionEvent evt) {
/* 404 */     String get_name = this.name_product.getText();
/* 405 */     String get_link = this.link_website.getText();
/* 406 */     String id = this.id_text.getText();
/* 407 */     String click = "0";
/* 408 */     if (this.qc.isSelected()) {
/* 409 */       click = "1";
/*     */     } else {
/* 411 */       click = "0";
/*     */     } 
/* 413 */     String get_action = "1";
/* 414 */     if (this.active.isSelected()) {
/* 415 */       get_action = "1";
/*     */     } else {
/* 417 */       get_action = "0";
/*     */     } 
/* 419 */     if (get_link.equals("")) {
/* 420 */       JOptionPane.showMessageDialog(this.rootPane, "Link Sản Phẩm Cần Tìm Không Để Trống");
/*     */     }
/* 422 */     else if (get_name.equals("")) {
/* 423 */       JOptionPane.showMessageDialog(this.rootPane, "Tên Chiến Dịch Không Được Để Trống");
/*     */     } else {
/*     */       try {
/* 426 */         connect b = new connect();
/* 427 */         Connection connb = b.getConnection();
/* 428 */         Statement stmtb = connb.createStatement();
/*     */         
/* 430 */         String sql = "UPDATE product SET name = '" + get_name + "', link = '" + get_link + "',action = '" + get_action + "', click_qc = '" + click + "'  WHERE id=" + id;
/* 431 */         stmtb.executeUpdate(sql);
/*     */         
/* 433 */         DefaultTableModel model = (DefaultTableModel)this.tbproduct.getModel();
/* 434 */         model.getDataVector().removeAllElements();
/* 435 */         revalidate();
/* 436 */         Show_Product_Table();
/* 437 */         connb.close();
/* 438 */         this.link_website.setText("");
/* 439 */         this.name_product.setText("");
/* 440 */       } catch (Exception exception) {}
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
/*     */ 
/*     */   
/*     */   public static void main(String[] args) {
/*     */     try {
/* 457 */       for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
/* 458 */         if ("Nimbus".equals(info.getName())) {
/* 459 */           UIManager.setLookAndFeel(info.getClassName());
/*     */           break;
/*     */         } 
/*     */       } 
/* 463 */     } catch (ClassNotFoundException ex) {
/* 464 */       Logger.getLogger(ProductF.class.getName()).log(Level.SEVERE, (String)null, ex);
/* 465 */     } catch (InstantiationException ex) {
/* 466 */       Logger.getLogger(ProductF.class.getName()).log(Level.SEVERE, (String)null, ex);
/* 467 */     } catch (IllegalAccessException ex) {
/* 468 */       Logger.getLogger(ProductF.class.getName()).log(Level.SEVERE, (String)null, ex);
/* 469 */     } catch (UnsupportedLookAndFeelException ex) {
/* 470 */       Logger.getLogger(ProductF.class.getName()).log(Level.SEVERE, (String)null, ex);
/*     */     } 
/*     */   }
/*     */ }


/* Location:              D:\googleads\googleads.jar!\democlick\ProductF.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */