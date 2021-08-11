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
/*     */ public class byx
/*     */   extends bug
/*     */ {
/*  14 */   public static final cfe<cfk> c = cex.ad;
/*  15 */   public static final cey d = cex.w;
/*     */   
/*     */   protected byx(ceg.c ☃) {
/*  18 */     super(true, ☃);
/*  19 */     j(((ceh)this.n.b()).a(c, cfk.a).a(d, Boolean.valueOf(false)));
/*     */   }
/*     */   
/*     */   protected boolean a(brx ☃, fx fx1, ceh ceh1, boolean bool, int i) {
/*  23 */     if (i >= 8) {
/*  24 */       return false;
/*     */     }
/*     */     
/*  27 */     int j = fx1.u();
/*  28 */     int k = fx1.v();
/*  29 */     int m = fx1.w();
/*     */     
/*  31 */     boolean bool1 = true;
/*  32 */     cfk cfk = (cfk)ceh1.c(c);
/*  33 */     switch (null.a[cfk.ordinal()]) {
/*     */       case 1:
/*  35 */         if (bool) {
/*  36 */           m++; break;
/*     */         } 
/*  38 */         m--;
/*     */         break;
/*     */       
/*     */       case 2:
/*  42 */         if (bool) {
/*  43 */           j--; break;
/*     */         } 
/*  45 */         j++;
/*     */         break;
/*     */       
/*     */       case 3:
/*  49 */         if (bool) {
/*  50 */           j--;
/*     */         } else {
/*  52 */           j++;
/*  53 */           k++;
/*  54 */           bool1 = false;
/*     */         } 
/*  56 */         cfk = cfk.b;
/*     */         break;
/*     */       case 4:
/*  59 */         if (bool) {
/*  60 */           j--;
/*  61 */           k++;
/*  62 */           bool1 = false;
/*     */         } else {
/*  64 */           j++;
/*     */         } 
/*  66 */         cfk = cfk.b;
/*     */         break;
/*     */       case 5:
/*  69 */         if (bool) {
/*  70 */           m++;
/*     */         } else {
/*  72 */           m--;
/*  73 */           k++;
/*  74 */           bool1 = false;
/*     */         } 
/*  76 */         cfk = cfk.a;
/*     */         break;
/*     */       case 6:
/*  79 */         if (bool) {
/*  80 */           m++;
/*  81 */           k++;
/*  82 */           bool1 = false;
/*     */         } else {
/*  84 */           m--;
/*     */         } 
/*  86 */         cfk = cfk.a;
/*     */         break;
/*     */     } 
/*     */     
/*  90 */     if (a(☃, new fx(j, k, m), bool, i, cfk)) {
/*  91 */       return true;
/*     */     }
/*  93 */     if (bool1 && a(☃, new fx(j, k - 1, m), bool, i, cfk)) {
/*  94 */       return true;
/*     */     }
/*  96 */     return false;
/*     */   }
/*     */   
/*     */   protected boolean a(brx ☃, fx fx1, boolean bool, int i, cfk cfk1) {
/* 100 */     ceh ceh = ☃.d_(fx1);
/*     */     
/* 102 */     if (!ceh.a(this)) {
/* 103 */       return false;
/*     */     }
/*     */     
/* 106 */     cfk cfk2 = (cfk)ceh.c(c);
/* 107 */     if (cfk1 == cfk.b && (cfk2 == cfk.a || cfk2 == cfk.e || cfk2 == cfk.f)) {
/* 108 */       return false;
/*     */     }
/* 110 */     if (cfk1 == cfk.a && (cfk2 == cfk.b || cfk2 == cfk.c || cfk2 == cfk.d)) {
/* 111 */       return false;
/*     */     }
/*     */     
/* 114 */     if (((Boolean)ceh.c(d)).booleanValue()) {
/* 115 */       if (☃.r(fx1)) {
/* 116 */         return true;
/*     */       }
/* 118 */       return a(☃, fx1, ceh, bool, i + 1);
/*     */     } 
/*     */     
/* 121 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(ceh ☃, brx brx1, fx fx1, buo buo1) {
/* 126 */     boolean bool1 = ((Boolean)☃.c(d)).booleanValue();
/* 127 */     boolean bool2 = (brx1.r(fx1) || a(brx1, fx1, ☃, true, 0) || a(brx1, fx1, ☃, false, 0));
/*     */     
/* 129 */     if (bool2 != bool1) {
/* 130 */       brx1.a(fx1, ☃.a(d, Boolean.valueOf(bool2)), 3);
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 135 */       brx1.b(fx1.c(), this);
/* 136 */       if (((cfk)☃.c(c)).c()) {
/* 137 */         brx1.b(fx1.b(), this);
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public cfj<cfk> d() {
/* 144 */     return c;
/*     */   }
/*     */ 
/*     */   
/*     */   public ceh a(ceh ☃, bzm bzm1) {
/* 149 */     switch (null.b[bzm1.ordinal()]) {
/*     */       case 1:
/* 151 */         switch (null.a[((cfk)☃.c(c)).ordinal()]) {
/*     */           case 3:
/* 153 */             return ☃.a(c, cfk.d);
/*     */           case 4:
/* 155 */             return ☃.a(c, cfk.c);
/*     */           case 5:
/* 157 */             return ☃.a(c, cfk.f);
/*     */           case 6:
/* 159 */             return ☃.a(c, cfk.e);
/*     */           case 7:
/* 161 */             return ☃.a(c, cfk.i);
/*     */           case 8:
/* 163 */             return ☃.a(c, cfk.j);
/*     */           case 9:
/* 165 */             return ☃.a(c, cfk.g);
/*     */           case 10:
/* 167 */             return ☃.a(c, cfk.h);
/*     */         } 
/*     */       case 2:
/* 170 */         switch (null.a[((cfk)☃.c(c)).ordinal()]) {
/*     */           case 1:
/* 172 */             return ☃.a(c, cfk.b);
/*     */           case 2:
/* 174 */             return ☃.a(c, cfk.a);
/*     */           case 3:
/* 176 */             return ☃.a(c, cfk.e);
/*     */           case 4:
/* 178 */             return ☃.a(c, cfk.f);
/*     */           case 5:
/* 180 */             return ☃.a(c, cfk.d);
/*     */           case 6:
/* 182 */             return ☃.a(c, cfk.c);
/*     */           case 7:
/* 184 */             return ☃.a(c, cfk.j);
/*     */           case 8:
/* 186 */             return ☃.a(c, cfk.g);
/*     */           case 9:
/* 188 */             return ☃.a(c, cfk.h);
/*     */           case 10:
/* 190 */             return ☃.a(c, cfk.i);
/*     */         } 
/*     */       case 3:
/* 193 */         switch (null.a[((cfk)☃.c(c)).ordinal()]) {
/*     */           case 1:
/* 195 */             return ☃.a(c, cfk.b);
/*     */           case 2:
/* 197 */             return ☃.a(c, cfk.a);
/*     */           case 3:
/* 199 */             return ☃.a(c, cfk.f);
/*     */           case 4:
/* 201 */             return ☃.a(c, cfk.e);
/*     */           case 5:
/* 203 */             return ☃.a(c, cfk.c);
/*     */           case 6:
/* 205 */             return ☃.a(c, cfk.d);
/*     */           case 7:
/* 207 */             return ☃.a(c, cfk.h);
/*     */           case 8:
/* 209 */             return ☃.a(c, cfk.i);
/*     */           case 9:
/* 211 */             return ☃.a(c, cfk.j);
/*     */           case 10:
/* 213 */             return ☃.a(c, cfk.g);
/*     */         }  break;
/*     */     } 
/* 216 */     return ☃;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public ceh a(ceh ☃, byg byg1) {
/* 222 */     cfk cfk = (cfk)☃.c(c);
/* 223 */     switch (null.c[byg1.ordinal()]) {
/*     */       case 1:
/* 225 */         switch (null.a[cfk.ordinal()]) {
/*     */           case 5:
/* 227 */             return ☃.a(c, cfk.f);
/*     */           case 6:
/* 229 */             return ☃.a(c, cfk.e);
/*     */           case 7:
/* 231 */             return ☃.a(c, cfk.j);
/*     */           case 8:
/* 233 */             return ☃.a(c, cfk.i);
/*     */           case 9:
/* 235 */             return ☃.a(c, cfk.h);
/*     */           case 10:
/* 237 */             return ☃.a(c, cfk.g);
/*     */         } 
/*     */         
/*     */         break;
/*     */       
/*     */       case 2:
/* 243 */         switch (null.a[cfk.ordinal()]) {
/*     */           case 3:
/* 245 */             return ☃.a(c, cfk.d);
/*     */           case 4:
/* 247 */             return ☃.a(c, cfk.c);
/*     */           case 7:
/* 249 */             return ☃.a(c, cfk.h);
/*     */           case 8:
/* 251 */             return ☃.a(c, cfk.g);
/*     */           case 9:
/* 253 */             return ☃.a(c, cfk.j);
/*     */           case 10:
/* 255 */             return ☃.a(c, cfk.i);
/*     */         } 
/*     */ 
/*     */         
/*     */         break;
/*     */     } 
/*     */ 
/*     */     
/* 263 */     return super.a(☃, byg1);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(cei.a<buo, ceh> ☃) {
/* 268 */     ☃.a((cfj<?>[])new cfj[] { c, d });
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\byx.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */