/*    */ import java.util.function.Predicate;
/*    */ import javax.annotation.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ceq
/*    */   implements Predicate<ceh>
/*    */ {
/*    */   private final buo a;
/*    */   
/*    */   public ceq(buo ☃) {
/* 13 */     this.a = ☃;
/*    */   }
/*    */   
/*    */   public static ceq a(buo ☃) {
/* 17 */     return new ceq(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(@Nullable ceh ☃) {
/* 22 */     return (☃ != null && ☃.a(this.a));
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ceq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */