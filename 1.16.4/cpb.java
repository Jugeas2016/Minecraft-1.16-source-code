/*    */ import com.mojang.datafixers.Products;
/*    */ import com.mojang.datafixers.kinds.App;
/*    */ import com.mojang.serialization.Codec;
/*    */ import com.mojang.serialization.codecs.RecordCodecBuilder;
/*    */ import java.util.List;
/*    */ import java.util.Random;
/*    */ import java.util.Set;
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
/*    */ public abstract class cpb
/*    */ {
/* 25 */   public static final Codec<cpb> c = gm.aY.dispatch(cpb::a, cpc::a);
/*    */   
/*    */   protected final int d;
/*    */   protected final int e;
/*    */   protected final int f;
/*    */   
/*    */   protected static <P extends cpb> Products.P3<RecordCodecBuilder.Mu<P>, Integer, Integer, Integer> a(RecordCodecBuilder.Instance<P> ☃) {
/* 32 */     return ☃.group(
/* 33 */         (App)Codec.intRange(0, 32).fieldOf("base_height").forGetter(☃ -> Integer.valueOf(☃.d)), 
/* 34 */         (App)Codec.intRange(0, 24).fieldOf("height_rand_a").forGetter(☃ -> Integer.valueOf(☃.e)), 
/* 35 */         (App)Codec.intRange(0, 24).fieldOf("height_rand_b").forGetter(☃ -> Integer.valueOf(☃.f)));
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public cpb(int ☃, int i, int j) {
/* 43 */     this.d = ☃;
/* 44 */     this.e = i;
/* 45 */     this.f = j;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public int a(Random ☃) {
/* 53 */     return this.d + ☃.nextInt(this.e + 1) + ☃.nextInt(this.f + 1);
/*    */   }
/*    */   
/*    */   protected static void a(bse ☃, fx fx1, ceh ceh1, cra cra1) {
/* 57 */     cld.b(☃, fx1, ceh1);
/* 58 */     cra1.c(new cra(fx1, fx1));
/*    */   }
/*    */   
/*    */   private static boolean a(bsc ☃, fx fx1) {
/* 62 */     return ☃.a(fx1, ☃ -> {
/*    */           buo buo = ☃.b();
/* 64 */           return (cjl.b(buo) && !☃.a(bup.i) && !☃.a(bup.dT));
/*    */         });
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   protected static void a(bsb ☃, fx fx1) {
/* 71 */     if (!a(☃, fx1)) {
/* 72 */       cld.b(☃, fx1, bup.j.n());
/*    */     }
/*    */   }
/*    */   
/*    */   protected static boolean a(bsb ☃, Random random, fx fx1, Set<fx> set, cra cra1, cmz cmz1) {
/* 77 */     if (cld.e(☃, fx1)) {
/* 78 */       a(☃, fx1, cmz1.b.a(random, fx1), cra1);
/* 79 */       set.add(fx1.h());
/* 80 */       return true;
/*    */     } 
/* 82 */     return false;
/*    */   }
/*    */   
/*    */   protected static void a(bsb ☃, Random random, fx.a a1, Set<fx> set, cra cra1, cmz cmz1) {
/* 86 */     if (cld.c(☃, a1))
/* 87 */       a(☃, random, a1, set, cra1, cmz1); 
/*    */   }
/*    */   
/*    */   protected abstract cpc<?> a();
/*    */   
/*    */   public abstract List<cnl.b> a(bsb parambsb, Random paramRandom, int paramInt, fx paramfx, Set<fx> paramSet, cra paramcra, cmz paramcmz);
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cpb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */