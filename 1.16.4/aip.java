/*    */ import com.mojang.datafixers.DSL;
/*    */ import com.mojang.datafixers.Typed;
/*    */ import com.mojang.datafixers.schemas.Schema;
/*    */ import com.mojang.serialization.Dynamic;
/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class aip
/*    */   extends ajv
/*    */ {
/*    */   public aip(Schema ☃, boolean bool) {
/* 14 */     super(☃, bool, "EntityZombieVillagerTypeFix", akn.p, "Zombie");
/*    */   }
/*    */   
/* 17 */   private static final Random a = new Random();
/*    */   
/*    */   public Dynamic<?> a(Dynamic<?> ☃) {
/* 20 */     if (☃.get("IsVillager").asBoolean(false)) {
/* 21 */       if (!☃.get("ZombieType").result().isPresent()) {
/* 22 */         int i = a(☃.get("VillagerProfession").asInt(-1));
/* 23 */         if (i == -1) {
/* 24 */           i = a(a.nextInt(6));
/*    */         }
/*    */         
/* 27 */         ☃ = ☃.set("ZombieType", ☃.createInt(i));
/*    */       } 
/*    */       
/* 30 */       ☃ = ☃.remove("IsVillager");
/*    */     } 
/* 32 */     return ☃;
/*    */   }
/*    */   
/*    */   private int a(int ☃) {
/* 36 */     if (☃ < 0 || ☃ >= 6) {
/* 37 */       return -1;
/*    */     }
/* 39 */     return ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   protected Typed<?> a(Typed<?> ☃) {
/* 44 */     return ☃.update(DSL.remainderFinder(), this::a);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\aip.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */