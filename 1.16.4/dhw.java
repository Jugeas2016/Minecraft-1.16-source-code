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
/*    */ public class dhw
/*    */   extends eoo
/*    */ {
/*    */   private final dot a;
/*    */   private nr b;
/*    */   private nr c;
/*    */   
/*    */   public dhw(dhi ☃, dot dot1) {
/* 21 */     this.a = dot1;
/* 22 */     a(☃);
/*    */   }
/*    */   
/*    */   public dhw(nr ☃, dot dot1) {
/* 26 */     this.a = dot1;
/* 27 */     a(☃);
/*    */   }
/*    */   
/*    */   public dhw(nr ☃, nr nr1, dot dot1) {
/* 31 */     this.a = dot1;
/* 32 */     a(☃, nr1);
/*    */   }
/*    */   
/*    */   private void a(dhi ☃) {
/* 36 */     if (☃.c == -1) {
/* 37 */       this.b = new oe("An error occurred (" + ☃.a + "):");
/* 38 */       this.c = new oe(☃.b);
/*    */     } else {
/* 40 */       this.b = new oe("Realms (" + ☃.c + "):");
/* 41 */       String str = "mco.errorMessage." + ☃.c;
/* 42 */       this.c = ekx.a(str) ? new of(str) : nr.a(☃.d);
/*    */     } 
/*    */   }
/*    */   
/*    */   private void a(nr ☃) {
/* 47 */     this.b = new oe("An error occurred: ");
/* 48 */     this.c = ☃;
/*    */   }
/*    */   
/*    */   private void a(nr ☃, nr nr1) {
/* 52 */     this.b = ☃;
/* 53 */     this.c = nr1;
/*    */   }
/*    */ 
/*    */   
/*    */   public void b() {
/* 58 */     eoj.a(this.b.getString() + ": " + this.c.getString());
/* 59 */     a(new dlj(this.k / 2 - 100, this.l - 52, 200, 20, new oe("Ok"), ☃ -> this.i.a(this.a)));
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(dfm ☃, int i, int j, float f) {
/* 64 */     a(☃);
/*    */     
/* 66 */     a(☃, this.o, this.b, this.k / 2, 80, 16777215);
/* 67 */     a(☃, this.o, this.c, this.k / 2, 100, 16711680);
/*    */     
/* 69 */     super.a(☃, i, j, f);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dhw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */