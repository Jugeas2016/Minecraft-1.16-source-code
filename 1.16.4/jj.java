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
/*     */ 
/*     */ 
/*     */ public class jj
/*     */ {
/*     */   private final blx a;
/*     */   private final bon b;
/*     */   private final float c;
/*     */   private final int d;
/*  26 */   private final y.a e = y.a.a();
/*     */   private String f;
/*     */   private final boz<?> g;
/*     */   
/*     */   private jj(brw ☃, bon bon1, float f, int i, boz<?> boz1) {
/*  31 */     this.a = ☃.h();
/*  32 */     this.b = bon1;
/*  33 */     this.c = f;
/*  34 */     this.d = i;
/*  35 */     this.g = boz1;
/*     */   }
/*     */   
/*     */   public static jj a(bon ☃, brw brw1, float f, int i, boz<?> boz1) {
/*  39 */     return new jj(brw1, ☃, f, i, boz1);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static jj b(bon ☃, brw brw1, float f, int i) {
/*  47 */     return a(☃, brw1, f, i, bos.q);
/*     */   }
/*     */   
/*     */   public static jj c(bon ☃, brw brw1, float f, int i) {
/*  51 */     return a(☃, brw1, f, i, bos.p);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public jj a(String ☃, ag ag1) {
/*  59 */     this.e.a(☃, ag1);
/*  60 */     return this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(Consumer<jf> ☃) {
/*  69 */     a(☃, gm.T.b(this.a));
/*     */   }
/*     */   
/*     */   public void a(Consumer<jf> ☃, String str) {
/*  73 */     vk vk1 = gm.T.b(this.a);
/*  74 */     vk vk2 = new vk(str);
/*  75 */     if (vk2.equals(vk1)) {
/*  76 */       throw new IllegalStateException("Recipe " + vk2 + " should remove its 'save' argument");
/*     */     }
/*     */     
/*  79 */     a(☃, vk2);
/*     */   }
/*     */   
/*     */   public void a(Consumer<jf> ☃, vk vk1) {
/*  83 */     a(vk1);
/*  84 */     this.e
/*  85 */       .a(new vk("recipes/root"))
/*  86 */       .a("has_the_recipe", ch.a(vk1))
/*  87 */       .a(ab.a.c(vk1))
/*  88 */       .a(aj.b);
/*     */     
/*  90 */     ☃.accept(new a(vk1, (this.f == null) ? "" : this.f, this.b, this.a, this.c, this.d, this.e, new vk(vk1.b(), "recipes/" + this.a.q().b() + "/" + vk1.a()), (bos)this.g));
/*     */   }
/*     */   
/*     */   private void a(vk ☃) {
/*  94 */     if (this.e.c().isEmpty())
/*  95 */       throw new IllegalStateException("No way of obtaining recipe " + ☃); 
/*     */   }
/*     */   
/*     */   public static class a
/*     */     implements jf {
/*     */     private final vk a;
/*     */     private final String b;
/*     */     private final bon c;
/*     */     private final blx d;
/*     */     private final float e;
/*     */     private final int f;
/*     */     private final y.a g;
/*     */     private final vk h;
/*     */     private final bos<? extends boc> i;
/*     */     
/*     */     public a(vk ☃, String str, bon bon1, blx blx1, float f, int i, y.a a1, vk vk1, bos<? extends boc> bos1) {
/* 111 */       this.a = ☃;
/* 112 */       this.b = str;
/* 113 */       this.c = bon1;
/* 114 */       this.d = blx1;
/* 115 */       this.e = f;
/* 116 */       this.f = i;
/* 117 */       this.g = a1;
/* 118 */       this.h = vk1;
/* 119 */       this.i = bos1;
/*     */     }
/*     */ 
/*     */     
/*     */     public void a(JsonObject ☃) {
/* 124 */       if (!this.b.isEmpty()) {
/* 125 */         ☃.addProperty("group", this.b);
/*     */       }
/*     */       
/* 128 */       ☃.add("ingredient", this.c.c());
/* 129 */       ☃.addProperty("result", gm.T.b(this.d).toString());
/* 130 */       ☃.addProperty("experience", Float.valueOf(this.e));
/* 131 */       ☃.addProperty("cookingtime", Integer.valueOf(this.f));
/*     */     }
/*     */ 
/*     */     
/*     */     public bos<?> c() {
/* 136 */       return this.i;
/*     */     }
/*     */ 
/*     */     
/*     */     public vk b() {
/* 141 */       return this.a;
/*     */     }
/*     */ 
/*     */     
/*     */     @Nullable
/*     */     public JsonObject d() {
/* 147 */       return this.g.b();
/*     */     }
/*     */ 
/*     */     
/*     */     @Nullable
/*     */     public vk e() {
/* 153 */       return this.h;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\jj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */