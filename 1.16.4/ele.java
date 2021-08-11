/*    */ import java.util.Arrays;
/*    */ import java.util.Map;
/*    */ import java.util.stream.Collectors;
/*    */ 
/*    */ 
/*    */ public class ele
/*    */ {
/*  8 */   public static final elf a = new elf();
/*    */   private final a b;
/*    */   
/*    */   public enum a
/*    */   {
/* 13 */     a("none"), b("partial"), c("full"); private final String e;
/*    */     static {
/* 15 */       d = (Map<String, a>)Arrays.<a>stream(values()).collect(Collectors.toMap(a::a, ☃ -> ☃));
/*    */     }
/*    */     private static final Map<String, a> d;
/*    */     
/*    */     a(String ☃) {
/* 20 */       this.e = ☃;
/*    */     }
/*    */     
/*    */     public String a() {
/* 24 */       return this.e;
/*    */     }
/*    */     
/*    */     public static a a(String ☃) {
/* 28 */       return d.getOrDefault(☃, a);
/*    */     }
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public ele(a ☃) {
/* 35 */     this.b = ☃;
/*    */   }
/*    */   
/*    */   public a a() {
/* 39 */     return this.b;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ele.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */