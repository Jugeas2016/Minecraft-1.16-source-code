/*    */ import com.mojang.datafixers.DSL;
/*    */ import com.mojang.datafixers.Typed;
/*    */ import com.mojang.datafixers.schemas.Schema;
/*    */ import com.mojang.datafixers.util.Pair;
/*    */ import com.mojang.serialization.Dynamic;
/*    */ 
/*    */ public abstract class akv
/*    */   extends aie
/*    */ {
/*    */   public akv(String ☃, Schema schema, boolean bool) {
/* 11 */     super(☃, schema, bool);
/*    */   }
/*    */ 
/*    */   
/*    */   protected Pair<String, Typed<?>> a(String ☃, Typed<?> typed) {
/* 16 */     Pair<String, Dynamic<?>> pair = a(☃, (Dynamic)typed.getOrCreate(DSL.remainderFinder()));
/* 17 */     return Pair.of(pair.getFirst(), typed.set(DSL.remainderFinder(), pair.getSecond()));
/*    */   }
/*    */   
/*    */   protected abstract Pair<String, Dynamic<?>> a(String paramString, Dynamic<?> paramDynamic);
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\akv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */