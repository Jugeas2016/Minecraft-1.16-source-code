/*    */ import javax.annotation.concurrent.Immutable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Immutable
/*    */ public class aow
/*    */ {
/* 11 */   public static final aow a = new aow("");
/*    */   
/*    */   private final String b;
/*    */ 
/*    */   
/*    */   public aow(String ☃) {
/* 17 */     this.b = ☃;
/*    */   }
/*    */   
/*    */   public boolean a(bmb ☃) {
/* 21 */     return (this.b.isEmpty() || (!☃.a() && ☃.t() && this.b.equals(☃.r().getString())));
/*    */   }
/*    */   
/*    */   public void a(md ☃) {
/* 25 */     if (!this.b.isEmpty()) {
/* 26 */       ☃.a("Lock", this.b);
/*    */     }
/*    */   }
/*    */   
/*    */   public static aow b(md ☃) {
/* 31 */     if (☃.c("Lock", 8)) {
/* 32 */       return new aow(☃.l("Lock"));
/*    */     }
/* 34 */     return a;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\aow.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */