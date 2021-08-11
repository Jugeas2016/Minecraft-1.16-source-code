/*    */ import java.util.Random;
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
/*    */ public class bkb
/*    */   extends blx
/*    */ {
/*    */   public bkb(blx.a ☃) {
/* 24 */     super(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public aou a(boa ☃) {
/* 29 */     gc gc = ☃.j();
/* 30 */     if (gc == gc.a) {
/* 31 */       return aou.d;
/*    */     }
/*    */     
/* 34 */     brx brx = ☃.p();
/* 35 */     bny bny = new bny(☃);
/* 36 */     fx fx = bny.a();
/*    */     
/* 38 */     bmb bmb = ☃.m();
/* 39 */     dcn dcn = dcn.c(fx);
/* 40 */     dci dci = aqe.b.l().a(dcn.a(), dcn.b(), dcn.c());
/*    */     
/* 42 */     if (!brx.b((aqa)null, dci, ☃ -> true) || !brx.a((aqa)null, dci).isEmpty()) {
/* 43 */       return aou.d;
/*    */     }
/*    */     
/* 46 */     if (brx instanceof aag) {
/* 47 */       aag aag = (aag)brx;
/* 48 */       bcn bcn = aqe.b.b(aag, bmb.o(), null, ☃.n(), fx, aqp.m, true, true);
/*    */       
/* 50 */       if (bcn == null) {
/* 51 */         return aou.d;
/*    */       }
/*    */       
/* 54 */       aag.l(bcn);
/*    */       
/* 56 */       float f = afm.d((afm.g(☃.h() - 180.0F) + 22.5F) / 45.0F) * 45.0F;
/* 57 */       bcn.b(bcn.cD(), bcn.cE(), bcn.cH(), f, 0.0F);
/*    */       
/* 59 */       a(bcn, brx.t);
/* 60 */       brx.c(bcn);
/*    */       
/* 62 */       brx.a((bfw)null, bcn.cD(), bcn.cE(), bcn.cH(), adq.V, adr.e, 0.75F, 0.8F);
/*    */     } 
/*    */     
/* 65 */     bmb.g(1);
/* 66 */     return aou.a(brx.v);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   private void a(bcn ☃, Random random) {
/* 75 */     go go1 = ☃.r();
/* 76 */     float f1 = random.nextFloat() * 5.0F;
/* 77 */     float f2 = random.nextFloat() * 20.0F - 10.0F;
/* 78 */     go go2 = new go(go1.b() + f1, go1.c() + f2, go1.d());
/* 79 */     ☃.a(go2);
/*    */     
/* 81 */     go1 = ☃.t();
/* 82 */     f1 = random.nextFloat() * 10.0F - 5.0F;
/* 83 */     go2 = new go(go1.b(), go1.c() + f1, go1.d());
/* 84 */     ☃.b(go2);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bkb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */