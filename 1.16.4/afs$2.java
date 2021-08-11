/*    */ import com.mojang.serialization.DynamicOps;
/*    */ import com.mojang.serialization.Keyable;
/*    */ import java.util.Arrays;
/*    */ import java.util.stream.IntStream;
/*    */ import java.util.stream.Stream;
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
/*    */   implements Keyable
/*    */ {
/*    */   null(afs[] paramArrayOfafs) {}
/*    */   
/*    */   public <T> Stream<T> keys(DynamicOps<T> ☃) {
/* 61 */     if (☃.compressMaps()) {
/* 62 */       return IntStream.range(0, this.a.length).mapToObj(☃::createInt);
/*    */     }
/* 64 */     return Arrays.<afs>stream(this.a).map(afs::a).map(☃::createString);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\afs$2.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */