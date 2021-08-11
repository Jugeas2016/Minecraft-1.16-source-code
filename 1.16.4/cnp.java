/*    */ import com.mojang.datafixers.kinds.App;
/*    */ import com.mojang.datafixers.kinds.Applicative;
/*    */ import com.mojang.datafixers.util.Function3;
/*    */ import com.mojang.serialization.Codec;
/*    */ import com.mojang.serialization.codecs.RecordCodecBuilder;
/*    */ import java.util.Random;
/*    */ import java.util.Set;
/*    */ 
/*    */ public class cnp
/*    */   extends cnl {
/*    */   public static final Codec<cnp> a;
/*    */   private final afw b;
/*    */   
/*    */   static {
/* 15 */     a = RecordCodecBuilder.create(☃ -> b(☃).and((App)afw.a(0, 16, 8).fieldOf("height").forGetter(())).apply((Applicative)☃, cnp::new));
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public cnp(afw ☃, afw afw1, afw afw2) {
/* 22 */     super(☃, afw1);
/* 23 */     this.b = afw2;
/*    */   }
/*    */ 
/*    */   
/*    */   protected cnm<?> a() {
/* 28 */     return cnm.c;
/*    */   }
/*    */ 
/*    */   
/*    */   protected void a(bsb ☃, Random random, cmz cmz1, int i, cnl.b b1, int j, int k, Set<fx> set, int m, cra cra1) {
/* 33 */     int n = 0;
/*    */     
/* 35 */     for (int i1 = m; i1 >= m - j; i1--) {
/* 36 */       a(☃, random, cmz1, b1.a(), n, set, i1, b1.c(), cra1);
/*    */       
/* 38 */       if (n >= 1 && i1 == m - j + 1) {
/* 39 */         n--;
/* 40 */       } else if (n < k + b1.b()) {
/* 41 */         n++;
/*    */       } 
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public int a(Random ☃, int i) {
/* 48 */     return super.a(☃, i) + ☃.nextInt(i + 1);
/*    */   }
/*    */ 
/*    */   
/*    */   public int a(Random ☃, int i, cmz cmz1) {
/* 53 */     return this.b.a(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   protected boolean a(Random ☃, int i, int j, int k, int m, boolean bool) {
/* 58 */     return (i == m && k == m && m > 0);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cnp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */