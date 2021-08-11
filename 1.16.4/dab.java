/*     */ import com.google.common.collect.ImmutableList;
/*     */ import com.google.common.collect.ImmutableSet;
/*     */ import com.google.common.collect.Iterables;
/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.gson.JsonArray;
/*     */ import com.google.gson.JsonDeserializationContext;
/*     */ import com.google.gson.JsonElement;
/*     */ import com.google.gson.JsonObject;
/*     */ import com.google.gson.JsonSerializationContext;
/*     */ import com.mojang.brigadier.StringReader;
/*     */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*     */ import java.util.List;
/*     */ import java.util.Set;
/*     */ import java.util.function.Function;
/*     */ import java.util.function.Supplier;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class dab
/*     */   extends dai
/*     */ {
/*     */   private final c a;
/*     */   private final List<b> b;
/*     */   
/*     */   static class b
/*     */   {
/*     */     private final String a;
/*     */     private final dr.h b;
/*     */     private final String c;
/*     */     private final dr.h d;
/*     */     private final dab.d e;
/*     */     
/*     */     private b(String ☃, String str1, dab.d d1) {
/*  42 */       this.a = ☃;
/*  43 */       this.b = dab.a(☃);
/*  44 */       this.c = str1;
/*  45 */       this.d = dab.a(str1);
/*  46 */       this.e = d1;
/*     */     }
/*     */     
/*     */     public void a(Supplier<mt> ☃, mt mt1) {
/*     */       try {
/*  51 */         List<mt> list = this.b.a(mt1);
/*  52 */         if (!list.isEmpty()) {
/*  53 */           this.e.a(☃.get(), this.d, list);
/*     */         }
/*  55 */       } catch (CommandSyntaxException commandSyntaxException) {}
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public JsonObject a() {
/*  61 */       JsonObject ☃ = new JsonObject();
/*  62 */       ☃.addProperty("source", this.a);
/*  63 */       ☃.addProperty("target", this.c);
/*  64 */       ☃.addProperty("op", dab.d.a(this.e));
/*  65 */       return ☃;
/*     */     }
/*     */     
/*     */     public static b a(JsonObject ☃) {
/*  69 */       String str1 = afd.h(☃, "source");
/*  70 */       String str2 = afd.h(☃, "target");
/*  71 */       dab.d d1 = dab.d.a(afd.h(☃, "op"));
/*  72 */       return new b(str1, str2, d1);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private dab(dbo[] ☃, c c1, List<b> list) {
/*  80 */     super(☃);
/*  81 */     this.a = c1;
/*  82 */     this.b = (List<b>)ImmutableList.copyOf(list);
/*     */   }
/*     */ 
/*     */   
/*     */   public dak b() {
/*  87 */     return dal.u;
/*     */   }
/*     */   
/*     */   private static dr.h b(String ☃) {
/*     */     try {
/*  92 */       return (new dr()).a(new StringReader(☃));
/*  93 */     } catch (CommandSyntaxException commandSyntaxException) {
/*  94 */       throw new IllegalArgumentException("Failed to parse path " + ☃, commandSyntaxException);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public Set<daz<?>> a() {
/* 100 */     return (Set<daz<?>>)ImmutableSet.of(this.a.f);
/*     */   }
/*     */ 
/*     */   
/*     */   public bmb a(bmb ☃, cyv cyv1) {
/* 105 */     mt mt = this.a.g.apply(cyv1);
/* 106 */     if (mt != null) {
/* 107 */       this.b.forEach(b1 -> b1.a(☃::p, mt1));
/*     */     }
/*     */     
/* 110 */     return ☃;
/*     */   }
/*     */   
/*     */   public static class a extends dai.a<a> {
/*     */     private final dab.c a;
/* 115 */     private final List<dab.b> b = Lists.newArrayList();
/*     */     
/*     */     private a(dab.c ☃) {
/* 118 */       this.a = ☃;
/*     */     }
/*     */     
/*     */     public a a(String ☃, String str1, dab.d d1) {
/* 122 */       this.b.add(new dab.b(☃, str1, d1));
/* 123 */       return this;
/*     */     }
/*     */     
/*     */     public a a(String ☃, String str1) {
/* 127 */       return a(☃, str1, dab.d.a);
/*     */     }
/*     */ 
/*     */     
/*     */     protected a a() {
/* 132 */       return this;
/*     */     }
/*     */ 
/*     */     
/*     */     public daj b() {
/* 137 */       return new dab(g(), this.a, this.b);
/*     */     }
/*     */   }
/*     */   
/*     */   public static a a(c ☃) {
/* 142 */     return new a(☃);
/*     */   }
/*     */   private static final Function<ccj, mt> e;
/* 145 */   private static final Function<aqa, mt> d = cb::b; static {
/* 146 */     e = (☃ -> ☃.a(new md()));
/*     */   }
/*     */   
/* 149 */   public enum d { a("replace")
/*     */     {
/*     */       public void a(mt ☃, dr.h h1, List<mt> list) throws CommandSyntaxException {
/* 152 */         h1.b(☃, (mt)Iterables.getLast(list)::c);
/*     */       }
/*     */     },
/* 155 */     b("append")
/*     */     {
/*     */       public void a(mt ☃, dr.h h1, List<mt> list) throws CommandSyntaxException {
/* 158 */         List<mt> list1 = h1.a(☃, mj::new);
/* 159 */         list1.forEach(mt1 -> {
/*     */               
/*     */               if (mt1 instanceof mj) {
/*     */                 ☃.forEach(());
/*     */               }
/*     */             });
/*     */       }
/*     */     },
/* 167 */     c("merge")
/*     */     {
/*     */       public void a(mt ☃, dr.h h1, List<mt> list) throws CommandSyntaxException {
/* 170 */         List<mt> list1 = h1.a(☃, md::new);
/* 171 */         list1.forEach(mt1 -> {
/*     */               if (mt1 instanceof md) {
/*     */                 ☃.forEach(());
/*     */               }
/*     */             });
/*     */       }
/*     */     };
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     private final String d;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     d(String ☃) {
/* 189 */       this.d = ☃;
/*     */     }
/*     */     
/*     */     public static d a(String ☃) {
/* 193 */       for (d d1 : values()) {
/* 194 */         if (d1.d.equals(☃)) {
/* 195 */           return d1;
/*     */         }
/*     */       } 
/* 198 */       throw new IllegalArgumentException("Invalid merge strategy" + ☃);
/*     */     }
/*     */     
/*     */     public abstract void a(mt param1mt, dr.h param1h, List<mt> param1List) throws CommandSyntaxException; }
/*     */   
/* 203 */   public enum c { a("this", dbc.a, (String)dab.c()),
/* 204 */     b("killer", dbc.d, (String)dab.c()),
/* 205 */     c("killer_player", dbc.b, (String)dab.c()),
/* 206 */     d("block_entity", dbc.h, (String)dab.d());
/*     */     
/*     */     public final String e;
/*     */     public final daz<?> f;
/*     */     public final Function<cyv, mt> g;
/*     */     
/*     */     <T> c(String ☃, daz<T> daz1, Function<? super T, mt> function) {
/* 213 */       this.e = ☃;
/* 214 */       this.f = daz1;
/* 215 */       this.g = (cyv1 -> {
/*     */           T t = cyv1.c(☃);
/*     */           return (t != null) ? function.apply(t) : null;
/*     */         });
/*     */     }
/*     */     
/*     */     public static c a(String ☃) {
/* 222 */       for (c c1 : values()) {
/* 223 */         if (c1.e.equals(☃)) {
/* 224 */           return c1;
/*     */         }
/*     */       } 
/* 227 */       throw new IllegalArgumentException("Invalid tag source " + ☃);
/*     */     } }
/*     */ 
/*     */   
/*     */   public static class e
/*     */     extends dai.c<dab> {
/*     */     public void a(JsonObject ☃, dab dab1, JsonSerializationContext jsonSerializationContext) {
/* 234 */       super.a(☃, dab1, jsonSerializationContext);
/* 235 */       ☃.addProperty("source", (dab.a(dab1)).e);
/* 236 */       JsonArray jsonArray = new JsonArray();
/* 237 */       dab.b(dab1).stream().map(dab.b::a).forEach(jsonArray::add);
/* 238 */       ☃.add("ops", (JsonElement)jsonArray);
/*     */     }
/*     */ 
/*     */     
/*     */     public dab a(JsonObject ☃, JsonDeserializationContext jsonDeserializationContext, dbo[] arrayOfDbo) {
/* 243 */       dab.c c1 = dab.c.a(afd.h(☃, "source"));
/* 244 */       List<dab.b> list = Lists.newArrayList();
/* 245 */       JsonArray jsonArray = afd.u(☃, "ops");
/* 246 */       for (JsonElement jsonElement : jsonArray) {
/* 247 */         JsonObject jsonObject = afd.m(jsonElement, "op");
/* 248 */         list.add(dab.b.a(jsonObject));
/*     */       } 
/* 250 */       return new dab(arrayOfDbo, c1, list);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dab.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */