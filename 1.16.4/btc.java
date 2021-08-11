/*    */ import com.mojang.datafixers.kinds.App;
/*    */ import com.mojang.datafixers.kinds.Applicative;
/*    */ import com.mojang.serialization.Codec;
/*    */ import com.mojang.serialization.codecs.RecordCodecBuilder;
/*    */ import java.util.List;
/*    */ import java.util.function.Supplier;
/*    */ 
/*    */ public class btc extends bsy {
/*    */   static {
/* 10 */     e = RecordCodecBuilder.create(☃ -> ☃.group((App)bsv.e.fieldOf("biomes").forGetter(()), (App)Codec.intRange(0, 62).fieldOf("scale").orElse(Integer.valueOf(2)).forGetter(())).apply((Applicative)☃, btc::new));
/*    */   }
/*    */ 
/*    */   
/*    */   public static final Codec<btc> e;
/*    */   private final List<Supplier<bsv>> f;
/*    */   private final int g;
/*    */   private final int h;
/*    */   
/*    */   public btc(List<Supplier<bsv>> ☃, int i) {
/* 20 */     super(☃.stream());
/* 21 */     this.f = ☃;
/* 22 */     this.g = i + 2;
/* 23 */     this.h = i;
/*    */   }
/*    */ 
/*    */   
/*    */   protected Codec<? extends bsy> a() {
/* 28 */     return (Codec)e;
/*    */   }
/*    */ 
/*    */   
/*    */   public bsy a(long ☃) {
/* 33 */     return this;
/*    */   }
/*    */ 
/*    */   
/*    */   public bsv b(int ☃, int i, int j) {
/* 38 */     return ((Supplier<bsv>)this.f.get(Math.floorMod((☃ >> this.g) + (j >> this.g), this.f.size()))).get();
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\btc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */