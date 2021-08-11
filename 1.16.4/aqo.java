/*    */ import com.mojang.serialization.Codec;
/*    */ import java.util.Arrays;
/*    */ import java.util.Map;
/*    */ import java.util.stream.Collectors;
/*    */ 
/*    */ 
/*    */ 
/*    */ public enum aqo
/*    */   implements afs
/*    */ {
/* 11 */   a("monster", 70, false, false, 128),
/* 12 */   b("creature", 10, true, true, 128),
/* 13 */   c("ambient", 15, true, false, 128),
/* 14 */   d("water_creature", 5, true, false, 128),
/* 15 */   e("water_ambient", 20, true, false, 64),
/* 16 */   f("misc", -1, true, true, 128);
/*    */   
/*    */   static {
/* 19 */     g = afs.a(aqo::values, aqo::a);
/*    */     
/* 21 */     h = (Map<String, aqo>)Arrays.<aqo>stream(values()).collect(Collectors.toMap(aqo::b, ☃ -> ☃));
/*    */   }
/*    */ 
/*    */ 
/*    */   
/* 26 */   private final int m = 32; public static final Codec<aqo> g; private static final Map<String, aqo> h;
/*    */   private final int i;
/*    */   
/*    */   aqo(String ☃, int i, boolean bool1, boolean bool2, int j) {
/* 30 */     this.l = ☃;
/* 31 */     this.i = i;
/* 32 */     this.j = bool1;
/* 33 */     this.k = bool2;
/* 34 */     this.n = j;
/*    */   }
/*    */   private final boolean j; private final boolean k; private final String l; private final int n;
/*    */   public String b() {
/* 38 */     return this.l;
/*    */   }
/*    */ 
/*    */   
/*    */   public String a() {
/* 43 */     return this.l;
/*    */   }
/*    */   
/*    */   public static aqo a(String ☃) {
/* 47 */     return h.get(☃);
/*    */   }
/*    */   
/*    */   public int c() {
/* 51 */     return this.i;
/*    */   }
/*    */   
/*    */   public boolean d() {
/* 55 */     return this.j;
/*    */   }
/*    */   
/*    */   public boolean e() {
/* 59 */     return this.k;
/*    */   }
/*    */   
/*    */   public int f() {
/* 63 */     return this.n;
/*    */   }
/*    */   
/*    */   public int g() {
/* 67 */     return 32;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\aqo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */