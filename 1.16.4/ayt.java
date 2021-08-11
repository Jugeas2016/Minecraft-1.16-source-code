/*    */ import com.google.common.collect.ImmutableSet;
/*    */ import it.unimi.dsi.fastutil.longs.Long2LongMap;
/*    */ import it.unimi.dsi.fastutil.longs.Long2LongOpenHashMap;
/*    */ import java.util.Optional;
/*    */ import java.util.Set;
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
/*    */ public class ayt
/*    */   extends azb<aqn>
/*    */ {
/* 29 */   private final Long2LongMap a = (Long2LongMap)new Long2LongOpenHashMap();
/*    */   private int b;
/*    */   private long c;
/*    */   
/*    */   public ayt() {
/* 34 */     super(20);
/*    */   }
/*    */ 
/*    */   
/*    */   public Set<ayd<?>> a() {
/* 39 */     return (Set<ayd<?>>)ImmutableSet.of(ayd.w);
/*    */   }
/*    */ 
/*    */   
/*    */   protected void a(aag ☃, aqn aqn1) {
/* 44 */     if (!aqn1.w_()) {
/*    */       return;
/*    */     }
/*    */     
/* 48 */     this.b = 0;
/* 49 */     this.c = ☃.T() + ☃.u_().nextInt(20);
/*    */     
/* 51 */     azo azo = ☃.y();
/*    */     
/* 53 */     Predicate<fx> predicate = ☃ -> {
/*    */         long l = ☃.a();
/*    */         
/*    */         if (this.a.containsKey(l)) {
/*    */           return false;
/*    */         }
/*    */         
/*    */         if (++this.b >= 5) {
/*    */           return false;
/*    */         }
/*    */         
/*    */         this.a.put(l, this.c + 40L);
/*    */         return true;
/*    */       };
/* 67 */     Stream<fx> stream = azo.a(azr.r.c(), predicate, aqn1.cB(), 48, azo.b.c);
/* 68 */     cxd cxd = aqn1.x().a(stream, azr.r.d());
/*    */     
/* 70 */     if (cxd != null && cxd.j()) {
/* 71 */       fx fx = cxd.m();
/* 72 */       Optional<azr> optional = azo.c(fx);
/* 73 */       if (optional.isPresent())
/*    */       {
/* 75 */         aqn1.cJ().a(ayd.w, fx);
/*    */       }
/* 77 */     } else if (this.b < 5) {
/* 78 */       this.a.long2LongEntrySet().removeIf(☃ -> (☃.getLongValue() < this.c));
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ayt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */