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
/*    */ public abstract class crq
/*    */   extends cru
/*    */ {
/*    */   protected final int a;
/*    */   protected final int b;
/*    */   protected final int c;
/* 17 */   protected int d = -1;
/*    */   
/*    */   protected crq(clb ☃, Random random, int i, int j, int k, int m, int n, int i1) {
/* 20 */     super(☃, 0);
/*    */     
/* 22 */     this.a = m;
/* 23 */     this.b = n;
/* 24 */     this.c = i1;
/*    */     
/* 26 */     a(gc.c.a.a(random));
/*    */     
/* 28 */     if (i().n() == gc.a.c) {
/* 29 */       this.n = new cra(i, j, k, i + m - 1, j + n - 1, k + i1 - 1);
/*    */     } else {
/* 31 */       this.n = new cra(i, j, k, i + i1 - 1, j + n - 1, k + m - 1);
/*    */     } 
/*    */   }
/*    */   
/*    */   protected crq(clb ☃, md md1) {
/* 36 */     super(☃, md1);
/* 37 */     this.a = md1.h("Width");
/* 38 */     this.b = md1.h("Height");
/* 39 */     this.c = md1.h("Depth");
/* 40 */     this.d = md1.h("HPos");
/*    */   }
/*    */ 
/*    */   
/*    */   protected void a(md ☃) {
/* 45 */     ☃.b("Width", this.a);
/* 46 */     ☃.b("Height", this.b);
/* 47 */     ☃.b("Depth", this.c);
/* 48 */     ☃.b("HPos", this.d);
/*    */   }
/*    */   
/*    */   protected boolean a(bry ☃, cra cra1, int i) {
/* 52 */     if (this.d >= 0) {
/* 53 */       return true;
/*    */     }
/*    */     
/* 56 */     int j = 0;
/* 57 */     int k = 0;
/* 58 */     fx.a a = new fx.a();
/* 59 */     for (int m = this.n.c; m <= this.n.f; m++) {
/* 60 */       for (int n = this.n.a; n <= this.n.d; n++) {
/* 61 */         a.d(n, 64, m);
/* 62 */         if (cra1.b(a)) {
/* 63 */           j += ☃.a(chn.a.f, a).v();
/* 64 */           k++;
/*    */         } 
/*    */       } 
/*    */     } 
/*    */     
/* 69 */     if (k == 0) {
/* 70 */       return false;
/*    */     }
/* 72 */     this.d = j / k;
/* 73 */     this.n.a(0, this.d - this.n.b + i, 0);
/* 74 */     return true;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\crq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */