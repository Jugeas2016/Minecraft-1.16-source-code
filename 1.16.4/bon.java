/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.gson.JsonArray;
/*     */ import com.google.gson.JsonElement;
/*     */ import com.google.gson.JsonObject;
/*     */ import com.google.gson.JsonParseException;
/*     */ import com.google.gson.JsonSyntaxException;
/*     */ import it.unimi.dsi.fastutil.ints.IntArrayList;
/*     */ import it.unimi.dsi.fastutil.ints.IntComparators;
/*     */ import it.unimi.dsi.fastutil.ints.IntList;
/*     */ import java.util.Arrays;
/*     */ import java.util.Collection;
/*     */ import java.util.Collections;
/*     */ import java.util.Comparator;
/*     */ import java.util.List;
/*     */ import java.util.function.Function;
/*     */ import java.util.function.Predicate;
/*     */ import java.util.stream.Stream;
/*     */ import java.util.stream.StreamSupport;
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
/*     */ public final class bon
/*     */   implements Predicate<bmb>
/*     */ {
/*  33 */   public static final bon a = new bon(Stream.empty());
/*     */   
/*     */   private final c[] b;
/*     */   private bmb[] c;
/*     */   private IntList d;
/*     */   
/*     */   private bon(Stream<? extends c> ☃) {
/*  40 */     this.b = ☃.<c>toArray(☃ -> new c[☃]);
/*     */   }
/*     */   
/*     */   public bmb[] a() {
/*  44 */     f();
/*  45 */     return this.c;
/*     */   }
/*     */   
/*     */   private void f() {
/*  49 */     if (this.c == null) {
/*  50 */       this.c = (bmb[])Arrays.<c>stream(this.b).flatMap(☃ -> ☃.a().stream()).distinct().toArray(☃ -> new bmb[☃]);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(@Nullable bmb ☃) {
/*  56 */     if (☃ == null) {
/*  57 */       return false;
/*     */     }
/*     */     
/*  60 */     f();
/*     */     
/*  62 */     if (this.c.length == 0) {
/*  63 */       return ☃.a();
/*     */     }
/*     */     
/*  66 */     for (bmb bmb1 : this.c) {
/*  67 */       if (bmb1.b() == ☃.b()) {
/*  68 */         return true;
/*     */       }
/*     */     } 
/*  71 */     return false;
/*     */   }
/*     */   
/*     */   public IntList b() {
/*  75 */     if (this.d == null) {
/*  76 */       f();
/*  77 */       this.d = (IntList)new IntArrayList(this.c.length);
/*  78 */       for (bmb ☃ : this.c) {
/*  79 */         this.d.add(bfy.c(☃));
/*     */       }
/*  81 */       this.d.sort((Comparator)IntComparators.NATURAL_COMPARATOR);
/*     */     } 
/*     */     
/*  84 */     return this.d;
/*     */   }
/*     */   
/*     */   public void a(nf ☃) {
/*  88 */     f();
/*  89 */     ☃.d(this.c.length);
/*  90 */     for (int i = 0; i < this.c.length; i++) {
/*  91 */       ☃.a(this.c[i]);
/*     */     }
/*     */   }
/*     */   
/*     */   public JsonElement c() {
/*  96 */     if (this.b.length == 1) {
/*  97 */       return (JsonElement)this.b[0].b();
/*     */     }
/*  99 */     JsonArray ☃ = new JsonArray();
/* 100 */     for (c c1 : this.b) {
/* 101 */       ☃.add((JsonElement)c1.b());
/*     */     }
/* 103 */     return (JsonElement)☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean d() {
/* 108 */     return (this.b.length == 0 && (this.c == null || this.c.length == 0) && (this.d == null || this.d.isEmpty()));
/*     */   }
/*     */   
/*     */   private static bon b(Stream<? extends c> ☃) {
/* 112 */     bon bon1 = new bon(☃);
/*     */     
/* 114 */     return (bon1.b.length == 0) ? a : bon1;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static bon a(brw... ☃) {
/* 122 */     return a(Arrays.<brw>stream(☃).map(bmb::new));
/*     */   }
/*     */   
/*     */   public static bon a(bmb... ☃) {
/* 126 */     return a(Arrays.stream(☃));
/*     */   }
/*     */   
/*     */   public static bon a(Stream<bmb> ☃) {
/* 130 */     return b(☃.filter(☃ -> !☃.a()).map(☃ -> new a(☃)));
/*     */   }
/*     */   
/*     */   public static bon a(ael<blx> ☃) {
/* 134 */     return b(Stream.of(new b(☃)));
/*     */   }
/*     */   
/*     */   public static bon b(nf ☃) {
/* 138 */     int i = ☃.i();
/* 139 */     return b(Stream.<c>generate(() -> new a(☃.n())).limit(i));
/*     */   }
/*     */   
/*     */   public static bon a(@Nullable JsonElement ☃) {
/* 143 */     if (☃ == null || ☃.isJsonNull()) {
/* 144 */       throw new JsonSyntaxException("Item cannot be null");
/*     */     }
/* 146 */     if (☃.isJsonObject())
/* 147 */       return b(Stream.of(a(☃.getAsJsonObject()))); 
/* 148 */     if (☃.isJsonArray()) {
/* 149 */       JsonArray jsonArray = ☃.getAsJsonArray();
/* 150 */       if (jsonArray.size() == 0) {
/* 151 */         throw new JsonSyntaxException("Item array cannot be empty, at least one item must be defined");
/*     */       }
/* 153 */       return b(StreamSupport.stream(jsonArray.spliterator(), false).map(☃ -> a(afd.m(☃, "item"))));
/*     */     } 
/* 155 */     throw new JsonSyntaxException("Expected item to be object or array of objects");
/*     */   }
/*     */ 
/*     */   
/*     */   private static c a(JsonObject ☃) {
/* 160 */     if (☃.has("item") && ☃.has("tag")) {
/* 161 */       throw new JsonParseException("An ingredient entry is either a tag or an item, not both");
/*     */     }
/* 163 */     if (☃.has("item")) {
/* 164 */       vk vk = new vk(afd.h(☃, "item"));
/* 165 */       blx blx = (blx)gm.T.b(vk).orElseThrow(() -> new JsonSyntaxException("Unknown item '" + ☃ + "'"));
/* 166 */       return new a(new bmb(blx));
/* 167 */     }  if (☃.has("tag")) {
/* 168 */       vk vk = new vk(afd.h(☃, "tag"));
/* 169 */       ael<blx> ael = aeh.a().b().a(vk);
/* 170 */       if (ael == null) {
/* 171 */         throw new JsonSyntaxException("Unknown item tag '" + vk + "'");
/*     */       }
/* 173 */       return new b(ael);
/*     */     } 
/* 175 */     throw new JsonParseException("An ingredient entry needs either a tag or an item");
/*     */   }
/*     */   
/*     */   static interface c {
/*     */     Collection<bmb> a();
/*     */     
/*     */     JsonObject b();
/*     */   }
/*     */   
/*     */   static class a
/*     */     implements c {
/*     */     private final bmb a;
/*     */     
/*     */     private a(bmb ☃) {
/* 189 */       this.a = ☃;
/*     */     }
/*     */ 
/*     */     
/*     */     public Collection<bmb> a() {
/* 194 */       return Collections.singleton(this.a);
/*     */     }
/*     */ 
/*     */     
/*     */     public JsonObject b() {
/* 199 */       JsonObject ☃ = new JsonObject();
/* 200 */       ☃.addProperty("item", gm.T.b(this.a.b()).toString());
/* 201 */       return ☃;
/*     */     }
/*     */   }
/*     */   
/*     */   static class b implements c {
/*     */     private final ael<blx> a;
/*     */     
/*     */     private b(ael<blx> ☃) {
/* 209 */       this.a = ☃;
/*     */     }
/*     */ 
/*     */     
/*     */     public Collection<bmb> a() {
/* 214 */       List<bmb> ☃ = Lists.newArrayList();
/* 215 */       for (blx blx : this.a.b()) {
/* 216 */         ☃.add(new bmb(blx));
/*     */       }
/* 218 */       return ☃;
/*     */     }
/*     */ 
/*     */     
/*     */     public JsonObject b() {
/* 223 */       JsonObject ☃ = new JsonObject();
/* 224 */       ☃.addProperty("tag", aeh.a().b().b(this.a).toString());
/* 225 */       return ☃;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bon.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */