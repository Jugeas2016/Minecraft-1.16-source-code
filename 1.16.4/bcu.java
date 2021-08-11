/*     */ import com.google.common.collect.Lists;
/*     */ import java.util.List;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class bcu
/*     */   extends aqa
/*     */ {
/*  44 */   private ceh f = bup.C.n();
/*     */   public int b;
/*     */   public boolean c = true;
/*     */   private boolean g;
/*     */   private boolean ag;
/*  49 */   private int ah = 40;
/*  50 */   private float ai = 2.0F;
/*     */   
/*     */   public md d;
/*  53 */   protected static final us<fx> e = uv.a((Class)bcu.class, uu.l);
/*     */   
/*     */   public bcu(aqe<? extends bcu> ☃, brx brx1) {
/*  56 */     super(☃, brx1);
/*     */   }
/*     */   
/*     */   public bcu(brx ☃, double d1, double d2, double d3, ceh ceh1) {
/*  60 */     this(aqe.A, ☃);
/*  61 */     this.f = ceh1;
/*  62 */     this.i = true;
/*     */     
/*  64 */     d(d1, d2 + ((1.0F - cz()) / 2.0F), d3);
/*     */     
/*  66 */     f(dcn.a);
/*     */     
/*  68 */     this.m = d1;
/*  69 */     this.n = d2;
/*  70 */     this.o = d3;
/*     */     
/*  72 */     a(cB());
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean bL() {
/*  77 */     return false;
/*     */   }
/*     */   
/*     */   public void a(fx ☃) {
/*  81 */     this.R.b(e, ☃);
/*     */   }
/*     */   
/*     */   public fx g() {
/*  85 */     return this.R.<fx>a(e);
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean aC() {
/*  90 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void e() {
/*  95 */     this.R.a(e, fx.b);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean aT() {
/* 100 */     return !this.y;
/*     */   }
/*     */ 
/*     */   
/*     */   public void j() {
/* 105 */     if (this.f.g()) {
/* 106 */       ad();
/*     */       
/*     */       return;
/*     */     } 
/* 110 */     buo ☃ = this.f.b();
/* 111 */     if (this.b++ == 0) {
/*     */       
/* 113 */       fx fx = cB();
/* 114 */       if (this.l.d_(fx).a(☃)) {
/* 115 */         this.l.a(fx, false);
/* 116 */       } else if (!this.l.v) {
/* 117 */         ad();
/*     */         
/*     */         return;
/*     */       } 
/*     */     } 
/* 122 */     if (!aB()) {
/* 123 */       f(cC().b(0.0D, -0.04D, 0.0D));
/*     */     }
/* 125 */     a(aqr.a, cC());
/*     */     
/* 127 */     if (!this.l.v) {
/* 128 */       fx fx = cB();
/*     */       
/* 130 */       boolean bool1 = this.f.b() instanceof bvl;
/* 131 */       boolean bool2 = (bool1 && this.l.b(fx).a(aef.b));
/* 132 */       double d = cC().g();
/*     */       
/* 134 */       if (bool1 && d > 1.0D) {
/*     */ 
/*     */         
/* 137 */         dcj dcj = this.l.a(new brf(new dcn(this.m, this.n, this.o), cA(), brf.a.a, brf.b.b, this));
/* 138 */         if (dcj.c() != dcl.a.a && this.l.b(dcj.a()).a(aef.b)) {
/*     */           
/* 140 */           fx = dcj.a();
/* 141 */           bool2 = true;
/*     */         } 
/*     */       } 
/*     */       
/* 145 */       if (this.t || bool2) {
/* 146 */         ceh ceh1 = this.l.d_(fx);
/*     */ 
/*     */         
/* 149 */         f(cC().d(0.7D, -0.5D, 0.7D));
/*     */         
/* 151 */         if (!ceh1.a(bup.bo)) {
/* 152 */           ad();
/*     */           
/* 154 */           if (!this.g) {
/* 155 */             boolean bool3 = ceh1.a(new bnz(this.l, fx, gc.a, bmb.b, gc.b));
/*     */             
/* 157 */             boolean bool4 = (bwo.h(this.l.d_(fx.c())) && (!bool1 || !bool2));
/* 158 */             boolean bool5 = (this.f.a(this.l, fx) && !bool4);
/* 159 */             if (bool3 && bool5) {
/* 160 */               if (this.f.b(cex.C) && this.l.b(fx).a() == cuy.c) {
/* 161 */                 this.f = this.f.a(cex.C, Boolean.valueOf(true));
/*     */               }
/* 163 */               if (this.l.a(fx, this.f, 3)) {
/* 164 */                 if (☃ instanceof bwo) {
/* 165 */                   ((bwo)☃).a(this.l, fx, this.f, ceh1, this);
/*     */                 }
/* 167 */                 if (this.d != null && ☃ instanceof bwm) {
/* 168 */                   ccj ccj = this.l.c(fx);
/*     */                   
/* 170 */                   if (ccj != null) {
/* 171 */                     md md1 = ccj.a(new md());
/* 172 */                     for (String str : this.d.d()) {
/* 173 */                       mt mt = this.d.c(str);
/* 174 */                       if ("x".equals(str) || "y".equals(str) || "z".equals(str)) {
/*     */                         continue;
/*     */                       }
/* 177 */                       md1.a(str, mt.c());
/*     */                     } 
/* 179 */                     ccj.a(this.f, md1);
/* 180 */                     ccj.X_();
/*     */                   } 
/*     */                 } 
/* 183 */               } else if (this.c && this.l.V().b(brt.g)) {
/* 184 */                 a(☃);
/*     */               } 
/* 186 */             } else if (this.c && this.l.V().b(brt.g)) {
/* 187 */               a(☃);
/*     */             } 
/* 189 */           } else if (☃ instanceof bwo) {
/* 190 */             ((bwo)☃).a(this.l, fx, this);
/*     */           } 
/*     */         } 
/* 193 */       } else if (!this.l.v && ((this.b > 100 && (fx.v() < 1 || fx.v() > 256)) || this.b > 600)) {
/*     */         
/* 195 */         if (this.c && this.l.V().b(brt.g)) {
/* 196 */           a(☃);
/*     */         }
/* 198 */         ad();
/*     */       } 
/*     */     } 
/*     */     
/* 202 */     f(cC().a(0.98D));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean b(float ☃, float f1) {
/* 207 */     if (this.ag) {
/* 208 */       int i = afm.f(☃ - 1.0F);
/* 209 */       if (i > 0) {
/* 210 */         List<aqa> list = Lists.newArrayList(this.l.a(this, cc()));
/* 211 */         boolean bool = this.f.a(aed.G);
/* 212 */         apk apk = bool ? apk.q : apk.r;
/*     */         
/* 214 */         for (aqa aqa1 : list) {
/* 215 */           aqa1.a(apk, Math.min(afm.d(i * this.ai), this.ah));
/*     */         }
/*     */         
/* 218 */         if (bool && this.J.nextFloat() < 0.05000000074505806D + i * 0.05D) {
/* 219 */           ceh ceh1 = bts.c(this.f);
/* 220 */           if (ceh1 == null) {
/* 221 */             this.g = true;
/*     */           } else {
/* 223 */             this.f = ceh1;
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/* 228 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void b(md ☃) {
/* 233 */     ☃.a("BlockState", mp.a(this.f));
/* 234 */     ☃.b("Time", this.b);
/* 235 */     ☃.a("DropItem", this.c);
/* 236 */     ☃.a("HurtEntities", this.ag);
/* 237 */     ☃.a("FallHurtAmount", this.ai);
/* 238 */     ☃.b("FallHurtMax", this.ah);
/* 239 */     if (this.d != null) {
/* 240 */       ☃.a("TileEntityData", this.d);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(md ☃) {
/* 246 */     this.f = mp.c(☃.p("BlockState"));
/*     */     
/* 248 */     this.b = ☃.h("Time");
/*     */     
/* 250 */     if (☃.c("HurtEntities", 99)) {
/* 251 */       this.ag = ☃.q("HurtEntities");
/* 252 */       this.ai = ☃.j("FallHurtAmount");
/* 253 */       this.ah = ☃.h("FallHurtMax");
/* 254 */     } else if (this.f.a(aed.G)) {
/* 255 */       this.ag = true;
/*     */     } 
/*     */     
/* 258 */     if (☃.c("DropItem", 99)) {
/* 259 */       this.c = ☃.q("DropItem");
/*     */     }
/*     */     
/* 262 */     if (☃.c("TileEntityData", 10)) {
/* 263 */       this.d = ☃.p("TileEntityData");
/*     */     }
/*     */     
/* 266 */     if (this.f.g()) {
/* 267 */       this.f = bup.C.n();
/*     */     }
/*     */   }
/*     */   
/*     */   public brx h() {
/* 272 */     return this.l;
/*     */   }
/*     */   
/*     */   public void a(boolean ☃) {
/* 276 */     this.ag = ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean bR() {
/* 281 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(m ☃) {
/* 286 */     super.a(☃);
/* 287 */     ☃.a("Immitating BlockState", this.f.toString());
/*     */   }
/*     */   
/*     */   public ceh i() {
/* 291 */     return this.f;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean cj() {
/* 296 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public oj<?> P() {
/* 301 */     return new on(this, buo.i(i()));
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bcu.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */