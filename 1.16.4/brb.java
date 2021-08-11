/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class brb
/*    */ {
/*    */   private final fx a;
/*    */   private final buo b;
/*    */   private final int c;
/*    */   private final int d;
/*    */   
/*    */   public brb(fx ☃, buo buo1, int i, int j) {
/* 13 */     this.a = ☃;
/* 14 */     this.b = buo1;
/* 15 */     this.c = i;
/* 16 */     this.d = j;
/*    */   }
/*    */   
/*    */   public fx a() {
/* 20 */     return this.a;
/*    */   }
/*    */   
/*    */   public buo b() {
/* 24 */     return this.b;
/*    */   }
/*    */   
/*    */   public int c() {
/* 28 */     return this.c;
/*    */   }
/*    */   
/*    */   public int d() {
/* 32 */     return this.d;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean equals(Object ☃) {
/* 37 */     if (☃ instanceof brb) {
/* 38 */       brb brb1 = (brb)☃;
/* 39 */       return (this.a.equals(brb1.a) && this.c == brb1.c && this.d == brb1.d && this.b == brb1.b);
/*    */     } 
/* 41 */     return false;
/*    */   }
/*    */ 
/*    */   
/*    */   public int hashCode() {
/* 46 */     int ☃ = this.a.hashCode();
/* 47 */     ☃ = 31 * ☃ + this.b.hashCode();
/* 48 */     ☃ = 31 * ☃ + this.c;
/* 49 */     ☃ = 31 * ☃ + this.d;
/* 50 */     return ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 55 */     return "TE(" + this.a + ")," + this.c + "," + this.d + "," + this.b;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\brb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */