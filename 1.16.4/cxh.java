/*    */ 
/*    */ 
/*    */ public class cxh
/*    */   extends cxb
/*    */ {
/*  6 */   private float m = Float.MAX_VALUE;
/*    */   private cxb n;
/*    */   private boolean o;
/*    */   
/*    */   public cxh(cxb ☃) {
/* 11 */     super(☃.a, ☃.b, ☃.c);
/*    */   }
/*    */   
/*    */   public cxh(int ☃, int i, int j) {
/* 15 */     super(☃, i, j);
/*    */   }
/*    */   
/*    */   public void a(float ☃, cxb cxb1) {
/* 19 */     if (☃ < this.m) {
/* 20 */       this.m = ☃;
/* 21 */       this.n = cxb1;
/*    */     } 
/*    */   }
/*    */   
/*    */   public cxb d() {
/* 26 */     return this.n;
/*    */   }
/*    */   
/*    */   public void e() {
/* 30 */     this.o = true;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static cxh c(nf ☃) {
/* 38 */     cxh cxh1 = new cxh(☃.readInt(), ☃.readInt(), ☃.readInt());
/* 39 */     cxh1.j = ☃.readFloat();
/* 40 */     cxh1.k = ☃.readFloat();
/* 41 */     cxh1.i = ☃.readBoolean();
/* 42 */     cxh1.l = cwz.values()[☃.readInt()];
/* 43 */     cxh1.g = ☃.readFloat();
/* 44 */     return cxh1;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cxh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */