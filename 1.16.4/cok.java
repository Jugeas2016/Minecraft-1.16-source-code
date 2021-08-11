/*     */ import com.google.common.collect.ImmutableList;
/*     */ import com.google.common.collect.Lists;
/*     */ import com.mojang.datafixers.kinds.App;
/*     */ import com.mojang.datafixers.kinds.Applicative;
/*     */ import com.mojang.datafixers.util.Function3;
/*     */ import com.mojang.datafixers.util.Pair;
/*     */ import com.mojang.serialization.Codec;
/*     */ import com.mojang.serialization.codecs.RecordCodecBuilder;
/*     */ import it.unimi.dsi.fastutil.objects.ObjectArrays;
/*     */ import java.util.Arrays;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Random;
/*     */ import java.util.function.Function;
/*     */ import java.util.function.Supplier;
/*     */ import java.util.stream.Collectors;
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
/*     */ public class cok
/*     */ {
/*  32 */   private static final Logger c = LogManager.getLogger(); public static final Codec<cok> a;
/*     */   static {
/*  34 */     a = RecordCodecBuilder.create(☃ -> ☃.group((App)vk.a.fieldOf("name").forGetter(cok::b), (App)vk.a.fieldOf("fallback").forGetter(cok::a), (App)Codec.mapPair(coi.e.fieldOf("element"), Codec.INT.fieldOf("weight")).codec().listOf().promotePartial(x.a("Pool element: ", c::error)).fieldOf("elements").forGetter(())).apply((Applicative)☃, cok::new));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private final vk d;
/*     */   
/*     */   private final List<Pair<coi, Integer>> e;
/*     */   
/*  43 */   public static final Codec<Supplier<cok>> b = vf.a(gm.ax, a); private final List<coi> f;
/*     */   private final vk g;
/*     */   
/*  46 */   public enum a implements afs { a("terrain_matching", 
/*     */       
/*  48 */       ImmutableList.of(new csi(chn.a.a, -1))),
/*     */     
/*  50 */     b("rigid", 
/*     */       
/*  52 */       ImmutableList.of());
/*     */ 
/*     */     
/*  55 */     public static final Codec<a> c = afs.a(a::values, a::a); private static final Map<String, a> d;
/*     */     static {
/*  57 */       d = (Map<String, a>)Arrays.<a>stream(values()).collect(Collectors.toMap(a::b, ☃ -> ☃));
/*     */     }
/*     */     private final String e; private final ImmutableList<csy> f;
/*     */     
/*     */     a(String ☃, ImmutableList<csy> immutableList) {
/*  62 */       this.e = ☃;
/*  63 */       this.f = immutableList;
/*     */     }
/*     */     
/*     */     public String b() {
/*  67 */       return this.e;
/*     */     }
/*     */     
/*     */     public static a a(String ☃) {
/*  71 */       return d.get(☃);
/*     */     }
/*     */     
/*     */     public ImmutableList<csy> c() {
/*  75 */       return this.f;
/*     */     }
/*     */ 
/*     */     
/*     */     public String a() {
/*  80 */       return this.e;
/*     */     } }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  88 */   private int h = Integer.MIN_VALUE;
/*     */   
/*     */   public cok(vk ☃, vk vk1, List<Pair<coi, Integer>> list) {
/*  91 */     this.d = ☃;
/*  92 */     this.e = list;
/*  93 */     this.f = Lists.newArrayList();
/*  94 */     for (Pair<coi, Integer> pair : list) {
/*  95 */       coi coi = (coi)pair.getFirst();
/*  96 */       for (int i = 0; i < ((Integer)pair.getSecond()).intValue(); i++) {
/*  97 */         this.f.add(coi);
/*     */       }
/*     */     } 
/*     */     
/* 101 */     this.g = vk1;
/*     */   }
/*     */   
/*     */   public cok(vk ☃, vk vk1, List<Pair<Function<a, ? extends coi>, Integer>> list, a a1) {
/* 105 */     this.d = ☃;
/* 106 */     this.e = Lists.newArrayList();
/* 107 */     this.f = Lists.newArrayList();
/* 108 */     for (Pair<Function<a, ? extends coi>, Integer> pair : list) {
/* 109 */       coi coi = ((Function<a, coi>)pair.getFirst()).apply(a1);
/* 110 */       this.e.add(Pair.of(coi, pair.getSecond()));
/* 111 */       for (int i = 0; i < ((Integer)pair.getSecond()).intValue(); i++) {
/* 112 */         this.f.add(coi);
/*     */       }
/*     */     } 
/*     */     
/* 116 */     this.g = vk1;
/*     */   }
/*     */   
/*     */   public int a(csw ☃) {
/* 120 */     if (this.h == Integer.MIN_VALUE) {
/* 121 */       this.h = this.f.stream().mapToInt(coi1 -> coi1.a(☃, fx.b, bzm.a).e()).max().orElse(0);
/*     */     }
/* 123 */     return this.h;
/*     */   }
/*     */   
/*     */   public vk a() {
/* 127 */     return this.g;
/*     */   }
/*     */   
/*     */   public coi a(Random ☃) {
/* 131 */     return this.f.get(☃.nextInt(this.f.size()));
/*     */   }
/*     */   
/*     */   public List<coi> b(Random ☃) {
/* 135 */     return (List<coi>)ImmutableList.copyOf(ObjectArrays.shuffle(this.f.toArray((Object[])new coi[0]), ☃));
/*     */   }
/*     */   
/*     */   public vk b() {
/* 139 */     return this.d;
/*     */   }
/*     */   
/*     */   public int c() {
/* 143 */     return this.f.size();
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cok.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */