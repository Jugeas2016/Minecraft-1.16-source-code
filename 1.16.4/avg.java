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
/*    */ public class avg
/*    */   extends avm
/*    */ {
/*    */   private final Predicate<aor> g;
/*    */   protected int a;
/* 17 */   protected int b = -1;
/* 18 */   protected int c = -1;
/*    */   
/*    */   public avg(aqn ☃, Predicate<aor> predicate) {
/* 21 */     super(☃);
/* 22 */     this.g = predicate;
/*    */   }
/*    */   
/*    */   public avg(aqn ☃, int i, Predicate<aor> predicate) {
/* 26 */     this(☃, predicate);
/* 27 */     this.c = i;
/*    */   }
/*    */   
/*    */   protected int f() {
/* 31 */     return Math.max(240, this.c);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a() {
/* 36 */     if (!super.a()) {
/* 37 */       return false;
/*    */     }
/* 39 */     if (!this.d.l.V().b(brt.b)) {
/* 40 */       return false;
/*    */     }
/* 42 */     return (a(this.d.l.ad()) && !g());
/*    */   }
/*    */ 
/*    */   
/*    */   public void c() {
/* 47 */     super.c();
/* 48 */     this.a = 0;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean b() {
/* 53 */     return (this.a <= f() && !g() && this.e.a(this.d.cA(), 2.0D) && a(this.d.l.ad()));
/*    */   }
/*    */ 
/*    */   
/*    */   public void d() {
/* 58 */     super.d();
/* 59 */     this.d.l.a(this.d.Y(), this.e, -1);
/*    */   }
/*    */ 
/*    */   
/*    */   public void e() {
/* 64 */     super.e();
/* 65 */     if (this.d.cY().nextInt(20) == 0) {
/* 66 */       this.d.l.c(1019, this.e, 0);
/* 67 */       if (!this.d.ai) {
/* 68 */         this.d.a(this.d.dX());
/*    */       }
/*    */     } 
/*    */     
/* 72 */     this.a++;
/*    */     
/* 74 */     int ☃ = (int)(this.a / f() * 10.0F);
/* 75 */     if (☃ != this.b) {
/* 76 */       this.d.l.a(this.d.Y(), this.e, ☃);
/* 77 */       this.b = ☃;
/*    */     } 
/*    */     
/* 80 */     if (this.a == f() && a(this.d.l.ad())) {
/* 81 */       this.d.l.a(this.e, false);
/* 82 */       this.d.l.c(1021, this.e, 0);
/* 83 */       this.d.l.c(2001, this.e, buo.i(this.d.l.d_(this.e)));
/*    */     } 
/*    */   }
/*    */   
/*    */   private boolean a(aor ☃) {
/* 88 */     return this.g.test(☃);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\avg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */