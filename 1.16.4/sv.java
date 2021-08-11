/*    */ import java.io.IOException;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class sv
/*    */   implements oj<sa>
/*    */ {
/*    */   private boolean a;
/*    */   private boolean b;
/*    */   
/*    */   public sv() {}
/*    */   
/*    */   public sv(boolean ☃, boolean bool1) {
/* 16 */     this.a = ☃;
/* 17 */     this.b = bool1;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(nf ☃) throws IOException {
/* 22 */     this.a = ☃.readBoolean();
/* 23 */     this.b = ☃.readBoolean();
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(nf ☃) throws IOException {
/* 28 */     ☃.writeBoolean(this.a);
/* 29 */     ☃.writeBoolean(this.b);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(sa ☃) {
/* 34 */     ☃.a(this);
/*    */   }
/*    */   
/*    */   public boolean b() {
/* 38 */     return this.a;
/*    */   }
/*    */   
/*    */   public boolean c() {
/* 42 */     return this.b;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\sv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */