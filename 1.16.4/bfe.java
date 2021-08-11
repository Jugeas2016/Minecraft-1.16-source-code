/*     */ import com.google.common.collect.Sets;
/*     */ import java.util.Set;
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
/*     */ public abstract class bfe
/*     */   extends apy
/*     */   implements bfi, bqu
/*     */ {
/*  41 */   private static final us<Integer> bp = uv.a((Class)bfe.class, uu.b);
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   private bfw bq;
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   protected bqw bo;
/*     */   
/*  51 */   private final apa br = new apa(8);
/*     */   
/*     */   public bfe(aqe<? extends bfe> ☃, brx brx1) {
/*  54 */     super((aqe)☃, brx1);
/*  55 */     a(cwz.l, 16.0F);
/*  56 */     a(cwz.m, -1.0F);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public arc a(bsk ☃, aos aos1, aqp aqp1, @Nullable arc arc1, @Nullable md md1) {
/*  62 */     if (arc1 == null) {
/*  63 */       arc1 = new apy.a(false);
/*     */     }
/*     */     
/*  66 */     return super.a(☃, aos1, aqp1, arc1, md1);
/*     */   }
/*     */   
/*     */   public int eK() {
/*  70 */     return ((Integer)this.R.<Integer>a(bp)).intValue();
/*     */   }
/*     */   
/*     */   public void s(int ☃) {
/*  74 */     this.R.b(bp, Integer.valueOf(☃));
/*     */   }
/*     */ 
/*     */   
/*     */   public int eL() {
/*  79 */     return 0;
/*     */   }
/*     */ 
/*     */   
/*     */   protected float b(aqx ☃, aqb aqb1) {
/*  84 */     if (w_()) {
/*  85 */       return 0.81F;
/*     */     }
/*  87 */     return 1.62F;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void e() {
/*  92 */     super.e();
/*  93 */     this.R.a(bp, Integer.valueOf(0));
/*     */   }
/*     */ 
/*     */   
/*     */   public void f(@Nullable bfw ☃) {
/*  98 */     this.bq = ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public bfw eM() {
/* 104 */     return this.bq;
/*     */   }
/*     */   
/*     */   public boolean eN() {
/* 108 */     return (this.bq != null);
/*     */   }
/*     */ 
/*     */   
/*     */   public bqw eO() {
/* 113 */     if (this.bo == null) {
/* 114 */       this.bo = new bqw();
/* 115 */       eW();
/*     */     } 
/* 117 */     return this.bo;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(@Nullable bqw ☃) {}
/*     */ 
/*     */ 
/*     */   
/*     */   public void t(int ☃) {}
/*     */ 
/*     */   
/*     */   public void a(bqv ☃) {
/* 130 */     ☃.j();
/* 131 */     this.e = -D();
/*     */     
/* 133 */     b(☃);
/*     */     
/* 135 */     if (this.bq instanceof aah) {
/* 136 */       ac.s.a((aah)this.bq, this, ☃.d());
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   protected abstract void b(bqv parambqv);
/*     */   
/*     */   public boolean eP() {
/* 144 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public void k(bmb ☃) {
/* 149 */     if (!this.l.v && this.e > -D() + 20) {
/* 150 */       this.e = -D();
/* 151 */       a(t(!☃.a()), dG(), dH());
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public adp eQ() {
/* 157 */     return adq.pY;
/*     */   }
/*     */   
/*     */   protected adp t(boolean ☃) {
/* 161 */     return ☃ ? adq.pY : adq.pW;
/*     */   }
/*     */   
/*     */   public void eR() {
/* 165 */     a(adq.pT, dG(), dH());
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(md ☃) {
/* 170 */     super.b(☃);
/*     */     
/* 172 */     bqw bqw1 = eO();
/* 173 */     if (!bqw1.isEmpty()) {
/* 174 */       ☃.a("Offers", bqw1.a());
/*     */     }
/* 176 */     ☃.a("Inventory", this.br.g());
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(md ☃) {
/* 182 */     super.a(☃);
/*     */ 
/*     */     
/* 185 */     if (☃.c("Offers", 10)) {
/* 186 */       this.bo = new bqw(☃.p("Offers"));
/*     */     }
/* 188 */     this.br.a(☃.d("Inventory", 10));
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public aqa b(aag ☃) {
/* 194 */     eT();
/* 195 */     return super.b(☃);
/*     */   }
/*     */   
/*     */   protected void eT() {
/* 199 */     f((bfw)null);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(apk ☃) {
/* 204 */     super.a(☃);
/* 205 */     eT();
/*     */   }
/*     */   
/*     */   protected void a(hf ☃) {
/* 209 */     for (int i = 0; i < 5; i++) {
/* 210 */       double d1 = this.J.nextGaussian() * 0.02D;
/* 211 */       double d2 = this.J.nextGaussian() * 0.02D;
/* 212 */       double d3 = this.J.nextGaussian() * 0.02D;
/* 213 */       this.l.a(☃, d(1.0D), cF() + 1.0D, g(1.0D), d1, d2, d3);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(bfw ☃) {
/* 219 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public apa eU() {
/* 224 */     return this.br;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a_(int ☃, bmb bmb1) {
/* 229 */     if (super.a_(☃, bmb1)) {
/* 230 */       return true;
/*     */     }
/* 232 */     int i = ☃ - 300;
/* 233 */     if (i >= 0 && i < this.br.Z_()) {
/* 234 */       this.br.a(i, bmb1);
/* 235 */       return true;
/*     */     } 
/* 237 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public brx eV() {
/* 242 */     return this.l;
/*     */   }
/*     */   
/*     */   protected abstract void eW();
/*     */   
/*     */   protected void a(bqw ☃, bfn.f[] arrayOfF, int i) {
/* 248 */     Set<Integer> set = Sets.newHashSet();
/* 249 */     if (arrayOfF.length > i) {
/* 250 */       while (set.size() < i) {
/* 251 */         set.add(Integer.valueOf(this.J.nextInt(arrayOfF.length)));
/*     */       }
/*     */     } else {
/* 254 */       for (int j = 0; j < arrayOfF.length; j++) {
/* 255 */         set.add(Integer.valueOf(j));
/*     */       }
/*     */     } 
/*     */     
/* 259 */     for (Integer integer : set) {
/* 260 */       bfn.f f1 = arrayOfF[integer.intValue()];
/* 261 */       bqv bqv = f1.a(this, this.J);
/* 262 */       if (bqv != null) {
/* 263 */         ☃.add(bqv);
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public dcn o(float ☃) {
/* 270 */     float f = afm.g(☃, this.aB, this.aA) * 0.017453292F;
/* 271 */     dcn dcn = new dcn(0.0D, cc().c() - 1.0D, 0.2D);
/* 272 */     return l(☃).e(dcn.b(-f));
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bfe.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */