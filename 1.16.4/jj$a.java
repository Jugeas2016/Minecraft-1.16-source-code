/*     */ import com.google.gson.JsonObject;
/*     */ import javax.annotation.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/*     */   implements jf
/*     */ {
/*     */   private final vk a;
/*     */   private final String b;
/*     */   private final bon c;
/*     */   private final blx d;
/*     */   private final float e;
/*     */   private final int f;
/*     */   private final y.a g;
/*     */   private final vk h;
/*     */   private final bos<? extends boc> i;
/*     */   
/*     */   public a(vk ☃, String str, bon bon1, blx blx1, float f, int i, y.a a1, vk vk1, bos<? extends boc> bos1) {
/* 111 */     this.a = ☃;
/* 112 */     this.b = str;
/* 113 */     this.c = bon1;
/* 114 */     this.d = blx1;
/* 115 */     this.e = f;
/* 116 */     this.f = i;
/* 117 */     this.g = a1;
/* 118 */     this.h = vk1;
/* 119 */     this.i = bos1;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(JsonObject ☃) {
/* 124 */     if (!this.b.isEmpty()) {
/* 125 */       ☃.addProperty("group", this.b);
/*     */     }
/*     */     
/* 128 */     ☃.add("ingredient", this.c.c());
/* 129 */     ☃.addProperty("result", gm.T.b(this.d).toString());
/* 130 */     ☃.addProperty("experience", Float.valueOf(this.e));
/* 131 */     ☃.addProperty("cookingtime", Integer.valueOf(this.f));
/*     */   }
/*     */ 
/*     */   
/*     */   public bos<?> c() {
/* 136 */     return this.i;
/*     */   }
/*     */ 
/*     */   
/*     */   public vk b() {
/* 141 */     return this.a;
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public JsonObject d() {
/* 147 */     return this.g.b();
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public vk e() {
/* 153 */     return this.h;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\jj$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */