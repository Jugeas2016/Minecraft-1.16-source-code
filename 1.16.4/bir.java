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
/*    */ public class bir
/*    */   extends bic
/*    */ {
/*    */   private final aon c;
/*    */   
/*    */   public bir(int ☃, bfv bfv1) {
/* 21 */     this(☃, bfv1, new apa(9));
/*    */   }
/*    */   
/*    */   public bir(int ☃, bfv bfv1, aon aon1) {
/* 25 */     super(bje.g, ☃);
/* 26 */     a(aon1, 9);
/* 27 */     this.c = aon1;
/* 28 */     aon1.c_(bfv1.e);
/*    */     int i;
/* 30 */     for (i = 0; i < 3; i++) {
/* 31 */       for (int j = 0; j < 3; j++) {
/* 32 */         a(new bjr(aon1, j + i * 3, 62 + j * 18, 17 + i * 18));
/*    */       }
/*    */     } 
/*    */     
/* 36 */     for (i = 0; i < 3; i++) {
/* 37 */       for (int j = 0; j < 9; j++) {
/* 38 */         a(new bjr(bfv1, j + i * 9 + 9, 8 + j * 18, 84 + i * 18));
/*    */       }
/*    */     } 
/* 41 */     for (i = 0; i < 9; i++) {
/* 42 */       a(new bjr(bfv1, i, 8 + i * 18, 142));
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(bfw ☃) {
/* 48 */     return this.c.a(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public bmb b(bfw ☃, int i) {
/* 53 */     bmb bmb = bmb.b;
/* 54 */     bjr bjr = this.a.get(i);
/* 55 */     if (bjr != null && bjr.f()) {
/* 56 */       bmb bmb1 = bjr.e();
/* 57 */       bmb = bmb1.i();
/*    */       
/* 59 */       if (i < 9) {
/* 60 */         if (!a(bmb1, 9, 45, true)) {
/* 61 */           return bmb.b;
/*    */         }
/*    */       }
/* 64 */       else if (!a(bmb1, 0, 9, false)) {
/* 65 */         return bmb.b;
/*    */       } 
/*    */       
/* 68 */       if (bmb1.a()) {
/* 69 */         bjr.d(bmb.b);
/*    */       } else {
/* 71 */         bjr.d();
/*    */       } 
/* 73 */       if (bmb1.E() == bmb.E())
/*    */       {
/* 75 */         return bmb.b;
/*    */       }
/* 77 */       bjr.a(☃, bmb1);
/*    */     } 
/*    */     
/* 80 */     return bmb;
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(bfw ☃) {
/* 85 */     super.b(☃);
/* 86 */     this.c.b_(☃);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bir.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */