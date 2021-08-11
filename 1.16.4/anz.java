/*    */ import java.io.File;
/*    */ import java.text.SimpleDateFormat;
/*    */ import java.util.Date;
/*    */ import java.util.function.LongSupplier;
/*    */ import javax.annotation.Nullable;
/*    */ import org.apache.logging.log4j.LogManager;
/*    */ import org.apache.logging.log4j.Logger;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class anz
/*    */ {
/* 15 */   private static final Logger a = LogManager.getLogger();
/*    */   
/*    */   private final LongSupplier b;
/*    */   
/*    */   private final long c;
/*    */   
/*    */   private int d;
/*    */   
/*    */   private final File e;
/*    */   
/*    */   private anu f;
/*    */ 
/*    */   
/*    */   public anw a() {
/* 29 */     this.f = new anp(this.b, () -> this.d, false);
/* 30 */     this.d++;
/* 31 */     return this.f;
/*    */   }
/*    */   
/*    */   public void b() {
/* 35 */     if (this.f == ant.a) {
/*    */       return;
/*    */     }
/*    */     
/* 39 */     anv ☃ = this.f.d();
/* 40 */     this.f = ant.a;
/*    */     
/* 42 */     if (☃.g() >= this.c) {
/* 43 */       File file = new File(this.e, "tick-results-" + (new SimpleDateFormat("yyyy-MM-dd_HH.mm.ss")).format(new Date()) + ".txt");
/* 44 */       ☃.a(file);
/* 45 */       a.info("Recorded long tick -- wrote info to: {}", file.getAbsolutePath());
/*    */     } 
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @Nullable
/*    */   public static anz a(String ☃) {
/* 54 */     return null;
/*    */   }
/*    */   
/*    */   public static anw a(anw ☃, @Nullable anz anz1) {
/* 58 */     if (anz1 != null) {
/* 59 */       return anw.a(anz1.a(), ☃);
/*    */     }
/* 61 */     return ☃;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\anz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */