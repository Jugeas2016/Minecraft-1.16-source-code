/*     */ import com.google.common.collect.Lists;
/*     */ import com.mojang.datafixers.util.Pair;
/*     */ import java.util.Collection;
/*     */ import java.util.Collections;
/*     */ import java.util.List;
/*     */ import java.util.Set;
/*     */ import java.util.function.Consumer;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class aaf
/*     */ {
/*  43 */   private static final Logger a = LogManager.getLogger();
/*     */   
/*     */   private final aag b;
/*     */   
/*     */   private final aqa c;
/*     */   
/*     */   private final int d;
/*     */   
/*     */   private final boolean e;
/*     */   
/*     */   private final Consumer<oj<?>> f;
/*     */   
/*     */   private long g;
/*     */   private long h;
/*     */   private long i;
/*     */   private int j;
/*     */   private int k;
/*     */   private int l;
/*  61 */   private dcn m = dcn.a;
/*     */   private int n;
/*     */   private int o;
/*  64 */   private List<aqa> p = Collections.emptyList();
/*     */   private boolean q;
/*     */   private boolean r;
/*     */   
/*     */   public aaf(aag ☃, aqa aqa1, int i, boolean bool, Consumer<oj<?>> consumer) {
/*  69 */     this.b = ☃;
/*  70 */     this.f = consumer;
/*  71 */     this.c = aqa1;
/*  72 */     this.d = i;
/*  73 */     this.e = bool;
/*     */     
/*  75 */     d();
/*     */     
/*  77 */     this.j = afm.d(aqa1.p * 256.0F / 360.0F);
/*  78 */     this.k = afm.d(aqa1.q * 256.0F / 360.0F);
/*     */     
/*  80 */     this.l = afm.d(aqa1.bK() * 256.0F / 360.0F);
/*  81 */     this.r = aqa1.ao();
/*     */   }
/*     */   
/*     */   public void a() {
/*  85 */     List<aqa> ☃ = this.c.cn();
/*  86 */     if (!☃.equals(this.p)) {
/*  87 */       this.p = ☃;
/*  88 */       this.f.accept(new rh(this.c));
/*     */     } 
/*     */     
/*  91 */     if (this.c instanceof bcp && this.n % 10 == 0) {
/*  92 */       bcp bcp = (bcp)this.c;
/*  93 */       bmb bmb = bcp.o();
/*     */       
/*  95 */       if (bmb.b() instanceof bmh) {
/*  96 */         cxx cxx = bmh.b(bmb, this.b);
/*  97 */         for (aah aah : this.b.x()) {
/*  98 */           cxx.a(aah, bmb);
/*     */           
/* 100 */           oj<?> oj = ((bmh)bmb.b()).a(bmb, this.b, aah);
/* 101 */           if (oj != null) {
/* 102 */             aah.b.a(oj);
/*     */           }
/*     */         } 
/*     */       } 
/*     */       
/* 107 */       c();
/*     */     } 
/*     */     
/* 110 */     if (this.n % this.d == 0 || this.c.Z || this.c.ab().a()) {
/* 111 */       if (this.c.br()) {
/*     */         
/* 113 */         int j = afm.d(this.c.p * 256.0F / 360.0F);
/* 114 */         int k = afm.d(this.c.q * 256.0F / 360.0F);
/* 115 */         boolean bool = (Math.abs(j - this.j) >= 1 || Math.abs(k - this.k) >= 1);
/* 116 */         if (bool) {
/* 117 */           this.f.accept(new qa.c(this.c.Y(), (byte)j, (byte)k, this.c.ao()));
/* 118 */           this.j = j;
/* 119 */           this.k = k;
/*     */         } 
/*     */         
/* 122 */         d();
/*     */         
/* 124 */         c();
/*     */         
/* 126 */         this.q = true;
/*     */       } else {
/* 128 */         this.o++;
/* 129 */         int j = afm.d(this.c.p * 256.0F / 360.0F);
/* 130 */         int k = afm.d(this.c.q * 256.0F / 360.0F);
/*     */         
/* 132 */         dcn dcn1 = this.c.cA().d(qa.a(this.g, this.h, this.i));
/*     */ 
/*     */         
/* 135 */         boolean bool1 = (dcn1.g() >= 7.62939453125E-6D);
/*     */         
/* 137 */         oj<?> oj = null;
/*     */         
/* 139 */         boolean bool2 = (bool1 || this.n % 60 == 0);
/* 140 */         boolean bool3 = (Math.abs(j - this.j) >= 1 || Math.abs(k - this.k) >= 1);
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 145 */         if (this.n > 0 || this.c instanceof bga) {
/* 146 */           long l1 = qa.a(dcn1.b);
/* 147 */           long l2 = qa.a(dcn1.c);
/* 148 */           long l3 = qa.a(dcn1.d);
/* 149 */           boolean bool = (l1 < -32768L || l1 > 32767L || l2 < -32768L || l2 > 32767L || l3 < -32768L || l3 > 32767L);
/* 150 */           if (bool || this.o > 400 || this.q || this.r != this.c.ao()) {
/* 151 */             this.r = this.c.ao();
/* 152 */             this.o = 0;
/* 153 */             oj = new rs(this.c);
/*     */           }
/* 155 */           else if ((bool2 && bool3) || this.c instanceof bga) {
/* 156 */             oj = new qa.b(this.c.Y(), (short)(int)l1, (short)(int)l2, (short)(int)l3, (byte)j, (byte)k, this.c.ao());
/* 157 */           } else if (bool2) {
/* 158 */             oj = new qa.a(this.c.Y(), (short)(int)l1, (short)(int)l2, (short)(int)l3, this.c.ao());
/* 159 */           } else if (bool3) {
/* 160 */             oj = new qa.c(this.c.Y(), (byte)j, (byte)k, this.c.ao());
/*     */           } 
/*     */         } 
/*     */ 
/*     */         
/* 165 */         if ((this.e || this.c.Z || (this.c instanceof aqm && ((aqm)this.c).ef())) && this.n > 0) {
/* 166 */           dcn dcn2 = this.c.cC();
/* 167 */           double d = dcn2.g(this.m);
/*     */           
/* 169 */           if (d > 1.0E-7D || (d > 0.0D && dcn2.g() == 0.0D)) {
/* 170 */             this.m = dcn2;
/* 171 */             this.f.accept(new rc(this.c.Y(), this.m));
/*     */           } 
/*     */         } 
/*     */         
/* 175 */         if (oj != null) {
/* 176 */           this.f.accept(oj);
/*     */         }
/*     */         
/* 179 */         c();
/*     */         
/* 181 */         if (bool2) {
/* 182 */           d();
/*     */         }
/* 184 */         if (bool3) {
/* 185 */           this.j = j;
/* 186 */           this.k = k;
/*     */         } 
/*     */         
/* 189 */         this.q = false;
/*     */       } 
/*     */       
/* 192 */       int i = afm.d(this.c.bK() * 256.0F / 360.0F);
/* 193 */       if (Math.abs(i - this.l) >= 1) {
/* 194 */         this.f.accept(new qq(this.c, (byte)i));
/* 195 */         this.l = i;
/*     */       } 
/* 197 */       this.c.Z = false;
/*     */     } 
/*     */     
/* 200 */     this.n++;
/*     */     
/* 202 */     if (this.c.w) {
/* 203 */       a(new rc(this.c));
/* 204 */       this.c.w = false;
/*     */     } 
/*     */   }
/*     */   
/*     */   public void a(aah ☃) {
/* 209 */     this.c.c(☃);
/* 210 */     ☃.c(this.c);
/*     */   }
/*     */   
/*     */   public void b(aah ☃) {
/* 214 */     a(☃.b::a);
/*     */     
/* 216 */     this.c.b(☃);
/* 217 */     ☃.d(this.c);
/*     */   }
/*     */   
/*     */   public void a(Consumer<oj<?>> ☃) {
/* 221 */     if (this.c.y) {
/* 222 */       a.warn("Fetching packet for removed entity " + this.c);
/*     */     }
/* 224 */     oj<?> oj = this.c.P();
/* 225 */     this.l = afm.d(this.c.bK() * 256.0F / 360.0F);
/* 226 */     ☃.accept(oj);
/*     */     
/* 228 */     if (!this.c.ab().d()) {
/* 229 */       ☃.accept(new ra(this.c.Y(), this.c.ab(), true));
/*     */     }
/*     */     
/* 232 */     boolean bool = this.e;
/* 233 */     if (this.c instanceof aqm) {
/* 234 */       Collection<arh> collection = ((aqm)this.c).dB().b();
/*     */       
/* 236 */       if (!collection.isEmpty()) {
/* 237 */         ☃.accept(new ru(this.c.Y(), collection));
/*     */       }
/* 239 */       if (((aqm)this.c).ef()) {
/* 240 */         bool = true;
/*     */       }
/*     */     } 
/*     */     
/* 244 */     this.m = this.c.cC();
/*     */     
/* 246 */     if (bool && !(oj instanceof op)) {
/* 247 */       ☃.accept(new rc(this.c.Y(), this.m));
/*     */     }
/*     */     
/* 250 */     if (this.c instanceof aqm) {
/* 251 */       List<Pair<aqf, bmb>> list = Lists.newArrayList();
/* 252 */       for (aqf aqf : aqf.values()) {
/* 253 */         bmb bmb = ((aqm)this.c).b(aqf);
/* 254 */         if (!bmb.a()) {
/* 255 */           list.add(Pair.of(aqf, bmb.i()));
/*     */         }
/*     */       } 
/* 258 */       if (!list.isEmpty()) {
/* 259 */         ☃.accept(new rd(this.c.Y(), list));
/*     */       }
/*     */     } 
/*     */     
/* 263 */     if (this.c instanceof aqm) {
/* 264 */       aqm aqm = (aqm)this.c;
/* 265 */       for (apu apu : aqm.dh()) {
/* 266 */         ☃.accept(new rv(this.c.Y(), apu));
/*     */       }
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 272 */     if (!this.c.cn().isEmpty()) {
/* 273 */       ☃.accept(new rh(this.c));
/*     */     }
/* 275 */     if (this.c.br()) {
/* 276 */       ☃.accept(new rh(this.c.ct()));
/*     */     }
/*     */ 
/*     */     
/* 280 */     if (this.c instanceof aqn) {
/* 281 */       aqn aqn = (aqn)this.c;
/* 282 */       if (aqn.eB()) {
/* 283 */         ☃.accept(new rb(aqn, aqn.eC()));
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   private void c() {
/* 289 */     uv ☃ = this.c.ab();
/* 290 */     if (☃.a()) {
/* 291 */       a(new ra(this.c.Y(), ☃, false));
/*     */     }
/*     */     
/* 294 */     if (this.c instanceof aqm) {
/* 295 */       Set<arh> set = ((aqm)this.c).dB().a();
/*     */       
/* 297 */       if (!set.isEmpty()) {
/* 298 */         a(new ru(this.c.Y(), set));
/*     */       }
/*     */       
/* 301 */       set.clear();
/*     */     } 
/*     */   }
/*     */   
/*     */   private void d() {
/* 306 */     this.g = qa.a(this.c.cD());
/* 307 */     this.h = qa.a(this.c.cE());
/* 308 */     this.i = qa.a(this.c.cH());
/*     */   }
/*     */   
/*     */   public dcn b() {
/* 312 */     return qa.a(this.g, this.h, this.i);
/*     */   }
/*     */   
/*     */   private void a(oj<?> ☃) {
/* 316 */     this.f.accept(☃);
/* 317 */     if (this.c instanceof aah)
/* 318 */       ((aah)this.c).b.a(☃); 
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\aaf.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */