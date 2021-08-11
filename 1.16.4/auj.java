/*    */ import com.google.common.collect.ImmutableMap;
/*    */ import java.util.Map;
/*    */ import java.util.Optional;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class auj
/*    */   extends arv<aqu>
/*    */ {
/*    */   private final float b;
/*    */   private final int c;
/*    */   private final int d;
/*    */   
/*    */   public auj(float ☃) {
/* 31 */     this(☃, 10, 7);
/*    */   }
/*    */   
/*    */   public auj(float ☃, int i, int j) {
/* 35 */     super((Map<ayd<?>, aye>)ImmutableMap.of(ayd.m, aye.b));
/*    */ 
/*    */     
/* 38 */     this.b = ☃;
/* 39 */     this.c = i;
/* 40 */     this.d = j;
/*    */   }
/*    */ 
/*    */   
/*    */   protected void a(aag ☃, aqu aqu1, long l) {
/* 45 */     fx fx = aqu1.cB();
/* 46 */     if (☃.a_(fx)) {
/* 47 */       a(aqu1);
/*    */     } else {
/* 49 */       gp gp1 = gp.a(fx);
/* 50 */       gp gp2 = arw.a(☃, gp1, 2);
/*    */       
/* 52 */       if (gp2 != gp1) {
/* 53 */         a(aqu1, gp2);
/*    */       } else {
/* 55 */         a(aqu1);
/*    */       } 
/*    */     } 
/*    */   }
/*    */   
/*    */   private void a(aqu ☃, gp gp1) {
/* 61 */     Optional<dcn> optional = Optional.ofNullable(azj.b(☃, this.c, this.d, dcn.c(gp1.q())));
/* 62 */     ☃.cJ().a(ayd.m, optional.map(☃ -> new ayf(☃, this.b, 0)));
/*    */   }
/*    */   
/*    */   private void a(aqu ☃) {
/* 66 */     Optional<dcn> optional = Optional.ofNullable(azj.b(☃, this.c, this.d));
/* 67 */     ☃.cJ().a(ayd.m, optional.map(☃ -> new ayf(☃, this.b, 0)));
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\auj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */