/*    */ import java.io.DataInput;
/*    */ import java.io.IOException;
/*    */ 
/*    */ 
/*    */ public interface mv<T extends mt>
/*    */ {
/*    */   T b(DataInput paramDataInput, int paramInt, mm parammm) throws IOException;
/*    */   
/*    */   default boolean c() {
/* 10 */     return false;
/*    */   }
/*    */   
/*    */   String a();
/*    */   
/*    */   String b();
/*    */   
/*    */   static mv<mf> a(int ☃) {
/* 18 */     return new mv<mf>(☃)
/*    */       {
/*    */         public mf a(DataInput ☃, int i, mm mm1) throws IOException {
/* 21 */           throw new IllegalArgumentException("Invalid tag id: " + this.a);
/*    */         }
/*    */ 
/*    */         
/*    */         public String a() {
/* 26 */           return "INVALID[" + this.a + "]";
/*    */         }
/*    */ 
/*    */         
/*    */         public String b() {
/* 31 */           return "UNKNOWN_" + this.a;
/*    */         }
/*    */       };
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\mv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */