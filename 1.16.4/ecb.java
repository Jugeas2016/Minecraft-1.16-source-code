/*    */ import it.unimi.dsi.fastutil.ints.Int2IntFunction;
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
/*    */ public class ecb
/*    */   extends ece<ccf>
/*    */ {
/*    */   private final dwn a;
/*    */   private final dwn c;
/* 25 */   private final dwn[] d = new dwn[4];
/*    */   
/*    */   public ecb(ecd ☃) {
/* 28 */     super(☃);
/* 29 */     this.a = new dwn(64, 64, 0, 0);
/* 30 */     this.a.a(0.0F, 0.0F, 0.0F, 16.0F, 16.0F, 6.0F, 0.0F);
/* 31 */     this.c = new dwn(64, 64, 0, 22);
/* 32 */     this.c.a(0.0F, 0.0F, 0.0F, 16.0F, 16.0F, 6.0F, 0.0F);
/*    */     
/* 34 */     this.d[0] = new dwn(64, 64, 50, 0);
/* 35 */     this.d[1] = new dwn(64, 64, 50, 6);
/* 36 */     this.d[2] = new dwn(64, 64, 50, 12);
/* 37 */     this.d[3] = new dwn(64, 64, 50, 18);
/*    */     
/* 39 */     this.d[0].a(0.0F, 6.0F, -16.0F, 3.0F, 3.0F, 3.0F);
/* 40 */     this.d[1].a(0.0F, 6.0F, 0.0F, 3.0F, 3.0F, 3.0F);
/* 41 */     this.d[2].a(-16.0F, 6.0F, -16.0F, 3.0F, 3.0F, 3.0F);
/* 42 */     this.d[3].a(-16.0F, 6.0F, 0.0F, 3.0F, 3.0F, 3.0F);
/*    */     
/* 44 */     (this.d[0]).d = 1.5707964F;
/* 45 */     (this.d[1]).d = 1.5707964F;
/* 46 */     (this.d[2]).d = 1.5707964F;
/* 47 */     (this.d[3]).d = 1.5707964F;
/*    */     
/* 49 */     (this.d[0]).f = 0.0F;
/* 50 */     (this.d[1]).f = 1.5707964F;
/* 51 */     (this.d[2]).f = 4.712389F;
/* 52 */     (this.d[3]).f = 3.1415927F;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(ccf ☃, float f, dfm dfm1, eag eag1, int i, int j) {
/* 57 */     elr elr = ear.j[☃.d().b()];
/* 58 */     brx brx = ☃.v();
/* 59 */     if (brx != null) {
/* 60 */       ceh ceh = ☃.p();
/* 61 */       bwc.c<? extends ccf> c = bwc.a(cck.x, buj::h, buj::g, bve.b, ceh, brx, ☃.o(), (☃, fx1) -> false);
/* 62 */       int k = ((Int2IntFunction)c.<Int2IntFunction>apply(new ecf<>())).get(i);
/* 63 */       a(dfm1, eag1, (ceh.c(buj.a) == cev.a), (gc)ceh.c(buj.aq), elr, k, j, false);
/*    */     } else {
/* 65 */       a(dfm1, eag1, true, gc.d, elr, i, j, false);
/* 66 */       a(dfm1, eag1, false, gc.d, elr, i, j, true);
/*    */     } 
/*    */   }
/*    */   
/*    */   private void a(dfm ☃, eag eag1, boolean bool1, gc gc1, elr elr1, int i, int j, boolean bool2) {
/* 71 */     this.a.h = bool1;
/* 72 */     this.c.h = !bool1;
/* 73 */     (this.d[0]).h = !bool1;
/* 74 */     (this.d[1]).h = bool1;
/* 75 */     (this.d[2]).h = !bool1;
/* 76 */     (this.d[3]).h = bool1;
/*    */     
/* 78 */     ☃.a();
/*    */     
/* 80 */     ☃.a(0.0D, 0.5625D, bool2 ? -1.0D : 0.0D);
/*    */     
/* 82 */     ☃.a(g.b.a(90.0F));
/*    */     
/* 84 */     ☃.a(0.5D, 0.5D, 0.5D);
/* 85 */     ☃.a(g.f.a(180.0F + gc1.o()));
/* 86 */     ☃.a(-0.5D, -0.5D, -0.5D);
/*    */     
/* 88 */     dfq dfq = elr1.a(eag1, eao::b);
/* 89 */     this.a.a(☃, dfq, i, j);
/* 90 */     this.c.a(☃, dfq, i, j);
/* 91 */     this.d[0].a(☃, dfq, i, j);
/* 92 */     this.d[1].a(☃, dfq, i, j);
/* 93 */     this.d[2].a(☃, dfq, i, j);
/* 94 */     this.d[3].a(☃, dfq, i, j);
/*    */     
/* 96 */     ☃.b();
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ecb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */