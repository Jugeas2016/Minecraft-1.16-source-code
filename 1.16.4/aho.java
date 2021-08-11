/*    */ import com.google.common.collect.ImmutableMap;
/*    */ import com.mojang.datafixers.schemas.Schema;
/*    */ import java.util.Map;
/*    */ 
/*    */ 
/*    */ public class aho
/*    */   extends akw
/*    */ {
/*  9 */   public static final Map<String, String> a = (Map<String, String>)ImmutableMap.builder()
/* 10 */     .put("minecraft:salmon_mob", "minecraft:salmon")
/* 11 */     .put("minecraft:cod_mob", "minecraft:cod")
/* 12 */     .build();
/*    */   
/* 14 */   public static final Map<String, String> b = (Map<String, String>)ImmutableMap.builder()
/* 15 */     .put("minecraft:salmon_mob_spawn_egg", "minecraft:salmon_spawn_egg")
/* 16 */     .put("minecraft:cod_mob_spawn_egg", "minecraft:cod_spawn_egg")
/* 17 */     .build();
/*    */   
/*    */   public aho(Schema ☃, boolean bool) {
/* 20 */     super("EntityCodSalmonFix", ☃, bool);
/*    */   }
/*    */ 
/*    */   
/*    */   protected String a(String ☃) {
/* 25 */     return a.getOrDefault(☃, ☃);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\aho.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */