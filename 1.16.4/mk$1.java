/*    */ import java.io.DataInput;
/*    */ import java.io.IOException;
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
/*    */ final class null
/*    */   implements mv<mk>
/*    */ {
/*    */   public mk a(DataInput ☃, int i, mm mm1) throws IOException {
/* 27 */     mm1.a(192L);
/*    */     
/* 29 */     int j = ☃.readInt();
/* 30 */     mm1.a(64L * j);
/* 31 */     long[] arrayOfLong = new long[j];
/* 32 */     for (int k = 0; k < j; k++) {
/* 33 */       arrayOfLong[k] = ☃.readLong();
/*    */     }
/* 35 */     return new mk(arrayOfLong);
/*    */   }
/*    */ 
/*    */   
/*    */   public String a() {
/* 40 */     return "LONG[]";
/*    */   }
/*    */ 
/*    */   
/*    */   public String b() {
/* 45 */     return "TAG_Long_Array";
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\mk$1.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */