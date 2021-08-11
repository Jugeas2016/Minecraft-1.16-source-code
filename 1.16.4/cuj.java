/*     */ import it.unimi.dsi.fastutil.longs.Long2ByteMap;
/*     */ import it.unimi.dsi.fastutil.longs.Long2ByteOpenHashMap;
/*     */ import it.unimi.dsi.fastutil.longs.LongArrayList;
/*     */ import it.unimi.dsi.fastutil.longs.LongLinkedOpenHashSet;
/*     */ import it.unimi.dsi.fastutil.longs.LongList;
/*     */ import java.util.function.LongPredicate;
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
/*     */ public abstract class cuj
/*     */ {
/*     */   private final int a;
/*     */   private final LongLinkedOpenHashSet[] b;
/*     */   private final Long2ByteMap c;
/*     */   private int d;
/*     */   private volatile boolean e;
/*     */   
/*     */   protected cuj(int ☃, int i, int j) {
/*  42 */     if (☃ >= 254) {
/*  43 */       throw new IllegalArgumentException("Level count must be < 254.");
/*     */     }
/*  45 */     this.a = ☃;
/*  46 */     this.b = new LongLinkedOpenHashSet[☃];
/*  47 */     for (int k = 0; k < ☃; k++) {
/*  48 */       this.b[k] = new LongLinkedOpenHashSet(this, i, 0.5F, i)
/*     */         {
/*     */           protected void rehash(int ☃) {
/*  51 */             if (☃ > this.a) {
/*  52 */               super.rehash(☃);
/*     */             }
/*     */           }
/*     */         };
/*     */     } 
/*  57 */     this.c = (Long2ByteMap)new Long2ByteOpenHashMap(this, j, 0.5F, j)
/*     */       {
/*     */         protected void rehash(int ☃) {
/*  60 */           if (☃ > this.a) {
/*  61 */             super.rehash(☃);
/*     */           }
/*     */         }
/*     */       };
/*  65 */     this.c.defaultReturnValue((byte)-1);
/*  66 */     this.d = ☃;
/*     */   }
/*     */   
/*     */   private int a(int ☃, int i) {
/*  70 */     int j = ☃;
/*  71 */     if (j > i) {
/*  72 */       j = i;
/*     */     }
/*  74 */     if (j > this.a - 1) {
/*  75 */       j = this.a - 1;
/*     */     }
/*  77 */     return j;
/*     */   }
/*     */   
/*     */   private void a(int ☃) {
/*  81 */     int i = this.d;
/*  82 */     this.d = ☃;
/*  83 */     for (int j = i + 1; j < ☃; j++) {
/*  84 */       if (!this.b[j].isEmpty()) {
/*  85 */         this.d = j;
/*     */         break;
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   protected void e(long ☃) {
/*  92 */     int i = this.c.get(☃) & 0xFF;
/*  93 */     if (i == 255) {
/*     */       return;
/*     */     }
/*  96 */     int j = c(☃);
/*  97 */     int k = a(j, i);
/*  98 */     a(☃, k, this.a, true);
/*  99 */     this.e = (this.d < this.a);
/*     */   }
/*     */   
/*     */   public void a(LongPredicate ☃) {
/* 103 */     LongArrayList longArrayList = new LongArrayList();
/*     */     
/* 105 */     this.c.keySet().forEach(l -> {
/*     */           if (☃.test(l)) {
/*     */             longList.add(l);
/*     */           }
/*     */         });
/*     */     
/* 111 */     longArrayList.forEach(this::e);
/*     */   }
/*     */   
/*     */   private void a(long ☃, int i, int j, boolean bool) {
/* 115 */     if (bool) {
/* 116 */       this.c.remove(☃);
/*     */     }
/* 118 */     this.b[i].remove(☃);
/* 119 */     if (this.b[i].isEmpty() && this.d == i) {
/* 120 */       a(j);
/*     */     }
/*     */   }
/*     */   
/*     */   private void a(long ☃, int i, int j) {
/* 125 */     this.c.put(☃, (byte)i);
/* 126 */     this.b[j].add(☃);
/* 127 */     if (this.d > j) {
/* 128 */       this.d = j;
/*     */     }
/*     */   }
/*     */   
/*     */   protected void f(long ☃) {
/* 133 */     a(☃, ☃, this.a - 1, false);
/*     */   }
/*     */   
/*     */   protected void a(long ☃, long l1, int i, boolean bool) {
/* 137 */     a(☃, l1, i, c(l1), this.c.get(l1) & 0xFF, bool);
/* 138 */     this.e = (this.d < this.a);
/*     */   } private void a(long ☃, long l1, int i, int j, int k, boolean bool) {
/*     */     boolean bool1;
/*     */     int m;
/* 142 */     if (a(l1)) {
/*     */       return;
/*     */     }
/* 145 */     i = afm.a(i, 0, this.a - 1);
/* 146 */     j = afm.a(j, 0, this.a - 1);
/*     */     
/* 148 */     if (k == 255) {
/* 149 */       bool1 = true;
/* 150 */       k = j;
/*     */     } else {
/* 152 */       bool1 = false;
/*     */     } 
/*     */     
/* 155 */     if (bool) {
/*     */       
/* 157 */       m = Math.min(k, i);
/*     */     } else {
/* 159 */       m = afm.a(a(l1, ☃, i), 0, this.a - 1);
/*     */     } 
/* 161 */     int n = a(j, k);
/* 162 */     if (j != m) {
/* 163 */       int i1 = a(j, m);
/* 164 */       if (n != i1 && !bool1) {
/* 165 */         a(l1, n, i1, false);
/*     */       }
/* 167 */       a(l1, m, i1);
/* 168 */     } else if (!bool1) {
/* 169 */       a(l1, n, this.a, true);
/*     */     } 
/*     */   }
/*     */   
/*     */   protected final void b(long ☃, long l1, int i, boolean bool) {
/* 174 */     int j = this.c.get(l1) & 0xFF;
/* 175 */     int k = afm.a(b(☃, l1, i), 0, this.a - 1);
/* 176 */     if (bool) {
/* 177 */       a(☃, l1, k, c(l1), j, true);
/*     */     } else {
/*     */       int m;
/*     */       boolean bool1;
/* 181 */       if (j == 255) {
/* 182 */         bool1 = true;
/* 183 */         m = afm.a(c(l1), 0, this.a - 1);
/*     */       } else {
/* 185 */         m = j;
/* 186 */         bool1 = false;
/*     */       } 
/*     */       
/* 189 */       if (k == m)
/*     */       {
/* 191 */         a(☃, l1, this.a - 1, bool1 ? m : c(l1), j, false);
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   protected final boolean b() {
/* 197 */     return this.e;
/*     */   }
/*     */   
/*     */   protected final int b(int ☃) {
/* 201 */     if (this.d >= this.a) {
/* 202 */       return ☃;
/*     */     }
/* 204 */     while (this.d < this.a && ☃ > 0) {
/* 205 */       ☃--;
/* 206 */       LongLinkedOpenHashSet longLinkedOpenHashSet = this.b[this.d];
/* 207 */       long l = longLinkedOpenHashSet.removeFirstLong();
/* 208 */       int i = afm.a(c(l), 0, this.a - 1);
/* 209 */       if (longLinkedOpenHashSet.isEmpty()) {
/* 210 */         a(this.a);
/*     */       }
/* 212 */       int j = this.c.remove(l) & 0xFF;
/* 213 */       if (j < i) {
/*     */         
/* 215 */         a(l, j);
/* 216 */         a(l, j, true); continue;
/* 217 */       }  if (j > i) {
/*     */         
/* 219 */         a(l, j, a(this.a - 1, j));
/* 220 */         a(l, this.a - 1);
/* 221 */         a(l, i, false);
/*     */       } 
/*     */     } 
/* 224 */     this.e = (this.d < this.a);
/* 225 */     return ☃;
/*     */   }
/*     */   
/*     */   public int c() {
/* 229 */     return this.c.size();
/*     */   }
/*     */   
/*     */   protected abstract boolean a(long paramLong);
/*     */   
/*     */   protected abstract int a(long paramLong1, long paramLong2, int paramInt);
/*     */   
/*     */   protected abstract void a(long paramLong, int paramInt, boolean paramBoolean);
/*     */   
/*     */   protected abstract int c(long paramLong);
/*     */   
/*     */   protected abstract void a(long paramLong, int paramInt);
/*     */   
/*     */   protected abstract int b(long paramLong1, long paramLong2, int paramInt);
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cuj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */