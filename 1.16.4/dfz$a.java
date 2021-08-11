/*     */ import java.io.IOException;
/*     */ import java.io.InputStream;
/*     */ import java.io.OutputStream;
/*     */ import org.apache.http.entity.InputStreamEntity;
/*     */ import org.apache.http.util.Args;
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
/*     */   extends InputStreamEntity
/*     */ {
/*     */   private final long a;
/*     */   private final InputStream b;
/*     */   private final dgf c;
/*     */   
/*     */   public a(InputStream ☃, long l, dgf dgf1) {
/* 175 */     super(☃);
/* 176 */     this.b = ☃;
/* 177 */     this.a = l;
/* 178 */     this.c = dgf1;
/*     */   }
/*     */ 
/*     */   
/*     */   public void writeTo(OutputStream ☃) throws IOException {
/* 183 */     Args.notNull(☃, "Output stream");
/* 184 */     InputStream inputStream = this.b;
/*     */     try {
/* 186 */       byte[] arrayOfByte = new byte[4096];
/*     */       
/* 188 */       if (this.a < 0L) {
/*     */         int i;
/* 190 */         while ((i = inputStream.read(arrayOfByte)) != -1) {
/* 191 */           ☃.write(arrayOfByte, 0, i);
/* 192 */           this.c.a += i;
/*     */         } 
/*     */       } else {
/*     */         
/* 196 */         long l = this.a;
/* 197 */         while (l > 0L) {
/* 198 */           int i = inputStream.read(arrayOfByte, 0, (int)Math.min(4096L, l));
/* 199 */           if (i == -1) {
/*     */             break;
/*     */           }
/* 202 */           ☃.write(arrayOfByte, 0, i);
/* 203 */           this.c.a += i;
/* 204 */           l -= i;
/* 205 */           ☃.flush();
/*     */         } 
/*     */       } 
/*     */     } finally {
/* 209 */       inputStream.close();
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dfz$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */