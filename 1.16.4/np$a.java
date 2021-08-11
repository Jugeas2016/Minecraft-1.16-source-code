/*    */ import java.util.Arrays;
/*    */ import java.util.Map;
/*    */ import java.util.stream.Collectors;
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
/*    */   private static final Map<String, a> g;
/* 61 */   a("open_url", true),
/* 62 */   b("open_file", false),
/* 63 */   c("run_command", true),
/* 64 */   d("suggest_command", true),
/* 65 */   e("change_page", true),
/* 66 */   f("copy_to_clipboard", true);
/*    */   
/*    */   static {
/* 69 */     g = (Map<String, a>)Arrays.<a>stream(values()).collect(Collectors.toMap(a::b, ☃ -> ☃));
/*    */   }
/*    */   
/*    */   private final boolean h;
/*    */   
/*    */   a(String ☃, boolean bool) {
/* 75 */     this.i = ☃;
/* 76 */     this.h = bool;
/*    */   }
/*    */   private final String i;
/*    */   public boolean a() {
/* 80 */     return this.h;
/*    */   }
/*    */   
/*    */   public String b() {
/* 84 */     return this.i;
/*    */   }
/*    */   
/*    */   public static a a(String ☃) {
/* 88 */     return g.get(☃);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\np$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */