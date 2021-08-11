/*     */ import com.google.common.collect.ImmutableList;
/*     */ import java.util.List;
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
/*     */ public class hr
/*     */   implements Consumer<Consumer<y>>
/*     */ {
/*  59 */   private static final List<vj<bsv>> a = (List<vj<bsv>>)ImmutableList.of(btb.i, btb.ax, btb.az, btb.ay, btb.aA);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  67 */   private static final bg.b b = bg.b.a(new dbo[] {
/*  68 */         dbr.a(cyv.c.a, bg.a.a().a(bd.a.a().a(bq.a.a().a(bmd.lo).b()).b())).a().build(), 
/*  69 */         dbr.a(cyv.c.a, bg.a.a().a(bd.a.a().b(bq.a.a().a(bmd.lp).b()).b())).a().build(), 
/*  70 */         dbr.a(cyv.c.a, bg.a.a().a(bd.a.a().c(bq.a.a().a(bmd.lq).b()).b())).a().build(), 
/*  71 */         dbr.a(cyv.c.a, bg.a.a().a(bd.a.a().d(bq.a.a().a(bmd.lr).b()).b())).a().build()
/*     */       });
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(Consumer<y> ☃) {
/*  79 */     y y1 = y.a.a().a(bup.iL, new of("advancements.nether.root.title"), new of("advancements.nether.root.description"), new vk("textures/gui/advancements/backgrounds/nether.png"), ai.a, false, false, false).a("entered_nether", aq.a.a(brx.h)).a(☃, "nether/root");
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  86 */     y y2 = y.a.a().a(y1).a(bmd.oS, new of("advancements.nether.return_to_sender.title"), new of("advancements.nether.return_to_sender.description"), (vk)null, ai.b, true, true, false).a(ab.a.a(50)).a("killed_ghast", bt.a.a(bg.a.a().a(aqe.D), aw.a.a().a(Boolean.valueOf(true)).a(bg.a.a().a(aqe.N)))).a(☃, "nether/return_to_sender");
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  92 */     y y3 = y.a.a().a(y1).a(bup.dV, new of("advancements.nether.find_fortress.title"), new of("advancements.nether.find_fortress.description"), (vk)null, ai.a, true, true, false).a("fortress", bx.a.a(bw.a(cla.n))).a(☃, "nether/find_fortress");
/*     */     
/*  94 */     y.a.a()
/*  95 */       .a(y1)
/*  96 */       .a(bmd.pc, new of("advancements.nether.fast_travel.title"), new of("advancements.nether.fast_travel.description"), (vk)null, ai.b, true, true, false)
/*  97 */       .a(ab.a.a(100))
/*  98 */       .a("travelled", cc.a.a(ay.a(bz.c.b(7000.0F))))
/*  99 */       .a(☃, "nether/fast_travel");
/*     */     
/* 101 */     y.a.a()
/* 102 */       .a(y2)
/* 103 */       .a(bmd.ns, new of("advancements.nether.uneasy_alliance.title"), new of("advancements.nether.uneasy_alliance.description"), (vk)null, ai.b, true, true, false)
/* 104 */       .a(ab.a.a(100))
/* 105 */       .a("killed_ghast", bt.a.a(bg.a.a().a(aqe.D).a(bw.b(brx.g))))
/* 106 */       .a(☃, "nether/uneasy_alliance");
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 112 */     y y4 = y.a.a().a(y3).a(bup.fe, new of("advancements.nether.get_wither_skull.title"), new of("advancements.nether.get_wither_skull.description"), (vk)null, ai.a, true, true, false).a("wither_skull", bn.a.a(new brw[] { bup.fe })).a(☃, "nether/get_wither_skull");
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 118 */     y y5 = y.a.a().a(y4).a(bmd.pm, new of("advancements.nether.summon_wither.title"), new of("advancements.nether.summon_wither.description"), (vk)null, ai.a, true, true, false).a("summoned", cn.a.a(bg.a.a().a(aqe.aT))).a(☃, "nether/summon_wither");
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 124 */     y y6 = y.a.a().a(y3).a(bmd.nr, new of("advancements.nether.obtain_blaze_rod.title"), new of("advancements.nether.obtain_blaze_rod.description"), (vk)null, ai.a, true, true, false).a("blaze_rod", bn.a.a(new brw[] { bmd.nr })).a(☃, "nether/obtain_blaze_rod");
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 130 */     y y7 = y.a.a().a(y5).a(bup.es, new of("advancements.nether.create_beacon.title"), new of("advancements.nether.create_beacon.description"), (vk)null, ai.a, true, true, false).a("beacon", as.a.a(bz.d.b(1))).a(☃, "nether/create_beacon");
/*     */     
/* 132 */     y.a.a()
/* 133 */       .a(y7)
/* 134 */       .a(bup.es, new of("advancements.nether.create_full_beacon.title"), new of("advancements.nether.create_full_beacon.description"), (vk)null, ai.c, true, true, false)
/* 135 */       .a("beacon", as.a.a(bz.d.a(4)))
/* 136 */       .a(☃, "nether/create_full_beacon");
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 142 */     y y8 = y.a.a().a(y6).a(bmd.nv, new of("advancements.nether.brew_potion.title"), new of("advancements.nether.brew_potion.description"), (vk)null, ai.a, true, true, false).a("potion", ap.a.c()).a(☃, "nether/brew_potion");
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 149 */     y y9 = y.a.a().a(y8).a(bmd.lT, new of("advancements.nether.all_potions.title"), new of("advancements.nether.all_potions.description"), (vk)null, ai.b, true, true, false).a(ab.a.a(100)).a("all_effects", az.a.a(ca.a().a(apw.a).a(apw.b).a(apw.e).a(apw.h).a(apw.j).a(apw.l).a(apw.m).a(apw.n).a(apw.p).a(apw.r).a(apw.s).a(apw.B).a(apw.k))).a(☃, "nether/all_potions");
/*     */     
/* 151 */     y.a.a()
/* 152 */       .a(y9)
/* 153 */       .a(bmd.lK, new of("advancements.nether.all_effects.title"), new of("advancements.nether.all_effects.description"), (vk)null, ai.b, true, true, true)
/* 154 */       .a(ab.a.a(1000))
/* 155 */       .a("all_effects", az.a.a(ca.a().a(apw.a).a(apw.b).a(apw.e).a(apw.h).a(apw.j).a(apw.l).a(apw.m).a(apw.n).a(apw.p).a(apw.r).a(apw.s).a(apw.t).a(apw.c).a(apw.d).a(apw.y).a(apw.x).a(apw.v).a(apw.q).a(apw.i).a(apw.k).a(apw.B).a(apw.C).a(apw.D).a(apw.o).a(apw.E).a(apw.F)))
/* 156 */       .a(☃, "nether/all_effects");
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 162 */     y y10 = y.a.a().a(y1).a(bmd.ry, new of("advancements.nether.obtain_ancient_debris.title"), new of("advancements.nether.obtain_ancient_debris.description"), (vk)null, ai.a, true, true, false).a("ancient_debris", bn.a.a(new brw[] { bmd.ry })).a(☃, "nether/obtain_ancient_debris");
/*     */     
/* 164 */     y.a.a()
/* 165 */       .a(y10)
/* 166 */       .a(bmd.lt, new of("advancements.nether.netherite_armor.title"), new of("advancements.nether.netherite_armor.description"), (vk)null, ai.b, true, true, false)
/* 167 */       .a(ab.a.a(100))
/* 168 */       .a("netherite_armor", bn.a.a(new brw[] { bmd.ls, bmd.lt, bmd.lu, bmd.lv
/* 169 */           })).a(☃, "nether/netherite_armor");
/*     */     
/* 171 */     y.a.a()
/* 172 */       .a(y10)
/* 173 */       .a(bmd.rw, new of("advancements.nether.use_lodestone.title"), new of("advancements.nether.use_lodestone.description"), (vk)null, ai.a, true, true, false)
/* 174 */       .a("use_lodestone", br.a.a(bw.a.a().a(an.a.a().a(bup.no).b()), bq.a.a().a(bmd.mh)))
/* 175 */       .a(☃, "nether/use_lodestone");
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 181 */     y y11 = y.a.a().a(y1).a(bmd.rA, new of("advancements.nether.obtain_crying_obsidian.title"), new of("advancements.nether.obtain_crying_obsidian.description"), (vk)null, ai.a, true, true, false).a("crying_obsidian", bn.a.a(new brw[] { bmd.rA })).a(☃, "nether/obtain_crying_obsidian");
/*     */     
/* 183 */     y.a.a()
/* 184 */       .a(y11)
/* 185 */       .a(bmd.rN, new of("advancements.nether.charge_respawn_anchor.title"), new of("advancements.nether.charge_respawn_anchor.description"), (vk)null, ai.a, true, true, false)
/* 186 */       .a("charge_respawn_anchor", br.a.a(bw.a.a().a(an.a.a().a(bup.nj).a(cm.a.a().a(bzj.a, 4).b()).b()), bq.a.a().a(bup.cS)))
/* 187 */       .a(☃, "nether/charge_respawn_anchor");
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 196 */     y y12 = y.a.a().a(y1).a(bmd.pl, new of("advancements.nether.ride_strider.title"), new of("advancements.nether.ride_strider.description"), (vk)null, ai.a, true, true, false).a("used_warped_fungus_on_a_stick", bo.a.a(bg.b.a(bg.a.a().a(bg.a.a().a(aqe.aF).b()).b()), bq.a.a().a(bmd.pl).b(), bz.d.e)).a(☃, "nether/ride_strider");
/*     */     
/* 198 */     hp.a(y.a.a(), a)
/* 199 */       .a(y12)
/* 200 */       .a(bmd.lv, new of("advancements.nether.explore_nether.title"), new of("advancements.nether.explore_nether.description"), (vk)null, ai.b, true, true, false)
/* 201 */       .a(ab.a.a(500))
/* 202 */       .a(☃, "nether/explore_nether");
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 208 */     y y13 = y.a.a().a(y1).a(bmd.rJ, new of("advancements.nether.find_bastion.title"), new of("advancements.nether.find_bastion.description"), (vk)null, ai.a, true, true, false).a("bastion", bx.a.a(bw.a(cla.s))).a(☃, "nether/find_bastion");
/*     */     
/* 210 */     y.a.a()
/* 211 */       .a(y13)
/* 212 */       .a(bup.bR, new of("advancements.nether.loot_bastion.title"), new of("advancements.nether.loot_bastion.description"), (vk)null, ai.a, true, true, false)
/* 213 */       .a(aj.b)
/* 214 */       .a("loot_bastion_other", by.a.a(new vk("minecraft:chests/bastion_other")))
/* 215 */       .a("loot_bastion_treasure", by.a.a(new vk("minecraft:chests/bastion_treasure")))
/* 216 */       .a("loot_bastion_hoglin_stable", by.a.a(new vk("minecraft:chests/bastion_hoglin_stable")))
/* 217 */       .a("loot_bastion_bridge", by.a.a(new vk("minecraft:chests/bastion_bridge")))
/* 218 */       .a(☃, "nether/loot_bastion");
/*     */     
/* 220 */     y.a.a()
/* 221 */       .a(y1)
/* 222 */       .a(aj.b)
/* 223 */       .a(bmd.ki, new of("advancements.nether.distract_piglin.title"), new of("advancements.nether.distract_piglin.description"), (vk)null, ai.a, true, true, false)
/* 224 */       .a("distract_piglin", bp.a.a(b, 
/*     */           
/* 226 */           bq.a.a().a(aeg.O), 
/* 227 */           bg.b.a(bg.a.a().a(aqe.ai).a(be.a.a().e(Boolean.valueOf(false)).b()).b())))
/*     */       
/* 229 */       .a("distract_piglin_directly", cf.a.a(b, 
/*     */           
/* 231 */           bq.a.a().a(bet.a), 
/* 232 */           bg.b.a(bg.a.a().a(aqe.ai).a(be.a.a().e(Boolean.valueOf(false)).b()).b())))
/*     */       
/* 234 */       .a(☃, "nether/distract_piglin");
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\hr.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */