/*    */ import java.util.Random;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class a
/*    */   extends crx
/*    */ {
/*    */   private final vk d;
/*    */   private final bzm e;
/*    */   
/*    */   public a(csw ☃, vk vk1, fx fx1, bzm bzm1) {
/* 51 */     super(clb.ac, 0);
/* 52 */     this.d = vk1;
/* 53 */     this.c = fx1;
/* 54 */     this.e = bzm1;
/* 55 */     a(☃);
/*    */   }
/*    */   
/*    */   public a(csw ☃, md md1) {
/* 59 */     super(clb.ac, md1);
/* 60 */     this.d = new vk(md1.l("Template"));
/* 61 */     this.e = bzm.valueOf(md1.l("Rot"));
/* 62 */     a(☃);
/*    */   }
/*    */   
/*    */   private void a(csw ☃) {
/* 66 */     ctb ctb = ☃.a(this.d);
/* 67 */     csx csx = (new csx()).a(this.e).a(byg.a).a(cse.d);
/* 68 */     a(ctb, this.c, csx);
/*    */   }
/*    */ 
/*    */   
/*    */   protected void a(md ☃) {
/* 73 */     super.a(☃);
/* 74 */     ☃.a("Template", this.d.toString());
/* 75 */     ☃.a("Rot", this.e.name());
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   protected void a(String ☃, fx fx1, bsk bsk1, Random random, cra cra1) {}
/*    */ 
/*    */   
/*    */   public boolean a(bsr ☃, bsn bsn1, cfy cfy1, Random random, cra cra1, brd brd1, fx fx1) {
/* 84 */     cra1.c(this.a.b(this.b, this.c));
/* 85 */     return super.a(☃, bsn1, cfy1, random, cra1, brd1, fx1);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\crk$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */