/*     */ import com.mojang.blaze3d.systems.RenderSystem;
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
/*     */ public class dnx
/*     */   extends dot
/*     */ {
/*     */   private int a;
/*     */   private final nr b;
/*     */   private final boolean c;
/*     */   private nr p;
/*     */   
/*     */   public dnx(@Nullable nr ☃, boolean bool) {
/*  24 */     super(new of(bool ? "deathScreen.title.hardcore" : "deathScreen.title"));
/*  25 */     this.b = ☃;
/*  26 */     this.c = bool;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void b() {
/*  31 */     this.a = 0;
/*  32 */     a(new dlj(this.k / 2 - 100, this.l / 4 + 72, 200, 20, this.c ? new of("deathScreen.spectate") : new of("deathScreen.respawn"), ☃ -> {
/*     */             this.i.s.ey();
/*     */             this.i.a((dot)null);
/*     */           }));
/*  36 */     dlj ☃ = a(new dlj(this.k / 2 - 100, this.l / 4 + 96, 200, 20, new of("deathScreen.titleScreen"), ☃ -> {
/*     */             if (this.c) {
/*     */               h();
/*     */               
/*     */               return;
/*     */             } 
/*     */             dns dns = new dns(this::c, new of("deathScreen.quit.confirm"), oe.d, new of("deathScreen.titleScreen"), new of("deathScreen.respawn"));
/*     */             this.i.a(dns);
/*     */             dns.a(20);
/*     */           }));
/*  46 */     if (!this.c && this.i.J() == null) {
/*  47 */       ☃.o = false;
/*     */     }
/*  49 */     for (dlh dlh : this.m) {
/*  50 */       dlh.o = false;
/*     */     }
/*  52 */     this.p = (new of("deathScreen.score")).c(": ").a((new oe(Integer.toString(this.i.s.ev()))).a(k.o));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean as_() {
/*  57 */     return false;
/*     */   }
/*     */   
/*     */   private void c(boolean ☃) {
/*  61 */     if (☃) {
/*  62 */       h();
/*     */     } else {
/*  64 */       this.i.s.ey();
/*  65 */       this.i.a((dot)null);
/*     */     } 
/*     */   }
/*     */   
/*     */   private void h() {
/*  70 */     if (this.i.r != null) {
/*  71 */       this.i.r.S();
/*     */     }
/*  73 */     this.i.b(new dod(new of("menu.savingLevel")));
/*  74 */     this.i.a(new doy());
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(dfm ☃, int i, int j, float f) {
/*  79 */     a(☃, 0, 0, this.k, this.l, 1615855616, -1602211792);
/*     */     
/*  81 */     RenderSystem.pushMatrix();
/*  82 */     RenderSystem.scalef(2.0F, 2.0F, 2.0F);
/*  83 */     a(☃, this.o, this.d, this.k / 2 / 2, 30, 16777215);
/*  84 */     RenderSystem.popMatrix();
/*     */     
/*  86 */     if (this.b != null) {
/*  87 */       a(☃, this.o, this.b, this.k / 2, 85, 16777215);
/*     */     }
/*     */     
/*  90 */     a(☃, this.o, this.p, this.k / 2, 100, 16777215);
/*     */     
/*  92 */     this.o.getClass(); if (this.b != null && j > 85 && j < 85 + 9) {
/*  93 */       ob ob = a(i);
/*  94 */       a(☃, ob, i, j);
/*     */     } 
/*     */     
/*  97 */     super.a(☃, i, j, f);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   private ob a(int ☃) {
/* 102 */     if (this.b == null) {
/* 103 */       return null;
/*     */     }
/*     */     
/* 106 */     int i = this.i.g.a(this.b);
/* 107 */     int j = this.k / 2 - i / 2;
/* 108 */     int k = this.k / 2 + i / 2;
/* 109 */     if (☃ < j || ☃ > k) {
/* 110 */       return null;
/*     */     }
/* 112 */     return this.i.g.b().a(this.b, ☃ - j);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(double ☃, double d1, int i) {
/* 117 */     this.o.getClass(); if (this.b != null && d1 > 85.0D && d1 < (85 + 9)) {
/* 118 */       ob ob = a((int)☃);
/* 119 */       if (ob != null && ob.h() != null && ob.h().a() == np.a.a) {
/* 120 */         a(ob);
/* 121 */         return false;
/*     */       } 
/*     */     } 
/* 124 */     return super.a(☃, d1, i);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean ay_() {
/* 129 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public void d() {
/* 134 */     super.d();
/*     */     
/* 136 */     this.a++;
/* 137 */     if (this.a == 20)
/* 138 */       for (dlh ☃ : this.m)
/* 139 */         ☃.o = true;  
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dnx.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */