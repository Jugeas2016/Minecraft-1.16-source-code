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
/*    */ public class dvs<T extends aqn & bdu>
/*    */   extends dum<T>
/*    */ {
/*    */   public dvs() {
/* 15 */     this(0.0F, false);
/*    */   }
/*    */   
/*    */   public dvs(float ☃, boolean bool) {
/* 19 */     super(☃);
/*    */     
/* 21 */     if (!bool) {
/* 22 */       this.i = new dwn(this, 40, 16);
/* 23 */       this.i.a(-1.0F, -2.0F, -1.0F, 2.0F, 12.0F, 2.0F, ☃);
/* 24 */       this.i.a(-5.0F, 2.0F, 0.0F);
/*    */       
/* 26 */       this.j = new dwn(this, 40, 16);
/* 27 */       this.j.g = true;
/* 28 */       this.j.a(-1.0F, -2.0F, -1.0F, 2.0F, 12.0F, 2.0F, ☃);
/* 29 */       this.j.a(5.0F, 2.0F, 0.0F);
/*    */       
/* 31 */       this.k = new dwn(this, 0, 16);
/* 32 */       this.k.a(-1.0F, 0.0F, -1.0F, 2.0F, 12.0F, 2.0F, ☃);
/* 33 */       this.k.a(-2.0F, 12.0F, 0.0F);
/*    */       
/* 35 */       this.l = new dwn(this, 0, 16);
/* 36 */       this.l.g = true;
/* 37 */       this.l.a(-1.0F, 0.0F, -1.0F, 2.0F, 12.0F, 2.0F, ☃);
/* 38 */       this.l.a(2.0F, 12.0F, 0.0F);
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(T ☃, float f1, float f2, float f3) {
/* 44 */     this.n = dum.a.a;
/* 45 */     this.m = dum.a.a;
/*    */     
/* 47 */     bmb bmb = ☃.b(aot.a);
/* 48 */     if (bmb.b() == bmd.kc && ☃.eF()) {
/* 49 */       if (☃.dV() == aqi.b) {
/* 50 */         this.n = dum.a.d;
/*    */       } else {
/* 52 */         this.m = dum.a.d;
/*    */       } 
/*    */     }
/*    */     
/* 56 */     super.a(☃, f1, f2, f3);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(T ☃, float f1, float f2, float f3, float f4, float f5) {
/* 61 */     super.a(☃, f1, f2, f3, f4, f5);
/*    */     
/* 63 */     bmb bmb = ☃.dD();
/* 64 */     if (☃.eF() && (bmb.a() || bmb.b() != bmd.kc)) {
/* 65 */       float f6 = afm.a(this.c * 3.1415927F);
/* 66 */       float f7 = afm.a((1.0F - (1.0F - this.c) * (1.0F - this.c)) * 3.1415927F);
/* 67 */       this.i.f = 0.0F;
/* 68 */       this.j.f = 0.0F;
/* 69 */       this.i.e = -(0.1F - f6 * 0.6F);
/* 70 */       this.j.e = 0.1F - f6 * 0.6F;
/* 71 */       this.i.d = -1.5707964F;
/* 72 */       this.j.d = -1.5707964F;
/* 73 */       this.i.d -= f6 * 1.2F - f7 * 0.4F;
/* 74 */       this.j.d -= f6 * 1.2F - f7 * 0.4F;
/*    */       
/* 76 */       dtg.a(this.i, this.j, f3);
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(aqi ☃, dfm dfm1) {
/* 82 */     float f = (☃ == aqi.b) ? 1.0F : -1.0F;
/* 83 */     dwn dwn = a(☃);
/* 84 */     dwn.a += f;
/* 85 */     dwn.a(dfm1);
/* 86 */     dwn.a -= f;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dvs.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */