/*     */ import com.google.common.collect.ImmutableList;
/*     */ import com.google.common.collect.ImmutableMap;
/*     */ import com.google.common.collect.ImmutableSet;
/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.collect.UnmodifiableIterator;
/*     */ import com.google.common.util.concurrent.ThreadFactoryBuilder;
/*     */ import com.mojang.datafixers.DataFixer;
/*     */ import it.unimi.dsi.fastutil.objects.Object2FloatMap;
/*     */ import it.unimi.dsi.fastutil.objects.Object2FloatMaps;
/*     */ import it.unimi.dsi.fastutil.objects.Object2FloatOpenCustomHashMap;
/*     */ import java.io.File;
/*     */ import java.io.IOException;
/*     */ import java.util.List;
/*     */ import java.util.ListIterator;
/*     */ import java.util.concurrent.ThreadFactory;
/*     */ import java.util.regex.Matcher;
/*     */ import java.util.regex.Pattern;
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
/*     */ 
/*     */ 
/*     */ public class aoi
/*     */ {
/*  38 */   private static final Logger a = LogManager.getLogger();
/*  39 */   private static final ThreadFactory b = (new ThreadFactoryBuilder()).setDaemon(true).build();
/*     */   
/*     */   private final ImmutableSet<vj<brx>> c;
/*     */   
/*     */   private final boolean d;
/*     */   private final cyg.a e;
/*     */   private final Thread f;
/*     */   private final DataFixer g;
/*     */   private volatile boolean h = true;
/*     */   private volatile boolean i;
/*     */   private volatile float j;
/*     */   private volatile int k;
/*     */   private volatile int l;
/*     */   private volatile int m;
/*  53 */   private final Object2FloatMap<vj<brx>> n = Object2FloatMaps.synchronize((Object2FloatMap)new Object2FloatOpenCustomHashMap(x.k()));
/*     */   
/*  55 */   private volatile nr o = new of("optimizeWorld.stage.counting");
/*     */   
/*  57 */   private static final Pattern p = Pattern.compile("^r\\.(-?[0-9]+)\\.(-?[0-9]+)\\.mca$");
/*     */   private final cyc q;
/*     */   
/*     */   public aoi(cyg.a ☃, DataFixer dataFixer, ImmutableSet<vj<brx>> immutableSet, boolean bool) {
/*  61 */     this.c = immutableSet;
/*  62 */     this.d = bool;
/*  63 */     this.g = dataFixer;
/*  64 */     this.e = ☃;
/*  65 */     this.q = new cyc(new File(this.e.a(brx.g), "data"), dataFixer);
/*     */     
/*  67 */     this.f = b.newThread(this::i);
/*  68 */     this.f.setUncaughtExceptionHandler((☃, throwable) -> {
/*     */           a.error("Error upgrading world", throwable);
/*     */           this.o = new of("optimizeWorld.stage.failed");
/*     */           this.i = true;
/*     */         });
/*  73 */     this.f.start();
/*     */   }
/*     */   
/*     */   public void a() {
/*  77 */     this.h = false;
/*     */     try {
/*  79 */       this.f.join();
/*  80 */     } catch (InterruptedException interruptedException) {}
/*     */   }
/*     */ 
/*     */   
/*     */   private void i() {
/*  85 */     this.k = 0;
/*  86 */     ImmutableMap.Builder<vj<brx>, ListIterator<brd>> ☃ = ImmutableMap.builder();
/*  87 */     for (UnmodifiableIterator<vj<brx>> unmodifiableIterator1 = this.c.iterator(); unmodifiableIterator1.hasNext(); ) { vj<brx> vj = unmodifiableIterator1.next();
/*  88 */       List<brd> list = b(vj);
/*  89 */       ☃.put(vj, list.listIterator());
/*  90 */       this.k += list.size(); }
/*     */     
/*  92 */     if (this.k == 0) {
/*  93 */       this.i = true;
/*     */       return;
/*     */     } 
/*  96 */     float f = this.k;
/*  97 */     ImmutableMap<vj<brx>, ListIterator<brd>> immutableMap = ☃.build();
/*     */     
/*  99 */     ImmutableMap.Builder<vj<brx>, cgu> builder = ImmutableMap.builder();
/* 100 */     for (UnmodifiableIterator<vj<brx>> unmodifiableIterator2 = this.c.iterator(); unmodifiableIterator2.hasNext(); ) { vj<brx> vj = unmodifiableIterator2.next();
/* 101 */       File file = this.e.a(vj);
/* 102 */       builder.put(vj, new cgu(new File(file, "region"), this.g, true)); }
/*     */     
/* 104 */     ImmutableMap<vj<brx>, cgu> immutableMap1 = builder.build();
/* 105 */     long l = x.b();
/*     */     
/* 107 */     this.o = new of("optimizeWorld.stage.upgrading");
/*     */     
/* 109 */     while (this.h) {
/* 110 */       boolean bool = false;
/*     */       
/* 112 */       float f1 = 0.0F;
/* 113 */       for (UnmodifiableIterator<vj<brx>> unmodifiableIterator3 = this.c.iterator(); unmodifiableIterator3.hasNext(); ) { vj<brx> vj = unmodifiableIterator3.next();
/* 114 */         ListIterator<brd> listIterator = (ListIterator<brd>)immutableMap.get(vj);
/* 115 */         cgu cgu = (cgu)immutableMap1.get(vj);
/* 116 */         if (listIterator.hasNext()) {
/* 117 */           brd brd = listIterator.next();
/* 118 */           boolean bool1 = false;
/*     */           try {
/* 120 */             md md = cgu.e(brd);
/* 121 */             if (md != null) {
/* 122 */               int i = cgu.a(md);
/* 123 */               md md1 = cgu.a(vj, () -> this.q, md);
/*     */               
/* 125 */               md md2 = md1.p("Level");
/*     */               
/* 127 */               brd brd1 = new brd(md2.h("xPos"), md2.h("zPos"));
/* 128 */               if (!brd1.equals(brd)) {
/* 129 */                 a.warn("Chunk {} has invalid position {}", brd, brd1);
/*     */               }
/*     */               
/* 132 */               boolean bool2 = (i < w.a().getWorldVersion());
/* 133 */               if (this.d) {
/* 134 */                 bool2 = (bool2 || md2.e("Heightmaps"));
/* 135 */                 md2.r("Heightmaps");
/* 136 */                 bool2 = (bool2 || md2.e("isLightOn"));
/* 137 */                 md2.r("isLightOn");
/*     */               } 
/*     */               
/* 140 */               if (bool2) {
/* 141 */                 cgu.a(brd, md1);
/* 142 */                 bool1 = true;
/*     */               } 
/*     */             } 
/* 145 */           } catch (u u) {
/* 146 */             Throwable throwable = u.getCause();
/* 147 */             if (throwable instanceof IOException) {
/* 148 */               a.error("Error upgrading chunk {}", brd, throwable);
/*     */             } else {
/* 150 */               throw u;
/*     */             } 
/* 152 */           } catch (IOException iOException) {
/* 153 */             a.error("Error upgrading chunk {}", brd, iOException);
/*     */           } 
/*     */           
/* 156 */           if (bool1) {
/* 157 */             this.l++;
/*     */           } else {
/* 159 */             this.m++;
/*     */           } 
/* 161 */           bool = true;
/*     */         } 
/* 163 */         float f2 = listIterator.nextIndex() / f;
/* 164 */         this.n.put(vj, f2);
/* 165 */         f1 += f2; }
/*     */ 
/*     */       
/* 168 */       this.j = f1;
/*     */       
/* 170 */       if (!bool) {
/* 171 */         this.h = false;
/*     */       }
/*     */     } 
/*     */     
/* 175 */     this.o = new of("optimizeWorld.stage.finished");
/*     */     
/* 177 */     for (UnmodifiableIterator<cgu> unmodifiableIterator = immutableMap1.values().iterator(); unmodifiableIterator.hasNext(); ) { cgu cgu = unmodifiableIterator.next();
/*     */       try {
/* 179 */         cgu.close();
/* 180 */       } catch (IOException iOException) {
/* 181 */         a.error("Error upgrading chunk", iOException);
/*     */       }  }
/*     */     
/* 184 */     this.q.a();
/* 185 */     l = x.b() - l;
/* 186 */     a.info("World optimizaton finished after {} ms", Long.valueOf(l));
/* 187 */     this.i = true;
/*     */   }
/*     */   
/*     */   private List<brd> b(vj<brx> ☃) {
/* 191 */     File file1 = this.e.a(☃);
/*     */     
/* 193 */     File file2 = new File(file1, "region");
/* 194 */     File[] arrayOfFile = file2.listFiles((☃, str) -> str.endsWith(".mca"));
/*     */     
/* 196 */     if (arrayOfFile == null) {
/* 197 */       return (List<brd>)ImmutableList.of();
/*     */     }
/*     */     
/* 200 */     List<brd> list = Lists.newArrayList();
/* 201 */     for (File file : arrayOfFile) {
/* 202 */       Matcher matcher = p.matcher(file.getName());
/* 203 */       if (matcher.matches()) {
/*     */ 
/*     */ 
/*     */         
/* 207 */         int i = Integer.parseInt(matcher.group(1)) << 5;
/* 208 */         int j = Integer.parseInt(matcher.group(2)) << 5;
/*     */         
/* 210 */         try (cgy ☃ = new cgy(file, file2, true)) {
/* 211 */           for (int k = 0; k < 32; k++) {
/* 212 */             for (int m = 0; m < 32; m++) {
/* 213 */               brd brd = new brd(k + i, m + j);
/* 214 */               if (cgy.b(brd)) {
/* 215 */                 list.add(brd);
/*     */               }
/*     */             } 
/*     */           } 
/* 219 */         } catch (Throwable throwable) {}
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/* 224 */     return list;
/*     */   }
/*     */   
/*     */   public boolean b() {
/* 228 */     return this.i;
/*     */   }
/*     */   
/*     */   public ImmutableSet<vj<brx>> c() {
/* 232 */     return this.c;
/*     */   }
/*     */   
/*     */   public float a(vj<brx> ☃) {
/* 236 */     return this.n.getFloat(☃);
/*     */   }
/*     */   
/*     */   public float d() {
/* 240 */     return this.j;
/*     */   }
/*     */   
/*     */   public int e() {
/* 244 */     return this.k;
/*     */   }
/*     */   
/*     */   public int f() {
/* 248 */     return this.l;
/*     */   }
/*     */   
/*     */   public int g() {
/* 252 */     return this.m;
/*     */   }
/*     */   
/*     */   public nr h() {
/* 256 */     return this.o;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\aoi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */