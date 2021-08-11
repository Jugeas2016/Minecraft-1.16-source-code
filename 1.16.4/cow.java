/*     */ import com.google.common.collect.Lists;
/*     */ import com.mojang.datafixers.kinds.App;
/*     */ import com.mojang.datafixers.kinds.Applicative;
/*     */ import com.mojang.datafixers.util.Function3;
/*     */ import com.mojang.serialization.Codec;
/*     */ import com.mojang.serialization.codecs.RecordCodecBuilder;
/*     */ import java.util.List;
/*     */ import java.util.Objects;
/*     */ import java.util.Random;
/*     */ import java.util.Set;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class cow
/*     */   extends cpb
/*     */ {
/*     */   public static final Codec<cow> a;
/*     */   
/*     */   static {
/*  22 */     a = RecordCodecBuilder.create(☃ -> a(☃).apply((Applicative)☃, cow::new));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public cow(int ☃, int i, int j) {
/*  30 */     super(☃, i, j);
/*     */   }
/*     */ 
/*     */   
/*     */   protected cpc<?> a() {
/*  35 */     return cpc.f;
/*     */   }
/*     */ 
/*     */   
/*     */   public List<cnl.b> a(bsb ☃, Random random, int i, fx fx1, Set<fx> set, cra cra1, cmz cmz1) {
/*  40 */     int j = 5;
/*  41 */     int k = i + 2;
/*  42 */     int m = afm.c(k * 0.618D);
/*     */     
/*  44 */     if (!cmz1.e) {
/*  45 */       a(☃, fx1.c());
/*     */     }
/*     */     
/*  48 */     double d = 1.0D;
/*  49 */     int n = Math.min(1, afm.c(1.382D + Math.pow(1.0D * k / 13.0D, 2.0D)));
/*     */     
/*  51 */     int i1 = fx1.v() + m;
/*  52 */     int i2 = k - 5;
/*     */     
/*  54 */     List<a> list = Lists.newArrayList();
/*  55 */     list.add(new a(fx1.b(i2), i1));
/*     */     
/*  57 */     for (; i2 >= 0; i2--) {
/*  58 */       float f = b(k, i2);
/*  59 */       if (f >= 0.0F)
/*     */       {
/*     */ 
/*     */         
/*  63 */         for (int i3 = 0; i3 < n; i3++) {
/*  64 */           double d1 = 1.0D;
/*  65 */           double d2 = 1.0D * f * (random.nextFloat() + 0.328D);
/*  66 */           double d3 = (random.nextFloat() * 2.0F) * Math.PI;
/*     */           
/*  68 */           double d4 = d2 * Math.sin(d3) + 0.5D;
/*  69 */           double d5 = d2 * Math.cos(d3) + 0.5D;
/*     */           
/*  71 */           fx fx2 = fx1.a(d4, (i2 - 1), d5);
/*  72 */           fx fx3 = fx2.b(5);
/*     */ 
/*     */           
/*  75 */           if (a(☃, random, fx2, fx3, false, set, cra1, cmz1)) {
/*     */             
/*  77 */             int i4 = fx1.u() - fx2.u();
/*  78 */             int i5 = fx1.w() - fx2.w();
/*     */             
/*  80 */             double d6 = fx2.v() - Math.sqrt((i4 * i4 + i5 * i5)) * 0.381D;
/*  81 */             int i6 = (d6 > i1) ? i1 : (int)d6;
/*  82 */             fx fx4 = new fx(fx1.u(), i6, fx1.w());
/*     */ 
/*     */             
/*  85 */             if (a(☃, random, fx4, fx2, false, set, cra1, cmz1))
/*     */             {
/*  87 */               list.add(new a(fx2, fx4.v())); } 
/*     */           } 
/*     */         } 
/*     */       }
/*     */     } 
/*  92 */     a(☃, random, fx1, fx1.b(m), true, set, cra1, cmz1);
/*  93 */     a(☃, random, k, fx1, list, set, cra1, cmz1);
/*     */     
/*  95 */     List<cnl.b> list1 = Lists.newArrayList();
/*  96 */     for (a a : list) {
/*  97 */       if (a(k, a.a() - fx1.v())) {
/*  98 */         list1.add(a.a(a));
/*     */       }
/*     */     } 
/* 101 */     return list1;
/*     */   }
/*     */ 
/*     */   
/*     */   private boolean a(bsb ☃, Random random, fx fx1, fx fx2, boolean bool, Set<fx> set, cra cra1, cmz cmz1) {
/* 106 */     if (!bool && Objects.equals(fx1, fx2)) {
/* 107 */       return true;
/*     */     }
/*     */     
/* 110 */     fx fx3 = fx2.b(-fx1.u(), -fx1.v(), -fx1.w());
/*     */     
/* 112 */     int i = a(fx3);
/*     */     
/* 114 */     float f1 = fx3.u() / i;
/* 115 */     float f2 = fx3.v() / i;
/* 116 */     float f3 = fx3.w() / i;
/*     */     
/* 118 */     for (int j = 0; j <= i; j++) {
/* 119 */       fx fx4 = fx1.a((0.5F + j * f1), (0.5F + j * f2), (0.5F + j * f3));
/* 120 */       if (bool) {
/* 121 */         a(☃, fx4, cmz1.b.a(random, fx4).a(bzl.e, a(fx1, fx4)), cra1);
/* 122 */         set.add(fx4.h());
/*     */       
/*     */       }
/* 125 */       else if (!cld.c(☃, fx4)) {
/* 126 */         return false;
/*     */       } 
/*     */     } 
/*     */     
/* 130 */     return true;
/*     */   }
/*     */   
/*     */   private int a(fx ☃) {
/* 134 */     int i = afm.a(☃.u());
/* 135 */     int j = afm.a(☃.v());
/* 136 */     int k = afm.a(☃.w());
/*     */     
/* 138 */     return Math.max(i, Math.max(j, k));
/*     */   }
/*     */   
/*     */   private gc.a a(fx ☃, fx fx1) {
/* 142 */     gc.a a = gc.a.b;
/* 143 */     int i = Math.abs(fx1.u() - ☃.u());
/* 144 */     int j = Math.abs(fx1.w() - ☃.w());
/* 145 */     int k = Math.max(i, j);
/*     */     
/* 147 */     if (k > 0) {
/* 148 */       if (i == k) {
/* 149 */         a = gc.a.a;
/*     */       } else {
/* 151 */         a = gc.a.c;
/*     */       } 
/*     */     }
/* 154 */     return a;
/*     */   }
/*     */   
/*     */   private boolean a(int ☃, int i) {
/* 158 */     return (i >= ☃ * 0.2D);
/*     */   }
/*     */   
/*     */   private void a(bsb ☃, Random random, int i, fx fx1, List<a> list, Set<fx> set, cra cra1, cmz cmz1) {
/* 162 */     for (a a : list) {
/* 163 */       int j = a.a();
/* 164 */       fx fx2 = new fx(fx1.u(), j, fx1.w());
/*     */       
/* 166 */       if (!fx2.equals(a.a(a).a()) && a(i, j - fx1.v())) {
/* 167 */         a(☃, random, fx2, a.a(a).a(), true, set, cra1, cmz1);
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   private float b(int ☃, int i) {
/* 174 */     if (i < ☃ * 0.3F) {
/* 175 */       return -1.0F;
/*     */     }
/*     */     
/* 178 */     float f1 = ☃ / 2.0F;
/* 179 */     float f2 = f1 - i;
/*     */     
/* 181 */     float f3 = afm.c(f1 * f1 - f2 * f2);
/* 182 */     if (f2 == 0.0F) {
/* 183 */       f3 = f1;
/* 184 */     } else if (Math.abs(f2) >= f1) {
/* 185 */       return 0.0F;
/*     */     } 
/*     */     
/* 188 */     return f3 * 0.5F;
/*     */   }
/*     */   
/*     */   static class a {
/*     */     private final cnl.b a;
/*     */     private final int b;
/*     */     
/*     */     public a(fx ☃, int i) {
/* 196 */       this.a = new cnl.b(☃, 0, false);
/* 197 */       this.b = i;
/*     */     }
/*     */     
/*     */     public int a() {
/* 201 */       return this.b;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cow.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */