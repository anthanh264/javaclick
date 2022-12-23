/*    */ package democlick;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class Product
/*    */ {
/*    */   private String key_work;
/*    */   private String link;
/*    */   private int updated_at;
/*    */   private int created_at;
/*    */   private String action;
/*    */   private int user_id;
/*    */   private String start_key;
/*    */   private String stop_key;
/*    */   private String view;
/*    */   private String click_qc;
/*    */   private String name;
/*    */   private String id;
/*    */   
/*    */   public Product(String Id, String Name, String Link, String Click_qc, String Action) {
/* 28 */     this.id = Id;
/* 29 */     this.name = Name;
/* 30 */     this.link = Link;
/* 31 */     this.click_qc = Click_qc;
/* 32 */     this.action = Action;
/*    */   }
/*    */ 
/*    */   
/*    */   public Product(String Id, String Key_work, String Name, String Start_key, String Stop_key, String View, String Click_qc) {
/* 37 */     this.id = Id;
/* 38 */     this.key_work = Key_work;
/* 39 */     this.name = Name;
/* 40 */     this.start_key = Start_key;
/* 41 */     this.stop_key = Stop_key;
/* 42 */     this.view = View;
/* 43 */     this.click_qc = Click_qc;
/*    */   }
/*    */   
/*    */   public String getId() {
/* 47 */     return this.id;
/*    */   }
/*    */   public String getName() {
/* 50 */     return this.name;
/*    */   }
/*    */   public String getClick_qc() {
/* 53 */     return this.click_qc;
/*    */   }
/*    */   
/*    */   public String getView() {
/* 57 */     return this.view;
/*    */   }
/*    */   
/*    */   public String getStop_key() {
/* 61 */     return this.stop_key;
/*    */   }
/*    */   
/*    */   public String getStart_key() {
/* 65 */     return this.start_key;
/*    */   }
/*    */   
/*    */   public String getKey_work() {
/* 69 */     return this.key_work;
/*    */   }
/*    */   
/*    */   public int getUser_id() {
/* 73 */     return this.user_id;
/*    */   }
/*    */   
/*    */   public String getLink() {
/* 77 */     return this.link;
/*    */   }
/*    */   
/*    */   public int getUpdated_at() {
/* 81 */     return this.updated_at;
/*    */   }
/*    */   
/*    */   public int getCreated_at() {
/* 85 */     return this.created_at;
/*    */   }
/*    */   
/*    */   public String getAction() {
/* 89 */     return this.action;
/*    */   }
/*    */ }


/* Location:              D:\googleads\googleads.jar!\democlick\Product.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */