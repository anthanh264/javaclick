/*     */ package democlick;
/*     */ 
/*     */ import java.awt.AWTException;
/*     */ import java.awt.Robot;
/*     */ import java.util.concurrent.TimeUnit;
/*     */ import org.openqa.selenium.By;
/*     */ import org.openqa.selenium.JavascriptExecutor;
/*     */ import org.openqa.selenium.WebDriver;
/*     */ import org.openqa.selenium.chrome.ChromeDriver;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Democlick
/*     */ {
/*  38 */   private static WebDriver driver = null;
/*     */   private Robot robot;
/*     */   private Runtime runtime;
/*     */   private Click autoClick;
/*     */   
/*     */   public void StartDcom() {
/*  44 */     int x = 1305;
/*  45 */     int y = 495;
/*  46 */     StringBuilder cmd = new StringBuilder();
/*     */     try {
/*  48 */       this.robot = new Robot();
/*  49 */     } catch (AWTException e) {
/*  50 */       e.printStackTrace();
/*     */     } 
/*     */     
/*  53 */     this.runtime = Runtime.getRuntime();
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
/*  71 */       System.setProperty("webdriver.chrome.driver", "chromedriver_win32\\chromedriver.exe");
/*     */       
/*  73 */       driver = (WebDriver)new ChromeDriver();
/*  74 */       driver.manage().window().maximize();
/*  75 */       driver.manage().window().maximize();
/*  76 */       driver.manage().deleteAllCookies();
/*  77 */       driver.manage().timeouts().pageLoadTimeout(40L, TimeUnit.SECONDS);
/*  78 */       driver.manage().timeouts().implicitlyWait(40L, TimeUnit.SECONDS);
/*     */       
/*  80 */       driver.get("https://www.google.com.vn/");
/*  81 */       driver.findElement(By.name("q")).sendKeys(new CharSequence[] { "mua cây xạ đen" });
/*  82 */       Thread.sleep(5000L);
/*     */       
/*  84 */       driver.findElement(By.xpath("//input[@class='gNO89b']")).click();
/*  85 */       driver.manage().timeouts().pageLoadTimeout(40L, TimeUnit.SECONDS);
/*  86 */       driver.manage().timeouts().implicitlyWait(40L, TimeUnit.SECONDS);
/*     */       
/*  88 */       driver.findElement(By.xpath("//a[@href='https://cayxaden.com.vn/']")).click();
/*  89 */       Thread.sleep(2000L);
/*  90 */       JavascriptExecutor jse = (JavascriptExecutor)driver;
/*  91 */       jse.executeScript("scroll(0, 1250);", new Object[0]);
/*  92 */       Thread.sleep(5000L);
/*  93 */       jse.executeScript("scroll(0, 1250);", new Object[0]);
/*  94 */       Thread.sleep(5000L);
/*  95 */       driver.close();
/*     */       
/*  97 */       Thread.sleep(10000L);
/*  98 */       this.robot.mouseMove(x, y);
/*  99 */       Click.leftClick(this.robot);
/* 100 */       Thread.sleep(20000L);
/* 101 */       Click.leftClick(this.robot);
/* 102 */       System.out.println("đã click");
/*     */       
/* 104 */       Thread.sleep(10000L);
/*     */       
/* 106 */       System.setProperty("webdriver.chrome.driver", "chromedriver_win32\\chromedriver.exe");
/*     */       
/* 108 */       driver = (WebDriver)new ChromeDriver();
/* 109 */       driver.manage().window().maximize();
/* 110 */       driver.get("https://www.google.com.vn/");
/* 111 */       driver.findElement(By.name("q")).sendKeys(new CharSequence[] { "mua cây xạ đen" });
/* 112 */       Thread.sleep(5000L);
/*     */       
/* 114 */       driver.findElement(By.xpath("//input[@class='gNO89b']")).click();
/* 115 */       driver.findElement(By.xpath("//a[@href='https://cayxaden.com.vn/']")).click();
/* 116 */       driver.close();
/*     */       
/* 118 */       System.setProperty("webdriver.chrome.driver", "chromedriver_win32\\chromedriver.exe");
/*     */       
/* 120 */       driver = (WebDriver)new ChromeDriver();
/* 121 */       driver.manage().window().maximize();
/* 122 */       driver.get("https://www.google.com.vn/");
/* 123 */       driver.findElement(By.name("q")).sendKeys(new CharSequence[] { "mua cây xạ đen cây giống" });
/* 124 */       Thread.sleep(5000L);
/*     */       
/* 126 */       driver.findElement(By.xpath("//input[@class='gNO89b']")).click();
/*     */       
/* 128 */       driver.findElement(By.xpath("//a[@href='https://cayxaden.com.vn/']")).click();
/* 129 */     } catch (Exception e) {
/* 130 */       System.exit(0);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void main(String[] args) {
/* 137 */     (new Democlick()).StartDcom();
/*     */   }
/*     */ }


/* Location:              D:\googleads\googleads.jar!\democlick\Democlick.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */