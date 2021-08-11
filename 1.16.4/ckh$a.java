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
/*    */   extends crv<cmh>
/*    */ {
/*    */   private boolean e;
/*    */   
/*    */   public a(cla<cmh> ☃, int i, int j, cra cra1, int k, long l) {
/* 67 */     super(☃, i, j, cra1, k, l);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(gn ☃, cfy cfy1, csw csw1, int i, int j, bsv bsv1, cmh cmh1) {
/* 72 */     b(i, j);
/*    */   }
/*    */   
/*    */   private void b(int ☃, int i) {
/* 76 */     int j = ☃ * 16 - 29;
/* 77 */     int k = i * 16 - 29;
/* 78 */     gc gc = gc.c.a.a(this.d);
/*    */     
/* 80 */     this.b.add(new crl.h(this.d, j, k, gc));
/* 81 */     b();
/*    */     
/* 83 */     this.e = true;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(bsr ☃, bsn bsn1, cfy cfy1, Random random, cra cra1, brd brd1) {
/* 88 */     if (!this.e) {
/* 89 */       this.b.clear();
/* 90 */       b(f(), g());
/*    */     } 
/* 92 */     super.a(☃, bsn1, cfy1, random, cra1, brd1);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ckh$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */