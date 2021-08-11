/*    */ import com.mojang.authlib.GameProfile;
/*    */ import java.util.UUID;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class dzn
/*    */   extends dzj
/*    */ {
/*    */   public dzn(dwt ☃, GameProfile gameProfile) {
/* 14 */     super(☃, gameProfile);
/*    */     
/* 16 */     this.G = 1.0F;
/* 17 */     this.H = true;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(double ☃) {
/* 22 */     double d = cc().a() * 10.0D;
/* 23 */     if (Double.isNaN(d)) {
/* 24 */       d = 1.0D;
/*    */     }
/* 26 */     d *= 64.0D * bW();
/* 27 */     return (☃ < d * d);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(apk ☃, float f) {
/* 32 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public void j() {
/* 37 */     super.j();
/* 38 */     a(this, false);
/*    */   }
/*    */   
/*    */   public void k() {
/*    */     float ☃;
/* 43 */     if (this.aU > 0) {
/* 44 */       double d1 = cD() + (this.aV - cD()) / this.aU;
/* 45 */       double d2 = cE() + (this.aW - cE()) / this.aU;
/* 46 */       double d3 = cH() + (this.aX - cH()) / this.aU;
/*    */       
/* 48 */       this.p = (float)(this.p + afm.g(this.aY - this.p) / this.aU);
/* 49 */       this.q = (float)(this.q + (this.aZ - this.q) / this.aU);
/*    */       
/* 51 */       this.aU--;
/* 52 */       d(d1, d2, d3);
/* 53 */       a(this.p, this.q);
/*    */     } 
/* 55 */     if (this.bb > 0) {
/* 56 */       this.aC = (float)(this.aC + afm.g(this.ba - this.aC) / this.bb);
/* 57 */       this.bb--;
/*    */     } 
/* 59 */     this.bs = this.bt;
/*    */     
/* 61 */     dA();
/*    */ 
/*    */     
/* 64 */     if (!this.t || dl()) {
/* 65 */       ☃ = 0.0F;
/*    */     } else {
/* 67 */       ☃ = Math.min(0.1F, afm.a(c(cC())));
/*    */     } 
/*    */ 
/*    */     
/* 71 */     if (this.t || dl()) {
/* 72 */       float f = 0.0F;
/*    */     } else {
/* 74 */       float f = (float)Math.atan(-(cC()).c * 0.20000000298023224D) * 15.0F;
/*    */     } 
/* 76 */     this.bt += (☃ - this.bt) * 0.4F;
/*    */     
/* 78 */     this.l.Z().a("push");
/* 79 */     dQ();
/* 80 */     this.l.Z().c();
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   protected void eu() {}
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void a(nr ☃, UUID uUID) {
/* 92 */     djz djz = djz.C();
/* 93 */     if (!djz.a(uUID))
/* 94 */       djz.j.c().a(☃); 
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dzn.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */