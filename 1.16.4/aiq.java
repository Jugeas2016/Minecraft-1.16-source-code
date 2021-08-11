/*    */ import com.google.common.collect.ImmutableMap;
/*    */ import com.mojang.datafixers.schemas.Schema;
/*    */ import java.util.Map;
/*    */ import java.util.Objects;
/*    */ 
/*    */ 
/*    */ public class aiq
/*    */   extends akw
/*    */ {
/* 10 */   public static final Map<String, String> a = (Map<String, String>)ImmutableMap.builder()
/* 11 */     .put("minecraft:zombie_pigman_spawn_egg", "minecraft:zombified_piglin_spawn_egg")
/* 12 */     .build();
/*    */   
/*    */   public aiq(Schema ☃) {
/* 15 */     super("EntityZombifiedPiglinRenameFix", ☃, true);
/*    */   }
/*    */ 
/*    */   
/*    */   protected String a(String ☃) {
/* 20 */     return Objects.equals("minecraft:zombie_pigman", ☃) ? "minecraft:zombified_piglin" : ☃;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\aiq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */