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
/*     */ final class null
/*     */   implements crd.b
/*     */ {
/*     */   public void a() {}
/*     */   
/*     */   public boolean a(csw ☃, int i, crd.a a1, fx fx1, List<cru> list, Random random) {
/* 204 */     bzm bzm = a1.b.d();
/* 205 */     crd.a a2 = a1;
/* 206 */     a2 = crd.a(list, crd.a(☃, a2, new fx(3 + random.nextInt(2), -3, 3 + random.nextInt(2)), "tower_base", bzm, true));
/* 207 */     a2 = crd.a(list, crd.a(☃, a2, new fx(0, 7, 0), "tower_piece", bzm, true));
/*     */     
/* 209 */     crd.a a3 = (random.nextInt(3) == 0) ? a2 : null;
/*     */     
/* 211 */     int j = 1 + random.nextInt(3);
/* 212 */     for (int k = 0; k < j; k++) {
/* 213 */       a2 = crd.a(list, crd.a(☃, a2, new fx(0, 4, 0), "tower_piece", bzm, true));
/* 214 */       if (k < j - 1 && random.nextBoolean()) {
/* 215 */         a3 = a2;
/*     */       }
/*     */     } 
/*     */     
/* 219 */     if (a3 != null) {
/* 220 */       for (afv<bzm, fx> afv : (Iterable<afv<bzm, fx>>)crd.d()) {
/* 221 */         if (random.nextBoolean()) {
/*     */           
/* 223 */           crd.a a4 = crd.a(list, crd.a(☃, a3, afv.b(), "bridge_end", bzm.a(afv.a()), true));
/* 224 */           crd.a(☃, crd.e(), i + 1, a4, null, list, random);
/*     */         } 
/*     */       } 
/*     */       
/* 228 */       a2 = crd.a(list, crd.a(☃, a2, new fx(-1, 4, -1), "tower_top", bzm, true));
/*     */     }
/* 230 */     else if (i == 7) {
/* 231 */       a2 = crd.a(list, crd.a(☃, a2, new fx(-1, 4, -1), "tower_top", bzm, true));
/*     */     } else {
/* 233 */       return crd.a(☃, crd.f(), i + 1, a2, null, list, random);
/*     */     } 
/*     */     
/* 236 */     return true;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\crd$2.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */