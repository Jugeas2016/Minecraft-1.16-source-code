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
/*     */ 
/*     */ 
/*     */ 
/*     */ public class a
/*     */   extends qa
/*     */ {
/*     */   public a() {
/*  91 */     this.i = true;
/*     */   }
/*     */   
/*     */   public a(int ☃, short s1, short s2, short s3, boolean bool) {
/*  95 */     super(☃);
/*     */     
/*  97 */     this.b = s1;
/*  98 */     this.c = s2;
/*  99 */     this.d = s3;
/* 100 */     this.g = bool;
/* 101 */     this.i = true;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(nf ☃) throws IOException {
/* 106 */     super.a(☃);
/* 107 */     this.b = ☃.readShort();
/* 108 */     this.c = ☃.readShort();
/* 109 */     this.d = ☃.readShort();
/* 110 */     this.g = ☃.readBoolean();
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(nf ☃) throws IOException {
/* 115 */     super.b(☃);
/* 116 */     ☃.writeShort(this.b);
/* 117 */     ☃.writeShort(this.c);
/* 118 */     ☃.writeShort(this.d);
/* 119 */     ☃.writeBoolean(this.g);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\qa$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */