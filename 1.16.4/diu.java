/*     */ import com.google.common.annotations.VisibleForTesting;
/*     */ import com.google.common.collect.Lists;
/*     */ import java.util.Arrays;
/*     */ import java.util.List;
/*     */ import java.util.Objects;
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
/*     */ public class diu
/*     */ {
/*     */   public static class a
/*     */   {
/*     */     public final List<diu.b> a;
/*     */     
/*     */     a(List<diu.b> ☃) {
/*  23 */       this.a = ☃;
/*     */     }
/*     */ 
/*     */     
/*     */     public String toString() {
/*  28 */       return "Line{segments=" + this.a + '}';
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public boolean equals(Object ☃) {
/*  35 */       if (this == ☃) {
/*  36 */         return true;
/*     */       }
/*  38 */       if (☃ == null || getClass() != ☃.getClass()) {
/*  39 */         return false;
/*     */       }
/*  41 */       a a1 = (a)☃;
/*  42 */       return Objects.equals(this.a, a1.a);
/*     */     }
/*     */ 
/*     */     
/*     */     public int hashCode() {
/*  47 */       return Objects.hash(new Object[] { this.a });
/*     */     }
/*     */   }
/*     */   
/*     */   public static class b {
/*     */     private final String a;
/*     */     private final String b;
/*     */     private final String c;
/*     */     
/*     */     private b(String ☃) {
/*  57 */       this.a = ☃;
/*  58 */       this.b = null;
/*  59 */       this.c = null;
/*     */     }
/*     */     
/*     */     private b(String ☃, String str1, String str2) {
/*  63 */       this.a = ☃;
/*  64 */       this.b = str1;
/*  65 */       this.c = str2;
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean equals(Object ☃) {
/*  70 */       if (this == ☃) {
/*  71 */         return true;
/*     */       }
/*  73 */       if (☃ == null || getClass() != ☃.getClass()) {
/*  74 */         return false;
/*     */       }
/*  76 */       b b1 = (b)☃;
/*  77 */       return (Objects.equals(this.a, b1.a) && 
/*  78 */         Objects.equals(this.b, b1.b) && 
/*  79 */         Objects.equals(this.c, b1.c));
/*     */     }
/*     */ 
/*     */     
/*     */     public int hashCode() {
/*  84 */       return Objects.hash(new Object[] { this.a, this.b, this.c });
/*     */     }
/*     */ 
/*     */     
/*     */     public String toString() {
/*  89 */       return "Segment{fullText='" + this.a + '\'' + ", linkTitle='" + this.b + '\'' + ", linkUrl='" + this.c + '\'' + '}';
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public String a() {
/*  97 */       return b() ? this.b : this.a;
/*     */     }
/*     */     
/*     */     public boolean b() {
/* 101 */       return (this.b != null);
/*     */     }
/*     */     
/*     */     public String c() {
/* 105 */       if (!b()) {
/* 106 */         throw new IllegalStateException("Not a link: " + this);
/*     */       }
/* 108 */       return this.c;
/*     */     }
/*     */     
/*     */     public static b a(String ☃, String str1) {
/* 112 */       return new b(null, ☃, str1);
/*     */     }
/*     */     
/*     */     @VisibleForTesting
/*     */     protected static b a(String ☃) {
/* 117 */       return new b(☃);
/*     */     }
/*     */   }
/*     */   
/*     */   @VisibleForTesting
/*     */   protected static List<String> a(String ☃) {
/* 123 */     return Arrays.asList(☃.split("\\n"));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static List<a> a(String ☃, b... arrayOfB) {
/* 131 */     return a(☃, Arrays.asList(arrayOfB));
/*     */   }
/*     */   
/*     */   private static List<a> a(String ☃, List<b> list) {
/* 135 */     List<String> list1 = a(☃);
/* 136 */     return a(list1, list);
/*     */   }
/*     */   
/*     */   private static List<a> a(List<String> ☃, List<b> list) {
/* 140 */     int i = 0;
/* 141 */     List<a> list1 = Lists.newArrayList();
/* 142 */     for (String str : ☃) {
/* 143 */       List<b> list2 = Lists.newArrayList();
/* 144 */       List<String> list3 = a(str, "%link");
/* 145 */       for (String str1 : list3) {
/* 146 */         if ("%link".equals(str1)) {
/* 147 */           list2.add(list.get(i++)); continue;
/*     */         } 
/* 149 */         list2.add(b.a(str1));
/*     */       } 
/*     */       
/* 152 */       list1.add(new a(list2));
/*     */     } 
/* 154 */     return list1;
/*     */   }
/*     */   
/*     */   public static List<String> a(String ☃, String str1) {
/* 158 */     if (str1.isEmpty()) {
/* 159 */       throw new IllegalArgumentException("Delimiter cannot be the empty string");
/*     */     }
/* 161 */     List<String> list = Lists.newArrayList();
/* 162 */     int i = 0; int j;
/* 163 */     while ((j = ☃.indexOf(str1, i)) != -1) {
/* 164 */       if (j > i) {
/* 165 */         list.add(☃.substring(i, j));
/*     */       }
/* 167 */       list.add(str1);
/* 168 */       i = j + str1.length();
/*     */     } 
/* 170 */     if (i < ☃.length()) {
/* 171 */       list.add(☃.substring(i));
/*     */     }
/* 173 */     return list;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\diu.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */