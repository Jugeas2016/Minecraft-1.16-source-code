/*    */ import com.mojang.datafixers.util.Either;
/*    */ import com.mojang.serialization.Codec;
/*    */ import com.mojang.serialization.codecs.RecordCodecBuilder;
/*    */ import java.util.List;
/*    */ import java.util.Random;
/*    */ import java.util.function.Function;
/*    */ import java.util.stream.Collectors;
/*    */ import javax.annotation.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class coi
/*    */ {
/* 28 */   public static final Codec<coi> e = gm.be.dispatch("element_type", coi::a, coj::codec);
/*    */   
/*    */   protected static <E extends coi> RecordCodecBuilder<E, cok.a> d() {
/* 31 */     return cok.a.c.fieldOf("projection").forGetter(coi::e);
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   private volatile cok.a a;
/*    */   
/*    */   protected coi(cok.a ☃) {
/* 38 */     this.a = ☃;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void a(bry ☃, ctb.c c1, fx fx1, bzm bzm1, Random random, cra cra1) {}
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public coi a(cok.a ☃) {
/* 55 */     this.a = ☃;
/* 56 */     return this;
/*    */   }
/*    */   
/*    */   public cok.a e() {
/* 60 */     cok.a ☃ = this.a;
/* 61 */     if (☃ == null) {
/* 62 */       throw new IllegalStateException();
/*    */     }
/* 64 */     return ☃;
/*    */   }
/*    */   
/*    */   public int f() {
/* 68 */     return 1;
/*    */   }
/*    */   
/*    */   public static Function<cok.a, cob> g() {
/* 72 */     return ☃ -> cob.b;
/*    */   }
/*    */   
/*    */   public static Function<cok.a, cof> a(String ☃) {
/* 76 */     return a1 -> new cof(Either.left(new vk(☃)), (), a1);
/*    */   }
/*    */   
/*    */   public static Function<cok.a, cof> a(String ☃, csz csz1) {
/* 80 */     return a1 -> new cof(Either.left(new vk(☃)), (), a1);
/*    */   }
/*    */   
/*    */   public static Function<cok.a, coh> b(String ☃) {
/* 84 */     return a1 -> new coh(Either.left(new vk(☃)), (), a1);
/*    */   }
/*    */   
/*    */   public static Function<cok.a, coh> b(String ☃, csz csz1) {
/* 88 */     return a1 -> new coh(Either.left(new vk(☃)), (), a1);
/*    */   }
/*    */   
/*    */   public static Function<cok.a, coc> a(civ<?, ?> ☃) {
/* 92 */     return a1 -> new coc((), a1);
/*    */   }
/*    */   
/*    */   public static Function<cok.a, cog> a(List<Function<cok.a, ? extends coi>> ☃) {
/* 96 */     return a1 -> new cog((List<coi>)☃.stream().map(()).collect(Collectors.toList()), a1);
/*    */   }
/*    */   
/*    */   public abstract List<ctb.c> a(csw paramcsw, fx paramfx, bzm parambzm, Random paramRandom);
/*    */   
/*    */   public abstract cra a(csw paramcsw, fx paramfx, bzm parambzm);
/*    */   
/*    */   public abstract boolean a(csw paramcsw, bsr parambsr, bsn parambsn, cfy paramcfy, fx paramfx1, fx paramfx2, bzm parambzm, cra paramcra, Random paramRandom, boolean paramBoolean);
/*    */   
/*    */   public abstract coj<?> a();
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\coi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */