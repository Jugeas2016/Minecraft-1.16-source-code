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
/*    */ public abstract class bgs
/*    */   extends bgt
/*    */   implements bgj
/*    */ {
/* 15 */   private static final us<bmb> b = uv.a((Class)bgs.class, uu.g);
/*    */   
/*    */   public bgs(aqe<? extends bgs> ☃, brx brx1) {
/* 18 */     super((aqe)☃, brx1);
/*    */   }
/*    */   
/*    */   public bgs(aqe<? extends bgs> ☃, double d1, double d2, double d3, brx brx1) {
/* 22 */     super((aqe)☃, d1, d2, d3, brx1);
/*    */   }
/*    */   
/*    */   public bgs(aqe<? extends bgs> ☃, aqm aqm1, brx brx1) {
/* 26 */     super((aqe)☃, aqm1, brx1);
/*    */   }
/*    */   
/*    */   public void b(bmb ☃) {
/* 30 */     if (☃.b() != h() || ☃.n()) {
/* 31 */       ab().b(b, x.a(☃.i(), ☃ -> ☃.e(1)));
/*    */     }
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   protected bmb i() {
/* 38 */     return ab().<bmb>a(b);
/*    */   }
/*    */ 
/*    */   
/*    */   public bmb g() {
/* 43 */     bmb ☃ = i();
/* 44 */     return ☃.a() ? new bmb(h()) : ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   protected void e() {
/* 49 */     ab().a(b, bmb.b);
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(md ☃) {
/* 54 */     super.b(☃);
/* 55 */     bmb bmb = i();
/* 56 */     if (!bmb.a()) {
/* 57 */       ☃.a("Item", bmb.b(new md()));
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(md ☃) {
/* 63 */     super.a(☃);
/* 64 */     bmb bmb = bmb.a(☃.p("Item"));
/* 65 */     b(bmb);
/*    */   }
/*    */   
/*    */   protected abstract blx h();
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bgs.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */