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
/*    */ public class bze
/*    */   extends buo
/*    */ {
/* 15 */   public static final cey a = bzf.a;
/*    */   
/*    */   public bze(ceg.c ☃) {
/* 18 */     super(☃);
/* 19 */     j(n().a(a, Boolean.valueOf(false)));
/*    */   }
/*    */ 
/*    */   
/*    */   @Nullable
/*    */   public ceh a(bny ☃) {
/* 25 */     return n().a(a, Boolean.valueOf(☃.p().r(☃.a())));
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(ceh ☃, brx brx1, fx fx1, buo buo1, fx fx2, boolean bool) {
/* 30 */     if (brx1.v) {
/*    */       return;
/*    */     }
/*    */     
/* 34 */     boolean bool1 = ((Boolean)☃.c(a)).booleanValue();
/* 35 */     if (bool1 != brx1.r(fx1)) {
/* 36 */       if (bool1) {
/* 37 */         brx1.J().a(fx1, this, 4);
/*    */       } else {
/* 39 */         brx1.a(fx1, ☃.a(a), 2);
/*    */       } 
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(ceh ☃, aag aag1, fx fx1, Random random) {
/* 46 */     if (((Boolean)☃.c(a)).booleanValue() && !aag1.r(fx1)) {
/* 47 */       aag1.a(fx1, ☃.a(a), 2);
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   protected void a(cei.a<buo, ceh> ☃) {
/* 53 */     ☃.a((cfj<?>[])new cfj[] { a });
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bze.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */