/*    */ import java.util.Map;
/*    */ import java.util.function.Function;
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
/*    */ final class null
/*    */   implements Function<Map.Entry<cfj<?>, Comparable<?>>, String>
/*    */ {
/*    */   public String a(@Nullable Map.Entry<cfj<?>, Comparable<?>> ☃) {
/* 25 */     if (☃ == null) {
/* 26 */       return "<NULL>";
/*    */     }
/*    */     
/* 29 */     cfj<?> cfj = ☃.getKey();
/* 30 */     return cfj.f() + "=" + a(cfj, ☃.getValue());
/*    */   }
/*    */ 
/*    */   
/*    */   private <T extends Comparable<T>> String a(cfj<T> ☃, Comparable<?> comparable) {
/* 35 */     return ☃.a((T)comparable);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cej$1.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */