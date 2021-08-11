/*    */ import com.google.common.collect.Lists;
/*    */ import it.unimi.dsi.fastutil.ints.Int2ObjectAVLTreeMap;
/*    */ import it.unimi.dsi.fastutil.ints.Int2ObjectSortedMap;
/*    */ import java.util.Collection;
/*    */ import java.util.List;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bhj
/*    */ {
/* 12 */   private final List<bhg> a = Lists.newArrayList();
/*    */ 
/*    */   
/*    */   private int b;
/*    */ 
/*    */ 
/*    */   
/*    */   public bhj a(int ☃, float f) {
/* 20 */     this.a.add(new bhg(☃, f));
/* 21 */     b();
/* 22 */     return this;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   private void b() {
/* 32 */     Int2ObjectAVLTreeMap int2ObjectAVLTreeMap = new Int2ObjectAVLTreeMap();
/* 33 */     this.a.forEach(bhg1 -> (bhg)☃.put(bhg1.a(), bhg1));
/*    */     
/* 35 */     this.a.clear();
/* 36 */     this.a.addAll((Collection<? extends bhg>)int2ObjectAVLTreeMap.values());
/*    */     
/* 38 */     this.b = 0;
/*    */   }
/*    */   
/*    */   public float a(int ☃) {
/* 42 */     if (this.a.size() <= 0) {
/* 43 */       return 0.0F;
/*    */     }
/*    */     
/* 46 */     bhg bhg1 = this.a.get(this.b);
/* 47 */     bhg bhg2 = this.a.get(this.a.size() - 1);
/* 48 */     boolean bool = (☃ < bhg1.a());
/*    */     
/* 50 */     int i = bool ? 0 : this.b;
/* 51 */     float f = bool ? bhg2.b() : bhg1.b();
/*    */     
/* 53 */     for (int j = i; j < this.a.size(); j++) {
/* 54 */       bhg bhg = this.a.get(j);
/* 55 */       if (bhg.a() > ☃) {
/*    */         break;
/*    */       }
/* 58 */       this.b = j;
/* 59 */       f = bhg.b();
/*    */     } 
/*    */     
/* 62 */     return f;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bhj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */