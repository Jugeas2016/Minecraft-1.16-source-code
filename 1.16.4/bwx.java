/*    */ import java.util.Random;
/*    */ import java.util.function.Supplier;
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
/*    */ public class bwx
/*    */   extends buu
/*    */   implements buq
/*    */ {
/* 18 */   protected static final ddh a = buo.a(4.0D, 0.0D, 4.0D, 12.0D, 9.0D, 12.0D);
/*    */   
/*    */   private final Supplier<civ<cjq, ?>> b;
/*    */ 
/*    */   
/*    */   protected bwx(ceg.c ☃, Supplier<civ<cjq, ?>> supplier) {
/* 24 */     super(☃);
/* 25 */     this.b = supplier;
/*    */   }
/*    */ 
/*    */   
/*    */   public ddh b(ceh ☃, brc brc1, fx fx1, dcs dcs1) {
/* 30 */     return a;
/*    */   }
/*    */ 
/*    */   
/*    */   protected boolean c(ceh ☃, brc brc1, fx fx1) {
/* 35 */     return (☃.a(aed.ao) || ☃.a(bup.dT) || ☃.a(bup.cN) || super.c(☃, brc1, fx1));
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(brc ☃, fx fx1, ceh ceh1, boolean bool) {
/* 40 */     buo buo1 = ((cjq)((civ)this.b.get()).f).f.b();
/* 41 */     buo buo2 = ☃.d_(fx1.c()).b();
/*    */     
/* 43 */     return (buo2 == buo1);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(brx ☃, Random random, fx fx1, ceh ceh1) {
/* 48 */     return (random.nextFloat() < 0.4D);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(aag ☃, Random random, fx fx1, ceh ceh1) {
/* 53 */     ((civ)this.b.get()).a(☃, ☃.i().g(), random, fx1);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bwx.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */