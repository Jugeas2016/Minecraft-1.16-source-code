/*    */ import java.util.Arrays;
/*    */ import java.util.Map;
/*    */ import java.util.function.Function;
/*    */ import java.util.stream.Collectors;
/*    */ 
/*    */ 
/*    */ 
/*    */ public enum adr
/*    */ {
/* 10 */   a("master"),
/* 11 */   b("music"),
/* 12 */   c("record"),
/* 13 */   d("weather"),
/* 14 */   e("block"),
/* 15 */   f("hostile"),
/* 16 */   g("neutral"),
/* 17 */   h("player"),
/* 18 */   i("ambient"),
/* 19 */   j("voice"); private static final Map<String, adr> k;
/*    */   
/*    */   static {
/* 22 */     k = (Map<String, adr>)Arrays.<adr>stream(values()).collect(Collectors.toMap(adr::a, Function.identity()));
/*    */   }
/*    */   private final String l;
/*    */   
/*    */   adr(String ☃) {
/* 27 */     this.l = ☃;
/*    */   }
/*    */   
/*    */   public String a() {
/* 31 */     return this.l;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\adr.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */