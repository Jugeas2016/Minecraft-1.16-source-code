/*    */ import com.mojang.serialization.Codec;
/*    */ import java.util.Random;
/*    */ import java.util.function.Function;
/*    */ import javax.annotation.Nullable;
/*    */ 
/*    */ public class csg extends csy {
/*    */   public static final Codec<csg> a;
/*    */   private final float b;
/*    */   
/*    */   static {
/* 11 */     a = Codec.FLOAT.fieldOf("integrity").orElse(Float.valueOf(1.0F)).xmap(csg::new, ☃ -> Float.valueOf(☃.b)).codec();
/*    */   }
/*    */ 
/*    */   
/*    */   public csg(float ☃) {
/* 16 */     this.b = ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   @Nullable
/*    */   public ctb.c a(brz ☃, fx fx1, fx fx2, ctb.c c1, ctb.c c2, csx csx1) {
/* 22 */     Random random = csx1.b(c2.a);
/*    */     
/* 24 */     if (this.b >= 1.0F || random.nextFloat() <= this.b) {
/* 25 */       return c2;
/*    */     }
/* 27 */     return null;
/*    */   }
/*    */ 
/*    */   
/*    */   protected cta<?> a() {
/* 32 */     return cta.b;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\csg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */