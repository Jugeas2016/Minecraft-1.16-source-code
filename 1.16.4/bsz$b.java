/*     */ import com.mojang.serialization.Codec;
/*     */ import java.util.Arrays;
/*     */ import java.util.Map;
/*     */ import java.util.stream.Collectors;
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
/*     */ public enum b
/*     */   implements afs
/*     */ {
/* 198 */   a("none")
/*     */   {
/*     */     public int a(double ☃, double d1, int i) {
/* 201 */       return i;
/*     */     }
/*     */   },
/* 204 */   b("dark_forest")
/*     */   {
/*     */     public int a(double ☃, double d1, int i) {
/* 207 */       return (i & 0xFEFEFE) + 2634762 >> 1;
/*     */     }
/*     */   },
/* 210 */   c("swamp")
/*     */   {
/*     */     public int a(double ☃, double d1, int i) {
/* 213 */       double d = bsv.f.a(☃ * 0.0225D, d1 * 0.0225D, false);
/* 214 */       if (d < -0.1D) {
/* 215 */         return 5011004;
/*     */       }
/* 217 */       return 6975545;
/*     */     }
/*     */   };
/*     */   
/*     */   private final String e;
/*     */   public static final Codec<b> d;
/*     */   private static final Map<String, b> f;
/*     */   
/*     */   b(String ☃) {
/* 226 */     this.e = ☃;
/*     */   }
/*     */   static {
/* 229 */     d = afs.a(b::values, b::a);
/*     */     
/* 231 */     f = (Map<String, b>)Arrays.<b>stream(values()).collect(Collectors.toMap(b::b, ☃ -> ☃));
/*     */   }
/*     */   public String b() {
/* 234 */     return this.e;
/*     */   }
/*     */ 
/*     */   
/*     */   public String a() {
/* 239 */     return this.e;
/*     */   }
/*     */   
/*     */   public static b a(String ☃) {
/* 243 */     return f.get(☃);
/*     */   }
/*     */   
/*     */   public abstract int a(double paramDouble1, double paramDouble2, int paramInt);
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bsz$b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */