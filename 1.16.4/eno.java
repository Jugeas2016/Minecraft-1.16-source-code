/*    */ import java.io.BufferedInputStream;
/*    */ import java.io.IOException;
/*    */ import java.io.InputStream;
/*    */ import java.nio.ByteBuffer;
/*    */ 
/*    */ public class eno implements enm {
/*    */   private final a a;
/*    */   private enm b;
/*    */   private final BufferedInputStream c;
/*    */   
/*    */   @FunctionalInterface
/*    */   public static interface a {
/*    */     enm create(InputStream param1InputStream) throws IOException;
/*    */   }
/*    */   
/*    */   static class b extends FilterInputStream {
/*    */     private b(InputStream ☃) {
/* 18 */       super(☃);
/*    */     }
/*    */ 
/*    */ 
/*    */     
/*    */     public void close() {}
/*    */   }
/*    */ 
/*    */   
/*    */   public eno(a ☃, InputStream inputStream) throws IOException {
/* 28 */     this.a = ☃;
/* 29 */     this.c = new BufferedInputStream(inputStream);
/* 30 */     this.c.mark(2147483647);
/* 31 */     this.b = ☃.create(new b(this.c));
/*    */   }
/*    */ 
/*    */   
/*    */   public AudioFormat a() {
/* 36 */     return this.b.a();
/*    */   }
/*    */ 
/*    */   
/*    */   public ByteBuffer a(int ☃) throws IOException {
/* 41 */     ByteBuffer byteBuffer = this.b.a(☃);
/* 42 */     if (!byteBuffer.hasRemaining()) {
/* 43 */       this.b.close();
/* 44 */       this.c.reset();
/* 45 */       this.b = this.a.create(new b(this.c));
/* 46 */       byteBuffer = this.b.a(☃);
/*    */     } 
/*    */     
/* 49 */     return byteBuffer;
/*    */   }
/*    */ 
/*    */   
/*    */   public void close() throws IOException {
/* 54 */     this.b.close();
/* 55 */     this.c.close();
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\eno.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */