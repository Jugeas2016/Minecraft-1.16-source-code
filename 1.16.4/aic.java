/*    */ import com.google.common.collect.ImmutableMap;
/*    */ import com.mojang.datafixers.schemas.Schema;
/*    */ import java.util.Map;
/*    */ import java.util.Objects;
/*    */ 
/*    */ 
/*    */ public class aic
/*    */   extends akw
/*    */ {
/* 10 */   public static final Map<String, String> a = (Map<String, String>)ImmutableMap.builder()
/* 11 */     .put("minecraft:illager_beast_spawn_egg", "minecraft:ravager_spawn_egg")
/* 12 */     .build();
/*    */   
/*    */   public aic(Schema ☃, boolean bool) {
/* 15 */     super("EntityRavagerRenameFix", ☃, bool);
/*    */   }
/*    */ 
/*    */   
/*    */   protected String a(String ☃) {
/* 20 */     return Objects.equals("minecraft:illager_beast", ☃) ? "minecraft:ravager" : ☃;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\aic.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */