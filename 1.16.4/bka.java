/*    */ import java.util.function.Supplier;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public enum bka
/*    */   implements bjz
/*    */ {
/* 12 */   a("leather", 5, new int[] { 1, 2, 3, 1 }, 15, adq.P, 0.0F, 0.0F, () -> bon.a(new brw[] { bmd.lS })),
/* 13 */   b("chainmail", 15, new int[] { 1, 4, 5, 2 }, 12, adq.J, 0.0F, 0.0F, () -> bon.a(new brw[] { bmd.kh })),
/* 14 */   c("iron", 15, new int[] { 2, 5, 6, 2 }, 9, adq.O, 0.0F, 0.0F, () -> bon.a(new brw[] { bmd.kh })),
/* 15 */   d("gold", 7, new int[] { 1, 3, 5, 2 }, 25, adq.N, 0.0F, 0.0F, () -> bon.a(new brw[] { bmd.ki })),
/* 16 */   e("diamond", 33, new int[] { 3, 6, 8, 3 }, 10, adq.K, 2.0F, 0.0F, () -> bon.a(new brw[] { bmd.kg })),
/* 17 */   f("turtle", 25, new int[] { 2, 5, 6, 2 }, 9, adq.R, 0.0F, 0.0F, () -> bon.a(new brw[] { bmd.jZ })),
/* 18 */   g("netherite", 37, new int[] { 3, 6, 8, 3 }, 15, adq.Q, 3.0F, 0.1F, () -> bon.a(new brw[] { bmd.kj }));
/*    */   private static final int[] h;
/*    */   
/*    */   static {
/* 22 */     h = new int[] { 13, 15, 16, 11 };
/*    */   }
/*    */ 
/*    */   
/*    */   private final String i;
/*    */   private final int j;
/*    */   private final int[] k;
/*    */   private final int l;
/*    */   private final adp m;
/*    */   private final float n;
/*    */   private final float o;
/*    */   private final afi<bon> p;
/*    */   
/*    */   bka(String ☃, int i, int[] arrayOfInt, int j, adp adp1, float f1, float f2, Supplier<bon> supplier) {
/* 36 */     this.i = ☃;
/* 37 */     this.j = i;
/* 38 */     this.k = arrayOfInt;
/* 39 */     this.l = j;
/* 40 */     this.m = adp1;
/* 41 */     this.n = f1;
/* 42 */     this.o = f2;
/* 43 */     this.p = new afi<>(supplier);
/*    */   }
/*    */ 
/*    */   
/*    */   public int a(aqf ☃) {
/* 48 */     return h[☃.b()] * this.j;
/*    */   }
/*    */ 
/*    */   
/*    */   public int b(aqf ☃) {
/* 53 */     return this.k[☃.b()];
/*    */   }
/*    */ 
/*    */   
/*    */   public int a() {
/* 58 */     return this.l;
/*    */   }
/*    */ 
/*    */   
/*    */   public adp b() {
/* 63 */     return this.m;
/*    */   }
/*    */ 
/*    */   
/*    */   public bon c() {
/* 68 */     return this.p.a();
/*    */   }
/*    */ 
/*    */   
/*    */   public String d() {
/* 73 */     return this.i;
/*    */   }
/*    */ 
/*    */   
/*    */   public float e() {
/* 78 */     return this.n;
/*    */   }
/*    */ 
/*    */   
/*    */   public float f() {
/* 83 */     return this.o;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bka.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */