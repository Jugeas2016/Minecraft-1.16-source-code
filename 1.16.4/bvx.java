/*     */ import java.util.List;
/*     */ import java.util.Random;
/*     */ import java.util.function.Predicate;
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
/*     */ public class bvx
/*     */   extends bug
/*     */ {
/*  30 */   public static final cfe<cfk> c = cex.ad;
/*  31 */   public static final cey d = cex.w;
/*     */ 
/*     */   
/*     */   public bvx(ceg.c ☃) {
/*  35 */     super(true, ☃);
/*  36 */     j(((ceh)this.n.b()).a(d, Boolean.valueOf(false)).a(c, cfk.a));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean b_(ceh ☃) {
/*  41 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(ceh ☃, brx brx1, fx fx1, aqa aqa1) {
/*  46 */     if (brx1.v) {
/*     */       return;
/*     */     }
/*     */     
/*  50 */     if (((Boolean)☃.c(d)).booleanValue()) {
/*     */       return;
/*     */     }
/*     */     
/*  54 */     a(brx1, fx1, ☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(ceh ☃, aag aag1, fx fx1, Random random) {
/*  59 */     if (!((Boolean)☃.c(d)).booleanValue()) {
/*     */       return;
/*     */     }
/*     */     
/*  63 */     a(aag1, fx1, ☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(ceh ☃, brc brc1, fx fx1, gc gc1) {
/*  68 */     return ((Boolean)☃.c(d)).booleanValue() ? 15 : 0;
/*     */   }
/*     */ 
/*     */   
/*     */   public int b(ceh ☃, brc brc1, fx fx1, gc gc1) {
/*  73 */     if (!((Boolean)☃.c(d)).booleanValue()) {
/*  74 */       return 0;
/*     */     }
/*  76 */     return (gc1 == gc.b) ? 15 : 0;
/*     */   }
/*     */   
/*     */   private void a(brx ☃, fx fx1, ceh ceh1) {
/*  80 */     if (!a(ceh1, ☃, fx1)) {
/*     */       return;
/*     */     }
/*     */     
/*  84 */     boolean bool1 = ((Boolean)ceh1.c(d)).booleanValue();
/*  85 */     boolean bool2 = false;
/*     */     
/*  87 */     List<bhl> list = a(☃, fx1, bhl.class, (Predicate<aqa>)null);
/*  88 */     if (!list.isEmpty()) {
/*  89 */       bool2 = true;
/*     */     }
/*     */     
/*  92 */     if (bool2 && !bool1) {
/*  93 */       ceh ceh2 = ceh1.a(d, Boolean.valueOf(true));
/*  94 */       ☃.a(fx1, ceh2, 3);
/*  95 */       b(☃, fx1, ceh2, true);
/*  96 */       ☃.b(fx1, this);
/*  97 */       ☃.b(fx1.c(), this);
/*  98 */       ☃.b(fx1, ceh1, ceh2);
/*     */     } 
/*     */     
/* 101 */     if (!bool2 && bool1) {
/* 102 */       ceh ceh2 = ceh1.a(d, Boolean.valueOf(false));
/* 103 */       ☃.a(fx1, ceh2, 3);
/* 104 */       b(☃, fx1, ceh2, false);
/* 105 */       ☃.b(fx1, this);
/* 106 */       ☃.b(fx1.c(), this);
/* 107 */       ☃.b(fx1, ceh1, ceh2);
/*     */     } 
/*     */     
/* 110 */     if (bool2) {
/* 111 */       ☃.J().a(fx1, this, 20);
/*     */     }
/*     */     
/* 114 */     ☃.c(fx1, this);
/*     */   }
/*     */   
/*     */   protected void b(brx ☃, fx fx1, ceh ceh1, boolean bool) {
/* 118 */     bzb bzb = new bzb(☃, fx1, ceh1);
/* 119 */     List<fx> list = bzb.a();
/*     */     
/* 121 */     for (fx fx2 : list) {
/* 122 */       ceh ceh2 = ☃.d_(fx2);
/* 123 */       ceh2.a(☃, fx2, ceh2.b(), fx1, false);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(ceh ☃, brx brx1, fx fx1, ceh ceh1, boolean bool) {
/* 129 */     if (ceh1.a(☃.b())) {
/*     */       return;
/*     */     }
/*     */     
/* 133 */     a(brx1, fx1, a(☃, brx1, fx1, bool));
/*     */   }
/*     */ 
/*     */   
/*     */   public cfj<cfk> d() {
/* 138 */     return c;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(ceh ☃) {
/* 143 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(ceh ☃, brx brx1, fx fx1) {
/* 148 */     if (((Boolean)☃.c(d)).booleanValue()) {
/* 149 */       List<bhr> list = a(brx1, fx1, bhr.class, (Predicate<aqa>)null);
/* 150 */       if (!list.isEmpty()) {
/* 151 */         return ((bhr)list.get(0)).u().i();
/*     */       }
/*     */       
/* 154 */       List<bhl> list1 = a(brx1, fx1, bhl.class, aqd.d);
/* 155 */       if (!list1.isEmpty()) {
/* 156 */         return bic.b((aon)list1.get(0));
/*     */       }
/*     */     } 
/*     */     
/* 160 */     return 0;
/*     */   }
/*     */   
/*     */   protected <T extends bhl> List<T> a(brx ☃, fx fx1, Class<T> clazz, @Nullable Predicate<aqa> predicate) {
/* 164 */     return (List)☃.a((Class)clazz, a(fx1), predicate);
/*     */   }
/*     */   
/*     */   private dci a(fx ☃) {
/* 168 */     double d = 0.2D;
/*     */     
/* 170 */     return new dci(☃.u() + 0.2D, ☃.v(), ☃.w() + 0.2D, (☃.u() + 1) - 0.2D, (☃.v() + 1) - 0.2D, (☃.w() + 1) - 0.2D);
/*     */   }
/*     */ 
/*     */   
/*     */   public ceh a(ceh ☃, bzm bzm1) {
/* 175 */     switch (null.b[bzm1.ordinal()]) {
/*     */       case 1:
/* 177 */         switch (null.a[((cfk)☃.c(c)).ordinal()]) {
/*     */           case 1:
/* 179 */             return ☃.a(c, cfk.d);
/*     */           case 2:
/* 181 */             return ☃.a(c, cfk.c);
/*     */           case 3:
/* 183 */             return ☃.a(c, cfk.f);
/*     */           case 4:
/* 185 */             return ☃.a(c, cfk.e);
/*     */           case 5:
/* 187 */             return ☃.a(c, cfk.i);
/*     */           case 6:
/* 189 */             return ☃.a(c, cfk.j);
/*     */           case 7:
/* 191 */             return ☃.a(c, cfk.g);
/*     */           case 8:
/* 193 */             return ☃.a(c, cfk.h);
/*     */         } 
/*     */       case 2:
/* 196 */         switch (null.a[((cfk)☃.c(c)).ordinal()]) {
/*     */           case 9:
/* 198 */             return ☃.a(c, cfk.b);
/*     */           case 10:
/* 200 */             return ☃.a(c, cfk.a);
/*     */           case 1:
/* 202 */             return ☃.a(c, cfk.e);
/*     */           case 2:
/* 204 */             return ☃.a(c, cfk.f);
/*     */           case 3:
/* 206 */             return ☃.a(c, cfk.d);
/*     */           case 4:
/* 208 */             return ☃.a(c, cfk.c);
/*     */           case 5:
/* 210 */             return ☃.a(c, cfk.j);
/*     */           case 6:
/* 212 */             return ☃.a(c, cfk.g);
/*     */           case 7:
/* 214 */             return ☃.a(c, cfk.h);
/*     */           case 8:
/* 216 */             return ☃.a(c, cfk.i);
/*     */         } 
/*     */       case 3:
/* 219 */         switch (null.a[((cfk)☃.c(c)).ordinal()]) {
/*     */           case 9:
/* 221 */             return ☃.a(c, cfk.b);
/*     */           case 10:
/* 223 */             return ☃.a(c, cfk.a);
/*     */           case 1:
/* 225 */             return ☃.a(c, cfk.f);
/*     */           case 2:
/* 227 */             return ☃.a(c, cfk.e);
/*     */           case 3:
/* 229 */             return ☃.a(c, cfk.c);
/*     */           case 4:
/* 231 */             return ☃.a(c, cfk.d);
/*     */           case 5:
/* 233 */             return ☃.a(c, cfk.h);
/*     */           case 6:
/* 235 */             return ☃.a(c, cfk.i);
/*     */           case 7:
/* 237 */             return ☃.a(c, cfk.j);
/*     */           case 8:
/* 239 */             return ☃.a(c, cfk.g);
/*     */         }  break;
/*     */     } 
/* 242 */     return ☃;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public ceh a(ceh ☃, byg byg1) {
/* 248 */     cfk cfk = (cfk)☃.c(c);
/* 249 */     switch (null.c[byg1.ordinal()]) {
/*     */       case 1:
/* 251 */         switch (null.a[cfk.ordinal()]) {
/*     */           case 3:
/* 253 */             return ☃.a(c, cfk.f);
/*     */           case 4:
/* 255 */             return ☃.a(c, cfk.e);
/*     */           case 5:
/* 257 */             return ☃.a(c, cfk.j);
/*     */           case 6:
/* 259 */             return ☃.a(c, cfk.i);
/*     */           case 7:
/* 261 */             return ☃.a(c, cfk.h);
/*     */           case 8:
/* 263 */             return ☃.a(c, cfk.g);
/*     */         } 
/*     */         
/*     */         break;
/*     */       
/*     */       case 2:
/* 269 */         switch (null.a[cfk.ordinal()]) {
/*     */           case 1:
/* 271 */             return ☃.a(c, cfk.d);
/*     */           case 2:
/* 273 */             return ☃.a(c, cfk.c);
/*     */           case 5:
/* 275 */             return ☃.a(c, cfk.h);
/*     */           case 6:
/* 277 */             return ☃.a(c, cfk.g);
/*     */           case 7:
/* 279 */             return ☃.a(c, cfk.j);
/*     */           case 8:
/* 281 */             return ☃.a(c, cfk.i);
/*     */         } 
/*     */ 
/*     */         
/*     */         break;
/*     */     } 
/*     */ 
/*     */     
/* 289 */     return super.a(☃, byg1);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(cei.a<buo, ceh> ☃) {
/* 294 */     ☃.a((cfj<?>[])new cfj[] { c, d });
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bvx.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */