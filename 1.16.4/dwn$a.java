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
/*     */ public class a
/*     */ {
/*     */   private final dwn.b[] g;
/*     */   public final float a;
/*     */   public final float b;
/*     */   public final float c;
/*     */   public final float d;
/*     */   public final float e;
/*     */   public final float f;
/*     */   
/*     */   public a(int ☃, int i, float f1, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, boolean bool, float f10, float f11) {
/* 201 */     this.a = f1;
/* 202 */     this.b = f2;
/* 203 */     this.c = f3;
/* 204 */     this.d = f1 + f4;
/* 205 */     this.e = f2 + f5;
/* 206 */     this.f = f3 + f6;
/* 207 */     this.g = new dwn.b[6];
/*     */     
/* 209 */     float f12 = f1 + f4;
/* 210 */     float f13 = f2 + f5;
/* 211 */     float f14 = f3 + f6;
/*     */     
/* 213 */     f1 -= f7;
/* 214 */     f2 -= f8;
/* 215 */     f3 -= f9;
/* 216 */     f12 += f7;
/* 217 */     f13 += f8;
/* 218 */     f14 += f9;
/*     */     
/* 220 */     if (bool) {
/* 221 */       float f = f12;
/* 222 */       f12 = f1;
/* 223 */       f1 = f;
/*     */     } 
/*     */     
/* 226 */     dwn.c c1 = new dwn.c(f1, f2, f3, 0.0F, 0.0F);
/* 227 */     dwn.c c2 = new dwn.c(f12, f2, f3, 0.0F, 8.0F);
/* 228 */     dwn.c c3 = new dwn.c(f12, f13, f3, 8.0F, 8.0F);
/* 229 */     dwn.c c4 = new dwn.c(f1, f13, f3, 8.0F, 0.0F);
/*     */     
/* 231 */     dwn.c c5 = new dwn.c(f1, f2, f14, 0.0F, 0.0F);
/* 232 */     dwn.c c6 = new dwn.c(f12, f2, f14, 0.0F, 8.0F);
/* 233 */     dwn.c c7 = new dwn.c(f12, f13, f14, 8.0F, 8.0F);
/* 234 */     dwn.c c8 = new dwn.c(f1, f13, f14, 8.0F, 0.0F);
/*     */     
/* 236 */     float f15 = ☃;
/* 237 */     float f16 = ☃ + f6;
/* 238 */     float f17 = ☃ + f6 + f4;
/* 239 */     float f18 = ☃ + f6 + f4 + f4;
/* 240 */     float f19 = ☃ + f6 + f4 + f6;
/* 241 */     float f20 = ☃ + f6 + f4 + f6 + f4;
/*     */     
/* 243 */     float f21 = i;
/* 244 */     float f22 = i + f6;
/* 245 */     float f23 = i + f6 + f5;
/*     */     
/* 247 */     this.g[2] = new dwn.b(new dwn.c[] { c6, c5, c1, c2 }, f16, f21, f17, f22, f10, f11, bool, gc.a);
/* 248 */     this.g[3] = new dwn.b(new dwn.c[] { c3, c4, c8, c7 }, f17, f22, f18, f21, f10, f11, bool, gc.b);
/*     */     
/* 250 */     this.g[1] = new dwn.b(new dwn.c[] { c1, c5, c8, c4 }, f15, f22, f16, f23, f10, f11, bool, gc.e);
/* 251 */     this.g[4] = new dwn.b(new dwn.c[] { c2, c1, c4, c3 }, f16, f22, f17, f23, f10, f11, bool, gc.c);
/* 252 */     this.g[0] = new dwn.b(new dwn.c[] { c6, c2, c3, c7 }, f17, f22, f19, f23, f10, f11, bool, gc.f);
/* 253 */     this.g[5] = new dwn.b(new dwn.c[] { c5, c6, c7, c8 }, f19, f22, f20, f23, f10, f11, bool, gc.d);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dwn$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */