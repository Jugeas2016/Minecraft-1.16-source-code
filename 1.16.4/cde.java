/*     */ import java.util.List;
/*     */ import java.util.stream.IntStream;
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
/*     */ public class cde
/*     */   extends cdd
/*     */   implements ape, cdm
/*     */ {
/*  44 */   private static final int[] a = IntStream.range(0, 27).toArray();
/*     */   
/*  46 */   private gj<bmb> b = gj.a(27, bmb.b);
/*     */   private int c;
/*  48 */   private a i = a.a;
/*     */   private float j;
/*     */   private float k;
/*     */   @Nullable
/*     */   private bkx l;
/*     */   private boolean m;
/*     */   
/*     */   public cde(@Nullable bkx ☃) {
/*  56 */     super(cck.w);
/*  57 */     this.l = ☃;
/*     */   }
/*     */   
/*     */   public cde() {
/*  61 */     this((bkx)null);
/*  62 */     this.m = true;
/*     */   }
/*     */   
/*     */   public enum a {
/*  66 */     a,
/*  67 */     b,
/*  68 */     c,
/*  69 */     d;
/*     */   }
/*     */ 
/*     */   
/*     */   public void aj_() {
/*  74 */     h();
/*  75 */     if (this.i == a.b || this.i == a.d) {
/*  76 */       m();
/*     */     }
/*     */   }
/*     */   
/*     */   protected void h() {
/*  81 */     this.k = this.j;
/*  82 */     switch (null.a[this.i.ordinal()]) {
/*     */       case 1:
/*  84 */         this.j = 0.0F;
/*     */         break;
/*     */       case 2:
/*  87 */         this.j += 0.1F;
/*  88 */         if (this.j >= 1.0F) {
/*  89 */           m();
/*  90 */           this.i = a.c;
/*  91 */           this.j = 1.0F;
/*  92 */           x();
/*     */         } 
/*     */         break;
/*     */       case 3:
/*  96 */         this.j -= 0.1F;
/*  97 */         if (this.j <= 0.0F) {
/*  98 */           this.i = a.a;
/*  99 */           this.j = 0.0F;
/* 100 */           x();
/*     */         } 
/*     */         break;
/*     */       case 4:
/* 104 */         this.j = 1.0F;
/*     */         break;
/*     */     } 
/*     */   }
/*     */   
/*     */   public a j() {
/* 110 */     return this.i;
/*     */   }
/*     */   
/*     */   public dci a(ceh ☃) {
/* 114 */     return b((gc)☃.c(bzs.a));
/*     */   }
/*     */   
/*     */   public dci b(gc ☃) {
/* 118 */     float f = a(1.0F);
/* 119 */     return dde.b().a().b((0.5F * f * ☃
/* 120 */         .i()), (0.5F * f * ☃
/* 121 */         .j()), (0.5F * f * ☃
/* 122 */         .k()));
/*     */   }
/*     */ 
/*     */   
/*     */   private dci c(gc ☃) {
/* 127 */     gc gc1 = ☃.f();
/* 128 */     return b(☃).a(gc1
/* 129 */         .i(), gc1
/* 130 */         .j(), gc1
/* 131 */         .k());
/*     */   }
/*     */ 
/*     */   
/*     */   private void m() {
/* 136 */     ceh ☃ = this.d.d_(o());
/* 137 */     if (!(☃.b() instanceof bzs)) {
/*     */       return;
/*     */     }
/*     */     
/* 141 */     gc gc = (gc)☃.c(bzs.a);
/* 142 */     dci dci = c(gc).a(this.e);
/*     */     
/* 144 */     List<aqa> list = this.d.a((aqa)null, dci);
/* 145 */     if (list.isEmpty()) {
/*     */       return;
/*     */     }
/*     */     
/* 149 */     for (int i = 0; i < list.size(); i++) {
/* 150 */       aqa aqa = list.get(i);
/* 151 */       if (aqa.y_() != cvc.d) {
/*     */ 
/*     */ 
/*     */         
/* 155 */         double d1 = 0.0D;
/* 156 */         double d2 = 0.0D;
/* 157 */         double d3 = 0.0D;
/* 158 */         dci dci1 = aqa.cc();
/*     */         
/* 160 */         switch (null.b[gc.n().ordinal()]) {
/*     */           case 1:
/* 162 */             if (gc.e() == gc.b.a) {
/* 163 */               d1 = dci.d - dci1.a;
/*     */             } else {
/* 165 */               d1 = dci1.d - dci.a;
/*     */             } 
/* 167 */             d1 += 0.01D;
/*     */             break;
/*     */           case 2:
/* 170 */             if (gc.e() == gc.b.a) {
/* 171 */               d2 = dci.e - dci1.b;
/*     */             } else {
/* 173 */               d2 = dci1.e - dci.b;
/*     */             } 
/* 175 */             d2 += 0.01D;
/*     */             break;
/*     */           case 3:
/* 178 */             if (gc.e() == gc.b.a) {
/* 179 */               d3 = dci.f - dci1.c;
/*     */             } else {
/* 181 */               d3 = dci1.f - dci.c;
/*     */             } 
/* 183 */             d3 += 0.01D;
/*     */             break;
/*     */         } 
/*     */         
/* 187 */         aqa.a(aqr.d, new dcn(d1 * gc.i(), d2 * gc.j(), d3 * gc.k()));
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public int Z_() {
/* 193 */     return this.b.size();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a_(int ☃, int i) {
/* 198 */     if (☃ == 1) {
/* 199 */       this.c = i;
/* 200 */       if (i == 0) {
/* 201 */         this.i = a.d;
/* 202 */         x();
/*     */       } 
/* 204 */       if (i == 1) {
/* 205 */         this.i = a.b;
/* 206 */         x();
/*     */       } 
/* 208 */       return true;
/*     */     } 
/*     */     
/* 211 */     return super.a_(☃, i);
/*     */   }
/*     */   
/*     */   private void x() {
/* 215 */     p().a(v(), o(), 3);
/*     */   }
/*     */ 
/*     */   
/*     */   public void c_(bfw ☃) {
/* 220 */     if (!☃.a_()) {
/* 221 */       if (this.c < 0) {
/* 222 */         this.c = 0;
/*     */       }
/* 224 */       this.c++;
/* 225 */       this.d.a(this.e, p().b(), 1, this.c);
/* 226 */       if (this.c == 1) {
/* 227 */         this.d.a((bfw)null, this.e, adq.ne, adr.e, 0.5F, this.d.t.nextFloat() * 0.1F + 0.9F);
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void b_(bfw ☃) {
/* 234 */     if (!☃.a_()) {
/* 235 */       this.c--;
/* 236 */       this.d.a(this.e, p().b(), 1, this.c);
/* 237 */       if (this.c <= 0) {
/* 238 */         this.d.a((bfw)null, this.e, adq.nd, adr.e, 0.5F, this.d.t.nextFloat() * 0.1F + 0.9F);
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   protected nr g() {
/* 245 */     return new of("container.shulkerBox");
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(ceh ☃, md md1) {
/* 250 */     super.a(☃, md1);
/* 251 */     d(md1);
/*     */   }
/*     */ 
/*     */   
/*     */   public md a(md ☃) {
/* 256 */     super.a(☃);
/* 257 */     return e(☃);
/*     */   }
/*     */   
/*     */   public void d(md ☃) {
/* 261 */     this.b = gj.a(Z_(), bmb.b);
/* 262 */     if (!b(☃) && 
/* 263 */       ☃.c("Items", 9)) {
/* 264 */       aoo.b(☃, this.b);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public md e(md ☃) {
/* 270 */     if (!c(☃)) {
/* 271 */       aoo.a(☃, this.b, false);
/*     */     }
/* 273 */     return ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   protected gj<bmb> f() {
/* 278 */     return this.b;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(gj<bmb> ☃) {
/* 283 */     this.b = ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public int[] a(gc ☃) {
/* 288 */     return a;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(int ☃, bmb bmb1, @Nullable gc gc1) {
/* 293 */     return !(buo.a(bmb1.b()) instanceof bzs);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean b(int ☃, bmb bmb1, gc gc1) {
/* 298 */     return true;
/*     */   }
/*     */   
/*     */   public float a(float ☃) {
/* 302 */     return afm.g(☃, this.k, this.j);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public bkx k() {
/* 307 */     if (this.m) {
/* 308 */       this.l = bzs.c(p().b());
/* 309 */       this.m = false;
/*     */     } 
/* 311 */     return this.l;
/*     */   }
/*     */ 
/*     */   
/*     */   protected bic a(int ☃, bfv bfv1) {
/* 316 */     return new bjo(☃, bfv1, this);
/*     */   }
/*     */   
/*     */   public boolean l() {
/* 320 */     return (this.i == a.a);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cde.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */