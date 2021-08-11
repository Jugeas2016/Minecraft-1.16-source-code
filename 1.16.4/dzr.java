/*    */ import net.minecraft.world.level.ColorResolver;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class dzr
/*    */ {
/*    */   public static final ColorResolver b;
/*    */   public static final ColorResolver c;
/*  9 */   public static final ColorResolver a = bsv::a; static {
/* 10 */     b = ((☃, d1, d2) -> ☃.g());
/* 11 */     c = ((☃, d1, d2) -> ☃.m());
/*    */   }
/*    */   private static int a(bra ☃, fx fx1, ColorResolver colorResolver) {
/* 14 */     return ☃.a(fx1, colorResolver);
/*    */   }
/*    */   
/*    */   public static int a(bra ☃, fx fx1) {
/* 18 */     return a(☃, fx1, a);
/*    */   }
/*    */   
/*    */   public static int b(bra ☃, fx fx1) {
/* 22 */     return a(☃, fx1, b);
/*    */   }
/*    */   
/*    */   public static int c(bra ☃, fx fx1) {
/* 26 */     return a(☃, fx1, c);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dzr.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */