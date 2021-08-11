/*    */ import java.util.Random;
/*    */ import java.util.Set;
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
/*    */ 
/*    */ public abstract class azb<E extends aqm>
/*    */ {
/* 18 */   private static final Random a = new Random();
/*    */ 
/*    */ 
/*    */   
/* 22 */   private static final azg b = (new azg()).a(16.0D).b().d();
/* 23 */   private static final azg c = (new azg()).a(16.0D).b().d().e();
/*    */   
/*    */   private final int d;
/*    */   private long e;
/*    */   
/*    */   public azb(int ☃) {
/* 29 */     this.d = ☃;
/* 30 */     this.e = a.nextInt(☃);
/*    */   }
/*    */   
/*    */   public azb() {
/* 34 */     this(20);
/*    */   }
/*    */   
/*    */   public final void b(aag ☃, E e) {
/* 38 */     if (--this.e <= 0L) {
/* 39 */       this.e = this.d;
/* 40 */       a(☃, e);
/*    */     } 
/*    */   }
/*    */   
/*    */   protected abstract void a(aag paramaag, E paramE);
/*    */   
/*    */   public abstract Set<ayd<?>> a();
/*    */   
/*    */   protected static boolean a(aqm ☃, aqm aqm1) {
/* 49 */     if (☃.cJ().b(ayd.o, aqm1))
/*    */     {
/* 51 */       return c.a(☃, aqm1);
/*    */     }
/* 53 */     return b.a(☃, aqm1);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\azb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */