/*     */ import java.io.IOException;
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
/*     */ public class c
/*     */   extends st
/*     */ {
/*     */   public c() {
/*  88 */     this.h = true;
/*     */   }
/*     */   
/*     */   public c(float ☃, float f1, boolean bool) {
/*  92 */     this.d = ☃;
/*  93 */     this.e = f1;
/*  94 */     this.f = bool;
/*  95 */     this.h = true;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(nf ☃) throws IOException {
/* 100 */     this.d = ☃.readFloat();
/* 101 */     this.e = ☃.readFloat();
/* 102 */     super.a(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(nf ☃) throws IOException {
/* 107 */     ☃.writeFloat(this.d);
/* 108 */     ☃.writeFloat(this.e);
/* 109 */     super.b(☃);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\st$c.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */