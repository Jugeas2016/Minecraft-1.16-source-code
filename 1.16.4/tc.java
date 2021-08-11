/*    */ import java.io.IOException;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class tc
/*    */   implements oj<sa>
/*    */ {
/*    */   private bjk a;
/*    */   private boolean b;
/*    */   private boolean c;
/*    */   
/*    */   public tc() {}
/*    */   
/*    */   public tc(bjk ☃, boolean bool1, boolean bool2) {
/* 18 */     this.a = ☃;
/* 19 */     this.b = bool1;
/* 20 */     this.c = bool2;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(nf ☃) throws IOException {
/* 25 */     this.a = ☃.<bjk>a(bjk.class);
/* 26 */     this.b = ☃.readBoolean();
/* 27 */     this.c = ☃.readBoolean();
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(nf ☃) throws IOException {
/* 32 */     ☃.a(this.a);
/* 33 */     ☃.writeBoolean(this.b);
/* 34 */     ☃.writeBoolean(this.c);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(sa ☃) {
/* 39 */     ☃.a(this);
/*    */   }
/*    */   
/*    */   public bjk b() {
/* 43 */     return this.a;
/*    */   }
/*    */   
/*    */   public boolean c() {
/* 47 */     return this.b;
/*    */   }
/*    */   
/*    */   public boolean d() {
/* 51 */     return this.c;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\tc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */