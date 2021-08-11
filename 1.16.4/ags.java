/*    */ import com.mojang.datafixers.DSL;
/*    */ import com.mojang.datafixers.Typed;
/*    */ import com.mojang.datafixers.schemas.Schema;
/*    */ import com.mojang.serialization.Dynamic;
/*    */ 
/*    */ public class ags
/*    */   extends ajv
/*    */ {
/*    */   public ags(Schema ☃, boolean bool) {
/* 10 */     super(☃, bool, "BlockEntityKeepPacked", akn.k, "DUMMY");
/*    */   }
/*    */   
/*    */   private static Dynamic<?> a(Dynamic<?> ☃) {
/* 14 */     return ☃.set("keepPacked", ☃.createBoolean(true));
/*    */   }
/*    */ 
/*    */   
/*    */   protected Typed<?> a(Typed<?> ☃) {
/* 19 */     return ☃.update(DSL.remainderFinder(), ags::a);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ags.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */