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
/*     */ public class hp
/*     */   implements Consumer<Consumer<y>>
/*     */ {
/*  50 */   private static final List<vj<bsv>> a = (List<vj<bsv>>)ImmutableList.of(btb.C, btb.h, btb.g, btb.c, btb.s, btb.H, btb.E, btb.L, btb.e, btb.z, btb.m, btb.t, (Object[])new vj[] { btb.n, btb.M, btb.J, btb.b, btb.l, btb.G, btb.A, btb.w, btb.x, btb.p, btb.d, btb.r, btb.v, btb.q, btb.K, btb.F, btb.N, btb.D, btb.f, btb.B, btb.o, btb.I, btb.S, btb.T, btb.U, btb.W, btb.X, btb.Y, btb.av, btb.aw });
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
/*  96 */   private static final aqe<?>[] b = new aqe[] { aqe.f, aqe.i, aqe.m, aqe.q, aqe.r, aqe.t, aqe.u, aqe.v, aqe.w, aqe.D, aqe.F, aqe.G, aqe.I, aqe.S, aqe.ag, aqe.ai, aqe.aj, aqe.ak, aqe.ap, aqe.as, aqe.au, aqe.av, aqe.ax, aqe.aC, aqe.aE, aqe.aO, aqe.aQ, aqe.aS, aqe.aU, aqe.aT, aqe.aX, aqe.ba, aqe.aY, aqe.bb };
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
/* 140 */     y y1 = y.a.a().a(bmd.pc, new of("advancements.adventure.root.title"), new of("advancements.adventure.root.description"), new vk("textures/gui/advancements/backgrounds/adventure.png"), ai.a, false, false, false).a(aj.b).a("killed_something", bt.a.c()).a("killed_by_something", bt.a.d()).a(☃, "adventure/root");
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 146 */     y y2 = y.a.a().a(y1).a(bup.aL, new of("advancements.adventure.sleep_in_bed.title"), new of("advancements.adventure.sleep_in_bed.description"), (vk)null, ai.a, true, true, false).a("slept_in_bed", bx.a.c()).a(☃, "adventure/sleep_in_bed");
/*     */     
/* 148 */     a(y.a.a(), a)
/* 149 */       .a(y2)
/* 150 */       .a(bmd.ln, new of("advancements.adventure.adventuring_time.title"), new of("advancements.adventure.adventuring_time.description"), (vk)null, ai.b, true, true, false)
/* 151 */       .a(ab.a.a(500))
/* 152 */       .a(☃, "adventure/adventuring_time");
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 158 */     y y3 = y.a.a().a(y1).a(bmd.oV, new of("advancements.adventure.trade.title"), new of("advancements.adventure.trade.description"), (vk)null, ai.a, true, true, false).a("traded", cr.a.c()).a(☃, "adventure/trade");
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 164 */     y y4 = a(y.a.a()).a(y1).a(bmd.kA, new of("advancements.adventure.kill_a_mob.title"), new of("advancements.adventure.kill_a_mob.description"), (vk)null, ai.a, true, true, false).a(aj.b).a(☃, "adventure/kill_a_mob");
/*     */     
/* 166 */     a(y.a.a())
/* 167 */       .a(y4)
/* 168 */       .a(bmd.kF, new of("advancements.adventure.kill_all_mobs.title"), new of("advancements.adventure.kill_all_mobs.description"), (vk)null, ai.b, true, true, false)
/* 169 */       .a(ab.a.a(100))
/* 170 */       .a(☃, "adventure/kill_all_mobs");
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 176 */     y y5 = y.a.a().a(y4).a(bmd.kc, new of("advancements.adventure.shoot_arrow.title"), new of("advancements.adventure.shoot_arrow.description"), (vk)null, ai.a, true, true, false).a("shot_arrow", ce.a.a(av.a.a().a(aw.a.a().a(Boolean.valueOf(true)).a(bg.a.a().a(aee.e))))).a(☃, "adventure/shoot_arrow");
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 182 */     y y6 = y.a.a().a(y4).a(bmd.qM, new of("advancements.adventure.throw_trident.title"), new of("advancements.adventure.throw_trident.description"), (vk)null, ai.a, true, true, false).a("shot_trident", ce.a.a(av.a.a().a(aw.a.a().a(Boolean.valueOf(true)).a(bg.a.a().a(aqe.aK))))).a(☃, "adventure/throw_trident");
/*     */     
/* 184 */     y.a.a()
/* 185 */       .a(y6)
/* 186 */       .a(bmd.qM, new of("advancements.adventure.very_very_frightening.title"), new of("advancements.adventure.very_very_frightening.description"), (vk)null, ai.a, true, true, false)
/* 187 */       .a("struck_villager", ar.a.a(new bg[] { bg.a.a().a(aqe.aP).b()
/* 188 */           })).a(☃, "adventure/very_very_frightening");
/*     */     
/* 190 */     y.a.a()
/* 191 */       .a(y3)
/* 192 */       .a(bup.cU, new of("advancements.adventure.summon_iron_golem.title"), new of("advancements.adventure.summon_iron_golem.description"), (vk)null, ai.c, true, true, false)
/* 193 */       .a("summoned_golem", cn.a.a(bg.a.a().a(aqe.K)))
/* 194 */       .a(☃, "adventure/summon_iron_golem");
/*     */     
/* 196 */     y.a.a()
/* 197 */       .a(y5)
/* 198 */       .a(bmd.kd, new of("advancements.adventure.sniper_duel.title"), new of("advancements.adventure.sniper_duel.description"), (vk)null, ai.b, true, true, false)
/* 199 */       .a(ab.a.a(50))
/* 200 */       .a("killed_skeleton", bt.a.a(bg.a.a().a(aqe.av).a(ay.a(bz.c.b(50.0F))), aw.a.a().a(Boolean.valueOf(true))))
/* 201 */       .a(☃, "adventure/sniper_duel");
/*     */     
/* 203 */     y.a.a()
/* 204 */       .a(y4)
/* 205 */       .a(bmd.qu, new of("advancements.adventure.totem_of_undying.title"), new of("advancements.adventure.totem_of_undying.description"), (vk)null, ai.c, true, true, false)
/* 206 */       .a("used_totem", ct.a.a(bmd.qu))
/* 207 */       .a(☃, "adventure/totem_of_undying");
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 213 */     y y7 = y.a.a().a(y1).a(bmd.qQ, new of("advancements.adventure.ol_betsy.title"), new of("advancements.adventure.ol_betsy.description"), (vk)null, ai.a, true, true, false).a("shot_crossbow", cj.a.a(bmd.qQ)).a(☃, "adventure/ol_betsy");
/*     */     
/* 215 */     y.a.a()
/* 216 */       .a(y7)
/* 217 */       .a(bmd.qQ, new of("advancements.adventure.whos_the_pillager_now.title"), new of("advancements.adventure.whos_the_pillager_now.description"), (vk)null, ai.a, true, true, false)
/* 218 */       .a("kill_pillager", bs.a.a(new bg.a[] { bg.a.a().a(aqe.ak)
/* 219 */           })).a(☃, "adventure/whos_the_pillager_now");
/*     */     
/* 221 */     y.a.a()
/* 222 */       .a(y7)
/* 223 */       .a(bmd.qQ, new of("advancements.adventure.two_birds_one_arrow.title"), new of("advancements.adventure.two_birds_one_arrow.description"), (vk)null, ai.b, true, true, false)
/* 224 */       .a(ab.a.a(65))
/* 225 */       .a("two_birds", bs.a.a(new bg.a[] { bg.a.a().a(aqe.ag), bg.a.a().a(aqe.ag)
/* 226 */           })).a(☃, "adventure/two_birds_one_arrow");
/*     */     
/* 228 */     y.a.a()
/* 229 */       .a(y7)
/* 230 */       .a(bmd.qQ, new of("advancements.adventure.arbalistic.title"), new of("advancements.adventure.arbalistic.description"), (vk)null, ai.b, true, true, true)
/* 231 */       .a(ab.a.a(85))
/* 232 */       .a("arbalistic", bs.a.a(bz.d.a(5)))
/* 233 */       .a(☃, "adventure/arbalistic");
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 239 */     y y8 = y.a.a().a(y1).a(bhb.s(), new of("advancements.adventure.voluntary_exile.title"), new of("advancements.adventure.voluntary_exile.description"), (vk)null, ai.a, true, true, true).a("voluntary_exile", bt.a.a(bg.a.a().a(aee.c).a(bd.b))).a(☃, "adventure/voluntary_exile");
/*     */     
/* 241 */     y.a.a()
/* 242 */       .a(y8)
/* 243 */       .a(bhb.s(), new of("advancements.adventure.hero_of_the_village.title"), new of("advancements.adventure.hero_of_the_village.description"), (vk)null, ai.b, true, true, true)
/* 244 */       .a(ab.a.a(100))
/* 245 */       .a("hero_of_the_village", bx.a.d())
/* 246 */       .a(☃, "adventure/hero_of_the_village");
/*     */     
/* 248 */     y.a.a()
/* 249 */       .a(y1)
/* 250 */       .a(bup.ne.h(), new of("advancements.adventure.honey_block_slide.title"), new of("advancements.adventure.honey_block_slide.description"), (vk)null, ai.a, true, true, false)
/* 251 */       .a("honey_block_slide", cl.a.a(bup.ne))
/* 252 */       .a(☃, "adventure/honey_block_slide");
/*     */     
/* 254 */     y.a.a()
/* 255 */       .a(y5)
/* 256 */       .a(bup.nb.h(), new of("advancements.adventure.bullseye.title"), new of("advancements.adventure.bullseye.description"), (vk)null, ai.b, true, true, false)
/* 257 */       .a(ab.a.a(50))
/* 258 */       .a("bullseye", cp.a.a(bz.d.a(15), bg.b.a(bg.a.a().a(ay.a(bz.c.b(30.0F))).b())))
/* 259 */       .a(☃, "adventure/bullseye");
/*     */   }
/*     */   
/*     */   private y.a a(y.a ☃) {
/* 263 */     for (aqe<?> aqe1 : b) {
/* 264 */       ☃.a(gm.S.b(aqe1).toString(), bt.a.a(bg.a.a().a(aqe1)));
/*     */     }
/* 266 */     return ☃;
/*     */   }
/*     */   
/*     */   protected static y.a a(y.a ☃, List<vj<bsv>> list) {
/* 270 */     for (vj<bsv> vj : list) {
/* 271 */       ☃.a(vj.a().toString(), bx.a.a(bw.a(vj)));
/*     */     }
/* 273 */     return ☃;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\hp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */