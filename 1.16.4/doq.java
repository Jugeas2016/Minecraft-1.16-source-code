/*     */ import com.google.common.base.Splitter;
/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.collect.Maps;
/*     */ import com.mojang.blaze3d.systems.RenderSystem;
/*     */ import java.util.Arrays;
/*     */ import java.util.Collections;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Optional;
/*     */ import java.util.function.Function;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class doq
/*     */   extends dot
/*     */ {
/*  48 */   private static final Logger a = LogManager.getLogger();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  58 */   private static final List<a> b = Lists.newArrayList();
/*     */   
/*     */   private final dnv c;
/*     */   private nr p;
/*     */   private nr q;
/*     */   private b r;
/*     */   private dlj s;
/*     */   private dlq t;
/*     */   private cpf u;
/*     */   
/*     */   static {
/*  69 */     a(new of("createWorld.customize.preset.classic_flat"), bup.i, btb.b, 
/*  70 */         Arrays.asList((cla<?>[])new cla[] { cla.q }, ), false, false, false, new cpe[] { new cpe(1, bup.i), new cpe(2, bup.j), new cpe(1, bup.z) });
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
/*  81 */     a(new of("createWorld.customize.preset.tunnelers_dream"), bup.b, btb.d, 
/*  82 */         Arrays.asList((cla<?>[])new cla[] { cla.c }, ), true, true, false, new cpe[] { new cpe(1, bup.i), new cpe(5, bup.j), new cpe(230, bup.b), new cpe(1, bup.z) });
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
/*  96 */     a(new of("createWorld.customize.preset.water_world"), bmd.lL, btb.y, 
/*  97 */         Arrays.asList((cla<?>[])new cla[] { cla.m, cla.i, cla.l }, ), false, false, false, new cpe[] { new cpe(90, bup.A), new cpe(5, bup.C), new cpe(5, bup.j), new cpe(5, bup.b), new cpe(1, bup.z) });
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
/* 112 */     a(new of("createWorld.customize.preset.overworld"), bup.aR, btb.b, 
/* 113 */         Arrays.asList((cla<?>[])new cla[] { cla.q, cla.c, cla.b, cla.h }, ), true, true, true, new cpe[] { new cpe(1, bup.i), new cpe(3, bup.j), new cpe(59, bup.b), new cpe(1, bup.z) });
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
/* 129 */     a(new of("createWorld.customize.preset.snowy_kingdom"), bup.cC, btb.m, 
/* 130 */         Arrays.asList((cla<?>[])new cla[] { cla.q, cla.g }, ), false, false, false, new cpe[] { new cpe(1, bup.cC), new cpe(1, bup.i), new cpe(3, bup.j), new cpe(59, bup.b), new cpe(1, bup.z) });
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
/* 144 */     a(new of("createWorld.customize.preset.bottomless_pit"), bmd.kT, btb.b, 
/* 145 */         Arrays.asList((cla<?>[])new cla[] { cla.q }, ), false, false, false, new cpe[] { new cpe(1, bup.i), new cpe(3, bup.j), new cpe(2, bup.m) });
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
/* 156 */     a(new of("createWorld.customize.preset.desert"), bup.C, btb.c, 
/* 157 */         Arrays.asList((cla<?>[])new cla[] { cla.q, cla.f, cla.c }, ), true, true, false, new cpe[] { new cpe(8, bup.C), new cpe(52, bup.at), new cpe(3, bup.b), new cpe(1, bup.z) });
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
/* 172 */     a(new of("createWorld.customize.preset.redstone_ready"), bmd.lP, btb.c, 
/* 173 */         Collections.emptyList(), false, false, false, new cpe[] { new cpe(52, bup.at), new cpe(3, bup.b), new cpe(1, bup.z) });
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 182 */     a(new of("createWorld.customize.preset.the_void"), bup.go, btb.Z, 
/* 183 */         Collections.emptyList(), false, true, false, new cpe[] { new cpe(1, bup.a) });
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public doq(dnv ☃) {
/* 192 */     super(new of("createWorld.customize.presets.title"));
/* 193 */     this.c = ☃;
/*     */   } @Nullable
/*     */   private static cpe a(String ☃, int i) {
/*     */     int j;
/*     */     buo buo;
/* 198 */     String[] arrayOfString = ☃.split("\\*", 2);
/*     */ 
/*     */     
/* 201 */     if (arrayOfString.length == 2) {
/*     */       try {
/* 203 */         j = Math.max(Integer.parseInt(arrayOfString[0]), 0);
/* 204 */       } catch (NumberFormatException numberFormatException) {
/* 205 */         a.error("Error while parsing flat world string => {}", numberFormatException.getMessage());
/* 206 */         return null;
/*     */       } 
/*     */     } else {
/* 209 */       j = 1;
/*     */     } 
/*     */     
/* 212 */     int k = Math.min(i + j, 256);
/* 213 */     int m = k - i;
/*     */ 
/*     */     
/* 216 */     String str = arrayOfString[arrayOfString.length - 1];
/*     */     try {
/* 218 */       buo = gm.Q.b(new vk(str)).orElse(null);
/* 219 */     } catch (Exception exception) {
/* 220 */       a.error("Error while parsing flat world string => {}", exception.getMessage());
/* 221 */       return null;
/*     */     } 
/*     */     
/* 224 */     if (buo == null) {
/* 225 */       a.error("Error while parsing flat world string => Unknown block, {}", str);
/* 226 */       return null;
/*     */     } 
/*     */     
/* 229 */     cpe cpe = new cpe(m, buo);
/* 230 */     cpe.a(i);
/* 231 */     return cpe;
/*     */   }
/*     */   
/*     */   private static List<cpe> b(String ☃) {
/* 235 */     List<cpe> list = Lists.newArrayList();
/* 236 */     String[] arrayOfString = ☃.split(",");
/* 237 */     int i = 0;
/*     */     
/* 239 */     for (String str : arrayOfString) {
/* 240 */       cpe cpe = a(str, i);
/* 241 */       if (cpe == null) {
/* 242 */         return Collections.emptyList();
/*     */       }
/* 244 */       list.add(cpe);
/* 245 */       i += cpe.a();
/*     */     } 
/*     */     
/* 248 */     return list;
/*     */   }
/*     */   
/*     */   public static cpf a(gm<bsv> ☃, String str, cpf cpf1) {
/* 252 */     Iterator<String> iterator = Splitter.on(';').split(str).iterator();
/* 253 */     if (!iterator.hasNext()) {
/* 254 */       return cpf.a(☃);
/*     */     }
/*     */     
/* 257 */     List<cpe> list = b(iterator.next());
/*     */     
/* 259 */     if (list.isEmpty()) {
/* 260 */       return cpf.a(☃);
/*     */     }
/*     */     
/* 263 */     cpf cpf2 = cpf1.a(list, cpf1.d());
/*     */     
/* 265 */     vj<bsv> vj1 = btb.b;
/* 266 */     if (iterator.hasNext()) {
/*     */       try {
/* 268 */         vk vk = new vk(iterator.next());
/* 269 */         vj1 = vj.a(gm.ay, vk);
/* 270 */         ☃.c(vj1).orElseThrow(() -> new IllegalArgumentException("Invalid Biome: " + ☃));
/* 271 */       } catch (Exception exception) {
/* 272 */         a.error("Error while parsing flat world string => {}", exception.getMessage());
/*     */       } 
/*     */     }
/* 275 */     vj<bsv> vj2 = vj1;
/* 276 */     cpf2.a(() -> (bsv)☃.d(vj1));
/*     */     
/* 278 */     return cpf2;
/*     */   }
/*     */   
/*     */   private static String b(gm<bsv> ☃, cpf cpf1) {
/* 282 */     StringBuilder stringBuilder = new StringBuilder();
/*     */     
/* 284 */     for (int i = 0; i < cpf1.f().size(); i++) {
/* 285 */       if (i > 0) {
/* 286 */         stringBuilder.append(",");
/*     */       }
/* 288 */       stringBuilder.append(cpf1.f().get(i));
/*     */     } 
/*     */     
/* 291 */     stringBuilder.append(";");
/* 292 */     stringBuilder.append(☃.b(cpf1.e()));
/*     */     
/* 294 */     return stringBuilder.toString();
/*     */   }
/*     */ 
/*     */   
/*     */   protected void b() {
/* 299 */     this.i.m.a(true);
/*     */     
/* 301 */     this.p = new of("createWorld.customize.presets.share");
/* 302 */     this.q = new of("createWorld.customize.presets.list");
/*     */     
/* 304 */     this.t = new dlq(this.o, 50, 40, this.k - 100, 20, this.p);
/* 305 */     this.t.k(1230);
/* 306 */     gm<bsv> ☃ = this.c.a.c.b().b(gm.ay);
/* 307 */     this.t.a(b(☃, this.c.h()));
/* 308 */     this.u = this.c.h();
/* 309 */     this.e.add(this.t);
/*     */     
/* 311 */     this.r = new b(this);
/* 312 */     this.e.add(this.r);
/*     */     
/* 314 */     this.s = a(new dlj(this.k / 2 - 155, this.l - 28, 150, 20, new of("createWorld.customize.presets.select"), dlj1 -> {
/*     */             cpf cpf1 = a(☃, this.t.b(), this.u);
/*     */             this.c.a(cpf1);
/*     */             this.i.a(this.c);
/*     */           }));
/* 319 */     a(new dlj(this.k / 2 + 5, this.l - 28, 150, 20, nq.d, ☃ -> this.i.a(this.c)));
/*     */     
/* 321 */     c((this.r.h() != null));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(double ☃, double d1, double d2) {
/* 327 */     return this.r.a(☃, d1, d2);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(djz ☃, int i, int j) {
/* 332 */     String str = this.t.b();
/* 333 */     b(☃, i, j);
/* 334 */     this.t.a(str);
/*     */   }
/*     */ 
/*     */   
/*     */   public void at_() {
/* 339 */     this.i.a(this.c);
/*     */   }
/*     */ 
/*     */   
/*     */   public void e() {
/* 344 */     this.i.m.a(false);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(dfm ☃, int i, int j, float f) {
/* 349 */     a(☃);
/*     */     
/* 351 */     this.r.a(☃, i, j, f);
/* 352 */     RenderSystem.pushMatrix();
/* 353 */     RenderSystem.translatef(0.0F, 0.0F, 400.0F);
/* 354 */     a(☃, this.o, this.d, this.k / 2, 8, 16777215);
/* 355 */     b(☃, this.o, this.p, 50, 30, 10526880);
/* 356 */     b(☃, this.o, this.q, 50, 70, 10526880);
/* 357 */     RenderSystem.popMatrix();
/*     */     
/* 359 */     this.t.a(☃, i, j, f);
/* 360 */     super.a(☃, i, j, f);
/*     */   }
/*     */ 
/*     */   
/*     */   public void d() {
/* 365 */     this.t.a();
/* 366 */     super.d();
/*     */   }
/*     */   
/*     */   public void c(boolean ☃) {
/* 370 */     this.s.o = (☃ || this.t.b().length() > 1);
/*     */   }
/*     */   
/*     */   class b extends dlv<b.a> {
/*     */     public b(doq this$0) {
/* 375 */       super(this$0.i, this$0.k, this$0.l, 80, this$0.l - 37, 24);
/* 376 */       for (int ☃ = 0; ☃ < doq.h().size(); ☃++) {
/* 377 */         b(new a(this));
/*     */       }
/*     */     }
/*     */ 
/*     */     
/*     */     public void a(@Nullable a ☃) {
/* 383 */       super.a(☃);
/*     */       
/* 385 */       if (☃ != null) {
/* 386 */         dkz.b.a((new of("narrator.select", new Object[] { ((doq.a)doq.h().get(au_().indexOf(☃))).a() })).getString());
/*     */       }
/* 388 */       this.a.c((☃ != null));
/*     */     }
/*     */ 
/*     */     
/*     */     protected boolean b() {
/* 393 */       return (this.a.aw_() == this);
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean a(int ☃, int i, int j) {
/* 398 */       if (super.a(☃, i, j)) {
/* 399 */         return true;
/*     */       }
/* 401 */       if ((☃ == 257 || ☃ == 335) && 
/* 402 */         h() != null) {
/* 403 */         a.a(h());
/*     */       }
/*     */       
/* 406 */       return false;
/*     */     }
/*     */     
/*     */     public class a extends dlv.a<a> { public a(doq.b ☃) {}
/*     */       
/*     */       public void a(dfm ☃, int i, int j, int k, int m, int n, int i1, int i2, boolean bool, float f) {
/* 412 */         doq.a a1 = doq.h().get(i);
/* 413 */         a(☃, k, j, a1.a);
/* 414 */         this.a.a.o.b(☃, a1.b, (k + 18 + 5), (j + 6), 16777215);
/*     */       }
/*     */ 
/*     */       
/*     */       public boolean a(double ☃, double d1, int i) {
/* 419 */         if (i == 0) {
/* 420 */           a();
/*     */         }
/* 422 */         return false;
/*     */       }
/*     */       
/*     */       private void a() {
/* 426 */         this.a.a(this);
/* 427 */         doq.a ☃ = doq.h().get(this.a.au_().indexOf(this));
/* 428 */         gm<bsv> gm = (doq.a(this.a.a)).a.c.b().b(gm.ay);
/* 429 */         doq.a(this.a.a, ☃.c.apply(gm));
/* 430 */         doq.c(this.a.a).a(doq.a(gm, doq.b(this.a.a)));
/* 431 */         doq.c(this.a.a).k();
/*     */       }
/*     */       
/*     */       private void a(dfm ☃, int i, int j, blx blx1) {
/* 435 */         a(☃, i + 1, j + 1);
/*     */         
/* 437 */         RenderSystem.enableRescaleNormal();
/*     */         
/* 439 */         this.a.a.j.a(new bmb(blx1), i + 2, j + 2);
/*     */         
/* 441 */         RenderSystem.disableRescaleNormal();
/*     */       }
/*     */       
/*     */       private void a(dfm ☃, int i, int j) {
/* 445 */         RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 446 */         doq.b.a(this.a).M().a(dkw.g);
/*     */         
/* 448 */         dkw.a(☃, i, j, this.a.a.v(), 0.0F, 0.0F, 18, 18, 128, 128);
/*     */       } }
/*     */   
/*     */   }
/*     */   
/*     */   private static void a(nr ☃, brw brw1, vj<bsv> vj1, List<cla<?>> list, boolean bool1, boolean bool2, boolean bool3, cpe... arrayOfCpe) {
/* 454 */     b.add(new a(brw1.h(), ☃, gm1 -> {
/*     */             Map<cla<?>, cmy> map = Maps.newHashMap();
/*     */             for (cla<?> cla : (Iterable<cla<?>>)☃) {
/*     */               map.put(cla, chv.b.get(cla));
/*     */             }
/*     */             chv chv = new chv(bool1 ? Optional.<cmx>of(chv.c) : Optional.<cmx>empty(), map);
/*     */             cpf cpf1 = new cpf(chv, gm1);
/*     */             if (bool2) {
/*     */               cpf1.a();
/*     */             }
/*     */             if (bool3) {
/*     */               cpf1.b();
/*     */             }
/*     */             for (int i = arrayOfCpe.length - 1; i >= 0; i--) {
/*     */               cpf1.f().add(arrayOfCpe[i]);
/*     */             }
/*     */             cpf1.a(());
/*     */             cpf1.h();
/*     */             return cpf1.a(chv);
/*     */           }));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   static class a
/*     */   {
/*     */     public final blx a;
/*     */ 
/*     */     
/*     */     public final nr b;
/*     */     
/*     */     public final Function<gm<bsv>, cpf> c;
/*     */ 
/*     */     
/*     */     public a(blx ☃, nr nr1, Function<gm<bsv>, cpf> function) {
/* 489 */       this.a = ☃;
/* 490 */       this.b = nr1;
/* 491 */       this.c = function;
/*     */     }
/*     */     
/*     */     public nr a() {
/* 495 */       return this.b;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\doq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */