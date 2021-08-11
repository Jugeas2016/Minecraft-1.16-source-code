/*    */ import com.mojang.blaze3d.systems.RenderSystem;
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
/*    */ public class dmn
/*    */   implements dmq
/*    */ {
/*    */   private final y c;
/*    */   private boolean d;
/*    */   
/*    */   public dmn(y ☃) {
/* 20 */     this.c = ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   public dmq.a a(dfm ☃, dmr dmr1, long l) {
/* 25 */     dmr1.b().M().a(a);
/* 26 */     RenderSystem.color3f(1.0F, 1.0F, 1.0F);
/* 27 */     ah ah = this.c.c();
/* 28 */     dmr1.b(☃, 0, 0, 0, 0, a(), d());
/*    */     
/* 30 */     if (ah != null) {
/* 31 */       List<afa> list = (dmr1.b()).g.b(ah.a(), 125);
/* 32 */       int i = (ah.e() == ai.b) ? 16746751 : 16776960;
/*    */       
/* 34 */       if (list.size() == 1) {
/* 35 */         (dmr1.b()).g.b(☃, ah.e().d(), 30.0F, 7.0F, i | 0xFF000000);
/* 36 */         (dmr1.b()).g.b(☃, list.get(0), 30.0F, 18.0F, -1);
/*    */       } else {
/* 38 */         int j = 1500;
/* 39 */         float f = 300.0F;
/* 40 */         if (l < 1500L) {
/* 41 */           int k = afm.d(afm.a((float)(1500L - l) / 300.0F, 0.0F, 1.0F) * 255.0F) << 24 | 0x4000000;
/* 42 */           (dmr1.b()).g.b(☃, ah.e().d(), 30.0F, 11.0F, i | k);
/*    */         } else {
/* 44 */           int k = afm.d(afm.a((float)(l - 1500L) / 300.0F, 0.0F, 1.0F) * 252.0F) << 24 | 0x4000000;
/* 45 */           (dmr1.b()).g.getClass(); int m = d() / 2 - list.size() * 9 / 2;
/* 46 */           for (afa afa : list) {
/* 47 */             (dmr1.b()).g.b(☃, afa, 30.0F, m, 0xFFFFFF | k);
/* 48 */             (dmr1.b()).g.getClass(); m += 9;
/*    */           } 
/*    */         } 
/*    */       } 
/*    */       
/* 53 */       if (!this.d && l > 0L) {
/* 54 */         this.d = true;
/* 55 */         if (ah.e() == ai.b) {
/* 56 */           dmr1.b().W().a(emp.a(adq.pL, 1.0F, 1.0F));
/*    */         }
/*    */       } 
/*    */       
/* 60 */       dmr1.b().ad().c(ah.c(), 8, 8);
/* 61 */       return (l >= 5000L) ? dmq.a.b : dmq.a.a;
/*    */     } 
/* 63 */     return dmq.a.b;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dmn.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */