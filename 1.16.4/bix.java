/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bix
/*    */   extends bic
/*    */ {
/*    */   private final aon c;
/*    */   
/*    */   public bix(int ☃, bfv bfv1) {
/* 16 */     this(☃, bfv1, new apa(5));
/*    */   }
/*    */   
/*    */   public bix(int ☃, bfv bfv1, aon aon1) {
/* 20 */     super(bje.p, ☃);
/* 21 */     this.c = aon1;
/* 22 */     a(aon1, 5);
/*    */     
/* 24 */     aon1.c_(bfv1.e);
/* 25 */     int i = 51;
/*    */     int j;
/* 27 */     for (j = 0; j < 5; j++) {
/* 28 */       a(new bjr(aon1, j, 44 + j * 18, 20));
/*    */     }
/*    */     
/* 31 */     for (j = 0; j < 3; j++) {
/* 32 */       for (int k = 0; k < 9; k++) {
/* 33 */         a(new bjr(bfv1, k + j * 9 + 9, 8 + k * 18, j * 18 + 51));
/*    */       }
/*    */     } 
/* 36 */     for (j = 0; j < 9; j++) {
/* 37 */       a(new bjr(bfv1, j, 8 + j * 18, 109));
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(bfw ☃) {
/* 43 */     return this.c.a(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public bmb b(bfw ☃, int i) {
/* 48 */     bmb bmb = bmb.b;
/* 49 */     bjr bjr = this.a.get(i);
/* 50 */     if (bjr != null && bjr.f()) {
/* 51 */       bmb bmb1 = bjr.e();
/* 52 */       bmb = bmb1.i();
/*    */       
/* 54 */       if (i < this.c.Z_()) {
/* 55 */         if (!a(bmb1, this.c.Z_(), this.a.size(), true)) {
/* 56 */           return bmb.b;
/*    */         }
/*    */       }
/* 59 */       else if (!a(bmb1, 0, this.c.Z_(), false)) {
/* 60 */         return bmb.b;
/*    */       } 
/*    */       
/* 63 */       if (bmb1.a()) {
/* 64 */         bjr.d(bmb.b);
/*    */       } else {
/* 66 */         bjr.d();
/*    */       } 
/*    */     } 
/* 69 */     return bmb;
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(bfw ☃) {
/* 74 */     super.b(☃);
/* 75 */     this.c.b_(☃);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bix.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */