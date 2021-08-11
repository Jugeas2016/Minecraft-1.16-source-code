/*     */ import com.google.common.collect.Lists;
/*     */ import java.util.List;
/*     */ import java.util.Random;
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
/*     */ public class crn
/*     */ {
/*  43 */   private static final vk[] a = new vk[] { new vk("underwater_ruin/warm_1"), new vk("underwater_ruin/warm_2"), new vk("underwater_ruin/warm_3"), new vk("underwater_ruin/warm_4"), new vk("underwater_ruin/warm_5"), new vk("underwater_ruin/warm_6"), new vk("underwater_ruin/warm_7"), new vk("underwater_ruin/warm_8") };
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
/*  54 */   private static final vk[] b = new vk[] { new vk("underwater_ruin/brick_1"), new vk("underwater_ruin/brick_2"), new vk("underwater_ruin/brick_3"), new vk("underwater_ruin/brick_4"), new vk("underwater_ruin/brick_5"), new vk("underwater_ruin/brick_6"), new vk("underwater_ruin/brick_7"), new vk("underwater_ruin/brick_8") };
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
/*  65 */   private static final vk[] c = new vk[] { new vk("underwater_ruin/cracked_1"), new vk("underwater_ruin/cracked_2"), new vk("underwater_ruin/cracked_3"), new vk("underwater_ruin/cracked_4"), new vk("underwater_ruin/cracked_5"), new vk("underwater_ruin/cracked_6"), new vk("underwater_ruin/cracked_7"), new vk("underwater_ruin/cracked_8") };
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
/*  76 */   private static final vk[] d = new vk[] { new vk("underwater_ruin/mossy_1"), new vk("underwater_ruin/mossy_2"), new vk("underwater_ruin/mossy_3"), new vk("underwater_ruin/mossy_4"), new vk("underwater_ruin/mossy_5"), new vk("underwater_ruin/mossy_6"), new vk("underwater_ruin/mossy_7"), new vk("underwater_ruin/mossy_8") };
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
/*  87 */   private static final vk[] e = new vk[] { new vk("underwater_ruin/big_brick_1"), new vk("underwater_ruin/big_brick_2"), new vk("underwater_ruin/big_brick_3"), new vk("underwater_ruin/big_brick_8") };
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  94 */   private static final vk[] f = new vk[] { new vk("underwater_ruin/big_mossy_1"), new vk("underwater_ruin/big_mossy_2"), new vk("underwater_ruin/big_mossy_3"), new vk("underwater_ruin/big_mossy_8") };
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 101 */   private static final vk[] g = new vk[] { new vk("underwater_ruin/big_cracked_1"), new vk("underwater_ruin/big_cracked_2"), new vk("underwater_ruin/big_cracked_3"), new vk("underwater_ruin/big_cracked_8") };
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 108 */   private static final vk[] h = new vk[] { new vk("underwater_ruin/big_warm_4"), new vk("underwater_ruin/big_warm_5"), new vk("underwater_ruin/big_warm_6"), new vk("underwater_ruin/big_warm_7") };
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static vk a(Random ☃) {
/* 116 */     return x.<vk>a(a, ☃);
/*     */   }
/*     */   
/*     */   private static vk b(Random ☃) {
/* 120 */     return x.<vk>a(h, ☃);
/*     */   }
/*     */   
/*     */   public static void a(csw ☃, fx fx1, bzm bzm1, List<cru> list, Random random, cmi cmi1) {
/* 124 */     boolean bool = (random.nextFloat() <= cmi1.c);
/* 125 */     float f = bool ? 0.9F : 0.8F;
/*     */     
/* 127 */     a(☃, fx1, bzm1, list, random, cmi1, bool, f);
/*     */     
/* 129 */     if (bool && random.nextFloat() <= cmi1.d) {
/* 130 */       a(☃, random, bzm1, fx1, cmi1, list);
/*     */     }
/*     */   }
/*     */   
/*     */   private static void a(csw ☃, Random random, bzm bzm1, fx fx1, cmi cmi1, List<cru> list) {
/* 135 */     int i = fx1.u();
/* 136 */     int j = fx1.w();
/* 137 */     fx fx2 = ctb.a(new fx(15, 0, 15), byg.a, bzm1, fx.b).b(i, 0, j);
/* 138 */     cra cra = cra.a(i, 0, j, fx2.u(), 0, fx2.w());
/* 139 */     fx fx3 = new fx(Math.min(i, fx2.u()), 0, Math.min(j, fx2.w()));
/* 140 */     List<fx> list1 = a(random, fx3.u(), fx3.w());
/* 141 */     int k = afm.a(random, 4, 8);
/*     */     
/* 143 */     for (int m = 0; m < k; m++) {
/* 144 */       if (!list1.isEmpty()) {
/* 145 */         int n = random.nextInt(list1.size());
/* 146 */         fx fx4 = list1.remove(n);
/* 147 */         int i1 = fx4.u();
/* 148 */         int i2 = fx4.w();
/* 149 */         bzm bzm2 = bzm.a(random);
/* 150 */         fx fx5 = ctb.a(new fx(5, 0, 6), byg.a, bzm2, fx.b).b(i1, 0, i2);
/* 151 */         cra cra1 = cra.a(i1, 0, i2, fx5.u(), 0, fx5.w());
/* 152 */         if (!cra1.b(cra))
/*     */         {
/*     */ 
/*     */           
/* 156 */           a(☃, fx4, bzm2, list, random, cmi1, false, 0.8F); } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   private static List<fx> a(Random ☃, int i, int j) {
/* 162 */     List<fx> list = Lists.newArrayList();
/* 163 */     list.add(new fx(i - 16 + afm.a(☃, 1, 8), 90, j + 16 + afm.a(☃, 1, 7)));
/* 164 */     list.add(new fx(i - 16 + afm.a(☃, 1, 8), 90, j + afm.a(☃, 1, 7)));
/* 165 */     list.add(new fx(i - 16 + afm.a(☃, 1, 8), 90, j - 16 + afm.a(☃, 4, 8)));
/* 166 */     list.add(new fx(i + afm.a(☃, 1, 7), 90, j + 16 + afm.a(☃, 1, 7)));
/* 167 */     list.add(new fx(i + afm.a(☃, 1, 7), 90, j - 16 + afm.a(☃, 4, 6)));
/* 168 */     list.add(new fx(i + 16 + afm.a(☃, 1, 7), 90, j + 16 + afm.a(☃, 3, 8)));
/* 169 */     list.add(new fx(i + 16 + afm.a(☃, 1, 7), 90, j + afm.a(☃, 1, 7)));
/* 170 */     list.add(new fx(i + 16 + afm.a(☃, 1, 7), 90, j - 16 + afm.a(☃, 4, 8)));
/*     */     
/* 172 */     return list;
/*     */   }
/*     */   
/*     */   private static void a(csw ☃, fx fx1, bzm bzm1, List<cru> list, Random random, cmi cmi1, boolean bool, float f) {
/* 176 */     if (cmi1.b == crm.b.a) {
/* 177 */       vk vk1 = bool ? b(random) : a(random);
/* 178 */       list.add(new a(☃, vk1, fx1, bzm1, f, cmi1.b, bool));
/* 179 */     } else if (cmi1.b == crm.b.b) {
/* 180 */       vk[] arrayOfVk1 = bool ? e : b;
/* 181 */       vk[] arrayOfVk2 = bool ? g : c;
/* 182 */       vk[] arrayOfVk3 = bool ? f : d;
/*     */       
/* 184 */       int i = random.nextInt(arrayOfVk1.length);
/* 185 */       list.add(new a(☃, arrayOfVk1[i], fx1, bzm1, f, cmi1.b, bool));
/* 186 */       list.add(new a(☃, arrayOfVk2[i], fx1, bzm1, 0.7F, cmi1.b, bool));
/* 187 */       list.add(new a(☃, arrayOfVk3[i], fx1, bzm1, 0.5F, cmi1.b, bool));
/*     */     } 
/*     */   }
/*     */   
/*     */   public static class a extends crx {
/*     */     private final crm.b d;
/*     */     private final float e;
/*     */     private final vk f;
/*     */     private final bzm g;
/*     */     private final boolean h;
/*     */     
/*     */     public a(csw ☃, vk vk1, fx fx1, bzm bzm1, float f, crm.b b1, boolean bool) {
/* 199 */       super(clb.H, 0);
/*     */       
/* 201 */       this.f = vk1;
/* 202 */       this.c = fx1;
/* 203 */       this.g = bzm1;
/* 204 */       this.e = f;
/* 205 */       this.d = b1;
/* 206 */       this.h = bool;
/*     */       
/* 208 */       a(☃);
/*     */     }
/*     */     
/*     */     public a(csw ☃, md md1) {
/* 212 */       super(clb.H, md1);
/* 213 */       this.f = new vk(md1.l("Template"));
/* 214 */       this.g = bzm.valueOf(md1.l("Rot"));
/* 215 */       this.e = md1.j("Integrity");
/* 216 */       this.d = crm.b.valueOf(md1.l("BiomeType"));
/* 217 */       this.h = md1.q("IsLarge");
/* 218 */       a(☃);
/*     */     }
/*     */     
/*     */     private void a(csw ☃) {
/* 222 */       ctb ctb = ☃.a(this.f);
/* 223 */       csx csx = (new csx()).a(this.g).a(byg.a).a(cse.d);
/* 224 */       a(ctb, this.c, csx);
/*     */     }
/*     */ 
/*     */     
/*     */     protected void a(md ☃) {
/* 229 */       super.a(☃);
/* 230 */       ☃.a("Template", this.f.toString());
/* 231 */       ☃.a("Rot", this.g.name());
/* 232 */       ☃.a("Integrity", this.e);
/* 233 */       ☃.a("BiomeType", this.d.toString());
/* 234 */       ☃.a("IsLarge", this.h);
/*     */     }
/*     */ 
/*     */     
/*     */     protected void a(String ☃, fx fx1, bsk bsk1, Random random, cra cra1) {
/* 239 */       if ("chest".equals(☃)) {
/* 240 */         bsk1.a(fx1, bup.bR.n().a(bve.d, Boolean.valueOf(bsk1.b(fx1).a(aef.b))), 2);
/*     */         
/* 242 */         ccj ccj = bsk1.c(fx1);
/* 243 */         if (ccj instanceof ccn) {
/* 244 */           ((ccn)ccj).a(this.h ? cyq.F : cyq.E, random.nextLong());
/*     */         }
/*     */       }
/* 247 */       else if ("drowned".equals(☃)) {
/* 248 */         bde bde = aqe.q.a(bsk1.E());
/* 249 */         bde.es();
/* 250 */         bde.a(fx1, 0.0F, 0.0F);
/* 251 */         bde.a(bsk1, bsk1.d(fx1), aqp.d, (arc)null, (md)null);
/* 252 */         bsk1.l(bde);
/* 253 */         if (fx1.v() > bsk1.t_()) {
/* 254 */           bsk1.a(fx1, bup.a.n(), 2);
/*     */         } else {
/* 256 */           bsk1.a(fx1, bup.A.n(), 2);
/*     */         } 
/*     */       } 
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean a(bsr ☃, bsn bsn1, cfy cfy1, Random random, cra cra1, brd brd1, fx fx1) {
/* 263 */       this.b.b().a(new csg(this.e)).a(cse.d);
/* 264 */       int i = ☃.a(chn.a.c, this.c.u(), this.c.w());
/* 265 */       this.c = new fx(this.c.u(), i, this.c.w());
/* 266 */       fx fx2 = ctb.a(new fx(this.a.a().u() - 1, 0, this.a.a().w() - 1), byg.a, this.g, fx.b).a(this.c);
/* 267 */       this.c = new fx(this.c.u(), a(this.c, ☃, fx2), this.c.w());
/*     */       
/* 269 */       return super.a(☃, bsn1, cfy1, random, cra1, brd1, fx1);
/*     */     }
/*     */     
/*     */     private int a(fx ☃, brc brc1, fx fx1) {
/* 273 */       int i = ☃.v();
/* 274 */       int j = 512;
/* 275 */       int k = i - 1;
/* 276 */       int m = 0;
/* 277 */       for (fx fx2 : fx.a(☃, fx1)) {
/* 278 */         int i1 = fx2.u();
/* 279 */         int i2 = fx2.w();
/* 280 */         int i3 = ☃.v() - 1;
/* 281 */         fx.a a1 = new fx.a(i1, i3, i2);
/* 282 */         ceh ceh = brc1.d_(a1);
/* 283 */         cux cux = brc1.b(a1);
/* 284 */         while ((ceh.g() || cux.a(aef.b) || ceh.b().a(aed.U)) && i3 > 1) {
/* 285 */           i3--;
/* 286 */           a1.d(i1, i3, i2);
/* 287 */           ceh = brc1.d_(a1);
/* 288 */           cux = brc1.b(a1);
/*     */         } 
/*     */         
/* 291 */         j = Math.min(j, i3);
/* 292 */         if (i3 < k - 2) {
/* 293 */           m++;
/*     */         }
/*     */       } 
/*     */       
/* 297 */       int n = Math.abs(☃.u() - fx1.u());
/* 298 */       if (k - j > 2 && m > n - 2) {
/* 299 */         i = j + 1;
/*     */       }
/*     */       
/* 302 */       return i;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\crn.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */