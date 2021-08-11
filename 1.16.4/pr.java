/*    */ import java.io.IOException;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class pr
/*    */   implements oj<om>
/*    */ {
/*    */   private int a;
/*    */   private int b;
/*    */   private int c;
/*    */   
/*    */   public pr() {}
/*    */   
/*    */   public pr(int ☃, int i, int j) {
/* 17 */     this.a = ☃;
/* 18 */     this.b = i;
/* 19 */     this.c = j;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(om ☃) {
/* 24 */     ☃.a(this);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(nf ☃) throws IOException {
/* 29 */     this.a = ☃.readUnsignedByte();
/* 30 */     this.b = ☃.i();
/* 31 */     this.c = ☃.readInt();
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(nf ☃) throws IOException {
/* 36 */     ☃.writeByte(this.a);
/* 37 */     ☃.d(this.b);
/* 38 */     ☃.writeInt(this.c);
/*    */   }
/*    */   
/*    */   public int b() {
/* 42 */     return this.a;
/*    */   }
/*    */   
/*    */   public int c() {
/* 46 */     return this.b;
/*    */   }
/*    */   
/*    */   public int d() {
/* 50 */     return this.c;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\pr.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */