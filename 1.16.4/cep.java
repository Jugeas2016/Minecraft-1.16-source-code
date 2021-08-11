/*    */ import java.util.function.Predicate;
/*    */ import javax.annotation.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class cep
/*    */   implements Predicate<ceh>
/*    */ {
/* 10 */   private static final cep a = new cep(cva.a)
/*    */     {
/*    */       public boolean a(@Nullable ceh ☃) {
/* 13 */         return (☃ != null && ☃.g());
/*    */       }
/*    */     };
/*    */   
/*    */   private final cva b;
/*    */   
/*    */   private cep(cva ☃) {
/* 20 */     this.b = ☃;
/*    */   }
/*    */   
/*    */   public static cep a(cva ☃) {
/* 24 */     return (☃ == cva.a) ? a : new cep(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(@Nullable ceh ☃) {
/* 29 */     return (☃ != null && ☃.c() == this.b);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cep.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */