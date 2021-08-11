/*     */ import com.mojang.serialization.DataResult;
/*     */ import com.mojang.serialization.Dynamic;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class bek
/*     */   extends bej
/*     */   implements bfl
/*     */ {
/*  52 */   private static final us<Boolean> b = uv.a((Class)bek.class, uu.i);
/*  53 */   private static final us<bfk> c = uv.a((Class)bek.class, uu.q);
/*     */ 
/*     */   
/*     */   private int d;
/*     */   
/*     */   private UUID bo;
/*     */   
/*     */   private mt bp;
/*     */   
/*     */   private md bq;
/*     */   
/*     */   private int br;
/*     */ 
/*     */   
/*     */   public bek(aqe<? extends bek> ☃, brx brx1) {
/*  68 */     super((aqe)☃, brx1);
/*     */     
/*  70 */     a(eX().a(gm.ai.a(this.J)));
/*     */   }
/*     */ 
/*     */   
/*     */   protected void e() {
/*  75 */     super.e();
/*     */     
/*  77 */     this.R.a(b, Boolean.valueOf(false));
/*  78 */     this.R.a(c, new bfk(bfo.c, bfm.a, 1));
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(md ☃) {
/*  83 */     super.b(☃);
/*     */     
/*  85 */     bfk.a.encodeStart(mo.a, eX())
/*  86 */       .resultOrPartial(h::error)
/*  87 */       .ifPresent(mt1 -> ☃.a("VillagerData", mt1));
/*     */     
/*  89 */     if (this.bq != null) {
/*  90 */       ☃.a("Offers", this.bq);
/*     */     }
/*     */     
/*  93 */     if (this.bp != null) {
/*  94 */       ☃.a("Gossips", this.bp);
/*     */     }
/*     */     
/*  97 */     ☃.b("ConversionTime", eW() ? this.d : -1);
/*     */     
/*  99 */     if (this.bo != null) {
/* 100 */       ☃.a("ConversionPlayer", this.bo);
/*     */     }
/*     */     
/* 103 */     ☃.b("Xp", this.br);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(md ☃) {
/* 108 */     super.a(☃);
/*     */     
/* 110 */     if (☃.c("VillagerData", 10)) {
/* 111 */       DataResult<bfk> dataResult = bfk.a.parse(new Dynamic(mo.a, ☃.c("VillagerData")));
/* 112 */       dataResult.resultOrPartial(h::error).ifPresent(this::a);
/*     */     } 
/*     */     
/* 115 */     if (☃.c("Offers", 10)) {
/* 116 */       this.bq = ☃.p("Offers");
/*     */     }
/*     */     
/* 119 */     if (☃.c("Gossips", 10)) {
/* 120 */       this.bp = ☃.d("Gossips", 10);
/*     */     }
/*     */     
/* 123 */     if (☃.c("ConversionTime", 99) && ☃.h("ConversionTime") > -1) {
/* 124 */       a(☃.b("ConversionPlayer") ? ☃.a("ConversionPlayer") : null, ☃.h("ConversionTime"));
/*     */     }
/*     */     
/* 127 */     if (☃.c("Xp", 3)) {
/* 128 */       this.br = ☃.h("Xp");
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void j() {
/* 134 */     if (!this.l.v && aX() && eW()) {
/* 135 */       int ☃ = eZ();
/*     */       
/* 137 */       this.d -= ☃;
/*     */       
/* 139 */       if (this.d <= 0) {
/* 140 */         c((aag)this.l);
/*     */       }
/*     */     } 
/*     */     
/* 144 */     super.j();
/*     */   }
/*     */ 
/*     */   
/*     */   public aou b(bfw ☃, aot aot1) {
/* 149 */     bmb bmb = ☃.b(aot1);
/* 150 */     if (bmb.b() == bmd.lA) {
/* 151 */       if (a(apw.r)) {
/* 152 */         if (!☃.bC.d) {
/* 153 */           bmb.g(1);
/*     */         }
/*     */         
/* 156 */         if (!this.l.v) {
/* 157 */           a(☃.bS(), this.J.nextInt(2401) + 3600);
/*     */         }
/*     */ 
/*     */         
/* 161 */         return aou.a;
/*     */       } 
/* 163 */       return aou.b;
/*     */     } 
/*     */     
/* 166 */     return super.b(☃, aot1);
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean eN() {
/* 171 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean h(double ☃) {
/* 176 */     return (!eW() && this.br == 0);
/*     */   }
/*     */   
/*     */   public boolean eW() {
/* 180 */     return ((Boolean)ab().<Boolean>a(b)).booleanValue();
/*     */   }
/*     */   
/*     */   private void a(@Nullable UUID ☃, int i) {
/* 184 */     this.bo = ☃;
/* 185 */     this.d = i;
/* 186 */     ab().b(b, Boolean.valueOf(true));
/*     */     
/* 188 */     d(apw.r);
/* 189 */     c(new apu(apw.e, i, Math.min(this.l.ad().a() - 1, 0)));
/*     */     
/* 191 */     this.l.a(this, (byte)16);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(byte ☃) {
/* 196 */     if (☃ == 16) {
/* 197 */       if (!aA()) {
/* 198 */         this.l.a(cD(), cG(), cH(), adq.sa, cu(), 1.0F + this.J.nextFloat(), this.J.nextFloat() * 0.7F + 0.3F, false);
/*     */       }
/*     */       return;
/*     */     } 
/* 202 */     super.a(☃);
/*     */   }
/*     */   
/*     */   private void c(aag ☃) {
/* 206 */     bfj bfj = a(aqe.aP, false);
/*     */     
/* 208 */     for (aqf aqf : aqf.values()) {
/* 209 */       bmb bmb = b(aqf);
/* 210 */       if (!bmb.a())
/*     */       {
/* 212 */         if (bpu.d(bmb)) {
/* 213 */           bfj.a_(aqf.b() + 300, bmb);
/*     */         }
/*     */         else {
/*     */           
/* 217 */           double d = e(aqf);
/* 218 */           if (d > 1.0D)
/* 219 */             a(bmb); 
/*     */         } 
/*     */       }
/*     */     } 
/* 223 */     bfj.a(eX());
/* 224 */     if (this.bp != null) {
/* 225 */       bfj.a(this.bp);
/*     */     }
/* 227 */     if (this.bq != null) {
/* 228 */       bfj.b(new bqw(this.bq));
/*     */     }
/* 230 */     bfj.u(this.br);
/* 231 */     bfj.a(☃, ☃.d(bfj.cB()), aqp.i, (arc)null, (md)null);
/*     */     
/* 233 */     if (this.bo != null) {
/* 234 */       bfw bfw = ☃.b(this.bo);
/* 235 */       if (bfw instanceof aah) {
/* 236 */         ac.r.a((aah)bfw, this, bfj);
/* 237 */         ☃.a(azl.a, bfw, bfj);
/*     */       } 
/*     */     } 
/*     */     
/* 241 */     bfj.c(new apu(apw.i, 200, 0));
/* 242 */     if (!aA()) {
/* 243 */       ☃.a((bfw)null, 1027, cB(), 0);
/*     */     }
/*     */   }
/*     */   
/*     */   private int eZ() {
/* 248 */     int ☃ = 1;
/*     */     
/* 250 */     if (this.J.nextFloat() < 0.01F) {
/* 251 */       int i = 0;
/*     */       
/* 253 */       fx.a a = new fx.a();
/*     */       
/* 255 */       for (int j = (int)cD() - 4; j < (int)cD() + 4 && i < 14; j++) {
/* 256 */         for (int k = (int)cE() - 4; k < (int)cE() + 4 && i < 14; k++) {
/* 257 */           for (int m = (int)cH() - 4; m < (int)cH() + 4 && i < 14; m++) {
/* 258 */             buo buo = this.l.d_(a.d(j, k, m)).b();
/* 259 */             if (buo == bup.dH || buo instanceof buj) {
/* 260 */               if (this.J.nextFloat() < 0.3F) {
/* 261 */                 ☃++;
/*     */               }
/* 263 */               i++;
/*     */             } 
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/* 269 */     return ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   protected float dH() {
/* 274 */     if (w_()) {
/* 275 */       return (this.J.nextFloat() - this.J.nextFloat()) * 0.2F + 2.0F;
/*     */     }
/* 277 */     return (this.J.nextFloat() - this.J.nextFloat()) * 0.2F + 1.0F;
/*     */   }
/*     */ 
/*     */   
/*     */   public adp I() {
/* 282 */     return adq.rY;
/*     */   }
/*     */ 
/*     */   
/*     */   public adp e(apk ☃) {
/* 287 */     return adq.sc;
/*     */   }
/*     */ 
/*     */   
/*     */   public adp dq() {
/* 292 */     return adq.sb;
/*     */   }
/*     */ 
/*     */   
/*     */   public adp eL() {
/* 297 */     return adq.sd;
/*     */   }
/*     */ 
/*     */   
/*     */   protected bmb eM() {
/* 302 */     return bmb.b;
/*     */   }
/*     */   
/*     */   public void g(md ☃) {
/* 306 */     this.bq = ☃;
/*     */   }
/*     */   
/*     */   public void a(mt ☃) {
/* 310 */     this.bp = ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public arc a(bsk ☃, aos aos1, aqp aqp1, @Nullable arc arc1, @Nullable md md1) {
/* 316 */     a(eX().a(bfo.a(☃.i(cB()))));
/*     */     
/* 318 */     return super.a(☃, aos1, aqp1, arc1, md1);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(bfk ☃) {
/* 323 */     bfk bfk1 = eX();
/* 324 */     if (bfk1.b() != ☃.b()) {
/* 325 */       this.bq = null;
/*     */     }
/*     */     
/* 328 */     this.R.b(c, ☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public bfk eX() {
/* 333 */     return this.R.<bfk>a(c);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(int ☃) {
/* 341 */     this.br = ☃;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bek.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */