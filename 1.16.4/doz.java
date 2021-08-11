/*     */ import com.google.common.collect.ImmutableList;
/*     */ import com.google.common.collect.Lists;
/*     */ import java.util.List;
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
/*     */ public class doz
/*     */   extends dol
/*     */ {
/*  25 */   private static final nr c = (new of("options.graphics.fabulous")).a(k.u);
/*  26 */   private static final nr p = new of("options.graphics.warning.message", new Object[] { c, c });
/*  27 */   private static final nr q = (new of("options.graphics.warning.title")).a(k.m);
/*  28 */   private static final nr r = new of("options.graphics.warning.accept");
/*  29 */   private static final nr s = new of("options.graphics.warning.cancel");
/*  30 */   private static final nr t = new oe("\n");
/*     */   
/*  32 */   private static final dkc[] u = new dkc[] { dkc.x, dkc.q, dkc.u, dkc.l, dkc.L, dkc.X, dkc.y, dkc.v, dkc.m, dkc.C, dkc.W, dkc.B, dkc.n, dkc.M, dkc.k, dkc.r, dkc.j };
/*     */ 
/*     */ 
/*     */   
/*     */   private dlx v;
/*     */ 
/*     */ 
/*     */   
/*     */   private final eaa w;
/*     */ 
/*     */ 
/*     */   
/*     */   private final int x;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public doz(dot ☃, dkd dkd1) {
/*  50 */     super(☃, dkd1, new of("options.videoTitle"));
/*  51 */     this.w = ☃.i.V();
/*     */     
/*  53 */     this.w.i();
/*  54 */     if (dkd1.f == djt.c)
/*     */     {
/*  56 */       this.w.e();
/*     */     }
/*     */     
/*  59 */     this.x = dkd1.A;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void b() {
/*  64 */     this.v = new dlx(this.i, this.k, this.l, 32, this.l - 32, 25);
/*  65 */     this.v.a(new djr(this.i.aD()));
/*  66 */     this.v.a(dkc.a);
/*  67 */     this.v.a(u);
/*     */     
/*  69 */     this.e.add(this.v);
/*     */     
/*  71 */     a(new dlj(this.k / 2 - 100, this.l - 27, 200, 20, nq.c, ☃ -> {
/*     */             this.i.k.b();
/*     */             this.i.aD().g();
/*     */             this.i.a(this.a);
/*     */           }));
/*     */   }
/*     */ 
/*     */   
/*     */   public void e() {
/*  80 */     if (this.b.A != this.x) {
/*  81 */       this.i.b(this.b.A);
/*  82 */       this.i.D();
/*     */     } 
/*  84 */     super.e();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(double ☃, double d1, int i) {
/*  89 */     int j = this.b.aS;
/*     */     
/*  91 */     if (super.a(☃, d1, i)) {
/*  92 */       if (this.b.aS != j) {
/*  93 */         this.i.a();
/*     */       }
/*     */       
/*  96 */       if (this.w.g()) {
/*     */         
/*  98 */         List<nu> list = Lists.newArrayList((Object[])new nu[] { p, t });
/*     */         
/* 100 */         String str1 = this.w.j();
/* 101 */         if (str1 != null) {
/* 102 */           list.add(t);
/* 103 */           list.add((new of("options.graphics.warning.renderer", new Object[] { str1 })).a(k.h));
/*     */         } 
/*     */         
/* 106 */         String str2 = this.w.l();
/* 107 */         if (str2 != null) {
/* 108 */           list.add(t);
/* 109 */           list.add((new of("options.graphics.warning.vendor", new Object[] { str2 })).a(k.h));
/*     */         } 
/*     */         
/* 112 */         String str3 = this.w.k();
/* 113 */         if (str3 != null) {
/* 114 */           list.add(t);
/* 115 */           list.add((new of("options.graphics.warning.version", new Object[] { str3 })).a(k.h));
/*     */         } 
/*     */         
/* 118 */         this.i.a(new dop(q, list, ImmutableList.of(new dop.a(r, ☃ -> { this.b.f = djt.c; (djz.C()).e.e(); this.w.e(); this.i.a(this); }), new dop.a(s, ☃ -> {
/*     */                     this.w.f();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */                     
/*     */                     this.i.a(this);
/*     */                   }))));
/*     */       } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 134 */       return true;
/*     */     } 
/* 136 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean c(double ☃, double d1, int i) {
/* 141 */     int j = this.b.aS;
/*     */     
/* 143 */     if (super.c(☃, d1, i)) {
/* 144 */       return true;
/*     */     }
/* 146 */     if (this.v.c(☃, d1, i)) {
/* 147 */       if (this.b.aS != j) {
/* 148 */         this.i.a();
/*     */       }
/* 150 */       return true;
/*     */     } 
/* 152 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(dfm ☃, int i, int j, float f) {
/* 157 */     a(☃);
/* 158 */     this.v.a(☃, i, j, f);
/*     */     
/* 160 */     a(☃, this.o, this.d, this.k / 2, 5, 16777215);
/*     */     
/* 162 */     super.a(☃, i, j, f);
/*     */     
/* 164 */     List<afa> list = a(this.v, i, j);
/* 165 */     if (list != null)
/* 166 */       c(☃, list, i, j); 
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\doz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */