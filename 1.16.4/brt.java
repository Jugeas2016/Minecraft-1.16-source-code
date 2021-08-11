/*     */ import com.google.common.collect.ImmutableMap;
/*     */ import com.google.common.collect.Maps;
/*     */ import com.mojang.brigadier.arguments.ArgumentType;
/*     */ import com.mojang.brigadier.arguments.BoolArgumentType;
/*     */ import com.mojang.brigadier.arguments.IntegerArgumentType;
/*     */ import com.mojang.brigadier.builder.RequiredArgumentBuilder;
/*     */ import com.mojang.brigadier.context.CommandContext;
/*     */ import com.mojang.serialization.DynamicLike;
/*     */ import java.util.Comparator;
/*     */ import java.util.Map;
/*     */ import java.util.function.BiConsumer;
/*     */ import java.util.function.Function;
/*     */ import java.util.function.Supplier;
/*     */ import javax.annotation.Nullable;
/*     */ import net.minecraft.server.MinecraftServer;
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
/*     */ public class brt
/*     */ {
/*     */   public enum b
/*     */   {
/*  31 */     a("gamerule.category.player"),
/*  32 */     b("gamerule.category.mobs"),
/*  33 */     c("gamerule.category.spawning"),
/*  34 */     d("gamerule.category.drops"),
/*  35 */     e("gamerule.category.updates"),
/*  36 */     f("gamerule.category.chat"),
/*  37 */     g("gamerule.category.misc");
/*     */     
/*     */     private final String h;
/*     */ 
/*     */     
/*     */     b(String ☃) {
/*  43 */       this.h = ☃;
/*     */     }
/*     */     
/*     */     public String a() {
/*  47 */       return this.h;
/*     */     }
/*     */   }
/*     */   
/*  51 */   private static final Logger H = LogManager.getLogger(); private static final Map<e<?>, f<?>> I;
/*     */   static {
/*  53 */     I = Maps.newTreeMap(Comparator.comparing(☃ -> e.a(☃)));
/*     */   }
/*     */   private static <T extends g<T>> e<T> a(String ☃, b b1, f<T> f1) {
/*  56 */     e<T> e1 = new e<>(☃, b1);
/*  57 */     f<?> f2 = I.put(e1, f1);
/*  58 */     if (f2 != null) {
/*  59 */       throw new IllegalStateException("Duplicate game rule registration for " + ☃);
/*     */     }
/*  61 */     return e1;
/*     */   }
/*     */   
/*  64 */   public static final e<a> a = a("doFireTick", b.e, a.a(true));
/*  65 */   public static final e<a> b = a("mobGriefing", b.b, a.a(true));
/*  66 */   public static final e<a> c = a("keepInventory", b.a, a.a(false));
/*  67 */   public static final e<a> d = a("doMobSpawning", b.c, a.a(true));
/*  68 */   public static final e<a> e = a("doMobLoot", b.d, a.a(true));
/*  69 */   public static final e<a> f = a("doTileDrops", b.d, a.a(true));
/*  70 */   public static final e<a> g = a("doEntityDrops", b.d, a.a(true));
/*  71 */   public static final e<a> h = a("commandBlockOutput", b.f, a.a(true));
/*  72 */   public static final e<a> i = a("naturalRegeneration", b.a, a.a(true));
/*  73 */   public static final e<a> j = a("doDaylightCycle", b.e, a.a(true));
/*  74 */   public static final e<a> k = a("logAdminCommands", b.f, a.a(true));
/*  75 */   public static final e<a> l = a("showDeathMessages", b.f, a.a(true));
/*  76 */   public static final e<d> m = a("randomTickSpeed", b.e, d.a(3)); public static final e<a> o;
/*  77 */   public static final e<a> n = a("sendCommandFeedback", b.f, a.a(true)); static {
/*  78 */     o = a("reducedDebugInfo", b.g, a.a(false, (☃, a1) -> {
/*     */             byte b = a1.a() ? 22 : 23;
/*     */             for (aah aah : ☃.ae().s())
/*     */               aah.b.a(new pn(aah, b)); 
/*     */           }));
/*     */   }
/*  84 */   public static final e<a> p = a("spectatorsGenerateChunks", b.a, a.a(true));
/*  85 */   public static final e<d> q = a("spawnRadius", b.a, d.a(10));
/*  86 */   public static final e<a> r = a("disableElytraMovementCheck", b.a, a.a(false));
/*  87 */   public static final e<d> s = a("maxEntityCramming", b.b, d.a(24));
/*  88 */   public static final e<a> t = a("doWeatherCycle", b.e, a.a(true));
/*  89 */   public static final e<a> u = a("doLimitedCrafting", b.a, a.a(false));
/*  90 */   public static final e<d> v = a("maxCommandChainLength", b.g, d.a(65536));
/*  91 */   public static final e<a> w = a("announceAdvancements", b.f, a.a(true));
/*  92 */   public static final e<a> x = a("disableRaids", b.b, a.a(false));
/*  93 */   public static final e<a> y = a("doInsomnia", b.c, a.a(true)); public static final e<a> z; static {
/*  94 */     z = a("doImmediateRespawn", b.a, a.a(false, (☃, a1) -> {
/*     */             for (aah aah : ☃.ae().s())
/*     */               aah.b.a(new pq(pq.l, a1.a() ? 1.0F : 0.0F)); 
/*     */           }));
/*     */   }
/*  99 */   public static final e<a> A = a("drowningDamage", b.a, a.a(true));
/* 100 */   public static final e<a> B = a("fallDamage", b.a, a.a(true));
/* 101 */   public static final e<a> C = a("fireDamage", b.a, a.a(true));
/* 102 */   public static final e<a> D = a("doPatrolSpawning", b.c, a.a(true));
/* 103 */   public static final e<a> E = a("doTraderSpawning", b.c, a.a(true));
/* 104 */   public static final e<a> F = a("forgiveDeadPlayers", b.b, a.a(true));
/* 105 */   public static final e<a> G = a("universalAnger", b.b, a.a(false));
/*     */   
/*     */   private final Map<e<?>, g<?>> J;
/*     */   
/*     */   public brt(DynamicLike<?> ☃) {
/* 110 */     this();
/* 111 */     a(☃);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public brt() {
/* 120 */     this.J = (Map<e<?>, g<?>>)I.entrySet().stream().collect(ImmutableMap.toImmutableMap(Map.Entry::getKey, ☃ -> ((f<g>)☃.getValue()).a()));
/*     */   }
/*     */   
/*     */   private brt(Map<e<?>, g<?>> ☃) {
/* 124 */     this.J = ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public <T extends g<T>> T a(e<T> ☃) {
/* 129 */     return (T)this.J.get(☃);
/*     */   }
/*     */   
/*     */   public md a() {
/* 133 */     md ☃ = new md();
/* 134 */     this.J.forEach((e1, g1) -> ☃.a(e.a(e1), g1.b()));
/* 135 */     return ☃;
/*     */   }
/*     */   
/*     */   private void a(DynamicLike<?> ☃) {
/* 139 */     this.J.forEach((e1, g1) -> ☃.get(e.a(e1)).asString().result().ifPresent(g1::a));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public brt b() {
/* 145 */     return new brt((Map<e<?>, g<?>>)this.J.entrySet().stream().collect(ImmutableMap.toImmutableMap(Map.Entry::getKey, ☃ -> ((g<g>)☃.getValue()).f())));
/*     */   }
/*     */ 
/*     */   
/*     */   static interface h<T extends g<T>>
/*     */   {
/*     */     void call(brt.c param1c, brt.e<T> param1e, brt.f<T> param1f);
/*     */   }
/*     */   
/*     */   public static interface c
/*     */   {
/*     */     default <T extends brt.g<T>> void a(brt.e<T> ☃, brt.f<T> f1) {}
/*     */     
/*     */     default void b(brt.e<brt.a> ☃, brt.f<brt.a> f1) {}
/*     */     
/*     */     default void c(brt.e<brt.d> ☃, brt.f<brt.d> f1) {}
/*     */   }
/*     */   
/*     */   public static void a(c ☃) {
/* 164 */     I.forEach((e1, f1) -> a(☃, e1, f1));
/*     */   }
/*     */ 
/*     */   
/*     */   private static <T extends g<T>> void a(c ☃, e<?> e1, f<?> f1) {
/* 169 */     e<T> e2 = (e)e1;
/* 170 */     f<T> f2 = (f)f1;
/* 171 */     ☃.a(e2, f2);
/* 172 */     f2.a(☃, e2);
/*     */   }
/*     */   
/*     */   public void a(brt ☃, @Nullable MinecraftServer minecraftServer) {
/* 176 */     ☃.J.keySet().forEach(e1 -> a(e1, ☃, minecraftServer));
/*     */   }
/*     */   
/*     */   private <T extends g<T>> void a(e<T> ☃, brt brt1, @Nullable MinecraftServer minecraftServer) {
/* 180 */     T t = brt1.a(☃);
/* 181 */     a(☃).a(t, minecraftServer);
/*     */   }
/*     */   
/*     */   public boolean b(e<a> ☃) {
/* 185 */     return ((a)a(☃)).a();
/*     */   }
/*     */   
/*     */   public int c(e<d> ☃) {
/* 189 */     return ((d)a(☃)).a();
/*     */   }
/*     */   
/*     */   public static final class e<T extends g<T>> {
/*     */     private final String a;
/*     */     private final brt.b b;
/*     */     
/*     */     public e(String ☃, brt.b b1) {
/* 197 */       this.a = ☃;
/* 198 */       this.b = b1;
/*     */     }
/*     */ 
/*     */     
/*     */     public String toString() {
/* 203 */       return this.a;
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean equals(Object ☃) {
/* 208 */       if (this == ☃) return true; 
/* 209 */       return (☃ instanceof e && ((e)☃).a.equals(this.a));
/*     */     }
/*     */ 
/*     */     
/*     */     public int hashCode() {
/* 214 */       return this.a.hashCode();
/*     */     }
/*     */     
/*     */     public String a() {
/* 218 */       return this.a;
/*     */     }
/*     */     
/*     */     public String b() {
/* 222 */       return "gamerule." + this.a;
/*     */     }
/*     */     
/*     */     public brt.b c() {
/* 226 */       return this.b;
/*     */     }
/*     */   }
/*     */   
/*     */   public static class f<T extends g<T>> {
/*     */     private final Supplier<ArgumentType<?>> a;
/*     */     private final Function<f<T>, T> b;
/*     */     private final BiConsumer<MinecraftServer, T> c;
/*     */     private final brt.h<T> d;
/*     */     
/*     */     private f(Supplier<ArgumentType<?>> ☃, Function<f<T>, T> function, BiConsumer<MinecraftServer, T> biConsumer, brt.h<T> h1) {
/* 237 */       this.a = ☃;
/* 238 */       this.b = function;
/* 239 */       this.c = biConsumer;
/* 240 */       this.d = h1;
/*     */     }
/*     */     
/*     */     public RequiredArgumentBuilder<db, ?> a(String ☃) {
/* 244 */       return dc.a(☃, this.a.get());
/*     */     }
/*     */     
/*     */     public T a() {
/* 248 */       return this.b.apply(this);
/*     */     }
/*     */     
/*     */     public void a(brt.c ☃, brt.e<T> e1) {
/* 252 */       this.d.call(☃, e1, this);
/*     */     }
/*     */   }
/*     */   
/*     */   public static abstract class g<T extends g<T>> {
/*     */     protected final brt.f<T> a;
/*     */     
/*     */     public g(brt.f<T> ☃) {
/* 260 */       this.a = ☃;
/*     */     }
/*     */     
/*     */     protected abstract void a(CommandContext<db> param1CommandContext, String param1String);
/*     */     
/*     */     public void b(CommandContext<db> ☃, String str) {
/* 266 */       a(☃, str);
/* 267 */       a(((db)☃.getSource()).j());
/*     */     }
/*     */     
/*     */     protected void a(@Nullable MinecraftServer ☃) {
/* 271 */       if (☃ != null) {
/* 272 */         brt.f.a(this.a).accept(☃, g());
/*     */       }
/*     */     }
/*     */ 
/*     */     
/*     */     protected abstract void a(String param1String);
/*     */     
/*     */     public abstract String b();
/*     */     
/*     */     public String toString() {
/* 282 */       return b();
/*     */     }
/*     */     
/*     */     public abstract int c();
/*     */     
/*     */     protected abstract T g();
/*     */     
/*     */     protected abstract T f();
/*     */     
/*     */     public abstract void a(T param1T, @Nullable MinecraftServer param1MinecraftServer); }
/*     */   
/*     */   public static class d extends g<d> { private int b;
/*     */     
/*     */     private static brt.f<d> a(int ☃, BiConsumer<MinecraftServer, d> biConsumer) {
/* 296 */       return new brt.f<>(IntegerArgumentType::integer, f1 -> new d(f1, ☃), biConsumer, brt.c::c);
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     private static brt.f<d> b(int ☃) {
/* 305 */       return a(☃, (☃, d1) -> {
/*     */           
/*     */           });
/*     */     }
/*     */     
/*     */     public d(brt.f<d> ☃, int i) {
/* 311 */       super(☃);
/* 312 */       this.b = i;
/*     */     }
/*     */ 
/*     */     
/*     */     protected void a(CommandContext<db> ☃, String str) {
/* 317 */       this.b = IntegerArgumentType.getInteger(☃, str);
/*     */     }
/*     */     
/*     */     public int a() {
/* 321 */       return this.b;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public String b() {
/* 331 */       return Integer.toString(this.b);
/*     */     }
/*     */ 
/*     */     
/*     */     protected void a(String ☃) {
/* 336 */       this.b = c(☃);
/*     */     }
/*     */     
/*     */     public boolean b(String ☃) {
/*     */       try {
/* 341 */         this.b = Integer.parseInt(☃);
/* 342 */         return true;
/* 343 */       } catch (NumberFormatException numberFormatException) {
/*     */ 
/*     */         
/* 346 */         return false;
/*     */       } 
/*     */     }
/*     */     private static int c(String ☃) {
/* 350 */       if (!☃.isEmpty()) {
/*     */         try {
/* 352 */           return Integer.parseInt(☃);
/* 353 */         } catch (NumberFormatException numberFormatException) {
/* 354 */           brt.c().warn("Failed to parse integer {}", ☃);
/*     */         } 
/*     */       }
/* 357 */       return 0;
/*     */     }
/*     */ 
/*     */     
/*     */     public int c() {
/* 362 */       return this.b;
/*     */     }
/*     */ 
/*     */     
/*     */     protected d d() {
/* 367 */       return this;
/*     */     }
/*     */ 
/*     */     
/*     */     protected d e() {
/* 372 */       return new d(this.a, this.b);
/*     */     }
/*     */ 
/*     */     
/*     */     public void a(d ☃, @Nullable MinecraftServer minecraftServer) {
/* 377 */       this.b = ☃.b;
/* 378 */       a(minecraftServer);
/*     */     } }
/*     */   
/*     */   public static class a extends g<a> { private boolean b;
/*     */     
/*     */     private static brt.f<a> b(boolean ☃, BiConsumer<MinecraftServer, a> biConsumer) {
/* 384 */       return new brt.f<>(BoolArgumentType::bool, f1 -> new a(f1, ☃), biConsumer, brt.c::b);
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     private static brt.f<a> b(boolean ☃) {
/* 393 */       return b(☃, (☃, a1) -> {
/*     */           
/*     */           });
/*     */     }
/*     */     
/*     */     public a(brt.f<a> ☃, boolean bool) {
/* 399 */       super(☃);
/* 400 */       this.b = bool;
/*     */     }
/*     */ 
/*     */     
/*     */     protected void a(CommandContext<db> ☃, String str) {
/* 405 */       this.b = BoolArgumentType.getBool(☃, str);
/*     */     }
/*     */     
/*     */     public boolean a() {
/* 409 */       return this.b;
/*     */     }
/*     */     
/*     */     public void a(boolean ☃, @Nullable MinecraftServer minecraftServer) {
/* 413 */       this.b = ☃;
/* 414 */       a(minecraftServer);
/*     */     }
/*     */ 
/*     */     
/*     */     public String b() {
/* 419 */       return Boolean.toString(this.b);
/*     */     }
/*     */ 
/*     */     
/*     */     protected void a(String ☃) {
/* 424 */       this.b = Boolean.parseBoolean(☃);
/*     */     }
/*     */ 
/*     */     
/*     */     public int c() {
/* 429 */       return this.b ? 1 : 0;
/*     */     }
/*     */ 
/*     */     
/*     */     protected a d() {
/* 434 */       return this;
/*     */     }
/*     */ 
/*     */     
/*     */     protected a e() {
/* 439 */       return new a(this.a, this.b);
/*     */     }
/*     */ 
/*     */     
/*     */     public void a(a ☃, @Nullable MinecraftServer minecraftServer) {
/* 444 */       this.b = ☃.b;
/* 445 */       a(minecraftServer);
/*     */     } }
/*     */ 
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\brt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */