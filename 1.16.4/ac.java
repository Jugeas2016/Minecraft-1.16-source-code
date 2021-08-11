/*     */ import com.google.common.collect.Maps;
/*     */ import java.util.Map;
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
/*     */ public class ac
/*     */ {
/*  48 */   private static final Map<vk, af<?>> Q = Maps.newHashMap();
/*     */   
/*  50 */   public static final bm a = a(new bm());
/*  51 */   public static final bt b = a(new bt(new vk("player_killed_entity")));
/*  52 */   public static final bt c = a(new bt(new vk("entity_killed_player")));
/*  53 */   public static final bc d = a(new bc());
/*  54 */   public static final bn e = a(new bn());
/*  55 */   public static final ch f = a(new ch());
/*  56 */   public static final ce g = a(new ce());
/*  57 */   public static final bf h = a(new bf());
/*  58 */   public static final ba i = a(new ba());
/*  59 */   public static final bi j = a(new bi());
/*  60 */   public static final ap k = a(new ap());
/*  61 */   public static final as l = a(new as());
/*  62 */   public static final cs m = a(new cs());
/*  63 */   public static final cn n = a(new cn());
/*  64 */   public static final ao o = a(new ao());
/*  65 */   public static final bx p = a(new bx(new vk("location")));
/*  66 */   public static final bx q = a(new bx(new vk("slept_in_bed")));
/*  67 */   public static final au r = a(new au());
/*  68 */   public static final cr s = a(new cr());
/*  69 */   public static final bo t = a(new bo());
/*  70 */   public static final bu u = a(new bu());
/*  71 */   public static final aq v = a(new aq());
/*  72 */   public static final cq w = a(new cq());
/*  73 */   public static final co x = a(new co());
/*  74 */   public static final cd y = a(new cd());
/*  75 */   public static final at z = a(new at());
/*  76 */   public static final az A = a(new az());
/*  77 */   public static final ct B = a(new ct());
/*  78 */   public static final cc C = a(new cc());
/*  79 */   public static final bk D = a(new bk());
/*  80 */   public static final ar E = a(new ar());
/*  81 */   public static final cj F = a(new cj());
/*  82 */   public static final bs G = a(new bs());
/*  83 */   public static final bx H = a(new bx(new vk("hero_of_the_village")));
/*  84 */   public static final bx I = a(new bx(new vk("voluntary_exile")));
/*  85 */   public static final cl J = a(new cl());
/*  86 */   public static final am K = a(new am());
/*  87 */   public static final cp L = a(new cp());
/*  88 */   public static final br M = a(new br());
/*  89 */   public static final by N = a(new by());
/*  90 */   public static final bp O = a(new bp());
/*  91 */   public static final cf P = a(new cf());
/*     */   
/*     */   private static <T extends af<?>> T a(T ☃) {
/*  94 */     if (Q.containsKey(☃.a())) {
/*  95 */       throw new IllegalArgumentException("Duplicate criterion id " + ☃.a());
/*     */     }
/*  97 */     Q.put(☃.a(), (af<?>)☃);
/*  98 */     return ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public static <T extends ag> af<T> a(vk ☃) {
/* 104 */     return (af<T>)Q.get(☃);
/*     */   }
/*     */   
/*     */   public static Iterable<? extends af<?>> a() {
/* 108 */     return Q.values();
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ac.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */