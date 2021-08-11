/*    */ import com.google.common.collect.ImmutableList;
/*    */ import it.unimi.dsi.fastutil.ints.Int2IntFunction;
/*    */ import java.util.List;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @FunctionalInterface
/*    */ public interface afa
/*    */ {
/*    */   public static final afa a = ☃ -> true;
/*    */   
/*    */   static afa a(int ☃, ob ob1) {
/* 16 */     return afb1 -> afb1.accept(0, ☃, i);
/*    */   }
/*    */   
/*    */   static afa a(String ☃, ob ob1) {
/* 20 */     if (☃.isEmpty()) {
/* 21 */       return a;
/*    */     }
/* 23 */     return afb1 -> afr.a(☃, ob1, afb1);
/*    */   }
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
/*    */   static afa b(String ☃, ob ob1, Int2IntFunction int2IntFunction) {
/* 41 */     if (☃.isEmpty()) {
/* 42 */       return a;
/*    */     }
/* 44 */     return afb1 -> afr.b(☃, ob1, a(afb1, int2IntFunction));
/*    */   }
/*    */   
/*    */   static afb a(afb ☃, Int2IntFunction int2IntFunction) {
/* 48 */     return (i, ob1, j) -> ☃.accept(i, ob1, ((Integer)int2IntFunction.apply(Integer.valueOf(j))).intValue());
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   static afa a(afa ☃, afa afa1) {
/* 60 */     return b(☃, afa1);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   static afa a(List<afa> ☃) {
/* 68 */     int i = ☃.size();
/* 69 */     switch (i) {
/*    */       case 0:
/* 71 */         return a;
/*    */       case 1:
/* 73 */         return ☃.get(0);
/*    */       case 2:
/* 75 */         return b(☃.get(0), ☃.get(1));
/*    */     } 
/* 77 */     return b((List<afa>)ImmutableList.copyOf(☃));
/*    */   }
/*    */ 
/*    */   
/*    */   static afa b(afa ☃, afa afa1) {
/* 82 */     return afb1 -> (☃.accept(afb1) && afa1.accept(afb1));
/*    */   }
/*    */   
/*    */   static afa b(List<afa> ☃) {
/* 86 */     return afb1 -> {
/*    */         for (afa afa1 : ☃) {
/*    */           if (!afa1.accept(afb1))
/*    */             return false; 
/*    */         } 
/*    */         return true;
/*    */       };
/*    */   }
/*    */   
/*    */   boolean accept(afb paramafb);
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\afa.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */