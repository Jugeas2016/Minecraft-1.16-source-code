/*     */ import com.mojang.blaze3d.systems.RenderSystem;
/*     */ import java.util.Arrays;
/*     */ import java.util.List;
/*     */ import java.util.stream.Collectors;
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
/*     */ 
/*     */ public class dic
/*     */   extends eoo
/*     */ {
/*  35 */   private static final Logger a = LogManager.getLogger();
/*     */   
/*  37 */   private static final vk b = new vk("realms", "textures/gui/realms/accept_icon.png");
/*  38 */   private static final vk c = new vk("realms", "textures/gui/realms/reject_icon.png");
/*     */   
/*  40 */   private static final nr p = new of("mco.invites.nopending");
/*  41 */   private static final nr q = new of("mco.invites.button.accept");
/*  42 */   private static final nr r = new of("mco.invites.button.reject");
/*     */   
/*     */   private final dot s;
/*     */   
/*     */   @Nullable
/*     */   private nr t;
/*     */   
/*     */   private boolean u;
/*     */   
/*     */   private b v;
/*     */   private eom w;
/*  53 */   private int x = -1;
/*     */   
/*     */   private dlj y;
/*     */   private dlj z;
/*     */   
/*     */   public dic(dot ☃) {
/*  59 */     this.s = ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public void b() {
/*  64 */     this.i.m.a(true);
/*  65 */     this.v = new b(this);
/*     */     
/*  67 */     (new Thread(this, "Realms-pending-invitations-fetcher")
/*     */       {
/*     */         public void run() {
/*  70 */           dgb ☃ = dgb.a();
/*     */           try {
/*  72 */             List<dgk> list = (☃.k()).a;
/*  73 */             List<dic.a> list1 = (List<dic.a>)list.stream().map(☃ -> new dic.a(this.a, ☃)).collect(Collectors.toList());
/*  74 */             dic.a(this.a).execute(() -> dic.b(this.a).a(☃));
/*  75 */           } catch (dhi dhi) {
/*  76 */             dic.a().error("Couldn't list invites");
/*     */           } finally {
/*  78 */             dic.a(this.a, true);
/*     */           } 
/*     */         }
/*  81 */       }).start();
/*     */     
/*  83 */     d(this.v);
/*     */     
/*  85 */     this.y = a(new dlj(this.k / 2 - 174, this.l - 32, 100, 20, new of("mco.invites.button.accept"), ☃ -> {
/*     */             c(this.x);
/*     */             
/*     */             this.x = -1;
/*     */             i();
/*     */           }));
/*  91 */     a(new dlj(this.k / 2 - 50, this.l - 32, 100, 20, nq.c, ☃ -> this.i.a(new dfw(this.s))));
/*     */ 
/*     */ 
/*     */     
/*  95 */     this.z = a(new dlj(this.k / 2 + 74, this.l - 32, 100, 20, new of("mco.invites.button.reject"), ☃ -> {
/*     */             b(this.x);
/*     */             
/*     */             this.x = -1;
/*     */             i();
/*     */           }));
/* 101 */     this.w = new eom(new of("mco.invites.title"), this.k / 2, 12, 16777215);
/* 102 */     d(this.w);
/*     */     
/* 104 */     A();
/*     */     
/* 106 */     i();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(int ☃, int i, int j) {
/* 111 */     if (☃ == 256) {
/* 112 */       this.i.a(new dfw(this.s));
/* 113 */       return true;
/*     */     } 
/* 115 */     return super.a(☃, i, j);
/*     */   }
/*     */   
/*     */   private void a(int ☃) {
/* 119 */     this.v.b(☃);
/*     */   }
/*     */   
/*     */   private void b(int ☃) {
/* 123 */     if (☃ < this.v.l()) {
/* 124 */       (new Thread(this, "Realms-reject-invitation", ☃)
/*     */         {
/*     */           public void run() {
/*     */             try {
/* 128 */               dgb ☃ = dgb.a();
/* 129 */               ☃.b((dic.a.a((dic.a)dic.b(this.b).au_().get(this.a))).a);
/* 130 */               dic.c(this.b).execute(() -> dic.a(this.b, ☃));
/* 131 */             } catch (dhi ☃) {
/* 132 */               dic.a().error("Couldn't reject invite");
/*     */             } 
/*     */           }
/* 135 */         }).start();
/*     */     }
/*     */   }
/*     */   
/*     */   private void c(int ☃) {
/* 140 */     if (☃ < this.v.l()) {
/* 141 */       (new Thread(this, "Realms-accept-invitation", ☃)
/*     */         {
/*     */           public void run() {
/*     */             try {
/* 145 */               dgb ☃ = dgb.a();
/* 146 */               ☃.a((dic.a.a((dic.a)dic.b(this.b).au_().get(this.a))).a);
/* 147 */               dic.d(this.b).execute(() -> dic.a(this.b, ☃));
/* 148 */             } catch (dhi ☃) {
/* 149 */               dic.a().error("Couldn't accept invite");
/*     */             } 
/*     */           }
/* 152 */         }).start();
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(dfm ☃, int i, int j, float f) {
/* 158 */     this.t = null;
/*     */     
/* 160 */     a(☃);
/*     */     
/* 162 */     this.v.a(☃, i, j, f);
/* 163 */     this.w.a(this, ☃);
/*     */     
/* 165 */     if (this.t != null) {
/* 166 */       a(☃, this.t, i, j);
/*     */     }
/*     */     
/* 169 */     if (this.v.l() == 0 && this.u) {
/* 170 */       a(☃, this.o, p, this.k / 2, this.l / 2 - 20, 16777215);
/*     */     }
/*     */     
/* 173 */     super.a(☃, i, j, f);
/*     */   }
/*     */   
/*     */   protected void a(dfm ☃, @Nullable nr nr1, int i, int j) {
/* 177 */     if (nr1 == null) {
/*     */       return;
/*     */     }
/*     */     
/* 181 */     int k = i + 12;
/* 182 */     int m = j - 12;
/* 183 */     int n = this.o.a(nr1);
/* 184 */     a(☃, k - 3, m - 3, k + n + 3, m + 8 + 3, -1073741824, -1073741824);
/*     */     
/* 186 */     this.o.a(☃, nr1, k, m, 16777215);
/*     */   }
/*     */   
/*     */   private void i() {
/* 190 */     this.y.p = k(this.x);
/* 191 */     this.z.p = k(this.x);
/*     */   }
/*     */   
/*     */   private boolean k(int ☃) {
/* 195 */     return (☃ != -1);
/*     */   }
/*     */   
/*     */   class b extends eon<a> {
/*     */     public b(dic this$0) {
/* 200 */       super(this$0.k, this$0.l, 32, this$0.l - 40, 36);
/*     */     }
/*     */     
/*     */     public void b(int ☃) {
/* 204 */       i(☃);
/*     */     }
/*     */ 
/*     */     
/*     */     public int c() {
/* 209 */       return l() * 36;
/*     */     }
/*     */ 
/*     */     
/*     */     public int d() {
/* 214 */       return 260;
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean b() {
/* 219 */       return (this.a.aw_() == this);
/*     */     }
/*     */ 
/*     */     
/*     */     public void a(dfm ☃) {
/* 224 */       this.a.a(☃);
/*     */     }
/*     */ 
/*     */     
/*     */     public void a(int ☃) {
/* 229 */       j(☃);
/* 230 */       if (☃ != -1) {
/* 231 */         List<dic.a> list = dic.b(this.a).au_();
/* 232 */         dgk dgk = dic.a.a(list.get(☃));
/* 233 */         String str1 = ekx.a("narrator.select.list.position", new Object[] { Integer.valueOf(☃ + 1), Integer.valueOf(list.size()) });
/* 234 */         String str2 = eoj.b(Arrays.asList(new String[] { dgk.b, dgk.c, dis.a(dgk.e), str1 }));
/* 235 */         eoj.a(ekx.a("narrator.select", new Object[] { str2 }));
/*     */       } 
/* 237 */       c(☃);
/*     */     }
/*     */     
/*     */     public void c(int ☃) {
/* 241 */       dic.b(this.a, ☃);
/* 242 */       dic.e(this.a);
/*     */     }
/*     */ 
/*     */     
/*     */     public void a(@Nullable dic.a ☃) {
/* 247 */       super.a(☃);
/*     */       
/* 249 */       dic.b(this.a, au_().indexOf(☃));
/* 250 */       dic.e(this.a);
/*     */     } }
/*     */   
/*     */   class a extends dlv.a<a> { private final dgk b;
/*     */     private final List<dhn> c;
/*     */     
/*     */     class a extends dhn { a(dic.a ☃) {
/* 257 */         super(15, 15, 215, 5);
/*     */       }
/*     */ 
/*     */       
/*     */       protected void a(dfm ☃, int i, int j, boolean bool) {
/* 262 */         dic.f(this.e.a).M().a(dic.c());
/* 263 */         RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 264 */         float f = bool ? 19.0F : 0.0F;
/* 265 */         dkw.a(☃, i, j, f, 0.0F, 18, 18, 37, 18);
/*     */         
/* 267 */         if (bool) {
/* 268 */           dic.a(this.e.a, dic.f());
/*     */         }
/*     */       }
/*     */ 
/*     */       
/*     */       public void a(int ☃) {
/* 274 */         dic.c(this.e.a, ☃);
/*     */       } }
/*     */ 
/*     */     
/*     */     class b extends dhn {
/*     */       b(dic.a ☃) {
/* 280 */         super(15, 15, 235, 5);
/*     */       }
/*     */ 
/*     */       
/*     */       protected void a(dfm ☃, int i, int j, boolean bool) {
/* 285 */         dic.g(this.e.a).M().a(dic.g());
/* 286 */         RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 287 */         float f = bool ? 19.0F : 0.0F;
/* 288 */         dkw.a(☃, i, j, f, 0.0F, 18, 18, 37, 18);
/*     */         
/* 290 */         if (bool) {
/* 291 */           dic.a(this.e.a, dic.h());
/*     */         }
/*     */       }
/*     */ 
/*     */       
/*     */       public void a(int ☃) {
/* 297 */         dic.d(this.e.a, ☃);
/*     */       }
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     a(dic this$0, dgk ☃) {
/* 307 */       this.b = ☃;
/* 308 */       this.c = Arrays.asList(new dhn[] { new a(this), new b(this) });
/*     */     }
/*     */ 
/*     */     
/*     */     public void a(dfm ☃, int i, int j, int k, int m, int n, int i1, int i2, boolean bool, float f) {
/* 313 */       a(☃, this.b, k, j, i1, i2);
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean a(double ☃, double d1, int i) {
/* 318 */       dhn.a(dic.b(this.a), this, this.c, i, ☃, d1);
/* 319 */       return true;
/*     */     }
/*     */     
/*     */     private void a(dfm ☃, dgk dgk1, int i, int j, int k, int m) {
/* 323 */       dic.h(this.a).b(☃, dgk1.b, (i + 38), (j + 1), 16777215);
/* 324 */       dic.i(this.a).b(☃, dgk1.c, (i + 38), (j + 12), 7105644);
/* 325 */       dic.j(this.a).b(☃, dis.a(dgk1.e), (i + 38), (j + 24), 7105644);
/*     */ 
/*     */       
/* 328 */       dhn.a(☃, this.c, dic.b(this.a), i, j, k, m);
/*     */       
/* 330 */       dir.a(dgk1.d, () -> {
/*     */             RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
/*     */             dkw.a(☃, i, j, 32, 32, 8.0F, 8.0F, 8, 8, 64, 64);
/*     */             dkw.a(☃, i, j, 32, 32, 40.0F, 8.0F, 8, 8, 64, 64);
/*     */           });
/*     */     } }
/*     */ 
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dic.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */