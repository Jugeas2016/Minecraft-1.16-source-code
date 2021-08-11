/*    */ import it.unimi.dsi.fastutil.objects.Object2IntMap;
/*    */ import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
/*    */ import it.unimi.dsi.fastutil.objects.ObjectIterator;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class cxw
/*    */   extends cxs
/*    */ {
/* 12 */   private final Object2IntMap<String> a = (Object2IntMap<String>)new Object2IntOpenHashMap();
/*    */   
/*    */   public cxw() {
/* 15 */     super("idcounts");
/* 16 */     this.a.defaultReturnValue(-1);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(md ☃) {
/* 21 */     this.a.clear();
/*    */     
/* 23 */     for (String str : ☃.d()) {
/* 24 */       if (☃.c(str, 99)) {
/* 25 */         this.a.put(str, ☃.h(str));
/*    */       }
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public md b(md ☃) {
/* 32 */     for (ObjectIterator<Object2IntMap.Entry<String>> objectIterator = this.a.object2IntEntrySet().iterator(); objectIterator.hasNext(); ) { Object2IntMap.Entry<String> entry = objectIterator.next();
/* 33 */       ☃.b((String)entry.getKey(), entry.getIntValue()); }
/*    */     
/* 35 */     return ☃;
/*    */   }
/*    */   
/*    */   public int a() {
/* 39 */     int ☃ = this.a.getInt("map") + 1;
/* 40 */     this.a.put("map", ☃);
/* 41 */     b();
/* 42 */     return ☃;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cxw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */