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
/*     */ public class bjf
/*     */   implements aon
/*     */ {
/*     */   private final bqu a;
/*  16 */   private final gj<bmb> b = gj.a(3, bmb.b);
/*     */   @Nullable
/*     */   private bqv c;
/*     */   private int d;
/*     */   private int e;
/*     */   
/*     */   public bjf(bqu ☃) {
/*  23 */     this.a = ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public int Z_() {
/*  28 */     return this.b.size();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean c() {
/*  33 */     for (bmb ☃ : this.b) {
/*  34 */       if (!☃.a()) {
/*  35 */         return false;
/*     */       }
/*     */     } 
/*  38 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public bmb a(int ☃) {
/*  43 */     return this.b.get(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public bmb a(int ☃, int i) {
/*  48 */     bmb bmb1 = this.b.get(☃);
/*  49 */     if (☃ == 2 && !bmb1.a()) {
/*  50 */       return aoo.a(this.b, ☃, bmb1.E());
/*     */     }
/*     */     
/*  53 */     bmb bmb2 = aoo.a(this.b, ☃, i);
/*  54 */     if (!bmb2.a() && d(☃)) {
/*  55 */       f();
/*     */     }
/*  57 */     return bmb2;
/*     */   }
/*     */   
/*     */   private boolean d(int ☃) {
/*  61 */     return (☃ == 0 || ☃ == 1);
/*     */   }
/*     */ 
/*     */   
/*     */   public bmb b(int ☃) {
/*  66 */     return aoo.a(this.b, ☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(int ☃, bmb bmb1) {
/*  71 */     this.b.set(☃, bmb1);
/*  72 */     if (!bmb1.a() && bmb1.E() > V_()) {
/*  73 */       bmb1.e(V_());
/*     */     }
/*  75 */     if (d(☃)) {
/*  76 */       f();
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(bfw ☃) {
/*  82 */     return (this.a.eM() == ☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public void X_() {
/*  87 */     f();
/*     */   }
/*     */   public void f() {
/*     */     bmb ☃, bmb1;
/*  91 */     this.c = null;
/*     */ 
/*     */ 
/*     */     
/*  95 */     if (((bmb)this.b.get(0)).a()) {
/*  96 */       ☃ = this.b.get(1);
/*  97 */       bmb1 = bmb.b;
/*     */     } else {
/*  99 */       ☃ = this.b.get(0);
/* 100 */       bmb1 = this.b.get(1);
/*     */     } 
/*     */     
/* 103 */     if (☃.a()) {
/* 104 */       a(2, bmb.b);
/* 105 */       this.e = 0;
/*     */       
/*     */       return;
/*     */     } 
/* 109 */     bqw bqw = this.a.eO();
/* 110 */     if (!bqw.isEmpty()) {
/* 111 */       bqv bqv1 = bqw.a(☃, bmb1, this.d);
/* 112 */       if (bqv1 == null || bqv1.p()) {
/*     */         
/* 114 */         this.c = bqv1;
/* 115 */         bqv1 = bqw.a(bmb1, ☃, this.d);
/*     */       } 
/*     */       
/* 118 */       if (bqv1 != null && !bqv1.p()) {
/* 119 */         this.c = bqv1;
/* 120 */         a(2, bqv1.f());
/* 121 */         this.e = bqv1.o();
/*     */       } else {
/* 123 */         a(2, bmb.b);
/* 124 */         this.e = 0;
/*     */       } 
/*     */     } 
/* 127 */     this.a.k(a(2));
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public bqv g() {
/* 132 */     return this.c;
/*     */   }
/*     */   
/*     */   public void c(int ☃) {
/* 136 */     this.d = ☃;
/* 137 */     f();
/*     */   }
/*     */ 
/*     */   
/*     */   public void Y_() {
/* 142 */     this.b.clear();
/*     */   }
/*     */   
/*     */   public int h() {
/* 146 */     return this.e;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bjf.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */