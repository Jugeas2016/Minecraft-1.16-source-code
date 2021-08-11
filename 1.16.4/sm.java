/*    */ import java.io.IOException;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class sm
/*    */   implements oj<sa>
/*    */ {
/* 13 */   public static final vk a = new vk("brand");
/*    */   
/*    */   private vk b;
/*    */   
/*    */   private nf c;
/*    */   
/*    */   public sm() {}
/*    */   
/*    */   public sm(vk ☃, nf nf1) {
/* 22 */     this.b = ☃;
/* 23 */     this.c = nf1;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(nf ☃) throws IOException {
/* 28 */     this.b = ☃.p();
/* 29 */     int i = ☃.readableBytes();
/* 30 */     if (i < 0 || i > 32767) {
/* 31 */       throw new IOException("Payload may not be larger than 32767 bytes");
/*    */     }
/* 33 */     this.c = new nf(☃.readBytes(i));
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(nf ☃) throws IOException {
/* 38 */     ☃.a(this.b);
/* 39 */     ☃.writeBytes(this.c);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(sa ☃) {
/* 44 */     ☃.a(this);
/* 45 */     if (this.c != null)
/* 46 */       this.c.release(); 
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\sm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */