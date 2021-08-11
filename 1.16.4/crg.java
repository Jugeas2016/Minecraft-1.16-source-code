/*     */ import com.google.common.collect.ImmutableList;
/*     */ import com.google.common.collect.Maps;
/*     */ import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
/*     */ import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
/*     */ import it.unimi.dsi.fastutil.longs.LongArrayList;
/*     */ import java.io.IOException;
/*     */ import java.util.HashMap;
/*     */ import java.util.List;
/*     */ import java.util.Locale;
/*     */ import java.util.Map;
/*     */ import javax.annotation.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class crg
/*     */ {
/*     */   private static final Map<String, String> a;
/*     */   private static final Map<String, String> b;
/*     */   private final boolean c;
/*     */   private final Map<String, Long2ObjectMap<md>> d;
/*     */   private final Map<String, crt> e;
/*     */   private final List<String> f;
/*     */   private final List<String> g;
/*     */   
/*     */   static {
/*  27 */     a = x.<Map<String, String>>a(Maps.newHashMap(), ☃ -> {
/*     */           ☃.put("Village", "Village");
/*     */           
/*     */           ☃.put("Mineshaft", "Mineshaft");
/*     */           
/*     */           ☃.put("Mansion", "Mansion");
/*     */           ☃.put("Igloo", "Temple");
/*     */           ☃.put("Desert_Pyramid", "Temple");
/*     */           ☃.put("Jungle_Pyramid", "Temple");
/*     */           ☃.put("Swamp_Hut", "Temple");
/*     */           ☃.put("Stronghold", "Stronghold");
/*     */           ☃.put("Monument", "Monument");
/*     */           ☃.put("Fortress", "Fortress");
/*     */           ☃.put("EndCity", "EndCity");
/*     */         });
/*  42 */     b = x.<Map<String, String>>a(Maps.newHashMap(), ☃ -> {
/*     */           ☃.put("Iglu", "Igloo");
/*     */           ☃.put("TeDP", "Desert_Pyramid");
/*     */           ☃.put("TeJP", "Jungle_Pyramid");
/*     */           ☃.put("TeSH", "Swamp_Hut");
/*     */         });
/*     */   }
/*     */   public crg(@Nullable cyc ☃, List<String> list1, List<String> list2) {
/*     */     int i;
/*  51 */     this.d = Maps.newHashMap();
/*  52 */     this.e = Maps.newHashMap();
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  57 */     this.f = list1;
/*  58 */     this.g = list2;
/*  59 */     a(☃);
/*     */ 
/*     */     
/*  62 */     boolean bool = false;
/*  63 */     for (String str : this.g) {
/*  64 */       i = bool | ((this.d.get(str) != null) ? 1 : 0);
/*     */     }
/*  66 */     this.c = i;
/*     */   }
/*     */   
/*     */   public void a(long ☃) {
/*  70 */     for (String str : this.f) {
/*  71 */       crt crt = this.e.get(str);
/*  72 */       if (crt != null && crt.c(☃)) {
/*  73 */         crt.d(☃);
/*  74 */         crt.b();
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public md a(md ☃) {
/*  80 */     md md1 = ☃.p("Level");
/*     */     
/*  82 */     brd brd = new brd(md1.h("xPos"), md1.h("zPos"));
/*     */     
/*  84 */     if (a(brd.b, brd.c)) {
/*  85 */       ☃ = a(☃, brd);
/*     */     }
/*     */     
/*  88 */     md md2 = md1.p("Structures");
/*  89 */     md md3 = md2.p("References");
/*     */     
/*  91 */     for (String str : this.g) {
/*  92 */       cla<?> cla = (cla)cla.a.get(str.toLowerCase(Locale.ROOT));
/*     */       
/*  94 */       if (md3.c(str, 12) || cla == null) {
/*     */         continue;
/*     */       }
/*     */       
/*  98 */       int i = 8;
/*  99 */       LongArrayList longArrayList = new LongArrayList();
/*     */       
/* 101 */       for (int j = brd.b - 8; j <= brd.b + 8; j++) {
/* 102 */         for (int k = brd.c - 8; k <= brd.c + 8; k++) {
/* 103 */           if (a(j, k, str)) {
/* 104 */             longArrayList.add(brd.a(j, k));
/*     */           }
/*     */         } 
/*     */       } 
/*     */       
/* 109 */       md3.c(str, (List<Long>)longArrayList);
/*     */     } 
/*     */     
/* 112 */     md2.a("References", md3);
/* 113 */     md1.a("Structures", md2);
/* 114 */     ☃.a("Level", md1);
/*     */     
/* 116 */     return ☃;
/*     */   }
/*     */   
/*     */   private boolean a(int ☃, int i, String str) {
/* 120 */     if (!this.c) {
/* 121 */       return false;
/*     */     }
/*     */     
/* 124 */     if (this.d.get(str) != null && ((crt)this.e.get(a.get(str))).b(brd.a(☃, i))) {
/* 125 */       return true;
/*     */     }
/*     */     
/* 128 */     return false;
/*     */   }
/*     */   
/*     */   private boolean a(int ☃, int i) {
/* 132 */     if (!this.c) {
/* 133 */       return false;
/*     */     }
/*     */     
/* 136 */     for (String str : this.g) {
/* 137 */       if (this.d.get(str) != null && ((crt)this.e.get(a.get(str))).c(brd.a(☃, i))) {
/* 138 */         return true;
/*     */       }
/*     */     } 
/* 141 */     return false;
/*     */   }
/*     */   
/*     */   private md a(md ☃, brd brd1) {
/* 145 */     md md1 = ☃.p("Level");
/* 146 */     md md2 = md1.p("Structures");
/* 147 */     md md3 = md2.p("Starts");
/*     */     
/* 149 */     for (String str : this.g) {
/* 150 */       Long2ObjectMap<md> long2ObjectMap = this.d.get(str);
/* 151 */       if (long2ObjectMap == null) {
/*     */         continue;
/*     */       }
/*     */       
/* 155 */       long l = brd1.a();
/*     */       
/* 157 */       if (!((crt)this.e.get(a.get(str))).c(l)) {
/*     */         continue;
/*     */       }
/*     */       
/* 161 */       md md4 = (md)long2ObjectMap.get(l);
/* 162 */       if (md4 == null) {
/*     */         continue;
/*     */       }
/*     */       
/* 166 */       md3.a(str, md4);
/*     */     } 
/*     */     
/* 169 */     md2.a("Starts", md3);
/* 170 */     md1.a("Structures", md2);
/* 171 */     ☃.a("Level", md1);
/*     */     
/* 173 */     return ☃;
/*     */   }
/*     */   
/*     */   private void a(@Nullable cyc ☃) {
/* 177 */     if (☃ == null) {
/*     */       return;
/*     */     }
/*     */     
/* 181 */     for (String str1 : this.f) {
/* 182 */       md md = new md();
/*     */       try {
/* 184 */         md = ☃.a(str1, 1493).p("data").p("Features");
/* 185 */         if (md.isEmpty()) {
/*     */           continue;
/*     */         }
/* 188 */       } catch (IOException iOException) {}
/*     */ 
/*     */       
/* 191 */       for (String str3 : md.d()) {
/* 192 */         md md1 = md.p(str3);
/* 193 */         long l = brd.a(md1.h("ChunkX"), md1.h("ChunkZ"));
/*     */ 
/*     */         
/* 196 */         mj mj = md1.d("Children", 10);
/* 197 */         if (!mj.isEmpty()) {
/* 198 */           String str5 = mj.a(0).l("id");
/* 199 */           String str6 = b.get(str5);
/* 200 */           if (str6 != null) {
/* 201 */             md1.a("id", str6);
/*     */           }
/*     */         } 
/*     */         
/* 205 */         String str4 = md1.l("id");
/*     */         
/* 207 */         ((Long2ObjectMap)this.d.computeIfAbsent(str4, ☃ -> new Long2ObjectOpenHashMap())).put(l, md1);
/*     */       } 
/*     */       
/* 210 */       String str2 = str1 + "_index";
/* 211 */       crt crt = ☃.<crt>a(() -> new crt(☃), str2);
/*     */       
/* 213 */       if (crt.a().isEmpty()) {
/*     */         
/* 215 */         crt crt1 = new crt(str2);
/* 216 */         this.e.put(str1, crt1);
/* 217 */         for (String str : md.d()) {
/* 218 */           md md1 = md.p(str);
/* 219 */           crt1.a(brd.a(md1.h("ChunkX"), md1.h("ChunkZ")));
/*     */         } 
/* 221 */         crt1.b(); continue;
/*     */       } 
/* 223 */       this.e.put(str1, crt);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public static crg a(vj<brx> ☃, @Nullable cyc cyc1) {
/* 229 */     if (☃ == brx.g) {
/* 230 */       return new crg(cyc1, 
/*     */           
/* 232 */           (List<String>)ImmutableList.of("Monument", "Stronghold", "Village", "Mineshaft", "Temple", "Mansion"), 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 240 */           (List<String>)ImmutableList.of("Village", "Mineshaft", "Mansion", "Igloo", "Desert_Pyramid", "Jungle_Pyramid", "Swamp_Hut", "Stronghold", "Monument"));
/*     */     }
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
/* 252 */     if (☃ == brx.h) {
/* 253 */       ImmutableList immutableList = ImmutableList.of("Fortress");
/* 254 */       return new crg(cyc1, (List<String>)immutableList, (List<String>)immutableList);
/* 255 */     }  if (☃ == brx.i) {
/* 256 */       ImmutableList immutableList = ImmutableList.of("EndCity");
/* 257 */       return new crg(cyc1, (List<String>)immutableList, (List<String>)immutableList);
/*     */     } 
/* 259 */     throw new RuntimeException(String.format("Unknown dimension type : %s", new Object[] { ☃ }));
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\crg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */