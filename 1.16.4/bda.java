/*     */ import java.util.EnumSet;
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
/*     */ public class bda
/*     */   extends bdq
/*     */ {
/*  33 */   private float b = 0.5F;
/*     */   
/*     */   private int c;
/*  36 */   private static final us<Byte> d = uv.a((Class)bda.class, uu.a);
/*     */   
/*     */   public bda(aqe<? extends bda> ☃, brx brx1) {
/*  39 */     super((aqe)☃, brx1);
/*     */     
/*  41 */     a(cwz.h, -1.0F);
/*  42 */     a(cwz.g, 8.0F);
/*  43 */     a(cwz.l, 0.0F);
/*  44 */     a(cwz.m, 0.0F);
/*  45 */     this.f = 10;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void o() {
/*  50 */     this.bk.a(4, new a(this));
/*  51 */     this.bk.a(5, new awk(this, 1.0D));
/*  52 */     this.bk.a(7, new axk(this, 1.0D, 0.0F));
/*  53 */     this.bk.a(8, new awd(this, (Class)bfw.class, 8.0F));
/*  54 */     this.bk.a(8, new aws(this));
/*     */     
/*  56 */     this.bl.a(1, (new axp(this, new Class[0])).a(new Class[0]));
/*  57 */     this.bl.a(2, new axq<>(this, bfw.class, true));
/*     */   }
/*     */   
/*     */   public static ark.a m() {
/*  61 */     return bdq.eR()
/*  62 */       .a(arl.f, 6.0D)
/*  63 */       .a(arl.d, 0.23000000417232513D)
/*  64 */       .a(arl.b, 48.0D);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void e() {
/*  69 */     super.e();
/*     */     
/*  71 */     this.R.a(d, Byte.valueOf((byte)0));
/*     */   }
/*     */ 
/*     */   
/*     */   protected adp I() {
/*  76 */     return adq.aL;
/*     */   }
/*     */ 
/*     */   
/*     */   protected adp e(apk ☃) {
/*  81 */     return adq.aO;
/*     */   }
/*     */ 
/*     */   
/*     */   protected adp dq() {
/*  86 */     return adq.aN;
/*     */   }
/*     */ 
/*     */   
/*     */   public float aR() {
/*  91 */     return 1.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void k() {
/*  97 */     if (!this.t && (cC()).c < 0.0D) {
/*  98 */       f(cC().d(1.0D, 0.6D, 1.0D));
/*     */     }
/*     */     
/* 101 */     if (this.l.v) {
/* 102 */       if (this.J.nextInt(24) == 0 && !aA()) {
/* 103 */         this.l.a(cD() + 0.5D, cE() + 0.5D, cH() + 0.5D, adq.aM, cu(), 1.0F + this.J.nextFloat(), this.J.nextFloat() * 0.7F + 0.3F, false);
/*     */       }
/* 105 */       for (int ☃ = 0; ☃ < 2; ☃++) {
/* 106 */         this.l.a(hh.L, d(0.5D), cF(), g(0.5D), 0.0D, 0.0D, 0.0D);
/*     */       }
/*     */     } 
/*     */     
/* 110 */     super.k();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean dO() {
/* 115 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void N() {
/* 120 */     this.c--;
/* 121 */     if (this.c <= 0) {
/* 122 */       this.c = 100;
/* 123 */       this.b = 0.5F + (float)this.J.nextGaussian() * 3.0F;
/*     */     } 
/*     */     
/* 126 */     aqm ☃ = A();
/* 127 */     if (☃ != null && ☃.cG() > cG() + this.b && c(☃)) {
/* 128 */       dcn dcn = cC();
/* 129 */       f(cC().b(0.0D, (0.30000001192092896D - dcn.c) * 0.30000001192092896D, 0.0D));
/* 130 */       this.Z = true;
/*     */     } 
/*     */     
/* 133 */     super.N();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean b(float ☃, float f1) {
/* 138 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean bq() {
/* 143 */     return eK();
/*     */   }
/*     */   
/*     */   private boolean eK() {
/* 147 */     return ((((Byte)this.R.<Byte>a(d)).byteValue() & 0x1) != 0);
/*     */   }
/*     */   
/*     */   private void t(boolean ☃) {
/* 151 */     byte b = ((Byte)this.R.<Byte>a(d)).byteValue();
/* 152 */     if (☃) {
/* 153 */       b = (byte)(b | 0x1);
/*     */     } else {
/* 155 */       b = (byte)(b & 0xFFFFFFFE);
/*     */     } 
/* 157 */     this.R.b(d, Byte.valueOf(b));
/*     */   }
/*     */   
/*     */   static class a extends avv {
/*     */     private final bda a;
/*     */     private int b;
/*     */     private int c;
/*     */     private int d;
/*     */     
/*     */     public a(bda ☃) {
/* 167 */       this.a = ☃;
/*     */       
/* 169 */       a(EnumSet.of(avv.a.a, avv.a.b));
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean a() {
/* 174 */       aqm ☃ = this.a.A();
/* 175 */       return (☃ != null && ☃.aX() && this.a.c(☃));
/*     */     }
/*     */ 
/*     */     
/*     */     public void c() {
/* 180 */       this.b = 0;
/*     */     }
/*     */ 
/*     */     
/*     */     public void d() {
/* 185 */       bda.a(this.a, false);
/* 186 */       this.d = 0;
/*     */     }
/*     */ 
/*     */     
/*     */     public void e() {
/* 191 */       this.c--;
/*     */       
/* 193 */       aqm ☃ = this.a.A();
/*     */       
/* 195 */       if (☃ == null) {
/*     */         return;
/*     */       }
/*     */       
/* 199 */       boolean bool = this.a.z().a(☃);
/*     */       
/* 201 */       if (bool) {
/* 202 */         this.d = 0;
/*     */       } else {
/* 204 */         this.d++;
/*     */       } 
/*     */       
/* 207 */       double d = this.a.h(☃);
/*     */       
/* 209 */       if (d < 4.0D) {
/* 210 */         if (!bool) {
/*     */           return;
/*     */         }
/*     */         
/* 214 */         if (this.c <= 0) {
/* 215 */           this.c = 20;
/* 216 */           this.a.B(☃);
/*     */         } 
/* 218 */         this.a.u().a(☃.cD(), ☃.cE(), ☃.cH(), 1.0D);
/* 219 */       } else if (d < g() * g() && bool) {
/* 220 */         double d1 = ☃.cD() - this.a.cD();
/* 221 */         double d2 = ☃.e(0.5D) - this.a.e(0.5D);
/* 222 */         double d3 = ☃.cH() - this.a.cH();
/*     */         
/* 224 */         if (this.c <= 0) {
/* 225 */           this.b++;
/* 226 */           if (this.b == 1) {
/* 227 */             this.c = 60;
/* 228 */             bda.a(this.a, true);
/* 229 */           } else if (this.b <= 4) {
/* 230 */             this.c = 6;
/*     */           } else {
/* 232 */             this.c = 100;
/* 233 */             this.b = 0;
/* 234 */             bda.a(this.a, false);
/*     */           } 
/*     */           
/* 237 */           if (this.b > 1) {
/* 238 */             float f = afm.c(afm.a(d)) * 0.5F;
/*     */             
/* 240 */             if (!this.a.aA()) {
/* 241 */               this.a.l.a((bfw)null, 1018, this.a.cB(), 0);
/*     */             }
/* 243 */             for (int i = 0; i < 1; i++) {
/* 244 */               bgp bgp = new bgp(this.a.l, this.a, d1 + this.a.cY().nextGaussian() * f, d2, d3 + this.a.cY().nextGaussian() * f);
/* 245 */               bgp.d(bgp.cD(), this.a.e(0.5D) + 0.5D, bgp.cH());
/* 246 */               this.a.l.c(bgp);
/*     */             } 
/*     */           } 
/*     */         } 
/* 250 */         this.a.t().a(☃, 10.0F, 10.0F);
/*     */       }
/* 252 */       else if (this.d < 5) {
/* 253 */         this.a.u().a(☃.cD(), ☃.cE(), ☃.cH(), 1.0D);
/*     */       } 
/*     */ 
/*     */       
/* 257 */       super.e();
/*     */     }
/*     */     
/*     */     private double g() {
/* 261 */       return this.a.b(arl.b);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bda.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */