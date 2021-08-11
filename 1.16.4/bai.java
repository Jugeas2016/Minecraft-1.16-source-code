/*     */ import com.google.common.collect.ImmutableList;
/*     */ import java.util.Comparator;
/*     */ import java.util.List;
/*     */ import java.util.UUID;
/*     */ import java.util.stream.Stream;
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
/*     */ public class bai
/*     */   extends azx
/*     */   implements aqs
/*     */ {
/*  60 */   protected static final us<Byte> b = uv.a((Class)bai.class, uu.a);
/*     */   
/*     */   private int c;
/*     */   
/*     */   private int d;
/*     */   
/*  66 */   private static final afh bo = afu.a(20, 39);
/*     */   private int bp;
/*     */   private UUID bq;
/*     */   
/*     */   public bai(aqe<? extends bai> ☃, brx brx1) {
/*  71 */     super((aqe)☃, brx1);
/*  72 */     this.G = 1.0F;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void o() {
/*  77 */     this.bk.a(1, new awf(this, 1.0D, true));
/*  78 */     this.bk.a(2, new awl(this, 0.9D, 32.0F));
/*  79 */     this.bk.a(2, new awg(this, 0.6D, false));
/*  80 */     this.bk.a(4, new avx(this, 0.6D));
/*  81 */     this.bk.a(5, new awn(this));
/*  82 */     this.bk.a(7, new awd(this, (Class)bfw.class, 6.0F));
/*  83 */     this.bk.a(8, new aws(this));
/*     */     
/*  85 */     this.bl.a(1, new axo(this));
/*  86 */     this.bl.a(2, new axp(this, new Class[0]));
/*  87 */     this.bl.a(3, new axq<>(this, bfw.class, 10, true, false, this::a_));
/*  88 */     this.bl.a(3, new axq<>(this, aqn.class, 5, false, false, ☃ -> (☃ instanceof bdi && !(☃ instanceof bdc))));
/*  89 */     this.bl.a(4, new axw<>(this, false));
/*     */   }
/*     */ 
/*     */   
/*     */   protected void e() {
/*  94 */     super.e();
/*  95 */     this.R.a(b, Byte.valueOf((byte)0));
/*     */   }
/*     */   
/*     */   public static ark.a m() {
/*  99 */     return aqn.p()
/* 100 */       .a(arl.a, 100.0D)
/* 101 */       .a(arl.d, 0.25D)
/* 102 */       .a(arl.c, 1.0D)
/* 103 */       .a(arl.f, 15.0D);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected int l(int ☃) {
/* 109 */     return ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void C(aqa ☃) {
/* 114 */     if (☃ instanceof bdi && !(☃ instanceof bdc) && 
/* 115 */       cY().nextInt(20) == 0) {
/* 116 */       h((aqm)☃);
/*     */     }
/*     */     
/* 119 */     super.C(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public void k() {
/* 124 */     super.k();
/*     */     
/* 126 */     if (this.c > 0) {
/* 127 */       this.c--;
/*     */     }
/* 129 */     if (this.d > 0) {
/* 130 */       this.d--;
/*     */     }
/*     */     
/* 133 */     if (c(cC()) > 2.500000277905201E-7D && this.J.nextInt(5) == 0) {
/* 134 */       int ☃ = afm.c(cD());
/* 135 */       int i = afm.c(cE() - 0.20000000298023224D);
/* 136 */       int j = afm.c(cH());
/* 137 */       ceh ceh = this.l.d_(new fx(☃, i, j));
/* 138 */       if (!ceh.g()) {
/* 139 */         this.l.a(new hc(hh.d, ceh), cD() + (this.J.nextFloat() - 0.5D) * cy(), cE() + 0.1D, cH() + (this.J.nextFloat() - 0.5D) * cy(), 4.0D * (this.J.nextFloat() - 0.5D), 0.5D, (this.J.nextFloat() - 0.5D) * 4.0D);
/*     */       }
/*     */     } 
/*     */     
/* 143 */     if (!this.l.v) {
/* 144 */       a((aag)this.l, true);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(aqe<?> ☃) {
/* 150 */     if (eN() && ☃ == aqe.bc) {
/* 151 */       return false;
/*     */     }
/* 153 */     if (☃ == aqe.m) {
/* 154 */       return false;
/*     */     }
/* 156 */     return super.a(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(md ☃) {
/* 161 */     super.b(☃);
/* 162 */     ☃.a("PlayerCreated", eN());
/* 163 */     c(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(md ☃) {
/* 168 */     super.a(☃);
/* 169 */     u(☃.q("PlayerCreated"));
/* 170 */     a((aag)this.l, ☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public void G_() {
/* 175 */     a_(bo.a(this.J));
/*     */   }
/*     */ 
/*     */   
/*     */   public void a_(int ☃) {
/* 180 */     this.bp = ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public int E_() {
/* 185 */     return this.bp;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(@Nullable UUID ☃) {
/* 190 */     this.bq = ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public UUID F_() {
/* 195 */     return this.bq;
/*     */   }
/*     */   
/*     */   private float eO() {
/* 199 */     return (float)b(arl.f);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean B(aqa ☃) {
/* 204 */     this.c = 10;
/* 205 */     this.l.a(this, (byte)4);
/* 206 */     float f1 = eO();
/* 207 */     float f2 = ((int)f1 > 0) ? (f1 / 2.0F + this.J.nextInt((int)f1)) : f1;
/* 208 */     boolean bool = ☃.a(apk.c(this), f2);
/* 209 */     if (bool) {
/* 210 */       ☃.f(☃.cC().b(0.0D, 0.4000000059604645D, 0.0D));
/* 211 */       a(this, ☃);
/*     */     } 
/* 213 */     a(adq.gx, 1.0F, 1.0F);
/* 214 */     return bool;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(apk ☃, float f) {
/* 219 */     a a = eK();
/* 220 */     boolean bool = super.a(☃, f);
/* 221 */     if (bool && eK() != a) {
/* 222 */       a(adq.gy, 1.0F, 1.0F);
/*     */     }
/* 224 */     return bool;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public a eK() {
/* 231 */     return a.a(dk() / dx());
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(byte ☃) {
/* 236 */     if (☃ == 4) {
/* 237 */       this.c = 10;
/* 238 */       a(adq.gx, 1.0F, 1.0F);
/* 239 */     } else if (☃ == 11) {
/* 240 */       this.d = 400;
/* 241 */     } else if (☃ == 34) {
/* 242 */       this.d = 0;
/*     */     } else {
/* 244 */       super.a(☃);
/*     */     } 
/*     */   }
/*     */   
/*     */   public int eL() {
/* 249 */     return this.c;
/*     */   }
/*     */   
/*     */   public void t(boolean ☃) {
/* 253 */     if (☃) {
/* 254 */       this.d = 400;
/* 255 */       this.l.a(this, (byte)11);
/*     */     } else {
/* 257 */       this.d = 0;
/* 258 */       this.l.a(this, (byte)34);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   protected adp e(apk ☃) {
/* 264 */     return adq.gA;
/*     */   }
/*     */ 
/*     */   
/*     */   protected adp dq() {
/* 269 */     return adq.gz;
/*     */   }
/*     */ 
/*     */   
/*     */   protected aou b(bfw ☃, aot aot1) {
/* 274 */     bmb bmb = ☃.b(aot1);
/* 275 */     blx blx = bmb.b();
/* 276 */     if (blx != bmd.kh) {
/* 277 */       return aou.c;
/*     */     }
/*     */     
/* 280 */     float f1 = dk();
/* 281 */     b(25.0F);
/* 282 */     if (dk() == f1) {
/* 283 */       return aou.c;
/*     */     }
/*     */     
/* 286 */     float f2 = 1.0F + (this.J.nextFloat() - this.J.nextFloat()) * 0.2F;
/* 287 */     a(adq.gB, 1.0F, f2);
/*     */     
/* 289 */     if (!☃.bC.d) {
/* 290 */       bmb.g(1);
/*     */     }
/* 292 */     return aou.a(this.l.v);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void b(fx ☃, ceh ceh1) {
/* 297 */     a(adq.gC, 1.0F, 1.0F);
/*     */   }
/*     */   
/*     */   public int eM() {
/* 301 */     return this.d;
/*     */   }
/*     */   
/*     */   public boolean eN() {
/* 305 */     return ((((Byte)this.R.<Byte>a(b)).byteValue() & 0x1) != 0);
/*     */   }
/*     */   
/*     */   public void u(boolean ☃) {
/* 309 */     byte b = ((Byte)this.R.<Byte>a(b)).byteValue();
/* 310 */     if (☃) {
/* 311 */       this.R.b(b, Byte.valueOf((byte)(b | 0x1)));
/*     */     } else {
/* 313 */       this.R.b(b, Byte.valueOf((byte)(b & 0xFFFFFFFE)));
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(apk ☃) {
/* 320 */     super.a(☃);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(brz ☃) {
/* 326 */     fx fx1 = cB();
/* 327 */     fx fx2 = fx1.c();
/* 328 */     ceh ceh = ☃.d_(fx2);
/* 329 */     if (ceh.a(☃, fx2, this)) {
/* 330 */       for (int i = 1; i < 3; i++) {
/* 331 */         fx fx = fx1.b(i);
/* 332 */         ceh ceh1 = ☃.d_(fx);
/* 333 */         if (!bsg.a(☃, fx, ceh1, ceh1.m(), aqe.K)) {
/* 334 */           return false;
/*     */         }
/*     */       } 
/* 337 */       return (bsg.a(☃, fx1, ☃.d_(fx1), cuy.a.h(), aqe.K) && ☃
/* 338 */         .j(this));
/*     */     } 
/* 340 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public dcn cf() {
/* 345 */     return new dcn(0.0D, (0.875F * ce()), (cy() * 0.4F));
/*     */   }
/*     */   
/*     */   public enum a {
/* 349 */     a(1.0F),
/* 350 */     b(0.75F),
/* 351 */     c(0.5F),
/* 352 */     d(0.25F); private static final List<a> e;
/*     */     
/*     */     static {
/* 355 */       e = (List<a>)Stream.<a>of(values()).sorted(Comparator.comparingDouble(☃ -> ☃.f)).collect(ImmutableList.toImmutableList());
/*     */     }
/*     */     private final float f;
/*     */     
/*     */     a(float ☃) {
/* 360 */       this.f = ☃;
/*     */     }
/*     */     
/*     */     public static a a(float ☃) {
/* 364 */       for (a a1 : e) {
/* 365 */         if (☃ < a1.f) {
/* 366 */           return a1;
/*     */         }
/*     */       } 
/*     */       
/* 370 */       return a;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bai.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */