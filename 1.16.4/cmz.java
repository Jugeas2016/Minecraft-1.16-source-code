/*     */ import com.google.common.collect.ImmutableList;
/*     */ import com.mojang.datafixers.kinds.App;
/*     */ import com.mojang.datafixers.kinds.Applicative;
/*     */ import com.mojang.datafixers.util.Function9;
/*     */ import com.mojang.serialization.Codec;
/*     */ import com.mojang.serialization.codecs.RecordCodecBuilder;
/*     */ import java.util.List;
/*     */ 
/*     */ public class cmz
/*     */   implements cma
/*     */ {
/*     */   public static final Codec<cmz> a;
/*     */   public final cnt b;
/*     */   
/*     */   static {
/*  16 */     a = RecordCodecBuilder.create(☃ -> ☃.group((App)cnt.a.fieldOf("trunk_provider").forGetter(()), (App)cnt.a.fieldOf("leaves_provider").forGetter(()), (App)cnl.d.fieldOf("foliage_placer").forGetter(()), (App)cpb.c.fieldOf("trunk_placer").forGetter(()), (App)cnb.a.fieldOf("minimum_size").forGetter(()), (App)cor.c.listOf().fieldOf("decorators").forGetter(()), (App)Codec.INT.fieldOf("max_water_depth").orElse(Integer.valueOf(0)).forGetter(()), (App)Codec.BOOL.fieldOf("ignore_vines").orElse(Boolean.valueOf(false)).forGetter(()), (App)chn.a.g.fieldOf("heightmap").forGetter(())).apply((Applicative)☃, cmz::new));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public final cnt c;
/*     */ 
/*     */   
/*     */   public final List<cor> d;
/*     */ 
/*     */   
/*     */   public transient boolean e;
/*     */ 
/*     */   
/*     */   public final cnl f;
/*     */ 
/*     */   
/*     */   public final cpb g;
/*     */ 
/*     */   
/*     */   public final cnb h;
/*     */ 
/*     */   
/*     */   public final int i;
/*     */ 
/*     */   
/*     */   public final boolean j;
/*     */ 
/*     */   
/*     */   public final chn.a l;
/*     */ 
/*     */   
/*     */   protected cmz(cnt ☃, cnt cnt1, cnl cnl1, cpb cpb1, cnb cnb1, List<cor> list, int i, boolean bool, chn.a a1) {
/*  49 */     this.b = ☃;
/*  50 */     this.c = cnt1;
/*  51 */     this.d = list;
/*  52 */     this.f = cnl1;
/*  53 */     this.h = cnb1;
/*  54 */     this.g = cpb1;
/*  55 */     this.i = i;
/*  56 */     this.j = bool;
/*  57 */     this.l = a1;
/*     */   }
/*     */   
/*     */   public void b() {
/*  61 */     this.e = true;
/*     */   }
/*     */   
/*     */   public cmz a(List<cor> ☃) {
/*  65 */     return new cmz(this.b, this.c, this.f, this.g, this.h, ☃, this.i, this.j, this.l);
/*     */   }
/*     */   
/*     */   public static class a {
/*     */     public final cnt a;
/*     */     public final cnt b;
/*     */     private final cnl c;
/*     */     private final cpb d;
/*     */     private final cnb e;
/*  74 */     private List<cor> f = (List<cor>)ImmutableList.of();
/*     */     private int g;
/*     */     private boolean h;
/*  77 */     private chn.a i = chn.a.d;
/*     */     
/*     */     public a(cnt ☃, cnt cnt1, cnl cnl1, cpb cpb1, cnb cnb1) {
/*  80 */       this.a = ☃;
/*  81 */       this.b = cnt1;
/*  82 */       this.c = cnl1;
/*  83 */       this.d = cpb1;
/*  84 */       this.e = cnb1;
/*     */     }
/*     */     
/*     */     public a a(List<cor> ☃) {
/*  88 */       this.f = ☃;
/*  89 */       return this;
/*     */     }
/*     */     
/*     */     public a a(int ☃) {
/*  93 */       this.g = ☃;
/*  94 */       return this;
/*     */     }
/*     */     
/*     */     public a a() {
/*  98 */       this.h = true;
/*  99 */       return this;
/*     */     }
/*     */     
/*     */     public a a(chn.a ☃) {
/* 103 */       this.i = ☃;
/* 104 */       return this;
/*     */     }
/*     */     
/*     */     public cmz b() {
/* 108 */       return new cmz(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cmz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */