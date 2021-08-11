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
/*     */ public class beb
/*     */   extends bdq
/*     */ {
/*  47 */   private static final us<Byte> b = uv.a((Class)beb.class, uu.a);
/*     */   
/*     */   public beb(aqe<? extends beb> ☃, brx brx1) {
/*  50 */     super((aqe)☃, brx1);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void o() {
/*  55 */     this.bk.a(1, new avp(this));
/*     */     
/*  57 */     this.bk.a(3, new awb(this, 0.4F));
/*  58 */     this.bk.a(4, new a(this));
/*     */     
/*  60 */     this.bk.a(5, new axk(this, 0.8D));
/*  61 */     this.bk.a(6, new awd(this, (Class)bfw.class, 8.0F));
/*  62 */     this.bk.a(6, new aws(this));
/*     */     
/*  64 */     this.bl.a(1, new axp(this, new Class[0]));
/*  65 */     this.bl.a(2, new c<>(this, bfw.class));
/*  66 */     this.bl.a(3, new c<>(this, bai.class));
/*     */   }
/*     */ 
/*     */   
/*     */   public double bc() {
/*  71 */     return (cz() * 0.5F);
/*     */   }
/*     */ 
/*     */   
/*     */   protected ayj b(brx ☃) {
/*  76 */     return new ayk(this, ☃);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void e() {
/*  81 */     super.e();
/*     */     
/*  83 */     this.R.a(b, Byte.valueOf((byte)0));
/*     */   }
/*     */ 
/*     */   
/*     */   public void j() {
/*  88 */     super.j();
/*     */     
/*  90 */     if (!this.l.v)
/*     */     {
/*     */       
/*  93 */       t(this.u);
/*     */     }
/*     */   }
/*     */   
/*     */   public static ark.a eK() {
/*  98 */     return bdq.eR()
/*  99 */       .a(arl.a, 16.0D)
/* 100 */       .a(arl.d, 0.30000001192092896D);
/*     */   }
/*     */ 
/*     */   
/*     */   protected adp I() {
/* 105 */     return adq.oA;
/*     */   }
/*     */ 
/*     */   
/*     */   protected adp e(apk ☃) {
/* 110 */     return adq.oC;
/*     */   }
/*     */ 
/*     */   
/*     */   protected adp dq() {
/* 115 */     return adq.oB;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void b(fx ☃, ceh ceh1) {
/* 120 */     a(adq.oD, 0.15F, 1.0F);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean c_() {
/* 129 */     return eL();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(ceh ☃, dcn dcn1) {
/* 135 */     if (!☃.a(bup.aQ)) {
/* 136 */       super.a(☃, dcn1);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public aqq dC() {
/* 142 */     return aqq.c;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean d(apu ☃) {
/* 147 */     if (☃.a() == apw.s) {
/* 148 */       return false;
/*     */     }
/* 150 */     return super.d(☃);
/*     */   }
/*     */   
/*     */   public boolean eL() {
/* 154 */     return ((((Byte)this.R.<Byte>a(b)).byteValue() & 0x1) != 0);
/*     */   }
/*     */   
/*     */   public void t(boolean ☃) {
/* 158 */     byte b = ((Byte)this.R.<Byte>a(b)).byteValue();
/* 159 */     if (☃) {
/* 160 */       b = (byte)(b | 0x1);
/*     */     } else {
/* 162 */       b = (byte)(b & 0xFFFFFFFE);
/*     */     } 
/* 164 */     this.R.b(b, Byte.valueOf(b));
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public arc a(bsk ☃, aos aos1, aqp aqp1, @Nullable arc arc1, @Nullable md md1) {
/* 170 */     arc1 = super.a(☃, aos1, aqp1, arc1, md1);
/*     */     
/* 172 */     if (☃.u_().nextInt(100) == 0) {
/* 173 */       bdy bdy = aqe.av.a(this.l);
/* 174 */       bdy.b(cD(), cE(), cH(), this.p, 0.0F);
/* 175 */       bdy.a(☃, aos1, aqp1, (arc)null, (md)null);
/* 176 */       bdy.m(this);
/*     */     } 
/*     */     
/* 179 */     if (arc1 == null) {
/* 180 */       arc1 = new b();
/*     */       
/* 182 */       if (☃.ad() == aor.d && ☃.u_().nextFloat() < 0.1F * aos1.d()) {
/* 183 */         ((b)arc1).a(☃.u_());
/*     */       }
/*     */     } 
/* 186 */     if (arc1 instanceof b) {
/* 187 */       aps aps = ((b)arc1).a;
/* 188 */       if (aps != null) {
/* 189 */         c(new apu(aps, 2147483647));
/*     */       }
/*     */     } 
/*     */     
/* 193 */     return arc1;
/*     */   }
/*     */ 
/*     */   
/*     */   protected float b(aqx ☃, aqb aqb1) {
/* 198 */     return 0.65F;
/*     */   }
/*     */   
/*     */   public static class b
/*     */     implements arc
/*     */   {
/*     */     public aps a;
/*     */     
/*     */     public void a(Random ☃) {
/* 207 */       int i = ☃.nextInt(5);
/* 208 */       if (i <= 1) {
/* 209 */         this.a = apw.a;
/* 210 */       } else if (i <= 2) {
/* 211 */         this.a = apw.e;
/* 212 */       } else if (i <= 3) {
/* 213 */         this.a = apw.j;
/* 214 */       } else if (i <= 4) {
/* 215 */         this.a = apw.n;
/*     */       } 
/*     */     }
/*     */   }
/*     */   
/*     */   static class a extends awf {
/*     */     public a(beb ☃) {
/* 222 */       super(☃, 1.0D, true);
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean a() {
/* 227 */       return (super.a() && !this.a.bs());
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean b() {
/* 232 */       float ☃ = this.a.aR();
/* 233 */       if (☃ >= 0.5F && this.a.cY().nextInt(100) == 0) {
/* 234 */         this.a.h((aqm)null);
/* 235 */         return false;
/*     */       } 
/* 237 */       return super.b();
/*     */     }
/*     */ 
/*     */     
/*     */     protected double a(aqm ☃) {
/* 242 */       return (4.0F + ☃.cy());
/*     */     }
/*     */   }
/*     */   
/*     */   static class c<T extends aqm> extends axq<T> {
/*     */     public c(beb ☃, Class<T> clazz) {
/* 248 */       super(☃, clazz, true);
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean a() {
/* 253 */       float ☃ = this.e.aR();
/* 254 */       if (☃ >= 0.5F) {
/* 255 */         return false;
/*     */       }
/*     */       
/* 258 */       return super.a();
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\beb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */