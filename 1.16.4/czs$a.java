/*    */ import com.google.common.collect.Lists;
/*    */ import java.util.List;
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
/*    */ public abstract class a<T extends czs.a<T>>
/*    */   extends czq.a<T>
/*    */   implements dag<T>
/*    */ {
/* 76 */   protected int a = 1;
/* 77 */   protected int b = 0;
/*    */   
/* 79 */   private final List<daj> c = Lists.newArrayList();
/*    */ 
/*    */   
/*    */   public T a(daj.a ☃) {
/* 83 */     this.c.add(☃.b());
/* 84 */     return d();
/*    */   }
/*    */   
/*    */   protected daj[] a() {
/* 88 */     return this.c.<daj>toArray(new daj[0]);
/*    */   }
/*    */   
/*    */   public T a(int ☃) {
/* 92 */     this.a = ☃;
/* 93 */     return d();
/*    */   }
/*    */   
/*    */   public T b(int ☃) {
/* 97 */     this.b = ☃;
/* 98 */     return d();
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\czs$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */