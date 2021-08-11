/*    */ import java.io.IOException;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class pe
/*    */   implements oj<om>
/*    */ {
/*    */   private int a;
/*    */   private short b;
/*    */   private boolean c;
/*    */   
/*    */   public pe() {}
/*    */   
/*    */   public pe(int ☃, short s, boolean bool) {
/* 18 */     this.a = ☃;
/* 19 */     this.b = s;
/* 20 */     this.c = bool;
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
/* 32 */     this.c = ☃.readBoolean();
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(nf ☃) throws IOException {
/* 37 */     ☃.writeByte(this.a);
/* 38 */     ☃.writeShort(this.b);
/* 39 */     ☃.writeBoolean(this.c);
/*    */   }
/*    */   
/*    */   public int b() {
/* 43 */     return this.a;
/*    */   }
/*    */   
/*    */   public short c() {
/* 47 */     return this.b;
/*    */   }
/*    */   
/*    */   public boolean d() {
/* 51 */     return this.c;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\pe.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */