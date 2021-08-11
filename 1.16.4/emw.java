/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class emw
/*    */ {
/*    */   public static class a
/*    */     extends emd
/*    */   {
/*    */     private final dzm n;
/*    */     
/*    */     protected a(dzm ☃, adp adp1) {
/* 14 */       super(adp1, adr.i);
/*    */       
/* 16 */       this.n = ☃;
/* 17 */       this.i = false;
/* 18 */       this.j = 0;
/* 19 */       this.d = 1.0F;
/* 20 */       this.l = true;
/* 21 */       this.m = true;
/*    */     }
/*    */ 
/*    */     
/*    */     public void r() {
/* 26 */       if (this.n.y || !this.n.aI()) {
/* 27 */         o();
/*    */       }
/*    */     }
/*    */   }
/*    */   
/*    */   public static class b
/*    */     extends emd
/*    */   {
/*    */     private final dzm n;
/*    */     private int o;
/*    */     
/*    */     public b(dzm ☃) {
/* 39 */       super(adq.s, adr.i);
/*    */       
/* 41 */       this.n = ☃;
/* 42 */       this.i = true;
/* 43 */       this.j = 0;
/* 44 */       this.d = 1.0F;
/* 45 */       this.l = true;
/* 46 */       this.m = true;
/*    */     }
/*    */ 
/*    */     
/*    */     public void r() {
/* 51 */       if (this.n.y || this.o < 0) {
/* 52 */         o();
/*    */         
/*    */         return;
/*    */       } 
/* 56 */       if (this.n.aI()) {
/* 57 */         this.o++;
/*    */       } else {
/* 59 */         this.o -= 2;
/*    */       } 
/*    */       
/* 62 */       this.o = Math.min(this.o, 40);
/* 63 */       this.d = Math.max(0.0F, Math.min(this.o / 40.0F, 1.0F));
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\emw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */