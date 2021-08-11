/*    */ import java.util.Locale;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class elu
/*    */   extends vk
/*    */ {
/*    */   private final String d;
/*    */   
/*    */   protected elu(String[] ☃) {
/* 15 */     super(☃);
/*    */     
/* 17 */     this.d = ☃[2].toLowerCase(Locale.ROOT);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public elu(String ☃) {
/* 25 */     this(c(☃));
/*    */   }
/*    */   
/*    */   public elu(vk ☃, String str) {
/* 29 */     this(☃.toString(), str);
/*    */   }
/*    */   
/*    */   public elu(String ☃, String str1) {
/* 33 */     this(c(☃ + '#' + str1));
/*    */   }
/*    */   
/*    */   protected static String[] c(String ☃) {
/* 37 */     String[] arrayOfString = { null, ☃, "" };
/*    */     
/* 39 */     int i = ☃.indexOf('#');
/* 40 */     String str = ☃;
/* 41 */     if (i >= 0) {
/* 42 */       arrayOfString[2] = ☃.substring(i + 1, ☃.length());
/* 43 */       if (i > 1) {
/* 44 */         str = ☃.substring(0, i);
/*    */       }
/*    */     } 
/*    */     
/* 48 */     System.arraycopy(vk.b(str, ':'), 0, arrayOfString, 0, 2);
/*    */     
/* 50 */     return arrayOfString;
/*    */   }
/*    */   
/*    */   public String d() {
/* 54 */     return this.d;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean equals(Object ☃) {
/* 59 */     if (this == ☃) {
/* 60 */       return true;
/*    */     }
/* 62 */     if (☃ instanceof elu && 
/* 63 */       super.equals(☃)) {
/* 64 */       elu elu1 = (elu)☃;
/*    */       
/* 66 */       return this.d.equals(elu1.d);
/*    */     } 
/*    */     
/* 69 */     return false;
/*    */   }
/*    */ 
/*    */   
/*    */   public int hashCode() {
/* 74 */     return 31 * super.hashCode() + this.d.hashCode();
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 79 */     return super.toString() + '#' + this.d;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\elu.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */