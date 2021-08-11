/*    */ import com.google.common.collect.Maps;
/*    */ import java.util.Map;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public enum a
/*    */ {
/* 71 */   a("vertex", ".vsh", 35633),
/* 72 */   b("fragment", ".fsh", 35632);
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 77 */   private final Map<String, dfe> f = Maps.newHashMap(); private final String c;
/*    */   
/*    */   a(String ☃, String str1, int i) {
/* 80 */     this.c = ☃;
/* 81 */     this.d = str1;
/* 82 */     this.e = i;
/*    */   }
/*    */   private final String d; private final int e;
/*    */   public String a() {
/* 86 */     return this.c;
/*    */   }
/*    */   
/*    */   public String b() {
/* 90 */     return this.d;
/*    */   }
/*    */   
/*    */   private int d() {
/* 94 */     return this.e;
/*    */   }
/*    */   
/*    */   public Map<String, dfe> c() {
/* 98 */     return this.f;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dfe$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */