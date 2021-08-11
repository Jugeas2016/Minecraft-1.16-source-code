/*    */ import javax.annotation.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class axk
/*    */   extends awt
/*    */ {
/*    */   protected final float h;
/*    */   
/*    */   public axk(aqu ☃, double d) {
/* 15 */     this(☃, d, 0.001F);
/*    */   }
/*    */   
/*    */   public axk(aqu ☃, double d, float f) {
/* 19 */     super(☃, d);
/* 20 */     this.h = f;
/*    */   }
/*    */ 
/*    */   
/*    */   @Nullable
/*    */   protected dcn g() {
/* 26 */     if (this.a.aH()) {
/*    */       
/* 28 */       dcn ☃ = azj.b(this.a, 15, 7);
/* 29 */       return (☃ == null) ? super.g() : ☃;
/*    */     } 
/* 31 */     if (this.a.cY().nextFloat() >= this.h) {
/* 32 */       return azj.b(this.a, 10, 7);
/*    */     }
/* 34 */     return super.g();
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\axk.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */