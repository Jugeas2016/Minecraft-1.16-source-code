/*    */ import java.io.DataOutput;
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
/*    */ public interface mt
/*    */ {
/* 37 */   public static final k d = k.l;
/* 38 */   public static final k e = k.k;
/* 39 */   public static final k f = k.g;
/* 40 */   public static final k g = k.m;
/*    */ 
/*    */ 
/*    */   
/*    */   void a(DataOutput paramDataOutput) throws IOException;
/*    */ 
/*    */ 
/*    */   
/*    */   String toString();
/*    */ 
/*    */ 
/*    */   
/*    */   byte a();
/*    */ 
/*    */ 
/*    */   
/*    */   mv<?> b();
/*    */ 
/*    */   
/*    */   mt c();
/*    */ 
/*    */   
/*    */   default String f_() {
/* 63 */     return toString();
/*    */   }
/*    */   
/*    */   default nr l() {
/* 67 */     return a("", 0);
/*    */   }
/*    */   
/*    */   nr a(String paramString, int paramInt);
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\mt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */