/*    */ import com.mojang.datafixers.kinds.App;
/*    */ import com.mojang.serialization.Codec;
/*    */ import com.mojang.serialization.codecs.RecordCodecBuilder;
/*    */ import java.util.List;
/*    */ import java.util.function.BiFunction;
/*    */ import java.util.function.Supplier;
/*    */ import java.util.stream.Stream;
/*    */ 
/*    */ public class cmm implements cma {
/*    */   public static final Codec<cmm> a;
/*    */   
/*    */   static {
/* 13 */     a = RecordCodecBuilder.create(☃ -> ☃.apply2(cmm::new, (App)clj.a.listOf().fieldOf("features").forGetter(()), (App)civ.b.fieldOf("default").forGetter(())));
/*    */   }
/*    */ 
/*    */   
/*    */   public final List<clj> b;
/*    */   
/*    */   public final Supplier<civ<?, ?>> c;
/*    */ 
/*    */   
/*    */   public cmm(List<clj> ☃, civ<?, ?> civ1) {
/* 23 */     this(☃, () -> ☃);
/*    */   }
/*    */   
/*    */   private cmm(List<clj> ☃, Supplier<civ<?, ?>> supplier) {
/* 27 */     this.b = ☃;
/* 28 */     this.c = supplier;
/*    */   }
/*    */ 
/*    */   
/*    */   public Stream<civ<?, ?>> an_() {
/* 33 */     return Stream.concat(this.b.stream().flatMap(☃ -> ((civ)☃.b.get()).d()), ((civ)this.c.get()).d());
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cmm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */