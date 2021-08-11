/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.collect.Maps;
/*     */ import com.google.common.collect.Sets;
/*     */ import com.google.gson.JsonArray;
/*     */ import com.google.gson.JsonElement;
/*     */ import com.google.gson.JsonObject;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Set;
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
/*     */ public class jh
/*     */ {
/*  30 */   private static final Logger a = LogManager.getLogger();
/*     */   
/*     */   private final blx b;
/*     */   private final int c;
/*  34 */   private final List<String> d = Lists.newArrayList();
/*  35 */   private final Map<Character, bon> e = Maps.newLinkedHashMap();
/*  36 */   private final y.a f = y.a.a();
/*     */   private String g;
/*     */   
/*     */   public jh(brw ☃, int i) {
/*  40 */     this.b = ☃.h();
/*  41 */     this.c = i;
/*     */   }
/*     */   
/*     */   public static jh a(brw ☃) {
/*  45 */     return a(☃, 1);
/*     */   }
/*     */   
/*     */   public static jh a(brw ☃, int i) {
/*  49 */     return new jh(☃, i);
/*     */   }
/*     */   
/*     */   public jh a(Character ☃, ael<blx> ael1) {
/*  53 */     return a(☃, bon.a(ael1));
/*     */   }
/*     */   
/*     */   public jh a(Character ☃, brw brw1) {
/*  57 */     return a(☃, bon.a(new brw[] { brw1 }));
/*     */   }
/*     */   
/*     */   public jh a(Character ☃, bon bon1) {
/*  61 */     if (this.e.containsKey(☃)) {
/*  62 */       throw new IllegalArgumentException("Symbol '" + ☃ + "' is already defined!");
/*     */     }
/*  64 */     if (☃.charValue() == ' ') {
/*  65 */       throw new IllegalArgumentException("Symbol ' ' (whitespace) is reserved and cannot be defined");
/*     */     }
/*  67 */     this.e.put(☃, bon1);
/*  68 */     return this;
/*     */   }
/*     */   
/*     */   public jh a(String ☃) {
/*  72 */     if (!this.d.isEmpty() && ☃.length() != ((String)this.d.get(0)).length()) {
/*  73 */       throw new IllegalArgumentException("Pattern must be the same width on every line!");
/*     */     }
/*  75 */     this.d.add(☃);
/*  76 */     return this;
/*     */   }
/*     */   
/*     */   public jh a(String ☃, ag ag1) {
/*  80 */     this.f.a(☃, ag1);
/*  81 */     return this;
/*     */   }
/*     */   
/*     */   public jh b(String ☃) {
/*  85 */     this.g = ☃;
/*  86 */     return this;
/*     */   }
/*     */   
/*     */   public void a(Consumer<jf> ☃) {
/*  90 */     a(☃, gm.T.b(this.b));
/*     */   }
/*     */   
/*     */   public void a(Consumer<jf> ☃, String str) {
/*  94 */     vk vk = gm.T.b(this.b);
/*  95 */     if ((new vk(str)).equals(vk)) {
/*  96 */       throw new IllegalStateException("Shaped Recipe " + str + " should remove its 'save' argument");
/*     */     }
/*  98 */     a(☃, new vk(str));
/*     */   }
/*     */   
/*     */   public void a(Consumer<jf> ☃, vk vk1) {
/* 102 */     a(vk1);
/* 103 */     this.f
/* 104 */       .a(new vk("recipes/root"))
/* 105 */       .a("has_the_recipe", ch.a(vk1))
/* 106 */       .a(ab.a.c(vk1))
/* 107 */       .a(aj.b);
/* 108 */     ☃.accept(new a(this, vk1, this.b, this.c, (this.g == null) ? "" : this.g, this.d, this.e, this.f, new vk(vk1.b(), "recipes/" + this.b.q().b() + "/" + vk1.a())));
/*     */   }
/*     */   
/*     */   private void a(vk ☃) {
/* 112 */     if (this.d.isEmpty()) {
/* 113 */       throw new IllegalStateException("No pattern is defined for shaped recipe " + ☃ + "!");
/*     */     }
/*     */     
/* 116 */     Set<Character> set = Sets.newHashSet(this.e.keySet());
/* 117 */     set.remove(Character.valueOf(' '));
/*     */     
/* 119 */     for (String str : this.d) {
/* 120 */       for (int i = 0; i < str.length(); i++) {
/* 121 */         char c = str.charAt(i);
/* 122 */         if (!this.e.containsKey(Character.valueOf(c)) && c != ' ') {
/* 123 */           throw new IllegalStateException("Pattern in recipe " + ☃ + " uses undefined symbol '" + c + "'");
/*     */         }
/* 125 */         set.remove(Character.valueOf(c));
/*     */       } 
/*     */     } 
/*     */     
/* 129 */     if (!set.isEmpty()) {
/* 130 */       throw new IllegalStateException("Ingredients are defined but not used in pattern for recipe " + ☃);
/*     */     }
/*     */     
/* 133 */     if (this.d.size() == 1 && ((String)this.d.get(0)).length() == 1) {
/* 134 */       throw new IllegalStateException("Shaped recipe " + ☃ + " only takes in a single item - should it be a shapeless recipe instead?");
/*     */     }
/*     */     
/* 137 */     if (this.f.c().isEmpty())
/* 138 */       throw new IllegalStateException("No way of obtaining recipe " + ☃); 
/*     */   }
/*     */   
/*     */   class a
/*     */     implements jf {
/*     */     private final vk b;
/*     */     private final blx c;
/*     */     private final int d;
/*     */     private final String e;
/*     */     private final List<String> f;
/*     */     private final Map<Character, bon> g;
/*     */     private final y.a h;
/*     */     private final vk i;
/*     */     
/*     */     public a(jh this$0, vk ☃, blx blx1, int i, String str, List<String> list, Map<Character, bon> map, y.a a1, vk vk1) {
/* 153 */       this.b = ☃;
/* 154 */       this.c = blx1;
/* 155 */       this.d = i;
/* 156 */       this.e = str;
/* 157 */       this.f = list;
/* 158 */       this.g = map;
/* 159 */       this.h = a1;
/* 160 */       this.i = vk1;
/*     */     }
/*     */ 
/*     */     
/*     */     public void a(JsonObject ☃) {
/* 165 */       if (!this.e.isEmpty()) {
/* 166 */         ☃.addProperty("group", this.e);
/*     */       }
/*     */       
/* 169 */       JsonArray jsonArray = new JsonArray();
/* 170 */       for (String str : this.f) {
/* 171 */         jsonArray.add(str);
/*     */       }
/* 173 */       ☃.add("pattern", (JsonElement)jsonArray);
/*     */       
/* 175 */       JsonObject jsonObject1 = new JsonObject();
/* 176 */       for (Map.Entry<Character, bon> entry : this.g.entrySet()) {
/* 177 */         jsonObject1.add(String.valueOf(entry.getKey()), ((bon)entry.getValue()).c());
/*     */       }
/* 179 */       ☃.add("key", (JsonElement)jsonObject1);
/*     */       
/* 181 */       JsonObject jsonObject2 = new JsonObject();
/* 182 */       jsonObject2.addProperty("item", gm.T.b(this.c).toString());
/* 183 */       if (this.d > 1) {
/* 184 */         jsonObject2.addProperty("count", Integer.valueOf(this.d));
/*     */       }
/* 186 */       ☃.add("result", (JsonElement)jsonObject2);
/*     */     }
/*     */ 
/*     */     
/*     */     public bos<?> c() {
/* 191 */       return bos.a;
/*     */     }
/*     */ 
/*     */     
/*     */     public vk b() {
/* 196 */       return this.b;
/*     */     }
/*     */ 
/*     */     
/*     */     @Nullable
/*     */     public JsonObject d() {
/* 202 */       return this.h.b();
/*     */     }
/*     */ 
/*     */     
/*     */     @Nullable
/*     */     public vk e() {
/* 208 */       return this.i;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\jh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */