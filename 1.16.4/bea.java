/*     */ import java.util.EnumSet;
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
/*     */ public abstract class bea
/*     */   extends bcy
/*     */ {
/*  20 */   private static final us<Byte> bo = uv.a((Class)bea.class, uu.a);
/*     */   
/*     */   protected int b;
/*  23 */   private a bp = a.a;
/*     */   
/*     */   protected bea(aqe<? extends bea> ☃, brx brx1) {
/*  26 */     super((aqe)☃, brx1);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void e() {
/*  31 */     super.e();
/*     */     
/*  33 */     this.R.a(bo, Byte.valueOf((byte)0));
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(md ☃) {
/*  38 */     super.a(☃);
/*     */     
/*  40 */     this.b = ☃.h("SpellTicks");
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(md ☃) {
/*  45 */     super.b(☃);
/*     */     
/*  47 */     ☃.b("SpellTicks", this.b);
/*     */   }
/*     */ 
/*     */   
/*     */   public bcy.a m() {
/*  52 */     if (eW())
/*  53 */       return bcy.a.c; 
/*  54 */     if (fd()) {
/*  55 */       return bcy.a.g;
/*     */     }
/*  57 */     return bcy.a.a;
/*     */   }
/*     */   
/*     */   public boolean eW() {
/*  61 */     if (this.l.v) {
/*  62 */       return (((Byte)this.R.<Byte>a(bo)).byteValue() > 0);
/*     */     }
/*  64 */     return (this.b > 0);
/*     */   }
/*     */   
/*     */   public void a(a ☃) {
/*  68 */     this.bp = ☃;
/*  69 */     this.R.b(bo, Byte.valueOf((byte)a.a(☃)));
/*     */   }
/*     */   
/*     */   protected a eX() {
/*  73 */     if (!this.l.v) {
/*  74 */       return this.bp;
/*     */     }
/*  76 */     return a.a(((Byte)this.R.<Byte>a(bo)).byteValue());
/*     */   }
/*     */ 
/*     */   
/*     */   protected void N() {
/*  81 */     super.N();
/*     */     
/*  83 */     if (this.b > 0) {
/*  84 */       this.b--;
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void j() {
/*  90 */     super.j();
/*     */     
/*  92 */     if (this.l.v && eW()) {
/*  93 */       a ☃ = eX();
/*  94 */       double d1 = a.b(☃)[0];
/*  95 */       double d2 = a.b(☃)[1];
/*  96 */       double d3 = a.b(☃)[2];
/*     */ 
/*     */       
/*  99 */       float f1 = this.aA * 0.017453292F + afm.b(this.K * 0.6662F) * 0.25F;
/* 100 */       float f2 = afm.b(f1);
/* 101 */       float f3 = afm.a(f1);
/*     */       
/* 103 */       this.l.a(hh.u, cD() + f2 * 0.6D, cE() + 1.8D, cH() + f3 * 0.6D, d1, d2, d3);
/* 104 */       this.l.a(hh.u, cD() - f2 * 0.6D, cE() + 1.8D, cH() - f3 * 0.6D, d1, d2, d3);
/*     */     } 
/*     */   }
/*     */   
/*     */   protected int eY() {
/* 109 */     return this.b;
/*     */   }
/*     */   
/*     */   protected abstract adp eM();
/*     */   
/*     */   public class b extends avv {
/*     */     public b(bea ☃) {
/* 116 */       a(EnumSet.of(avv.a.a, avv.a.b));
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean a() {
/* 121 */       return (this.b.eY() > 0);
/*     */     }
/*     */ 
/*     */     
/*     */     public void c() {
/* 126 */       super.c();
/* 127 */       bea.a(this.b).o();
/*     */     }
/*     */ 
/*     */     
/*     */     public void d() {
/* 132 */       super.d();
/* 133 */       this.b.a(bea.a.a);
/*     */     }
/*     */ 
/*     */     
/*     */     public void e() {
/* 138 */       if (this.b.A() != null)
/* 139 */         this.b.t().a(this.b.A(), this.b.Q(), this.b.O()); 
/*     */     }
/*     */   }
/*     */   
/*     */   public abstract class c extends avv {
/*     */     protected int b;
/*     */     protected int c;
/*     */     
/*     */     protected c(bea ☃) {}
/*     */     
/*     */     public boolean a() {
/* 150 */       aqm ☃ = this.d.A();
/* 151 */       if (☃ == null || !☃.aX()) {
/* 152 */         return false;
/*     */       }
/* 154 */       if (this.d.eW())
/*     */       {
/* 156 */         return false;
/*     */       }
/* 158 */       if (this.d.K < this.c) {
/* 159 */         return false;
/*     */       }
/* 161 */       return true;
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean b() {
/* 166 */       aqm ☃ = this.d.A();
/* 167 */       return (☃ != null && ☃.aX() && this.b > 0);
/*     */     }
/*     */ 
/*     */     
/*     */     public void c() {
/* 172 */       this.b = m();
/* 173 */       this.d.b = g();
/* 174 */       this.c = this.d.K + h();
/* 175 */       adp ☃ = k();
/* 176 */       if (☃ != null) {
/* 177 */         this.d.a(☃, 1.0F, 1.0F);
/*     */       }
/* 179 */       this.d.a(l());
/*     */     }
/*     */ 
/*     */     
/*     */     public void e() {
/* 184 */       this.b--;
/* 185 */       if (this.b == 0) {
/* 186 */         j();
/* 187 */         this.d.a(this.d.eM(), 1.0F, 1.0F);
/*     */       } 
/*     */     }
/*     */     
/*     */     protected abstract void j();
/*     */     
/*     */     protected int m() {
/* 194 */       return 20;
/*     */     }
/*     */     
/*     */     protected abstract int g();
/*     */     
/*     */     protected abstract int h();
/*     */     
/*     */     @Nullable
/*     */     protected abstract adp k();
/*     */     
/*     */     protected abstract bea.a l();
/*     */   }
/*     */   
/*     */   public enum a {
/* 208 */     a(0, 0.0D, 0.0D, 0.0D),
/* 209 */     b(1, 0.7D, 0.7D, 0.8D),
/* 210 */     c(2, 0.4D, 0.3D, 0.35D),
/* 211 */     d(3, 0.7D, 0.5D, 0.2D),
/* 212 */     e(4, 0.3D, 0.3D, 0.8D),
/* 213 */     f(5, 0.1D, 0.1D, 0.2D);
/*     */     
/*     */     private final int g;
/*     */     
/*     */     private final double[] h;
/*     */     
/*     */     a(int ☃, double d1, double d2, double d3) {
/* 220 */       this.g = ☃;
/* 221 */       this.h = new double[] { d1, d2, d3 };
/*     */     }
/*     */     
/*     */     public static a a(int ☃) {
/* 225 */       for (a a1 : values()) {
/* 226 */         if (☃ == a1.g) {
/* 227 */           return a1;
/*     */         }
/*     */       } 
/* 230 */       return a;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bea.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */