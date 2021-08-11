/*    */ import com.mojang.serialization.Codec;
/*    */ import java.util.Random;
/*    */ import java.util.function.Function;
/*    */ 
/*    */ public class cny extends cnt {
/*    */   public static final Codec<cny> b;
/*    */   private final ceh c;
/*    */   
/*    */   static {
/* 10 */     b = ceh.b.fieldOf("state").xmap(cny::new, ☃ -> ☃.c).codec();
/*    */   }
/*    */ 
/*    */   
/*    */   public cny(ceh ☃) {
/* 15 */     this.c = ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   protected cnu<?> a() {
/* 20 */     return cnu.a;
/*    */   }
/*    */ 
/*    */   
/*    */   public ceh a(Random ☃, fx fx1) {
/* 25 */     return this.c;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cny.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */