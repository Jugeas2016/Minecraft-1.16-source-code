/*     */ import java.util.EnumSet;
/*     */ import java.util.Set;
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
/*     */ public enum a
/*     */ {
/*  88 */   a(0),
/*  89 */   b(1),
/*  90 */   c(2),
/*  91 */   d(3),
/*  92 */   e(4);
/*     */   
/*     */   private final int f;
/*     */ 
/*     */   
/*     */   a(int ☃) {
/*  98 */     this.f = ☃;
/*     */   }
/*     */   
/*     */   private int a() {
/* 102 */     return 1 << this.f;
/*     */   }
/*     */   
/*     */   private boolean b(int ☃) {
/* 106 */     return ((☃ & a()) == a());
/*     */   }
/*     */   
/*     */   public static Set<a> a(int ☃) {
/* 110 */     Set<a> set = EnumSet.noneOf(a.class);
/*     */     
/* 112 */     for (a a1 : values()) {
/* 113 */       if (a1.b(☃)) {
/* 114 */         set.add(a1);
/*     */       }
/*     */     } 
/*     */     
/* 118 */     return set;
/*     */   }
/*     */   
/*     */   public static int a(Set<a> ☃) {
/* 122 */     int i = 0;
/*     */     
/* 124 */     for (a a1 : ☃) {
/* 125 */       i |= a1.a();
/*     */     }
/*     */     
/* 128 */     return i;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\qk$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */