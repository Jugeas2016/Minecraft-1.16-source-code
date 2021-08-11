/*    */ import com.mojang.datafixers.schemas.Schema;
/*    */ import com.mojang.datafixers.util.Pair;
/*    */ import com.mojang.serialization.Dynamic;
/*    */ import java.util.Objects;
/*    */ 
/*    */ 
/*    */ public class ahq
/*    */   extends akv
/*    */ {
/*    */   public ahq(Schema ☃, boolean bool) {
/* 11 */     super("EntityElderGuardianSplitFix", ☃, bool);
/*    */   }
/*    */ 
/*    */   
/*    */   protected Pair<String, Dynamic<?>> a(String ☃, Dynamic<?> dynamic) {
/* 16 */     return Pair.of((Objects.equals(☃, "Guardian") && dynamic.get("Elder").asBoolean(false)) ? "ElderGuardian" : ☃, dynamic);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ahq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */