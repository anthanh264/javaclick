/*     */ package browser.ChromeDriver;
/*     */ 
/*     */ import java.io.BufferedInputStream;
/*     */ import java.io.BufferedReader;
/*     */ import java.io.File;
/*     */ import java.io.FileInputStream;
/*     */ import java.io.FileOutputStream;
/*     */ import java.io.IOException;
/*     */ import java.io.InputStream;
/*     */ import java.io.InputStreamReader;
/*     */ import java.net.URL;
/*     */ import java.util.zip.ZipEntry;
/*     */ import java.util.zip.ZipInputStream;
/*     */ import org.json.JSONObject;
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
/*     */ public class UpdateChomeDriver
/*     */ {
/*     */   public static String chromeVersion() throws IOException {
/*  36 */     Runtime rt = Runtime.getRuntime();
/*  37 */     Process proc = rt.exec("reg query HKEY_CURRENT_USER\\Software\\Google\\Chrome\\BLBeacon /v version");
/*  38 */     BufferedReader stdInput = new BufferedReader(new InputStreamReader(proc.getInputStream()));
/*  39 */     BufferedReader stdError = new BufferedReader(new InputStreamReader(proc.getErrorStream()));
/*  40 */     String s = null;
/*  41 */     String version = "";
/*  42 */     while ((s = stdInput.readLine()) != null) {
/*  43 */       if (s.contains("version")) {
/*  44 */         String[] strcomment = s.split("    ");
/*  45 */         version = strcomment[3];
/*     */       } 
/*     */     } 
/*  48 */     while ((s = stdError.readLine()) != null) {
/*  49 */       System.out.println(s);
/*     */     }
/*  51 */     return version;
/*     */   }
/*     */ 
/*     */   
/*     */   public static void downloadFile(URL url, String fileName) throws IOException {
/*  56 */     try(InputStream in = url.openStream(); 
/*  57 */         BufferedInputStream bis = new BufferedInputStream(in); 
/*  58 */         FileOutputStream fos = new FileOutputStream(fileName)) {
/*     */       
/*  60 */       byte[] data = new byte[1024];
/*     */       int count;
/*  62 */       while ((count = bis.read(data, 0, 1024)) != -1) {
/*  63 */         fos.write(data, 0, count);
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   public static File newFile(File destinationDir, ZipEntry zipEntry) throws IOException {
/*  69 */     File destFile = new File(destinationDir, zipEntry.getName());
/*  70 */     String destDirPath = destinationDir.getCanonicalPath();
/*  71 */     String destFilePath = destFile.getCanonicalPath();
/*  72 */     if (!destFilePath.startsWith(destDirPath + File.separator)) {
/*  73 */       throw new IOException("Entry is outside of the target dir: " + zipEntry.getName());
/*     */     }
/*  75 */     return destFile;
/*     */   }
/*     */   
/*     */   public static Void UpdateChomeDriver() {
/*     */     try {
/*  80 */       if (!chromeVersion().equals("")) {
/*     */         try {
/*  82 */           ApiChromeDriver ApiChromeDriver = new ApiChromeDriver("https://change-device.xtooldev.com/api/v1/chromedriver/download-link?chromeVersion=" + chromeVersion() + "&machineType=win32");
/*  83 */           String rs = ApiChromeDriver.getVision();
/*  84 */           if (rs != "") {
/*  85 */             JSONObject jObject = new JSONObject(rs);
/*  86 */             if (jObject.getBoolean("success")) {
/*  87 */               System.out.println(jObject.getString("data"));
/*  88 */               String rsData = jObject.getString("data");
/*     */               try {
/*  90 */                 URL url = new URL(rsData);
/*  91 */                 File myObj = new File("chromedriver.zip");
/*  92 */                 if (myObj.delete()) {
/*  93 */                   System.out.println("Deleted the file: " + myObj.getName());
/*     */                 } else {
/*  95 */                   System.out.println("Failed to delete the file.");
/*     */                 } 
/*  97 */                 File mychromeexe = new File("chromedriver/chromedriver.exe");
/*  98 */                 if (mychromeexe.delete()) {
/*  99 */                   System.out.println("Deleted the file: ");
/*     */                 } else {
/* 101 */                   System.out.println("Failed to delete the file.");
/*     */                 } 
/* 103 */                 downloadFile(url, "chromedriver.zip");
/* 104 */                 String fileZip = "chromedriver.zip";
/* 105 */                 File destDir = new File("chromedriver");
/* 106 */                 byte[] buffer = new byte[1024];
/* 107 */                 ZipInputStream zis = new ZipInputStream(new FileInputStream("chromedriver.zip"));
/* 108 */                 ZipEntry zipEntry = zis.getNextEntry();
/* 109 */                 while (zipEntry != null) {
/* 110 */                   File newFile = newFile(destDir, zipEntry);
/* 111 */                   if (zipEntry.isDirectory()) {
/* 112 */                     if (!newFile.isDirectory() && !newFile.mkdirs()) {
/* 113 */                       throw new IOException("Failed to create directory " + newFile);
/*     */                     }
/*     */                   } else {
/* 116 */                     File parent = newFile.getParentFile();
/* 117 */                     if (!parent.isDirectory() && !parent.mkdirs()) {
/* 118 */                       throw new IOException("Failed to create directory " + parent);
/*     */                     }
/* 120 */                     FileOutputStream fos = new FileOutputStream(newFile);
/*     */                     int len;
/* 122 */                     while ((len = zis.read(buffer)) > 0) {
/* 123 */                       fos.write(buffer, 0, len);
/*     */                     }
/* 125 */                     fos.close();
/*     */                   } 
/* 127 */                   zipEntry = zis.getNextEntry();
/*     */                 } 
/* 129 */                 zis.closeEntry();
/* 130 */                 zis.close();
/*     */               }
/* 132 */               catch (IOException iOException) {}
/*     */ 
/*     */             
/*     */             }
/*     */ 
/*     */ 
/*     */           
/*     */           }
/*     */ 
/*     */         
/*     */         }
/* 143 */         catch (Exception ex) {
/* 144 */           ex.printStackTrace();
/*     */         } 
/*     */       }
/* 147 */     } catch (IOException iOException) {}
/*     */ 
/*     */     
/* 150 */     return null;
/*     */   }
/*     */ }


/* Location:              D:\googleads\googleads.jar!\browser\ChromeDriver\UpdateChomeDriver.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */