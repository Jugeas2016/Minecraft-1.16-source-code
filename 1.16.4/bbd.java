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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class bbd
/*     */   extends bbb
/*     */ {
/*  37 */   private static final UUID bw = UUID.fromString("556E1665-8B10-40C8-8F9D-CF9B1667F295");
/*     */   
/*  39 */   private static final us<Integer> bx = uv.a((Class)bbd.class, uu.b);
/*     */   
/*     */   public bbd(aqe<? extends bbd> ☃, brx brx1) {
/*  42 */     super((aqe)☃, brx1);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void eK() {
/*  47 */     a(arl.a).a(fp());
/*  48 */     a(arl.d).a(fr());
/*  49 */     a(arl.m).a(fq());
/*     */   }
/*     */ 
/*     */   
/*     */   protected void e() {
/*  54 */     super.e();
/*     */     
/*  56 */     this.R.a(bx, Integer.valueOf(0));
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(md ☃) {
/*  61 */     super.b(☃);
/*     */     
/*  63 */     ☃.b("Variant", eU());
/*     */     
/*  65 */     if (!this.br.a(1).a()) {
/*  66 */       ☃.a("ArmorItem", this.br.a(1).b(new md()));
/*     */     }
/*     */   }
/*     */   
/*     */   public bmb eL() {
/*  71 */     return b(aqf.e);
/*     */   }
/*     */   
/*     */   private void m(bmb ☃) {
/*  75 */     a(aqf.e, ☃);
/*  76 */     a(aqf.e, 0.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(md ☃) {
/*  81 */     super.a(☃);
/*     */     
/*  83 */     w(☃.h("Variant"));
/*     */     
/*  85 */     if (☃.c("ArmorItem", 10)) {
/*  86 */       bmb bmb = bmb.a(☃.p("ArmorItem"));
/*  87 */       if (!bmb.a() && l(bmb)) {
/*  88 */         this.br.a(1, bmb);
/*     */       }
/*     */     } 
/*     */     
/*  92 */     fe();
/*     */   }
/*     */   
/*     */   private void w(int ☃) {
/*  96 */     this.R.b(bx, Integer.valueOf(☃));
/*     */   }
/*     */   
/*     */   private int eU() {
/* 100 */     return ((Integer)this.R.<Integer>a(bx)).intValue();
/*     */   }
/*     */   
/*     */   private void a(bbk ☃, bbf bbf1) {
/* 104 */     w(☃.a() & 0xFF | bbf1.a() << 8 & 0xFF00);
/*     */   }
/*     */   
/*     */   public bbk eM() {
/* 108 */     return bbk.a(eU() & 0xFF);
/*     */   }
/*     */   
/*     */   public bbf eO() {
/* 112 */     return bbf.a((eU() & 0xFF00) >> 8);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void fe() {
/* 117 */     if (this.l.v) {
/*     */       return;
/*     */     }
/*     */     
/* 121 */     super.fe();
/*     */     
/* 123 */     n(this.br.a(1));
/*     */     
/* 125 */     a(aqf.e, 0.0F);
/*     */   }
/*     */   
/*     */   private void n(bmb ☃) {
/* 129 */     m(☃);
/*     */     
/* 131 */     if (!this.l.v) {
/* 132 */       a(arl.i).b(bw);
/* 133 */       if (l(☃)) {
/* 134 */         int i = ((blw)☃.b()).g();
/* 135 */         if (i != 0) {
/* 136 */           a(arl.i).b(new arj(bw, "Horse armor bonus", i, arj.a.a));
/*     */         }
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(aon ☃) {
/* 144 */     bmb bmb1 = eL();
/*     */     
/* 146 */     super.a(☃);
/*     */     
/* 148 */     bmb bmb2 = eL();
/* 149 */     if (this.K > 20 && l(bmb2) && bmb1 != bmb2) {
/* 150 */       a(adq.fS, 0.5F, 1.0F);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(cae ☃) {
/* 156 */     super.a(☃);
/* 157 */     if (this.J.nextInt(10) == 0) {
/* 158 */       a(adq.fT, ☃.a() * 0.6F, ☃.b());
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   protected adp I() {
/* 164 */     super.I();
/* 165 */     return adq.fQ;
/*     */   }
/*     */ 
/*     */   
/*     */   protected adp dq() {
/* 170 */     super.dq();
/* 171 */     return adq.fU;
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   protected adp fg() {
/* 177 */     return adq.fV;
/*     */   }
/*     */ 
/*     */   
/*     */   protected adp e(apk ☃) {
/* 182 */     super.e(☃);
/* 183 */     return adq.fX;
/*     */   }
/*     */ 
/*     */   
/*     */   protected adp fh() {
/* 188 */     super.fh();
/* 189 */     return adq.fR;
/*     */   }
/*     */ 
/*     */   
/*     */   public aou b(bfw ☃, aot aot1) {
/* 194 */     bmb bmb = ☃.b(aot1);
/*     */     
/* 196 */     if (!w_()) {
/* 197 */       if (eW() && ☃.eq()) {
/* 198 */         f(☃);
/* 199 */         return aou.a(this.l.v);
/*     */       } 
/*     */       
/* 202 */       if (bs()) {
/* 203 */         return super.b(☃, aot1);
/*     */       }
/*     */     } 
/*     */ 
/*     */     
/* 208 */     if (!bmb.a()) {
/* 209 */       if (k(bmb)) {
/* 210 */         return b(☃, bmb);
/*     */       }
/*     */       
/* 213 */       aou aou = bmb.a(☃, this, aot1);
/* 214 */       if (aou.a()) {
/* 215 */         return aou;
/*     */       }
/*     */       
/* 218 */       if (!eW()) {
/* 219 */         fm();
/* 220 */         return aou.a(this.l.v);
/*     */       } 
/*     */       
/* 223 */       boolean bool = (!w_() && !M_() && bmb.b() == bmd.lO);
/* 224 */       if (l(bmb) || bool) {
/* 225 */         f(☃);
/* 226 */         return aou.a(this.l.v);
/*     */       } 
/*     */     } 
/* 229 */     if (w_()) {
/* 230 */       return super.b(☃, aot1);
/*     */     }
/*     */     
/* 233 */     h(☃);
/*     */     
/* 235 */     return aou.a(this.l.v);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(azz ☃) {
/* 240 */     if (☃ == this) {
/* 241 */       return false;
/*     */     }
/*     */     
/* 244 */     if (☃ instanceof bbc || ☃ instanceof bbd) {
/* 245 */       return (fo() && ((bbb)☃).fo());
/*     */     }
/*     */     
/* 248 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public apy a(aag ☃, apy apy1) {
/*     */     bbb bbb1;
/* 254 */     if (apy1 instanceof bbc) {
/* 255 */       bbb1 = aqe.aa.a(☃);
/*     */     } else {
/* 257 */       bbk bbk; bbf bbf; bbd bbd1 = (bbd)apy1;
/*     */       
/* 259 */       bbb1 = aqe.H.a(☃);
/*     */       
/* 261 */       int i = this.J.nextInt(9);
/* 262 */       if (i < 4) {
/* 263 */         bbk = eM();
/* 264 */       } else if (i < 8) {
/* 265 */         bbk = bbd1.eM();
/*     */       } else {
/* 267 */         bbk = x.<bbk>a(bbk.values(), this.J);
/*     */       } 
/*     */ 
/*     */       
/* 271 */       int j = this.J.nextInt(5);
/* 272 */       if (j < 2) {
/* 273 */         bbf = eO();
/* 274 */       } else if (j < 4) {
/* 275 */         bbf = bbd1.eO();
/*     */       } else {
/* 277 */         bbf = x.<bbf>a(bbf.values(), this.J);
/*     */       } 
/*     */       
/* 280 */       ((bbd)bbb1).a(bbk, bbf);
/*     */     } 
/*     */     
/* 283 */     a(apy1, bbb1);
/*     */     
/* 285 */     return bbb1;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean fs() {
/* 290 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean l(bmb ☃) {
/* 295 */     return ☃.b() instanceof blw;
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public arc a(bsk ☃, aos aos1, aqp aqp1, @Nullable arc arc1, @Nullable md md1) {
/*     */     bbk bbk;
/* 302 */     if (arc1 instanceof a) {
/* 303 */       bbk = ((a)arc1).a;
/*     */     } else {
/* 305 */       bbk = x.<bbk>a(bbk.values(), this.J);
/* 306 */       arc1 = new a(bbk);
/*     */     } 
/* 308 */     a(bbk, x.<bbf>a(bbf.values(), this.J));
/*     */     
/* 310 */     return super.a(☃, aos1, aqp1, arc1, md1);
/*     */   }
/*     */   
/*     */   public static class a extends apy.a {
/*     */     public final bbk a;
/*     */     
/*     */     public a(bbk ☃) {
/* 317 */       super(true);
/* 318 */       this.a = ☃;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bbd.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */