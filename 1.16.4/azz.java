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
/*     */ public abstract class azz
/*     */   extends apy
/*     */ {
/*     */   private int bo;
/*     */   private UUID bp;
/*     */   
/*     */   protected azz(aqe<? extends azz> ☃, brx brx1) {
/*  39 */     super((aqe)☃, brx1);
/*  40 */     a(cwz.l, 16.0F);
/*  41 */     a(cwz.m, -1.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void N() {
/*  46 */     if (i() != 0) {
/*  47 */       this.bo = 0;
/*     */     }
/*  49 */     super.N();
/*     */   }
/*     */ 
/*     */   
/*     */   public void k() {
/*  54 */     super.k();
/*     */     
/*  56 */     if (i() != 0) {
/*  57 */       this.bo = 0;
/*     */     }
/*     */     
/*  60 */     if (this.bo > 0) {
/*  61 */       this.bo--;
/*  62 */       if (this.bo % 10 == 0) {
/*  63 */         double ☃ = this.J.nextGaussian() * 0.02D;
/*  64 */         double d1 = this.J.nextGaussian() * 0.02D;
/*  65 */         double d2 = this.J.nextGaussian() * 0.02D;
/*  66 */         this.l.a(hh.G, d(1.0D), cF() + 0.5D, g(1.0D), ☃, d1, d2);
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(apk ☃, float f) {
/*  73 */     if (b(☃)) {
/*  74 */       return false;
/*     */     }
/*  76 */     this.bo = 0;
/*  77 */     return super.a(☃, f);
/*     */   }
/*     */ 
/*     */   
/*     */   public float a(fx ☃, brz brz1) {
/*  82 */     if (brz1.d_(☃.c()).a(bup.i)) {
/*  83 */       return 10.0F;
/*     */     }
/*  85 */     return brz1.y(☃) - 0.5F;
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(md ☃) {
/*  90 */     super.b(☃);
/*  91 */     ☃.b("InLove", this.bo);
/*  92 */     if (this.bp != null) {
/*  93 */       ☃.a("LoveCause", this.bp);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public double bb() {
/*  99 */     return 0.14D;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(md ☃) {
/* 104 */     super.a(☃);
/* 105 */     this.bo = ☃.h("InLove");
/* 106 */     this.bp = ☃.b("LoveCause") ? ☃.a("LoveCause") : null;
/*     */   }
/*     */   
/*     */   public static boolean b(aqe<? extends azz> ☃, bry bry1, aqp aqp1, fx fx1, Random random) {
/* 110 */     return (bry1.d_(fx1.c()).a(bup.i) && bry1
/* 111 */       .b(fx1, 0) > 8);
/*     */   }
/*     */ 
/*     */   
/*     */   public int D() {
/* 116 */     return 120;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean h(double ☃) {
/* 121 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   protected int d(bfw ☃) {
/* 126 */     return 1 + this.l.t.nextInt(3);
/*     */   }
/*     */   
/*     */   public boolean k(bmb ☃) {
/* 130 */     return (☃.b() == bmd.kW);
/*     */   }
/*     */ 
/*     */   
/*     */   public aou b(bfw ☃, aot aot1) {
/* 135 */     bmb bmb = ☃.b(aot1);
/* 136 */     if (k(bmb)) {
/* 137 */       int i = i();
/* 138 */       if (!this.l.v && i == 0 && eP()) {
/* 139 */         a(☃, bmb);
/* 140 */         g(☃);
/* 141 */         return aou.a;
/* 142 */       }  if (w_()) {
/* 143 */         a(☃, bmb);
/*     */         
/* 145 */         a((int)((-i / 20) * 0.1F), true);
/* 146 */         return aou.a(this.l.v);
/*     */       } 
/* 148 */       if (this.l.v) {
/* 149 */         return aou.b;
/*     */       }
/*     */     } 
/*     */     
/* 153 */     return super.b(☃, aot1);
/*     */   }
/*     */   
/*     */   protected void a(bfw ☃, bmb bmb1) {
/* 157 */     if (!☃.bC.d) {
/* 158 */       bmb1.g(1);
/*     */     }
/*     */   }
/*     */   
/*     */   public boolean eP() {
/* 163 */     return (this.bo <= 0);
/*     */   }
/*     */   
/*     */   public void g(@Nullable bfw ☃) {
/* 167 */     this.bo = 600;
/*     */     
/* 169 */     if (☃ != null) {
/* 170 */       this.bp = ☃.bS();
/*     */     }
/*     */     
/* 173 */     this.l.a(this, (byte)18);
/*     */   }
/*     */   
/*     */   public void s(int ☃) {
/* 177 */     this.bo = ☃;
/*     */   }
/*     */   
/*     */   public int eQ() {
/* 181 */     return this.bo;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public aah eR() {
/* 186 */     if (this.bp == null) {
/* 187 */       return null;
/*     */     }
/* 189 */     bfw ☃ = this.l.b(this.bp);
/* 190 */     if (☃ instanceof aah) {
/* 191 */       return (aah)☃;
/*     */     }
/* 193 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean eS() {
/* 198 */     return (this.bo > 0);
/*     */   }
/*     */   
/*     */   public void eT() {
/* 202 */     this.bo = 0;
/*     */   }
/*     */   
/*     */   public boolean a(azz ☃) {
/* 206 */     if (☃ == this) {
/* 207 */       return false;
/*     */     }
/* 209 */     if (☃.getClass() != getClass()) {
/* 210 */       return false;
/*     */     }
/* 212 */     return (eS() && ☃.eS());
/*     */   }
/*     */   
/*     */   public void a(aag ☃, azz azz1) {
/* 216 */     apy apy1 = a(☃, azz1);
/* 217 */     if (apy1 == null) {
/*     */       return;
/*     */     }
/*     */     
/* 221 */     aah aah = eR();
/* 222 */     if (aah == null && azz1.eR() != null) {
/* 223 */       aah = azz1.eR();
/*     */     }
/*     */     
/* 226 */     if (aah != null) {
/* 227 */       aah.a(aea.O);
/*     */       
/* 229 */       ac.o.a(aah, this, azz1, apy1);
/*     */     } 
/*     */     
/* 232 */     c_(6000);
/* 233 */     azz1.c_(6000);
/* 234 */     eT();
/* 235 */     azz1.eT();
/* 236 */     apy1.a(true);
/* 237 */     apy1.b(cD(), cE(), cH(), 0.0F, 0.0F);
/* 238 */     ☃.l(apy1);
/*     */     
/* 240 */     ☃.a(this, (byte)18);
/*     */     
/* 242 */     if (☃.V().b(brt.e)) {
/* 243 */       ☃.c(new aqg(☃, cD(), cE(), cH(), cY().nextInt(7) + 1));
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(byte ☃) {
/* 249 */     if (☃ == 18) {
/* 250 */       for (int i = 0; i < 7; i++) {
/* 251 */         double d1 = this.J.nextGaussian() * 0.02D;
/* 252 */         double d2 = this.J.nextGaussian() * 0.02D;
/* 253 */         double d3 = this.J.nextGaussian() * 0.02D;
/* 254 */         this.l.a(hh.G, d(1.0D), cF() + 0.5D, g(1.0D), d1, d2, d3);
/*     */       } 
/*     */     } else {
/* 257 */       super.a(☃);
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\azz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */