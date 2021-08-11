/*    */ import com.mojang.datafixers.kinds.App;
/*    */ import com.mojang.datafixers.kinds.Applicative;
/*    */ import com.mojang.datafixers.util.Either;
/*    */ import com.mojang.datafixers.util.Function3;
/*    */ import com.mojang.serialization.Codec;
/*    */ import com.mojang.serialization.codecs.RecordCodecBuilder;
/*    */ import java.util.function.Supplier;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class cof
/*    */   extends coh
/*    */ {
/*    */   public static final Codec<cof> a;
/*    */   
/*    */   static {
/* 21 */     a = RecordCodecBuilder.create(☃ -> ☃.group((App)c(), (App)b(), (App)d()).apply((Applicative)☃, cof::new));
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   protected cof(Either<vk, ctb> ☃, Supplier<csz> supplier, cok.a a1) {
/* 28 */     super(☃, supplier, a1);
/*    */   }
/*    */ 
/*    */   
/*    */   protected csx a(bzm ☃, cra cra1, boolean bool) {
/* 33 */     csx csx = super.a(☃, cra1, bool);
/* 34 */     csx.b(cse.b);
/* 35 */     csx.a(cse.d);
/* 36 */     return csx;
/*    */   }
/*    */ 
/*    */   
/*    */   public coj<?> a() {
/* 41 */     return coj.e;
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 46 */     return "LegacySingle[" + this.c + "]";
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cof.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */