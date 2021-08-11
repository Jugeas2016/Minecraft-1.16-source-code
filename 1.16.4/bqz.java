/*     */ import com.google.common.collect.Lists;
/*     */ import java.util.List;
/*     */ import java.util.Optional;
/*     */ import java.util.function.Function;
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
/*     */ public abstract class bqz
/*     */ {
/*  32 */   private static final Logger a = LogManager.getLogger();
/*     */ 
/*     */ 
/*     */   
/*  36 */   private int b = 20;
/*  37 */   private final List<bsm> c = Lists.newArrayList();
/*  38 */   private bsm d = new bsm();
/*     */   private double e;
/*     */   private double f;
/*  41 */   private int g = 200;
/*  42 */   private int h = 800;
/*  43 */   private int i = 4;
/*     */   @Nullable
/*     */   private aqa j;
/*  46 */   private int k = 6;
/*  47 */   private int l = 16;
/*  48 */   private int m = 4;
/*     */   
/*     */   @Nullable
/*     */   private vk g() {
/*  52 */     String ☃ = this.d.b().l("id");
/*     */     try {
/*  54 */       return aft.b(☃) ? null : new vk(☃);
/*  55 */     } catch (v v) {
/*  56 */       fx fx = b();
/*  57 */       a.warn("Invalid entity id '{}' at spawner {}:[{},{},{}]", ☃, a().Y().a(), Integer.valueOf(fx.u()), Integer.valueOf(fx.v()), Integer.valueOf(fx.w()));
/*  58 */       return null;
/*     */     } 
/*     */   }
/*     */   
/*     */   public void a(aqe<?> ☃) {
/*  63 */     this.d.b().a("id", gm.S.b(☃).toString());
/*     */   }
/*     */   
/*     */   private boolean h() {
/*  67 */     fx ☃ = b();
/*  68 */     return a().a(☃.u() + 0.5D, ☃.v() + 0.5D, ☃.w() + 0.5D, this.l);
/*     */   }
/*     */   
/*     */   public void c() {
/*  72 */     if (!h()) {
/*  73 */       this.f = this.e;
/*     */       
/*     */       return;
/*     */     } 
/*  77 */     brx ☃ = a();
/*  78 */     fx fx = b();
/*  79 */     if (!(☃ instanceof aag)) {
/*  80 */       double d1 = fx.u() + ☃.t.nextDouble();
/*  81 */       double d2 = fx.v() + ☃.t.nextDouble();
/*  82 */       double d3 = fx.w() + ☃.t.nextDouble();
/*  83 */       ☃.a(hh.S, d1, d2, d3, 0.0D, 0.0D, 0.0D);
/*  84 */       ☃.a(hh.A, d1, d2, d3, 0.0D, 0.0D, 0.0D);
/*     */       
/*  86 */       if (this.b > 0) {
/*  87 */         this.b--;
/*     */       }
/*  89 */       this.f = this.e;
/*  90 */       this.e = (this.e + (1000.0F / (this.b + 200.0F))) % 360.0D;
/*     */     } else {
/*  92 */       if (this.b == -1) {
/*  93 */         i();
/*     */       }
/*     */       
/*  96 */       if (this.b > 0) {
/*  97 */         this.b--;
/*     */         
/*     */         return;
/*     */       } 
/* 101 */       boolean bool = false;
/*     */       
/* 103 */       for (int i = 0; i < this.i; i++) {
/* 104 */         md md = this.d.b();
/* 105 */         Optional<aqe<?>> optional = aqe.a(md);
/* 106 */         if (!optional.isPresent()) {
/* 107 */           i();
/*     */           
/*     */           return;
/*     */         } 
/* 111 */         mj mj = md.d("Pos", 6);
/*     */         
/* 113 */         int j = mj.size();
/* 114 */         double d1 = (j >= 1) ? mj.h(0) : (fx.u() + (☃.t.nextDouble() - ☃.t.nextDouble()) * this.m + 0.5D);
/* 115 */         double d2 = (j >= 2) ? mj.h(1) : (fx.v() + ☃.t.nextInt(3) - 1);
/* 116 */         double d3 = (j >= 3) ? mj.h(2) : (fx.w() + (☃.t.nextDouble() - ☃.t.nextDouble()) * this.m + 0.5D);
/*     */         
/* 118 */         if (!☃.b(((aqe)optional.get()).a(d1, d2, d3))) {
/*     */           continue;
/*     */         }
/* 121 */         aag aag = (aag)☃;
/* 122 */         if (!ard.a((aqe<aqa>)optional.get(), aag, aqp.c, new fx(d1, d2, d3), ☃.u_())) {
/*     */           continue;
/*     */         }
/*     */         
/* 126 */         aqa aqa1 = aqe.a(md, ☃, aqa1 -> {
/*     */               aqa1.b(☃, d1, d2, aqa1.p, aqa1.q);
/*     */               return aqa1;
/*     */             });
/* 130 */         if (aqa1 == null) {
/* 131 */           i();
/*     */           
/*     */           return;
/*     */         } 
/* 135 */         int k = ☃.a(aqa1.getClass(), (new dci(fx.u(), fx.v(), fx.w(), (fx.u() + 1), (fx.v() + 1), (fx.w() + 1))).g(this.m)).size();
/* 136 */         if (k >= this.k) {
/* 137 */           i();
/*     */           
/*     */           return;
/*     */         } 
/* 141 */         aqa1.b(aqa1.cD(), aqa1.cE(), aqa1.cH(), ☃.t.nextFloat() * 360.0F, 0.0F);
/* 142 */         if (aqa1 instanceof aqn) {
/* 143 */           aqn aqn = (aqn)aqa1;
/* 144 */           if (!aqn.a(☃, aqp.c) || !aqn.a(☃)) {
/*     */             continue;
/*     */           }
/* 147 */           if (this.d.b().e() == 1 && this.d.b().c("id", 8)) {
/* 148 */             ((aqn)aqa1).a(aag, ☃.d(aqa1.cB()), aqp.c, (arc)null, (md)null);
/*     */           }
/*     */         } 
/*     */         
/* 152 */         if (!aag.g(aqa1)) {
/* 153 */           i();
/*     */           
/*     */           return;
/*     */         } 
/* 157 */         ☃.c(2004, fx, 0);
/* 158 */         if (aqa1 instanceof aqn) {
/* 159 */           ((aqn)aqa1).G();
/*     */         }
/* 161 */         bool = true;
/*     */         continue;
/*     */       } 
/* 164 */       if (bool) {
/* 165 */         i();
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   private void i() {
/* 171 */     if (this.h <= this.g) {
/* 172 */       this.b = this.g;
/*     */     } else {
/* 174 */       this.b = this.g + (a()).t.nextInt(this.h - this.g);
/*     */     } 
/*     */     
/* 177 */     if (!this.c.isEmpty()) {
/* 178 */       a(afz.<bsm>a((a()).t, this.c));
/*     */     }
/*     */     
/* 181 */     a(1);
/*     */   }
/*     */   
/*     */   public void a(md ☃) {
/* 185 */     this.b = ☃.g("Delay");
/*     */     
/* 187 */     this.c.clear();
/* 188 */     if (☃.c("SpawnPotentials", 9)) {
/* 189 */       mj mj = ☃.d("SpawnPotentials", 10);
/*     */       
/* 191 */       for (int i = 0; i < mj.size(); i++) {
/* 192 */         this.c.add(new bsm(mj.a(i)));
/*     */       }
/*     */     } 
/*     */     
/* 196 */     if (☃.c("SpawnData", 10)) {
/* 197 */       a(new bsm(1, ☃.p("SpawnData")));
/* 198 */     } else if (!this.c.isEmpty()) {
/* 199 */       a(afz.<bsm>a((a()).t, this.c));
/*     */     } 
/*     */     
/* 202 */     if (☃.c("MinSpawnDelay", 99)) {
/* 203 */       this.g = ☃.g("MinSpawnDelay");
/* 204 */       this.h = ☃.g("MaxSpawnDelay");
/* 205 */       this.i = ☃.g("SpawnCount");
/*     */     } 
/*     */     
/* 208 */     if (☃.c("MaxNearbyEntities", 99)) {
/* 209 */       this.k = ☃.g("MaxNearbyEntities");
/* 210 */       this.l = ☃.g("RequiredPlayerRange");
/*     */     } 
/*     */     
/* 213 */     if (☃.c("SpawnRange", 99)) {
/* 214 */       this.m = ☃.g("SpawnRange");
/*     */     }
/*     */     
/* 217 */     if (a() != null) {
/* 218 */       this.j = null;
/*     */     }
/*     */   }
/*     */   
/*     */   public md b(md ☃) {
/* 223 */     vk vk = g();
/* 224 */     if (vk == null) {
/* 225 */       return ☃;
/*     */     }
/* 227 */     ☃.a("Delay", (short)this.b);
/* 228 */     ☃.a("MinSpawnDelay", (short)this.g);
/* 229 */     ☃.a("MaxSpawnDelay", (short)this.h);
/* 230 */     ☃.a("SpawnCount", (short)this.i);
/* 231 */     ☃.a("MaxNearbyEntities", (short)this.k);
/* 232 */     ☃.a("RequiredPlayerRange", (short)this.l);
/* 233 */     ☃.a("SpawnRange", (short)this.m);
/* 234 */     ☃.a("SpawnData", this.d.b().g());
/*     */     
/* 236 */     mj mj = new mj();
/*     */     
/* 238 */     if (this.c.isEmpty()) {
/* 239 */       mj.add(this.d.a());
/*     */     } else {
/* 241 */       for (bsm bsm1 : this.c) {
/* 242 */         mj.add(bsm1.a());
/*     */       }
/*     */     } 
/*     */     
/* 246 */     ☃.a("SpawnPotentials", mj);
/*     */     
/* 248 */     return ☃;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public aqa d() {
/* 253 */     if (this.j == null) {
/* 254 */       this.j = aqe.a(this.d.b(), a(), Function.identity());
/* 255 */       if (this.d.b().e() != 1 || !this.d.b().c("id", 8) || this.j instanceof aqn);
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 261 */     return this.j;
/*     */   }
/*     */   
/*     */   public boolean b(int ☃) {
/* 265 */     if (☃ == 1 && (a()).v) {
/* 266 */       this.b = this.g;
/* 267 */       return true;
/*     */     } 
/* 269 */     return false;
/*     */   }
/*     */   
/*     */   public void a(bsm ☃) {
/* 273 */     this.d = ☃;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public double e() {
/* 283 */     return this.e;
/*     */   }
/*     */   
/*     */   public double f() {
/* 287 */     return this.f;
/*     */   }
/*     */   
/*     */   public abstract void a(int paramInt);
/*     */   
/*     */   public abstract brx a();
/*     */   
/*     */   public abstract fx b();
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bqz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */