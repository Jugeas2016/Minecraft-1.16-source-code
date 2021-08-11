/*     */ import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
/*     */ import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
/*     */ import java.util.function.BiFunction;
/*     */ import org.lwjgl.glfw.GLFW;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public enum b
/*     */ {
/*     */   c, b, a;
/*     */   private final BiFunction<Integer, String, nr> f;
/*     */   private final String e;
/*     */   
/*     */   static {
/* 194 */     a = new b("KEYSYM", 0, "key.keyboard", (☃, str) -> {
/*     */           String str1 = GLFW.glfwGetKeyName(☃.intValue(), -1);
/*     */           return (str1 != null) ? new oe(str1) : new of(str);
/*     */         });
/* 198 */     b = new b("SCANCODE", 1, "scancode", (☃, str) -> {
/*     */           String str1 = GLFW.glfwGetKeyName(-1, ☃.intValue());
/*     */           return (str1 != null) ? new oe(str1) : new of(str);
/*     */         });
/* 202 */     c = new b("MOUSE", 2, "key.mouse", (☃, str) -> ly.a().b(str) ? new of(str) : new of("key.mouse", new Object[] { Integer.valueOf(☃.intValue() + 1) }));
/*     */   }
/*     */   private static void a(b ☃, String str, int i) {
/* 205 */     deo.a a = new deo.a(str, ☃, i, null);
/* 206 */     ☃.d.put(i, a);
/*     */   }
/*     */   
/*     */   static {
/* 210 */     a(a, "key.keyboard.unknown", -1);
/*     */     
/* 212 */     a(c, "key.mouse.left", 0);
/* 213 */     a(c, "key.mouse.right", 1);
/* 214 */     a(c, "key.mouse.middle", 2);
/* 215 */     a(c, "key.mouse.4", 3);
/* 216 */     a(c, "key.mouse.5", 4);
/* 217 */     a(c, "key.mouse.6", 5);
/* 218 */     a(c, "key.mouse.7", 6);
/* 219 */     a(c, "key.mouse.8", 7);
/*     */     
/* 221 */     a(a, "key.keyboard.0", 48);
/* 222 */     a(a, "key.keyboard.1", 49);
/* 223 */     a(a, "key.keyboard.2", 50);
/* 224 */     a(a, "key.keyboard.3", 51);
/* 225 */     a(a, "key.keyboard.4", 52);
/* 226 */     a(a, "key.keyboard.5", 53);
/* 227 */     a(a, "key.keyboard.6", 54);
/* 228 */     a(a, "key.keyboard.7", 55);
/* 229 */     a(a, "key.keyboard.8", 56);
/* 230 */     a(a, "key.keyboard.9", 57);
/*     */     
/* 232 */     a(a, "key.keyboard.a", 65);
/* 233 */     a(a, "key.keyboard.b", 66);
/* 234 */     a(a, "key.keyboard.c", 67);
/* 235 */     a(a, "key.keyboard.d", 68);
/* 236 */     a(a, "key.keyboard.e", 69);
/* 237 */     a(a, "key.keyboard.f", 70);
/* 238 */     a(a, "key.keyboard.g", 71);
/* 239 */     a(a, "key.keyboard.h", 72);
/* 240 */     a(a, "key.keyboard.i", 73);
/* 241 */     a(a, "key.keyboard.j", 74);
/* 242 */     a(a, "key.keyboard.k", 75);
/* 243 */     a(a, "key.keyboard.l", 76);
/* 244 */     a(a, "key.keyboard.m", 77);
/* 245 */     a(a, "key.keyboard.n", 78);
/* 246 */     a(a, "key.keyboard.o", 79);
/* 247 */     a(a, "key.keyboard.p", 80);
/* 248 */     a(a, "key.keyboard.q", 81);
/* 249 */     a(a, "key.keyboard.r", 82);
/* 250 */     a(a, "key.keyboard.s", 83);
/* 251 */     a(a, "key.keyboard.t", 84);
/* 252 */     a(a, "key.keyboard.u", 85);
/* 253 */     a(a, "key.keyboard.v", 86);
/* 254 */     a(a, "key.keyboard.w", 87);
/* 255 */     a(a, "key.keyboard.x", 88);
/* 256 */     a(a, "key.keyboard.y", 89);
/* 257 */     a(a, "key.keyboard.z", 90);
/*     */     
/* 259 */     a(a, "key.keyboard.f1", 290);
/* 260 */     a(a, "key.keyboard.f2", 291);
/* 261 */     a(a, "key.keyboard.f3", 292);
/* 262 */     a(a, "key.keyboard.f4", 293);
/* 263 */     a(a, "key.keyboard.f5", 294);
/* 264 */     a(a, "key.keyboard.f6", 295);
/* 265 */     a(a, "key.keyboard.f7", 296);
/* 266 */     a(a, "key.keyboard.f8", 297);
/* 267 */     a(a, "key.keyboard.f9", 298);
/* 268 */     a(a, "key.keyboard.f10", 299);
/* 269 */     a(a, "key.keyboard.f11", 300);
/* 270 */     a(a, "key.keyboard.f12", 301);
/* 271 */     a(a, "key.keyboard.f13", 302);
/* 272 */     a(a, "key.keyboard.f14", 303);
/* 273 */     a(a, "key.keyboard.f15", 304);
/* 274 */     a(a, "key.keyboard.f16", 305);
/* 275 */     a(a, "key.keyboard.f17", 306);
/* 276 */     a(a, "key.keyboard.f18", 307);
/* 277 */     a(a, "key.keyboard.f19", 308);
/* 278 */     a(a, "key.keyboard.f20", 309);
/* 279 */     a(a, "key.keyboard.f21", 310);
/* 280 */     a(a, "key.keyboard.f22", 311);
/* 281 */     a(a, "key.keyboard.f23", 312);
/* 282 */     a(a, "key.keyboard.f24", 313);
/* 283 */     a(a, "key.keyboard.f25", 314);
/*     */     
/* 285 */     a(a, "key.keyboard.num.lock", 282);
/* 286 */     a(a, "key.keyboard.keypad.0", 320);
/* 287 */     a(a, "key.keyboard.keypad.1", 321);
/* 288 */     a(a, "key.keyboard.keypad.2", 322);
/* 289 */     a(a, "key.keyboard.keypad.3", 323);
/* 290 */     a(a, "key.keyboard.keypad.4", 324);
/* 291 */     a(a, "key.keyboard.keypad.5", 325);
/* 292 */     a(a, "key.keyboard.keypad.6", 326);
/* 293 */     a(a, "key.keyboard.keypad.7", 327);
/* 294 */     a(a, "key.keyboard.keypad.8", 328);
/* 295 */     a(a, "key.keyboard.keypad.9", 329);
/* 296 */     a(a, "key.keyboard.keypad.add", 334);
/* 297 */     a(a, "key.keyboard.keypad.decimal", 330);
/* 298 */     a(a, "key.keyboard.keypad.enter", 335);
/* 299 */     a(a, "key.keyboard.keypad.equal", 336);
/* 300 */     a(a, "key.keyboard.keypad.multiply", 332);
/* 301 */     a(a, "key.keyboard.keypad.divide", 331);
/* 302 */     a(a, "key.keyboard.keypad.subtract", 333);
/*     */     
/* 304 */     a(a, "key.keyboard.down", 264);
/* 305 */     a(a, "key.keyboard.left", 263);
/* 306 */     a(a, "key.keyboard.right", 262);
/* 307 */     a(a, "key.keyboard.up", 265);
/*     */     
/* 309 */     a(a, "key.keyboard.apostrophe", 39);
/* 310 */     a(a, "key.keyboard.backslash", 92);
/* 311 */     a(a, "key.keyboard.comma", 44);
/* 312 */     a(a, "key.keyboard.equal", 61);
/* 313 */     a(a, "key.keyboard.grave.accent", 96);
/* 314 */     a(a, "key.keyboard.left.bracket", 91);
/* 315 */     a(a, "key.keyboard.minus", 45);
/* 316 */     a(a, "key.keyboard.period", 46);
/* 317 */     a(a, "key.keyboard.right.bracket", 93);
/* 318 */     a(a, "key.keyboard.semicolon", 59);
/* 319 */     a(a, "key.keyboard.slash", 47);
/* 320 */     a(a, "key.keyboard.space", 32);
/* 321 */     a(a, "key.keyboard.tab", 258);
/*     */     
/* 323 */     a(a, "key.keyboard.left.alt", 342);
/* 324 */     a(a, "key.keyboard.left.control", 341);
/* 325 */     a(a, "key.keyboard.left.shift", 340);
/* 326 */     a(a, "key.keyboard.left.win", 343);
/* 327 */     a(a, "key.keyboard.right.alt", 346);
/* 328 */     a(a, "key.keyboard.right.control", 345);
/* 329 */     a(a, "key.keyboard.right.shift", 344);
/* 330 */     a(a, "key.keyboard.right.win", 347);
/*     */     
/* 332 */     a(a, "key.keyboard.enter", 257);
/* 333 */     a(a, "key.keyboard.escape", 256);
/*     */     
/* 335 */     a(a, "key.keyboard.backspace", 259);
/* 336 */     a(a, "key.keyboard.delete", 261);
/* 337 */     a(a, "key.keyboard.end", 269);
/* 338 */     a(a, "key.keyboard.home", 268);
/* 339 */     a(a, "key.keyboard.insert", 260);
/* 340 */     a(a, "key.keyboard.page.down", 267);
/* 341 */     a(a, "key.keyboard.page.up", 266);
/*     */     
/* 343 */     a(a, "key.keyboard.caps.lock", 280);
/* 344 */     a(a, "key.keyboard.pause", 284);
/* 345 */     a(a, "key.keyboard.scroll.lock", 281);
/*     */     
/* 347 */     a(a, "key.keyboard.menu", 348);
/* 348 */     a(a, "key.keyboard.print.screen", 283);
/* 349 */     a(a, "key.keyboard.world.1", 161);
/* 350 */     a(a, "key.keyboard.world.2", 162);
/*     */   }
/*     */   
/* 353 */   private final Int2ObjectMap<deo.a> d = (Int2ObjectMap<deo.a>)new Int2ObjectOpenHashMap();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   b(String ☃, BiFunction<Integer, String, nr> biFunction) {
/* 360 */     this.e = ☃;
/* 361 */     this.f = biFunction;
/*     */   }
/*     */   
/*     */   public deo.a a(int ☃) {
/* 365 */     return (deo.a)this.d.computeIfAbsent(☃, ☃ -> {
/*     */           int i = ☃;
/*     */           if (this == c)
/*     */             i++; 
/*     */           String str = this.e + "." + i;
/*     */           return new deo.a(str, this, ☃, null);
/*     */         });
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\deo$b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */