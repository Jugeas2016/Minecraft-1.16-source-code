/*    */ import com.google.common.collect.Lists;
/*    */ import com.mojang.datafixers.kinds.App;
/*    */ import com.mojang.datafixers.kinds.Applicative;
/*    */ import com.mojang.serialization.Codec;
/*    */ import com.mojang.serialization.codecs.RecordCodecBuilder;
/*    */ import java.util.List;
/*    */ import java.util.Random;
/*    */ import java.util.function.BiFunction;
/*    */ import java.util.function.Supplier;
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
/*    */ public class coc
/*    */   extends coi
/*    */ {
/*    */   public static final Codec<coc> a;
/*    */   private final Supplier<civ<?, ?>> b;
/*    */   private final md c;
/*    */   
/*    */   static {
/* 28 */     a = RecordCodecBuilder.create(☃ -> ☃.group((App)civ.b.fieldOf("feature").forGetter(()), (App)d()).apply((Applicative)☃, coc::new));
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   protected coc(Supplier<civ<?, ?>> ☃, cok.a a1) {
/* 37 */     super(a1);
/* 38 */     this.b = ☃;
/* 39 */     this.c = b();
/*    */   }
/*    */   
/*    */   private md b() {
/* 43 */     md ☃ = new md();
/* 44 */     ☃.a("name", "minecraft:bottom");
/* 45 */     ☃.a("final_state", "minecraft:air");
/*    */ 
/*    */     
/* 48 */     ☃.a("pool", "minecraft:empty");
/* 49 */     ☃.a("target", "minecraft:empty");
/* 50 */     ☃.a("joint", ccz.a.a.a());
/*    */     
/* 52 */     return ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   public fx a(csw ☃, bzm bzm1) {
/* 57 */     return fx.b;
/*    */   }
/*    */ 
/*    */   
/*    */   public List<ctb.c> a(csw ☃, fx fx1, bzm bzm1, Random random) {
/* 62 */     List<ctb.c> list = Lists.newArrayList();
/* 63 */     list.add(new ctb.c(fx1, bup.mZ.n().a(bxr.a, ge.a(gc.a, gc.d)), this.c));
/* 64 */     return list;
/*    */   }
/*    */ 
/*    */   
/*    */   public cra a(csw ☃, fx fx1, bzm bzm1) {
/* 69 */     fx fx2 = a(☃, bzm1);
/* 70 */     return new cra(fx1.u(), fx1.v(), fx1.w(), fx1.u() + fx2.u(), fx1.v() + fx2.v(), fx1.w() + fx2.w());
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(csw ☃, bsr bsr1, bsn bsn1, cfy cfy1, fx fx1, fx fx2, bzm bzm1, cra cra1, Random random, boolean bool) {
/* 75 */     return ((civ)this.b.get()).a(bsr1, cfy1, random, fx1);
/*    */   }
/*    */ 
/*    */   
/*    */   public coj<?> a() {
/* 80 */     return coj.c;
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 85 */     return "Feature[" + gm.aE.b((cjl<?>)((civ)this.b.get()).b()) + "]";
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\coc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */