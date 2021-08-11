/*    */ import javax.annotation.concurrent.Immutable;
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
/*    */ @Immutable
/*    */ public class aos
/*    */ {
/*    */   private final aor a;
/*    */   private final float b;
/*    */   
/*    */   public aos(aor ☃, long l1, long l2, float f) {
/* 22 */     this.a = ☃;
/* 23 */     this.b = a(☃, l1, l2, f);
/*    */   }
/*    */   
/*    */   public aor a() {
/* 27 */     return this.a;
/*    */   }
/*    */   
/*    */   public float b() {
/* 31 */     return this.b;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean a(float ☃) {
/* 39 */     return (this.b > ☃);
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
/*    */   public float d() {
/* 52 */     if (this.b < 2.0F) {
/* 53 */       return 0.0F;
/*    */     }
/* 55 */     if (this.b > 4.0F) {
/* 56 */       return 1.0F;
/*    */     }
/* 58 */     return (this.b - 2.0F) / 2.0F;
/*    */   }
/*    */   
/*    */   private float a(aor ☃, long l1, long l2, float f) {
/* 62 */     if (☃ == aor.a) {
/* 63 */       return 0.0F;
/*    */     }
/*    */     
/* 66 */     boolean bool = (☃ == aor.d);
/* 67 */     float f1 = 0.75F;
/*    */ 
/*    */     
/* 70 */     float f2 = afm.a(((float)l1 + -72000.0F) / 1440000.0F, 0.0F, 1.0F) * 0.25F;
/* 71 */     f1 += f2;
/*    */     
/* 73 */     float f3 = 0.0F;
/*    */ 
/*    */     
/* 76 */     f3 += afm.a((float)l2 / 3600000.0F, 0.0F, 1.0F) * (bool ? 1.0F : 0.75F);
/* 77 */     f3 += afm.a(f * 0.25F, 0.0F, f2);
/*    */     
/* 79 */     if (☃ == aor.b) {
/* 80 */       f3 *= 0.5F;
/*    */     }
/* 82 */     f1 += f3;
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 87 */     return ☃.a() * f1;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\aos.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */