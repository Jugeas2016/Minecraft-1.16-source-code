/*    */ import com.google.common.collect.Maps;
/*    */ import com.google.common.collect.Ordering;
/*    */ import com.google.common.collect.Sets;
/*    */ import java.util.Comparator;
/*    */ import java.util.Iterator;
/*    */ import java.util.Map;
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
/*    */ public class edm
/*    */   implements edh.a
/*    */ {
/*    */   private final djz a;
/* 21 */   private final Map<Long, Map<fx, Integer>> b = Maps.newTreeMap((Comparator)Ordering.natural().reverse());
/*    */   
/*    */   edm(djz ☃) {
/* 24 */     this.a = ☃;
/*    */   }
/*    */   
/*    */   public void a(long ☃, fx fx1) {
/* 28 */     Map<fx, Integer> map = this.b.computeIfAbsent(Long.valueOf(☃), ☃ -> Maps.newHashMap());
/*    */     
/* 30 */     int i = ((Integer)map.getOrDefault(fx1, Integer.valueOf(0))).intValue();
/* 31 */     map.put(fx1, Integer.valueOf(i + 1));
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(dfm ☃, eag eag1, double d1, double d2, double d3) {
/* 36 */     long l = this.a.r.T();
/*    */     
/* 38 */     int i = 200;
/* 39 */     double d = 0.0025D;
/*    */     
/* 41 */     Set<fx> set = Sets.newHashSet();
/* 42 */     Map<fx, Integer> map = Maps.newHashMap();
/* 43 */     dfq dfq = eag1.getBuffer(eao.t());
/*    */     Iterator<Map.Entry<Long, Map<fx, Integer>>> iterator;
/* 45 */     for (iterator = this.b.entrySet().iterator(); iterator.hasNext(); ) {
/* 46 */       Map.Entry<Long, Map<fx, Integer>> entry = iterator.next();
/* 47 */       Long long_ = entry.getKey();
/* 48 */       Map<fx, Integer> map1 = entry.getValue();
/* 49 */       long l1 = l - long_.longValue();
/*    */       
/* 51 */       if (l1 > 200L) {
/* 52 */         iterator.remove();
/*    */         continue;
/*    */       } 
/* 55 */       for (Map.Entry<fx, Integer> entry1 : map1.entrySet()) {
/* 56 */         fx fx = entry1.getKey();
/* 57 */         Integer integer = entry1.getValue();
/*    */         
/* 59 */         if (set.add(fx)) {
/* 60 */           dci dci = (new dci(fx.b)).g(0.002D).h(0.0025D * l1).d(fx.u(), fx.v(), fx.w()).d(-d1, -d2, -d3);
/* 61 */           eae.a(☃, dfq, dci.a, dci.b, dci.c, dci.d, dci.e, dci.f, 1.0F, 1.0F, 1.0F, 1.0F);
/* 62 */           map.put(fx, integer);
/*    */         } 
/*    */       } 
/*    */     } 
/*    */     
/* 67 */     for (iterator = map.entrySet().iterator(); iterator.hasNext(); ) { Map.Entry<fx, Integer> entry = (Map.Entry<fx, Integer>)iterator.next();
/* 68 */       fx fx = entry.getKey();
/* 69 */       Integer integer = entry.getValue();
/*    */       
/* 71 */       edh.a(String.valueOf(integer), fx.u(), fx.v(), fx.w(), -1); }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\edm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */