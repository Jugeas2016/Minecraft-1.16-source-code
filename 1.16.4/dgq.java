/*     */ import com.google.common.base.Joiner;
/*     */ import com.google.common.collect.ComparisonChain;
/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.collect.Maps;
/*     */ import com.google.gson.JsonArray;
/*     */ import com.google.gson.JsonElement;
/*     */ import com.google.gson.JsonObject;
/*     */ import com.google.gson.JsonParser;
/*     */ import java.util.Comparator;
/*     */ import java.util.List;
/*     */ import java.util.Locale;
/*     */ import java.util.Map;
/*     */ import java.util.Objects;
/*     */ import org.apache.commons.lang3.builder.EqualsBuilder;
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
/*     */ public class dgq
/*     */   extends dhc
/*     */ {
/*  30 */   private static final Logger s = LogManager.getLogger();
/*     */   
/*     */   public long a;
/*     */   
/*     */   public String b;
/*     */   
/*     */   public String c;
/*     */   
/*     */   public String d;
/*     */   
/*     */   public b e;
/*     */   public String f;
/*     */   public String g;
/*     */   public List<dgn> h;
/*     */   public Map<Integer, dgw> i;
/*     */   public boolean j;
/*     */   public boolean k;
/*     */   public int l;
/*     */   public c m;
/*     */   public int n;
/*     */   public String o;
/*     */   public int p;
/*     */   public String q;
/*  53 */   public dgt r = new dgt();
/*     */   
/*     */   public String a() {
/*  56 */     return this.d;
/*     */   }
/*     */   
/*     */   public String b() {
/*  60 */     return this.c;
/*     */   }
/*     */   
/*     */   public String c() {
/*  64 */     return this.o;
/*     */   }
/*     */   
/*     */   public void a(String ☃) {
/*  68 */     this.c = ☃;
/*     */   }
/*     */   
/*     */   public void b(String ☃) {
/*  72 */     this.d = ☃;
/*     */   }
/*     */   
/*     */   public void a(dgu ☃) {
/*  76 */     List<String> list = Lists.newArrayList();
/*     */     
/*  78 */     int i = 0;
/*     */     
/*  80 */     for (String str1 : ☃.b) {
/*  81 */       if (str1.equals(djz.C().J().b())) {
/*     */         continue;
/*     */       }
/*     */       
/*  85 */       String str2 = "";
/*     */       
/*     */       try {
/*  88 */         str2 = dis.a(str1);
/*  89 */       } catch (Exception exception) {
/*     */         
/*  91 */         s.error("Could not get name for " + str1, exception);
/*     */         
/*     */         continue;
/*     */       } 
/*  95 */       list.add(str2);
/*  96 */       i++;
/*     */     } 
/*     */     
/*  99 */     this.r.a = String.valueOf(i);
/* 100 */     this.r.b = Joiner.on('\n').join(list);
/*     */   }
/*     */   
/*     */   public static dgq a(JsonObject ☃) {
/* 104 */     dgq dgq1 = new dgq();
/*     */     try {
/* 106 */       dgq1.a = dip.a("id", ☃, -1L);
/* 107 */       dgq1.b = dip.a("remoteSubscriptionId", ☃, (String)null);
/* 108 */       dgq1.c = dip.a("name", ☃, (String)null);
/* 109 */       dgq1.d = dip.a("motd", ☃, (String)null);
/* 110 */       dgq1.e = e(dip.a("state", ☃, b.a.name()));
/* 111 */       dgq1.f = dip.a("owner", ☃, (String)null);
/* 112 */       if (☃.get("players") != null && ☃.get("players").isJsonArray()) {
/* 113 */         dgq1.h = a(☃.get("players").getAsJsonArray());
/* 114 */         a(dgq1);
/*     */       } else {
/* 116 */         dgq1.h = Lists.newArrayList();
/*     */       } 
/* 118 */       dgq1.l = dip.a("daysLeft", ☃, 0);
/* 119 */       dgq1.j = dip.a("expired", ☃, false);
/* 120 */       dgq1.k = dip.a("expiredTrial", ☃, false);
/* 121 */       dgq1.m = f(dip.a("worldType", ☃, c.a.name()));
/* 122 */       dgq1.g = dip.a("ownerUUID", ☃, "");
/*     */       
/* 124 */       if (☃.get("slots") != null && ☃.get("slots").isJsonArray()) {
/* 125 */         dgq1.i = b(☃.get("slots").getAsJsonArray());
/*     */       } else {
/* 127 */         dgq1.i = e();
/*     */       } 
/*     */       
/* 130 */       dgq1.o = dip.a("minigameName", ☃, (String)null);
/* 131 */       dgq1.n = dip.a("activeSlot", ☃, -1);
/* 132 */       dgq1.p = dip.a("minigameId", ☃, -1);
/* 133 */       dgq1.q = dip.a("minigameImage", ☃, (String)null);
/* 134 */     } catch (Exception exception) {
/* 135 */       s.error("Could not parse McoServer: " + exception.getMessage());
/*     */     } 
/* 137 */     return dgq1;
/*     */   }
/*     */   
/*     */   private static void a(dgq ☃) {
/* 141 */     ☃.h.sort((☃, dgn1) -> ComparisonChain.start().compareFalseFirst(dgn1.d(), ☃.d()).compare(☃.a().toLowerCase(Locale.ROOT), dgn1.a().toLowerCase(Locale.ROOT)).result());
/*     */   }
/*     */   
/*     */   private static List<dgn> a(JsonArray ☃) {
/* 145 */     List<dgn> list = Lists.newArrayList();
/* 146 */     for (JsonElement jsonElement : ☃) {
/*     */       try {
/* 148 */         JsonObject jsonObject = jsonElement.getAsJsonObject();
/* 149 */         dgn dgn = new dgn();
/* 150 */         dgn.a(dip.a("name", jsonObject, (String)null));
/* 151 */         dgn.b(dip.a("uuid", jsonObject, (String)null));
/* 152 */         dgn.a(dip.a("operator", jsonObject, false));
/* 153 */         dgn.b(dip.a("accepted", jsonObject, false));
/* 154 */         dgn.c(dip.a("online", jsonObject, false));
/* 155 */         list.add(dgn);
/* 156 */       } catch (Exception exception) {}
/*     */     } 
/*     */     
/* 159 */     return list;
/*     */   }
/*     */   
/*     */   private static Map<Integer, dgw> b(JsonArray ☃) {
/* 163 */     Map<Integer, dgw> map = Maps.newHashMap();
/* 164 */     for (JsonElement jsonElement : ☃) {
/*     */       try {
/*     */         dgw dgw;
/* 167 */         JsonObject jsonObject = jsonElement.getAsJsonObject();
/*     */         
/* 169 */         JsonParser jsonParser = new JsonParser();
/* 170 */         JsonElement jsonElement1 = jsonParser.parse(jsonObject.get("options").getAsString());
/*     */         
/* 172 */         if (jsonElement1 == null) {
/* 173 */           dgw = dgw.a();
/*     */         } else {
/* 175 */           dgw = dgw.a(jsonElement1.getAsJsonObject());
/*     */         } 
/*     */         
/* 178 */         int j = dip.a("slotId", jsonObject, -1);
/*     */         
/* 180 */         map.put(Integer.valueOf(j), dgw);
/* 181 */       } catch (Exception exception) {}
/*     */     } 
/*     */ 
/*     */     
/* 185 */     for (int i = 1; i <= 3; i++) {
/* 186 */       if (!map.containsKey(Integer.valueOf(i))) {
/* 187 */         map.put(Integer.valueOf(i), dgw.b());
/*     */       }
/*     */     } 
/*     */     
/* 191 */     return map;
/*     */   }
/*     */   
/*     */   private static Map<Integer, dgw> e() {
/* 195 */     Map<Integer, dgw> ☃ = Maps.newHashMap();
/* 196 */     ☃.put(Integer.valueOf(1), dgw.b());
/* 197 */     ☃.put(Integer.valueOf(2), dgw.b());
/* 198 */     ☃.put(Integer.valueOf(3), dgw.b());
/*     */     
/* 200 */     return ☃;
/*     */   }
/*     */   
/*     */   public static dgq c(String ☃) {
/*     */     try {
/* 205 */       return a((new JsonParser()).parse(☃).getAsJsonObject());
/* 206 */     } catch (Exception exception) {
/* 207 */       s.error("Could not parse McoServer: " + exception.getMessage());
/*     */       
/* 209 */       return new dgq();
/*     */     } 
/*     */   }
/*     */   private static b e(String ☃) {
/*     */     try {
/* 214 */       return b.valueOf(☃);
/* 215 */     } catch (Exception exception) {
/* 216 */       return b.a;
/*     */     } 
/*     */   }
/*     */   
/*     */   private static c f(String ☃) {
/*     */     try {
/* 222 */       return c.valueOf(☃);
/* 223 */     } catch (Exception exception) {
/* 224 */       return c.a;
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public int hashCode() {
/* 230 */     return Objects.hash(new Object[] { Long.valueOf(this.a), this.c, this.d, this.e, this.f, Boolean.valueOf(this.j) });
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean equals(Object ☃) {
/* 235 */     if (☃ == null) {
/* 236 */       return false;
/*     */     }
/* 238 */     if (☃ == this) {
/* 239 */       return true;
/*     */     }
/* 241 */     if (☃.getClass() != getClass()) {
/* 242 */       return false;
/*     */     }
/* 244 */     dgq dgq1 = (dgq)☃;
/*     */     
/* 246 */     return (new EqualsBuilder())
/* 247 */       .append(this.a, dgq1.a)
/* 248 */       .append(this.c, dgq1.c)
/* 249 */       .append(this.d, dgq1.d)
/* 250 */       .append(this.e, dgq1.e)
/* 251 */       .append(this.f, dgq1.f)
/* 252 */       .append(this.j, dgq1.j)
/* 253 */       .append(this.m, this.m).isEquals();
/*     */   }
/*     */ 
/*     */   
/*     */   public dgq d() {
/* 258 */     dgq ☃ = new dgq();
/* 259 */     ☃.a = this.a;
/* 260 */     ☃.b = this.b;
/* 261 */     ☃.c = this.c;
/* 262 */     ☃.d = this.d;
/* 263 */     ☃.e = this.e;
/* 264 */     ☃.f = this.f;
/* 265 */     ☃.h = this.h;
/* 266 */     ☃.i = a(this.i);
/* 267 */     ☃.j = this.j;
/* 268 */     ☃.k = this.k;
/* 269 */     ☃.l = this.l;
/* 270 */     ☃.r = new dgt();
/* 271 */     ☃.r.a = this.r.a;
/* 272 */     ☃.r.b = this.r.b;
/* 273 */     ☃.m = this.m;
/* 274 */     ☃.g = this.g;
/* 275 */     ☃.o = this.o;
/* 276 */     ☃.n = this.n;
/* 277 */     ☃.p = this.p;
/* 278 */     ☃.q = this.q;
/* 279 */     return ☃;
/*     */   }
/*     */   
/*     */   public Map<Integer, dgw> a(Map<Integer, dgw> ☃) {
/* 283 */     Map<Integer, dgw> map = Maps.newHashMap();
/*     */     
/* 285 */     for (Map.Entry<Integer, dgw> entry : ☃.entrySet()) {
/* 286 */       map.put(entry.getKey(), ((dgw)entry.getValue()).d());
/*     */     }
/*     */     
/* 289 */     return map;
/*     */   }
/*     */   
/*     */   public String a(int ☃) {
/* 293 */     return this.c + " (" + ((dgw)this.i.get(Integer.valueOf(☃))).a(☃) + ")";
/*     */   }
/*     */   
/*     */   public dwz d(String ☃) {
/* 297 */     return new dwz(this.c, ☃, false);
/*     */   }
/*     */   
/*     */   public static class a implements Comparator<dgq> {
/*     */     private final String a;
/*     */     
/*     */     public a(String ☃) {
/* 304 */       this.a = ☃;
/*     */     }
/*     */ 
/*     */     
/*     */     public int a(dgq ☃, dgq dgq1) {
/* 309 */       return ComparisonChain.start()
/* 310 */         .compareTrueFirst((☃.e == dgq.b.c), (dgq1.e == dgq.b.c))
/* 311 */         .compareTrueFirst(☃.k, dgq1.k)
/* 312 */         .compareTrueFirst(☃.f.equals(this.a), dgq1.f.equals(this.a))
/* 313 */         .compareFalseFirst(☃.j, dgq1.j)
/* 314 */         .compareTrueFirst((☃.e == dgq.b.b), (dgq1.e == dgq.b.b))
/* 315 */         .compare(☃.a, dgq1.a).result();
/*     */     }
/*     */   }
/*     */   
/*     */   public enum b {
/* 320 */     a,
/* 321 */     b,
/* 322 */     c;
/*     */   }
/*     */   
/*     */   public enum c {
/* 326 */     a,
/* 327 */     b,
/* 328 */     c,
/* 329 */     d,
/* 330 */     e;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dgq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */