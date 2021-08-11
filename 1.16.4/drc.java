/*     */ import java.util.List;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
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
/*     */ public class drc
/*     */   extends dot
/*     */ {
/*  26 */   private static final Logger b = LogManager.getLogger();
/*     */   
/*  28 */   private final dxb c = new dxb();
/*     */   private final dot p;
/*     */   protected dre a;
/*     */   private dxa q;
/*     */   private dlj r;
/*     */   private dlj s;
/*     */   private dlj t;
/*     */   private List<nr> u;
/*     */   private dwz v;
/*     */   private eni.b w;
/*     */   private eni.a x;
/*     */   private boolean y;
/*     */   
/*     */   public drc(dot ☃) {
/*  42 */     super(new of("multiplayer.title"));
/*  43 */     this.p = ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void b() {
/*  48 */     super.b();
/*  49 */     this.i.m.a(true);
/*  50 */     if (this.y) {
/*  51 */       this.a.a(this.k, this.l, 32, this.l - 64);
/*     */     } else {
/*  53 */       this.y = true;
/*     */       
/*  55 */       this.q = new dxa(this.i);
/*  56 */       this.q.a();
/*     */       
/*  58 */       this.w = new eni.b();
/*     */       try {
/*  60 */         this.x = new eni.a(this.w);
/*  61 */         this.x.start();
/*  62 */       } catch (Exception ☃) {
/*  63 */         b.warn("Unable to start LAN server detection: {}", ☃.getMessage());
/*     */       } 
/*     */       
/*  66 */       this.a = new dre(this, this.i, this.k, this.l, 32, this.l - 64, 36);
/*  67 */       this.a.a(this.q);
/*     */     } 
/*     */     
/*  70 */     this.e.add(this.a);
/*     */     
/*  72 */     this.s = a(new dlj(this.k / 2 - 154, this.l - 52, 100, 20, new of("selectServer.select"), ☃ -> h()));
/*  73 */     a(new dlj(this.k / 2 - 50, this.l - 52, 100, 20, new of("selectServer.direct"), ☃ -> {
/*     */             this.v = new dwz(ekx.a("selectServer.defaultName", new Object[0]), "", false);
/*     */             this.i.a(new dnz(this, this::f, this.v));
/*     */           }));
/*  77 */     a(new dlj(this.k / 2 + 4 + 50, this.l - 52, 100, 20, new of("selectServer.add"), ☃ -> {
/*     */             this.v = new dwz(ekx.a("selectServer.defaultName", new Object[0]), "", false);
/*     */             
/*     */             this.i.a(new dob(this, this::e, this.v));
/*     */           }));
/*  82 */     this.r = a(new dlj(this.k / 2 - 154, this.l - 28, 70, 20, new of("selectServer.edit"), ☃ -> {
/*     */             dre.a a1 = this.a.h();
/*     */             
/*     */             if (a1 instanceof dre.d) {
/*     */               dwz dwz1 = ((dre.d)a1).b();
/*     */               
/*     */               this.v = new dwz(dwz1.a, dwz1.b, false);
/*     */               this.v.a(dwz1);
/*     */               this.i.a(new dob(this, this::d, this.v));
/*     */             } 
/*     */           }));
/*  93 */     this.t = a(new dlj(this.k / 2 - 74, this.l - 28, 70, 20, new of("selectServer.delete"), ☃ -> {
/*     */             dre.a a1 = this.a.h();
/*     */             
/*     */             if (a1 instanceof dre.d) {
/*     */               String str = (((dre.d)a1).b()).a;
/*     */               if (str != null) {
/*     */                 nr nr1 = new of("selectServer.deleteQuestion");
/*     */                 nr nr2 = new of("selectServer.deleteWarning", new Object[] { str });
/*     */                 nr nr3 = new of("selectServer.deleteButton");
/*     */                 nr nr4 = nq.d;
/*     */                 this.i.a(new dns(this::c, nr1, nr2, nr3, nr4));
/*     */               } 
/*     */             } 
/*     */           }));
/* 107 */     a(new dlj(this.k / 2 + 4, this.l - 28, 70, 20, new of("selectServer.refresh"), ☃ -> m()));
/* 108 */     a(new dlj(this.k / 2 + 4 + 76, this.l - 28, 75, 20, nq.d, ☃ -> this.i.a(this.p)));
/*     */     
/* 110 */     i();
/*     */   }
/*     */ 
/*     */   
/*     */   public void d() {
/* 115 */     super.d();
/*     */     
/* 117 */     if (this.w.a()) {
/* 118 */       List<enh> ☃ = this.w.c();
/* 119 */       this.w.b();
/*     */       
/* 121 */       this.a.a(☃);
/*     */     } 
/*     */     
/* 124 */     this.c.a();
/*     */   }
/*     */ 
/*     */   
/*     */   public void e() {
/* 129 */     this.i.m.a(false);
/* 130 */     if (this.x != null) {
/* 131 */       this.x.interrupt();
/* 132 */       this.x = null;
/*     */     } 
/* 134 */     this.c.b();
/*     */   }
/*     */   
/*     */   private void m() {
/* 138 */     this.i.a(new drc(this.p));
/*     */   }
/*     */   
/*     */   private void c(boolean ☃) {
/* 142 */     dre.a a1 = this.a.h();
/* 143 */     if (☃ && a1 instanceof dre.d) {
/* 144 */       this.q.a(((dre.d)a1).b());
/* 145 */       this.q.b();
/* 146 */       this.a.a((dre.a)null);
/* 147 */       this.a.a(this.q);
/*     */     } 
/* 149 */     this.i.a(this);
/*     */   }
/*     */   
/*     */   private void d(boolean ☃) {
/* 153 */     dre.a a1 = this.a.h();
/* 154 */     if (☃ && a1 instanceof dre.d) {
/* 155 */       dwz dwz1 = ((dre.d)a1).b();
/* 156 */       dwz1.a = this.v.a;
/* 157 */       dwz1.b = this.v.b;
/* 158 */       dwz1.a(this.v);
/* 159 */       this.q.b();
/* 160 */       this.a.a(this.q);
/*     */     } 
/* 162 */     this.i.a(this);
/*     */   }
/*     */   
/*     */   private void e(boolean ☃) {
/* 166 */     if (☃) {
/* 167 */       this.q.b(this.v);
/* 168 */       this.q.b();
/* 169 */       this.a.a((dre.a)null);
/* 170 */       this.a.a(this.q);
/*     */     } 
/* 172 */     this.i.a(this);
/*     */   }
/*     */   
/*     */   private void f(boolean ☃) {
/* 176 */     if (☃) {
/* 177 */       a(this.v);
/*     */     } else {
/* 179 */       this.i.a(this);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(int ☃, int i, int j) {
/* 185 */     if (super.a(☃, i, j)) {
/* 186 */       return true;
/*     */     }
/*     */     
/* 189 */     if (☃ == 294) {
/* 190 */       m();
/* 191 */       return true;
/*     */     } 
/*     */     
/* 194 */     if (this.a.h() != null) {
/* 195 */       if (☃ == 257 || ☃ == 335) {
/* 196 */         h();
/* 197 */         return true;
/*     */       } 
/* 199 */       return this.a.a(☃, i, j);
/*     */     } 
/*     */     
/* 202 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(dfm ☃, int i, int j, float f) {
/* 207 */     this.u = null;
/*     */     
/* 209 */     a(☃);
/*     */     
/* 211 */     this.a.a(☃, i, j, f);
/* 212 */     a(☃, this.o, this.d, this.k / 2, 20, 16777215);
/*     */     
/* 214 */     super.a(☃, i, j, f);
/*     */     
/* 216 */     if (this.u != null) {
/* 217 */       b(☃, this.u, i, j);
/*     */     }
/*     */   }
/*     */   
/*     */   public void h() {
/* 222 */     dre.a ☃ = this.a.h();
/*     */     
/* 224 */     if (☃ instanceof dre.d) {
/* 225 */       a(((dre.d)☃).b());
/* 226 */     } else if (☃ instanceof dre.c) {
/* 227 */       enh enh = ((dre.c)☃).a();
/* 228 */       a(new dwz(enh.a(), enh.b(), true));
/*     */     } 
/*     */   }
/*     */   
/*     */   private void a(dwz ☃) {
/* 233 */     this.i.a(new dnt(this, this.i, ☃));
/*     */   }
/*     */   
/*     */   public void a(dre.a ☃) {
/* 237 */     this.a.a(☃);
/*     */     
/* 239 */     i();
/*     */   }
/*     */   
/*     */   protected void i() {
/* 243 */     this.s.o = false;
/* 244 */     this.r.o = false;
/* 245 */     this.t.o = false;
/*     */     
/* 247 */     dre.a ☃ = this.a.h();
/* 248 */     if (☃ != null && !(☃ instanceof dre.b)) {
/* 249 */       this.s.o = true;
/* 250 */       if (☃ instanceof dre.d) {
/* 251 */         this.r.o = true;
/* 252 */         this.t.o = true;
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public dxb k() {
/* 258 */     return this.c;
/*     */   }
/*     */   
/*     */   public void b(List<nr> ☃) {
/* 262 */     this.u = ☃;
/*     */   }
/*     */   
/*     */   public dxa l() {
/* 266 */     return this.q;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\drc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */