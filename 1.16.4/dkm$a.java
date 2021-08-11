/*    */ import java.util.Arrays;
/*    */ import java.util.Locale;
/*    */ import java.util.Map;
/*    */ import java.util.function.Function;
/*    */ import java.util.stream.Collectors;
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
/*    */ 
/*    */ 
/*    */ public enum a
/*    */ {
/* 57 */   a("legacy"),
/* 58 */   b("mojang"); private static final Map<String, a> c;
/*    */   static {
/* 60 */     c = (Map<String, a>)Arrays.<a>stream(values()).collect(Collectors.toMap(☃ -> ☃.d, Function.identity()));
/*    */   }
/*    */   private final String d;
/*    */   
/*    */   a(String ☃) {
/* 65 */     this.d = ☃;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public static a a(String ☃) {
/* 70 */     return c.get(☃.toLowerCase(Locale.ROOT));
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dkm$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */