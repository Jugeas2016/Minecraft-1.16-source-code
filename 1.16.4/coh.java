/*     */ import com.google.common.collect.Lists;
/*     */ import com.mojang.datafixers.kinds.App;
/*     */ import com.mojang.datafixers.kinds.Applicative;
/*     */ import com.mojang.datafixers.util.Either;
/*     */ import com.mojang.datafixers.util.Function3;
/*     */ import com.mojang.serialization.Codec;
/*     */ import com.mojang.serialization.DataResult;
/*     */ import com.mojang.serialization.DynamicOps;
/*     */ import com.mojang.serialization.codecs.RecordCodecBuilder;
/*     */ import java.util.Collections;
/*     */ import java.util.List;
/*     */ import java.util.Optional;
/*     */ import java.util.Random;
/*     */ import java.util.function.Function;
/*     */ import java.util.function.Supplier;
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
/*     */ public class coh
/*     */   extends coi
/*     */ {
/*     */   private static <T> DataResult<T> a(Either<vk, ctb> ☃, DynamicOps<T> dynamicOps, T t) {
/*  37 */     Optional<vk> optional = ☃.left();
/*  38 */     if (!optional.isPresent()) {
/*  39 */       return DataResult.error("Can not serialize a runtime pool element");
/*     */     }
/*  41 */     return vk.a.encode(optional.get(), dynamicOps, t);
/*     */   }
/*     */   
/*  44 */   private static final Codec<Either<vk, ctb>> a = Codec.of(coh::a, vk.a
/*     */       
/*  46 */       .map(Either::left));
/*     */   
/*     */   static {
/*  49 */     b = RecordCodecBuilder.create(☃ -> ☃.group((App)c(), (App)b(), (App)d()).apply((Applicative)☃, coh::new));
/*     */   }
/*     */   public static final Codec<coh> b;
/*     */   protected final Either<vk, ctb> c;
/*     */   protected final Supplier<csz> d;
/*     */   
/*     */   protected static <E extends coh> RecordCodecBuilder<E, Supplier<csz>> b() {
/*  56 */     return cta.m.fieldOf("processors").forGetter(☃ -> ☃.d);
/*     */   }
/*     */   
/*     */   protected static <E extends coh> RecordCodecBuilder<E, Either<vk, ctb>> c() {
/*  60 */     return a.fieldOf("location").forGetter(☃ -> ☃.c);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected coh(Either<vk, ctb> ☃, Supplier<csz> supplier, cok.a a1) {
/*  67 */     super(a1);
/*  68 */     this.c = ☃;
/*  69 */     this.d = supplier;
/*     */   }
/*     */   
/*     */   public coh(ctb ☃) {
/*  73 */     this(Either.right(☃), () -> kl.a, cok.a.b);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private ctb a(csw ☃) {
/*  83 */     return (ctb)this.c.map(☃::a, Function.identity());
/*     */   }
/*     */   
/*     */   public List<ctb.c> a(csw ☃, fx fx1, bzm bzm1, boolean bool) {
/*  87 */     ctb ctb = a(☃);
/*  88 */     List<ctb.c> list1 = ctb.a(fx1, (new csx()).a(bzm1), bup.mY, bool);
/*  89 */     List<ctb.c> list2 = Lists.newArrayList();
/*  90 */     for (ctb.c c : list1) {
/*  91 */       if (c.c == null) {
/*     */         continue;
/*     */       }
/*     */       
/*  95 */       cfo cfo = cfo.valueOf(c.c.l("mode"));
/*  96 */       if (cfo != cfo.d) {
/*     */         continue;
/*     */       }
/*     */       
/* 100 */       list2.add(c);
/*     */     } 
/*     */     
/* 103 */     return list2;
/*     */   }
/*     */ 
/*     */   
/*     */   public List<ctb.c> a(csw ☃, fx fx1, bzm bzm1, Random random) {
/* 108 */     ctb ctb = a(☃);
/* 109 */     List<ctb.c> list = ctb.a(fx1, (new csx()).a(bzm1), bup.mZ, true);
/* 110 */     Collections.shuffle(list, random);
/* 111 */     return list;
/*     */   }
/*     */ 
/*     */   
/*     */   public cra a(csw ☃, fx fx1, bzm bzm1) {
/* 116 */     ctb ctb = a(☃);
/* 117 */     return ctb.b((new csx()).a(bzm1), fx1);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(csw ☃, bsr bsr1, bsn bsn1, cfy cfy1, fx fx1, fx fx2, bzm bzm1, cra cra1, Random random, boolean bool) {
/* 122 */     ctb ctb = a(☃);
/* 123 */     csx csx = a(bzm1, cra1, bool);
/*     */     
/* 125 */     if (ctb.a(bsr1, fx1, fx2, csx, random, 18)) {
/* 126 */       List<ctb.c> list = ctb.a(bsr1, fx1, fx2, csx, a(☃, fx1, bzm1, false));
/* 127 */       for (ctb.c c : list) {
/* 128 */         a(bsr1, c, fx1, bzm1, random, cra1);
/*     */       }
/*     */       
/* 131 */       return true;
/*     */     } 
/* 133 */     return false;
/*     */   }
/*     */   
/*     */   protected csx a(bzm ☃, cra cra1, boolean bool) {
/* 137 */     csx csx = new csx();
/* 138 */     csx.a(cra1);
/* 139 */     csx.a(☃);
/* 140 */     csx.c(true);
/* 141 */     csx.a(false);
/* 142 */     csx.a(cse.b);
/* 143 */     csx.d(true);
/* 144 */     if (!bool) {
/* 145 */       csx.a(csj.b);
/*     */     }
/* 147 */     ((csz)this.d.get()).a().forEach(csx::a);
/* 148 */     e().c().forEach(csx::a);
/* 149 */     return csx;
/*     */   }
/*     */ 
/*     */   
/*     */   public coj<?> a() {
/* 154 */     return coj.a;
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/* 159 */     return "Single[" + this.c + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\coh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */