/*     */ import com.google.common.collect.UnmodifiableIterator;
/*     */ import it.unimi.dsi.fastutil.objects.Object2IntMap;
/*     */ import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
/*     */ import java.util.Map;
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
/*     */ public class bvt
/*     */   extends buo
/*     */   implements bzu
/*     */ {
/*  22 */   public static final cey a = bys.a;
/*  23 */   public static final cey b = bys.b;
/*  24 */   public static final cey c = bys.c;
/*  25 */   public static final cey d = bys.d; protected static final Map<gc, cey> f;
/*  26 */   public static final cey e = cex.C; static {
/*  27 */     f = (Map<gc, cey>)bys.g.entrySet().stream().filter(☃ -> ((gc)☃.getKey()).n().d()).collect(x.a());
/*     */   }
/*     */   protected final ddh[] g;
/*     */   protected final ddh[] h;
/*  31 */   private final Object2IntMap<ceh> i = (Object2IntMap<ceh>)new Object2IntOpenHashMap();
/*     */   
/*     */   protected bvt(float ☃, float f1, float f2, float f3, float f4, ceg.c c1) {
/*  34 */     super(c1);
/*     */     
/*  36 */     this.g = a(☃, f1, f4, 0.0F, f4);
/*  37 */     this.h = a(☃, f1, f2, 0.0F, f3);
/*     */     
/*  39 */     for (UnmodifiableIterator<ceh> unmodifiableIterator = this.n.a().iterator(); unmodifiableIterator.hasNext(); ) { ceh ceh = unmodifiableIterator.next();
/*  40 */       g(ceh); }
/*     */   
/*     */   }
/*     */   
/*     */   protected ddh[] a(float ☃, float f1, float f2, float f3, float f4) {
/*  45 */     float f5 = 8.0F - ☃;
/*  46 */     float f6 = 8.0F + ☃;
/*     */     
/*  48 */     float f7 = 8.0F - f1;
/*  49 */     float f8 = 8.0F + f1;
/*     */     
/*  51 */     ddh ddh1 = buo.a(f5, 0.0D, f5, f6, f2, f6);
/*  52 */     ddh ddh2 = buo.a(f7, f3, 0.0D, f8, f4, f8);
/*  53 */     ddh ddh3 = buo.a(f7, f3, f7, f8, f4, 16.0D);
/*  54 */     ddh ddh4 = buo.a(0.0D, f3, f7, f8, f4, f8);
/*  55 */     ddh ddh5 = buo.a(f7, f3, f7, 16.0D, f4, f8);
/*     */     
/*  57 */     ddh ddh6 = dde.a(ddh2, ddh5);
/*  58 */     ddh ddh7 = dde.a(ddh3, ddh4);
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
/*     */ 
/*     */     
/*  76 */     ddh[] arrayOfDdh = { dde.a(), ddh3, ddh4, ddh7, ddh2, dde.a(ddh3, ddh2), dde.a(ddh4, ddh2), dde.a(ddh7, ddh2), ddh5, dde.a(ddh3, ddh5), dde.a(ddh4, ddh5), dde.a(ddh7, ddh5), ddh6, dde.a(ddh3, ddh6), dde.a(ddh4, ddh6), dde.a(ddh7, ddh6) };
/*     */     
/*  78 */     for (int i = 0; i < 16; i++) {
/*  79 */       arrayOfDdh[i] = dde.a(ddh1, arrayOfDdh[i]);
/*     */     }
/*  81 */     return arrayOfDdh;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean b(ceh ☃, brc brc1, fx fx1) {
/*  86 */     return !((Boolean)☃.c(e)).booleanValue();
/*     */   }
/*     */ 
/*     */   
/*     */   public ddh b(ceh ☃, brc brc1, fx fx1, dcs dcs1) {
/*  91 */     return this.h[g(☃)];
/*     */   }
/*     */ 
/*     */   
/*     */   public ddh c(ceh ☃, brc brc1, fx fx1, dcs dcs1) {
/*  96 */     return this.g[g(☃)];
/*     */   }
/*     */   
/*     */   private static int a(gc ☃) {
/* 100 */     return 1 << ☃.d();
/*     */   }
/*     */   
/*     */   protected int g(ceh ☃) {
/* 104 */     return this.i.computeIntIfAbsent(☃, ☃ -> {
/*     */           int i = 0;
/*     */           if (((Boolean)☃.c(a)).booleanValue()) {
/*     */             i |= a(gc.c);
/*     */           }
/*     */           if (((Boolean)☃.c(b)).booleanValue()) {
/*     */             i |= a(gc.f);
/*     */           }
/*     */           if (((Boolean)☃.c(c)).booleanValue()) {
/*     */             i |= a(gc.d);
/*     */           }
/*     */           if (((Boolean)☃.c(d)).booleanValue()) {
/*     */             i |= a(gc.e);
/*     */           }
/*     */           return i;
/*     */         });
/*     */   }
/*     */ 
/*     */   
/*     */   public cux d(ceh ☃) {
/* 124 */     if (((Boolean)☃.c(e)).booleanValue()) {
/* 125 */       return cuy.c.a(false);
/*     */     }
/* 127 */     return super.d(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(ceh ☃, brc brc1, fx fx1, cxe cxe1) {
/* 132 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public ceh a(ceh ☃, bzm bzm1) {
/* 137 */     switch (null.a[bzm1.ordinal()]) {
/*     */       case 1:
/* 139 */         return ☃.a(a, ☃.c(c)).a(b, ☃.c(d)).a(c, ☃.c(a)).a(d, ☃.c(b));
/*     */       case 2:
/* 141 */         return ☃.a(a, ☃.c(b)).a(b, ☃.c(c)).a(c, ☃.c(d)).a(d, ☃.c(a));
/*     */       case 3:
/* 143 */         return ☃.a(a, ☃.c(d)).a(b, ☃.c(a)).a(c, ☃.c(b)).a(d, ☃.c(c));
/*     */     } 
/* 145 */     return ☃;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public ceh a(ceh ☃, byg byg1) {
/* 151 */     switch (null.b[byg1.ordinal()]) {
/*     */       case 1:
/* 153 */         return ☃.a(a, ☃.c(c)).a(c, ☃.c(a));
/*     */       case 2:
/* 155 */         return ☃.a(b, ☃.c(d)).a(d, ☃.c(b));
/*     */     } 
/*     */ 
/*     */     
/* 159 */     return super.a(☃, byg1);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bvt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */