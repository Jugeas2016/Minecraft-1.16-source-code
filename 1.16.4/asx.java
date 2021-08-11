/*    */ import com.google.common.collect.ImmutableMap;
/*    */ import java.util.Map;
/*    */ import java.util.Optional;
/*    */ import java.util.Random;
/*    */ import javax.annotation.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class asx
/*    */   extends arv<aqm>
/*    */ {
/*    */   private final float b;
/*    */   
/*    */   public asx(float ☃) {
/* 21 */     super((Map<ayd<?>, aye>)ImmutableMap.of(ayd.m, aye.b));
/*    */     
/* 23 */     this.b = ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   protected void a(aag ☃, aqm aqm1, long l) {
/* 28 */     Optional<dcn> optional = Optional.ofNullable(b(☃, aqm1));
/* 29 */     if (optional.isPresent()) {
/* 30 */       aqm1.cJ().a(ayd.m, optional.map(☃ -> new ayf(☃, this.b, 0)));
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   protected boolean a(aag ☃, aqm aqm1) {
/* 36 */     return !☃.e(aqm1.cB());
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   private dcn b(aag ☃, aqm aqm1) {
/* 41 */     Random random = aqm1.cY();
/* 42 */     fx fx = aqm1.cB();
/*    */     
/* 44 */     for (int i = 0; i < 10; i++) {
/* 45 */       fx fx1 = fx.b(random.nextInt(20) - 10, random.nextInt(6) - 3, random.nextInt(20) - 10);
/*    */       
/* 47 */       if (a(☃, aqm1, fx1)) {
/* 48 */         return dcn.c(fx1);
/*    */       }
/*    */     } 
/* 51 */     return null;
/*    */   }
/*    */   
/*    */   public static boolean a(aag ☃, aqm aqm1, fx fx1) {
/* 55 */     return (☃.e(fx1) && ☃.a(chn.a.e, fx1).v() <= aqm1.cE());
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\asx.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */