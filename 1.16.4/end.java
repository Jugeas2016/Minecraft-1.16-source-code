/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.collect.Sets;
/*     */ import it.unimi.dsi.fastutil.Arrays;
/*     */ import it.unimi.dsi.fastutil.Swapper;
/*     */ import it.unimi.dsi.fastutil.ints.IntArrayList;
/*     */ import it.unimi.dsi.fastutil.ints.IntComparator;
/*     */ import it.unimi.dsi.fastutil.ints.IntList;
/*     */ import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
/*     */ import java.util.Arrays;
/*     */ import java.util.Collections;
/*     */ import java.util.List;
/*     */ import java.util.Set;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
/*     */ 
/*     */ 
/*     */ 
/*     */ public class end<T>
/*     */ {
/*  20 */   private static final boolean b = Boolean.parseBoolean(System.getProperty("SuffixArray.printComparisons", "false"));
/*  21 */   private static final boolean c = Boolean.parseBoolean(System.getProperty("SuffixArray.printArray", "false"));
/*     */   
/*  23 */   private static final Logger d = LogManager.getLogger();
/*     */ 
/*     */ 
/*     */   
/*  27 */   protected final List<T> a = Lists.newArrayList();
/*     */   
/*  29 */   private final IntList e = (IntList)new IntArrayList();
/*  30 */   private final IntList f = (IntList)new IntArrayList();
/*  31 */   private IntList g = (IntList)new IntArrayList();
/*  32 */   private IntList h = (IntList)new IntArrayList();
/*     */   private int i;
/*     */   
/*     */   public void a(T ☃, String str) {
/*  36 */     this.i = Math.max(this.i, str.length());
/*  37 */     int i = this.a.size();
/*  38 */     this.a.add(☃);
/*     */     
/*  40 */     this.f.add(this.e.size());
/*  41 */     for (int j = 0; j < str.length(); j++) {
/*  42 */       this.g.add(i);
/*  43 */       this.h.add(j);
/*  44 */       this.e.add(str.charAt(j));
/*     */     } 
/*  46 */     this.g.add(i);
/*  47 */     this.h.add(str.length());
/*  48 */     this.e.add(-1);
/*     */   }
/*     */   
/*     */   public void a() {
/*  52 */     int ☃ = this.e.size();
/*     */     
/*  54 */     int[] arrayOfInt1 = new int[☃];
/*     */     
/*  56 */     int[] arrayOfInt2 = new int[☃];
/*  57 */     int[] arrayOfInt3 = new int[☃];
/*  58 */     int[] arrayOfInt4 = new int[☃];
/*     */     
/*  60 */     IntComparator intComparator = new IntComparator(this, arrayOfInt2, arrayOfInt3)
/*     */       {
/*     */         public int compare(int ☃, int i) {
/*  63 */           if (this.a[☃] == this.a[i]) {
/*  64 */             return Integer.compare(this.b[☃], this.b[i]);
/*     */           }
/*  66 */           return Integer.compare(this.a[☃], this.a[i]);
/*     */         }
/*     */ 
/*     */         
/*     */         public int compare(Integer ☃, Integer integer1) {
/*  71 */           return compare(☃.intValue(), integer1.intValue());
/*     */         }
/*     */       };
/*     */     
/*  75 */     Swapper swapper = (i, j) -> {
/*     */         if (i != j) {
/*     */           int k = ☃[i];
/*     */           
/*     */           ☃[i] = ☃[j];
/*     */           
/*     */           ☃[j] = k;
/*     */           k = arrayOfInt1[i];
/*     */           arrayOfInt1[i] = arrayOfInt1[j];
/*     */           arrayOfInt1[j] = k;
/*     */           k = arrayOfInt2[i];
/*     */           arrayOfInt2[i] = arrayOfInt2[j];
/*     */           arrayOfInt2[j] = k;
/*     */         } 
/*     */       };
/*     */     int i;
/*  91 */     for (i = 0; i < ☃; i++) {
/*  92 */       arrayOfInt1[i] = this.e.getInt(i);
/*     */     }
/*     */     
/*  95 */     i = 1;
/*     */     
/*  97 */     int j = Math.min(☃, this.i);
/*  98 */     while (i * 2 < j) {
/*  99 */       int m; for (m = 0; m < ☃; m++) {
/* 100 */         arrayOfInt2[m] = arrayOfInt1[m];
/* 101 */         arrayOfInt3[m] = (m + i < ☃) ? arrayOfInt1[m + i] : -2;
/* 102 */         arrayOfInt4[m] = m;
/*     */       } 
/*     */       
/* 105 */       Arrays.quickSort(0, ☃, intComparator, swapper);
/*     */       
/* 107 */       for (m = 0; m < ☃; m++) {
/* 108 */         if (m > 0 && arrayOfInt2[m] == arrayOfInt2[m - 1] && arrayOfInt3[m] == arrayOfInt3[m - 1]) {
/* 109 */           arrayOfInt1[arrayOfInt4[m]] = arrayOfInt1[arrayOfInt4[m - 1]];
/*     */         } else {
/* 111 */           arrayOfInt1[arrayOfInt4[m]] = m;
/*     */         } 
/*     */       } 
/*     */       
/* 115 */       i *= 2;
/*     */     } 
/*     */     
/* 118 */     IntList intList1 = this.g;
/* 119 */     IntList intList2 = this.h;
/*     */     
/* 121 */     this.g = (IntList)new IntArrayList(intList1.size());
/* 122 */     this.h = (IntList)new IntArrayList(intList2.size());
/* 123 */     for (int k = 0; k < ☃; k++) {
/* 124 */       int m = arrayOfInt4[k];
/* 125 */       this.g.add(intList1.getInt(m));
/* 126 */       this.h.add(intList2.getInt(m));
/*     */     } 
/* 128 */     if (c) {
/* 129 */       b();
/*     */     }
/*     */   }
/*     */   
/*     */   private void b() {
/* 134 */     for (int ☃ = 0; ☃ < this.g.size(); ☃++) {
/* 135 */       d.debug("{} {}", Integer.valueOf(☃), a(☃));
/*     */     }
/* 137 */     d.debug("");
/*     */   }
/*     */   
/*     */   private String a(int ☃) {
/* 141 */     int i = this.h.getInt(☃);
/* 142 */     int j = this.f.getInt(this.g.getInt(☃));
/*     */     
/* 144 */     StringBuilder stringBuilder = new StringBuilder();
/* 145 */     for (int k = 0; j + k < this.e.size(); k++) {
/* 146 */       if (k == i) {
/* 147 */         stringBuilder.append('^');
/*     */       }
/* 149 */       int m = this.e.get(j + k).intValue();
/* 150 */       if (m == -1) {
/*     */         break;
/*     */       }
/* 153 */       stringBuilder.append((char)m);
/*     */     } 
/* 155 */     return stringBuilder.toString();
/*     */   }
/*     */ 
/*     */   
/*     */   private int a(String ☃, int i) {
/* 160 */     int j = this.f.getInt(this.g.getInt(i));
/* 161 */     int k = this.h.getInt(i);
/*     */     
/* 163 */     for (int m = 0; m < ☃.length(); m++) {
/* 164 */       int n = this.e.getInt(j + k + m);
/* 165 */       if (n == -1) {
/* 166 */         return 1;
/*     */       }
/*     */       
/* 169 */       char c1 = ☃.charAt(m);
/* 170 */       char c2 = (char)n;
/* 171 */       if (c1 < c2)
/* 172 */         return -1; 
/* 173 */       if (c1 > c2) {
/* 174 */         return 1;
/*     */       }
/*     */     } 
/*     */     
/* 178 */     return 0;
/*     */   }
/*     */   
/*     */   public List<T> a(String ☃) {
/* 182 */     int i = this.g.size();
/*     */ 
/*     */ 
/*     */     
/* 186 */     int j = 0;
/* 187 */     int k = i;
/*     */     
/* 189 */     while (j < k) {
/* 190 */       int i2 = j + (k - j) / 2;
/* 191 */       int i3 = a(☃, i2);
/* 192 */       if (b) {
/* 193 */         d.debug("comparing lower \"{}\" with {} \"{}\": {}", ☃, Integer.valueOf(i2), a(i2), Integer.valueOf(i3));
/*     */       }
/* 195 */       if (i3 > 0) {
/* 196 */         j = i2 + 1; continue;
/*     */       } 
/* 198 */       k = i2;
/*     */     } 
/*     */ 
/*     */     
/* 202 */     if (j < 0 || j >= i) {
/* 203 */       return Collections.emptyList();
/*     */     }
/*     */     
/* 206 */     int m = j;
/*     */     
/* 208 */     k = i;
/* 209 */     while (j < k) {
/* 210 */       int i2 = j + (k - j) / 2;
/* 211 */       int i3 = a(☃, i2);
/* 212 */       if (b) {
/* 213 */         d.debug("comparing upper \"{}\" with {} \"{}\": {}", ☃, Integer.valueOf(i2), a(i2), Integer.valueOf(i3));
/*     */       }
/* 215 */       if (i3 >= 0) {
/* 216 */         j = i2 + 1; continue;
/*     */       } 
/* 218 */       k = i2;
/*     */     } 
/*     */ 
/*     */     
/* 222 */     int n = j;
/*     */ 
/*     */     
/* 225 */     IntOpenHashSet intOpenHashSet = new IntOpenHashSet();
/* 226 */     for (int i1 = m; i1 < n; i1++) {
/* 227 */       intOpenHashSet.add(this.g.getInt(i1));
/*     */     }
/*     */     
/* 230 */     int[] arrayOfInt = intOpenHashSet.toIntArray();
/* 231 */     Arrays.sort(arrayOfInt);
/*     */     
/* 233 */     Set<T> set = Sets.newLinkedHashSet();
/* 234 */     for (int i2 : arrayOfInt) {
/* 235 */       set.add(this.a.get(i2));
/*     */     }
/* 237 */     return Lists.newArrayList(set);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\end.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */