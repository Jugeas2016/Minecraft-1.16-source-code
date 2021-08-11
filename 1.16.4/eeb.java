/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class eeb
/*    */   extends efw<baa, dtl<baa>>
/*    */ {
/*  8 */   private static final vk a = new vk("textures/entity/bee/bee_angry.png");
/*  9 */   private static final vk g = new vk("textures/entity/bee/bee_angry_nectar.png");
/* 10 */   private static final vk h = new vk("textures/entity/bee/bee.png");
/* 11 */   private static final vk i = new vk("textures/entity/bee/bee_nectar.png");
/*    */   
/*    */   public eeb(eet ☃) {
/* 14 */     super(☃, new dtl<>(), 0.4F);
/*    */   }
/*    */ 
/*    */   
/*    */   public vk a(baa ☃) {
/* 19 */     if (☃.H_()) {
/* 20 */       if (☃.eX()) {
/* 21 */         return g;
/*    */       }
/* 23 */       return a;
/* 24 */     }  if (☃.eX()) {
/* 25 */       return i;
/*    */     }
/* 27 */     return h;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\eeb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */