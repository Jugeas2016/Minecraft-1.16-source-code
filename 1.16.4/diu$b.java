/*     */ import com.google.common.annotations.VisibleForTesting;
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
/*     */ public class b
/*     */ {
/*     */   private final String a;
/*     */   private final String b;
/*     */   private final String c;
/*     */   
/*     */   private b(String ☃) {
/*  57 */     this.a = ☃;
/*  58 */     this.b = null;
/*  59 */     this.c = null;
/*     */   }
/*     */   
/*     */   private b(String ☃, String str1, String str2) {
/*  63 */     this.a = ☃;
/*  64 */     this.b = str1;
/*  65 */     this.c = str2;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean equals(Object ☃) {
/*  70 */     if (this == ☃) {
/*  71 */       return true;
/*     */     }
/*  73 */     if (☃ == null || getClass() != ☃.getClass()) {
/*  74 */       return false;
/*     */     }
/*  76 */     b b1 = (b)☃;
/*  77 */     return (Objects.equals(this.a, b1.a) && 
/*  78 */       Objects.equals(this.b, b1.b) && 
/*  79 */       Objects.equals(this.c, b1.c));
/*     */   }
/*     */ 
/*     */   
/*     */   public int hashCode() {
/*  84 */     return Objects.hash(new Object[] { this.a, this.b, this.c });
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/*  89 */     return "Segment{fullText='" + this.a + '\'' + ", linkTitle='" + this.b + '\'' + ", linkUrl='" + this.c + '\'' + '}';
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String a() {
/*  97 */     return b() ? this.b : this.a;
/*     */   }
/*     */   
/*     */   public boolean b() {
/* 101 */     return (this.b != null);
/*     */   }
/*     */   
/*     */   public String c() {
/* 105 */     if (!b()) {
/* 106 */       throw new IllegalStateException("Not a link: " + this);
/*     */     }
/* 108 */     return this.c;
/*     */   }
/*     */   
/*     */   public static b a(String ☃, String str1) {
/* 112 */     return new b(null, ☃, str1);
/*     */   }
/*     */   
/*     */   @VisibleForTesting
/*     */   protected static b a(String ☃) {
/* 117 */     return new b(☃);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\diu$b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */