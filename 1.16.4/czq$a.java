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
/*    */ public abstract class a<T extends czq.a<T>>
/*    */   implements dbh<T>
/*    */ {
/* 40 */   private final List<dbo> a = Lists.newArrayList();
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public T a(dbo.a ☃) {
/* 46 */     this.a.add(☃.build());
/* 47 */     return d();
/*    */   }
/*    */ 
/*    */   
/*    */   public final T e() {
/* 52 */     return d();
/*    */   }
/*    */   
/*    */   protected dbo[] f() {
/* 56 */     return this.a.<dbo>toArray(new dbo[0]);
/*    */   }
/*    */   
/*    */   public czh.a a(a<?> ☃) {
/* 60 */     return new czh.a((a<?>[])new a[] { this, ☃ });
/*    */   }
/*    */   
/*    */   protected abstract T d();
/*    */   
/*    */   public abstract czq b();
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\czq$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */