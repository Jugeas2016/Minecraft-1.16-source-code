/*     */ import com.google.common.collect.ImmutableMap;
/*     */ import com.google.common.collect.Maps;
/*     */ import java.util.Map;
/*     */ import java.util.Optional;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ddq
/*     */ {
/*  14 */   public static final Map<String, ddq> a = Maps.newHashMap();
/*  15 */   public static final ddq b = new ddq("dummy");
/*  16 */   public static final ddq c = new ddq("trigger");
/*  17 */   public static final ddq d = new ddq("deathCount");
/*  18 */   public static final ddq e = new ddq("playerKillCount");
/*  19 */   public static final ddq f = new ddq("totalKillCount");
/*  20 */   public static final ddq g = new ddq("health", true, a.b);
/*  21 */   public static final ddq h = new ddq("food", true, a.a);
/*  22 */   public static final ddq i = new ddq("air", true, a.a);
/*  23 */   public static final ddq j = new ddq("armor", true, a.a);
/*  24 */   public static final ddq k = new ddq("xp", true, a.a);
/*  25 */   public static final ddq l = new ddq("level", true, a.a);
/*  26 */   public static final ddq[] m = new ddq[] { new ddq("teamkill." + k.a
/*  27 */         .f()), new ddq("teamkill." + k.b.f()), new ddq("teamkill." + k.c
/*  28 */         .f()), new ddq("teamkill." + k.d.f()), new ddq("teamkill." + k.e
/*  29 */         .f()), new ddq("teamkill." + k.f.f()), new ddq("teamkill." + k.g
/*  30 */         .f()), new ddq("teamkill." + k.h.f()), new ddq("teamkill." + k.i
/*  31 */         .f()), new ddq("teamkill." + k.j.f()), new ddq("teamkill." + k.k
/*  32 */         .f()), new ddq("teamkill." + k.l.f()), new ddq("teamkill." + k.m
/*  33 */         .f()), new ddq("teamkill." + k.n.f()), new ddq("teamkill." + k.o
/*  34 */         .f()), new ddq("teamkill." + k.p.f()) };
/*     */   
/*  36 */   public static final ddq[] n = new ddq[] { new ddq("killedByTeam." + k.a
/*  37 */         .f()), new ddq("killedByTeam." + k.b.f()), new ddq("killedByTeam." + k.c
/*  38 */         .f()), new ddq("killedByTeam." + k.d.f()), new ddq("killedByTeam." + k.e
/*  39 */         .f()), new ddq("killedByTeam." + k.f.f()), new ddq("killedByTeam." + k.g
/*  40 */         .f()), new ddq("killedByTeam." + k.h.f()), new ddq("killedByTeam." + k.i
/*  41 */         .f()), new ddq("killedByTeam." + k.j.f()), new ddq("killedByTeam." + k.k
/*  42 */         .f()), new ddq("killedByTeam." + k.l.f()), new ddq("killedByTeam." + k.m
/*  43 */         .f()), new ddq("killedByTeam." + k.n.f()), new ddq("killedByTeam." + k.o
/*  44 */         .f()), new ddq("killedByTeam." + k.p.f()) };
/*     */   
/*     */   private final String o;
/*     */   
/*     */   private final boolean p;
/*     */   private final a q;
/*     */   
/*     */   public ddq(String ☃) {
/*  52 */     this(☃, false, a.a);
/*     */   }
/*     */   
/*     */   protected ddq(String ☃, boolean bool, a a1) {
/*  56 */     this.o = ☃;
/*  57 */     this.p = bool;
/*  58 */     this.q = a1;
/*  59 */     a.put(☃, this);
/*     */   }
/*     */   
/*     */   public static Optional<ddq> a(String ☃) {
/*  63 */     if (a.containsKey(☃)) {
/*  64 */       return Optional.of(a.get(☃));
/*     */     }
/*  66 */     int i = ☃.indexOf(':');
/*  67 */     if (i < 0) {
/*  68 */       return Optional.empty();
/*     */     }
/*  70 */     return gm.ag.b(vk.a(☃.substring(0, i), '.'))
/*  71 */       .flatMap(adz1 -> a(adz1, vk.a(☃.substring(i + 1), '.')));
/*     */   }
/*     */   
/*     */   private static <T> Optional<ddq> a(adz<T> ☃, vk vk1) {
/*  75 */     return ☃.a().b(vk1).map(☃::b);
/*     */   }
/*     */   
/*     */   public String c() {
/*  79 */     return this.o;
/*     */   }
/*     */   
/*     */   public boolean d() {
/*  83 */     return this.p;
/*     */   }
/*     */   
/*     */   public a e() {
/*  87 */     return this.q;
/*     */   }
/*     */   
/*     */   public enum a {
/*  91 */     a("integer"),
/*  92 */     b("hearts");
/*     */     
/*     */     private final String c;
/*     */     private static final Map<String, a> d;
/*     */     
/*     */     a(String ☃) {
/*  98 */       this.c = ☃;
/*     */     }
/*     */     
/*     */     public String a() {
/* 102 */       return this.c;
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     static {
/* 108 */       ImmutableMap.Builder<String, a> ☃ = ImmutableMap.builder();
/* 109 */       for (a a1 : values()) {
/* 110 */         ☃.put(a1.c, a1);
/*     */       }
/* 112 */       d = (Map<String, a>)☃.build();
/*     */     }
/*     */     
/*     */     public static a a(String ☃) {
/* 116 */       return d.getOrDefault(☃, a);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ddq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */