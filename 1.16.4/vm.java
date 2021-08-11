/*     */ import java.io.PrintStream;
/*     */ import java.util.Set;
/*     */ import java.util.TreeSet;
/*     */ import java.util.function.Function;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class vm
/*     */ {
/*  31 */   public static final PrintStream a = System.out;
/*     */   
/*     */   private static boolean b;
/*  34 */   private static final Logger c = LogManager.getLogger();
/*     */   
/*     */   public static void a() {
/*  37 */     if (b) {
/*     */       return;
/*     */     }
/*  40 */     b = true;
/*     */     
/*  42 */     if (gm.f.c().isEmpty()) {
/*  43 */       throw new IllegalStateException("Unable to load registries");
/*     */     }
/*     */     
/*  46 */     bws.c();
/*  47 */     bvk.c();
/*     */     
/*  49 */     if (aqe.a(aqe.bc) == null) {
/*  50 */       throw new IllegalStateException("Failed loading EntityTypes");
/*     */     }
/*     */     
/*  53 */     bnu.a();
/*     */     
/*  55 */     fe.a();
/*     */     
/*  57 */     gw.c();
/*     */     
/*  59 */     fk.a();
/*     */     
/*  61 */     aek.b();
/*     */     
/*  63 */     d();
/*     */   }
/*     */   
/*     */   private static <T> void a(Iterable<T> ☃, Function<T, String> function, Set<String> set) {
/*  67 */     ly ly = ly.a();
/*  68 */     ☃.forEach(object -> {
/*     */           String str = ☃.apply(object);
/*     */           if (!ly1.b(str)) {
/*     */             set.add(str);
/*     */           }
/*     */         });
/*     */   }
/*     */   
/*     */   private static void a(Set<String> ☃) {
/*  77 */     ly ly = ly.a();
/*  78 */     brt.a(new brt.c(ly, ☃)
/*     */         {
/*     */           public <T extends brt.g<T>> void a(brt.e<T> ☃, brt.f<T> f1) {
/*  81 */             if (!this.a.b(☃.b())) {
/*  82 */               this.b.add(☃.a());
/*     */             }
/*     */           }
/*     */         });
/*     */   }
/*     */   
/*     */   public static Set<String> b() {
/*  89 */     Set<String> ☃ = new TreeSet<>();
/*  90 */     a(gm.af, arg::c, ☃);
/*  91 */     a(gm.S, aqe::f, ☃);
/*  92 */     a(gm.P, aps::c, ☃);
/*  93 */     a(gm.T, blx::a, ☃);
/*  94 */     a(gm.R, bps::g, ☃);
/*  95 */     a(gm.Q, buo::i, ☃);
/*  96 */     a(gm.Y, ☃ -> "stat." + ☃.toString().replace(':', '.'), ☃);
/*     */     
/*  98 */     a(☃);
/*  99 */     return ☃;
/*     */   }
/*     */   
/*     */   public static void c() {
/* 103 */     if (!b) {
/* 104 */       throw new IllegalArgumentException("Not bootstrapped");
/*     */     }
/*     */     
/* 107 */     if (w.d) {
/* 108 */       b().forEach(☃ -> c.error("Missing translations: " + ☃));
/* 109 */       dc.b();
/*     */     } 
/*     */     
/* 112 */     arm.a();
/*     */   }
/*     */   
/*     */   private static void d() {
/* 116 */     if (c.isDebugEnabled()) {
/* 117 */       System.setErr(new vq("STDERR", System.err));
/* 118 */       System.setOut(new vq("STDOUT", a));
/*     */     } else {
/* 120 */       System.setErr(new vs("STDERR", System.err));
/* 121 */       System.setOut(new vs("STDOUT", a));
/*     */     } 
/*     */   }
/*     */   
/*     */   public static void a(String ☃) {
/* 126 */     a.println(☃);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\vm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */