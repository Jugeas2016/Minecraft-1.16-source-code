/*     */ import com.google.common.base.Strings;
/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.collect.Maps;
/*     */ import com.mojang.serialization.Codec;
/*     */ import com.mojang.serialization.DataResult;
/*     */ import com.mojang.serialization.Dynamic;
/*     */ import java.io.DataInput;
/*     */ import java.io.DataOutput;
/*     */ import java.io.IOException;
/*     */ import java.util.Collection;
/*     */ import java.util.Collections;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Objects;
/*     */ import java.util.Set;
/*     */ import java.util.UUID;
/*     */ import java.util.regex.Pattern;
/*     */ import javax.annotation.Nullable;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class md
/*     */   implements mt
/*     */ {
/*     */   public static final Codec<md> a;
/*     */   
/*     */   static {
/*  33 */     a = Codec.PASSTHROUGH.comapFlatMap(☃ -> {
/*     */           mt mt1 = (mt)☃.convert(mo.a).getValue();
/*     */           return (mt1 instanceof md) ? DataResult.success(mt1) : DataResult.error("Not a compound tag: " + mt1);
/*     */         }☃ -> new Dynamic(mo.a, ☃));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  44 */   private static final Logger c = LogManager.getLogger();
/*  45 */   private static final Pattern h = Pattern.compile("[A-Za-z0-9._+-]+");
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  69 */   public static final mv<md> b = new mv<md>()
/*     */     {
/*     */       public md a(DataInput ☃, int i, mm mm1) throws IOException {
/*  72 */         mm1.a(384L);
/*     */         
/*  74 */         if (i > 512) {
/*  75 */           throw new RuntimeException("Tried to read NBT tag with too high complexity, depth > 512");
/*     */         }
/*  77 */         Map<String, mt> map = Maps.newHashMap();
/*     */         byte b;
/*  79 */         while ((b = md.a(☃, mm1)) != 0) {
/*  80 */           String str = md.b(☃, mm1);
/*  81 */           mm1.a((224 + 16 * str.length()));
/*     */           
/*  83 */           mt mt = md.a(mw.a(b), str, ☃, i + 1, mm1);
/*  84 */           if (map.put(str, mt) != null) {
/*  85 */             mm1.a(288L);
/*     */           }
/*     */         } 
/*  88 */         return new md(map);
/*     */       }
/*     */ 
/*     */       
/*     */       public String a() {
/*  93 */         return "COMPOUND";
/*     */       }
/*     */ 
/*     */       
/*     */       public String b() {
/*  98 */         return "TAG_Compound";
/*     */       }
/*     */     };
/*     */   
/*     */   private final Map<String, mt> i;
/*     */   
/*     */   protected md(Map<String, mt> ☃) {
/* 105 */     this.i = ☃;
/*     */   }
/*     */   
/*     */   public md() {
/* 109 */     this(Maps.newHashMap());
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(DataOutput ☃) throws IOException {
/* 114 */     for (String str : this.i.keySet()) {
/* 115 */       mt mt1 = this.i.get(str);
/* 116 */       a(str, mt1, ☃);
/*     */     } 
/* 118 */     ☃.writeByte(0);
/*     */   }
/*     */   
/*     */   public Set<String> d() {
/* 122 */     return this.i.keySet();
/*     */   }
/*     */ 
/*     */   
/*     */   public byte a() {
/* 127 */     return 10;
/*     */   }
/*     */ 
/*     */   
/*     */   public mv<md> b() {
/* 132 */     return b;
/*     */   }
/*     */   
/*     */   public int e() {
/* 136 */     return this.i.size();
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public mt a(String ☃, mt mt1) {
/* 141 */     return this.i.put(☃, mt1);
/*     */   }
/*     */   
/*     */   public void a(String ☃, byte b) {
/* 145 */     this.i.put(☃, mb.a(b));
/*     */   }
/*     */   
/*     */   public void a(String ☃, short s) {
/* 149 */     this.i.put(☃, mr.a(s));
/*     */   }
/*     */   
/*     */   public void b(String ☃, int i) {
/* 153 */     this.i.put(☃, mi.a(i));
/*     */   }
/*     */   
/*     */   public void a(String ☃, long l) {
/* 157 */     this.i.put(☃, ml.a(l));
/*     */   }
/*     */   
/*     */   public void a(String ☃, UUID uUID) {
/* 161 */     this.i.put(☃, mp.a(uUID));
/*     */   }
/*     */   
/*     */   public UUID a(String ☃) {
/* 165 */     return mp.a(c(☃));
/*     */   }
/*     */   
/*     */   public boolean b(String ☃) {
/* 169 */     mt mt1 = c(☃);
/* 170 */     return (mt1 != null && mt1.b() == mh.a && (((mh)mt1).g()).length == 4);
/*     */   }
/*     */   
/*     */   public void a(String ☃, float f) {
/* 174 */     this.i.put(☃, mg.a(f));
/*     */   }
/*     */   
/*     */   public void a(String ☃, double d) {
/* 178 */     this.i.put(☃, me.a(d));
/*     */   }
/*     */   
/*     */   public void a(String ☃, String str1) {
/* 182 */     this.i.put(☃, ms.a(str1));
/*     */   }
/*     */   
/*     */   public void a(String ☃, byte[] arrayOfByte) {
/* 186 */     this.i.put(☃, new ma(arrayOfByte));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(String ☃, int[] arrayOfInt) {
/* 194 */     this.i.put(☃, new mh(arrayOfInt));
/*     */   }
/*     */   
/*     */   public void b(String ☃, List<Integer> list) {
/* 198 */     this.i.put(☃, new mh(list));
/*     */   }
/*     */   
/*     */   public void a(String ☃, long[] arrayOfLong) {
/* 202 */     this.i.put(☃, new mk(arrayOfLong));
/*     */   }
/*     */   
/*     */   public void c(String ☃, List<Long> list) {
/* 206 */     this.i.put(☃, new mk(list));
/*     */   }
/*     */   
/*     */   public void a(String ☃, boolean bool) {
/* 210 */     this.i.put(☃, mb.a(bool));
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public mt c(String ☃) {
/* 215 */     return this.i.get(☃);
/*     */   }
/*     */   
/*     */   public byte d(String ☃) {
/* 219 */     mt mt1 = this.i.get(☃);
/* 220 */     if (mt1 == null) {
/* 221 */       return 0;
/*     */     }
/* 223 */     return mt1.a();
/*     */   }
/*     */   
/*     */   public boolean e(String ☃) {
/* 227 */     return this.i.containsKey(☃);
/*     */   }
/*     */   
/*     */   public boolean c(String ☃, int i) {
/* 231 */     int j = d(☃);
/* 232 */     if (j == i) {
/* 233 */       return true;
/*     */     }
/* 235 */     if (i == 99) {
/* 236 */       return (j == 1 || j == 2 || j == 3 || j == 4 || j == 5 || j == 6);
/*     */     }
/*     */     
/* 239 */     return false;
/*     */   }
/*     */   
/*     */   public byte f(String ☃) {
/*     */     try {
/* 244 */       if (c(☃, 99)) {
/* 245 */         return ((mq)this.i.get(☃)).h();
/*     */       }
/* 247 */     } catch (ClassCastException classCastException) {}
/*     */     
/* 249 */     return 0;
/*     */   }
/*     */   
/*     */   public short g(String ☃) {
/*     */     try {
/* 254 */       if (c(☃, 99)) {
/* 255 */         return ((mq)this.i.get(☃)).g();
/*     */       }
/* 257 */     } catch (ClassCastException classCastException) {}
/*     */     
/* 259 */     return 0;
/*     */   }
/*     */   
/*     */   public int h(String ☃) {
/*     */     try {
/* 264 */       if (c(☃, 99)) {
/* 265 */         return ((mq)this.i.get(☃)).f();
/*     */       }
/* 267 */     } catch (ClassCastException classCastException) {}
/*     */     
/* 269 */     return 0;
/*     */   }
/*     */   
/*     */   public long i(String ☃) {
/*     */     try {
/* 274 */       if (c(☃, 99)) {
/* 275 */         return ((mq)this.i.get(☃)).e();
/*     */       }
/* 277 */     } catch (ClassCastException classCastException) {}
/*     */     
/* 279 */     return 0L;
/*     */   }
/*     */   
/*     */   public float j(String ☃) {
/*     */     try {
/* 284 */       if (c(☃, 99)) {
/* 285 */         return ((mq)this.i.get(☃)).j();
/*     */       }
/* 287 */     } catch (ClassCastException classCastException) {}
/*     */     
/* 289 */     return 0.0F;
/*     */   }
/*     */   
/*     */   public double k(String ☃) {
/*     */     try {
/* 294 */       if (c(☃, 99)) {
/* 295 */         return ((mq)this.i.get(☃)).i();
/*     */       }
/* 297 */     } catch (ClassCastException classCastException) {}
/*     */     
/* 299 */     return 0.0D;
/*     */   }
/*     */   
/*     */   public String l(String ☃) {
/*     */     try {
/* 304 */       if (c(☃, 8)) {
/* 305 */         return ((mt)this.i.get(☃)).f_();
/*     */       }
/* 307 */     } catch (ClassCastException classCastException) {}
/*     */     
/* 309 */     return "";
/*     */   }
/*     */   
/*     */   public byte[] m(String ☃) {
/*     */     try {
/* 314 */       if (c(☃, 7)) {
/* 315 */         return ((ma)this.i.get(☃)).d();
/*     */       }
/* 317 */     } catch (ClassCastException classCastException) {
/* 318 */       throw new u(a(☃, ma.a, classCastException));
/*     */     } 
/* 320 */     return new byte[0];
/*     */   }
/*     */   
/*     */   public int[] n(String ☃) {
/*     */     try {
/* 325 */       if (c(☃, 11)) {
/* 326 */         return ((mh)this.i.get(☃)).g();
/*     */       }
/* 328 */     } catch (ClassCastException classCastException) {
/* 329 */       throw new u(a(☃, mh.a, classCastException));
/*     */     } 
/* 331 */     return new int[0];
/*     */   }
/*     */   
/*     */   public long[] o(String ☃) {
/*     */     try {
/* 336 */       if (c(☃, 12)) {
/* 337 */         return ((mk)this.i.get(☃)).g();
/*     */       }
/* 339 */     } catch (ClassCastException classCastException) {
/* 340 */       throw new u(a(☃, mk.a, classCastException));
/*     */     } 
/* 342 */     return new long[0];
/*     */   }
/*     */   
/*     */   public md p(String ☃) {
/*     */     try {
/* 347 */       if (c(☃, 10)) {
/* 348 */         return (md)this.i.get(☃);
/*     */       }
/* 350 */     } catch (ClassCastException classCastException) {
/* 351 */       throw new u(a(☃, b, classCastException));
/*     */     } 
/* 353 */     return new md();
/*     */   }
/*     */   
/*     */   public mj d(String ☃, int i) {
/*     */     try {
/* 358 */       if (d(☃) == 9) {
/* 359 */         mj mj = (mj)this.i.get(☃);
/* 360 */         if (mj.isEmpty() || mj.d_() == i) {
/* 361 */           return mj;
/*     */         }
/* 363 */         return new mj();
/*     */       } 
/* 365 */     } catch (ClassCastException classCastException) {
/* 366 */       throw new u(a(☃, mj.a, classCastException));
/*     */     } 
/* 368 */     return new mj();
/*     */   }
/*     */   
/*     */   public boolean q(String ☃) {
/* 372 */     return (f(☃) != 0);
/*     */   }
/*     */   
/*     */   public void r(String ☃) {
/* 376 */     this.i.remove(☃);
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
/*     */   public String toString() {
/* 396 */     StringBuilder ☃ = new StringBuilder("{");
/*     */     
/* 398 */     Collection<String> collection = this.i.keySet();
/* 399 */     if (c.isDebugEnabled()) {
/* 400 */       List<String> list = Lists.newArrayList(this.i.keySet());
/* 401 */       Collections.sort(list);
/* 402 */       collection = list;
/*     */     } 
/* 404 */     for (String str : collection) {
/* 405 */       if (☃.length() != 1) {
/* 406 */         ☃.append(',');
/*     */       }
/* 408 */       ☃.append(s(str)).append(':').append(this.i.get(str));
/*     */     } 
/*     */     
/* 411 */     return ☃.append('}').toString();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isEmpty() {
/* 416 */     return this.i.isEmpty();
/*     */   }
/*     */   
/*     */   private l a(String ☃, mv<?> mv1, ClassCastException classCastException) {
/* 420 */     l l = l.a(classCastException, "Reading NBT data");
/* 421 */     m m = l.a("Corrupt NBT tag", 1);
/*     */     
/* 423 */     m.a("Tag type found", () -> ((mt)this.i.get(☃)).b().a());
/* 424 */     m.a("Tag type expected", mv1::a);
/* 425 */     m.a("Tag name", ☃);
/*     */     
/* 427 */     return l;
/*     */   }
/*     */ 
/*     */   
/*     */   public md g() {
/* 432 */     Map<String, mt> ☃ = Maps.newHashMap(Maps.transformValues(this.i, mt::c));
/* 433 */     return new md(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean equals(Object ☃) {
/* 438 */     if (this == ☃) {
/* 439 */       return true;
/*     */     }
/*     */     
/* 442 */     return (☃ instanceof md && Objects.equals(this.i, ((md)☃).i));
/*     */   }
/*     */ 
/*     */   
/*     */   public int hashCode() {
/* 447 */     return this.i.hashCode();
/*     */   }
/*     */   
/*     */   private static void a(String ☃, mt mt1, DataOutput dataOutput) throws IOException {
/* 451 */     dataOutput.writeByte(mt1.a());
/* 452 */     if (mt1.a() == 0) {
/*     */       return;
/*     */     }
/*     */     
/* 456 */     dataOutput.writeUTF(☃);
/*     */     
/* 458 */     mt1.a(dataOutput);
/*     */   }
/*     */   
/*     */   private static byte c(DataInput ☃, mm mm1) throws IOException {
/* 462 */     return ☃.readByte();
/*     */   }
/*     */   
/*     */   private static String d(DataInput ☃, mm mm1) throws IOException {
/* 466 */     return ☃.readUTF();
/*     */   }
/*     */   
/*     */   private static mt b(mv<?> ☃, String str, DataInput dataInput, int i, mm mm1) {
/*     */     try {
/* 471 */       return (mt)☃.b(dataInput, i, mm1);
/* 472 */     } catch (IOException iOException) {
/* 473 */       l l = l.a(iOException, "Loading NBT data");
/* 474 */       m m = l.a("NBT Tag");
/* 475 */       m.a("Tag name", str);
/* 476 */       m.a("Tag type", ☃.a());
/* 477 */       throw new u(l);
/*     */     } 
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
/*     */   public md a(md ☃) {
/* 495 */     for (String str : ☃.i.keySet()) {
/* 496 */       mt mt1 = ☃.i.get(str);
/*     */ 
/*     */       
/* 499 */       if (mt1.a() == 10) {
/* 500 */         if (c(str, 10)) {
/* 501 */           md md1 = p(str);
/* 502 */           md1.a((md)mt1); continue;
/*     */         } 
/* 504 */         a(str, mt1.c());
/*     */         continue;
/*     */       } 
/* 507 */       a(str, mt1.c());
/*     */     } 
/*     */     
/* 510 */     return this;
/*     */   }
/*     */   
/*     */   protected static String s(String ☃) {
/* 514 */     if (h.matcher(☃).matches()) {
/* 515 */       return ☃;
/*     */     }
/*     */     
/* 518 */     return ms.b(☃);
/*     */   }
/*     */   
/*     */   protected static nr t(String ☃) {
/* 522 */     if (h.matcher(☃).matches()) {
/* 523 */       return (new oe(☃)).a(d);
/*     */     }
/*     */     
/* 526 */     String str1 = ms.b(☃);
/* 527 */     String str2 = str1.substring(0, 1);
/* 528 */     nr nr = (new oe(str1.substring(1, str1.length() - 1))).a(d);
/* 529 */     return (new oe(str2)).a(nr).c(str2);
/*     */   }
/*     */ 
/*     */   
/*     */   public nr a(String ☃, int i) {
/* 534 */     if (this.i.isEmpty()) {
/* 535 */       return new oe("{}");
/*     */     }
/*     */     
/* 538 */     nx nx = new oe("{");
/*     */     
/* 540 */     Collection<String> collection = this.i.keySet();
/* 541 */     if (c.isDebugEnabled()) {
/* 542 */       List<String> list = Lists.newArrayList(this.i.keySet());
/* 543 */       Collections.sort(list);
/* 544 */       collection = list;
/*     */     } 
/*     */     
/* 547 */     if (!☃.isEmpty()) {
/* 548 */       nx.c("\n");
/*     */     }
/*     */     
/* 551 */     for (Iterator<String> iterator = collection.iterator(); iterator.hasNext(); ) {
/* 552 */       String str = iterator.next();
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 557 */       nx nx1 = (new oe(Strings.repeat(☃, i + 1))).a(t(str)).c(String.valueOf(':')).c(" ").a(((mt)this.i.get(str)).a(☃, i + 1));
/*     */       
/* 559 */       if (iterator.hasNext()) {
/* 560 */         nx1.c(String.valueOf(',')).c(☃.isEmpty() ? " " : "\n");
/*     */       }
/* 562 */       nx.a(nx1);
/*     */     } 
/* 564 */     if (!☃.isEmpty()) {
/* 565 */       nx.c("\n").c(Strings.repeat(☃, i));
/*     */     }
/* 567 */     nx.c("}");
/* 568 */     return nx;
/*     */   }
/*     */   
/*     */   protected Map<String, mt> h() {
/* 572 */     return Collections.unmodifiableMap(this.i);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\md.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */