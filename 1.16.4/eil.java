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
/*    */ public class eil
/*    */   extends eit<bai, duo<bai>>
/*    */ {
/* 14 */   private static final Map<bai.a, vk> a = (Map<bai.a, vk>)ImmutableMap.of(bai.a.b, new vk("textures/entity/iron_golem/iron_golem_crackiness_low.png"), bai.a.c, new vk("textures/entity/iron_golem/iron_golem_crackiness_medium.png"), bai.a.d, new vk("textures/entity/iron_golem/iron_golem_crackiness_high.png"));
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public eil(egk<bai, duo<bai>> ☃) {
/* 21 */     super(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(dfm ☃, eag eag1, int i, bai bai1, float f1, float f2, float f3, float f4, float f5, float f6) {
/* 26 */     if (bai1.bF()) {
/*    */       return;
/*    */     }
/* 29 */     bai.a a = bai1.eK();
/* 30 */     if (a == bai.a.a) {
/*    */       return;
/*    */     }
/* 33 */     vk vk = a.get(a);
/* 34 */     a(aC_(), vk, ☃, eag1, i, bai1, 1.0F, 1.0F, 1.0F);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\eil.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */