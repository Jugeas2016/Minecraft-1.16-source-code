/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class eml
/*    */   extends emd
/*    */ {
/*    */   private final aqa n;
/*    */   
/*    */   public eml(adp ☃, adr adr1, aqa aqa1) {
/* 11 */     this(☃, adr1, 1.0F, 1.0F, aqa1);
/*    */   }
/*    */   
/*    */   public eml(adp ☃, adr adr1, float f1, float f2, aqa aqa1) {
/* 15 */     super(☃, adr1);
/* 16 */     this.d = f1;
/* 17 */     this.e = f2;
/* 18 */     this.n = aqa1;
/*    */     
/* 20 */     this.f = (float)this.n.cD();
/* 21 */     this.g = (float)this.n.cE();
/* 22 */     this.h = (float)this.n.cH();
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean t() {
/* 27 */     return !this.n.aA();
/*    */   }
/*    */ 
/*    */   
/*    */   public void r() {
/* 32 */     if (this.n.y) {
/* 33 */       o();
/*    */       
/*    */       return;
/*    */     } 
/* 37 */     this.f = (float)this.n.cD();
/* 38 */     this.g = (float)this.n.cE();
/* 39 */     this.h = (float)this.n.cH();
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\eml.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */