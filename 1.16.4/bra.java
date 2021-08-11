/*    */ import net.minecraft.world.level.ColorResolver;
/*    */ 
/*    */ 
/*    */ 
/*    */ public interface bra
/*    */   extends brc
/*    */ {
/*    */   float a(gc paramgc, boolean paramBoolean);
/*    */   
/*    */   cuo e();
/*    */   
/*    */   int a(fx paramfx, ColorResolver paramColorResolver);
/*    */   
/*    */   default int a(bsf ☃, fx fx1) {
/* 15 */     return e().a(☃).b(fx1);
/*    */   }
/*    */   
/*    */   default int b(fx ☃, int i) {
/* 19 */     return e().b(☃, i);
/*    */   }
/*    */   
/*    */   default boolean e(fx ☃) {
/* 23 */     return (a(bsf.a, ☃) >= K());
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bra.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */