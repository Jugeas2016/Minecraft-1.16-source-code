/*    */ import java.util.Set;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public interface aon
/*    */   extends aol
/*    */ {
/*    */   int Z_();
/*    */   
/*    */   boolean c();
/*    */   
/*    */   bmb a(int paramInt);
/*    */   
/*    */   bmb a(int paramInt1, int paramInt2);
/*    */   
/*    */   bmb b(int paramInt);
/*    */   
/*    */   void a(int paramInt, bmb parambmb);
/*    */   
/*    */   default int V_() {
/* 25 */     return 64;
/*    */   }
/*    */ 
/*    */   
/*    */   void X_();
/*    */ 
/*    */   
/*    */   boolean a(bfw parambfw);
/*    */   
/*    */   default void c_(bfw ☃) {}
/*    */   
/*    */   default void b_(bfw ☃) {}
/*    */   
/*    */   default boolean b(int ☃, bmb bmb1) {
/* 39 */     return true;
/*    */   }
/*    */   
/*    */   default int a(blx ☃) {
/* 43 */     int i = 0;
/* 44 */     for (int j = 0; j < Z_(); j++) {
/* 45 */       bmb bmb = a(j);
/* 46 */       if (bmb.b().equals(☃)) {
/* 47 */         i += bmb.E();
/*    */       }
/*    */     } 
/* 50 */     return i;
/*    */   }
/*    */   
/*    */   default boolean a(Set<blx> ☃) {
/* 54 */     for (int i = 0; i < Z_(); i++) {
/* 55 */       bmb bmb = a(i);
/* 56 */       if (☃.contains(bmb.b()) && bmb.E() > 0) {
/* 57 */         return true;
/*    */       }
/*    */     } 
/* 60 */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\aon.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */