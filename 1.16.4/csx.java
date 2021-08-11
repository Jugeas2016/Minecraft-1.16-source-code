/*     */ import com.google.common.collect.Lists;
/*     */ import java.util.List;
/*     */ import java.util.Random;
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
/*     */ public class csx
/*     */ {
/*  18 */   private byg a = byg.a;
/*  19 */   private bzm b = bzm.a;
/*  20 */   private fx c = fx.b;
/*     */   private boolean d;
/*     */   @Nullable
/*     */   private brd e;
/*     */   @Nullable
/*     */   private cra f;
/*     */   private boolean g = true;
/*     */   @Nullable
/*     */   private Random h;
/*     */   @Nullable
/*     */   private int i;
/*  31 */   private final List<csy> j = Lists.newArrayList();
/*     */   private boolean k;
/*     */   private boolean l;
/*     */   
/*     */   public csx a() {
/*  36 */     csx ☃ = new csx();
/*  37 */     ☃.a = this.a;
/*  38 */     ☃.b = this.b;
/*  39 */     ☃.c = this.c;
/*  40 */     ☃.d = this.d;
/*  41 */     ☃.e = this.e;
/*  42 */     ☃.f = this.f;
/*  43 */     ☃.g = this.g;
/*  44 */     ☃.h = this.h;
/*  45 */     ☃.i = this.i;
/*  46 */     ☃.j.addAll(this.j);
/*  47 */     ☃.k = this.k;
/*  48 */     ☃.l = this.l;
/*  49 */     return ☃;
/*     */   }
/*     */   
/*     */   public csx a(byg ☃) {
/*  53 */     this.a = ☃;
/*  54 */     return this;
/*     */   }
/*     */   
/*     */   public csx a(bzm ☃) {
/*  58 */     this.b = ☃;
/*  59 */     return this;
/*     */   }
/*     */   
/*     */   public csx a(fx ☃) {
/*  63 */     this.c = ☃;
/*  64 */     return this;
/*     */   }
/*     */   
/*     */   public csx a(boolean ☃) {
/*  68 */     this.d = ☃;
/*  69 */     return this;
/*     */   }
/*     */   
/*     */   public csx a(brd ☃) {
/*  73 */     this.e = ☃;
/*  74 */     return this;
/*     */   }
/*     */   
/*     */   public csx a(cra ☃) {
/*  78 */     this.f = ☃;
/*  79 */     return this;
/*     */   }
/*     */   
/*     */   public csx a(@Nullable Random ☃) {
/*  83 */     this.h = ☃;
/*  84 */     return this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public csx c(boolean ☃) {
/*  93 */     this.k = ☃;
/*  94 */     return this;
/*     */   }
/*     */   
/*     */   public csx b() {
/*  98 */     this.j.clear();
/*  99 */     return this;
/*     */   }
/*     */   
/*     */   public csx a(csy ☃) {
/* 103 */     this.j.add(☃);
/* 104 */     return this;
/*     */   }
/*     */   
/*     */   public csx b(csy ☃) {
/* 108 */     this.j.remove(☃);
/* 109 */     return this;
/*     */   }
/*     */   
/*     */   public byg c() {
/* 113 */     return this.a;
/*     */   }
/*     */   
/*     */   public bzm d() {
/* 117 */     return this.b;
/*     */   }
/*     */   
/*     */   public fx e() {
/* 121 */     return this.c;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Random b(@Nullable fx ☃) {
/* 130 */     if (this.h != null) {
/* 131 */       return this.h;
/*     */     }
/*     */     
/* 134 */     if (☃ == null) {
/* 135 */       return new Random(x.b());
/*     */     }
/*     */     
/* 138 */     return new Random(afm.a(☃));
/*     */   }
/*     */   
/*     */   public boolean g() {
/* 142 */     return this.d;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public cra h() {
/* 147 */     if (this.f == null && this.e != null) {
/* 148 */       k();
/*     */     }
/* 150 */     return this.f;
/*     */   }
/*     */   
/*     */   public boolean i() {
/* 154 */     return this.k;
/*     */   }
/*     */   
/*     */   public List<csy> j() {
/* 158 */     return this.j;
/*     */   }
/*     */   
/*     */   void k() {
/* 162 */     if (this.e != null) {
/* 163 */       this.f = b(this.e);
/*     */     }
/*     */   }
/*     */   
/*     */   public boolean l() {
/* 168 */     return this.g;
/*     */   }
/*     */   
/*     */   public ctb.a a(List<ctb.a> ☃, @Nullable fx fx1) {
/* 172 */     int i = ☃.size();
/* 173 */     if (i == 0)
/*     */     {
/* 175 */       throw new IllegalStateException("No palettes");
/*     */     }
/* 177 */     return ☃.get(b(fx1).nextInt(i));
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   private cra b(@Nullable brd ☃) {
/* 182 */     if (☃ == null) {
/* 183 */       return this.f;
/*     */     }
/* 185 */     int i = ☃.b * 16;
/* 186 */     int j = ☃.c * 16;
/* 187 */     return new cra(i, 0, j, i + 16 - 1, 255, j + 16 - 1);
/*     */   }
/*     */   
/*     */   public csx d(boolean ☃) {
/* 191 */     this.l = ☃;
/* 192 */     return this;
/*     */   }
/*     */   
/*     */   public boolean m() {
/* 196 */     return this.l;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\csx.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */