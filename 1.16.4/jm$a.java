/*     */ import com.google.gson.JsonElement;
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
/*     */ public class a
/*     */   implements jf
/*     */ {
/*     */   private final vk a;
/*     */   private final bon b;
/*     */   private final bon c;
/*     */   private final blx d;
/*     */   private final y.a e;
/*     */   private final vk f;
/*     */   private final bos<?> g;
/*     */   
/*     */   public a(vk ☃, bos<?> bos1, bon bon1, bon bon2, blx blx1, y.a a1, vk vk1) {
/*  72 */     this.a = ☃;
/*  73 */     this.g = bos1;
/*  74 */     this.b = bon1;
/*  75 */     this.c = bon2;
/*  76 */     this.d = blx1;
/*  77 */     this.e = a1;
/*  78 */     this.f = vk1;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(JsonObject ☃) {
/*  83 */     ☃.add("base", this.b.c());
/*  84 */     ☃.add("addition", this.c.c());
/*  85 */     JsonObject jsonObject = new JsonObject();
/*  86 */     jsonObject.addProperty("item", gm.T.b(this.d).toString());
/*  87 */     ☃.add("result", (JsonElement)jsonObject);
/*     */   }
/*     */ 
/*     */   
/*     */   public vk b() {
/*  92 */     return this.a;
/*     */   }
/*     */ 
/*     */   
/*     */   public bos<?> c() {
/*  97 */     return this.g;
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public JsonObject d() {
/* 103 */     return this.e.b();
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public vk e() {
/* 109 */     return this.f;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\jm$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */