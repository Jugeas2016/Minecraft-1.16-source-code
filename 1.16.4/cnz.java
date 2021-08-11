/*    */ import com.mojang.serialization.Codec;
/*    */ import com.mojang.serialization.DataResult;
/*    */ import java.util.Random;
/*    */ 
/*    */ public class cnz
/*    */   extends cnt
/*    */ {
/*    */   public static final Codec<cnz> b;
/*    */   private final aup<ceh> c;
/*    */   
/*    */   static {
/* 12 */     b = aup.<U>a((Codec)ceh.b).comapFlatMap(cnz::a, ☃ -> ☃.c).fieldOf("entries").codec();
/*    */   }
/*    */   
/*    */   private static DataResult<cnz> a(aup<ceh> ☃) {
/* 16 */     if (☃.b()) {
/* 17 */       return DataResult.error("WeightedStateProvider with no states");
/*    */     }
/* 19 */     return DataResult.success(new cnz(☃));
/*    */   }
/*    */   
/*    */   private cnz(aup<ceh> ☃) {
/* 23 */     this.c = ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   protected cnu<?> a() {
/* 28 */     return cnu.b;
/*    */   }
/*    */   
/*    */   public cnz() {
/* 32 */     this(new aup<>());
/*    */   }
/*    */   
/*    */   public cnz a(ceh ☃, int i) {
/* 36 */     this.c.a(☃, i);
/* 37 */     return this;
/*    */   }
/*    */ 
/*    */   
/*    */   public ceh a(Random ☃, fx fx1) {
/* 42 */     return this.c.b(☃);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cnz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */