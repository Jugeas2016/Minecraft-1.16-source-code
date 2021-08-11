/*    */ import com.mojang.serialization.Codec;
/*    */ import java.util.List;
/*    */ import java.util.function.Function;
/*    */ import java.util.function.Supplier;
/*    */ import java.util.stream.Stream;
/*    */ 
/*    */ public class cmu implements cma {
/*    */   public static final Codec<cmu> a;
/*    */   
/*    */   static {
/* 11 */     a = civ.c.fieldOf("features").xmap(cmu::new, ☃ -> ☃.b).codec();
/*    */   }
/*    */   public final List<Supplier<civ<?, ?>>> b;
/*    */   
/*    */   public cmu(List<Supplier<civ<?, ?>>> ☃) {
/* 16 */     this.b = ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   public Stream<civ<?, ?>> an_() {
/* 21 */     return this.b.stream().flatMap(☃ -> ((civ)☃.get()).d());
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cmu.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */