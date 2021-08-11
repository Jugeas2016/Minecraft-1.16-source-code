/*     */ import com.mojang.serialization.Codec;
/*     */ import java.util.List;
/*     */ import java.util.Optional;
/*     */ import java.util.Set;
/*     */ import java.util.UUID;
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
/*     */ public class ayd<U>
/*     */ {
/*  28 */   public static final ayd<Void> a = a("dummy");
/*  29 */   public static final ayd<gf> b = a("home", gf.a);
/*  30 */   public static final ayd<gf> c = a("job_site", gf.a);
/*  31 */   public static final ayd<gf> d = a("potential_job_site", gf.a);
/*  32 */   public static final ayd<gf> e = a("meeting_point", gf.a);
/*  33 */   public static final ayd<List<gf>> f = a("secondary_job_site");
/*  34 */   public static final ayd<List<aqm>> g = a("mobs");
/*  35 */   public static final ayd<List<aqm>> h = a("visible_mobs");
/*  36 */   public static final ayd<List<aqm>> i = a("visible_villager_babies");
/*  37 */   public static final ayd<List<bfw>> j = a("nearest_players");
/*  38 */   public static final ayd<bfw> k = a("nearest_visible_player");
/*  39 */   public static final ayd<bfw> l = a("nearest_visible_targetable_player");
/*  40 */   public static final ayd<ayf> m = a("walk_target");
/*  41 */   public static final ayd<atb> n = a("look_target");
/*  42 */   public static final ayd<aqm> o = a("attack_target");
/*  43 */   public static final ayd<Boolean> p = a("attack_cooling_down");
/*  44 */   public static final ayd<aqm> q = a("interaction_target");
/*  45 */   public static final ayd<apy> r = a("breed_target");
/*  46 */   public static final ayd<aqa> s = a("ride_target");
/*  47 */   public static final ayd<cxd> t = a("path");
/*  48 */   public static final ayd<List<gf>> u = a("interactable_doors");
/*  49 */   public static final ayd<Set<gf>> v = a("doors_to_close");
/*  50 */   public static final ayd<fx> w = a("nearest_bed");
/*  51 */   public static final ayd<apk> x = a("hurt_by");
/*  52 */   public static final ayd<aqm> y = a("hurt_by_entity");
/*  53 */   public static final ayd<aqm> z = a("avoid_target");
/*  54 */   public static final ayd<aqm> A = a("nearest_hostile");
/*  55 */   public static final ayd<gf> B = a("hiding_place");
/*  56 */   public static final ayd<Long> C = a("heard_bell_time");
/*  57 */   public static final ayd<Long> D = a("cant_reach_walk_target_since");
/*  58 */   public static final ayd<Boolean> E = a("golem_detected_recently", (Codec<Boolean>)Codec.BOOL);
/*  59 */   public static final ayd<Long> F = a("last_slept", (Codec<Long>)Codec.LONG);
/*  60 */   public static final ayd<Long> G = a("last_woken", (Codec<Long>)Codec.LONG);
/*  61 */   public static final ayd<Long> H = a("last_worked_at_poi", (Codec<Long>)Codec.LONG);
/*  62 */   public static final ayd<apy> I = a("nearest_visible_adult");
/*  63 */   public static final ayd<bcv> J = a("nearest_visible_wanted_item");
/*  64 */   public static final ayd<aqn> K = a("nearest_visible_nemesis");
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
/*  75 */   public static final ayd<UUID> L = a("angry_at", gq.a);
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  80 */   public static final ayd<Boolean> M = a("universal_anger", (Codec<Boolean>)Codec.BOOL);
/*  81 */   public static final ayd<Boolean> N = a("admiring_item", (Codec<Boolean>)Codec.BOOL);
/*  82 */   public static final ayd<Integer> O = a("time_trying_to_reach_admire_item");
/*  83 */   public static final ayd<Boolean> P = a("disable_walk_to_admire_item");
/*  84 */   public static final ayd<Boolean> Q = a("admiring_disabled", (Codec<Boolean>)Codec.BOOL);
/*  85 */   public static final ayd<Boolean> R = a("hunted_recently", (Codec<Boolean>)Codec.BOOL);
/*     */   
/*  87 */   public static final ayd<fx> S = a("celebrate_location");
/*  88 */   public static final ayd<Boolean> T = a("dancing");
/*  89 */   public static final ayd<bem> U = a("nearest_visible_huntable_hoglin");
/*  90 */   public static final ayd<bem> V = a("nearest_visible_baby_hoglin");
/*  91 */   public static final ayd<bfw> W = a("nearest_targetable_player_not_wearing_gold");
/*  92 */   public static final ayd<List<ber>> X = a("nearby_adult_piglins");
/*  93 */   public static final ayd<List<ber>> Y = a("nearest_visible_adult_piglins");
/*  94 */   public static final ayd<List<bem>> Z = a("nearest_visible_adult_hoglins");
/*     */   
/*  96 */   public static final ayd<ber> aa = a("nearest_visible_adult_piglin");
/*  97 */   public static final ayd<aqm> ab = a("nearest_visible_zombified");
/*  98 */   public static final ayd<Integer> ac = a("visible_adult_piglin_count");
/*  99 */   public static final ayd<Integer> ad = a("visible_adult_hoglin_count");
/* 100 */   public static final ayd<bfw> ae = a("nearest_player_holding_wanted_item");
/* 101 */   public static final ayd<Boolean> af = a("ate_recently");
/* 102 */   public static final ayd<fx> ag = a("nearest_repellent");
/* 103 */   public static final ayd<Boolean> ah = a("pacified");
/*     */   
/*     */   private final Optional<Codec<ayc<U>>> ai;
/*     */   
/*     */   private ayd(Optional<Codec<U>> ☃) {
/* 108 */     this.ai = ☃.map(ayc::a);
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/* 113 */     return gm.ak.b(this).toString();
/*     */   }
/*     */   
/*     */   public Optional<Codec<ayc<U>>> a() {
/* 117 */     return this.ai;
/*     */   }
/*     */   
/*     */   private static <U> ayd<U> a(String ☃, Codec<U> codec) {
/* 121 */     return gm.<ayd<?>, ayd<U>>a(gm.ak, new vk(☃), new ayd<>(Optional.of(codec)));
/*     */   }
/*     */   
/*     */   private static <U> ayd<U> a(String ☃) {
/* 125 */     return gm.<ayd<?>, ayd<U>>a(gm.ak, new vk(☃), new ayd<>(Optional.empty()));
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ayd.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */