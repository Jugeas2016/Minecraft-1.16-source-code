/*     */ import java.util.List;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ final class null
/*     */   implements crd.b
/*     */ {
/*     */   public boolean a;
/*     */   
/*     */   public void a() {
/* 245 */     this.a = false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(csw ☃, int i, crd.a a1, fx fx1, List<cru> list, Random random) {
/* 250 */     bzm bzm = a1.b.d();
/* 251 */     int j = random.nextInt(4) + 1;
/*     */     
/* 253 */     crd.a a2 = crd.a(list, crd.a(☃, a1, new fx(0, 0, -4), "bridge_piece", bzm, true));
/* 254 */     a2.o = -1;
/* 255 */     int k = 0;
/* 256 */     for (int m = 0; m < j; m++) {
/* 257 */       if (random.nextBoolean()) {
/* 258 */         a2 = crd.a(list, crd.a(☃, a2, new fx(0, k, -4), "bridge_piece", bzm, true));
/* 259 */         k = 0;
/*     */       } else {
/* 261 */         if (random.nextBoolean()) {
/* 262 */           a2 = crd.a(list, crd.a(☃, a2, new fx(0, k, -4), "bridge_steep_stairs", bzm, true));
/*     */         } else {
/* 264 */           a2 = crd.a(list, crd.a(☃, a2, new fx(0, k, -8), "bridge_gentle_stairs", bzm, true));
/*     */         } 
/* 266 */         k = 4;
/*     */       } 
/*     */     } 
/*     */     
/* 270 */     if (this.a || random.nextInt(10 - i) != 0) {
/* 271 */       if (!crd.a(☃, crd.g(), i + 1, a2, new fx(-3, k + 1, -11), list, random)) {
/* 272 */         return false;
/*     */       }
/*     */     } else {
/*     */       
/* 276 */       crd.a(list, crd.a(☃, a2, new fx(-8 + random.nextInt(8), k, -70 + random.nextInt(10)), "ship", bzm, true));
/* 277 */       this.a = true;
/*     */     } 
/*     */ 
/*     */     
/* 281 */     a2 = crd.a(list, crd.a(☃, a2, new fx(4, k, 0), "bridge_end", bzm.a(bzm.c), true));
/* 282 */     a2.o = -1;
/*     */     
/* 284 */     return true;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\crd$3.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */