/*    */ import java.io.IOException;
/*    */ import javax.annotation.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class rb
/*    */   implements oj<om>
/*    */ {
/*    */   private int a;
/*    */   private int b;
/*    */   
/*    */   public rb() {}
/*    */   
/*    */   public rb(aqa ☃, @Nullable aqa aqa1) {
/* 18 */     this.a = ☃.Y();
/* 19 */     this.b = (aqa1 != null) ? aqa1.Y() : 0;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(nf ☃) throws IOException {
/* 24 */     this.a = ☃.readInt();
/* 25 */     this.b = ☃.readInt();
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(nf ☃) throws IOException {
/* 30 */     ☃.writeInt(this.a);
/* 31 */     ☃.writeInt(this.b);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(om ☃) {
/* 36 */     ☃.a(this);
/*    */   }
/*    */   
/*    */   public int b() {
/* 40 */     return this.a;
/*    */   }
/*    */   
/*    */   public int c() {
/* 44 */     return this.b;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\rb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */