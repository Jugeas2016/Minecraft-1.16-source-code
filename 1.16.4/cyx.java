/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.gson.JsonDeserializationContext;
/*     */ import com.google.gson.JsonDeserializer;
/*     */ import com.google.gson.JsonElement;
/*     */ import com.google.gson.JsonObject;
/*     */ import com.google.gson.JsonParseException;
/*     */ import com.google.gson.JsonSerializationContext;
/*     */ import com.google.gson.JsonSerializer;
/*     */ import java.lang.reflect.Type;
/*     */ import java.util.List;
/*     */ import java.util.Random;
/*     */ import java.util.function.BiFunction;
/*     */ import java.util.function.Consumer;
/*     */ import java.util.function.Predicate;
/*     */ import org.apache.commons.lang3.ArrayUtils;
/*     */ import org.apache.commons.lang3.mutable.MutableInt;
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
/*     */ public class cyx
/*     */ {
/*     */   private final czq[] a;
/*     */   private final dbo[] b;
/*     */   private final Predicate<cyv> c;
/*     */   private final daj[] d;
/*     */   private final BiFunction<bmb, cyv, bmb> e;
/*     */   private final czb f;
/*     */   private final czd g;
/*     */   
/*     */   private cyx(czq[] ☃, dbo[] arrayOfDbo, daj[] arrayOfDaj, czb czb1, czd czd1) {
/*  42 */     this.a = ☃;
/*  43 */     this.b = arrayOfDbo;
/*  44 */     this.c = dbq.a((Predicate<cyv>[])arrayOfDbo);
/*  45 */     this.d = arrayOfDaj;
/*  46 */     this.e = dal.a((BiFunction<bmb, cyv, bmb>[])arrayOfDaj);
/*  47 */     this.f = czb1;
/*  48 */     this.g = czd1;
/*     */   }
/*     */   
/*     */   private void b(Consumer<bmb> ☃, cyv cyv1) {
/*  52 */     Random random = cyv1.a();
/*  53 */     List<czp> list = Lists.newArrayList();
/*  54 */     MutableInt mutableInt = new MutableInt();
/*  55 */     for (czq czq1 : this.a) {
/*  56 */       czq1.expand(cyv1, czp1 -> {
/*     */             int i = czp1.a(☃.b());
/*     */             
/*     */             if (i > 0) {
/*     */               list.add(czp1);
/*     */               mutableInt.add(i);
/*     */             } 
/*     */           });
/*     */     } 
/*  65 */     int i = list.size();
/*  66 */     if (mutableInt.intValue() == 0 || i == 0) {
/*     */       return;
/*     */     }
/*     */     
/*  70 */     if (i == 1) {
/*  71 */       ((czp)list.get(0)).a(☃, cyv1);
/*     */       
/*     */       return;
/*     */     } 
/*  75 */     int j = random.nextInt(mutableInt.intValue());
/*  76 */     for (czp czp : list) {
/*  77 */       j -= czp.a(cyv1.b());
/*  78 */       if (j < 0) {
/*  79 */         czp.a(☃, cyv1);
/*     */         return;
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public void a(Consumer<bmb> ☃, cyv cyv1) {
/*  86 */     if (!this.c.test(cyv1)) {
/*     */       return;
/*     */     }
/*     */     
/*  90 */     Consumer<bmb> consumer = daj.a(this.e, ☃, cyv1);
/*     */     
/*  92 */     Random random = cyv1.a();
/*  93 */     int i = this.f.a(random) + afm.d(this.g.b(random) * cyv1.b());
/*  94 */     for (int j = 0; j < i; j++)
/*  95 */       b(consumer, cyv1); 
/*     */   }
/*     */   
/*     */   public void a(czg ☃) {
/*     */     int i;
/* 100 */     for (i = 0; i < this.b.length; i++) {
/* 101 */       this.b[i].a(☃.b(".condition[" + i + "]"));
/*     */     }
/*     */     
/* 104 */     for (i = 0; i < this.d.length; i++) {
/* 105 */       this.d[i].a(☃.b(".functions[" + i + "]"));
/*     */     }
/*     */     
/* 108 */     for (i = 0; i < this.a.length; i++)
/* 109 */       this.a[i].a(☃.b(".entries[" + i + "]")); 
/*     */   }
/*     */   
/*     */   public static class a
/*     */     implements dag<a>, dbh<a> {
/* 114 */     private final List<czq> a = Lists.newArrayList();
/* 115 */     private final List<dbo> b = Lists.newArrayList();
/* 116 */     private final List<daj> c = Lists.newArrayList();
/* 117 */     private czb d = new czd(1.0F);
/* 118 */     private czd e = new czd(0.0F, 0.0F);
/*     */     
/*     */     public a a(czb ☃) {
/* 121 */       this.d = ☃;
/* 122 */       return this;
/*     */     }
/*     */ 
/*     */     
/*     */     public a a() {
/* 127 */       return this;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public a a(czq.a<?> ☃) {
/* 136 */       this.a.add(☃.b());
/* 137 */       return this;
/*     */     }
/*     */ 
/*     */     
/*     */     public a a(dbo.a ☃) {
/* 142 */       this.b.add(☃.build());
/* 143 */       return this;
/*     */     }
/*     */ 
/*     */     
/*     */     public a a(daj.a ☃) {
/* 148 */       this.c.add(☃.b());
/* 149 */       return this;
/*     */     }
/*     */     
/*     */     public cyx b() {
/* 153 */       if (this.d == null) {
/* 154 */         throw new IllegalArgumentException("Rolls not set");
/*     */       }
/*     */       
/* 157 */       return new cyx(this.a.<czq>toArray(new czq[0]), this.b.<dbo>toArray(new dbo[0]), this.c.<daj>toArray(new daj[0]), this.d, this.e);
/*     */     }
/*     */   }
/*     */   
/*     */   public static a a() {
/* 162 */     return new a();
/*     */   }
/*     */   
/*     */   public static class b
/*     */     implements JsonDeserializer<cyx>, JsonSerializer<cyx> {
/*     */     public cyx a(JsonElement ☃, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
/* 168 */       JsonObject jsonObject = afd.m(☃, "loot pool");
/* 169 */       czq[] arrayOfCzq = afd.<czq[]>a(jsonObject, "entries", jsonDeserializationContext, (Class)czq[].class);
/* 170 */       dbo[] arrayOfDbo = afd.<dbo[]>a(jsonObject, "conditions", new dbo[0], jsonDeserializationContext, (Class)dbo[].class);
/* 171 */       daj[] arrayOfDaj = afd.<daj[]>a(jsonObject, "functions", new daj[0], jsonDeserializationContext, (Class)daj[].class);
/* 172 */       czb czb = czc.a(jsonObject.get("rolls"), jsonDeserializationContext);
/* 173 */       czd czd = afd.<czd>a(jsonObject, "bonus_rolls", new czd(0.0F, 0.0F), jsonDeserializationContext, czd.class);
/* 174 */       return new cyx(arrayOfCzq, arrayOfDbo, arrayOfDaj, czb, czd);
/*     */     }
/*     */ 
/*     */     
/*     */     public JsonElement a(cyx ☃, Type type, JsonSerializationContext jsonSerializationContext) {
/* 179 */       JsonObject jsonObject = new JsonObject();
/* 180 */       jsonObject.add("rolls", czc.a(cyx.a(☃), jsonSerializationContext));
/* 181 */       jsonObject.add("entries", jsonSerializationContext.serialize(cyx.b(☃)));
/* 182 */       if (cyx.c(☃).b() != 0.0F && cyx.c(☃).c() != 0.0F) {
/* 183 */         jsonObject.add("bonus_rolls", jsonSerializationContext.serialize(cyx.c(☃)));
/*     */       }
/* 185 */       if (!ArrayUtils.isEmpty((Object[])cyx.d(☃))) {
/* 186 */         jsonObject.add("conditions", jsonSerializationContext.serialize(cyx.d(☃)));
/*     */       }
/* 188 */       if (!ArrayUtils.isEmpty((Object[])cyx.e(☃))) {
/* 189 */         jsonObject.add("functions", jsonSerializationContext.serialize(cyx.e(☃)));
/*     */       }
/* 191 */       return (JsonElement)jsonObject;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cyx.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */