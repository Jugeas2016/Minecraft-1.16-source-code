/*    */ import com.google.common.collect.Lists;
/*    */ import java.util.Collection;
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
/*    */ public class edo
/*    */   implements edh.a
/*    */ {
/*    */   private final djz a;
/* 21 */   private Collection<fx> b = Lists.newArrayList();
/*    */   
/*    */   public edo(djz ☃) {
/* 24 */     this.a = ☃;
/*    */   }
/*    */   
/*    */   public void a(Collection<fx> ☃) {
/* 28 */     this.b = ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(dfm ☃, eag eag1, double d1, double d2, double d3) {
/* 33 */     fx fx = b().c();
/*    */     
/* 35 */     for (fx fx1 : this.b) {
/* 36 */       if (fx.a(fx1, 160.0D)) {
/* 37 */         a(fx1);
/*    */       }
/*    */     } 
/*    */   }
/*    */   
/*    */   private static void a(fx ☃) {
/* 43 */     edh.a(☃.a(-0.5D, -0.5D, -0.5D), ☃.a(1.5D, 1.5D, 1.5D), 1.0F, 0.0F, 0.0F, 0.15F);
/* 44 */     int i = -65536;
/* 45 */     a("Raid center", ☃, -65536);
/*    */   }
/*    */   
/*    */   private static void a(String ☃, fx fx1, int i) {
/* 49 */     double d1 = fx1.u() + 0.5D;
/* 50 */     double d2 = fx1.v() + 1.3D;
/* 51 */     double d3 = fx1.w() + 0.5D;
/*    */     
/* 53 */     edh.a(☃, d1, d2, d3, i, 0.04F, true, 0.0F, true);
/*    */   }
/*    */   
/*    */   private djk b() {
/* 57 */     return this.a.h.k();
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\edo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */