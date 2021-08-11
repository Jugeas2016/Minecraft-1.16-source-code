/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class dhr
/*    */   extends eoo
/*    */ {
/* 13 */   private static final nr a = new of("mco.client.outdated.title");
/* 14 */   private static final nr[] b = new nr[] { new of("mco.client.outdated.msg.line1"), new of("mco.client.outdated.msg.line2") };
/*    */ 
/*    */ 
/*    */   
/* 18 */   private static final nr c = new of("mco.client.incompatible.title");
/* 19 */   private static final nr[] p = new nr[] { new of("mco.client.incompatible.msg.line1"), new of("mco.client.incompatible.msg.line2"), new of("mco.client.incompatible.msg.line3") };
/*    */ 
/*    */   
/*    */   private final dot q;
/*    */ 
/*    */   
/*    */   private final boolean r;
/*    */ 
/*    */   
/*    */   public dhr(dot ☃, boolean bool) {
/* 29 */     this.q = ☃;
/* 30 */     this.r = bool;
/*    */   }
/*    */ 
/*    */   
/*    */   public void b() {
/* 35 */     a(new dlj(this.k / 2 - 100, j(12), 200, 20, nq.h, ☃ -> this.i.a(this.q)));
/*    */   }
/*    */   
/*    */   public void a(dfm ☃, int i, int j, float f) {
/*    */     nr nr1, arrayOfNr[];
/* 40 */     a(☃);
/*    */ 
/*    */ 
/*    */     
/* 44 */     if (this.r) {
/* 45 */       nr1 = c;
/* 46 */       arrayOfNr = p;
/*    */     } else {
/* 48 */       nr1 = a;
/* 49 */       arrayOfNr = b;
/*    */     } 
/*    */     
/* 52 */     a(☃, this.o, nr1, this.k / 2, j(3), 16711680);
/* 53 */     for (int k = 0; k < arrayOfNr.length; k++) {
/* 54 */       a(☃, this.o, arrayOfNr[k], this.k / 2, j(5) + k * 12, 16777215);
/*    */     }
/*    */     
/* 57 */     super.a(☃, i, j, f);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(int ☃, int i, int j) {
/* 62 */     if (☃ == 257 || ☃ == 335 || ☃ == 256) {
/* 63 */       this.i.a(this.q);
/* 64 */       return true;
/*    */     } 
/* 66 */     return super.a(☃, i, j);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dhr.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */