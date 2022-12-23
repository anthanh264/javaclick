/*    */ package democlick;
/*    */ 
/*    */ import java.sql.Connection;
/*    */ import java.sql.DriverManager;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class connect_user_agent
/*    */ {
/*    */   public Connection getConnection() {
/* 17 */     Connection conn = null;
/*    */     try {
/* 19 */       Class.forName("com.mysql.jdbc.Driver");
/* 20 */       conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/user_agent?useUnicode=true&characterEncoding=utf-8", "root", "");
/*    */       
/* 22 */       if (conn != null) {
/* 23 */         System.out.println("Kết nối thành công");
/*    */       } else {
/* 25 */         System.out.println("Kết nỗi không thành công");
/*    */       }
/*    */     
/* 28 */     } catch (Exception exception) {}
/*    */     
/* 30 */     return conn;
/*    */   }
/*    */ }


/* Location:              D:\googleads\googleads.jar!\democlick\connect_user_agent.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */