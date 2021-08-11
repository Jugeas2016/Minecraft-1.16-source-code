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
/*     */ public class a
/*     */   implements jf
/*     */ {
/*     */   private final vk a;
/*     */   private final String b;
/*     */   private final bon c;
/*     */   private final blx d;
/*     */   private final int e;
/*     */   private final y.a f;
/*     */   private final vk g;
/*     */   private final bos<?> h;
/*     */   
/*     */   public a(vk ☃, bos<?> bos1, String str, bon bon1, blx blx1, int i, y.a a1, vk vk1) {
/*  88 */     this.a = ☃;
/*  89 */     this.h = bos1;
/*  90 */     this.b = str;
/*  91 */     this.c = bon1;
/*  92 */     this.d = blx1;
/*  93 */     this.e = i;
/*  94 */     this.f = a1;
/*  95 */     this.g = vk1;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(JsonObject ☃) {
/* 100 */     if (!this.b.isEmpty()) {
/* 101 */       ☃.addProperty("group", this.b);
/*     */     }
/*     */     
/* 104 */     ☃.add("ingredient", this.c.c());
/* 105 */     ☃.addProperty("result", gm.T.b(this.d).toString());
/* 106 */     ☃.addProperty("count", Integer.valueOf(this.e));
/*     */   }
/*     */ 
/*     */   
/*     */   public vk b() {
/* 111 */     return this.a;
/*     */   }
/*     */ 
/*     */   
/*     */   public bos<?> c() {
/* 116 */     return this.h;
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public JsonObject d() {
/* 122 */     return this.f.b();
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public vk e() {
/* 128 */     return this.g;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\jk$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */