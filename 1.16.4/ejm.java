/*     */ import com.google.common.collect.Maps;
/*     */ import java.util.Map;
/*     */ import java.util.Optional;
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
/*     */ public class ejm
/*     */ {
/*  35 */   private static final Map<vk, ejn> a = Maps.newHashMap();
/*     */ 
/*     */ 
/*     */   
/*  39 */   private static final vk b = new vk("damaged"); private static final ejn d;
/*  40 */   private static final vk c = new vk("damage"); private static final ejn e;
/*     */   static {
/*  42 */     d = ((☃, dwt1, aqm1) -> ☃.f() ? 1.0F : 0.0F);
/*  43 */     e = ((☃, dwt1, aqm1) -> afm.a(☃.g() / ☃.h(), 0.0F, 1.0F));
/*     */   }
/*     */   private static ejn a(vk ☃, ejn ejn1) {
/*  46 */     a.put(☃, ejn1);
/*  47 */     return ejn1;
/*     */   }
/*     */   
/*  50 */   private static final Map<blx, Map<vk, ejn>> f = Maps.newHashMap();
/*     */   
/*     */   private static void a(blx ☃, vk vk1, ejn ejn1) {
/*  53 */     ((Map<vk, ejn>)f.computeIfAbsent(☃, ☃ -> Maps.newHashMap())).put(vk1, ejn1);
/*     */   }
/*     */   
/*     */   static {
/*  57 */     a(new vk("lefthanded"), (☃, dwt1, aqm1) -> 
/*  58 */         (aqm1 == null || aqm1.dV() == aqi.b) ? 0.0F : 1.0F);
/*     */ 
/*     */     
/*  61 */     a(new vk("cooldown"), (☃, dwt1, aqm1) -> (aqm1 instanceof bfw) ? ((bfw)aqm1).eT().a(☃.b(), 0.0F) : 0.0F);
/*     */ 
/*     */ 
/*     */     
/*  65 */     a(new vk("custom_model_data"), (☃, dwt1, aqm1) -> ☃.n() ? ☃.o().h("CustomModelData") : 0.0F);
/*     */ 
/*     */ 
/*     */     
/*  69 */     a(bmd.kc, new vk("pull"), (☃, dwt1, aqm1) -> (aqm1 == null) ? 0.0F : ((aqm1.dY() != ☃) ? 0.0F : ((☃.k() - aqm1.dZ()) / 20.0F)));
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
/*  80 */     a(bmd.kc, new vk("pulling"), (☃, dwt1, aqm1) -> 
/*  81 */         (aqm1 != null && aqm1.dW() && aqm1.dY() == ☃) ? 1.0F : 0.0F);
/*     */ 
/*     */     
/*  84 */     a(bmd.mj, new vk("time"), new ejn()
/*     */         {
/*     */           private double a;
/*     */           private double b;
/*     */           private long c;
/*     */           
/*     */           public float call(bmb ☃, @Nullable dwt dwt1, @Nullable aqm aqm1) {
/*  91 */             aqa aqa = (aqm1 != null) ? aqm1 : ☃.A();
/*     */             
/*  93 */             if (aqa == null) {
/*  94 */               return 0.0F;
/*     */             }
/*     */             
/*  97 */             if (dwt1 == null && aqa.l instanceof dwt) {
/*  98 */               dwt1 = (dwt)aqa.l;
/*     */             }
/*     */             
/* 101 */             if (dwt1 == null) {
/* 102 */               return 0.0F;
/*     */             }
/*     */ 
/*     */             
/* 106 */             if (dwt1.k().e()) {
/* 107 */               d = dwt1.f(1.0F);
/*     */             } else {
/* 109 */               d = Math.random();
/*     */             } 
/*     */             
/* 112 */             double d = a(dwt1, d);
/*     */             
/* 114 */             return (float)d;
/*     */           }
/*     */           
/*     */           private double a(brx ☃, double d) {
/* 118 */             if (☃.T() != this.c) {
/* 119 */               this.c = ☃.T();
/*     */               
/* 121 */               double d1 = d - this.a;
/* 122 */               d1 = afm.c(d1 + 0.5D, 1.0D) - 0.5D;
/*     */               
/* 124 */               this.b += d1 * 0.1D;
/* 125 */               this.b *= 0.9D;
/* 126 */               this.a = afm.c(this.a + this.b, 1.0D);
/*     */             } 
/*     */             
/* 129 */             return this.a;
/*     */           }
/*     */         });
/*     */     
/* 133 */     a(bmd.mh, new vk("angle"), new ejn() {
/* 134 */           private final ejm.a a = new ejm.a();
/* 135 */           private final ejm.a b = new ejm.a();
/*     */           
/*     */           public float call(bmb ☃, @Nullable dwt dwt1, @Nullable aqm aqm1) {
/*     */             double d3;
/* 139 */             aqa aqa = (aqm1 != null) ? aqm1 : ☃.A();
/*     */             
/* 141 */             if (aqa == null) {
/* 142 */               return 0.0F;
/*     */             }
/* 144 */             if (dwt1 == null && aqa.l instanceof dwt) {
/* 145 */               dwt1 = (dwt)aqa.l;
/*     */             }
/*     */             
/* 148 */             fx fx = bkq.d(☃) ? a(dwt1, ☃.p()) : a(dwt1);
/* 149 */             long l = dwt1.T();
/*     */             
/* 151 */             if (fx == null || aqa.cA().c(fx.u() + 0.5D, aqa.cA().b(), fx.w() + 0.5D) < 9.999999747378752E-6D) {
/* 152 */               if (ejm.a.a(this.b, l)) {
/* 153 */                 ejm.a.a(this.b, l, Math.random());
/*     */               }
/* 155 */               double d = ejm.a.a(this.b) + (☃.hashCode() / 2.14748365E9F);
/* 156 */               return afm.b((float)d, 1.0F);
/*     */             } 
/*     */             
/* 159 */             boolean bool = (aqm1 instanceof bfw && ((bfw)aqm1).ez());
/* 160 */             double d1 = 0.0D;
/* 161 */             if (bool) {
/* 162 */               d1 = aqm1.p;
/* 163 */             } else if (aqa instanceof bcp) {
/* 164 */               d1 = a((bcp)aqa);
/* 165 */             } else if (aqa instanceof bcv) {
/* 166 */               d1 = (180.0F - ((bcv)aqa).a(0.5F) / 6.2831855F * 360.0F);
/* 167 */             } else if (aqm1 != null) {
/* 168 */               d1 = aqm1.aA;
/*     */             } 
/* 170 */             d1 = afm.c(d1 / 360.0D, 1.0D);
/* 171 */             double d2 = a(dcn.a(fx), aqa) / 6.2831854820251465D;
/*     */ 
/*     */             
/* 174 */             if (bool) {
/* 175 */               if (ejm.a.a(this.a, l)) {
/* 176 */                 ejm.a.a(this.a, l, 0.5D - d1 - 0.25D);
/*     */               }
/* 178 */               d3 = d2 + ejm.a.a(this.a);
/*     */             } else {
/* 180 */               d3 = 0.5D - d1 - 0.25D - d2;
/*     */             } 
/* 182 */             return afm.b((float)d3, 1.0F);
/*     */           }
/*     */           
/*     */           @Nullable
/*     */           private fx a(dwt ☃) {
/* 187 */             return ☃.k().e() ? ☃.u() : null;
/*     */           }
/*     */           
/*     */           @Nullable
/*     */           private fx a(brx ☃, md md1) {
/* 192 */             boolean bool1 = md1.e("LodestonePos");
/* 193 */             boolean bool2 = md1.e("LodestoneDimension");
/* 194 */             if (bool1 && bool2) {
/* 195 */               Optional<vj<brx>> optional = bkq.a(md1);
/* 196 */               if (optional.isPresent() && ☃.Y() == optional.get()) {
/* 197 */                 return mp.b(md1.p("LodestonePos"));
/*     */               }
/*     */             } 
/* 200 */             return null;
/*     */           }
/*     */           
/*     */           private double a(bcp ☃) {
/* 204 */             gc gc = ☃.bZ();
/* 205 */             int i = gc.n().c() ? (90 * gc.e().a()) : 0;
/* 206 */             return afm.b(180 + gc.d() * 90 + ☃.p() * 45 + i);
/*     */           }
/*     */           
/*     */           private double a(dcn ☃, aqa aqa1) {
/* 210 */             return Math.atan2(☃.c() - aqa1.cH(), ☃.a() - aqa1.cD());
/*     */           }
/*     */         });
/*     */     
/* 214 */     a(bmd.qQ, new vk("pull"), (☃, dwt1, aqm1) -> (aqm1 == null) ? 0.0F : (bkt.d(☃) ? 0.0F : ((☃.k() - aqm1.dZ()) / bkt.g(☃))));
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
/* 226 */     a(bmd.qQ, new vk("pulling"), (☃, dwt1, aqm1) -> 
/* 227 */         (aqm1 != null && aqm1.dW() && aqm1.dY() == ☃ && !bkt.d(☃)) ? 1.0F : 0.0F);
/*     */ 
/*     */     
/* 230 */     a(bmd.qQ, new vk("charged"), (☃, dwt1, aqm1) -> 
/* 231 */         (aqm1 != null && bkt.d(☃)) ? 1.0F : 0.0F);
/*     */ 
/*     */     
/* 234 */     a(bmd.qQ, new vk("firework"), (☃, dwt1, aqm1) -> 
/* 235 */         (aqm1 != null && bkt.d(☃) && bkt.a(☃, bmd.po)) ? 1.0F : 0.0F);
/*     */ 
/*     */     
/* 238 */     a(bmd.qo, new vk("broken"), (☃, dwt1, aqm1) -> bld.d(☃) ? 0.0F : 1.0F);
/*     */ 
/*     */ 
/*     */     
/* 242 */     a(bmd.mi, new vk("cast"), (☃, dwt1, aqm1) -> {
/*     */           if (aqm1 == null) {
/*     */             return 0.0F;
/*     */           }
/*     */           
/*     */           boolean bool1 = (aqm1.dD() == ☃);
/*     */           boolean bool2 = (aqm1.dE() == ☃);
/*     */           if (aqm1.dD().b() instanceof blp) {
/*     */             bool2 = false;
/*     */           }
/* 252 */           return ((bool1 || bool2) && aqm1 instanceof bfw && ((bfw)aqm1).bI != null) ? 1.0F : 0.0F;
/*     */         });
/*     */     
/* 255 */     a(bmd.qn, new vk("blocking"), (☃, dwt1, aqm1) -> 
/* 256 */         (aqm1 != null && aqm1.dW() && aqm1.dY() == ☃) ? 1.0F : 0.0F);
/*     */ 
/*     */     
/* 259 */     a(bmd.qM, new vk("throwing"), (☃, dwt1, aqm1) -> 
/* 260 */         (aqm1 != null && aqm1.dW() && aqm1.dY() == ☃) ? 1.0F : 0.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public static ejn a(blx ☃, vk vk1) {
/* 266 */     if (☃.j() > 0) {
/* 267 */       if (c.equals(vk1)) {
/* 268 */         return e;
/*     */       }
/* 270 */       if (b.equals(vk1)) {
/* 271 */         return d;
/*     */       }
/*     */     } 
/*     */     
/* 275 */     ejn ejn1 = a.get(vk1);
/* 276 */     if (ejn1 != null) {
/* 277 */       return ejn1;
/*     */     }
/*     */     
/* 280 */     Map<vk, ejn> map = f.get(☃);
/* 281 */     if (map == null) {
/* 282 */       return null;
/*     */     }
/*     */     
/* 285 */     return map.get(vk1);
/*     */   }
/*     */   static class a { private double a;
/*     */     private double b;
/*     */     private long c;
/*     */     
/*     */     private a() {}
/*     */     
/*     */     private boolean a(long ☃) {
/* 294 */       return (this.c != ☃);
/*     */     }
/*     */     
/*     */     private void a(long ☃, double d) {
/* 298 */       this.c = ☃;
/* 299 */       double d1 = d - this.a;
/* 300 */       d1 = afm.c(d1 + 0.5D, 1.0D) - 0.5D;
/*     */       
/* 302 */       this.b += d1 * 0.1D;
/* 303 */       this.b *= 0.8D;
/* 304 */       this.a = afm.c(this.a + this.b, 1.0D);
/*     */     } }
/*     */ 
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ejm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */