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
/*    */ public class eee
/*    */   extends efw<bab, dtp<bab>>
/*    */ {
/*    */   public eee(eet ☃) {
/* 18 */     super(☃, new dtp<>(0.0F), 0.4F);
/*    */     
/* 20 */     a(new ehw(this));
/*    */   }
/*    */ 
/*    */   
/*    */   public vk a(bab ☃) {
/* 25 */     return ☃.eU();
/*    */   }
/*    */ 
/*    */   
/*    */   protected void a(bab ☃, dfm dfm1, float f) {
/* 30 */     super.a(☃, dfm1, f);
/* 31 */     dfm1.a(0.8F, 0.8F, 0.8F);
/*    */   }
/*    */ 
/*    */   
/*    */   protected void a(bab ☃, dfm dfm1, float f1, float f2, float f3) {
/* 36 */     super.a(☃, dfm1, f1, f2, f3);
/*    */     
/* 38 */     float f = ☃.y(f3);
/* 39 */     if (f > 0.0F) {
/* 40 */       dfm1.a((0.4F * f), (0.15F * f), (0.1F * f));
/* 41 */       dfm1.a(g.f.a(afm.h(f, 0.0F, 90.0F)));
/*    */ 
/*    */       
/* 44 */       fx fx = ☃.cB();
/* 45 */       List<bfw> list = ☃.l.a(bfw.class, (new dci(fx)).c(2.0D, 2.0D, 2.0D));
/* 46 */       for (bfw bfw : list) {
/* 47 */         if (bfw.em()) {
/* 48 */           dfm1.a((0.15F * f), 0.0D, 0.0D);
/*    */           break;
/*    */         } 
/*    */       } 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\eee.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */