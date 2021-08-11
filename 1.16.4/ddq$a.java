/*     */ import com.google.common.collect.ImmutableMap;
/*     */ import java.util.Map;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ public enum a
/*     */ {
/*  91 */   a("integer"),
/*  92 */   b("hearts");
/*     */   
/*     */   private final String c;
/*     */   private static final Map<String, a> d;
/*     */   
/*     */   a(String ☃) {
/*  98 */     this.c = ☃;
/*     */   }
/*     */   
/*     */   public String a() {
/* 102 */     return this.c;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   static {
/* 108 */     ImmutableMap.Builder<String, a> ☃ = ImmutableMap.builder();
/* 109 */     for (a a1 : values()) {
/* 110 */       ☃.put(a1.c, a1);
/*     */     }
/* 112 */     d = (Map<String, a>)☃.build();
/*     */   }
/*     */   
/*     */   public static a a(String ☃) {
/* 116 */     return d.getOrDefault(☃, a);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ddq$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */