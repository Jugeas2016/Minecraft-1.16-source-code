/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.collect.Maps;
/*     */ import com.google.common.collect.Sets;
/*     */ import com.mojang.datafixers.DataFix;
/*     */ import com.mojang.datafixers.DataFixUtils;
/*     */ import com.mojang.datafixers.TypeRewriteRule;
/*     */ import com.mojang.datafixers.schemas.Schema;
/*     */ import com.mojang.datafixers.types.Type;
/*     */ import com.mojang.serialization.Dynamic;
/*     */ import it.unimi.dsi.fastutil.ints.Int2ObjectLinkedOpenHashMap;
/*     */ import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
/*     */ import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
/*     */ import it.unimi.dsi.fastutil.ints.IntArrayList;
/*     */ import it.unimi.dsi.fastutil.ints.IntList;
/*     */ import it.unimi.dsi.fastutil.ints.IntListIterator;
/*     */ import it.unimi.dsi.fastutil.objects.ObjectIterator;
/*     */ import java.nio.ByteBuffer;
/*     */ import java.util.Arrays;
/*     */ import java.util.BitSet;
/*     */ import java.util.HashMap;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Objects;
/*     */ import java.util.Optional;
/*     */ import java.util.Set;
/*     */ import java.util.function.Supplier;
/*     */ import java.util.stream.Stream;
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
/*     */ public class ahe
/*     */   extends DataFix
/*     */ {
/*     */   public ahe(Schema ☃, boolean bool) {
/*  43 */     super(☃, bool);
/*     */   }
/*     */   
/*  46 */   private static final Logger a = LogManager.getLogger();
/*     */   
/*  48 */   private static final BitSet b = new BitSet(256);
/*  49 */   private static final BitSet c = new BitSet(256);
/*  50 */   private static final Dynamic<?> d = agz.b("{Name:'minecraft:pumpkin'}");
/*  51 */   private static final Dynamic<?> e = agz.b("{Name:'minecraft:podzol',Properties:{snowy:'true'}}");
/*  52 */   private static final Dynamic<?> f = agz.b("{Name:'minecraft:grass_block',Properties:{snowy:'true'}}");
/*  53 */   private static final Dynamic<?> g = agz.b("{Name:'minecraft:mycelium',Properties:{snowy:'true'}}");
/*  54 */   private static final Dynamic<?> h = agz.b("{Name:'minecraft:sunflower',Properties:{half:'upper'}}");
/*  55 */   private static final Dynamic<?> i = agz.b("{Name:'minecraft:lilac',Properties:{half:'upper'}}");
/*  56 */   private static final Dynamic<?> j = agz.b("{Name:'minecraft:tall_grass',Properties:{half:'upper'}}");
/*  57 */   private static final Dynamic<?> k = agz.b("{Name:'minecraft:large_fern',Properties:{half:'upper'}}");
/*  58 */   private static final Dynamic<?> l = agz.b("{Name:'minecraft:rose_bush',Properties:{half:'upper'}}");
/*  59 */   private static final Dynamic<?> m = agz.b("{Name:'minecraft:peony',Properties:{half:'upper'}}");
/*     */   private static final Map<String, Dynamic<?>> n; private static final Map<String, Dynamic<?>> o; private static final Map<String, Dynamic<?>> p; private static final Map<String, Dynamic<?>> q; private static final Int2ObjectMap<String> r; private static final Map<String, Dynamic<?>> s; private static final Map<String, Dynamic<?>> t; private static void a(Map<String, Dynamic<?>> ☃, int i, String str1, String str2) { ☃.put(i + "north", agz.b("{Name:'minecraft:" + str1 + "_wall_" + str2 + "',Properties:{facing:'north'}}")); ☃.put(i + "east", agz.b("{Name:'minecraft:" + str1 + "_wall_" + str2 + "',Properties:{facing:'east'}}")); ☃.put(i + "south", agz.b("{Name:'minecraft:" + str1 + "_wall_" + str2 + "',Properties:{facing:'south'}}")); ☃.put(i + "west", agz.b("{Name:'minecraft:" + str1 + "_wall_" + str2 + "',Properties:{facing:'west'}}")); for (int j = 0; j < 16; j++)
/*  61 */       ☃.put(i + "" + j, agz.b("{Name:'minecraft:" + str1 + "_" + str2 + "',Properties:{rotation:'" + j + "'}}"));  } static { n = (Map<String, Dynamic<?>>)DataFixUtils.make(Maps.newHashMap(), ☃ -> {
/*     */           ☃.put("minecraft:air0", agz.b("{Name:'minecraft:flower_pot'}"));
/*     */           
/*     */           ☃.put("minecraft:red_flower0", agz.b("{Name:'minecraft:potted_poppy'}"));
/*     */           ☃.put("minecraft:red_flower1", agz.b("{Name:'minecraft:potted_blue_orchid'}"));
/*     */           ☃.put("minecraft:red_flower2", agz.b("{Name:'minecraft:potted_allium'}"));
/*     */           ☃.put("minecraft:red_flower3", agz.b("{Name:'minecraft:potted_azure_bluet'}"));
/*     */           ☃.put("minecraft:red_flower4", agz.b("{Name:'minecraft:potted_red_tulip'}"));
/*     */           ☃.put("minecraft:red_flower5", agz.b("{Name:'minecraft:potted_orange_tulip'}"));
/*     */           ☃.put("minecraft:red_flower6", agz.b("{Name:'minecraft:potted_white_tulip'}"));
/*     */           ☃.put("minecraft:red_flower7", agz.b("{Name:'minecraft:potted_pink_tulip'}"));
/*     */           ☃.put("minecraft:red_flower8", agz.b("{Name:'minecraft:potted_oxeye_daisy'}"));
/*     */           ☃.put("minecraft:yellow_flower0", agz.b("{Name:'minecraft:potted_dandelion'}"));
/*     */           ☃.put("minecraft:sapling0", agz.b("{Name:'minecraft:potted_oak_sapling'}"));
/*     */           ☃.put("minecraft:sapling1", agz.b("{Name:'minecraft:potted_spruce_sapling'}"));
/*     */           ☃.put("minecraft:sapling2", agz.b("{Name:'minecraft:potted_birch_sapling'}"));
/*     */           ☃.put("minecraft:sapling3", agz.b("{Name:'minecraft:potted_jungle_sapling'}"));
/*     */           ☃.put("minecraft:sapling4", agz.b("{Name:'minecraft:potted_acacia_sapling'}"));
/*     */           ☃.put("minecraft:sapling5", agz.b("{Name:'minecraft:potted_dark_oak_sapling'}"));
/*     */           ☃.put("minecraft:red_mushroom0", agz.b("{Name:'minecraft:potted_red_mushroom'}"));
/*     */           ☃.put("minecraft:brown_mushroom0", agz.b("{Name:'minecraft:potted_brown_mushroom'}"));
/*     */           ☃.put("minecraft:deadbush0", agz.b("{Name:'minecraft:potted_dead_bush'}"));
/*     */           ☃.put("minecraft:tallgrass2", agz.b("{Name:'minecraft:potted_fern'}"));
/*     */           ☃.put("minecraft:cactus0", agz.b(2240));
/*     */         });
/*  86 */     o = (Map<String, Dynamic<?>>)DataFixUtils.make(Maps.newHashMap(), ☃ -> {
/*     */           a(☃, 0, "skeleton", "skull");
/*     */ 
/*     */           
/*     */           a(☃, 1, "wither_skeleton", "skull");
/*     */ 
/*     */           
/*     */           a(☃, 2, "zombie", "head");
/*     */ 
/*     */           
/*     */           a(☃, 3, "player", "head");
/*     */ 
/*     */           
/*     */           a(☃, 4, "creeper", "head");
/*     */ 
/*     */           
/*     */           a(☃, 5, "dragon", "head");
/*     */         });
/*     */     
/* 105 */     p = (Map<String, Dynamic<?>>)DataFixUtils.make(Maps.newHashMap(), ☃ -> {
/*     */           a(☃, "oak_door", 1024);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/*     */           a(☃, "iron_door", 1136);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/*     */           a(☃, "spruce_door", 3088);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/*     */           a(☃, "birch_door", 3104);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/*     */           a(☃, "jungle_door", 3120);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/*     */           a(☃, "acacia_door", 3136);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/*     */           a(☃, "dark_oak_door", 3152);
/*     */         });
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 182 */     q = (Map<String, Dynamic<?>>)DataFixUtils.make(Maps.newHashMap(), ☃ -> {
/*     */           for (int i = 0; i < 26; i++) {
/*     */             ☃.put("true" + i, agz.b("{Name:'minecraft:note_block',Properties:{powered:'true',note:'" + i + "'}}"));
/*     */             
/*     */             ☃.put("false" + i, agz.b("{Name:'minecraft:note_block',Properties:{powered:'false',note:'" + i + "'}}"));
/*     */           } 
/*     */         });
/* 189 */     r = (Int2ObjectMap<String>)DataFixUtils.make(new Int2ObjectOpenHashMap(), ☃ -> {
/*     */           ☃.put(0, "white");
/*     */           
/*     */           ☃.put(1, "orange");
/*     */           ☃.put(2, "magenta");
/*     */           ☃.put(3, "light_blue");
/*     */           ☃.put(4, "yellow");
/*     */           ☃.put(5, "lime");
/*     */           ☃.put(6, "pink");
/*     */           ☃.put(7, "gray");
/*     */           ☃.put(8, "light_gray");
/*     */           ☃.put(9, "cyan");
/*     */           ☃.put(10, "purple");
/*     */           ☃.put(11, "blue");
/*     */           ☃.put(12, "brown");
/*     */           ☃.put(13, "green");
/*     */           ☃.put(14, "red");
/*     */           ☃.put(15, "black");
/*     */         });
/* 208 */     s = (Map<String, Dynamic<?>>)DataFixUtils.make(Maps.newHashMap(), ☃ -> {
/*     */           ObjectIterator<Int2ObjectMap.Entry<String>> objectIterator = r.int2ObjectEntrySet().iterator();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/*     */           while (objectIterator.hasNext()) {
/*     */             Int2ObjectMap.Entry<String> entry = objectIterator.next();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             
/*     */             if (!Objects.equals(entry.getValue(), "red")) {
/*     */               a(☃, entry.getIntKey(), (String)entry.getValue());
/*     */             }
/*     */           } 
/*     */         });
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 231 */     t = (Map<String, Dynamic<?>>)DataFixUtils.make(Maps.newHashMap(), ☃ -> {
/*     */           ObjectIterator<Int2ObjectMap.Entry<String>> objectIterator = r.int2ObjectEntrySet().iterator();
/*     */ 
/*     */ 
/*     */ 
/*     */           
/*     */           while (objectIterator.hasNext()) {
/*     */             Int2ObjectMap.Entry<String> entry = objectIterator.next();
/*     */ 
/*     */ 
/*     */ 
/*     */             
/*     */             if (!Objects.equals(entry.getValue(), "white")) {
/*     */               b(☃, 15 - entry.getIntKey(), (String)entry.getValue());
/*     */             }
/*     */           } 
/*     */         });
/*     */ 
/*     */ 
/*     */     
/* 251 */     c.set(2);
/* 252 */     c.set(3);
/* 253 */     c.set(110);
/*     */     
/* 255 */     c.set(140);
/* 256 */     c.set(144);
/*     */     
/* 258 */     c.set(25);
/*     */     
/* 260 */     c.set(86);
/*     */ 
/*     */     
/* 263 */     c.set(26);
/* 264 */     c.set(176);
/* 265 */     c.set(177);
/*     */     
/* 267 */     c.set(175);
/*     */     
/* 269 */     c.set(64);
/* 270 */     c.set(71);
/* 271 */     c.set(193);
/* 272 */     c.set(194);
/* 273 */     c.set(195);
/* 274 */     c.set(196);
/* 275 */     c.set(197);
/*     */     
/* 277 */     b.set(54);
/* 278 */     b.set(146);
/*     */     
/* 280 */     b.set(25);
/*     */     
/* 282 */     b.set(26);
/*     */     
/* 284 */     b.set(51);
/*     */     
/* 286 */     b.set(53);
/* 287 */     b.set(67);
/* 288 */     b.set(108);
/* 289 */     b.set(109);
/* 290 */     b.set(114);
/* 291 */     b.set(128);
/* 292 */     b.set(134);
/* 293 */     b.set(135);
/* 294 */     b.set(136);
/* 295 */     b.set(156);
/* 296 */     b.set(163);
/* 297 */     b.set(164);
/* 298 */     b.set(180);
/* 299 */     b.set(203);
/*     */     
/* 301 */     b.set(55);
/*     */     
/* 303 */     b.set(85);
/* 304 */     b.set(113);
/* 305 */     b.set(188);
/* 306 */     b.set(189);
/* 307 */     b.set(190);
/* 308 */     b.set(191);
/* 309 */     b.set(192);
/*     */     
/* 311 */     b.set(93);
/* 312 */     b.set(94);
/*     */     
/* 314 */     b.set(101);
/* 315 */     b.set(102);
/* 316 */     b.set(160);
/*     */     
/* 318 */     b.set(106);
/*     */ 
/*     */     
/* 321 */     b.set(107);
/* 322 */     b.set(183);
/* 323 */     b.set(184);
/* 324 */     b.set(185);
/* 325 */     b.set(186);
/* 326 */     b.set(187);
/*     */     
/* 328 */     b.set(132);
/* 329 */     b.set(139);
/*     */     
/* 331 */     b.set(199); }
/*     */   private static void a(Map<String, Dynamic<?>> ☃, String str, int i) { ☃.put("minecraft:" + str + "eastlowerleftfalsefalse", agz.b("{Name:'minecraft:" + str + "',Properties:{facing:'east',half:'lower',hinge:'left',open:'false',powered:'false'}}")); ☃.put("minecraft:" + str + "eastlowerleftfalsetrue", agz.b("{Name:'minecraft:" + str + "',Properties:{facing:'east',half:'lower',hinge:'left',open:'false',powered:'true'}}")); ☃.put("minecraft:" + str + "eastlowerlefttruefalse", agz.b("{Name:'minecraft:" + str + "',Properties:{facing:'east',half:'lower',hinge:'left',open:'true',powered:'false'}}")); ☃.put("minecraft:" + str + "eastlowerlefttruetrue", agz.b("{Name:'minecraft:" + str + "',Properties:{facing:'east',half:'lower',hinge:'left',open:'true',powered:'true'}}")); ☃.put("minecraft:" + str + "eastlowerrightfalsefalse", agz.b(i)); ☃.put("minecraft:" + str + "eastlowerrightfalsetrue", agz.b("{Name:'minecraft:" + str + "',Properties:{facing:'east',half:'lower',hinge:'right',open:'false',powered:'true'}}")); ☃.put("minecraft:" + str + "eastlowerrighttruefalse", agz.b(i + 4)); ☃.put("minecraft:" + str + "eastlowerrighttruetrue", agz.b("{Name:'minecraft:" + str + "',Properties:{facing:'east',half:'lower',hinge:'right',open:'true',powered:'true'}}")); ☃.put("minecraft:" + str + "eastupperleftfalsefalse", agz.b(i + 8)); ☃.put("minecraft:" + str + "eastupperleftfalsetrue", agz.b(i + 10)); ☃.put("minecraft:" + str + "eastupperlefttruefalse", agz.b("{Name:'minecraft:" + str + "',Properties:{facing:'east',half:'upper',hinge:'left',open:'true',powered:'false'}}")); ☃.put("minecraft:" + str + "eastupperlefttruetrue", agz.b("{Name:'minecraft:" + str + "',Properties:{facing:'east',half:'upper',hinge:'left',open:'true',powered:'true'}}")); ☃.put("minecraft:" + str + "eastupperrightfalsefalse", agz.b(i + 9)); ☃.put("minecraft:" + str + "eastupperrightfalsetrue", agz.b(i + 11)); ☃.put("minecraft:" + str + "eastupperrighttruefalse", agz.b("{Name:'minecraft:" + str + "',Properties:{facing:'east',half:'upper',hinge:'right',open:'true',powered:'false'}}")); ☃.put("minecraft:" + str + "eastupperrighttruetrue", agz.b("{Name:'minecraft:" + str + "',Properties:{facing:'east',half:'upper',hinge:'right',open:'true',powered:'true'}}")); ☃.put("minecraft:" + str + "northlowerleftfalsefalse", agz.b("{Name:'minecraft:" + str + "',Properties:{facing:'north',half:'lower',hinge:'left',open:'false',powered:'false'}}")); ☃.put("minecraft:" + str + "northlowerleftfalsetrue", agz.b("{Name:'minecraft:" + str + "',Properties:{facing:'north',half:'lower',hinge:'left',open:'false',powered:'true'}}")); ☃.put("minecraft:" + str + "northlowerlefttruefalse", agz.b("{Name:'minecraft:" + str + "',Properties:{facing:'north',half:'lower',hinge:'left',open:'true',powered:'false'}}")); ☃.put("minecraft:" + str + "northlowerlefttruetrue", agz.b("{Name:'minecraft:" + str + "',Properties:{facing:'north',half:'lower',hinge:'left',open:'true',powered:'true'}}")); ☃.put("minecraft:" + str + "northlowerrightfalsefalse", agz.b(i + 3)); ☃.put("minecraft:" + str + "northlowerrightfalsetrue", agz.b("{Name:'minecraft:" + str + "',Properties:{facing:'north',half:'lower',hinge:'right',open:'false',powered:'true'}}")); ☃.put("minecraft:" + str + "northlowerrighttruefalse", agz.b(i + 7)); ☃.put("minecraft:" + str + "northlowerrighttruetrue", agz.b("{Name:'minecraft:" + str + "',Properties:{facing:'north',half:'lower',hinge:'right',open:'true',powered:'true'}}")); ☃.put("minecraft:" + str + "northupperleftfalsefalse", agz.b("{Name:'minecraft:" + str + "',Properties:{facing:'north',half:'upper',hinge:'left',open:'false',powered:'false'}}")); ☃.put("minecraft:" + str + "northupperleftfalsetrue", agz.b("{Name:'minecraft:" + str + "',Properties:{facing:'north',half:'upper',hinge:'left',open:'false',powered:'true'}}")); ☃.put("minecraft:" + str + "northupperlefttruefalse", agz.b("{Name:'minecraft:" + str + "',Properties:{facing:'north',half:'upper',hinge:'left',open:'true',powered:'false'}}")); ☃.put("minecraft:" + str + "northupperlefttruetrue", agz.b("{Name:'minecraft:" + str + "',Properties:{facing:'north',half:'upper',hinge:'left',open:'true',powered:'true'}}")); ☃.put("minecraft:" + str + "northupperrightfalsefalse", agz.b("{Name:'minecraft:" + str + "',Properties:{facing:'north',half:'upper',hinge:'right',open:'false',powered:'false'}}")); ☃.put("minecraft:" + str + "northupperrightfalsetrue", agz.b("{Name:'minecraft:" + str + "',Properties:{facing:'north',half:'upper',hinge:'right',open:'false',powered:'true'}}")); ☃.put("minecraft:" + str + "northupperrighttruefalse", agz.b("{Name:'minecraft:" + str + "',Properties:{facing:'north',half:'upper',hinge:'right',open:'true',powered:'false'}}")); ☃.put("minecraft:" + str + "northupperrighttruetrue", agz.b("{Name:'minecraft:" + str + "',Properties:{facing:'north',half:'upper',hinge:'right',open:'true',powered:'true'}}")); ☃.put("minecraft:" + str + "southlowerleftfalsefalse", agz.b("{Name:'minecraft:" + str + "',Properties:{facing:'south',half:'lower',hinge:'left',open:'false',powered:'false'}}")); ☃.put("minecraft:" + str + "southlowerleftfalsetrue", agz.b("{Name:'minecraft:" + str + "',Properties:{facing:'south',half:'lower',hinge:'left',open:'false',powered:'true'}}")); ☃.put("minecraft:" + str + "southlowerlefttruefalse", agz.b("{Name:'minecraft:" + str + "',Properties:{facing:'south',half:'lower',hinge:'left',open:'true',powered:'false'}}")); ☃.put("minecraft:" + str + "southlowerlefttruetrue", agz.b("{Name:'minecraft:" + str + "',Properties:{facing:'south',half:'lower',hinge:'left',open:'true',powered:'true'}}")); ☃.put("minecraft:" + str + "southlowerrightfalsefalse", agz.b(i + 1)); ☃.put("minecraft:" + str + "southlowerrightfalsetrue", agz.b("{Name:'minecraft:" + str + "',Properties:{facing:'south',half:'lower',hinge:'right',open:'false',powered:'true'}}")); ☃.put("minecraft:" + str + "southlowerrighttruefalse", agz.b(i + 5)); ☃.put("minecraft:" + str + "southlowerrighttruetrue", agz.b("{Name:'minecraft:" + str + "',Properties:{facing:'south',half:'lower',hinge:'right',open:'true',powered:'true'}}")); ☃.put("minecraft:" + str + "southupperleftfalsefalse", agz.b("{Name:'minecraft:" + str + "',Properties:{facing:'south',half:'upper',hinge:'left',open:'false',powered:'false'}}")); ☃.put("minecraft:" + str + "southupperleftfalsetrue", agz.b("{Name:'minecraft:" + str + "',Properties:{facing:'south',half:'upper',hinge:'left',open:'false',powered:'true'}}")); ☃.put("minecraft:" + str + "southupperlefttruefalse", agz.b("{Name:'minecraft:" + str + "',Properties:{facing:'south',half:'upper',hinge:'left',open:'true',powered:'false'}}")); ☃.put("minecraft:" + str + "southupperlefttruetrue", agz.b("{Name:'minecraft:" + str + "',Properties:{facing:'south',half:'upper',hinge:'left',open:'true',powered:'true'}}")); ☃.put("minecraft:" + str + "southupperrightfalsefalse", agz.b("{Name:'minecraft:" + str + "',Properties:{facing:'south',half:'upper',hinge:'right',open:'false',powered:'false'}}")); ☃.put("minecraft:" + str + "southupperrightfalsetrue", agz.b("{Name:'minecraft:" + str + "',Properties:{facing:'south',half:'upper',hinge:'right',open:'false',powered:'true'}}")); ☃.put("minecraft:" + str + "southupperrighttruefalse", agz.b("{Name:'minecraft:" + str + "',Properties:{facing:'south',half:'upper',hinge:'right',open:'true',powered:'false'}}")); ☃.put("minecraft:" + str + "southupperrighttruetrue", agz.b("{Name:'minecraft:" + str + "',Properties:{facing:'south',half:'upper',hinge:'right',open:'true',powered:'true'}}")); ☃.put("minecraft:" + str + "westlowerleftfalsefalse", agz.b("{Name:'minecraft:" + str + "',Properties:{facing:'west',half:'lower',hinge:'left',open:'false',powered:'false'}}")); ☃.put("minecraft:" + str + "westlowerleftfalsetrue", agz.b("{Name:'minecraft:" + str + "',Properties:{facing:'west',half:'lower',hinge:'left',open:'false',powered:'true'}}")); ☃.put("minecraft:" + str + "westlowerlefttruefalse", agz.b("{Name:'minecraft:" + str + "',Properties:{facing:'west',half:'lower',hinge:'left',open:'true',powered:'false'}}")); ☃.put("minecraft:" + str + "westlowerlefttruetrue", agz.b("{Name:'minecraft:" + str + "',Properties:{facing:'west',half:'lower',hinge:'left',open:'true',powered:'true'}}")); ☃.put("minecraft:" + str + "westlowerrightfalsefalse", agz.b(i + 2)); ☃.put("minecraft:" + str + "westlowerrightfalsetrue", agz.b("{Name:'minecraft:" + str + "',Properties:{facing:'west',half:'lower',hinge:'right',open:'false',powered:'true'}}")); ☃.put("minecraft:" + str + "westlowerrighttruefalse", agz.b(i + 6)); ☃.put("minecraft:" + str + "westlowerrighttruetrue", agz.b("{Name:'minecraft:" + str + "',Properties:{facing:'west',half:'lower',hinge:'right',open:'true',powered:'true'}}")); ☃.put("minecraft:" + str + "westupperleftfalsefalse", agz.b("{Name:'minecraft:" + str + "',Properties:{facing:'west',half:'upper',hinge:'left',open:'false',powered:'false'}}")); ☃.put("minecraft:" + str + "westupperleftfalsetrue", agz.b("{Name:'minecraft:" + str + "',Properties:{facing:'west',half:'upper',hinge:'left',open:'false',powered:'true'}}")); ☃.put("minecraft:" + str + "westupperlefttruefalse", agz.b("{Name:'minecraft:" + str + "',Properties:{facing:'west',half:'upper',hinge:'left',open:'true',powered:'false'}}")); ☃.put("minecraft:" + str + "westupperlefttruetrue", agz.b("{Name:'minecraft:" + str + "',Properties:{facing:'west',half:'upper',hinge:'left',open:'true',powered:'true'}}")); ☃.put("minecraft:" + str + "westupperrightfalsefalse", agz.b("{Name:'minecraft:" + str + "',Properties:{facing:'west',half:'upper',hinge:'right',open:'false',powered:'false'}}")); ☃.put("minecraft:" + str + "westupperrightfalsetrue", agz.b("{Name:'minecraft:" + str + "',Properties:{facing:'west',half:'upper',hinge:'right',open:'false',powered:'true'}}"));
/*     */     ☃.put("minecraft:" + str + "westupperrighttruefalse", agz.b("{Name:'minecraft:" + str + "',Properties:{facing:'west',half:'upper',hinge:'right',open:'true',powered:'false'}}"));
/* 334 */     ☃.put("minecraft:" + str + "westupperrighttruetrue", agz.b("{Name:'minecraft:" + str + "',Properties:{facing:'west',half:'upper',hinge:'right',open:'true',powered:'true'}}")); } private static final Dynamic<?> u = agz.b(0); private static void a(Map<String, Dynamic<?>> ☃, int i, String str) { ☃.put("southfalsefoot" + i, agz.b("{Name:'minecraft:" + str + "_bed',Properties:{facing:'south',occupied:'false',part:'foot'}}")); ☃.put("westfalsefoot" + i, agz.b("{Name:'minecraft:" + str + "_bed',Properties:{facing:'west',occupied:'false',part:'foot'}}")); ☃.put("northfalsefoot" + i, agz.b("{Name:'minecraft:" + str + "_bed',Properties:{facing:'north',occupied:'false',part:'foot'}}")); ☃.put("eastfalsefoot" + i, agz.b("{Name:'minecraft:" + str + "_bed',Properties:{facing:'east',occupied:'false',part:'foot'}}")); ☃.put("southfalsehead" + i, agz.b("{Name:'minecraft:" + str + "_bed',Properties:{facing:'south',occupied:'false',part:'head'}}")); ☃.put("westfalsehead" + i, agz.b("{Name:'minecraft:" + str + "_bed',Properties:{facing:'west',occupied:'false',part:'head'}}")); ☃.put("northfalsehead" + i, agz.b("{Name:'minecraft:" + str + "_bed',Properties:{facing:'north',occupied:'false',part:'head'}}")); ☃.put("eastfalsehead" + i, agz.b("{Name:'minecraft:" + str + "_bed',Properties:{facing:'east',occupied:'false',part:'head'}}")); ☃.put("southtruehead" + i, agz.b("{Name:'minecraft:" + str + "_bed',Properties:{facing:'south',occupied:'true',part:'head'}}")); ☃.put("westtruehead" + i, agz.b("{Name:'minecraft:" + str + "_bed',Properties:{facing:'west',occupied:'true',part:'head'}}")); ☃.put("northtruehead" + i, agz.b("{Name:'minecraft:" + str + "_bed',Properties:{facing:'north',occupied:'true',part:'head'}}")); ☃.put("easttruehead" + i, agz.b("{Name:'minecraft:" + str + "_bed',Properties:{facing:'east',occupied:'true',part:'head'}}")); }
/*     */   private static void b(Map<String, Dynamic<?>> ☃, int i, String str) { for (int j = 0; j < 16; j++)
/*     */       ☃.put("" + j + "_" + i, agz.b("{Name:'minecraft:" + str + "_banner',Properties:{rotation:'" + j + "'}}"));  ☃.put("north_" + i, agz.b("{Name:'minecraft:" + str + "_wall_banner',Properties:{facing:'north'}}")); ☃.put("south_" + i, agz.b("{Name:'minecraft:" + str + "_wall_banner',Properties:{facing:'south'}}")); ☃.put("west_" + i, agz.b("{Name:'minecraft:" + str + "_wall_banner',Properties:{facing:'west'}}"));
/*     */     ☃.put("east_" + i, agz.b("{Name:'minecraft:" + str + "_wall_banner',Properties:{facing:'east'}}")); }
/* 338 */   public static String a(Dynamic<?> ☃) { return ☃.get("Name").asString(""); }
/*     */ 
/*     */   
/*     */   public static String a(Dynamic<?> ☃, String str) {
/* 342 */     return ☃.get("Properties").get(str).asString("");
/*     */   }
/*     */   
/*     */   public static int a(aet<Dynamic<?>> ☃, Dynamic<?> dynamic) {
/* 346 */     int i = ☃.a(dynamic);
/* 347 */     if (i == -1) {
/* 348 */       i = ☃.c(dynamic);
/*     */     }
/* 350 */     return i;
/*     */   }
/*     */   
/*     */   private Dynamic<?> b(Dynamic<?> ☃) {
/* 354 */     Optional<? extends Dynamic<?>> optional = ☃.get("Level").result();
/* 355 */     if (optional.isPresent() && ((Dynamic)optional.get()).get("Sections").asStreamOpt().result().isPresent()) {
/* 356 */       return ☃.set("Level", (new d(optional.get())).a());
/*     */     }
/* 358 */     return ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public TypeRewriteRule makeRule() {
/* 363 */     Type<?> ☃ = getInputSchema().getType(akn.c);
/* 364 */     Type<?> type1 = getOutputSchema().getType(akn.c);
/* 365 */     return writeFixAndRead("ChunkPalettedStorageFix", ☃, type1, this::b);
/*     */   }
/*     */   
/*     */   static class c {
/* 369 */     private final aet<Dynamic<?>> b = new aet<>(32);
/*     */     
/*     */     private final List<Dynamic<?>> c;
/*     */     private final Dynamic<?> d;
/*     */     private final boolean e;
/* 374 */     private final Int2ObjectMap<IntList> f = (Int2ObjectMap<IntList>)new Int2ObjectLinkedOpenHashMap();
/*     */     
/* 376 */     private final IntList g = (IntList)new IntArrayList();
/*     */     public final int a;
/* 378 */     private final Set<Dynamic<?>> h = Sets.newIdentityHashSet();
/* 379 */     private final int[] i = new int[4096];
/*     */     
/*     */     public c(Dynamic<?> ☃) {
/* 382 */       this.c = Lists.newArrayList();
/* 383 */       this.d = ☃;
/* 384 */       this.a = ☃.get("Y").asInt(0);
/* 385 */       this.e = ☃.get("Blocks").result().isPresent();
/*     */     }
/*     */     
/*     */     public Dynamic<?> a(int ☃) {
/* 389 */       if (☃ < 0 || ☃ > 4095) {
/* 390 */         return ahe.a();
/*     */       }
/*     */       
/* 393 */       Dynamic<?> dynamic = this.b.a(this.i[☃]);
/* 394 */       return (dynamic == null) ? ahe.a() : dynamic;
/*     */     }
/*     */     
/*     */     public void a(int ☃, Dynamic<?> dynamic) {
/* 398 */       if (this.h.add(dynamic)) {
/* 399 */         this.c.add("%%FILTER_ME%%".equals(ahe.a(dynamic)) ? ahe.a() : dynamic);
/*     */       }
/* 401 */       this.i[☃] = ahe.a(this.b, dynamic);
/*     */     }
/*     */     
/*     */     public int b(int ☃) {
/* 405 */       if (!this.e) {
/* 406 */         return ☃;
/*     */       }
/* 408 */       ByteBuffer byteBuffer = this.d.get("Blocks").asByteBufferOpt().result().get();
/* 409 */       ahe.a a1 = this.d.get("Data").asByteBufferOpt().map(☃ -> new ahe.a(DataFixUtils.toArray(☃))).result().orElseGet(a::new);
/* 410 */       ahe.a a2 = this.d.get("Add").asByteBufferOpt().map(☃ -> new ahe.a(DataFixUtils.toArray(☃))).result().orElseGet(a::new);
/*     */       
/* 412 */       this.h.add(ahe.a());
/* 413 */       ahe.a(this.b, ahe.a());
/* 414 */       this.c.add(ahe.a());
/*     */       
/* 416 */       for (int i = 0; i < 4096; i++) {
/* 417 */         int j = i & 0xF;
/* 418 */         int k = i >> 8 & 0xF;
/* 419 */         int m = i >> 4 & 0xF;
/* 420 */         int n = a2.a(j, k, m) << 12 | (byteBuffer.get(i) & 0xFF) << 4 | a1.a(j, k, m);
/*     */         
/* 422 */         if (ahe.b().get(n >> 4)) {
/* 423 */           a(n >> 4, i);
/*     */         }
/* 425 */         if (ahe.c().get(n >> 4)) {
/*     */           
/* 427 */           int i1 = ahe.a((j == 0), (j == 15), (m == 0), (m == 15));
/* 428 */           if (i1 == 0) {
/*     */             
/* 430 */             this.g.add(i);
/*     */           } else {
/* 432 */             ☃ |= i1;
/*     */           } 
/*     */         } 
/*     */         
/* 436 */         a(i, agz.b(n));
/*     */       } 
/*     */       
/* 439 */       return ☃;
/*     */     }
/*     */     private void a(int ☃, int i) {
/*     */       IntArrayList intArrayList;
/* 443 */       IntList intList = (IntList)this.f.get(☃);
/* 444 */       if (intList == null) {
/* 445 */         intArrayList = new IntArrayList();
/* 446 */         this.f.put(☃, intArrayList);
/*     */       } 
/* 448 */       intArrayList.add(i);
/*     */     }
/*     */     
/*     */     public Dynamic<?> a() {
/* 452 */       Dynamic<?> ☃ = this.d;
/* 453 */       if (!this.e) {
/* 454 */         return ☃;
/*     */       }
/* 456 */       ☃ = ☃.set("Palette", ☃.createList(this.c.stream()));
/*     */       
/* 458 */       int i = Math.max(4, DataFixUtils.ceillog2(this.h.size()));
/* 459 */       agc agc = new agc(i, 4096);
/* 460 */       for (int j = 0; j < this.i.length; j++) {
/* 461 */         agc.a(j, this.i[j]);
/*     */       }
/*     */       
/* 464 */       ☃ = ☃.set("BlockStates", ☃.createLongList(Arrays.stream(agc.a())));
/*     */       
/* 466 */       ☃ = ☃.remove("Blocks");
/* 467 */       ☃ = ☃.remove("Data");
/* 468 */       ☃ = ☃.remove("Add");
/*     */       
/* 470 */       return ☃;
/*     */     }
/*     */   }
/*     */   
/*     */   static final class d
/*     */   {
/*     */     private int a;
/* 477 */     private final ahe.c[] b = new ahe.c[16];
/*     */     
/*     */     private final Dynamic<?> c;
/*     */     private final int d;
/*     */     private final int e;
/* 482 */     private final Int2ObjectMap<Dynamic<?>> f = (Int2ObjectMap<Dynamic<?>>)new Int2ObjectLinkedOpenHashMap(16);
/*     */     
/*     */     public d(Dynamic<?> ☃) {
/* 485 */       this.c = ☃;
/* 486 */       this.d = ☃.get("xPos").asInt(0) << 4;
/* 487 */       this.e = ☃.get("zPos").asInt(0) << 4;
/*     */       
/* 489 */       ☃.get("TileEntities").asStreamOpt().result().ifPresent(☃ -> ☃.forEach(()));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 502 */       boolean bool = ☃.get("convertedFromAlphaFormat").asBoolean(false);
/*     */       
/* 504 */       ☃.get("Sections").asStreamOpt().result().ifPresent(☃ -> ☃.forEach(()));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 512 */       for (ahe.c c1 : this.b) {
/* 513 */         if (c1 != null)
/*     */         {
/*     */ 
/*     */           
/* 517 */           for (ObjectIterator<Map.Entry<Integer, IntList>> objectIterator = ahe.c.a(c1).entrySet().iterator(); objectIterator.hasNext(); ) { IntListIterator<Integer> intListIterator; Map.Entry<Integer, IntList> entry = objectIterator.next();
/* 518 */             int i = c1.a << 12;
/* 519 */             switch (((Integer)entry.getKey()).intValue()) {
/*     */               case 2:
/* 521 */                 for (intListIterator = ((IntList)entry.getValue()).iterator(); intListIterator.hasNext(); ) { int j = ((Integer)intListIterator.next()).intValue();
/* 522 */                   j |= i;
/*     */                   
/* 524 */                   Dynamic<?> dynamic = a(j);
/* 525 */                   if ("minecraft:grass_block".equals(ahe.a(dynamic))) {
/* 526 */                     String str = ahe.a(a(a(j, ahe.b.b)));
/* 527 */                     if ("minecraft:snow".equals(str) || "minecraft:snow_layer".equals(str)) {
/* 528 */                       a(j, ahe.d());
/*     */                     }
/*     */                   }  }
/*     */               
/*     */ 
/*     */               
/*     */               case 3:
/* 535 */                 for (intListIterator = ((IntList)entry.getValue()).iterator(); intListIterator.hasNext(); ) { int j = ((Integer)intListIterator.next()).intValue();
/* 536 */                   j |= i;
/*     */                   
/* 538 */                   Dynamic<?> dynamic = a(j);
/* 539 */                   if ("minecraft:podzol".equals(ahe.a(dynamic))) {
/* 540 */                     String str = ahe.a(a(a(j, ahe.b.b)));
/* 541 */                     if ("minecraft:snow".equals(str) || "minecraft:snow_layer".equals(str)) {
/* 542 */                       a(j, ahe.e());
/*     */                     }
/*     */                   }  }
/*     */               
/*     */ 
/*     */               
/*     */               case 110:
/* 549 */                 for (intListIterator = ((IntList)entry.getValue()).iterator(); intListIterator.hasNext(); ) { int j = ((Integer)intListIterator.next()).intValue();
/* 550 */                   j |= i;
/*     */                   
/* 552 */                   Dynamic<?> dynamic = a(j);
/* 553 */                   if ("minecraft:mycelium".equals(ahe.a(dynamic))) {
/* 554 */                     String str = ahe.a(a(a(j, ahe.b.b)));
/* 555 */                     if ("minecraft:snow".equals(str) || "minecraft:snow_layer".equals(str)) {
/* 556 */                       a(j, ahe.f());
/*     */                     }
/*     */                   }  }
/*     */               
/*     */ 
/*     */               
/*     */               case 25:
/* 563 */                 for (intListIterator = ((IntList)entry.getValue()).iterator(); intListIterator.hasNext(); ) { int j = ((Integer)intListIterator.next()).intValue();
/* 564 */                   j |= i;
/* 565 */                   Dynamic<?> dynamic = c(j);
/* 566 */                   if (dynamic != null) {
/* 567 */                     String str = Boolean.toString(dynamic.get("powered").asBoolean(false)) + (byte)Math.min(Math.max(dynamic.get("note").asInt(0), 0), 24);
/* 568 */                     a(j, (Dynamic)ahe.g().getOrDefault(str, ahe.g().get("false0")));
/*     */                   }  }
/*     */               
/*     */ 
/*     */               
/*     */               case 26:
/* 574 */                 for (intListIterator = ((IntList)entry.getValue()).iterator(); intListIterator.hasNext(); ) { int j = ((Integer)intListIterator.next()).intValue();
/* 575 */                   j |= i;
/* 576 */                   Dynamic<?> dynamic1 = b(j);
/* 577 */                   Dynamic<?> dynamic2 = a(j);
/* 578 */                   if (dynamic1 != null) {
/* 579 */                     int k = dynamic1.get("color").asInt(0);
/* 580 */                     if (k != 14 && k >= 0 && k < 16) {
/* 581 */                       String str = ahe.a(dynamic2, "facing") + ahe.a(dynamic2, "occupied") + ahe.a(dynamic2, "part") + k;
/* 582 */                       if (ahe.h().containsKey(str)) {
/* 583 */                         a(j, (Dynamic)ahe.h().get(str));
/*     */                       }
/*     */                     } 
/*     */                   }  }
/*     */               
/*     */ 
/*     */               
/*     */               case 176:
/*     */               case 177:
/* 592 */                 for (intListIterator = ((IntList)entry.getValue()).iterator(); intListIterator.hasNext(); ) { int j = ((Integer)intListIterator.next()).intValue();
/* 593 */                   j |= i;
/* 594 */                   Dynamic<?> dynamic1 = b(j);
/* 595 */                   Dynamic<?> dynamic2 = a(j);
/* 596 */                   if (dynamic1 != null) {
/* 597 */                     int k = dynamic1.get("Base").asInt(0);
/* 598 */                     if (k != 15 && k >= 0 && k < 16) {
/* 599 */                       String str = ahe.a(dynamic2, (((Integer)entry.getKey()).intValue() == 176) ? "rotation" : "facing") + "_" + k;
/* 600 */                       if (ahe.i().containsKey(str)) {
/* 601 */                         a(j, (Dynamic)ahe.i().get(str));
/*     */                       }
/*     */                     } 
/*     */                   }  }
/*     */               
/*     */ 
/*     */               
/*     */               case 86:
/* 609 */                 for (intListIterator = ((IntList)entry.getValue()).iterator(); intListIterator.hasNext(); ) { int j = ((Integer)intListIterator.next()).intValue();
/* 610 */                   j |= i;
/*     */                   
/* 612 */                   Dynamic<?> dynamic = a(j);
/* 613 */                   if ("minecraft:carved_pumpkin".equals(ahe.a(dynamic))) {
/* 614 */                     String str = ahe.a(a(a(j, ahe.b.a)));
/* 615 */                     if ("minecraft:grass_block".equals(str) || "minecraft:dirt".equals(str)) {
/* 616 */                       a(j, ahe.j());
/*     */                     }
/*     */                   }  }
/*     */               
/*     */ 
/*     */               
/*     */               case 140:
/* 623 */                 for (intListIterator = ((IntList)entry.getValue()).iterator(); intListIterator.hasNext(); ) { int j = ((Integer)intListIterator.next()).intValue();
/* 624 */                   j |= i;
/* 625 */                   Dynamic<?> dynamic = c(j);
/* 626 */                   if (dynamic != null) {
/* 627 */                     String str = dynamic.get("Item").asString("") + dynamic.get("Data").asInt(0);
/* 628 */                     a(j, (Dynamic)ahe.k().getOrDefault(str, ahe.k().get("minecraft:air0")));
/*     */                   }  }
/*     */               
/*     */ 
/*     */               
/*     */               case 144:
/* 634 */                 for (intListIterator = ((IntList)entry.getValue()).iterator(); intListIterator.hasNext(); ) { int j = ((Integer)intListIterator.next()).intValue();
/* 635 */                   j |= i;
/* 636 */                   Dynamic<?> dynamic = b(j);
/* 637 */                   if (dynamic != null) {
/* 638 */                     String str3, str1 = String.valueOf(dynamic.get("SkullType").asInt(0));
/* 639 */                     String str2 = ahe.a(a(j), "facing");
/*     */                     
/* 641 */                     if ("up".equals(str2) || "down".equals(str2)) {
/* 642 */                       str3 = str1 + String.valueOf(dynamic.get("Rot").asInt(0));
/*     */                     } else {
/* 644 */                       str3 = str1 + str2;
/*     */                     } 
/*     */                     
/* 647 */                     dynamic.remove("SkullType");
/* 648 */                     dynamic.remove("facing");
/* 649 */                     dynamic.remove("Rot");
/*     */                     
/* 651 */                     a(j, (Dynamic)ahe.l().getOrDefault(str3, ahe.l().get("0north")));
/*     */                   }  }
/*     */               
/*     */               
/*     */               case 64:
/*     */               case 71:
/*     */               case 193:
/*     */               case 194:
/*     */               case 195:
/*     */               case 196:
/*     */               case 197:
/* 662 */                 for (intListIterator = ((IntList)entry.getValue()).iterator(); intListIterator.hasNext(); ) { int j = ((Integer)intListIterator.next()).intValue();
/* 663 */                   j |= i;
/*     */                   
/* 665 */                   Dynamic<?> dynamic = a(j);
/* 666 */                   if (ahe.a(dynamic).endsWith("_door")) {
/* 667 */                     Dynamic<?> dynamic1 = a(j);
/* 668 */                     if ("lower".equals(ahe.a(dynamic1, "half"))) {
/* 669 */                       int k = a(j, ahe.b.b);
/* 670 */                       Dynamic<?> dynamic2 = a(k);
/* 671 */                       String str = ahe.a(dynamic1);
/* 672 */                       if (str.equals(ahe.a(dynamic2))) {
/* 673 */                         String str1 = ahe.a(dynamic1, "facing");
/* 674 */                         String str2 = ahe.a(dynamic1, "open");
/* 675 */                         String str3 = bool ? "left" : ahe.a(dynamic2, "hinge");
/* 676 */                         String str4 = bool ? "false" : ahe.a(dynamic2, "powered");
/* 677 */                         a(j, (Dynamic)ahe.m().get(str + str1 + "lower" + str3 + str2 + str4));
/* 678 */                         a(k, (Dynamic)ahe.m().get(str + str1 + "upper" + str3 + str2 + str4));
/*     */                       } 
/*     */                     } 
/*     */                   }  }
/*     */               
/*     */ 
/*     */               
/*     */               case 175:
/* 686 */                 for (intListIterator = ((IntList)entry.getValue()).iterator(); intListIterator.hasNext(); ) { int j = ((Integer)intListIterator.next()).intValue();
/* 687 */                   j |= i;
/*     */                   
/* 689 */                   Dynamic<?> dynamic = a(j);
/* 690 */                   if ("upper".equals(ahe.a(dynamic, "half"))) {
/* 691 */                     Dynamic<?> dynamic1 = a(a(j, ahe.b.a));
/* 692 */                     String str = ahe.a(dynamic1);
/* 693 */                     if ("minecraft:sunflower".equals(str)) {
/* 694 */                       a(j, ahe.n()); continue;
/* 695 */                     }  if ("minecraft:lilac".equals(str)) {
/* 696 */                       a(j, ahe.o()); continue;
/* 697 */                     }  if ("minecraft:tall_grass".equals(str)) {
/* 698 */                       a(j, ahe.p()); continue;
/* 699 */                     }  if ("minecraft:large_fern".equals(str)) {
/* 700 */                       a(j, ahe.q()); continue;
/* 701 */                     }  if ("minecraft:rose_bush".equals(str)) {
/* 702 */                       a(j, ahe.r()); continue;
/* 703 */                     }  if ("minecraft:peony".equals(str)) {
/* 704 */                       a(j, ahe.s());
/*     */                     }
/*     */                   }  }
/*     */               
/*     */             }  }
/*     */         
/*     */         }
/*     */       } 
/*     */     }
/*     */ 
/*     */     
/*     */     @Nullable
/*     */     private Dynamic<?> b(int ☃) {
/* 717 */       return (Dynamic)this.f.get(☃);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     private Dynamic<?> c(int ☃) {
/* 722 */       return (Dynamic)this.f.remove(☃); } public static int a(int ☃, ahe.b b1) {
/*     */       int i;
/*     */       int j;
/*     */       int k;
/* 726 */       switch (ahe.null.a[b1.b().ordinal()]) {
/*     */         case 1:
/* 728 */           i = (☃ & 0xF) + b1.a().a();
/* 729 */           return (i < 0 || i > 15) ? -1 : (☃ & 0xFFFFFFF0 | i);
/*     */         case 2:
/* 731 */           j = (☃ >> 8) + b1.a().a();
/* 732 */           return (j < 0 || j > 255) ? -1 : (☃ & 0xFF | j << 8);
/*     */         case 3:
/* 734 */           k = (☃ >> 4 & 0xF) + b1.a().a();
/* 735 */           return (k < 0 || k > 15) ? -1 : (☃ & 0xFFFFFF0F | k << 4);
/*     */       } 
/* 737 */       return -1;
/*     */     }
/*     */     
/*     */     private void a(int ☃, Dynamic<?> dynamic) {
/* 741 */       if (☃ < 0 || ☃ > 65535) {
/*     */         return;
/*     */       }
/*     */       
/* 745 */       ahe.c c1 = d(☃);
/*     */       
/* 747 */       if (c1 == null) {
/*     */         return;
/*     */       }
/*     */       
/* 751 */       c1.a(☃ & 0xFFF, dynamic);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     private ahe.c d(int ☃) {
/* 756 */       int i = ☃ >> 12;
/* 757 */       return (i < this.b.length) ? this.b[i] : null;
/*     */     }
/*     */     
/*     */     public Dynamic<?> a(int ☃) {
/* 761 */       if (☃ < 0 || ☃ > 65535) {
/* 762 */         return ahe.a();
/*     */       }
/*     */       
/* 765 */       ahe.c c1 = d(☃);
/*     */       
/* 767 */       if (c1 == null) {
/* 768 */         return ahe.a();
/*     */       }
/*     */       
/* 771 */       return c1.a(☃ & 0xFFF);
/*     */     }
/*     */     
/*     */     public Dynamic<?> a() {
/* 775 */       Dynamic<?> ☃ = this.c;
/* 776 */       if (this.f.isEmpty()) {
/* 777 */         ☃ = ☃.remove("TileEntities");
/*     */       } else {
/* 779 */         ☃ = ☃.set("TileEntities", ☃.createList(this.f.values().stream()));
/*     */       } 
/*     */       
/* 782 */       Dynamic<?> dynamic1 = ☃.emptyMap();
/* 783 */       List<Dynamic<?>> list = Lists.newArrayList();
/* 784 */       for (ahe.c c1 : this.b) {
/* 785 */         if (c1 != null) {
/* 786 */           list.add(c1.a());
/* 787 */           dynamic1 = dynamic1.set(String.valueOf(c1.a), dynamic1.createIntList(Arrays.stream(ahe.c.b(c1).toIntArray())));
/*     */         } 
/*     */       } 
/*     */       
/* 791 */       Dynamic<?> dynamic2 = ☃.emptyMap();
/* 792 */       dynamic2 = dynamic2.set("Sides", dynamic2.createByte((byte)this.a));
/* 793 */       dynamic2 = dynamic2.set("Indices", dynamic1);
/* 794 */       return ☃.set("UpgradeData", dynamic2).set("Sections", dynamic2.createList(list.stream()));
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   static class a
/*     */   {
/*     */     private final byte[] a;
/*     */ 
/*     */     
/*     */     public a() {
/* 805 */       this.a = new byte[2048];
/*     */     }
/*     */     
/*     */     public a(byte[] ☃) {
/* 809 */       this.a = ☃;
/*     */       
/* 811 */       if (☃.length != 2048) {
/* 812 */         throw new IllegalArgumentException("ChunkNibbleArrays should be 2048 bytes not: " + ☃.length);
/*     */       }
/*     */     }
/*     */     
/*     */     public int a(int ☃, int i, int j) {
/* 817 */       int k = b(i << 8 | j << 4 | ☃);
/*     */       
/* 819 */       if (a(i << 8 | j << 4 | ☃)) {
/* 820 */         return this.a[k] & 0xF;
/*     */       }
/* 822 */       return this.a[k] >> 4 & 0xF;
/*     */     }
/*     */ 
/*     */     
/*     */     private boolean a(int ☃) {
/* 827 */       return ((☃ & 0x1) == 0);
/*     */     }
/*     */     
/*     */     private int b(int ☃) {
/* 831 */       return ☃ >> 1;
/*     */     }
/*     */   }
/*     */   
/*     */   public static int a(boolean ☃, boolean bool1, boolean bool2, boolean bool3) {
/* 836 */     int i = 0;
/* 837 */     if (bool2) {
/* 838 */       if (bool1) {
/* 839 */         i |= 0x2;
/* 840 */       } else if (☃) {
/* 841 */         i |= 0x80;
/*     */       } else {
/* 843 */         i |= 0x1;
/*     */       } 
/* 845 */     } else if (bool3) {
/* 846 */       if (☃) {
/* 847 */         i |= 0x20;
/* 848 */       } else if (bool1) {
/* 849 */         i |= 0x8;
/*     */       } else {
/* 851 */         i |= 0x10;
/*     */       } 
/* 853 */     } else if (bool1) {
/* 854 */       i |= 0x4;
/* 855 */     } else if (☃) {
/* 856 */       i |= 0x40;
/*     */     } 
/* 858 */     return i;
/*     */   }
/*     */   
/*     */   public enum b {
/* 862 */     a((String)b.b, a.b),
/* 863 */     b((String)b.a, a.b),
/* 864 */     c((String)b.b, a.c),
/* 865 */     d((String)b.a, a.c),
/* 866 */     e((String)b.b, a.a),
/* 867 */     f((String)b.a, a.a);
/*     */     
/*     */     private final a g;
/*     */     
/*     */     private final b h;
/*     */     
/*     */     b(b ☃, a a1) {
/* 874 */       this.g = a1;
/* 875 */       this.h = ☃;
/*     */     }
/*     */     
/*     */     public b a() {
/* 879 */       return this.h;
/*     */     }
/*     */     
/*     */     public a b() {
/* 883 */       return this.g;
/*     */     }
/*     */     
/*     */     public enum a {
/* 887 */       a,
/* 888 */       b,
/* 889 */       c;
/*     */     }
/*     */     
/*     */     public enum b {
/* 893 */       a(1),
/* 894 */       b(-1);
/*     */       
/*     */       private final int c;
/*     */ 
/*     */       
/*     */       b(int ☃) {
/* 900 */         this.c = ☃;
/*     */       }
/*     */       
/*     */       public int a() {
/* 904 */         return this.c;
/*     */       }
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ahe.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */