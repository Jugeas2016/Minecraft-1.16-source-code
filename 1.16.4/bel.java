/*     */ import java.util.Random;
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
/*     */ public class bel
/*     */   extends bej
/*     */   implements aqs
/*     */ {
/*  42 */   private static final UUID b = UUID.fromString("49455A49-7EC5-45BA-B886-3B90B23A1718");
/*  43 */   private static final arj c = new arj(b, "Attacking speed boost", 0.05D, arj.a.a);
/*     */   
/*  45 */   private static final afh d = afu.a(0, 1);
/*     */   
/*     */   private int bo;
/*  48 */   private static final afh bp = afu.a(20, 39);
/*     */   
/*     */   private int bq;
/*     */   
/*     */   private UUID br;
/*  53 */   private static final afh bs = afu.a(4, 6);
/*     */   private int bt;
/*     */   
/*     */   public bel(aqe<? extends bel> ☃, brx brx1) {
/*  57 */     super((aqe)☃, brx1);
/*  58 */     a(cwz.g, 8.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(@Nullable UUID ☃) {
/*  63 */     this.br = ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public double bb() {
/*  68 */     return w_() ? -0.05D : -0.45D;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void m() {
/*  73 */     this.bk.a(2, new axm(this, 1.0D, false));
/*  74 */     this.bk.a(7, new axk(this, 1.0D));
/*     */     
/*  76 */     this.bl.a(1, (new axp(this, new Class[0])).a(new Class[0]));
/*  77 */     this.bl.a(2, new axq<>(this, bfw.class, 10, true, false, this::a_));
/*  78 */     this.bl.a(3, new axw<>(this, true));
/*     */   }
/*     */   
/*     */   public static ark.a eW() {
/*  82 */     return bej.eS()
/*  83 */       .a(arl.l, 0.0D)
/*  84 */       .a(arl.d, 0.23000000417232513D)
/*  85 */       .a(arl.f, 5.0D);
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean eN() {
/*  90 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void N() {
/*  95 */     arh ☃ = a(arl.d);
/*  96 */     if (H_()) {
/*  97 */       if (!w_() && !☃.a(c)) {
/*  98 */         ☃.b(c);
/*     */       }
/* 100 */       eX();
/* 101 */     } else if (☃.a(c)) {
/* 102 */       ☃.d(c);
/*     */     } 
/*     */     
/* 105 */     a((aag)this.l, true);
/* 106 */     if (A() != null) {
/* 107 */       eY();
/*     */     }
/*     */     
/* 110 */     if (H_())
/*     */     {
/*     */ 
/*     */       
/* 114 */       this.aG = this.K;
/*     */     }
/*     */     
/* 117 */     super.N();
/*     */   }
/*     */   
/*     */   private void eX() {
/* 121 */     if (this.bo > 0) {
/* 122 */       this.bo--;
/* 123 */       if (this.bo == 0) {
/* 124 */         fa();
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void eY() {
/* 134 */     if (this.bt > 0) {
/* 135 */       this.bt--;
/*     */       return;
/*     */     } 
/* 138 */     if (z().a(A())) {
/* 139 */       eZ();
/*     */     }
/* 141 */     this.bt = bs.a(this.J);
/*     */   }
/*     */   
/*     */   private void eZ() {
/* 145 */     double ☃ = b(arl.b);
/* 146 */     dci dci = dci.a(cA()).c(☃, 10.0D, ☃);
/* 147 */     this.l.<bel>b(bel.class, dci).stream()
/* 148 */       .filter(☃ -> (☃ != this))
/* 149 */       .filter(☃ -> (☃.A() == null))
/* 150 */       .filter(☃ -> !☃.r(A()))
/* 151 */       .forEach(☃ -> ☃.h(A()));
/*     */   }
/*     */   
/*     */   private void fa() {
/* 155 */     a(adq.rU, dG() * 2.0F, dH() * 1.8F);
/*     */   }
/*     */ 
/*     */   
/*     */   public void h(@Nullable aqm ☃) {
/* 160 */     if (A() == null && ☃ != null) {
/*     */ 
/*     */       
/* 163 */       this.bo = d.a(this.J);
/* 164 */       this.bt = bs.a(this.J);
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 171 */     if (☃ instanceof bfw) {
/* 172 */       e((bfw)☃);
/*     */     }
/* 174 */     super.h(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public void G_() {
/* 179 */     a_(bp.a(this.J));
/*     */   }
/*     */   
/*     */   public static boolean b(aqe<bel> ☃, bry bry1, aqp aqp1, fx fx1, Random random) {
/* 183 */     return (bry1.ad() != aor.a && bry1.d_(fx1.c()).b() != bup.iK);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(brz ☃) {
/* 188 */     return (☃.j(this) && !☃.d(cc()));
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(md ☃) {
/* 193 */     super.b(☃);
/* 194 */     c(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(md ☃) {
/* 199 */     super.a(☃);
/* 200 */     a((aag)this.l, ☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a_(int ☃) {
/* 205 */     this.bq = ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public int E_() {
/* 210 */     return this.bq;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(apk ☃, float f) {
/* 215 */     if (b(☃)) {
/* 216 */       return false;
/*     */     }
/* 218 */     return super.a(☃, f);
/*     */   }
/*     */ 
/*     */   
/*     */   protected adp I() {
/* 223 */     return H_() ? adq.rU : adq.rT;
/*     */   }
/*     */ 
/*     */   
/*     */   protected adp e(apk ☃) {
/* 228 */     return adq.rW;
/*     */   }
/*     */ 
/*     */   
/*     */   protected adp dq() {
/* 233 */     return adq.rV;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(aos ☃) {
/* 238 */     a(aqf.a, new bmb(bmd.kv));
/*     */   }
/*     */ 
/*     */   
/*     */   protected bmb eM() {
/* 243 */     return bmb.b;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void eV() {
/* 248 */     a(arl.l).a(0.0D);
/*     */   }
/*     */ 
/*     */   
/*     */   public UUID F_() {
/* 253 */     return this.br;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean f(bfw ☃) {
/* 258 */     return a_(☃);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bel.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */