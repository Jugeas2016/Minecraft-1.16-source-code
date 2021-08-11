/*    */ import com.mojang.datafixers.schemas.Schema;
/*    */ import com.mojang.datafixers.util.Pair;
/*    */ import com.mojang.serialization.Dynamic;
/*    */ import java.util.Objects;
/*    */ 
/*    */ 
/*    */ public class aii
/*    */   extends akv
/*    */ {
/*    */   public aii(Schema ☃, boolean bool) {
/* 11 */     super("EntitySkeletonSplitFix", ☃, bool);
/*    */   }
/*    */ 
/*    */   
/*    */   protected Pair<String, Dynamic<?>> a(String ☃, Dynamic<?> dynamic) {
/* 16 */     if (Objects.equals(☃, "Skeleton")) {
/* 17 */       int i = dynamic.get("SkeletonType").asInt(0);
/* 18 */       if (i == 1) {
/* 19 */         ☃ = "WitherSkeleton";
/* 20 */       } else if (i == 2) {
/* 21 */         ☃ = "Stray";
/*    */       } 
/*    */     } 
/* 24 */     return Pair.of(☃, dynamic);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\aii.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */