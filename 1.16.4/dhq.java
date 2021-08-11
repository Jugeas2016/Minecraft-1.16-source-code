/*     */ import com.google.common.collect.Lists;
/*     */ import com.mojang.blaze3d.systems.RenderSystem;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.stream.Collectors;
/*     */ import java.util.stream.Stream;
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
/*     */ public class dhq
/*     */   extends eoo
/*     */ {
/*  35 */   private static final Logger a = LogManager.getLogger();
/*     */   
/*     */   private final dot b;
/*     */   
/*     */   private final dfw c;
/*     */   
/*     */   private dgq p;
/*     */   
/*     */   private final long q;
/*     */   
/*     */   private final nr r;
/*  46 */   private final nr[] s = new nr[] { new of("mco.brokenworld.message.line1"), new of("mco.brokenworld.message.line2") };
/*     */ 
/*     */   
/*     */   private int t;
/*     */ 
/*     */   
/*     */   private int u;
/*     */   
/*  54 */   private final List<Integer> v = Lists.newArrayList();
/*     */   
/*     */   private int w;
/*     */   
/*     */   public dhq(dot ☃, dfw dfw1, long l, boolean bool) {
/*  59 */     this.b = ☃;
/*  60 */     this.c = dfw1;
/*  61 */     this.q = l;
/*  62 */     this.r = bool ? new of("mco.brokenworld.minigame.title") : new of("mco.brokenworld.title");
/*     */   }
/*     */ 
/*     */   
/*     */   public void b() {
/*  67 */     this.t = this.k / 2 - 150;
/*  68 */     this.u = this.k / 2 + 190;
/*     */     
/*  70 */     a(new dlj(this.u - 80 + 8, j(13) - 5, 70, 20, nq.h, ☃ -> i()));
/*     */ 
/*     */ 
/*     */     
/*  74 */     if (this.p == null) {
/*  75 */       a(this.q);
/*     */     } else {
/*  77 */       h();
/*     */     } 
/*     */     
/*  80 */     this.i.m.a(true);
/*  81 */     eoj.a(Stream.concat(Stream.of(this.r), Stream.of((Object[])this.s)).map(nr::getString).collect(Collectors.joining(" ")));
/*     */   }
/*     */   
/*     */   private void h() {
/*  85 */     for (Iterator<Map.Entry<Integer, dgw>> iterator = this.p.i.entrySet().iterator(); iterator.hasNext(); ) { dlj dlj; Map.Entry<Integer, dgw> ☃ = iterator.next();
/*  86 */       int i = ((Integer)☃.getKey()).intValue();
/*  87 */       boolean bool = (i != this.p.n || this.p.m == dgq.c.b);
/*     */ 
/*     */       
/*  90 */       if (bool) {
/*  91 */         dlj = new dlj(a(i), j(8), 80, 20, new of("mco.brokenworld.play"), dlj1 -> {
/*     */               if (((dgw)this.p.i.get(Integer.valueOf(☃))).n) {
/*     */                 dif dif = new dif(this, this.p, new of("mco.configure.world.switch.slot"), new of("mco.configure.world.switch.slot.subtitle"), 10526880, nq.d, this::a, ());
/*     */ 
/*     */                 
/*     */                 dif.a(☃);
/*     */                 
/*     */                 dif.a(new of("mco.create.world.reset.title"));
/*     */                 
/*     */                 this.i.a(dif);
/*     */               } else {
/*     */                 this.i.a(new dhz(this.b, new djf(this.p.a, ☃, this::a)));
/*     */               } 
/*     */             });
/*     */       } else {
/* 106 */         dlj = new dlj(a(i), j(8), 80, 20, new of("mco.brokenworld.download"), dlj1 -> {
/*     */               nr nr1 = new of("mco.configure.world.restore.download.question.line1");
/*     */ 
/*     */ 
/*     */               
/*     */               nr nr2 = new of("mco.configure.world.restore.download.question.line2");
/*     */ 
/*     */               
/*     */               this.i.a(new dhy((), dhy.a.b, nr1, nr2, true));
/*     */             });
/*     */       } 
/*     */ 
/*     */       
/* 119 */       if (this.v.contains(Integer.valueOf(i))) {
/* 120 */         dlj.o = false;
/* 121 */         dlj.a(new of("mco.brokenworld.downloaded"));
/*     */       } 
/*     */       
/* 124 */       a(dlj);
/* 125 */       a(new dlj(a(i), j(10), 80, 20, new of("mco.brokenworld.reset"), dlj1 -> {
/*     */               dif dif = new dif(this, this.p, this::a, ());
/*     */               if (☃ != this.p.n || this.p.m == dgq.c.b) {
/*     */                 dif.a(☃);
/*     */               }
/*     */               this.i.a(dif);
/*     */             })); }
/*     */   
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void d() {
/* 143 */     this.w++;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(dfm ☃, int i, int j, float f) {
/* 148 */     a(☃);
/*     */     
/* 150 */     super.a(☃, i, j, f);
/*     */     
/* 152 */     a(☃, this.o, this.r, this.k / 2, 17, 16777215);
/*     */     
/* 154 */     for (int k = 0; k < this.s.length; k++) {
/* 155 */       a(☃, this.o, this.s[k], this.k / 2, j(-1) + 3 + k * 12, 10526880);
/*     */     }
/*     */     
/* 158 */     if (this.p == null) {
/*     */       return;
/*     */     }
/*     */     
/* 162 */     for (Map.Entry<Integer, dgw> entry : this.p.i.entrySet()) {
/* 163 */       if (((dgw)entry.getValue()).l != null && ((dgw)entry.getValue()).k != -1L) {
/* 164 */         a(☃, a(((Integer)entry.getKey()).intValue()), j(1) + 5, i, j, (this.p.n == ((Integer)entry.getKey()).intValue() && !k()), ((dgw)entry.getValue()).a(((Integer)entry.getKey()).intValue()), ((Integer)entry.getKey()).intValue(), ((dgw)entry.getValue()).k, ((dgw)entry.getValue()).l, ((dgw)entry.getValue()).n); continue;
/*     */       } 
/* 166 */       a(☃, a(((Integer)entry.getKey()).intValue()), j(1) + 5, i, j, (this.p.n == ((Integer)entry.getKey()).intValue() && !k()), ((dgw)entry.getValue()).a(((Integer)entry.getKey()).intValue()), ((Integer)entry.getKey()).intValue(), -1L, (String)null, ((dgw)entry.getValue()).n);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   private int a(int ☃) {
/* 172 */     return this.t + (☃ - 1) * 110;
/*     */   }
/*     */ 
/*     */   
/*     */   public void e() {
/* 177 */     this.i.m.a(false);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(int ☃, int i, int j) {
/* 182 */     if (☃ == 256) {
/* 183 */       i();
/* 184 */       return true;
/*     */     } 
/* 186 */     return super.a(☃, i, j);
/*     */   }
/*     */   
/*     */   private void i() {
/* 190 */     this.i.a(this.b);
/*     */   }
/*     */   
/*     */   private void a(long ☃) {
/* 194 */     (new Thread(() -> {
/*     */           dgb dgb = dgb.a();
/*     */           
/*     */           try {
/*     */             this.p = dgb.a(☃);
/*     */             h();
/* 200 */           } catch (dhi dhi) {
/*     */             a.error("Couldn't get own world");
/*     */             this.i.a(new dhw(nr.a(dhi.getMessage()), this.b));
/*     */           } 
/* 204 */         })).start();
/*     */   }
/*     */   
/*     */   public void a() {
/* 208 */     (new Thread(() -> {
/*     */           dgb ☃ = dgb.a();
/*     */           
/*     */           if (this.p.e == dgq.b.a) {
/*     */             this.i.execute(());
/*     */           } else {
/*     */             try {
/*     */               this.c.g().a(☃.a(this.q), this);
/* 216 */             } catch (dhi dhi) {
/*     */               a.error("Couldn't get own world");
/*     */               this.i.execute(());
/*     */             } 
/*     */           } 
/* 221 */         })).start();
/*     */   }
/*     */   
/*     */   private void b(int ☃) {
/* 225 */     dgb dgb = dgb.a();
/*     */     
/*     */     try {
/* 228 */       dhd dhd = dgb.b(this.p.a, ☃);
/* 229 */       dhv dhv = new dhv(this, dhd, this.p.a(☃), bool -> {
/*     */             if (bool) {
/*     */               this.v.add(Integer.valueOf(☃));
/*     */               
/*     */               this.e.clear();
/*     */               h();
/*     */             } else {
/*     */               this.i.a(this);
/*     */             } 
/*     */           });
/* 239 */       this.i.a(dhv);
/* 240 */     } catch (dhi dhi) {
/* 241 */       a.error("Couldn't download world data");
/* 242 */       this.i.a(new dhw(dhi, this));
/*     */     } 
/*     */   }
/*     */   
/*     */   private boolean k() {
/* 247 */     return (this.p != null && this.p.m == dgq.c.b);
/*     */   }
/*     */ 
/*     */   
/*     */   private void a(dfm ☃, int i, int j, int k, int m, boolean bool1, String str1, int n, long l, String str2, boolean bool2) {
/* 252 */     if (bool2) {
/* 253 */       this.i.M().a(dhm.b);
/* 254 */     } else if (str2 != null && l != -1L) {
/* 255 */       dir.a(String.valueOf(l), str2);
/* 256 */     } else if (n == 1) {
/* 257 */       this.i.M().a(dhm.c);
/* 258 */     } else if (n == 2) {
/* 259 */       this.i.M().a(dhm.d);
/* 260 */     } else if (n == 3) {
/* 261 */       this.i.M().a(dhm.e);
/*     */     } else {
/* 263 */       dir.a(String.valueOf(this.p.p), this.p.q);
/*     */     } 
/*     */     
/* 266 */     if (!bool1) {
/* 267 */       RenderSystem.color4f(0.56F, 0.56F, 0.56F, 1.0F);
/* 268 */     } else if (bool1) {
/* 269 */       float f = 0.9F + 0.1F * afm.b(this.w * 0.2F);
/* 270 */       RenderSystem.color4f(f, f, f, 1.0F);
/*     */     } 
/*     */     
/* 273 */     dkw.a(☃, i + 3, j + 3, 0.0F, 0.0F, 74, 74, 74, 74);
/*     */     
/* 275 */     this.i.M().a(dhm.a);
/*     */     
/* 277 */     if (bool1) {
/* 278 */       RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
/*     */     } else {
/* 280 */       RenderSystem.color4f(0.56F, 0.56F, 0.56F, 1.0F);
/*     */     } 
/*     */     
/* 283 */     dkw.a(☃, i, j, 0.0F, 0.0F, 80, 80, 80, 80);
/*     */     
/* 285 */     a(☃, this.o, str1, i + 40, j + 66, 16777215);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dhq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */