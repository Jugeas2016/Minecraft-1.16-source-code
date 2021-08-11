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
/*     */ final class null
/*     */   implements crd.b
/*     */ {
/*     */   public void a() {}
/*     */   
/*     */   public boolean a(csw ☃, int i, crd.a a1, fx fx1, List<cru> list, Random random) {
/* 164 */     if (i > 8) {
/* 165 */       return false;
/*     */     }
/*     */     
/* 168 */     bzm bzm = a1.b.d();
/* 169 */     crd.a a2 = crd.a(list, crd.a(☃, a1, fx1, "base_floor", bzm, true));
/*     */     
/* 171 */     int j = random.nextInt(3);
/* 172 */     if (j == 0) {
/* 173 */       a2 = crd.a(list, crd.a(☃, a2, new fx(-1, 4, -1), "base_roof", bzm, true));
/* 174 */     } else if (j == 1) {
/* 175 */       a2 = crd.a(list, crd.a(☃, a2, new fx(-1, 0, -1), "second_floor_2", bzm, false));
/* 176 */       a2 = crd.a(list, crd.a(☃, a2, new fx(-1, 8, -1), "second_roof", bzm, false));
/*     */       
/* 178 */       crd.a(☃, crd.c(), i + 1, a2, null, list, random);
/* 179 */     } else if (j == 2) {
/* 180 */       a2 = crd.a(list, crd.a(☃, a2, new fx(-1, 0, -1), "second_floor_2", bzm, false));
/* 181 */       a2 = crd.a(list, crd.a(☃, a2, new fx(-1, 4, -1), "third_floor_2", bzm, false));
/* 182 */       a2 = crd.a(list, crd.a(☃, a2, new fx(-1, 8, -1), "third_roof", bzm, true));
/*     */       
/* 184 */       crd.a(☃, crd.c(), i + 1, a2, null, list, random);
/*     */     } 
/* 186 */     return true;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\crd$1.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */