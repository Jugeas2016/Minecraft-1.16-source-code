/*     */ import com.google.common.collect.Maps;
/*     */ import java.util.Arrays;
/*     */ import java.util.EnumMap;
/*     */ import java.util.Map;
/*     */ import java.util.Random;
/*     */ import java.util.stream.Collectors;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class bas
/*     */   extends azz
/*     */   implements arb
/*     */ {
/*     */   private static final Map<bkx, brw> bp;
/*     */   private static final Map<bkx, float[]> bq;
/*     */   private int br;
/*     */   private avn bs;
/*  67 */   private static final us<Byte> bo = uv.a((Class)bas.class, uu.a);
/*     */   static {
/*  69 */     bp = x.<Map<bkx, brw>>a(Maps.newEnumMap(bkx.class), ☃ -> {
/*     */           ☃.put(bkx.a, bup.aY);
/*     */           
/*     */           ☃.put(bkx.b, bup.aZ);
/*     */           ☃.put(bkx.c, bup.ba);
/*     */           ☃.put(bkx.d, bup.bb);
/*     */           ☃.put(bkx.e, bup.bc);
/*     */           ☃.put(bkx.f, bup.bd);
/*     */           ☃.put(bkx.g, bup.be);
/*     */           ☃.put(bkx.h, bup.bf);
/*     */           ☃.put(bkx.i, bup.bg);
/*     */           ☃.put(bkx.j, bup.bh);
/*     */           ☃.put(bkx.k, bup.bi);
/*     */           ☃.put(bkx.l, bup.bj);
/*     */           ☃.put(bkx.m, bup.bk);
/*     */           ☃.put(bkx.n, bup.bl);
/*     */           ☃.put(bkx.o, bup.bm);
/*     */           ☃.put(bkx.p, bup.bn);
/*     */         });
/*  88 */     bq = Maps.newEnumMap((Map)Arrays.<bkx>stream(bkx.values()).collect(Collectors.toMap(☃ -> ☃, bas::c)));
/*     */   }
/*     */   private static float[] c(bkx ☃) {
/*  91 */     if (☃ == bkx.a) {
/*  92 */       return new float[] { 0.9019608F, 0.9019608F, 0.9019608F };
/*     */     }
/*  94 */     float[] arrayOfFloat = ☃.e();
/*     */ 
/*     */     
/*  97 */     float f = 0.75F;
/*     */     
/*  99 */     return new float[] { arrayOfFloat[0] * 0.75F, arrayOfFloat[1] * 0.75F, arrayOfFloat[2] * 0.75F };
/*     */   }
/*     */   
/*     */   public static float[] a(bkx ☃) {
/* 103 */     return bq.get(☃);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public bas(aqe<? extends bas> ☃, brx brx1) {
/* 110 */     super((aqe)☃, brx1);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void o() {
/* 115 */     this.bs = new avn(this);
/* 116 */     this.bk.a(0, new avp(this));
/* 117 */     this.bk.a(1, new awp(this, 1.25D));
/* 118 */     this.bk.a(2, new avi(this, 1.0D));
/* 119 */     this.bk.a(3, new axf(this, 1.1D, bon.a(new brw[] { bmd.kW }, ), false));
/* 120 */     this.bk.a(4, new avu(this, 1.1D));
/* 121 */     this.bk.a(5, this.bs);
/* 122 */     this.bk.a(6, new axk(this, 1.0D));
/* 123 */     this.bk.a(7, new awd(this, (Class)bfw.class, 6.0F));
/* 124 */     this.bk.a(8, new aws(this));
/*     */   }
/*     */ 
/*     */   
/*     */   protected void N() {
/* 129 */     this.br = this.bs.g();
/* 130 */     super.N();
/*     */   }
/*     */ 
/*     */   
/*     */   public void k() {
/* 135 */     if (this.l.v) {
/* 136 */       this.br = Math.max(0, this.br - 1);
/*     */     }
/* 138 */     super.k();
/*     */   }
/*     */   
/*     */   public static ark.a eK() {
/* 142 */     return aqn.p()
/* 143 */       .a(arl.a, 8.0D)
/* 144 */       .a(arl.d, 0.23000000417232513D);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void e() {
/* 149 */     super.e();
/*     */ 
/*     */     
/* 152 */     this.R.a(bo, Byte.valueOf((byte)0));
/*     */   }
/*     */ 
/*     */   
/*     */   public vk J() {
/* 157 */     if (eM()) {
/* 158 */       return X().i();
/*     */     }
/* 160 */     switch (null.a[eL().ordinal()])
/*     */     
/*     */     { default:
/* 163 */         return cyq.Q;
/*     */       case 2:
/* 165 */         return cyq.R;
/*     */       case 3:
/* 167 */         return cyq.S;
/*     */       case 4:
/* 169 */         return cyq.T;
/*     */       case 5:
/* 171 */         return cyq.U;
/*     */       case 6:
/* 173 */         return cyq.V;
/*     */       case 7:
/* 175 */         return cyq.W;
/*     */       case 8:
/* 177 */         return cyq.X;
/*     */       case 9:
/* 179 */         return cyq.Y;
/*     */       case 10:
/* 181 */         return cyq.Z;
/*     */       case 11:
/* 183 */         return cyq.aa;
/*     */       case 12:
/* 185 */         return cyq.ab;
/*     */       case 13:
/* 187 */         return cyq.ac;
/*     */       case 14:
/* 189 */         return cyq.ad;
/*     */       case 15:
/* 191 */         return cyq.ae;
/*     */       case 16:
/* 193 */         break; }  return cyq.af;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(byte ☃) {
/* 199 */     if (☃ == 10) {
/* 200 */       this.br = 40;
/*     */     } else {
/* 202 */       super.a(☃);
/*     */     } 
/*     */   }
/*     */   
/*     */   public float y(float ☃) {
/* 207 */     if (this.br <= 0) {
/* 208 */       return 0.0F;
/*     */     }
/* 210 */     if (this.br >= 4 && this.br <= 36) {
/* 211 */       return 1.0F;
/*     */     }
/* 213 */     if (this.br < 4) {
/* 214 */       return (this.br - ☃) / 4.0F;
/*     */     }
/* 216 */     return -((this.br - 40) - ☃) / 4.0F;
/*     */   }
/*     */   
/*     */   public float z(float ☃) {
/* 220 */     if (this.br > 4 && this.br <= 36) {
/* 221 */       float f = ((this.br - 4) - ☃) / 32.0F;
/* 222 */       return 0.62831855F + 0.21991149F * afm.a(f * 28.7F);
/*     */     } 
/* 224 */     if (this.br > 0) {
/* 225 */       return 0.62831855F;
/*     */     }
/* 227 */     return this.q * 0.017453292F;
/*     */   }
/*     */ 
/*     */   
/*     */   public aou b(bfw ☃, aot aot1) {
/* 232 */     bmb bmb = ☃.b(aot1);
/* 233 */     if (bmb.b() == bmd.ng) {
/* 234 */       if (!this.l.v && K_()) {
/* 235 */         a(adr.h);
/* 236 */         bmb.a(1, ☃, bfw1 -> bfw1.d(☃));
/* 237 */         return aou.a;
/*     */       } 
/* 239 */       return aou.b;
/*     */     } 
/*     */     
/* 242 */     return super.b(☃, aot1);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(adr ☃) {
/* 247 */     this.l.a((bfw)null, this, adq.mS, ☃, 1.0F, 1.0F);
/*     */     
/* 249 */     t(true);
/* 250 */     int i = 1 + this.J.nextInt(3);
/* 251 */     for (int j = 0; j < i; j++) {
/* 252 */       bcv bcv = a(bp.get(eL()), 1);
/* 253 */       if (bcv != null) {
/* 254 */         bcv.f(bcv.cC().b(((this.J
/* 255 */               .nextFloat() - this.J.nextFloat()) * 0.1F), (this.J
/* 256 */               .nextFloat() * 0.05F), ((this.J
/* 257 */               .nextFloat() - this.J.nextFloat()) * 0.1F)));
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean K_() {
/* 265 */     return (aX() && !eM() && !w_());
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(md ☃) {
/* 270 */     super.b(☃);
/* 271 */     ☃.a("Sheared", eM());
/* 272 */     ☃.a("Color", (byte)eL().b());
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(md ☃) {
/* 277 */     super.a(☃);
/* 278 */     t(☃.q("Sheared"));
/* 279 */     b(bkx.a(☃.f("Color")));
/*     */   }
/*     */ 
/*     */   
/*     */   protected adp I() {
/* 284 */     return adq.mP;
/*     */   }
/*     */ 
/*     */   
/*     */   protected adp e(apk ☃) {
/* 289 */     return adq.mR;
/*     */   }
/*     */ 
/*     */   
/*     */   protected adp dq() {
/* 294 */     return adq.mQ;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void b(fx ☃, ceh ceh1) {
/* 299 */     a(adq.mT, 0.15F, 1.0F);
/*     */   }
/*     */   
/*     */   public bkx eL() {
/* 303 */     return bkx.a(((Byte)this.R.<Byte>a(bo)).byteValue() & 0xF);
/*     */   }
/*     */   
/*     */   public void b(bkx ☃) {
/* 307 */     byte b = ((Byte)this.R.<Byte>a(bo)).byteValue();
/* 308 */     this.R.b(bo, Byte.valueOf((byte)(b & 0xF0 | ☃.b() & 0xF)));
/*     */   }
/*     */   
/*     */   public boolean eM() {
/* 312 */     return ((((Byte)this.R.<Byte>a(bo)).byteValue() & 0x10) != 0);
/*     */   }
/*     */   
/*     */   public void t(boolean ☃) {
/* 316 */     byte b = ((Byte)this.R.<Byte>a(bo)).byteValue();
/* 317 */     if (☃) {
/* 318 */       this.R.b(bo, Byte.valueOf((byte)(b | 0x10)));
/*     */     } else {
/* 320 */       this.R.b(bo, Byte.valueOf((byte)(b & 0xFFFFFFEF)));
/*     */     } 
/*     */   }
/*     */   
/*     */   public static bkx a(Random ☃) {
/* 325 */     int i = ☃.nextInt(100);
/* 326 */     if (i < 5) {
/* 327 */       return bkx.p;
/*     */     }
/* 329 */     if (i < 10) {
/* 330 */       return bkx.h;
/*     */     }
/* 332 */     if (i < 15) {
/* 333 */       return bkx.i;
/*     */     }
/* 335 */     if (i < 18) {
/* 336 */       return bkx.m;
/*     */     }
/* 338 */     if (☃.nextInt(500) == 0) {
/* 339 */       return bkx.g;
/*     */     }
/* 341 */     return bkx.a;
/*     */   }
/*     */ 
/*     */   
/*     */   public bas b(aag ☃, apy apy1) {
/* 346 */     bas bas1 = (bas)apy1;
/* 347 */     bas bas2 = aqe.ar.a(☃);
/*     */     
/* 349 */     bas2.b(a(this, bas1));
/*     */     
/* 351 */     return bas2;
/*     */   }
/*     */ 
/*     */   
/*     */   public void B() {
/* 356 */     t(false);
/* 357 */     if (w_())
/*     */     {
/* 359 */       a(60);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public arc a(bsk ☃, aos aos1, aqp aqp1, @Nullable arc arc1, @Nullable md md1) {
/* 366 */     b(a(☃.u_()));
/* 367 */     return super.a(☃, aos1, aqp1, arc1, md1);
/*     */   }
/*     */   
/*     */   private bkx a(azz ☃, azz azz1) {
/* 371 */     bkx bkx1 = ((bas)☃).eL();
/* 372 */     bkx bkx2 = ((bas)azz1).eL();
/*     */     
/* 374 */     bio bio = a(bkx1, bkx2);
/*     */     
/* 376 */     return this.l.o().<bio, boi>a(bot.a, bio, this.l)
/* 377 */       .map(boi1 -> boi1.a(☃))
/* 378 */       .map(bmb::b)
/* 379 */       .filter(bky.class::isInstance)
/* 380 */       .map(bky.class::cast)
/* 381 */       .map(bky::d)
/* 382 */       .orElseGet(() -> this.l.t.nextBoolean() ? ☃ : bkx1);
/*     */   }
/*     */   
/*     */   private static bio a(bkx ☃, bkx bkx1) {
/* 386 */     bio bio = new bio(new bic(null, -1)
/*     */         {
/*     */           public boolean a(bfw ☃) {
/* 389 */             return false;
/*     */           }
/*     */         }2, 1);
/* 392 */     bio.a(0, new bmb(bky.a(☃)));
/* 393 */     bio.a(1, new bmb(bky.a(bkx1)));
/* 394 */     return bio;
/*     */   }
/*     */ 
/*     */   
/*     */   protected float b(aqx ☃, aqb aqb1) {
/* 399 */     return 0.95F * aqb1.b;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bas.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */