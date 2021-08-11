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
/*     */ public class dnq
/*     */   extends dot
/*     */ {
/*  19 */   private String b = "";
/*  20 */   private int c = -1;
/*     */   
/*     */   protected dlq a;
/*  23 */   private String p = "";
/*     */   
/*     */   private dlm q;
/*     */   
/*     */   public dnq(String ☃) {
/*  28 */     super(dkz.a);
/*  29 */     this.p = ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void b() {
/*  34 */     this.i.m.a(true);
/*     */     
/*  36 */     this.c = this.i.j.c().b().size();
/*  37 */     this.a = new dlq(this, this.o, 4, this.l - 12, this.k - 4, 12, new of("chat.editBox"))
/*     */       {
/*     */         protected nx c() {
/*  40 */           return super.c().c(dnq.a(this.a).b());
/*     */         }
/*     */       };
/*  43 */     this.a.k(256);
/*  44 */     this.a.f(false);
/*  45 */     this.a.a(this.p);
/*  46 */     this.a.a(this::b);
/*  47 */     this.e.add(this.a);
/*     */     
/*  49 */     this.q = new dlm(this.i, this, this.a, this.o, false, false, 1, 10, true, -805306368);
/*  50 */     this.q.a();
/*  51 */     b(this.a);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(djz ☃, int i, int j) {
/*  56 */     String str = this.a.b();
/*  57 */     b(☃, i, j);
/*  58 */     c(str);
/*     */     
/*  60 */     this.q.a();
/*     */   }
/*     */ 
/*     */   
/*     */   public void e() {
/*  65 */     this.i.m.a(false);
/*  66 */     this.i.j.c().c();
/*     */   }
/*     */ 
/*     */   
/*     */   public void d() {
/*  71 */     this.a.a();
/*     */   }
/*     */   
/*     */   private void b(String ☃) {
/*  75 */     String str = this.a.b();
/*  76 */     this.q.a(!str.equals(this.p));
/*  77 */     this.q.a();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(int ☃, int i, int j) {
/*  83 */     if (this.q.a(☃, i, j)) {
/*  84 */       return true;
/*     */     }
/*     */     
/*  87 */     if (super.a(☃, i, j)) {
/*  88 */       return true;
/*     */     }
/*     */     
/*  91 */     if (☃ == 256) {
/*  92 */       this.i.a((dot)null);
/*  93 */       return true;
/*  94 */     }  if (☃ == 257 || ☃ == 335) {
/*  95 */       String str = this.a.b().trim();
/*     */       
/*  97 */       if (!str.isEmpty()) {
/*  98 */         b_(str);
/*     */       }
/*     */       
/* 101 */       this.i.a((dot)null);
/* 102 */       return true;
/* 103 */     }  if (☃ == 265) {
/* 104 */       a(-1);
/* 105 */       return true;
/* 106 */     }  if (☃ == 264) {
/* 107 */       a(1);
/* 108 */       return true;
/* 109 */     }  if (☃ == 266) {
/* 110 */       this.i.j.c().a((this.i.j.c().g() - 1));
/* 111 */       return true;
/* 112 */     }  if (☃ == 267) {
/* 113 */       this.i.j.c().a((-this.i.j.c().g() + 1));
/* 114 */       return true;
/*     */     } 
/* 116 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(double ☃, double d1, double d2) {
/* 121 */     if (d2 > 1.0D) {
/* 122 */       d2 = 1.0D;
/*     */     }
/* 124 */     if (d2 < -1.0D) {
/* 125 */       d2 = -1.0D;
/*     */     }
/* 127 */     if (this.q.a(d2)) {
/* 128 */       return true;
/*     */     }
/* 130 */     if (!y()) {
/* 131 */       d2 *= 7.0D;
/*     */     }
/* 133 */     this.i.j.c().a(d2);
/* 134 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(double ☃, double d1, int i) {
/* 139 */     if (this.q.a((int)☃, (int)d1, i)) {
/* 140 */       return true;
/*     */     }
/*     */     
/* 143 */     if (i == 0) {
/* 144 */       dlk dlk = this.i.j.c();
/* 145 */       if (dlk.a(☃, d1)) {
/* 146 */         return true;
/*     */       }
/*     */       
/* 149 */       ob ob = dlk.b(☃, d1);
/* 150 */       if (ob != null && a(ob)) {
/* 151 */         return true;
/*     */       }
/*     */     } 
/*     */     
/* 155 */     if (this.a.a(☃, d1, i)) {
/* 156 */       return true;
/*     */     }
/* 158 */     return super.a(☃, d1, i);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(String ☃, boolean bool) {
/* 163 */     if (bool) {
/* 164 */       this.a.a(☃);
/*     */     } else {
/* 166 */       this.a.b(☃);
/*     */     } 
/*     */   }
/*     */   
/*     */   public void a(int ☃) {
/* 171 */     int i = this.c + ☃;
/* 172 */     int j = this.i.j.c().b().size();
/*     */     
/* 174 */     i = afm.a(i, 0, j);
/* 175 */     if (i == this.c) {
/*     */       return;
/*     */     }
/*     */     
/* 179 */     if (i == j) {
/* 180 */       this.c = j;
/* 181 */       this.a.a(this.b);
/*     */       
/*     */       return;
/*     */     } 
/* 185 */     if (this.c == j) {
/* 186 */       this.b = this.a.b();
/*     */     }
/*     */     
/* 189 */     this.a.a(this.i.j.c().b().get(i));
/* 190 */     this.q.a(false);
/* 191 */     this.c = i;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(dfm ☃, int i, int j, float f) {
/* 197 */     a(this.a);
/* 198 */     this.a.e(true);
/*     */     
/* 200 */     a(☃, 2, this.l - 14, this.k - 2, this.l - 2, this.i.k.a(-2147483648));
/* 201 */     this.a.a(☃, i, j, f);
/* 202 */     this.q.a(☃, i, j);
/*     */     
/* 204 */     ob ob = this.i.j.c().b(i, j);
/* 205 */     if (ob != null && ob.i() != null) {
/* 206 */       a(☃, ob, i, j);
/*     */     }
/*     */     
/* 209 */     super.a(☃, i, j, f);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean ay_() {
/* 214 */     return false;
/*     */   }
/*     */   
/*     */   private void c(String ☃) {
/* 218 */     this.a.a(☃);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dnq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */