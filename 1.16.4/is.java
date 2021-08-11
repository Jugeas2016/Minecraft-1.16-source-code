/*    */ import com.google.gson.JsonPrimitive;
/*    */ 
/*    */ public class is {
/*    */   public static final it<a> a;
/*    */   public static final it<a> b;
/*    */   public static final it<vk> c;
/*    */   
/*  8 */   public enum a { a(0),
/*  9 */     b(90),
/* 10 */     c(180),
/* 11 */     d(270);
/*    */     
/*    */     private final int e;
/*    */     
/*    */     a(int ☃) {
/* 16 */       this.e = ☃;
/*    */     } }
/*    */   
/*    */   static {
/* 20 */     a = new it<>("x", ☃ -> new JsonPrimitive(Integer.valueOf(a.a(☃))));
/* 21 */     b = new it<>("y", ☃ -> new JsonPrimitive(Integer.valueOf(a.a(☃))));
/* 22 */     c = new it<>("model", ☃ -> new JsonPrimitive(☃.toString()));
/* 23 */   } public static final it<Boolean> d = new it<>("uvlock", JsonPrimitive::new);
/* 24 */   public static final it<Integer> e = new it<>("weight", JsonPrimitive::new);
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\is.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */