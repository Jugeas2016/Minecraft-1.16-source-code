/*     */ import java.util.Objects;
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
/*     */ public class cxt
/*     */ {
/*     */   private final fx a;
/*     */   private final bkx b;
/*     */   @Nullable
/*     */   private final nr c;
/*     */   
/*     */   public cxt(fx ☃, bkx bkx1, @Nullable nr nr1) {
/*  22 */     this.a = ☃;
/*  23 */     this.b = bkx1;
/*  24 */     this.c = nr1;
/*     */   }
/*     */   
/*     */   public static cxt a(md ☃) {
/*  28 */     fx fx1 = mp.b(☃.p("Pos"));
/*  29 */     bkx bkx1 = bkx.a(☃.l("Color"), bkx.a);
/*  30 */     nr nr1 = ☃.e("Name") ? nr.a.a(☃.l("Name")) : null;
/*  31 */     return new cxt(fx1, bkx1, nr1);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public static cxt a(brc ☃, fx fx1) {
/*  36 */     ccj ccj = ☃.c(fx1);
/*  37 */     if (ccj instanceof cca) {
/*  38 */       cca cca = (cca)ccj;
/*  39 */       bkx bkx1 = cca.a(() -> ☃.d_(fx1));
/*  40 */       nr nr1 = cca.S() ? cca.T() : null;
/*  41 */       return new cxt(fx1, bkx1, nr1);
/*     */     } 
/*  43 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public fx a() {
/*  48 */     return this.a;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public cxu.a c() {
/*  56 */     switch (null.a[this.b.ordinal()]) {
/*     */       case 1:
/*  58 */         return cxu.a.k;
/*     */       case 2:
/*  60 */         return cxu.a.l;
/*     */       case 3:
/*  62 */         return cxu.a.m;
/*     */       case 4:
/*  64 */         return cxu.a.n;
/*     */       case 5:
/*  66 */         return cxu.a.o;
/*     */       case 6:
/*  68 */         return cxu.a.p;
/*     */       case 7:
/*  70 */         return cxu.a.q;
/*     */       case 8:
/*  72 */         return cxu.a.r;
/*     */       case 9:
/*  74 */         return cxu.a.s;
/*     */       case 10:
/*  76 */         return cxu.a.t;
/*     */       case 11:
/*  78 */         return cxu.a.u;
/*     */       case 12:
/*  80 */         return cxu.a.v;
/*     */       case 13:
/*  82 */         return cxu.a.w;
/*     */       case 14:
/*  84 */         return cxu.a.x;
/*     */       case 15:
/*  86 */         return cxu.a.y;
/*     */     } 
/*     */     
/*  89 */     return cxu.a.z;
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public nr d() {
/*  95 */     return this.c;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean equals(Object ☃) {
/* 100 */     if (this == ☃) {
/* 101 */       return true;
/*     */     }
/* 103 */     if (☃ == null || getClass() != ☃.getClass()) {
/* 104 */       return false;
/*     */     }
/* 106 */     cxt cxt1 = (cxt)☃;
/* 107 */     return (Objects.equals(this.a, cxt1.a) && this.b == cxt1.b && Objects.equals(this.c, cxt1.c));
/*     */   }
/*     */ 
/*     */   
/*     */   public int hashCode() {
/* 112 */     return Objects.hash(new Object[] { this.a, this.b, this.c });
/*     */   }
/*     */   
/*     */   public md e() {
/* 116 */     md ☃ = new md();
/*     */     
/* 118 */     ☃.a("Pos", mp.a(this.a));
/* 119 */     ☃.a("Color", this.b.c());
/*     */     
/* 121 */     if (this.c != null) {
/* 122 */       ☃.a("Name", nr.a.a(this.c));
/*     */     }
/*     */     
/* 125 */     return ☃;
/*     */   }
/*     */   
/*     */   public String f() {
/* 129 */     return "banner-" + this.a.u() + "," + this.a.v() + "," + this.a.w();
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cxt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */