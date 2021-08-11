/*    */ import javax.annotation.Nullable;
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
/*    */ public class dxu
/*    */   extends dzb
/*    */ {
/*    */   private final float a;
/*    */   private final dyw b;
/*    */   
/*    */   private dxu(dwt ☃, double d1, double d2, double d3, float f1, float f2, float f3, dyw dyw1) {
/* 19 */     super(☃, d1, d2, d3);
/* 20 */     this.b = dyw1;
/*    */     
/* 22 */     this.v = f1;
/* 23 */     this.w = f2;
/* 24 */     this.x = f3;
/*    */     
/* 26 */     float f = 0.9F;
/*    */     
/* 28 */     this.B *= 0.67499995F;
/*    */     
/* 30 */     int i = (int)(32.0D / (Math.random() * 0.8D + 0.2D));
/* 31 */     this.t = (int)Math.max(i * 0.9F, 1.0F);
/* 32 */     b(dyw1);
/*    */     
/* 34 */     this.a = ((float)Math.random() - 0.5F) * 0.1F;
/* 35 */     this.z = (float)Math.random() * 6.2831855F;
/*    */   }
/*    */ 
/*    */   
/*    */   public dyk b() {
/* 40 */     return dyk.b;
/*    */   }
/*    */ 
/*    */   
/*    */   public float b(float ☃) {
/* 45 */     return this.B * afm.a((this.s + ☃) / this.t * 32.0F, 0.0F, 1.0F);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a() {
/* 50 */     this.d = this.g;
/* 51 */     this.e = this.h;
/* 52 */     this.f = this.i;
/*    */     
/* 54 */     if (this.s++ >= this.t) {
/* 55 */       j();
/*    */       
/*    */       return;
/*    */     } 
/* 59 */     b(this.b);
/*    */     
/* 61 */     this.A = this.z;
/* 62 */     this.z += 3.1415927F * this.a * 2.0F;
/* 63 */     if (this.m) {
/* 64 */       this.A = this.z = 0.0F;
/*    */     }
/*    */     
/* 67 */     a(this.j, this.k, this.l);
/* 68 */     this.k -= 0.003000000026077032D;
/* 69 */     this.k = Math.max(this.k, -0.14000000059604645D);
/*    */   }
/*    */   
/*    */   public static class a implements dyj<hc> {
/*    */     private final dyw a;
/*    */     
/*    */     public a(dyw ☃) {
/* 76 */       this.a = ☃;
/*    */     }
/*    */ 
/*    */     
/*    */     @Nullable
/*    */     public dyg a(hc ☃, dwt dwt1, double d1, double d2, double d3, double d4, double d5, double d6) {
/* 82 */       ceh ceh = ☃.c();
/* 83 */       if (!ceh.g() && ceh.h() == bzh.a) {
/* 84 */         return null;
/*    */       }
/*    */       
/* 87 */       fx fx = new fx(d1, d2, d3);
/* 88 */       int i = djz.C().al().a(ceh, dwt1, fx);
/* 89 */       if (ceh.b() instanceof bwo) {
/* 90 */         i = ((bwo)ceh.b()).c(ceh, dwt1, fx);
/*    */       }
/* 92 */       float f1 = (i >> 16 & 0xFF) / 255.0F;
/* 93 */       float f2 = (i >> 8 & 0xFF) / 255.0F;
/* 94 */       float f3 = (i & 0xFF) / 255.0F;
/*    */       
/* 96 */       return new dxu(dwt1, d1, d2, d3, f1, f2, f3, this.a);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dxu.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */