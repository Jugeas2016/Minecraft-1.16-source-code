/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class emp
/*    */   extends emc
/*    */ {
/*    */   public emp(adp ☃, adr adr1, float f1, float f2, fx fx1) {
/* 10 */     this(☃, adr1, f1, f2, fx1.u() + 0.5D, fx1.v() + 0.5D, fx1.w() + 0.5D);
/*    */   }
/*    */   
/*    */   public static emp a(adp ☃, float f) {
/* 14 */     return a(☃, f, 0.25F);
/*    */   }
/*    */   
/*    */   public static emp a(adp ☃, float f1, float f2) {
/* 18 */     return new emp(☃.a(), adr.a, f2, f1, false, 0, emt.a.a, 0.0D, 0.0D, 0.0D, true);
/*    */   }
/*    */   
/*    */   public static emp a(adp ☃) {
/* 22 */     return new emp(☃.a(), adr.b, 1.0F, 1.0F, false, 0, emt.a.a, 0.0D, 0.0D, 0.0D, true);
/*    */   }
/*    */   
/*    */   public static emp a(adp ☃, double d1, double d2, double d3) {
/* 26 */     return new emp(☃, adr.c, 4.0F, 1.0F, false, 0, emt.a.b, d1, d2, d3);
/*    */   }
/*    */   
/*    */   public static emp b(adp ☃, float f1, float f2) {
/* 30 */     return new emp(☃.a(), adr.i, f2, f1, false, 0, emt.a.a, 0.0D, 0.0D, 0.0D, true);
/*    */   }
/*    */   
/*    */   public static emp b(adp ☃) {
/* 34 */     return b(☃, 1.0F, 1.0F);
/*    */   }
/*    */   
/*    */   public static emp b(adp ☃, double d1, double d2, double d3) {
/* 38 */     return new emp(☃, adr.i, 1.0F, 1.0F, false, 0, emt.a.b, d1, d2, d3);
/*    */   }
/*    */   
/*    */   public emp(adp ☃, adr adr1, float f1, float f2, double d1, double d2, double d3) {
/* 42 */     this(☃, adr1, f1, f2, false, 0, emt.a.b, d1, d2, d3);
/*    */   }
/*    */   
/*    */   private emp(adp ☃, adr adr1, float f1, float f2, boolean bool, int i, emt.a a1, double d1, double d2, double d3) {
/* 46 */     this(☃.a(), adr1, f1, f2, bool, i, a1, d1, d2, d3, false);
/*    */   }
/*    */   
/*    */   public emp(vk ☃, adr adr1, float f1, float f2, boolean bool1, int i, emt.a a1, double d1, double d2, double d3, boolean bool2) {
/* 50 */     super(☃, adr1);
/* 51 */     this.d = f1;
/* 52 */     this.e = f2;
/* 53 */     this.f = d1;
/* 54 */     this.g = d2;
/* 55 */     this.h = d3;
/* 56 */     this.i = bool1;
/* 57 */     this.j = i;
/* 58 */     this.k = a1;
/* 59 */     this.m = bool2;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\emp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */