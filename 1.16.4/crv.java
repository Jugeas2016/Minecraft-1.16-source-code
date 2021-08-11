/*     */ import com.google.common.collect.Lists;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.Random;
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
/*     */ public abstract class crv<C extends cma>
/*     */ {
/*  26 */   public static final crv<?> a = new crv<cme>(cla.c, 0, 0, cra.a(), 0, 0L)
/*     */     {
/*     */       public void a(gn ☃, cfy cfy1, csw csw1, int i, int j, bsv bsv1, cme cme1) {}
/*     */     };
/*     */ 
/*     */   
/*     */   private final cla<C> e;
/*  33 */   protected final List<cru> b = Lists.newArrayList();
/*     */   
/*     */   protected cra c;
/*     */   private final int f;
/*     */   private final int g;
/*     */   private int h;
/*     */   protected final chx d;
/*     */   
/*     */   public crv(cla<C> ☃, int i, int j, cra cra1, int k, long l) {
/*  42 */     this.e = ☃;
/*  43 */     this.f = i;
/*  44 */     this.g = j;
/*  45 */     this.h = k;
/*  46 */     this.d = new chx();
/*  47 */     this.d.c(l, i, j);
/*  48 */     this.c = cra1;
/*     */   }
/*     */   
/*     */   public abstract void a(gn paramgn, cfy paramcfy, csw paramcsw, int paramInt1, int paramInt2, bsv parambsv, C paramC);
/*     */   
/*     */   public cra c() {
/*  54 */     return this.c;
/*     */   }
/*     */   
/*     */   public List<cru> d() {
/*  58 */     return this.b;
/*     */   }
/*     */   
/*     */   public void a(bsr ☃, bsn bsn1, cfy cfy1, Random random, cra cra1, brd brd1) {
/*  62 */     synchronized (this.b) {
/*  63 */       if (this.b.isEmpty()) {
/*     */         return;
/*     */       }
/*     */ 
/*     */ 
/*     */       
/*  69 */       cra cra2 = ((cru)this.b.get(0)).n;
/*  70 */       gr gr = cra2.g();
/*  71 */       fx fx = new fx(gr.u(), cra2.b, gr.w());
/*  72 */       Iterator<cru> iterator = this.b.iterator();
/*  73 */       while (iterator.hasNext()) {
/*  74 */         cru cru = iterator.next();
/*  75 */         if (cru.g().b(cra1) && 
/*  76 */           !cru.a(☃, bsn1, cfy1, random, cra1, brd1, fx)) {
/*  77 */           iterator.remove();
/*     */         }
/*     */       } 
/*     */       
/*  81 */       b();
/*     */     } 
/*     */   }
/*     */   
/*     */   protected void b() {
/*  86 */     this.c = cra.a();
/*     */     
/*  88 */     for (cru ☃ : this.b) {
/*  89 */       this.c.c(☃.g());
/*     */     }
/*     */   }
/*     */   
/*     */   public md a(int ☃, int i) {
/*  94 */     md md = new md();
/*     */     
/*  96 */     if (e()) {
/*  97 */       md.a("id", gm.aG.b(l()).toString());
/*     */     } else {
/*  99 */       md.a("id", "INVALID");
/* 100 */       return md;
/*     */     } 
/* 102 */     md.b("ChunkX", ☃);
/* 103 */     md.b("ChunkZ", i);
/* 104 */     md.b("references", this.h);
/* 105 */     md.a("BB", this.c.h());
/*     */     
/* 107 */     mj mj = new mj();
/* 108 */     synchronized (this.b) {
/* 109 */       for (cru cru : this.b) {
/* 110 */         mj.add(cru.f());
/*     */       }
/*     */     } 
/* 113 */     md.a("Children", mj);
/*     */     
/* 115 */     return md;
/*     */   }
/*     */   
/*     */   protected void a(int ☃, Random random, int i) {
/* 119 */     int j = ☃ - i;
/*     */ 
/*     */     
/* 122 */     int k = this.c.e() + 1;
/*     */     
/* 124 */     if (k < j) {
/* 125 */       k += random.nextInt(j - k);
/*     */     }
/*     */ 
/*     */     
/* 129 */     int m = k - this.c.e;
/* 130 */     this.c.a(0, m, 0);
/* 131 */     for (cru cru : this.b) {
/* 132 */       cru.a(0, m, 0);
/*     */     }
/*     */   }
/*     */   
/*     */   protected void a(Random ☃, int i, int j) {
/* 137 */     int m, k = j - i + 1 - this.c.e();
/*     */ 
/*     */     
/* 140 */     if (k > 1) {
/* 141 */       m = i + ☃.nextInt(k);
/*     */     } else {
/* 143 */       m = i;
/*     */     } 
/*     */ 
/*     */     
/* 147 */     int n = m - this.c.b;
/* 148 */     this.c.a(0, n, 0);
/* 149 */     for (cru cru : this.b) {
/* 150 */       cru.a(0, n, 0);
/*     */     }
/*     */   }
/*     */   
/*     */   public boolean e() {
/* 155 */     return !this.b.isEmpty();
/*     */   }
/*     */   
/*     */   public int f() {
/* 159 */     return this.f;
/*     */   }
/*     */   
/*     */   public int g() {
/* 163 */     return this.g;
/*     */   }
/*     */   
/*     */   public fx a() {
/* 167 */     return new fx(this.f << 4, 0, this.g << 4);
/*     */   }
/*     */   
/*     */   public boolean h() {
/* 171 */     return (this.h < k());
/*     */   }
/*     */   
/*     */   public void i() {
/* 175 */     this.h++;
/*     */   }
/*     */   
/*     */   public int j() {
/* 179 */     return this.h;
/*     */   }
/*     */   
/*     */   protected int k() {
/* 183 */     return 1;
/*     */   }
/*     */   
/*     */   public cla<?> l() {
/* 187 */     return this.e;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\crv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */