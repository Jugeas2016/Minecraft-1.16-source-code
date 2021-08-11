/*     */ import com.google.common.collect.Maps;
/*     */ import com.mojang.datafixers.kinds.App;
/*     */ import com.mojang.datafixers.kinds.Applicative;
/*     */ import com.mojang.datafixers.util.Function8;
/*     */ import com.mojang.serialization.Codec;
/*     */ import com.mojang.serialization.codecs.RecordCodecBuilder;
/*     */ import java.util.Map;
/*     */ import java.util.Objects;
/*     */ import java.util.Optional;
/*     */ import java.util.function.Supplier;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class chp
/*     */ {
/*     */   public static final Codec<chp> a;
/*     */   
/*     */   static {
/*  23 */     a = RecordCodecBuilder.create(☃ -> ☃.group((App)chv.a.fieldOf("structures").forGetter(chp::a), (App)chr.a.fieldOf("noise").forGetter(chp::b), (App)ceh.b.fieldOf("default_block").forGetter(chp::c), (App)ceh.b.fieldOf("default_fluid").forGetter(chp::d), (App)Codec.intRange(-20, 276).fieldOf("bedrock_roof_position").forGetter(chp::e), (App)Codec.intRange(-20, 276).fieldOf("bedrock_floor_position").forGetter(chp::f), (App)Codec.intRange(0, 255).fieldOf("sea_level").forGetter(chp::g), (App)Codec.BOOL.fieldOf("disable_mob_generation").forGetter(chp::h)).apply((Applicative)☃, chp::new));
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
/*  34 */   public static final Codec<Supplier<chp>> b = vf.a(gm.ar, a);
/*     */   
/*     */   private final chv i;
/*     */   
/*     */   private final chr j;
/*     */   
/*     */   private final ceh k;
/*     */   
/*     */   private final ceh l;
/*     */   private final int m;
/*     */   private final int n;
/*     */   private final int o;
/*     */   private final boolean p;
/*     */   
/*     */   private chp(chv ☃, chr chr1, ceh ceh1, ceh ceh2, int i, int j, int k, boolean bool) {
/*  49 */     this.i = ☃;
/*  50 */     this.j = chr1;
/*     */     
/*  52 */     this.k = ceh1;
/*  53 */     this.l = ceh2;
/*     */     
/*  55 */     this.m = i;
/*  56 */     this.n = j;
/*  57 */     this.o = k;
/*     */     
/*  59 */     this.p = bool;
/*     */   }
/*     */   
/*     */   public chv a() {
/*  63 */     return this.i;
/*     */   }
/*     */   
/*     */   public chr b() {
/*  67 */     return this.j;
/*     */   }
/*     */   
/*     */   public ceh c() {
/*  71 */     return this.k;
/*     */   }
/*     */   
/*     */   public ceh d() {
/*  75 */     return this.l;
/*     */   }
/*     */   
/*     */   public int e() {
/*  79 */     return this.m;
/*     */   }
/*     */   
/*     */   public int f() {
/*  83 */     return this.n;
/*     */   }
/*     */   
/*     */   public int g() {
/*  87 */     return this.o;
/*     */   }
/*     */   
/*     */   @Deprecated
/*     */   protected boolean h() {
/*  92 */     return this.p;
/*     */   }
/*     */   
/*     */   public boolean a(vj<chp> ☃) {
/*  96 */     return Objects.equals(this, hk.j.a(☃));
/*     */   }
/*     */   
/*     */   private static chp a(vj<chp> ☃, chp chp1) {
/* 100 */     hk.a(hk.j, ☃.a(), chp1);
/* 101 */     return chp1;
/*     */   }
/*     */   
/* 104 */   public static final vj<chp> c = vj.a(gm.ar, new vk("overworld"));
/* 105 */   public static final vj<chp> d = vj.a(gm.ar, new vk("amplified"));
/* 106 */   public static final vj<chp> e = vj.a(gm.ar, new vk("nether"));
/* 107 */   public static final vj<chp> f = vj.a(gm.ar, new vk("end"));
/* 108 */   public static final vj<chp> g = vj.a(gm.ar, new vk("caves"));
/* 109 */   public static final vj<chp> h = vj.a(gm.ar, new vk("floating_islands"));
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 114 */   private static final chp q = a(c, a(new chv(true), false, c.a())); static {
/* 115 */     a(d, a(new chv(true), true, d.a()));
/* 116 */     a(e, a(new chv(false), bup.cL.n(), bup.B.n(), e.a()));
/* 117 */     a(f, a(new chv(false), bup.ee.n(), bup.a.n(), f.a(), true, true));
/* 118 */     a(g, a(new chv(true), bup.b.n(), bup.A.n(), g.a()));
/* 119 */     a(h, a(new chv(true), bup.b.n(), bup.A.n(), h.a(), false, false));
/*     */   }
/*     */   
/*     */   public static chp i() {
/* 123 */     return q;
/*     */   }
/*     */   
/*     */   private static chp a(chv ☃, ceh ceh1, ceh ceh2, vk vk1, boolean bool1, boolean bool2) {
/* 127 */     return new chp(☃, new chr(128, new chq(2.0D, 1.0D, 80.0D, 160.0D), new chs(-3000, 64, -46), new chs(-30, 7, 1), 2, 1, 0.0D, 0.0D, true, false, bool2, false), ceh1, ceh2, -10, -10, 0, bool1);
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
/*     */   private static chp a(chv ☃, ceh ceh1, ceh ceh2, vk vk1) {
/* 151 */     Map<cla<?>, cmy> map = Maps.newHashMap((Map)chv.b);
/* 152 */     map.put(cla.h, new cmy(25, 10, 34222645));
/*     */     
/* 154 */     return new chp(new chv(Optional.ofNullable(☃.b()), map), new chr(128, new chq(1.0D, 3.0D, 80.0D, 60.0D), new chs(120, 3, 0), new chs(320, 4, -1), 1, 2, 0.0D, 0.019921875D, false, false, false, false), ceh1, ceh2, 0, 0, 32, false);
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
/*     */   private static chp a(chv ☃, boolean bool, vk vk1) {
/* 182 */     double d = 0.9999999814507745D;
/* 183 */     return new chp(☃, new chr(256, new chq(0.9999999814507745D, 0.9999999814507745D, 80.0D, 160.0D), new chs(-10, 3, 0), new chs(-30, 0, 0), 1, 2, 1.0D, -0.46875D, true, true, false, bool), bup.b
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
/* 197 */         .n(), bup.A
/* 198 */         .n(), -10, 0, 63, false);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\chp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */