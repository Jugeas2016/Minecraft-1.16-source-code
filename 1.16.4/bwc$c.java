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
/*    */ public interface c<S>
/*    */ {
/*    */   <T> T apply(bwc.b<? super S, T> paramb);
/*    */   
/*    */   public static final class a<S>
/*    */     implements c<S>
/*    */   {
/*    */     private final S a;
/*    */     private final S b;
/*    */     
/*    */     public a(S ☃, S s1) {
/* 77 */       this.a = ☃;
/* 78 */       this.b = s1;
/*    */     }
/*    */ 
/*    */     
/*    */     public <T> T apply(bwc.b<? super S, T> ☃) {
/* 83 */       return ☃.a(this.a, this.b);
/*    */     }
/*    */   }
/*    */   
/*    */   public static final class b<S> implements c<S> {
/*    */     private final S a;
/*    */     
/*    */     public b(S ☃) {
/* 91 */       this.a = ☃;
/*    */     }
/*    */ 
/*    */     
/*    */     public <T> T apply(bwc.b<? super S, T> ☃) {
/* 96 */       return ☃.a(this.a);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bwc$c.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */