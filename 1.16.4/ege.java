/*    */ import com.google.common.collect.ImmutableMap;
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
/*    */ public class ege
/*    */   extends efh<aqn, dvc<aqn>>
/*    */ {
/* 15 */   private static final Map<aqe<?>, vk> a = (Map<aqe<?>, vk>)ImmutableMap.of(aqe.ai, new vk("textures/entity/piglin/piglin.png"), aqe.bb, new vk("textures/entity/piglin/zombified_piglin.png"), aqe.aj, new vk("textures/entity/piglin/piglin_brute.png"));
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public ege(eet ☃, boolean bool) {
/* 25 */     super(☃, a(bool), 0.5F, 1.0019531F, 1.0F, 1.0019531F);
/*    */     
/* 27 */     a(new eik<>(this, new dum<>(0.5F), new dum<>(1.02F)));
/*    */   }
/*    */   
/*    */   private static dvc<aqn> a(boolean ☃) {
/* 31 */     dvc<aqn> dvc = new dvc<>(0.0F, 64, 64);
/* 32 */     if (☃) {
/* 33 */       dvc.b.h = false;
/*    */     }
/* 35 */     return dvc;
/*    */   }
/*    */ 
/*    */   
/*    */   public vk a(aqn ☃) {
/* 40 */     vk vk = a.get(☃.X());
/* 41 */     if (vk == null) {
/* 42 */       throw new IllegalArgumentException("I don't know what texture to use for " + ☃.X());
/*    */     }
/* 44 */     return vk;
/*    */   }
/*    */ 
/*    */   
/*    */   protected boolean c(aqn ☃) {
/* 49 */     return (☃ instanceof ber && ((ber)☃).eL());
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ege.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */