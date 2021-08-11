/*     */ import com.google.common.collect.Lists;
/*     */ import java.util.Collections;
/*     */ import java.util.List;
/*     */ import java.util.Random;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public enum bzm
/*     */ {
/*  14 */   a(c.a),
/*  15 */   b(c.u),
/*  16 */   c(c.c),
/*  17 */   d(c.v);
/*     */   
/*     */   private final c e;
/*     */ 
/*     */   
/*     */   bzm(c ☃) {
/*  23 */     this.e = ☃;
/*     */   }
/*     */   
/*     */   public bzm a(bzm ☃) {
/*  27 */     switch (null.a[☃.ordinal()]) {
/*     */       case 3:
/*  29 */         switch (null.a[ordinal()]) {
/*     */           case 1:
/*  31 */             return c;
/*     */           case 2:
/*  33 */             return d;
/*     */           case 3:
/*  35 */             return a;
/*     */           case 4:
/*  37 */             return b;
/*     */         } 
/*     */       case 4:
/*  40 */         switch (null.a[ordinal()]) {
/*     */           case 1:
/*  42 */             return d;
/*     */           case 2:
/*  44 */             return a;
/*     */           case 3:
/*  46 */             return b;
/*     */           case 4:
/*  48 */             return c;
/*     */         } 
/*     */       case 2:
/*  51 */         switch (null.a[ordinal()]) {
/*     */           case 1:
/*  53 */             return b;
/*     */           case 2:
/*  55 */             return c;
/*     */           case 3:
/*  57 */             return d;
/*     */           case 4:
/*  59 */             return a;
/*     */         }  break;
/*     */     } 
/*  62 */     return this;
/*     */   }
/*     */ 
/*     */   
/*     */   public c a() {
/*  67 */     return this.e;
/*     */   }
/*     */   
/*     */   public gc a(gc ☃) {
/*  71 */     if (☃.n() == gc.a.b) {
/*  72 */       return ☃;
/*     */     }
/*  74 */     switch (null.a[ordinal()]) {
/*     */       case 3:
/*  76 */         return ☃.f();
/*     */       case 4:
/*  78 */         return ☃.h();
/*     */       case 2:
/*  80 */         return ☃.g();
/*     */     } 
/*  82 */     return ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(int ☃, int i) {
/*  87 */     switch (null.a[ordinal()]) {
/*     */       case 3:
/*  89 */         return (☃ + i / 2) % i;
/*     */       case 4:
/*  91 */         return (☃ + i * 3 / 4) % i;
/*     */       case 2:
/*  93 */         return (☃ + i / 4) % i;
/*     */     } 
/*  95 */     return ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public static bzm a(Random ☃) {
/* 100 */     return x.<bzm>a(values(), ☃);
/*     */   }
/*     */   
/*     */   public static List<bzm> b(Random ☃) {
/* 104 */     List<bzm> list = Lists.newArrayList((Object[])values());
/* 105 */     Collections.shuffle(list, ☃);
/* 106 */     return list;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bzm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */