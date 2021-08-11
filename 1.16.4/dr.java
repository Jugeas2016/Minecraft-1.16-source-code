/*     */ import com.google.common.collect.Lists;
/*     */ import com.mojang.brigadier.Message;
/*     */ import com.mojang.brigadier.StringReader;
/*     */ import com.mojang.brigadier.arguments.ArgumentType;
/*     */ import com.mojang.brigadier.context.CommandContext;
/*     */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*     */ import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
/*     */ import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
/*     */ import it.unimi.dsi.fastutil.objects.Object2IntMap;
/*     */ import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
/*     */ import java.util.Arrays;
/*     */ import java.util.Collection;
/*     */ import java.util.Collections;
/*     */ import java.util.List;
/*     */ import java.util.function.BiConsumer;
/*     */ import java.util.function.Function;
/*     */ import java.util.function.Predicate;
/*     */ import java.util.function.Supplier;
/*     */ import org.apache.commons.lang3.mutable.MutableBoolean;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class dr
/*     */   implements ArgumentType<dr.h>
/*     */ {
/*  32 */   private static final Collection<String> c = Arrays.asList(new String[] { "foo", "foo.bar", "foo[0]", "[0]", "[]", "{foo=bar}" });
/*  33 */   public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(new of("arguments.nbtpath.node.invalid")); public static final DynamicCommandExceptionType b; static {
/*  34 */     b = new DynamicCommandExceptionType(☃ -> new of("arguments.nbtpath.nothing_found", new Object[] { ☃ }));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static dr a() {
/*  42 */     return new dr();
/*     */   }
/*     */   
/*     */   public static h a(CommandContext<db> ☃, String str) {
/*  46 */     return (h)☃.getArgument(str, h.class);
/*     */   }
/*     */ 
/*     */   
/*     */   public h a(StringReader ☃) throws CommandSyntaxException {
/*  51 */     List<i> list = Lists.newArrayList();
/*  52 */     int i = ☃.getCursor();
/*     */     
/*  54 */     Object2IntOpenHashMap object2IntOpenHashMap = new Object2IntOpenHashMap();
/*  55 */     boolean bool = true;
/*  56 */     while (☃.canRead() && ☃.peek() != ' ') {
/*  57 */       i i1 = a(☃, bool);
/*  58 */       list.add(i1);
/*  59 */       object2IntOpenHashMap.put(i1, ☃.getCursor() - i);
/*  60 */       bool = false;
/*  61 */       if (☃.canRead()) {
/*  62 */         char c = ☃.peek();
/*  63 */         if (c != ' ' && c != '[' && c != '{') {
/*  64 */           ☃.expect('.');
/*     */         }
/*     */       } 
/*     */     } 
/*     */     
/*  69 */     return new h(☃.getString().substring(i, ☃.getCursor()), list.<i>toArray(new i[0]), (Object2IntMap<i>)object2IntOpenHashMap);
/*     */   } private static i a(StringReader ☃, boolean bool) throws CommandSyntaxException {
/*     */     md md;
/*     */     int i, j;
/*  73 */     switch (☃.peek()) {
/*     */       case '{':
/*  75 */         if (!bool) {
/*  76 */           throw a.createWithContext(☃);
/*     */         }
/*  78 */         md = (new mu(☃)).f();
/*  79 */         return new g(md);
/*     */       
/*     */       case '[':
/*  82 */         ☃.skip();
/*  83 */         i = ☃.peek();
/*  84 */         if (i == 123) {
/*  85 */           md md1 = (new mu(☃)).f();
/*  86 */           ☃.expect(']');
/*  87 */           return new e(md1);
/*  88 */         }  if (i == 93) {
/*  89 */           ☃.skip();
/*  90 */           return a.a;
/*     */         } 
/*     */         
/*  93 */         j = ☃.readInt();
/*  94 */         ☃.expect(']');
/*  95 */         return new c(j);
/*     */       
/*     */       case '"':
/*  98 */         str = ☃.readString();
/*  99 */         return a(☃, str);
/*     */     } 
/*     */     
/* 102 */     String str = b(☃);
/* 103 */     return a(☃, str);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private static i a(StringReader ☃, String str) throws CommandSyntaxException {
/* 109 */     if (☃.canRead() && ☃.peek() == '{') {
/* 110 */       md md = (new mu(☃)).f();
/* 111 */       return new f(str, md);
/*     */     } 
/* 113 */     return new b(str);
/*     */   }
/*     */ 
/*     */   
/*     */   private static String b(StringReader ☃) throws CommandSyntaxException {
/* 118 */     int i = ☃.getCursor();
/* 119 */     while (☃.canRead() && a(☃.peek())) {
/* 120 */       ☃.skip();
/*     */     }
/* 122 */     if (☃.getCursor() == i) {
/* 123 */       throw a.createWithContext(☃);
/*     */     }
/* 125 */     return ☃.getString().substring(i, ☃.getCursor());
/*     */   }
/*     */ 
/*     */   
/*     */   public Collection<String> getExamples() {
/* 130 */     return c;
/*     */   }
/*     */   
/*     */   private static boolean a(char ☃) {
/* 134 */     return (☃ != ' ' && ☃ != '"' && ☃ != '[' && ☃ != ']' && ☃ != '.' && ☃ != '{' && ☃ != '}');
/*     */   }
/*     */   
/*     */   public static class h {
/*     */     private final String a;
/*     */     private final Object2IntMap<dr.i> b;
/*     */     private final dr.i[] c;
/*     */     
/*     */     public h(String ☃, dr.i[] arrayOfI, Object2IntMap<dr.i> object2IntMap) {
/* 143 */       this.a = ☃;
/* 144 */       this.c = arrayOfI;
/* 145 */       this.b = object2IntMap;
/*     */     }
/*     */     
/*     */     public List<mt> a(mt ☃) throws CommandSyntaxException {
/* 149 */       List<mt> list = Collections.singletonList(☃);
/* 150 */       for (dr.i i1 : this.c) {
/* 151 */         list = i1.a(list);
/* 152 */         if (list.isEmpty()) {
/* 153 */           throw a(i1);
/*     */         }
/*     */       } 
/* 156 */       return list;
/*     */     }
/*     */     
/*     */     public int b(mt ☃) {
/* 160 */       List<mt> list = Collections.singletonList(☃);
/* 161 */       for (dr.i i1 : this.c) {
/* 162 */         list = i1.a(list);
/* 163 */         if (list.isEmpty()) {
/* 164 */           return 0;
/*     */         }
/*     */       } 
/* 167 */       return list.size();
/*     */     }
/*     */     
/*     */     private List<mt> d(mt ☃) throws CommandSyntaxException {
/* 171 */       List<mt> list = Collections.singletonList(☃);
/*     */       
/* 173 */       for (int j = 0; j < this.c.length - 1; j++) {
/* 174 */         dr.i i1 = this.c[j];
/* 175 */         int k = j + 1;
/* 176 */         list = i1.a(list, this.c[k]::a);
/* 177 */         if (list.isEmpty()) {
/* 178 */           throw a(i1);
/*     */         }
/*     */       } 
/* 181 */       return list;
/*     */     }
/*     */     
/*     */     public List<mt> a(mt ☃, Supplier<mt> supplier) throws CommandSyntaxException {
/* 185 */       List<mt> list = d(☃);
/*     */       
/* 187 */       dr.i i1 = this.c[this.c.length - 1];
/* 188 */       return i1.a(list, supplier);
/*     */     }
/*     */     
/*     */     private static int a(List<mt> ☃, Function<mt, Integer> function) {
/* 192 */       return ((Integer)☃.stream().<Integer>map(function).reduce(Integer.valueOf(0), (☃, integer1) -> Integer.valueOf(☃.intValue() + integer1.intValue()))).intValue();
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public int b(mt ☃, Supplier<mt> supplier) throws CommandSyntaxException {
/* 200 */       List<mt> list = d(☃);
/*     */       
/* 202 */       dr.i i1 = this.c[this.c.length - 1];
/* 203 */       return a(list, mt1 -> Integer.valueOf(☃.a(mt1, supplier)));
/*     */     }
/*     */     
/*     */     public int c(mt ☃) {
/* 207 */       List<mt> list = Collections.singletonList(☃);
/*     */       
/* 209 */       for (int j = 0; j < this.c.length - 1; j++) {
/* 210 */         list = this.c[j].a(list);
/*     */       }
/*     */       
/* 213 */       dr.i i1 = this.c[this.c.length - 1];
/* 214 */       return a(list, i1::a);
/*     */     }
/*     */     
/*     */     private CommandSyntaxException a(dr.i ☃) {
/* 218 */       int j = this.b.getInt(☃);
/* 219 */       return dr.b.create(this.a.substring(0, j));
/*     */     }
/*     */ 
/*     */     
/*     */     public String toString() {
/* 224 */       return this.a;
/*     */     }
/*     */   }
/*     */   
/*     */   private static Predicate<mt> b(md ☃) {
/* 229 */     return mt1 -> mp.a(☃, mt1, true);
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
/*     */   static interface i
/*     */   {
/*     */     default List<mt> a(List<mt> ☃) {
/* 244 */       return a(☃, this::a);
/*     */     }
/*     */     
/*     */     default List<mt> a(List<mt> ☃, Supplier<mt> supplier) {
/* 248 */       return a(☃, (mt1, list) -> a(mt1, ☃, list));
/*     */     } void a(mt param1mt, List<mt> param1List); void a(mt param1mt, Supplier<mt> param1Supplier, List<mt> param1List);
/*     */     mt a();
/*     */     default List<mt> a(List<mt> ☃, BiConsumer<mt, List<mt>> biConsumer) {
/* 252 */       List<mt> list = Lists.newArrayList();
/*     */       
/* 254 */       for (mt mt : ☃) {
/* 255 */         biConsumer.accept(mt, list);
/*     */       }
/*     */       
/* 258 */       return list;
/*     */     }
/*     */     
/*     */     int a(mt param1mt, Supplier<mt> param1Supplier);
/*     */     
/*     */     int a(mt param1mt); }
/*     */   
/*     */   static class b implements i { public b(String ☃) {
/* 266 */       this.a = ☃;
/*     */     }
/*     */     private final String a;
/*     */     
/*     */     public void a(mt ☃, List<mt> list) {
/* 271 */       if (☃ instanceof md) {
/* 272 */         mt mt1 = ((md)☃).c(this.a);
/* 273 */         if (mt1 != null) {
/* 274 */           list.add(mt1);
/*     */         }
/*     */       } 
/*     */     }
/*     */ 
/*     */     
/*     */     public void a(mt ☃, Supplier<mt> supplier, List<mt> list) {
/* 281 */       if (☃ instanceof md) {
/* 282 */         mt mt1; md md = (md)☃;
/*     */         
/* 284 */         if (md.e(this.a)) {
/* 285 */           mt1 = md.c(this.a);
/*     */         } else {
/* 287 */           mt1 = supplier.get();
/* 288 */           md.a(this.a, mt1);
/*     */         } 
/*     */         
/* 291 */         list.add(mt1);
/*     */       } 
/*     */     }
/*     */ 
/*     */     
/*     */     public mt a() {
/* 297 */       return new md();
/*     */     }
/*     */ 
/*     */     
/*     */     public int a(mt ☃, Supplier<mt> supplier) {
/* 302 */       if (☃ instanceof md) {
/* 303 */         md md = (md)☃;
/* 304 */         mt mt1 = supplier.get();
/* 305 */         mt mt2 = md.a(this.a, mt1);
/* 306 */         if (!mt1.equals(mt2)) {
/* 307 */           return 1;
/*     */         }
/*     */       } 
/*     */       
/* 311 */       return 0;
/*     */     }
/*     */ 
/*     */     
/*     */     public int a(mt ☃) {
/* 316 */       if (☃ instanceof md) {
/* 317 */         md md = (md)☃;
/* 318 */         if (md.e(this.a)) {
/* 319 */           md.r(this.a);
/* 320 */           return 1;
/*     */         } 
/*     */       } 
/*     */       
/* 324 */       return 0;
/*     */     } }
/*     */ 
/*     */   
/*     */   static class c implements i {
/*     */     private final int a;
/*     */     
/*     */     public c(int ☃) {
/* 332 */       this.a = ☃;
/*     */     }
/*     */ 
/*     */     
/*     */     public void a(mt ☃, List<mt> list) {
/* 337 */       if (☃ instanceof mc) {
/* 338 */         mc<?> mc = (mc)☃;
/*     */         
/* 340 */         int j = mc.size();
/* 341 */         int k = (this.a < 0) ? (j + this.a) : this.a;
/*     */         
/* 343 */         if (0 <= k && k < j) {
/* 344 */           list.add((mt)mc.get(k));
/*     */         }
/*     */       } 
/*     */     }
/*     */ 
/*     */     
/*     */     public void a(mt ☃, Supplier<mt> supplier, List<mt> list) {
/* 351 */       a(☃, list);
/*     */     }
/*     */ 
/*     */     
/*     */     public mt a() {
/* 356 */       return new mj();
/*     */     }
/*     */ 
/*     */     
/*     */     public int a(mt ☃, Supplier<mt> supplier) {
/* 361 */       if (☃ instanceof mc) {
/* 362 */         mc<?> mc = (mc)☃;
/* 363 */         int j = mc.size();
/* 364 */         int k = (this.a < 0) ? (j + this.a) : this.a;
/*     */         
/* 366 */         if (0 <= k && k < j) {
/* 367 */           mt mt1 = (mt)mc.get(k);
/* 368 */           mt mt2 = supplier.get();
/* 369 */           if (!mt2.equals(mt1) && mc.a(k, mt2)) {
/* 370 */             return 1;
/*     */           }
/*     */         } 
/*     */       } 
/*     */       
/* 375 */       return 0;
/*     */     }
/*     */ 
/*     */     
/*     */     public int a(mt ☃) {
/* 380 */       if (☃ instanceof mc) {
/* 381 */         mc<?> mc = (mc)☃;
/* 382 */         int j = mc.size();
/* 383 */         int k = (this.a < 0) ? (j + this.a) : this.a;
/*     */         
/* 385 */         if (0 <= k && k < j) {
/* 386 */           mc.c(k);
/* 387 */           return 1;
/*     */         } 
/*     */       } 
/*     */       
/* 391 */       return 0;
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   static class e
/*     */     implements i
/*     */   {
/*     */     private final md a;
/*     */     
/*     */     private final Predicate<mt> b;
/*     */     
/*     */     public e(md ☃) {
/* 404 */       this.a = ☃;
/* 405 */       this.b = dr.a(☃);
/*     */     }
/*     */ 
/*     */     
/*     */     public void a(mt ☃, List<mt> list) {
/* 410 */       if (☃ instanceof mj) {
/* 411 */         mj mj = (mj)☃;
/* 412 */         mj.stream().filter(this.b).forEach(list::add);
/*     */       } 
/*     */     }
/*     */ 
/*     */     
/*     */     public void a(mt ☃, Supplier<mt> supplier, List<mt> list) {
/* 418 */       MutableBoolean mutableBoolean = new MutableBoolean();
/* 419 */       if (☃ instanceof mj) {
/* 420 */         mj mj = (mj)☃;
/* 421 */         mj.stream().filter(this.b).forEach(mt1 -> {
/*     */               ☃.add(mt1);
/*     */               
/*     */               mutableBoolean.setTrue();
/*     */             });
/* 426 */         if (mutableBoolean.isFalse()) {
/* 427 */           md md1 = this.a.g();
/* 428 */           mj.add(md1);
/* 429 */           list.add(md1);
/*     */         } 
/*     */       } 
/*     */     }
/*     */ 
/*     */     
/*     */     public mt a() {
/* 436 */       return new mj();
/*     */     }
/*     */ 
/*     */     
/*     */     public int a(mt ☃, Supplier<mt> supplier) {
/* 441 */       int j = 0;
/* 442 */       if (☃ instanceof mj) {
/* 443 */         mj mj = (mj)☃;
/* 444 */         int k = mj.size();
/* 445 */         if (k == 0) {
/* 446 */           mj.add(supplier.get());
/* 447 */           j++;
/*     */         } else {
/* 449 */           for (int m = 0; m < k; m++) {
/* 450 */             mt mt1 = mj.k(m);
/* 451 */             if (this.b.test(mt1)) {
/* 452 */               mt mt2 = supplier.get();
/* 453 */               if (!mt2.equals(mt1) && mj.a(m, mt2)) {
/* 454 */                 j++;
/*     */               }
/*     */             } 
/*     */           } 
/*     */         } 
/*     */       } 
/*     */       
/* 461 */       return j;
/*     */     }
/*     */ 
/*     */     
/*     */     public int a(mt ☃) {
/* 466 */       int j = 0;
/* 467 */       if (☃ instanceof mj) {
/* 468 */         mj mj = (mj)☃;
/* 469 */         for (int k = mj.size() - 1; k >= 0; k--) {
/* 470 */           if (this.b.test(mj.k(k))) {
/* 471 */             mj.c(k);
/* 472 */             j++;
/*     */           } 
/*     */         } 
/*     */       } 
/*     */       
/* 477 */       return j;
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   static class a
/*     */     implements i
/*     */   {
/* 485 */     public static final a a = new a();
/*     */ 
/*     */     
/*     */     public void a(mt ☃, List<mt> list) {
/* 489 */       if (☃ instanceof mc) {
/* 490 */         list.addAll((mc)☃);
/*     */       }
/*     */     }
/*     */ 
/*     */     
/*     */     public void a(mt ☃, Supplier<mt> supplier, List<mt> list) {
/* 496 */       if (☃ instanceof mc) {
/* 497 */         mc<?> mc = (mc)☃;
/* 498 */         if (mc.isEmpty()) {
/* 499 */           mt mt1 = supplier.get();
/* 500 */           if (mc.b(0, mt1)) {
/* 501 */             list.add(mt1);
/*     */           }
/*     */         } else {
/* 504 */           list.addAll(mc);
/*     */         } 
/*     */       } 
/*     */     }
/*     */ 
/*     */     
/*     */     public mt a() {
/* 511 */       return new mj();
/*     */     }
/*     */ 
/*     */     
/*     */     public int a(mt ☃, Supplier<mt> supplier) {
/* 516 */       if (☃ instanceof mc) {
/* 517 */         mc<?> mc = (mc)☃;
/* 518 */         int j = mc.size();
/* 519 */         if (j == 0) {
/* 520 */           mc.b(0, supplier.get());
/* 521 */           return 1;
/*     */         } 
/* 523 */         mt mt1 = supplier.get();
/* 524 */         int k = j - (int)mc.stream().filter(mt1::equals).count();
/* 525 */         if (k == 0) {
/* 526 */           return 0;
/*     */         }
/* 528 */         mc.clear();
/* 529 */         if (!mc.b(0, mt1)) {
/* 530 */           return 0;
/*     */         }
/* 532 */         for (int m = 1; m < j; m++) {
/* 533 */           mc.b(m, supplier.get());
/*     */         }
/*     */         
/* 536 */         return k;
/*     */       } 
/*     */       
/* 539 */       return 0;
/*     */     }
/*     */ 
/*     */     
/*     */     public int a(mt ☃) {
/* 544 */       if (☃ instanceof mc) {
/* 545 */         mc<?> mc = (mc)☃;
/* 546 */         int j = mc.size();
/* 547 */         if (j > 0) {
/* 548 */           mc.clear();
/* 549 */           return j;
/*     */         } 
/*     */       } 
/*     */       
/* 553 */       return 0;
/*     */     }
/*     */   }
/*     */   
/*     */   static class f implements i {
/*     */     private final String a;
/*     */     private final md b;
/*     */     private final Predicate<mt> c;
/*     */     
/*     */     public f(String ☃, md md1) {
/* 563 */       this.a = ☃;
/* 564 */       this.b = md1;
/* 565 */       this.c = dr.a(md1);
/*     */     }
/*     */ 
/*     */     
/*     */     public void a(mt ☃, List<mt> list) {
/* 570 */       if (☃ instanceof md) {
/* 571 */         mt mt1 = ((md)☃).c(this.a);
/* 572 */         if (this.c.test(mt1)) {
/* 573 */           list.add(mt1);
/*     */         }
/*     */       } 
/*     */     }
/*     */ 
/*     */     
/*     */     public void a(mt ☃, Supplier<mt> supplier, List<mt> list) {
/* 580 */       if (☃ instanceof md) {
/* 581 */         md md1 = (md)☃;
/* 582 */         mt mt1 = md1.c(this.a);
/* 583 */         if (mt1 == null) {
/* 584 */           mt1 = this.b.g();
/* 585 */           md1.a(this.a, mt1);
/* 586 */           list.add(mt1);
/* 587 */         } else if (this.c.test(mt1)) {
/* 588 */           list.add(mt1);
/*     */         } 
/*     */       } 
/*     */     }
/*     */ 
/*     */     
/*     */     public mt a() {
/* 595 */       return new md();
/*     */     }
/*     */ 
/*     */     
/*     */     public int a(mt ☃, Supplier<mt> supplier) {
/* 600 */       if (☃ instanceof md) {
/* 601 */         md md1 = (md)☃;
/* 602 */         mt mt1 = md1.c(this.a);
/* 603 */         if (this.c.test(mt1)) {
/* 604 */           mt mt2 = supplier.get();
/* 605 */           if (!mt2.equals(mt1)) {
/* 606 */             md1.a(this.a, mt2);
/* 607 */             return 1;
/*     */           } 
/*     */         } 
/*     */       } 
/*     */       
/* 612 */       return 0;
/*     */     }
/*     */ 
/*     */     
/*     */     public int a(mt ☃) {
/* 617 */       if (☃ instanceof md) {
/* 618 */         md md1 = (md)☃;
/* 619 */         mt mt1 = md1.c(this.a);
/* 620 */         if (this.c.test(mt1)) {
/* 621 */           md1.r(this.a);
/* 622 */           return 1;
/*     */         } 
/*     */       } 
/*     */       
/* 626 */       return 0;
/*     */     }
/*     */   }
/*     */   
/*     */   static class g implements i {
/*     */     private final Predicate<mt> a;
/*     */     
/*     */     public g(md ☃) {
/* 634 */       this.a = dr.a(☃);
/*     */     }
/*     */ 
/*     */     
/*     */     public void a(mt ☃, List<mt> list) {
/* 639 */       if (☃ instanceof md && this.a.test(☃)) {
/* 640 */         list.add(☃);
/*     */       }
/*     */     }
/*     */ 
/*     */     
/*     */     public void a(mt ☃, Supplier<mt> supplier, List<mt> list) {
/* 646 */       a(☃, list);
/*     */     }
/*     */ 
/*     */     
/*     */     public mt a() {
/* 651 */       return new md();
/*     */     }
/*     */ 
/*     */     
/*     */     public int a(mt ☃, Supplier<mt> supplier) {
/* 656 */       return 0;
/*     */     }
/*     */ 
/*     */     
/*     */     public int a(mt ☃) {
/* 661 */       return 0;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dr.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */