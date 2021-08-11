/*    */ import java.util.concurrent.Executor;
/*    */ import javax.annotation.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class aas
/*    */   implements aap
/*    */ {
/*    */   private final aap a;
/*    */   private final aoe<Runnable> b;
/*    */   
/*    */   public aas(aap ☃, Executor executor) {
/* 15 */     this.a = ☃;
/* 16 */     this.b = aoe.a(executor, "progressListener");
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(brd ☃) {
/* 21 */     this.b.a(() -> this.a.a(☃));
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(brd ☃, @Nullable cga cga1) {
/* 26 */     this.b.a(() -> this.a.a(☃, cga1));
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void b() {
/* 36 */     this.b.a(this.a::b);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\aas.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */