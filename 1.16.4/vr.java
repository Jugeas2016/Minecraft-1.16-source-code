/*    */ import java.io.InputStream;
/*    */ import java.io.OutputStream;
/*    */ import java.nio.file.Files;
/*    */ import java.nio.file.Path;
/*    */ import java.util.Properties;
/*    */ import org.apache.logging.log4j.LogManager;
/*    */ import org.apache.logging.log4j.Logger;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class vr
/*    */ {
/* 14 */   private static final Logger a = LogManager.getLogger();
/*    */   
/*    */   private final Path b;
/*    */   private final boolean c;
/*    */   
/*    */   public vr(Path ☃) {
/* 20 */     this.b = ☃;
/* 21 */     this.c = (w.d || b());
/*    */   }
/*    */   
/*    */   private boolean b() {
/* 25 */     try (InputStream ☃ = Files.newInputStream(this.b, new java.nio.file.OpenOption[0])) {
/* 26 */       Properties properties = new Properties();
/* 27 */       properties.load(☃);
/* 28 */       return Boolean.parseBoolean(properties.getProperty("eula", "false"));
/* 29 */     } catch (Exception ☃) {
/* 30 */       a.warn("Failed to load {}", this.b);
/* 31 */       c();
/*    */       
/* 33 */       return false;
/*    */     } 
/*    */   }
/*    */   public boolean a() {
/* 37 */     return this.c;
/*    */   }
/*    */   
/*    */   private void c() {
/* 41 */     if (w.d) {
/*    */       return;
/*    */     }
/* 44 */     try (OutputStream ☃ = Files.newOutputStream(this.b, new java.nio.file.OpenOption[0])) {
/* 45 */       Properties properties = new Properties();
/* 46 */       properties.setProperty("eula", "false");
/* 47 */       properties.store(☃, "By changing the setting below to TRUE you are indicating your agreement to our EULA (https://account.mojang.com/documents/minecraft_eula).");
/* 48 */     } catch (Exception ☃) {
/* 49 */       a.warn("Failed to save {}", this.b, ☃);
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\vr.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */