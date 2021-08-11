/*    */ import com.google.common.collect.ImmutableMap;
/*    */ import com.google.common.collect.Maps;
/*    */ import com.mojang.datafixers.kinds.App;
/*    */ import com.mojang.datafixers.kinds.Applicative;
/*    */ import com.mojang.serialization.Codec;
/*    */ import com.mojang.serialization.codecs.RecordCodecBuilder;
/*    */ import java.util.Map;
/*    */ import java.util.Optional;
/*    */ import java.util.function.BiFunction;
/*    */ import javax.annotation.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class chv
/*    */ {
/*    */   public static final Codec<chv> a;
/*    */   
/*    */   static {
/* 24 */     a = RecordCodecBuilder.create(☃ -> ☃.group((App)cmx.a.optionalFieldOf("stronghold").forGetter(()), (App)Codec.simpleMap(gm.aG, cmy.a, gm.aG).fieldOf("structures").forGetter(())).apply((Applicative)☃, chv::new));
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 31 */   public static final ImmutableMap<cla<?>, cmy> b = ImmutableMap.builder()
/* 32 */     .put(cla.q, new cmy(32, 8, 10387312))
/* 33 */     .put(cla.f, new cmy(32, 8, 14357617))
/* 34 */     .put(cla.g, new cmy(32, 8, 14357618))
/* 35 */     .put(cla.e, new cmy(32, 8, 14357619))
/* 36 */     .put(cla.j, new cmy(32, 8, 14357620))
/* 37 */     .put(cla.b, new cmy(32, 8, 165745296))
/* 38 */     .put(cla.k, new cmy(1, 0, 0))
/* 39 */     .put(cla.l, new cmy(32, 5, 10387313))
/* 40 */     .put(cla.o, new cmy(20, 11, 10387313))
/* 41 */     .put(cla.d, new cmy(80, 20, 10387319))
/* 42 */     .put(cla.p, new cmy(1, 0, 0))
/* 43 */     .put(cla.c, new cmy(1, 0, 0))
/* 44 */     .put(cla.h, new cmy(40, 15, 34222645))
/* 45 */     .put(cla.i, new cmy(24, 4, 165745295))
/* 46 */     .put(cla.m, new cmy(20, 8, 14357621))
/*    */     
/* 48 */     .put(cla.s, new cmy(27, 4, 30084232))
/* 49 */     .put(cla.n, new cmy(27, 4, 30084232))
/* 50 */     .put(cla.r, new cmy(2, 1, 14357921))
/* 51 */     .build();
/*    */   
/*    */   static {
/* 54 */     for (cla<?> ☃ : gm.aG) {
/* 55 */       if (!b.containsKey(☃)) {
/* 56 */         throw new IllegalStateException("Structure feature without default settings: " + gm.aG.b(☃));
/*    */       }
/*    */     } 
/*    */   }
/*    */   
/* 61 */   public static final cmx c = new cmx(32, 3, 128);
/*    */   
/*    */   private final Map<cla<?>, cmy> d;
/*    */   
/*    */   @Nullable
/*    */   private final cmx e;
/*    */   
/*    */   public chv(Optional<cmx> ☃, Map<cla<?>, cmy> map) {
/* 69 */     this.e = ☃.orElse(null);
/* 70 */     this.d = map;
/*    */   }
/*    */   
/*    */   public chv(boolean ☃) {
/* 74 */     this.d = Maps.newHashMap((Map)b);
/* 75 */     this.e = ☃ ? c : null;
/*    */   }
/*    */   
/*    */   public Map<cla<?>, cmy> a() {
/* 79 */     return this.d;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public cmy a(cla<?> ☃) {
/* 84 */     return this.d.get(☃);
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public cmx b() {
/* 89 */     return this.e;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\chv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */