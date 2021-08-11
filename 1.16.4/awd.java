/*    */ import java.util.EnumSet;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class awd
/*    */   extends avv
/*    */ {
/*    */   protected final aqn a;
/*    */   protected aqa b;
/*    */   protected final float c;
/*    */   private int g;
/*    */   protected final float d;
/*    */   protected final Class<? extends aqm> e;
/*    */   protected final azg f;
/*    */   
/*    */   public awd(aqn ☃, Class<? extends aqm> clazz, float f) {
/* 22 */     this(☃, clazz, f, 0.02F);
/*    */   }
/*    */   
/*    */   public awd(aqn ☃, Class<? extends aqm> clazz, float f1, float f2) {
/* 26 */     this.a = ☃;
/* 27 */     this.e = clazz;
/* 28 */     this.c = f1;
/* 29 */     this.d = f2;
/* 30 */     a(EnumSet.of(avv.a.b));
/*    */     
/* 32 */     if (clazz == bfw.class) {
/* 33 */       this.f = (new azg()).a(f1).b().a().d().a(aqm1 -> aqd.b(☃).test(aqm1));
/*    */     } else {
/* 35 */       this.f = (new azg()).a(f1).b().a().d();
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a() {
/* 41 */     if (this.a.cY().nextFloat() >= this.d) {
/* 42 */       return false;
/*    */     }
/*    */ 
/*    */     
/* 46 */     if (this.a.A() != null) {
/* 47 */       this.b = this.a.A();
/*    */     }
/* 49 */     if (this.e == bfw.class) {
/* 50 */       this.b = this.a.l.a(this.f, this.a, this.a.cD(), this.a.cG(), this.a.cH());
/*    */     } else {
/* 52 */       this.b = this.a.l.b((Class)this.e, this.f, this.a, this.a.cD(), this.a.cG(), this.a.cH(), this.a.cc().c(this.c, 3.0D, this.c));
/*    */     } 
/*    */     
/* 55 */     return (this.b != null);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean b() {
/* 60 */     if (!this.b.aX()) {
/* 61 */       return false;
/*    */     }
/* 63 */     if (this.a.h(this.b) > (this.c * this.c)) {
/* 64 */       return false;
/*    */     }
/* 66 */     return (this.g > 0);
/*    */   }
/*    */ 
/*    */   
/*    */   public void c() {
/* 71 */     this.g = 40 + this.a.cY().nextInt(40);
/*    */   }
/*    */ 
/*    */   
/*    */   public void d() {
/* 76 */     this.b = null;
/*    */   }
/*    */ 
/*    */   
/*    */   public void e() {
/* 81 */     this.a.t().a(this.b.cD(), this.b.cG(), this.b.cH());
/* 82 */     this.g--;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\awd.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */