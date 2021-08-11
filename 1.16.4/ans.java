/*     */ import com.google.common.base.Splitter;
/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.collect.Maps;
/*     */ import it.unimi.dsi.fastutil.objects.Object2LongMap;
/*     */ import it.unimi.dsi.fastutil.objects.Object2LongMaps;
/*     */ import java.io.File;
/*     */ import java.io.FileOutputStream;
/*     */ import java.io.OutputStreamWriter;
/*     */ import java.io.Writer;
/*     */ import java.nio.charset.StandardCharsets;
/*     */ import java.util.Collections;
/*     */ import java.util.Comparator;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.Locale;
/*     */ import java.util.Map;
/*     */ import org.apache.commons.io.IOUtils;
/*     */ import org.apache.commons.lang3.ObjectUtils;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ans
/*     */   implements anv
/*     */ {
/*  28 */   private static final Logger a = LogManager.getLogger();
/*     */   
/*  30 */   private static final anx b = new anx()
/*     */     {
/*     */       public long a() {
/*  33 */         return 0L;
/*     */       }
/*     */ 
/*     */       
/*     */       public long b() {
/*  38 */         return 0L;
/*     */       }
/*     */ 
/*     */       
/*     */       public Object2LongMap<String> c() {
/*  43 */         return Object2LongMaps.emptyMap();
/*     */       }
/*     */     };
/*     */   private static final Comparator<Map.Entry<String, a>> d;
/*  47 */   private static final Splitter c = Splitter.on('\036'); static {
/*  48 */     d = Map.Entry.<String, a>comparingByValue(Comparator.comparingLong(☃ -> a.a(☃))).reversed();
/*     */   }
/*     */   private final Map<String, ? extends anx> e;
/*     */   private final long f;
/*     */   private final int g;
/*     */   private final long h;
/*     */   private final int i;
/*     */   private final int j;
/*     */   
/*     */   public ans(Map<String, ? extends anx> ☃, long l1, int i, long l2, int j) {
/*  58 */     this.e = ☃;
/*  59 */     this.f = l1;
/*  60 */     this.g = i;
/*  61 */     this.h = l2;
/*  62 */     this.i = j;
/*  63 */     this.j = j - i;
/*     */   }
/*     */ 
/*     */   
/*     */   private anx c(String ☃) {
/*  68 */     anx anx1 = this.e.get(☃);
/*  69 */     return (anx1 != null) ? anx1 : b;
/*     */   }
/*     */ 
/*     */   
/*     */   public List<any> a(String ☃) {
/*  74 */     String str = ☃;
/*  75 */     anx anx1 = c("root");
/*  76 */     long l1 = anx1.a();
/*  77 */     anx anx2 = c(☃);
/*  78 */     long l2 = anx2.a();
/*  79 */     long l3 = anx2.b();
/*     */     
/*  81 */     List<any> list = Lists.newArrayList();
/*     */     
/*  83 */     if (!☃.isEmpty()) {
/*  84 */       ☃ = ☃ + '\036';
/*     */     }
/*  86 */     long l4 = 0L;
/*     */     
/*  88 */     for (String str1 : this.e.keySet()) {
/*  89 */       if (a(☃, str1)) {
/*  90 */         l4 += c(str1).a();
/*     */       }
/*     */     } 
/*     */     
/*  94 */     float f = (float)l4;
/*  95 */     if (l4 < l2) {
/*  96 */       l4 = l2;
/*     */     }
/*  98 */     if (l1 < l4) {
/*  99 */       l1 = l4;
/*     */     }
/*     */     
/* 102 */     for (String str1 : this.e.keySet()) {
/* 103 */       if (a(☃, str1)) {
/* 104 */         anx anx3 = c(str1);
/* 105 */         long l = anx3.a();
/* 106 */         double d1 = l * 100.0D / l4;
/* 107 */         double d2 = l * 100.0D / l1;
/* 108 */         String str2 = str1.substring(☃.length());
/* 109 */         list.add(new any(str2, d1, d2, anx3.b()));
/*     */       } 
/*     */     } 
/*     */     
/* 113 */     if ((float)l4 > f) {
/* 114 */       list.add(new any("unspecified", ((float)l4 - f) * 100.0D / l4, ((float)l4 - f) * 100.0D / l1, l3));
/*     */     }
/*     */     
/* 117 */     Collections.sort(list);
/* 118 */     list.add(0, new any(str, 100.0D, l4 * 100.0D / l1, l3));
/* 119 */     return list;
/*     */   }
/*     */   
/*     */   private static boolean a(String ☃, String str1) {
/* 123 */     return (str1.length() > ☃.length() && str1.startsWith(☃) && str1.indexOf('\036', ☃.length() + 1) < 0);
/*     */   }
/*     */   
/*     */   private Map<String, a> h() {
/* 127 */     Map<String, a> ☃ = Maps.newTreeMap();
/* 128 */     this.e.forEach((str, anx1) -> {
/*     */           Object2LongMap<String> object2LongMap = anx1.c();
/*     */           
/*     */           if (!object2LongMap.isEmpty()) {
/*     */             List<String> list = c.splitToList(str);
/*     */             
/*     */             object2LongMap.forEach(());
/*     */           } 
/*     */         });
/* 137 */     return ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public long a() {
/* 142 */     return this.f;
/*     */   }
/*     */ 
/*     */   
/*     */   public int b() {
/* 147 */     return this.g;
/*     */   }
/*     */ 
/*     */   
/*     */   public long c() {
/* 152 */     return this.h;
/*     */   }
/*     */ 
/*     */   
/*     */   public int d() {
/* 157 */     return this.i;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(File ☃) {
/* 162 */     ☃.getParentFile().mkdirs();
/*     */     
/* 164 */     Writer writer = null;
/*     */     try {
/* 166 */       writer = new OutputStreamWriter(new FileOutputStream(☃), StandardCharsets.UTF_8);
/* 167 */       writer.write(a(g(), f()));
/* 168 */       return true;
/* 169 */     } catch (Throwable throwable) {
/* 170 */       a.error("Could not save profiler results to {}", ☃, throwable);
/* 171 */       return false;
/*     */     } finally {
/* 173 */       IOUtils.closeQuietly(writer);
/*     */     } 
/*     */   }
/*     */   
/*     */   protected String a(long ☃, int i) {
/* 178 */     StringBuilder stringBuilder = new StringBuilder();
/*     */     
/* 180 */     stringBuilder.append("---- Minecraft Profiler Results ----\n");
/* 181 */     stringBuilder.append("// ");
/* 182 */     stringBuilder.append(i());
/* 183 */     stringBuilder.append("\n\n");
/*     */     
/* 185 */     stringBuilder.append("Version: ").append(w.a().getId()).append('\n');
/* 186 */     stringBuilder.append("Time span: ").append(☃ / 1000000L).append(" ms\n");
/* 187 */     stringBuilder.append("Tick span: ").append(i).append(" ticks\n");
/* 188 */     stringBuilder.append("// This is approximately ").append(String.format(Locale.ROOT, "%.2f", new Object[] { Float.valueOf(i / (float)☃ / 1.0E9F) })).append(" ticks per second. It should be ").append(20).append(" ticks per second\n\n");
/*     */     
/* 190 */     stringBuilder.append("--- BEGIN PROFILE DUMP ---\n\n");
/*     */     
/* 192 */     a(0, "root", stringBuilder);
/*     */     
/* 194 */     stringBuilder.append("--- END PROFILE DUMP ---\n\n");
/*     */     
/* 196 */     Map<String, a> map = h();
/*     */     
/* 198 */     if (!map.isEmpty()) {
/* 199 */       stringBuilder.append("--- BEGIN COUNTER DUMP ---\n\n");
/* 200 */       a(map, stringBuilder, i);
/* 201 */       stringBuilder.append("--- END COUNTER DUMP ---\n\n");
/*     */     } 
/*     */     
/* 204 */     return stringBuilder.toString();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static StringBuilder a(StringBuilder ☃, int i) {
/* 215 */     ☃.append(String.format("[%02d] ", new Object[] { Integer.valueOf(i) }));
/* 216 */     for (int j = 0; j < i; j++) {
/* 217 */       ☃.append("|   ");
/*     */     }
/* 219 */     return ☃;
/*     */   }
/*     */   
/*     */   private void a(int ☃, String str, StringBuilder stringBuilder) {
/* 223 */     List<any> list = a(str);
/*     */     
/* 225 */     Object2LongMap<String> object2LongMap = ((anx)ObjectUtils.firstNonNull((Object[])new anx[] { this.e.get(str), b })).c();
/* 226 */     object2LongMap.forEach((str, long_) -> a(☃, i).append('#').append(str).append(' ').append(long_).append('/').append(long_.longValue() / this.j).append('\n'));
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
/* 237 */     if (list.size() < 3) {
/*     */       return;
/*     */     }
/*     */ 
/*     */     
/* 242 */     for (int i = 1; i < list.size(); i++) {
/* 243 */       any any = list.get(i);
/*     */       
/* 245 */       a(stringBuilder, ☃)
/* 246 */         .append(any.d)
/* 247 */         .append('(')
/* 248 */         .append(any.c)
/* 249 */         .append('/')
/* 250 */         .append(String.format(Locale.ROOT, "%.0f", new Object[] { Float.valueOf((float)any.c / this.j)
/* 251 */             })).append(')')
/* 252 */         .append(" - ")
/* 253 */         .append(String.format(Locale.ROOT, "%.2f", new Object[] { Double.valueOf(any.a) })).append("%/")
/* 254 */         .append(String.format(Locale.ROOT, "%.2f", new Object[] { Double.valueOf(any.b) })).append("%\n");
/*     */       
/* 256 */       if (!"unspecified".equals(any.d)) {
/*     */         try {
/* 258 */           a(☃ + 1, str + '\036' + any.d, stringBuilder);
/* 259 */         } catch (Exception exception) {
/* 260 */           stringBuilder.append("[[ EXCEPTION ").append(exception).append(" ]]");
/*     */         } 
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   private void a(int ☃, String str, a a1, int i, StringBuilder stringBuilder) {
/* 267 */     a(stringBuilder, ☃)
/* 268 */       .append(str).append(" total:")
/* 269 */       .append(a.b(a1)).append('/')
/* 270 */       .append(a.a(a1)).append(" average: ")
/* 271 */       .append(a.b(a1) / i)
/* 272 */       .append('/')
/* 273 */       .append(a.a(a1) / i)
/* 274 */       .append('\n');
/* 275 */     a.c(a1).entrySet().stream().sorted(d).forEach(entry -> a(☃ + 1, (String)entry.getKey(), (a)entry.getValue(), i, stringBuilder));
/*     */   }
/*     */   
/*     */   private void a(Map<String, a> ☃, StringBuilder stringBuilder, int i) {
/* 279 */     ☃.forEach((str, a1) -> {
/*     */           ☃.append("-- Counter: ").append(str).append(" --\n");
/*     */           a(0, "root", (a)a.c(a1).get("root"), i, ☃);
/*     */           ☃.append("\n\n");
/*     */         });
/*     */   }
/*     */ 
/*     */   
/*     */   private static String i() {
/* 288 */     String[] ☃ = { "Shiny numbers!", "Am I not running fast enough? :(", "I'm working as hard as I can!", "Will I ever be good enough for you? :(", "Speedy. Zoooooom!", "Hello world", "40% better than a crash report.", "Now with extra numbers", "Now with less numbers", "Now with the same numbers", "You should add flames to things, it makes them go faster!", "Do you feel the need for... optimization?", "*cracks redstone whip*", "Maybe if you treated it better then it'll have more motivation to work faster! Poor server." };
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
/*     */     try {
/* 306 */       return ☃[(int)(x.c() % ☃.length)];
/* 307 */     } catch (Throwable throwable) {
/* 308 */       return "Witty comment unavailable :(";
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public int f() {
/* 314 */     return this.j;
/*     */   }
/*     */   
/*     */   static class a {
/*     */     private long a;
/*     */     private long b;
/* 320 */     private final Map<String, a> c = Maps.newHashMap();
/*     */     
/*     */     public void a(Iterator<String> ☃, long l) {
/* 323 */       this.b += l;
/* 324 */       if (!☃.hasNext()) {
/* 325 */         this.a += l;
/*     */       } else {
/* 327 */         ((a)this.c.computeIfAbsent(☃.next(), ☃ -> new a())).a(☃, l);
/*     */       } 
/*     */     }
/*     */     
/*     */     private a() {}
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ans.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */