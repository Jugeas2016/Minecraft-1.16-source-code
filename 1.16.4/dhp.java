/*     */ import com.mojang.blaze3d.systems.RenderSystem;
/*     */ import java.text.DateFormat;
/*     */ import java.util.Collections;
/*     */ import java.util.Date;
/*     */ import java.util.List;
/*     */ import javax.annotation.Nullable;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class dhp
/*     */   extends eoo
/*     */ {
/*  35 */   private static final Logger a = LogManager.getLogger();
/*     */   
/*  37 */   private static final vk b = new vk("realms", "textures/gui/realms/plus_icon.png");
/*  38 */   private static final vk c = new vk("realms", "textures/gui/realms/restore_icon.png");
/*  39 */   private static final nr p = new of("mco.backup.button.restore");
/*     */   
/*  41 */   private static final nr q = new of("mco.backup.changes.tooltip");
/*  42 */   private static final nr r = new of("mco.configure.world.backup");
/*  43 */   private static final nr s = new of("mco.backup.nobackups");
/*     */   
/*  45 */   private static int t = -1;
/*     */   
/*     */   private final dhs u;
/*     */   
/*  49 */   private List<dgg> v = Collections.emptyList();
/*     */   
/*     */   @Nullable
/*     */   private nr w;
/*     */   
/*     */   private a x;
/*  55 */   private int y = -1;
/*     */   
/*     */   private final int z;
/*     */   
/*     */   private dlj A;
/*     */   
/*     */   private dlj B;
/*     */   private dlj C;
/*  63 */   private Boolean D = Boolean.valueOf(false);
/*     */   
/*     */   private final dgq E;
/*     */   
/*     */   private eom F;
/*     */ 
/*     */   
/*     */   public dhp(dhs ☃, dgq dgq1, int i) {
/*  71 */     this.u = ☃;
/*  72 */     this.E = dgq1;
/*  73 */     this.z = i;
/*     */   }
/*     */ 
/*     */   
/*     */   public void b() {
/*  78 */     this.i.m.a(true);
/*     */     
/*  80 */     this.x = new a(this);
/*     */     
/*  82 */     if (t != -1) {
/*  83 */       this.x.a(t);
/*     */     }
/*     */     
/*  86 */     (new Thread(this, "Realms-fetch-backups")
/*     */       {
/*     */         public void run() {
/*  89 */           dgb ☃ = dgb.a();
/*     */           try {
/*  91 */             List<dgg> list = (☃.d((dhp.a(this.a)).a)).a;
/*  92 */             dhp.b(this.a).execute(() -> {
/*     */                   dhp.a(this.a, ☃);
/*     */                   dhp.a(this.a, Boolean.valueOf(dhp.c(this.a).isEmpty()));
/*     */                   dhp.d(this.a).a();
/*     */                   for (dgg dgg : dhp.c(this.a)) {
/*     */                     dhp.d(this.a).a(dgg);
/*     */                   }
/*     */                   dhp.e(this.a);
/*     */                 });
/* 101 */           } catch (dhi dhi) {
/* 102 */             dhp.a().error("Couldn't request backups", dhi);
/*     */           } 
/*     */         }
/* 105 */       }).start();
/*     */     
/* 107 */     this.A = a(new dlj(this.k - 135, j(1), 120, 20, new of("mco.backup.button.download"), ☃ -> n()));
/*     */ 
/*     */     
/* 110 */     this.B = a(new dlj(this.k - 135, j(3), 120, 20, new of("mco.backup.button.restore"), ☃ -> b(this.y)));
/*     */ 
/*     */     
/* 113 */     this.C = a(new dlj(this.k - 135, j(5), 120, 20, new of("mco.backup.changes.tooltip"), ☃ -> {
/*     */             this.i.a(new dho(this, this.v.get(this.y)));
/*     */             this.y = -1;
/*     */           }));
/* 117 */     a(new dlj(this.k - 100, this.l - 35, 85, 20, nq.h, ☃ -> this.i.a(this.u)));
/*     */ 
/*     */ 
/*     */     
/* 121 */     d(this.x);
/* 122 */     this.F = d(new eom(new of("mco.configure.world.backup"), this.k / 2, 12, 16777215));
/* 123 */     c(this.x);
/*     */     
/* 125 */     k();
/* 126 */     A();
/*     */   }
/*     */   
/*     */   private void i() {
/* 130 */     if (this.v.size() <= 1) {
/*     */       return;
/*     */     }
/*     */     
/* 134 */     for (int ☃ = 0; ☃ < this.v.size() - 1; ☃++) {
/* 135 */       dgg dgg1 = this.v.get(☃);
/* 136 */       dgg dgg2 = this.v.get(☃ + 1);
/*     */       
/* 138 */       if (!dgg1.d.isEmpty() && !dgg2.d.isEmpty())
/*     */       {
/*     */ 
/*     */         
/* 142 */         for (String str : dgg1.d.keySet()) {
/* 143 */           if (!str.contains("Uploaded") && dgg2.d.containsKey(str)) {
/* 144 */             if (!((String)dgg1.d.get(str)).equals(dgg2.d.get(str)))
/* 145 */               a(dgg1, str); 
/*     */             continue;
/*     */           } 
/* 148 */           a(dgg1, str);
/*     */         } 
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   private void a(dgg ☃, String str) {
/* 155 */     if (str.contains("Uploaded")) {
/* 156 */       String str1 = DateFormat.getDateTimeInstance(3, 3).format(☃.b);
/* 157 */       ☃.e.put(str, str1);
/* 158 */       ☃.a(true);
/*     */     } else {
/* 160 */       ☃.e.put(str, ☃.d.get(str));
/*     */     } 
/*     */   }
/*     */   
/*     */   private void k() {
/* 165 */     this.B.p = m();
/* 166 */     this.C.p = l();
/*     */   }
/*     */   
/*     */   private boolean l() {
/* 170 */     if (this.y == -1) {
/* 171 */       return false;
/*     */     }
/*     */     
/* 174 */     return !((dgg)this.v.get(this.y)).e.isEmpty();
/*     */   }
/*     */   
/*     */   private boolean m() {
/* 178 */     if (this.y == -1) {
/* 179 */       return false;
/*     */     }
/* 181 */     return !this.E.j;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(int ☃, int i, int j) {
/* 186 */     if (☃ == 256) {
/* 187 */       this.i.a(this.u);
/* 188 */       return true;
/*     */     } 
/* 190 */     return super.a(☃, i, j);
/*     */   }
/*     */   
/*     */   private void b(int ☃) {
/* 194 */     if (☃ >= 0 && ☃ < this.v.size() && !this.E.j) {
/* 195 */       this.y = ☃;
/* 196 */       Date date = ((dgg)this.v.get(☃)).b;
/* 197 */       String str1 = DateFormat.getDateTimeInstance(3, 3).format(date);
/* 198 */       String str2 = dis.a(date);
/* 199 */       nr nr1 = new of("mco.configure.world.restore.question.line1", new Object[] { str1, str2 });
/* 200 */       nr nr2 = new of("mco.configure.world.restore.question.line2");
/* 201 */       this.i.a(new dhy(☃ -> { if (☃) { p(); } else { this.y = -1; this.i.a(this); }  }dhy.a.a, nr1, nr2, true));
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void n() {
/* 213 */     nr ☃ = new of("mco.configure.world.restore.download.question.line1");
/* 214 */     nr nr1 = new of("mco.configure.world.restore.download.question.line2");
/* 215 */     this.i.a(new dhy(☃ -> { if (☃) { o(); } else { this.i.a(this); }  }dhy.a.b, ☃, nr1, true));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void o() {
/* 225 */     this.i.a(new dhz(this.u.c(), new diy(this.E.a, this.z, this.E.c + " (" + ((dgw)this.E.i.get(Integer.valueOf(this.E.n))).a(this.E.n) + ")", this)));
/*     */   }
/*     */   
/*     */   private void p() {
/* 229 */     dgg ☃ = this.v.get(this.y);
/* 230 */     this.y = -1;
/* 231 */     this.i.a(new dhz(this.u.c(), new djd(☃, this.E.a, this.u)));
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(dfm ☃, int i, int j, float f) {
/* 236 */     this.w = null;
/*     */     
/* 238 */     a(☃);
/*     */     
/* 240 */     this.x.a(☃, i, j, f);
/* 241 */     this.F.a(this, ☃);
/* 242 */     this.o.b(☃, r, ((this.k - 150) / 2 - 90), 20.0F, 10526880);
/*     */     
/* 244 */     if (this.D.booleanValue()) {
/* 245 */       this.o.b(☃, s, 20.0F, (this.l / 2 - 10), 16777215);
/*     */     }
/*     */     
/* 248 */     this.A.o = !this.D.booleanValue();
/*     */     
/* 250 */     super.a(☃, i, j, f);
/* 251 */     if (this.w != null) {
/* 252 */       a(☃, this.w, i, j);
/*     */     }
/*     */   }
/*     */   
/*     */   protected void a(dfm ☃, @Nullable nr nr1, int i, int j) {
/* 257 */     if (nr1 == null) {
/*     */       return;
/*     */     }
/*     */     
/* 261 */     int k = i + 12;
/* 262 */     int m = j - 12;
/* 263 */     int n = this.o.a(nr1);
/* 264 */     a(☃, k - 3, m - 3, k + n + 3, m + 8 + 3, -1073741824, -1073741824);
/*     */     
/* 266 */     this.o.a(☃, nr1, k, m, 16777215);
/*     */   }
/*     */   
/*     */   class a extends eon<b> {
/*     */     public a(dhp this$0) {
/* 271 */       super(this$0.k - 150, this$0.l, 32, this$0.l - 15, 36);
/*     */     }
/*     */     
/*     */     public void a(dgg ☃) {
/* 275 */       a(new dhp.b(this.a, ☃));
/*     */     }
/*     */ 
/*     */     
/*     */     public int d() {
/* 280 */       return (int)(this.d * 0.93D);
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean b() {
/* 285 */       return (this.a.aw_() == this);
/*     */     }
/*     */ 
/*     */     
/*     */     public int c() {
/* 290 */       return l() * 36;
/*     */     }
/*     */ 
/*     */     
/*     */     public void a(dfm ☃) {
/* 295 */       this.a.a(☃);
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean a(double ☃, double d1, int i) {
/* 300 */       if (i != 0) {
/* 301 */         return false;
/*     */       }
/* 303 */       if (☃ < e() && d1 >= this.i && d1 <= this.j) {
/* 304 */         int j = this.d / 2 - 92;
/* 305 */         int k = this.d;
/*     */         
/* 307 */         int m = (int)Math.floor(d1 - this.i) - this.n + (int)m();
/* 308 */         int n = m / this.c;
/* 309 */         if (☃ >= j && ☃ <= k && n >= 0 && m >= 0 && n < l()) {
/* 310 */           a(n);
/* 311 */           a(m, n, ☃, d1, this.d);
/*     */         } 
/* 313 */         return true;
/*     */       } 
/* 315 */       return false;
/*     */     }
/*     */ 
/*     */     
/*     */     public int e() {
/* 320 */       return this.d - 5;
/*     */     }
/*     */ 
/*     */     
/*     */     public void a(int ☃, int i, double d1, double d2, int j) {
/* 325 */       int k = this.d - 35;
/* 326 */       int m = i * this.c + 36 - (int)m();
/*     */       
/* 328 */       int n = k + 10;
/* 329 */       int i1 = m - 3;
/*     */       
/* 331 */       if (d1 >= k && d1 <= (k + 9) && d2 >= m && d2 <= (m + 9)) {
/* 332 */         if (!((dgg)dhp.c(this.a).get(i)).e.isEmpty()) {
/* 333 */           dhp.a(this.a, -1);
/* 334 */           dhp.a((int)m());
/* 335 */           this.b.a(new dho(this.a, dhp.c(this.a).get(i)));
/*     */         } 
/* 337 */       } else if (d1 >= n && d1 < (n + 13) && d2 >= i1 && d2 < (i1 + 15)) {
/* 338 */         dhp.a((int)m());
/* 339 */         dhp.b(this.a, i);
/*     */       } 
/*     */     }
/*     */ 
/*     */     
/*     */     public void a(int ☃) {
/* 345 */       j(☃);
/* 346 */       if (☃ != -1) {
/* 347 */         eoj.a(ekx.a("narrator.select", new Object[] { ((dgg)dhp.c(this.a).get(☃)).b.toString() }));
/*     */       }
/* 349 */       b(☃);
/*     */     }
/*     */     
/*     */     public void b(int ☃) {
/* 353 */       dhp.a(this.a, ☃);
/* 354 */       dhp.f(this.a);
/*     */     }
/*     */ 
/*     */     
/*     */     public void a(@Nullable dhp.b ☃) {
/* 359 */       super.a(☃);
/*     */       
/* 361 */       dhp.a(this.a, au_().indexOf(☃));
/* 362 */       dhp.f(this.a);
/*     */     }
/*     */   }
/*     */   
/*     */   class b extends dlv.a<b> {
/*     */     private final dgg b;
/*     */     
/*     */     public b(dhp this$0, dgg ☃) {
/* 370 */       this.b = ☃;
/*     */     }
/*     */ 
/*     */     
/*     */     public void a(dfm ☃, int i, int j, int k, int m, int n, int i1, int i2, boolean bool, float f) {
/* 375 */       a(☃, this.b, k - 40, j, i1, i2);
/*     */     }
/*     */     
/*     */     private void a(dfm ☃, dgg dgg1, int i, int j, int k, int m) {
/* 379 */       int n = dgg1.a() ? -8388737 : 16777215;
/* 380 */       dhp.g(this.a).b(☃, "Backup (" + dis.a(dgg1.b) + ")", (i + 40), (j + 1), n);
/* 381 */       dhp.h(this.a).b(☃, a(dgg1.b), (i + 40), (j + 12), 5000268);
/*     */       
/* 383 */       int i1 = this.a.k - 175;
/* 384 */       int i2 = -3;
/*     */       
/* 386 */       int i3 = i1 - 10;
/* 387 */       int i4 = 0;
/*     */       
/* 389 */       if (!(dhp.a(this.a)).j) {
/* 390 */         a(☃, i1, j + -3, k, m);
/*     */       }
/*     */       
/* 393 */       if (!dgg1.e.isEmpty()) {
/* 394 */         b(☃, i3, j + 0, k, m);
/*     */       }
/*     */     }
/*     */     
/*     */     private String a(Date ☃) {
/* 399 */       return DateFormat.getDateTimeInstance(3, 3).format(☃);
/*     */     }
/*     */     
/*     */     private void a(dfm ☃, int i, int j, int k, int m) {
/* 403 */       boolean bool = (k >= i && k <= i + 12 && m >= j && m <= j + 14 && m < this.a.l - 15 && m > 32);
/*     */       
/* 405 */       dhp.i(this.a).M().a(dhp.c());
/* 406 */       RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 407 */       RenderSystem.pushMatrix();
/* 408 */       RenderSystem.scalef(0.5F, 0.5F, 0.5F);
/* 409 */       float f = bool ? 28.0F : 0.0F;
/* 410 */       dkw.a(☃, i * 2, j * 2, 0.0F, f, 23, 28, 23, 56);
/* 411 */       RenderSystem.popMatrix();
/*     */       
/* 413 */       if (bool) {
/* 414 */         dhp.a(this.a, dhp.f());
/*     */       }
/*     */     }
/*     */     
/*     */     private void b(dfm ☃, int i, int j, int k, int m) {
/* 419 */       boolean bool = (k >= i && k <= i + 8 && m >= j && m <= j + 8 && m < this.a.l - 15 && m > 32);
/*     */       
/* 421 */       dhp.j(this.a).M().a(dhp.g());
/* 422 */       RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 423 */       RenderSystem.pushMatrix();
/* 424 */       RenderSystem.scalef(0.5F, 0.5F, 0.5F);
/* 425 */       float f = bool ? 15.0F : 0.0F;
/* 426 */       dkw.a(☃, i * 2, j * 2, 0.0F, f, 15, 15, 15, 30);
/* 427 */       RenderSystem.popMatrix();
/*     */       
/* 429 */       if (bool)
/* 430 */         dhp.a(this.a, dhp.h()); 
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dhp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */