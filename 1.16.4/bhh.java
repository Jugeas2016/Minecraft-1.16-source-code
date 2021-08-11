/*    */ import com.google.common.collect.Maps;
/*    */ import java.util.Comparator;
/*    */ import java.util.List;
/*    */ import java.util.Map;
/*    */ import java.util.stream.Collectors;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bhh
/*    */ {
/* 15 */   public static final bhh a = a("empty")
/* 16 */     .a(0, bhf.b)
/* 17 */     .a();
/* 18 */   public static final bhh b = a("simple")
/* 19 */     .a(5000, bhf.c)
/* 20 */     .a(11000, bhf.e)
/* 21 */     .a();
/* 22 */   public static final bhh c = a("villager_baby")
/* 23 */     .a(10, bhf.b)
/* 24 */     .a(3000, bhf.d)
/* 25 */     .a(6000, bhf.b)
/* 26 */     .a(10000, bhf.d)
/* 27 */     .a(12000, bhf.e)
/* 28 */     .a();
/* 29 */   public static final bhh d = a("villager_default")
/* 30 */     .a(10, bhf.b)
/* 31 */     .a(2000, bhf.c)
/* 32 */     .a(9000, bhf.f)
/* 33 */     .a(11000, bhf.b)
/* 34 */     .a(12000, bhf.e)
/* 35 */     .a();
/* 36 */   private final Map<bhf, bhj> e = Maps.newHashMap();
/*    */   
/*    */   protected static bhi a(String ☃) {
/* 39 */     bhh bhh1 = gm.<bhh>a(gm.am, ☃, new bhh());
/* 40 */     return new bhi(bhh1);
/*    */   }
/*    */   
/*    */   protected void a(bhf ☃) {
/* 44 */     if (!this.e.containsKey(☃)) {
/* 45 */       this.e.put(☃, new bhj());
/*    */     }
/*    */   }
/*    */   
/*    */   protected bhj b(bhf ☃) {
/* 50 */     return this.e.get(☃);
/*    */   }
/*    */   
/*    */   protected List<bhj> c(bhf ☃) {
/* 54 */     return (List<bhj>)this.e.entrySet()
/* 55 */       .stream()
/* 56 */       .filter(entry -> (entry.getKey() != ☃))
/* 57 */       .map(Map.Entry::getValue)
/* 58 */       .collect(Collectors.toList());
/*    */   }
/*    */   
/*    */   public bhf a(int ☃) {
/* 62 */     return this.e.entrySet()
/* 63 */       .stream()
/* 64 */       .max(Comparator.comparingDouble(entry -> ((bhj)entry.getValue()).a(☃)))
/* 65 */       .map(Map.Entry::getKey)
/* 66 */       .orElse(bhf.b);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bhh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */