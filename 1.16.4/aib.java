/*    */ import com.google.common.collect.ImmutableMap;
/*    */ import com.mojang.datafixers.schemas.Schema;
/*    */ import java.util.Map;
/*    */ import java.util.Objects;
/*    */ 
/*    */ 
/*    */ public class aib
/*    */   extends akw
/*    */ {
/* 10 */   public static final Map<String, String> a = (Map<String, String>)ImmutableMap.builder()
/* 11 */     .put("minecraft:puffer_fish_spawn_egg", "minecraft:pufferfish_spawn_egg")
/* 12 */     .build();
/*    */   
/*    */   public aib(Schema ☃, boolean bool) {
/* 15 */     super("EntityPufferfishRenameFix", ☃, bool);
/*    */   }
/*    */ 
/*    */   
/*    */   protected String a(String ☃) {
/* 20 */     return Objects.equals("minecraft:puffer_fish", ☃) ? "minecraft:pufferfish" : ☃;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\aib.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */