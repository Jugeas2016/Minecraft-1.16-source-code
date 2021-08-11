/*    */ public interface dec
/*    */   extends dea
/*    */ {
/*    */   int d();
/*    */   
/*    */   int e();
/*    */   
/*    */   void a(int paramInt1, int paramInt2);
/*    */   
/*    */   boolean f();
/*    */   
/*    */   float g();
/*    */   
/*    */   default float h() {
/* 15 */     return a();
/*    */   }
/*    */   
/*    */   default float i() {
/* 19 */     return h() + d() / g();
/*    */   }
/*    */   
/*    */   default float j() {
/* 23 */     return l();
/*    */   }
/*    */   
/*    */   default float k() {
/* 27 */     return j() + e() / g();
/*    */   }
/*    */ 
/*    */   
/*    */   default float l() {
/* 32 */     return 3.0F;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dec.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */