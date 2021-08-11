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
/*     */ public class dqn
/*     */   extends dot
/*     */ {
/*  24 */   private static final nr a = new of("jigsaw_block.joint_label");
/*  25 */   private static final nr b = new of("jigsaw_block.pool");
/*  26 */   private static final nr c = new of("jigsaw_block.name");
/*  27 */   private static final nr p = new of("jigsaw_block.target");
/*  28 */   private static final nr q = new of("jigsaw_block.final_state");
/*     */   
/*     */   private final ccz r;
/*     */   
/*     */   private dlq s;
/*     */   
/*     */   private dlq t;
/*     */   
/*     */   private dlq u;
/*     */   
/*     */   private dlq v;
/*     */   private int w;
/*     */   private boolean x = true;
/*     */   private dlj y;
/*     */   private dlj z;
/*     */   private ccz.a A;
/*     */   
/*     */   public dqn(ccz ☃) {
/*  46 */     super(dkz.a);
/*  47 */     this.r = ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public void d() {
/*  52 */     this.s.a();
/*  53 */     this.t.a();
/*  54 */     this.u.a();
/*  55 */     this.v.a();
/*     */   }
/*     */   
/*     */   private void h() {
/*  59 */     k();
/*  60 */     this.i.a((dot)null);
/*     */   }
/*     */   
/*     */   private void i() {
/*  64 */     this.i.a((dot)null);
/*     */   }
/*     */   
/*     */   private void k() {
/*  68 */     this.i.w().a(new tn(this.r
/*  69 */           .o(), new vk(this.s
/*  70 */             .b()), new vk(this.t
/*  71 */             .b()), new vk(this.u
/*  72 */             .b()), this.v
/*  73 */           .b(), this.A));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private void l() {
/*  79 */     this.i.w().a(new sq(this.r
/*  80 */           .o(), this.w, this.x));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void at_() {
/*  88 */     i();
/*     */   }
/*     */ 
/*     */   
/*     */   protected void b() {
/*  93 */     this.i.m.a(true);
/*     */     
/*  95 */     this.u = new dlq(this.o, this.k / 2 - 152, 20, 300, 20, new of("jigsaw_block.pool"));
/*  96 */     this.u.k(128);
/*  97 */     this.u.a(this.r.g().toString());
/*  98 */     this.u.a(☃ -> m());
/*  99 */     this.e.add(this.u);
/*     */     
/* 101 */     this.s = new dlq(this.o, this.k / 2 - 152, 55, 300, 20, new of("jigsaw_block.name"));
/* 102 */     this.s.k(128);
/* 103 */     this.s.a(this.r.d().toString());
/* 104 */     this.s.a(☃ -> m());
/* 105 */     this.e.add(this.s);
/*     */     
/* 107 */     this.t = new dlq(this.o, this.k / 2 - 152, 90, 300, 20, new of("jigsaw_block.target"));
/* 108 */     this.t.k(128);
/* 109 */     this.t.a(this.r.f().toString());
/* 110 */     this.t.a(☃ -> m());
/* 111 */     this.e.add(this.t);
/*     */     
/* 113 */     this.v = new dlq(this.o, this.k / 2 - 152, 125, 300, 20, new of("jigsaw_block.final_state"));
/* 114 */     this.v.k(256);
/* 115 */     this.v.a(this.r.h());
/* 116 */     this.e.add(this.v);
/*     */     
/* 118 */     this.A = this.r.j();
/* 119 */     int ☃ = this.o.a(a) + 10;
/* 120 */     this.y = a(new dlj(this.k / 2 - 152 + ☃, 150, 300 - ☃, 20, n(), ☃ -> {
/*     */             ccz.a[] arrayOfA = ccz.a.values();
/*     */             int i = (this.A.ordinal() + 1) % arrayOfA.length;
/*     */             this.A = arrayOfA[i];
/*     */             ☃.a(n());
/*     */           }));
/* 126 */     boolean bool = bxr.h(this.r.p()).n().c();
/* 127 */     this.y.o = bool;
/* 128 */     this.y.p = bool;
/*     */     
/* 130 */     a(new dlg(this, this.k / 2 - 154, 180, 100, 20, oe.d, 0.0D)
/*     */         {
/*     */ 
/*     */ 
/*     */           
/*     */           protected void b()
/*     */           {
/* 137 */             a(new of("jigsaw_block.levels", new Object[] { Integer.valueOf(dqn.a(this.a)) }));
/*     */           }
/*     */ 
/*     */           
/*     */           protected void a() {
/* 142 */             dqn.a(this.a, afm.c(afm.b(0.0D, 7.0D, this.b)));
/*     */           }
/*     */         });
/*     */     
/* 146 */     a(new dlj(this, this.k / 2 - 50, 180, 100, 20, new of("jigsaw_block.keep_jigsaws"), ☃ -> {
/*     */             this.x = !this.x;
/*     */             ☃.c(250);
/*     */           })
/*     */         {
/*     */           public nr i() {
/* 152 */             return nq.a(super.i(), dqn.b(this.a));
/*     */           }
/*     */         });
/*     */     
/* 156 */     a(new dlj(this.k / 2 + 54, 180, 100, 20, new of("jigsaw_block.generate"), ☃ -> {
/*     */             h();
/*     */             
/*     */             l();
/*     */           }));
/*     */     
/* 162 */     this.z = a(new dlj(this.k / 2 - 4 - 150, 210, 150, 20, nq.c, ☃ -> h()));
/* 163 */     a(new dlj(this.k / 2 + 4, 210, 150, 20, nq.d, ☃ -> i()));
/*     */     
/* 165 */     b(this.u);
/* 166 */     m();
/*     */   }
/*     */   
/*     */   private void m() {
/* 170 */     this.z
/*     */       
/* 172 */       .o = (vk.b(this.s.b()) && vk.b(this.t.b()) && vk.b(this.u.b()));
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(djz ☃, int i, int j) {
/* 177 */     String str1 = this.s.b();
/* 178 */     String str2 = this.t.b();
/* 179 */     String str3 = this.u.b();
/* 180 */     String str4 = this.v.b();
/* 181 */     int k = this.w;
/* 182 */     ccz.a a1 = this.A;
/*     */     
/* 184 */     b(☃, i, j);
/*     */     
/* 186 */     this.s.a(str1);
/* 187 */     this.t.a(str2);
/* 188 */     this.u.a(str3);
/* 189 */     this.v.a(str4);
/* 190 */     this.w = k;
/* 191 */     this.A = a1;
/* 192 */     this.y.a(n());
/*     */   }
/*     */   
/*     */   private nr n() {
/* 196 */     return new of("jigsaw_block.joint." + this.A.a());
/*     */   }
/*     */ 
/*     */   
/*     */   public void e() {
/* 201 */     this.i.m.a(false);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(int ☃, int i, int j) {
/* 206 */     if (super.a(☃, i, j)) {
/* 207 */       return true;
/*     */     }
/*     */     
/* 210 */     if (this.z.o && (☃ == 257 || ☃ == 335)) {
/* 211 */       h();
/* 212 */       return true;
/*     */     } 
/*     */     
/* 215 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(dfm ☃, int i, int j, float f) {
/* 220 */     a(☃);
/*     */     
/* 222 */     b(☃, this.o, b, this.k / 2 - 153, 10, 10526880);
/* 223 */     this.u.a(☃, i, j, f);
/*     */     
/* 225 */     b(☃, this.o, c, this.k / 2 - 153, 45, 10526880);
/* 226 */     this.s.a(☃, i, j, f);
/*     */     
/* 228 */     b(☃, this.o, p, this.k / 2 - 153, 80, 10526880);
/* 229 */     this.t.a(☃, i, j, f);
/*     */     
/* 231 */     b(☃, this.o, q, this.k / 2 - 153, 115, 10526880);
/* 232 */     this.v.a(☃, i, j, f);
/*     */     
/* 234 */     if (bxr.h(this.r.p()).n().c()) {
/* 235 */       b(☃, this.o, a, this.k / 2 - 153, 156, 16777215);
/*     */     }
/*     */     
/* 238 */     super.a(☃, i, j, f);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dqn.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */