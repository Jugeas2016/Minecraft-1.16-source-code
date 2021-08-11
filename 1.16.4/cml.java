/*    */ import com.mojang.datafixers.kinds.App;
/*    */ import com.mojang.datafixers.kinds.Applicative;
/*    */ import com.mojang.serialization.Codec;
/*    */ import com.mojang.serialization.codecs.RecordCodecBuilder;
/*    */ import java.util.function.BiFunction;
/*    */ import java.util.function.Supplier;
/*    */ import java.util.stream.Stream;
/*    */ 
/*    */ public class cml implements cma {
/*    */   static {
/* 11 */     a = RecordCodecBuilder.create(☃ -> ☃.group((App)civ.b.fieldOf("feature_true").forGetter(()), (App)civ.b.fieldOf("feature_false").forGetter(())).apply((Applicative)☃, cml::new));
/*    */   }
/*    */ 
/*    */   
/*    */   public static final Codec<cml> a;
/*    */   public final Supplier<civ<?, ?>> b;
/*    */   public final Supplier<civ<?, ?>> c;
/*    */   
/*    */   public cml(Supplier<civ<?, ?>> ☃, Supplier<civ<?, ?>> supplier1) {
/* 20 */     this.b = ☃;
/* 21 */     this.c = supplier1;
/*    */   }
/*    */ 
/*    */   
/*    */   public Stream<civ<?, ?>> an_() {
/* 26 */     return Stream.concat(((civ)this.b.get()).d(), ((civ)this.c.get()).d());
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cml.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */