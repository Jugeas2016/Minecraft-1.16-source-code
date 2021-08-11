/*    */ import com.google.common.collect.Maps;
/*    */ import java.util.EnumMap;
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
/*    */ public class eij
/*    */   extends eit<bbd, duk<bbd>>
/*    */ {
/*    */   private static final Map<bbf, vk> a;
/*    */   
/*    */   static {
/* 19 */     a = x.<Map<bbf, vk>>a(Maps.newEnumMap(bbf.class), ☃ -> {
/*    */           ☃.put(bbf.a, null);
/*    */           ☃.put(bbf.b, new vk("textures/entity/horse/horse_markings_white.png"));
/*    */           ☃.put(bbf.c, new vk("textures/entity/horse/horse_markings_whitefield.png"));
/*    */           ☃.put(bbf.d, new vk("textures/entity/horse/horse_markings_whitedots.png"));
/*    */           ☃.put(bbf.e, new vk("textures/entity/horse/horse_markings_blackdots.png"));
/*    */         });
/*    */   }
/*    */   public eij(egk<bbd, duk<bbd>> ☃) {
/* 28 */     super(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(dfm ☃, eag eag1, int i, bbd bbd1, float f1, float f2, float f3, float f4, float f5, float f6) {
/* 33 */     vk vk = a.get(bbd1.eO());
/*    */     
/* 35 */     if (vk == null || bbd1.bF()) {
/*    */       return;
/*    */     }
/*    */     
/* 39 */     dfq dfq = eag1.getBuffer(eao.h(vk));
/* 40 */     aC_().a(☃, dfq, i, efr.c(bbd1, 0.0F), 1.0F, 1.0F, 1.0F, 1.0F);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\eij.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */