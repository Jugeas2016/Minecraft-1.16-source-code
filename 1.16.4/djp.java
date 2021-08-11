/*    */ import java.util.function.BiConsumer;
/*    */ import java.util.function.BiFunction;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class djp
/*    */   extends dkc
/*    */ {
/*    */   private final BiConsumer<dkd, Integer> Y;
/*    */   private final BiFunction<dkd, djp, nr> Z;
/*    */   
/*    */   public djp(String ☃, BiConsumer<dkd, Integer> biConsumer, BiFunction<dkd, djp, nr> biFunction) {
/* 15 */     super(☃);
/* 16 */     this.Y = biConsumer;
/* 17 */     this.Z = biFunction;
/*    */   }
/*    */   
/*    */   public void a(dkd ☃, int i) {
/* 21 */     this.Y.accept(☃, Integer.valueOf(i));
/*    */     
/* 23 */     ☃.b();
/*    */   }
/*    */ 
/*    */   
/*    */   public dlh a(dkd ☃, int i, int j, int k) {
/* 28 */     return new dlw(i, j, k, 20, this, c(☃), dlj1 -> {
/*    */           a(☃, 1);
/*    */           dlj1.a(c(☃));
/*    */         });
/*    */   }
/*    */ 
/*    */   
/*    */   public nr c(dkd ☃) {
/* 36 */     return this.Z.apply(☃, this);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\djp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */