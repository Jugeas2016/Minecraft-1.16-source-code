/*    */ import com.mojang.blaze3d.systems.RenderSystem;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class dlt
/*    */   extends dlj
/*    */ {
/*    */   private boolean a;
/*    */   
/*    */   public dlt(int ☃, int i, dlj.a a1) {
/* 13 */     super(☃, i, 20, 20, new of("narrator.button.difficulty_lock"), a1);
/*    */   }
/*    */ 
/*    */   
/*    */   protected nx c() {
/* 18 */     return super.c().c(". ").a(a() ? new of("narrator.button.difficulty_lock.locked") : new of("narrator.button.difficulty_lock.unlocked"));
/*    */   }
/*    */   
/*    */   public boolean a() {
/* 22 */     return this.a;
/*    */   }
/*    */   
/*    */   public void e(boolean ☃) {
/* 26 */     this.a = ☃;
/*    */   }
/*    */   
/*    */   public void b(dfm ☃, int i, int j, float f) {
/*    */     a a;
/* 31 */     djz.C().M().a(dlj.i);
/* 32 */     RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
/*    */ 
/*    */     
/* 35 */     if (!this.o) {
/* 36 */       a = this.a ? a.c : a.f;
/* 37 */     } else if (g()) {
/* 38 */       a = this.a ? a.b : a.e;
/*    */     } else {
/* 40 */       a = this.a ? a.a : a.d;
/*    */     } 
/*    */     
/* 43 */     b(☃, this.l, this.m, a.a(), a.b(), this.j, this.k);
/*    */   }
/*    */   
/*    */   enum a {
/* 47 */     a(0, 146),
/* 48 */     b(0, 166),
/* 49 */     c(0, 186),
/* 50 */     d(20, 146),
/* 51 */     e(20, 166),
/* 52 */     f(20, 186);
/*    */     
/*    */     private final int g;
/*    */     
/*    */     private final int h;
/*    */     
/*    */     a(int ☃, int i) {
/* 59 */       this.g = ☃;
/* 60 */       this.h = i;
/*    */     }
/*    */     
/*    */     public int a() {
/* 64 */       return this.g;
/*    */     }
/*    */     
/*    */     public int b() {
/* 68 */       return this.h;
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dlt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */