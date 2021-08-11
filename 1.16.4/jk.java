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
/*     */ 
/*     */ 
/*     */ public class jk
/*     */ {
/*     */   private final blx a;
/*     */   private final bon b;
/*     */   private final int c;
/*  23 */   private final y.a d = y.a.a();
/*     */   private String e;
/*     */   private final bos<?> f;
/*     */   
/*     */   public jk(bos<?> ☃, bon bon1, brw brw1, int i) {
/*  28 */     this.f = ☃;
/*  29 */     this.a = brw1.h();
/*  30 */     this.b = bon1;
/*  31 */     this.c = i;
/*     */   }
/*     */   
/*     */   public static jk a(bon ☃, brw brw1) {
/*  35 */     return new jk(bos.t, ☃, brw1, 1);
/*     */   }
/*     */   
/*     */   public static jk a(bon ☃, brw brw1, int i) {
/*  39 */     return new jk(bos.t, ☃, brw1, i);
/*     */   }
/*     */   
/*     */   public jk a(String ☃, ag ag1) {
/*  43 */     this.d.a(☃, ag1);
/*  44 */     return this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(Consumer<jf> ☃, String str) {
/*  53 */     vk vk = gm.T.b(this.a);
/*  54 */     if ((new vk(str)).equals(vk)) {
/*  55 */       throw new IllegalStateException("Single Item Recipe " + str + " should remove its 'save' argument");
/*     */     }
/*  57 */     a(☃, new vk(str));
/*     */   }
/*     */   
/*     */   public void a(Consumer<jf> ☃, vk vk1) {
/*  61 */     a(vk1);
/*  62 */     this.d
/*  63 */       .a(new vk("recipes/root"))
/*  64 */       .a("has_the_recipe", ch.a(vk1))
/*  65 */       .a(ab.a.c(vk1))
/*  66 */       .a(aj.b);
/*     */     
/*  68 */     ☃.accept(new a(vk1, this.f, (this.e == null) ? "" : this.e, this.b, this.a, this.c, this.d, new vk(vk1.b(), "recipes/" + this.a.q().b() + "/" + vk1.a())));
/*     */   }
/*     */   
/*     */   private void a(vk ☃) {
/*  72 */     if (this.d.c().isEmpty())
/*  73 */       throw new IllegalStateException("No way of obtaining recipe " + ☃); 
/*     */   }
/*     */   
/*     */   public static class a
/*     */     implements jf {
/*     */     private final vk a;
/*     */     private final String b;
/*     */     private final bon c;
/*     */     private final blx d;
/*     */     private final int e;
/*     */     private final y.a f;
/*     */     private final vk g;
/*     */     private final bos<?> h;
/*     */     
/*     */     public a(vk ☃, bos<?> bos1, String str, bon bon1, blx blx1, int i, y.a a1, vk vk1) {
/*  88 */       this.a = ☃;
/*  89 */       this.h = bos1;
/*  90 */       this.b = str;
/*  91 */       this.c = bon1;
/*  92 */       this.d = blx1;
/*  93 */       this.e = i;
/*  94 */       this.f = a1;
/*  95 */       this.g = vk1;
/*     */     }
/*     */ 
/*     */     
/*     */     public void a(JsonObject ☃) {
/* 100 */       if (!this.b.isEmpty()) {
/* 101 */         ☃.addProperty("group", this.b);
/*     */       }
/*     */       
/* 104 */       ☃.add("ingredient", this.c.c());
/* 105 */       ☃.addProperty("result", gm.T.b(this.d).toString());
/* 106 */       ☃.addProperty("count", Integer.valueOf(this.e));
/*     */     }
/*     */ 
/*     */     
/*     */     public vk b() {
/* 111 */       return this.a;
/*     */     }
/*     */ 
/*     */     
/*     */     public bos<?> c() {
/* 116 */       return this.h;
/*     */     }
/*     */ 
/*     */     
/*     */     @Nullable
/*     */     public JsonObject d() {
/* 122 */       return this.f.b();
/*     */     }
/*     */ 
/*     */     
/*     */     @Nullable
/*     */     public vk e() {
/* 128 */       return this.g;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\jk.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */