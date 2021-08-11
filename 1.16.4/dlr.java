/*    */ import com.mojang.blaze3d.systems.RenderSystem;
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
/*    */ public class dlr
/*    */   extends dlj
/*    */ {
/*    */   private final vk a;
/*    */   private final int b;
/*    */   private final int c;
/*    */   private final int d;
/*    */   private final int e;
/*    */   private final int v;
/*    */   
/*    */   public dlr(int ☃, int i, int j, int k, int m, int n, int i1, vk vk1, dlj.a a1) {
/* 23 */     this(☃, i, j, k, m, n, i1, vk1, 256, 256, a1);
/*    */   }
/*    */   
/*    */   public dlr(int ☃, int i, int j, int k, int m, int n, int i1, vk vk1, int i2, int i3, dlj.a a1) {
/* 27 */     this(☃, i, j, k, m, n, i1, vk1, i2, i3, a1, oe.d);
/*    */   }
/*    */   
/*    */   public dlr(int ☃, int i, int j, int k, int m, int n, int i1, vk vk1, int i2, int i3, dlj.a a1, nr nr1) {
/* 31 */     this(☃, i, j, k, m, n, i1, vk1, i2, i3, a1, s, nr1);
/*    */   }
/*    */   
/*    */   public dlr(int ☃, int i, int j, int k, int m, int n, int i1, vk vk1, int i2, int i3, dlj.a a1, dlj.b b1, nr nr1) {
/* 35 */     super(☃, i, j, k, nr1, a1, b1);
/* 36 */     this.e = i2;
/* 37 */     this.v = i3;
/* 38 */     this.b = m;
/* 39 */     this.c = n;
/* 40 */     this.d = i1;
/* 41 */     this.a = vk1;
/*    */   }
/*    */   
/*    */   public void a(int ☃, int i) {
/* 45 */     this.l = ☃;
/* 46 */     this.m = i;
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(dfm ☃, int i, int j, float f) {
/* 51 */     djz djz = djz.C();
/* 52 */     djz.M().a(this.a);
/*    */     
/* 54 */     int k = this.c;
/* 55 */     if (g()) {
/* 56 */       k += this.d;
/*    */     }
/*    */     
/* 59 */     RenderSystem.enableDepthTest();
/* 60 */     a(☃, this.l, this.m, this.b, k, this.j, this.k, this.e, this.v);
/*    */     
/* 62 */     if (g())
/* 63 */       a(☃, i, j); 
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dlr.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */