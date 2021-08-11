/*    */ import java.util.EnumSet;
/*    */ import java.util.List;
/*    */ import javax.annotation.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class avi
/*    */   extends avv
/*    */ {
/* 13 */   private static final azg d = (new azg()).a(8.0D).a().b().c();
/*    */   
/*    */   protected final azz a;
/*    */   private final Class<? extends azz> e;
/*    */   protected final brx b;
/*    */   protected azz c;
/*    */   private int f;
/*    */   private final double g;
/*    */   
/*    */   public avi(azz ☃, double d) {
/* 23 */     this(☃, d, (Class)☃.getClass());
/*    */   }
/*    */   
/*    */   public avi(azz ☃, double d, Class<? extends azz> clazz) {
/* 27 */     this.a = ☃;
/* 28 */     this.b = ☃.l;
/* 29 */     this.e = clazz;
/* 30 */     this.g = d;
/* 31 */     a(EnumSet.of(avv.a.a, avv.a.b));
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a() {
/* 36 */     if (!this.a.eS()) {
/* 37 */       return false;
/*    */     }
/* 39 */     this.c = h();
/* 40 */     return (this.c != null);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean b() {
/* 45 */     return (this.c.aX() && this.c.eS() && this.f < 60);
/*    */   }
/*    */ 
/*    */   
/*    */   public void d() {
/* 50 */     this.c = null;
/* 51 */     this.f = 0;
/*    */   }
/*    */ 
/*    */   
/*    */   public void e() {
/* 56 */     this.a.t().a(this.c, 10.0F, this.a.O());
/* 57 */     this.a.x().a(this.c, this.g);
/* 58 */     this.f++;
/* 59 */     if (this.f >= 60 && this.a.h(this.c) < 9.0D) {
/* 60 */       g();
/*    */     }
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   private azz h() {
/* 66 */     List<azz> ☃ = this.b.a(this.e, d, this.a, this.a.cc().g(8.0D));
/* 67 */     double d = Double.MAX_VALUE;
/* 68 */     azz azz1 = null;
/* 69 */     for (azz azz2 : ☃) {
/* 70 */       if (this.a.a(azz2) && this.a.h(azz2) < d) {
/* 71 */         azz1 = azz2;
/* 72 */         d = this.a.h(azz2);
/*    */       } 
/*    */     } 
/* 75 */     return azz1;
/*    */   }
/*    */   
/*    */   protected void g() {
/* 79 */     this.a.a((aag)this.b, this.c);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\avi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */