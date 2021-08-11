/*    */ import it.unimi.dsi.fastutil.objects.Object2IntMap;
/*    */ import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
/*    */ import it.unimi.dsi.fastutil.objects.ObjectIterator;
/*    */ import java.io.IOException;
/*    */ import java.util.Map;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ot
/*    */   implements oj<om>
/*    */ {
/*    */   private Object2IntMap<adx<?>> a;
/*    */   
/*    */   public ot() {}
/*    */   
/*    */   public ot(Object2IntMap<adx<?>> ☃) {
/* 21 */     this.a = ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(om ☃) {
/* 26 */     ☃.a(this);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void a(nf ☃) throws IOException {
/* 33 */     int i = ☃.i();
/* 34 */     this.a = (Object2IntMap<adx<?>>)new Object2IntOpenHashMap(i);
/*    */     
/* 36 */     for (int j = 0; j < i; j++) {
/* 37 */       a(gm.ag.a(☃.i()), ☃);
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   private <T> void a(adz<T> ☃, nf nf1) {
/* 43 */     int i = nf1.i();
/* 44 */     int j = nf1.i();
/* 45 */     this.a.put(☃.b(☃.a().a(i)), j);
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(nf ☃) throws IOException {
/* 50 */     ☃.d(this.a.size());
/* 51 */     for (ObjectIterator<Object2IntMap.Entry<adx<?>>> objectIterator = this.a.object2IntEntrySet().iterator(); objectIterator.hasNext(); ) { Object2IntMap.Entry<adx<?>> entry = objectIterator.next();
/* 52 */       adx<?> adx = (adx)entry.getKey();
/* 53 */       ☃.d(gm.ag.a(adx.a()));
/* 54 */       ☃.d(a(adx));
/* 55 */       ☃.d(entry.getIntValue()); }
/*    */   
/*    */   }
/*    */   
/*    */   private <T> int a(adx<T> ☃) {
/* 60 */     return ☃.a().a().a(☃.b());
/*    */   }
/*    */   
/*    */   public Map<adx<?>, Integer> b() {
/* 64 */     return (Map)this.a;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ot.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */