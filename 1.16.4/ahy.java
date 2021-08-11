/*    */ import com.mojang.datafixers.DSL;
/*    */ import com.mojang.datafixers.DataFix;
/*    */ import com.mojang.datafixers.OpticFinder;
/*    */ import com.mojang.datafixers.TypeRewriteRule;
/*    */ import com.mojang.datafixers.Typed;
/*    */ import com.mojang.datafixers.schemas.Schema;
/*    */ import com.mojang.datafixers.types.Type;
/*    */ import com.mojang.serialization.Dynamic;
/*    */ 
/*    */ public class ahy
/*    */   extends DataFix {
/* 12 */   private static final int[][] a = new int[][] { { 0, 0, 1 }, { -1, 0, 0 }, { 0, 0, -1 }, { 1, 0, 0 } };
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public ahy(Schema ☃, boolean bool) {
/* 20 */     super(☃, bool);
/*    */   }
/*    */   
/*    */   private Dynamic<?> a(Dynamic<?> ☃, boolean bool1, boolean bool2) {
/* 24 */     if ((bool1 || bool2) && !☃.get("Facing").asNumber().result().isPresent()) {
/*    */       int i;
/* 26 */       if (☃.get("Direction").asNumber().result().isPresent()) {
/* 27 */         i = ☃.get("Direction").asByte((byte)0) % a.length;
/* 28 */         int[] arrayOfInt = a[i];
/*    */         
/* 30 */         ☃ = ☃.set("TileX", ☃.createInt(☃.get("TileX").asInt(0) + arrayOfInt[0]));
/* 31 */         ☃ = ☃.set("TileY", ☃.createInt(☃.get("TileY").asInt(0) + arrayOfInt[1]));
/* 32 */         ☃ = ☃.set("TileZ", ☃.createInt(☃.get("TileZ").asInt(0) + arrayOfInt[2]));
/*    */         
/* 34 */         ☃ = ☃.remove("Direction");
/*    */         
/* 36 */         if (bool2 && ☃.get("ItemRotation").asNumber().result().isPresent()) {
/* 37 */           ☃ = ☃.set("ItemRotation", ☃.createByte((byte)(☃.get("ItemRotation").asByte((byte)0) * 2)));
/*    */         }
/*    */       } else {
/* 40 */         i = ☃.get("Dir").asByte((byte)0) % a.length;
/* 41 */         ☃ = ☃.remove("Dir");
/*    */       } 
/* 43 */       ☃ = ☃.set("Facing", ☃.createByte((byte)i));
/*    */     } 
/*    */     
/* 46 */     return ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   public TypeRewriteRule makeRule() {
/* 51 */     Type<?> ☃ = getInputSchema().getChoiceType(akn.p, "Painting");
/* 52 */     OpticFinder<?> opticFinder1 = DSL.namedChoice("Painting", ☃);
/*    */     
/* 54 */     Type<?> type1 = getInputSchema().getChoiceType(akn.p, "ItemFrame");
/* 55 */     OpticFinder<?> opticFinder2 = DSL.namedChoice("ItemFrame", type1);
/*    */     
/* 57 */     Type<?> type2 = getInputSchema().getType(akn.p);
/*    */     
/* 59 */     TypeRewriteRule typeRewriteRule1 = fixTypeEverywhereTyped("EntityPaintingFix", type2, typed -> typed.updateTyped(☃, type, ()));
/*    */ 
/*    */     
/* 62 */     TypeRewriteRule typeRewriteRule2 = fixTypeEverywhereTyped("EntityItemFrameFix", type2, typed -> typed.updateTyped(☃, type, ()));
/*    */ 
/*    */ 
/*    */     
/* 66 */     return TypeRewriteRule.seq(typeRewriteRule1, typeRewriteRule2);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ahy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */