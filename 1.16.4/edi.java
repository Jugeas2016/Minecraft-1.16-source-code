/*    */ import com.google.common.collect.Maps;
/*    */ import com.mojang.blaze3d.systems.RenderSystem;
/*    */ import java.util.Map;
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
/*    */ public class edi
/*    */   implements edh.a
/*    */ {
/* 18 */   private final Map<fx, a> a = Maps.newHashMap();
/*    */   
/*    */   static class a {
/*    */     public int a;
/*    */     public String b;
/*    */     public long c;
/*    */     
/*    */     public a(int ☃, String str, long l) {
/* 26 */       this.a = ☃;
/* 27 */       this.b = str;
/* 28 */       this.c = l;
/*    */     }
/*    */     
/*    */     public float a() {
/* 32 */       return (this.a >> 16 & 0xFF) / 255.0F;
/*    */     }
/*    */     
/*    */     public float b() {
/* 36 */       return (this.a >> 8 & 0xFF) / 255.0F;
/*    */     }
/*    */     
/*    */     public float c() {
/* 40 */       return (this.a & 0xFF) / 255.0F;
/*    */     }
/*    */     
/*    */     public float d() {
/* 44 */       return (this.a >> 24 & 0xFF) / 255.0F;
/*    */     }
/*    */   }
/*    */   
/*    */   public void a(fx ☃, int i, String str, int j) {
/* 49 */     this.a.put(☃, new a(i, str, x.b() + j));
/*    */   }
/*    */ 
/*    */   
/*    */   public void a() {
/* 54 */     this.a.clear();
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(dfm ☃, eag eag1, double d1, double d2, double d3) {
/* 59 */     long l = x.b();
/* 60 */     this.a.entrySet().removeIf(entry -> (☃ > ((a)entry.getValue()).c));
/* 61 */     this.a.forEach(this::a);
/*    */   }
/*    */   
/*    */   private void a(fx ☃, a a1) {
/* 65 */     RenderSystem.pushMatrix();
/* 66 */     RenderSystem.enableBlend();
/* 67 */     RenderSystem.blendFuncSeparate(dem.r.l, dem.j.j, dem.r.e, dem.j.n);
/* 68 */     RenderSystem.color4f(0.0F, 1.0F, 0.0F, 0.75F);
/* 69 */     RenderSystem.disableTexture();
/*    */     
/* 71 */     edh.a(☃, 0.02F, a1.a(), a1.b(), a1.c(), a1.d());
/* 72 */     if (!a1.b.isEmpty()) {
/* 73 */       double d1 = ☃.u() + 0.5D;
/* 74 */       double d2 = ☃.v() + 1.2D;
/* 75 */       double d3 = ☃.w() + 0.5D;
/* 76 */       edh.a(a1.b, d1, d2, d3, -1, 0.01F, true, 0.0F, true);
/*    */     } 
/*    */     
/* 79 */     RenderSystem.enableTexture();
/* 80 */     RenderSystem.disableBlend();
/* 81 */     RenderSystem.popMatrix();
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\edi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */