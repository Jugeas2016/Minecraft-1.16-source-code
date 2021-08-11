/*    */ import com.google.gson.JsonObject;
/*    */ import com.mojang.brigadier.arguments.ArgumentType;
/*    */ import com.mojang.brigadier.arguments.LongArgumentType;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class fr
/*    */   implements fj<LongArgumentType>
/*    */ {
/*    */   public void a(LongArgumentType ☃, nf nf1) {
/* 15 */     boolean bool1 = (☃.getMinimum() != Long.MIN_VALUE);
/* 16 */     boolean bool2 = (☃.getMaximum() != Long.MAX_VALUE);
/* 17 */     nf1.writeByte(fn.a(bool1, bool2));
/* 18 */     if (bool1) {
/* 19 */       nf1.writeLong(☃.getMinimum());
/*    */     }
/* 21 */     if (bool2) {
/* 22 */       nf1.writeLong(☃.getMaximum());
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   public LongArgumentType a(nf ☃) {
/* 28 */     byte b = ☃.readByte();
/* 29 */     long l1 = fn.a(b) ? ☃.readLong() : Long.MIN_VALUE;
/* 30 */     long l2 = fn.b(b) ? ☃.readLong() : Long.MAX_VALUE;
/* 31 */     return LongArgumentType.longArg(l1, l2);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(LongArgumentType ☃, JsonObject jsonObject) {
/* 36 */     if (☃.getMinimum() != Long.MIN_VALUE) {
/* 37 */       jsonObject.addProperty("min", Long.valueOf(☃.getMinimum()));
/*    */     }
/* 39 */     if (☃.getMaximum() != Long.MAX_VALUE)
/* 40 */       jsonObject.addProperty("max", Long.valueOf(☃.getMaximum())); 
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\fr.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */