/*     */ import com.mojang.blaze3d.systems.RenderSystem;
/*     */ import java.util.List;
/*     */ import java.util.function.Consumer;
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
/*     */ public class dnv
/*     */   extends dot
/*     */ {
/*     */   protected final dsf a;
/*     */   private final Consumer<cpf> b;
/*     */   private cpf c;
/*     */   private nr p;
/*     */   private nr q;
/*     */   private a r;
/*     */   private dlj s;
/*     */   
/*     */   public dnv(dsf ☃, Consumer<cpf> consumer, cpf cpf1) {
/*  44 */     super(new of("createWorld.customize.flat.title"));
/*  45 */     this.a = ☃;
/*  46 */     this.b = consumer;
/*  47 */     this.c = cpf1;
/*     */   }
/*     */   
/*     */   public cpf h() {
/*  51 */     return this.c;
/*     */   }
/*     */   
/*     */   public void a(cpf ☃) {
/*  55 */     this.c = ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void b() {
/*  60 */     this.p = new of("createWorld.customize.flat.tile");
/*  61 */     this.q = new of("createWorld.customize.flat.height");
/*     */     
/*  63 */     this.r = new a(this);
/*  64 */     this.e.add(this.r);
/*     */     
/*  66 */     this.s = a(new dlj(this.k / 2 - 155, this.l - 52, 150, 20, new of("createWorld.customize.flat.removeLayer"), ☃ -> {
/*     */             if (!k()) {
/*     */               return;
/*     */             }
/*     */             
/*     */             List<cpe> list = this.c.f();
/*     */             
/*     */             int i = this.r.au_().indexOf(this.r.h());
/*     */             int j = list.size() - i - 1;
/*     */             list.remove(j);
/*     */             this.r.a(list.isEmpty() ? null : this.r.au_().get(Math.min(i, list.size() - 1)));
/*     */             this.c.h();
/*     */             this.r.f();
/*     */             i();
/*     */           }));
/*  81 */     a(new dlj(this.k / 2 + 5, this.l - 52, 150, 20, new of("createWorld.customize.presets"), ☃ -> {
/*     */             this.i.a(new doq(this));
/*     */             
/*     */             this.c.h();
/*     */             i();
/*     */           }));
/*  87 */     a(new dlj(this.k / 2 - 155, this.l - 28, 150, 20, nq.c, ☃ -> {
/*     */             this.b.accept(this.c);
/*     */             
/*     */             this.i.a(this.a);
/*     */             this.c.h();
/*     */           }));
/*  93 */     a(new dlj(this.k / 2 + 5, this.l - 28, 150, 20, nq.d, ☃ -> {
/*     */             this.i.a(this.a);
/*     */             
/*     */             this.c.h();
/*     */           }));
/*  98 */     this.c.h();
/*  99 */     i();
/*     */   }
/*     */   
/*     */   private void i() {
/* 103 */     this.s.o = k();
/*     */   }
/*     */   
/*     */   private boolean k() {
/* 107 */     return (this.r.h() != null);
/*     */   }
/*     */ 
/*     */   
/*     */   public void at_() {
/* 112 */     this.i.a(this.a);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(dfm ☃, int i, int j, float f) {
/* 117 */     a(☃);
/*     */     
/* 119 */     this.r.a(☃, i, j, f);
/* 120 */     a(☃, this.o, this.d, this.k / 2, 8, 16777215);
/*     */     
/* 122 */     int k = this.k / 2 - 92 - 16;
/* 123 */     b(☃, this.o, this.p, k, 32, 16777215);
/* 124 */     b(☃, this.o, this.q, k + 2 + 213 - this.o.a(this.q), 32, 16777215);
/*     */     
/* 126 */     super.a(☃, i, j, f);
/*     */   }
/*     */   
/*     */   class a extends dlv<a.a> {
/*     */     public a(dnv this$0) {
/* 131 */       super(this$0.i, this$0.k, this$0.l, 43, this$0.l - 60, 24);
/*     */       
/* 133 */       for (int ☃ = 0; ☃ < dnv.a(this$0).f().size(); ☃++) {
/* 134 */         b(new a());
/*     */       }
/*     */     }
/*     */ 
/*     */     
/*     */     public void a(@Nullable a ☃) {
/* 140 */       super.a(☃);
/*     */       
/* 142 */       if (☃ != null) {
/* 143 */         cpe cpe = dnv.a(this.a).f().get(dnv.a(this.a).f().size() - au_().indexOf(☃) - 1);
/* 144 */         blx blx = cpe.b().b().h();
/* 145 */         if (blx != bmd.a) {
/* 146 */           dkz.b.a((new of("narrator.select", new Object[] { blx.h(new bmb(blx)) })).getString());
/*     */         }
/*     */       } 
/* 149 */       dnv.b(this.a);
/*     */     }
/*     */ 
/*     */     
/*     */     protected boolean b() {
/* 154 */       return (this.a.aw_() == this);
/*     */     }
/*     */ 
/*     */     
/*     */     protected int e() {
/* 159 */       return this.d - 70;
/*     */     }
/*     */     
/*     */     public void f() {
/* 163 */       int ☃ = au_().indexOf(h());
/* 164 */       k();
/* 165 */       for (int i = 0; i < dnv.a(this.a).f().size(); i++) {
/* 166 */         b(new a());
/*     */       }
/*     */       
/* 169 */       List<a> list = au_();
/* 170 */       if (☃ >= 0 && ☃ < list.size())
/* 171 */         a(list.get(☃)); 
/*     */     }
/*     */     
/*     */     class a extends dlv.a<a> { private a(dnv.a this$0) {}
/*     */       
/*     */       public void a(dfm ☃, int i, int j, int k, int m, int n, int i1, int i2, boolean bool, float f) {
/*     */         String str;
/* 178 */         cpe cpe = dnv.a(this.a.a).f().get(dnv.a(this.a.a).f().size() - i - 1);
/* 179 */         ceh ceh = cpe.b();
/*     */         
/* 181 */         blx blx = ceh.b().h();
/* 182 */         if (blx == bmd.a) {
/* 183 */           if (ceh.a(bup.A)) {
/* 184 */             blx = bmd.lL;
/* 185 */           } else if (ceh.a(bup.B)) {
/* 186 */             blx = bmd.lM;
/*     */           } 
/*     */         }
/* 189 */         bmb bmb = new bmb(blx);
/* 190 */         a(☃, k, j, bmb);
/* 191 */         this.a.a.o.b(☃, blx.h(bmb), (k + 18 + 5), (j + 3), 16777215);
/*     */ 
/*     */ 
/*     */         
/* 195 */         if (i == 0) {
/* 196 */           str = ekx.a("createWorld.customize.flat.layer.top", new Object[] { Integer.valueOf(cpe.a()) });
/* 197 */         } else if (i == dnv.a(this.a.a).f().size() - 1) {
/* 198 */           str = ekx.a("createWorld.customize.flat.layer.bottom", new Object[] { Integer.valueOf(cpe.a()) });
/*     */         } else {
/* 200 */           str = ekx.a("createWorld.customize.flat.layer", new Object[] { Integer.valueOf(cpe.a()) });
/*     */         } 
/*     */         
/* 203 */         this.a.a.o.b(☃, str, (k + 2 + 213 - this.a.a.o.b(str)), (j + 3), 16777215);
/*     */       }
/*     */ 
/*     */       
/*     */       public boolean a(double ☃, double d1, int i) {
/* 208 */         if (i == 0) {
/* 209 */           this.a.a(this);
/* 210 */           return true;
/*     */         } 
/* 212 */         return false;
/*     */       }
/*     */       
/*     */       private void a(dfm ☃, int i, int j, bmb bmb1) {
/* 216 */         a(☃, i + 1, j + 1);
/*     */         
/* 218 */         RenderSystem.enableRescaleNormal();
/*     */         
/* 220 */         if (!bmb1.a()) {
/* 221 */           this.a.a.j.a(bmb1, i + 2, j + 2);
/*     */         }
/*     */         
/* 224 */         RenderSystem.disableRescaleNormal();
/*     */       }
/*     */       
/*     */       private void a(dfm ☃, int i, int j) {
/* 228 */         RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 229 */         dnv.a.a(this.a).M().a(dkw.g);
/*     */         
/* 231 */         dkw.a(☃, i, j, this.a.a.v(), 0.0F, 0.0F, 18, 18, 128, 128); } } } class a extends dlv.a<a.a> { private void a(dfm ☃, int i, int j) { RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F); dnv.a.a(this.a).M().a(dkw.g); dkw.a(☃, i, j, this.a.a.v(), 0.0F, 0.0F, 18, 18, 128, 128); }
/*     */ 
/*     */     
/*     */     private a(dnv this$0) {}
/*     */     
/*     */     public void a(dfm ☃, int i, int j, int k, int m, int n, int i1, int i2, boolean bool, float f) {
/*     */       String str;
/*     */       cpe cpe = dnv.a(this.a.a).f().get(dnv.a(this.a.a).f().size() - i - 1);
/*     */       ceh ceh = cpe.b();
/*     */       blx blx = ceh.b().h();
/*     */       if (blx == bmd.a)
/*     */         if (ceh.a(bup.A)) {
/*     */           blx = bmd.lL;
/*     */         } else if (ceh.a(bup.B)) {
/*     */           blx = bmd.lM;
/*     */         }  
/*     */       bmb bmb = new bmb(blx);
/*     */       a(☃, k, j, bmb);
/*     */       this.a.a.o.b(☃, blx.h(bmb), (k + 18 + 5), (j + 3), 16777215);
/*     */       if (i == 0) {
/*     */         str = ekx.a("createWorld.customize.flat.layer.top", new Object[] { Integer.valueOf(cpe.a()) });
/*     */       } else if (i == dnv.a(this.a.a).f().size() - 1) {
/*     */         str = ekx.a("createWorld.customize.flat.layer.bottom", new Object[] { Integer.valueOf(cpe.a()) });
/*     */       } else {
/*     */         str = ekx.a("createWorld.customize.flat.layer", new Object[] { Integer.valueOf(cpe.a()) });
/*     */       } 
/*     */       this.a.a.o.b(☃, str, (k + 2 + 213 - this.a.a.o.b(str)), (j + 3), 16777215);
/*     */     }
/*     */     
/*     */     public boolean a(double ☃, double d1, int i) {
/*     */       if (i == 0) {
/*     */         this.a.a(this);
/*     */         return true;
/*     */       } 
/*     */       return false;
/*     */     }
/*     */     
/*     */     private void a(dfm ☃, int i, int j, bmb bmb1) {
/*     */       a(☃, i + 1, j + 1);
/*     */       RenderSystem.enableRescaleNormal();
/*     */       if (!bmb1.a())
/*     */         this.a.a.j.a(bmb1, i + 2, j + 2); 
/*     */       RenderSystem.disableRescaleNormal();
/*     */     } }
/*     */ 
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dnv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */