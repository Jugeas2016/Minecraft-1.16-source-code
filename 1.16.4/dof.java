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
/*     */ public class dof
/*     */   extends dol
/*     */ {
/*  23 */   private static final nr c = (new oe("(")).a(new of("options.languageWarning")).c(")").a(k.h);
/*     */   
/*     */   private a p;
/*     */   private final ekz q;
/*     */   private dlw r;
/*     */   private dlj s;
/*     */   
/*     */   public dof(dot ☃, dkd dkd1, ekz ekz1) {
/*  31 */     super(☃, dkd1, new of("options.language"));
/*  32 */     this.q = ekz1;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void b() {
/*  37 */     this.p = new a(this, this.i);
/*  38 */     this.e.add(this.p);
/*     */     
/*  40 */     this.r = a(new dlw(this.k / 2 - 155, this.l - 38, 150, 20, dkc.N, dkc.N.c(this.b), ☃ -> {
/*     */             dkc.N.a(this.b);
/*     */             
/*     */             this.b.b();
/*     */             ☃.a(dkc.N.c(this.b));
/*     */             this.i.a();
/*     */           }));
/*  47 */     this.s = a(new dlj(this.k / 2 - 155 + 160, this.l - 38, 150, 20, nq.c, ☃ -> {
/*     */             a.a a1 = this.p.h();
/*     */             
/*     */             if (a1 != null && !a.a.a(a1).getCode().equals(this.q.b().getCode())) {
/*     */               this.q.a(a.a.a(a1));
/*     */               
/*     */               this.b.aV = a.a.a(a1).getCode();
/*     */               
/*     */               this.i.j();
/*     */               this.s.a(nq.c);
/*     */               this.r.a(dkc.N.c(this.b));
/*     */               this.b.b();
/*     */             } 
/*     */             this.i.a(this.a);
/*     */           }));
/*  62 */     super.b();
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(dfm ☃, int i, int j, float f) {
/*  67 */     this.p.a(☃, i, j, f);
/*     */     
/*  69 */     a(☃, this.o, this.d, this.k / 2, 16, 16777215);
/*  70 */     a(☃, this.o, c, this.k / 2, this.l - 56, 8421504);
/*     */     
/*  72 */     super.a(☃, i, j, f);
/*     */   }
/*     */   
/*     */   class a extends dlv<a.a> {
/*     */     public a(dof this$0, djz ☃) {
/*  77 */       super(☃, this$0.k, this$0.l, 32, this$0.l - 65 + 4, 18);
/*     */       
/*  79 */       for (eky eky : dof.a(this$0).d()) {
/*  80 */         a a1 = new a(this, eky);
/*  81 */         b(a1);
/*  82 */         if (dof.a(this$0).b().getCode().equals(eky.getCode())) {
/*  83 */           a(a1);
/*     */         }
/*     */       } 
/*     */       
/*  87 */       if (h() != null) {
/*  88 */         c(h());
/*     */       }
/*     */     }
/*     */ 
/*     */     
/*     */     protected int e() {
/*  94 */       return super.e() + 20;
/*     */     }
/*     */ 
/*     */     
/*     */     public int d() {
/*  99 */       return super.d() + 50;
/*     */     }
/*     */ 
/*     */     
/*     */     public void a(@Nullable a ☃) {
/* 104 */       super.a(☃);
/*     */       
/* 106 */       if (☃ != null) {
/* 107 */         dkz.b.a((new of("narrator.select", new Object[] { a.a(☃) })).getString());
/*     */       }
/*     */     }
/*     */ 
/*     */     
/*     */     protected void a(dfm ☃) {
/* 113 */       this.a.a(☃);
/*     */     }
/*     */ 
/*     */     
/*     */     protected boolean b() {
/* 118 */       return (this.a.aw_() == this);
/*     */     }
/*     */     
/*     */     public class a extends dlv.a<a> {
/*     */       private final eky b;
/*     */       
/*     */       public a(dof.a ☃, eky eky1) {
/* 125 */         this.b = eky1;
/*     */       }
/*     */ 
/*     */       
/*     */       public void a(dfm ☃, int i, int j, int k, int m, int n, int i1, int i2, boolean bool, float f) {
/* 130 */         String str = this.b.toString();
/* 131 */         this.a.a.o.a(☃, str, (dof.a.a(this.a) / 2 - this.a.a.o.b(str) / 2), (j + 1), 16777215, true);
/*     */       }
/*     */ 
/*     */       
/*     */       public boolean a(double ☃, double d1, int i) {
/* 136 */         if (i == 0) {
/* 137 */           a();
/* 138 */           return true;
/*     */         } 
/* 140 */         return false;
/*     */       }
/*     */       
/*     */       private void a() {
/* 144 */         this.a.a(this); } } } public class a extends dlv.a<a.a> { private void a() { this.a.a(this); }
/*     */ 
/*     */     
/*     */     private final eky b;
/*     */     
/*     */     public a(dof.a ☃, eky eky1) {
/*     */       this.b = eky1;
/*     */     }
/*     */     
/*     */     public void a(dfm ☃, int i, int j, int k, int m, int n, int i1, int i2, boolean bool, float f) {
/*     */       String str = this.b.toString();
/*     */       this.a.a.o.a(☃, str, (dof.a.a(this.a) / 2 - this.a.a.o.b(str) / 2), (j + 1), 16777215, true);
/*     */     }
/*     */     
/*     */     public boolean a(double ☃, double d1, int i) {
/*     */       if (i == 0) {
/*     */         a();
/*     */         return true;
/*     */       } 
/*     */       return false;
/*     */     } }
/*     */ 
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dof.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */