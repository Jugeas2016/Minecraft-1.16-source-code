/*    */ import com.google.common.collect.ImmutableSet;
/*    */ import com.google.common.collect.Lists;
/*    */ import java.util.List;
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
/*    */ public class ayz
/*    */   extends azb<bfj>
/*    */ {
/*    */   public ayz() {
/* 21 */     super(40);
/*    */   }
/*    */ 
/*    */   
/*    */   protected void a(aag ☃, bfj bfj1) {
/* 26 */     vj<brx> vj = ☃.Y();
/* 27 */     fx fx = bfj1.cB();
/* 28 */     List<gf> list = Lists.newArrayList();
/*    */     
/* 30 */     int i = 4;
/* 31 */     for (int j = -4; j <= 4; j++) {
/* 32 */       for (int k = -2; k <= 2; k++) {
/* 33 */         for (int m = -4; m <= 4; m++) {
/* 34 */           fx fx1 = fx.b(j, k, m);
/* 35 */           if (bfj1.eX().b().d().contains(☃.d_(fx1).b())) {
/* 36 */             list.add(gf.a(vj, fx1));
/*    */           }
/*    */         } 
/*    */       } 
/*    */     } 
/*    */     
/* 42 */     arf<?> arf = bfj1.cJ();
/* 43 */     if (!list.isEmpty()) {
/* 44 */       arf.a(ayd.f, list);
/*    */     } else {
/* 46 */       arf.b(ayd.f);
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public Set<ayd<?>> a() {
/* 52 */     return (Set<ayd<?>>)ImmutableSet.of(ayd.f);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ayz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */