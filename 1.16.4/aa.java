/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.collect.Maps;
/*     */ import com.google.gson.JsonDeserializationContext;
/*     */ import com.google.gson.JsonDeserializer;
/*     */ import com.google.gson.JsonElement;
/*     */ import com.google.gson.JsonObject;
/*     */ import com.google.gson.JsonParseException;
/*     */ import com.google.gson.JsonSerializationContext;
/*     */ import com.google.gson.JsonSerializer;
/*     */ import java.lang.reflect.Type;
/*     */ import java.util.Arrays;
/*     */ import java.util.Date;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Set;
/*     */ import javax.annotation.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class aa
/*     */   implements Comparable<aa>
/*     */ {
/*  24 */   private final Map<String, ae> a = Maps.newHashMap();
/*  25 */   private String[][] b = new String[0][];
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(Map<String, ad> ☃, String[][] arrayOfString) {
/*  31 */     Set<String> set = ☃.keySet();
/*  32 */     this.a.entrySet().removeIf(entry -> !☃.contains(entry.getKey()));
/*  33 */     for (String str : set) {
/*  34 */       if (!this.a.containsKey(str)) {
/*  35 */         this.a.put(str, new ae());
/*     */       }
/*     */     } 
/*  38 */     this.b = arrayOfString;
/*     */   }
/*     */   
/*     */   public boolean a() {
/*  42 */     if (this.b.length == 0) {
/*  43 */       return false;
/*     */     }
/*  45 */     for (String[] ☃ : this.b) {
/*  46 */       boolean bool = false;
/*  47 */       for (String str : ☃) {
/*  48 */         ae ae = c(str);
/*  49 */         if (ae != null && ae.a()) {
/*  50 */           bool = true;
/*     */           break;
/*     */         } 
/*     */       } 
/*  54 */       if (!bool) {
/*  55 */         return false;
/*     */       }
/*     */     } 
/*  58 */     return true;
/*     */   }
/*     */   
/*     */   public boolean b() {
/*  62 */     for (ae ☃ : this.a.values()) {
/*  63 */       if (☃.a()) {
/*  64 */         return true;
/*     */       }
/*     */     } 
/*  67 */     return false;
/*     */   }
/*     */   
/*     */   public boolean a(String ☃) {
/*  71 */     ae ae = this.a.get(☃);
/*  72 */     if (ae != null && !ae.a()) {
/*  73 */       ae.b();
/*  74 */       return true;
/*     */     } 
/*  76 */     return false;
/*     */   }
/*     */   
/*     */   public boolean b(String ☃) {
/*  80 */     ae ae = this.a.get(☃);
/*  81 */     if (ae != null && ae.a()) {
/*  82 */       ae.c();
/*  83 */       return true;
/*     */     } 
/*  85 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/*  90 */     return "AdvancementProgress{criteria=" + this.a + ", requirements=" + 
/*     */       
/*  92 */       Arrays.deepToString((Object[])this.b) + '}';
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(nf ☃) {
/*  97 */     ☃.d(this.a.size());
/*  98 */     for (Map.Entry<String, ae> entry : this.a.entrySet()) {
/*  99 */       ☃.a(entry.getKey());
/* 100 */       ((ae)entry.getValue()).a(☃);
/*     */     } 
/*     */   }
/*     */   
/*     */   public static aa b(nf ☃) {
/* 105 */     aa aa1 = new aa();
/* 106 */     int i = ☃.i();
/* 107 */     for (int j = 0; j < i; j++) {
/* 108 */       aa1.a.put(☃.e(32767), ae.b(☃));
/*     */     }
/* 110 */     return aa1;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public ae c(String ☃) {
/* 115 */     return this.a.get(☃);
/*     */   }
/*     */   
/*     */   public float c() {
/* 119 */     if (this.a.isEmpty()) {
/* 120 */       return 0.0F;
/*     */     }
/* 122 */     float ☃ = this.b.length;
/* 123 */     float f1 = h();
/* 124 */     return f1 / ☃;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public String d() {
/* 129 */     if (this.a.isEmpty()) {
/* 130 */       return null;
/*     */     }
/*     */     
/* 133 */     int ☃ = this.b.length;
/* 134 */     if (☃ <= 1) {
/* 135 */       return null;
/*     */     }
/*     */     
/* 138 */     int i = h();
/* 139 */     return i + "/" + ☃;
/*     */   }
/*     */   
/*     */   private int h() {
/* 143 */     int ☃ = 0;
/* 144 */     for (String[] arrayOfString : this.b) {
/* 145 */       boolean bool = false;
/* 146 */       for (String str : arrayOfString) {
/* 147 */         ae ae = c(str);
/* 148 */         if (ae != null && ae.a()) {
/* 149 */           bool = true;
/*     */           break;
/*     */         } 
/*     */       } 
/* 153 */       if (bool) {
/* 154 */         ☃++;
/*     */       }
/*     */     } 
/* 157 */     return ☃;
/*     */   }
/*     */   
/*     */   public Iterable<String> e() {
/* 161 */     List<String> ☃ = Lists.newArrayList();
/* 162 */     for (Map.Entry<String, ae> entry : this.a.entrySet()) {
/* 163 */       if (!((ae)entry.getValue()).a()) {
/* 164 */         ☃.add(entry.getKey());
/*     */       }
/*     */     } 
/* 167 */     return ☃;
/*     */   }
/*     */   
/*     */   public Iterable<String> f() {
/* 171 */     List<String> ☃ = Lists.newArrayList();
/* 172 */     for (Map.Entry<String, ae> entry : this.a.entrySet()) {
/* 173 */       if (((ae)entry.getValue()).a()) {
/* 174 */         ☃.add(entry.getKey());
/*     */       }
/*     */     } 
/* 177 */     return ☃;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public Date g() {
/* 182 */     Date ☃ = null;
/*     */     
/* 184 */     for (ae ae : this.a.values()) {
/* 185 */       if (ae.a() && (☃ == null || ae.d().before(☃))) {
/* 186 */         ☃ = ae.d();
/*     */       }
/*     */     } 
/*     */     
/* 190 */     return ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(aa ☃) {
/* 195 */     Date date1 = g();
/* 196 */     Date date2 = ☃.g();
/*     */     
/* 198 */     if (date1 == null && date2 != null) {
/* 199 */       return 1;
/*     */     }
/* 201 */     if (date1 != null && date2 == null) {
/* 202 */       return -1;
/*     */     }
/* 204 */     if (date1 == null && date2 == null) {
/* 205 */       return 0;
/*     */     }
/*     */     
/* 208 */     return date1.compareTo(date2);
/*     */   }
/*     */   
/*     */   public static class a
/*     */     implements JsonDeserializer<aa>, JsonSerializer<aa> {
/*     */     public JsonElement a(aa ☃, Type type, JsonSerializationContext jsonSerializationContext) {
/* 214 */       JsonObject jsonObject1 = new JsonObject();
/* 215 */       JsonObject jsonObject2 = new JsonObject();
/* 216 */       for (Map.Entry<String, ae> entry : (Iterable<Map.Entry<String, ae>>)aa.b(☃).entrySet()) {
/* 217 */         ae ae = entry.getValue();
/* 218 */         if (ae.a()) {
/* 219 */           jsonObject2.add(entry.getKey(), ae.e());
/*     */         }
/*     */       } 
/* 222 */       if (!jsonObject2.entrySet().isEmpty()) {
/* 223 */         jsonObject1.add("criteria", (JsonElement)jsonObject2);
/*     */       }
/* 225 */       jsonObject1.addProperty("done", Boolean.valueOf(☃.a()));
/* 226 */       return (JsonElement)jsonObject1;
/*     */     }
/*     */ 
/*     */     
/*     */     public aa a(JsonElement ☃, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
/* 231 */       JsonObject jsonObject1 = afd.m(☃, "advancement");
/* 232 */       JsonObject jsonObject2 = afd.a(jsonObject1, "criteria", new JsonObject());
/* 233 */       aa aa = new aa();
/*     */       
/* 235 */       for (Map.Entry<String, JsonElement> entry : (Iterable<Map.Entry<String, JsonElement>>)jsonObject2.entrySet()) {
/* 236 */         String str = entry.getKey();
/* 237 */         aa.b(aa).put(str, ae.a(afd.a(entry.getValue(), str)));
/*     */       } 
/*     */       
/* 240 */       return aa;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\aa.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */