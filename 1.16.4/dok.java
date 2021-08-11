/*     */ import com.google.common.collect.ImmutableList;
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
/*     */ public class dok
/*     */   extends dot
/*     */ {
/*  24 */   private static final dkc[] a = new dkc[] { dkc.i };
/*     */   
/*     */   private final dot b;
/*     */   private final dkd c;
/*     */   private dlj p;
/*     */   private dlt q;
/*     */   private aor r;
/*     */   
/*     */   public dok(dot ☃, dkd dkd1) {
/*  33 */     super(new of("options.title"));
/*  34 */     this.b = ☃;
/*  35 */     this.c = dkd1;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void b() {
/*  40 */     int ☃ = 0;
/*  41 */     for (dkc dkc1 : a) {
/*  42 */       int i = this.k / 2 - 155 + ☃ % 2 * 160;
/*  43 */       int j = this.l / 6 - 12 + 24 * (☃ >> 1);
/*     */       
/*  45 */       a(dkc1.a(this.i.k, i, j, 150));
/*     */       
/*  47 */       ☃++;
/*     */     } 
/*     */     
/*  50 */     if (this.i.r != null) {
/*  51 */       this.r = this.i.r.ad();
/*  52 */       this.p = a(new dlj(this.k / 2 - 155 + ☃ % 2 * 160, this.l / 6 - 12 + 24 * (☃ >> 1), 150, 20, a(this.r), ☃ -> {
/*     */               this.r = aor.a(this.r.a() + 1);
/*     */               
/*     */               this.i.w().a(new sd(this.r));
/*     */               this.p.a(a(this.r));
/*     */             }));
/*  58 */       if (this.i.G() && !this.i.r.w().n()) {
/*  59 */         this.p.b(this.p.h() - 20);
/*  60 */         this.q = a(new dlt(this.p.l + this.p.h(), this.p.m, ☃ -> this.i.a(new dns(this::c, new of("difficulty.lock.title"), new of("difficulty.lock.question", new Object[] { new of("options.difficulty." + this.i.r.w().s().c()) })))));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/*  68 */         this.q.e(this.i.r.w().t());
/*  69 */         this.q.o = !this.q.a();
/*  70 */         this.p.o = !this.q.a();
/*     */       } else {
/*  72 */         this.p.o = false;
/*     */       } 
/*     */     } else {
/*  75 */       a(new dlw(this.k / 2 - 155 + ☃ % 2 * 160, this.l / 6 - 12 + 24 * (☃ >> 1), 150, 20, dkc.P, dkc.P.c(this.c), ☃ -> {
/*     */               dkc.P.a(this.c);
/*     */               
/*     */               this.c.b();
/*     */               ☃.a(dkc.P.c(this.c));
/*     */             }));
/*     */     } 
/*  82 */     a(new dlj(this.k / 2 - 155, this.l / 6 + 48 - 6, 150, 20, new of("options.skinCustomisation"), ☃ -> this.i.a(new dow(this, this.c))));
/*  83 */     a(new dlj(this.k / 2 + 5, this.l / 6 + 48 - 6, 150, 20, new of("options.sounds"), ☃ -> this.i.a(new dox(this, this.c))));
/*     */     
/*  85 */     a(new dlj(this.k / 2 - 155, this.l / 6 + 72 - 6, 150, 20, new of("options.video"), ☃ -> this.i.a(new doz(this, this.c))));
/*  86 */     a(new dlj(this.k / 2 + 5, this.l / 6 + 72 - 6, 150, 20, new of("options.controls"), ☃ -> this.i.a(new dpl(this, this.c))));
/*     */     
/*  88 */     a(new dlj(this.k / 2 - 155, this.l / 6 + 96 - 6, 150, 20, new of("options.language"), ☃ -> this.i.a(new dof(this, this.c, this.i.R()))));
/*  89 */     a(new dlj(this.k / 2 + 5, this.l / 6 + 96 - 6, 150, 20, new of("options.chat.title"), ☃ -> this.i.a(new dnp(this, this.c))));
/*     */     
/*  91 */     a(new dlj(this.k / 2 - 155, this.l / 6 + 120 - 6, 150, 20, new of("options.resourcepack"), ☃ -> this.i.a(new dri(this, this.i.O(), this::a, this.i.Q(), new of("resourcePack.title")))));
/*  92 */     a(new dlj(this.k / 2 + 5, this.l / 6 + 120 - 6, 150, 20, new of("options.accessibility.title"), ☃ -> this.i.a(new dnm(this, this.c))));
/*     */     
/*  94 */     a(new dlj(this.k / 2 - 100, this.l / 6 + 168, 200, 20, nq.c, ☃ -> this.i.a(this.b)));
/*     */   }
/*     */   
/*     */   private void a(abw ☃) {
/*  98 */     ImmutableList immutableList1 = ImmutableList.copyOf(this.c.h);
/*  99 */     this.c.h.clear();
/* 100 */     this.c.i.clear();
/*     */     
/* 102 */     for (abu abu : ☃.e()) {
/* 103 */       if (!abu.g()) {
/* 104 */         this.c.h.add(abu.e());
/* 105 */         if (!abu.c().a()) {
/* 106 */           this.c.i.add(abu.e());
/*     */         }
/*     */       } 
/*     */     } 
/*     */     
/* 111 */     this.c.b();
/*     */     
/* 113 */     ImmutableList immutableList2 = ImmutableList.copyOf(this.c.h);
/* 114 */     if (!immutableList2.equals(immutableList1)) {
/* 115 */       this.i.j();
/*     */     }
/*     */   }
/*     */   
/*     */   private nr a(aor ☃) {
/* 120 */     return (new of("options.difficulty")).c(": ").a(☃.b());
/*     */   }
/*     */   
/*     */   private void c(boolean ☃) {
/* 124 */     this.i.a(this);
/* 125 */     if (☃ && this.i.r != null) {
/* 126 */       this.i.w().a(new ss(true));
/* 127 */       this.q.e(true);
/* 128 */       this.q.o = false;
/* 129 */       this.p.o = false;
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void e() {
/* 135 */     this.c.b();
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(dfm ☃, int i, int j, float f) {
/* 140 */     a(☃);
/* 141 */     a(☃, this.o, this.d, this.k / 2, 15, 16777215);
/* 142 */     super.a(☃, i, j, f);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dok.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */