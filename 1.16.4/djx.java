/*     */ import java.util.Locale;
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
/*     */ public class djx
/*     */ {
/*     */   private final djz a;
/*     */   private boolean b;
/*  47 */   private final deh c = new deh(); private long d;
/*     */   private long e;
/*     */   private long f;
/*     */   private boolean g;
/*     */   
/*     */   public djx(djz ☃) {
/*  53 */     this.d = -1L;
/*  54 */     this.e = -1L;
/*  55 */     this.f = -1L;
/*     */     this.a = ☃;
/*     */   }
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
/*     */ 
/*     */   
/*     */   private void a(String ☃, Object... arrayOfObject) {
/*  91 */     this.a.j.c().a((new oe("")).a((new of("debug.prefix")).a(new k[] { k.o, k.r })).c(" ").a(new of(☃, arrayOfObject)));
/*     */   }
/*     */   
/*     */   private void b(String ☃, Object... arrayOfObject) {
/*  95 */     this.a.j.c().a((new oe("")).a((new of("debug.prefix")).a(new k[] { k.m, k.r })).c(" ").a(new of(☃, arrayOfObject)));
/*     */   }
/*     */   
/*     */   private boolean b(int ☃) {
/*     */     boolean bool1;
/*     */     boolean bool2;
/*     */     dlk dlk;
/*     */     dwu dwu;
/* 103 */     if (this.d > 0L && this.d < x.b() - 100L) {
/* 104 */       return true;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 111 */     switch (☃) {
/*     */       case 65:
/* 113 */         this.a.e.e();
/* 114 */         a("debug.reload_chunks.message", new Object[0]);
/* 115 */         return true;
/*     */       case 66:
/* 117 */         bool1 = !this.a.ac().a();
/* 118 */         this.a.ac().b(bool1);
/* 119 */         a(bool1 ? "debug.show_hitboxes.on" : "debug.show_hitboxes.off", new Object[0]);
/* 120 */         return true;
/*     */       case 68:
/* 122 */         if (this.a.j != null) {
/* 123 */           this.a.j.c().a(false);
/*     */         }
/* 125 */         return true;
/*     */       case 70:
/* 127 */         dkc.q.a(this.a.k, afm.a((this.a.k.b + (dot.y() ? -1 : 1)), dkc.q.c(), dkc.q.d()));
/* 128 */         a("debug.cycle_renderdistance.message", new Object[] { Integer.valueOf(this.a.k.b) });
/* 129 */         return true;
/*     */       case 71:
/* 131 */         bool2 = this.a.i.b();
/* 132 */         a(bool2 ? "debug.chunk_boundaries.on" : "debug.chunk_boundaries.off", new Object[0]);
/* 133 */         return true;
/*     */       case 72:
/* 135 */         this.a.k.p = !this.a.k.p;
/* 136 */         a(this.a.k.p ? "debug.advanced_tooltips.on" : "debug.advanced_tooltips.off", new Object[0]);
/* 137 */         this.a.k.b();
/* 138 */         return true;
/*     */       case 73:
/* 140 */         if (!this.a.s.eO()) {
/* 141 */           a(this.a.s.k(2), !dot.y());
/*     */         }
/* 143 */         return true;
/*     */       case 78:
/* 145 */         if (!this.a.s.k(2)) {
/* 146 */           a("debug.creative_spectator.error", new Object[0]);
/* 147 */         } else if (!this.a.s.a_()) {
/* 148 */           this.a.s.f("/gamemode spectator");
/*     */         } else {
/* 150 */           this.a.s.f("/gamemode " + this.a.q.k().b());
/*     */         } 
/* 152 */         return true;
/*     */       case 293:
/* 154 */         if (!this.a.s.k(2)) {
/* 155 */           a("debug.gamemodes.error", new Object[0]);
/*     */         } else {
/* 157 */           this.a.a(new dpn());
/*     */         } 
/* 159 */         return true;
/*     */       case 80:
/* 161 */         this.a.k.q = !this.a.k.q;
/* 162 */         this.a.k.b();
/* 163 */         a(this.a.k.q ? "debug.pause_focus.on" : "debug.pause_focus.off", new Object[0]);
/* 164 */         return true;
/*     */       case 81:
/* 166 */         a("debug.help.message", new Object[0]);
/* 167 */         dlk = this.a.j.c();
/* 168 */         dlk.a(new of("debug.reload_chunks.help"));
/* 169 */         dlk.a(new of("debug.show_hitboxes.help"));
/* 170 */         dlk.a(new of("debug.copy_location.help"));
/* 171 */         dlk.a(new of("debug.clear_chat.help"));
/* 172 */         dlk.a(new of("debug.cycle_renderdistance.help"));
/* 173 */         dlk.a(new of("debug.chunk_boundaries.help"));
/* 174 */         dlk.a(new of("debug.advanced_tooltips.help"));
/* 175 */         dlk.a(new of("debug.inspect.help"));
/* 176 */         dlk.a(new of("debug.creative_spectator.help"));
/* 177 */         dlk.a(new of("debug.pause_focus.help"));
/* 178 */         dlk.a(new of("debug.help.help"));
/* 179 */         dlk.a(new of("debug.reload_resourcepacks.help"));
/* 180 */         dlk.a(new of("debug.pause.help"));
/* 181 */         dlk.a(new of("debug.gamemodes.help"));
/* 182 */         return true;
/*     */       case 84:
/* 184 */         a("debug.reload_resourcepacks.message", new Object[0]);
/* 185 */         this.a.j();
/* 186 */         return true;
/*     */       case 67:
/* 188 */         if (this.a.s.eO()) {
/* 189 */           return false;
/*     */         }
/* 191 */         dwu = this.a.s.e;
/* 192 */         if (dwu == null) {
/* 193 */           return false;
/*     */         }
/* 195 */         a("debug.copy_location.message", new Object[0]);
/* 196 */         a(String.format(Locale.ROOT, "/execute in %s run tp @s %.2f %.2f %.2f %.2f %.2f", new Object[] { this.a.s.l.Y().a(), Double.valueOf(this.a.s.cD()), Double.valueOf(this.a.s.cE()), Double.valueOf(this.a.s.cH()), Float.valueOf(this.a.s.p), Float.valueOf(this.a.s.q) }));
/* 197 */         return true;
/*     */     } 
/* 199 */     return false; } private void a(boolean ☃, boolean bool1) {
/*     */     fx fx;
/*     */     aqa aqa;
/*     */     ceh ceh;
/*     */     vk vk;
/* 204 */     dcl dcl = this.a.v;
/* 205 */     if (dcl == null) {
/*     */       return;
/*     */     }
/*     */     
/* 209 */     switch (null.a[dcl.c().ordinal()]) {
/*     */       case 1:
/* 211 */         fx = ((dcj)dcl).a();
/* 212 */         ceh = this.a.s.l.d_(fx);
/*     */         
/* 214 */         if (☃) {
/* 215 */           if (bool1) {
/* 216 */             this.a.s.e.l().a(fx, md1 -> {
/*     */                   a(☃, fx1, md1); a("debug.inspect.server.block", new Object[0]);
/*     */                 });
/*     */             break;
/*     */           } 
/* 221 */           ccj ccj = this.a.s.l.c(fx);
/* 222 */           md md = (ccj != null) ? ccj.a(new md()) : null;
/* 223 */           a(ceh, fx, md);
/* 224 */           a("debug.inspect.client.block", new Object[0]);
/*     */           break;
/*     */         } 
/* 227 */         a(ceh, fx, (md)null);
/* 228 */         a("debug.inspect.client.block", new Object[0]);
/*     */         break;
/*     */ 
/*     */       
/*     */       case 2:
/* 233 */         aqa = ((dck)dcl).a();
/* 234 */         vk = gm.S.b(aqa.X());
/* 235 */         if (☃) {
/* 236 */           if (bool1) {
/* 237 */             this.a.s.e.l().a(aqa.Y(), md1 -> {
/*     */                   a(☃, aqa1.cA(), md1); a("debug.inspect.server.entity", new Object[0]);
/*     */                 });
/*     */             break;
/*     */           } 
/* 242 */           md md = aqa.e(new md());
/* 243 */           a(vk, aqa.cA(), md);
/* 244 */           a("debug.inspect.client.entity", new Object[0]);
/*     */           break;
/*     */         } 
/* 247 */         a(vk, aqa.cA(), (md)null);
/* 248 */         a("debug.inspect.client.entity", new Object[0]);
/*     */         break;
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void a(ceh ☃, fx fx1, @Nullable md md1) {
/* 258 */     if (md1 != null) {
/* 259 */       md1.r("x");
/* 260 */       md1.r("y");
/* 261 */       md1.r("z");
/* 262 */       md1.r("id");
/*     */     } 
/* 264 */     StringBuilder stringBuilder = new StringBuilder(ei.a(☃));
/* 265 */     if (md1 != null) {
/* 266 */       stringBuilder.append(md1);
/*     */     }
/* 268 */     String str = String.format(Locale.ROOT, "/setblock %d %d %d %s", new Object[] { Integer.valueOf(fx1.u()), Integer.valueOf(fx1.v()), Integer.valueOf(fx1.w()), stringBuilder });
/* 269 */     a(str);
/*     */   }
/*     */   
/*     */   private void a(vk ☃, dcn dcn1, @Nullable md md1) {
/*     */     String str;
/* 274 */     if (md1 != null) {
/* 275 */       md1.r("UUID");
/* 276 */       md1.r("Pos");
/* 277 */       md1.r("Dimension");
/* 278 */       String str1 = md1.l().getString();
/* 279 */       str = String.format(Locale.ROOT, "/summon %s %.2f %.2f %.2f %s", new Object[] { ☃.toString(), Double.valueOf(dcn1.b), Double.valueOf(dcn1.c), Double.valueOf(dcn1.d), str1 });
/*     */     } else {
/* 281 */       str = String.format(Locale.ROOT, "/summon %s %.2f %.2f %.2f", new Object[] { ☃.toString(), Double.valueOf(dcn1.b), Double.valueOf(dcn1.c), Double.valueOf(dcn1.d) });
/*     */     } 
/* 283 */     a(str);
/*     */   }
/*     */   
/*     */   public void a(long ☃, int i, int j, int k, int m) {
/* 287 */     if (☃ != this.a.aD().i()) {
/*     */       return;
/*     */     }
/*     */ 
/*     */ 
/*     */     
/* 293 */     if (this.d > 0L) {
/* 294 */       if (!deo.a(djz.C().aD().i(), 67) || !deo.a(djz.C().aD().i(), 292)) {
/* 295 */         this.d = -1L;
/*     */       }
/* 297 */     } else if (deo.a(djz.C().aD().i(), 67) && deo.a(djz.C().aD().i(), 292)) {
/* 298 */       this.g = true;
/* 299 */       this.d = x.b();
/* 300 */       this.e = x.b();
/* 301 */       this.f = 0L;
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 308 */     dmh dmh = this.a.y;
/*     */     
/* 310 */     if (k == 1 && (
/* 311 */       !(this.a.y instanceof dpl) || ((dpl)dmh).p <= x.b() - 20L)) {
/* 312 */       if (this.a.k.az.a(i, j)) {
/* 313 */         this.a.aD().h();
/* 314 */         this.a.k.Z = this.a.aD().j();
/* 315 */         this.a.k.b(); return;
/*     */       } 
/* 317 */       if (this.a.k.aw.a(i, j)) {
/* 318 */         if (dot.x());
/*     */ 
/*     */         
/* 321 */         dkh.a(this.a.n, this.a.aD().k(), this.a.aD().l(), this.a.f(), ☃ -> this.a.execute(()));
/*     */ 
/*     */         
/*     */         return;
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/* 329 */     boolean bool = (dmh == null || !(dmh.aw_() instanceof dlq) || !((dlq)dmh.aw_()).m());
/* 330 */     if (k != 0 && i == 66 && dot.x() && bool) {
/* 331 */       dkc.A.a(this.a.k, 1);
/*     */       
/* 333 */       if (dmh instanceof dov) {
/* 334 */         ((dov)dmh).h();
/*     */       }
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 341 */     if (dmh != null) {
/* 342 */       boolean[] arrayOfBoolean = { false };
/* 343 */       dot.a(() -> { if (☃ == 1 || (☃ == 2 && this.b)) { arrayOfBoolean[0] = dmh1.a(i, j, k); } else if (☃ == 0) { arrayOfBoolean[0] = dmh1.b(i, j, k); }  }"keyPressed event handler", dmh
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 349 */           .getClass().getCanonicalName());
/* 350 */       if (arrayOfBoolean[0]) {
/*     */         return;
/*     */       }
/*     */     } 
/*     */ 
/*     */     
/* 356 */     if (this.a.y == null || this.a.y.n) {
/* 357 */       deo.a a = deo.a(i, j);
/* 358 */       if (k == 0) {
/* 359 */         djw.a(a, false);
/*     */         
/* 361 */         if (i == 292) {
/* 362 */           if (this.g) {
/* 363 */             this.g = false;
/*     */           } else {
/* 365 */             this.a.k.aJ = !this.a.k.aJ;
/* 366 */             this.a.k.aK = (this.a.k.aJ && dot.y());
/* 367 */             this.a.k.aL = (this.a.k.aJ && dot.z());
/*     */           } 
/*     */         }
/*     */       } else {
/* 371 */         if (i == 293 && 
/* 372 */           this.a.h != null) {
/* 373 */           this.a.h.b();
/*     */         }
/*     */ 
/*     */         
/* 377 */         boolean bool1 = false;
/* 378 */         if (this.a.y == null) {
/* 379 */           if (i == 256) {
/* 380 */             boolean bool2 = deo.a(djz.C().aD().i(), 292);
/* 381 */             this.a.c(bool2);
/*     */           } 
/* 383 */           bool1 = (deo.a(djz.C().aD().i(), 292) && b(i));
/*     */           
/* 385 */           this.g |= bool1;
/*     */ 
/*     */           
/* 388 */           if (i == 290) {
/* 389 */             this.a.k.aI = !this.a.k.aI;
/*     */           }
/*     */         } 
/*     */ 
/*     */         
/* 394 */         if (bool1) {
/* 395 */           djw.a(a, false);
/*     */         } else {
/* 397 */           djw.a(a, true);
/* 398 */           djw.a(a);
/*     */         } 
/*     */         
/* 401 */         if (this.a.k.aK && 
/* 402 */           i >= 48 && i <= 57) {
/* 403 */           this.a.a(i - 48);
/*     */         }
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   private void a(long ☃, int i, int j) {
/* 411 */     if (☃ != this.a.aD().i()) {
/*     */       return;
/*     */     }
/* 414 */     dmi dmi = this.a.y;
/* 415 */     if (dmi == null || this.a.aA() != null) {
/*     */       return;
/*     */     }
/* 418 */     if (Character.charCount(i) == 1) {
/* 419 */       dot.a(() -> ☃.a((char)i, j), "charTyped event handler", dmi.getClass().getCanonicalName());
/*     */     } else {
/* 421 */       for (char c : Character.toChars(i)) {
/* 422 */         dot.a(() -> ☃.a(c, i), "charTyped event handler", dmi.getClass().getCanonicalName());
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   public void a(boolean ☃) {
/* 428 */     this.b = ☃;
/*     */   }
/*     */   
/*     */   public void a(long ☃) {
/* 432 */     deo.a(☃, (☃, i, j, k, m) -> this.a.execute(()), (☃, i, j) -> this.a.execute(()));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String a() {
/* 438 */     return this.c.a(this.a.aD().i(), (☃, l) -> {
/*     */           if (☃ != 65545) {
/*     */             this.a.aD().a(☃, l);
/*     */           }
/*     */         });
/*     */   }
/*     */   
/*     */   public void a(String ☃) {
/* 446 */     this.c.a(this.a.aD().i(), ☃);
/*     */   }
/*     */   
/*     */   public void b() {
/* 450 */     if (this.d > 0L) {
/* 451 */       long ☃ = x.b();
/* 452 */       long l1 = 10000L - ☃ - this.d;
/* 453 */       long l2 = ☃ - this.e;
/* 454 */       if (l1 < 0L) {
/* 455 */         if (dot.x()) {
/* 456 */           ddt.a();
/*     */         }
/* 458 */         throw new u(new l("Manually triggered debug crash", new Throwable()));
/*     */       } 
/* 460 */       if (l2 >= 1000L) {
/* 461 */         if (this.f == 0L) {
/* 462 */           a("debug.crash.message", new Object[0]);
/*     */         } else {
/* 464 */           b("debug.crash.warning", new Object[] { Integer.valueOf(afm.f((float)l1 / 1000.0F)) });
/*     */         } 
/* 466 */         this.e = ☃;
/* 467 */         this.f++;
/*     */       } 
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\djx.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */