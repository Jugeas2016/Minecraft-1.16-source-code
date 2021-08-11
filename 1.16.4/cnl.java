/*     */ import com.mojang.datafixers.Products;
/*     */ import com.mojang.datafixers.kinds.App;
/*     */ import com.mojang.serialization.Codec;
/*     */ import com.mojang.serialization.codecs.RecordCodecBuilder;
/*     */ import java.util.Random;
/*     */ import java.util.Set;
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
/*     */ public abstract class cnl
/*     */ {
/*  19 */   public static final Codec<cnl> d = gm.aX.dispatch(cnl::a, cnm::a);
/*     */   
/*     */   protected final afw e;
/*     */   protected final afw f;
/*     */   
/*     */   protected static <P extends cnl> Products.P2<RecordCodecBuilder.Mu<P>, afw, afw> b(RecordCodecBuilder.Instance<P> ☃) {
/*  25 */     return ☃.group(
/*  26 */         (App)afw.a(0, 8, 8).fieldOf("radius").forGetter(☃ -> ☃.e), 
/*  27 */         (App)afw.a(0, 8, 8).fieldOf("offset").forGetter(☃ -> ☃.f));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public cnl(afw ☃, afw afw1) {
/*  36 */     this.e = ☃;
/*  37 */     this.f = afw1;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(bsb ☃, Random random, cmz cmz1, int i, b b1, int j, int k, Set<fx> set, cra cra1) {
/*  43 */     a(☃, random, cmz1, i, b1, j, k, set, a(random), cra1);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int a(Random ☃, int i) {
/*  51 */     return this.e.a(☃);
/*     */   }
/*     */   
/*     */   private int a(Random ☃) {
/*  55 */     return this.f.a(☃);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean b(Random ☃, int i, int j, int k, int m, boolean bool) {
/*     */     int n;
/*     */     int i1;
/*  63 */     if (bool) {
/*  64 */       n = Math.min(Math.abs(i), Math.abs(i - 1));
/*  65 */       i1 = Math.min(Math.abs(k), Math.abs(k - 1));
/*     */     } else {
/*  67 */       n = Math.abs(i);
/*  68 */       i1 = Math.abs(k);
/*     */     } 
/*  70 */     return a(☃, n, j, i1, m, bool);
/*     */   }
/*     */   
/*     */   protected void a(bsb ☃, Random random, cmz cmz1, fx fx1, int i, Set<fx> set, int j, boolean bool, cra cra1) {
/*  74 */     int k = bool ? 1 : 0;
/*  75 */     fx.a a = new fx.a();
/*  76 */     for (int m = -i; m <= i + k; m++) {
/*  77 */       for (int n = -i; n <= i + k; n++) {
/*  78 */         if (!b(random, m, j, n, i, bool)) {
/*     */ 
/*     */           
/*  81 */           a.a(fx1, m, j, n);
/*  82 */           if (cld.e(☃, a)) {
/*  83 */             ☃.a(a, cmz1.c.a(random, a), 19);
/*  84 */             cra1.c(new cra(a, a));
/*  85 */             set.add(a.h());
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */   protected abstract cnm<?> a();
/*     */   protected abstract void a(bsb parambsb, Random paramRandom, cmz paramcmz, int paramInt1, b paramb, int paramInt2, int paramInt3, Set<fx> paramSet, int paramInt4, cra paramcra);
/*     */   public abstract int a(Random paramRandom, int paramInt, cmz paramcmz);
/*     */   protected abstract boolean a(Random paramRandom, int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean);
/*     */   public static final class b { private final fx a;
/*     */     public b(fx ☃, int i, boolean bool) {
/*  97 */       this.a = ☃;
/*  98 */       this.b = i;
/*  99 */       this.c = bool;
/*     */     }
/*     */     private final int b; private final boolean c;
/*     */     public fx a() {
/* 103 */       return this.a;
/*     */     }
/*     */     
/*     */     public int b() {
/* 107 */       return this.b;
/*     */     }
/*     */     
/*     */     public boolean c() {
/* 111 */       return this.c;
/*     */     } }
/*     */ 
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cnl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */