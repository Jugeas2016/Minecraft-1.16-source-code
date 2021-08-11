/*    */ import com.mojang.datafixers.kinds.App;
/*    */ import com.mojang.datafixers.kinds.Applicative;
/*    */ import com.mojang.datafixers.util.Either;
/*    */ import com.mojang.serialization.Codec;
/*    */ import com.mojang.serialization.DataResult;
/*    */ import com.mojang.serialization.codecs.RecordCodecBuilder;
/*    */ import java.util.Objects;
/*    */ import java.util.Random;
/*    */ import java.util.function.BiFunction;
/*    */ import java.util.function.Function;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class afw
/*    */ {
/*    */   public static final Codec<afw> a;
/*    */   private final int b;
/*    */   private final int c;
/*    */   
/*    */   static {
/* 27 */     a = Codec.either((Codec)Codec.INT, RecordCodecBuilder.create(☃ -> ☃.group((App)Codec.INT.fieldOf("base").forGetter(()), (App)Codec.INT.fieldOf("spread").forGetter(())).apply((Applicative)☃, afw::new)).comapFlatMap(☃ -> (☃.c < 0) ? DataResult.error("Spread must be non-negative, got: " + ☃.c) : DataResult.success(☃), Function.identity())).xmap(☃ -> (afw)☃.map(afw::a, ()), ☃ -> (☃.c == 0) ? Either.left(Integer.valueOf(☃.b)) : Either.right(☃));
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public static Codec<afw> a(int ☃, int i, int j) {
/* 33 */     Function<afw, DataResult<afw>> function = afw1 -> 
/* 34 */       (afw1.b >= ☃ && afw1.b <= i) ? ((afw1.c <= j) ? DataResult.success(afw1) : DataResult.error("Spread too big: " + afw1.c + " > " + j)) : DataResult.error("Base value out of range: " + afw1.b + " [" + ☃ + "-" + i + "]");
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 42 */     return a.flatXmap(function, function);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   private afw(int ☃, int i) {
/* 49 */     this.b = ☃;
/* 50 */     this.c = i;
/*    */   }
/*    */   
/*    */   public static afw a(int ☃) {
/* 54 */     return new afw(☃, 0);
/*    */   }
/*    */   
/*    */   public static afw a(int ☃, int i) {
/* 58 */     return new afw(☃, i);
/*    */   }
/*    */   
/*    */   public int a(Random ☃) {
/* 62 */     if (this.c == 0) {
/* 63 */       return this.b;
/*    */     }
/* 65 */     return this.b + ☃.nextInt(this.c + 1);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean equals(Object ☃) {
/* 70 */     if (this == ☃) {
/* 71 */       return true;
/*    */     }
/* 73 */     if (☃ == null || getClass() != ☃.getClass()) {
/* 74 */       return false;
/*    */     }
/* 76 */     afw afw1 = (afw)☃;
/* 77 */     return (this.b == afw1.b && this.c == afw1.c);
/*    */   }
/*    */ 
/*    */   
/*    */   public int hashCode() {
/* 82 */     return Objects.hash(new Object[] { Integer.valueOf(this.b), Integer.valueOf(this.c) });
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 87 */     return "[" + this.b + '-' + (this.b + this.c) + ']';
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\afw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */