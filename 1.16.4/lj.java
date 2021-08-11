/*     */ import java.util.Iterator;
/*     */ import java.util.List;
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
/*     */ public class lj
/*     */ {
/*     */   private final lf a;
/*     */   private final List<lc> b;
/*     */   private long c;
/*     */   
/*     */   public void a(long ☃) {
/*     */     try {
/*  88 */       c(☃);
/*  89 */     } catch (Exception exception) {}
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(long ☃) {
/*     */     try {
/*  95 */       c(☃);
/*  96 */     } catch (Exception exception) {
/*  97 */       this.a.a(exception);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void c(long ☃) {
/* 110 */     Iterator<lc> iterator = this.b.iterator();
/* 111 */     while (iterator.hasNext()) {
/* 112 */       lc lc = iterator.next();
/* 113 */       lc.b.run();
/* 114 */       iterator.remove();
/* 115 */       long l1 = ☃ - this.c;
/* 116 */       long l2 = this.c;
/* 117 */       this.c = ☃;
/* 118 */       if (lc.a != null && lc.a.longValue() != l1) {
/* 119 */         this.a.a(new ky("Succeeded in invalid tick: expected " + (l2 + lc.a.longValue()) + ", but current tick is " + ☃));
/*     */         break;
/*     */       } 
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\lj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */