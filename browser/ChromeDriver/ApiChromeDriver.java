/*    */ package browser.ChromeDriver;
/*    */ 
/*    */ import java.net.URL;
/*    */ import java.net.URLConnection;
/*    */ import java.util.Scanner;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ApiChromeDriver
/*    */ {
/*    */   public String url;
/*    */   
/*    */   public ApiChromeDriver(String url) {
/* 17 */     this.url = url;
/*    */   }
/*    */   
/*    */   public String getVision() {
/* 21 */     String rs = "";
/*    */     try {
/* 23 */       URLConnection connection = null;
/* 24 */       connection = (new URL(this.url)).openConnection();
/* 25 */       Scanner scanner = new Scanner(connection.getInputStream());
/* 26 */       scanner.useDelimiter("\\Z");
/* 27 */       rs = scanner.next();
/* 28 */       System.out.println(rs);
/* 29 */     } catch (Exception exception) {}
/*    */ 
/*    */ 
/*    */     
/* 33 */     return rs;
/*    */   }
/*    */ }


/* Location:              D:\googleads\googleads.jar!\browser\ChromeDriver\ApiChromeDriver.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */