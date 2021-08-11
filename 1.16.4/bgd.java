/*    */ import java.util.List;
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
/*    */ 
/*    */ public class bgd
/*    */   extends bgb
/*    */ {
/*    */   public bgd(aqe<? extends bgd> ☃, brx brx1) {
/* 24 */     super((aqe)☃, brx1);
/*    */   }
/*    */   
/*    */   public bgd(brx ☃, double d1, double d2, double d3, double d4, double d5, double d6) {
/* 28 */     super((aqe)aqe.p, d1, d2, d3, d4, d5, d6, ☃);
/*    */   }
/*    */   
/*    */   public bgd(brx ☃, aqm aqm1, double d1, double d2, double d3) {
/* 32 */     super((aqe)aqe.p, aqm1, d1, d2, d3, ☃);
/*    */   }
/*    */ 
/*    */   
/*    */   protected void a(dcl ☃) {
/* 37 */     super.a(☃);
/* 38 */     aqa aqa = v();
/* 39 */     if (☃.c() == dcl.a.c && ((dck)☃).a().s(aqa)) {
/*    */       return;
/*    */     }
/* 42 */     if (!this.l.v) {
/* 43 */       List<aqm> list = this.l.a(aqm.class, cc().c(4.0D, 2.0D, 4.0D));
/*    */       
/* 45 */       apz apz = new apz(this.l, cD(), cE(), cH());
/* 46 */       if (aqa instanceof aqm) {
/* 47 */         apz.a((aqm)aqa);
/*    */       }
/* 49 */       apz.a(hh.i);
/* 50 */       apz.a(3.0F);
/* 51 */       apz.b(600);
/* 52 */       apz.c((7.0F - apz.g()) / apz.m());
/* 53 */       apz.a(new apu(apw.g, 1, 1));
/*    */       
/* 55 */       if (!list.isEmpty()) {
/* 56 */         for (aqm aqm : list) {
/* 57 */           double d = h(aqm);
/* 58 */           if (d < 16.0D) {
/* 59 */             apz.d(aqm.cD(), aqm.cE(), aqm.cH());
/*    */             
/*    */             break;
/*    */           } 
/*    */         } 
/*    */       }
/* 65 */       this.l.c(2006, cB(), aA() ? -1 : 1);
/* 66 */       this.l.c(apz);
/*    */       
/* 68 */       ad();
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean aT() {
/* 74 */     return false;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(apk ☃, float f) {
/* 79 */     return false;
/*    */   }
/*    */ 
/*    */   
/*    */   protected hf h() {
/* 84 */     return hh.i;
/*    */   }
/*    */ 
/*    */   
/*    */   protected boolean W_() {
/* 89 */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bgd.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */