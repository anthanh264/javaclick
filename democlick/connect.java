/*    */ package democlick;
/*    */ 
/*    */ import java.sql.Connection;
/*    */ import java.sql.DriverManager;
/*    */ 
/*    */ public class connect {
/*    */   public Connection getConnection() {
/*  8 */     Connection connection = null;
/*    */     try {
/* 10 */       Class.forName("com.mysql.jdbc.Driver");
/* 11 */       connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test?useUnicode=true&characterEncoding=utf-8", "root", "");
/* 12 */       if (connection != null) {
/* 13 */         System.out.println("Kết nối thành công");
/*    */       } else {
/* 15 */         System.out.println("Kết nỗi không thành công");
/*    */       } 
/* 17 */     } catch (Exception exception) {}
/* 18 */     return connection;
/*    */   }
/*    */ }


/* Location:              D:\googleads\googleads.jar!\democlick\connect.class
 * Java compiler version: 19 (63.0)
 * JD-Core Version:       1.1.3
 */