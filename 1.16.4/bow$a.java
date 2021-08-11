/*     */ import com.google.gson.JsonArray;
/*     */ import com.google.gson.JsonObject;
/*     */ import com.google.gson.JsonParseException;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/*     */   implements bos<bow>
/*     */ {
/*     */   public bow b(vk ☃, JsonObject jsonObject) {
/*  82 */     String str = afd.a(jsonObject, "group", "");
/*  83 */     gj<bon> gj = a(afd.u(jsonObject, "ingredients"));
/*  84 */     if (gj.isEmpty())
/*  85 */       throw new JsonParseException("No ingredients for shapeless recipe"); 
/*  86 */     if (gj.size() > 9) {
/*  87 */       throw new JsonParseException("Too many ingredients for shapeless recipe");
/*     */     }
/*     */     
/*  90 */     bmb bmb = bov.a(afd.t(jsonObject, "result"));
/*  91 */     return new bow(☃, str, bmb, gj);
/*     */   }
/*     */   
/*     */   private static gj<bon> a(JsonArray ☃) {
/*  95 */     gj<bon> gj = gj.a();
/*     */     
/*  97 */     for (int i = 0; i < ☃.size(); i++) {
/*  98 */       bon bon = bon.a(☃.get(i));
/*  99 */       if (!bon.d()) {
/* 100 */         gj.add(bon);
/*     */       }
/*     */     } 
/*     */     
/* 104 */     return gj;
/*     */   }
/*     */ 
/*     */   
/*     */   public bow b(vk ☃, nf nf1) {
/* 109 */     String str = nf1.e(32767);
/* 110 */     int i = nf1.i();
/* 111 */     gj<bon> gj = gj.a(i, bon.a);
/* 112 */     for (int j = 0; j < gj.size(); j++) {
/* 113 */       gj.set(j, bon.b(nf1));
/*     */     }
/* 115 */     bmb bmb = nf1.n();
/* 116 */     return new bow(☃, str, bmb, gj);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(nf ☃, bow bow1) {
/* 121 */     ☃.a(bow.a(bow1));
/* 122 */     ☃.d(bow.b(bow1).size());
/* 123 */     for (bon bon : bow.b(bow1)) {
/* 124 */       bon.a(☃);
/*     */     }
/* 126 */     ☃.a(bow.c(bow1));
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bow$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */