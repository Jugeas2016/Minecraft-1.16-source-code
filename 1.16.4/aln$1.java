/*    */ import com.mojang.serialization.DataResult;
/*    */ import com.mojang.serialization.DynamicOps;
/*    */ import com.mojang.serialization.codecs.PrimitiveCodec;
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
/*    */ final class null
/*    */   implements PrimitiveCodec<String>
/*    */ {
/*    */   public <T> DataResult<String> read(DynamicOps<T> ☃, T t) {
/* 28 */     return ☃
/* 29 */       .getStringValue(t)
/* 30 */       .map(aln::a);
/*    */   }
/*    */ 
/*    */   
/*    */   public <T> T a(DynamicOps<T> ☃, String str) {
/* 35 */     return (T)☃.createString(str);
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 40 */     return "NamespacedString";
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\aln$1.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */