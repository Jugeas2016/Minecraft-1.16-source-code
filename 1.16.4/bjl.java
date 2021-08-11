/*    */ import java.util.Collections;
/*    */ import javax.annotation.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public interface bjl
/*    */ {
/*    */   void a(@Nullable boq<?> paramboq);
/*    */   
/*    */   @Nullable
/*    */   boq<?> ak_();
/*    */   
/*    */   default void b(bfw ☃) {
/* 19 */     boq<?> boq = ak_();
/* 20 */     if (boq != null && !boq.af_()) {
/* 21 */       ☃.a(Collections.singleton(boq));
/* 22 */       a(null);
/*    */     } 
/*    */   }
/*    */   
/*    */   default boolean a(brx ☃, aah aah1, boq<?> boq1) {
/* 27 */     if (boq1.af_() || !☃.V().b(brt.u) || aah1.B().b(boq1)) {
/* 28 */       a(boq1);
/* 29 */       return true;
/*    */     } 
/*    */     
/* 32 */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bjl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */