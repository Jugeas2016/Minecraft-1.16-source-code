/*    */ import com.google.common.collect.ImmutableMap;
/*    */ import it.unimi.dsi.fastutil.longs.Long2LongMap;
/*    */ import it.unimi.dsi.fastutil.longs.Long2LongOpenHashMap;
/*    */ import java.util.Map;
/*    */ import java.util.Optional;
/*    */ import java.util.function.Predicate;
/*    */ import java.util.stream.Stream;
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
/*    */ public class atk
/*    */   extends arv<aqm>
/*    */ {
/*    */   private final float b;
/* 31 */   private final Long2LongMap c = (Long2LongMap)new Long2LongOpenHashMap();
/*    */   private int d;
/*    */   private long e;
/*    */   
/*    */   public atk(float ☃) {
/* 36 */     super((Map<ayd<?>, aye>)ImmutableMap.of(ayd.m, aye.b, ayd.b, aye.b));
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 41 */     this.b = ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   protected boolean a(aag ☃, aqm aqm1) {
/* 46 */     if (☃.T() - this.e < 20L) {
/* 47 */       return false;
/*    */     }
/*    */     
/* 50 */     aqu aqu = (aqu)aqm1;
/* 51 */     azo azo = ☃.y();
/*    */     
/* 53 */     Optional<fx> optional = azo.d(azr.r.c(), aqm1.cB(), 48, azo.b.c);
/* 54 */     return (optional.isPresent() && ((fx)optional.get()).j(aqu.cB()) > 4.0D);
/*    */   }
/*    */ 
/*    */   
/*    */   protected void a(aag ☃, aqm aqm1, long l) {
/* 59 */     this.d = 0;
/* 60 */     this.e = ☃.T() + ☃.u_().nextInt(20);
/*    */     
/* 62 */     aqu aqu = (aqu)aqm1;
/* 63 */     azo azo = ☃.y();
/*    */     
/* 65 */     Predicate<fx> predicate = ☃ -> {
/*    */         long l = ☃.a();
/*    */         
/*    */         if (this.c.containsKey(l)) {
/*    */           return false;
/*    */         }
/*    */         
/*    */         if (++this.d >= 5) {
/*    */           return false;
/*    */         }
/*    */         
/*    */         this.c.put(l, this.e + 40L);
/*    */         return true;
/*    */       };
/* 79 */     Stream<fx> stream = azo.a(azr.r.c(), predicate, aqm1.cB(), 48, azo.b.c);
/* 80 */     cxd cxd = aqu.x().a(stream, azr.r.d());
/*    */     
/* 82 */     if (cxd != null && cxd.j()) {
/* 83 */       fx fx = cxd.m();
/* 84 */       Optional<azr> optional = azo.c(fx);
/* 85 */       if (optional.isPresent()) {
/*    */         
/* 87 */         aqm1.cJ().a(ayd.m, new ayf(fx, this.b, 1));
/* 88 */         rz.c(☃, fx);
/*    */       } 
/* 90 */     } else if (this.d < 5) {
/* 91 */       this.c.long2LongEntrySet().removeIf(☃ -> (☃.getLongValue() < this.e));
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\atk.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */