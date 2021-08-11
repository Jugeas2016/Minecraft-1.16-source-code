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
/*    */ public class dow
/*    */   extends dol
/*    */ {
/*    */   public dow(dot ☃, dkd dkd1) {
/* 15 */     super(☃, dkd1, new of("options.skinCustomisation.title"));
/*    */   }
/*    */ 
/*    */   
/*    */   protected void b() {
/* 20 */     int ☃ = 0;
/*    */     
/* 22 */     for (bfx bfx : bfx.values()) {
/* 23 */       a(new dlj(this.k / 2 - 155 + ☃ % 2 * 160, this.l / 6 + 24 * (☃ >> 1), 150, 20, a(bfx), dlj1 -> {
/*    */               this.b.a(☃);
/*    */               dlj1.a(a(☃));
/*    */             }));
/* 27 */       ☃++;
/*    */     } 
/*    */     
/* 30 */     a(new dlw(this.k / 2 - 155 + ☃ % 2 * 160, this.l / 6 + 24 * (☃ >> 1), 150, 20, dkc.z, dkc.z.c(this.b), ☃ -> {
/*    */             dkc.z.a(this.b, 1);
/*    */             this.b.b();
/*    */             ☃.a(dkc.z.c(this.b));
/*    */             this.b.c();
/*    */           }));
/* 36 */     ☃++;
/*    */     
/* 38 */     if (☃ % 2 == 1) {
/* 39 */       ☃++;
/*    */     }
/*    */     
/* 42 */     a(new dlj(this.k / 2 - 100, this.l / 6 + 24 * (☃ >> 1), 200, 20, nq.c, ☃ -> this.i.a(this.a)));
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(dfm ☃, int i, int j, float f) {
/* 47 */     a(☃);
/* 48 */     a(☃, this.o, this.d, this.k / 2, 20, 16777215);
/*    */     
/* 50 */     super.a(☃, i, j, f);
/*    */   }
/*    */   
/*    */   private nr a(bfx ☃) {
/* 54 */     return nq.a(☃.d(), this.b.d().contains(☃));
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dow.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */