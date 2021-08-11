/*     */ import com.google.common.base.MoreObjects;
/*     */ import com.google.common.collect.ImmutableSet;
/*     */ import com.google.gson.JsonElement;
/*     */ import com.google.gson.JsonObject;
/*     */ import com.mojang.datafixers.kinds.App;
/*     */ import com.mojang.datafixers.kinds.Applicative;
/*     */ import com.mojang.datafixers.util.Function5;
/*     */ import com.mojang.serialization.Codec;
/*     */ import com.mojang.serialization.DataResult;
/*     */ import com.mojang.serialization.Dynamic;
/*     */ import com.mojang.serialization.DynamicOps;
/*     */ import com.mojang.serialization.JsonOps;
/*     */ import com.mojang.serialization.Lifecycle;
/*     */ import com.mojang.serialization.codecs.RecordCodecBuilder;
/*     */ import java.util.Locale;
/*     */ import java.util.Map;
/*     */ import java.util.Objects;
/*     */ import java.util.Optional;
/*     */ import java.util.OptionalLong;
/*     */ import java.util.Properties;
/*     */ import java.util.Random;
/*     */ import java.util.function.Function;
/*     */ import java.util.function.Supplier;
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
/*     */ public class chw
/*     */ {
/*     */   public static final Codec<chw> a;
/*     */   
/*     */   static {
/*  47 */     a = RecordCodecBuilder.create(☃ -> ☃.group((App)Codec.LONG.fieldOf("seed").stable().forGetter(chw::a), (App)Codec.BOOL.fieldOf("generate_features").orElse(Boolean.valueOf(true)).stable().forGetter(chw::b), (App)Codec.BOOL.fieldOf("bonus_chest").orElse(Boolean.valueOf(false)).stable().forGetter(chw::c), (App)gi.<T>b((vj)gm.M, Lifecycle.stable(), (Codec)che.a).xmap(che::a, Function.identity()).fieldOf("dimensions").forGetter(chw::d), (App)Codec.STRING.optionalFieldOf("legacy_custom_options").stable().forGetter(())).apply((Applicative)☃, ☃.stable(chw::new))).comapFlatMap(chw::m, Function.identity());
/*     */   }
/*  49 */   private static final Logger b = LogManager.getLogger();
/*     */   
/*     */   private final long c;
/*     */   
/*     */   private final boolean d;
/*     */   
/*     */   private final boolean e;
/*     */   private final gi<che> f;
/*     */   private final Optional<String> g;
/*     */   
/*     */   private DataResult<chw> m() {
/*  60 */     che ☃ = this.f.a(che.b);
/*  61 */     if (☃ == null) {
/*  62 */       return DataResult.error("Overworld settings missing");
/*     */     }
/*  64 */     if (n()) {
/*  65 */       return DataResult.success(this, Lifecycle.stable());
/*     */     }
/*  67 */     return DataResult.success(this);
/*     */   }
/*     */   
/*     */   private boolean n() {
/*  71 */     return che.a(this.c, this.f);
/*     */   }
/*     */   
/*     */   public chw(long ☃, boolean bool1, boolean bool2, gi<che> gi1) {
/*  75 */     this(☃, bool1, bool2, gi1, Optional.empty());
/*     */     
/*  77 */     che che = gi1.a(che.b);
/*  78 */     if (che == null) {
/*  79 */       throw new IllegalStateException("Overworld settings missing");
/*     */     }
/*     */   }
/*     */   
/*     */   private chw(long ☃, boolean bool1, boolean bool2, gi<che> gi1, Optional<String> optional) {
/*  84 */     this.c = ☃;
/*  85 */     this.d = bool1;
/*  86 */     this.e = bool2;
/*  87 */     this.f = gi1;
/*  88 */     this.g = optional;
/*     */   }
/*     */   
/*     */   public static chw a(gn ☃) {
/*  92 */     gm<bsv> gm = ☃.b(gm.ay);
/*  93 */     int i = "North Carolina".hashCode();
/*  94 */     gm<chd> gm1 = ☃.b(gm.K);
/*  95 */     gm<chp> gm2 = ☃.b(gm.ar);
/*  96 */     return new chw(i, true, true, a(gm1, chd.a(gm1, gm, gm2, i), a(gm, gm2, i)));
/*     */   }
/*     */   
/*     */   public static chw a(gm<chd> ☃, gm<bsv> gm1, gm<chp> gm2) {
/* 100 */     long l = (new Random()).nextLong();
/* 101 */     return new chw(l, true, false, a(☃, chd.a(☃, gm1, gm2, l), a(gm1, gm2, l)));
/*     */   }
/*     */   
/*     */   public static cho a(gm<bsv> ☃, gm<chp> gm1, long l) {
/* 105 */     return new cho(new btj(l, false, false, ☃), l, () -> (chp)☃.d(chp.c));
/*     */   }
/*     */   
/*     */   public long a() {
/* 109 */     return this.c;
/*     */   }
/*     */   
/*     */   public boolean b() {
/* 113 */     return this.d;
/*     */   }
/*     */   
/*     */   public boolean c() {
/* 117 */     return this.e;
/*     */   }
/*     */   
/*     */   public static gi<che> a(gm<chd> ☃, gi<che> gi1, cfy cfy1) {
/* 121 */     che che = gi1.a(che.b);
/* 122 */     Supplier<chd> supplier = () -> (☃ == null) ? gm1.d(chd.f) : ☃.b();
/*     */     
/* 124 */     return a(gi1, supplier, cfy1);
/*     */   }
/*     */   
/*     */   public static gi<che> a(gi<che> ☃, Supplier<chd> supplier, cfy cfy1) {
/* 128 */     gi<che> gi1 = new gi<>(gm.M, Lifecycle.experimental());
/*     */     
/* 130 */     gi1.a(che.b, new che(supplier, cfy1), Lifecycle.stable());
/* 131 */     for (Map.Entry<vj<che>, che> entry : ☃.d()) {
/* 132 */       vj<che> vj = entry.getKey();
/* 133 */       if (vj == che.b) {
/*     */         continue;
/*     */       }
/* 136 */       gi1.a(vj, entry.getValue(), ☃.d(entry.getValue()));
/*     */     } 
/* 138 */     return gi1;
/*     */   }
/*     */   
/*     */   public gi<che> d() {
/* 142 */     return this.f;
/*     */   }
/*     */   
/*     */   public cfy e() {
/* 146 */     che ☃ = this.f.a(che.b);
/* 147 */     if (☃ == null) {
/* 148 */       throw new IllegalStateException("Overworld settings missing");
/*     */     }
/* 150 */     return ☃.c();
/*     */   }
/*     */   
/*     */   public ImmutableSet<vj<brx>> f() {
/* 154 */     return (ImmutableSet<vj<brx>>)d().d().stream().map(☃ -> vj.a(gm.L, ((vj)☃.getKey()).a())).collect(ImmutableSet.toImmutableSet());
/*     */   }
/*     */   
/*     */   public boolean g() {
/* 158 */     return e() instanceof chj;
/*     */   }
/*     */   
/*     */   public boolean h() {
/* 162 */     return e() instanceof chl;
/*     */   }
/*     */   
/*     */   public boolean i() {
/* 166 */     return this.g.isPresent();
/*     */   }
/*     */   
/*     */   public chw j() {
/* 170 */     return new chw(this.c, this.d, true, this.f, this.g);
/*     */   }
/*     */   
/*     */   public chw k() {
/* 174 */     return new chw(this.c, !this.d, this.e, this.f);
/*     */   }
/*     */   
/*     */   public chw l() {
/* 178 */     return new chw(this.c, this.d, !this.e, this.f);
/*     */   }
/*     */   
/*     */   public static chw a(gn ☃, Properties properties) {
/*     */     JsonObject jsonObject;
/*     */     Dynamic<JsonElement> dynamic;
/* 184 */     String str1 = (String)MoreObjects.firstNonNull(properties.get("generator-settings"), "");
/* 185 */     properties.put("generator-settings", str1);
/*     */     
/* 187 */     String str2 = (String)MoreObjects.firstNonNull(properties.get("level-seed"), "");
/* 188 */     properties.put("level-seed", str2);
/*     */     
/* 190 */     String str3 = (String)properties.get("generate-structures");
/* 191 */     boolean bool = (str3 == null || Boolean.parseBoolean(str3));
/* 192 */     properties.put("generate-structures", Objects.toString(Boolean.valueOf(bool)));
/*     */     
/* 194 */     String str4 = (String)properties.get("level-type");
/* 195 */     String str5 = Optional.<String>ofNullable(str4).map(☃ -> ☃.toLowerCase(Locale.ROOT)).orElse("default");
/* 196 */     properties.put("level-type", str5);
/*     */     
/* 198 */     long l = (new Random()).nextLong();
/* 199 */     if (!str2.isEmpty()) {
/*     */       try {
/* 201 */         long l1 = Long.parseLong(str2);
/* 202 */         if (l1 != 0L) {
/* 203 */           l = l1;
/*     */         }
/* 205 */       } catch (NumberFormatException numberFormatException) {
/* 206 */         l = str2.hashCode();
/*     */       } 
/*     */     }
/*     */     
/* 210 */     gm<chd> gm = ☃.b(gm.K);
/* 211 */     gm<bsv> gm1 = ☃.b(gm.ay);
/* 212 */     gm<chp> gm2 = ☃.b(gm.ar);
/*     */     
/* 214 */     gi<che> gi1 = chd.a(gm, gm1, gm2, l);
/* 215 */     switch (str5) {
/*     */       case "flat":
/* 217 */         jsonObject = !str1.isEmpty() ? afd.a(str1) : new JsonObject();
/* 218 */         dynamic = new Dynamic((DynamicOps)JsonOps.INSTANCE, jsonObject);
/* 219 */         return new chw(l, bool, false, a(gm, gi1, new chl(cpf.a.parse(dynamic).resultOrPartial(b::error).orElseGet(() -> cpf.a(☃)))));
/*     */       case "debug_all_block_states":
/* 221 */         return new chw(l, bool, false, a(gm, gi1, new chj(gm1)));
/*     */       case "amplified":
/* 223 */         return new chw(l, bool, false, a(gm, gi1, new cho(new btj(l, false, false, gm1), l, () -> (chp)☃.d(chp.d))));
/*     */       case "largebiomes":
/* 225 */         return new chw(l, bool, false, a(gm, gi1, new cho(new btj(l, false, true, gm1), l, () -> (chp)☃.d(chp.c))));
/*     */     } 
/* 227 */     return new chw(l, bool, false, a(gm, gi1, a(gm1, gm2, l)));
/*     */   }
/*     */   
/*     */   public chw a(boolean ☃, OptionalLong optionalLong) {
/*     */     chw chw1;
/*     */     gi<che> gi1;
/* 233 */     long l = optionalLong.orElse(this.c);
/*     */     
/* 235 */     if (optionalLong.isPresent()) {
/* 236 */       gi1 = new gi<>(gm.M, Lifecycle.experimental());
/* 237 */       long l1 = optionalLong.getAsLong();
/* 238 */       for (Map.Entry<vj<che>, che> entry : this.f.d()) {
/* 239 */         vj<che> vj = entry.getKey();
/* 240 */         gi1.a(vj, new che(((che)entry.getValue()).a(), ((che)entry.getValue()).c().a(l1)), this.f.d(entry.getValue()));
/*     */       } 
/*     */     } else {
/* 243 */       gi1 = this.f;
/*     */     } 
/* 245 */     if (g()) {
/* 246 */       chw1 = new chw(l, false, false, gi1);
/*     */     } else {
/* 248 */       chw1 = new chw(l, b(), (c() && !☃), gi1);
/*     */     } 
/* 250 */     return chw1;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\chw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */