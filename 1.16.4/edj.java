/*    */ import com.google.common.collect.Maps;
/*    */ import com.mojang.blaze3d.systems.RenderSystem;
/*    */ import java.util.List;
/*    */ import java.util.Map;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class edj
/*    */   implements edh.a
/*    */ {
/*    */   private final djz a;
/*    */   
/*    */   public static class a
/*    */   {
/*    */     public final fx a;
/*    */     public final int b;
/*    */     public final String c;
/*    */     public final boolean d;
/*    */     
/*    */     public a(fx ☃, int i, String str, boolean bool) {
/* 24 */       this.a = ☃;
/* 25 */       this.b = i;
/* 26 */       this.c = str;
/* 27 */       this.d = bool;
/*    */     }
/*    */   }
/*    */ 
/*    */   
/* 32 */   private final Map<Integer, List<a>> b = Maps.newHashMap();
/*    */ 
/*    */   
/*    */   public void a() {
/* 36 */     this.b.clear();
/*    */   }
/*    */   
/*    */   public void a(int ☃, List<a> list) {
/* 40 */     this.b.put(Integer.valueOf(☃), list);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public edj(djz ☃) {
/* 48 */     this.a = ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(dfm ☃, eag eag1, double d1, double d2, double d3) {
/* 53 */     djk djk = this.a.h.k();
/*    */     
/* 55 */     RenderSystem.pushMatrix();
/*    */     
/* 57 */     RenderSystem.enableBlend();
/* 58 */     RenderSystem.defaultBlendFunc();
/* 59 */     RenderSystem.disableTexture();
/*    */     
/* 61 */     fx fx = new fx((djk.b()).b, 0.0D, (djk.b()).d);
/*    */     
/* 63 */     this.b.forEach((integer, list) -> {
/*    */           for (int i = 0; i < list.size(); i++) {
/*    */             a a1 = list.get(i);
/*    */             
/*    */             if (☃.a(a1.a, 160.0D)) {
/*    */               double d1 = a1.a.u() + 0.5D;
/*    */               
/*    */               double d2 = a1.a.v() + 2.0D + i * 0.25D;
/*    */               double d3 = a1.a.w() + 0.5D;
/*    */               int j = a1.d ? -16711936 : -3355444;
/*    */               edh.a(a1.c, d1, d2, d3, j);
/*    */             } 
/*    */           } 
/*    */         });
/* 77 */     RenderSystem.enableDepthTest();
/* 78 */     RenderSystem.enableTexture();
/* 79 */     RenderSystem.popMatrix();
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\edj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */