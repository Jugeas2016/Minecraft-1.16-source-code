/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.collect.Maps;
/*     */ import com.mojang.brigadier.StringReader;
/*     */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.UUID;
/*     */ import javax.annotation.Nullable;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class apz
/*     */   extends aqa
/*     */ {
/*  38 */   private static final Logger b = LogManager.getLogger();
/*     */ 
/*     */ 
/*     */   
/*  42 */   private static final us<Float> c = uv.a((Class)apz.class, uu.c);
/*  43 */   private static final us<Integer> d = uv.a((Class)apz.class, uu.b);
/*  44 */   private static final us<Boolean> e = uv.a((Class)apz.class, uu.i);
/*  45 */   private static final us<hf> f = uv.a((Class)apz.class, uu.j);
/*     */   
/*  47 */   private bnt g = bnw.a;
/*  48 */   private final List<apu> ag = Lists.newArrayList();
/*  49 */   private final Map<aqa, Integer> ah = Maps.newHashMap();
/*  50 */   private int ai = 600;
/*  51 */   private int aj = 20;
/*  52 */   private int ak = 20;
/*     */   private boolean al;
/*     */   private int am;
/*     */   private float an;
/*     */   private float ao;
/*     */   private aqm ap;
/*     */   private UUID aq;
/*     */   
/*     */   public apz(aqe<? extends apz> ☃, brx brx1) {
/*  61 */     super(☃, brx1);
/*  62 */     this.H = true;
/*  63 */     a(3.0F);
/*     */   }
/*     */   
/*     */   public apz(brx ☃, double d1, double d2, double d3) {
/*  67 */     this(aqe.a, ☃);
/*  68 */     d(d1, d2, d3);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void e() {
/*  73 */     ab().a(d, Integer.valueOf(0));
/*  74 */     ab().a(c, Float.valueOf(0.5F));
/*  75 */     ab().a(e, Boolean.valueOf(false));
/*  76 */     ab().a(f, hh.u);
/*     */   }
/*     */   
/*     */   public void a(float ☃) {
/*  80 */     if (!this.l.v) {
/*  81 */       ab().b(c, Float.valueOf(☃));
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void x_() {
/*  87 */     double ☃ = cD();
/*  88 */     double d1 = cE();
/*  89 */     double d2 = cH();
/*  90 */     super.x_();
/*  91 */     d(☃, d1, d2);
/*     */   }
/*     */   
/*     */   public float g() {
/*  95 */     return ((Float)ab().<Float>a(c)).floatValue();
/*     */   }
/*     */   
/*     */   public void a(bnt ☃) {
/*  99 */     this.g = ☃;
/* 100 */     if (!this.al) {
/* 101 */       x();
/*     */     }
/*     */   }
/*     */   
/*     */   private void x() {
/* 106 */     if (this.g == bnw.a && this.ag.isEmpty()) {
/* 107 */       ab().b(d, Integer.valueOf(0));
/*     */     } else {
/* 109 */       ab().b(d, Integer.valueOf(bnv.a(bnv.a(this.g, this.ag))));
/*     */     } 
/*     */   }
/*     */   
/*     */   public void a(apu ☃) {
/* 114 */     this.ag.add(☃);
/* 115 */     if (!this.al) {
/* 116 */       x();
/*     */     }
/*     */   }
/*     */   
/*     */   public int h() {
/* 121 */     return ((Integer)ab().<Integer>a(d)).intValue();
/*     */   }
/*     */   
/*     */   public void a(int ☃) {
/* 125 */     this.al = true;
/* 126 */     ab().b(d, Integer.valueOf(☃));
/*     */   }
/*     */   
/*     */   public hf i() {
/* 130 */     return ab().<hf>a(f);
/*     */   }
/*     */   
/*     */   public void a(hf ☃) {
/* 134 */     ab().b(f, ☃);
/*     */   }
/*     */   
/*     */   protected void a(boolean ☃) {
/* 138 */     ab().b(e, Boolean.valueOf(☃));
/*     */   }
/*     */   
/*     */   public boolean k() {
/* 142 */     return ((Boolean)ab().<Boolean>a(e)).booleanValue();
/*     */   }
/*     */   
/*     */   public int m() {
/* 146 */     return this.ai;
/*     */   }
/*     */   
/*     */   public void b(int ☃) {
/* 150 */     this.ai = ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public void j() {
/* 155 */     super.j();
/* 156 */     boolean ☃ = k();
/*     */     
/* 158 */     float f = g();
/* 159 */     if (this.l.v) {
/* 160 */       hf hf = i();
/*     */       
/* 162 */       if (☃) {
/* 163 */         if (this.J.nextBoolean()) {
/* 164 */           for (int i = 0; i < 2; i++) {
/* 165 */             float f1 = this.J.nextFloat() * 6.2831855F;
/* 166 */             float f2 = afm.c(this.J.nextFloat()) * 0.2F;
/* 167 */             float f3 = afm.b(f1) * f2;
/* 168 */             float f4 = afm.a(f1) * f2;
/*     */             
/* 170 */             if (hf.b() == hh.u) {
/* 171 */               int j = this.J.nextBoolean() ? 16777215 : h();
/* 172 */               int k = j >> 16 & 0xFF;
/* 173 */               int m = j >> 8 & 0xFF;
/* 174 */               int n = j & 0xFF;
/* 175 */               this.l.b(hf, cD() + f3, cE(), cH() + f4, (k / 255.0F), (m / 255.0F), (n / 255.0F));
/*     */             } else {
/* 177 */               this.l.b(hf, cD() + f3, cE(), cH() + f4, 0.0D, 0.0D, 0.0D);
/*     */             } 
/*     */           } 
/*     */         }
/*     */       } else {
/* 182 */         float f1 = 3.1415927F * f * f;
/*     */         
/* 184 */         for (int i = 0; i < f1; i++) {
/* 185 */           float f2 = this.J.nextFloat() * 6.2831855F;
/* 186 */           float f3 = afm.c(this.J.nextFloat()) * f;
/* 187 */           float f4 = afm.b(f2) * f3;
/* 188 */           float f5 = afm.a(f2) * f3;
/*     */           
/* 190 */           if (hf.b() == hh.u) {
/* 191 */             int j = h();
/* 192 */             int k = j >> 16 & 0xFF;
/* 193 */             int m = j >> 8 & 0xFF;
/* 194 */             int n = j & 0xFF;
/* 195 */             this.l.b(hf, cD() + f4, cE(), cH() + f5, (k / 255.0F), (m / 255.0F), (n / 255.0F));
/*     */           } else {
/* 197 */             this.l.b(hf, cD() + f4, cE(), cH() + f5, (0.5D - this.J.nextDouble()) * 0.15D, 0.009999999776482582D, (0.5D - this.J.nextDouble()) * 0.15D);
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } else {
/* 202 */       if (this.K >= this.aj + this.ai) {
/* 203 */         ad();
/*     */         
/*     */         return;
/*     */       } 
/* 207 */       boolean bool = (this.K < this.aj);
/* 208 */       if (☃ != bool) {
/* 209 */         a(bool);
/*     */       }
/* 211 */       if (bool) {
/*     */         return;
/*     */       }
/*     */       
/* 215 */       if (this.ao != 0.0F) {
/* 216 */         f += this.ao;
/* 217 */         if (f < 0.5F) {
/* 218 */           ad();
/*     */           return;
/*     */         } 
/* 221 */         a(f);
/*     */       } 
/*     */       
/* 224 */       if (this.K % 5 == 0) {
/* 225 */         for (Iterator<Map.Entry<aqa, Integer>> iterator = this.ah.entrySet().iterator(); iterator.hasNext(); ) {
/* 226 */           Map.Entry<aqa, Integer> entry = iterator.next();
/* 227 */           if (this.K >= ((Integer)entry.getValue()).intValue()) {
/* 228 */             iterator.remove();
/*     */           }
/*     */         } 
/* 231 */         List<apu> list = Lists.newArrayList();
/* 232 */         for (apu apu : this.g.a()) {
/* 233 */           list.add(new apu(apu.a(), apu.b() / 4, apu.c(), apu.d(), apu.e()));
/*     */         }
/* 235 */         list.addAll(this.ag);
/*     */         
/* 237 */         if (list.isEmpty()) {
/* 238 */           this.ah.clear();
/*     */         } else {
/* 240 */           List<aqm> list1 = this.l.a(aqm.class, cc());
/* 241 */           if (!list1.isEmpty()) {
/* 242 */             for (aqm aqm1 : list1) {
/* 243 */               if (this.ah.containsKey(aqm1) || !aqm1.eh()) {
/*     */                 continue;
/*     */               }
/* 246 */               double d1 = aqm1.cD() - cD();
/* 247 */               double d2 = aqm1.cH() - cH();
/* 248 */               double d3 = d1 * d1 + d2 * d2;
/* 249 */               if (d3 <= (f * f)) {
/* 250 */                 this.ah.put(aqm1, Integer.valueOf(this.K + this.ak));
/* 251 */                 for (apu apu : list) {
/* 252 */                   if (apu.a().a()) {
/* 253 */                     apu.a().a(this, t(), aqm1, apu.c(), 0.5D); continue;
/*     */                   } 
/* 255 */                   aqm1.c(new apu(apu));
/*     */                 } 
/*     */                 
/* 258 */                 if (this.an != 0.0F) {
/* 259 */                   f += this.an;
/* 260 */                   if (f < 0.5F) {
/* 261 */                     ad();
/*     */                     return;
/*     */                   } 
/* 264 */                   a(f);
/*     */                 } 
/* 266 */                 if (this.am != 0) {
/* 267 */                   this.ai += this.am;
/* 268 */                   if (this.ai <= 0) {
/* 269 */                     ad();
/*     */                     return;
/*     */                   } 
/*     */                 } 
/*     */               } 
/*     */             } 
/*     */           }
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void b(float ☃) {
/* 286 */     this.an = ☃;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void c(float ☃) {
/* 294 */     this.ao = ☃;
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
/*     */   public void d(int ☃) {
/* 319 */     this.aj = ☃;
/*     */   }
/*     */   
/*     */   public void a(@Nullable aqm ☃) {
/* 323 */     this.ap = ☃;
/* 324 */     this.aq = (☃ == null) ? null : ☃.bS();
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public aqm t() {
/* 329 */     if (this.ap == null && this.aq != null && this.l instanceof aag) {
/* 330 */       aqa ☃ = ((aag)this.l).a(this.aq);
/* 331 */       if (☃ instanceof aqm) {
/* 332 */         this.ap = (aqm)☃;
/*     */       }
/*     */     } 
/*     */     
/* 336 */     return this.ap;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(md ☃) {
/* 341 */     this.K = ☃.h("Age");
/* 342 */     this.ai = ☃.h("Duration");
/* 343 */     this.aj = ☃.h("WaitTime");
/* 344 */     this.ak = ☃.h("ReapplicationDelay");
/* 345 */     this.am = ☃.h("DurationOnUse");
/* 346 */     this.an = ☃.j("RadiusOnUse");
/* 347 */     this.ao = ☃.j("RadiusPerTick");
/* 348 */     a(☃.j("Radius"));
/* 349 */     if (☃.b("Owner")) {
/* 350 */       this.aq = ☃.a("Owner");
/*     */     }
/*     */     
/* 353 */     if (☃.c("Particle", 8)) {
/*     */       try {
/* 355 */         a(dw.b(new StringReader(☃.l("Particle"))));
/* 356 */       } catch (CommandSyntaxException commandSyntaxException) {
/* 357 */         b.warn("Couldn't load custom particle {}", ☃.l("Particle"), commandSyntaxException);
/*     */       } 
/*     */     }
/*     */     
/* 361 */     if (☃.c("Color", 99)) {
/* 362 */       a(☃.h("Color"));
/*     */     }
/*     */     
/* 365 */     if (☃.c("Potion", 8)) {
/* 366 */       a(bnv.c(☃));
/*     */     }
/* 368 */     if (☃.c("Effects", 9)) {
/* 369 */       mj mj = ☃.d("Effects", 10);
/* 370 */       this.ag.clear();
/* 371 */       for (int i = 0; i < mj.size(); i++) {
/* 372 */         apu apu = apu.b(mj.a(i));
/* 373 */         if (apu != null) {
/* 374 */           a(apu);
/*     */         }
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   protected void b(md ☃) {
/* 382 */     ☃.b("Age", this.K);
/* 383 */     ☃.b("Duration", this.ai);
/* 384 */     ☃.b("WaitTime", this.aj);
/* 385 */     ☃.b("ReapplicationDelay", this.ak);
/* 386 */     ☃.b("DurationOnUse", this.am);
/* 387 */     ☃.a("RadiusOnUse", this.an);
/* 388 */     ☃.a("RadiusPerTick", this.ao);
/* 389 */     ☃.a("Radius", g());
/*     */     
/* 391 */     ☃.a("Particle", i().a());
/*     */     
/* 393 */     if (this.aq != null) {
/* 394 */       ☃.a("Owner", this.aq);
/*     */     }
/*     */     
/* 397 */     if (this.al) {
/* 398 */       ☃.b("Color", h());
/*     */     }
/*     */     
/* 401 */     if (this.g != bnw.a && this.g != null) {
/* 402 */       ☃.a("Potion", gm.U.b(this.g).toString());
/*     */     }
/* 404 */     if (!this.ag.isEmpty()) {
/* 405 */       mj mj = new mj();
/* 406 */       for (apu apu : this.ag) {
/* 407 */         mj.add(apu.a(new md()));
/*     */       }
/* 409 */       ☃.a("Effects", mj);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(us<?> ☃) {
/* 415 */     if (c.equals(☃)) {
/* 416 */       x_();
/*     */     }
/* 418 */     super.a(☃);
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
/*     */   public cvc y_() {
/* 431 */     return cvc.d;
/*     */   }
/*     */ 
/*     */   
/*     */   public oj<?> P() {
/* 436 */     return new on(this);
/*     */   }
/*     */ 
/*     */   
/*     */   public aqb a(aqx ☃) {
/* 441 */     return aqb.b(g() * 2.0F, 0.5F);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\apz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */