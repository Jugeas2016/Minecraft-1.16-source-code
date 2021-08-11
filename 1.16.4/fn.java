/*    */ import com.mojang.brigadier.arguments.BoolArgumentType;
/*    */ import com.mojang.brigadier.arguments.DoubleArgumentType;
/*    */ import com.mojang.brigadier.arguments.FloatArgumentType;
/*    */ import com.mojang.brigadier.arguments.IntegerArgumentType;
/*    */ import com.mojang.brigadier.arguments.LongArgumentType;
/*    */ import com.mojang.brigadier.arguments.StringArgumentType;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class fn
/*    */ {
/*    */   public static void a() {
/* 18 */     fk.a("brigadier:bool", BoolArgumentType.class, new fl<>(BoolArgumentType::bool));
/* 19 */     fk.a("brigadier:float", FloatArgumentType.class, new fp());
/* 20 */     fk.a("brigadier:double", DoubleArgumentType.class, new fo());
/* 21 */     fk.a("brigadier:integer", IntegerArgumentType.class, new fq());
/* 22 */     fk.a("brigadier:long", LongArgumentType.class, new fr());
/* 23 */     fk.a("brigadier:string", StringArgumentType.class, new fs());
/*    */   }
/*    */   
/*    */   public static byte a(boolean ☃, boolean bool1) {
/* 27 */     byte b = 0;
/* 28 */     if (☃) {
/* 29 */       b = (byte)(b | 0x1);
/*    */     }
/* 31 */     if (bool1) {
/* 32 */       b = (byte)(b | 0x2);
/*    */     }
/* 34 */     return b;
/*    */   }
/*    */   
/*    */   public static boolean a(byte ☃) {
/* 38 */     return ((☃ & 0x1) != 0);
/*    */   }
/*    */   
/*    */   public static boolean b(byte ☃) {
/* 42 */     return ((☃ & 0x2) != 0);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\fn.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */