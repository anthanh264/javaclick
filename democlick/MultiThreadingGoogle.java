/*     */ package democlick;
/*     */ 
/*     */ import Proxy.TinsoftProxy;
/*     */ import java.net.URLConnection;
/*     */ import java.sql.Connection;
/*     */ import java.sql.ResultSet;
/*     */ import java.sql.Statement;
/*     */ import java.text.SimpleDateFormat;
/*     */ import java.util.Date;
/*     */ import java.util.HashMap;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Random;
/*     */ import java.util.concurrent.TimeUnit;
/*     */ import org.json.JSONObject;
/*     */ import org.openqa.selenium.By;
/*     */ import org.openqa.selenium.Capabilities;
/*     */ import org.openqa.selenium.JavascriptExecutor;
/*     */ import org.openqa.selenium.Keys;
/*     */ import org.openqa.selenium.PageLoadStrategy;
/*     */ import org.openqa.selenium.Point;
/*     */ import org.openqa.selenium.Proxy;
/*     */ import org.openqa.selenium.WebDriver;
/*     */ import org.openqa.selenium.WebElement;
/*     */ import org.openqa.selenium.chrome.ChromeDriver;
/*     */ import org.openqa.selenium.chrome.ChromeOptions;
/*     */ import org.openqa.selenium.remote.DesiredCapabilities;
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
/*     */ 
/*     */ 
/*     */ public class MultiThreadingGoogle
/*     */   extends Thread
/*     */ {
/*     */   private WebDriver driver;
/*     */   private String Url;
/*     */   private String proxy_t;
/*     */   private String device;
/*     */   private String get_load_image;
/*     */   private String get_tinsoftproxy;
/*     */   private String search;
/*     */   private String vt_proxy_t;
/*     */   private String keywork;
/*     */   private String link_website;
/*     */   private String click;
/*     */   private String number_search;
/*     */   private String time_sleep;
/*     */   private String dcom;
/*     */   private String view;
/*     */   private String get_run_underground;
/*     */   private String x;
/*     */   private String y;
/*     */   
/*     */   public MultiThreadingGoogle(final String proxy_t, final String device, final String get_load_image, final String get_tinsoftproxy, final String search, final String vt_proxy_t, final String keywork, final String link_website, final String click, final String number_search, final String time_sleep, final String dcom, final String view, final String get_run_underground, final String x, final String y) {
/*  79 */     this.proxy_t = proxy_t;
/*  80 */     this.device = device;
/*  81 */     this.get_load_image = get_load_image;
/*  82 */     this.get_tinsoftproxy = get_tinsoftproxy;
/*  83 */     this.search = search;
/*  84 */     this.vt_proxy_t = vt_proxy_t;
/*  85 */     this.keywork = keywork;
/*  86 */     this.link_website = link_website;
/*  87 */     this.click = click;
/*  88 */     this.number_search = number_search;
/*  89 */     this.time_sleep = time_sleep;
/*  90 */     this.dcom = dcom;
/*  91 */     this.view = view;
/*  92 */     this.get_run_underground = get_run_underground;
/*  93 */     this.x = x;
/*  94 */     this.y = y;
/*     */     
/*  96 */     Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler()
/*     */         {
/*     */           public void uncaughtException(Thread t, Throwable e) {
/*  99 */             System.out.println("#Thread: " + t);
/* 100 */             System.out.println("#Thread exception message: " + e.getMessage());
/*     */ 
/*     */ 
/*     */             
/* 104 */             dashboard dr = new dashboard();
/* 105 */             dr.click(proxy_t, device, get_load_image, get_tinsoftproxy, search, vt_proxy_t, keywork, link_website, click, number_search, time_sleep, dcom, view, get_run_underground, x, y);
/*     */           }
/*     */         });
/*     */     
/* 109 */     start();
/*     */   }
/*     */ 
/*     */   
/*     */   public void run() {
/* 114 */     System.out.println("Thread- Started" + Thread.currentThread().getName());
/* 115 */     String threadname = Thread.currentThread().getName();
/* 116 */     System.out.println(threadname);
/* 117 */     System.out.println("status = " + Thread.currentThread().isAlive());
/* 118 */     System.out.println("x" + this.x + "y" + this.y);
/*     */     try {
/* 120 */       Thread.sleep(1000L);
/* 121 */       setUp(this.proxy_t, this.device, this.get_load_image, this.get_tinsoftproxy, this.search, this.vt_proxy_t, this.keywork, this.link_website, this.click, this.number_search, this.time_sleep, this.dcom, this.view, this.get_run_underground, this.x, this.y);
/* 122 */     } catch (InterruptedException e) {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 128 */       e.printStackTrace();
/*     */     }
/* 130 */     catch (Exception exception) {
/*     */     
/*     */     } finally {}
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
/* 145 */     System.out.println("Thread- END " + Thread.currentThread().getName());
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void main(String[] args) {}
/*     */ 
/*     */ 
/*     */   
/*     */   public void setUp(String proxy_t, String device, String get_load_image, String get_tinsoftproxy, String search, String vt_proxy_t, String keywork, String link_website, String click, String number_search, String time_sleep, String dcom, String view, String get_run_underground, String x, String y) throws Exception {
/* 155 */     System.setProperty("webdriver.chrome.driver", "chromedriver\\chromedriver.exe");
/*     */     
/* 157 */     ChromeOptions options = new ChromeOptions();
/*     */     
/* 159 */     Map<String, Object> prefs = new HashMap<>();
/* 160 */     prefs.put("credentials_enable_service", Boolean.valueOf(false));
/* 161 */     prefs.put("profile.password_manager_enabled", Boolean.valueOf(false));
/*     */     
/* 163 */     options.addArguments(new String[] { "--profile-directory=Default" });
/* 164 */     options.addArguments(new String[] { "--no-sandbox" });
/* 165 */     options.addArguments(new String[] { "--disable-dev-shm-usage" });
/* 166 */     options.addArguments(new String[] { "--aggressive-cache-discard" });
/* 167 */     options.addArguments(new String[] { "--disable-cache" });
/* 168 */     options.addArguments(new String[] { "--disable-application-cache" });
/* 169 */     options.addArguments(new String[] { "--disable-offline-load-stale-cache" });
/* 170 */     options.addArguments(new String[] { "--disk-cache-size=0" });
/* 171 */     options.addArguments(new String[] { "--dns-prefetch-disable" });
/* 172 */     options.addArguments(new String[] { "--log-level=3" });
/* 173 */     options.addArguments(new String[] { "--silent" });
/* 174 */     options.addArguments(new String[] { "--disable-browser-side-navigation" });
/* 175 */     options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
/* 176 */     options.addArguments(new String[] { "-disable-cache" });
/* 177 */     options.addArguments(new String[] { "-disable-extensions" });
/* 178 */     options.addArguments(new String[] { "--incognito" });
/* 179 */     options.addArguments(new String[] { "start-maximized" });
/* 180 */     options.addArguments(new String[] { "enable-automation" });
/*     */     
/* 182 */     if (get_run_underground.equals("1")) {
/* 183 */       options.addArguments(new String[] { "headless" });
/*     */     }
/* 185 */     URLConnection connection = null;
/* 186 */     URLConnection connection_user = null;
/* 187 */     String getip = "false";
/* 188 */     String[] strArrproxy = null;
/* 189 */     String[] strArrip = null;
/* 190 */     String ip = null;
/* 191 */     String device_st = "Máy Tính";
/* 192 */     Random Rand = new Random();
/* 193 */     String user_age = null;
/* 194 */     String thietbi = device;
/* 195 */     if (thietbi.equals("3")) {
/* 196 */       thietbi = Integer.toString((int)(Math.random() * 2.0D));
/*     */     }
/*     */     
/*     */     try {
/* 200 */       connect_user_agent u_k1 = new connect_user_agent();
/* 201 */       Connection connu_k1 = u_k1.getConnection();
/* 202 */       Statement stmtu_k1 = connu_k1.createStatement();
/* 203 */       ResultSet rs = stmtu_k1.executeQuery("SELECT * FROM user_agent ORDER BY RAND() LIMIT 1");
/* 204 */       if (thietbi.equals("0")) {
/* 205 */         options.addArguments(new String[] { "--app=https://www.google.com/" });
/* 206 */         options.addArguments(new String[] { "--window-size=300,500" });
/* 207 */         rs = stmtu_k1.executeQuery("SELECT * FROM user_agent WHERE user_agent Not LIKE '%Windows%' ORDER BY RAND() LIMIT 1");
/*     */       } else {
/* 209 */         rs = stmtu_k1.executeQuery("SELECT * FROM user_agent WHERE user_agent LIKE '%Windows%' ORDER BY RAND() LIMIT 1");
/* 210 */         thietbi = "1";
/*     */       } 
/* 212 */       if (rs.next()) {
/* 213 */         System.out.println(rs.getString("user_agent"));
/* 214 */         options.addArguments(new String[] { "--user-agent=" + rs.getString("user_agent") });
/*     */       } 
/* 216 */       device_st = rs.getString("user_agent");
/* 217 */       connu_k1.close();
/* 218 */     } catch (Exception exception) {}
/*     */ 
/*     */     
/* 221 */     if (get_load_image.equals("1")) {
/* 222 */       dashboard.disableChromeImages(options);
/*     */     }
/* 224 */     if (proxy_t.equals("")) {
/* 225 */       this.driver = (WebDriver)new ChromeDriver(options);
/*     */     } else {
/* 227 */       if (get_tinsoftproxy.equals("1")) {
/* 228 */         String[] strArrayvtproxy = vt_proxy_t.split("\\|");
/* 229 */         int number_location_proxy = Rand.nextInt(strArrayvtproxy.length);
/*     */ 
/*     */         
/* 232 */         String delimiter = "\\n";
/* 233 */         String[] temp = proxy_t.split(delimiter);
/* 234 */         int number_proxy = Rand.nextInt(temp.length);
/*     */         try {
/* 236 */           for (int i = 0; i < temp.length; i++) {
/* 237 */             TinsoftProxy TinsoftProxy = new TinsoftProxy(temp[i], strArrayvtproxy[number_location_proxy]);
/* 238 */             String rs = TinsoftProxy.changeIP();
/* 239 */             if (rs != "") {
/* 240 */               JSONObject jObject = new JSONObject(rs);
/* 241 */               if (jObject.getBoolean("success")) {
/* 242 */                 System.out.println(jObject.getString("proxy"));
/* 243 */                 ip = jObject.getString("proxy");
/*     */                 break;
/*     */               } 
/*     */             } 
/*     */           } 
/* 248 */           if (ip == null) {
/* 249 */             TinsoftProxy TinsoftProxy = new TinsoftProxy(temp[number_proxy], strArrayvtproxy[number_location_proxy]);
/* 250 */             String rs = TinsoftProxy.getCurentIP();
/* 251 */             System.out.println("chay lấy proxy mới");
/* 252 */             if (rs != "") {
/* 253 */               JSONObject jObject = new JSONObject(rs);
/* 254 */               if (jObject.getBoolean("success")) {
/* 255 */                 System.out.println(jObject.getString("proxy"));
/* 256 */                 ip = jObject.getString("proxy");
/*     */               } 
/*     */             } 
/*     */           } 
/* 260 */         } catch (Exception exception) {}
/*     */       }
/*     */       else {
/*     */         
/* 264 */         String delimiter = "\\n";
/* 265 */         String[] temp = proxy_t.split(delimiter);
/* 266 */         int rnd = (new Random()).nextInt(temp.length);
/* 267 */         ip = temp[rnd];
/*     */       } 
/* 269 */       System.out.println("ip" + ip);
/* 270 */       Proxy proxy = new Proxy();
/* 271 */       proxy.setAutodetect(false);
/*     */       
/* 273 */       proxy.setHttpProxy(ip);
/* 274 */       proxy.setSslProxy(ip);
/*     */       
/* 276 */       DesiredCapabilities capabilities = new DesiredCapabilities();
/* 277 */       capabilities.setCapability("proxy", proxy);
/* 278 */       capabilities.setCapability("goog:chromeOptions", options);
/* 279 */       this.driver = (WebDriver)new ChromeDriver((Capabilities)capabilities);
/*     */     } 
/*     */     
/* 282 */     JavascriptExecutor js = (JavascriptExecutor)this.driver;
/* 283 */     SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
/* 284 */     Date date = new Date();
/*     */     
/* 286 */     this.driver.manage().timeouts().pageLoadTimeout(40L, TimeUnit.SECONDS);
/* 287 */     this.driver.manage().timeouts().implicitlyWait(40L, TimeUnit.SECONDS);
/* 288 */     this.driver.manage().deleteAllCookies();
/* 289 */     this.driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);
/*     */     
/* 291 */     if (thietbi.equals("0")) {
/* 292 */       Point target = new Point(Integer.parseInt(x), Integer.parseInt(y));
/* 293 */       Point current = this.driver.manage().window().getPosition();
/* 294 */       if (!current.equals(target)) {
/* 295 */         this.driver.manage().window().setPosition(target);
/*     */       }
/*     */     } 
/*     */     try {
/* 299 */       Thread.sleep(2000L);
/* 300 */       String search_value = search;
/* 301 */       if (search_value.equals("3")) {
/* 302 */         search_value = Integer.toString((int)(Math.random() * 2.0D));
/*     */       }
/* 304 */       if (search_value.equals("1")) {
/* 305 */         this.driver.get("https://google.com/");
/*     */       } else {
/* 307 */         this.driver.get("https://google.com.vn/");
/*     */       } 
/* 309 */     } catch (Exception exception) {}
/*     */     
/*     */     try {
/* 312 */       this.driver.findElement(By.name("q")).clear();
/* 313 */       this.driver.findElement(By.name("q")).sendKeys(new CharSequence[] { keywork });
/* 314 */       this.driver.findElement(By.name("q")).sendKeys(new CharSequence[] { (CharSequence)Keys.ENTER });
/* 315 */       Thread.sleep(2000L);
/* 316 */     } catch (Exception exception) {}
/*     */ 
/*     */     
/* 319 */     int check_search = 0;
/* 320 */     String linkweb = "Không Tìm Thấy";
/*     */     try {
/* 322 */       if (thietbi.equals("0")) {
/* 323 */         System.out.println("mobile");
/* 324 */         for (int i = 0; i < Integer.parseInt(number_search); i++) {
/*     */           
/* 326 */           if (Integer.parseInt(click) == 1) {
/* 327 */             List<WebElement> list_qc = this.driver.findElements(By.xpath("//*[@role='region']//a"));
/* 328 */             int check_qc = 0;
/* 329 */             System.out.println("list_qc");
/* 330 */             String[] strArrayUser = link_website.split("\\|");
/* 331 */             for (int j = 0; j < strArrayUser.length; j++) {
/* 332 */               int k = 0;
/* 333 */               for (WebElement element : list_qc) {
/* 334 */                 k++;
/* 335 */                 System.out.println(element.getText());
/* 336 */                 if (element.getText().contains(strArrayUser[j])) {
/* 337 */                   check_search = 1;
/* 338 */                   linkweb = "Tìm Thấy";
/* 339 */                   element.click();
/*     */                   break;
/*     */                 } 
/*     */               } 
/* 343 */               if (check_search == 1) {
/*     */                 break;
/*     */               }
/*     */             } 
/*     */           } else {
/* 348 */             List<WebElement> list_qc = this.driver.findElements(By.xpath("//div[contains(@id,'rso')]//a"));
/* 349 */             int check_qc = 0;
/* 350 */             String[] strArrayUser = link_website.split("\\|");
/* 351 */             for (int j = 0; j < strArrayUser.length; j++) {
/* 352 */               for (WebElement element : list_qc) {
/* 353 */                 if (element.getText().contains(strArrayUser[j])) {
/* 354 */                   check_search = 1;
/* 355 */                   linkweb = "Tim Thấy";
/* 356 */                   element.click();
/*     */                   break;
/*     */                 } 
/*     */               } 
/* 360 */               if (check_search == 1) {
/*     */                 break;
/*     */               }
/*     */             } 
/*     */           } 
/*     */         } 
/* 366 */         System.out.println("check_search" + check_search);
/* 367 */         if (check_search == 0) {
/*     */           try {
/* 369 */             this.driver.findElement(By.className("RVQdVd")).click();
/* 370 */             dashboard dashboard = new dashboard();
/* 371 */             dashboard.history(keywork, ip, device_st, linkweb);
/* 372 */           } catch (Exception e) {
/* 373 */             this.driver.findElement(By.xpath("//span[contains(@class,'Nj8Yyf')]//a[3]")).click();
/*     */           } 
/*     */         } else {
/*     */           try {
/* 377 */             System.out.println("ddd" + ip);
/* 378 */             dashboard dashboard = new dashboard();
/* 379 */             dashboard.history(keywork, ip, device_st, linkweb);
/* 380 */           } catch (Exception e) {
/* 381 */             System.out.println("lỗi ghi lich sư");
/*     */           }
/*     */         
/*     */         } 
/*     */       } else {
/*     */         
/* 387 */         for (int i = 0; i < Integer.parseInt(number_search); i++) {
/* 388 */           if (Integer.parseInt(click) == 1) {
/* 389 */             List<WebElement> list_qc = this.driver.findElements(By.xpath("//*[@role='region']//a"));
/* 390 */             int check_qc = 0;
/* 391 */             String[] strArrayUser = link_website.split("\\|");
/* 392 */             for (int j = 0; j < strArrayUser.length; j++) {
/* 393 */               System.out.println("");
/* 394 */               int k = 0;
/* 395 */               for (WebElement element : list_qc) {
/* 396 */                 System.out.println(element.getAttribute(""));
/* 397 */                 k++;
/*     */                 
/* 399 */                 if (element.getText().contains(strArrayUser[j])) {
/* 400 */                   check_search = 1;
/* 401 */                   linkweb = "Tìm Thấy";
/*     */                   
/* 403 */                   element.click();
/*     */                   break;
/*     */                 } 
/*     */               } 
/* 407 */               if (check_search == 1) {
/*     */                 break;
/*     */               }
/*     */             } 
/*     */           } else {
/*     */             
/* 413 */             List<WebElement> list_qc = this.driver.findElements(By.xpath("//div[contains(@id,'rso')]//a"));
/* 414 */             int check_qc = 0;
/*     */ 
/*     */             
/* 417 */             String[] strArrayUser = link_website.split("\\|");
/* 418 */             for (int j = 0; j < strArrayUser.length; j++) {
/* 419 */               for (WebElement element : list_qc) {
/* 420 */                 if (element.getText().contains(strArrayUser[j])) {
/* 421 */                   check_search = 1;
/* 422 */                   linkweb = "Tìm Thấy";
/* 423 */                   element.click();
/*     */                   
/*     */                   break;
/*     */                 } 
/*     */               } 
/* 428 */               if (check_search == 1) {
/*     */                 break;
/*     */               }
/*     */             } 
/*     */           } 
/*     */         } 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 438 */         if (check_search == 0) {
/*     */           try {
/* 440 */             List<WebElement> lisr_next = this.driver.findElements(By.xpath("//tr[contains(@jsname,'TeSSVd')]//td"));
/* 441 */             this.driver.findElement(By.xpath("//tr[contains(@jsname,'TeSSVd')]//td[" + lisr_next.size() + "]//a")).click();
/* 442 */             dashboard dashboard = new dashboard();
/* 443 */             dashboard.history(keywork, ip, device_st, linkweb);
/* 444 */           } catch (Exception exception) {}
/*     */         } else {
/*     */ 
/*     */           
/*     */           try {
/* 449 */             dashboard dashboard = new dashboard();
/* 450 */             dashboard.history(keywork, ip, device_st, linkweb);
/* 451 */           } catch (Exception e) {
/* 452 */             System.out.println("lỗi ghi lich sư");
/*     */           }
/*     */         
/*     */         } 
/*     */       } 
/* 457 */     } catch (Exception exception) {}
/*     */ 
/*     */     
/* 460 */     if (check_search == 1) {
/*     */       
/*     */       try {
/* 463 */         int scroll = 0;
/* 464 */         for (int i = 0; i <= 5; i++) {
/* 465 */           scroll = 200 + scroll;
/*     */           
/* 467 */           ((JavascriptExecutor)this.driver).executeScript("window.scrollBy(0," + scroll + ")", new Object[0]);
/* 468 */           Thread.sleep((Integer.parseInt(time_sleep) / 5));
/*     */         } 
/* 470 */         ((JavascriptExecutor)this.driver).executeScript("window.scrollTo(document.body.scrollHeight,0)", new Object[0]);
/* 471 */         List<WebElement> a_lq = this.driver.findElements(By.xpath("//a"));
/* 472 */         int random_item_allproduct = Rand.nextInt(a_lq.size());
/*     */         
/* 474 */         int check_lq = 0;
/* 475 */         for (WebElement element : a_lq) {
/* 476 */           check_lq++;
/* 477 */           if (check_lq == random_item_allproduct) {
/* 478 */             System.out.println(check_lq);
/* 479 */             element.click();
/*     */             break;
/*     */           } 
/*     */         } 
/* 483 */         Thread.sleep((Integer.parseInt(time_sleep) / 5));
/* 484 */       } catch (Exception e) {
/* 485 */         this.driver.close();
/* 486 */         this.driver.quit();
/* 487 */         dashboard dashboard = new dashboard();
/* 488 */         dashboard.click(proxy_t, device, get_load_image, get_tinsoftproxy, search, vt_proxy_t, keywork, link_website, click, number_search, time_sleep, dcom, view, get_run_underground, x, y);
/*     */       } 
/*     */     }
/*     */     
/* 492 */     this.driver.close();
/* 493 */     this.driver.quit();
/*     */     
/* 495 */     dashboard dr = new dashboard();
/* 496 */     dr.click(proxy_t, device, get_load_image, get_tinsoftproxy, search, vt_proxy_t, keywork, link_website, click, number_search, time_sleep, dcom, view, get_run_underground, x, y);
/*     */   }
/*     */ }


/* Location:              D:\googleads\googleads.jar!\democlick\MultiThreadingGoogle.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */