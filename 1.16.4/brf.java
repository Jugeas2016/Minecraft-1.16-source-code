/*    */ import java.util.function.Predicate;
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
/*    */ public class brf
/*    */ {
/*    */   private final dcn a;
/*    */   private final dcn b;
/*    */   private final a c;
/*    */   private final b d;
/*    */   private final dcs e;
/*    */   
/*    */   public brf(dcn ☃, dcn dcn1, a a1, b b1, aqa aqa1) {
/* 22 */     this.a = ☃;
/* 23 */     this.b = dcn1;
/* 24 */     this.c = a1;
/* 25 */     this.d = b1;
/* 26 */     this.e = dcs.a(aqa1);
/*    */   }
/*    */   
/*    */   public dcn a() {
/* 30 */     return this.b;
/*    */   }
/*    */   
/*    */   public dcn b() {
/* 34 */     return this.a;
/*    */   }
/*    */   
/*    */   public ddh a(ceh ☃, brc brc1, fx fx1) {
/* 38 */     return this.c.get(☃, brc1, fx1, this.e);
/*    */   }
/*    */   
/*    */   public ddh a(cux ☃, brc brc1, fx fx1) {
/* 42 */     return this.d.a(☃) ? ☃.d(brc1, fx1) : dde.a();
/*    */   }
/*    */   
/*    */   public enum a implements c {
/* 46 */     a((String)ceg.a::b),
/* 47 */     b((String)ceg.a::a),
/* 48 */     c((String)ceg.a::c);
/*    */     
/*    */     private final brf.c d;
/*    */ 
/*    */     
/*    */     a(brf.c ☃) {
/* 54 */       this.d = ☃;
/*    */     }
/*    */ 
/*    */     
/*    */     public ddh get(ceh ☃, brc brc1, fx fx1, dcs dcs1) {
/* 59 */       return this.d.get(☃, brc1, fx1, dcs1);
/*    */     }
/*    */   }
/*    */   
/*    */   public static interface c {
/*    */     ddh get(ceh param1ceh, brc param1brc, fx param1fx, dcs param1dcs);
/*    */   }
/*    */   
/*    */   public enum b {
/* 68 */     a((String)(☃ -> false)),
/* 69 */     b((String)cux::b), c((String)cux::b); static {
/* 70 */       c = new b("ANY", 2, ☃ -> !☃.c());
/*    */     }
/*    */     
/*    */     private final Predicate<cux> d;
/*    */     
/*    */     b(Predicate<cux> ☃) {
/* 76 */       this.d = ☃;
/*    */     }
/*    */     
/*    */     public boolean a(cux ☃) {
/* 80 */       return this.d.test(☃);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\brf.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */