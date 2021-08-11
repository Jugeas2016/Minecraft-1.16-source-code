/*     */ import com.google.common.collect.Lists;
/*     */ import com.mojang.datafixers.kinds.App;
/*     */ import com.mojang.datafixers.kinds.Applicative;
/*     */ import com.mojang.datafixers.util.Function6;
/*     */ import com.mojang.serialization.Codec;
/*     */ import com.mojang.serialization.Dynamic;
/*     */ import com.mojang.serialization.codecs.RecordCodecBuilder;
/*     */ import java.util.Arrays;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Random;
/*     */ import java.util.stream.Collectors;
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
/*     */ 
/*     */ 
/*     */ public class crp
/*     */   extends crx
/*     */ {
/*  51 */   private static final Logger d = LogManager.getLogger();
/*     */   
/*     */   private final vk e;
/*     */   
/*     */   private final bzm f;
/*     */   
/*     */   private final byg g;
/*     */   private final b h;
/*     */   private final a i;
/*     */   
/*     */   public static class a
/*     */   {
/*     */     public static final Codec<a> a;
/*     */     public boolean b;
/*     */     
/*     */     static {
/*  67 */       a = RecordCodecBuilder.create(☃ -> ☃.group((App)Codec.BOOL.fieldOf("cold").forGetter(()), (App)Codec.FLOAT.fieldOf("mossiness").forGetter(()), (App)Codec.BOOL.fieldOf("air_pocket").forGetter(()), (App)Codec.BOOL.fieldOf("overgrown").forGetter(()), (App)Codec.BOOL.fieldOf("vines").forGetter(()), (App)Codec.BOOL.fieldOf("replace_with_blackstone").forGetter(())).apply((Applicative)☃, a::new));
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  77 */     public float c = 0.2F;
/*     */     
/*     */     public boolean d;
/*     */     public boolean e;
/*     */     public boolean f;
/*     */     public boolean g;
/*     */     
/*     */     public a() {}
/*     */     
/*     */     public <T> a(boolean ☃, float f, boolean bool1, boolean bool2, boolean bool3, boolean bool4) {
/*  87 */       this.b = ☃;
/*  88 */       this.c = f;
/*  89 */       this.d = bool1;
/*  90 */       this.e = bool2;
/*  91 */       this.f = bool3;
/*  92 */       this.g = bool4;
/*     */     }
/*     */   }
/*     */   
/*     */   public crp(fx ☃, b b1, a a1, vk vk1, ctb ctb1, bzm bzm1, byg byg1, fx fx1) {
/*  97 */     super(clb.J, 0);
/*     */     
/*  99 */     this.c = ☃;
/* 100 */     this.e = vk1;
/* 101 */     this.f = bzm1;
/* 102 */     this.g = byg1;
/*     */     
/* 104 */     this.h = b1;
/* 105 */     this.i = a1;
/*     */     
/* 107 */     a(ctb1, fx1);
/*     */   }
/*     */   
/*     */   public crp(csw ☃, md md1) {
/* 111 */     super(clb.J, md1);
/* 112 */     this.e = new vk(md1.l("Template"));
/* 113 */     this.f = bzm.valueOf(md1.l("Rotation"));
/* 114 */     this.g = byg.valueOf(md1.l("Mirror"));
/* 115 */     this.h = b.a(md1.l("VerticalPlacement"));
/* 116 */     this.i = (a)a.a.parse(new Dynamic(mo.a, md1.c("Properties"))).getOrThrow(true, d::error);
/*     */     
/* 118 */     ctb ctb = ☃.a(this.e);
/* 119 */     a(ctb, new fx(ctb.a().u() / 2, 0, ctb.a().w() / 2));
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(md ☃) {
/* 124 */     super.a(☃);
/* 125 */     ☃.a("Template", this.e.toString());
/* 126 */     ☃.a("Rotation", this.f.name());
/* 127 */     ☃.a("Mirror", this.g.name());
/* 128 */     ☃.a("VerticalPlacement", this.h.a());
/* 129 */     a.a.encodeStart(mo.a, this.i).resultOrPartial(d::error).ifPresent(mt1 -> ☃.a("Properties", mt1));
/*     */   }
/*     */   
/*     */   private void a(ctb ☃, fx fx1) {
/* 133 */     cse cse = this.i.d ? cse.b : cse.d;
/*     */     
/* 135 */     List<csq> list = Lists.newArrayList();
/* 136 */     list.add(a(bup.bE, 0.3F, bup.a));
/* 137 */     list.add(c());
/* 138 */     if (!this.i.b) {
/* 139 */       list.add(a(bup.cL, 0.07F, bup.iJ));
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 149 */     csx csx = (new csx()).a(this.f).a(this.g).a(fx1).a(cse).a(new cst(list)).a(new csd(this.i.c)).a(new csk());
/*     */     
/* 151 */     if (this.i.g) {
/* 152 */       csx.a(csc.b);
/*     */     }
/* 154 */     a(☃, this.c, csx);
/*     */   }
/*     */   
/*     */   private csq c() {
/* 158 */     if (this.h == b.c)
/* 159 */       return a(bup.B, bup.iJ); 
/* 160 */     if (this.i.b) {
/* 161 */       return a(bup.B, bup.cL);
/*     */     }
/* 163 */     return a(bup.B, 0.2F, bup.iJ);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(bsr ☃, bsn bsn1, cfy cfy1, Random random, cra cra1, brd brd1, fx fx1) {
/* 170 */     if (!cra1.b(this.c))
/*     */     {
/* 172 */       return true;
/*     */     }
/* 174 */     cra1.c(this.a.b(this.b, this.c));
/*     */     
/* 176 */     boolean bool = super.a(☃, bsn1, cfy1, random, cra1, brd1, fx1);
/*     */     
/* 178 */     b(random, ☃);
/* 179 */     a(random, ☃);
/*     */     
/* 181 */     if (this.i.f || this.i.e) {
/* 182 */       fx.a(g()).forEach(fx1 -> {
/*     */             if (this.i.f) {
/*     */               a(☃, bsr1, fx1);
/*     */             }
/*     */             
/*     */             if (this.i.e) {
/*     */               b(☃, bsr1, fx1);
/*     */             }
/*     */           });
/*     */     }
/* 192 */     return bool;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void a(String ☃, fx fx1, bsk bsk1, Random random, cra cra1) {}
/*     */ 
/*     */   
/*     */   private void a(Random ☃, bry bry1, fx fx1) {
/* 201 */     ceh ceh1 = bry1.d_(fx1);
/* 202 */     if (ceh1.g() || ceh1.a(bup.dP)) {
/*     */       return;
/*     */     }
/*     */     
/* 206 */     gc gc = gc.c.a.a(☃);
/* 207 */     fx fx2 = fx1.a(gc);
/* 208 */     ceh ceh2 = bry1.d_(fx2);
/* 209 */     if (!ceh2.g()) {
/*     */       return;
/*     */     }
/* 212 */     if (!buo.a(ceh1.k(bry1, fx1), gc)) {
/*     */       return;
/*     */     }
/* 215 */     cey cey = cbi.a(gc.f());
/* 216 */     bry1.a(fx2, bup.dP.n().a(cey, Boolean.valueOf(true)), 3);
/*     */   }
/*     */   
/*     */   private void b(Random ☃, bry bry1, fx fx1) {
/* 220 */     if (☃.nextFloat() < 0.5F && bry1.d_(fx1).a(bup.cL) && bry1.d_(fx1.b()).g()) {
/* 221 */       bry1.a(fx1.b(), bup.ak.n().a(bxx.b, Boolean.valueOf(true)), 3);
/*     */     }
/*     */   }
/*     */   
/*     */   private void a(Random ☃, bry bry1) {
/* 226 */     for (int i = this.n.a + 1; i < this.n.d; i++) {
/* 227 */       for (int j = this.n.c + 1; j < this.n.f; j++) {
/* 228 */         fx fx = new fx(i, this.n.b, j);
/* 229 */         if (bry1.d_(fx).a(bup.cL)) {
/* 230 */           c(☃, bry1, fx.c());
/*     */         }
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   private void c(Random ☃, bry bry1, fx fx1) {
/* 237 */     fx.a a1 = fx1.i();
/* 238 */     d(☃, bry1, a1);
/* 239 */     int i = 8;
/* 240 */     while (i > 0 && ☃.nextFloat() < 0.5F) {
/* 241 */       a1.c(gc.a);
/* 242 */       i--;
/* 243 */       d(☃, bry1, a1);
/*     */     } 
/*     */   }
/*     */   
/*     */   private void b(Random ☃, bry bry1) {
/* 248 */     boolean bool = (this.h == b.a || this.h == b.c);
/*     */     
/* 250 */     gr gr = this.n.g();
/* 251 */     int i = gr.u();
/* 252 */     int j = gr.w();
/*     */     
/* 254 */     float[] arrayOfFloat = { 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.9F, 0.9F, 0.8F, 0.7F, 0.6F, 0.4F, 0.2F };
/* 255 */     int k = arrayOfFloat.length;
/* 256 */     int m = (this.n.d() + this.n.f()) / 2;
/* 257 */     int n = ☃.nextInt(Math.max(1, 8 - m / 2));
/* 258 */     int i1 = 3;
/* 259 */     fx.a a1 = fx.b.i();
/* 260 */     for (int i2 = i - k; i2 <= i + k; i2++) {
/* 261 */       for (int i3 = j - k; i3 <= j + k; i3++) {
/* 262 */         int i4 = Math.abs(i2 - i) + Math.abs(i3 - j);
/* 263 */         int i5 = Math.max(0, i4 + n);
/* 264 */         if (i5 < k) {
/*     */ 
/*     */           
/* 267 */           float f = arrayOfFloat[i5];
/* 268 */           if (☃.nextDouble() < f) {
/* 269 */             int i6 = a(bry1, i2, i3, this.h);
/* 270 */             int i7 = bool ? i6 : Math.min(this.n.b, i6);
/* 271 */             a1.d(i2, i7, i3);
/* 272 */             if (Math.abs(i7 - this.n.b) <= 3 && a(bry1, a1)) {
/* 273 */               d(☃, bry1, a1);
/* 274 */               if (this.i.e) {
/* 275 */                 b(☃, bry1, a1);
/*     */               }
/* 277 */               c(☃, bry1, a1.c());
/*     */             } 
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */   private boolean a(bry ☃, fx fx1) {
/* 285 */     ceh ceh = ☃.d_(fx1);
/* 286 */     return (!ceh.a(bup.a) && 
/* 287 */       !ceh.a(bup.bK) && 
/* 288 */       !ceh.a(bup.bR) && (this.h == b.f || 
/* 289 */       !ceh.a(bup.B)));
/*     */   }
/*     */   
/*     */   private void d(Random ☃, bry bry1, fx fx1) {
/* 293 */     if (!this.i.b && ☃.nextFloat() < 0.07F) {
/* 294 */       bry1.a(fx1, bup.iJ.n(), 3);
/*     */     } else {
/* 296 */       bry1.a(fx1, bup.cL.n(), 3);
/*     */     } 
/*     */   }
/*     */   
/*     */   private static int a(bry ☃, int i, int j, b b1) {
/* 301 */     return ☃.a(a(b1), i, j) - 1;
/*     */   }
/*     */   
/*     */   public static chn.a a(b ☃) {
/* 305 */     return (☃ == b.c) ? chn.a.c : chn.a.a;
/*     */   }
/*     */   
/*     */   private static csq a(buo ☃, float f, buo buo1) {
/* 309 */     return new csq(new csr(☃, f), csa.b, buo1.n());
/*     */   }
/*     */   
/*     */   private static csq a(buo ☃, buo buo1) {
/* 313 */     return new csq(new csf(☃), csa.b, buo1.n());
/*     */   }
/*     */   
/*     */   public enum b {
/* 317 */     a("on_land_surface"),
/* 318 */     b("partly_buried"),
/* 319 */     c("on_ocean_floor"),
/* 320 */     d("in_mountain"),
/* 321 */     e("underground"),
/* 322 */     f("in_nether"); private static final Map<String, b> g;
/*     */     
/*     */     static {
/* 325 */       g = (Map<String, b>)Arrays.<b>stream(values()).collect(Collectors.toMap(b::a, ☃ -> ☃));
/*     */     }
/*     */     private final String h;
/*     */     b(String ☃) {
/* 329 */       this.h = ☃;
/*     */     }
/*     */     
/*     */     public String a() {
/* 333 */       return this.h;
/*     */     }
/*     */     
/*     */     public static b a(String ☃) {
/* 337 */       return g.get(☃);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\crp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */