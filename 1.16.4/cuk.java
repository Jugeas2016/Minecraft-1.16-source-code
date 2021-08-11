/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class cuk
/*    */   extends cgb
/*    */ {
/*    */   public cuk() {
/*  9 */     super(128);
/*    */   }
/*    */ 
/*    */   
/*    */   public cuk(cgb ☃, int i) {
/* 14 */     super(128);
/* 15 */     System.arraycopy(☃.a(), i * 128, this.a, 0, 128);
/*    */   }
/*    */ 
/*    */   
/*    */   protected int b(int ☃, int i, int j) {
/* 20 */     return j << 4 | ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   public byte[] a() {
/* 25 */     byte[] ☃ = new byte[2048];
/* 26 */     for (int i = 0; i < 16; i++) {
/* 27 */       System.arraycopy(this.a, 0, ☃, i * 128, 128);
/*    */     }
/* 29 */     return ☃;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cuk.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */