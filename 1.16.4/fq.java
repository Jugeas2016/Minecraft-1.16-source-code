/*    */ import com.google.gson.JsonObject;
/*    */ import com.mojang.brigadier.arguments.ArgumentType;
/*    */ import com.mojang.brigadier.arguments.IntegerArgumentType;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class fq
/*    */   implements fj<IntegerArgumentType>
/*    */ {
/*    */   public void a(IntegerArgumentType ☃, nf nf1) {
/* 15 */     boolean bool1 = (☃.getMinimum() != Integer.MIN_VALUE);
/* 16 */     boolean bool2 = (☃.getMaximum() != Integer.MAX_VALUE);
/* 17 */     nf1.writeByte(fn.a(bool1, bool2));
/* 18 */     if (bool1) {
/* 19 */       nf1.writeInt(☃.getMinimum());
/*    */     }
/* 21 */     if (bool2) {
/* 22 */       nf1.writeInt(☃.getMaximum());
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   public IntegerArgumentType a(nf ☃) {
/* 28 */     byte b = ☃.readByte();
/* 29 */     int i = fn.a(b) ? ☃.readInt() : Integer.MIN_VALUE;
/* 30 */     int j = fn.b(b) ? ☃.readInt() : Integer.MAX_VALUE;
/* 31 */     return IntegerArgumentType.integer(i, j);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(IntegerArgumentType ☃, JsonObject jsonObject) {
/* 36 */     if (☃.getMinimum() != Integer.MIN_VALUE) {
/* 37 */       jsonObject.addProperty("min", Integer.valueOf(☃.getMinimum()));
/*    */     }
/* 39 */     if (☃.getMaximum() != Integer.MAX_VALUE)
/* 40 */       jsonObject.addProperty("max", Integer.valueOf(☃.getMaximum())); 
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\fq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */