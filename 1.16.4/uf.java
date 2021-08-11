/*    */ import java.io.IOException;
/*    */ import javax.annotation.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class uf
/*    */   implements oj<ue>
/*    */ {
/*    */   private int a;
/*    */   private nf b;
/*    */   
/*    */   public uf() {}
/*    */   
/*    */   public uf(int ☃, @Nullable nf nf1) {
/* 19 */     this.a = ☃;
/* 20 */     this.b = nf1;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(nf ☃) throws IOException {
/* 25 */     this.a = ☃.i();
/* 26 */     if (☃.readBoolean()) {
/* 27 */       int i = ☃.readableBytes();
/* 28 */       if (i < 0 || i > 1048576) {
/* 29 */         throw new IOException("Payload may not be larger than 1048576 bytes");
/*    */       }
/* 31 */       this.b = new nf(☃.readBytes(i));
/*    */     } else {
/* 33 */       this.b = null;
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(nf ☃) throws IOException {
/* 39 */     ☃.d(this.a);
/* 40 */     if (this.b != null) {
/* 41 */       ☃.writeBoolean(true);
/* 42 */       ☃.writeBytes(this.b.copy());
/*    */     } else {
/* 44 */       ☃.writeBoolean(false);
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(ue ☃) {
/* 50 */     ☃.a(this);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip\\uf.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */