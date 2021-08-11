/*    */ import java.util.List;
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
/*    */ public class bdf
/*    */   extends bdm
/*    */ {
/* 21 */   public static final float b = aqe.r.j() / aqe.F.j();
/*    */   
/*    */   public bdf(aqe<? extends bdf> ☃, brx brx1) {
/* 24 */     super((aqe)☃, brx1);
/*    */     
/* 26 */     es();
/*    */ 
/*    */     
/* 29 */     if (this.c != null) {
/* 30 */       this.c.a(400);
/*    */     }
/*    */   }
/*    */   
/*    */   public static ark.a m() {
/* 35 */     return bdm.eM()
/* 36 */       .a(arl.d, 0.30000001192092896D)
/* 37 */       .a(arl.f, 8.0D)
/* 38 */       .a(arl.a, 80.0D);
/*    */   }
/*    */ 
/*    */   
/*    */   public int eK() {
/* 43 */     return 60;
/*    */   }
/*    */ 
/*    */   
/*    */   protected adp I() {
/* 48 */     return aH() ? adq.dd : adq.de;
/*    */   }
/*    */ 
/*    */   
/*    */   protected adp e(apk ☃) {
/* 53 */     return aH() ? adq.dj : adq.dk;
/*    */   }
/*    */ 
/*    */   
/*    */   protected adp dq() {
/* 58 */     return aH() ? adq.dg : adq.dh;
/*    */   }
/*    */ 
/*    */   
/*    */   protected adp eL() {
/* 63 */     return adq.di;
/*    */   }
/*    */ 
/*    */   
/*    */   protected void N() {
/* 68 */     super.N();
/*    */ 
/*    */     
/* 71 */     int ☃ = 1200;
/* 72 */     if ((this.K + Y()) % 1200 == 0) {
/* 73 */       aps aps = apw.d;
/*    */       
/* 75 */       List<aah> list = ((aag)this.l).a(☃ -> (h(☃) < 2500.0D && ☃.d.d()));
/*    */       
/* 77 */       int i = 2;
/* 78 */       int j = 6000;
/* 79 */       int k = 1200;
/*    */       
/* 81 */       for (aah aah : list) {
/* 82 */         if (!aah.a(aps) || aah.b(aps).c() < 2 || aah.b(aps).b() < 1200) {
/* 83 */           aah.b.a(new pq(pq.k, aA() ? 0.0F : 1.0F));
/* 84 */           aah.c(new apu(aps, 6000, 2));
/*    */         } 
/*    */       } 
/*    */     } 
/*    */ 
/*    */     
/* 90 */     if (!ez())
/* 91 */       a(cB(), 16); 
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bdf.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */