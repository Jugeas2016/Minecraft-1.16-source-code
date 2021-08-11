/*    */ import java.util.Arrays;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class dub<T extends aqa>
/*    */   extends dur<T>
/*    */ {
/* 10 */   private static final int[][] a = new int[][] { { 4, 3, 2 }, { 6, 4, 5 }, { 3, 3, 1 }, { 1, 2, 1 } };
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 17 */   private static final int[][] b = new int[][] { { 0, 0 }, { 0, 5 }, { 0, 14 }, { 0, 18 } };
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 24 */   private static final int f = a.length;
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 29 */   private final dwn[] g = new dwn[f]; public dub() {
/* 30 */     float ☃ = -3.5F;
/* 31 */     for (int i = 0; i < this.g.length; i++) {
/* 32 */       this.g[i] = new dwn(this, b[i][0], b[i][1]);
/* 33 */       this.g[i].a(a[i][0] * -0.5F, 0.0F, a[i][2] * -0.5F, a[i][0], a[i][1], a[i][2]);
/* 34 */       this.g[i].a(0.0F, (24 - a[i][1]), ☃);
/* 35 */       if (i < this.g.length - 1) {
/* 36 */         ☃ += (a[i][2] + a[i + 1][2]) * 0.5F;
/*    */       }
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public Iterable<dwn> a() {
/* 43 */     return Arrays.asList(this.g);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(T ☃, float f1, float f2, float f3, float f4, float f5) {
/* 48 */     for (int i = 0; i < this.g.length; i++) {
/* 49 */       (this.g[i]).e = afm.b(f3 * 0.9F + i * 0.15F * 3.1415927F) * 3.1415927F * 0.01F * (1 + Math.abs(i - 2));
/* 50 */       (this.g[i]).a = afm.a(f3 * 0.9F + i * 0.15F * 3.1415927F) * 3.1415927F * 0.1F * Math.abs(i - 2);
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dub.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */