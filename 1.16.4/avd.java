/*    */ import java.util.EnumSet;
/*    */ import java.util.function.Predicate;
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
/*    */ public class avd<T extends aqm>
/*    */   extends avv
/*    */ {
/*    */   protected final aqu a;
/*    */   private final double i;
/*    */   private final double j;
/*    */   protected T b;
/*    */   protected final float c;
/*    */   protected cxd d;
/*    */   protected final ayj e;
/*    */   protected final Class<T> f;
/*    */   protected final Predicate<aqm> g;
/*    */   protected final Predicate<aqm> h;
/*    */   private final azg k;
/*    */   
/*    */   public avd(aqu ☃, Class<T> clazz, float f, double d1, double d2) {
/* 29 */     this(☃, clazz, ☃ -> true, f, d1, d2, aqd.e::test);
/*    */   }
/*    */   
/*    */   public avd(aqu ☃, Class<T> clazz, Predicate<aqm> predicate1, float f, double d1, double d2, Predicate<aqm> predicate2) {
/* 33 */     this.a = ☃;
/* 34 */     this.f = clazz;
/* 35 */     this.g = predicate1;
/* 36 */     this.c = f;
/* 37 */     this.i = d1;
/* 38 */     this.j = d2;
/* 39 */     this.h = predicate2;
/* 40 */     this.e = ☃.x();
/* 41 */     a(EnumSet.of(avv.a.a));
/*    */     
/* 43 */     this.k = (new azg()).a(f).a(predicate2.and(predicate1));
/*    */   }
/*    */   
/*    */   public avd(aqu ☃, Class<T> clazz, float f, double d1, double d2, Predicate<aqm> predicate) {
/* 47 */     this(☃, clazz, ☃ -> true, f, d1, d2, predicate);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a() {
/* 52 */     this.b = this.a.l.b(this.f, this.k, this.a, this.a.cD(), this.a.cE(), this.a.cH(), this.a.cc().c(this.c, 3.0D, this.c));
/* 53 */     if (this.b == null) {
/* 54 */       return false;
/*    */     }
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 60 */     dcn ☃ = azj.c(this.a, 16, 7, this.b.cA());
/* 61 */     if (☃ == null) {
/* 62 */       return false;
/*    */     }
/* 64 */     if (this.b.h(☃.b, ☃.c, ☃.d) < this.b.h(this.a)) {
/* 65 */       return false;
/*    */     }
/* 67 */     this.d = this.e.a(☃.b, ☃.c, ☃.d, 0);
/* 68 */     return (this.d != null);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean b() {
/* 73 */     return !this.e.m();
/*    */   }
/*    */ 
/*    */   
/*    */   public void c() {
/* 78 */     this.e.a(this.d, this.i);
/*    */   }
/*    */ 
/*    */   
/*    */   public void d() {
/* 83 */     this.b = null;
/*    */   }
/*    */ 
/*    */   
/*    */   public void e() {
/* 88 */     if (this.a.h((aqa)this.b) < 49.0D) {
/* 89 */       this.a.x().a(this.j);
/*    */     } else {
/* 91 */       this.a.x().a(this.i);
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\avd.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */