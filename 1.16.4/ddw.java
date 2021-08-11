/*    */ import org.lwjgl.openal.AL10;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ddw
/*    */ {
/*  8 */   private float a = 1.0F;
/*  9 */   private dcn b = dcn.a;
/*    */   
/*    */   public void a(dcn ☃) {
/* 12 */     this.b = ☃;
/* 13 */     AL10.alListener3f(4100, (float)☃.b, (float)☃.c, (float)☃.d);
/*    */   }
/*    */   
/*    */   public dcn a() {
/* 17 */     return this.b;
/*    */   }
/*    */   
/*    */   public void a(g ☃, g g1) {
/* 21 */     AL10.alListenerfv(4111, new float[] { ☃.a(), ☃.b(), ☃.c(), g1.a(), g1.b(), g1.c() });
/*    */   }
/*    */   
/*    */   public void a(float ☃) {
/* 25 */     AL10.alListenerf(4106, ☃);
/* 26 */     this.a = ☃;
/*    */   }
/*    */   
/*    */   public float b() {
/* 30 */     return this.a;
/*    */   }
/*    */   
/*    */   public void c() {
/* 34 */     a(dcn.a);
/* 35 */     a(g.e, g.d);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ddw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */