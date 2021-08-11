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
/*    */ public abstract class a<T extends dai.a<T>>
/*    */   implements daj.a, dbh<T>
/*    */ {
/* 46 */   private final List<dbo> a = Lists.newArrayList();
/*    */ 
/*    */   
/*    */   public T a(dbo.a ☃) {
/* 50 */     this.a.add(☃.build());
/* 51 */     return d();
/*    */   }
/*    */ 
/*    */   
/*    */   public final T f() {
/* 56 */     return d();
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   protected dbo[] g() {
/* 62 */     return this.a.<dbo>toArray(new dbo[0]);
/*    */   }
/*    */   
/*    */   protected abstract T d();
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dai$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */