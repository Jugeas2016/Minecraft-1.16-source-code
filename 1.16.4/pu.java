/*    */ import java.io.IOException;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class pu
/*    */   implements oj<om>
/*    */ {
/*    */   private int a;
/*    */   private fx b;
/*    */   private int c;
/*    */   private boolean d;
/*    */   
/*    */   public pu() {}
/*    */   
/*    */   public pu(int ☃, fx fx1, int i, boolean bool) {
/* 20 */     this.a = ☃;
/* 21 */     this.b = fx1.h();
/* 22 */     this.c = i;
/* 23 */     this.d = bool;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(nf ☃) throws IOException {
/* 28 */     this.a = ☃.readInt();
/* 29 */     this.b = ☃.e();
/* 30 */     this.c = ☃.readInt();
/* 31 */     this.d = ☃.readBoolean();
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(nf ☃) throws IOException {
/* 36 */     ☃.writeInt(this.a);
/* 37 */     ☃.a(this.b);
/* 38 */     ☃.writeInt(this.c);
/* 39 */     ☃.writeBoolean(this.d);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(om ☃) {
/* 44 */     ☃.a(this);
/*    */   }
/*    */   
/*    */   public boolean b() {
/* 48 */     return this.d;
/*    */   }
/*    */   
/*    */   public int c() {
/* 52 */     return this.a;
/*    */   }
/*    */   
/*    */   public int d() {
/* 56 */     return this.c;
/*    */   }
/*    */   
/*    */   public fx e() {
/* 60 */     return this.b;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\pu.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */