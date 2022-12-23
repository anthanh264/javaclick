/*    */ package democlick;
/*    */ 
/*    */ import java.awt.Robot;
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
/*    */ public class Click
/*    */ {
/*    */   public static void leftClick(Robot robot) {
/* 17 */     robot.mousePress(1024);
/* 18 */     robot.mouseRelease(1024);
/*    */   }
/*    */   public static void doubleleftClick(Robot robot) {
/* 21 */     robot.mousePress(1024);
/* 22 */     robot.mouseRelease(1024);
/*    */     
/* 24 */     robot.mousePress(1024);
/* 25 */     robot.mouseRelease(1024);
/*    */   }
/*    */ }


/* Location:              D:\googleads\googleads.jar!\democlick\Click.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */