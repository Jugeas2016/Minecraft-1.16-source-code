/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.collect.Maps;
/*     */ import com.google.common.collect.Sets;
/*     */ import java.util.Collection;
/*     */ import java.util.Map;
/*     */ import java.util.Optional;
/*     */ import java.util.Set;
/*     */ import java.util.function.Consumer;
/*     */ import java.util.stream.Collectors;
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
/*     */ public class lh
/*     */ {
/*  24 */   private static final Collection<lu> a = Lists.newArrayList();
/*  25 */   private static final Set<String> b = Sets.newHashSet();
/*  26 */   private static final Map<String, Consumer<aag>> c = Maps.newHashMap();
/*  27 */   private static final Collection<lu> d = Sets.newHashSet();
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static Collection<lu> a(String ☃) {
/*  59 */     return (Collection<lu>)a.stream()
/*  60 */       .filter(lu1 -> a(lu1, ☃))
/*  61 */       .collect(Collectors.toList());
/*     */   }
/*     */   
/*     */   public static Collection<lu> a() {
/*  65 */     return a;
/*     */   }
/*     */   
/*     */   public static Collection<String> b() {
/*  69 */     return b;
/*     */   }
/*     */   
/*     */   public static boolean b(String ☃) {
/*  73 */     return b.contains(☃);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public static Consumer<aag> c(String ☃) {
/*  78 */     return c.get(☃);
/*     */   }
/*     */   
/*     */   public static Optional<lu> d(String ☃) {
/*  82 */     return a().stream()
/*  83 */       .filter(lu1 -> lu1.a().equalsIgnoreCase(☃))
/*  84 */       .findFirst();
/*     */   }
/*     */ 
/*     */   
/*     */   public static lu e(String ☃) {
/*  89 */     Optional<lu> optional = d(☃);
/*  90 */     if (!optional.isPresent()) {
/*  91 */       throw new IllegalArgumentException("Can't find the test function for " + ☃);
/*     */     }
/*  93 */     return optional.get();
/*     */   }
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
/*     */   private static boolean a(lu ☃, String str) {
/* 138 */     return ☃.a().toLowerCase().startsWith(str.toLowerCase() + ".");
/*     */   }
/*     */   
/*     */   public static Collection<lu> c() {
/* 142 */     return d;
/*     */   }
/*     */   
/*     */   public static void a(lu ☃) {
/* 146 */     d.add(☃);
/*     */   }
/*     */   
/*     */   public static void d() {
/* 150 */     d.clear();
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\lh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */