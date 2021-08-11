/*     */ import com.google.common.collect.Lists;
/*     */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*     */ import java.io.BufferedReader;
/*     */ import java.io.IOException;
/*     */ import java.nio.file.Files;
/*     */ import java.nio.file.Path;
/*     */ import java.nio.file.Paths;
/*     */ import java.util.Collection;
/*     */ import java.util.Collections;
/*     */ import java.util.Comparator;
/*     */ import java.util.List;
/*     */ import java.util.Optional;
/*     */ import javax.annotation.Nullable;
/*     */ import org.apache.commons.io.IOUtils;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class lq
/*     */ {
/*  48 */   public static String a = "gameteststructures";
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static bzm a(int ☃) {
/*  54 */     switch (☃) { case 0:
/*  55 */         return bzm.a;
/*  56 */       case 1: return bzm.b;
/*  57 */       case 2: return bzm.c;
/*  58 */       case 3: return bzm.d; }
/*  59 */      throw new IllegalArgumentException("rotationSteps must be a value from 0-3. Got value " + ☃);
/*     */   }
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
/*     */   public static dci a(cdj ☃) {
/*  74 */     fx fx1 = ☃.o();
/*  75 */     fx fx2 = fx1.a(☃.j().b(-1, -1, -1));
/*  76 */     fx fx3 = ctb.a(fx2, byg.a, ☃.l(), fx1);
/*     */     
/*  78 */     return new dci(fx1, fx3);
/*     */   }
/*     */   
/*     */   public static cra b(cdj ☃) {
/*  82 */     fx fx1 = ☃.o();
/*  83 */     fx fx2 = fx1.a(☃.j().b(-1, -1, -1));
/*  84 */     fx fx3 = ctb.a(fx2, byg.a, ☃.l(), fx1);
/*     */     
/*  86 */     return new cra(fx1, fx3);
/*     */   }
/*     */   
/*     */   public static void a(fx ☃, fx fx1, bzm bzm1, aag aag1) {
/*  90 */     fx fx2 = ctb.a(☃.a(fx1), byg.a, bzm1, ☃);
/*  91 */     aag1.a(fx2, bup.er.n());
/*  92 */     cco cco = (cco)aag1.c(fx2);
/*  93 */     cco.d().a("test runthis");
/*     */     
/*  95 */     fx fx3 = ctb.a(fx2.b(0, 0, -1), byg.a, bzm1, fx2);
/*     */     
/*  97 */     aag1.a(fx3, bup.cB.n().a(bzm1));
/*     */   }
/*     */   
/*     */   public static void a(String ☃, fx fx1, fx fx2, bzm bzm1, aag aag1) {
/* 101 */     cra cra = a(fx1, fx2, bzm1);
/* 102 */     a(cra, fx1.v(), aag1);
/*     */     
/* 104 */     aag1.a(fx1, bup.mY.n());
/*     */     
/* 106 */     cdj cdj = (cdj)aag1.c(fx1);
/* 107 */     cdj.a(false);
/* 108 */     cdj.a(new vk(☃));
/* 109 */     cdj.c(fx2);
/* 110 */     cdj.a(cfo.a);
/* 111 */     cdj.e(true);
/*     */   }
/*     */   
/*     */   public static cdj a(String ☃, fx fx1, bzm bzm1, int i, aag aag1, boolean bool) {
/* 115 */     fx fx3, fx2 = a(☃, aag1).a();
/* 116 */     cra cra = a(fx1, fx2, bzm1);
/*     */ 
/*     */     
/* 119 */     if (bzm1 == bzm.a) {
/* 120 */       fx3 = fx1;
/* 121 */     } else if (bzm1 == bzm.b) {
/* 122 */       fx3 = fx1.b(fx2.w() - 1, 0, 0);
/* 123 */     } else if (bzm1 == bzm.c) {
/* 124 */       fx3 = fx1.b(fx2.u() - 1, 0, fx2.w() - 1);
/* 125 */     } else if (bzm1 == bzm.d) {
/* 126 */       fx3 = fx1.b(0, 0, fx2.u() - 1);
/*     */     } else {
/* 128 */       throw new IllegalArgumentException("Invalid rotation: " + bzm1);
/*     */     } 
/*     */     
/* 131 */     a(fx1, aag1);
/*     */     
/* 133 */     a(cra, fx1.v(), aag1);
/* 134 */     cdj cdj = a(☃, fx3, bzm1, aag1, bool);
/* 135 */     aag1.j().a(cra, true, false);
/* 136 */     aag1.a(cra);
/* 137 */     return cdj;
/*     */   }
/*     */   
/*     */   private static void a(fx ☃, aag aag1) {
/* 141 */     brd brd = new brd(☃);
/*     */ 
/*     */     
/* 144 */     for (int i = -1; i < 4; i++) {
/* 145 */       for (int j = -1; j < 4; j++) {
/* 146 */         int k = brd.b + i;
/* 147 */         int m = brd.c + j;
/* 148 */         aag1.a(k, m, true);
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public static void a(cra ☃, int i, aag aag1) {
/* 155 */     cra cra1 = new cra(☃.a - 2, ☃.b - 3, ☃.c - 3, ☃.d + 3, ☃.e + 20, ☃.f + 3);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 164 */     fx.a(cra1).forEach(fx1 -> a(☃, fx1, aag1));
/* 165 */     aag1.j().a(cra1, true, false);
/* 166 */     aag1.a(cra1);
/* 167 */     dci dci = new dci(cra1.a, cra1.b, cra1.c, cra1.d, cra1.e, cra1.f);
/* 168 */     List<aqa> list = aag1.a(aqa.class, dci, ☃ -> !(☃ instanceof bfw));
/* 169 */     list.forEach(aqa::ad);
/*     */   }
/*     */   
/*     */   public static cra a(fx ☃, fx fx1, bzm bzm1) {
/* 173 */     fx fx2 = ☃.a(fx1).b(-1, -1, -1);
/* 174 */     fx fx3 = ctb.a(fx2, byg.a, bzm1, ☃);
/* 175 */     cra cra = cra.a(☃.u(), ☃.v(), ☃.w(), fx3.u(), fx3.v(), fx3.w());
/*     */     
/* 177 */     int i = Math.min(cra.a, cra.d);
/* 178 */     int j = Math.min(cra.c, cra.f);
/*     */ 
/*     */     
/* 181 */     fx fx4 = new fx(☃.u() - i, 0, ☃.w() - j);
/* 182 */     cra.a(fx4);
/* 183 */     return cra;
/*     */   }
/*     */   
/*     */   public static Optional<fx> a(fx ☃, int i, aag aag1) {
/* 187 */     return c(☃, i, aag1).stream()
/* 188 */       .filter(fx1 -> a(fx1, ☃, aag1))
/* 189 */       .findFirst();
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public static fx b(fx ☃, int i, aag aag1) {
/* 194 */     Comparator<fx> comparator = Comparator.comparingInt(fx1 -> fx1.k(☃));
/*     */     
/* 196 */     Collection<fx> collection = c(☃, i, aag1);
/* 197 */     Optional<fx> optional = collection.stream().min(comparator);
/* 198 */     return optional.orElse(null);
/*     */   }
/*     */   
/*     */   public static Collection<fx> c(fx ☃, int i, aag aag1) {
/* 202 */     Collection<fx> collection = Lists.newArrayList();
/*     */     
/* 204 */     dci dci = new dci(☃);
/* 205 */     dci = dci.g(i);
/* 206 */     for (int j = (int)dci.a; j <= (int)dci.d; j++) {
/* 207 */       for (int k = (int)dci.b; k <= (int)dci.e; k++) {
/* 208 */         for (int m = (int)dci.c; m <= (int)dci.f; m++) {
/* 209 */           fx fx1 = new fx(j, k, m);
/* 210 */           ceh ceh = aag1.d_(fx1);
/* 211 */           if (ceh.a(bup.mY)) {
/* 212 */             collection.add(fx1);
/*     */           }
/*     */         } 
/*     */       } 
/*     */     } 
/* 217 */     return collection;
/*     */   }
/*     */   
/*     */   private static ctb a(String ☃, aag aag1) {
/* 221 */     csw csw = aag1.n();
/*     */ 
/*     */     
/* 224 */     ctb ctb = csw.b(new vk(☃));
/* 225 */     if (ctb != null) {
/* 226 */       return ctb;
/*     */     }
/*     */ 
/*     */     
/* 230 */     String str = ☃ + ".snbt";
/* 231 */     Path path = Paths.get(a, new String[] { str });
/* 232 */     md md = a(path);
/* 233 */     if (md == null) {
/* 234 */       throw new RuntimeException("Could not find structure file " + path + ", and the structure is not available in the world structures either.");
/*     */     }
/*     */     
/* 237 */     return csw.a(md);
/*     */   }
/*     */   
/*     */   private static cdj a(String ☃, fx fx1, bzm bzm1, aag aag1, boolean bool) {
/* 241 */     aag1.a(fx1, bup.mY.n());
/*     */     
/* 243 */     cdj cdj = (cdj)aag1.c(fx1);
/* 244 */     cdj.a(cfo.b);
/* 245 */     cdj.b(bzm1);
/* 246 */     cdj.a(false);
/* 247 */     cdj.a(new vk(☃));
/*     */     
/* 249 */     cdj.a(aag1, bool);
/* 250 */     if (cdj.j() != fx.b) {
/* 251 */       return cdj;
/*     */     }
/* 253 */     ctb ctb = a(☃, aag1);
/* 254 */     cdj.a(aag1, bool, ctb);
/* 255 */     if (cdj.j() == fx.b) {
/* 256 */       throw new RuntimeException("Failed to load structure " + ☃);
/*     */     }
/* 258 */     return cdj;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   private static md a(Path ☃) {
/*     */     try {
/* 266 */       BufferedReader bufferedReader = Files.newBufferedReader(☃);
/* 267 */       String str = IOUtils.toString(bufferedReader);
/* 268 */       return mu.a(str);
/* 269 */     } catch (IOException iOException) {
/* 270 */       return null;
/* 271 */     } catch (CommandSyntaxException commandSyntaxException) {
/* 272 */       throw new RuntimeException("Error while trying to load structure " + ☃, commandSyntaxException);
/*     */     } 
/*     */   }
/*     */   
/*     */   private static void a(int ☃, fx fx1, aag aag1) {
/* 277 */     ceh ceh = null;
/*     */     
/* 279 */     cpf cpf = cpf.a(aag1.r().b(gm.ay));
/* 280 */     if (cpf instanceof cpf) {
/* 281 */       ceh[] arrayOfCeh = cpf.g();
/* 282 */       if (fx1.v() < ☃ && fx1.v() <= arrayOfCeh.length) {
/* 283 */         ceh = arrayOfCeh[fx1.v() - 1];
/*     */       }
/*     */     }
/* 286 */     else if (fx1.v() == ☃ - 1) {
/* 287 */       ceh = aag1.v(fx1).e().e().a();
/* 288 */     } else if (fx1.v() < ☃ - 1) {
/* 289 */       ceh = aag1.v(fx1).e().e().b();
/*     */     } 
/*     */     
/* 292 */     if (ceh == null) {
/* 293 */       ceh = bup.a.n();
/*     */     }
/* 295 */     ef ef = new ef(ceh, Collections.emptySet(), null);
/* 296 */     ef.a(aag1, fx1, 2);
/* 297 */     aag1.a(fx1, ceh.b());
/*     */   }
/*     */   
/*     */   private static boolean a(fx ☃, fx fx1, aag aag1) {
/* 301 */     cdj cdj = (cdj)aag1.c(☃);
/* 302 */     dci dci = a(cdj).g(1.0D);
/* 303 */     return dci.d(dcn.a(fx1));
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\lq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */