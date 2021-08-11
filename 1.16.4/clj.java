/*    */ import com.mojang.datafixers.kinds.App;
/*    */ import com.mojang.datafixers.kinds.Applicative;
/*    */ import com.mojang.serialization.Codec;
/*    */ import com.mojang.serialization.codecs.RecordCodecBuilder;
/*    */ import java.util.Random;
/*    */ import java.util.function.BiFunction;
/*    */ import java.util.function.Supplier;
/*    */ 
/*    */ public class clj {
/*    */   public static final Codec<clj> a;
/*    */   
/*    */   static {
/* 13 */     a = RecordCodecBuilder.create(☃ -> ☃.group((App)civ.b.fieldOf("feature").forGetter(()), (App)Codec.floatRange(0.0F, 1.0F).fieldOf("chance").forGetter(())).apply((Applicative)☃, clj::new));
/*    */   }
/*    */ 
/*    */   
/*    */   public final Supplier<civ<?, ?>> b;
/*    */   
/*    */   public final float c;
/*    */   
/*    */   public clj(civ<?, ?> ☃, float f) {
/* 22 */     this(() -> ☃, f);
/*    */   }
/*    */   
/*    */   private clj(Supplier<civ<?, ?>> ☃, float f) {
/* 26 */     this.b = ☃;
/* 27 */     this.c = f;
/*    */   }
/*    */   
/*    */   public boolean a(bsr ☃, cfy cfy1, Random random, fx fx1) {
/* 31 */     return ((civ)this.b.get()).a(☃, cfy1, random, fx1);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\clj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */