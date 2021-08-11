/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class dpy
/*     */   extends dpo
/*     */ {
/*     */   private final cco s;
/*     */   private dlj t;
/*     */   private dlj u;
/*     */   private dlj v;
/*  16 */   private cco.a w = cco.a.c;
/*     */   private boolean x;
/*     */   private boolean y;
/*     */   
/*     */   public dpy(cco ☃) {
/*  21 */     this.s = ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   bqy h() {
/*  26 */     return this.s.d();
/*     */   }
/*     */ 
/*     */   
/*     */   int i() {
/*  31 */     return 135;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void b() {
/*  36 */     super.b();
/*  37 */     this.t = a(new dlj(this.k / 2 - 50 - 100 - 4, 165, 100, 20, new of("advMode.mode.sequence"), ☃ -> {
/*     */             o();
/*     */             n();
/*     */           }));
/*  41 */     this.u = a(new dlj(this.k / 2 - 50, 165, 100, 20, new of("advMode.mode.unconditional"), ☃ -> {
/*     */             this.x = !this.x;
/*     */             p();
/*     */           }));
/*  45 */     this.v = a(new dlj(this.k / 2 + 50 + 4, 165, 100, 20, new of("advMode.mode.redstoneTriggered"), ☃ -> {
/*     */             this.y = !this.y;
/*     */             
/*     */             q();
/*     */           }));
/*  50 */     this.c.o = false;
/*  51 */     this.q.o = false;
/*  52 */     this.t.o = false;
/*  53 */     this.u.o = false;
/*  54 */     this.v.o = false;
/*     */   }
/*     */   
/*     */   public void m() {
/*  58 */     bqy ☃ = this.s.d();
/*  59 */     this.a.a(☃.k());
/*  60 */     this.r = ☃.m();
/*  61 */     this.w = this.s.m();
/*  62 */     this.x = this.s.x();
/*  63 */     this.y = this.s.g();
/*     */     
/*  65 */     k();
/*  66 */     n();
/*  67 */     p();
/*  68 */     q();
/*     */     
/*  70 */     this.c.o = true;
/*  71 */     this.q.o = true;
/*  72 */     this.t.o = true;
/*  73 */     this.u.o = true;
/*  74 */     this.v.o = true;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(djz ☃, int i, int j) {
/*  79 */     super.a(☃, i, j);
/*     */     
/*  81 */     k();
/*  82 */     n();
/*  83 */     p();
/*  84 */     q();
/*     */     
/*  86 */     this.c.o = true;
/*  87 */     this.q.o = true;
/*  88 */     this.t.o = true;
/*  89 */     this.u.o = true;
/*  90 */     this.v.o = true;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(bqy ☃) {
/*  95 */     this.i.w().a(new tk(new fx(☃.f()), this.a.b(), this.w, ☃.m(), this.x, this.y));
/*     */   }
/*     */   
/*     */   private void n() {
/*  99 */     switch (null.a[this.w.ordinal()]) {
/*     */       case 1:
/* 101 */         this.t.a(new of("advMode.mode.sequence"));
/*     */         break;
/*     */       case 2:
/* 104 */         this.t.a(new of("advMode.mode.auto"));
/*     */         break;
/*     */       case 3:
/* 107 */         this.t.a(new of("advMode.mode.redstone"));
/*     */         break;
/*     */     } 
/*     */   }
/*     */   
/*     */   private void o() {
/* 113 */     switch (null.a[this.w.ordinal()]) {
/*     */       case 1:
/* 115 */         this.w = cco.a.b;
/*     */         break;
/*     */       case 2:
/* 118 */         this.w = cco.a.c;
/*     */         break;
/*     */       case 3:
/* 121 */         this.w = cco.a.a;
/*     */         break;
/*     */     } 
/*     */   }
/*     */   
/*     */   private void p() {
/* 127 */     if (this.x) {
/* 128 */       this.u.a(new of("advMode.mode.conditional"));
/*     */     } else {
/* 130 */       this.u.a(new of("advMode.mode.unconditional"));
/*     */     } 
/*     */   }
/*     */   
/*     */   private void q() {
/* 135 */     if (this.y) {
/* 136 */       this.v.a(new of("advMode.mode.autoexec.bat"));
/*     */     } else {
/* 138 */       this.v.a(new of("advMode.mode.redstoneTriggered"));
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dpy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */