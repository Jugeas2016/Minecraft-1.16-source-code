/*     */ import java.util.Optional;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class afr
/*     */ {
/*  11 */   private static final Optional<Object> a = Optional.of(afx.a);
/*     */   
/*     */   private static boolean a(ob ☃, afb afb1, int i, char c) {
/*  14 */     if (Character.isSurrogate(c)) {
/*  15 */       return afb1.accept(i, ☃, 65533);
/*     */     }
/*  17 */     return afb1.accept(i, ☃, c);
/*     */   }
/*     */ 
/*     */   
/*     */   public static boolean a(String ☃, ob ob1, afb afb1) {
/*  22 */     int i = ☃.length();
/*  23 */     for (int j = 0; j < i; j++) {
/*  24 */       char c = ☃.charAt(j);
/*  25 */       if (Character.isHighSurrogate(c)) {
/*  26 */         if (j + 1 >= i) {
/*  27 */           if (!afb1.accept(j, ob1, 65533)) {
/*  28 */             return false;
/*     */           }
/*     */           break;
/*     */         } 
/*  32 */         char c1 = ☃.charAt(j + 1);
/*  33 */         if (Character.isLowSurrogate(c1)) {
/*  34 */           if (!afb1.accept(j, ob1, Character.toCodePoint(c, c1))) {
/*  35 */             return false;
/*     */           }
/*  37 */           j++;
/*     */         }
/*  39 */         else if (!afb1.accept(j, ob1, 65533)) {
/*  40 */           return false;
/*     */         }
/*     */       
/*  43 */       } else if (!a(ob1, afb1, j, c)) {
/*  44 */         return false;
/*     */       } 
/*     */     } 
/*  47 */     return true;
/*     */   }
/*     */   
/*     */   public static boolean b(String ☃, ob ob1, afb afb1) {
/*  51 */     int i = ☃.length();
/*  52 */     for (int j = i - 1; j >= 0; j--) {
/*  53 */       char c = ☃.charAt(j);
/*  54 */       if (Character.isLowSurrogate(c)) {
/*  55 */         if (j - 1 < 0) {
/*  56 */           if (!afb1.accept(0, ob1, 65533)) {
/*  57 */             return false;
/*     */           }
/*     */           break;
/*     */         } 
/*  61 */         char c1 = ☃.charAt(j - 1);
/*  62 */         if (Character.isHighSurrogate(c1)) {
/*  63 */           j--;
/*  64 */           if (!afb1.accept(j, ob1, Character.toCodePoint(c1, c))) {
/*  65 */             return false;
/*     */           }
/*     */         }
/*  68 */         else if (!afb1.accept(j, ob1, 65533)) {
/*  69 */           return false;
/*     */         }
/*     */       
/*  72 */       } else if (!a(ob1, afb1, j, c)) {
/*  73 */         return false;
/*     */       } 
/*     */     } 
/*  76 */     return true;
/*     */   }
/*     */   
/*     */   public static boolean c(String ☃, ob ob1, afb afb1) {
/*  80 */     return a(☃, 0, ob1, afb1);
/*     */   }
/*     */   
/*     */   public static boolean a(String ☃, int i, ob ob1, afb afb1) {
/*  84 */     return a(☃, i, ob1, ob1, afb1);
/*     */   }
/*     */   
/*     */   public static boolean a(String ☃, int i, ob ob1, ob ob2, afb afb1) {
/*  88 */     int j = ☃.length();
/*  89 */     ob ob3 = ob1;
/*  90 */     for (int k = i; k < j; k++) {
/*  91 */       char c = ☃.charAt(k);
/*  92 */       if (c == '§') {
/*  93 */         if (k + 1 >= j) {
/*     */           break;
/*     */         }
/*  96 */         char c1 = ☃.charAt(k + 1);
/*  97 */         k k1 = k.a(c1);
/*  98 */         if (k1 != null) {
/*  99 */           ob3 = (k1 == k.v) ? ob2 : ob3.c(k1);
/*     */         }
/* 101 */         k++;
/* 102 */       } else if (Character.isHighSurrogate(c)) {
/* 103 */         if (k + 1 >= j) {
/* 104 */           if (!afb1.accept(k, ob3, 65533)) {
/* 105 */             return false;
/*     */           }
/*     */           break;
/*     */         } 
/* 109 */         char c1 = ☃.charAt(k + 1);
/* 110 */         if (Character.isLowSurrogate(c1)) {
/* 111 */           if (!afb1.accept(k, ob3, Character.toCodePoint(c, c1))) {
/* 112 */             return false;
/*     */           }
/* 114 */           k++;
/*     */         }
/* 116 */         else if (!afb1.accept(k, ob3, 65533)) {
/* 117 */           return false;
/*     */         }
/*     */       
/* 120 */       } else if (!a(ob3, afb1, k, c)) {
/* 121 */         return false;
/*     */       } 
/*     */     } 
/* 124 */     return true;
/*     */   }
/*     */   
/*     */   public static boolean a(nu ☃, ob ob1, afb afb1) {
/* 128 */     return !☃.a((ob1, str) -> a(str, 0, ob1, ☃) ? Optional.empty() : a, ob1).isPresent();
/*     */   }
/*     */   
/*     */   public static String a(String ☃) {
/* 132 */     StringBuilder stringBuilder = new StringBuilder();
/* 133 */     a(☃, ob.a, (i, ob1, j) -> {
/*     */           ☃.appendCodePoint(j);
/*     */           return true;
/*     */         });
/* 137 */     return stringBuilder.toString();
/*     */   }
/*     */   
/*     */   public static String a(nu ☃) {
/* 141 */     StringBuilder stringBuilder = new StringBuilder();
/* 142 */     a(☃, ob.a, (i, ob1, j) -> {
/*     */           ☃.appendCodePoint(j);
/*     */           return true;
/*     */         });
/* 146 */     return stringBuilder.toString();
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\afr.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */