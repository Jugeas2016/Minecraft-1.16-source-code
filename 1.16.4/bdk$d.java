/*     */ import java.util.EnumSet;
/*     */ import java.util.Random;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ class d
/*     */   extends avv
/*     */ {
/*     */   private final bdk a;
/*     */   
/*     */   public d(bdk ☃) {
/* 210 */     this.a = ☃;
/*     */     
/* 212 */     a(EnumSet.of(avv.a.a));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a() {
/* 217 */     avb ☃ = this.a.u();
/* 218 */     if (!☃.b()) {
/* 219 */       return true;
/*     */     }
/*     */     
/* 222 */     double d1 = ☃.d() - this.a.cD();
/* 223 */     double d2 = ☃.e() - this.a.cE();
/* 224 */     double d3 = ☃.f() - this.a.cH();
/*     */     
/* 226 */     double d4 = d1 * d1 + d2 * d2 + d3 * d3;
/*     */     
/* 228 */     if (d4 < 1.0D || d4 > 3600.0D) {
/* 229 */       return true;
/*     */     }
/*     */     
/* 232 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean b() {
/* 237 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public void c() {
/* 242 */     Random ☃ = this.a.cY();
/* 243 */     double d1 = this.a.cD() + ((☃.nextFloat() * 2.0F - 1.0F) * 16.0F);
/* 244 */     double d2 = this.a.cE() + ((☃.nextFloat() * 2.0F - 1.0F) * 16.0F);
/* 245 */     double d3 = this.a.cH() + ((☃.nextFloat() * 2.0F - 1.0F) * 16.0F);
/* 246 */     this.a.u().a(d1, d2, d3, 1.0D);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bdk$d.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */