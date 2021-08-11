/*    */ import java.util.EnumSet;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class awv
/*    */   extends avv
/*    */ {
/*    */   private final aqn a;
/*    */   private final bdu b;
/*    */   private aqm c;
/* 14 */   private int d = -1;
/*    */   private final double e;
/*    */   private int f;
/*    */   private final int g;
/*    */   private final int h;
/*    */   private final float i;
/*    */   private final float j;
/*    */   
/*    */   public awv(bdu ☃, double d, int i, float f) {
/* 23 */     this(☃, d, i, i, f);
/*    */   }
/*    */   
/*    */   public awv(bdu ☃, double d, int i, int j, float f) {
/* 27 */     if (!(☃ instanceof aqm)) {
/* 28 */       throw new IllegalArgumentException("ArrowAttackGoal requires Mob implements RangedAttackMob");
/*    */     }
/* 30 */     this.b = ☃;
/* 31 */     this.a = (aqn)☃;
/* 32 */     this.e = d;
/* 33 */     this.g = i;
/* 34 */     this.h = j;
/* 35 */     this.i = f;
/* 36 */     this.j = f * f;
/* 37 */     a(EnumSet.of(avv.a.a, avv.a.b));
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a() {
/* 42 */     aqm ☃ = this.a.A();
/* 43 */     if (☃ == null || !☃.aX()) {
/* 44 */       return false;
/*    */     }
/* 46 */     this.c = ☃;
/* 47 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean b() {
/* 52 */     return (a() || !this.a.x().m());
/*    */   }
/*    */ 
/*    */   
/*    */   public void d() {
/* 57 */     this.c = null;
/* 58 */     this.f = 0;
/* 59 */     this.d = -1;
/*    */   }
/*    */ 
/*    */   
/*    */   public void e() {
/* 64 */     double ☃ = this.a.h(this.c.cD(), this.c.cE(), this.c.cH());
/* 65 */     boolean bool = this.a.z().a(this.c);
/*    */     
/* 67 */     if (bool) {
/* 68 */       this.f++;
/*    */     } else {
/* 70 */       this.f = 0;
/*    */     } 
/*    */     
/* 73 */     if (☃ > this.j || this.f < 5) {
/* 74 */       this.a.x().a(this.c, this.e);
/*    */     } else {
/* 76 */       this.a.x().o();
/*    */     } 
/*    */     
/* 79 */     this.a.t().a(this.c, 30.0F, 30.0F);
/*    */     
/* 81 */     if (--this.d == 0) {
/* 82 */       if (!bool) {
/*    */         return;
/*    */       }
/*    */       
/* 86 */       float f1 = afm.a(☃) / this.i;
/* 87 */       float f2 = f1;
/* 88 */       f2 = afm.a(f2, 0.1F, 1.0F);
/*    */       
/* 90 */       this.b.a(this.c, f2);
/* 91 */       this.d = afm.d(f1 * (this.h - this.g) + this.g);
/* 92 */     } else if (this.d < 0) {
/* 93 */       float f = afm.a(☃) / this.i;
/* 94 */       this.d = afm.d(f * (this.h - this.g) + this.g);
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\awv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */