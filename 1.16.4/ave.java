/*    */ import java.util.EnumSet;
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
/*    */ public class ave
/*    */   extends avv
/*    */ {
/*    */   private final baz a;
/*    */   private bfw b;
/*    */   private final brx c;
/*    */   private final float d;
/*    */   private int e;
/*    */   private final azg f;
/*    */   
/*    */   public ave(baz ☃, float f) {
/* 23 */     this.a = ☃;
/* 24 */     this.c = ☃.l;
/* 25 */     this.d = f;
/* 26 */     this.f = (new azg()).a(f).a().b().d();
/* 27 */     a(EnumSet.of(avv.a.b));
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a() {
/* 32 */     this.b = this.c.a(this.f, this.a);
/* 33 */     if (this.b == null) {
/* 34 */       return false;
/*    */     }
/* 36 */     return a(this.b);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean b() {
/* 41 */     if (!this.b.aX()) {
/* 42 */       return false;
/*    */     }
/* 44 */     if (this.a.h(this.b) > (this.d * this.d)) {
/* 45 */       return false;
/*    */     }
/* 47 */     return (this.e > 0 && a(this.b));
/*    */   }
/*    */ 
/*    */   
/*    */   public void c() {
/* 52 */     this.a.x(true);
/* 53 */     this.e = 40 + this.a.cY().nextInt(40);
/*    */   }
/*    */ 
/*    */   
/*    */   public void d() {
/* 58 */     this.a.x(false);
/* 59 */     this.b = null;
/*    */   }
/*    */ 
/*    */   
/*    */   public void e() {
/* 64 */     this.a.t().a(this.b.cD(), this.b.cG(), this.b.cH(), 10.0F, this.a.O());
/* 65 */     this.e--;
/*    */   }
/*    */   
/*    */   private boolean a(bfw ☃) {
/* 69 */     for (aot aot : aot.values()) {
/* 70 */       bmb bmb = ☃.b(aot);
/* 71 */       if (this.a.eK() && bmb.b() == bmd.mL) {
/* 72 */         return true;
/*    */       }
/* 74 */       if (this.a.k(bmb)) {
/* 75 */         return true;
/*    */       }
/*    */     } 
/* 78 */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ave.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */