/*    */ import com.mojang.datafixers.kinds.App;
/*    */ import com.mojang.datafixers.kinds.Applicative;
/*    */ import com.mojang.serialization.Codec;
/*    */ import com.mojang.serialization.codecs.RecordCodecBuilder;
/*    */ import java.util.function.BiFunction;
/*    */ import java.util.function.Supplier;
/*    */ import java.util.stream.Stream;
/*    */ 
/*    */ public class clv implements cma {
/*    */   public static final Codec<clv> a;
/*    */   
/*    */   static {
/* 13 */     a = RecordCodecBuilder.create(☃ -> ☃.group((App)civ.b.fieldOf("feature").forGetter(()), (App)cpo.a.fieldOf("decorator").forGetter(())).apply((Applicative)☃, clv::new));
/*    */   }
/*    */ 
/*    */   
/*    */   public final Supplier<civ<?, ?>> b;
/*    */   
/*    */   public final cpo<?> c;
/*    */   
/*    */   public clv(Supplier<civ<?, ?>> ☃, cpo<?> cpo1) {
/* 22 */     this.b = ☃;
/* 23 */     this.c = cpo1;
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 28 */     return String.format("< %s [%s | %s] >", new Object[] { getClass().getSimpleName(), gm.aE.b((cjl<?>)((civ)this.b.get()).b()), this.c });
/*    */   }
/*    */ 
/*    */   
/*    */   public Stream<civ<?, ?>> an_() {
/* 33 */     return ((civ)this.b.get()).d();
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\clv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */