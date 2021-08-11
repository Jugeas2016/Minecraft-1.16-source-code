/*    */ import java.io.IOException;
/*    */ import javax.annotation.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class qs
/*    */   implements oj<om>
/*    */ {
/*    */   @Nullable
/*    */   private vk a;
/*    */   
/*    */   public qs() {}
/*    */   
/*    */   public qs(@Nullable vk ☃) {
/* 18 */     this.a = ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(om ☃) {
/* 23 */     ☃.a(this);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(nf ☃) throws IOException {
/* 28 */     if (☃.readBoolean()) {
/* 29 */       this.a = ☃.p();
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(nf ☃) throws IOException {
/* 35 */     ☃.writeBoolean((this.a != null));
/* 36 */     if (this.a != null) {
/* 37 */       ☃.a(this.a);
/*    */     }
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public vk b() {
/* 43 */     return this.a;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\qs.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */