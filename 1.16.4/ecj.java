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
/*    */ public class ecj
/*    */   extends ece<ccu>
/*    */ {
/* 16 */   public static final elr a = new elr(ekb.d, new vk("entity/enchanting_table_book"));
/*    */   
/* 18 */   private final dto c = new dto();
/*    */   
/*    */   public ecj(ecd ☃) {
/* 21 */     super(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(ccu ☃, float f, dfm dfm1, eag eag1, int i, int j) {
/* 26 */     dfm1.a();
/* 27 */     dfm1.a(0.5D, 0.75D, 0.5D);
/*    */     
/* 29 */     float f1 = ☃.a + f;
/*    */     
/* 31 */     dfm1.a(0.0D, (0.1F + afm.a(f1 * 0.1F) * 0.01F), 0.0D);
/*    */     
/* 33 */     float f2 = ☃.k - ☃.l;
/*    */     
/* 35 */     while (f2 >= 3.1415927F) {
/* 36 */       f2 -= 6.2831855F;
/*    */     }
/* 38 */     while (f2 < -3.1415927F) {
/* 39 */       f2 += 6.2831855F;
/*    */     }
/*    */     
/* 42 */     float f3 = ☃.l + f2 * f;
/*    */     
/* 44 */     dfm1.a(g.d.c(-f3));
/* 45 */     dfm1.a(g.f.a(80.0F));
/*    */     
/* 47 */     float f4 = afm.g(f, ☃.c, ☃.b);
/* 48 */     float f5 = afm.h(f4 + 0.25F) * 1.6F - 0.3F;
/* 49 */     float f6 = afm.h(f4 + 0.75F) * 1.6F - 0.3F;
/*    */     
/* 51 */     float f7 = afm.g(f, ☃.j, ☃.i);
/*    */     
/* 53 */     this.c.a(f1, afm.a(f5, 0.0F, 1.0F), afm.a(f6, 0.0F, 1.0F), f7);
/* 54 */     dfq dfq = a.a(eag1, eao::b);
/* 55 */     this.c.b(dfm1, dfq, i, j, 1.0F, 1.0F, 1.0F, 1.0F);
/* 56 */     dfm1.b();
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ecj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */