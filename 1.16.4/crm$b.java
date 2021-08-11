/*    */ import com.mojang.serialization.Codec;
/*    */ import java.util.Arrays;
/*    */ import java.util.Map;
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
/*    */ public enum b
/*    */   implements afs
/*    */ {
/* 47 */   a("warm"),
/* 48 */   b("cold"); public static final Codec<b> c;
/*    */   
/*    */   static {
/* 51 */     c = afs.a(b::values, b::a);
/*    */     
/* 53 */     d = (Map<String, b>)Arrays.<b>stream(values()).collect(Collectors.toMap(b::b, ☃ -> ☃));
/*    */   }
/*    */   private static final Map<String, b> d; private final String e;
/*    */   b(String ☃) {
/* 57 */     this.e = ☃;
/*    */   }
/*    */   
/*    */   public String b() {
/* 61 */     return this.e;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public static b a(String ☃) {
/* 66 */     return d.get(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public String a() {
/* 71 */     return this.e;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\crm$b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */