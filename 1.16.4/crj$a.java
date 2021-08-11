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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class a
/*    */   extends cqz<cmh>
/*    */ {
/*    */   public a(cla<cmh> ☃, int i, int j, cra cra1, int k, long l) {
/* 30 */     super(☃, i, j, cra1, k, l);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(gn ☃, cfy cfy1, csw csw1, int i, int j, bsv bsv1, cmh cmh1) {
/* 35 */     brd brd = new brd(i, j);
/* 36 */     int k = brd.d() + this.d.nextInt(16);
/* 37 */     int m = brd.e() + this.d.nextInt(16);
/*    */     
/* 39 */     int n = cfy1.f();
/*    */     
/* 41 */     int i1 = n + this.d.nextInt(cfy1.e() - 2 - n);
/*    */     
/* 43 */     brc brc = cfy1.a(k, m);
/*    */     
/* 45 */     fx.a a1 = new fx.a(k, i1, m);
/* 46 */     while (i1 > n) {
/* 47 */       ceh ceh1 = brc.d_(a1);
/*    */       
/* 49 */       a1.c(gc.a);
/*    */       
/* 51 */       ceh ceh2 = brc.d_(a1);
/* 52 */       if (ceh1.g() && (ceh2.a(bup.cM) || ceh2.d(brc, a1, gc.b))) {
/*    */         break;
/*    */       }
/*    */       
/* 56 */       i1--;
/*    */     } 
/*    */     
/* 59 */     if (i1 <= n) {
/*    */       return;
/*    */     }
/*    */     
/* 63 */     crk.a(csw1, this.b, this.d, new fx(k, i1, m));
/* 64 */     b();
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\crj$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */