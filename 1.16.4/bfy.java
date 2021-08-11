/*     */ import com.google.common.collect.Lists;
/*     */ import it.unimi.dsi.fastutil.ints.Int2IntMap;
/*     */ import it.unimi.dsi.fastutil.ints.Int2IntOpenHashMap;
/*     */ import it.unimi.dsi.fastutil.ints.IntAVLTreeSet;
/*     */ import it.unimi.dsi.fastutil.ints.IntArrayList;
/*     */ import it.unimi.dsi.fastutil.ints.IntCollection;
/*     */ import it.unimi.dsi.fastutil.ints.IntIterator;
/*     */ import it.unimi.dsi.fastutil.ints.IntList;
/*     */ import it.unimi.dsi.fastutil.ints.IntListIterator;
/*     */ import java.util.BitSet;
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
/*     */ public class bfy
/*     */ {
/*  23 */   public final Int2IntMap a = (Int2IntMap)new Int2IntOpenHashMap();
/*     */   
/*     */   public void a(bmb ☃) {
/*  26 */     if (!☃.f() && !☃.x() && !☃.t()) {
/*  27 */       b(☃);
/*     */     }
/*     */   }
/*     */   
/*     */   public void b(bmb ☃) {
/*  32 */     a(☃, 64);
/*     */   }
/*     */   
/*     */   public void a(bmb ☃, int i) {
/*  36 */     if (!☃.a()) {
/*  37 */       int j = c(☃);
/*  38 */       int k = Math.min(i, ☃.E());
/*  39 */       b(j, k);
/*     */     } 
/*     */   }
/*     */   
/*     */   public static int c(bmb ☃) {
/*  44 */     return gm.T.a(☃.b());
/*     */   }
/*     */   
/*     */   private boolean b(int ☃) {
/*  48 */     return (this.a.get(☃) > 0);
/*     */   }
/*     */   
/*     */   private int a(int ☃, int i) {
/*  52 */     int j = this.a.get(☃);
/*  53 */     if (j >= i) {
/*  54 */       this.a.put(☃, j - i);
/*  55 */       return ☃;
/*     */     } 
/*     */     
/*  58 */     return 0;
/*     */   }
/*     */   
/*     */   private void b(int ☃, int i) {
/*  62 */     this.a.put(☃, this.a.get(☃) + i);
/*     */   }
/*     */   
/*     */   public boolean a(boq<?> ☃, @Nullable IntList intList) {
/*  66 */     return a(☃, intList, 1);
/*     */   }
/*     */   
/*     */   public boolean a(boq<?> ☃, @Nullable IntList intList, int i) {
/*  70 */     return (new a(this, ☃)).a(i, intList);
/*     */   }
/*     */   
/*     */   public int b(boq<?> ☃, @Nullable IntList intList) {
/*  74 */     return a(☃, 2147483647, intList);
/*     */   }
/*     */   
/*     */   public int a(boq<?> ☃, int i, @Nullable IntList intList) {
/*  78 */     return (new a(this, ☃)).b(i, intList);
/*     */   }
/*     */   
/*     */   public static bmb a(int ☃) {
/*  82 */     if (☃ == 0) {
/*  83 */       return bmb.b;
/*     */     }
/*  85 */     return new bmb(blx.b(☃));
/*     */   }
/*     */   
/*     */   public void a() {
/*  89 */     this.a.clear();
/*     */   }
/*     */   
/*     */   class a {
/*     */     private final boq<?> b;
/*  94 */     private final List<bon> c = Lists.newArrayList();
/*     */     private final int d;
/*     */     private final int[] e;
/*     */     private final int f;
/*     */     private final BitSet g;
/*  99 */     private final IntList h = (IntList)new IntArrayList();
/*     */     
/*     */     public a(bfy this$0, boq<?> ☃) {
/* 102 */       this.b = ☃;
/* 103 */       this.c.addAll(☃.a());
/* 104 */       this.c.removeIf(bon::d);
/*     */       
/* 106 */       this.d = this.c.size();
/* 107 */       this.e = a();
/* 108 */       this.f = this.e.length;
/*     */ 
/*     */       
/* 111 */       this.g = new BitSet(this.d + this.f + this.d + this.d * this.f);
/* 112 */       for (int i = 0; i < this.c.size(); i++) {
/* 113 */         IntList intList = ((bon)this.c.get(i)).b();
/* 114 */         for (int j = 0; j < this.f; j++) {
/* 115 */           if (intList.contains(this.e[j])) {
/* 116 */             this.g.set(d(true, j, i));
/*     */           }
/*     */         } 
/*     */       } 
/*     */     }
/*     */     
/*     */     public boolean a(int ☃, @Nullable IntList intList) {
/* 123 */       if (☃ <= 0) {
/* 124 */         return true;
/*     */       }
/*     */       
/* 127 */       int i = 0;
/* 128 */       while (a(☃)) {
/* 129 */         bfy.a(this.a, this.e[this.h.getInt(0)], ☃);
/*     */         
/* 131 */         int m = this.h.size() - 1;
/* 132 */         c(this.h.getInt(m));
/*     */         
/* 134 */         for (int n = 0; n < m; n++) {
/* 135 */           c(((n & 0x1) == 0), this.h.get(n).intValue(), this.h.get(n + 1).intValue());
/*     */         }
/*     */         
/* 138 */         this.h.clear();
/* 139 */         this.g.clear(0, this.d + this.f);
/*     */         
/* 141 */         i++;
/*     */       } 
/*     */       
/* 144 */       boolean bool1 = (i == this.d);
/* 145 */       boolean bool2 = (bool1 && intList != null);
/* 146 */       if (bool2) {
/* 147 */         intList.clear();
/*     */       }
/*     */ 
/*     */       
/* 151 */       this.g.clear(0, this.d + this.f + this.d);
/*     */       
/* 153 */       int j = 0;
/* 154 */       List<bon> list = this.b.a();
/* 155 */       for (int k = 0; k < list.size(); k++) {
/* 156 */         if (bool2 && ((bon)list.get(k)).d()) {
/* 157 */           intList.add(0);
/*     */         } else {
/* 159 */           for (int m = 0; m < this.f; m++) {
/* 160 */             if (b(false, j, m)) {
/* 161 */               c(true, m, j);
/* 162 */               bfy.b(this.a, this.e[m], ☃);
/*     */               
/* 164 */               if (bool2) {
/* 165 */                 intList.add(this.e[m]);
/*     */               }
/*     */             } 
/*     */           } 
/* 169 */           j++;
/*     */         } 
/*     */       } 
/*     */       
/* 173 */       return bool1;
/*     */     }
/*     */     
/*     */     private int[] a() {
/* 177 */       IntAVLTreeSet intAVLTreeSet = new IntAVLTreeSet();
/* 178 */       for (bon bon : this.c) {
/* 179 */         intAVLTreeSet.addAll((IntCollection)bon.b());
/*     */       }
/*     */       
/* 182 */       IntIterator ☃ = intAVLTreeSet.iterator();
/* 183 */       while (☃.hasNext()) {
/* 184 */         if (!bfy.a(this.a, ☃.nextInt())) {
/* 185 */           ☃.remove();
/*     */         }
/*     */       } 
/* 188 */       return intAVLTreeSet.toIntArray();
/*     */     }
/*     */     
/*     */     private boolean a(int ☃) {
/* 192 */       int i = this.f;
/* 193 */       for (int j = 0; j < i; j++) {
/* 194 */         if (this.a.a.get(this.e[j]) >= ☃) {
/* 195 */           a(false, j);
/*     */           
/* 197 */           while (!this.h.isEmpty()) {
/* 198 */             int k = this.h.size();
/* 199 */             boolean bool = ((k & 0x1) == 1);
/*     */             
/* 201 */             int m = this.h.getInt(k - 1);
/* 202 */             if (!bool && !b(m)) {
/*     */               break;
/*     */             }
/*     */             
/* 206 */             int n = bool ? this.d : i; int i1;
/* 207 */             for (i1 = 0; i1 < n; i1++) {
/* 208 */               if (!b(bool, i1) && a(bool, m, i1) && b(bool, m, i1)) {
/* 209 */                 a(bool, i1);
/*     */                 
/*     */                 break;
/*     */               } 
/*     */             } 
/* 214 */             i1 = this.h.size();
/* 215 */             if (i1 == k) {
/* 216 */               this.h.removeInt(i1 - 1);
/*     */             }
/*     */           } 
/* 219 */           if (!this.h.isEmpty()) {
/* 220 */             return true;
/*     */           }
/*     */         } 
/*     */       } 
/*     */       
/* 225 */       return false;
/*     */     }
/*     */     
/*     */     private boolean b(int ☃) {
/* 229 */       return this.g.get(d(☃));
/*     */     }
/*     */     
/*     */     private void c(int ☃) {
/* 233 */       this.g.set(d(☃));
/*     */     }
/*     */     
/*     */     private int d(int ☃) {
/* 237 */       return this.d + this.f + ☃;
/*     */     }
/*     */     
/*     */     private boolean a(boolean ☃, int i, int j) {
/* 241 */       return this.g.get(d(☃, i, j));
/*     */     }
/*     */     
/*     */     private boolean b(boolean ☃, int i, int j) {
/* 245 */       return (☃ != this.g.get(1 + d(☃, i, j)));
/*     */     }
/*     */     
/*     */     private void c(boolean ☃, int i, int j) {
/* 249 */       this.g.flip(1 + d(☃, i, j));
/*     */     }
/*     */     
/*     */     private int d(boolean ☃, int i, int j) {
/* 253 */       int k = ☃ ? (i * this.d + j) : (j * this.d + i);
/* 254 */       return this.d + this.f + this.d + 2 * k;
/*     */     }
/*     */     
/*     */     private void a(boolean ☃, int i) {
/* 258 */       this.g.set(c(☃, i));
/* 259 */       this.h.add(i);
/*     */     }
/*     */     
/*     */     private boolean b(boolean ☃, int i) {
/* 263 */       return this.g.get(c(☃, i));
/*     */     }
/*     */     
/*     */     private int c(boolean ☃, int i) {
/* 267 */       return (☃ ? 0 : this.d) + i;
/*     */     }
/*     */     
/*     */     public int b(int ☃, @Nullable IntList intList) {
/* 271 */       int k, i = 0;
/* 272 */       int j = Math.min(☃, b()) + 1;
/*     */ 
/*     */       
/*     */       while (true) {
/* 276 */         k = (i + j) / 2;
/*     */         
/* 278 */         if (a(k, (IntList)null)) {
/* 279 */           if (j - i <= 1) {
/*     */             break;
/*     */           }
/* 282 */           i = k; continue;
/*     */         } 
/* 284 */         j = k;
/*     */       } 
/*     */ 
/*     */       
/* 288 */       if (k > 0) {
/* 289 */         a(k, intList);
/*     */       }
/*     */       
/* 292 */       return k;
/*     */     }
/*     */     
/*     */     private int b() {
/* 296 */       int ☃ = Integer.MAX_VALUE;
/* 297 */       for (bon bon : this.c) {
/* 298 */         int i = 0;
/* 299 */         for (IntListIterator<Integer> intListIterator = bon.b().iterator(); intListIterator.hasNext(); ) { int j = ((Integer)intListIterator.next()).intValue();
/* 300 */           i = Math.max(i, this.a.a.get(j)); }
/*     */         
/* 302 */         if (☃ > 0) {
/* 303 */           ☃ = Math.min(☃, i);
/*     */         }
/*     */       } 
/* 306 */       return ☃;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bfy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */