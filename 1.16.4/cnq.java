/*    */ import com.mojang.datafixers.kinds.App;
/*    */ import com.mojang.datafixers.kinds.Applicative;
/*    */ import com.mojang.datafixers.util.Function3;
/*    */ import com.mojang.serialization.Codec;
/*    */ import com.mojang.serialization.codecs.RecordCodecBuilder;
/*    */ import java.util.Random;
/*    */ import java.util.Set;
/*    */ 
/*    */ public class cnq
/*    */   extends cnl {
/*    */   public static final Codec<cnq> a;
/*    */   private final afw b;
/*    */   
/*    */   static {
/* 15 */     a = RecordCodecBuilder.create(☃ -> b(☃).and((App)afw.a(0, 16, 8).fieldOf("trunk_height").forGetter(())).apply((Applicative)☃, cnq::new));
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public cnq(afw ☃, afw afw1, afw afw2) {
/* 22 */     super(☃, afw1);
/* 23 */     this.b = afw2;
/*    */   }
/*    */ 
/*    */   
/*    */   protected cnm<?> a() {
/* 28 */     return cnm.b;
/*    */   }
/*    */ 
/*    */   
/*    */   protected void a(bsb ☃, Random random, cmz cmz1, int i, cnl.b b1, int j, int k, Set<fx> set, int m, cra cra1) {
/* 33 */     fx fx = b1.a();
/*    */     
/* 35 */     int n = random.nextInt(2);
/* 36 */     int i1 = 1;
/* 37 */     int i2 = 0;
/*    */     
/* 39 */     for (int i3 = m; i3 >= -j; i3--) {
/* 40 */       a(☃, random, cmz1, fx, n, set, i3, b1.c(), cra1);
/*    */       
/* 42 */       if (n >= i1) {
/* 43 */         n = i2;
/* 44 */         i2 = 1;
/* 45 */         i1 = Math.min(i1 + 1, k + b1.b());
/*    */       } else {
/* 47 */         n++;
/*    */       } 
/*    */     } 
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public int a(Random ☃, int i, cmz cmz1) {
/* 55 */     return Math.max(4, i - this.b.a(☃));
/*    */   }
/*    */ 
/*    */   
/*    */   protected boolean a(Random ☃, int i, int j, int k, int m, boolean bool) {
/* 60 */     return (i == m && k == m && m > 0);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cnq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */