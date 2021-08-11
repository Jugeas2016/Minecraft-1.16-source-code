/*    */ import java.util.Iterator;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ public class dks
/*    */ {
/* 25 */   private final gh<dkr> a = new gh<>(32);
/*    */   
/*    */   public static dks a(dko ☃) {
/* 28 */     dks dks1 = new dks();
/*    */     
/* 30 */     dks1.a((☃, i) -> (i > 0) ? -1 : ((blb)☃.b()).b(☃), new brw[] { bmd.kY, bmd.kZ, bmd.la, bmd.lb, bmd.pG });
/* 31 */     dks1.a((☃, i) -> brv.a(0.5D, 1.0D), new brw[] { bup.gY, bup.gZ });
/* 32 */     dks1.a((☃, i) -> {
/*    */           if (i != 1) {
/*    */             return -1;
/*    */           }
/*    */           
/*    */           md md = ☃.b("Explosion");
/* 38 */           int[] arrayOfInt = (md != null && md.c("Colors", 11)) ? md.n("Colors") : null;
/*    */           
/*    */           if (arrayOfInt == null || arrayOfInt.length == 0) {
/*    */             return 9079434;
/*    */           }
/*    */           
/*    */           if (arrayOfInt.length == 1) {
/*    */             return arrayOfInt[0];
/*    */           }
/*    */           
/*    */           int j = 0;
/*    */           
/*    */           int k = 0;
/*    */           
/*    */           int m = 0;
/*    */           
/*    */           for (int n : arrayOfInt) {
/*    */             j += (n & 0xFF0000) >> 16;
/*    */             k += (n & 0xFF00) >> 8;
/*    */             m += (n & 0xFF) >> 0;
/*    */           } 
/*    */           j /= arrayOfInt.length;
/*    */           k /= arrayOfInt.length;
/*    */           m /= arrayOfInt.length;
/*    */           return j << 16 | k << 8 | m;
/*    */         }new brw[] { bmd.pp });
/* 64 */     dks1.a((☃, i) -> (i > 0) ? -1 : bnv.c(☃), new brw[] { bmd.nv, bmd.qj, bmd.qm });
/*    */     
/* 66 */     for (Iterator<bna> iterator = bna.f().iterator(); iterator.hasNext(); ) { bna bna = iterator.next();
/* 67 */       dks1.a((bmb1, i) -> ☃.a(i), new brw[] { bna }); }
/*    */ 
/*    */     
/* 70 */     dks1.a((bmb1, i) -> { ceh ceh = ((bkh)bmb1.b()).e().n(); return ☃.a(ceh, null, null, i); }new brw[] { bup.i, bup.aR, bup.aS, bup.dP, bup.ah, bup.ai, bup.aj, bup.ak, bup.al, bup.am, bup.dU });
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 75 */     dks1.a((☃, i) -> (i == 0) ? bnv.c(☃) : -1, new brw[] { bmd.ql });
/* 76 */     dks1.a((☃, i) -> (i == 0) ? -1 : bmh.g(☃), new brw[] { bmd.nf });
/*    */     
/* 78 */     return dks1;
/*    */   }
/*    */   
/*    */   public int a(bmb ☃, int i) {
/* 82 */     dkr dkr = this.a.a(gm.T.a(☃.b()));
/*    */     
/* 84 */     return (dkr == null) ? -1 : dkr.getColor(☃, i);
/*    */   }
/*    */   
/*    */   public void a(dkr ☃, brw... arrayOfBrw) {
/* 88 */     for (brw brw1 : arrayOfBrw)
/* 89 */       this.a.a(☃, blx.a(brw1.h())); 
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dks.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */