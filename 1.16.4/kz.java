/*    */ import javax.annotation.Nullable;
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
/*    */ public class kz
/*    */   extends ky
/*    */ {
/*    */   private final fx a;
/*    */   private final fx b;
/*    */   private final long c;
/*    */   
/*    */   public String getMessage() {
/* 21 */     String ☃ = "" + this.a.u() + "," + this.a.v() + "," + this.a.w() + " (relative: " + this.b.u() + "," + this.b.v() + "," + this.b.w() + ")";
/* 22 */     return super.getMessage() + " at " + ☃ + " (t=" + this.c + ")";
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public String a() {
/* 27 */     return super.getMessage() + " here";
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @Nullable
/*    */   public fx c() {
/* 37 */     return this.a;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\kz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */