/*    */ import com.google.gson.JsonObject;
/*    */ import com.mojang.brigadier.arguments.ArgumentType;
/*    */ import com.mojang.brigadier.arguments.FloatArgumentType;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class fp
/*    */   implements fj<FloatArgumentType>
/*    */ {
/*    */   public void a(FloatArgumentType ☃, nf nf1) {
/* 15 */     boolean bool1 = (☃.getMinimum() != -3.4028235E38F);
/* 16 */     boolean bool2 = (☃.getMaximum() != Float.MAX_VALUE);
/* 17 */     nf1.writeByte(fn.a(bool1, bool2));
/* 18 */     if (bool1) {
/* 19 */       nf1.writeFloat(☃.getMinimum());
/*    */     }
/* 21 */     if (bool2) {
/* 22 */       nf1.writeFloat(☃.getMaximum());
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   public FloatArgumentType a(nf ☃) {
/* 28 */     byte b = ☃.readByte();
/* 29 */     float f1 = fn.a(b) ? ☃.readFloat() : -3.4028235E38F;
/* 30 */     float f2 = fn.b(b) ? ☃.readFloat() : Float.MAX_VALUE;
/* 31 */     return FloatArgumentType.floatArg(f1, f2);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(FloatArgumentType ☃, JsonObject jsonObject) {
/* 36 */     if (☃.getMinimum() != -3.4028235E38F) {
/* 37 */       jsonObject.addProperty("min", Float.valueOf(☃.getMinimum()));
/*    */     }
/* 39 */     if (☃.getMaximum() != Float.MAX_VALUE)
/* 40 */       jsonObject.addProperty("max", Float.valueOf(☃.getMaximum())); 
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\fp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */