/*    */ import com.google.common.collect.Maps;
/*    */ import java.util.HashMap;
/*    */ import java.util.Map;
/*    */ import java.util.function.BiFunction;
/*    */ import javax.annotation.Nullable;
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
/*    */   a, b;
/*    */   private static final Map<String, a> c;
/*    */   private final String d;
/*    */   private final BiFunction<dcn, aqa, dcn> e;
/*    */   
/*    */   static {
/* 60 */     a = new a("FEET", 0, "feet", (☃, aqa1) -> ☃);
/* 61 */     b = new a("EYES", 1, "eyes", (☃, aqa1) -> new dcn(☃.b, ☃.c + aqa1.ce(), ☃.d));
/*    */   }
/*    */   static {
/* 64 */     c = x.<Map<String, a>>a(Maps.newHashMap(), ☃ -> {
/*    */           for (a a1 : values()) {
/*    */             ☃.put(a1.d, a1);
/*    */           }
/*    */         });
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   a(String ☃, BiFunction<dcn, aqa, dcn> biFunction) {
/* 74 */     this.d = ☃;
/* 75 */     this.e = biFunction;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public static a a(String ☃) {
/* 80 */     return c.get(☃);
/*    */   }
/*    */   
/*    */   public dcn a(aqa ☃) {
/* 84 */     return this.e.apply(☃.cA(), ☃);
/*    */   }
/*    */   
/*    */   public dcn a(db ☃) {
/* 88 */     aqa aqa = ☃.f();
/* 89 */     if (aqa == null) {
/* 90 */       return ☃.d();
/*    */     }
/* 92 */     return this.e.apply(☃.d(), aqa);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dj$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */