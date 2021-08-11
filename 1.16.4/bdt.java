/*     */ import com.google.common.collect.Maps;
/*     */ import java.util.Map;
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
/*     */ public class bdt
/*     */   extends bcy
/*     */   implements bdd
/*     */ {
/*  59 */   private static final us<Boolean> b = uv.a((Class)bdt.class, uu.i);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  66 */   private final apa bo = new apa(5);
/*     */   
/*     */   public bdt(aqe<? extends bdt> ☃, brx brx1) {
/*  69 */     super((aqe)☃, brx1);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void o() {
/*  74 */     super.o();
/*     */     
/*  76 */     this.bk.a(0, new avp(this));
/*  77 */     this.bk.a(2, new bhc.a(this, this, 10.0F));
/*  78 */     this.bk.a(3, new awx<>(this, 1.0D, 8.0F));
/*  79 */     this.bk.a(8, new awt(this, 0.6D));
/*  80 */     this.bk.a(9, new awd(this, (Class)bfw.class, 15.0F, 1.0F));
/*  81 */     this.bk.a(10, new awd(this, (Class)aqn.class, 15.0F));
/*     */     
/*  83 */     this.bl.a(1, (new axp(this, new Class[] { bhc.class })).a(new Class[0]));
/*  84 */     this.bl.a(2, new axq<>(this, bfw.class, true));
/*  85 */     this.bl.a(3, new axq<>(this, bfe.class, false));
/*  86 */     this.bl.a(3, new axq<>(this, bai.class, true));
/*     */   }
/*     */   
/*     */   public static ark.a eK() {
/*  90 */     return bdq.eR()
/*  91 */       .a(arl.d, 0.3499999940395355D)
/*  92 */       .a(arl.a, 24.0D)
/*  93 */       .a(arl.f, 5.0D)
/*  94 */       .a(arl.b, 32.0D);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void e() {
/*  99 */     super.e();
/*     */     
/* 101 */     this.R.a(b, Boolean.valueOf(false));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(bmo ☃) {
/* 106 */     return (☃ == bmd.qQ);
/*     */   }
/*     */   
/*     */   public boolean eM() {
/* 110 */     return ((Boolean)this.R.<Boolean>a(b)).booleanValue();
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(boolean ☃) {
/* 115 */     this.R.b(b, Boolean.valueOf(☃));
/*     */   }
/*     */ 
/*     */   
/*     */   public void U_() {
/* 120 */     this.aI = 0;
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(md ☃) {
/* 125 */     super.b(☃);
/* 126 */     mj mj = new mj();
/* 127 */     for (int i = 0; i < this.bo.Z_(); i++) {
/* 128 */       bmb bmb = this.bo.a(i);
/* 129 */       if (!bmb.a()) {
/* 130 */         mj.add(bmb.b(new md()));
/*     */       }
/*     */     } 
/* 133 */     ☃.a("Inventory", mj);
/*     */   }
/*     */ 
/*     */   
/*     */   public bcy.a m() {
/* 138 */     if (eM())
/* 139 */       return bcy.a.f; 
/* 140 */     if (a(bmd.qQ))
/* 141 */       return bcy.a.e; 
/* 142 */     if (eF()) {
/* 143 */       return bcy.a.b;
/*     */     }
/*     */     
/* 146 */     return bcy.a.h;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(md ☃) {
/* 151 */     super.a(☃);
/* 152 */     mj mj = ☃.d("Inventory", 10);
/* 153 */     for (int i = 0; i < mj.size(); i++) {
/* 154 */       bmb bmb = bmb.a(mj.a(i));
/* 155 */       if (!bmb.a()) {
/* 156 */         this.bo.a(bmb);
/*     */       }
/*     */     } 
/*     */     
/* 160 */     p(true);
/*     */   }
/*     */ 
/*     */   
/*     */   public float a(fx ☃, brz brz1) {
/* 165 */     ceh ceh = brz1.d_(☃.c());
/* 166 */     if (ceh.a(bup.i) || ceh.a(bup.C)) {
/* 167 */       return 10.0F;
/*     */     }
/* 169 */     return 0.5F - brz1.y(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public int eq() {
/* 174 */     return 1;
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public arc a(bsk ☃, aos aos1, aqp aqp1, @Nullable arc arc1, @Nullable md md1) {
/* 180 */     a(aos1);
/* 181 */     b(aos1);
/*     */     
/* 183 */     return super.a(☃, aos1, aqp1, arc1, md1);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(aos ☃) {
/* 188 */     a(aqf.a, new bmb(bmd.qQ));
/*     */   }
/*     */ 
/*     */   
/*     */   protected void w(float ☃) {
/* 193 */     super.w(☃);
/*     */     
/* 195 */     if (this.J.nextInt(300) == 0) {
/* 196 */       bmb bmb = dD();
/* 197 */       if (bmb.b() == bmd.qQ) {
/* 198 */         Map<bps, Integer> map = bpu.a(bmb);
/* 199 */         map.putIfAbsent(bpw.J, Integer.valueOf(1));
/* 200 */         bpu.a(map, bmb);
/* 201 */         a(aqf.a, bmb);
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean r(aqa ☃) {
/* 208 */     if (super.r(☃)) {
/* 209 */       return true;
/*     */     }
/* 211 */     if (☃ instanceof aqm && ((aqm)☃).dC() == aqq.d)
/*     */     {
/* 213 */       return (bG() == null && ☃.bG() == null);
/*     */     }
/* 215 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   protected adp I() {
/* 220 */     return adq.li;
/*     */   }
/*     */ 
/*     */   
/*     */   protected adp dq() {
/* 225 */     return adq.lk;
/*     */   }
/*     */ 
/*     */   
/*     */   protected adp e(apk ☃) {
/* 230 */     return adq.ll;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(aqm ☃, float f) {
/* 235 */     b(this, 1.6F);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(aqm ☃, bmb bmb1, bgm bgm1, float f) {
/* 240 */     a(this, ☃, bgm1, f, 1.6F);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void b(bcv ☃) {
/* 249 */     bmb bmb = ☃.g();
/* 250 */     if (bmb.b() instanceof bke) {
/* 251 */       super.b(☃);
/*     */     } else {
/* 253 */       blx blx = bmb.b();
/* 254 */       if (b(blx)) {
/* 255 */         a(☃);
/* 256 */         bmb bmb1 = this.bo.a(bmb);
/* 257 */         if (bmb1.a()) {
/* 258 */           ☃.ad();
/*     */         } else {
/* 260 */           bmb.e(bmb1.E());
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   private boolean b(blx ☃) {
/* 267 */     return (fb() && ☃ == bmd.pM);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a_(int ☃, bmb bmb1) {
/* 272 */     if (super.a_(☃, bmb1)) {
/* 273 */       return true;
/*     */     }
/* 275 */     int i = ☃ - 300;
/* 276 */     if (i >= 0 && i < this.bo.Z_()) {
/* 277 */       this.bo.a(i, bmb1);
/* 278 */       return true;
/*     */     } 
/* 280 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(int ☃, boolean bool) {
/* 285 */     bhb bhb = fa();
/* 286 */     boolean bool1 = (this.J.nextFloat() <= bhb.w());
/*     */     
/* 288 */     if (bool1) {
/* 289 */       bmb bmb = new bmb(bmd.qQ);
/* 290 */       Map<bps, Integer> map = Maps.newHashMap();
/*     */       
/* 292 */       if (☃ > bhb.a(aor.c)) {
/* 293 */         map.put(bpw.I, Integer.valueOf(2));
/* 294 */       } else if (☃ > bhb.a(aor.b)) {
/* 295 */         map.put(bpw.I, Integer.valueOf(1));
/*     */       } 
/* 297 */       map.put(bpw.H, Integer.valueOf(1));
/*     */       
/* 299 */       bpu.a(map, bmb);
/* 300 */       a(aqf.a, bmb);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public adp eL() {
/* 306 */     return adq.lj;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bdt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */