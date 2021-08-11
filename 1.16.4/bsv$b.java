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
/*     */ public enum b
/*     */   implements afs
/*     */ {
/*  97 */   a("none"),
/*  98 */   b("taiga"),
/*  99 */   c("extreme_hills"),
/* 100 */   d("jungle"),
/* 101 */   e("mesa"),
/* 102 */   f("plains"),
/* 103 */   g("savanna"),
/* 104 */   h("icy"),
/* 105 */   i("the_end"),
/* 106 */   j("beach"),
/* 107 */   k("forest"),
/* 108 */   l("ocean"),
/* 109 */   m("desert"),
/* 110 */   n("river"),
/* 111 */   o("swamp"),
/* 112 */   p("mushroom"),
/* 113 */   q("nether"); public static final Codec<b> r;
/*     */   
/*     */   static {
/* 116 */     r = afs.a(b::values, b::a);
/*     */     
/* 118 */     s = (Map<String, b>)Arrays.<b>stream(values()).collect(Collectors.toMap(b::b, ☃ -> ☃));
/*     */   }
/*     */   private static final Map<String, b> s; private final String t;
/*     */   b(String ☃) {
/* 122 */     this.t = ☃;
/*     */   }
/*     */   
/*     */   public String b() {
/* 126 */     return this.t;
/*     */   }
/*     */   
/*     */   public static b a(String ☃) {
/* 130 */     return s.get(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public String a() {
/* 135 */     return this.t;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bsv$b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */