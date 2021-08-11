/*    */ import java.io.IOException;
/*    */ import javax.annotation.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class cfz
/*    */   implements cgj, AutoCloseable
/*    */ {
/*    */   @Nullable
/*    */   public cgh a(int ☃, int i, boolean bool) {
/* 16 */     return (cgh)a(☃, i, cga.m, bool);
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public cgh a(int ☃, int i) {
/* 21 */     return a(☃, i, false);
/*    */   }
/*    */ 
/*    */   
/*    */   @Nullable
/*    */   public brc c(int ☃, int i) {
/* 27 */     return a(☃, i, cga.a, false);
/*    */   }
/*    */   
/*    */   public boolean b(int ☃, int i) {
/* 31 */     return (a(☃, i, cga.m, false) != null);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   @Nullable
/*    */   public abstract cfw a(int paramInt1, int paramInt2, cga paramcga, boolean paramBoolean);
/*    */ 
/*    */ 
/*    */   
/*    */   public abstract String e();
/*    */ 
/*    */ 
/*    */   
/*    */   public void close() throws IOException {}
/*    */ 
/*    */ 
/*    */   
/*    */   public abstract cuo l();
/*    */ 
/*    */   
/*    */   public void a(boolean ☃, boolean bool1) {}
/*    */ 
/*    */   
/*    */   public void a(brd ☃, boolean bool) {}
/*    */ 
/*    */   
/*    */   public boolean a(aqa ☃) {
/* 59 */     return true;
/*    */   }
/*    */   
/*    */   public boolean a(brd ☃) {
/* 63 */     return true;
/*    */   }
/*    */   
/*    */   public boolean a(fx ☃) {
/* 67 */     return true;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cfz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */