/*    */ import java.io.File;
/*    */ import java.util.List;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public interface anv
/*    */ {
/*    */   List<any> a(String paramString);
/*    */   
/*    */   boolean a(File paramFile);
/*    */   
/*    */   long a();
/*    */   
/*    */   int b();
/*    */   
/*    */   long c();
/*    */   
/*    */   int d();
/*    */   
/*    */   default long g() {
/* 22 */     return c() - a();
/*    */   }
/*    */   
/*    */   default int f() {
/* 26 */     return d() - b();
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   static String b(String ☃) {
/* 32 */     return ☃.replace('\036', '.');
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\anv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */