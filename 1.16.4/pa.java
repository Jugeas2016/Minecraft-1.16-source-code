/*    */ import java.io.IOException;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class pa
/*    */   implements oj<om>
/*    */ {
/*    */   private aor a;
/*    */   private boolean b;
/*    */   
/*    */   public pa() {}
/*    */   
/*    */   public pa(aor ☃, boolean bool) {
/* 17 */     this.a = ☃;
/* 18 */     this.b = bool;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(om ☃) {
/* 23 */     ☃.a(this);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(nf ☃) throws IOException {
/* 28 */     this.a = aor.a(☃.readUnsignedByte());
/* 29 */     this.b = ☃.readBoolean();
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(nf ☃) throws IOException {
/* 34 */     ☃.writeByte(this.a.a());
/* 35 */     ☃.writeBoolean(this.b);
/*    */   }
/*    */   
/*    */   public boolean b() {
/* 39 */     return this.b;
/*    */   }
/*    */   
/*    */   public aor c() {
/* 43 */     return this.a;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\pa.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */