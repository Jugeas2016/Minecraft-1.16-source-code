/*     */ import java.util.Objects;
/*     */ import java.util.Spliterators;
/*     */ import java.util.function.BiPredicate;
/*     */ import java.util.function.Consumer;
/*     */ import javax.annotation.Nullable;
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
/*     */ public class brh
/*     */   extends Spliterators.AbstractSpliterator<ddh>
/*     */ {
/*     */   @Nullable
/*     */   private final aqa a;
/*     */   private final dci b;
/*     */   private final dcs c;
/*     */   private final ga d;
/*     */   private final fx.a e;
/*     */   private final ddh f;
/*     */   private final brg g;
/*     */   private boolean h;
/*     */   private final BiPredicate<ceh, fx> i;
/*     */   
/*     */   public brh(brg ☃, @Nullable aqa aqa1, dci dci1) {
/*  36 */     this(☃, aqa1, dci1, (☃, fx1) -> true);
/*     */   }
/*     */   
/*     */   public brh(brg ☃, @Nullable aqa aqa1, dci dci1, BiPredicate<ceh, fx> biPredicate) {
/*  40 */     super(Long.MAX_VALUE, 1280);
/*  41 */     this.c = (aqa1 == null) ? dcs.a() : dcs.a(aqa1);
/*  42 */     this.e = new fx.a();
/*  43 */     this.f = dde.a(dci1);
/*  44 */     this.g = ☃;
/*  45 */     this.h = (aqa1 != null);
/*  46 */     this.a = aqa1;
/*  47 */     this.b = dci1;
/*  48 */     this.i = biPredicate;
/*     */ 
/*     */     
/*  51 */     int i = afm.c(dci1.a - 1.0E-7D) - 1;
/*  52 */     int j = afm.c(dci1.d + 1.0E-7D) + 1;
/*  53 */     int k = afm.c(dci1.b - 1.0E-7D) - 1;
/*  54 */     int m = afm.c(dci1.e + 1.0E-7D) + 1;
/*  55 */     int n = afm.c(dci1.c - 1.0E-7D) - 1;
/*  56 */     int i1 = afm.c(dci1.f + 1.0E-7D) + 1;
/*  57 */     this.d = new ga(i, k, n, j, m, i1);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean tryAdvance(Consumer<? super ddh> ☃) {
/*  62 */     return ((this.h && b(☃)) || a(☃));
/*     */   }
/*     */   
/*     */   boolean a(Consumer<? super ddh> ☃) {
/*  66 */     while (this.d.a()) {
/*  67 */       int i = this.d.b();
/*  68 */       int j = this.d.c();
/*  69 */       int k = this.d.d();
/*     */       
/*  71 */       int m = this.d.e();
/*     */       
/*  73 */       if (m == 3) {
/*     */         continue;
/*     */       }
/*     */       
/*  77 */       brc brc = a(i, k);
/*     */       
/*  79 */       if (brc == null) {
/*     */         continue;
/*     */       }
/*     */       
/*  83 */       this.e.d(i, j, k);
/*  84 */       ceh ceh = brc.d_(this.e);
/*     */       
/*  86 */       if (!this.i.test(ceh, this.e)) {
/*     */         continue;
/*     */       }
/*     */       
/*  90 */       if (m == 1 && !ceh.d()) {
/*     */         continue;
/*     */       }
/*  93 */       if (m == 2 && !ceh.a(bup.bo)) {
/*     */         continue;
/*     */       }
/*     */       
/*  97 */       ddh ddh1 = ceh.b(this.g, this.e, this.c);
/*     */       
/*  99 */       if (ddh1 == dde.b()) {
/* 100 */         if (this.b.a(i, j, k, i + 1.0D, j + 1.0D, k + 1.0D)) {
/* 101 */           ☃.accept(ddh1.a(i, j, k));
/* 102 */           return true;
/*     */         }  continue;
/*     */       } 
/* 105 */       ddh ddh2 = ddh1.a(i, j, k);
/* 106 */       if (dde.c(ddh2, this.f, dcr.i)) {
/* 107 */         ☃.accept(ddh2);
/* 108 */         return true;
/*     */       } 
/*     */     } 
/*     */     
/* 112 */     return false;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   private brc a(int ☃, int i) {
/* 117 */     int j = ☃ >> 4;
/* 118 */     int k = i >> 4;
/*     */     
/* 120 */     return this.g.c(j, k);
/*     */   }
/*     */   
/*     */   boolean b(Consumer<? super ddh> ☃) {
/* 124 */     Objects.requireNonNull(this.a);
/* 125 */     this.h = false;
/* 126 */     cfu cfu = this.g.f();
/* 127 */     dci dci1 = this.a.cc();
/* 128 */     if (!a(cfu, dci1)) {
/* 129 */       ddh ddh1 = cfu.c();
/* 130 */       if (!b(ddh1, dci1) && a(ddh1, dci1)) {
/* 131 */         ☃.accept(ddh1);
/* 132 */         return true;
/*     */       } 
/*     */     } 
/* 135 */     return false;
/*     */   }
/*     */   
/*     */   private static boolean a(ddh ☃, dci dci1) {
/* 139 */     return dde.c(☃, dde.a(dci1.g(1.0E-7D)), dcr.i);
/*     */   }
/*     */   
/*     */   private static boolean b(ddh ☃, dci dci1) {
/* 143 */     return dde.c(☃, dde.a(dci1.h(1.0E-7D)), dcr.i);
/*     */   }
/*     */   
/*     */   public static boolean a(cfu ☃, dci dci1) {
/* 147 */     double d1 = afm.c(☃.e());
/* 148 */     double d2 = afm.c(☃.f());
/*     */     
/* 150 */     double d3 = afm.f(☃.g());
/* 151 */     double d4 = afm.f(☃.h());
/*     */     
/* 153 */     return (dci1.a > d1 && dci1.a < d3 && dci1.c > d2 && dci1.c < d4 && dci1.d > d1 && dci1.d < d3 && dci1.f > d2 && dci1.f < d4);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\brh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */