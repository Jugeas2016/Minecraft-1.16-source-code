/*    */ import com.google.common.collect.ImmutableList;
/*    */ import java.util.Arrays;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class dvr<T extends aqa>
/*    */   extends dur<T>
/*    */ {
/*    */   private final dwn[] a;
/*    */   private final dwn[] b;
/*    */   private final ImmutableList<dwn> f;
/* 17 */   private final float[] g = new float[7];
/*    */   
/* 19 */   private static final int[][] h = new int[][] { { 3, 2, 2 }, { 4, 3, 2 }, { 6, 4, 3 }, { 3, 3, 3 }, { 2, 2, 3 }, { 2, 1, 2 }, { 1, 1, 2 } };
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 28 */   private static final int[][] i = new int[][] { { 0, 0 }, { 0, 4 }, { 0, 9 }, { 0, 16 }, { 0, 22 }, { 11, 0 }, { 13, 4 } };
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public dvr() {
/* 39 */     this.a = new dwn[7];
/* 40 */     float ☃ = -3.5F;
/* 41 */     for (int i = 0; i < this.a.length; i++) {
/* 42 */       this.a[i] = new dwn(this, i[i][0], i[i][1]);
/* 43 */       this.a[i].a(h[i][0] * -0.5F, 0.0F, h[i][2] * -0.5F, h[i][0], h[i][1], h[i][2]);
/* 44 */       this.a[i].a(0.0F, (24 - h[i][1]), ☃);
/* 45 */       this.g[i] = ☃;
/* 46 */       if (i < this.a.length - 1) {
/* 47 */         ☃ += (h[i][2] + h[i + 1][2]) * 0.5F;
/*    */       }
/*    */     } 
/*    */     
/* 51 */     this.b = new dwn[3];
/* 52 */     this.b[0] = new dwn(this, 20, 0);
/* 53 */     this.b[0].a(-5.0F, 0.0F, h[2][2] * -0.5F, 10.0F, 8.0F, h[2][2]);
/* 54 */     this.b[0].a(0.0F, 16.0F, this.g[2]);
/* 55 */     this.b[1] = new dwn(this, 20, 11);
/* 56 */     this.b[1].a(-3.0F, 0.0F, h[4][2] * -0.5F, 6.0F, 4.0F, h[4][2]);
/* 57 */     this.b[1].a(0.0F, 20.0F, this.g[4]);
/* 58 */     this.b[2] = new dwn(this, 20, 18);
/* 59 */     this.b[2].a(-3.0F, 0.0F, h[4][2] * -0.5F, 6.0F, 5.0F, h[1][2]);
/* 60 */     this.b[2].a(0.0F, 19.0F, this.g[1]);
/*    */     
/* 62 */     ImmutableList.Builder<dwn> builder = ImmutableList.builder();
/*    */     
/* 64 */     builder.addAll(Arrays.asList(this.a));
/* 65 */     builder.addAll(Arrays.asList(this.b));
/*    */     
/* 67 */     this.f = builder.build();
/*    */   }
/*    */ 
/*    */   
/*    */   public ImmutableList<dwn> b() {
/* 72 */     return this.f;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(T ☃, float f1, float f2, float f3, float f4, float f5) {
/* 77 */     for (int i = 0; i < this.a.length; i++) {
/* 78 */       (this.a[i]).e = afm.b(f3 * 0.9F + i * 0.15F * 3.1415927F) * 3.1415927F * 0.05F * (1 + Math.abs(i - 2));
/* 79 */       (this.a[i]).a = afm.a(f3 * 0.9F + i * 0.15F * 3.1415927F) * 3.1415927F * 0.2F * Math.abs(i - 2);
/*    */     } 
/*    */     
/* 82 */     (this.b[0]).e = (this.a[2]).e;
/* 83 */     (this.b[1]).e = (this.a[4]).e;
/* 84 */     (this.b[1]).a = (this.a[4]).a;
/* 85 */     (this.b[2]).e = (this.a[1]).e;
/* 86 */     (this.b[2]).a = (this.a[1]).a;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dvr.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */