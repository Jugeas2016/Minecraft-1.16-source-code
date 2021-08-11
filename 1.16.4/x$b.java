/*     */ import java.io.File;
/*     */ import java.net.MalformedURLException;
/*     */ import java.net.URI;
/*     */ import java.net.URISyntaxException;
/*     */ import java.net.URL;
/*     */ import java.security.AccessController;
/*     */ import java.security.PrivilegedActionException;
/*     */ import org.apache.commons.io.IOUtils;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public enum b
/*     */ {
/* 211 */   a,
/* 212 */   b,
/* 213 */   c
/*     */   {
/*     */     protected String[] b(URL ☃) {
/* 216 */       return new String[] { "rundll32", "url.dll,FileProtocolHandler", ☃.toString() };
/*     */     }
/*     */   },
/* 219 */   d
/*     */   {
/*     */     protected String[] b(URL ☃) {
/* 222 */       return new String[] { "open", ☃.toString() };
/*     */     }
/*     */   },
/* 225 */   e;
/*     */   
/*     */   public void a(URL ☃) {
/*     */     try {
/* 229 */       Process process = AccessController.<Process>doPrivileged(() -> Runtime.getRuntime().exec(b(☃)));
/* 230 */       for (String str : IOUtils.readLines(process.getErrorStream())) {
/* 231 */         x.m().error(str);
/*     */       }
/* 233 */       process.getInputStream().close();
/* 234 */       process.getErrorStream().close();
/* 235 */       process.getOutputStream().close();
/* 236 */     } catch (PrivilegedActionException|java.io.IOException exception) {
/* 237 */       x.m().error("Couldn't open url '{}'", ☃, exception);
/*     */     } 
/*     */   }
/*     */   
/*     */   public void a(URI ☃) {
/*     */     try {
/* 243 */       a(☃.toURL());
/* 244 */     } catch (MalformedURLException malformedURLException) {
/* 245 */       x.m().error("Couldn't open uri '{}'", ☃, malformedURLException);
/*     */     } 
/*     */   }
/*     */   
/*     */   public void a(File ☃) {
/*     */     try {
/* 251 */       a(☃.toURI().toURL());
/* 252 */     } catch (MalformedURLException malformedURLException) {
/* 253 */       x.m().error("Couldn't open file '{}'", ☃, malformedURLException);
/*     */     } 
/*     */   }
/*     */   
/*     */   protected String[] b(URL ☃) {
/* 258 */     String str = ☃.toString();
/* 259 */     if ("file".equals(☃.getProtocol()))
/*     */     {
/* 261 */       str = str.replace("file:", "file://");
/*     */     }
/* 263 */     return new String[] { "xdg-open", str };
/*     */   }
/*     */   
/*     */   public void a(String ☃) {
/*     */     try {
/* 268 */       a((new URI(☃)).toURL());
/*     */     }
/* 270 */     catch (URISyntaxException|MalformedURLException|IllegalArgumentException exception) {
/* 271 */       x.m().error("Couldn't open uri '{}'", ☃, exception);
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\x$b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */