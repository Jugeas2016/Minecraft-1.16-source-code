/*    */ import com.mojang.datafixers.DSL;
/*    */ import com.mojang.datafixers.DataFix;
/*    */ import com.mojang.datafixers.DataFixUtils;
/*    */ import com.mojang.datafixers.TypeRewriteRule;
/*    */ import com.mojang.datafixers.Typed;
/*    */ import com.mojang.datafixers.schemas.Schema;
/*    */ import com.mojang.serialization.Dynamic;
/*    */ 
/*    */ public class akg extends DataFix {
/*    */   private final String a;
/*    */   private final String b;
/*    */   private final String c;
/*    */   
/*    */   public akg(Schema ☃, boolean bool, String str1, String str2, String str3) {
/* 15 */     super(☃, bool);
/* 16 */     this.a = str1;
/* 17 */     this.b = str2;
/* 18 */     this.c = str3;
/*    */   }
/*    */ 
/*    */   
/*    */   public TypeRewriteRule makeRule() {
/* 23 */     return fixTypeEverywhereTyped(this.a, getInputSchema().getType(akn.e), ☃ -> ☃.update(DSL.remainderFinder(), ()));
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\akg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */