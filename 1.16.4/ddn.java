/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.collect.Maps;
/*     */ import java.util.Collection;
/*     */ import java.util.Collections;
/*     */ import java.util.List;
/*     */ import java.util.Map;
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
/*     */ 
/*     */ 
/*     */ public class ddn
/*     */ {
/*  29 */   private final Map<String, ddk> a = Maps.newHashMap();
/*  30 */   private final Map<ddq, List<ddk>> b = Maps.newHashMap();
/*  31 */   private final Map<String, Map<ddk, ddm>> c = Maps.newHashMap();
/*  32 */   private final ddk[] d = new ddk[19];
/*  33 */   private final Map<String, ddl> e = Maps.newHashMap();
/*  34 */   private final Map<String, ddl> f = Maps.newHashMap();
/*     */   
/*     */   public boolean b(String ☃) {
/*  37 */     return this.a.containsKey(☃);
/*     */   }
/*     */   private static String[] g;
/*     */   public ddk c(String ☃) {
/*  41 */     return this.a.get(☃);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public ddk d(@Nullable String ☃) {
/*  46 */     return this.a.get(☃);
/*     */   }
/*     */   
/*     */   public ddk a(String ☃, ddq ddq1, nr nr1, ddq.a a1) {
/*  50 */     if (☃.length() > 16) {
/*  51 */       throw new IllegalArgumentException("The objective name '" + ☃ + "' is too long!");
/*     */     }
/*  53 */     if (this.a.containsKey(☃)) {
/*  54 */       throw new IllegalArgumentException("An objective with the name '" + ☃ + "' already exists!");
/*     */     }
/*     */     
/*  57 */     ddk ddk1 = new ddk(this, ☃, ddq1, nr1, a1);
/*     */     
/*  59 */     ((List<ddk>)this.b.computeIfAbsent(ddq1, ☃ -> Lists.newArrayList())).add(ddk1);
/*  60 */     this.a.put(☃, ddk1);
/*  61 */     a(ddk1);
/*  62 */     return ddk1;
/*     */   }
/*     */   
/*     */   public final void a(ddq ☃, String str, Consumer<ddm> consumer) {
/*  66 */     ((List)this.b.getOrDefault(☃, Collections.emptyList())).forEach(ddk1 -> ☃.accept(c(str, ddk1)));
/*     */   }
/*     */   
/*     */   public boolean b(String ☃, ddk ddk1) {
/*  70 */     Map<ddk, ddm> map = this.c.get(☃);
/*  71 */     if (map == null) {
/*  72 */       return false;
/*     */     }
/*  74 */     ddm ddm = map.get(ddk1);
/*  75 */     return (ddm != null);
/*     */   }
/*     */   
/*     */   public ddm c(String ☃, ddk ddk1) {
/*  79 */     if (☃.length() > 40) {
/*  80 */       throw new IllegalArgumentException("The player name '" + ☃ + "' is too long!");
/*     */     }
/*  82 */     Map<ddk, ddm> map = this.c.computeIfAbsent(☃, ☃ -> Maps.newHashMap());
/*     */     
/*  84 */     return map.computeIfAbsent(ddk1, ddk1 -> {
/*     */           ddm ddm = new ddm(this, ddk1, ☃);
/*     */           ddm.c(0);
/*     */           return ddm;
/*     */         });
/*     */   }
/*     */   
/*     */   public Collection<ddm> i(ddk ☃) {
/*  92 */     List<ddm> list = Lists.newArrayList();
/*     */     
/*  94 */     for (Map<ddk, ddm> map : this.c.values()) {
/*  95 */       ddm ddm = map.get(☃);
/*  96 */       if (ddm != null) {
/*  97 */         list.add(ddm);
/*     */       }
/*     */     } 
/*     */     
/* 101 */     list.sort(ddm.a);
/*     */     
/* 103 */     return list;
/*     */   }
/*     */   
/*     */   public Collection<ddk> c() {
/* 107 */     return this.a.values();
/*     */   }
/*     */   
/*     */   public Collection<String> d() {
/* 111 */     return this.a.keySet();
/*     */   }
/*     */   
/*     */   public Collection<String> e() {
/* 115 */     return Lists.newArrayList(this.c.keySet());
/*     */   }
/*     */   
/*     */   public void d(String ☃, @Nullable ddk ddk1) {
/* 119 */     if (ddk1 == null) {
/* 120 */       Map<ddk, ddm> map = this.c.remove(☃);
/* 121 */       if (map != null) {
/* 122 */         a(☃);
/*     */       }
/*     */     } else {
/* 125 */       Map<ddk, ddm> map = this.c.get(☃);
/* 126 */       if (map != null) {
/* 127 */         ddm ddm = map.remove(ddk1);
/* 128 */         if (map.size() < 1) {
/* 129 */           Map<ddk, ddm> map1 = this.c.remove(☃);
/* 130 */           if (map1 != null) {
/* 131 */             a(☃);
/*     */           }
/* 133 */         } else if (ddm != null) {
/* 134 */           a(☃, ddk1);
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public Map<ddk, ddm> e(String ☃) {
/* 141 */     Map<ddk, ddm> map = this.c.get(☃);
/* 142 */     if (map == null) {
/* 143 */       map = Maps.newHashMap();
/*     */     }
/* 145 */     return map;
/*     */   }
/*     */   
/*     */   public void j(ddk ☃) {
/* 149 */     this.a.remove(☃.b());
/*     */     
/* 151 */     for (int i = 0; i < 19; i++) {
/* 152 */       if (a(i) == ☃) {
/* 153 */         a(i, (ddk)null);
/*     */       }
/*     */     } 
/*     */     
/* 157 */     List<ddk> list = this.b.get(☃.c());
/* 158 */     if (list != null) {
/* 159 */       list.remove(☃);
/*     */     }
/*     */     
/* 162 */     for (Map<ddk, ddm> map : this.c.values()) {
/* 163 */       map.remove(☃);
/*     */     }
/*     */     
/* 166 */     c(☃);
/*     */   }
/*     */   
/*     */   public void a(int ☃, @Nullable ddk ddk1) {
/* 170 */     this.d[☃] = ddk1;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public ddk a(int ☃) {
/* 175 */     return this.d[☃];
/*     */   }
/*     */   
/*     */   public ddl f(String ☃) {
/* 179 */     return this.e.get(☃);
/*     */   }
/*     */   
/*     */   public ddl g(String ☃) {
/* 183 */     if (☃.length() > 16) {
/* 184 */       throw new IllegalArgumentException("The team name '" + ☃ + "' is too long!");
/*     */     }
/* 186 */     ddl ddl = f(☃);
/* 187 */     if (ddl != null) {
/* 188 */       throw new IllegalArgumentException("A team with the name '" + ☃ + "' already exists!");
/*     */     }
/*     */     
/* 191 */     ddl = new ddl(this, ☃);
/* 192 */     this.e.put(☃, ddl);
/* 193 */     a(ddl);
/*     */     
/* 195 */     return ddl;
/*     */   }
/*     */   
/*     */   public void d(ddl ☃) {
/* 199 */     this.e.remove(☃.b());
/*     */ 
/*     */ 
/*     */     
/* 203 */     for (String str : ☃.g()) {
/* 204 */       this.f.remove(str);
/*     */     }
/*     */     
/* 207 */     c(☃);
/*     */   }
/*     */   
/*     */   public boolean a(String ☃, ddl ddl1) {
/* 211 */     if (☃.length() > 40) {
/* 212 */       throw new IllegalArgumentException("The player name '" + ☃ + "' is too long!");
/*     */     }
/*     */     
/* 215 */     if (i(☃) != null) {
/* 216 */       h(☃);
/*     */     }
/*     */     
/* 219 */     this.f.put(☃, ddl1);
/* 220 */     return ddl1.g().add(☃);
/*     */   }
/*     */   
/*     */   public boolean h(String ☃) {
/* 224 */     ddl ddl = i(☃);
/*     */     
/* 226 */     if (ddl != null) {
/* 227 */       b(☃, ddl);
/* 228 */       return true;
/*     */     } 
/* 230 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(String ☃, ddl ddl1) {
/* 235 */     if (i(☃) != ddl1) {
/* 236 */       throw new IllegalStateException("Player is either on another team or not on any team. Cannot remove from team '" + ddl1.b() + "'.");
/*     */     }
/*     */     
/* 239 */     this.f.remove(☃);
/* 240 */     ddl1.g().remove(☃);
/*     */   }
/*     */   
/*     */   public Collection<String> f() {
/* 244 */     return this.e.keySet();
/*     */   }
/*     */   
/*     */   public Collection<ddl> g() {
/* 248 */     return this.e.values();
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public ddl i(String ☃) {
/* 253 */     return this.f.get(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(ddk ☃) {}
/*     */ 
/*     */   
/*     */   public void b(ddk ☃) {}
/*     */ 
/*     */   
/*     */   public void c(ddk ☃) {}
/*     */ 
/*     */   
/*     */   public void a(ddm ☃) {}
/*     */ 
/*     */   
/*     */   public void a(String ☃) {}
/*     */ 
/*     */   
/*     */   public void a(String ☃, ddk ddk1) {}
/*     */ 
/*     */   
/*     */   public void a(ddl ☃) {}
/*     */ 
/*     */   
/*     */   public void b(ddl ☃) {}
/*     */ 
/*     */   
/*     */   public void c(ddl ☃) {}
/*     */   
/*     */   public static String b(int ☃) {
/* 284 */     switch (☃) {
/*     */       case 0:
/* 286 */         return "list";
/*     */       case 1:
/* 288 */         return "sidebar";
/*     */       case 2:
/* 290 */         return "belowName";
/*     */     } 
/* 292 */     if (☃ >= 3 && ☃ <= 18) {
/* 293 */       k k = k.a(☃ - 3);
/* 294 */       if (k != null && k != k.v) {
/* 295 */         return "sidebar.team." + k.f();
/*     */       }
/*     */     } 
/* 298 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public static int j(String ☃) {
/* 303 */     if ("list".equalsIgnoreCase(☃))
/* 304 */       return 0; 
/* 305 */     if ("sidebar".equalsIgnoreCase(☃))
/* 306 */       return 1; 
/* 307 */     if ("belowName".equalsIgnoreCase(☃)) {
/* 308 */       return 2;
/*     */     }
/* 310 */     if (☃.startsWith("sidebar.team.")) {
/* 311 */       String str = ☃.substring("sidebar.team.".length());
/* 312 */       k k = k.b(str);
/* 313 */       if (k != null && k.b() >= 0) {
/* 314 */         return k.b() + 3;
/*     */       }
/*     */     } 
/* 317 */     return -1;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static String[] h() {
/* 324 */     if (g == null) {
/* 325 */       g = new String[19];
/* 326 */       for (int ☃ = 0; ☃ < 19; ☃++) {
/* 327 */         g[☃] = b(☃);
/*     */       }
/*     */     } 
/* 330 */     return g;
/*     */   }
/*     */   
/*     */   public void a(aqa ☃) {
/* 334 */     if (☃ == null || ☃ instanceof bfw || ☃.aX()) {
/*     */       return;
/*     */     }
/* 337 */     String str = ☃.bT();
/* 338 */     d(str, null);
/* 339 */     h(str);
/*     */   }
/*     */   
/*     */   protected mj i() {
/* 343 */     mj ☃ = new mj();
/*     */     
/* 345 */     this.c.values().stream().map(Map::values).forEach(collection -> collection.stream().filter(()).forEach(()));
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
/* 356 */     return ☃;
/*     */   }
/*     */   
/*     */   protected void a(mj ☃) {
/* 360 */     for (int i = 0; i < ☃.size(); i++) {
/* 361 */       md md = ☃.a(i);
/*     */       
/* 363 */       ddk ddk1 = c(md.l("Objective"));
/* 364 */       String str = md.l("Name");
/* 365 */       if (str.length() > 40)
/*     */       {
/* 367 */         str = str.substring(0, 40);
/*     */       }
/* 369 */       ddm ddm = c(str, ddk1);
/* 370 */       ddm.c(md.h("Score"));
/* 371 */       if (md.e("Locked"))
/* 372 */         ddm.a(md.q("Locked")); 
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ddn.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */