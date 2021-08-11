/*    */ import com.mojang.serialization.Codec;
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
/*    */ public enum b
/*    */   implements afs
/*    */ {
/* 41 */   a("normal"),
/* 42 */   b("mesa"); public static final Codec<b> c;
/*    */   
/*    */   static {
/* 45 */     c = afs.a(b::values, b::a);
/* 46 */     d = (Map<String, b>)Arrays.<b>stream(values()).collect(Collectors.toMap(b::b, ☃ -> ☃));
/*    */   }
/*    */   private static final Map<String, b> d; private final String e;
/*    */   b(String ☃) {
/* 50 */     this.e = ☃;
/*    */   }
/*    */   
/*    */   public String b() {
/* 54 */     return this.e;
/*    */   }
/*    */   
/*    */   private static b a(String ☃) {
/* 58 */     return d.get(☃);
/*    */   }
/*    */   
/*    */   public static b a(int ☃) {
/* 62 */     if (☃ < 0 || ☃ >= (values()).length) {
/* 63 */       return a;
/*    */     }
/* 65 */     return values()[☃];
/*    */   }
/*    */ 
/*    */   
/*    */   public String a() {
/* 70 */     return this.e;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ckb$b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */