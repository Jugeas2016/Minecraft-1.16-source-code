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
/*     */ class a
/*     */   extends dlv<dof.a.a>
/*     */ {
/*     */   public a(dof paramdof, djz ☃) {
/*  77 */     super(☃, paramdof.k, paramdof.l, 32, paramdof.l - 65 + 4, 18);
/*     */     
/*  79 */     for (eky eky : dof.a(paramdof).d()) {
/*  80 */       a a1 = new a(this, eky);
/*  81 */       b(a1);
/*  82 */       if (dof.a(paramdof).b().getCode().equals(eky.getCode())) {
/*  83 */         a(a1);
/*     */       }
/*     */     } 
/*     */     
/*  87 */     if (h() != null) {
/*  88 */       c(h());
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   protected int e() {
/*  94 */     return super.e() + 20;
/*     */   }
/*     */ 
/*     */   
/*     */   public int d() {
/*  99 */     return super.d() + 50;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(@Nullable a ☃) {
/* 104 */     super.a(☃);
/*     */     
/* 106 */     if (☃ != null) {
/* 107 */       dkz.b.a((new of("narrator.select", new Object[] { a.a(☃) })).getString());
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(dfm ☃) {
/* 113 */     this.a.a(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean b() {
/* 118 */     return (this.a.aw_() == this);
/*     */   }
/*     */   
/*     */   public class a extends dlv.a<a> {
/*     */     private final eky b;
/*     */     
/*     */     public a(dof.a ☃, eky eky1) {
/* 125 */       this.b = eky1;
/*     */     }
/*     */ 
/*     */     
/*     */     public void a(dfm ☃, int i, int j, int k, int m, int n, int i1, int i2, boolean bool, float f) {
/* 130 */       String str = this.b.toString();
/* 131 */       this.a.a.o.a(☃, str, (dof.a.a(this.a) / 2 - this.a.a.o.b(str) / 2), (j + 1), 16777215, true);
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean a(double ☃, double d1, int i) {
/* 136 */       if (i == 0) {
/* 137 */         a();
/* 138 */         return true;
/*     */       } 
/* 140 */       return false;
/*     */     }
/*     */     
/*     */     private void a() {
/* 144 */       this.a.a(this);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dof$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */