/*    */ import java.util.function.Supplier;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public enum bnj
/*    */   implements bnh
/*    */ {
/* 10 */   a(0, 59, 2.0F, 0.0F, 15, () -> bon.a(aeg.c)),
/* 11 */   b(1, 131, 4.0F, 1.0F, 5, () -> bon.a(aeg.ab)),
/* 12 */   c(2, 250, 6.0F, 2.0F, 14, () -> bon.a(new brw[] { bmd.kh })),
/* 13 */   d(3, 1561, 8.0F, 3.0F, 10, () -> bon.a(new brw[] { bmd.kg })),
/* 14 */   e(0, 32, 12.0F, 0.0F, 22, () -> bon.a(new brw[] { bmd.ki })),
/* 15 */   f(4, 2031, 9.0F, 4.0F, 15, () -> bon.a(new brw[] { bmd.kj }));
/*    */   
/*    */   private final int g;
/*    */   
/*    */   private final int h;
/*    */   private final float i;
/*    */   private final float j;
/*    */   private final int k;
/*    */   private final afi<bon> l;
/*    */   
/*    */   bnj(int ☃, int i, float f1, float f2, int j, Supplier<bon> supplier) {
/* 26 */     this.g = ☃;
/* 27 */     this.h = i;
/* 28 */     this.i = f1;
/* 29 */     this.j = f2;
/* 30 */     this.k = j;
/* 31 */     this.l = new afi<>(supplier);
/*    */   }
/*    */ 
/*    */   
/*    */   public int a() {
/* 36 */     return this.h;
/*    */   }
/*    */ 
/*    */   
/*    */   public float b() {
/* 41 */     return this.i;
/*    */   }
/*    */ 
/*    */   
/*    */   public float c() {
/* 46 */     return this.j;
/*    */   }
/*    */ 
/*    */   
/*    */   public int d() {
/* 51 */     return this.g;
/*    */   }
/*    */ 
/*    */   
/*    */   public int e() {
/* 56 */     return this.k;
/*    */   }
/*    */ 
/*    */   
/*    */   public bon f() {
/* 61 */     return this.l.a();
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bnj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */