/*     */ import java.io.ByteArrayOutputStream;
/*     */ import java.io.FilterInputStream;
/*     */ import java.io.IOException;
/*     */ import java.io.InputStream;
/*     */ import java.io.PrintStream;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ class a
/*     */   extends FilterInputStream
/*     */ {
/*     */   private final String a;
/*     */   private boolean b;
/*     */   
/*     */   public a(InputStream ☃, vk vk1, String str) {
/* 108 */     super(☃);
/* 109 */     ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
/* 110 */     (new Exception()).printStackTrace(new PrintStream(byteArrayOutputStream));
/* 111 */     this.a = "Leaked resource: '" + vk1 + "' loaded from pack: '" + str + "'\n" + byteArrayOutputStream;
/*     */   }
/*     */ 
/*     */   
/*     */   public void close() throws IOException {
/* 116 */     super.close();
/* 117 */     this.b = true;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void finalize() throws Throwable {
/* 122 */     if (!this.b) {
/* 123 */       acb.c().warn(this.a);
/*     */     }
/*     */     
/* 126 */     super.finalize();
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\acb$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */