/*     */ import java.util.Collection;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class bdc
/*     */   extends bdq
/*     */   implements aqy
/*     */ {
/*  45 */   private static final us<Integer> b = uv.a((Class)bdc.class, uu.b);
/*  46 */   private static final us<Boolean> c = uv.a((Class)bdc.class, uu.i);
/*  47 */   private static final us<Boolean> d = uv.a((Class)bdc.class, uu.i);
/*     */   
/*     */   private int bo;
/*     */   private int bp;
/*  51 */   private int bq = 30;
/*  52 */   private int br = 3;
/*     */   private int bs;
/*     */   
/*     */   public bdc(aqe<? extends bdc> ☃, brx brx1) {
/*  56 */     super((aqe)☃, brx1);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void o() {
/*  61 */     this.bk.a(1, new avp(this));
/*  62 */     this.bk.a(2, new axd(this));
/*  63 */     this.bk.a(3, new avd<>(this, bak.class, 6.0F, 1.0D, 1.2D));
/*  64 */     this.bk.a(3, new avd<>(this, bab.class, 6.0F, 1.0D, 1.2D));
/*  65 */     this.bk.a(4, new awf(this, 1.0D, false));
/*  66 */     this.bk.a(5, new axk(this, 0.8D));
/*  67 */     this.bk.a(6, new awd(this, (Class)bfw.class, 8.0F));
/*  68 */     this.bk.a(6, new aws(this));
/*     */     
/*  70 */     this.bl.a(1, new axq<>(this, bfw.class, true));
/*  71 */     this.bl.a(2, new axp(this, new Class[0]));
/*     */   }
/*     */   
/*     */   public static ark.a m() {
/*  75 */     return bdq.eR()
/*  76 */       .a(arl.d, 0.25D);
/*     */   }
/*     */ 
/*     */   
/*     */   public int bP() {
/*  81 */     if (A() == null) {
/*  82 */       return 3;
/*     */     }
/*     */     
/*  85 */     return 3 + (int)(dk() - 1.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean b(float ☃, float f1) {
/*  90 */     boolean bool = super.b(☃, f1);
/*     */     
/*  92 */     this.bp = (int)(this.bp + ☃ * 1.5F);
/*  93 */     if (this.bp > this.bq - 5) {
/*  94 */       this.bp = this.bq - 5;
/*     */     }
/*  96 */     return bool;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void e() {
/* 101 */     super.e();
/*     */     
/* 103 */     this.R.a(b, Integer.valueOf(-1));
/* 104 */     this.R.a(c, Boolean.valueOf(false));
/* 105 */     this.R.a(d, Boolean.valueOf(false));
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(md ☃) {
/* 110 */     super.b(☃);
/* 111 */     if (((Boolean)this.R.<Boolean>a(c)).booleanValue()) {
/* 112 */       ☃.a("powered", true);
/*     */     }
/* 114 */     ☃.a("Fuse", (short)this.bq);
/* 115 */     ☃.a("ExplosionRadius", (byte)this.br);
/* 116 */     ☃.a("ignited", eL());
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(md ☃) {
/* 121 */     super.a(☃);
/* 122 */     this.R.b(c, Boolean.valueOf(☃.q("powered")));
/* 123 */     if (☃.c("Fuse", 99)) {
/* 124 */       this.bq = ☃.g("Fuse");
/*     */     }
/* 126 */     if (☃.c("ExplosionRadius", 99)) {
/* 127 */       this.br = ☃.f("ExplosionRadius");
/*     */     }
/* 129 */     if (☃.q("ignited")) {
/* 130 */       eM();
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void j() {
/* 136 */     if (aX()) {
/* 137 */       this.bo = this.bp;
/*     */ 
/*     */       
/* 140 */       if (eL()) {
/* 141 */         a(1);
/*     */       }
/*     */       
/* 144 */       int ☃ = eK();
/* 145 */       if (☃ > 0 && this.bp == 0) {
/* 146 */         a(adq.cp, 1.0F, 0.5F);
/*     */       }
/* 148 */       this.bp += ☃;
/* 149 */       if (this.bp < 0) {
/* 150 */         this.bp = 0;
/*     */       }
/* 152 */       if (this.bp >= this.bq) {
/* 153 */         this.bp = this.bq;
/* 154 */         eP();
/*     */       } 
/*     */     } 
/* 157 */     super.j();
/*     */   }
/*     */ 
/*     */   
/*     */   protected adp e(apk ☃) {
/* 162 */     return adq.co;
/*     */   }
/*     */ 
/*     */   
/*     */   protected adp dq() {
/* 167 */     return adq.cn;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(apk ☃, int i, boolean bool) {
/* 172 */     super.a(☃, i, bool);
/* 173 */     aqa aqa = ☃.k();
/* 174 */     if (aqa != this && aqa instanceof bdc) {
/* 175 */       bdc bdc1 = (bdc)aqa;
/* 176 */       if (bdc1.eN()) {
/* 177 */         bdc1.eO();
/* 178 */         a(bmd.pi);
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean B(aqa ☃) {
/* 185 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean S_() {
/* 190 */     return ((Boolean)this.R.<Boolean>a(c)).booleanValue();
/*     */   }
/*     */   
/*     */   public float y(float ☃) {
/* 194 */     return afm.g(☃, this.bo, this.bp) / (this.bq - 2);
/*     */   }
/*     */   
/*     */   public int eK() {
/* 198 */     return ((Integer)this.R.<Integer>a(b)).intValue();
/*     */   }
/*     */   
/*     */   public void a(int ☃) {
/* 202 */     this.R.b(b, Integer.valueOf(☃));
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(aag ☃, aql aql1) {
/* 207 */     super.a(☃, aql1);
/* 208 */     this.R.b(c, Boolean.valueOf(true));
/*     */   }
/*     */ 
/*     */   
/*     */   protected aou b(bfw ☃, aot aot1) {
/* 213 */     bmb bmb = ☃.b(aot1);
/* 214 */     if (bmb.b() == bmd.ka) {
/* 215 */       this.l.a(☃, cD(), cE(), cH(), adq.eo, cu(), 1.0F, this.J.nextFloat() * 0.4F + 0.8F);
/* 216 */       if (!this.l.v) {
/* 217 */         eM();
/* 218 */         bmb.a(1, ☃, bfw1 -> bfw1.d(☃));
/*     */       } 
/* 220 */       return aou.a(this.l.v);
/*     */     } 
/*     */     
/* 223 */     return super.b(☃, aot1);
/*     */   }
/*     */   
/*     */   private void eP() {
/* 227 */     if (!this.l.v) {
/* 228 */       brp.a ☃ = this.l.V().b(brt.b) ? brp.a.c : brp.a.a;
/* 229 */       float f = S_() ? 2.0F : 1.0F;
/* 230 */       this.aH = true;
/* 231 */       this.l.a(this, cD(), cE(), cH(), this.br * f, ☃);
/* 232 */       ad();
/* 233 */       eS();
/*     */     } 
/*     */   }
/*     */   
/*     */   private void eS() {
/* 238 */     Collection<apu> ☃ = dh();
/* 239 */     if (!☃.isEmpty()) {
/* 240 */       apz apz = new apz(this.l, cD(), cE(), cH());
/* 241 */       apz.a(2.5F);
/* 242 */       apz.b(-0.5F);
/* 243 */       apz.d(10);
/* 244 */       apz.b(apz.m() / 2);
/* 245 */       apz.c(-apz.g() / apz.m());
/* 246 */       for (apu apu : ☃) {
/* 247 */         apz.a(new apu(apu));
/*     */       }
/* 249 */       this.l.c(apz);
/*     */     } 
/*     */   }
/*     */   
/*     */   public boolean eL() {
/* 254 */     return ((Boolean)this.R.<Boolean>a(d)).booleanValue();
/*     */   }
/*     */   
/*     */   public void eM() {
/* 258 */     this.R.b(d, Boolean.valueOf(true));
/*     */   }
/*     */   
/*     */   public boolean eN() {
/* 262 */     return (S_() && this.bs < 1);
/*     */   }
/*     */   
/*     */   public void eO() {
/* 266 */     this.bs++;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bdc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */