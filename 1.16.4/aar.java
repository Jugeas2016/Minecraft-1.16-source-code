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
/*    */ public class aar
/*    */   implements aap
/*    */ {
/* 15 */   private static final Logger a = LogManager.getLogger();
/*    */   private final int b;
/*    */   private int c;
/*    */   private long d;
/* 19 */   private long e = Long.MAX_VALUE;
/*    */   
/*    */   public aar(int ☃) {
/* 22 */     int i = ☃ * 2 + 1;
/* 23 */     this.b = i * i;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(brd ☃) {
/* 28 */     this.e = x.b();
/* 29 */     this.d = this.e;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(brd ☃, @Nullable cga cga1) {
/* 34 */     if (cga1 == cga.m) {
/* 35 */       this.c++;
/*    */     }
/* 37 */     int i = c();
/*    */ 
/*    */ 
/*    */     
/* 41 */     if (x.b() > this.e) {
/* 42 */       this.e += 500L;
/*    */       
/* 44 */       a.info((new of("menu.preparingSpawn", new Object[] { Integer.valueOf(afm.a(i, 0, 100)) })).getString());
/*    */     } 
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void b() {
/* 55 */     a.info("Time elapsed: {} ms", Long.valueOf(x.b() - this.d));
/* 56 */     this.e = Long.MAX_VALUE;
/*    */   }
/*    */   
/*    */   public int c() {
/* 60 */     return afm.d(this.c * 100.0F / this.b);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\aar.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */