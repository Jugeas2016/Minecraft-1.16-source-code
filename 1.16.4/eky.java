/*    */ import com.mojang.bridge.game.Language;
/*    */ 
/*    */ public class eky implements Language, Comparable<eky> {
/*    */   private final String a;
/*    */   private final String b;
/*    */   private final String c;
/*    */   private final boolean d;
/*    */   
/*    */   public eky(String ☃, String str1, String str2, boolean bool) {
/* 10 */     this.a = ☃;
/* 11 */     this.b = str1;
/* 12 */     this.c = str2;
/* 13 */     this.d = bool;
/*    */   }
/*    */ 
/*    */   
/*    */   public String getCode() {
/* 18 */     return this.a;
/*    */   }
/*    */ 
/*    */   
/*    */   public String getName() {
/* 23 */     return this.c;
/*    */   }
/*    */ 
/*    */   
/*    */   public String getRegion() {
/* 28 */     return this.b;
/*    */   }
/*    */   
/*    */   public boolean a() {
/* 32 */     return this.d;
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 37 */     return String.format("%s (%s)", new Object[] { this.c, this.b });
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean equals(Object ☃) {
/* 43 */     if (this == ☃) {
/* 44 */       return true;
/*    */     }
/* 46 */     if (!(☃ instanceof eky)) {
/* 47 */       return false;
/*    */     }
/*    */     
/* 50 */     return this.a.equals(((eky)☃).a);
/*    */   }
/*    */ 
/*    */   
/*    */   public int hashCode() {
/* 55 */     return this.a.hashCode();
/*    */   }
/*    */ 
/*    */   
/*    */   public int a(eky ☃) {
/* 60 */     return this.a.compareTo(☃.a);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\eky.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */