/*     */ import com.mojang.blaze3d.systems.RenderSystem;
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
/*     */ public class drj
/*     */   extends dlv<drj.a>
/*     */ {
/*  22 */   private static final vk a = new vk("textures/gui/resource_packs.png");
/*  23 */   private static final nr o = new of("pack.incompatible");
/*  24 */   private static final nr p = new of("pack.incompatible.confirm.title");
/*     */   
/*     */   private final nr q;
/*     */   
/*     */   public drj(djz ☃, int i, int j, nr nr1) {
/*  29 */     super(☃, i, j, 32, j - 55 + 4, 36);
/*  30 */     this.q = nr1;
/*  31 */     this.m = false;
/*     */     
/*  33 */     ☃.g.getClass(); a(true, (int)(9.0F * 1.5F));
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(dfm ☃, int i, int j, dfo dfo1) {
/*  38 */     nr nr1 = (new oe("")).a(this.q).a(new k[] { k.t, k.r });
/*  39 */     this.b.g.b(☃, nr1, (i + this.d / 2 - this.b.g.a(nr1) / 2), Math.min(this.i + 3, j), 16777215);
/*     */   }
/*     */ 
/*     */   
/*     */   public int d() {
/*  44 */     return this.d;
/*     */   }
/*     */ 
/*     */   
/*     */   protected int e() {
/*  49 */     return this.k - 6;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static class a
/*     */     extends dlv.a<a>
/*     */   {
/*     */     private drj c;
/*     */     
/*     */     protected final djz a;
/*     */     
/*     */     protected final dot b;
/*     */     
/*     */     private final drh.a d;
/*     */     
/*     */     private final afa e;
/*     */     
/*     */     private final dlu f;
/*     */     
/*     */     private final afa g;
/*     */     
/*     */     private final dlu h;
/*     */ 
/*     */     
/*     */     public a(djz ☃, drj drj1, dot dot1, drh.a a1) {
/*  75 */       this.a = ☃;
/*  76 */       this.b = dot1;
/*  77 */       this.d = a1;
/*  78 */       this.c = drj1;
/*     */       
/*  80 */       this.e = a(☃, a1.c());
/*  81 */       this.f = b(☃, a1.f());
/*     */       
/*  83 */       this.g = a(☃, drj.f());
/*  84 */       this.h = b(☃, a1.b().b());
/*     */     }
/*     */     
/*     */     private static afa a(djz ☃, nr nr1) {
/*  88 */       int i = ☃.g.a(nr1);
/*  89 */       if (i > 157) {
/*  90 */         nu nu = nu.a(new nu[] { ☃.g.a(nr1, 157 - ☃.g.b("...")), nu.b("...") });
/*  91 */         return ly.a().a(nu);
/*     */       } 
/*  93 */       return nr1.f();
/*     */     }
/*     */     
/*     */     private static dlu b(djz ☃, nr nr1) {
/*  97 */       return dlu.a(☃.g, nr1, 157, 2);
/*     */     }
/*     */ 
/*     */     
/*     */     public void a(dfm ☃, int i, int j, int k, int m, int n, int i1, int i2, boolean bool, float f) {
/* 102 */       abv abv = this.d.b();
/* 103 */       if (!abv.a()) {
/* 104 */         RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 105 */         dkw.a(☃, k - 1, j - 1, k + m - 9, j + n + 1, -8978432);
/*     */       } 
/*     */       
/* 108 */       this.a.M().a(this.d.a());
/* 109 */       RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 110 */       dkw.a(☃, k, j, 0.0F, 0.0F, 32, 32, 32, 32);
/*     */       
/* 112 */       afa afa1 = this.e;
/* 113 */       dlu dlu1 = this.f;
/*     */       
/* 115 */       if (a() && (this.a.k.Y || bool)) {
/* 116 */         this.a.M().a(drj.g());
/* 117 */         dkw.a(☃, k, j, k + 32, j + 32, -1601138544);
/* 118 */         RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 119 */         int i3 = i1 - k;
/* 120 */         int i4 = i2 - j;
/*     */         
/* 122 */         if (!this.d.b().a()) {
/* 123 */           afa1 = this.g;
/* 124 */           dlu1 = this.h;
/*     */         } 
/*     */         
/* 127 */         if (this.d.n()) {
/* 128 */           if (i3 < 32) {
/* 129 */             dkw.a(☃, k, j, 0.0F, 32.0F, 32, 32, 256, 256);
/*     */           } else {
/* 131 */             dkw.a(☃, k, j, 0.0F, 0.0F, 32, 32, 256, 256);
/*     */           } 
/*     */         } else {
/* 134 */           if (this.d.o()) {
/* 135 */             if (i3 < 16) {
/* 136 */               dkw.a(☃, k, j, 32.0F, 32.0F, 32, 32, 256, 256);
/*     */             } else {
/* 138 */               dkw.a(☃, k, j, 32.0F, 0.0F, 32, 32, 256, 256);
/*     */             } 
/*     */           }
/* 141 */           if (this.d.p()) {
/* 142 */             if (i3 < 32 && i3 > 16 && i4 < 16) {
/* 143 */               dkw.a(☃, k, j, 96.0F, 32.0F, 32, 32, 256, 256);
/*     */             } else {
/* 145 */               dkw.a(☃, k, j, 96.0F, 0.0F, 32, 32, 256, 256);
/*     */             } 
/*     */           }
/* 148 */           if (this.d.q()) {
/* 149 */             if (i3 < 32 && i3 > 16 && i4 > 16) {
/* 150 */               dkw.a(☃, k, j, 64.0F, 32.0F, 32, 32, 256, 256);
/*     */             } else {
/* 152 */               dkw.a(☃, k, j, 64.0F, 0.0F, 32, 32, 256, 256);
/*     */             } 
/*     */           }
/*     */         } 
/*     */       } 
/*     */       
/* 158 */       this.a.g.a(☃, afa1, (k + 32 + 2), (j + 1), 16777215);
/* 159 */       dlu1.b(☃, k + 32 + 2, j + 12, 10, 8421504);
/*     */     }
/*     */     
/*     */     private boolean a() {
/* 163 */       return (!this.d.g() || !this.d.h());
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean a(double ☃, double d1, int i) {
/* 168 */       double d2 = ☃ - this.c.q();
/* 169 */       double d3 = d1 - drj.a(this.c, this.c.au_().indexOf(this));
/*     */       
/* 171 */       if (a() && d2 <= 32.0D) {
/* 172 */         if (this.d.n()) {
/* 173 */           abv abv = this.d.b();
/* 174 */           if (abv.a()) {
/* 175 */             this.d.i();
/*     */           } else {
/* 177 */             nr nr = abv.c();
/* 178 */             this.a.a(new dns(☃ -> {
/*     */                     this.a.a(this.b);
/*     */                     if (☃) {
/*     */                       this.d.i();
/*     */                     }
/* 183 */                   }drj.t(), nr));
/*     */           } 
/*     */           
/* 186 */           return true;
/*     */         } 
/* 188 */         if (d2 < 16.0D && this.d.o()) {
/* 189 */           this.d.j();
/* 190 */           return true;
/*     */         } 
/* 192 */         if (d2 > 16.0D && d3 < 16.0D && this.d.p()) {
/* 193 */           this.d.k();
/* 194 */           return true;
/*     */         } 
/* 196 */         if (d2 > 16.0D && d3 > 16.0D && this.d.q()) {
/* 197 */           this.d.l();
/* 198 */           return true;
/*     */         } 
/*     */       } 
/*     */ 
/*     */       
/* 203 */       return false;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\drj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */