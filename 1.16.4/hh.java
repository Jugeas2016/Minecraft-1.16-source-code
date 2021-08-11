/*     */ import com.mojang.serialization.Codec;
/*     */ import java.util.function.Function;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class hh
/*     */ {
/*   9 */   public static final hi a = a("ambient_entity_effect", false);
/*  10 */   public static final hi b = a("angry_villager", false);
/*  11 */   public static final hi c = a("barrier", false);
/*  12 */   public static final hg<hc> d = a("block", hc.a, hc::a);
/*  13 */   public static final hi e = a("bubble", false);
/*  14 */   public static final hi f = a("cloud", false);
/*  15 */   public static final hi g = a("crit", false);
/*  16 */   public static final hi h = a("damage_indicator", true);
/*  17 */   public static final hi i = a("dragon_breath", false);
/*  18 */   public static final hi j = a("dripping_lava", false);
/*  19 */   public static final hi k = a("falling_lava", false);
/*  20 */   public static final hi l = a("landing_lava", false);
/*  21 */   public static final hi m = a("dripping_water", false);
/*  22 */   public static final hi n = a("falling_water", false);
/*  23 */   public static final hg<hd> o = a("dust", hd.c, ☃ -> hd.b);
/*  24 */   public static final hi p = a("effect", false);
/*  25 */   public static final hi q = a("elder_guardian", true);
/*  26 */   public static final hi r = a("enchanted_hit", false);
/*  27 */   public static final hi s = a("enchant", false);
/*  28 */   public static final hi t = a("end_rod", false);
/*  29 */   public static final hi u = a("entity_effect", false);
/*  30 */   public static final hi v = a("explosion_emitter", true);
/*  31 */   public static final hi w = a("explosion", true);
/*  32 */   public static final hg<hc> x = a("falling_dust", hc.a, hc::a);
/*  33 */   public static final hi y = a("firework", false);
/*  34 */   public static final hi z = a("fishing", false);
/*  35 */   public static final hi A = a("flame", false);
/*  36 */   public static final hi B = a("soul_fire_flame", false);
/*  37 */   public static final hi C = a("soul", false);
/*  38 */   public static final hi D = a("flash", false);
/*  39 */   public static final hi E = a("happy_villager", false);
/*  40 */   public static final hi F = a("composter", false);
/*  41 */   public static final hi G = a("heart", false);
/*  42 */   public static final hi H = a("instant_effect", false);
/*  43 */   public static final hg<he> I = a("item", he.a, he::a);
/*     */   
/*  45 */   public static final hi J = a("item_slime", false);
/*  46 */   public static final hi K = a("item_snowball", false);
/*  47 */   public static final hi L = a("large_smoke", false);
/*  48 */   public static final hi M = a("lava", false);
/*  49 */   public static final hi N = a("mycelium", false);
/*  50 */   public static final hi O = a("note", false);
/*  51 */   public static final hi P = a("poof", true);
/*  52 */   public static final hi Q = a("portal", false);
/*  53 */   public static final hi R = a("rain", false);
/*  54 */   public static final hi S = a("smoke", false);
/*  55 */   public static final hi T = a("sneeze", false);
/*  56 */   public static final hi U = a("spit", true);
/*  57 */   public static final hi V = a("squid_ink", true);
/*  58 */   public static final hi W = a("sweep_attack", true);
/*  59 */   public static final hi X = a("totem_of_undying", false);
/*     */   
/*  61 */   public static final hi Y = a("underwater", false);
/*  62 */   public static final hi Z = a("splash", false);
/*  63 */   public static final hi aa = a("witch", false);
/*  64 */   public static final hi ab = a("bubble_pop", false);
/*  65 */   public static final hi ac = a("current_down", false);
/*  66 */   public static final hi ad = a("bubble_column_up", false);
/*  67 */   public static final hi ae = a("nautilus", false);
/*  68 */   public static final hi af = a("dolphin", false);
/*     */   
/*  70 */   public static final hi ag = a("campfire_cosy_smoke", true);
/*  71 */   public static final hi ah = a("campfire_signal_smoke", true);
/*     */   
/*  73 */   public static final hi ai = a("dripping_honey", false);
/*  74 */   public static final hi aj = a("falling_honey", false);
/*  75 */   public static final hi ak = a("landing_honey", false);
/*  76 */   public static final hi al = a("falling_nectar", false);
/*     */   
/*  78 */   public static final hi am = a("ash", false);
/*  79 */   public static final hi an = a("crimson_spore", false);
/*  80 */   public static final hi ao = a("warped_spore", false);
/*  81 */   public static final hi ap = a("dripping_obsidian_tear", false);
/*  82 */   public static final hi aq = a("falling_obsidian_tear", false);
/*  83 */   public static final hi ar = a("landing_obsidian_tear", false);
/*     */   
/*  85 */   public static final hi as = a("reverse_portal", false);
/*     */   
/*  87 */   public static final hi at = a("white_ash", false);
/*     */   
/*     */   private static hi a(String ☃, boolean bool) {
/*  90 */     return (hi)gm.<hg<?>>a(gm.V, ☃, new hi(bool));
/*     */   }
/*     */   
/*     */   private static <T extends hf> hg<T> a(String ☃, hf.a<T> a1, Function<hg<T>, Codec<T>> function) {
/*  94 */     return (hg<T>)gm.<hg<?>>a(gm.V, ☃, new hg<T>(false, a1, function)
/*     */         {
/*     */           public Codec<T> e() {
/*  97 */             return this.a.apply(this);
/*     */           }
/*     */         });
/*     */   }
/*     */   
/* 102 */   public static final Codec<hf> au = gm.V.dispatch("type", hf::b, hg::e);
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\hh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */