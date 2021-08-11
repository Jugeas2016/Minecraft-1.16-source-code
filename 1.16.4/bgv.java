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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bgv
/*    */   extends bgs
/*    */ {
/*    */   public bgv(aqe<? extends bgv> ☃, brx brx1) {
/* 23 */     super((aqe)☃, brx1);
/*    */   }
/*    */   
/*    */   public bgv(brx ☃, aqm aqm1) {
/* 27 */     super((aqe)aqe.aH, aqm1, ☃);
/*    */   }
/*    */   
/*    */   public bgv(brx ☃, double d1, double d2, double d3) {
/* 31 */     super((aqe)aqe.aH, d1, d2, d3, ☃);
/*    */   }
/*    */ 
/*    */   
/*    */   protected blx h() {
/* 36 */     return bmd.nq;
/*    */   }
/*    */ 
/*    */   
/*    */   protected void a(dck ☃) {
/* 41 */     super.a(☃);
/* 42 */     ☃.a().a(apk.b(this, v()), 0.0F);
/*    */   }
/*    */ 
/*    */   
/*    */   protected void a(dcl ☃) {
/* 47 */     super.a(☃);
/*    */     
/* 49 */     aqa aqa = v();
/*    */     
/* 51 */     for (int i = 0; i < 32; i++) {
/* 52 */       this.l.a(hh.Q, cD(), cE() + this.J.nextDouble() * 2.0D, cH(), this.J.nextGaussian(), 0.0D, this.J.nextGaussian());
/*    */     }
/*    */     
/* 55 */     if (!this.l.v && !this.y) {
/* 56 */       if (aqa instanceof aah) {
/* 57 */         aah aah = (aah)aqa;
/*    */         
/* 59 */         if (aah.b.a().h() && aah.l == this.l && !aah.em()) {
/* 60 */           if (this.J.nextFloat() < 0.05F && this.l.V().b(brt.d)) {
/* 61 */             bdh bdh = aqe.v.a(this.l);
/* 62 */             bdh.t(true);
/* 63 */             bdh.b(aqa.cD(), aqa.cE(), aqa.cH(), aqa.p, aqa.q);
/* 64 */             this.l.c(bdh);
/*    */           } 
/*    */           
/* 67 */           if (aqa.br()) {
/* 68 */             aqa.l();
/*    */           }
/* 70 */           aqa.a(cD(), cE(), cH());
/* 71 */           aqa.C = 0.0F;
/* 72 */           aqa.a(apk.k, 5.0F);
/*    */         } 
/* 74 */       } else if (aqa != null) {
/* 75 */         aqa.a(cD(), cE(), cH());
/* 76 */         aqa.C = 0.0F;
/*    */       } 
/* 78 */       ad();
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public void j() {
/* 84 */     aqa ☃ = v();
/* 85 */     if (☃ instanceof bfw && !☃.aX()) {
/* 86 */       ad();
/*    */     } else {
/* 88 */       super.j();
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   @Nullable
/*    */   public aqa b(aag ☃) {
/* 95 */     aqa aqa = v();
/* 96 */     if (aqa != null && aqa.l.Y() != ☃.Y()) {
/* 97 */       b((aqa)null);
/*    */     }
/* 99 */     return super.b(☃);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bgv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */