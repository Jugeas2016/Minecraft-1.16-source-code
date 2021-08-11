/*     */ import com.mojang.datafixers.DSL;
/*     */ import com.mojang.datafixers.DataFix;
/*     */ import com.mojang.datafixers.DataFixUtils;
/*     */ import com.mojang.datafixers.TypeRewriteRule;
/*     */ import com.mojang.datafixers.Typed;
/*     */ import com.mojang.datafixers.schemas.Schema;
/*     */ import com.mojang.datafixers.util.Pair;
/*     */ import com.mojang.serialization.Dynamic;
/*     */ import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
/*     */ import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
/*     */ import java.util.Map;
/*     */ import java.util.stream.Collectors;
/*     */ 
/*     */ public class akd
/*     */   extends DataFix {
/*     */   public akd(Schema ☃, boolean bool) {
/*  17 */     super(☃, bool);
/*     */   }
/*     */   private static final Int2ObjectMap<String> a;
/*     */   static {
/*  21 */     a = (Int2ObjectMap<String>)DataFixUtils.make(new Int2ObjectOpenHashMap(), ☃ -> {
/*     */           ☃.put(0, "key.unknown");
/*     */           ☃.put(11, "key.0");
/*     */           ☃.put(2, "key.1");
/*     */           ☃.put(3, "key.2");
/*     */           ☃.put(4, "key.3");
/*     */           ☃.put(5, "key.4");
/*     */           ☃.put(6, "key.5");
/*     */           ☃.put(7, "key.6");
/*     */           ☃.put(8, "key.7");
/*     */           ☃.put(9, "key.8");
/*     */           ☃.put(10, "key.9");
/*     */           ☃.put(30, "key.a");
/*     */           ☃.put(40, "key.apostrophe");
/*     */           ☃.put(48, "key.b");
/*     */           ☃.put(43, "key.backslash");
/*     */           ☃.put(14, "key.backspace");
/*     */           ☃.put(46, "key.c");
/*     */           ☃.put(58, "key.caps.lock");
/*     */           ☃.put(51, "key.comma");
/*     */           ☃.put(32, "key.d");
/*     */           ☃.put(211, "key.delete");
/*     */           ☃.put(208, "key.down");
/*     */           ☃.put(18, "key.e");
/*     */           ☃.put(207, "key.end");
/*     */           ☃.put(28, "key.enter");
/*     */           ☃.put(13, "key.equal");
/*     */           ☃.put(1, "key.escape");
/*     */           ☃.put(33, "key.f");
/*     */           ☃.put(59, "key.f1");
/*     */           ☃.put(68, "key.f10");
/*     */           ☃.put(87, "key.f11");
/*     */           ☃.put(88, "key.f12");
/*     */           ☃.put(100, "key.f13");
/*     */           ☃.put(101, "key.f14");
/*     */           ☃.put(102, "key.f15");
/*     */           ☃.put(103, "key.f16");
/*     */           ☃.put(104, "key.f17");
/*     */           ☃.put(105, "key.f18");
/*     */           ☃.put(113, "key.f19");
/*     */           ☃.put(60, "key.f2");
/*     */           ☃.put(61, "key.f3");
/*     */           ☃.put(62, "key.f4");
/*     */           ☃.put(63, "key.f5");
/*     */           ☃.put(64, "key.f6");
/*     */           ☃.put(65, "key.f7");
/*     */           ☃.put(66, "key.f8");
/*     */           ☃.put(67, "key.f9");
/*     */           ☃.put(34, "key.g");
/*     */           ☃.put(41, "key.grave.accent");
/*     */           ☃.put(35, "key.h");
/*     */           ☃.put(199, "key.home");
/*     */           ☃.put(23, "key.i");
/*     */           ☃.put(210, "key.insert");
/*     */           ☃.put(36, "key.j");
/*     */           ☃.put(37, "key.k");
/*     */           ☃.put(82, "key.keypad.0");
/*     */           ☃.put(79, "key.keypad.1");
/*     */           ☃.put(80, "key.keypad.2");
/*     */           ☃.put(81, "key.keypad.3");
/*     */           ☃.put(75, "key.keypad.4");
/*     */           ☃.put(76, "key.keypad.5");
/*     */           ☃.put(77, "key.keypad.6");
/*     */           ☃.put(71, "key.keypad.7");
/*     */           ☃.put(72, "key.keypad.8");
/*     */           ☃.put(73, "key.keypad.9");
/*     */           ☃.put(78, "key.keypad.add");
/*     */           ☃.put(83, "key.keypad.decimal");
/*     */           ☃.put(181, "key.keypad.divide");
/*     */           ☃.put(156, "key.keypad.enter");
/*     */           ☃.put(141, "key.keypad.equal");
/*     */           ☃.put(55, "key.keypad.multiply");
/*     */           ☃.put(74, "key.keypad.subtract");
/*     */           ☃.put(38, "key.l");
/*     */           ☃.put(203, "key.left");
/*     */           ☃.put(56, "key.left.alt");
/*     */           ☃.put(26, "key.left.bracket");
/*     */           ☃.put(29, "key.left.control");
/*     */           ☃.put(42, "key.left.shift");
/*     */           ☃.put(219, "key.left.win");
/*     */           ☃.put(50, "key.m");
/*     */           ☃.put(12, "key.minus");
/*     */           ☃.put(49, "key.n");
/*     */           ☃.put(69, "key.num.lock");
/*     */           ☃.put(24, "key.o");
/*     */           ☃.put(25, "key.p");
/*     */           ☃.put(209, "key.page.down");
/*     */           ☃.put(201, "key.page.up");
/*     */           ☃.put(197, "key.pause");
/*     */           ☃.put(52, "key.period");
/*     */           ☃.put(183, "key.print.screen");
/*     */           ☃.put(16, "key.q");
/*     */           ☃.put(19, "key.r");
/*     */           ☃.put(205, "key.right");
/*     */           ☃.put(184, "key.right.alt");
/*     */           ☃.put(27, "key.right.bracket");
/*     */           ☃.put(157, "key.right.control");
/*     */           ☃.put(54, "key.right.shift");
/*     */           ☃.put(220, "key.right.win");
/*     */           ☃.put(31, "key.s");
/*     */           ☃.put(70, "key.scroll.lock");
/*     */           ☃.put(39, "key.semicolon");
/*     */           ☃.put(53, "key.slash");
/*     */           ☃.put(57, "key.space");
/*     */           ☃.put(20, "key.t");
/*     */           ☃.put(15, "key.tab");
/*     */           ☃.put(22, "key.u");
/*     */           ☃.put(200, "key.up");
/*     */           ☃.put(47, "key.v");
/*     */           ☃.put(17, "key.w");
/*     */           ☃.put(45, "key.x");
/*     */           ☃.put(21, "key.y");
/*     */           ☃.put(44, "key.z");
/*     */         });
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public TypeRewriteRule makeRule() {
/* 159 */     return fixTypeEverywhereTyped("OptionsKeyLwjgl3Fix", getInputSchema().getType(akn.e), ☃ -> ☃.update(DSL.remainderFinder(), ()));
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\akd.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */