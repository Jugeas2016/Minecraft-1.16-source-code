/*    */ import com.mojang.serialization.Codec;
/*    */ import com.mojang.serialization.codecs.RecordCodecBuilder;
/*    */ import java.util.Optional;
/*    */ import java.util.OptionalInt;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class cnb
/*    */ {
/* 12 */   public static final Codec<cnb> a = gm.ba.dispatch(cnb::b, cnc::a);
/*    */   protected final OptionalInt b;
/*    */   
/*    */   protected static <S extends cnb> RecordCodecBuilder<S, OptionalInt> a() {
/* 16 */     return Codec.intRange(0, 80).optionalFieldOf("min_clipped_height")
/* 17 */       .xmap(☃ -> (OptionalInt)☃.map(OptionalInt::of).orElse(OptionalInt.empty()), ☃ -> ☃.isPresent() ? Optional.<Integer>of(Integer.valueOf(☃.getAsInt())) : Optional.empty()).forGetter(☃ -> ☃.b);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public cnb(OptionalInt ☃) {
/* 23 */     this.b = ☃;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public OptionalInt c() {
/* 31 */     return this.b;
/*    */   }
/*    */   
/*    */   protected abstract cnc<?> b();
/*    */   
/*    */   public abstract int a(int paramInt1, int paramInt2);
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cnb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */