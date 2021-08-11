/*    */ import com.google.common.collect.ImmutableMap;
/*    */ import java.util.Map;
/*    */ import java.util.function.Function;
/*    */ import java.util.stream.Stream;
/*    */ import javax.annotation.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public enum aya
/*    */ {
/* 12 */   a("major_negative", -5, 100, 10, 10),
/* 13 */   b("minor_negative", -1, 200, 20, 20),
/*    */   
/* 15 */   c("minor_positive", 1, 200, 1, 5),
/* 16 */   d("major_positive", 5, 100, 0, 100),
/*    */   
/* 18 */   e("trading", 1, 25, 2, 20);
/*    */   
/*    */   public final String f;
/*    */   
/*    */   public final int g;
/*    */   
/*    */   public final int h;
/*    */   
/*    */   public final int i;
/*    */   public final int j;
/*    */   private static final Map<String, aya> k;
/*    */   
/*    */   static {
/* 31 */     k = (Map<String, aya>)Stream.<aya>of(values()).collect(ImmutableMap.toImmutableMap(☃ -> ☃.f, Function.identity()));
/*    */   }
/*    */   aya(String ☃, int i, int j, int k, int m) {
/* 34 */     this.f = ☃;
/* 35 */     this.g = i;
/* 36 */     this.h = j;
/* 37 */     this.i = k;
/* 38 */     this.j = m;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public static aya a(String ☃) {
/* 43 */     return k.get(☃);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\aya.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */