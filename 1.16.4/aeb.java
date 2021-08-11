/*    */ import it.unimi.dsi.fastutil.objects.Object2IntMap;
/*    */ import it.unimi.dsi.fastutil.objects.Object2IntMaps;
/*    */ import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class aeb
/*    */ {
/*  9 */   protected final Object2IntMap<adx<?>> a = Object2IntMaps.synchronize((Object2IntMap)new Object2IntOpenHashMap());
/*    */   
/*    */   public aeb() {
/* 12 */     this.a.defaultReturnValue(0);
/*    */   }
/*    */   
/*    */   public void b(bfw ☃, adx<?> adx1, int i) {
/* 16 */     int j = (int)Math.min(a(adx1) + i, 2147483647L);
/* 17 */     a(☃, adx1, j);
/*    */   }
/*    */   
/*    */   public void a(bfw ☃, adx<?> adx1, int i) {
/* 21 */     this.a.put(adx1, i);
/*    */   }
/*    */   
/*    */   public <T> int a(adz<T> ☃, T t) {
/* 25 */     return ☃.a(t) ? a(☃.b(t)) : 0;
/*    */   }
/*    */   
/*    */   public int a(adx<?> ☃) {
/* 29 */     return this.a.getInt(☃);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\aeb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */