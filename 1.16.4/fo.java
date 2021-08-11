/*    */ import com.google.gson.JsonObject;
/*    */ import com.mojang.brigadier.arguments.ArgumentType;
/*    */ import com.mojang.brigadier.arguments.DoubleArgumentType;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class fo
/*    */   implements fj<DoubleArgumentType>
/*    */ {
/*    */   public void a(DoubleArgumentType ☃, nf nf1) {
/* 15 */     boolean bool1 = (☃.getMinimum() != -1.7976931348623157E308D);
/* 16 */     boolean bool2 = (☃.getMaximum() != Double.MAX_VALUE);
/* 17 */     nf1.writeByte(fn.a(bool1, bool2));
/* 18 */     if (bool1) {
/* 19 */       nf1.writeDouble(☃.getMinimum());
/*    */     }
/* 21 */     if (bool2) {
/* 22 */       nf1.writeDouble(☃.getMaximum());
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   public DoubleArgumentType a(nf ☃) {
/* 28 */     byte b = ☃.readByte();
/* 29 */     double d1 = fn.a(b) ? ☃.readDouble() : -1.7976931348623157E308D;
/* 30 */     double d2 = fn.b(b) ? ☃.readDouble() : Double.MAX_VALUE;
/* 31 */     return DoubleArgumentType.doubleArg(d1, d2);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(DoubleArgumentType ☃, JsonObject jsonObject) {
/* 36 */     if (☃.getMinimum() != -1.7976931348623157E308D) {
/* 37 */       jsonObject.addProperty("min", Double.valueOf(☃.getMinimum()));
/*    */     }
/* 39 */     if (☃.getMaximum() != Double.MAX_VALUE)
/* 40 */       jsonObject.addProperty("max", Double.valueOf(☃.getMaximum())); 
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\fo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */