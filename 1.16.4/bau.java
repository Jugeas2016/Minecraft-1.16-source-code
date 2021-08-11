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
/*     */ public class bau
/*     */   extends azx
/*     */   implements arb, bdu
/*     */ {
/*  44 */   private static final us<Byte> b = uv.a((Class)bau.class, uu.a);
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public bau(aqe<? extends bau> ☃, brx brx1) {
/*  50 */     super((aqe)☃, brx1);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void o() {
/*  55 */     this.bk.a(1, new awv(this, 1.25D, 20, 10.0F));
/*  56 */     this.bk.a(2, new axk(this, 1.0D, 1.0000001E-5F));
/*  57 */     this.bk.a(3, new awd(this, (Class)bfw.class, 6.0F));
/*  58 */     this.bk.a(4, new aws(this));
/*     */     
/*  60 */     this.bl.a(1, new axq<>(this, aqn.class, 10, true, false, ☃ -> ☃ instanceof bdi));
/*     */   }
/*     */   
/*     */   public static ark.a m() {
/*  64 */     return aqn.p()
/*  65 */       .a(arl.a, 4.0D)
/*  66 */       .a(arl.d, 0.20000000298023224D);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void e() {
/*  71 */     super.e();
/*  72 */     this.R.a(b, Byte.valueOf((byte)16));
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(md ☃) {
/*  77 */     super.b(☃);
/*     */     
/*  79 */     ☃.a("Pumpkin", eK());
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(md ☃) {
/*  84 */     super.a(☃);
/*     */     
/*  86 */     if (☃.e("Pumpkin")) {
/*  87 */       t(☃.q("Pumpkin"));
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean dO() {
/*  93 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public void k() {
/*  98 */     super.k();
/*     */     
/* 100 */     if (!this.l.v) {
/* 101 */       int ☃ = afm.c(cD());
/* 102 */       int i = afm.c(cE());
/* 103 */       int j = afm.c(cH());
/*     */       
/* 105 */       if (this.l.v(new fx(☃, 0, j)).a(new fx(☃, i, j)) > 1.0F) {
/* 106 */         a(apk.c, 1.0F);
/*     */       }
/*     */       
/* 109 */       if (!this.l.V().b(brt.b)) {
/*     */         return;
/*     */       }
/*     */ 
/*     */       
/* 114 */       ceh ceh = bup.cC.n();
/* 115 */       for (int k = 0; k < 4; k++) {
/* 116 */         ☃ = afm.c(cD() + ((k % 2 * 2 - 1) * 0.25F));
/* 117 */         i = afm.c(cE());
/* 118 */         j = afm.c(cH() + ((k / 2 % 2 * 2 - 1) * 0.25F));
/* 119 */         fx fx = new fx(☃, i, j);
/* 120 */         if (this.l.d_(fx).g() && this.l.v(fx).a(fx) < 0.8F && ceh.a(this.l, fx)) {
/* 121 */           this.l.a(fx, ceh);
/*     */         }
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(aqm ☃, float f) {
/* 129 */     bgq bgq = new bgq(this.l, this);
/* 130 */     double d1 = ☃.cG() - 1.100000023841858D;
/* 131 */     double d2 = ☃.cD() - cD();
/* 132 */     double d3 = d1 - bgq.cE();
/* 133 */     double d4 = ☃.cH() - cH();
/* 134 */     float f1 = afm.a(d2 * d2 + d4 * d4) * 0.2F;
/* 135 */     bgq.c(d2, d3 + f1, d4, 1.6F, 12.0F);
/*     */     
/* 137 */     a(adq.ov, 1.0F, 0.4F / (cY().nextFloat() * 0.4F + 0.8F));
/* 138 */     this.l.c(bgq);
/*     */   }
/*     */ 
/*     */   
/*     */   protected float b(aqx ☃, aqb aqb1) {
/* 143 */     return 1.7F;
/*     */   }
/*     */ 
/*     */   
/*     */   protected aou b(bfw ☃, aot aot1) {
/* 148 */     bmb bmb = ☃.b(aot1);
/* 149 */     if (bmb.b() == bmd.ng && K_()) {
/* 150 */       a(adr.h);
/* 151 */       if (!this.l.v) {
/* 152 */         bmb.a(1, ☃, bfw1 -> bfw1.d(☃));
/*     */       }
/* 154 */       return aou.a(this.l.v);
/*     */     } 
/* 156 */     return aou.c;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(adr ☃) {
/* 161 */     this.l.a((bfw)null, this, adq.ow, ☃, 1.0F, 1.0F);
/*     */     
/* 163 */     if (!this.l.s_()) {
/* 164 */       t(false);
/* 165 */       a(new bmb(bmd.dj), 1.7F);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean K_() {
/* 171 */     return (aX() && eK());
/*     */   }
/*     */   
/*     */   public boolean eK() {
/* 175 */     return ((((Byte)this.R.<Byte>a(b)).byteValue() & 0x10) != 0);
/*     */   }
/*     */   
/*     */   public void t(boolean ☃) {
/* 179 */     byte b = ((Byte)this.R.<Byte>a(b)).byteValue();
/* 180 */     if (☃) {
/* 181 */       this.R.b(b, Byte.valueOf((byte)(b | 0x10)));
/*     */     } else {
/* 183 */       this.R.b(b, Byte.valueOf((byte)(b & 0xFFFFFFEF)));
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   protected adp I() {
/* 190 */     return adq.os;
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   protected adp e(apk ☃) {
/* 196 */     return adq.ou;
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   protected adp dq() {
/* 202 */     return adq.ot;
/*     */   }
/*     */ 
/*     */   
/*     */   public dcn cf() {
/* 207 */     return new dcn(0.0D, (0.75F * ce()), (cy() * 0.4F));
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bau.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */