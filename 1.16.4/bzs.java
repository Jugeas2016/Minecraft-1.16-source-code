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
/*     */ public class bzs
/*     */   extends bud
/*     */ {
/*  50 */   public static final cfe<gc> a = bvz.a;
/*     */   
/*  52 */   public static final vk b = new vk("contents");
/*     */   
/*     */   @Nullable
/*     */   private final bkx c;
/*     */   
/*     */   public bzs(@Nullable bkx ☃, ceg.c c1) {
/*  58 */     super(c1);
/*  59 */     this.c = ☃;
/*  60 */     j(((ceh)this.n.b()).a(a, gc.b));
/*     */   }
/*     */ 
/*     */   
/*     */   public ccj a(brc ☃) {
/*  65 */     return new cde(this.c);
/*     */   }
/*     */ 
/*     */   
/*     */   public bzh b(ceh ☃) {
/*  70 */     return bzh.b;
/*     */   }
/*     */ 
/*     */   
/*     */   public aou a(ceh ☃, brx brx1, fx fx1, bfw bfw1, aot aot1, dcj dcj1) {
/*  75 */     if (brx1.v) {
/*  76 */       return aou.a;
/*     */     }
/*     */     
/*  79 */     if (bfw1.a_()) {
/*  80 */       return aou.b;
/*     */     }
/*     */     
/*  83 */     ccj ccj = brx1.c(fx1);
/*  84 */     if (ccj instanceof cde) {
/*  85 */       boolean bool; cde cde = (cde)ccj;
/*     */       
/*  87 */       if (cde.j() == cde.a.a) {
/*  88 */         gc gc = (gc)☃.c(a);
/*  89 */         bool = brx1.b(aoz.a(fx1, gc));
/*     */       } else {
/*  91 */         bool = true;
/*     */       } 
/*  93 */       if (bool) {
/*  94 */         bfw1.a(cde);
/*  95 */         bfw1.a(aea.ap);
/*  96 */         bet.a(bfw1, true);
/*     */       } 
/*  98 */       return aou.b;
/*     */     } 
/* 100 */     return aou.c;
/*     */   }
/*     */ 
/*     */   
/*     */   public ceh a(bny ☃) {
/* 105 */     return n().a(a, ☃.j());
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(cei.a<buo, ceh> ☃) {
/* 110 */     ☃.a((cfj<?>[])new cfj[] { a });
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(brx ☃, fx fx1, ceh ceh1, bfw bfw1) {
/* 115 */     ccj ccj = ☃.c(fx1);
/* 116 */     if (ccj instanceof cde) {
/* 117 */       cde cde = (cde)ccj;
/* 118 */       if (!☃.v && bfw1.b_() && !cde.c()) {
/*     */         
/* 120 */         bmb bmb = b(c());
/* 121 */         md md = cde.e(new md());
/* 122 */         if (!md.isEmpty()) {
/* 123 */           bmb.a("BlockEntityTag", md);
/*     */         }
/*     */         
/* 126 */         if (cde.S()) {
/* 127 */           bmb.a(cde.T());
/*     */         }
/*     */         
/* 130 */         bcv bcv = new bcv(☃, fx1.u() + 0.5D, fx1.v() + 0.5D, fx1.w() + 0.5D, bmb);
/* 131 */         bcv.m();
/* 132 */         ☃.c(bcv);
/*     */       } else {
/* 134 */         cde.d(bfw1);
/*     */       } 
/*     */     } 
/* 137 */     super.a(☃, fx1, ceh1, bfw1);
/*     */   }
/*     */ 
/*     */   
/*     */   public List<bmb> a(ceh ☃, cyv.a a1) {
/* 142 */     ccj ccj = a1.<ccj>b(dbc.h);
/*     */     
/* 144 */     if (ccj instanceof cde) {
/* 145 */       cde cde = (cde)ccj;
/* 146 */       a1 = a1.a(b, (cyv1, consumer) -> {
/*     */             for (int i = 0; i < ☃.Z_(); i++) {
/*     */               consumer.accept(☃.a(i));
/*     */             }
/*     */           });
/*     */     } 
/* 152 */     return super.a(☃, a1);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(brx ☃, fx fx1, ceh ceh1, aqm aqm1, bmb bmb1) {
/* 157 */     if (bmb1.t()) {
/* 158 */       ccj ccj = ☃.c(fx1);
/* 159 */       if (ccj instanceof cde) {
/* 160 */         ((cde)ccj).a(bmb1.r());
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(ceh ☃, brx brx1, fx fx1, ceh ceh1, boolean bool) {
/* 167 */     if (☃.a(ceh1.b())) {
/*     */       return;
/*     */     }
/* 170 */     ccj ccj = brx1.c(fx1);
/*     */     
/* 172 */     if (ccj instanceof cde) {
/* 173 */       brx1.c(fx1, ☃.b());
/*     */     }
/*     */     
/* 176 */     super.a(☃, brx1, fx1, ceh1, bool);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(bmb ☃, @Nullable brc brc1, List<nr> list, bnl bnl1) {
/* 181 */     super.a(☃, brc1, list, bnl1);
/*     */     
/* 183 */     md md = ☃.b("BlockEntityTag");
/* 184 */     if (md != null) {
/* 185 */       if (md.c("LootTable", 8)) {
/* 186 */         list.add(new oe("???????"));
/*     */       }
/*     */       
/* 189 */       if (md.c("Items", 9)) {
/* 190 */         gj<bmb> gj = gj.a(27, bmb.b);
/* 191 */         aoo.b(md, gj);
/*     */         
/* 193 */         int i = 0;
/* 194 */         int j = 0;
/* 195 */         for (bmb bmb1 : gj) {
/* 196 */           if (!bmb1.a()) {
/* 197 */             j++;
/* 198 */             if (i > 4) {
/*     */               continue;
/*     */             }
/* 201 */             i++;
/* 202 */             nx nx = bmb1.r().e();
/* 203 */             nx.c(" x").c(String.valueOf(bmb1.E()));
/* 204 */             list.add(nx);
/*     */           } 
/*     */         } 
/*     */         
/* 208 */         if (j - i > 0) {
/* 209 */           list.add((new of("container.shulkerBox.more", new Object[] { Integer.valueOf(j - i) })).a(k.u));
/*     */         }
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public cvc f(ceh ☃) {
/* 217 */     return cvc.b;
/*     */   }
/*     */ 
/*     */   
/*     */   public ddh b(ceh ☃, brc brc1, fx fx1, dcs dcs1) {
/* 222 */     ccj ccj = brc1.c(fx1);
/* 223 */     if (ccj instanceof cde) {
/* 224 */       return dde.a(((cde)ccj).a(☃));
/*     */     }
/* 226 */     return dde.b();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(ceh ☃) {
/* 231 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(ceh ☃, brx brx1, fx fx1) {
/* 236 */     return bic.b((aon)brx1.c(fx1));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public bmb a(brc ☃, fx fx1, ceh ceh1) {
/* 243 */     bmb bmb = super.a(☃, fx1, ceh1);
/* 244 */     cde cde = (cde)☃.c(fx1);
/* 245 */     md md = cde.e(new md());
/* 246 */     if (!md.isEmpty()) {
/* 247 */       bmb.a("BlockEntityTag", md);
/*     */     }
/* 249 */     return bmb;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public static bkx b(blx ☃) {
/* 254 */     return c(buo.a(☃));
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public static bkx c(buo ☃) {
/* 259 */     if (☃ instanceof bzs) {
/* 260 */       return ((bzs)☃).c();
/*     */     }
/* 262 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public static buo a(@Nullable bkx ☃) {
/* 267 */     if (☃ == null) {
/* 268 */       return bup.iP;
/*     */     }
/* 270 */     switch (null.a[☃.ordinal()])
/*     */     { case 1:
/* 272 */         return bup.iQ;
/*     */       case 2:
/* 274 */         return bup.iR;
/*     */       case 3:
/* 276 */         return bup.iS;
/*     */       case 4:
/* 278 */         return bup.iT;
/*     */       case 5:
/* 280 */         return bup.iU;
/*     */       case 6:
/* 282 */         return bup.iV;
/*     */       case 7:
/* 284 */         return bup.iW;
/*     */       case 8:
/* 286 */         return bup.iX;
/*     */       case 9:
/* 288 */         return bup.iY;
/*     */       case 10:
/* 290 */         return bup.iZ;
/*     */       
/*     */       default:
/* 293 */         return bup.ja;
/*     */       case 12:
/* 295 */         return bup.jb;
/*     */       case 13:
/* 297 */         return bup.jc;
/*     */       case 14:
/* 299 */         return bup.jd;
/*     */       case 15:
/* 301 */         return bup.je;
/*     */       case 16:
/* 303 */         break; }  return bup.jf;
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public bkx c() {
/* 309 */     return this.c;
/*     */   }
/*     */   
/*     */   public static bmb b(@Nullable bkx ☃) {
/* 313 */     return new bmb(a(☃));
/*     */   }
/*     */ 
/*     */   
/*     */   public ceh a(ceh ☃, bzm bzm1) {
/* 318 */     return ☃.a(a, bzm1.a((gc)☃.c(a)));
/*     */   }
/*     */ 
/*     */   
/*     */   public ceh a(ceh ☃, byg byg1) {
/* 323 */     return ☃.a(byg1.a((gc)☃.c(a)));
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bzs.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */