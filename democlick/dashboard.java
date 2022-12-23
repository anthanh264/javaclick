/*      */ package democlick;
/*      */ 
/*      */ import browser.ChromeDriver.UpdateChomeDriver;
/*      */ import java.awt.Color;
/*      */ import java.awt.EventQueue;
/*      */ import java.awt.Font;
/*      */ import java.awt.GraphicsDevice;
/*      */ import java.awt.GraphicsEnvironment;
/*      */ import java.awt.Robot;
/*      */ import java.awt.Toolkit;
/*      */ import java.awt.event.ActionEvent;
/*      */ import java.awt.event.ActionListener;
/*      */ import java.awt.event.MouseAdapter;
/*      */ import java.awt.event.MouseEvent;
/*      */ import java.io.BufferedReader;
/*      */ import java.io.FileWriter;
/*      */ import java.io.IOException;
/*      */ import java.io.InputStreamReader;
/*      */ import java.net.URL;
/*      */ import java.net.URLConnection;
/*      */ import java.sql.Connection;
/*      */ import java.sql.ResultSet;
/*      */ import java.sql.Statement;
/*      */ import java.text.SimpleDateFormat;
/*      */ import java.time.LocalDateTime;
/*      */ import java.time.format.DateTimeFormatter;
/*      */ import java.util.ArrayList;
/*      */ import java.util.Date;
/*      */ import java.util.HashMap;
/*      */ import java.util.List;
/*      */ import java.util.Map;
/*      */ import java.util.Random;
/*      */ import java.util.Scanner;
/*      */ import java.util.concurrent.TimeUnit;
/*      */ import java.util.logging.Level;
/*      */ import java.util.logging.Logger;
/*      */ import javax.swing.BorderFactory;
/*      */ import javax.swing.ButtonGroup;
/*      */ import javax.swing.GroupLayout;
/*      */ import javax.swing.ImageIcon;
/*      */ import javax.swing.JButton;
/*      */ import javax.swing.JCheckBox;
/*      */ import javax.swing.JComboBox;
/*      */ import javax.swing.JEditorPane;
/*      */ import javax.swing.JFrame;
/*      */ import javax.swing.JLabel;
/*      */ import javax.swing.JOptionPane;
/*      */ import javax.swing.JPanel;
/*      */ import javax.swing.JRadioButton;
/*      */ import javax.swing.JScrollPane;
/*      */ import javax.swing.JTable;
/*      */ import javax.swing.JTextArea;
/*      */ import javax.swing.JTextField;
/*      */ import javax.swing.JToggleButton;
/*      */ import javax.swing.LayoutStyle;
/*      */ import javax.swing.UIManager;
/*      */ import javax.swing.UnsupportedLookAndFeelException;
/*      */ import javax.swing.table.DefaultTableModel;
/*      */ import javax.swing.table.TableModel;
/*      */ import org.openqa.selenium.By;
/*      */ import org.openqa.selenium.Capabilities;
/*      */ import org.openqa.selenium.JavascriptExecutor;
/*      */ import org.openqa.selenium.Keys;
/*      */ import org.openqa.selenium.Proxy;
/*      */ import org.openqa.selenium.WebDriver;
/*      */ import org.openqa.selenium.WebElement;
/*      */ import org.openqa.selenium.chrome.ChromeDriver;
/*      */ import org.openqa.selenium.chrome.ChromeOptions;
/*      */ import org.openqa.selenium.remote.DesiredCapabilities;
/*      */ 
/*      */ 
/*      */ 
/*      */ public class dashboard
/*      */   extends JFrame
/*      */ {
/*      */   public dashboard() {
/*   77 */     initComponents();
/*   78 */     setResizable(false);
/*   79 */     Show_Product_Table();
/*   80 */     this.lb_phone.setText(phone);
/*   81 */     this.lb_date.setText(date_active);
/*   82 */     setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("logo.png")));
/*   83 */     setTitle("HỆ THỐNG SEO GOOGLE TOP 1 - CLICK ADS");
/*   84 */     Show_Combox();
/*      */   }
/*      */ 
/*      */   
/*   88 */   private static WebDriver driver = null; private static String user_id; private static String date_active; private static String date; private static String result; private static String phone; private static String money; private Robot robot; private Runtime runtime; private Click autoClick; private ButtonGroup buttonGroup1; private ButtonGroup buttonGroup2; private ButtonGroup buttonGroup3; private ButtonGroup buttonGroup4; private ButtonGroup buttonGroup5; private JRadioButton dcom; private JRadioButton device_mobile; private JRadioButton device_pc; private JRadioButton device_random; private JButton jButton1; private JButton jButton2; private JButton jButton4; private JButton jButton5; private JButton jButton6; private JEditorPane jEditorPane1; private JLabel jLabel1; private JLabel jLabel10; private JLabel jLabel11;
/*      */   private JLabel jLabel12;
/*      */   private JLabel jLabel13;
/*      */   private JLabel jLabel14;
/*      */   private JLabel jLabel16;
/*      */   private JLabel jLabel17;
/*      */   private JLabel jLabel18;
/*      */   private JLabel jLabel19;
/*      */   private JLabel jLabel2;
/*      */   private JLabel jLabel3;
/*      */   
/*      */   public void Show_Combox() {
/*      */     try {
/*  101 */       connect a = new connect();
/*  102 */       Connection conn = a.getConnection();
/*  103 */       Statement stmt = conn.createStatement();
/*  104 */       ResultSet rs = stmt.executeQuery("select name as name,id as id,click_qc as click_qc from product WHERE product.user_id=" + user_id + " ORDER BY product.id DESC");
/*      */       
/*  106 */       while (rs.next()) {
/*  107 */         String Click_qc = "Seo";
/*  108 */         if (Integer.parseInt(rs.getString("click_qc")) == 1) {
/*  109 */           Click_qc = "Ads";
/*      */         }
/*      */         
/*  112 */         this.link.addItem(rs.getString("id") + "|" + rs.getString("name") + "|" + Click_qc);
/*      */       } 
/*  114 */       conn.close();
/*  115 */     } catch (Exception exception) {}
/*      */   }
/*      */   private JLabel jLabel4; private JLabel jLabel5; private JLabel jLabel6; private JLabel jLabel7; private JLabel jLabel8; private JLabel jLabel9; private JPanel jPanel1; private JPanel jPanel2; private JPanel jPanel3; private JPanel jPanel4;
/*      */   private JPanel jPanel5;
/*      */   private JPanel jPanel6;
/*      */   private JScrollPane jScrollPane1;
/*      */   private JScrollPane jScrollPane3;
/*      */   private JScrollPane jScrollPane4;
/*      */   private JScrollPane jScrollPane5;
/*      */   private JTextField jTextField1;
/*      */   private JTextField jTextField2;
/*      */   
/*      */   private void initComponents() {
/*  128 */     this.jTextField1 = new JTextField();
/*  129 */     this.buttonGroup1 = new ButtonGroup();
/*  130 */     this.buttonGroup2 = new ButtonGroup();
/*  131 */     this.buttonGroup3 = new ButtonGroup();
/*  132 */     this.jScrollPane4 = new JScrollPane();
/*  133 */     this.jEditorPane1 = new JEditorPane();
/*  134 */     this.buttonGroup4 = new ButtonGroup();
/*  135 */     this.buttonGroup5 = new ButtonGroup();
/*  136 */     this.jToggleButton1 = new JToggleButton();
/*  137 */     this.jPanel2 = new JPanel();
/*  138 */     this.jPanel4 = new JPanel();
/*  139 */     this.jPanel5 = new JPanel();
/*  140 */     this.jLabel5 = new JLabel();
/*  141 */     this.jButton5 = new JButton();
/*  142 */     this.tinsoftproxy = new JRadioButton();
/*  143 */     this.jLabel13 = new JLabel();
/*  144 */     this.vt_proxy = new JTextField();
/*  145 */     this.luong = new JTextField();
/*  146 */     this.jLabel19 = new JLabel();
/*  147 */     this.jScrollPane5 = new JScrollPane();
/*  148 */     this.proxy = new JTextArea();
/*  149 */     this.dcom = new JRadioButton();
/*  150 */     this.jLabel6 = new JLabel();
/*  151 */     this.jTextField2 = new JTextField();
/*  152 */     this.jButton6 = new JButton();
/*  153 */     this.jPanel3 = new JPanel();
/*  154 */     this.jLabel3 = new JLabel();
/*  155 */     this.jScrollPane1 = new JScrollPane();
/*  156 */     this.tbproduct = new JTable();
/*  157 */     this.jLabel1 = new JLabel();
/*  158 */     this.jScrollPane3 = new JScrollPane();
/*  159 */     this.key = new JTextArea();
/*  160 */     this.jLabel2 = new JLabel();
/*  161 */     this.jLabel4 = new JLabel();
/*  162 */     this.jButton4 = new JButton();
/*  163 */     this.jButton2 = new JButton();
/*  164 */     this.jButton1 = new JButton();
/*  165 */     this.jLabel18 = new JLabel();
/*  166 */     this.link = new JComboBox<>();
/*  167 */     this.jPanel1 = new JPanel();
/*  168 */     this.jLabel10 = new JLabel();
/*  169 */     this.lb_phone = new JLabel();
/*  170 */     this.jLabel12 = new JLabel();
/*  171 */     this.lb_date = new JLabel();
/*  172 */     this.jLabel14 = new JLabel();
/*  173 */     this.jLabel16 = new JLabel();
/*  174 */     this.jPanel6 = new JPanel();
/*  175 */     this.load_image = new JCheckBox();
/*  176 */     this.run_underground = new JCheckBox();
/*  177 */     this.jLabel7 = new JLabel();
/*  178 */     this.number_search = new JTextField();
/*  179 */     this.device_mobile = new JRadioButton();
/*  180 */     this.device_pc = new JRadioButton();
/*  181 */     this.device_random = new JRadioButton();
/*  182 */     this.jLabel8 = new JLabel();
/*  183 */     this.search_google_com = new JRadioButton();
/*  184 */     this.search_google_com_vn = new JRadioButton();
/*  185 */     this.search_random = new JRadioButton();
/*  186 */     this.jLabel9 = new JLabel();
/*  187 */     this.jLabel11 = new JLabel();
/*  188 */     this.time_onsite_start = new JTextField();
/*  189 */     this.jLabel17 = new JLabel();
/*  190 */     this.time_onsite_stop = new JTextField();
/*      */     
/*  192 */     this.jTextField1.setText("jTextField1");
/*      */     
/*  194 */     this.jScrollPane4.setViewportView(this.jEditorPane1);
/*      */     
/*  196 */     this.jToggleButton1.setText("jToggleButton1");
/*      */     
/*  198 */     setDefaultCloseOperation(3);
/*      */     
/*  200 */     this.jPanel4.setBackground(new Color(204, 204, 204));
/*      */     
/*  202 */     this.jPanel5.setBackground(new Color(255, 255, 255));
/*      */     
/*  204 */     this.jLabel5.setText("Proxy");
/*      */     
/*  206 */     this.jButton5.setBackground(new Color(245, 61, 45));
/*  207 */     this.jButton5.setFont(new Font("Tahoma", 1, 18));
/*  208 */     this.jButton5.setForeground(new Color(255, 255, 255));
/*  209 */     this.jButton5.setText("Google Top 1");
/*  210 */     this.jButton5.addActionListener(new ActionListener() {
/*      */           public void actionPerformed(ActionEvent evt) {
/*  212 */             dashboard.this.jButton5ActionPerformed(evt);
/*      */           }
/*      */         });
/*      */     
/*  216 */     this.buttonGroup5.add(this.tinsoftproxy);
/*  217 */     this.tinsoftproxy.setSelected(true);
/*  218 */     this.tinsoftproxy.setText("Tinsoftproxy");
/*      */     
/*  220 */     this.jLabel13.setText("Vị Trí");
/*      */     
/*  222 */     this.vt_proxy.setText("1");
/*      */     
/*  224 */     this.luong.setText("1");
/*      */     
/*  226 */     this.jLabel19.setText("Số Luồng");
/*      */     
/*  228 */     this.proxy.setColumns(20);
/*  229 */     this.proxy.setRows(5);
/*  230 */     this.jScrollPane5.setViewportView(this.proxy);
/*      */     
/*  232 */     this.buttonGroup5.add(this.dcom);
/*  233 */     this.dcom.setText("Dcom");
/*      */     
/*  235 */     this.jLabel6.setText("Time restar dcom");
/*      */     
/*  237 */     this.jTextField2.setText("15");
/*      */     
/*  239 */     this.jButton6.setBackground(new Color(255, 255, 255));
/*  240 */     this.jButton6.setFont(new Font("Tahoma", 1, 14));
/*  241 */     this.jButton6.setForeground(new Color(245, 61, 45));
/*  242 */     this.jButton6.setText("Lịch Sử");
/*  243 */     this.jButton6.addActionListener(new ActionListener() {
/*      */           public void actionPerformed(ActionEvent evt) {
/*  245 */             dashboard.this.jButton6ActionPerformed(evt);
/*      */           }
/*      */         });
/*      */     
/*  249 */     GroupLayout jPanel5Layout = new GroupLayout(this.jPanel5);
/*  250 */     this.jPanel5.setLayout(jPanel5Layout);
/*  251 */     jPanel5Layout.setHorizontalGroup(jPanel5Layout
/*  252 */         .createParallelGroup(GroupLayout.Alignment.LEADING)
/*  253 */         .addGroup(jPanel5Layout.createSequentialGroup()
/*  254 */           .addGap(21, 21, 21)
/*  255 */           .addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/*  256 */             .addGroup(GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
/*  257 */               .addComponent(this.jLabel5)
/*  258 */               .addGap(18, 18, 18)
/*  259 */               .addComponent(this.jScrollPane5))
/*  260 */             .addGroup(jPanel5Layout.createSequentialGroup()
/*  261 */               .addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
/*  262 */                 .addComponent(this.jButton5, -1, -1, 32767)
/*  263 */                 .addGroup(jPanel5Layout.createSequentialGroup()
/*  264 */                   .addComponent(this.jLabel19)
/*  265 */                   .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
/*  266 */                   .addComponent(this.luong, -2, 25, -2)
/*  267 */                   .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
/*  268 */                   .addComponent(this.tinsoftproxy)
/*  269 */                   .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
/*  270 */                   .addComponent(this.jLabel13)
/*  271 */                   .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
/*  272 */                   .addComponent(this.vt_proxy, -2, 25, -2)))
/*  273 */               .addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/*  274 */                 .addGroup(jPanel5Layout.createSequentialGroup()
/*  275 */                   .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
/*  276 */                   .addComponent(this.dcom)
/*  277 */                   .addGap(20, 20, 20)
/*  278 */                   .addComponent(this.jLabel6)
/*  279 */                   .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
/*  280 */                   .addComponent(this.jTextField2, -2, 45, -2)
/*  281 */                   .addGap(0, 0, 32767))
/*  282 */                 .addGroup(GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
/*  283 */                   .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767)
/*  284 */                   .addComponent(this.jButton6, -2, 193, -2)
/*  285 */                   .addGap(0, 0, 32767)))))
/*  286 */           .addContainerGap()));
/*      */     
/*  288 */     jPanel5Layout.setVerticalGroup(jPanel5Layout
/*  289 */         .createParallelGroup(GroupLayout.Alignment.LEADING)
/*  290 */         .addGroup(jPanel5Layout.createSequentialGroup()
/*  291 */           .addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/*  292 */             .addGroup(jPanel5Layout.createSequentialGroup()
/*  293 */               .addContainerGap()
/*  294 */               .addComponent(this.jScrollPane5, -2, 122, -2))
/*  295 */             .addGroup(jPanel5Layout.createSequentialGroup()
/*  296 */               .addGap(69, 69, 69)
/*  297 */               .addComponent(this.jLabel5)))
/*  298 */           .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 31, 32767)
/*  299 */           .addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
/*  300 */             .addComponent(this.jLabel19)
/*  301 */             .addComponent(this.luong, -2, -1, -2)
/*  302 */             .addComponent(this.tinsoftproxy)
/*  303 */             .addComponent(this.jLabel13)
/*  304 */             .addComponent(this.vt_proxy, -2, -1, -2)
/*  305 */             .addComponent(this.dcom)
/*  306 */             .addComponent(this.jLabel6)
/*  307 */             .addComponent(this.jTextField2, -2, -1, -2))
/*  308 */           .addGap(40, 40, 40)
/*  309 */           .addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
/*  310 */             .addComponent(this.jButton5, -1, 48, 32767)
/*  311 */             .addComponent(this.jButton6, -1, -1, 32767))
/*  312 */           .addContainerGap()));
/*      */ 
/*      */     
/*  315 */     GroupLayout jPanel4Layout = new GroupLayout(this.jPanel4);
/*  316 */     this.jPanel4.setLayout(jPanel4Layout);
/*  317 */     jPanel4Layout.setHorizontalGroup(jPanel4Layout
/*  318 */         .createParallelGroup(GroupLayout.Alignment.LEADING)
/*  319 */         .addComponent(this.jPanel5, -1, -1, 32767));
/*      */     
/*  321 */     jPanel4Layout.setVerticalGroup(jPanel4Layout
/*  322 */         .createParallelGroup(GroupLayout.Alignment.LEADING)
/*  323 */         .addGroup(GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
/*  324 */           .addContainerGap()
/*  325 */           .addComponent(this.jPanel5, -1, -1, 32767)));
/*      */ 
/*      */     
/*  328 */     GroupLayout jPanel2Layout = new GroupLayout(this.jPanel2);
/*  329 */     this.jPanel2.setLayout(jPanel2Layout);
/*  330 */     jPanel2Layout.setHorizontalGroup(jPanel2Layout
/*  331 */         .createParallelGroup(GroupLayout.Alignment.LEADING)
/*  332 */         .addComponent(this.jPanel4, -1, -1, 32767));
/*      */     
/*  334 */     jPanel2Layout.setVerticalGroup(jPanel2Layout
/*  335 */         .createParallelGroup(GroupLayout.Alignment.LEADING)
/*  336 */         .addComponent(this.jPanel4, -2, -1, -2));
/*      */ 
/*      */     
/*  339 */     this.jPanel3.setBackground(new Color(255, 255, 255));
/*      */     
/*  341 */     this.jLabel3.setBackground(new Color(255, 255, 255));
/*  342 */     this.jLabel3.setIcon(new ImageIcon(getClass().getResource("/democlick/image/google.png")));
/*      */     
/*  344 */     this.tbproduct.setModel(new DefaultTableModel(new Object[0][], (Object[])new String[] { "id", "Từ Khoá", "Chiến Dịch", "Quảng Cáo" }));
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  352 */     this.tbproduct.addMouseListener(new MouseAdapter() {
/*      */           public void mouseClicked(MouseEvent evt) {
/*  354 */             dashboard.this.tbproductMouseClicked(evt);
/*      */           }
/*      */         });
/*  357 */     this.jScrollPane1.setViewportView(this.tbproduct);
/*      */     
/*  359 */     this.jLabel1.setFont(new Font("Tahoma", 1, 18));
/*  360 */     this.jLabel1.setForeground(new Color(245, 61, 45));
/*  361 */     this.jLabel1.setText("Danh Sách Chiến Dịch");
/*      */     
/*  363 */     this.key.setColumns(20);
/*  364 */     this.key.setRows(5);
/*  365 */     this.jScrollPane3.setViewportView(this.key);
/*      */     
/*  367 */     this.jLabel2.setText("Website");
/*      */     
/*  369 */     this.jLabel4.setText("Từ Khoá");
/*      */     
/*  371 */     this.jButton4.setBackground(new Color(255, 255, 255));
/*  372 */     this.jButton4.setFont(new Font("Tahoma", 1, 14));
/*  373 */     this.jButton4.setForeground(new Color(245, 61, 45));
/*  374 */     this.jButton4.setText("Thêm Từ Khoá");
/*  375 */     this.jButton4.addActionListener(new ActionListener() {
/*      */           public void actionPerformed(ActionEvent evt) {
/*  377 */             dashboard.this.jButton4ActionPerformed(evt);
/*      */           }
/*      */         });
/*      */     
/*  381 */     this.jButton2.setBackground(new Color(255, 255, 255));
/*  382 */     this.jButton2.setFont(new Font("Tahoma", 1, 14));
/*  383 */     this.jButton2.setForeground(new Color(245, 61, 45));
/*  384 */     this.jButton2.setText("Xoá Từ Khoá");
/*  385 */     this.jButton2.addActionListener(new ActionListener() {
/*      */           public void actionPerformed(ActionEvent evt) {
/*  387 */             dashboard.this.jButton2ActionPerformed(evt);
/*      */           }
/*      */         });
/*      */     
/*  391 */     this.jButton1.setFont(new Font("Tahoma", 1, 11));
/*  392 */     this.jButton1.setForeground(new Color(245, 61, 45));
/*  393 */     this.jButton1.setText("Sửa Chiến Dịch");
/*  394 */     this.jButton1.addActionListener(new ActionListener() {
/*      */           public void actionPerformed(ActionEvent evt) {
/*  396 */             dashboard.this.jButton1ActionPerformed(evt);
/*      */           }
/*      */         });
/*      */     
/*  400 */     this.link.addActionListener(new ActionListener() {
/*      */           public void actionPerformed(ActionEvent evt) {
/*  402 */             dashboard.this.linkActionPerformed(evt);
/*      */           }
/*      */         });
/*      */     
/*  406 */     GroupLayout jPanel3Layout = new GroupLayout(this.jPanel3);
/*  407 */     this.jPanel3.setLayout(jPanel3Layout);
/*  408 */     jPanel3Layout.setHorizontalGroup(jPanel3Layout
/*  409 */         .createParallelGroup(GroupLayout.Alignment.LEADING)
/*  410 */         .addGroup(jPanel3Layout.createSequentialGroup()
/*  411 */           .addContainerGap()
/*  412 */           .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/*  413 */             .addGroup(jPanel3Layout.createSequentialGroup()
/*  414 */               .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
/*  415 */                 .addComponent(this.jScrollPane3, GroupLayout.Alignment.LEADING)
/*  416 */                 .addComponent(this.jScrollPane1, GroupLayout.Alignment.LEADING, -2, 0, 32767)
/*  417 */                 .addGroup(jPanel3Layout.createSequentialGroup()
/*  418 */                   .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/*  419 */                     .addComponent(this.jLabel4)
/*  420 */                     .addGroup(jPanel3Layout.createSequentialGroup()
/*  421 */                       .addComponent(this.jLabel2)
/*  422 */                       .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
/*  423 */                       .addComponent(this.jLabel18, -2, 0, -2)))
/*  424 */                   .addGap(366, 366, 366))
/*  425 */                 .addGroup(GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
/*  426 */                   .addComponent(this.link, -2, 288, -2)
/*  427 */                   .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
/*  428 */                   .addComponent(this.jButton1)))
/*  429 */               .addContainerGap(-1, 32767))
/*  430 */             .addGroup(GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
/*  431 */               .addGap(0, 0, 32767)
/*  432 */               .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/*  433 */                 .addGroup(GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
/*  434 */                   .addComponent(this.jLabel3)
/*  435 */                   .addGap(75, 75, 75))
/*  436 */                 .addGroup(GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
/*  437 */                   .addComponent(this.jLabel1)
/*  438 */                   .addGap(103, 103, 103))))))
/*  439 */         .addGroup(GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
/*  440 */           .addGap(41, 41, 41)
/*  441 */           .addComponent(this.jButton4)
/*  442 */           .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767)
/*  443 */           .addComponent(this.jButton2, -2, 135, -2)
/*  444 */           .addGap(63, 63, 63)));
/*      */     
/*  446 */     jPanel3Layout.setVerticalGroup(jPanel3Layout
/*  447 */         .createParallelGroup(GroupLayout.Alignment.LEADING)
/*  448 */         .addGroup(jPanel3Layout.createSequentialGroup()
/*  449 */           .addGap(12, 12, 12)
/*  450 */           .addComponent(this.jLabel3)
/*  451 */           .addGap(13, 13, 13)
/*  452 */           .addComponent(this.jLabel1)
/*  453 */           .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
/*  454 */           .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
/*  455 */             .addGroup(jPanel3Layout.createSequentialGroup()
/*  456 */               .addComponent(this.jScrollPane1, -2, 129, -2)
/*  457 */               .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
/*  458 */               .addComponent(this.jLabel2))
/*  459 */             .addGroup(jPanel3Layout.createSequentialGroup()
/*  460 */               .addComponent(this.jLabel18, -2, 0, -2)
/*  461 */               .addGap(14, 14, 14)))
/*  462 */           .addGap(7, 7, 7)
/*  463 */           .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
/*  464 */             .addComponent(this.jButton1, -2, 34, -2)
/*  465 */             .addComponent(this.link, -2, 34, -2))
/*  466 */           .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767)
/*  467 */           .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/*  468 */             .addGroup(GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
/*  469 */               .addComponent(this.jLabel4)
/*  470 */               .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
/*  471 */               .addComponent(this.jScrollPane3, -2, 112, -2)
/*  472 */               .addGap(77, 77, 77))
/*  473 */             .addGroup(GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
/*  474 */               .addComponent(this.jButton2, -2, 36, -2)
/*  475 */               .addComponent(this.jButton4, -2, 34, -2)))
/*  476 */           .addGap(13, 13, 13)));
/*      */ 
/*      */     
/*  479 */     this.jPanel1.setBackground(new Color(255, 255, 255));
/*      */     
/*  481 */     this.jLabel10.setFont(new Font("Tahoma", 1, 18));
/*  482 */     this.jLabel10.setForeground(new Color(245, 61, 45));
/*  483 */     this.jLabel10.setText("Tài Khoản:");
/*      */     
/*  485 */     this.lb_phone.setFont(new Font("Tahoma", 1, 18));
/*  486 */     this.lb_phone.setForeground(new Color(245, 61, 45));
/*  487 */     this.lb_phone.setText("0968214802");
/*      */     
/*  489 */     this.jLabel12.setFont(new Font("Tahoma", 1, 18));
/*  490 */     this.jLabel12.setForeground(new Color(245, 61, 45));
/*  491 */     this.jLabel12.setText("Hạn: ");
/*      */     
/*  493 */     this.lb_date.setFont(new Font("Tahoma", 1, 18));
/*  494 */     this.lb_date.setForeground(new Color(245, 61, 45));
/*  495 */     this.lb_date.setText("0");
/*      */     
/*  497 */     this.jLabel14.setFont(new Font("Tahoma", 1, 18));
/*  498 */     this.jLabel14.setForeground(new Color(245, 61, 45));
/*  499 */     this.jLabel14.setText("Ngày");
/*      */     
/*  501 */     this.jLabel16.setFont(new Font("Tahoma", 1, 13));
/*  502 */     this.jLabel16.setForeground(new Color(245, 61, 45));
/*      */     
/*  504 */     GroupLayout jPanel1Layout = new GroupLayout(this.jPanel1);
/*  505 */     this.jPanel1.setLayout(jPanel1Layout);
/*  506 */     jPanel1Layout.setHorizontalGroup(jPanel1Layout
/*  507 */         .createParallelGroup(GroupLayout.Alignment.LEADING)
/*  508 */         .addGroup(jPanel1Layout.createSequentialGroup()
/*  509 */           .addGap(24, 24, 24)
/*  510 */           .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/*  511 */             .addGroup(jPanel1Layout.createSequentialGroup()
/*  512 */               .addGap(172, 172, 172)
/*  513 */               .addComponent(this.jLabel16))
/*  514 */             .addGroup(jPanel1Layout.createSequentialGroup()
/*  515 */               .addComponent(this.jLabel10)
/*  516 */               .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
/*  517 */               .addComponent(this.lb_phone)
/*  518 */               .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
/*  519 */               .addComponent(this.jLabel12)
/*  520 */               .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
/*  521 */               .addComponent(this.lb_date)
/*  522 */               .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
/*  523 */               .addComponent(this.jLabel14)))
/*  524 */           .addContainerGap(-1, 32767)));
/*      */     
/*  526 */     jPanel1Layout.setVerticalGroup(jPanel1Layout
/*  527 */         .createParallelGroup(GroupLayout.Alignment.LEADING)
/*  528 */         .addGroup(jPanel1Layout.createSequentialGroup()
/*  529 */           .addGap(26, 26, 26)
/*  530 */           .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
/*  531 */             .addComponent(this.jLabel10)
/*  532 */             .addComponent(this.lb_phone)
/*  533 */             .addComponent(this.jLabel12)
/*  534 */             .addComponent(this.lb_date)
/*  535 */             .addComponent(this.jLabel14))
/*  536 */           .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
/*  537 */           .addComponent(this.jLabel16)
/*  538 */           .addContainerGap(71, 32767)));
/*      */ 
/*      */     
/*  541 */     this.jPanel6.setBackground(new Color(255, 255, 255));
/*  542 */     this.jPanel6.setBorder(BorderFactory.createTitledBorder("Tính Năng Cơ Bản"));
/*      */     
/*  544 */     this.load_image.setText("Không Load Ảnh");
/*      */     
/*  546 */     this.run_underground.setText("Chạy Ngầm");
/*      */     
/*  548 */     this.jLabel7.setText("Tìm Tới Trang");
/*      */     
/*  550 */     this.number_search.setText("5");
/*      */     
/*  552 */     this.buttonGroup2.add(this.device_mobile);
/*  553 */     this.device_mobile.setSelected(true);
/*  554 */     this.device_mobile.setText("Di Dộng");
/*      */     
/*  556 */     this.buttonGroup2.add(this.device_pc);
/*  557 */     this.device_pc.setText("Máy Tính");
/*      */     
/*  559 */     this.buttonGroup2.add(this.device_random);
/*  560 */     this.device_random.setText("Random");
/*      */     
/*  562 */     this.jLabel8.setText("Chọn Thiết Bị Chay");
/*      */     
/*  564 */     this.buttonGroup4.add(this.search_google_com);
/*  565 */     this.search_google_com.setText("google.com");
/*      */     
/*  567 */     this.buttonGroup4.add(this.search_google_com_vn);
/*  568 */     this.search_google_com_vn.setText("google.com.vn");
/*      */     
/*  570 */     this.buttonGroup4.add(this.search_random);
/*  571 */     this.search_random.setSelected(true);
/*  572 */     this.search_random.setText("Random");
/*      */     
/*  574 */     this.jLabel9.setText("Trang Tìm Kiếm");
/*      */     
/*  576 */     this.jLabel11.setText("Time Onsite");
/*      */     
/*  578 */     this.time_onsite_start.setText("30");
/*      */     
/*  580 */     this.jLabel17.setText("đến");
/*      */     
/*  582 */     this.time_onsite_stop.setText("60");
/*      */     
/*  584 */     GroupLayout jPanel6Layout = new GroupLayout(this.jPanel6);
/*  585 */     this.jPanel6.setLayout(jPanel6Layout);
/*  586 */     jPanel6Layout.setHorizontalGroup(jPanel6Layout
/*  587 */         .createParallelGroup(GroupLayout.Alignment.LEADING)
/*  588 */         .addGroup(jPanel6Layout.createSequentialGroup()
/*  589 */           .addGroup(jPanel6Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/*  590 */             .addGroup(jPanel6Layout.createSequentialGroup()
/*  591 */               .addComponent(this.load_image)
/*  592 */               .addGap(6, 6, 6)
/*  593 */               .addComponent(this.run_underground)
/*  594 */               .addGap(4, 4, 4)
/*  595 */               .addComponent(this.jLabel7)
/*  596 */               .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
/*  597 */               .addComponent(this.number_search, -2, 25, -2)
/*  598 */               .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
/*  599 */               .addComponent(this.jLabel11)
/*  600 */               .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
/*  601 */               .addComponent(this.time_onsite_start, -2, 33, -2)
/*  602 */               .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
/*  603 */               .addComponent(this.jLabel17)
/*  604 */               .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
/*  605 */               .addComponent(this.time_onsite_stop, -2, 31, -2))
/*  606 */             .addGroup(jPanel6Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
/*  607 */               .addGroup(jPanel6Layout.createSequentialGroup()
/*  608 */                 .addComponent(this.jLabel8)
/*  609 */                 .addGap(18, 18, 18)
/*  610 */                 .addComponent(this.device_mobile)
/*  611 */                 .addGap(18, 18, 18)
/*  612 */                 .addComponent(this.device_pc)
/*  613 */                 .addGap(18, 18, 18)
/*  614 */                 .addComponent(this.device_random))
/*  615 */               .addGroup(GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
/*  616 */                 .addComponent(this.jLabel9)
/*  617 */                 .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
/*  618 */                 .addComponent(this.search_google_com)
/*  619 */                 .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767)
/*  620 */                 .addComponent(this.search_google_com_vn)
/*  621 */                 .addGap(10, 10, 10)
/*  622 */                 .addComponent(this.search_random))))
/*  623 */           .addContainerGap(-1, 32767)));
/*      */     
/*  625 */     jPanel6Layout.setVerticalGroup(jPanel6Layout
/*  626 */         .createParallelGroup(GroupLayout.Alignment.LEADING)
/*  627 */         .addGroup(jPanel6Layout.createSequentialGroup()
/*  628 */           .addContainerGap()
/*  629 */           .addGroup(jPanel6Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/*  630 */             .addGroup(jPanel6Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
/*  631 */               .addComponent(this.jLabel11)
/*  632 */               .addComponent(this.time_onsite_start, -2, -1, -2)
/*  633 */               .addComponent(this.jLabel17)
/*  634 */               .addComponent(this.time_onsite_stop, -2, -1, -2))
/*  635 */             .addGroup(jPanel6Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
/*  636 */               .addComponent(this.load_image)
/*  637 */               .addComponent(this.run_underground)
/*  638 */               .addComponent(this.jLabel7)
/*  639 */               .addComponent(this.number_search, -2, -1, -2)))
/*  640 */           .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
/*  641 */           .addGroup(jPanel6Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
/*  642 */             .addComponent(this.device_mobile)
/*  643 */             .addComponent(this.device_pc)
/*  644 */             .addComponent(this.device_random)
/*  645 */             .addComponent(this.jLabel8))
/*  646 */           .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
/*  647 */           .addGroup(jPanel6Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
/*  648 */             .addComponent(this.search_google_com)
/*  649 */             .addComponent(this.search_google_com_vn)
/*  650 */             .addComponent(this.search_random)
/*  651 */             .addComponent(this.jLabel9))
/*  652 */           .addContainerGap(13, 32767)));
/*      */ 
/*      */     
/*  655 */     GroupLayout layout = new GroupLayout(getContentPane());
/*  656 */     getContentPane().setLayout(layout);
/*  657 */     layout.setHorizontalGroup(layout
/*  658 */         .createParallelGroup(GroupLayout.Alignment.LEADING)
/*  659 */         .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
/*  660 */           .addComponent(this.jPanel3, -2, -1, -2)
/*  661 */           .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
/*  662 */           .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
/*  663 */             .addComponent(this.jPanel2, GroupLayout.Alignment.LEADING, -1, -1, 32767)
/*  664 */             .addComponent(this.jPanel1, -1, -1, 32767)
/*  665 */             .addComponent(this.jPanel6, GroupLayout.Alignment.LEADING, -1, -1, 32767))
/*  666 */           .addContainerGap(-1, 32767)));
/*      */     
/*  668 */     layout.setVerticalGroup(layout
/*  669 */         .createParallelGroup(GroupLayout.Alignment.LEADING)
/*  670 */         .addComponent(this.jPanel3, -1, -1, 32767)
/*  671 */         .addGroup(layout.createSequentialGroup()
/*  672 */           .addGap(0, 9, 32767)
/*  673 */           .addComponent(this.jPanel1, -2, -1, -2)
/*  674 */           .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
/*  675 */           .addComponent(this.jPanel6, -2, -1, -2)
/*  676 */           .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
/*  677 */           .addComponent(this.jPanel2, -2, -1, -2)));
/*      */ 
/*      */     
/*  680 */     pack();
/*      */   } private JToggleButton jToggleButton1; private JTextArea key; private JLabel lb_date; private JLabel lb_phone; private JComboBox<String> link; private JCheckBox load_image; private JTextField luong; private JTextField number_search; private JTextArea proxy; private JCheckBox run_underground; private JRadioButton search_google_com; private JRadioButton search_google_com_vn; private JRadioButton search_random; private JTable tbproduct; private JTextField time_onsite_start; private JTextField time_onsite_stop; private JRadioButton tinsoftproxy; private JTextField vt_proxy;
/*      */   public static void disableChromeImages(ChromeOptions options) {
/*  683 */     HashMap<String, Object> images = new HashMap<>();
/*  684 */     images.put("images", Integer.valueOf(2));
/*      */     
/*  686 */     HashMap<String, Object> prefs = new HashMap<>();
/*  687 */     prefs.put("profile.default_content_setting_values", images);
/*      */     
/*  689 */     options.setExperimentalOption("prefs", prefs);
/*      */   }
/*      */ 
/*      */   
/*      */   public static ChromeDriver launchChromeDriver() {
/*  694 */     System.setProperty("webdriver.chrome.driver", "resource/chromedriver.exe");
/*  695 */     DesiredCapabilities capabilities = DesiredCapabilities.chrome();
/*  696 */     capabilities.setCapability("acceptSslCerts", true);
/*      */     
/*  698 */     HashMap<String, String> mobileEmulation = new HashMap<>();
/*  699 */     String deviceName = "Galaxy S5";
/*  700 */     mobileEmulation.put("deviceName", deviceName);
/*  701 */     Map<String, Object> chromeOptions = new HashMap<>();
/*  702 */     chromeOptions.put("mobileEmulation", mobileEmulation);
/*  703 */     capabilities.setCapability("goog:chromeOptions", chromeOptions);
/*      */     
/*  705 */     ChromeDriver driver = new ChromeDriver((Capabilities)capabilities);
/*      */     
/*  707 */     driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);
/*  708 */     driver.manage().timeouts().setScriptTimeout(10L, TimeUnit.SECONDS);
/*  709 */     driver.manage().window().maximize();
/*  710 */     return driver;
/*      */   }
/*      */   
/*      */   public void Show_Ip(String key_work, String ip, String device, String action) {
/*  714 */     System.out.println("thêm vào lho" + key_work);
/*  715 */     System.out.println("thêm vào lho" + ip);
/*  716 */     System.out.println("thêm vào lho" + device);
/*  717 */     System.out.println("thêm vào lho" + action);
/*      */     
/*  719 */     this.proxy.setText("dđ");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void chomer(String key_work, String link_website, String click) {
/*  737 */     String proxy_t = this.proxy.getText();
/*  738 */     System.setProperty("webdriver.chrome.driver", "chromedriver\\chromedriver.exe");
/*      */     
/*  740 */     ChromeOptions options = new ChromeOptions();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  746 */     URLConnection connection = null;
/*  747 */     String getip = null;
/*  748 */     String[] strArrproxy = null;
/*  749 */     String[] strArrip = null;
/*  750 */     String ip = null;
/*  751 */     String device_st = "Máy Tính";
/*  752 */     Random Rand = new Random();
/*  753 */     int device = 1;
/*      */     
/*  755 */     if (this.device_pc.isSelected()) {
/*  756 */       device = 1;
/*      */     }
/*  758 */     if (this.device_mobile.isSelected()) {
/*  759 */       device = 0;
/*      */     }
/*  761 */     if (this.device_random.isSelected()) {
/*  762 */       device = (int)(Math.random() * 2.0D);
/*      */     }
/*      */     
/*  765 */     System.out.println(device);
/*      */     
/*  767 */     if (device == 0) {
/*  768 */       if (Integer.parseInt(money) == 1) {
/*  769 */         Map<String, String> mobileEmulation = new HashMap<>();
/*  770 */         String[] device_list = { "Moto G4", "Galaxy S5", "Pixel 2", "iPhone 5/SE", "iPhone 6/7/8", "iPhone 6/7/8 Plus", "iPhone X", "Surface Duo", "Galaxy Fold", "BlackBerry Z30", "Blackberry PlayBook", "Galaxy Note 3", "LG Optimus L70", "Microsoft Lumia 550", "Microsoft Lumia 950", "Nexus 10", "Nexus 6", "Nexus 5", "Nexus 4", "Nexus 5X", "Nexus 6P", "Nexus 7", "iPhone 4" };
/*      */ 
/*      */ 
/*      */         
/*  774 */         int number_device = Rand.nextInt(device_list.length);
/*  775 */         device_st = device_list[number_device];
/*  776 */         System.out.println("Random Thiêt Bị Mobile: " + device_st);
/*  777 */         mobileEmulation.put("deviceName", "iPhone 4");
/*  778 */         options.setExperimentalOption("mobileEmulation", mobileEmulation);
/*      */       } else {
/*  780 */         device = 1;
/*      */       } 
/*      */     }
/*  783 */     if (this.load_image.isSelected()) {
/*  784 */       disableChromeImages(options);
/*      */     }
/*  786 */     if (proxy_t.equals("")) {
/*  787 */       driver = (WebDriver)new ChromeDriver(options);
/*      */       try {
/*  789 */         connection = (new URL("http://thuocnam.xyz/ip.php")).openConnection();
/*  790 */         Scanner scanner = new Scanner(connection.getInputStream());
/*  791 */         scanner.useDelimiter("\\Z");
/*  792 */         ip = scanner.next();
/*  793 */         scanner.close();
/*  794 */       } catch (Exception ex) {
/*  795 */         ex.printStackTrace();
/*      */       } 
/*      */     } else {
/*  798 */       if (this.tinsoftproxy.isSelected()) {
/*  799 */         String vt_proxy_t = this.vt_proxy.getText();
/*  800 */         String[] strArrayvtproxy = vt_proxy_t.split("\\|");
/*  801 */         int number_proxy = Rand.nextInt(strArrayvtproxy.length);
/*      */         try {
/*  803 */           connection = (new URL("https://proxy.tinsoftsv.com/api/changeProxy.php?key=" + proxy_t + "&location=" + strArrayvtproxy[number_proxy])).openConnection();
/*  804 */           Scanner scanner = new Scanner(connection.getInputStream());
/*  805 */           scanner.useDelimiter("\\Z");
/*  806 */           getip = scanner.next();
/*  807 */           System.out.println(getip);
/*  808 */           if (getip.contains("false")) {
/*  809 */             System.out.println("lấy ip cũ");
/*  810 */             connection = (new URL("http://proxy.tinsoftsv.com/api/getProxy.php?key=" + proxy_t)).openConnection();
/*  811 */             Scanner scannernill = new Scanner(connection.getInputStream());
/*  812 */             scannernill.useDelimiter("\\Z");
/*  813 */             getip = scannernill.next();
/*  814 */             scannernill.close();
/*      */           } 
/*  816 */           strArrproxy = getip.split("\\,");
/*  817 */           System.out.println(strArrproxy[1]);
/*  818 */           strArrip = strArrproxy[1].split("\\:");
/*  819 */           System.out.println(strArrip[1] + ":" + strArrip[2]);
/*  820 */           String string_ip = strArrip[1] + ":" + strArrip[2];
/*  821 */           String ip_repla = string_ip.replace('"', ' ');
/*  822 */           ip = ip_repla.trim();
/*  823 */           System.out.println("Ip" + ip);
/*  824 */           scanner.close();
/*  825 */         } catch (Exception ex) {
/*  826 */           ex.printStackTrace();
/*      */         }
/*      */       
/*      */       } else {
/*      */         
/*  831 */         String delimiter = "\\n";
/*  832 */         String[] temp = proxy_t.split(delimiter);
/*  833 */         int rnd = (new Random()).nextInt(temp.length);
/*  834 */         ip = temp[rnd];
/*      */       } 
/*  836 */       Proxy proxy = new Proxy();
/*  837 */       proxy.setHttpProxy(ip);
/*  838 */       proxy.setSslProxy(ip);
/*  839 */       options.setCapability("proxy", proxy);
/*  840 */       driver = (WebDriver)new ChromeDriver(options);
/*      */     } 
/*      */     
/*  843 */     JavascriptExecutor js = (JavascriptExecutor)driver;
/*  844 */     SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
/*  845 */     Date date = new Date();
/*      */     
/*  847 */     driver.manage().timeouts().pageLoadTimeout(40L, TimeUnit.SECONDS);
/*  848 */     driver.manage().timeouts().implicitlyWait(40L, TimeUnit.SECONDS);
/*  849 */     driver.manage().deleteAllCookies();
/*  850 */     driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);
/*      */     try {
/*  852 */       int search = 1;
/*  853 */       if (this.search_google_com.isSelected()) {
/*  854 */         search = 1;
/*      */       }
/*  856 */       if (this.search_google_com_vn.isSelected()) {
/*  857 */         search = 0;
/*      */       }
/*  859 */       if (this.search_random.isSelected()) {
/*  860 */         search = (int)(Math.random() * 2.0D);
/*      */       }
/*  862 */       if (search == 1) {
/*  863 */         driver.get("https://google.com/");
/*      */       } else {
/*  865 */         driver.get("https://google.com.vn/");
/*      */       } 
/*  867 */     } catch (Exception exception) {}
/*      */     
/*      */     try {
/*  870 */       driver.findElement(By.name("q")).clear();
/*  871 */       driver.findElement(By.name("q")).sendKeys(new CharSequence[] { key_work });
/*  872 */       driver.findElement(By.name("q")).sendKeys(new CharSequence[] { (CharSequence)Keys.ENTER });
/*  873 */       Thread.sleep(2000L);
/*  874 */     } catch (Exception exception) {}
/*      */     
/*  876 */     Integer number_search_key = Integer.valueOf(Integer.parseInt(this.number_search.getText().replaceAll("\\s+", "")));
/*  877 */     int check_search = 0;
/*      */     try {
/*  879 */       if (device == 0) {
/*  880 */         for (int i = 0; i < number_search_key.intValue(); i++) {
/*  881 */           if (Integer.parseInt(click) == 1) {
/*  882 */             List<WebElement> list_qc = driver.findElements(By.xpath("//div[contains(@role,'region')]/div[contains(@class,'uEierd')]//span[contains(@class,'qzEoUe')]"));
/*  883 */             int check_qc = 0;
/*  884 */             for (WebElement element : list_qc) {
/*  885 */               System.out.println(element.getText());
/*  886 */               String[] strArrayUser = link_website.split("\\|");
/*  887 */               for (int j = 0; j < strArrayUser.length; j++) {
/*  888 */                 if (element.getText().contains(strArrayUser[j])) {
/*  889 */                   check_search = 1;
/*  890 */                   element.click();
/*  891 */                   Show_Ip(key_work, ip, device_st, "Tìm Thấy");
/*      */                   break;
/*      */                 } 
/*      */               } 
/*  895 */               if (check_search == 1) {
/*      */                 break;
/*      */               }
/*      */             } 
/*      */           } else {
/*  900 */             List<WebElement> list_qc = driver.findElements(By.xpath("//div[contains(@id,'rso')]//div[contains(@class,'KJDcUb')]//span[contains(@class,'qzEoUe')]"));
/*  901 */             int check_qc = 0;
/*  902 */             for (WebElement element : list_qc) {
/*  903 */               System.out.println(element.getText());
/*      */               
/*  905 */               String[] strArrayUser = link_website.split("\\|");
/*  906 */               for (int j = 0; j < strArrayUser.length; j++) {
/*  907 */                 if (element.getText().contains(strArrayUser[j])) {
/*  908 */                   check_search = 1;
/*  909 */                   element.click();
/*  910 */                   Show_Ip(key_work, ip, device_st, "Tìm Thấy");
/*      */                   break;
/*      */                 } 
/*      */               } 
/*  914 */               if (check_search == 1) {
/*      */                 break;
/*      */               }
/*      */             } 
/*      */           } 
/*  919 */           if (check_search == 0) {
/*      */             try {
/*  921 */               driver.findElement(By.className("RVQdVd")).click();
/*  922 */             } catch (Exception e) {
/*  923 */               driver.findElement(By.xpath("//span[contains(@class,'Nj8Yyf')]//a[3]")).click();
/*      */             } 
/*      */           } else {
/*  926 */             Show_Ip(key_work, ip, device_st, "Không Thấy");
/*      */ 
/*      */             
/*      */             break;
/*      */           } 
/*      */         } 
/*      */       } else {
/*  933 */         for (int i = 0; i < number_search_key.intValue(); i++) {
/*  934 */           if (Integer.parseInt(click) == 1) {
/*  935 */             List<WebElement> list_qc = driver.findElements(By.xpath("//div[contains(@role,'region')]/div[contains(@class,'uEierd')]//span[contains(@class,'OSrXXb') and contains(@class,'qzEoUe')]"));
/*  936 */             int check_qc = 0;
/*  937 */             for (WebElement element : list_qc) {
/*  938 */               System.out.println(element.getText());
/*      */               
/*  940 */               String[] strArrayUser = link_website.split("\\|");
/*  941 */               for (int j = 0; j < strArrayUser.length; j++) {
/*  942 */                 System.out.println(strArrayUser[j]);
/*  943 */                 if (element.getText().contains(strArrayUser[j])) {
/*  944 */                   check_search = 1;
/*  945 */                   element.click();
/*  946 */                   Show_Ip(key_work, ip, device_st, "Tìm Thấy");
/*      */                   break;
/*      */                 } 
/*      */               } 
/*  950 */               if (check_search == 1) {
/*      */                 break;
/*      */               }
/*      */             } 
/*      */           } else {
/*  955 */             List<WebElement> list_qc = driver.findElements(By.xpath("//div[contains(@id,'rso')]//div[contains(@class,'g')]//a//cite"));
/*  956 */             int check_qc = 0;
/*  957 */             for (WebElement element : list_qc) {
/*  958 */               System.out.println(link_website);
/*      */               
/*  960 */               String[] strArrayUser = link_website.split("\\|");
/*  961 */               for (int j = 0; j < strArrayUser.length; j++) {
/*  962 */                 if (element.getText().contains(strArrayUser[j])) {
/*  963 */                   check_search = 1;
/*  964 */                   element.click();
/*  965 */                   Show_Ip(key_work, ip, device_st, "Tìm Thấy");
/*      */                   break;
/*      */                 } 
/*      */               } 
/*  969 */               if (check_search == 1) {
/*      */                 break;
/*      */               }
/*      */             } 
/*      */           } 
/*  974 */           if (check_search == 0) {
/*  975 */             List<WebElement> lisr_next = driver.findElements(By.xpath("//tr[contains(@jsname,'TeSSVd')]//td"));
/*  976 */             driver.findElement(By.xpath("//tr[contains(@jsname,'TeSSVd')]//td[" + lisr_next.size() + "]//a")).click();
/*      */           } else {
/*  978 */             Show_Ip(key_work, ip, device_st, "Không Thấy");
/*      */             
/*      */             break;
/*      */           } 
/*      */         } 
/*      */       } 
/*  984 */     } catch (Exception exception) {}
/*      */     
/*  986 */     if (check_search == 1) {
/*  987 */       Integer start_key = Integer.valueOf(Integer.parseInt(this.time_onsite_start.getText().replaceAll("\\s+", "")));
/*  988 */       Integer stop_key = Integer.valueOf(Integer.parseInt(this.time_onsite_stop.getText().replaceAll("\\s+", "")));
/*  989 */       int time_sleep = (Rand.nextInt(stop_key.intValue() - start_key.intValue() + 1) + start_key.intValue()) * 1000;
/*      */       
/*      */       try {
/*  992 */         int scroll = 0;
/*  993 */         for (int i = 0; i <= 5; i++) {
/*  994 */           scroll = 200 + scroll;
/*  995 */           System.out.println(scroll);
/*  996 */           ((JavascriptExecutor)driver).executeScript("window.scrollBy(0," + scroll + ")", new Object[0]);
/*  997 */           Thread.sleep((time_sleep / 5));
/*      */         } 
/*  999 */         ((JavascriptExecutor)driver).executeScript("window.scrollTo(document.body.scrollHeight,0)", new Object[0]);
/* 1000 */         List<WebElement> a_lq = driver.findElements(By.xpath("//a"));
/* 1001 */         int random_item_allproduct = Rand.nextInt(a_lq.size());
/* 1002 */         System.out.println(random_item_allproduct);
/* 1003 */         int check_lq = 0;
/* 1004 */         for (WebElement element : a_lq) {
/* 1005 */           check_lq++;
/* 1006 */           if (check_lq == random_item_allproduct) {
/* 1007 */             System.out.println(check_lq);
/* 1008 */             element.click();
/*      */             break;
/*      */           } 
/*      */         } 
/* 1012 */         Thread.sleep((time_sleep / 5));
/* 1013 */       } catch (Exception exception) {}
/*      */     } 
/*      */     
/* 1016 */     driver.quit();
/* 1017 */     this.jButton5.doClick();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void history(String keyword, String ip, String user, String device, String action) {
/*      */     try {
/* 1026 */       DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
/* 1027 */       LocalDateTime now = LocalDateTime.now();
/* 1028 */       System.out.println(dtf.format(now));
/*      */       
/* 1030 */       String filePath = "history.txt";
/* 1031 */       FileWriter fw = new FileWriter(filePath, true);
/* 1032 */       String lineToAppend = "\r\n" + keyword + "|" + ip + "|" + user + "|" + device + "|" + action + "|" + dtf.format(now);
/* 1033 */       fw.write(lineToAppend);
/* 1034 */       fw.close();
/* 1035 */     } catch (Exception e) {
/* 1036 */       System.out.println(e);
/*      */     } 
/*      */   }
/*      */   
/*      */   public void click(String proxy_t, String device, String get_load_image, String get_tinsoftproxy, String search, String vt_proxy_t, String keywork, String link_website, String click, String number_search, String time_sleep, String dcom, String view, String get_run_underground, String x, String y) {
/*      */     try {
/* 1042 */       connect a = new connect();
/* 1043 */       Connection conn = a.getConnection();
/* 1044 */       Statement stmt = conn.createStatement();
/* 1045 */       ResultSet rs = stmt.executeQuery("select key_word as key_work,link as link,view as view,click_qc as click_qc from product INNER JOIN key_word on product.id=key_word.product_id WHERE product.user_id=" + user_id + " and key_word.diskdrive='" + result + "' ORDER BY RAND() LIMIT 1");
/* 1046 */       ArrayList<String> arraykey = new ArrayList<>();
/* 1047 */       System.out.println("select key_word as key_work,link as link,view as view,click_qc as click_qc from product INNER JOIN key_word on product.id=key_word.product_id WHERE product.user_id=" + user_id + " and key_word.diskdrive='" + result + "' ORDER BY RAND() LIMIT 1");
/* 1048 */       while (rs.next()) {
/* 1049 */         System.out.println("x" + x + "y" + y);
/* 1050 */         MultiThreadingGoogle dr = new MultiThreadingGoogle(proxy_t, device, get_load_image, get_tinsoftproxy, search, vt_proxy_t, rs.getString("key_work"), rs.getString("link"), rs.getString("click_qc"), number_search, time_sleep, dcom, view, get_run_underground, x, y);
/* 1051 */         String[] info = new String[15];
/* 1052 */         info[0] = proxy_t;
/* 1053 */         info[1] = device;
/* 1054 */         info[2] = get_load_image;
/* 1055 */         info[3] = get_tinsoftproxy;
/* 1056 */         info[4] = search;
/* 1057 */         info[5] = vt_proxy_t;
/* 1058 */         info[6] = rs.getString("key_work");
/* 1059 */         info[7] = rs.getString("link");
/* 1060 */         info[8] = rs.getString("click_qc");
/* 1061 */         info[9] = number_search;
/* 1062 */         info[10] = time_sleep;
/* 1063 */         info[11] = dcom;
/* 1064 */         info[12] = rs.getString("view");
/* 1065 */         info[13] = x;
/* 1066 */         info[14] = y;
/* 1067 */         MultiThreadingGoogle.main(info);
/*      */       }
/*      */     
/* 1070 */     } catch (Exception exception) {}
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   private void jButton5ActionPerformed(ActionEvent evt) {
/* 1076 */     String proxy_t = this.proxy.getText();
/* 1077 */     String device = "1";
/* 1078 */     if (this.device_pc.isSelected()) {
/* 1079 */       device = "1";
/*      */     }
/* 1081 */     if (this.device_mobile.isSelected()) {
/* 1082 */       device = "0";
/*      */     }
/* 1084 */     if (this.device_random.isSelected()) {
/* 1085 */       device = "3";
/*      */     }
/*      */     
/* 1088 */     String get_load_image = "0";
/* 1089 */     if (this.load_image.isSelected()) {
/* 1090 */       get_load_image = "1";
/*      */     }
/* 1092 */     String get_tinsoftproxy = "0";
/* 1093 */     if (this.tinsoftproxy.isSelected()) {
/* 1094 */       get_tinsoftproxy = "1";
/*      */     }
/* 1096 */     String search = "1";
/* 1097 */     if (this.search_google_com.isSelected()) {
/* 1098 */       search = "1";
/*      */     }
/* 1100 */     if (this.search_google_com_vn.isSelected()) {
/* 1101 */       search = "0";
/*      */     }
/* 1103 */     if (this.search_random.isSelected()) {
/* 1104 */       search = "3";
/*      */     }
/* 1106 */     String get_dcom = "0";
/* 1107 */     if (this.dcom.isSelected()) {
/* 1108 */       search = "1";
/*      */     }
/* 1110 */     String get_run_underground = "0";
/* 1111 */     if (this.run_underground.isSelected()) {
/* 1112 */       get_run_underground = "1";
/*      */     }
/* 1114 */     int get_luong = Integer.parseInt(this.luong.getText());
/* 1115 */     System.out.println(get_luong);
/* 1116 */     String vt_proxy_t = this.vt_proxy.getText();
/* 1117 */     String get_number_search = this.number_search.getText();
/*      */     
/* 1119 */     Integer start_key = Integer.valueOf(Integer.parseInt(this.time_onsite_start.getText().replaceAll("\\s+", "")));
/* 1120 */     Integer stop_key = Integer.valueOf(Integer.parseInt(this.time_onsite_stop.getText().replaceAll("\\s+", "")));
/* 1121 */     Random Rand = new Random();
/* 1122 */     String time_sleep = Integer.toString((Rand.nextInt(stop_key.intValue() - start_key.intValue() + 1) + start_key.intValue()) * 1000);
/*      */     
/* 1124 */     GraphicsDevice gd = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
/* 1125 */     int width = gd.getDisplayMode().getWidth();
/* 1126 */     int height = gd.getDisplayMode().getHeight();
/* 1127 */     int number_width = width / 300;
/* 1128 */     int number_height = height / 540;
/* 1129 */     System.out.println("width" + number_height);
/*      */     
/*      */     try {
/* 1132 */       connect a = new connect();
/* 1133 */       Connection conn = a.getConnection();
/* 1134 */       Statement stmt = conn.createStatement();
/* 1135 */       ResultSet rs = stmt.executeQuery("select key_word as key_work,link as link,view as view,click_qc as click_qc from product INNER JOIN key_word on product.id=key_word.product_id WHERE product.action=1 and product.user_id=" + user_id + " and key_word.diskdrive='" + result + "' ORDER BY RAND() LIMIT " + get_luong);
/* 1136 */       ArrayList<String> arraykey = new ArrayList<>();
/*      */       
/* 1138 */       System.out.println("select key_word as key_work,link as link,view as view,click_qc as click_qc from product INNER JOIN key_word on product.id=key_word.product_id WHERE product.action=1 and product.user_id=" + user_id + " and key_word.diskdrive='" + result + "' ORDER BY RAND() LIMIT " + get_luong);
/* 1139 */       int i = 0;
/* 1140 */       int x = 0;
/* 1141 */       int y = 0;
/* 1142 */       while (rs.next()) {
/* 1143 */         if (i < number_width) {
/* 1144 */           x = i * 300;
/* 1145 */           y = 0;
/*      */         } else {
/* 1147 */           x = (i - number_width) * 300;
/* 1148 */           y = 540;
/*      */         } 
/* 1150 */         i++;
/*      */         
/* 1152 */         System.out.println("x" + x + "y" + y);
/* 1153 */         MultiThreadingGoogle multhread = new MultiThreadingGoogle(proxy_t, device, get_load_image, get_tinsoftproxy, search, vt_proxy_t, rs.getString("key_work"), rs.getString("link"), rs.getString("click_qc"), get_number_search, time_sleep, get_dcom, rs.getString("view"), get_run_underground, Integer.toString(x), Integer.toString(y));
/* 1154 */         String[] info = new String[15];
/* 1155 */         info[0] = proxy_t;
/* 1156 */         info[1] = device;
/* 1157 */         info[2] = get_load_image;
/* 1158 */         info[3] = get_tinsoftproxy;
/* 1159 */         info[4] = search;
/* 1160 */         info[5] = vt_proxy_t;
/* 1161 */         info[6] = rs.getString("key_work");
/* 1162 */         info[7] = rs.getString("link");
/* 1163 */         info[8] = rs.getString("click_qc");
/* 1164 */         info[9] = get_number_search;
/* 1165 */         info[10] = time_sleep;
/* 1166 */         info[11] = get_dcom;
/* 1167 */         info[12] = rs.getString("view");
/* 1168 */         info[13] = Integer.toString(x);
/* 1169 */         info[14] = Integer.toString(y);
/* 1170 */         MultiThreadingGoogle.main(info);
/*      */       }
/*      */     
/*      */     }
/* 1174 */     catch (Exception exception) {}
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void history(String keyword, String ip, String device, String action) {
/* 1181 */     DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
/* 1182 */     LocalDateTime now = LocalDateTime.now();
/* 1183 */     System.out.println(dtf.format(now));
/*      */     try {
/* 1185 */       String filePath = "history.txt";
/* 1186 */       FileWriter fw = new FileWriter(filePath, true);
/* 1187 */       String lineToAppend = "\r\n" + keyword + "|" + ip + "|" + device + "|" + action + "|" + dtf.format(now);
/* 1188 */       fw.write(lineToAppend);
/* 1189 */       fw.close();
/* 1190 */     } catch (Exception e) {
/* 1191 */       System.out.println(e);
/*      */     } 
/*      */   }
/*      */   
/*      */   public ArrayList<Product> productList() {
/* 1196 */     ArrayList<Product> productList = new ArrayList<>();
/*      */     try {
/* 1198 */       connect a = new connect();
/* 1199 */       Connection conn = a.getConnection();
/* 1200 */       Statement stmt = conn.createStatement();
/* 1201 */       ResultSet rs = stmt.executeQuery("select key_word.id as id, key_word as key_work,name as name,start_key as start_key,stop_key as stop_key,view as view,click_qc as click_qc from product INNER JOIN key_word on product.id=key_word.product_id WHERE product.user_id=" + user_id + " ORDER BY product.id DESC");
/*      */       
/* 1203 */       while (rs.next()) {
/* 1204 */         String Click_qc = "Seo";
/* 1205 */         if (Integer.parseInt(rs.getString("click_qc")) == 1) {
/* 1206 */           Click_qc = "Ads";
/*      */         }
/* 1208 */         Product product = new Product(rs.getString("id"), rs.getString("key_work"), rs.getString("name"), rs.getString("start_key"), rs.getString("stop_key"), rs.getString("view"), Click_qc);
/* 1209 */         productList.add(product);
/*      */       } 
/* 1211 */       conn.close();
/* 1212 */     } catch (Exception exception) {}
/*      */     
/* 1214 */     return productList;
/*      */   }
/*      */ 
/*      */   
/*      */   public void Show_Product_Table() {
/* 1219 */     ArrayList<Product> list = productList();
/* 1220 */     DefaultTableModel model = (DefaultTableModel)this.tbproduct.getModel();
/*      */     
/* 1222 */     Object[] row = new Object[4];
/* 1223 */     for (int i = 0; i < list.size(); i++) {
/* 1224 */       row[0] = ((Product)list.get(i)).getId();
/* 1225 */       row[1] = ((Product)list.get(i)).getKey_work();
/* 1226 */       row[2] = ((Product)list.get(i)).getName();
/* 1227 */       row[3] = ((Product)list.get(i)).getClick_qc();
/*      */       
/* 1229 */       model.addRow(row);
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   private void jButton4ActionPerformed(ActionEvent evt) {
/* 1236 */     String get_link = this.link.getSelectedItem().toString();
/* 1237 */     String[] product_id = get_link.split("\\|");
/* 1238 */     System.out.println(product_id[0]);
/* 1239 */     String get_key = this.key.getText();
/*      */     
/* 1241 */     String get_click_ads = "0";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1248 */     String get_action = null;
/* 1249 */     get_action = "1";
/* 1250 */     if (get_link.equals("")) {
/* 1251 */       JOptionPane.showMessageDialog(this.rootPane, "Link Sản Phẩm Cần Tìm Không Để Trống");
/*      */     } else {
/* 1253 */       if (get_key.equals("")) {
/* 1254 */         JOptionPane.showMessageDialog(this.rootPane, "Key Tìm Kiếm Không Được Để Trống");
/*      */       } else {
/*      */         try {
/* 1257 */           connect b = new connect();
/* 1258 */           Connection connb = b.getConnection();
/* 1259 */           Statement stmtb = connb.createStatement();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           
/* 1270 */           JTextArea txtarea = new JTextArea(5, 30);
/* 1271 */           String str = this.key.getText();
/*      */           
/* 1273 */           String delimiter = "\\n";
/* 1274 */           String[] temp = str.split(delimiter);
/*      */           
/* 1276 */           ArrayList<Product> productList = new ArrayList<>();
/* 1277 */           for (int i = 0; i < temp.length; i++) {
/* 1278 */             String sql_key = "INSERT INTO key_word(key_word,product_id,user_id,start_key,stop_key,view)VALUES ('" + temp[i] + "', '" + product_id[0] + "', '" + user_id + "',0,0,0)";
/* 1279 */             System.out.println(sql_key);
/* 1280 */             stmtb.executeUpdate(sql_key);
/*      */           } 
/*      */           
/* 1283 */           DefaultTableModel model = (DefaultTableModel)this.tbproduct.getModel();
/* 1284 */           model.getDataVector().removeAllElements();
/* 1285 */           revalidate();
/* 1286 */           Show_Product_Table();
/*      */           
/* 1288 */           connb.close();
/* 1289 */         } catch (Exception exception) {}
/*      */       } 
/*      */ 
/*      */ 
/*      */       
/* 1294 */       this.key.setText("");
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private void jButton2ActionPerformed(ActionEvent evt) {
/* 1303 */     String id = this.jLabel18.getText();
/* 1304 */     String get_key = this.key.getText();
/* 1305 */     if (id.equals("") && get_key.equals("")) {
/* 1306 */       JOptionPane.showMessageDialog(this.rootPane, "Chọn Chiến Dịch");
/*      */     } else {
/*      */       try {
/* 1309 */         connect b = new connect();
/* 1310 */         Connection connb = b.getConnection();
/* 1311 */         Statement stmtb = connb.createStatement();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/* 1320 */         String sqlkey = "DELETE FROM key_word WHERE id=" + id + " and user_id=" + user_id;
/* 1321 */         stmtb.executeUpdate(sqlkey);
/* 1322 */         DefaultTableModel model = (DefaultTableModel)this.tbproduct.getModel();
/* 1323 */         model.getDataVector().removeAllElements();
/* 1324 */         revalidate();
/*      */         
/* 1326 */         this.key.setText("");
/* 1327 */         Show_Product_Table();
/* 1328 */         connb.close();
/* 1329 */       } catch (Exception exception) {}
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private void tbproductMouseClicked(MouseEvent evt) {
/* 1337 */     int i = this.tbproduct.getSelectedRow();
/* 1338 */     TableModel model = this.tbproduct.getModel();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1345 */     this.key.setText(model.getValueAt(i, 1).toString());
/*      */     
/* 1347 */     this.jLabel18.setText(model.getValueAt(i, 0).toString());
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private void jButton1ActionPerformed(ActionEvent evt) {
/* 1368 */     if (money.equals("1")) {
/* 1369 */       String[] info = new String[1];
/* 1370 */       ProductF dr = new ProductF(user_id);
/* 1371 */       dr.setVisible(true);
/*      */     
/*      */     }
/*      */     else {
/*      */       
/* 1376 */       JOptionPane.showMessageDialog(this.rootPane, "Tài Khoản Vip Mới Sử Dụng Được");
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private void jButton6ActionPerformed(ActionEvent evt) {
/* 1384 */     history hs = new history();
/*      */     
/* 1386 */     hs.setVisible(true);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private void linkActionPerformed(ActionEvent evt) {}
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void main(String[] args) {
/* 1402 */     user_id = args[0];
/* 1403 */     date = args[1];
/* 1404 */     date_active = args[2];
/* 1405 */     phone = args[3];
/* 1406 */     money = args[4];
/*      */ 
/*      */     
/*      */     try {
/* 1410 */       Process p = Runtime.getRuntime().exec("wmic DISKDRIVE get SerialNumber");
/*      */       
/* 1412 */       BufferedReader input = new BufferedReader(new InputStreamReader(p.getInputStream()));
/*      */       String line;
/* 1414 */       while ((line = input.readLine()) != null) {
/* 1415 */         result += line;
/*      */       }
/* 1417 */       if (result.equalsIgnoreCase(" ")) {
/* 1418 */         System.out.println("Result is empty");
/*      */       } else {
/* 1420 */         System.out.println(result);
/* 1421 */         result = result.replaceAll(" ", "");
/*      */       } 
/* 1423 */       input.close();
/* 1424 */       System.out.println(result);
/*      */       try {
/* 1426 */         connect b = new connect();
/* 1427 */         Connection connb = b.getConnection();
/* 1428 */         Statement stmtb = connb.createStatement();
/* 1429 */         String sql = "UPDATE key_word SET diskdrive='" + result + "' WHERE user_id='" + user_id + "'";
/* 1430 */         stmtb.executeUpdate(sql);
/* 1431 */         connb.close();
/* 1432 */       } catch (Exception exception) {}
/*      */ 
/*      */       
/* 1435 */       System.out.println("f");
/*      */     }
/* 1437 */     catch (IOException iOException) {}
/*      */ 
/*      */     
/*      */     try {
/* 1441 */       for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
/* 1442 */         if ("Nimbus".equals(info.getName())) {
/* 1443 */           UIManager.setLookAndFeel(info.getClassName());
/*      */           break;
/*      */         } 
/*      */       } 
/* 1447 */     } catch (ClassNotFoundException ex) {
/* 1448 */       Logger.getLogger(dashboard.class.getName()).log(Level.SEVERE, (String)null, ex);
/* 1449 */     } catch (InstantiationException ex) {
/* 1450 */       Logger.getLogger(dashboard.class.getName()).log(Level.SEVERE, (String)null, ex);
/* 1451 */     } catch (IllegalAccessException ex) {
/* 1452 */       Logger.getLogger(dashboard.class.getName()).log(Level.SEVERE, (String)null, ex);
/* 1453 */     } catch (UnsupportedLookAndFeelException ex) {
/* 1454 */       Logger.getLogger(dashboard.class.getName()).log(Level.SEVERE, (String)null, ex);
/*      */     } 
/*      */     
/* 1457 */     UpdateChomeDriver.UpdateChomeDriver();
/*      */     
/* 1459 */     EventQueue.invokeLater(new Runnable() {
/*      */           public void run() {
/* 1461 */             (new dashboard()).setVisible(true);
/*      */           }
/*      */         });
/*      */   }
/*      */ }


/* Location:              D:\googleads\googleads.jar!\democlick\dashboard.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */