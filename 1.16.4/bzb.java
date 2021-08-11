/*     */ import com.google.common.collect.Lists;
/*     */ import java.util.List;
/*     */ import javax.annotation.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class bzb
/*     */ {
/*     */   private final brx a;
/*     */   private final fx b;
/*     */   private final bug c;
/*     */   private ceh d;
/*     */   private final boolean e;
/*  19 */   private final List<fx> f = Lists.newArrayList();
/*     */   
/*     */   public bzb(brx ☃, fx fx1, ceh ceh1) {
/*  22 */     this.a = ☃;
/*  23 */     this.b = fx1;
/*  24 */     this.d = ceh1;
/*  25 */     this.c = (bug)ceh1.b();
/*  26 */     cfk cfk = (cfk)ceh1.c(this.c.d());
/*  27 */     this.e = this.c.c();
/*  28 */     a(cfk);
/*     */   }
/*     */   
/*     */   public List<fx> a() {
/*  32 */     return this.f;
/*     */   }
/*     */   
/*     */   private void a(cfk ☃) {
/*  36 */     this.f.clear();
/*  37 */     switch (null.a[☃.ordinal()]) {
/*     */       case 1:
/*  39 */         this.f.add(this.b.d());
/*  40 */         this.f.add(this.b.e());
/*     */         break;
/*     */       case 2:
/*  43 */         this.f.add(this.b.f());
/*  44 */         this.f.add(this.b.g());
/*     */         break;
/*     */       case 3:
/*  47 */         this.f.add(this.b.f());
/*  48 */         this.f.add(this.b.g().b());
/*     */         break;
/*     */       case 4:
/*  51 */         this.f.add(this.b.f().b());
/*  52 */         this.f.add(this.b.g());
/*     */         break;
/*     */       case 5:
/*  55 */         this.f.add(this.b.d().b());
/*  56 */         this.f.add(this.b.e());
/*     */         break;
/*     */       case 6:
/*  59 */         this.f.add(this.b.d());
/*  60 */         this.f.add(this.b.e().b());
/*     */         break;
/*     */       case 7:
/*  63 */         this.f.add(this.b.g());
/*  64 */         this.f.add(this.b.e());
/*     */         break;
/*     */       case 8:
/*  67 */         this.f.add(this.b.f());
/*  68 */         this.f.add(this.b.e());
/*     */         break;
/*     */       case 9:
/*  71 */         this.f.add(this.b.f());
/*  72 */         this.f.add(this.b.d());
/*     */         break;
/*     */       case 10:
/*  75 */         this.f.add(this.b.g());
/*  76 */         this.f.add(this.b.d());
/*     */         break;
/*     */     } 
/*     */   }
/*     */   
/*     */   private void d() {
/*  82 */     for (int ☃ = 0; ☃ < this.f.size(); ☃++) {
/*  83 */       bzb bzb1 = b(this.f.get(☃));
/*  84 */       if (bzb1 == null || !bzb1.a(this)) {
/*  85 */         this.f.remove(☃--);
/*     */       } else {
/*  87 */         this.f.set(☃, bzb1.b);
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   private boolean a(fx ☃) {
/*  93 */     return (bug.a(this.a, ☃) || bug.a(this.a, ☃.b()) || bug.a(this.a, ☃.c()));
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   private bzb b(fx ☃) {
/*  98 */     fx fx1 = ☃;
/*  99 */     ceh ceh1 = this.a.d_(fx1);
/* 100 */     if (bug.g(ceh1)) {
/* 101 */       return new bzb(this.a, fx1, ceh1);
/*     */     }
/*     */     
/* 104 */     fx1 = ☃.b();
/* 105 */     ceh1 = this.a.d_(fx1);
/* 106 */     if (bug.g(ceh1)) {
/* 107 */       return new bzb(this.a, fx1, ceh1);
/*     */     }
/*     */     
/* 110 */     fx1 = ☃.c();
/* 111 */     ceh1 = this.a.d_(fx1);
/* 112 */     if (bug.g(ceh1)) {
/* 113 */       return new bzb(this.a, fx1, ceh1);
/*     */     }
/*     */     
/* 116 */     return null;
/*     */   }
/*     */   
/*     */   private boolean a(bzb ☃) {
/* 120 */     return c(☃.b);
/*     */   }
/*     */   
/*     */   private boolean c(fx ☃) {
/* 124 */     for (int i = 0; i < this.f.size(); i++) {
/* 125 */       fx fx1 = this.f.get(i);
/* 126 */       if (fx1.u() == ☃.u() && fx1.w() == ☃.w()) {
/* 127 */         return true;
/*     */       }
/*     */     } 
/* 130 */     return false;
/*     */   }
/*     */   
/*     */   protected int b() {
/* 134 */     int ☃ = 0;
/*     */     
/* 136 */     for (gc gc : gc.c.a) {
/* 137 */       if (a(this.b.a(gc))) {
/* 138 */         ☃++;
/*     */       }
/*     */     } 
/*     */     
/* 142 */     return ☃;
/*     */   }
/*     */   
/*     */   private boolean b(bzb ☃) {
/* 146 */     return (a(☃) || this.f.size() != 2);
/*     */   }
/*     */   
/*     */   private void c(bzb ☃) {
/* 150 */     this.f.add(☃.b);
/*     */     
/* 152 */     fx fx1 = this.b.d();
/* 153 */     fx fx2 = this.b.e();
/* 154 */     fx fx3 = this.b.f();
/* 155 */     fx fx4 = this.b.g();
/*     */     
/* 157 */     boolean bool1 = c(fx1);
/* 158 */     boolean bool2 = c(fx2);
/* 159 */     boolean bool3 = c(fx3);
/* 160 */     boolean bool4 = c(fx4);
/*     */     
/* 162 */     cfk cfk = null;
/*     */     
/* 164 */     if (bool1 || bool2) {
/* 165 */       cfk = cfk.a;
/*     */     }
/* 167 */     if (bool3 || bool4) {
/* 168 */       cfk = cfk.b;
/*     */     }
/* 170 */     if (!this.e) {
/* 171 */       if (bool2 && bool4 && !bool1 && !bool3) {
/* 172 */         cfk = cfk.g;
/*     */       }
/* 174 */       if (bool2 && bool3 && !bool1 && !bool4) {
/* 175 */         cfk = cfk.h;
/*     */       }
/* 177 */       if (bool1 && bool3 && !bool2 && !bool4) {
/* 178 */         cfk = cfk.i;
/*     */       }
/* 180 */       if (bool1 && bool4 && !bool2 && !bool3) {
/* 181 */         cfk = cfk.j;
/*     */       }
/*     */     } 
/* 184 */     if (cfk == cfk.a) {
/* 185 */       if (bug.a(this.a, fx1.b())) {
/* 186 */         cfk = cfk.e;
/*     */       }
/* 188 */       if (bug.a(this.a, fx2.b())) {
/* 189 */         cfk = cfk.f;
/*     */       }
/*     */     } 
/* 192 */     if (cfk == cfk.b) {
/* 193 */       if (bug.a(this.a, fx4.b())) {
/* 194 */         cfk = cfk.c;
/*     */       }
/* 196 */       if (bug.a(this.a, fx3.b())) {
/* 197 */         cfk = cfk.d;
/*     */       }
/*     */     } 
/*     */     
/* 201 */     if (cfk == null) {
/* 202 */       cfk = cfk.a;
/*     */     }
/*     */     
/* 205 */     this.d = this.d.a(this.c.d(), cfk);
/* 206 */     this.a.a(this.b, this.d, 3);
/*     */   }
/*     */   
/*     */   private boolean d(fx ☃) {
/* 210 */     bzb bzb1 = b(☃);
/* 211 */     if (bzb1 == null) {
/* 212 */       return false;
/*     */     }
/*     */     
/* 215 */     bzb1.d();
/* 216 */     return bzb1.b(this);
/*     */   }
/*     */   
/*     */   public bzb a(boolean ☃, boolean bool1, cfk cfk1) {
/* 220 */     fx fx1 = this.b.d();
/* 221 */     fx fx2 = this.b.e();
/* 222 */     fx fx3 = this.b.f();
/* 223 */     fx fx4 = this.b.g();
/*     */     
/* 225 */     boolean bool2 = d(fx1);
/* 226 */     boolean bool3 = d(fx2);
/* 227 */     boolean bool4 = d(fx3);
/* 228 */     boolean bool5 = d(fx4);
/*     */     
/* 230 */     cfk cfk2 = null;
/*     */     
/* 232 */     boolean bool6 = (bool2 || bool3);
/* 233 */     boolean bool7 = (bool4 || bool5);
/* 234 */     if (bool6 && !bool7) {
/* 235 */       cfk2 = cfk.a;
/*     */     }
/* 237 */     if (bool7 && !bool6) {
/* 238 */       cfk2 = cfk.b;
/*     */     }
/*     */     
/* 241 */     boolean bool8 = (bool3 && bool5);
/* 242 */     boolean bool9 = (bool3 && bool4);
/* 243 */     boolean bool10 = (bool2 && bool5);
/* 244 */     boolean bool11 = (bool2 && bool4);
/*     */     
/* 246 */     if (!this.e) {
/* 247 */       if (bool8 && !bool2 && !bool4) {
/* 248 */         cfk2 = cfk.g;
/*     */       }
/* 250 */       if (bool9 && !bool2 && !bool5) {
/* 251 */         cfk2 = cfk.h;
/*     */       }
/* 253 */       if (bool11 && !bool3 && !bool5) {
/* 254 */         cfk2 = cfk.i;
/*     */       }
/* 256 */       if (bool10 && !bool3 && !bool4) {
/* 257 */         cfk2 = cfk.j;
/*     */       }
/*     */     } 
/* 260 */     if (cfk2 == null) {
/* 261 */       if (bool6 && bool7) {
/* 262 */         cfk2 = cfk1;
/* 263 */       } else if (bool6) {
/* 264 */         cfk2 = cfk.a;
/* 265 */       } else if (bool7) {
/* 266 */         cfk2 = cfk.b;
/*     */       } 
/*     */       
/* 269 */       if (!this.e) {
/* 270 */         if (☃) {
/* 271 */           if (bool8) {
/* 272 */             cfk2 = cfk.g;
/*     */           }
/* 274 */           if (bool9) {
/* 275 */             cfk2 = cfk.h;
/*     */           }
/* 277 */           if (bool10) {
/* 278 */             cfk2 = cfk.j;
/*     */           }
/* 280 */           if (bool11) {
/* 281 */             cfk2 = cfk.i;
/*     */           }
/*     */         } else {
/* 284 */           if (bool11) {
/* 285 */             cfk2 = cfk.i;
/*     */           }
/* 287 */           if (bool10) {
/* 288 */             cfk2 = cfk.j;
/*     */           }
/* 290 */           if (bool9) {
/* 291 */             cfk2 = cfk.h;
/*     */           }
/* 293 */           if (bool8) {
/* 294 */             cfk2 = cfk.g;
/*     */           }
/*     */         } 
/*     */       }
/*     */     } 
/*     */     
/* 300 */     if (cfk2 == cfk.a) {
/* 301 */       if (bug.a(this.a, fx1.b())) {
/* 302 */         cfk2 = cfk.e;
/*     */       }
/* 304 */       if (bug.a(this.a, fx2.b())) {
/* 305 */         cfk2 = cfk.f;
/*     */       }
/*     */     } 
/* 308 */     if (cfk2 == cfk.b) {
/* 309 */       if (bug.a(this.a, fx4.b())) {
/* 310 */         cfk2 = cfk.c;
/*     */       }
/* 312 */       if (bug.a(this.a, fx3.b())) {
/* 313 */         cfk2 = cfk.d;
/*     */       }
/*     */     } 
/*     */     
/* 317 */     if (cfk2 == null) {
/* 318 */       cfk2 = cfk1;
/*     */     }
/*     */     
/* 321 */     a(cfk2);
/* 322 */     this.d = this.d.a(this.c.d(), cfk2);
/*     */     
/* 324 */     if (bool1 || this.a.d_(this.b) != this.d) {
/* 325 */       this.a.a(this.b, this.d, 3);
/*     */       
/* 327 */       for (int i = 0; i < this.f.size(); i++) {
/* 328 */         bzb bzb1 = b(this.f.get(i));
/* 329 */         if (bzb1 != null) {
/*     */ 
/*     */           
/* 332 */           bzb1.d();
/*     */           
/* 334 */           if (bzb1.b(this)) {
/* 335 */             bzb1.c(this);
/*     */           }
/*     */         } 
/*     */       } 
/*     */     } 
/* 340 */     return this;
/*     */   }
/*     */   
/*     */   public ceh c() {
/* 344 */     return this.d;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bzb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */