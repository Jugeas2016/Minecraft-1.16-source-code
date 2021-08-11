/*    */ import java.util.OptionalInt;
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
/*    */ public interface bqu
/*    */ {
/*    */   void f(@Nullable bfw parambfw);
/*    */   
/*    */   @Nullable
/*    */   bfw eM();
/*    */   
/*    */   bqw eO();
/*    */   
/*    */   void a(@Nullable bqw parambqw);
/*    */   
/*    */   void a(bqv parambqv);
/*    */   
/*    */   void k(bmb parambmb);
/*    */   
/*    */   brx eV();
/*    */   
/*    */   int eL();
/*    */   
/*    */   void t(int paramInt);
/*    */   
/*    */   boolean eP();
/*    */   
/*    */   adp eQ();
/*    */   
/*    */   default boolean fa() {
/* 39 */     return false;
/*    */   }
/*    */   
/*    */   default void a(bfw ☃, nr nr1, int i) {
/* 43 */     OptionalInt optionalInt = ☃.a(new apb((☃, bfv1, bfw1) -> new bjg(☃, bfv1, this), nr1));
/*    */     
/* 45 */     if (optionalInt.isPresent()) {
/* 46 */       bqw bqw = eO();
/* 47 */       if (!bqw.isEmpty())
/* 48 */         ☃.a(optionalInt.getAsInt(), bqw, i, eL(), eP(), fa()); 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bqu.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */