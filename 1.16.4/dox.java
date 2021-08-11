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
/*    */ public class dox
/*    */   extends dol
/*    */ {
/*    */   public dox(dot ☃, dkd dkd1) {
/* 15 */     super(☃, dkd1, new of("options.sounds.title"));
/*    */   }
/*    */ 
/*    */   
/*    */   protected void b() {
/* 20 */     int ☃ = 0;
/* 21 */     a(new dme(this.i, this.k / 2 - 155 + ☃ % 2 * 160, this.l / 6 - 12 + 24 * (☃ >> 1), adr.a, 310));
/* 22 */     ☃ += 2;
/*    */     
/* 24 */     for (adr adr : adr.values()) {
/* 25 */       if (adr != adr.a) {
/* 26 */         a(new dme(this.i, this.k / 2 - 155 + ☃ % 2 * 160, this.l / 6 - 12 + 24 * (☃ >> 1), adr, 150));
/*    */         
/* 28 */         ☃++;
/*    */       } 
/*    */     } 
/*    */     
/* 32 */     a(new dlw(this.k / 2 - 75, this.l / 6 - 12 + 24 * (++☃ >> 1), 150, 20, dkc.R, dkc.R.c(this.b), ☃ -> {
/*    */             dkc.R.a(this.i.k);
/*    */             ☃.a(dkc.R.c(this.i.k));
/*    */             this.i.k.b();
/*    */           }));
/* 37 */     a(new dlj(this.k / 2 - 100, this.l / 6 + 168, 200, 20, nq.c, ☃ -> this.i.a(this.a)));
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(dfm ☃, int i, int j, float f) {
/* 42 */     a(☃);
/* 43 */     a(☃, this.o, this.d, this.k / 2, 15, 16777215);
/* 44 */     super.a(☃, i, j, f);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dox.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */