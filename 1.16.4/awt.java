/*    */ import java.util.EnumSet;
/*    */ import javax.annotation.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class awt
/*    */   extends avv
/*    */ {
/*    */   protected final aqu a;
/*    */   protected double b;
/*    */   protected double c;
/*    */   protected double d;
/*    */   protected final double e;
/*    */   protected int f;
/*    */   protected boolean g;
/*    */   private boolean h;
/*    */   
/*    */   public awt(aqu ☃, double d) {
/* 23 */     this(☃, d, 120);
/*    */   }
/*    */   
/*    */   public awt(aqu ☃, double d, int i) {
/* 27 */     this(☃, d, i, true);
/*    */   }
/*    */   
/*    */   public awt(aqu ☃, double d, int i, boolean bool) {
/* 31 */     this.a = ☃;
/* 32 */     this.e = d;
/* 33 */     this.f = i;
/* 34 */     this.h = bool;
/* 35 */     a(EnumSet.of(avv.a.a));
/*    */   }
/*    */   
/*    */   public boolean a() {
/* 39 */     if (this.a.bs()) {
/* 40 */       return false;
/*    */     }
/* 42 */     if (!this.g) {
/* 43 */       if (this.h && this.a.dd() >= 100) {
/* 44 */         return false;
/*    */       }
/* 46 */       if (this.a.cY().nextInt(this.f) != 0) {
/* 47 */         return false;
/*    */       }
/*    */     } 
/*    */     
/* 51 */     dcn ☃ = g();
/*    */     
/* 53 */     if (☃ == null) {
/* 54 */       return false;
/*    */     }
/*    */     
/* 57 */     this.b = ☃.b;
/* 58 */     this.c = ☃.c;
/* 59 */     this.d = ☃.d;
/* 60 */     this.g = false;
/* 61 */     return true;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   protected dcn g() {
/* 66 */     return azj.a(this.a, 10, 7);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean b() {
/* 71 */     return (!this.a.x().m() && !this.a.bs());
/*    */   }
/*    */ 
/*    */   
/*    */   public void c() {
/* 76 */     this.a.x().a(this.b, this.c, this.d, this.e);
/*    */   }
/*    */ 
/*    */   
/*    */   public void d() {
/* 81 */     this.a.x().o();
/* 82 */     super.d();
/*    */   }
/*    */   
/*    */   public void h() {
/* 86 */     this.g = true;
/*    */   }
/*    */   
/*    */   public void a(int ☃) {
/* 90 */     this.f = ☃;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\awt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */