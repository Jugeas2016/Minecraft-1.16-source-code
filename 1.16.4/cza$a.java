/*    */ import java.util.function.Predicate;
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
/*    */ class a
/*    */   implements dbo
/*    */ {
/*    */   private final dbo[] a;
/*    */   private final Predicate<cyv> b;
/*    */   
/*    */   private a(dbo[] ☃) {
/* 72 */     this.a = ☃;
/* 73 */     this.b = dbq.a((Predicate<cyv>[])☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public final boolean a(cyv ☃) {
/* 78 */     return this.b.test(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(czg ☃) {
/* 83 */     super.a(☃);
/*    */     
/* 85 */     for (int i = 0; i < this.a.length; i++) {
/* 86 */       this.a[i].a(☃.b(".term[" + i + "]"));
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   public dbp b() {
/* 92 */     throw new UnsupportedOperationException();
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cza$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */