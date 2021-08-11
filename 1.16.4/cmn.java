/*     */ import com.google.common.collect.ImmutableList;
/*     */ import com.google.common.collect.ImmutableSet;
/*     */ import com.mojang.datafixers.kinds.App;
/*     */ import com.mojang.datafixers.kinds.Applicative;
/*     */ import com.mojang.datafixers.util.Function11;
/*     */ import com.mojang.serialization.Codec;
/*     */ import com.mojang.serialization.codecs.RecordCodecBuilder;
/*     */ import java.util.List;
/*     */ import java.util.Set;
/*     */ import java.util.stream.Collectors;
/*     */ 
/*     */ public class cmn
/*     */   implements cma {
/*     */   public static final Codec<cmn> a;
/*     */   
/*     */   static {
/*  17 */     a = RecordCodecBuilder.create(☃ -> ☃.group((App)cnt.a.fieldOf("state_provider").forGetter(()), (App)cll.a.fieldOf("block_placer").forGetter(()), (App)ceh.b.listOf().fieldOf("whitelist").forGetter(()), (App)ceh.b.listOf().fieldOf("blacklist").forGetter(()), (App)Codec.INT.fieldOf("tries").orElse(Integer.valueOf(128)).forGetter(()), (App)Codec.INT.fieldOf("xspread").orElse(Integer.valueOf(7)).forGetter(()), (App)Codec.INT.fieldOf("yspread").orElse(Integer.valueOf(3)).forGetter(()), (App)Codec.INT.fieldOf("zspread").orElse(Integer.valueOf(7)).forGetter(()), (App)Codec.BOOL.fieldOf("can_replace").orElse(Boolean.valueOf(false)).forGetter(()), (App)Codec.BOOL.fieldOf("project").orElse(Boolean.valueOf(true)).forGetter(()), (App)Codec.BOOL.fieldOf("need_water").orElse(Boolean.valueOf(false)).forGetter(())).apply((Applicative)☃, cmn::new));
/*     */   }
/*     */ 
/*     */   
/*     */   public final cnt b;
/*     */   
/*     */   public final cll c;
/*     */   
/*     */   public final Set<buo> d;
/*     */   
/*     */   public final Set<ceh> e;
/*     */   
/*     */   public final int f;
/*     */   
/*     */   public final int g;
/*     */   
/*     */   public final int h;
/*     */   
/*     */   public final int i;
/*     */   
/*     */   public final boolean j;
/*     */   
/*     */   public final boolean l;
/*     */   
/*     */   public final boolean m;
/*     */   
/*     */   private cmn(cnt ☃, cll cll1, List<ceh> list1, List<ceh> list2, int i, int j, int k, int m, boolean bool1, boolean bool2, boolean bool3) {
/*  44 */     this(☃, cll1, (Set<buo>)list1
/*  45 */         .stream().map(ceg.a::b).collect(Collectors.toSet()), 
/*  46 */         (Set<ceh>)ImmutableSet.copyOf(list2), i, j, k, m, bool1, bool2, bool3);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private cmn(cnt ☃, cll cll1, Set<buo> set, Set<ceh> set1, int i, int j, int k, int m, boolean bool1, boolean bool2, boolean bool3) {
/*  52 */     this.b = ☃;
/*  53 */     this.c = cll1;
/*  54 */     this.d = set;
/*  55 */     this.e = set1;
/*  56 */     this.f = i;
/*  57 */     this.g = j;
/*  58 */     this.h = k;
/*  59 */     this.i = m;
/*  60 */     this.j = bool1;
/*  61 */     this.l = bool2;
/*  62 */     this.m = bool3;
/*     */   }
/*     */   
/*     */   public static class a {
/*     */     private final cnt a;
/*     */     private final cll b;
/*  68 */     private Set<buo> c = (Set<buo>)ImmutableSet.of();
/*  69 */     private Set<ceh> d = (Set<ceh>)ImmutableSet.of();
/*  70 */     private int e = 64;
/*  71 */     private int f = 7;
/*  72 */     private int g = 3;
/*  73 */     private int h = 7;
/*     */     private boolean i;
/*     */     private boolean j = true;
/*     */     private boolean k = false;
/*     */     
/*     */     public a(cnt ☃, cll cll1) {
/*  79 */       this.a = ☃;
/*  80 */       this.b = cll1;
/*     */     }
/*     */     
/*     */     public a a(Set<buo> ☃) {
/*  84 */       this.c = ☃;
/*  85 */       return this;
/*     */     }
/*     */     
/*     */     public a b(Set<ceh> ☃) {
/*  89 */       this.d = ☃;
/*  90 */       return this;
/*     */     }
/*     */     
/*     */     public a a(int ☃) {
/*  94 */       this.e = ☃;
/*  95 */       return this;
/*     */     }
/*     */     
/*     */     public a b(int ☃) {
/*  99 */       this.f = ☃;
/* 100 */       return this;
/*     */     }
/*     */     
/*     */     public a c(int ☃) {
/* 104 */       this.g = ☃;
/* 105 */       return this;
/*     */     }
/*     */     
/*     */     public a d(int ☃) {
/* 109 */       this.h = ☃;
/* 110 */       return this;
/*     */     }
/*     */     
/*     */     public a a() {
/* 114 */       this.i = true;
/* 115 */       return this;
/*     */     }
/*     */     
/*     */     public a b() {
/* 119 */       this.j = false;
/* 120 */       return this;
/*     */     }
/*     */     
/*     */     public a c() {
/* 124 */       this.k = true;
/* 125 */       return this;
/*     */     }
/*     */     
/*     */     public cmn d() {
/* 129 */       return new cmn(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cmn.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */