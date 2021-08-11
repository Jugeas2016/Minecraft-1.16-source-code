/*    */ import java.util.function.Consumer;
/*    */ import javax.annotation.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class a
/*    */ {
/*    */   @Nullable
/*    */   private ddu b;
/*    */   private boolean c;
/*    */   
/*    */   public boolean a() {
/* 23 */     return this.c;
/*    */   }
/*    */   
/*    */   public a(enn ☃, ddu ddu1) {
/* 27 */     this.b = ddu1;
/*    */   }
/*    */   
/*    */   public void a(Consumer<ddu> ☃) {
/* 31 */     enn.a(this.a).execute(() -> {
/*    */           if (this.b != null) {
/*    */             ☃.accept(this.b);
/*    */           }
/*    */         });
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void b() {
/* 41 */     this.c = true;
/* 42 */     enn.b(this.a).a(this.b);
/* 43 */     this.b = null;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\enn$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */