/*     */ import com.google.common.collect.ImmutableList;
/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.collect.Sets;
/*     */ import com.mojang.datafixers.kinds.App;
/*     */ import com.mojang.datafixers.kinds.Applicative;
/*     */ import com.mojang.serialization.Codec;
/*     */ import com.mojang.serialization.Lifecycle;
/*     */ import com.mojang.serialization.codecs.RecordCodecBuilder;
/*     */ import java.util.LinkedHashSet;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.function.BiFunction;
/*     */ import java.util.function.Supplier;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class che
/*     */ {
/*     */   public static final Codec<che> a;
/*     */   
/*     */   static {
/*  25 */     a = RecordCodecBuilder.create(☃ -> ☃.group((App)chd.n.fieldOf("type").forGetter(che::a), (App)cfy.a.fieldOf("generator").forGetter(che::c)).apply((Applicative)☃, ☃.stable(che::new)));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*  30 */   public static final vj<che> b = vj.a(gm.M, new vk("overworld"));
/*  31 */   public static final vj<che> c = vj.a(gm.M, new vk("the_nether"));
/*  32 */   public static final vj<che> d = vj.a(gm.M, new vk("the_end"));
/*     */   
/*  34 */   private static final LinkedHashSet<vj<che>> e = Sets.newLinkedHashSet((Iterable)ImmutableList.of(b, c, d));
/*     */ 
/*     */   
/*     */   private final Supplier<chd> f;
/*     */ 
/*     */   
/*     */   private final cfy g;
/*     */ 
/*     */   
/*     */   public che(Supplier<chd> ☃, cfy cfy1) {
/*  44 */     this.f = ☃;
/*  45 */     this.g = cfy1;
/*     */   }
/*     */   
/*     */   public Supplier<chd> a() {
/*  49 */     return this.f;
/*     */   }
/*     */   
/*     */   public chd b() {
/*  53 */     return this.f.get();
/*     */   }
/*     */   
/*     */   public cfy c() {
/*  57 */     return this.g;
/*     */   }
/*     */   
/*     */   public static gi<che> a(gi<che> ☃) {
/*  61 */     gi<che> gi1 = new gi<>(gm.M, Lifecycle.experimental());
/*  62 */     for (vj<che> vj1 : e) {
/*  63 */       che che1 = ☃.a(vj1);
/*  64 */       if (che1 != null) {
/*  65 */         gi1.a(vj1, che1, ☃.d(che1));
/*     */       }
/*     */     } 
/*  68 */     for (Map.Entry<vj<che>, che> entry : ☃.d()) {
/*  69 */       vj<che> vj1 = entry.getKey();
/*  70 */       if (e.contains(vj1)) {
/*     */         continue;
/*     */       }
/*  73 */       gi1.a(vj1, entry.getValue(), ☃.d(entry.getValue()));
/*     */     } 
/*  75 */     return gi1;
/*     */   }
/*     */   
/*     */   public static boolean a(long ☃, gi<che> gi1) {
/*  79 */     List<Map.Entry<vj<che>, che>> list = Lists.newArrayList(gi1.d());
/*     */     
/*  81 */     if (list.size() != e.size()) {
/*  82 */       return false;
/*     */     }
/*     */     
/*  85 */     Map.Entry<vj<che>, che> entry1 = list.get(0);
/*  86 */     Map.Entry<vj<che>, che> entry2 = list.get(1);
/*  87 */     Map.Entry<vj<che>, che> entry3 = list.get(2);
/*     */     
/*  89 */     if (entry1.getKey() != b || entry2.getKey() != c || entry3.getKey() != d) {
/*  90 */       return false;
/*     */     }
/*     */     
/*  93 */     if (!((che)entry1.getValue()).b().a(chd.i) && ((che)entry1.getValue()).b() != chd.m) {
/*  94 */       return false;
/*     */     }
/*     */     
/*  97 */     if (!((che)entry2.getValue()).b().a(chd.j)) {
/*  98 */       return false;
/*     */     }
/*     */     
/* 101 */     if (!((che)entry3.getValue()).b().a(chd.k)) {
/* 102 */       return false;
/*     */     }
/*     */     
/* 105 */     if (!(((che)entry2.getValue()).c() instanceof cho) || !(((che)entry3.getValue()).c() instanceof cho)) {
/* 106 */       return false;
/*     */     }
/*     */     
/* 109 */     cho cho1 = (cho)((che)entry2.getValue()).c();
/* 110 */     cho cho2 = (cho)((che)entry3.getValue()).c();
/*     */     
/* 112 */     if (!cho1.a(☃, chp.e)) {
/* 113 */       return false;
/*     */     }
/*     */     
/* 116 */     if (!cho2.a(☃, chp.f)) {
/* 117 */       return false;
/*     */     }
/*     */     
/* 120 */     if (!(cho1.d() instanceof bth)) {
/* 121 */       return false;
/*     */     }
/*     */     
/* 124 */     bth bth = (bth)cho1.d();
/* 125 */     if (!bth.b(☃)) {
/* 126 */       return false;
/*     */     }
/*     */     
/* 129 */     if (!(cho2.d() instanceof btk)) {
/* 130 */       return false;
/*     */     }
/*     */     
/* 133 */     btk btk = (btk)cho2.d();
/* 134 */     if (!btk.b(☃)) {
/* 135 */       return false;
/*     */     }
/*     */     
/* 138 */     return true;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\che.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */