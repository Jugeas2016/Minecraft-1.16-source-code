/*    */ import java.io.IOException;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ph
/*    */   implements oj<om>
/*    */ {
/*    */   private int a;
/*    */   private int b;
/*    */   private int c;
/*    */   
/*    */   public ph() {}
/*    */   
/*    */   public ph(int ☃, int i, int j) {
/* 18 */     this.a = ☃;
/* 19 */     this.b = i;
/* 20 */     this.c = j;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(om ☃) {
/* 25 */     ☃.a(this);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(nf ☃) throws IOException {
/* 30 */     this.a = ☃.readUnsignedByte();
/* 31 */     this.b = ☃.readShort();
/* 32 */     this.c = ☃.readShort();
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void b(nf ☃) throws IOException {
/* 38 */     ☃.writeByte(this.a);
/* 39 */     ☃.writeShort(this.b);
/* 40 */     ☃.writeShort(this.c);
/*    */   }
/*    */   
/*    */   public int b() {
/* 44 */     return this.a;
/*    */   }
/*    */   
/*    */   public int c() {
/* 48 */     return this.b;
/*    */   }
/*    */   
/*    */   public int d() {
/* 52 */     return this.c;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ph.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */