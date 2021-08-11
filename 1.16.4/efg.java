/*    */ import com.google.common.collect.Maps;
/*    */ import java.util.EnumMap;
/*    */ import java.util.Map;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class efg
/*    */   extends edv<bbd, duk<bbd>>
/*    */ {
/*    */   private static final Map<bbk, vk> a;
/*    */   
/*    */   static {
/* 15 */     a = x.<Map<bbk, vk>>a(Maps.newEnumMap(bbk.class), ☃ -> {
/*    */           ☃.put(bbk.a, new vk("textures/entity/horse/horse_white.png"));
/*    */           ☃.put(bbk.b, new vk("textures/entity/horse/horse_creamy.png"));
/*    */           ☃.put(bbk.c, new vk("textures/entity/horse/horse_chestnut.png"));
/*    */           ☃.put(bbk.d, new vk("textures/entity/horse/horse_brown.png"));
/*    */           ☃.put(bbk.e, new vk("textures/entity/horse/horse_black.png"));
/*    */           ☃.put(bbk.f, new vk("textures/entity/horse/horse_gray.png"));
/*    */           ☃.put(bbk.g, new vk("textures/entity/horse/horse_darkbrown.png"));
/*    */         });
/*    */   }
/*    */   public efg(eet ☃) {
/* 26 */     super(☃, new duk<>(0.0F), 1.1F);
/*    */     
/* 28 */     a(new eij(this));
/* 29 */     a(new eii(this));
/*    */   }
/*    */ 
/*    */   
/*    */   public vk a(bbd ☃) {
/* 34 */     return a.get(☃.eM());
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\efg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */