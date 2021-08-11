/*    */ import com.mojang.blaze3d.systems.RenderSystem;
/*    */ import java.io.File;
/*    */ import java.text.DateFormat;
/*    */ import java.text.SimpleDateFormat;
/*    */ import java.util.Date;
/*    */ import java.util.function.Consumer;
/*    */ import javax.annotation.Nullable;
/*    */ import org.apache.logging.log4j.LogManager;
/*    */ import org.apache.logging.log4j.Logger;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class dkh
/*    */ {
/* 28 */   private static final Logger a = LogManager.getLogger();
/* 29 */   private static final DateFormat b = new SimpleDateFormat("yyyy-MM-dd_HH.mm.ss");
/*    */   
/*    */   public static void a(File ☃, int i, int j, deg deg1, Consumer<nr> consumer) {
/* 32 */     a(☃, null, i, j, deg1, consumer);
/*    */   }
/*    */   
/*    */   public static void a(File ☃, @Nullable String str, int i, int j, deg deg1, Consumer<nr> consumer) {
/* 36 */     if (!RenderSystem.isOnRenderThread()) {
/* 37 */       RenderSystem.recordRenderCall(() -> b(☃, str, i, j, deg1, consumer));
/*    */     }
/*    */     else {
/*    */       
/* 41 */       b(☃, str, i, j, deg1, consumer);
/*    */     } 
/*    */   }
/*    */   private static void b(File ☃, @Nullable String str, int i, int j, deg deg1, Consumer<nr> consumer) {
/*    */     File file2;
/* 46 */     det det = a(i, j, deg1);
/* 47 */     File file1 = new File(☃, "screenshots");
/* 48 */     file1.mkdir();
/*    */ 
/*    */     
/* 51 */     if (str == null) {
/* 52 */       file2 = a(file1);
/*    */     } else {
/* 54 */       file2 = new File(file1, str);
/*    */     } 
/*    */     
/* 57 */     x.g().execute(() -> {
/*    */           try {
/*    */             ☃.a(file);
/*    */             
/*    */             nr nr = (new oe(file.getName())).a(k.t).a(());
/*    */             consumer.accept(new of("screenshot.success", new Object[] { nr }));
/* 63 */           } catch (Exception exception) {
/*    */             a.warn("Couldn't save screenshot", exception);
/*    */             consumer.accept(new of("screenshot.failure", new Object[] { exception.getMessage() }));
/*    */           } finally {
/*    */             ☃.close();
/*    */           } 
/*    */         });
/*    */   }
/*    */   
/*    */   public static det a(int ☃, int i, deg deg1) {
/* 73 */     ☃ = deg1.a;
/* 74 */     i = deg1.b;
/*    */     
/* 76 */     det det = new det(☃, i, false);
/*    */     
/* 78 */     RenderSystem.bindTexture(deg1.f());
/* 79 */     det.a(0, true);
/*    */ 
/*    */     
/* 82 */     det.f();
/*    */     
/* 84 */     return det;
/*    */   }
/*    */   
/*    */   private static File a(File ☃) {
/* 88 */     String str = b.format(new Date());
/*    */     
/* 90 */     for (int i = 1;; i++) {
/* 91 */       File file = new File(☃, str + ((i == 1) ? "" : ("_" + i)) + ".png");
/* 92 */       if (!file.exists())
/* 93 */         return file; 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dkh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */