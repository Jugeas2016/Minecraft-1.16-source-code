/*    */ import com.google.common.collect.ImmutableMap;
/*    */ import com.mojang.datafixers.DSL;
/*    */ import com.mojang.datafixers.Typed;
/*    */ import com.mojang.datafixers.schemas.Schema;
/*    */ import com.mojang.datafixers.util.Pair;
/*    */ import com.mojang.serialization.Dynamic;
/*    */ import java.util.Map;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ajs
/*    */   extends ajv
/*    */ {
/*    */   public ajs(Schema ☃, String str) {
/* 31 */     super(☃, false, "Memory expiry data fix (" + str + ")", akn.p, str);
/*    */   }
/*    */ 
/*    */   
/*    */   protected Typed<?> a(Typed<?> ☃) {
/* 36 */     return ☃.update(DSL.remainderFinder(), this::a);
/*    */   }
/*    */   
/*    */   public Dynamic<?> a(Dynamic<?> ☃) {
/* 40 */     return ☃.update("Brain", this::b);
/*    */   }
/*    */   
/*    */   private Dynamic<?> b(Dynamic<?> ☃) {
/* 44 */     return ☃.update("memories", this::c);
/*    */   }
/*    */   
/*    */   private Dynamic<?> c(Dynamic<?> ☃) {
/* 48 */     return ☃.updateMapValues(this::a);
/*    */   }
/*    */   
/*    */   private Pair<Dynamic<?>, Dynamic<?>> a(Pair<Dynamic<?>, Dynamic<?>> ☃) {
/* 52 */     return ☃.mapSecond(this::d);
/*    */   }
/*    */   
/*    */   private Dynamic<?> d(Dynamic<?> ☃) {
/* 56 */     return ☃.createMap((Map)ImmutableMap.of(☃
/* 57 */           .createString("value"), ☃));
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ajs.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */