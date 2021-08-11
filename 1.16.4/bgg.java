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
/*    */ public abstract class bgg
/*    */   extends bgb
/*    */   implements bgj
/*    */ {
/* 15 */   private static final us<bmb> e = uv.a((Class)bgg.class, uu.g);
/*    */   
/*    */   public bgg(aqe<? extends bgg> ☃, brx brx1) {
/* 18 */     super((aqe)☃, brx1);
/*    */   }
/*    */   
/*    */   public bgg(aqe<? extends bgg> ☃, double d1, double d2, double d3, double d4, double d5, double d6, brx brx1) {
/* 22 */     super((aqe)☃, d1, d2, d3, d4, d5, d6, brx1);
/*    */   }
/*    */   
/*    */   public bgg(aqe<? extends bgg> ☃, aqm aqm1, double d1, double d2, double d3, brx brx1) {
/* 26 */     super((aqe)☃, aqm1, d1, d2, d3, brx1);
/*    */   }
/*    */   
/*    */   public void b(bmb ☃) {
/* 30 */     if (☃.b() != bmd.oS || ☃.n()) {
/* 31 */       ab().b(e, x.a(☃.i(), ☃ -> ☃.e(1)));
/*    */     }
/*    */   }
/*    */   
/*    */   protected bmb k() {
/* 36 */     return ab().<bmb>a(e);
/*    */   }
/*    */ 
/*    */   
/*    */   public bmb g() {
/* 41 */     bmb ☃ = k();
/* 42 */     return ☃.a() ? new bmb(bmd.oS) : ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   protected void e() {
/* 47 */     ab().a(e, bmb.b);
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(md ☃) {
/* 52 */     super.b(☃);
/* 53 */     bmb bmb = k();
/* 54 */     if (!bmb.a()) {
/* 55 */       ☃.a("Item", bmb.b(new md()));
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(md ☃) {
/* 61 */     super.a(☃);
/* 62 */     bmb bmb = bmb.a(☃.p("Item"));
/* 63 */     b(bmb);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bgg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */