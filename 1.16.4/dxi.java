/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class dxi
/*    */   extends dzb
/*    */ {
/*    */   private final float a;
/*    */   private final float b;
/*    */   
/*    */   private dxi(dwt ☃, double d1, double d2, double d3, double d4, double d5, double d6, bmb bmb1) {
/* 16 */     this(☃, d1, d2, d3, bmb1);
/* 17 */     this.j *= 0.10000000149011612D;
/* 18 */     this.k *= 0.10000000149011612D;
/* 19 */     this.l *= 0.10000000149011612D;
/* 20 */     this.j += d4;
/* 21 */     this.k += d5;
/* 22 */     this.l += d6;
/*    */   }
/*    */ 
/*    */   
/*    */   public dyk b() {
/* 27 */     return dyk.a;
/*    */   }
/*    */   
/*    */   protected dxi(dwt ☃, double d1, double d2, double d3, bmb bmb1) {
/* 31 */     super(☃, d1, d2, d3, 0.0D, 0.0D, 0.0D);
/* 32 */     a(djz.C().ad().a(bmb1, ☃, (aqm)null).e());
/* 33 */     this.u = 1.0F;
/* 34 */     this.B /= 2.0F;
/*    */     
/* 36 */     this.a = this.r.nextFloat() * 3.0F;
/* 37 */     this.b = this.r.nextFloat() * 3.0F;
/*    */   }
/*    */ 
/*    */   
/*    */   protected float c() {
/* 42 */     return this.C.a(((this.a + 1.0F) / 4.0F * 16.0F));
/*    */   }
/*    */ 
/*    */   
/*    */   protected float d() {
/* 47 */     return this.C.a((this.a / 4.0F * 16.0F));
/*    */   }
/*    */ 
/*    */   
/*    */   protected float e() {
/* 52 */     return this.C.b((this.b / 4.0F * 16.0F));
/*    */   }
/*    */ 
/*    */   
/*    */   protected float f() {
/* 57 */     return this.C.b(((this.b + 1.0F) / 4.0F * 16.0F));
/*    */   }
/*    */   
/*    */   public static class a
/*    */     implements dyj<he> {
/*    */     public dyg a(he ☃, dwt dwt1, double d1, double d2, double d3, double d4, double d5, double d6) {
/* 63 */       return new dxi(dwt1, d1, d2, d3, d4, d5, d6, ☃.c());
/*    */     }
/*    */   }
/*    */   
/*    */   public static class b
/*    */     implements dyj<hi> {
/*    */     public dyg a(hi ☃, dwt dwt1, double d1, double d2, double d3, double d4, double d5, double d6) {
/* 70 */       return new dxi(dwt1, d1, d2, d3, new bmb(bmd.md));
/*    */     }
/*    */   }
/*    */   
/*    */   public static class c
/*    */     implements dyj<hi> {
/*    */     public dyg a(hi ☃, dwt dwt1, double d1, double d2, double d3, double d4, double d5, double d6) {
/* 77 */       return new dxi(dwt1, d1, d2, d3, new bmb(bmd.lQ));
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dxi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */