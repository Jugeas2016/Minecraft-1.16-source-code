/*    */ import java.io.IOException;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class b
/*    */   extends qa
/*    */ {
/*    */   public b() {
/* 49 */     this.h = true;
/* 50 */     this.i = true;
/*    */   }
/*    */   
/*    */   public b(int ☃, short s1, short s2, short s3, byte b1, byte b2, boolean bool) {
/* 54 */     super(☃);
/*    */     
/* 56 */     this.b = s1;
/* 57 */     this.c = s2;
/* 58 */     this.d = s3;
/* 59 */     this.e = b1;
/* 60 */     this.f = b2;
/* 61 */     this.g = bool;
/* 62 */     this.h = true;
/* 63 */     this.i = true;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(nf ☃) throws IOException {
/* 68 */     super.a(☃);
/* 69 */     this.b = ☃.readShort();
/* 70 */     this.c = ☃.readShort();
/* 71 */     this.d = ☃.readShort();
/* 72 */     this.e = ☃.readByte();
/* 73 */     this.f = ☃.readByte();
/* 74 */     this.g = ☃.readBoolean();
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(nf ☃) throws IOException {
/* 79 */     super.b(☃);
/* 80 */     ☃.writeShort(this.b);
/* 81 */     ☃.writeShort(this.c);
/* 82 */     ☃.writeShort(this.d);
/* 83 */     ☃.writeByte(this.e);
/* 84 */     ☃.writeByte(this.f);
/* 85 */     ☃.writeBoolean(this.g);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\qa$b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */