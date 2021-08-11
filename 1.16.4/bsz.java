/*     */ import com.mojang.datafixers.kinds.App;
/*     */ import com.mojang.datafixers.kinds.Applicative;
/*     */ import com.mojang.datafixers.util.Function12;
/*     */ import com.mojang.serialization.Codec;
/*     */ import com.mojang.serialization.codecs.RecordCodecBuilder;
/*     */ import java.util.Arrays;
/*     */ import java.util.Map;
/*     */ import java.util.Optional;
/*     */ import java.util.OptionalInt;
/*     */ import java.util.stream.Collectors;
/*     */ 
/*     */ public class bsz {
/*     */   public static final Codec<bsz> a;
/*     */   
/*     */   static {
/*  16 */     a = RecordCodecBuilder.create(☃ -> ☃.group((App)Codec.INT.fieldOf("fog_color").forGetter(()), (App)Codec.INT.fieldOf("water_color").forGetter(()), (App)Codec.INT.fieldOf("water_fog_color").forGetter(()), (App)Codec.INT.fieldOf("sky_color").forGetter(()), (App)Codec.INT.optionalFieldOf("foliage_color").forGetter(()), (App)Codec.INT.optionalFieldOf("grass_color").forGetter(()), (App)b.d.optionalFieldOf("grass_color_modifier", b.a).forGetter(()), (App)bsu.a.optionalFieldOf("particle").forGetter(()), (App)adp.a.optionalFieldOf("ambient_sound").forGetter(()), (App)bst.a.optionalFieldOf("mood_sound").forGetter(()), (App)bss.a.optionalFieldOf("additions_sound").forGetter(()), (App)adn.a.optionalFieldOf("music").forGetter(())).apply((Applicative)☃, bsz::new));
/*     */   }
/*     */ 
/*     */   
/*     */   private final int b;
/*     */   
/*     */   private final int c;
/*     */   
/*     */   private final int d;
/*     */   
/*     */   private final int e;
/*     */   
/*     */   private final Optional<Integer> f;
/*     */   
/*     */   private final Optional<Integer> g;
/*     */   
/*     */   private final b h;
/*     */   
/*     */   private final Optional<bsu> i;
/*     */   
/*     */   private final Optional<adp> j;
/*     */   
/*     */   private final Optional<bst> k;
/*     */   
/*     */   private final Optional<bss> l;
/*     */   
/*     */   private final Optional<adn> m;
/*     */   
/*     */   private bsz(int ☃, int i, int j, int k, Optional<Integer> optional1, Optional<Integer> optional2, b b1, Optional<bsu> optional, Optional<adp> optional3, Optional<bst> optional4, Optional<bss> optional5, Optional<adn> optional6) {
/*  45 */     this.b = ☃;
/*  46 */     this.c = i;
/*  47 */     this.d = j;
/*  48 */     this.e = k;
/*  49 */     this.f = optional1;
/*  50 */     this.g = optional2;
/*  51 */     this.h = b1;
/*  52 */     this.i = optional;
/*  53 */     this.j = optional3;
/*  54 */     this.k = optional4;
/*  55 */     this.l = optional5;
/*  56 */     this.m = optional6;
/*     */   }
/*     */   
/*     */   public int a() {
/*  60 */     return this.b;
/*     */   }
/*     */   
/*     */   public int b() {
/*  64 */     return this.c;
/*     */   }
/*     */   
/*     */   public int c() {
/*  68 */     return this.d;
/*     */   }
/*     */   
/*     */   public int d() {
/*  72 */     return this.e;
/*     */   }
/*     */   
/*     */   public Optional<Integer> e() {
/*  76 */     return this.f;
/*     */   }
/*     */   
/*     */   public Optional<Integer> f() {
/*  80 */     return this.g;
/*     */   }
/*     */   
/*     */   public b g() {
/*  84 */     return this.h;
/*     */   }
/*     */   
/*     */   public Optional<bsu> h() {
/*  88 */     return this.i;
/*     */   }
/*     */   
/*     */   public Optional<adp> i() {
/*  92 */     return this.j;
/*     */   }
/*     */   
/*     */   public Optional<bst> j() {
/*  96 */     return this.k;
/*     */   }
/*     */   
/*     */   public Optional<bss> k() {
/* 100 */     return this.l;
/*     */   }
/*     */   
/*     */   public Optional<adn> l() {
/* 104 */     return this.m;
/*     */   }
/*     */   
/*     */   public static class a {
/* 108 */     private OptionalInt a = OptionalInt.empty();
/* 109 */     private OptionalInt b = OptionalInt.empty();
/* 110 */     private OptionalInt c = OptionalInt.empty();
/* 111 */     private OptionalInt d = OptionalInt.empty();
/* 112 */     private Optional<Integer> e = Optional.empty();
/* 113 */     private Optional<Integer> f = Optional.empty();
/* 114 */     private bsz.b g = bsz.b.a;
/* 115 */     private Optional<bsu> h = Optional.empty();
/* 116 */     private Optional<adp> i = Optional.empty();
/* 117 */     private Optional<bst> j = Optional.empty();
/* 118 */     private Optional<bss> k = Optional.empty();
/* 119 */     private Optional<adn> l = Optional.empty();
/*     */     
/*     */     public a a(int ☃) {
/* 122 */       this.a = OptionalInt.of(☃);
/* 123 */       return this;
/*     */     }
/*     */     
/*     */     public a b(int ☃) {
/* 127 */       this.b = OptionalInt.of(☃);
/* 128 */       return this;
/*     */     }
/*     */     
/*     */     public a c(int ☃) {
/* 132 */       this.c = OptionalInt.of(☃);
/* 133 */       return this;
/*     */     }
/*     */     
/*     */     public a d(int ☃) {
/* 137 */       this.d = OptionalInt.of(☃);
/* 138 */       return this;
/*     */     }
/*     */     
/*     */     public a e(int ☃) {
/* 142 */       this.e = Optional.of(Integer.valueOf(☃));
/* 143 */       return this;
/*     */     }
/*     */     
/*     */     public a f(int ☃) {
/* 147 */       this.f = Optional.of(Integer.valueOf(☃));
/* 148 */       return this;
/*     */     }
/*     */     
/*     */     public a a(bsz.b ☃) {
/* 152 */       this.g = ☃;
/* 153 */       return this;
/*     */     }
/*     */     
/*     */     public a a(bsu ☃) {
/* 157 */       this.h = Optional.of(☃);
/* 158 */       return this;
/*     */     }
/*     */     
/*     */     public a a(adp ☃) {
/* 162 */       this.i = Optional.of(☃);
/* 163 */       return this;
/*     */     }
/*     */     
/*     */     public a a(bst ☃) {
/* 167 */       this.j = Optional.of(☃);
/* 168 */       return this;
/*     */     }
/*     */     
/*     */     public a a(bss ☃) {
/* 172 */       this.k = Optional.of(☃);
/* 173 */       return this;
/*     */     }
/*     */     
/*     */     public a a(adn ☃) {
/* 177 */       this.l = Optional.of(☃);
/* 178 */       return this;
/*     */     }
/*     */     
/*     */     public bsz a() {
/* 182 */       return new bsz(this.a
/* 183 */           .orElseThrow(() -> new IllegalStateException("Missing 'fog' color.")), this.b
/* 184 */           .orElseThrow(() -> new IllegalStateException("Missing 'water' color.")), this.c
/* 185 */           .orElseThrow(() -> new IllegalStateException("Missing 'water fog' color.")), this.d
/* 186 */           .orElseThrow(() -> new IllegalStateException("Missing 'sky' color.")), this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public enum b
/*     */     implements afs
/*     */   {
/* 198 */     a("none")
/*     */     {
/*     */       public int a(double ☃, double d1, int i) {
/* 201 */         return i;
/*     */       }
/*     */     },
/* 204 */     b("dark_forest")
/*     */     {
/*     */       public int a(double ☃, double d1, int i) {
/* 207 */         return (i & 0xFEFEFE) + 2634762 >> 1;
/*     */       }
/*     */     },
/* 210 */     c("swamp")
/*     */     {
/*     */       public int a(double ☃, double d1, int i) {
/* 213 */         double d = bsv.f.a(☃ * 0.0225D, d1 * 0.0225D, false);
/* 214 */         if (d < -0.1D) {
/* 215 */           return 5011004;
/*     */         }
/* 217 */         return 6975545;
/*     */       }
/*     */     };
/*     */ 
/*     */     
/*     */     private final String e;
/*     */     private static final Map<String, b> f;
/*     */     
/*     */     b(String ☃) {
/*     */       this.e = ☃;
/*     */     }
/*     */     
/* 229 */     public static final Codec<b> d = afs.a(b::values, b::a);
/*     */     static {
/* 231 */       f = (Map<String, b>)Arrays.<b>stream(values()).collect(Collectors.toMap(b::b, ☃ -> ☃));
/*     */     }
/*     */     public String b() {
/* 234 */       return this.e;
/*     */     }
/*     */ 
/*     */     
/*     */     public String a() {
/* 239 */       return this.e;
/*     */     }
/*     */     
/*     */     public static b a(String ☃) {
/* 243 */       return f.get(☃);
/*     */     }
/*     */     
/*     */     public abstract int a(double param1Double1, double param1Double2, int param1Int);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bsz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */