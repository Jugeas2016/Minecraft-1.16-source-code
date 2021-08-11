/*    */ import java.util.EnumSet;
/*    */ import java.util.Random;
/*    */ import javax.annotation.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class avo
/*    */   extends avv
/*    */ {
/*    */   protected final aqu a;
/*    */   private double b;
/*    */   private double c;
/*    */   private double d;
/*    */   private final double e;
/*    */   private final brx f;
/*    */   
/*    */   public avo(aqu ☃, double d) {
/* 22 */     this.a = ☃;
/* 23 */     this.e = d;
/* 24 */     this.f = ☃.l;
/* 25 */     a(EnumSet.of(avv.a.a));
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a() {
/* 30 */     if (this.a.A() != null) {
/* 31 */       return false;
/*    */     }
/* 33 */     if (!this.f.M()) {
/* 34 */       return false;
/*    */     }
/* 36 */     if (!this.a.bq()) {
/* 37 */       return false;
/*    */     }
/* 39 */     if (!this.f.e(this.a.cB())) {
/* 40 */       return false;
/*    */     }
/* 42 */     if (!this.a.b(aqf.f).a()) {
/* 43 */       return false;
/*    */     }
/*    */     
/* 46 */     return g();
/*    */   }
/*    */   
/*    */   protected boolean g() {
/* 50 */     dcn ☃ = h();
/* 51 */     if (☃ == null) {
/* 52 */       return false;
/*    */     }
/* 54 */     this.b = ☃.b;
/* 55 */     this.c = ☃.c;
/* 56 */     this.d = ☃.d;
/* 57 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean b() {
/* 62 */     return !this.a.x().m();
/*    */   }
/*    */ 
/*    */   
/*    */   public void c() {
/* 67 */     this.a.x().a(this.b, this.c, this.d, this.e);
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   protected dcn h() {
/* 72 */     Random ☃ = this.a.cY();
/* 73 */     fx fx = this.a.cB();
/*    */     
/* 75 */     for (int i = 0; i < 10; i++) {
/* 76 */       fx fx1 = fx.b(☃.nextInt(20) - 10, ☃.nextInt(6) - 3, ☃.nextInt(20) - 10);
/*    */       
/* 78 */       if (!this.f.e(fx1) && this.a.f(fx1) < 0.0F) {
/* 79 */         return dcn.c(fx1);
/*    */       }
/*    */     } 
/* 82 */     return null;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\avo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */