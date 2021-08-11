/*     */ import com.google.common.collect.ImmutableMap;
/*     */ import com.mojang.datafixers.DSL;
/*     */ import com.mojang.datafixers.DataFixer;
/*     */ import com.mojang.datafixers.DataFixerBuilder;
/*     */ import com.mojang.datafixers.Typed;
/*     */ import com.mojang.datafixers.schemas.Schema;
/*     */ import java.util.Map;
/*     */ import java.util.Objects;
/*     */ import java.util.function.BiFunction;
/*     */ import java.util.function.UnaryOperator;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class agb
/*     */ {
/* 200 */   private static final BiFunction<Integer, Schema, Schema> a = Schema::new;
/* 201 */   private static final BiFunction<Integer, Schema, Schema> b = aln::new;
/*     */   
/* 203 */   private static final DataFixer c = b();
/*     */   
/*     */   private static DataFixer b() {
/* 206 */     DataFixerBuilder ☃ = new DataFixerBuilder(w.a().getWorldVersion());
/* 207 */     a(☃);
/* 208 */     return ☃.build(x.e());
/*     */   }
/*     */   
/*     */   public static DataFixer a() {
/* 212 */     return c;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static void a(DataFixerBuilder ☃) {
/* 220 */     Schema schema1 = ☃.addSchema(99, anl::new);
/*     */ 
/*     */     
/* 223 */     Schema schema2 = ☃.addSchema(100, alo::new);
/* 224 */     ☃.addFixer(new ahr(schema2, true));
/*     */     
/* 226 */     Schema schema3 = ☃.addSchema(101, a);
/* 227 */     ☃.addFixer(new agu(schema3, false));
/*     */     
/* 229 */     Schema schema4 = ☃.addSchema(102, alp::new);
/* 230 */     ☃.addFixer(new aiy(schema4, true));
/* 231 */     ☃.addFixer(new aja(schema4, false));
/*     */     
/* 233 */     Schema schema5 = ☃.addSchema(105, a);
/* 234 */     ☃.addFixer(new ajd(schema5, true));
/*     */ 
/*     */     
/* 237 */     Schema schema6 = ☃.addSchema(106, alr::new);
/* 238 */     ☃.addFixer(new aju(schema6, true));
/*     */     
/* 240 */     Schema schema7 = ☃.addSchema(107, als::new);
/* 241 */     ☃.addFixer(new ahx(schema7, true));
/*     */     
/* 243 */     Schema schema8 = ☃.addSchema(108, a);
/* 244 */     ☃.addFixer(new aij(schema8, true));
/*     */     
/* 246 */     Schema schema9 = ☃.addSchema(109, a);
/* 247 */     ☃.addFixer(new ahs(schema9, true));
/*     */     
/* 249 */     Schema schema10 = ☃.addSchema(110, a);
/* 250 */     ☃.addFixer(new aht(schema10, true));
/*     */     
/* 252 */     Schema schema11 = ☃.addSchema(111, a);
/* 253 */     ☃.addFixer(new ahy(schema11, true));
/*     */     
/* 255 */     Schema schema12 = ☃.addSchema(113, a);
/* 256 */     ☃.addFixer(new aid(schema12, true));
/*     */     
/* 258 */     Schema schema13 = ☃.addSchema(135, alu::new);
/* 259 */     ☃.addFixer(new aif(schema13, true));
/*     */     
/* 261 */     Schema schema14 = ☃.addSchema(143, alv::new);
/* 262 */     ☃.addFixer(new ail(schema14, true));
/*     */     
/* 264 */     Schema schema15 = ☃.addSchema(147, a);
/* 265 */     ☃.addFixer(new ahl(schema15, true));
/*     */     
/* 267 */     Schema schema16 = ☃.addSchema(165, a);
/* 268 */     ☃.addFixer(new ajk(schema16, true));
/*     */ 
/*     */     
/* 271 */     Schema schema17 = ☃.addSchema(501, and::new);
/* 272 */     ☃.addFixer(new age(schema17, "Add 1.10 entities fix", akn.p));
/*     */     
/* 274 */     Schema schema18 = ☃.addSchema(502, a);
/* 275 */     ☃.addFixer(ajb.a(schema18, "cooked_fished item renamer", ☃ -> Objects.equals(aln.a(☃), "minecraft:cooked_fished") ? "minecraft:cooked_fish" : ☃));
/*     */ 
/*     */     
/* 278 */     ☃.addFixer(new aip(schema18, false));
/*     */     
/* 280 */     Schema schema19 = ☃.addSchema(505, a);
/* 281 */     ☃.addFixer(new akc(schema19, false));
/*     */ 
/*     */     
/* 284 */     Schema schema20 = ☃.addSchema(700, ane::new);
/* 285 */     ☃.addFixer(new ahq(schema20, true));
/*     */     
/* 287 */     Schema schema21 = ☃.addSchema(701, anf::new);
/* 288 */     ☃.addFixer(new aii(schema21, true));
/*     */     
/* 290 */     Schema schema22 = ☃.addSchema(702, ang::new);
/* 291 */     ☃.addFixer(new aio(schema22, true));
/*     */     
/* 293 */     Schema schema23 = ☃.addSchema(703, anh::new);
/* 294 */     ☃.addFixer(new ahu(schema23, true));
/*     */ 
/*     */     
/* 297 */     Schema schema24 = ☃.addSchema(704, ani::new);
/* 298 */     ☃.addFixer(new agq(schema24, true));
/*     */     
/* 300 */     Schema schema25 = ☃.addSchema(705, anj::new);
/* 301 */     ☃.addFixer(new ahv(schema25, true));
/*     */     
/* 303 */     Schema schema26 = ☃.addSchema(804, b);
/* 304 */     ☃.addFixer(new aiw(schema26, true));
/*     */     
/* 306 */     Schema schema27 = ☃.addSchema(806, b);
/* 307 */     ☃.addFixer(new ajj(schema27, false));
/*     */ 
/*     */     
/* 310 */     Schema schema28 = ☃.addSchema(808, ank::new);
/* 311 */     ☃.addFixer(new age(schema28, "added shulker box", akn.k));
/*     */     
/* 313 */     Schema schema29 = ☃.addSchema(808, 1, b);
/* 314 */     ☃.addFixer(new aig(schema29, false));
/*     */     
/* 316 */     Schema schema30 = ☃.addSchema(813, b);
/* 317 */     ☃.addFixer(new ajc(schema30, false));
/* 318 */     ☃.addFixer(new agt(schema30, false));
/*     */     
/* 320 */     Schema schema31 = ☃.addSchema(816, b);
/* 321 */     ☃.addFixer(new akf(schema31, false));
/*     */ 
/*     */     
/* 324 */     Schema schema32 = ☃.addSchema(820, b);
/* 325 */     ☃.addFixer(ajb.a(schema32, "totem item renamer", a("minecraft:totem", "minecraft:totem_of_undying")));
/*     */ 
/*     */     
/* 328 */     Schema schema33 = ☃.addSchema(1022, alq::new);
/* 329 */     ☃.addFixer(new alj(schema33, "added shoulder entities to players", akn.b));
/*     */     
/* 331 */     Schema schema34 = ☃.addSchema(1125, alt::new);
/* 332 */     ☃.addFixer(new agi(schema34, true));
/* 333 */     ☃.addFixer(new agj(schema34, false));
/*     */ 
/*     */     
/* 336 */     Schema schema35 = ☃.addSchema(1344, b);
/* 337 */     ☃.addFixer(new akd(schema35, false));
/*     */     
/* 339 */     Schema schema36 = ☃.addSchema(1446, b);
/* 340 */     ☃.addFixer(new ake(schema36, false));
/*     */     
/* 342 */     Schema schema37 = ☃.addSchema(1450, b);
/* 343 */     ☃.addFixer(new aha(schema37, false));
/*     */     
/* 345 */     Schema schema38 = ☃.addSchema(1451, alw::new);
/* 346 */     ☃.addFixer(new age(schema38, "AddTrappedChestFix", akn.k));
/*     */     
/* 348 */     Schema schema39 = ☃.addSchema(1451, 1, alx::new);
/* 349 */     ☃.addFixer(new ahe(schema39, true));
/*     */ 
/*     */     
/* 352 */     Schema schema40 = ☃.addSchema(1451, 2, aly::new);
/* 353 */     ☃.addFixer(new ago(schema40, true));
/*     */     
/* 355 */     Schema schema41 = ☃.addSchema(1451, 3, alz::new);
/* 356 */     ☃.addFixer(new ahm(schema41, true));
/* 357 */     ☃.addFixer(new ajf(schema41, false));
/*     */     
/* 359 */     Schema schema42 = ☃.addSchema(1451, 4, ama::new);
/* 360 */     ☃.addFixer(new agw(schema42, true));
/* 361 */     ☃.addFixer(new ajh(schema42, false));
/*     */ 
/*     */     
/* 364 */     Schema schema43 = ☃.addSchema(1451, 5, amb::new);
/* 365 */     ☃.addFixer(new age(schema43, "RemoveNoteBlockFlowerPotFix", akn.k));
/* 366 */     ☃.addFixer(new ajg(schema43, false));
/* 367 */     ☃.addFixer(new ain(schema43, false));
/* 368 */     ☃.addFixer(new agn(schema43, false));
/* 369 */     ☃.addFixer(new ajp(schema43, false));
/*     */     
/* 371 */     Schema schema44 = ☃.addSchema(1451, 6, amc::new);
/* 372 */     ☃.addFixer(new akx(schema44, true));
/* 373 */     ☃.addFixer(new agr(schema44, false));
/*     */     
/* 375 */     Schema schema45 = ☃.addSchema(1451, 7, amd::new);
/* 376 */     ☃.addFixer(new aku(schema45, true));
/*     */     
/* 378 */     Schema schema46 = ☃.addSchema(1451, 7, b);
/* 379 */     ☃.addFixer(new alg(schema46, false));
/*     */     
/* 381 */     Schema schema47 = ☃.addSchema(1456, b);
/* 382 */     ☃.addFixer(new ahw(schema47, false));
/*     */     
/* 384 */     Schema schema48 = ☃.addSchema(1458, b);
/* 385 */     ☃.addFixer(new ahp(schema48, false));
/* 386 */     ☃.addFixer(new aix(schema48, false));
/* 387 */     ☃.addFixer(new agp(schema48, false));
/*     */     
/* 389 */     Schema schema49 = ☃.addSchema(1460, ame::new);
/* 390 */     ☃.addFixer(new ahz(schema49, false));
/*     */     
/* 392 */     Schema schema50 = ☃.addSchema(1466, amf::new);
/* 393 */     ☃.addFixer(new ahi(schema50, true));
/*     */ 
/*     */     
/* 396 */     Schema schema51 = ☃.addSchema(1470, amg::new);
/* 397 */     ☃.addFixer(new age(schema51, "Add 1.13 entities fix", akn.p));
/*     */     
/* 399 */     Schema schema52 = ☃.addSchema(1474, b);
/* 400 */     ☃.addFixer(new ahj(schema52, false));
/* 401 */     ☃.addFixer(agx.a(schema52, "Colorless shulker block fixer", ☃ -> Objects.equals(aln.a(☃), "minecraft:purple_shulker_box") ? "minecraft:shulker_box" : ☃));
/* 402 */     ☃.addFixer(ajb.a(schema52, "Colorless shulker item fixer", ☃ -> Objects.equals(aln.a(☃), "minecraft:purple_shulker_box") ? "minecraft:shulker_box" : ☃));
/*     */     
/* 404 */     Schema schema53 = ☃.addSchema(1475, b);
/* 405 */     ☃.addFixer(agx.a(schema53, "Flowing fixer", a(
/* 406 */             (Map<String, String>)ImmutableMap.of("minecraft:flowing_water", "minecraft:water", "minecraft:flowing_lava", "minecraft:lava"))));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 412 */     Schema schema54 = ☃.addSchema(1480, b);
/* 413 */     ☃.addFixer(agx.a(schema54, "Rename coral blocks", a(akr.a)));
/* 414 */     ☃.addFixer(ajb.a(schema54, "Rename coral items", a(akr.a)));
/*     */     
/* 416 */     Schema schema55 = ☃.addSchema(1481, amh::new);
/* 417 */     ☃.addFixer(new age(schema55, "Add conduit", akn.k));
/*     */     
/* 419 */     Schema schema56 = ☃.addSchema(1483, ami::new);
/* 420 */     ☃.addFixer(new aib(schema56, true));
/* 421 */     ☃.addFixer(ajb.a(schema56, "Rename pufferfish egg item", a(aib.a)));
/*     */     
/* 423 */     Schema schema57 = ☃.addSchema(1484, b);
/* 424 */     ☃.addFixer(ajb.a(schema57, "Rename seagrass items", a((Map<String, String>)ImmutableMap.of("minecraft:sea_grass", "minecraft:seagrass", "minecraft:tall_sea_grass", "minecraft:tall_seagrass"))));
/*     */ 
/*     */ 
/*     */     
/* 428 */     ☃.addFixer(agx.a(schema57, "Rename seagrass blocks", a((Map<String, String>)ImmutableMap.of("minecraft:sea_grass", "minecraft:seagrass", "minecraft:tall_sea_grass", "minecraft:tall_seagrass"))));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 434 */     ☃.addFixer(new aiu(schema57, false));
/*     */ 
/*     */     
/* 437 */     Schema schema58 = ☃.addSchema(1486, amj::new);
/* 438 */     ☃.addFixer(new aho(schema58, true));
/* 439 */     ☃.addFixer(ajb.a(schema58, "Rename cod/salmon egg items", a(aho.b)));
/*     */     
/* 441 */     Schema schema59 = ☃.addSchema(1487, b);
/* 442 */     ☃.addFixer(ajb.a(schema59, "Rename prismarine_brick(s)_* blocks", a((Map<String, String>)ImmutableMap.of("minecraft:prismarine_bricks_slab", "minecraft:prismarine_brick_slab", "minecraft:prismarine_bricks_stairs", "minecraft:prismarine_brick_stairs"))));
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 447 */     ☃.addFixer(agx.a(schema59, "Rename prismarine_brick(s)_* items", a((Map<String, String>)ImmutableMap.of("minecraft:prismarine_bricks_slab", "minecraft:prismarine_brick_slab", "minecraft:prismarine_bricks_stairs", "minecraft:prismarine_brick_stairs"))));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 453 */     Schema schema60 = ☃.addSchema(1488, b);
/* 454 */     ☃.addFixer(agx.a(schema60, "Rename kelp/kelptop", a((Map<String, String>)ImmutableMap.of("minecraft:kelp_top", "minecraft:kelp", "minecraft:kelp", "minecraft:kelp_plant"))));
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 459 */     ☃.addFixer(ajb.a(schema60, "Rename kelptop", a("minecraft:kelp_top", "minecraft:kelp")));
/* 460 */     ☃.addFixer(new ajv(schema60, false, "Command block block entity custom name fix", akn.k, "minecraft:command_block")
/*     */         {
/*     */           protected Typed<?> a(Typed<?> ☃) {
/* 463 */             return ☃.update(DSL.remainderFinder(), ahp::a);
/*     */           }
/*     */         });
/* 466 */     ☃.addFixer(new ajv(schema60, false, "Command block minecart custom name fix", akn.p, "minecraft:commandblock_minecart")
/*     */         {
/*     */           protected Typed<?> a(Typed<?> ☃) {
/* 469 */             return ☃.update(DSL.remainderFinder(), ahp::a);
/*     */           }
/*     */         });
/* 472 */     ☃.addFixer(new aiv(schema60, false));
/*     */     
/* 474 */     Schema schema61 = ☃.addSchema(1490, b);
/* 475 */     ☃.addFixer(agx.a(schema61, "Rename melon_block", a("minecraft:melon_block", "minecraft:melon")));
/* 476 */     ☃.addFixer(ajb.a(schema61, "Rename melon_block/melon/speckled_melon", a((Map<String, String>)ImmutableMap.of("minecraft:melon_block", "minecraft:melon", "minecraft:melon", "minecraft:melon_slice", "minecraft:speckled_melon", "minecraft:glistering_melon_slice"))));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 483 */     Schema schema62 = ☃.addSchema(1492, b);
/* 484 */     ☃.addFixer(new ahh(schema62, false));
/*     */     
/* 486 */     Schema schema63 = ☃.addSchema(1494, b);
/* 487 */     ☃.addFixer(new aje(schema63, false));
/*     */     
/* 489 */     Schema schema64 = ☃.addSchema(1496, b);
/* 490 */     ☃.addFixer(new ajn(schema64, false));
/*     */     
/* 492 */     Schema schema65 = ☃.addSchema(1500, b);
/* 493 */     ☃.addFixer(new ags(schema65, false));
/*     */     
/* 495 */     Schema schema66 = ☃.addSchema(1501, b);
/* 496 */     ☃.addFixer(new agf(schema66, false));
/*     */     
/* 498 */     Schema schema67 = ☃.addSchema(1502, b);
/* 499 */     ☃.addFixer(new akj(schema67, false));
/*     */     
/* 501 */     Schema schema68 = ☃.addSchema(1506, b);
/* 502 */     ☃.addFixer(new ajo(schema68, false));
/*     */     
/* 504 */     Schema schema69 = ☃.addSchema(1510, amk::new);
/* 505 */     ☃.addFixer(agx.a(schema69, "Block renamening fix", a(aik.b)));
/* 506 */     ☃.addFixer(ajb.a(schema69, "Item renamening fix", a(aik.c)));
/* 507 */     ☃.addFixer(new akl(schema69, false));
/* 508 */     ☃.addFixer(new aik(schema69, true));
/* 509 */     ☃.addFixer(new ala(schema69, false));
/*     */     
/* 511 */     Schema schema70 = ☃.addSchema(1514, b);
/* 512 */     ☃.addFixer(new ajx(schema70, false));
/* 513 */     ☃.addFixer(new alb(schema70, false));
/* 514 */     ☃.addFixer(new ajy(schema70, false));
/*     */     
/* 516 */     Schema schema71 = ☃.addSchema(1515, b);
/* 517 */     ☃.addFixer(agx.a(schema71, "Rename coral fan blocks", a(akq.a)));
/*     */     
/* 519 */     Schema schema72 = ☃.addSchema(1624, b);
/* 520 */     ☃.addFixer(new alc(schema72, false));
/*     */     
/* 522 */     Schema schema73 = ☃.addSchema(1800, aml::new);
/* 523 */     ☃.addFixer(new age(schema73, "Added 1.14 mobs fix", akn.p));
/* 524 */     ☃.addFixer(ajb.a(schema73, "Rename dye items", a(ahk.a)));
/*     */     
/* 526 */     Schema schema74 = ☃.addSchema(1801, amm::new);
/* 527 */     ☃.addFixer(new age(schema74, "Added Illager Beast", akn.p));
/*     */     
/* 529 */     Schema schema75 = ☃.addSchema(1802, b);
/* 530 */     ☃.addFixer(agx.a(schema75, "Rename sign blocks & stone slabs", a((Map<String, String>)ImmutableMap.of("minecraft:stone_slab", "minecraft:smooth_stone_slab", "minecraft:sign", "minecraft:oak_sign", "minecraft:wall_sign", "minecraft:oak_wall_sign"))));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 536 */     ☃.addFixer(ajb.a(schema75, "Rename sign item & stone slabs", a((Map<String, String>)ImmutableMap.of("minecraft:stone_slab", "minecraft:smooth_stone_slab", "minecraft:sign", "minecraft:oak_sign"))));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 542 */     Schema schema76 = ☃.addSchema(1803, b);
/* 543 */     ☃.addFixer(new aiz(schema76, false));
/*     */     
/* 545 */     Schema schema77 = ☃.addSchema(1904, amn::new);
/* 546 */     ☃.addFixer(new age(schema77, "Added Cats", akn.p));
/* 547 */     ☃.addFixer(new ahn(schema77, false));
/*     */     
/* 549 */     Schema schema78 = ☃.addSchema(1905, b);
/* 550 */     ☃.addFixer(new ahf(schema78, false));
/*     */     
/* 552 */     Schema schema79 = ☃.addSchema(1906, amo::new);
/* 553 */     ☃.addFixer(new age(schema79, "Add POI Blocks", akn.k));
/*     */     
/* 555 */     Schema schema80 = ☃.addSchema(1909, amp::new);
/* 556 */     ☃.addFixer(new age(schema80, "Add jigsaw", akn.k));
/*     */     
/* 558 */     Schema schema81 = ☃.addSchema(1911, b);
/* 559 */     ☃.addFixer(new ahg(schema81, false));
/*     */     
/* 561 */     Schema schema82 = ☃.addSchema(1917, b);
/* 562 */     ☃.addFixer(new ahb(schema82, false));
/*     */     
/* 564 */     Schema schema83 = ☃.addSchema(1918, b);
/* 565 */     ☃.addFixer(new ald(schema83, "minecraft:villager"));
/* 566 */     ☃.addFixer(new ald(schema83, "minecraft:zombie_villager"));
/*     */     
/* 568 */     Schema schema84 = ☃.addSchema(1920, amq::new);
/* 569 */     ☃.addFixer(new ajw(schema84, false));
/* 570 */     ☃.addFixer(new age(schema84, "Add campfire", akn.k));
/*     */     
/* 572 */     Schema schema85 = ☃.addSchema(1925, b);
/* 573 */     ☃.addFixer(new ajr(schema85, false));
/*     */     
/* 575 */     Schema schema86 = ☃.addSchema(1928, amr::new);
/* 576 */     ☃.addFixer(new aic(schema86, true));
/* 577 */     ☃.addFixer(ajb.a(schema86, "Rename ravager egg item", a(aic.a)));
/*     */     
/* 579 */     Schema schema87 = ☃.addSchema(1929, ams::new);
/* 580 */     ☃.addFixer(new age(schema87, "Add Wandering Trader and Trader Llama", akn.p));
/*     */     
/* 582 */     Schema schema88 = ☃.addSchema(1931, amt::new);
/* 583 */     ☃.addFixer(new age(schema88, "Added Fox", akn.p));
/*     */     
/* 585 */     Schema schema89 = ☃.addSchema(1936, b);
/* 586 */     ☃.addFixer(new akb(schema89, false));
/*     */     
/* 588 */     Schema schema90 = ☃.addSchema(1946, b);
/* 589 */     ☃.addFixer(new aks(schema90, false));
/*     */     
/* 591 */     Schema schema91 = ☃.addSchema(1948, b);
/* 592 */     ☃.addFixer(new aka(schema91, false));
/*     */     
/* 594 */     Schema schema92 = ☃.addSchema(1953, b);
/* 595 */     ☃.addFixer(new ajz(schema92, false));
/*     */     
/* 597 */     Schema schema93 = ☃.addSchema(1955, b);
/* 598 */     ☃.addFixer(new alf(schema93, false));
/* 599 */     ☃.addFixer(new alk(schema93, false));
/*     */     
/* 601 */     Schema schema94 = ☃.addSchema(1961, b);
/* 602 */     ☃.addFixer(new ahd(schema94, false));
/*     */     
/* 604 */     Schema schema95 = ☃.addSchema(1963, b);
/* 605 */     ☃.addFixer(new ako(schema95, false));
/*     */     
/* 607 */     Schema schema96 = ☃.addSchema(2100, amu::new);
/* 608 */     ☃.addFixer(new age(schema96, "Added Bee and Bee Stinger", akn.p));
/* 609 */     ☃.addFixer(new age(schema96, "Add beehive", akn.k));
/* 610 */     ☃.addFixer(new akk(schema96, false, "Rename sugar recipe", a("minecraft:sugar", "sugar_from_sugar_cane")));
/* 611 */     ☃.addFixer(new agg(schema96, false, "Rename sugar recipe advancement", a("minecraft:recipes/misc/sugar", "minecraft:recipes/misc/sugar_from_sugar_cane")));
/*     */     
/* 613 */     Schema schema97 = ☃.addSchema(2202, b);
/* 614 */     ☃.addFixer(new ahc(schema97, false));
/*     */     
/* 616 */     Schema schema98 = ☃.addSchema(2209, b);
/* 617 */     ☃.addFixer(ajb.a(schema98, "Rename bee_hive item to beehive", a("minecraft:bee_hive", "minecraft:beehive")));
/* 618 */     ☃.addFixer(new agk(schema98));
/* 619 */     ☃.addFixer(agx.a(schema98, "Rename bee_hive block to beehive", a("minecraft:bee_hive", "minecraft:beehive")));
/*     */     
/* 621 */     Schema schema99 = ☃.addSchema(2211, b);
/* 622 */     ☃.addFixer(new akz(schema99, false));
/*     */     
/* 624 */     Schema schema100 = ☃.addSchema(2218, b);
/* 625 */     ☃.addFixer(new air(schema100, false));
/*     */     
/* 627 */     Schema schema101 = ☃.addSchema(2501, amv::new);
/* 628 */     ☃.addFixer(new ais(schema101, true));
/*     */     
/* 630 */     Schema schema102 = ☃.addSchema(2502, amw::new);
/* 631 */     ☃.addFixer(new age(schema102, "Added Hoglin", akn.p));
/*     */     
/* 633 */     Schema schema103 = ☃.addSchema(2503, b);
/* 634 */     ☃.addFixer(new alh(schema103, false));
/* 635 */     ☃.addFixer(new agg(schema103, false, "Composter category change", a("minecraft:recipes/misc/composter", "minecraft:recipes/decorations/composter")));
/*     */     
/* 637 */     Schema schema104 = ☃.addSchema(2505, amx::new);
/* 638 */     ☃.addFixer(new age(schema104, "Added Piglin", akn.p));
/* 639 */     ☃.addFixer(new ajs(schema104, "minecraft:villager"));
/*     */     
/* 641 */     Schema schema105 = ☃.addSchema(2508, b);
/* 642 */     ☃.addFixer(ajb.a(schema105, "Renamed fungi items to fungus", a((Map<String, String>)ImmutableMap.of("minecraft:warped_fungi", "minecraft:warped_fungus", "minecraft:crimson_fungi", "minecraft:crimson_fungus"))));
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 647 */     ☃.addFixer(agx.a(schema105, "Renamed fungi blocks to fungus", a((Map<String, String>)ImmutableMap.of("minecraft:warped_fungi", "minecraft:warped_fungus", "minecraft:crimson_fungi", "minecraft:crimson_fungus"))));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 653 */     Schema schema106 = ☃.addSchema(2509, amy::new);
/* 654 */     ☃.addFixer(new aiq(schema106));
/* 655 */     ☃.addFixer(ajb.a(schema106, "Rename zombie pigman egg item", a(aiq.a)));
/*     */     
/* 657 */     Schema schema107 = ☃.addSchema(2511, b);
/* 658 */     ☃.addFixer(new aia(schema107));
/*     */     
/* 660 */     Schema schema108 = ☃.addSchema(2514, b);
/* 661 */     ☃.addFixer(new aim(schema108));
/* 662 */     ☃.addFixer(new agv(schema108));
/* 663 */     ☃.addFixer(new akh(schema108));
/* 664 */     ☃.addFixer(new ajq(schema108));
/* 665 */     ☃.addFixer(new akt(schema108));
/* 666 */     ☃.addFixer(new aji(schema108));
/*     */     
/* 668 */     Schema schema109 = ☃.addSchema(2516, b);
/* 669 */     ☃.addFixer(new ait(schema109, "minecraft:villager"));
/* 670 */     ☃.addFixer(new ait(schema109, "minecraft:zombie_villager"));
/*     */     
/* 672 */     Schema schema110 = ☃.addSchema(2518, b);
/* 673 */     ☃.addFixer(new ajl(schema110, false));
/* 674 */     ☃.addFixer(new ajm(schema110, false));
/*     */     
/* 676 */     Schema schema111 = ☃.addSchema(2519, amz::new);
/* 677 */     ☃.addFixer(new age(schema111, "Added Strider", akn.p));
/*     */     
/* 679 */     Schema schema112 = ☃.addSchema(2522, ana::new);
/* 680 */     ☃.addFixer(new age(schema112, "Added Zoglin", akn.p));
/*     */     
/* 682 */     Schema schema113 = ☃.addSchema(2523, b);
/* 683 */     ☃.addFixer(new agh(schema113));
/*     */     
/* 685 */     Schema schema114 = ☃.addSchema(2527, b);
/* 686 */     ☃.addFixer(new agm(schema114));
/*     */     
/* 688 */     Schema schema115 = ☃.addSchema(2528, b);
/* 689 */     ☃.addFixer(ajb.a(schema115, "Rename soul fire torch and soul fire lantern", 
/* 690 */           a((Map<String, String>)ImmutableMap.of("minecraft:soul_fire_torch", "minecraft:soul_torch", "minecraft:soul_fire_lantern", "minecraft:soul_lantern"))));
/*     */ 
/*     */ 
/*     */     
/* 694 */     ☃.addFixer(agx.a(schema115, "Rename soul fire torch and soul fire lantern", a((Map<String, String>)ImmutableMap.of("minecraft:soul_fire_torch", "minecraft:soul_torch", "minecraft:soul_fire_wall_torch", "minecraft:soul_wall_torch", "minecraft:soul_fire_lantern", "minecraft:soul_lantern"))));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 701 */     Schema schema116 = ☃.addSchema(2529, b);
/* 702 */     ☃.addFixer(new aky(schema116, false));
/*     */     
/* 704 */     Schema schema117 = ☃.addSchema(2531, b);
/* 705 */     ☃.addFixer(new akm(schema117));
/*     */     
/* 707 */     Schema schema118 = ☃.addSchema(2533, b);
/* 708 */     ☃.addFixer(new ale(schema118));
/*     */     
/* 710 */     Schema schema119 = ☃.addSchema(2535, b);
/* 711 */     ☃.addFixer(new aih(schema119));
/*     */     
/* 713 */     Schema schema120 = ☃.addSchema(2550, b);
/* 714 */     ☃.addFixer(new ali(schema120));
/*     */     
/* 716 */     Schema schema121 = ☃.addSchema(2551, anb::new);
/* 717 */     ☃.addFixer(new alj(schema121, "add types to WorldGenData", akn.y));
/*     */     
/* 719 */     Schema schema122 = ☃.addSchema(2552, b);
/* 720 */     ☃.addFixer(new akp(schema122, false, "Nether biome rename", (Map<String, String>)ImmutableMap.of("minecraft:nether", "minecraft:nether_wastes")));
/*     */ 
/*     */     
/* 723 */     Schema schema123 = ☃.addSchema(2553, b);
/* 724 */     ☃.addFixer(new agl(schema123, false));
/*     */     
/* 726 */     Schema schema124 = ☃.addSchema(2558, b);
/* 727 */     ☃.addFixer(new ajt(schema124, false));
/* 728 */     ☃.addFixer(new akg(schema124, false, "Rename swapHands setting", "key_key.swapHands", "key_key.swapOffhand"));
/*     */     
/* 730 */     Schema schema125 = ☃.addSchema(2568, anc::new);
/* 731 */     ☃.addFixer(new age(schema125, "Added Piglin Brute", akn.p));
/*     */   }
/*     */   
/*     */   private static UnaryOperator<String> a(Map<String, String> ☃) {
/* 735 */     return str -> (String)☃.getOrDefault(str, str);
/*     */   }
/*     */   
/*     */   private static UnaryOperator<String> a(String ☃, String str1) {
/* 739 */     return str2 -> Objects.equals(str2, ☃) ? str1 : str2;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\agb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */