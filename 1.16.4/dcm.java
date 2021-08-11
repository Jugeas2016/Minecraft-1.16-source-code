/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class dcm
/*    */ {
/*  7 */   public static final dcm a = new dcm(0.0F, 0.0F);
/*  8 */   public static final dcm b = new dcm(1.0F, 1.0F);
/*  9 */   public static final dcm c = new dcm(1.0F, 0.0F);
/* 10 */   public static final dcm d = new dcm(-1.0F, 0.0F);
/* 11 */   public static final dcm e = new dcm(0.0F, 1.0F);
/* 12 */   public static final dcm f = new dcm(0.0F, -1.0F);
/* 13 */   public static final dcm g = new dcm(Float.MAX_VALUE, Float.MAX_VALUE);
/* 14 */   public static final dcm h = new dcm(Float.MIN_VALUE, Float.MIN_VALUE);
/*    */   
/*    */   public final float i;
/*    */   public final float j;
/*    */   
/*    */   public dcm(float ☃, float f1) {
/* 20 */     this.i = ☃;
/* 21 */     this.j = f1;
/*    */   }
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
/*    */   public boolean c(dcm ☃) {
/* 41 */     return (this.i == ☃.i && this.j == ☃.j);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dcm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */