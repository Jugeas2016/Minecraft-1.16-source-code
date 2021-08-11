/*     */ import java.util.function.Consumer;
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
/*     */ public class hq
/*     */   implements Consumer<Consumer<y>>
/*     */ {
/*  43 */   private static final aqe<?>[] a = new aqe[] { aqe.H, aqe.o, aqe.aa, aqe.ar, aqe.l, aqe.ab, aqe.ah, aqe.j, aqe.aW, aqe.ac, aqe.ao, aqe.Q, aqe.h, aqe.ae, aqe.C, aqe.e, aqe.G, aqe.aF };
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
/*  65 */   private static final blx[] b = new blx[] { bmd.ml, bmd.mn, bmd.mo, bmd.mm };
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  72 */   private static final blx[] c = new blx[] { bmd.lW, bmd.lX, bmd.lU, bmd.lV };
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  79 */   private static final blx[] d = new blx[] { bmd.kb, bmd.kR, bmd.kX, bmd.lx, bmd.ly, bmd.lA, bmd.lB, bmd.ml, bmd.mm, bmd.mn, bmd.mo, bmd.mp, bmd.mq, bmd.ne, bmd.nh, bmd.nl, bmd.nm, bmd.nn, bmd.no, bmd.np, bmd.nx, bmd.oY, bmd.oZ, bmd.pa, bmd.pb, bmd.pd, bmd.pn, bmd.px, bmd.py, bmd.pz, bmd.pK, bmd.pL, bmd.qd, bmd.qf, bmd.qh, bmd.ni, bmd.qR, bmd.rm, bmd.rt };
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
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(Consumer<y> ☃) {
/* 126 */     y y1 = y.a.a().a(bup.gA, new of("advancements.husbandry.root.title"), new of("advancements.husbandry.root.description"), new vk("textures/gui/advancements/backgrounds/husbandry.png"), ai.a, false, false, false).a("consumed_item", at.a.c()).a(☃, "husbandry/root");
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
/* 137 */     y y2 = y.a.a().a(y1).a(bmd.kW, new of("advancements.husbandry.plant_seed.title"), new of("advancements.husbandry.plant_seed.description"), (vk)null, ai.a, true, true, false).a(aj.b).a("wheat", cd.a.a(bup.bW)).a("pumpkin_stem", cd.a.a(bup.dN)).a("melon_stem", cd.a.a(bup.dO)).a("beetroots", cd.a.a(bup.iD)).a("nether_wart", cd.a.a(bup.dY)).a(☃, "husbandry/plant_seed");
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 144 */     y y3 = y.a.a().a(y1).a(bmd.kW, new of("advancements.husbandry.breed_an_animal.title"), new of("advancements.husbandry.breed_an_animal.description"), (vk)null, ai.a, true, true, false).a(aj.b).a("bred", ao.a.c()).a(☃, "husbandry/breed_an_animal");
/*     */     
/* 146 */     a(y.a.a())
/* 147 */       .a(y2)
/* 148 */       .a(bmd.kb, new of("advancements.husbandry.balanced_diet.title"), new of("advancements.husbandry.balanced_diet.description"), (vk)null, ai.b, true, true, false)
/* 149 */       .a(ab.a.a(100))
/* 150 */       .a(☃, "husbandry/balanced_diet");
/*     */     
/* 152 */     y.a.a()
/* 153 */       .a(y2)
/* 154 */       .a(bmd.kO, new of("advancements.husbandry.netherite_hoe.title"), new of("advancements.husbandry.netherite_hoe.description"), (vk)null, ai.b, true, true, false)
/* 155 */       .a(ab.a.a(100))
/* 156 */       .a("netherite_hoe", bn.a.a(new brw[] { bmd.kO
/* 157 */           })).a(☃, "husbandry/obtain_netherite_hoe");
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 163 */     y y4 = y.a.a().a(y1).a(bmd.pH, new of("advancements.husbandry.tame_an_animal.title"), new of("advancements.husbandry.tame_an_animal.description"), (vk)null, ai.a, true, true, false).a("tamed_animal", co.a.c()).a(☃, "husbandry/tame_an_animal");
/*     */     
/* 165 */     b(y.a.a())
/* 166 */       .a(y3)
/* 167 */       .a(bmd.pd, new of("advancements.husbandry.breed_all_animals.title"), new of("advancements.husbandry.breed_all_animals.description"), (vk)null, ai.b, true, true, false)
/* 168 */       .a(ab.a.a(100))
/* 169 */       .a(☃, "husbandry/bred_all_animals");
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 175 */     y y5 = d(y.a.a()).a(y1).a(aj.b).a(bmd.mi, new of("advancements.husbandry.fishy_business.title"), new of("advancements.husbandry.fishy_business.description"), (vk)null, ai.a, true, true, false).a(☃, "husbandry/fishy_business");
/*     */     
/* 177 */     c(y.a.a())
/* 178 */       .a(y5)
/* 179 */       .a(aj.b)
/* 180 */       .a(bmd.lU, new of("advancements.husbandry.tactical_fishing.title"), new of("advancements.husbandry.tactical_fishing.description"), (vk)null, ai.a, true, true, false)
/* 181 */       .a(☃, "husbandry/tactical_fishing");
/*     */     
/* 183 */     e(y.a.a())
/* 184 */       .a(y4)
/* 185 */       .a(bmd.ml, new of("advancements.husbandry.complete_catalogue.title"), new of("advancements.husbandry.complete_catalogue.description"), (vk)null, ai.b, true, true, false)
/* 186 */       .a(ab.a.a(50))
/* 187 */       .a(☃, "husbandry/complete_catalogue");
/*     */     
/* 189 */     y.a.a()
/* 190 */       .a(y1)
/* 191 */       .a("safely_harvest_honey", br.a.a(bw.a.a().a(an.a.a().a(aed.aj).b()).a(Boolean.valueOf(true)), bq.a.a().a(bmd.nw)))
/* 192 */       .a(bmd.rt, new of("advancements.husbandry.safely_harvest_honey.title"), new of("advancements.husbandry.safely_harvest_honey.description"), (vk)null, ai.a, true, true, false)
/* 193 */       .a(☃, "husbandry/safely_harvest_honey");
/*     */     
/* 195 */     y.a.a()
/* 196 */       .a(y1)
/* 197 */       .a("silk_touch_nest", am.a.a(bup.nc, bq.a.a().a(new bb(bpw.u, bz.d.b(1))), bz.d.a(3)))
/* 198 */       .a(bup.nc, new of("advancements.husbandry.silk_touch_nest.title"), new of("advancements.husbandry.silk_touch_nest.description"), (vk)null, ai.a, true, true, false)
/* 199 */       .a(☃, "husbandry/silk_touch_nest");
/*     */   }
/*     */   
/*     */   private y.a a(y.a ☃) {
/* 203 */     for (blx blx1 : d) {
/* 204 */       ☃.a(gm.T.b(blx1).a(), at.a.a(blx1));
/*     */     }
/* 206 */     return ☃;
/*     */   }
/*     */   
/*     */   private y.a b(y.a ☃) {
/* 210 */     for (aqe<?> aqe1 : a) {
/* 211 */       ☃.a(aqe.a(aqe1).toString(), ao.a.a(bg.a.a().a(aqe1)));
/*     */     }
/* 213 */     ☃.a(aqe.a(aqe.aN).toString(), ao.a.a(bg.a.a().a(aqe.aN).b(), bg.a.a().a(aqe.aN).b(), bg.a));
/* 214 */     return ☃;
/*     */   }
/*     */   
/*     */   private y.a c(y.a ☃) {
/* 218 */     for (blx blx1 : c) {
/* 219 */       ☃.a(gm.T.b(blx1).a(), bi.a.a(bq.a.a().a(blx1).b()));
/*     */     }
/* 221 */     return ☃;
/*     */   }
/*     */   
/*     */   private y.a d(y.a ☃) {
/* 225 */     for (blx blx1 : b) {
/* 226 */       ☃.a(gm.T.b(blx1).a(), bk.a.a(bq.a, bg.a, bq.a.a().a(blx1).b()));
/*     */     }
/* 228 */     return ☃;
/*     */   }
/*     */   
/*     */   private y.a e(y.a ☃) {
/* 232 */     bab.bq.forEach((integer, vk1) -> ☃.a(vk1.a(), co.a.a(bg.a.a().a(vk1).b())));
/*     */     
/* 234 */     return ☃;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\hq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */