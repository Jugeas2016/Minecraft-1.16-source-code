/*    */ import java.util.List;
/*    */ import java.util.function.Function;
/*    */ import javax.annotation.Nullable;
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
/*    */ class a<T>
/*    */   implements ael.e<T>
/*    */ {
/*    */   @Nullable
/*    */   private ael<T> b;
/*    */   protected final vk a;
/*    */   
/*    */   private a(vk ☃) {
/* 62 */     this.a = ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   public vk a() {
/* 67 */     return this.a;
/*    */   }
/*    */   
/*    */   private ael<T> c() {
/* 71 */     if (this.b == null) {
/* 72 */       throw new IllegalStateException("Tag " + this.a + " used before it was bound");
/*    */     }
/* 74 */     return this.b;
/*    */   }
/*    */   
/*    */   void a(Function<vk, ael<T>> ☃) {
/* 78 */     this.b = ☃.apply(this.a);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(T ☃) {
/* 83 */     return c().a(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public List<T> b() {
/* 88 */     return c().b();
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\aej$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */