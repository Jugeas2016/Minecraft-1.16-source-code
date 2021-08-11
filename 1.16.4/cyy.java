/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.gson.JsonDeserializationContext;
/*     */ import com.google.gson.JsonDeserializer;
/*     */ import com.google.gson.JsonElement;
/*     */ import com.google.gson.JsonObject;
/*     */ import com.google.gson.JsonParseException;
/*     */ import com.google.gson.JsonSerializationContext;
/*     */ import com.google.gson.JsonSerializer;
/*     */ import java.lang.reflect.Type;
/*     */ import java.util.Collections;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.Random;
/*     */ import java.util.function.BiFunction;
/*     */ import java.util.function.Consumer;
/*     */ import org.apache.commons.lang3.ArrayUtils;
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
/*     */ public class cyy
/*     */ {
/*  34 */   private static final Logger c = LogManager.getLogger();
/*     */   
/*  36 */   public static final cyy a = new cyy(dbb.a, new cyx[0], new daj[0]);
/*  37 */   public static final dba b = dbb.k;
/*     */   
/*     */   private final dba d;
/*     */   
/*     */   private final cyx[] e;
/*     */   
/*     */   private final daj[] f;
/*     */   private final BiFunction<bmb, cyv, bmb> g;
/*     */   
/*     */   private cyy(dba ☃, cyx[] arrayOfCyx, daj[] arrayOfDaj) {
/*  47 */     this.d = ☃;
/*  48 */     this.e = arrayOfCyx;
/*  49 */     this.f = arrayOfDaj;
/*  50 */     this.g = dal.a((BiFunction<bmb, cyv, bmb>[])arrayOfDaj);
/*     */   }
/*     */   
/*     */   public static Consumer<bmb> a(Consumer<bmb> ☃) {
/*  54 */     return bmb1 -> {
/*     */         if (bmb1.E() < bmb1.c()) {
/*     */           ☃.accept(bmb1);
/*     */         } else {
/*     */           int i = bmb1.E();
/*     */           while (i > 0) {
/*     */             bmb bmb2 = bmb1.i();
/*     */             bmb2.e(Math.min(bmb1.c(), i));
/*     */             i -= bmb2.E();
/*     */             ☃.accept(bmb2);
/*     */           } 
/*     */         } 
/*     */       };
/*     */   }
/*     */   
/*     */   public void a(cyv ☃, Consumer<bmb> consumer) {
/*  70 */     if (☃.a(this)) {
/*  71 */       Consumer<bmb> consumer1 = daj.a(this.g, consumer, ☃);
/*  72 */       for (cyx cyx1 : this.e) {
/*  73 */         cyx1.a(consumer1, ☃);
/*     */       }
/*  75 */       ☃.b(this);
/*     */     } else {
/*  77 */       c.warn("Detected infinite loop in loot tables");
/*     */     } 
/*     */   }
/*     */   
/*     */   public void b(cyv ☃, Consumer<bmb> consumer) {
/*  82 */     a(☃, a(consumer));
/*     */   }
/*     */   
/*     */   public List<bmb> a(cyv ☃) {
/*  86 */     List<bmb> list = Lists.newArrayList();
/*  87 */     b(☃, list::add);
/*  88 */     return list;
/*     */   }
/*     */   
/*     */   public dba a() {
/*  92 */     return this.d;
/*     */   }
/*     */   public void a(czg ☃) {
/*     */     int i;
/*  96 */     for (i = 0; i < this.e.length; i++) {
/*  97 */       this.e[i].a(☃.b(".pools[" + i + "]"));
/*     */     }
/*     */     
/* 100 */     for (i = 0; i < this.f.length; i++) {
/* 101 */       this.f[i].a(☃.b(".functions[" + i + "]"));
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(aon ☃, cyv cyv1) {
/* 106 */     List<bmb> list = a(cyv1);
/* 107 */     Random random = cyv1.a();
/* 108 */     List<Integer> list1 = a(☃, random);
/* 109 */     a(list, list1.size(), random);
/* 110 */     for (bmb bmb : list) {
/* 111 */       if (list1.isEmpty()) {
/* 112 */         c.warn("Tried to over-fill a container");
/*     */         
/*     */         return;
/*     */       } 
/* 116 */       if (bmb.a()) {
/* 117 */         ☃.a(((Integer)list1.remove(list1.size() - 1)).intValue(), bmb.b); continue;
/*     */       } 
/* 119 */       ☃.a(((Integer)list1.remove(list1.size() - 1)).intValue(), bmb);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   private void a(List<bmb> ☃, int i, Random random) {
/* 125 */     List<bmb> list = Lists.newArrayList();
/* 126 */     for (Iterator<bmb> iterator = ☃.iterator(); iterator.hasNext(); ) {
/* 127 */       bmb bmb = iterator.next();
/* 128 */       if (bmb.a()) {
/* 129 */         iterator.remove(); continue;
/* 130 */       }  if (bmb.E() > 1) {
/* 131 */         list.add(bmb);
/* 132 */         iterator.remove();
/*     */       } 
/*     */     } 
/*     */     
/* 136 */     while (i - ☃.size() - list.size() > 0 && !list.isEmpty()) {
/* 137 */       bmb bmb1 = list.remove(afm.a(random, 0, list.size() - 1));
/* 138 */       int j = afm.a(random, 1, bmb1.E() / 2);
/* 139 */       bmb bmb2 = bmb1.a(j);
/*     */       
/* 141 */       if (bmb1.E() > 1 && random.nextBoolean()) {
/* 142 */         list.add(bmb1);
/*     */       } else {
/* 144 */         ☃.add(bmb1);
/*     */       } 
/*     */       
/* 147 */       if (bmb2.E() > 1 && random.nextBoolean()) {
/* 148 */         list.add(bmb2); continue;
/*     */       } 
/* 150 */       ☃.add(bmb2);
/*     */     } 
/*     */ 
/*     */     
/* 154 */     ☃.addAll(list);
/*     */     
/* 156 */     Collections.shuffle(☃, random);
/*     */   }
/*     */   
/*     */   private List<Integer> a(aon ☃, Random random) {
/* 160 */     List<Integer> list = Lists.newArrayList();
/*     */     
/* 162 */     for (int i = 0; i < ☃.Z_(); i++) {
/* 163 */       if (☃.a(i).a()) {
/* 164 */         list.add(Integer.valueOf(i));
/*     */       }
/*     */     } 
/*     */     
/* 168 */     Collections.shuffle(list, random);
/* 169 */     return list;
/*     */   }
/*     */   
/*     */   public static class a implements dag<a> {
/* 173 */     private final List<cyx> a = Lists.newArrayList();
/*     */     
/* 175 */     private final List<daj> b = Lists.newArrayList();
/*     */     
/* 177 */     private dba c = cyy.b;
/*     */     
/*     */     public a a(cyx.a ☃) {
/* 180 */       this.a.add(☃.b());
/* 181 */       return this;
/*     */     }
/*     */     
/*     */     public a a(dba ☃) {
/* 185 */       this.c = ☃;
/* 186 */       return this;
/*     */     }
/*     */ 
/*     */     
/*     */     public a a(daj.a ☃) {
/* 191 */       this.b.add(☃.b());
/* 192 */       return this;
/*     */     }
/*     */ 
/*     */     
/*     */     public a a() {
/* 197 */       return this;
/*     */     }
/*     */     
/*     */     public cyy b() {
/* 201 */       return new cyy(this.c, this.a.<cyx>toArray(new cyx[0]), this.b.<daj>toArray(new daj[0]));
/*     */     }
/*     */   }
/*     */   
/*     */   public static a b() {
/* 206 */     return new a();
/*     */   }
/*     */   
/*     */   public static class b
/*     */     implements JsonDeserializer<cyy>, JsonSerializer<cyy> {
/*     */     public cyy a(JsonElement ☃, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
/* 212 */       JsonObject jsonObject = afd.m(☃, "loot table");
/* 213 */       cyx[] arrayOfCyx = afd.<cyx[]>a(jsonObject, "pools", new cyx[0], jsonDeserializationContext, (Class)cyx[].class);
/*     */       
/* 215 */       dba dba = null;
/*     */       
/* 217 */       if (jsonObject.has("type")) {
/* 218 */         String str = afd.h(jsonObject, "type");
/* 219 */         dba = dbb.a(new vk(str));
/*     */       } 
/*     */       
/* 222 */       daj[] arrayOfDaj = afd.<daj[]>a(jsonObject, "functions", new daj[0], jsonDeserializationContext, (Class)daj[].class);
/* 223 */       return new cyy((dba != null) ? dba : dbb.k, arrayOfCyx, arrayOfDaj);
/*     */     }
/*     */ 
/*     */     
/*     */     public JsonElement a(cyy ☃, Type type, JsonSerializationContext jsonSerializationContext) {
/* 228 */       JsonObject jsonObject = new JsonObject();
/* 229 */       if (cyy.a(☃) != cyy.b) {
/* 230 */         vk vk = dbb.a(cyy.a(☃));
/* 231 */         if (vk != null) {
/* 232 */           jsonObject.addProperty("type", vk.toString());
/*     */         } else {
/* 234 */           cyy.c().warn("Failed to find id for param set " + cyy.a(☃));
/*     */         } 
/*     */       } 
/*     */       
/* 238 */       if ((cyy.b(☃)).length > 0) {
/* 239 */         jsonObject.add("pools", jsonSerializationContext.serialize(cyy.b(☃)));
/*     */       }
/*     */       
/* 242 */       if (!ArrayUtils.isEmpty((Object[])cyy.c(☃))) {
/* 243 */         jsonObject.add("functions", jsonSerializationContext.serialize(cyy.c(☃)));
/*     */       }
/*     */       
/* 246 */       return (JsonElement)jsonObject;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cyy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */