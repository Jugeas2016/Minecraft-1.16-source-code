/*    */ import java.io.IOException;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class si
/*    */   implements oj<sa>
/*    */ {
/*    */   private int a;
/*    */   private short b;
/*    */   private boolean c;
/*    */   
/*    */   public si() {}
/*    */   
/*    */   public si(int ☃, short s, boolean bool) {
/* 17 */     this.a = ☃;
/* 18 */     this.b = s;
/* 19 */     this.c = bool;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(sa ☃) {
/* 24 */     ☃.a(this);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(nf ☃) throws IOException {
/* 29 */     this.a = ☃.readByte();
/* 30 */     this.b = ☃.readShort();
/* 31 */     this.c = (☃.readByte() != 0);
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(nf ☃) throws IOException {
/* 36 */     ☃.writeByte(this.a);
/* 37 */     ☃.writeShort(this.b);
/* 38 */     ☃.writeByte(this.c ? 1 : 0);
/*    */   }
/*    */   
/*    */   public int b() {
/* 42 */     return this.a;
/*    */   }
/*    */   
/*    */   public short c() {
/* 46 */     return this.b;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\si.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */