/*     */ import com.google.common.collect.Lists;
/*     */ import java.util.List;
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
/*     */ public class cee
/*     */ {
/*     */   private final brx a;
/*     */   private final fx b;
/*     */   private final boolean c;
/*     */   private final fx d;
/*     */   private final gc e;
/*  22 */   private final List<fx> f = Lists.newArrayList();
/*  23 */   private final List<fx> g = Lists.newArrayList();
/*     */   private final gc h;
/*     */   
/*     */   public cee(brx ☃, fx fx1, gc gc1, boolean bool) {
/*  27 */     this.a = ☃;
/*  28 */     this.b = fx1;
/*  29 */     this.h = gc1;
/*  30 */     this.c = bool;
/*     */     
/*  32 */     if (bool) {
/*  33 */       this.e = gc1;
/*  34 */       this.d = fx1.a(gc1);
/*     */     } else {
/*  36 */       this.e = gc1.f();
/*  37 */       this.d = fx1.a(gc1, 2);
/*     */     } 
/*     */   }
/*     */   
/*     */   public boolean a() {
/*  42 */     this.f.clear();
/*  43 */     this.g.clear();
/*     */     
/*  45 */     ceh ☃ = this.a.d_(this.d);
/*     */     
/*  47 */     if (!cea.a(☃, this.a, this.d, this.e, false, this.h)) {
/*  48 */       if (this.c && ☃.k() == cvc.b) {
/*  49 */         this.g.add(this.d);
/*  50 */         return true;
/*     */       } 
/*     */       
/*  53 */       return false;
/*     */     } 
/*     */ 
/*     */     
/*  57 */     if (!a(this.d, this.e))
/*     */     {
/*  59 */       return false;
/*     */     }
/*     */     
/*  62 */     for (int i = 0; i < this.f.size(); i++) {
/*  63 */       fx fx1 = this.f.get(i);
/*     */ 
/*     */       
/*  66 */       if (a(this.a.d_(fx1).b()) && 
/*  67 */         !a(fx1))
/*     */       {
/*  69 */         return false;
/*     */       }
/*     */     } 
/*     */ 
/*     */     
/*  74 */     return true;
/*     */   }
/*     */   
/*     */   private static boolean a(buo ☃) {
/*  78 */     return (☃ == bup.gn || ☃ == bup.ne);
/*     */   }
/*     */ 
/*     */   
/*     */   private static boolean a(buo ☃, buo buo1) {
/*  83 */     if (☃ == bup.ne && buo1 == bup.gn) {
/*  84 */       return false;
/*     */     }
/*  86 */     if (☃ == bup.gn && buo1 == bup.ne) {
/*  87 */       return false;
/*     */     }
/*  89 */     return (a(☃) || a(buo1));
/*     */   }
/*     */   
/*     */   private boolean a(fx ☃, gc gc1) {
/*  93 */     ceh ceh = this.a.d_(☃);
/*  94 */     buo buo = ceh.b();
/*  95 */     if (ceh.g())
/*     */     {
/*  97 */       return true; } 
/*  98 */     if (!cea.a(ceh, this.a, ☃, this.e, false, gc1))
/*     */     {
/* 100 */       return true; } 
/* 101 */     if (☃.equals(this.b))
/*     */     {
/* 103 */       return true; } 
/* 104 */     if (this.f.contains(☃))
/*     */     {
/* 106 */       return true;
/*     */     }
/*     */     
/* 109 */     int i = 1;
/* 110 */     if (i + this.f.size() > 12)
/*     */     {
/* 112 */       return false;
/*     */     }
/*     */     
/* 115 */     while (a(buo)) {
/* 116 */       fx fx1 = ☃.a(this.e.f(), i);
/* 117 */       buo buo1 = buo;
/* 118 */       ceh = this.a.d_(fx1);
/* 119 */       buo = ceh.b();
/*     */       
/* 121 */       if (ceh.g() || !a(buo1, buo) || !cea.a(ceh, this.a, fx1, this.e, false, this.e.f()) || fx1.equals(this.b)) {
/*     */         break;
/*     */       }
/* 124 */       i++;
/* 125 */       if (i + this.f.size() > 12) {
/* 126 */         return false;
/*     */       }
/*     */     } 
/*     */ 
/*     */     
/* 131 */     int j = 0;
/*     */     
/*     */     int k;
/* 134 */     for (k = i - 1; k >= 0; k--) {
/* 135 */       this.f.add(☃.a(this.e.f(), k));
/* 136 */       j++;
/*     */     } 
/*     */ 
/*     */     
/* 140 */     for (k = 1;; k++) {
/* 141 */       fx fx1 = ☃.a(this.e, k);
/*     */       
/* 143 */       int m = this.f.indexOf(fx1);
/* 144 */       if (m > -1) {
/*     */         
/* 146 */         a(j, m);
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 151 */         for (int n = 0; n <= m + j; n++) {
/* 152 */           fx fx2 = this.f.get(n);
/* 153 */           if (a(this.a.d_(fx2).b()) && 
/* 154 */             !a(fx2)) {
/* 155 */             return false;
/*     */           }
/*     */         } 
/*     */ 
/*     */         
/* 160 */         return true;
/*     */       } 
/*     */       
/* 163 */       ceh = this.a.d_(fx1);
/*     */       
/* 165 */       if (ceh.g())
/*     */       {
/* 167 */         return true;
/*     */       }
/*     */       
/* 170 */       if (!cea.a(ceh, this.a, fx1, this.e, true, this.e) || fx1.equals(this.b))
/*     */       {
/* 172 */         return false;
/*     */       }
/*     */       
/* 175 */       if (ceh.k() == cvc.b) {
/* 176 */         this.g.add(fx1);
/* 177 */         return true;
/*     */       } 
/*     */       
/* 180 */       if (this.f.size() >= 12) {
/* 181 */         return false;
/*     */       }
/*     */       
/* 184 */       this.f.add(fx1);
/* 185 */       j++;
/*     */     } 
/*     */   }
/*     */   
/*     */   private void a(int ☃, int i) {
/* 190 */     List<fx> list1 = Lists.newArrayList();
/* 191 */     List<fx> list2 = Lists.newArrayList();
/* 192 */     List<fx> list3 = Lists.newArrayList();
/*     */     
/* 194 */     list1.addAll(this.f.subList(0, i));
/* 195 */     list2.addAll(this.f.subList(this.f.size() - ☃, this.f.size()));
/* 196 */     list3.addAll(this.f.subList(i, this.f.size() - ☃));
/*     */     
/* 198 */     this.f.clear();
/* 199 */     this.f.addAll(list1);
/* 200 */     this.f.addAll(list2);
/* 201 */     this.f.addAll(list3);
/*     */   }
/*     */   
/*     */   private boolean a(fx ☃) {
/* 205 */     ceh ceh = this.a.d_(☃);
/* 206 */     for (gc gc1 : gc.values()) {
/* 207 */       if (gc1.n() != this.e.n()) {
/* 208 */         fx fx1 = ☃.a(gc1);
/* 209 */         ceh ceh1 = this.a.d_(fx1);
/* 210 */         if (a(ceh1.b(), ceh.b()))
/*     */         {
/*     */           
/* 213 */           if (!a(fx1, gc1)) {
/* 214 */             return false;
/*     */           }
/*     */         }
/*     */       } 
/*     */     } 
/* 219 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public List<fx> c() {
/* 227 */     return this.f;
/*     */   }
/*     */   
/*     */   public List<fx> d() {
/* 231 */     return this.g;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cee.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */