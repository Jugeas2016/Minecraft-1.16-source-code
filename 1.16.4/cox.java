/*    */ import com.google.common.collect.Lists;
/*    */ import com.mojang.datafixers.kinds.App;
/*    */ import com.mojang.datafixers.kinds.Applicative;
/*    */ import com.mojang.datafixers.util.Function3;
/*    */ import com.mojang.serialization.Codec;
/*    */ import com.mojang.serialization.codecs.RecordCodecBuilder;
/*    */ import java.util.List;
/*    */ import java.util.Random;
/*    */ import java.util.Set;
/*    */ 
/*    */ 
/*    */ public class cox
/*    */   extends cpb
/*    */ {
/*    */   public static final Codec<cox> a;
/*    */   
/*    */   static {
/* 18 */     a = RecordCodecBuilder.create(☃ -> a(☃).apply((Applicative)☃, cox::new));
/*    */   }
/*    */   public cox(int ☃, int i, int j) {
/* 21 */     super(☃, i, j);
/*    */   }
/*    */ 
/*    */   
/*    */   protected cpc<?> a() {
/* 26 */     return cpc.b;
/*    */   }
/*    */ 
/*    */   
/*    */   public List<cnl.b> a(bsb ☃, Random random, int i, fx fx1, Set<fx> set, cra cra1, cmz cmz1) {
/* 31 */     a(☃, fx1.c());
/*    */     
/* 33 */     List<cnl.b> list = Lists.newArrayList();
/*    */     
/* 35 */     gc gc1 = gc.c.a.a(random);
/* 36 */     int j = i - random.nextInt(4) - 1;
/* 37 */     int k = 3 - random.nextInt(3);
/*    */     
/* 39 */     fx.a a = new fx.a();
/* 40 */     int m = fx1.u();
/* 41 */     int n = fx1.w();
/* 42 */     int i1 = 0;
/* 43 */     for (int i2 = 0; i2 < i; i2++) {
/* 44 */       int i3 = fx1.v() + i2;
/* 45 */       if (i2 >= j && k > 0) {
/* 46 */         m += gc1.i();
/* 47 */         n += gc1.k();
/* 48 */         k--;
/*    */       } 
/* 50 */       if (a(☃, random, a.d(m, i3, n), set, cra1, cmz1)) {
/* 51 */         i1 = i3 + 1;
/*    */       }
/*    */     } 
/* 54 */     list.add(new cnl.b(new fx(m, i1, n), 1, false));
/*    */     
/* 56 */     m = fx1.u();
/* 57 */     n = fx1.w();
/* 58 */     gc gc2 = gc.c.a.a(random);
/* 59 */     if (gc2 != gc1) {
/* 60 */       int i3 = j - random.nextInt(2) - 1;
/* 61 */       int i4 = 1 + random.nextInt(3);
/*    */       
/* 63 */       i1 = 0;
/* 64 */       for (int i5 = i3; i5 < i && i4 > 0; i5++, i4--) {
/* 65 */         if (i5 >= 1) {
/*    */ 
/*    */           
/* 68 */           int i6 = fx1.v() + i5;
/* 69 */           m += gc2.i();
/* 70 */           n += gc2.k();
/* 71 */           if (a(☃, random, a.d(m, i6, n), set, cra1, cmz1))
/* 72 */             i1 = i6 + 1; 
/*    */         } 
/*    */       } 
/* 75 */       if (i1 > 1) {
/* 76 */         list.add(new cnl.b(new fx(m, i1, n), 0, false));
/*    */       }
/*    */     } 
/*    */     
/* 80 */     return list;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cox.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */