/*     */ import java.util.Optional;
/*     */ import java.util.OptionalInt;
/*     */ import java.util.UUID;
/*     */ import javax.annotation.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class uu
/*     */ {
/*  25 */   private static final aet<ut<?>> t = new aet<>(16);
/*     */   
/*  27 */   public static final ut<Byte> a = new ut<Byte>()
/*     */     {
/*     */       public void a(nf ☃, Byte byte_) {
/*  30 */         ☃.writeByte(byte_.byteValue());
/*     */       }
/*     */ 
/*     */       
/*     */       public Byte b(nf ☃) {
/*  35 */         return Byte.valueOf(☃.readByte());
/*     */       }
/*     */ 
/*     */       
/*     */       public Byte a(Byte ☃) {
/*  40 */         return ☃;
/*     */       }
/*     */     };
/*     */   
/*  44 */   public static final ut<Integer> b = new ut<Integer>()
/*     */     {
/*     */       public void a(nf ☃, Integer integer) {
/*  47 */         ☃.d(integer.intValue());
/*     */       }
/*     */ 
/*     */       
/*     */       public Integer b(nf ☃) {
/*  52 */         return Integer.valueOf(☃.i());
/*     */       }
/*     */ 
/*     */       
/*     */       public Integer a(Integer ☃) {
/*  57 */         return ☃;
/*     */       }
/*     */     };
/*     */   
/*  61 */   public static final ut<Float> c = new ut<Float>()
/*     */     {
/*     */       public void a(nf ☃, Float float_) {
/*  64 */         ☃.writeFloat(float_.floatValue());
/*     */       }
/*     */ 
/*     */       
/*     */       public Float b(nf ☃) {
/*  69 */         return Float.valueOf(☃.readFloat());
/*     */       }
/*     */ 
/*     */       
/*     */       public Float a(Float ☃) {
/*  74 */         return ☃;
/*     */       }
/*     */     };
/*     */   
/*  78 */   public static final ut<String> d = new ut<String>()
/*     */     {
/*     */       public void a(nf ☃, String str) {
/*  81 */         ☃.a(str);
/*     */       }
/*     */ 
/*     */       
/*     */       public String b(nf ☃) {
/*  86 */         return ☃.e(32767);
/*     */       }
/*     */ 
/*     */       
/*     */       public String a(String ☃) {
/*  91 */         return ☃;
/*     */       }
/*     */     };
/*     */   
/*  95 */   public static final ut<nr> e = new ut<nr>()
/*     */     {
/*     */       public void a(nf ☃, nr nr1) {
/*  98 */         ☃.a(nr1);
/*     */       }
/*     */ 
/*     */       
/*     */       public nr b(nf ☃) {
/* 103 */         return ☃.h();
/*     */       }
/*     */ 
/*     */       
/*     */       public nr a(nr ☃) {
/* 108 */         return ☃;
/*     */       }
/*     */     };
/*     */   
/* 112 */   public static final ut<Optional<nr>> f = new ut<Optional<nr>>()
/*     */     {
/*     */       public void a(nf ☃, Optional<nr> optional) {
/* 115 */         if (optional.isPresent()) {
/* 116 */           ☃.writeBoolean(true);
/* 117 */           ☃.a(optional.get());
/*     */         } else {
/* 119 */           ☃.writeBoolean(false);
/*     */         } 
/*     */       }
/*     */ 
/*     */       
/*     */       public Optional<nr> b(nf ☃) {
/* 125 */         return ☃.readBoolean() ? Optional.<nr>of(☃.h()) : Optional.<nr>empty();
/*     */       }
/*     */ 
/*     */       
/*     */       public Optional<nr> a(Optional<nr> ☃) {
/* 130 */         return ☃;
/*     */       }
/*     */     };
/*     */   
/* 134 */   public static final ut<bmb> g = new ut<bmb>()
/*     */     {
/*     */       public void a(nf ☃, bmb bmb1) {
/* 137 */         ☃.a(bmb1);
/*     */       }
/*     */ 
/*     */       
/*     */       public bmb b(nf ☃) {
/* 142 */         return ☃.n();
/*     */       }
/*     */ 
/*     */       
/*     */       public bmb a(bmb ☃) {
/* 147 */         return ☃.i();
/*     */       }
/*     */     };
/*     */   
/* 151 */   public static final ut<Optional<ceh>> h = new ut<Optional<ceh>>()
/*     */     {
/*     */       public void a(nf ☃, Optional<ceh> optional) {
/* 154 */         if (optional.isPresent()) {
/* 155 */           ☃.d(buo.i(optional.get()));
/*     */         } else {
/* 157 */           ☃.d(0);
/*     */         } 
/*     */       }
/*     */ 
/*     */       
/*     */       public Optional<ceh> b(nf ☃) {
/* 163 */         int i = ☃.i();
/* 164 */         if (i == 0) {
/* 165 */           return Optional.empty();
/*     */         }
/* 167 */         return Optional.of(buo.a(i));
/*     */       }
/*     */ 
/*     */ 
/*     */       
/*     */       public Optional<ceh> a(Optional<ceh> ☃) {
/* 173 */         return ☃;
/*     */       }
/*     */     };
/*     */   
/* 177 */   public static final ut<Boolean> i = new ut<Boolean>()
/*     */     {
/*     */       public void a(nf ☃, Boolean bool) {
/* 180 */         ☃.writeBoolean(bool.booleanValue());
/*     */       }
/*     */ 
/*     */       
/*     */       public Boolean b(nf ☃) {
/* 185 */         return Boolean.valueOf(☃.readBoolean());
/*     */       }
/*     */ 
/*     */       
/*     */       public Boolean a(Boolean ☃) {
/* 190 */         return ☃;
/*     */       }
/*     */     };
/*     */   
/* 194 */   public static final ut<hf> j = new ut<hf>()
/*     */     {
/*     */       public void a(nf ☃, hf hf1) {
/* 197 */         ☃.d(gm.V.a(hf1.b()));
/* 198 */         hf1.a(☃);
/*     */       }
/*     */ 
/*     */       
/*     */       public hf b(nf ☃) {
/* 203 */         return a(☃, (hg<hf>)gm.V.a(☃.i()));
/*     */       }
/*     */       
/*     */       private <T extends hf> T a(nf ☃, hg<T> hg1) {
/* 207 */         return hg1.d().b(hg1, ☃);
/*     */       }
/*     */ 
/*     */       
/*     */       public hf a(hf ☃) {
/* 212 */         return ☃;
/*     */       }
/*     */     };
/*     */   
/* 216 */   public static final ut<go> k = new ut<go>()
/*     */     {
/*     */       public void a(nf ☃, go go1) {
/* 219 */         ☃.writeFloat(go1.b());
/* 220 */         ☃.writeFloat(go1.c());
/* 221 */         ☃.writeFloat(go1.d());
/*     */       }
/*     */ 
/*     */       
/*     */       public go b(nf ☃) {
/* 226 */         return new go(☃.readFloat(), ☃.readFloat(), ☃.readFloat());
/*     */       }
/*     */ 
/*     */       
/*     */       public go a(go ☃) {
/* 231 */         return ☃;
/*     */       }
/*     */     };
/*     */   
/* 235 */   public static final ut<fx> l = new ut<fx>()
/*     */     {
/*     */       public void a(nf ☃, fx fx1) {
/* 238 */         ☃.a(fx1);
/*     */       }
/*     */ 
/*     */       
/*     */       public fx b(nf ☃) {
/* 243 */         return ☃.e();
/*     */       }
/*     */ 
/*     */       
/*     */       public fx a(fx ☃) {
/* 248 */         return ☃;
/*     */       }
/*     */     };
/*     */   
/* 252 */   public static final ut<Optional<fx>> m = new ut<Optional<fx>>()
/*     */     {
/*     */       public void a(nf ☃, Optional<fx> optional) {
/* 255 */         ☃.writeBoolean(optional.isPresent());
/* 256 */         if (optional.isPresent()) {
/* 257 */           ☃.a(optional.get());
/*     */         }
/*     */       }
/*     */ 
/*     */       
/*     */       public Optional<fx> b(nf ☃) {
/* 263 */         if (!☃.readBoolean()) {
/* 264 */           return Optional.empty();
/*     */         }
/* 266 */         return Optional.of(☃.e());
/*     */       }
/*     */ 
/*     */       
/*     */       public Optional<fx> a(Optional<fx> ☃) {
/* 271 */         return ☃;
/*     */       }
/*     */     };
/*     */   
/* 275 */   public static final ut<gc> n = new ut<gc>()
/*     */     {
/*     */       public void a(nf ☃, gc gc1) {
/* 278 */         ☃.a(gc1);
/*     */       }
/*     */ 
/*     */       
/*     */       public gc b(nf ☃) {
/* 283 */         return ☃.<gc>a(gc.class);
/*     */       }
/*     */ 
/*     */       
/*     */       public gc a(gc ☃) {
/* 288 */         return ☃;
/*     */       }
/*     */     };
/*     */   
/* 292 */   public static final ut<Optional<UUID>> o = new ut<Optional<UUID>>()
/*     */     {
/*     */       public void a(nf ☃, Optional<UUID> optional) {
/* 295 */         ☃.writeBoolean(optional.isPresent());
/* 296 */         if (optional.isPresent()) {
/* 297 */           ☃.a(optional.get());
/*     */         }
/*     */       }
/*     */ 
/*     */       
/*     */       public Optional<UUID> b(nf ☃) {
/* 303 */         if (!☃.readBoolean()) {
/* 304 */           return Optional.empty();
/*     */         }
/* 306 */         return Optional.of(☃.k());
/*     */       }
/*     */ 
/*     */       
/*     */       public Optional<UUID> a(Optional<UUID> ☃) {
/* 311 */         return ☃;
/*     */       }
/*     */     };
/*     */   
/* 315 */   public static final ut<md> p = new ut<md>()
/*     */     {
/*     */       public void a(nf ☃, md md1) {
/* 318 */         ☃.a(md1);
/*     */       }
/*     */ 
/*     */       
/*     */       public md b(nf ☃) {
/* 323 */         return ☃.l();
/*     */       }
/*     */ 
/*     */       
/*     */       public md a(md ☃) {
/* 328 */         return ☃.g();
/*     */       }
/*     */     };
/*     */   
/* 332 */   public static final ut<bfk> q = new ut<bfk>()
/*     */     {
/*     */       public void a(nf ☃, bfk bfk1) {
/* 335 */         ☃.d(gm.ah.a(bfk1.a()));
/* 336 */         ☃.d(gm.ai.a(bfk1.b()));
/* 337 */         ☃.d(bfk1.c());
/*     */       }
/*     */ 
/*     */       
/*     */       public bfk b(nf ☃) {
/* 342 */         return new bfk(gm.ah
/* 343 */             .a(☃.i()), gm.ai
/* 344 */             .a(☃.i()), ☃
/* 345 */             .i());
/*     */       }
/*     */ 
/*     */ 
/*     */       
/*     */       public bfk a(bfk ☃) {
/* 351 */         return ☃;
/*     */       }
/*     */     };
/*     */   
/* 355 */   public static final ut<OptionalInt> r = new ut<OptionalInt>()
/*     */     {
/*     */       public void a(nf ☃, OptionalInt optionalInt) {
/* 358 */         ☃.d(optionalInt.orElse(-1) + 1);
/*     */       }
/*     */ 
/*     */       
/*     */       public OptionalInt b(nf ☃) {
/* 363 */         int i = ☃.i();
/* 364 */         return (i == 0) ? OptionalInt.empty() : OptionalInt.of(i - 1);
/*     */       }
/*     */ 
/*     */       
/*     */       public OptionalInt a(OptionalInt ☃) {
/* 369 */         return ☃;
/*     */       }
/*     */     };
/*     */   
/* 373 */   public static final ut<aqx> s = new ut<aqx>()
/*     */     {
/*     */       public void a(nf ☃, aqx aqx1) {
/* 376 */         ☃.a(aqx1);
/*     */       }
/*     */ 
/*     */       
/*     */       public aqx b(nf ☃) {
/* 381 */         return ☃.<aqx>a(aqx.class);
/*     */       }
/*     */ 
/*     */       
/*     */       public aqx a(aqx ☃) {
/* 386 */         return ☃;
/*     */       }
/*     */     };
/*     */   
/*     */   static {
/* 391 */     a(a);
/* 392 */     a(b);
/* 393 */     a(c);
/* 394 */     a(d);
/* 395 */     a(e);
/* 396 */     a(f);
/* 397 */     a(g);
/* 398 */     a(i);
/* 399 */     a(k);
/* 400 */     a(l);
/* 401 */     a(m);
/* 402 */     a(n);
/* 403 */     a(o);
/* 404 */     a(h);
/* 405 */     a(p);
/* 406 */     a(j);
/* 407 */     a(q);
/* 408 */     a(r);
/* 409 */     a(s);
/*     */   }
/*     */   
/*     */   public static void a(ut<?> ☃) {
/* 413 */     t.c(☃);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public static ut<?> a(int ☃) {
/* 418 */     return t.a(☃);
/*     */   }
/*     */   
/*     */   public static int b(ut<?> ☃) {
/* 422 */     return t.a(☃);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip\\uu.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */