/*     */ import java.time.LocalDate;
/*     */ import java.time.temporal.ChronoField;
/*     */ import java.util.Random;
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
/*     */ public class azu
/*     */   extends azt
/*     */ {
/*  33 */   private static final us<Byte> b = uv.a((Class)azu.class, uu.a);
/*     */   
/*  35 */   private static final azg c = (new azg()).a(4.0D).b();
/*     */   
/*     */   private fx d;
/*     */   
/*     */   public azu(aqe<? extends azu> ☃, brx brx1) {
/*  40 */     super((aqe)☃, brx1);
/*     */     
/*  42 */     t(true);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void e() {
/*  47 */     super.e();
/*     */     
/*  49 */     this.R.a(b, Byte.valueOf((byte)0));
/*     */   }
/*     */ 
/*     */   
/*     */   protected float dG() {
/*  54 */     return 0.1F;
/*     */   }
/*     */ 
/*     */   
/*     */   protected float dH() {
/*  59 */     return super.dH() * 0.95F;
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public adp I() {
/*  65 */     if (eI() && this.J.nextInt(4) != 0) {
/*  66 */       return null;
/*     */     }
/*  68 */     return adq.ap;
/*     */   }
/*     */ 
/*     */   
/*     */   protected adp e(apk ☃) {
/*  73 */     return adq.ar;
/*     */   }
/*     */ 
/*     */   
/*     */   protected adp dq() {
/*  78 */     return adq.aq;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean aU() {
/*  84 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void C(aqa ☃) {}
/*     */ 
/*     */ 
/*     */   
/*     */   protected void dQ() {}
/*     */ 
/*     */ 
/*     */   
/*     */   public static ark.a m() {
/*  98 */     return aqn.p()
/*  99 */       .a(arl.a, 6.0D);
/*     */   }
/*     */   
/*     */   public boolean eI() {
/* 103 */     return ((((Byte)this.R.<Byte>a(b)).byteValue() & 0x1) != 0);
/*     */   }
/*     */   
/*     */   public void t(boolean ☃) {
/* 107 */     byte b = ((Byte)this.R.<Byte>a(b)).byteValue();
/* 108 */     if (☃) {
/* 109 */       this.R.b(b, Byte.valueOf((byte)(b | 0x1)));
/*     */     } else {
/* 111 */       this.R.b(b, Byte.valueOf((byte)(b & 0xFFFFFFFE)));
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void j() {
/* 117 */     super.j();
/*     */     
/* 119 */     if (eI()) {
/* 120 */       f(dcn.a);
/* 121 */       o(cD(), afm.c(cE()) + 1.0D - cz(), cH());
/*     */     } else {
/* 123 */       f(cC().d(1.0D, 0.6D, 1.0D));
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   protected void N() {
/* 129 */     super.N();
/*     */     
/* 131 */     fx ☃ = cB();
/* 132 */     fx fx1 = ☃.b();
/*     */     
/* 134 */     if (eI()) {
/* 135 */       boolean bool = aA();
/* 136 */       if (this.l.d_(fx1).g(this.l, ☃)) {
/* 137 */         if (this.J.nextInt(200) == 0) {
/* 138 */           this.aC = this.J.nextInt(360);
/*     */         }
/*     */         
/* 141 */         if (this.l.a(c, this) != null) {
/* 142 */           t(false);
/* 143 */           if (!bool) {
/* 144 */             this.l.a((bfw)null, 1025, ☃, 0);
/*     */           }
/*     */         } 
/*     */       } else {
/* 148 */         t(false);
/* 149 */         if (!bool) {
/* 150 */           this.l.a((bfw)null, 1025, ☃, 0);
/*     */         }
/*     */       } 
/*     */     } else {
/* 154 */       if (this.d != null && (!this.l.w(this.d) || this.d.v() < 1)) {
/* 155 */         this.d = null;
/*     */       }
/* 157 */       if (this.d == null || this.J.nextInt(30) == 0 || this.d.a(cA(), 2.0D)) {
/* 158 */         this.d = new fx(cD() + this.J.nextInt(7) - this.J.nextInt(7), cE() + this.J.nextInt(6) - 2.0D, cH() + this.J.nextInt(7) - this.J.nextInt(7));
/*     */       }
/*     */ 
/*     */       
/* 162 */       double d1 = this.d.u() + 0.5D - cD();
/* 163 */       double d2 = this.d.v() + 0.1D - cE();
/* 164 */       double d3 = this.d.w() + 0.5D - cH();
/*     */       
/* 166 */       dcn dcn1 = cC();
/* 167 */       dcn dcn2 = dcn1.b((
/* 168 */           Math.signum(d1) * 0.5D - dcn1.b) * 0.10000000149011612D, (
/* 169 */           Math.signum(d2) * 0.699999988079071D - dcn1.c) * 0.10000000149011612D, (
/* 170 */           Math.signum(d3) * 0.5D - dcn1.d) * 0.10000000149011612D);
/*     */       
/* 172 */       f(dcn2);
/*     */       
/* 174 */       float f1 = (float)(afm.d(dcn2.d, dcn2.b) * 57.2957763671875D) - 90.0F;
/* 175 */       float f2 = afm.g(f1 - this.p);
/* 176 */       this.aT = 0.5F;
/* 177 */       this.p += f2;
/*     */       
/* 179 */       if (this.J.nextInt(100) == 0 && this.l.d_(fx1).g(this.l, fx1)) {
/* 180 */         t(true);
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean aC() {
/* 187 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean b(float ☃, float f1) {
/* 192 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void a(double ☃, boolean bool, ceh ceh1, fx fx1) {}
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean bQ() {
/* 203 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(apk ☃, float f) {
/* 208 */     if (b(☃)) {
/* 209 */       return false;
/*     */     }
/* 211 */     if (!this.l.v && 
/* 212 */       eI()) {
/* 213 */       t(false);
/*     */     }
/*     */ 
/*     */     
/* 217 */     return super.a(☃, f);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(md ☃) {
/* 222 */     super.a(☃);
/*     */     
/* 224 */     this.R.b(b, Byte.valueOf(☃.f("BatFlags")));
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(md ☃) {
/* 229 */     super.b(☃);
/*     */     
/* 231 */     ☃.a("BatFlags", ((Byte)this.R.<Byte>a(b)).byteValue());
/*     */   }
/*     */   
/*     */   public static boolean b(aqe<azu> ☃, bry bry1, aqp aqp1, fx fx1, Random random) {
/* 235 */     if (fx1.v() >= bry1.t_()) {
/* 236 */       return false;
/*     */     }
/*     */     
/* 239 */     int i = bry1.B(fx1);
/* 240 */     int j = 4;
/*     */     
/* 242 */     if (eJ()) {
/* 243 */       j = 7;
/* 244 */     } else if (random.nextBoolean()) {
/* 245 */       return false;
/*     */     } 
/*     */     
/* 248 */     if (i > random.nextInt(j)) {
/* 249 */       return false;
/*     */     }
/*     */     
/* 252 */     return a((aqe)☃, bry1, aqp1, fx1, random);
/*     */   }
/*     */   
/*     */   private static boolean eJ() {
/* 256 */     LocalDate ☃ = LocalDate.now();
/* 257 */     int i = ☃.get(ChronoField.DAY_OF_MONTH);
/* 258 */     int j = ☃.get(ChronoField.MONTH_OF_YEAR);
/*     */     
/* 260 */     return ((j == 10 && i >= 20) || (j == 11 && i <= 3));
/*     */   }
/*     */ 
/*     */   
/*     */   protected float b(aqx ☃, aqb aqb1) {
/* 265 */     return aqb1.b / 2.0F;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\azu.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */