/*     */ import com.google.gson.JsonObject;
/*     */ import java.util.Map;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/*     */   implements bos<bov>
/*     */ {
/*     */   public bov b(vk ☃, JsonObject jsonObject) {
/* 244 */     String str = afd.a(jsonObject, "group", "");
/*     */     
/* 246 */     Map<String, bon> map = bov.b(afd.t(jsonObject, "key"));
/* 247 */     String[] arrayOfString = bov.a(bov.a(afd.u(jsonObject, "pattern")));
/*     */     
/* 249 */     int i = arrayOfString[0].length();
/* 250 */     int j = arrayOfString.length;
/*     */     
/* 252 */     gj<bon> gj = bov.a(arrayOfString, map, i, j);
/*     */     
/* 254 */     bmb bmb = bov.a(afd.t(jsonObject, "result"));
/*     */     
/* 256 */     return new bov(☃, str, i, j, gj, bmb);
/*     */   }
/*     */ 
/*     */   
/*     */   public bov b(vk ☃, nf nf1) {
/* 261 */     int i = nf1.i();
/* 262 */     int j = nf1.i();
/* 263 */     String str = nf1.e(32767);
/* 264 */     gj<bon> gj = gj.a(i * j, bon.a);
/* 265 */     for (int k = 0; k < gj.size(); k++) {
/* 266 */       gj.set(k, bon.b(nf1));
/*     */     }
/* 268 */     bmb bmb = nf1.n();
/* 269 */     return new bov(☃, str, i, j, gj, bmb);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(nf ☃, bov bov1) {
/* 274 */     ☃.d(bov.a(bov1));
/* 275 */     ☃.d(bov.b(bov1));
/* 276 */     ☃.a(bov.c(bov1));
/* 277 */     for (bon bon : bov.d(bov1)) {
/* 278 */       bon.a(☃);
/*     */     }
/* 280 */     ☃.a(bov.e(bov1));
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bov$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */