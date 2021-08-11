/*    */ 
/*    */ 
/*    */ public class dkk
/*    */ {
/*    */   public float a;
/*    */   public float b;
/*    */   private long c;
/*    */   private final float d;
/*    */   
/*    */   public dkk(float ☃, long l) {
/* 11 */     this.d = 1000.0F / ☃;
/* 12 */     this.c = l;
/*    */   }
/*    */   
/*    */   public int a(long ☃) {
/* 16 */     this.b = (float)(☃ - this.c) / this.d;
/* 17 */     this.c = ☃;
/*    */     
/* 19 */     this.a += this.b;
/* 20 */     int i = (int)this.a;
/* 21 */     this.a -= i;
/* 22 */     return i;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dkk.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */