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
/*    */ public class bjb
/*    */   extends bic
/*    */ {
/*    */   private final aon c;
/*    */   private final bil d;
/*    */   
/*    */   public bjb(int ☃) {
/* 22 */     this(☃, new apa(1), new bjq(1));
/*    */   }
/*    */   
/*    */   public bjb(int ☃, aon aon1, bil bil1) {
/* 26 */     super(bje.q, ☃);
/* 27 */     a(aon1, 1);
/* 28 */     a(bil1, 1);
/* 29 */     this.c = aon1;
/* 30 */     this.d = bil1;
/* 31 */     a(new bjr(this, aon1, 0, 0, 0)
/*    */         {
/*    */           public void d() {
/* 34 */             super.d();
/* 35 */             this.a.a(this.c);
/*    */           }
/*    */         });
/*    */     
/* 39 */     a(bil1);
/*    */   }
/*    */   public boolean a(bfw ☃, int i) {
/*    */     int j;
/*    */     bmb bmb;
/* 44 */     if (i >= 100) {
/* 45 */       int k = i - 100;
/* 46 */       a(0, k);
/* 47 */       return true;
/*    */     } 
/*    */     
/* 50 */     switch (i) {
/*    */       case 2:
/* 52 */         j = this.d.a(0);
/* 53 */         a(0, j + 1);
/* 54 */         return true;
/*    */       
/*    */       case 1:
/* 57 */         j = this.d.a(0);
/* 58 */         a(0, j - 1);
/* 59 */         return true;
/*    */       
/*    */       case 3:
/* 62 */         if (!☃.eK()) {
/* 63 */           return false;
/*    */         }
/* 65 */         bmb = this.c.b(0);
/* 66 */         this.c.X_();
/* 67 */         if (!☃.bm.e(bmb)) {
/* 68 */           ☃.a(bmb, false);
/*    */         }
/* 70 */         return true;
/*    */     } 
/*    */     
/* 73 */     return false;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(int ☃, int i) {
/* 78 */     super.a(☃, i);
/* 79 */     c();
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(bfw ☃) {
/* 84 */     return this.c.a(☃);
/*    */   }
/*    */   
/*    */   public bmb e() {
/* 88 */     return this.c.a(0);
/*    */   }
/*    */   
/*    */   public int f() {
/* 92 */     return this.d.a(0);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bjb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */