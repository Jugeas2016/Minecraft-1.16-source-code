/*    */ import com.google.common.collect.Maps;
/*    */ import java.util.HashMap;
/*    */ import java.util.Map;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class efx
/*    */   extends efw<baj, dtv<baj>>
/*    */ {
/*    */   private static final Map<baj.a, vk> a;
/*    */   
/*    */   static {
/* 13 */     a = x.<Map<baj.a, vk>>a(Maps.newHashMap(), ☃ -> {
/*    */           ☃.put(baj.a.b, new vk("textures/entity/cow/brown_mooshroom.png"));
/*    */           ☃.put(baj.a.a, new vk("textures/entity/cow/red_mooshroom.png"));
/*    */         });
/*    */   }
/*    */   public efx(eet ☃) {
/* 19 */     super(☃, new dtv<>(), 0.7F);
/*    */     
/* 21 */     a(new eip<>(this));
/*    */   }
/*    */ 
/*    */   
/*    */   public vk a(baj ☃) {
/* 26 */     return a.get(☃.eL());
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\efx.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */