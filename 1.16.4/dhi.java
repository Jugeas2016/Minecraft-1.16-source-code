/*    */ 
/*    */ 
/*    */ 
/*    */ public class dhi
/*    */   extends Exception
/*    */ {
/*    */   public final int a;
/*    */   public final String b;
/*    */   public final int c;
/*    */   public final String d;
/*    */   
/*    */   public dhi(int ☃, String str, dgd dgd1) {
/* 13 */     super(str);
/* 14 */     this.a = ☃;
/* 15 */     this.b = str;
/* 16 */     this.c = dgd1.b();
/* 17 */     this.d = dgd1.a();
/*    */   }
/*    */   
/*    */   public dhi(int ☃, String str1, int i, String str2) {
/* 21 */     super(str1);
/* 22 */     this.a = ☃;
/* 23 */     this.b = str1;
/* 24 */     this.c = i;
/* 25 */     this.d = str2;
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 30 */     if (this.c == -1) {
/* 31 */       return "Realms (" + this.a + ") " + this.b;
/*    */     }
/* 33 */     String ☃ = "mco.errorMessage." + this.c;
/* 34 */     String str1 = ekx.a(☃, new Object[0]);
/*    */     
/* 36 */     return (str1.equals(☃) ? this.d : str1) + " - " + this.c;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dhi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */