/*    */ import java.util.Arrays;
/*    */ import java.util.Map;
/*    */ import java.util.stream.Collectors;
/*    */ 
/*    */ 
/*    */ public class np
/*    */ {
/*    */   private final a a;
/*    */   private final String b;
/*    */   
/*    */   public np(a ☃, String str) {
/* 12 */     this.a = ☃;
/* 13 */     this.b = str;
/*    */   }
/*    */   
/*    */   public a a() {
/* 17 */     return this.a;
/*    */   }
/*    */   
/*    */   public String b() {
/* 21 */     return this.b;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean equals(Object ☃) {
/* 26 */     if (this == ☃) {
/* 27 */       return true;
/*    */     }
/* 29 */     if (☃ == null || getClass() != ☃.getClass()) {
/* 30 */       return false;
/*    */     }
/*    */     
/* 33 */     np np1 = (np)☃;
/*    */     
/* 35 */     if (this.a != np1.a) {
/* 36 */       return false;
/*    */     }
/* 38 */     if ((this.b != null) ? !this.b.equals(np1.b) : (np1.b != null)) {
/* 39 */       return false;
/*    */     }
/*    */     
/* 42 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 47 */     return "ClickEvent{action=" + this.a + ", value='" + this.b + '\'' + '}';
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public int hashCode() {
/* 55 */     int ☃ = this.a.hashCode();
/* 56 */     ☃ = 31 * ☃ + ((this.b != null) ? this.b.hashCode() : 0);
/* 57 */     return ☃;
/*    */   }
/*    */   
/*    */   public enum a { private static final Map<String, a> g;
/* 61 */     a("open_url", true),
/* 62 */     b("open_file", false),
/* 63 */     c("run_command", true),
/* 64 */     d("suggest_command", true),
/* 65 */     e("change_page", true),
/* 66 */     f("copy_to_clipboard", true);
/*    */     
/*    */     static {
/* 69 */       g = (Map<String, a>)Arrays.<a>stream(values()).collect(Collectors.toMap(a::b, ☃ -> ☃));
/*    */     }
/*    */     private final boolean h;
/*    */     private final String i;
/*    */     
/*    */     a(String ☃, boolean bool) {
/* 75 */       this.i = ☃;
/* 76 */       this.h = bool;
/*    */     }
/*    */     
/*    */     public boolean a() {
/* 80 */       return this.h;
/*    */     }
/*    */     
/*    */     public String b() {
/* 84 */       return this.i;
/*    */     }
/*    */     
/*    */     public static a a(String ☃) {
/* 88 */       return g.get(☃);
/*    */     } }
/*    */ 
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\np.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */