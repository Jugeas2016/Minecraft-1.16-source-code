/*     */ import com.google.common.base.MoreObjects;
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
/*     */ public class dsq
/*     */ {
/*  17 */   private static final dss b = new a();
/*  18 */   private static final dss c = new b(-1, true);
/*  19 */   private static final dss d = new b(1, true);
/*  20 */   private static final dss e = new b(1, false);
/*     */ 
/*     */ 
/*     */   
/*  24 */   private static final nr f = new of("spectatorMenu.close");
/*  25 */   private static final nr g = new of("spectatorMenu.previous_page");
/*  26 */   private static final nr h = new of("spectatorMenu.next_page");
/*     */   
/*  28 */   public static final dss a = new dss()
/*     */     {
/*     */       public void a(dsq ☃) {}
/*     */ 
/*     */ 
/*     */       
/*     */       public nr aA_() {
/*  35 */         return oe.d;
/*     */       }
/*     */ 
/*     */ 
/*     */       
/*     */       public void a(dfm ☃, float f, int i) {}
/*     */ 
/*     */       
/*     */       public boolean aB_() {
/*  44 */         return false;
/*     */       }
/*     */     };
/*     */   
/*     */   private final dst i;
/*     */   private dsr j;
/*  50 */   private int k = -1;
/*     */   private int l;
/*     */   
/*     */   public dsq(dst ☃) {
/*  54 */     this.j = new dsp();
/*  55 */     this.i = ☃;
/*     */   }
/*     */   
/*     */   public dss a(int ☃) {
/*  59 */     int i = ☃ + this.l * 6;
/*     */     
/*  61 */     if (this.l > 0 && ☃ == 0)
/*  62 */       return c; 
/*  63 */     if (☃ == 7) {
/*  64 */       if (i < this.j.a().size()) {
/*  65 */         return d;
/*     */       }
/*  67 */       return e;
/*     */     } 
/*     */ 
/*     */     
/*  71 */     if (☃ == 8) {
/*  72 */       return b;
/*     */     }
/*     */     
/*  75 */     if (i < 0 || i >= this.j.a().size()) {
/*  76 */       return a;
/*     */     }
/*  78 */     return (dss)MoreObjects.firstNonNull(this.j.a().get(i), a);
/*     */   }
/*     */   
/*     */   public List<dss> a() {
/*  82 */     List<dss> ☃ = Lists.newArrayList();
/*     */     
/*  84 */     for (int i = 0; i <= 8; i++) {
/*  85 */       ☃.add(a(i));
/*     */     }
/*     */     
/*  88 */     return ☃;
/*     */   }
/*     */   
/*     */   public dss b() {
/*  92 */     return a(this.k);
/*     */   }
/*     */   
/*     */   public dsr c() {
/*  96 */     return this.j;
/*     */   }
/*     */   
/*     */   public void b(int ☃) {
/* 100 */     dss dss1 = a(☃);
/*     */     
/* 102 */     if (dss1 != a) {
/* 103 */       if (this.k == ☃ && dss1.aB_()) {
/* 104 */         dss1.a(this);
/*     */       } else {
/* 106 */         this.k = ☃;
/*     */       } 
/*     */     }
/*     */   }
/*     */   
/*     */   public void d() {
/* 112 */     this.i.a(this);
/*     */   }
/*     */   
/*     */   public int e() {
/* 116 */     return this.k;
/*     */   }
/*     */   
/*     */   public void a(dsr ☃) {
/* 120 */     this.j = ☃;
/* 121 */     this.k = -1;
/* 122 */     this.l = 0;
/*     */   }
/*     */   
/*     */   public dsu f() {
/* 126 */     return new dsu(this.j, a(), this.k);
/*     */   }
/*     */   
/*     */   static class a
/*     */     implements dss {
/*     */     public void a(dsq ☃) {
/* 132 */       ☃.d();
/*     */     }
/*     */     private a() {}
/*     */     
/*     */     public nr aA_() {
/* 137 */       return dsq.g();
/*     */     }
/*     */ 
/*     */     
/*     */     public void a(dfm ☃, float f, int i) {
/* 142 */       djz.C().M().a(dml.a);
/* 143 */       dkw.a(☃, 0, 0, 128.0F, 0.0F, 16, 16, 256, 256);
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean aB_() {
/* 148 */       return true;
/*     */     }
/*     */   }
/*     */   
/*     */   static class b implements dss {
/*     */     private final int a;
/*     */     private final boolean b;
/*     */     
/*     */     public b(int ☃, boolean bool) {
/* 157 */       this.a = ☃;
/* 158 */       this.b = bool;
/*     */     }
/*     */ 
/*     */     
/*     */     public void a(dsq ☃) {
/* 163 */       dsq.a(☃, dsq.a(☃) + this.a);
/*     */     }
/*     */ 
/*     */     
/*     */     public nr aA_() {
/* 168 */       return (this.a < 0) ? dsq.h() : dsq.i();
/*     */     }
/*     */ 
/*     */     
/*     */     public void a(dfm ☃, float f, int i) {
/* 173 */       djz.C().M().a(dml.a);
/*     */       
/* 175 */       if (this.a < 0) {
/* 176 */         dkw.a(☃, 0, 0, 144.0F, 0.0F, 16, 16, 256, 256);
/*     */       } else {
/* 178 */         dkw.a(☃, 0, 0, 160.0F, 0.0F, 16, 16, 256, 256);
/*     */       } 
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean aB_() {
/* 184 */       return this.b;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dsq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */