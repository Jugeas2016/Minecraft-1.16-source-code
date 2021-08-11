/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bjo
/*    */   extends bic
/*    */ {
/*    */   private final aon c;
/*    */   
/*    */   public bjo(int ☃, bfv bfv1) {
/* 16 */     this(☃, bfv1, new apa(27));
/*    */   }
/*    */   
/*    */   public bjo(int ☃, bfv bfv1, aon aon1) {
/* 20 */     super(bje.t, ☃);
/* 21 */     a(aon1, 27);
/* 22 */     this.c = aon1;
/* 23 */     aon1.c_(bfv1.e);
/*    */     
/* 25 */     int i = 3;
/* 26 */     int j = 9;
/*    */     int k;
/* 28 */     for (k = 0; k < 3; k++) {
/* 29 */       for (int m = 0; m < 9; m++) {
/* 30 */         a(new bjp(aon1, m + k * 9, 8 + m * 18, 18 + k * 18));
/*    */       }
/*    */     } 
/*    */     
/* 34 */     for (k = 0; k < 3; k++) {
/* 35 */       for (int m = 0; m < 9; m++) {
/* 36 */         a(new bjr(bfv1, m + k * 9 + 9, 8 + m * 18, 84 + k * 18));
/*    */       }
/*    */     } 
/* 39 */     for (k = 0; k < 9; k++) {
/* 40 */       a(new bjr(bfv1, k, 8 + k * 18, 142));
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(bfw ☃) {
/* 46 */     return this.c.a(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public bmb b(bfw ☃, int i) {
/* 51 */     bmb bmb = bmb.b;
/* 52 */     bjr bjr = this.a.get(i);
/* 53 */     if (bjr != null && bjr.f()) {
/* 54 */       bmb bmb1 = bjr.e();
/* 55 */       bmb = bmb1.i();
/*    */       
/* 57 */       if (i < this.c.Z_()) {
/* 58 */         if (!a(bmb1, this.c.Z_(), this.a.size(), true)) {
/* 59 */           return bmb.b;
/*    */         }
/*    */       }
/* 62 */       else if (!a(bmb1, 0, this.c.Z_(), false)) {
/* 63 */         return bmb.b;
/*    */       } 
/*    */       
/* 66 */       if (bmb1.a()) {
/* 67 */         bjr.d(bmb.b);
/*    */       } else {
/* 69 */         bjr.d();
/*    */       } 
/*    */     } 
/* 72 */     return bmb;
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(bfw ☃) {
/* 77 */     super.b(☃);
/* 78 */     this.c.b_(☃);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bjo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */