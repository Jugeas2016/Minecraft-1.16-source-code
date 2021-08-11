/*     */ import com.google.common.collect.Lists;
/*     */ import java.util.List;
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
/*     */ public class drq
/*     */ {
/*  17 */   private final List<drs> a = Lists.newArrayListWithCapacity(20);
/*     */   
/*     */   private drs b;
/*  20 */   private final dro c = new dro();
/*     */   
/*     */   private djz d;
/*     */   
/*  24 */   private final List<dru> e = Lists.newArrayList();
/*     */   
/*     */   private List<drt> f;
/*     */   
/*     */   private dma g;
/*     */   
/*     */   private dma h;
/*     */   private int i;
/*     */   private int j;
/*     */   private adt k;
/*     */   private boq<?> l;
/*     */   private drt m;
/*     */   
/*     */   public drq() {
/*  38 */     for (int ☃ = 0; ☃ < 20; ☃++) {
/*  39 */       this.a.add(new drs());
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(djz ☃, int i, int j) {
/*  44 */     this.d = ☃;
/*  45 */     this.k = ☃.s.F();
/*     */     
/*  47 */     for (int k = 0; k < this.a.size(); k++) {
/*  48 */       ((drs)this.a.get(k)).a(i + 11 + 25 * k % 5, j + 31 + 25 * k / 5);
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  54 */     this.g = new dma(i + 93, j + 137, 12, 17, false);
/*  55 */     this.g.a(1, 208, 13, 18, drp.a);
/*  56 */     this.h = new dma(i + 38, j + 137, 12, 17, true);
/*  57 */     this.h.a(1, 208, 13, 18, drp.a);
/*     */   }
/*     */   
/*     */   public void a(drp ☃) {
/*  61 */     this.e.remove(☃);
/*  62 */     this.e.add(☃);
/*     */   }
/*     */   
/*     */   public void a(List<drt> ☃, boolean bool) {
/*  66 */     this.f = ☃;
/*  67 */     this.i = (int)Math.ceil(☃.size() / 20.0D);
/*     */     
/*  69 */     if (this.i <= this.j || bool) {
/*  70 */       this.j = 0;
/*     */     }
/*     */     
/*  73 */     f();
/*     */   }
/*     */   
/*     */   private void f() {
/*  77 */     int ☃ = 20 * this.j;
/*  78 */     for (int i = 0; i < this.a.size(); i++) {
/*  79 */       drs drs1 = this.a.get(i);
/*     */       
/*  81 */       if (☃ + i < this.f.size()) {
/*  82 */         drt drt1 = this.f.get(☃ + i);
/*     */         
/*  84 */         drs1.a(drt1, this);
/*     */         
/*  86 */         drs1.p = true;
/*     */       } else {
/*  88 */         drs1.p = false;
/*     */       } 
/*     */     } 
/*     */     
/*  92 */     g();
/*     */   }
/*     */   
/*     */   private void g() {
/*  96 */     this.g.p = (this.i > 1 && this.j < this.i - 1);
/*  97 */     this.h.p = (this.i > 1 && this.j > 0);
/*     */   }
/*     */   
/*     */   public void a(dfm ☃, int i, int j, int k, int m, float f) {
/* 101 */     if (this.i > 1) {
/* 102 */       String str = (this.j + 1) + "/" + this.i;
/* 103 */       int n = this.d.g.b(str);
/* 104 */       this.d.g.b(☃, str, (i - n / 2 + 73), (j + 141), -1);
/*     */     } 
/*     */     
/* 107 */     this.b = null;
/* 108 */     for (drs drs1 : this.a) {
/* 109 */       drs1.a(☃, k, m, f);
/* 110 */       if (drs1.p && drs1.g()) {
/* 111 */         this.b = drs1;
/*     */       }
/*     */     } 
/*     */     
/* 115 */     this.h.a(☃, k, m, f);
/* 116 */     this.g.a(☃, k, m, f);
/*     */     
/* 118 */     this.c.a(☃, k, m, f);
/*     */   }
/*     */   
/*     */   public void a(dfm ☃, int i, int j) {
/* 122 */     if (this.d.y != null && this.b != null && !this.c.c()) {
/* 123 */       this.d.y.b(☃, this.b.a(this.d.y), i, j);
/*     */     }
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public boq<?> a() {
/* 129 */     return this.l;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public drt b() {
/* 134 */     return this.m;
/*     */   }
/*     */   
/*     */   public void c() {
/* 138 */     this.c.a(false);
/*     */   }
/*     */   
/*     */   public boolean a(double ☃, double d1, int i, int j, int k, int m, int n) {
/* 142 */     this.l = null;
/* 143 */     this.m = null;
/*     */     
/* 145 */     if (this.c.c()) {
/* 146 */       if (this.c.a(☃, d1, i)) {
/* 147 */         this.l = this.c.b();
/* 148 */         this.m = this.c.a();
/*     */       } else {
/* 150 */         this.c.a(false);
/*     */       } 
/*     */       
/* 153 */       return true;
/*     */     } 
/*     */     
/* 156 */     if (this.g.a(☃, d1, i)) {
/* 157 */       this.j++;
/* 158 */       f();
/* 159 */       return true;
/* 160 */     }  if (this.h.a(☃, d1, i)) {
/* 161 */       this.j--;
/* 162 */       f();
/* 163 */       return true;
/*     */     } 
/*     */     
/* 166 */     for (drs drs1 : this.a) {
/* 167 */       if (drs1.a(☃, d1, i)) {
/* 168 */         if (i == 0) {
/* 169 */           this.l = drs1.d();
/* 170 */           this.m = drs1.a();
/* 171 */         } else if (i == 1 && 
/* 172 */           !this.c.c() && !drs1.b()) {
/* 173 */           this.c.a(this.d, drs1.a(), drs1.l, drs1.m, j + m / 2, k + 13 + n / 2, drs1.h());
/*     */         } 
/*     */         
/* 176 */         return true;
/*     */       } 
/*     */     } 
/*     */     
/* 180 */     return false;
/*     */   }
/*     */   
/*     */   public void a(List<boq<?>> ☃) {
/* 184 */     for (dru dru : this.e) {
/* 185 */       dru.a(☃);
/*     */     }
/*     */   }
/*     */   
/*     */   public djz d() {
/* 190 */     return this.d;
/*     */   }
/*     */   
/*     */   public adt e() {
/* 194 */     return this.k;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\drq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */