/*     */ import com.google.gson.JsonElement;
/*     */ import com.google.gson.JsonObject;
/*     */ import java.util.function.Consumer;
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
/*     */ public class jm
/*     */ {
/*     */   private final bon a;
/*     */   private final bon b;
/*     */   private final blx c;
/*  22 */   private final y.a d = y.a.a();
/*     */   private final bos<?> e;
/*     */   
/*     */   public jm(bos<?> ☃, bon bon1, bon bon2, blx blx1) {
/*  26 */     this.e = ☃;
/*  27 */     this.a = bon1;
/*  28 */     this.b = bon2;
/*  29 */     this.c = blx1;
/*     */   }
/*     */   
/*     */   public static jm a(bon ☃, bon bon1, blx blx1) {
/*  33 */     return new jm(bos.u, ☃, bon1, blx1);
/*     */   }
/*     */   
/*     */   public jm a(String ☃, ag ag1) {
/*  37 */     this.d.a(☃, ag1);
/*  38 */     return this;
/*     */   }
/*     */   
/*     */   public void a(Consumer<jf> ☃, String str) {
/*  42 */     a(☃, new vk(str));
/*     */   }
/*     */   
/*     */   public void a(Consumer<jf> ☃, vk vk1) {
/*  46 */     a(vk1);
/*  47 */     this.d
/*  48 */       .a(new vk("recipes/root"))
/*  49 */       .a("has_the_recipe", ch.a(vk1))
/*  50 */       .a(ab.a.c(vk1))
/*  51 */       .a(aj.b);
/*     */     
/*  53 */     ☃.accept(new a(vk1, this.e, this.a, this.b, this.c, this.d, new vk(vk1.b(), "recipes/" + this.c.q().b() + "/" + vk1.a())));
/*     */   }
/*     */   
/*     */   private void a(vk ☃) {
/*  57 */     if (this.d.c().isEmpty())
/*  58 */       throw new IllegalStateException("No way of obtaining recipe " + ☃); 
/*     */   }
/*     */   
/*     */   public static class a
/*     */     implements jf {
/*     */     private final vk a;
/*     */     private final bon b;
/*     */     private final bon c;
/*     */     private final blx d;
/*     */     private final y.a e;
/*     */     private final vk f;
/*     */     private final bos<?> g;
/*     */     
/*     */     public a(vk ☃, bos<?> bos1, bon bon1, bon bon2, blx blx1, y.a a1, vk vk1) {
/*  72 */       this.a = ☃;
/*  73 */       this.g = bos1;
/*  74 */       this.b = bon1;
/*  75 */       this.c = bon2;
/*  76 */       this.d = blx1;
/*  77 */       this.e = a1;
/*  78 */       this.f = vk1;
/*     */     }
/*     */ 
/*     */     
/*     */     public void a(JsonObject ☃) {
/*  83 */       ☃.add("base", this.b.c());
/*  84 */       ☃.add("addition", this.c.c());
/*  85 */       JsonObject jsonObject = new JsonObject();
/*  86 */       jsonObject.addProperty("item", gm.T.b(this.d).toString());
/*  87 */       ☃.add("result", (JsonElement)jsonObject);
/*     */     }
/*     */ 
/*     */     
/*     */     public vk b() {
/*  92 */       return this.a;
/*     */     }
/*     */ 
/*     */     
/*     */     public bos<?> c() {
/*  97 */       return this.g;
/*     */     }
/*     */ 
/*     */     
/*     */     @Nullable
/*     */     public JsonObject d() {
/* 103 */       return this.e.b();
/*     */     }
/*     */ 
/*     */     
/*     */     @Nullable
/*     */     public vk e() {
/* 109 */       return this.f;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\jm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */