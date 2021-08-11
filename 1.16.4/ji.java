/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.gson.JsonArray;
/*     */ import com.google.gson.JsonElement;
/*     */ import com.google.gson.JsonObject;
/*     */ import java.util.List;
/*     */ import java.util.function.Consumer;
/*     */ import javax.annotation.Nullable;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ji
/*     */ {
/*  26 */   private static final Logger a = LogManager.getLogger();
/*     */   
/*     */   private final blx b;
/*     */   private final int c;
/*  30 */   private final List<bon> d = Lists.newArrayList();
/*  31 */   private final y.a e = y.a.a();
/*     */   private String f;
/*     */   
/*     */   public ji(brw ☃, int i) {
/*  35 */     this.b = ☃.h();
/*  36 */     this.c = i;
/*     */   }
/*     */   
/*     */   public static ji a(brw ☃) {
/*  40 */     return new ji(☃, 1);
/*     */   }
/*     */   
/*     */   public static ji a(brw ☃, int i) {
/*  44 */     return new ji(☃, i);
/*     */   }
/*     */   
/*     */   public ji a(ael<blx> ☃) {
/*  48 */     return a(bon.a(☃));
/*     */   }
/*     */   
/*     */   public ji b(brw ☃) {
/*  52 */     return b(☃, 1);
/*     */   }
/*     */   
/*     */   public ji b(brw ☃, int i) {
/*  56 */     for (int j = 0; j < i; j++) {
/*  57 */       a(bon.a(new brw[] { ☃ }));
/*     */     } 
/*  59 */     return this;
/*     */   }
/*     */   
/*     */   public ji a(bon ☃) {
/*  63 */     return a(☃, 1);
/*     */   }
/*     */   
/*     */   public ji a(bon ☃, int i) {
/*  67 */     for (int j = 0; j < i; j++) {
/*  68 */       this.d.add(☃);
/*     */     }
/*  70 */     return this;
/*     */   }
/*     */   
/*     */   public ji a(String ☃, ag ag1) {
/*  74 */     this.e.a(☃, ag1);
/*  75 */     return this;
/*     */   }
/*     */   
/*     */   public ji a(String ☃) {
/*  79 */     this.f = ☃;
/*  80 */     return this;
/*     */   }
/*     */   
/*     */   public void a(Consumer<jf> ☃) {
/*  84 */     a(☃, gm.T.b(this.b));
/*     */   }
/*     */   
/*     */   public void a(Consumer<jf> ☃, String str) {
/*  88 */     vk vk = gm.T.b(this.b);
/*  89 */     if ((new vk(str)).equals(vk)) {
/*  90 */       throw new IllegalStateException("Shapeless Recipe " + str + " should remove its 'save' argument");
/*     */     }
/*  92 */     a(☃, new vk(str));
/*     */   }
/*     */   
/*     */   public void a(Consumer<jf> ☃, vk vk1) {
/*  96 */     a(vk1);
/*  97 */     this.e
/*  98 */       .a(new vk("recipes/root"))
/*  99 */       .a("has_the_recipe", ch.a(vk1))
/* 100 */       .a(ab.a.c(vk1))
/* 101 */       .a(aj.b);
/* 102 */     ☃.accept(new a(vk1, this.b, this.c, (this.f == null) ? "" : this.f, this.d, this.e, new vk(vk1.b(), "recipes/" + this.b.q().b() + "/" + vk1.a())));
/*     */   }
/*     */   
/*     */   private void a(vk ☃) {
/* 106 */     if (this.e.c().isEmpty())
/* 107 */       throw new IllegalStateException("No way of obtaining recipe " + ☃); 
/*     */   }
/*     */   
/*     */   public static class a
/*     */     implements jf {
/*     */     private final vk a;
/*     */     private final blx b;
/*     */     private final int c;
/*     */     private final String d;
/*     */     private final List<bon> e;
/*     */     private final y.a f;
/*     */     private final vk g;
/*     */     
/*     */     public a(vk ☃, blx blx1, int i, String str, List<bon> list, y.a a1, vk vk1) {
/* 121 */       this.a = ☃;
/* 122 */       this.b = blx1;
/* 123 */       this.c = i;
/* 124 */       this.d = str;
/* 125 */       this.e = list;
/* 126 */       this.f = a1;
/* 127 */       this.g = vk1;
/*     */     }
/*     */ 
/*     */     
/*     */     public void a(JsonObject ☃) {
/* 132 */       if (!this.d.isEmpty()) {
/* 133 */         ☃.addProperty("group", this.d);
/*     */       }
/*     */       
/* 136 */       JsonArray jsonArray = new JsonArray();
/* 137 */       for (bon bon : this.e) {
/* 138 */         jsonArray.add(bon.c());
/*     */       }
/* 140 */       ☃.add("ingredients", (JsonElement)jsonArray);
/*     */       
/* 142 */       JsonObject jsonObject = new JsonObject();
/* 143 */       jsonObject.addProperty("item", gm.T.b(this.b).toString());
/* 144 */       if (this.c > 1) {
/* 145 */         jsonObject.addProperty("count", Integer.valueOf(this.c));
/*     */       }
/* 147 */       ☃.add("result", (JsonElement)jsonObject);
/*     */     }
/*     */ 
/*     */     
/*     */     public bos<?> c() {
/* 152 */       return bos.b;
/*     */     }
/*     */ 
/*     */     
/*     */     public vk b() {
/* 157 */       return this.a;
/*     */     }
/*     */ 
/*     */     
/*     */     @Nullable
/*     */     public JsonObject d() {
/* 163 */       return this.f.b();
/*     */     }
/*     */ 
/*     */     
/*     */     @Nullable
/*     */     public vk e() {
/* 169 */       return this.g;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ji.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */