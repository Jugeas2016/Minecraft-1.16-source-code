/*    */ import java.io.IOException;
/*    */ import java.util.List;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class pg
/*    */   implements oj<om>
/*    */ {
/*    */   private int a;
/*    */   private List<bmb> b;
/*    */   
/*    */   public pg() {}
/*    */   
/*    */   public pg(int ☃, gj<bmb> gj1) {
/* 20 */     this.a = ☃;
/* 21 */     this.b = gj.a(gj1.size(), bmb.b);
/* 22 */     for (int i = 0; i < this.b.size(); i++) {
/* 23 */       this.b.set(i, ((bmb)gj1.get(i)).i());
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(nf ☃) throws IOException {
/* 29 */     this.a = ☃.readUnsignedByte();
/* 30 */     int i = ☃.readShort();
/* 31 */     this.b = gj.a(i, bmb.b);
/* 32 */     for (int j = 0; j < i; j++) {
/* 33 */       this.b.set(j, ☃.n());
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(nf ☃) throws IOException {
/* 39 */     ☃.writeByte(this.a);
/* 40 */     ☃.writeShort(this.b.size());
/* 41 */     for (bmb bmb : this.b) {
/* 42 */       ☃.a(bmb);
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(om ☃) {
/* 48 */     ☃.a(this);
/*    */   }
/*    */   
/*    */   public int b() {
/* 52 */     return this.a;
/*    */   }
/*    */   
/*    */   public List<bmb> c() {
/* 56 */     return this.b;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\pg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */