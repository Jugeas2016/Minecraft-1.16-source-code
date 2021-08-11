/*    */ import com.mojang.datafixers.kinds.App;
/*    */ import com.mojang.datafixers.kinds.Applicative;
/*    */ import com.mojang.datafixers.util.Function3;
/*    */ import com.mojang.serialization.Codec;
/*    */ import com.mojang.serialization.codecs.RecordCodecBuilder;
/*    */ import java.util.Random;
/*    */ import java.util.Set;
/*    */ 
/*    */ 
/*    */ public class cno
/*    */   extends cnl
/*    */ {
/*    */   public static final Codec<cno> a;
/*    */   private final afw b;
/*    */   
/*    */   static {
/* 17 */     a = RecordCodecBuilder.create(☃ -> b(☃).and((App)afw.a(0, 16, 8).fieldOf("crown_height").forGetter(())).apply((Applicative)☃, cno::new));
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public cno(afw ☃, afw afw1, afw afw2) {
/* 24 */     super(☃, afw1);
/* 25 */     this.b = afw2;
/*    */   }
/*    */ 
/*    */   
/*    */   protected cnm<?> a() {
/* 30 */     return cnm.h;
/*    */   }
/*    */ 
/*    */   
/*    */   protected void a(bsb ☃, Random random, cmz cmz1, int i, cnl.b b1, int j, int k, Set<fx> set, int m, cra cra1) {
/* 35 */     fx fx = b1.a();
/*    */     
/* 37 */     int n = 0;
/* 38 */     for (int i1 = fx.v() - j + m; i1 <= fx.v() + m; i1++) {
/* 39 */       int i4, i2 = fx.v() - i1;
/* 40 */       int i3 = k + b1.b() + afm.d(i2 / j * 3.5F);
/*    */       
/* 42 */       if (i2 > 0 && i3 == n && (i1 & 0x1) == 0) {
/* 43 */         i4 = i3 + 1;
/*    */       } else {
/* 45 */         i4 = i3;
/*    */       } 
/*    */       
/* 48 */       a(☃, random, cmz1, new fx(fx.u(), i1, fx.w()), i4, set, 0, b1.c(), cra1);
/* 49 */       n = i3;
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public int a(Random ☃, int i, cmz cmz1) {
/* 55 */     return this.b.a(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   protected boolean a(Random ☃, int i, int j, int k, int m, boolean bool) {
/* 60 */     if (i + k >= 7) {
/* 61 */       return true;
/*    */     }
/* 63 */     return (i * i + k * k > m * m);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cno.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */