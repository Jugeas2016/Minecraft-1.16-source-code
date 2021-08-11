/*    */ import com.google.common.collect.ImmutableList;
/*    */ import com.google.common.collect.Lists;
/*    */ import it.unimi.dsi.fastutil.ints.Int2IntFunction;
/*    */ import java.util.List;
/*    */ import java.util.Optional;
/*    */ import java.util.function.UnaryOperator;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class oc
/*    */ {
/*    */   private final String a;
/*    */   private final List<ob> b;
/*    */   private final Int2IntFunction c;
/*    */   
/*    */   private oc(String ☃, List<ob> list, Int2IntFunction int2IntFunction) {
/* 20 */     this.a = ☃;
/* 21 */     this.b = (List<ob>)ImmutableList.copyOf(list);
/* 22 */     this.c = int2IntFunction;
/*    */   }
/*    */   
/*    */   public String a() {
/* 26 */     return this.a;
/*    */   }
/*    */   
/*    */   public List<afa> a(int ☃, int i, boolean bool) {
/* 30 */     if (i == 0) {
/* 31 */       return (List<afa>)ImmutableList.of();
/*    */     }
/*    */     
/* 34 */     List<afa> list = Lists.newArrayList();
/*    */     
/* 36 */     ob ob = this.b.get(☃);
/* 37 */     int j = ☃;
/* 38 */     for (int k = 1; k < i; k++) {
/* 39 */       int m = ☃ + k;
/* 40 */       ob ob1 = this.b.get(m);
/* 41 */       if (!ob1.equals(ob)) {
/* 42 */         String str = this.a.substring(j, m);
/* 43 */         list.add(bool ? afa.b(str, ob, this.c) : afa.a(str, ob));
/* 44 */         ob = ob1;
/* 45 */         j = m;
/*    */       } 
/*    */     } 
/*    */     
/* 49 */     if (j < ☃ + i) {
/* 50 */       String str = this.a.substring(j, ☃ + i);
/* 51 */       list.add(bool ? afa.b(str, ob, this.c) : afa.a(str, ob));
/*    */     } 
/*    */     
/* 54 */     return bool ? Lists.reverse(list) : list;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static oc a(nu ☃, Int2IntFunction int2IntFunction, UnaryOperator<String> unaryOperator) {
/* 62 */     StringBuilder stringBuilder = new StringBuilder();
/* 63 */     List<ob> list = Lists.newArrayList();
/*    */     
/* 65 */     ☃.a((ob1, str) -> { afr.c(str, ob1, ()); return Optional.empty(); }ob.a);
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
/* 77 */     return new oc(unaryOperator.apply(stringBuilder.toString()), list, int2IntFunction);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\oc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */