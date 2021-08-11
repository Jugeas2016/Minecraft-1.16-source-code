/*     */ import com.google.common.collect.Maps;
/*     */ import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
/*     */ import it.unimi.dsi.fastutil.longs.LongSet;
/*     */ import it.unimi.dsi.fastutil.shorts.ShortList;
/*     */ import it.unimi.dsi.fastutil.shorts.ShortListIterator;
/*     */ import java.util.Arrays;
/*     */ import java.util.BitSet;
/*     */ import java.util.Collection;
/*     */ import java.util.EnumSet;
/*     */ import java.util.Iterator;
/*     */ import java.util.Locale;
/*     */ import java.util.Map;
/*     */ import java.util.Objects;
/*     */ import javax.annotation.Nullable;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
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
/*     */ public class cgt
/*     */ {
/*  60 */   private static final Logger a = LogManager.getLogger();
/*     */   
/*     */   public static cgp a(aag ☃, csw csw1, azo azo1, brd brd1, md md1) {
/*     */     cfw cfw;
/*  64 */     cfy cfy = ☃.i().g();
/*  65 */     bsy bsy = cfy.d();
/*     */     
/*  67 */     md md2 = md1.p("Level");
/*  68 */     brd brd2 = new brd(md2.h("xPos"), md2.h("zPos"));
/*  69 */     if (!Objects.equals(brd1, brd2)) {
/*  70 */       a.error("Chunk file at {} is in the wrong location; relocating. (Expected {}, got {})", brd1, brd1, brd2);
/*     */     }
/*     */     
/*  73 */     cfx cfx = new cfx(☃.r().b(gm.ay), brd1, bsy, md2.c("Biomes", 11) ? md2.n("Biomes") : null);
/*     */     
/*  75 */     cgr cgr = md2.c("UpgradeData", 10) ? new cgr(md2.p("UpgradeData")) : cgr.a;
/*     */     
/*  77 */     cgq<buo> cgq = new cgq<>(☃ -> (☃ == null || ☃.n().g()), brd1, md2.d("ToBeTicked", 9));
/*  78 */     cgq<cuw> cgq1 = new cgq<>(☃ -> (☃ == null || ☃ == cuy.a), brd1, md2.d("LiquidsToBeTicked", 9));
/*     */     
/*  80 */     boolean bool1 = md2.q("isLightOn");
/*     */     
/*  82 */     mj mj1 = md2.d("Sections", 10);
/*  83 */     int i = 16;
/*  84 */     cgi[] arrayOfCgi = new cgi[16];
/*     */     
/*  86 */     boolean bool2 = ☃.k().b();
/*  87 */     cfz cfz = ☃.i();
/*     */     
/*  89 */     cuo cuo = cfz.l();
/*  90 */     if (bool1) {
/*  91 */       cuo.b(brd1, true);
/*     */     }
/*     */     
/*  94 */     for (int j = 0; j < mj1.size(); j++) {
/*  95 */       md md6 = mj1.a(j);
/*     */       
/*  97 */       int i2 = md6.f("Y");
/*  98 */       if (md6.c("Palette", 9) && md6.c("BlockStates", 12)) {
/*  99 */         cgi cgi = new cgi(i2 << 4);
/* 100 */         cgi.i().a(md6.d("Palette", 10), md6.o("BlockStates"));
/* 101 */         cgi.h();
/* 102 */         if (!cgi.c()) {
/* 103 */           arrayOfCgi[i2] = cgi;
/*     */         }
/* 105 */         azo1.a(brd1, cgi);
/*     */       } 
/* 107 */       if (bool1) {
/*     */ 
/*     */         
/* 110 */         if (md6.c("BlockLight", 7)) {
/* 111 */           cuo.a(bsf.b, gp.a(brd1, i2), new cgb(md6.m("BlockLight")), true);
/*     */         }
/* 113 */         if (bool2 && md6.c("SkyLight", 7)) {
/* 114 */           cuo.a(bsf.a, gp.a(brd1, i2), new cgb(md6.m("SkyLight")), true);
/*     */         }
/*     */       } 
/*     */     } 
/* 118 */     long l = md2.i("InhabitedTime");
/*     */     
/* 120 */     cga.a a = a(md1);
/*     */ 
/*     */     
/* 123 */     if (a == cga.a.b) {
/*     */       bso<buo> bso; bso<cuw> bso1;
/* 125 */       if (md2.c("TileTicks", 9)) {
/* 126 */         bso = bre.a(md2.d("TileTicks", 10), gm.Q::b, gm.Q::a);
/*     */       } else {
/* 128 */         bso = cgq;
/*     */       } 
/*     */ 
/*     */       
/* 132 */       if (md2.c("LiquidTicks", 9)) {
/* 133 */         bso1 = bre.a(md2.d("LiquidTicks", 10), gm.O::b, gm.O::a);
/*     */       } else {
/* 135 */         bso1 = cgq1;
/*     */       } 
/*     */       
/* 138 */       cfw = new cgh(☃.E(), brd1, cfx, cgr, bso, bso1, l, arrayOfCgi, cgh1 -> a(☃, cgh1));
/*     */     } else {
/* 140 */       cgp cgp1 = new cgp(brd1, cgr, arrayOfCgi, cgq, cgq1);
/* 141 */       cgp1.a(cfx);
/* 142 */       cfw = cgp1;
/* 143 */       cfw.b(l);
/* 144 */       cgp1.a(cga.a(md2.l("Status")));
/* 145 */       if (cfw.k().b(cga.i)) {
/* 146 */         cgp1.a(cuo);
/*     */       }
/* 148 */       if (!bool1 && cfw.k().b(cga.j)) {
/* 149 */         for (fx fx : fx.b(brd1.d(), 0, brd1.e(), brd1.f(), 255, brd1.g())) {
/* 150 */           if (cfw.d_(fx).f() != 0) {
/* 151 */             cgp1.k(fx);
/*     */           }
/*     */         } 
/*     */       }
/*     */     } 
/*     */     
/* 157 */     cfw.b(bool1);
/*     */     
/* 159 */     md md3 = md2.p("Heightmaps");
/*     */     
/* 161 */     EnumSet<chn.a> enumSet = EnumSet.noneOf(chn.a.class);
/*     */     
/* 163 */     for (chn.a a1 : cfw.k().h()) {
/* 164 */       String str = a1.b();
/*     */       
/* 166 */       if (md3.c(str, 12)) {
/* 167 */         cfw.a(a1, md3.o(str)); continue;
/*     */       } 
/* 169 */       enumSet.add(a1);
/*     */     } 
/*     */ 
/*     */     
/* 173 */     chn.a(cfw, enumSet);
/*     */     
/* 175 */     md md4 = md2.p("Structures");
/* 176 */     cfw.a(a(csw1, md4, ☃.C()));
/* 177 */     cfw.b(a(brd1, md4));
/*     */     
/* 179 */     if (md2.q("shouldSave")) {
/* 180 */       cfw.a(true);
/*     */     }
/*     */     
/* 183 */     mj mj2 = md2.d("PostProcessing", 9);
/* 184 */     for (int k = 0; k < mj2.size(); k++) {
/* 185 */       mj mj = mj2.b(k);
/* 186 */       for (int i2 = 0; i2 < mj.size(); i2++) {
/* 187 */         cfw.a(mj.d(i2), k);
/*     */       }
/*     */     } 
/*     */     
/* 191 */     if (a == cga.a.b) {
/* 192 */       return new cgg((cgh)cfw);
/*     */     }
/*     */     
/* 195 */     cgp cgp = (cgp)cfw;
/* 196 */     mj mj3 = md2.d("Entities", 10);
/* 197 */     for (int m = 0; m < mj3.size(); m++) {
/* 198 */       cgp.b(mj3.a(m));
/*     */     }
/*     */     
/* 201 */     mj mj4 = md2.d("TileEntities", 10);
/* 202 */     for (int n = 0; n < mj4.size(); n++) {
/* 203 */       md md6 = mj4.a(n);
/* 204 */       cfw.a(md6);
/*     */     } 
/*     */     
/* 207 */     mj mj5 = md2.d("Lights", 9);
/* 208 */     for (int i1 = 0; i1 < mj5.size(); i1++) {
/* 209 */       mj mj = mj5.b(i1);
/* 210 */       for (int i2 = 0; i2 < mj.size(); i2++) {
/* 211 */         cgp.b(mj.d(i2), i1);
/*     */       }
/*     */     } 
/*     */     
/* 215 */     md md5 = md2.p("CarvingMasks");
/* 216 */     for (String str : md5.d()) {
/* 217 */       chm.a a1 = chm.a.valueOf(str);
/* 218 */       cgp.a(a1, BitSet.valueOf(md5.m(str)));
/*     */     } 
/*     */     
/* 221 */     return cgp;
/*     */   }
/*     */   
/*     */   public static md a(aag ☃, cfw cfw1) {
/* 225 */     brd brd = cfw1.g();
/* 226 */     md md1 = new md();
/* 227 */     md md2 = new md();
/* 228 */     md1.b("DataVersion", w.a().getWorldVersion());
/* 229 */     md1.a("Level", md2);
/*     */     
/* 231 */     md2.b("xPos", brd.b);
/* 232 */     md2.b("zPos", brd.c);
/* 233 */     md2.a("LastUpdate", ☃.T());
/* 234 */     md2.a("InhabitedTime", cfw1.q());
/* 235 */     md2.a("Status", cfw1.k().d());
/*     */     
/* 237 */     cgr cgr = cfw1.p();
/* 238 */     if (!cgr.a()) {
/* 239 */       md2.a("UpgradeData", cgr.b());
/*     */     }
/*     */     
/* 242 */     cgi[] arrayOfCgi = cfw1.d();
/* 243 */     mj mj1 = new mj();
/*     */     
/* 245 */     cuo cuo = ☃.i().a();
/*     */     
/* 247 */     boolean bool = cfw1.r();
/* 248 */     for (int i = -1; i < 17; i++) {
/* 249 */       int j = i;
/* 250 */       cgi cgi = Arrays.<cgi>stream(arrayOfCgi).filter(cgi1 -> (cgi1 != null && cgi1.g() >> 4 == ☃)).findFirst().orElse(cgh.a);
/* 251 */       cgb cgb1 = cuo.a(bsf.b).a(gp.a(brd, j));
/* 252 */       cgb cgb2 = cuo.a(bsf.a).a(gp.a(brd, j));
/* 253 */       if (cgi != cgh.a || cgb1 != null || cgb2 != null) {
/*     */ 
/*     */ 
/*     */         
/* 257 */         md md = new md();
/* 258 */         md.a("Y", (byte)(j & 0xFF));
/*     */         
/* 260 */         if (cgi != cgh.a) {
/* 261 */           cgi.i().a(md, "Palette", "BlockStates");
/*     */         }
/* 263 */         if (cgb1 != null && !cgb1.c()) {
/* 264 */           md.a("BlockLight", cgb1.a());
/*     */         }
/* 266 */         if (cgb2 != null && !cgb2.c()) {
/* 267 */           md.a("SkyLight", cgb2.a());
/*     */         }
/*     */         
/* 270 */         mj1.add(md);
/*     */       } 
/* 272 */     }  md2.a("Sections", mj1);
/*     */     
/* 274 */     if (bool) {
/* 275 */       md2.a("isLightOn", true);
/*     */     }
/*     */     
/* 278 */     cfx cfx = cfw1.i();
/* 279 */     if (cfx != null) {
/* 280 */       md2.a("Biomes", cfx.a());
/*     */     }
/*     */ 
/*     */     
/* 284 */     mj mj2 = new mj();
/* 285 */     for (fx fx : cfw1.c()) {
/* 286 */       md md = cfw1.j(fx);
/* 287 */       if (md != null) {
/* 288 */         mj2.add(md);
/*     */       }
/*     */     } 
/* 291 */     md2.a("TileEntities", mj2);
/*     */     
/* 293 */     mj mj3 = new mj();
/* 294 */     if (cfw1.k().g() == cga.a.b) {
/*     */       
/* 296 */       cgh cgh = (cgh)cfw1;
/* 297 */       cgh.d(false);
/* 298 */       for (int j = 0; j < (cgh.z()).length; j++) {
/* 299 */         for (aqa aqa : cgh.z()[j]) {
/* 300 */           md md = new md();
/* 301 */           if (aqa.d(md)) {
/* 302 */             cgh.d(true);
/* 303 */             mj3.add(md);
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } else {
/*     */       
/* 309 */       cgp cgp = (cgp)cfw1;
/* 310 */       mj3.addAll((Collection)cgp.y());
/*     */ 
/*     */       
/* 313 */       md2.a("Lights", a(cgp.w()));
/*     */ 
/*     */       
/* 316 */       md md = new md();
/* 317 */       for (chm.a a : chm.a.values()) {
/* 318 */         BitSet bitSet = cgp.a(a);
/* 319 */         if (bitSet != null) {
/* 320 */           md.a(a.toString(), bitSet.toByteArray());
/*     */         }
/*     */       } 
/* 323 */       md2.a("CarvingMasks", md);
/*     */     } 
/* 325 */     md2.a("Entities", mj3);
/*     */ 
/*     */     
/* 328 */     bso<buo> bso = cfw1.n();
/* 329 */     if (bso instanceof cgq) {
/* 330 */       md2.a("ToBeTicked", ((cgq)bso).b());
/* 331 */     } else if (bso instanceof bre) {
/* 332 */       md2.a("TileTicks", ((bre)bso).b());
/*     */     } else {
/*     */       
/* 335 */       md2.a("TileTicks", ☃.j().a(brd));
/*     */     } 
/*     */     
/* 338 */     bso<cuw> bso1 = cfw1.o();
/* 339 */     if (bso1 instanceof cgq) {
/* 340 */       md2.a("LiquidsToBeTicked", ((cgq)bso1).b());
/* 341 */     } else if (bso1 instanceof bre) {
/* 342 */       md2.a("LiquidTicks", ((bre)bso1).b());
/*     */     } else {
/*     */       
/* 345 */       md2.a("LiquidTicks", ☃.r_().a(brd));
/*     */     } 
/*     */ 
/*     */     
/* 349 */     md2.a("PostProcessing", a(cfw1.l()));
/*     */     
/* 351 */     md md3 = new md();
/* 352 */     for (Map.Entry<chn.a, chn> entry : cfw1.f()) {
/* 353 */       if (cfw1.k().h().contains(entry.getKey())) {
/* 354 */         md3.a(((chn.a)entry.getKey()).b(), new mk(((chn)entry.getValue()).a()));
/*     */       }
/*     */     } 
/* 357 */     md2.a("Heightmaps", md3);
/*     */     
/* 359 */     md2.a("Structures", a(brd, cfw1.h(), cfw1.v()));
/* 360 */     return md1;
/*     */   }
/*     */   
/*     */   public static cga.a a(@Nullable md ☃) {
/* 364 */     if (☃ != null) {
/* 365 */       cga cga = cga.a(☃.p("Level").l("Status"));
/* 366 */       if (cga != null) {
/* 367 */         return cga.g();
/*     */       }
/*     */     } 
/* 370 */     return cga.a.a;
/*     */   }
/*     */   
/*     */   private static void a(md ☃, cgh cgh1) {
/* 374 */     mj mj1 = ☃.d("Entities", 10);
/* 375 */     brx brx = cgh1.x();
/* 376 */     for (int i = 0; i < mj1.size(); i++) {
/* 377 */       md md1 = mj1.a(i);
/* 378 */       aqe.a(md1, brx, aqa1 -> {
/*     */             ☃.a(aqa1);
/*     */             return aqa1;
/*     */           });
/* 382 */       cgh1.d(true);
/*     */     } 
/*     */     
/* 385 */     mj mj2 = ☃.d("TileEntities", 10);
/* 386 */     for (int j = 0; j < mj2.size(); j++) {
/* 387 */       md md1 = mj2.a(j);
/* 388 */       boolean bool = md1.q("keepPacked");
/* 389 */       if (bool) {
/* 390 */         cgh1.a(md1);
/*     */       } else {
/*     */         
/* 393 */         fx fx = new fx(md1.h("x"), md1.h("y"), md1.h("z"));
/* 394 */         ccj ccj = ccj.b(cgh1.d_(fx), md1);
/* 395 */         if (ccj != null) {
/* 396 */           cgh1.a(ccj);
/*     */         }
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   private static md a(brd ☃, Map<cla<?>, crv<?>> map, Map<cla<?>, LongSet> map1) {
/* 403 */     md md1 = new md();
/*     */     
/* 405 */     md md2 = new md();
/* 406 */     for (Map.Entry<cla<?>, crv<?>> entry : map.entrySet()) {
/* 407 */       md2.a(((cla)entry.getKey()).i(), ((crv)entry.getValue()).a(☃.b, ☃.c));
/*     */     }
/* 409 */     md1.a("Starts", md2);
/*     */     
/* 411 */     md md3 = new md();
/* 412 */     for (Map.Entry<cla<?>, LongSet> entry : map1.entrySet()) {
/* 413 */       md3.a(((cla)entry.getKey()).i(), new mk(entry.getValue()));
/*     */     }
/* 415 */     md1.a("References", md3);
/*     */     
/* 417 */     return md1;
/*     */   }
/*     */   
/*     */   private static Map<cla<?>, crv<?>> a(csw ☃, md md1, long l) {
/* 421 */     Map<cla<?>, crv<?>> map = Maps.newHashMap();
/*     */     
/* 423 */     md md2 = md1.p("Starts");
/* 424 */     for (String str1 : md2.d()) {
/* 425 */       String str2 = str1.toLowerCase(Locale.ROOT);
/* 426 */       cla<?> cla = (cla)cla.a.get(str2);
/* 427 */       if (cla == null) {
/* 428 */         a.error("Unknown structure start: {}", str2);
/*     */         continue;
/*     */       } 
/* 431 */       crv<?> crv = cla.a(☃, md2.p(str1), l);
/* 432 */       if (crv != null) {
/* 433 */         map.put(cla, crv);
/*     */       }
/*     */     } 
/*     */     
/* 437 */     return map;
/*     */   }
/*     */   
/*     */   private static Map<cla<?>, LongSet> a(brd ☃, md md1) {
/* 441 */     Map<cla<?>, LongSet> map = Maps.newHashMap();
/*     */     
/* 443 */     md md2 = md1.p("References");
/* 444 */     for (Iterator<String> iterator = md2.d().iterator(); iterator.hasNext(); ) { String str = iterator.next();
/*     */       
/* 446 */       map.put(cla.a.get(str.toLowerCase(Locale.ROOT)), new LongOpenHashSet(Arrays.stream(md2.o(str)).filter(l -> {
/*     */                 brd brd1 = new brd(l);
/*     */                 
/*     */                 if (brd1.a(☃) > 8) {
/*     */                   a.warn("Found invalid structure reference [ {} @ {} ] for chunk {}.", str, brd1, ☃);
/*     */                   return false;
/*     */                 } 
/*     */                 return true;
/* 454 */               }).toArray())); }
/*     */ 
/*     */     
/* 457 */     return map;
/*     */   }
/*     */   
/*     */   public static mj a(ShortList[] ☃) {
/* 461 */     mj mj = new mj();
/* 462 */     for (ShortList shortList : ☃) {
/* 463 */       mj mj1 = new mj();
/* 464 */       if (shortList != null) {
/* 465 */         for (ShortListIterator<Short> shortListIterator = shortList.iterator(); shortListIterator.hasNext(); ) { Short short_ = shortListIterator.next();
/* 466 */           mj1.add(mr.a(short_.shortValue())); }
/*     */       
/*     */       }
/* 469 */       mj.add(mj1);
/*     */     } 
/* 471 */     return mj;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cgt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */