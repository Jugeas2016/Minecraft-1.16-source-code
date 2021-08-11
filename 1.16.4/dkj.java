/*     */ import com.google.common.collect.Lists;
/*     */ import java.util.List;
/*     */ import java.util.ListIterator;
/*     */ import java.util.Optional;
/*     */ import java.util.function.BiConsumer;
/*     */ import java.util.stream.Collectors;
/*     */ import javax.annotation.Nullable;
/*     */ import org.apache.commons.lang3.mutable.MutableFloat;
/*     */ import org.apache.commons.lang3.mutable.MutableInt;
/*     */ import org.apache.commons.lang3.mutable.MutableObject;
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
/*     */ public class dkj
/*     */ {
/*     */   private final f a;
/*     */   
/*     */   public dkj(f ☃) {
/*  29 */     this.a = ☃;
/*     */   }
/*     */   
/*     */   public float a(@Nullable String ☃) {
/*  33 */     if (☃ == null) {
/*  34 */       return 0.0F;
/*     */     }
/*     */     
/*  37 */     MutableFloat mutableFloat = new MutableFloat();
/*  38 */     afr.c(☃, ob.a, (i, ob1, j) -> {
/*     */           ☃.add(this.a.getWidth(j, ob1));
/*     */           return true;
/*     */         });
/*  42 */     return mutableFloat.floatValue();
/*     */   }
/*     */   
/*     */   public float a(nu ☃) {
/*  46 */     MutableFloat mutableFloat = new MutableFloat();
/*  47 */     afr.a(☃, ob.a, (i, ob1, j) -> {
/*     */           ☃.add(this.a.getWidth(j, ob1));
/*     */           return true;
/*     */         });
/*  51 */     return mutableFloat.floatValue();
/*     */   }
/*     */   
/*     */   public float a(afa ☃) {
/*  55 */     MutableFloat mutableFloat = new MutableFloat();
/*  56 */     ☃.accept((i, ob1, j) -> {
/*     */           ☃.add(this.a.getWidth(j, ob1));
/*     */           return true;
/*     */         });
/*  60 */     return mutableFloat.floatValue();
/*     */   }
/*     */   
/*     */   class e implements afb {
/*     */     private float b;
/*     */     private int c;
/*     */     
/*     */     public e(dkj this$0, float ☃) {
/*  68 */       this.b = ☃;
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean accept(int ☃, ob ob1, int i) {
/*  73 */       this.b -= dkj.a(this.a).getWidth(i, ob1);
/*  74 */       if (this.b >= 0.0F) {
/*  75 */         this.c = ☃ + Character.charCount(i);
/*  76 */         return true;
/*     */       } 
/*  78 */       return false;
/*     */     }
/*     */     
/*     */     public int a() {
/*  82 */       return this.c;
/*     */     }
/*     */     
/*     */     public void b() {
/*  86 */       this.c = 0;
/*     */     }
/*     */   }
/*     */   
/*     */   public int a(String ☃, int i, ob ob1) {
/*  91 */     e e = new e(this, i);
/*  92 */     afr.a(☃, ob1, e);
/*  93 */     return e.a();
/*     */   }
/*     */   
/*     */   public String b(String ☃, int i, ob ob1) {
/*  97 */     return ☃.substring(0, a(☃, i, ob1));
/*     */   }
/*     */   
/*     */   public String c(String ☃, int i, ob ob1) {
/* 101 */     MutableFloat mutableFloat = new MutableFloat();
/* 102 */     MutableInt mutableInt = new MutableInt(☃.length());
/* 103 */     afr.b(☃, ob1, (j, ob1, k) -> {
/*     */           float f1 = ☃.addAndGet(this.a.getWidth(k, ob1));
/*     */           
/*     */           if (f1 > i) {
/*     */             return false;
/*     */           }
/*     */           
/*     */           mutableInt.setValue(j);
/*     */           return true;
/*     */         });
/* 113 */     return ☃.substring(mutableInt.intValue());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public ob a(nu ☃, int i) {
/* 124 */     e e = new e(this, i);
/* 125 */     return ☃.<ob>a((ob1, str) -> afr.c(str, ob1, ☃) ? Optional.empty() : Optional.<ob>of(ob1), ob.a).orElse(null);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public ob a(afa ☃, int i) {
/* 130 */     e e = new e(this, i);
/* 131 */     MutableObject<ob> mutableObject = new MutableObject();
/* 132 */     ☃.accept((i, ob1, j) -> {
/*     */           if (!☃.accept(i, ob1, j)) {
/*     */             mutableObject.setValue(ob1);
/*     */             return false;
/*     */           } 
/*     */           return true;
/*     */         });
/* 139 */     return (ob)mutableObject.getValue();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public nu a(nu ☃, int i, ob ob1) {
/* 148 */     e e = new e(this, i);
/*     */     
/* 150 */     return ☃.<nu>a(new nu.b<nu>(this, e) {
/* 151 */           private final djo c = new djo();
/*     */ 
/*     */           
/*     */           public Optional<nu> accept(ob ☃, String str) {
/* 155 */             this.a.b();
/* 156 */             if (!afr.c(str, ☃, this.a)) {
/* 157 */               String str1 = str.substring(0, this.a.a());
/* 158 */               if (!str1.isEmpty()) {
/* 159 */                 this.c.a(nu.a(str1, ☃));
/*     */               }
/* 161 */               return Optional.of(this.c.b());
/*     */             } 
/* 163 */             if (!str.isEmpty()) {
/* 164 */               this.c.a(nu.a(str, ☃));
/*     */             }
/* 166 */             return Optional.empty();
/*     */           }
/* 168 */         }ob1).orElse(☃);
/*     */   }
/*     */   
/*     */   class b
/*     */     implements afb {
/*     */     private final float b;
/* 174 */     private int c = -1;
/* 175 */     private ob d = ob.a;
/*     */     private boolean e;
/*     */     private float f;
/* 178 */     private int g = -1;
/* 179 */     private ob h = ob.a;
/*     */     private int i;
/*     */     private int j;
/*     */     
/*     */     public b(dkj this$0, float ☃) {
/* 184 */       this.b = Math.max(☃, 1.0F);
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean accept(int ☃, ob ob1, int i) {
/* 189 */       int j = ☃ + this.j;
/* 190 */       switch (i) {
/*     */         case 10:
/* 192 */           return a(j, ob1);
/*     */         case 32:
/* 194 */           this.g = j;
/* 195 */           this.h = ob1;
/*     */           break;
/*     */       } 
/* 198 */       float f = dkj.a(this.a).getWidth(i, ob1);
/* 199 */       this.f += f;
/* 200 */       if (this.e && this.f > this.b) {
/* 201 */         if (this.g != -1) {
/* 202 */           return a(this.g, this.h);
/*     */         }
/* 204 */         return a(j, ob1);
/*     */       } 
/*     */       
/* 207 */       this.e |= (f != 0.0F) ? 1 : 0;
/* 208 */       this.i = j + Character.charCount(i);
/* 209 */       return true;
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     private boolean a(int ☃, ob ob1) {
/* 215 */       this.c = ☃;
/* 216 */       this.d = ob1;
/* 217 */       return false;
/*     */     }
/*     */     
/*     */     private boolean c() {
/* 221 */       return (this.c != -1);
/*     */     }
/*     */     
/*     */     public int a() {
/* 225 */       return c() ? this.c : this.i;
/*     */     }
/*     */     
/*     */     public ob b() {
/* 229 */       return this.d;
/*     */     }
/*     */     
/*     */     public void a(int ☃) {
/* 233 */       this.j += ☃;
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static int a(String ☃, int i, int j, boolean bool) {
/* 244 */     int k = j;
/* 245 */     boolean bool1 = (i < 0);
/* 246 */     int m = Math.abs(i);
/*     */     
/* 248 */     for (int n = 0; n < m; n++) {
/* 249 */       if (bool1) {
/* 250 */         while (bool && k > 0 && (☃.charAt(k - 1) == ' ' || ☃.charAt(k - 1) == '\n')) {
/* 251 */           k--;
/*     */         }
/* 253 */         while (k > 0 && ☃.charAt(k - 1) != ' ' && ☃.charAt(k - 1) != '\n') {
/* 254 */           k--;
/*     */         }
/*     */       } else {
/* 257 */         int i1 = ☃.length();
/*     */         
/* 259 */         int i2 = ☃.indexOf(' ', k);
/* 260 */         int i3 = ☃.indexOf('\n', k);
/* 261 */         if (i2 == -1 && i3 == -1) {
/* 262 */           k = -1;
/* 263 */         } else if (i2 != -1 && i3 != -1) {
/* 264 */           k = Math.min(i2, i3);
/* 265 */         } else if (i2 != -1) {
/* 266 */           k = i2;
/*     */         } else {
/* 268 */           k = i3;
/*     */         } 
/*     */         
/* 271 */         if (k == -1) {
/* 272 */           k = i1;
/*     */         } else {
/* 274 */           while (bool && k < i1 && (☃.charAt(k) == ' ' || ☃.charAt(k) == '\n')) {
/* 275 */             k++;
/*     */           }
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 281 */     return k;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(String ☃, int i, ob ob1, boolean bool, d d1) {
/* 290 */     int j = 0;
/* 291 */     int k = ☃.length();
/* 292 */     ob ob2 = ob1;
/* 293 */     while (j < k) {
/* 294 */       b b = new b(this, i);
/* 295 */       boolean bool1 = afr.a(☃, j, ob2, ob1, b);
/* 296 */       if (bool1) {
/* 297 */         d1.accept(ob2, j, k);
/*     */         break;
/*     */       } 
/* 300 */       int m = b.a();
/* 301 */       char c = ☃.charAt(m);
/*     */       
/* 303 */       int n = (c == '\n' || c == ' ') ? (m + 1) : m;
/* 304 */       d1.accept(ob2, j, bool ? n : m);
/* 305 */       j = n;
/* 306 */       ob2 = b.b();
/*     */     } 
/*     */   }
/*     */   
/*     */   public List<nu> g(String ☃, int i, ob ob1) {
/* 311 */     List<nu> list = Lists.newArrayList();
/* 312 */     a(☃, i, ob1, false, (ob1, i, j) -> ☃.add(nu.a(str.substring(i, j), ob1)));
/* 313 */     return list;
/*     */   }
/*     */   
/*     */   static class c implements nu {
/*     */     private final String a;
/*     */     private final ob d;
/*     */     
/*     */     public c(String ☃, ob ob1) {
/* 321 */       this.a = ☃;
/* 322 */       this.d = ob1;
/*     */     }
/*     */ 
/*     */     
/*     */     public <T> Optional<T> a(nu.a<T> ☃) {
/* 327 */       return ☃.accept(this.a);
/*     */     }
/*     */ 
/*     */     
/*     */     public <T> Optional<T> a(nu.b<T> ☃, ob ob1) {
/* 332 */       return ☃.accept(this.d.a(ob1), this.a);
/*     */     }
/*     */   }
/*     */   
/*     */   static class a {
/*     */     private final List<dkj.c> a;
/*     */     private String b;
/*     */     
/*     */     public a(List<dkj.c> ☃) {
/* 341 */       this.a = ☃;
/* 342 */       this.b = ☃.stream().map(☃ -> dkj.c.a(☃)).collect(Collectors.joining());
/*     */     }
/*     */     
/*     */     public char a(int ☃) {
/* 346 */       return this.b.charAt(☃);
/*     */     }
/*     */     
/*     */     public nu a(int ☃, int i, ob ob1) {
/* 350 */       djo djo = new djo();
/* 351 */       ListIterator<dkj.c> listIterator = this.a.listIterator();
/* 352 */       int j = ☃;
/* 353 */       boolean bool = false;
/* 354 */       while (listIterator.hasNext()) {
/* 355 */         dkj.c c = listIterator.next();
/* 356 */         String str = dkj.c.a(c);
/* 357 */         int k = str.length();
/*     */         
/* 359 */         if (!bool) {
/* 360 */           if (j > k) {
/* 361 */             djo.a(c);
/* 362 */             listIterator.remove();
/* 363 */             j -= k;
/*     */           } else {
/* 365 */             String str1 = str.substring(0, j);
/* 366 */             if (!str1.isEmpty()) {
/* 367 */               djo.a(nu.a(str1, dkj.c.b(c)));
/*     */             }
/* 369 */             j += i;
/* 370 */             bool = true;
/*     */           } 
/*     */         }
/*     */         
/* 374 */         if (bool) {
/* 375 */           if (j > k) {
/* 376 */             listIterator.remove();
/* 377 */             j -= k; continue;
/*     */           } 
/* 379 */           String str1 = str.substring(j);
/* 380 */           if (str1.isEmpty()) {
/* 381 */             listIterator.remove(); break;
/*     */           } 
/* 383 */           listIterator.set(new dkj.c(str1, ob1));
/*     */ 
/*     */           
/*     */           break;
/*     */         } 
/*     */       } 
/*     */       
/* 390 */       this.b = this.b.substring(☃ + i);
/* 391 */       return djo.b();
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public nu a() {
/* 396 */       djo ☃ = new djo();
/* 397 */       this.a.forEach(☃::a);
/* 398 */       this.a.clear();
/* 399 */       return ☃.a();
/*     */     }
/*     */   }
/*     */   
/*     */   public List<nu> b(nu ☃, int i, ob ob1) {
/* 404 */     List<nu> list = Lists.newArrayList();
/* 405 */     a(☃, i, ob1, (nu1, bool) -> ☃.add(nu1));
/* 406 */     return list;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(nu ☃, int i, ob ob1, BiConsumer<nu, Boolean> biConsumer) {
/* 416 */     List<c> list = Lists.newArrayList();
/*     */     
/* 418 */     ☃.a((ob1, str) -> { if (!str.isEmpty()) ☃.add(new c(str, ob1));  return Optional.empty(); }ob1);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 425 */     a a = new a(list);
/* 426 */     boolean bool1 = true;
/* 427 */     boolean bool2 = false;
/* 428 */     boolean bool3 = false;
/* 429 */     while (bool1) {
/* 430 */       bool1 = false;
/* 431 */       b b = new b(this, i);
/* 432 */       for (c c : a.a(a)) {
/* 433 */         boolean bool = afr.a(c.a(c), 0, c.b(c), ob1, b);
/* 434 */         if (!bool) {
/*     */           
/* 436 */           int j = b.a();
/* 437 */           ob ob2 = b.b();
/*     */           
/* 439 */           char c1 = a.a(j);
/*     */           
/* 441 */           boolean bool4 = (c1 == '\n');
/* 442 */           boolean bool5 = (bool4 || c1 == ' ');
/* 443 */           bool2 = bool4;
/* 444 */           nu nu2 = a.a(j, bool5 ? 1 : 0, ob2);
/* 445 */           biConsumer.accept(nu2, Boolean.valueOf(bool3));
/* 446 */           bool3 = !bool4;
/* 447 */           bool1 = true;
/*     */           break;
/*     */         } 
/* 450 */         b.a(c.a(c).length());
/*     */       } 
/*     */     } 
/*     */     
/* 454 */     nu nu1 = a.a();
/* 455 */     if (nu1 != null) {
/* 456 */       biConsumer.accept(nu1, Boolean.valueOf(bool3));
/* 457 */     } else if (bool2) {
/* 458 */       biConsumer.accept(nu.c, Boolean.valueOf(false));
/*     */     } 
/*     */   }
/*     */   
/*     */   @FunctionalInterface
/*     */   public static interface d {
/*     */     void accept(ob param1ob, int param1Int1, int param1Int2);
/*     */   }
/*     */   
/*     */   @FunctionalInterface
/*     */   public static interface f {
/*     */     float getWidth(int param1Int, ob param1ob);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dkj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */