/*    */ import java.util.Arrays;
/*    */ 
/*    */ 
/*    */ public class dfv
/*    */ {
/*    */   private final char[] a;
/*    */   private int b;
/*    */   private final Runnable c;
/*    */   
/*    */   public dfv(char[] ☃, Runnable runnable) {
/* 11 */     this.c = runnable;
/* 12 */     if (☃.length < 1) {
/* 13 */       throw new IllegalArgumentException("Must have at least one char");
/*    */     }
/* 15 */     this.a = ☃;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean a(char ☃) {
/* 23 */     if (☃ == this.a[this.b++]) {
/* 24 */       if (this.b == this.a.length) {
/*    */         
/* 26 */         a();
/* 27 */         this.c.run();
/* 28 */         return true;
/*    */       } 
/*    */     } else {
/*    */       
/* 32 */       a();
/*    */     } 
/* 34 */     return false;
/*    */   }
/*    */   
/*    */   public void a() {
/* 38 */     this.b = 0;
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 43 */     return "KeyCombo{chars=" + 
/* 44 */       Arrays.toString(this.a) + ", matchIndex=" + this.b + '}';
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dfv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */