/*    */ import java.util.EnumSet;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class awl
/*    */   extends avv
/*    */ {
/*    */   private final aqu a;
/*    */   private aqm b;
/*    */   private double c;
/*    */   private double d;
/*    */   private double e;
/*    */   private final double f;
/*    */   private final float g;
/*    */   
/*    */   public awl(aqu ☃, double d, float f) {
/* 20 */     this.a = ☃;
/* 21 */     this.f = d;
/* 22 */     this.g = f;
/* 23 */     a(EnumSet.of(avv.a.a));
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a() {
/* 28 */     this.b = this.a.A();
/* 29 */     if (this.b == null) {
/* 30 */       return false;
/*    */     }
/* 32 */     if (this.b.h(this.a) > (this.g * this.g)) {
/* 33 */       return false;
/*    */     }
/* 35 */     dcn ☃ = azj.b(this.a, 16, 7, this.b.cA());
/* 36 */     if (☃ == null) {
/* 37 */       return false;
/*    */     }
/* 39 */     this.c = ☃.b;
/* 40 */     this.d = ☃.c;
/* 41 */     this.e = ☃.d;
/* 42 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean b() {
/* 47 */     return (!this.a.x().m() && this.b.aX() && this.b.h(this.a) < (this.g * this.g));
/*    */   }
/*    */ 
/*    */   
/*    */   public void d() {
/* 52 */     this.b = null;
/*    */   }
/*    */ 
/*    */   
/*    */   public void c() {
/* 57 */     this.a.x().a(this.c, this.d, this.e, this.f);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\awl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */