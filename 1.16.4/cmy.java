/*    */ import com.mojang.datafixers.kinds.App;
/*    */ import com.mojang.datafixers.kinds.Applicative;
/*    */ import com.mojang.datafixers.util.Function3;
/*    */ import com.mojang.serialization.Codec;
/*    */ import com.mojang.serialization.DataResult;
/*    */ import com.mojang.serialization.codecs.RecordCodecBuilder;
/*    */ import java.util.function.Function;
/*    */ 
/*    */ public class cmy {
/*    */   public static final Codec<cmy> a;
/*    */   private final int b;
/*    */   
/*    */   static {
/* 14 */     a = RecordCodecBuilder.create(☃ -> ☃.group((App)Codec.intRange(0, 4096).fieldOf("spacing").forGetter(()), (App)Codec.intRange(0, 4096).fieldOf("separation").forGetter(()), (App)Codec.intRange(0, 2147483647).fieldOf("salt").forGetter(())).apply((Applicative)☃, cmy::new)).comapFlatMap(☃ -> (☃.b <= ☃.c) ? DataResult.error("Spacing has to be smaller than separation") : DataResult.success(☃), 
/*    */ 
/*    */ 
/*    */ 
/*    */         
/* 19 */         Function.identity());
/*    */   }
/*    */   
/*    */   private final int c;
/*    */   private final int d;
/*    */   
/*    */   public cmy(int ☃, int i, int j) {
/* 26 */     this.b = ☃;
/* 27 */     this.c = i;
/* 28 */     this.d = j;
/*    */   }
/*    */   
/*    */   public int a() {
/* 32 */     return this.b;
/*    */   }
/*    */   
/*    */   public int b() {
/* 36 */     return this.c;
/*    */   }
/*    */   
/*    */   public int c() {
/* 40 */     return this.d;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cmy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */