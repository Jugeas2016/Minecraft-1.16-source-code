/*    */ import com.mojang.serialization.Codec;
/*    */ import java.util.List;
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
/*    */ public abstract class cor
/*    */ {
/* 19 */   public static final Codec<cor> c = gm.aZ.dispatch(cor::a, cos::a);
/*    */   
/*    */   protected abstract cos<?> a();
/*    */   
/*    */   public abstract void a(bsr parambsr, Random paramRandom, List<fx> paramList1, List<fx> paramList2, Set<fx> paramSet, cra paramcra);
/*    */   
/*    */   protected void a(bse ☃, fx fx1, cey cey1, Set<fx> set, cra cra1) {
/* 26 */     a(☃, fx1, bup.dP.n().a(cey1, Boolean.valueOf(true)), set, cra1);
/*    */   }
/*    */   
/*    */   protected void a(bse ☃, fx fx1, ceh ceh1, Set<fx> set, cra cra1) {
/* 30 */     ☃.a(fx1, ceh1, 19);
/* 31 */     set.add(fx1);
/* 32 */     cra1.c(new cra(fx1, fx1));
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cor.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */