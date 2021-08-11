/*    */ import com.mojang.datafixers.DSL;
/*    */ import com.mojang.datafixers.DataFix;
/*    */ import com.mojang.datafixers.OpticFinder;
/*    */ import com.mojang.datafixers.TypeRewriteRule;
/*    */ import com.mojang.datafixers.Typed;
/*    */ import com.mojang.datafixers.schemas.Schema;
/*    */ import com.mojang.datafixers.types.Type;
/*    */ import com.mojang.datafixers.types.templates.List;
/*    */ import com.mojang.serialization.Dynamic;
/*    */ import java.util.Optional;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class alf
/*    */   extends DataFix
/*    */ {
/* 18 */   private static final int[] a = new int[] { 0, 10, 50, 100, 150 };
/*    */   
/*    */   public static int a(int ☃) {
/* 21 */     return a[afm.a(☃ - 1, 0, a.length - 1)];
/*    */   }
/*    */   
/*    */   public alf(Schema ☃, boolean bool) {
/* 25 */     super(☃, bool);
/*    */   }
/*    */ 
/*    */   
/*    */   public TypeRewriteRule makeRule() {
/* 30 */     Type<?> ☃ = getInputSchema().getChoiceType(akn.p, "minecraft:villager");
/* 31 */     OpticFinder<?> opticFinder1 = DSL.namedChoice("minecraft:villager", ☃);
/*    */     
/* 33 */     OpticFinder<?> opticFinder2 = ☃.findField("Offers");
/* 34 */     Type<?> type1 = opticFinder2.type();
/* 35 */     OpticFinder<?> opticFinder3 = type1.findField("Recipes");
/* 36 */     List.ListType<?> listType = (List.ListType)opticFinder3.type();
/* 37 */     OpticFinder<?> opticFinder4 = listType.getElement().finder();
/*    */     
/* 39 */     return fixTypeEverywhereTyped("Villager level and xp rebuild", getInputSchema().getType(akn.p), typed -> typed.updateTyped(☃, type, ()));
/*    */   }
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
/*    */   private static Typed<?> a(Typed<?> ☃, int i) {
/* 72 */     return ☃.update(DSL.remainderFinder(), dynamic -> dynamic.update("VillagerData", ()));
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   private static Typed<?> b(Typed<?> ☃, int i) {
/* 79 */     int j = a(i);
/* 80 */     return ☃.update(DSL.remainderFinder(), dynamic -> dynamic.set("Xp", dynamic.createInt(☃)));
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\alf.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */