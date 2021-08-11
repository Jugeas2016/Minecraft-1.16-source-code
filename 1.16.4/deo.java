/*     */ import com.google.common.collect.Maps;
/*     */ import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
/*     */ import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
/*     */ import java.lang.invoke.MethodHandle;
/*     */ import java.lang.invoke.MethodHandles;
/*     */ import java.lang.invoke.MethodType;
/*     */ import java.util.Map;
/*     */ import java.util.Objects;
/*     */ import java.util.OptionalInt;
/*     */ import java.util.function.BiFunction;
/*     */ import javax.annotation.Nullable;
/*     */ import org.lwjgl.glfw.GLFW;
/*     */ import org.lwjgl.glfw.GLFWCharModsCallbackI;
/*     */ import org.lwjgl.glfw.GLFWCursorPosCallbackI;
/*     */ import org.lwjgl.glfw.GLFWDropCallbackI;
/*     */ import org.lwjgl.glfw.GLFWKeyCallbackI;
/*     */ import org.lwjgl.glfw.GLFWMouseButtonCallbackI;
/*     */ import org.lwjgl.glfw.GLFWScrollCallbackI;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class deo
/*     */ {
/*     */   @Nullable
/*     */   private static final MethodHandle b;
/*     */   private static final int c;
/*     */   
/*     */   static {
/*  34 */     MethodHandles.Lookup ☃ = MethodHandles.lookup();
/*  35 */     MethodType methodType = MethodType.methodType(boolean.class);
/*     */     
/*  37 */     MethodHandle methodHandle = null;
/*  38 */     int i = 0;
/*     */ 
/*     */     
/*  41 */     try { methodHandle = ☃.findStatic(GLFW.class, "glfwRawMouseMotionSupported", methodType);
/*  42 */       MethodHandle methodHandle1 = ☃.findStaticGetter(GLFW.class, "GLFW_RAW_MOUSE_MOTION", int.class);
/*  43 */       i = methodHandle1.invokeExact(); }
/*  44 */     catch (NoSuchMethodException|NoSuchFieldException noSuchMethodException) {  }
/*  45 */     catch (Throwable throwable)
/*  46 */     { throw new RuntimeException(throwable); }
/*     */ 
/*     */     
/*  49 */     b = methodHandle;
/*  50 */     c = i;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 191 */   public static final a a = b.a.a(-1);
/*     */   public enum b { c, b, a;
/*     */     static {
/* 194 */       a = new b("KEYSYM", 0, "key.keyboard", (☃, str) -> {
/*     */             String str1 = GLFW.glfwGetKeyName(☃.intValue(), -1);
/*     */             return (str1 != null) ? new oe(str1) : new of(str);
/*     */           });
/* 198 */       b = new b("SCANCODE", 1, "scancode", (☃, str) -> {
/*     */             String str1 = GLFW.glfwGetKeyName(-1, ☃.intValue());
/*     */             return (str1 != null) ? new oe(str1) : new of(str);
/*     */           });
/* 202 */       c = new b("MOUSE", 2, "key.mouse", (☃, str) -> ly.a().b(str) ? new of(str) : new of("key.mouse", new Object[] { Integer.valueOf(☃.intValue() + 1) }));
/*     */     } private final BiFunction<Integer, String, nr> f; private final String e;
/*     */     private static void a(b ☃, String str, int i) {
/* 205 */       deo.a a = new deo.a(str, ☃, i);
/* 206 */       ☃.d.put(i, a);
/*     */     }
/*     */     
/*     */     static {
/* 210 */       a(a, "key.keyboard.unknown", -1);
/*     */       
/* 212 */       a(c, "key.mouse.left", 0);
/* 213 */       a(c, "key.mouse.right", 1);
/* 214 */       a(c, "key.mouse.middle", 2);
/* 215 */       a(c, "key.mouse.4", 3);
/* 216 */       a(c, "key.mouse.5", 4);
/* 217 */       a(c, "key.mouse.6", 5);
/* 218 */       a(c, "key.mouse.7", 6);
/* 219 */       a(c, "key.mouse.8", 7);
/*     */       
/* 221 */       a(a, "key.keyboard.0", 48);
/* 222 */       a(a, "key.keyboard.1", 49);
/* 223 */       a(a, "key.keyboard.2", 50);
/* 224 */       a(a, "key.keyboard.3", 51);
/* 225 */       a(a, "key.keyboard.4", 52);
/* 226 */       a(a, "key.keyboard.5", 53);
/* 227 */       a(a, "key.keyboard.6", 54);
/* 228 */       a(a, "key.keyboard.7", 55);
/* 229 */       a(a, "key.keyboard.8", 56);
/* 230 */       a(a, "key.keyboard.9", 57);
/*     */       
/* 232 */       a(a, "key.keyboard.a", 65);
/* 233 */       a(a, "key.keyboard.b", 66);
/* 234 */       a(a, "key.keyboard.c", 67);
/* 235 */       a(a, "key.keyboard.d", 68);
/* 236 */       a(a, "key.keyboard.e", 69);
/* 237 */       a(a, "key.keyboard.f", 70);
/* 238 */       a(a, "key.keyboard.g", 71);
/* 239 */       a(a, "key.keyboard.h", 72);
/* 240 */       a(a, "key.keyboard.i", 73);
/* 241 */       a(a, "key.keyboard.j", 74);
/* 242 */       a(a, "key.keyboard.k", 75);
/* 243 */       a(a, "key.keyboard.l", 76);
/* 244 */       a(a, "key.keyboard.m", 77);
/* 245 */       a(a, "key.keyboard.n", 78);
/* 246 */       a(a, "key.keyboard.o", 79);
/* 247 */       a(a, "key.keyboard.p", 80);
/* 248 */       a(a, "key.keyboard.q", 81);
/* 249 */       a(a, "key.keyboard.r", 82);
/* 250 */       a(a, "key.keyboard.s", 83);
/* 251 */       a(a, "key.keyboard.t", 84);
/* 252 */       a(a, "key.keyboard.u", 85);
/* 253 */       a(a, "key.keyboard.v", 86);
/* 254 */       a(a, "key.keyboard.w", 87);
/* 255 */       a(a, "key.keyboard.x", 88);
/* 256 */       a(a, "key.keyboard.y", 89);
/* 257 */       a(a, "key.keyboard.z", 90);
/*     */       
/* 259 */       a(a, "key.keyboard.f1", 290);
/* 260 */       a(a, "key.keyboard.f2", 291);
/* 261 */       a(a, "key.keyboard.f3", 292);
/* 262 */       a(a, "key.keyboard.f4", 293);
/* 263 */       a(a, "key.keyboard.f5", 294);
/* 264 */       a(a, "key.keyboard.f6", 295);
/* 265 */       a(a, "key.keyboard.f7", 296);
/* 266 */       a(a, "key.keyboard.f8", 297);
/* 267 */       a(a, "key.keyboard.f9", 298);
/* 268 */       a(a, "key.keyboard.f10", 299);
/* 269 */       a(a, "key.keyboard.f11", 300);
/* 270 */       a(a, "key.keyboard.f12", 301);
/* 271 */       a(a, "key.keyboard.f13", 302);
/* 272 */       a(a, "key.keyboard.f14", 303);
/* 273 */       a(a, "key.keyboard.f15", 304);
/* 274 */       a(a, "key.keyboard.f16", 305);
/* 275 */       a(a, "key.keyboard.f17", 306);
/* 276 */       a(a, "key.keyboard.f18", 307);
/* 277 */       a(a, "key.keyboard.f19", 308);
/* 278 */       a(a, "key.keyboard.f20", 309);
/* 279 */       a(a, "key.keyboard.f21", 310);
/* 280 */       a(a, "key.keyboard.f22", 311);
/* 281 */       a(a, "key.keyboard.f23", 312);
/* 282 */       a(a, "key.keyboard.f24", 313);
/* 283 */       a(a, "key.keyboard.f25", 314);
/*     */       
/* 285 */       a(a, "key.keyboard.num.lock", 282);
/* 286 */       a(a, "key.keyboard.keypad.0", 320);
/* 287 */       a(a, "key.keyboard.keypad.1", 321);
/* 288 */       a(a, "key.keyboard.keypad.2", 322);
/* 289 */       a(a, "key.keyboard.keypad.3", 323);
/* 290 */       a(a, "key.keyboard.keypad.4", 324);
/* 291 */       a(a, "key.keyboard.keypad.5", 325);
/* 292 */       a(a, "key.keyboard.keypad.6", 326);
/* 293 */       a(a, "key.keyboard.keypad.7", 327);
/* 294 */       a(a, "key.keyboard.keypad.8", 328);
/* 295 */       a(a, "key.keyboard.keypad.9", 329);
/* 296 */       a(a, "key.keyboard.keypad.add", 334);
/* 297 */       a(a, "key.keyboard.keypad.decimal", 330);
/* 298 */       a(a, "key.keyboard.keypad.enter", 335);
/* 299 */       a(a, "key.keyboard.keypad.equal", 336);
/* 300 */       a(a, "key.keyboard.keypad.multiply", 332);
/* 301 */       a(a, "key.keyboard.keypad.divide", 331);
/* 302 */       a(a, "key.keyboard.keypad.subtract", 333);
/*     */       
/* 304 */       a(a, "key.keyboard.down", 264);
/* 305 */       a(a, "key.keyboard.left", 263);
/* 306 */       a(a, "key.keyboard.right", 262);
/* 307 */       a(a, "key.keyboard.up", 265);
/*     */       
/* 309 */       a(a, "key.keyboard.apostrophe", 39);
/* 310 */       a(a, "key.keyboard.backslash", 92);
/* 311 */       a(a, "key.keyboard.comma", 44);
/* 312 */       a(a, "key.keyboard.equal", 61);
/* 313 */       a(a, "key.keyboard.grave.accent", 96);
/* 314 */       a(a, "key.keyboard.left.bracket", 91);
/* 315 */       a(a, "key.keyboard.minus", 45);
/* 316 */       a(a, "key.keyboard.period", 46);
/* 317 */       a(a, "key.keyboard.right.bracket", 93);
/* 318 */       a(a, "key.keyboard.semicolon", 59);
/* 319 */       a(a, "key.keyboard.slash", 47);
/* 320 */       a(a, "key.keyboard.space", 32);
/* 321 */       a(a, "key.keyboard.tab", 258);
/*     */       
/* 323 */       a(a, "key.keyboard.left.alt", 342);
/* 324 */       a(a, "key.keyboard.left.control", 341);
/* 325 */       a(a, "key.keyboard.left.shift", 340);
/* 326 */       a(a, "key.keyboard.left.win", 343);
/* 327 */       a(a, "key.keyboard.right.alt", 346);
/* 328 */       a(a, "key.keyboard.right.control", 345);
/* 329 */       a(a, "key.keyboard.right.shift", 344);
/* 330 */       a(a, "key.keyboard.right.win", 347);
/*     */       
/* 332 */       a(a, "key.keyboard.enter", 257);
/* 333 */       a(a, "key.keyboard.escape", 256);
/*     */       
/* 335 */       a(a, "key.keyboard.backspace", 259);
/* 336 */       a(a, "key.keyboard.delete", 261);
/* 337 */       a(a, "key.keyboard.end", 269);
/* 338 */       a(a, "key.keyboard.home", 268);
/* 339 */       a(a, "key.keyboard.insert", 260);
/* 340 */       a(a, "key.keyboard.page.down", 267);
/* 341 */       a(a, "key.keyboard.page.up", 266);
/*     */       
/* 343 */       a(a, "key.keyboard.caps.lock", 280);
/* 344 */       a(a, "key.keyboard.pause", 284);
/* 345 */       a(a, "key.keyboard.scroll.lock", 281);
/*     */       
/* 347 */       a(a, "key.keyboard.menu", 348);
/* 348 */       a(a, "key.keyboard.print.screen", 283);
/* 349 */       a(a, "key.keyboard.world.1", 161);
/* 350 */       a(a, "key.keyboard.world.2", 162);
/*     */     }
/*     */     
/* 353 */     private final Int2ObjectMap<deo.a> d = (Int2ObjectMap<deo.a>)new Int2ObjectOpenHashMap();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     b(String ☃, BiFunction<Integer, String, nr> biFunction) {
/* 360 */       this.e = ☃;
/* 361 */       this.f = biFunction;
/*     */     }
/*     */     
/*     */     public deo.a a(int ☃) {
/* 365 */       return (deo.a)this.d.computeIfAbsent(☃, ☃ -> {
/*     */             int i = ☃;
/*     */             if (this == c) {
/*     */               i++;
/*     */             }
/*     */             String str = this.e + "." + i;
/*     */             return new deo.a(str, this, ☃);
/*     */           });
/*     */     } }
/*     */ 
/*     */ 
/*     */   
/*     */   public static final class a
/*     */   {
/*     */     private final String a;
/*     */     private final deo.b b;
/*     */     private final int c;
/*     */     private final afi<nr> d;
/* 383 */     private static final Map<String, a> e = Maps.newHashMap();
/*     */     
/*     */     private a(String ☃, deo.b b1, int i) {
/* 386 */       this.a = ☃;
/* 387 */       this.b = b1;
/* 388 */       this.c = i;
/*     */       
/* 390 */       this.d = new afi<>(() -> (nr)deo.b.a(☃).apply(Integer.valueOf(i), str));
/* 391 */       e.put(☃, this);
/*     */     }
/*     */     
/*     */     public deo.b a() {
/* 395 */       return this.b;
/*     */     }
/*     */     
/*     */     public int b() {
/* 399 */       return this.c;
/*     */     }
/*     */     
/*     */     public String c() {
/* 403 */       return this.a;
/*     */     }
/*     */     
/*     */     public nr d() {
/* 407 */       return this.d.a();
/*     */     }
/*     */     
/*     */     public OptionalInt e() {
/* 411 */       if (this.c >= 48 && this.c <= 57) {
/* 412 */         return OptionalInt.of(this.c - 48);
/*     */       }
/* 414 */       if (this.c >= 320 && this.c <= 329) {
/* 415 */         return OptionalInt.of(this.c - 320);
/*     */       }
/* 417 */       return OptionalInt.empty();
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean equals(Object ☃) {
/* 422 */       if (this == ☃) {
/* 423 */         return true;
/*     */       }
/* 425 */       if (☃ == null || getClass() != ☃.getClass()) {
/* 426 */         return false;
/*     */       }
/* 428 */       a a1 = (a)☃;
/* 429 */       return (this.c == a1.c && this.b == a1.b);
/*     */     }
/*     */ 
/*     */     
/*     */     public int hashCode() {
/* 434 */       return Objects.hash(new Object[] { this.b, Integer.valueOf(this.c) });
/*     */     }
/*     */ 
/*     */     
/*     */     public String toString() {
/* 439 */       return this.a;
/*     */     }
/*     */   }
/*     */   
/*     */   public static a a(int ☃, int i) {
/* 444 */     if (☃ == -1) {
/* 445 */       return b.b.a(i);
/*     */     }
/* 447 */     return b.a.a(☃);
/*     */   }
/*     */   
/*     */   public static a a(String ☃) {
/* 451 */     if (a.f().containsKey(☃)) {
/* 452 */       return (a)a.f().get(☃);
/*     */     }
/*     */     
/* 455 */     for (b b : b.values()) {
/* 456 */       if (☃.startsWith(b.b(b))) {
/* 457 */         String str = ☃.substring(b.b(b).length() + 1);
/* 458 */         return b.a(Integer.parseInt(str));
/*     */       } 
/*     */     } 
/* 461 */     throw new IllegalArgumentException("Unknown key name: " + ☃);
/*     */   }
/*     */   
/*     */   public static boolean a(long ☃, int i) {
/* 465 */     return (GLFW.glfwGetKey(☃, i) == 1);
/*     */   }
/*     */   
/*     */   public static void a(long ☃, GLFWKeyCallbackI gLFWKeyCallbackI, GLFWCharModsCallbackI gLFWCharModsCallbackI) {
/* 469 */     GLFW.glfwSetKeyCallback(☃, gLFWKeyCallbackI);
/* 470 */     GLFW.glfwSetCharModsCallback(☃, gLFWCharModsCallbackI);
/*     */   }
/*     */   
/*     */   public static void a(long ☃, GLFWCursorPosCallbackI gLFWCursorPosCallbackI, GLFWMouseButtonCallbackI gLFWMouseButtonCallbackI, GLFWScrollCallbackI gLFWScrollCallbackI, GLFWDropCallbackI gLFWDropCallbackI) {
/* 474 */     GLFW.glfwSetCursorPosCallback(☃, gLFWCursorPosCallbackI);
/* 475 */     GLFW.glfwSetMouseButtonCallback(☃, gLFWMouseButtonCallbackI);
/* 476 */     GLFW.glfwSetScrollCallback(☃, gLFWScrollCallbackI);
/* 477 */     GLFW.glfwSetDropCallback(☃, gLFWDropCallbackI);
/*     */   }
/*     */   
/*     */   public static void a(long ☃, int i, double d1, double d2) {
/* 481 */     GLFW.glfwSetCursorPos(☃, d1, d2);
/* 482 */     GLFW.glfwSetInputMode(☃, 208897, i);
/*     */   }
/*     */   
/*     */   public static boolean a() {
/*     */     try {
/* 487 */       return (b != null && b.invokeExact());
/* 488 */     } catch (Throwable ☃) {
/* 489 */       throw new RuntimeException(☃);
/*     */     } 
/*     */   }
/*     */   
/*     */   public static void a(long ☃, boolean bool) {
/* 494 */     if (a())
/* 495 */       GLFW.glfwSetInputMode(☃, c, bool ? 1 : 0); 
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\deo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */