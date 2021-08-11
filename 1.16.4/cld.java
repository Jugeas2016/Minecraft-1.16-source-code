/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.collect.Sets;
/*     */ import com.mojang.serialization.Codec;
/*     */ import java.util.Comparator;
/*     */ import java.util.List;
/*     */ import java.util.OptionalInt;
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
/*     */ public class cld
/*     */   extends cjl<cmz>
/*     */ {
/*     */   public cld(Codec<cmz> ☃) {
/*  39 */     super(☃);
/*     */   }
/*     */   
/*     */   public static boolean c(bsc ☃, fx fx1) {
/*  43 */     return (e(☃, fx1) || ☃.a(fx1, ☃ -> ☃.a(aed.s)));
/*     */   }
/*     */   
/*     */   private static boolean f(bsc ☃, fx fx1) {
/*  47 */     return ☃.a(fx1, ☃ -> ☃.a(bup.dP));
/*     */   }
/*     */   
/*     */   private static boolean g(bsc ☃, fx fx1) {
/*  51 */     return ☃.a(fx1, ☃ -> ☃.a(bup.A));
/*     */   }
/*     */   
/*     */   public static boolean d(bsc ☃, fx fx1) {
/*  55 */     return ☃.a(fx1, ☃ -> (☃.g() || ☃.a(aed.I)));
/*     */   }
/*     */   
/*     */   private static boolean h(bsc ☃, fx fx1) {
/*  59 */     return ☃.a(fx1, ☃ -> {
/*     */           buo buo = ☃.b();
/*  61 */           return (b(buo) || buo == bup.bX);
/*     */         });
/*     */   }
/*     */   
/*     */   private static boolean i(bsc ☃, fx fx1) {
/*  66 */     return ☃.a(fx1, ☃ -> {
/*     */           cva cva = ☃.c();
/*     */           return (cva == cva.g);
/*     */         });
/*     */   }
/*     */   
/*     */   public static void b(bse ☃, fx fx1, ceh ceh1) {
/*  73 */     ☃.a(fx1, ceh1, 19);
/*     */   }
/*     */   
/*     */   public static boolean e(bsc ☃, fx fx1) {
/*  77 */     return (d(☃, fx1) || i(☃, fx1) || g(☃, fx1));
/*     */   }
/*     */   private boolean a(bsb ☃, Random random, fx fx1, Set<fx> set1, Set<fx> set2, cra cra1, cmz cmz1) {
/*     */     fx fx2;
/*  81 */     int i = cmz1.g.a(random);
/*  82 */     int j = cmz1.f.a(random, i, cmz1);
/*  83 */     int k = i - j;
/*     */     
/*  85 */     int m = cmz1.f.a(random, k);
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  90 */     if (!cmz1.e) {
/*  91 */       int i3, i1 = ☃.a(chn.a.d, fx1).v();
/*  92 */       int i2 = ☃.a(chn.a.b, fx1).v();
/*     */       
/*  94 */       if (i2 - i1 > cmz1.i) {
/*  95 */         return false;
/*     */       }
/*     */ 
/*     */       
/*  99 */       if (cmz1.l == chn.a.d) {
/* 100 */         i3 = i1;
/* 101 */       } else if (cmz1.l == chn.a.b) {
/* 102 */         i3 = i2;
/*     */       } else {
/* 104 */         i3 = ☃.a(cmz1.l, fx1).v();
/*     */       } 
/*     */       
/* 107 */       fx2 = new fx(fx1.u(), i3, fx1.w());
/*     */     } else {
/* 109 */       fx2 = fx1;
/*     */     } 
/*     */     
/* 112 */     if (fx2.v() < 1 || fx2.v() + i + 1 > 256) {
/* 113 */       return false;
/*     */     }
/*     */     
/* 116 */     if (!h(☃, fx2.c())) {
/* 117 */       return false;
/*     */     }
/*     */     
/* 120 */     OptionalInt optionalInt = cmz1.h.c();
/*     */     
/* 122 */     int n = a(☃, i, fx2, cmz1);
/* 123 */     if (n < i && (!optionalInt.isPresent() || n < optionalInt.getAsInt())) {
/* 124 */       return false;
/*     */     }
/*     */     
/* 127 */     List<cnl.b> list = cmz1.g.a(☃, random, n, fx2, set1, cra1, cmz1);
/* 128 */     list.forEach(b1 -> ☃.f.a(bsb1, random, ☃, i, b1, j, k, set, cra1));
/*     */ 
/*     */     
/* 131 */     return true;
/*     */   }
/*     */   
/*     */   private int a(bsc ☃, int i, fx fx1, cmz cmz1) {
/* 135 */     fx.a a = new fx.a();
/*     */     
/* 137 */     for (int j = 0; j <= i + 1; j++) {
/* 138 */       int k = cmz1.h.a(i, j);
/* 139 */       for (int m = -k; m <= k; m++) {
/* 140 */         for (int n = -k; n <= k; n++) {
/* 141 */           a.a(fx1, m, j, n);
/* 142 */           if (!c(☃, a) || (!cmz1.j && f(☃, a))) {
/* 143 */             return j - 2;
/*     */           }
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 149 */     return i;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(bse ☃, fx fx1, ceh ceh1) {
/* 154 */     b(☃, fx1, ceh1);
/*     */   }
/*     */ 
/*     */   
/*     */   public final boolean a(bsr ☃, cfy cfy1, Random random, fx fx1, cmz cmz1) {
/* 159 */     Set<fx> set1 = Sets.newHashSet();
/* 160 */     Set<fx> set2 = Sets.newHashSet();
/* 161 */     Set<fx> set3 = Sets.newHashSet();
/* 162 */     cra cra = cra.a();
/* 163 */     boolean bool = a(☃, random, fx1, set1, set2, cra, cmz1);
/*     */     
/* 165 */     if (cra.a > cra.d || !bool || set1.isEmpty()) {
/* 166 */       return false;
/*     */     }
/*     */     
/* 169 */     if (!cmz1.d.isEmpty()) {
/*     */       
/* 171 */       List<fx> list1 = Lists.newArrayList(set1);
/* 172 */       List<fx> list2 = Lists.newArrayList(set2);
/* 173 */       list1.sort(Comparator.comparingInt(gr::v));
/* 174 */       list2.sort(Comparator.comparingInt(gr::v));
/* 175 */       cmz1.d.forEach(cor1 -> cor1.a(☃, random, list1, list2, set, cra1));
/*     */     } 
/*     */     
/* 178 */     dcw dcw = a(☃, cra, set1, set3);
/* 179 */     ctb.a(☃, 3, dcw, cra.a, cra.b, cra.c);
/*     */     
/* 181 */     return true;
/*     */   }
/*     */   
/*     */   private dcw a(bry ☃, cra cra1, Set<fx> set1, Set<fx> set2) {
/* 185 */     List<Set<fx>> list = Lists.newArrayList();
/* 186 */     dcw dcw = new dcq(cra1.d(), cra1.e(), cra1.f());
/* 187 */     int i = 6;
/* 188 */     for (int j = 0; j < 6; j++) {
/* 189 */       list.add(Sets.newHashSet());
/*     */     }
/*     */     
/* 192 */     fx.a a = new fx.a();
/* 193 */     for (fx fx : Lists.newArrayList(set2)) {
/* 194 */       if (cra1.b(fx)) {
/* 195 */         dcw.a(fx.u() - cra1.a, fx.v() - cra1.b, fx.w() - cra1.c, true, true);
/*     */       }
/*     */     } 
/*     */     
/* 199 */     for (fx fx : Lists.newArrayList(set1)) {
/* 200 */       if (cra1.b(fx)) {
/* 201 */         dcw.a(fx.u() - cra1.a, fx.v() - cra1.b, fx.w() - cra1.c, true, true);
/*     */       }
/* 203 */       for (gc gc : gc.values()) {
/* 204 */         a.a(fx, gc);
/* 205 */         if (!set1.contains(a)) {
/* 206 */           ceh ceh = ☃.d_(a);
/* 207 */           if (ceh.b(cex.an)) {
/* 208 */             ((Set<fx>)list.get(0)).add(a.h());
/* 209 */             b(☃, a, ceh.a(cex.an, Integer.valueOf(1)));
/* 210 */             if (cra1.b(a)) {
/* 211 */               dcw.a(a.u() - cra1.a, a.v() - cra1.b, a.w() - cra1.c, true, true);
/*     */             }
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/* 217 */     for (int k = 1; k < 6; k++) {
/* 218 */       Set<fx> set3 = list.get(k - 1);
/* 219 */       Set<fx> set4 = list.get(k);
/* 220 */       for (fx fx : set3) {
/* 221 */         if (cra1.b(fx)) {
/* 222 */           dcw.a(fx.u() - cra1.a, fx.v() - cra1.b, fx.w() - cra1.c, true, true);
/*     */         }
/* 224 */         for (gc gc : gc.values()) {
/* 225 */           a.a(fx, gc);
/* 226 */           if (!set3.contains(a) && !set4.contains(a)) {
/*     */ 
/*     */             
/* 229 */             ceh ceh = ☃.d_(a);
/* 230 */             if (ceh.b(cex.an)) {
/*     */ 
/*     */               
/* 233 */               int m = ((Integer)ceh.c(cex.an)).intValue();
/* 234 */               if (m > k + 1)
/* 235 */               { ceh ceh1 = ceh.a(cex.an, Integer.valueOf(k + 1));
/* 236 */                 b(☃, a, ceh1);
/* 237 */                 if (cra1.b(a)) {
/* 238 */                   dcw.a(a.u() - cra1.a, a.v() - cra1.b, a.w() - cra1.c, true, true);
/*     */                 }
/* 240 */                 set4.add(a.h()); } 
/*     */             } 
/*     */           } 
/*     */         } 
/*     */       } 
/* 245 */     }  return dcw;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cld.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */