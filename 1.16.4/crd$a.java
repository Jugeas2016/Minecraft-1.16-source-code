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
/*    */ public class a
/*    */   extends crx
/*    */ {
/*    */   private final String d;
/*    */   private final bzm e;
/*    */   private final boolean f;
/*    */   
/*    */   public a(csw ☃, String str, fx fx1, bzm bzm1, boolean bool) {
/* 47 */     super(clb.Y, 0);
/*    */     
/* 49 */     this.d = str;
/* 50 */     this.c = fx1;
/* 51 */     this.e = bzm1;
/* 52 */     this.f = bool;
/*    */     
/* 54 */     a(☃);
/*    */   }
/*    */   
/*    */   public a(csw ☃, md md1) {
/* 58 */     super(clb.Y, md1);
/*    */     
/* 60 */     this.d = md1.l("Template");
/* 61 */     this.e = bzm.valueOf(md1.l("Rot"));
/* 62 */     this.f = md1.q("OW");
/*    */     
/* 64 */     a(☃);
/*    */   }
/*    */   
/*    */   private void a(csw ☃) {
/* 68 */     ctb ctb = ☃.a(new vk("end_city/" + this.d));
/* 69 */     csx csx = (this.f ? crd.a() : crd.b()).a().a(this.e);
/*    */     
/* 71 */     a(ctb, this.c, csx);
/*    */   }
/*    */ 
/*    */   
/*    */   protected void a(md ☃) {
/* 76 */     super.a(☃);
/*    */     
/* 78 */     ☃.a("Template", this.d);
/* 79 */     ☃.a("Rot", this.e.name());
/* 80 */     ☃.a("OW", this.f);
/*    */   }
/*    */ 
/*    */   
/*    */   protected void a(String ☃, fx fx1, bsk bsk1, Random random, cra cra1) {
/* 85 */     if (☃.startsWith("Chest")) {
/* 86 */       fx fx2 = fx1.c();
/*    */       
/* 88 */       if (cra1.b(fx2)) {
/* 89 */         cdd.a(bsk1, random, fx2, cyq.c);
/*    */       }
/* 91 */     } else if (☃.startsWith("Sentry")) {
/* 92 */       bdw bdw = aqe.as.a(bsk1.E());
/* 93 */       bdw.d(fx1.u() + 0.5D, fx1.v() + 0.5D, fx1.w() + 0.5D);
/* 94 */       bdw.h(fx1);
/* 95 */       bsk1.c(bdw);
/* 96 */     } else if (☃.startsWith("Elytra")) {
/* 97 */       bcp bcp = new bcp(bsk1.E(), fx1, this.e.a(gc.d));
/* 98 */       bcp.a(new bmb(bmd.qo), false);
/* 99 */       bsk1.c(bcp);
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\crd$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */