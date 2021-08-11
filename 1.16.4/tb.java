/*    */ import java.io.IOException;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class tb
/*    */   implements oj<sa>
/*    */ {
/*    */   private float a;
/*    */   private float b;
/*    */   private boolean c;
/*    */   private boolean d;
/*    */   
/*    */   public tb() {}
/*    */   
/*    */   public tb(float ☃, float f1, boolean bool1, boolean bool2) {
/* 21 */     this.a = ☃;
/* 22 */     this.b = f1;
/* 23 */     this.c = bool1;
/* 24 */     this.d = bool2;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(nf ☃) throws IOException {
/* 29 */     this.a = ☃.readFloat();
/* 30 */     this.b = ☃.readFloat();
/*    */     
/* 32 */     byte b = ☃.readByte();
/* 33 */     this.c = ((b & 0x1) > 0);
/* 34 */     this.d = ((b & 0x2) > 0);
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(nf ☃) throws IOException {
/* 39 */     ☃.writeFloat(this.a);
/* 40 */     ☃.writeFloat(this.b);
/*    */     
/* 42 */     byte b = 0;
/* 43 */     if (this.c) {
/* 44 */       b = (byte)(b | 0x1);
/*    */     }
/* 46 */     if (this.d) {
/* 47 */       b = (byte)(b | 0x2);
/*    */     }
/* 49 */     ☃.writeByte(b);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(sa ☃) {
/* 54 */     ☃.a(this);
/*    */   }
/*    */   
/*    */   public float b() {
/* 58 */     return this.a;
/*    */   }
/*    */   
/*    */   public float c() {
/* 62 */     return this.b;
/*    */   }
/*    */   
/*    */   public boolean d() {
/* 66 */     return this.c;
/*    */   }
/*    */   
/*    */   public boolean e() {
/* 70 */     return this.d;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\tb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */