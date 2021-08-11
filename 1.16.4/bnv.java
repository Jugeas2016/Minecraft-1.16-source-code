/*     */ import com.google.common.collect.Lists;
/*     */ import com.mojang.datafixers.util.Pair;
/*     */ import java.util.Collection;
/*     */ import java.util.List;
/*     */ import java.util.Map;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class bnv
/*     */ {
/*  33 */   private static final nx a = (new of("effect.none")).a(k.h);
/*     */   
/*     */   public static List<apu> a(bmb ☃) {
/*  36 */     return a(☃.o());
/*     */   }
/*     */   
/*     */   public static List<apu> a(bnt ☃, Collection<apu> collection) {
/*  40 */     List<apu> list = Lists.newArrayList();
/*     */     
/*  42 */     list.addAll(☃.a());
/*  43 */     list.addAll(collection);
/*     */     
/*  45 */     return list;
/*     */   }
/*     */   
/*     */   public static List<apu> a(@Nullable md ☃) {
/*  49 */     List<apu> list = Lists.newArrayList();
/*     */     
/*  51 */     list.addAll(c(☃).a());
/*  52 */     a(☃, list);
/*     */     
/*  54 */     return list;
/*     */   }
/*     */   
/*     */   public static List<apu> b(bmb ☃) {
/*  58 */     return b(☃.o());
/*     */   }
/*     */   
/*     */   public static List<apu> b(@Nullable md ☃) {
/*  62 */     List<apu> list = Lists.newArrayList();
/*  63 */     a(☃, list);
/*  64 */     return list;
/*     */   }
/*     */   
/*     */   public static void a(@Nullable md ☃, List<apu> list) {
/*  68 */     if (☃ != null && ☃.c("CustomPotionEffects", 9)) {
/*  69 */       mj mj = ☃.d("CustomPotionEffects", 10);
/*     */       
/*  71 */       for (int i = 0; i < mj.size(); i++) {
/*  72 */         md md1 = mj.a(i);
/*  73 */         apu apu = apu.b(md1);
/*  74 */         if (apu != null) {
/*  75 */           list.add(apu);
/*     */         }
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public static int c(bmb ☃) {
/*  82 */     md md = ☃.o();
/*  83 */     if (md != null && 
/*  84 */       md.c("CustomPotionColor", 99)) {
/*  85 */       return md.h("CustomPotionColor");
/*     */     }
/*     */     
/*  88 */     return (d(☃) == bnw.a) ? 16253176 : a(a(☃));
/*     */   }
/*     */   
/*     */   public static int a(bnt ☃) {
/*  92 */     return (☃ == bnw.a) ? 16253176 : a(☃.a());
/*     */   }
/*     */   
/*     */   public static int a(Collection<apu> ☃) {
/*  96 */     int i = 3694022;
/*  97 */     if (☃.isEmpty()) {
/*  98 */       return 3694022;
/*     */     }
/*     */     
/* 101 */     float f1 = 0.0F;
/* 102 */     float f2 = 0.0F;
/* 103 */     float f3 = 0.0F;
/* 104 */     int j = 0;
/*     */     
/* 106 */     for (apu apu : ☃) {
/* 107 */       if (!apu.e()) {
/*     */         continue;
/*     */       }
/*     */       
/* 111 */       int k = apu.a().f();
/* 112 */       int m = apu.c() + 1;
/* 113 */       f1 += (m * (k >> 16 & 0xFF)) / 255.0F;
/* 114 */       f2 += (m * (k >> 8 & 0xFF)) / 255.0F;
/* 115 */       f3 += (m * (k >> 0 & 0xFF)) / 255.0F;
/* 116 */       j += m;
/*     */     } 
/*     */     
/* 119 */     if (j == 0) {
/* 120 */       return 0;
/*     */     }
/*     */     
/* 123 */     f1 = f1 / j * 255.0F;
/* 124 */     f2 = f2 / j * 255.0F;
/* 125 */     f3 = f3 / j * 255.0F;
/*     */     
/* 127 */     return (int)f1 << 16 | (int)f2 << 8 | (int)f3;
/*     */   }
/*     */   
/*     */   public static bnt d(bmb ☃) {
/* 131 */     return c(☃.o());
/*     */   }
/*     */   
/*     */   public static bnt c(@Nullable md ☃) {
/* 135 */     if (☃ == null) {
/* 136 */       return bnw.a;
/*     */     }
/*     */     
/* 139 */     return bnt.a(☃.l("Potion"));
/*     */   }
/*     */   
/*     */   public static bmb a(bmb ☃, bnt bnt1) {
/* 143 */     vk vk = gm.U.b(bnt1);
/*     */     
/* 145 */     if (bnt1 == bnw.a) {
/* 146 */       ☃.c("Potion");
/*     */     } else {
/* 148 */       ☃.p().a("Potion", vk.toString());
/*     */     } 
/*     */     
/* 151 */     return ☃;
/*     */   }
/*     */   
/*     */   public static bmb a(bmb ☃, Collection<apu> collection) {
/* 155 */     if (collection.isEmpty()) {
/* 156 */       return ☃;
/*     */     }
/*     */     
/* 159 */     md md = ☃.p();
/* 160 */     mj mj = md.d("CustomPotionEffects", 9);
/*     */     
/* 162 */     for (apu apu : collection) {
/* 163 */       mj.add(apu.a(new md()));
/*     */     }
/* 165 */     md.a("CustomPotionEffects", mj);
/*     */     
/* 167 */     return ☃;
/*     */   }
/*     */   
/*     */   public static void a(bmb ☃, List<nr> list, float f) {
/* 171 */     List<apu> list1 = a(☃);
/* 172 */     List<Pair<arg, arj>> list2 = Lists.newArrayList();
/*     */     
/* 174 */     if (list1.isEmpty()) {
/* 175 */       list.add(a);
/*     */     } else {
/* 177 */       for (apu apu : list1) {
/* 178 */         nx nx1 = new of(apu.g());
/* 179 */         aps aps = apu.a();
/*     */         
/* 181 */         Map<arg, arj> map = aps.g();
/* 182 */         if (!map.isEmpty()) {
/* 183 */           for (Map.Entry<arg, arj> entry : map.entrySet()) {
/* 184 */             arj arj1 = entry.getValue();
/* 185 */             arj arj2 = new arj(arj1.b(), aps.a(apu.c(), arj1), arj1.c());
/* 186 */             list2.add(new Pair(entry.getKey(), arj2));
/*     */           } 
/*     */         }
/*     */         
/* 190 */         if (apu.c() > 0) {
/* 191 */           nx1 = new of("potion.withAmplifier", new Object[] { nx1, new of("potion.potency." + apu.c()) });
/*     */         }
/*     */         
/* 194 */         if (apu.b() > 20) {
/* 195 */           nx1 = new of("potion.withDuration", new Object[] { nx1, apv.a(apu, f) });
/*     */         }
/*     */         
/* 198 */         list.add(nx1.a(aps.e().a()));
/*     */       } 
/*     */     } 
/*     */     
/* 202 */     if (!list2.isEmpty()) {
/* 203 */       list.add(oe.d);
/* 204 */       list.add((new of("potion.whenDrank")).a(k.f));
/*     */       
/* 206 */       for (Pair<arg, arj> pair : list2) {
/* 207 */         double d2; arj arj = (arj)pair.getSecond();
/* 208 */         double d1 = arj.d();
/*     */ 
/*     */         
/* 211 */         if (arj.c() == arj.a.b || arj.c() == arj.a.c) {
/* 212 */           d2 = arj.d() * 100.0D;
/*     */         } else {
/* 214 */           d2 = arj.d();
/*     */         } 
/*     */         
/* 217 */         if (d1 > 0.0D) {
/* 218 */           list.add((new of("attribute.modifier.plus." + arj
/* 219 */                 .c().a(), new Object[] { bmb.c
/* 220 */                   .format(d2), new of(((arg)pair
/* 221 */                     .getFirst()).c())
/* 222 */                 })).a(k.j)); continue;
/*     */         } 
/* 224 */         if (d1 < 0.0D) {
/* 225 */           d2 *= -1.0D;
/* 226 */           list.add((new of("attribute.modifier.take." + arj
/* 227 */                 .c().a(), new Object[] { bmb.c
/* 228 */                   .format(d2), new of(((arg)pair
/* 229 */                     .getFirst()).c())
/* 230 */                 })).a(k.m));
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bnv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */