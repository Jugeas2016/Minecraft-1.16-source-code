/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bjh
/*    */   extends bjr
/*    */ {
/*    */   private final bjf a;
/*    */   private final bfw b;
/*    */   private int g;
/*    */   private final bqu h;
/*    */   
/*    */   public bjh(bfw ☃, bqu bqu1, bjf bjf1, int i, int j, int k) {
/* 16 */     super(bjf1, i, j, k);
/* 17 */     this.b = ☃;
/* 18 */     this.h = bqu1;
/* 19 */     this.a = bjf1;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(bmb ☃) {
/* 24 */     return false;
/*    */   }
/*    */ 
/*    */   
/*    */   public bmb a(int ☃) {
/* 29 */     if (f()) {
/* 30 */       this.g += Math.min(☃, e().E());
/*    */     }
/* 32 */     return super.a(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   protected void a(bmb ☃, int i) {
/* 37 */     this.g += i;
/* 38 */     c(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   protected void c(bmb ☃) {
/* 43 */     ☃.a(this.b.l, this.b, this.g);
/* 44 */     this.g = 0;
/*    */   }
/*    */ 
/*    */   
/*    */   public bmb a(bfw ☃, bmb bmb1) {
/* 49 */     c(bmb1);
/*    */     
/* 51 */     bqv bqv = this.a.g();
/*    */     
/* 53 */     if (bqv != null) {
/* 54 */       bmb bmb2 = this.a.a(0);
/* 55 */       bmb bmb3 = this.a.a(1);
/*    */ 
/*    */       
/* 58 */       if (bqv.b(bmb2, bmb3) || bqv.b(bmb3, bmb2)) {
/* 59 */         this.h.a(bqv);
/* 60 */         ☃.a(aea.S);
/*    */         
/* 62 */         this.a.a(0, bmb2);
/* 63 */         this.a.a(1, bmb3);
/*    */       } 
/* 65 */       this.h.t(this.h.eL() + bqv.o());
/*    */     } 
/* 67 */     return bmb1;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bjh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */