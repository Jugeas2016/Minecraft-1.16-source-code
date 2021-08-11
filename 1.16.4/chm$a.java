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
/*    */ public enum a
/*    */   implements afs
/*    */ {
/* 27 */   a("air"),
/* 28 */   b("liquid"); public static final Codec<a> c;
/*    */   
/*    */   static {
/* 31 */     c = afs.a(a::values, a::a);
/*    */     
/* 33 */     d = (Map<String, a>)Arrays.<a>stream(values()).collect(Collectors.toMap(a::b, ☃ -> ☃));
/*    */   }
/*    */   private static final Map<String, a> d; private final String e;
/*    */   a(String ☃) {
/* 37 */     this.e = ☃;
/*    */   }
/*    */   
/*    */   public String b() {
/* 41 */     return this.e;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public static a a(String ☃) {
/* 46 */     return d.get(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public String a() {
/* 51 */     return this.e;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\chm$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */