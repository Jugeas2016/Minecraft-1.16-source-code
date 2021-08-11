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
/*    */ 
/*    */ public class drd
/*    */   extends dot
/*    */ {
/*    */   private final dot a;
/* 16 */   private static final nr b = (new of("multiplayerWarning.header")).a(k.r);
/* 17 */   private static final nr c = new of("multiplayerWarning.message");
/* 18 */   private static final nr p = new of("multiplayerWarning.check");
/* 19 */   private static final nr q = b.e().c("\n").a(c);
/*    */   
/*    */   private dll r;
/* 22 */   private dlu s = dlu.a;
/*    */   
/*    */   public drd(dot ☃) {
/* 25 */     super(dkz.a);
/* 26 */     this.a = ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   protected void b() {
/* 31 */     super.b();
/*    */     
/* 33 */     this.s = dlu.a(this.o, c, this.k - 50);
/*    */     
/* 35 */     this.o.getClass(); int ☃ = (this.s.a() + 1) * 9 * 2;
/* 36 */     a(new dlj(this.k / 2 - 155, 100 + ☃, 150, 20, nq.g, ☃ -> {
/*    */             if (this.r.a()) {
/*    */               this.i.k.ad = true;
/*    */               this.i.k.b();
/*    */             } 
/*    */             this.i.a(new drc(this.a));
/*    */           }));
/* 43 */     a(new dlj(this.k / 2 - 155 + 160, 100 + ☃, 150, 20, nq.h, ☃ -> this.i.a(this.a)));
/*    */ 
/*    */ 
/*    */     
/* 47 */     this.r = new dll(this.k / 2 - 155 + 80, 76 + ☃, 150, 20, p, false);
/* 48 */     a(this.r);
/*    */   }
/*    */ 
/*    */   
/*    */   public String ax_() {
/* 53 */     return q.getString();
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(dfm ☃, int i, int j, float f) {
/* 58 */     e(0);
/* 59 */     b(☃, this.o, b, 25, 30, 16777215);
/* 60 */     this.o.getClass(); this.s.b(☃, 25, 70, 9 * 2, 16777215);
/* 61 */     super.a(☃, i, j, f);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\drd.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */