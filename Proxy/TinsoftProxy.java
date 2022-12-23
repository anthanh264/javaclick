/*    */ package Proxy;
/*    */ 
/*    */ import java.net.URL;
/*    */ import java.net.URLConnection;
/*    */ import java.util.Scanner;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class TinsoftProxy
/*    */ {
/*    */   public String api_key;
/*    */   public String location;
/* 15 */   private String serverDomain = "http://proxy.tinsoftsv.com";
/* 16 */   private double lastRequest = 0.0D;
/*    */   
/*    */   public TinsoftProxy(String api_key, String location) {
/* 19 */     this.api_key = api_key;
/* 20 */     this.location = location;
/*    */   }
/*    */   
/*    */   public String changeIP() {
/* 24 */     String rs = "";
/* 25 */     if (checkLastRequest()) {
/*    */       
/*    */       try {
/* 28 */         URLConnection connection = null;
/* 29 */         connection = (new URL(this.serverDomain + "/api/changeProxy.php?key=" + this.api_key + "&location=" + this.location)).openConnection();
/* 30 */         System.out.println(this.serverDomain + "/api/changeProxy.php?key=" + this.api_key + "&location=" + this.location);
/* 31 */         Scanner scanner = new Scanner(connection.getInputStream());
/* 32 */         scanner.useDelimiter("\\Z");
/* 33 */         rs = scanner.next();
/* 34 */         System.out.println(rs);
/* 35 */       } catch (Exception exception) {}
/*    */     }
/*    */ 
/*    */     
/* 39 */     return rs;
/*    */   }
/*    */   
/*    */   public String getCurentIP() {
/* 43 */     String rs = "";
/* 44 */     if (checkLastRequest()) {
/*    */       try {
/* 46 */         URLConnection connection = null;
/* 47 */         System.out.println(this.serverDomain + "/api/getProxy.php?key=" + this.api_key);
/* 48 */         connection = (new URL(this.serverDomain + "/api/getProxy.php?key=" + this.api_key)).openConnection();
/* 49 */         Scanner scanner = new Scanner(connection.getInputStream());
/* 50 */         scanner.useDelimiter("\\Z");
/* 51 */         rs = scanner.next();
/* 52 */         System.out.println(rs);
/* 53 */       } catch (Exception exception) {}
/*    */     }
/*    */ 
/*    */     
/* 57 */     return rs;
/*    */   }
/*    */   
/*    */   private boolean checkLastRequest() {
/* 61 */     double now = System.currentTimeMillis();
/* 62 */     if (now - this.lastRequest >= 10000.0D) {
/* 63 */       this.lastRequest = now;
/* 64 */       return true;
/*    */     } 
/* 66 */     return false;
/*    */   }
/*    */ }


/* Location:              D:\googleads\googleads.jar!\Proxy\TinsoftProxy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */