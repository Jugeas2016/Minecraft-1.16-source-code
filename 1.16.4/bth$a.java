/*    */ import com.mojang.datafixers.kinds.App;
/*    */ import com.mojang.datafixers.kinds.Applicative;
/*    */ import com.mojang.serialization.Codec;
/*    */ import com.mojang.serialization.codecs.RecordCodecBuilder;
/*    */ import it.unimi.dsi.fastutil.doubles.DoubleArrayList;
/*    */ import it.unimi.dsi.fastutil.doubles.DoubleList;
/*    */ import java.util.List;
/*    */ import java.util.function.BiFunction;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ class a
/*    */ {
/*    */   private final int b;
/*    */   private final DoubleList c;
/*    */   public static final Codec<a> a;
/*    */   
/*    */   static {
/* 33 */     a = RecordCodecBuilder.create(☃ -> ☃.group((App)Codec.INT.fieldOf("firstOctave").forGetter(a::a), (App)Codec.DOUBLE.listOf().fieldOf("amplitudes").forGetter(a::b)).apply((Applicative)☃, a::new));
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public a(int ☃, List<Double> list) {
/* 39 */     this.b = ☃;
/* 40 */     this.c = (DoubleList)new DoubleArrayList(list);
/*    */   }
/*    */   
/*    */   public int a() {
/* 44 */     return this.b;
/*    */   }
/*    */   
/*    */   public DoubleList b() {
/* 48 */     return this.c;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bth$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */