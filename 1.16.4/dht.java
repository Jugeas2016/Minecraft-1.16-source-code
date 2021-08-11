/*    */ import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class dht
/*    */   extends eoo
/*    */ {
/*    */   protected BooleanConsumer a;
/*    */   private final nr b;
/*    */   private final nr c;
/*    */   private int p;
/*    */   
/*    */   public dht(BooleanConsumer ☃, nr nr1, nr nr2) {
/* 18 */     this.a = ☃;
/* 19 */     this.b = nr1;
/* 20 */     this.c = nr2;
/*    */   }
/*    */ 
/*    */   
/*    */   public void b() {
/* 25 */     a(new dlj(this.k / 2 - 105, j(9), 100, 20, nq.e, ☃ -> this.a.accept(true)));
/* 26 */     a(new dlj(this.k / 2 + 5, j(9), 100, 20, nq.f, ☃ -> this.a.accept(false)));
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(dfm ☃, int i, int j, float f) {
/* 31 */     a(☃);
/*    */     
/* 33 */     a(☃, this.o, this.b, this.k / 2, j(3), 16777215);
/* 34 */     a(☃, this.o, this.c, this.k / 2, j(5), 16777215);
/*    */     
/* 36 */     super.a(☃, i, j, f);
/*    */   }
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
/*    */   public void d() {
/* 49 */     super.d();
/*    */     
/* 51 */     if (--this.p == 0)
/* 52 */       for (dlh ☃ : this.m)
/* 53 */         ☃.o = true;  
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dht.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */