/*    */ import java.util.function.Function;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class duc<T extends aqa>
/*    */   extends duv
/*    */ {
/*    */   public float c;
/*    */   public boolean d;
/*    */   public boolean e = true;
/*    */   
/*    */   protected duc() {
/* 15 */     this(eao::d);
/*    */   }
/*    */   
/*    */   protected duc(Function<vk, eao> ☃) {
/* 19 */     super(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public abstract void a(T paramT, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5);
/*    */ 
/*    */   
/*    */   public void a(T ☃, float f1, float f2, float f3) {}
/*    */   
/*    */   public void a(duc<T> ☃) {
/* 29 */     ☃.c = this.c;
/* 30 */     ☃.d = this.d;
/* 31 */     ☃.e = this.e;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\duc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */