/*     */ import java.util.Arrays;
/*     */ import java.util.Comparator;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Optional;
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
/*     */ public enum v
/*     */ {
/*     */   private static final v[] c;
/*     */   private static final Map<String, v> d;
/* 135 */   a(0, "red", (vj<bsv>[])new vj[] { btb.f, btb.t, btb.ae, btb.G, btb.an, btb.H, btb.ao }),
/* 136 */   b(1, "snow", (vj<bsv>[])new vj[] { btb.E, btb.F, btb.am });
/*     */   static {
/* 138 */     c = (v[])Arrays.<v>stream(values()).sorted(Comparator.comparingInt(v::b)).toArray(☃ -> new v[☃]);
/* 139 */     d = (Map<String, v>)Arrays.<v>stream(values()).collect(Collectors.toMap(v::a, ☃ -> ☃));
/*     */   }
/*     */   private final int e;
/*     */   private final String f;
/*     */   private final List<vj<bsv>> g;
/*     */   
/*     */   v(int ☃, String str1, vj<bsv>... arrayOfVj) {
/* 146 */     this.e = ☃;
/* 147 */     this.f = str1;
/* 148 */     this.g = Arrays.asList(arrayOfVj);
/*     */   }
/*     */   
/*     */   public String a() {
/* 152 */     return this.f;
/*     */   }
/*     */   
/*     */   public int b() {
/* 156 */     return this.e;
/*     */   }
/*     */   
/*     */   public static v a(String ☃) {
/* 160 */     return d.getOrDefault(☃, a);
/*     */   }
/*     */   
/*     */   public static v a(int ☃) {
/* 164 */     if (☃ < 0 || ☃ > c.length) {
/* 165 */       ☃ = 0;
/*     */     }
/* 167 */     return c[☃];
/*     */   }
/*     */   
/*     */   public static v a(Optional<vj<bsv>> ☃) {
/* 171 */     return (☃.isPresent() && b.g.contains(☃.get())) ? b : a;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bah$v.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */