/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public enum a
/*    */ {
/* 11 */   a(false),
/* 12 */   b(true),
/* 13 */   c(false),
/* 14 */   d(false),
/* 15 */   e(true),
/* 16 */   f(true),
/* 17 */   g(false),
/* 18 */   h(false),
/* 19 */   i(true, 5393476),
/* 20 */   j(true, 3830373),
/* 21 */   k(true),
/* 22 */   l(true),
/* 23 */   m(true),
/* 24 */   n(true),
/* 25 */   o(true),
/* 26 */   p(true),
/* 27 */   q(true),
/* 28 */   r(true),
/* 29 */   s(true),
/* 30 */   t(true),
/* 31 */   u(true),
/* 32 */   v(true),
/* 33 */   w(true),
/* 34 */   x(true),
/* 35 */   y(true),
/* 36 */   z(true),
/* 37 */   A(true);
/*    */ 
/*    */   
/*    */   private final byte B;
/*    */ 
/*    */   
/*    */   private final boolean C;
/*    */   
/*    */   private final int D;
/*    */ 
/*    */   
/*    */   a(boolean ☃, int i) {
/* 49 */     this.B = (byte)ordinal();
/* 50 */     this.C = ☃;
/* 51 */     this.D = i;
/*    */   }
/*    */   
/*    */   public byte a() {
/* 55 */     return this.B;
/*    */   }
/*    */   
/*    */   public boolean b() {
/* 59 */     return this.C;
/*    */   }
/*    */   
/*    */   public boolean c() {
/* 63 */     return (this.D >= 0);
/*    */   }
/*    */   
/*    */   public int d() {
/* 67 */     return this.D;
/*    */   }
/*    */   
/*    */   public static a a(byte ☃) {
/* 71 */     return values()[afm.a(☃, 0, (values()).length - 1)];
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cxu$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */