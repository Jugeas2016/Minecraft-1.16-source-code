/*    */ import com.mojang.datafixers.kinds.App;
/*    */ import com.mojang.datafixers.kinds.Applicative;
/*    */ import com.mojang.serialization.Codec;
/*    */ import com.mojang.serialization.codecs.RecordCodecBuilder;
/*    */ import java.util.Optional;
/*    */ import java.util.function.BiFunction;
/*    */ 
/*    */ public class clz implements cma {
/*    */   static {
/* 10 */     a = RecordCodecBuilder.create(☃ -> ☃.group((App)fx.a.optionalFieldOf("exit").forGetter(()), (App)Codec.BOOL.fieldOf("exact").forGetter(())).apply((Applicative)☃, clz::new));
/*    */   }
/*    */ 
/*    */   
/*    */   public static final Codec<clz> a;
/*    */   private final Optional<fx> b;
/*    */   private final boolean c;
/*    */   
/*    */   private clz(Optional<fx> ☃, boolean bool) {
/* 19 */     this.b = ☃;
/* 20 */     this.c = bool;
/*    */   }
/*    */   
/*    */   public static clz a(fx ☃, boolean bool) {
/* 24 */     return new clz(Optional.of(☃), bool);
/*    */   }
/*    */   
/*    */   public static clz b() {
/* 28 */     return new clz(Optional.empty(), false);
/*    */   }
/*    */   
/*    */   public Optional<fx> c() {
/* 32 */     return this.b;
/*    */   }
/*    */   
/*    */   public boolean d() {
/* 36 */     return this.c;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\clz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */