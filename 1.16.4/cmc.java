/*    */ import com.mojang.datafixers.kinds.App;
/*    */ import com.mojang.datafixers.kinds.Applicative;
/*    */ import com.mojang.serialization.Codec;
/*    */ import com.mojang.serialization.codecs.RecordCodecBuilder;
/*    */ import java.util.function.BiFunction;
/*    */ import java.util.function.Supplier;
/*    */ 
/*    */ public class cmc implements cma {
/*    */   static {
/* 10 */     a = RecordCodecBuilder.create(☃ -> ☃.group((App)cok.b.fieldOf("start_pool").forGetter(cmc::c), (App)Codec.intRange(0, 7).fieldOf("size").forGetter(cmc::b)).apply((Applicative)☃, cmc::new));
/*    */   }
/*    */ 
/*    */   
/*    */   public static final Codec<cmc> a;
/*    */   private final Supplier<cok> b;
/*    */   private final int c;
/*    */   
/*    */   public cmc(Supplier<cok> ☃, int i) {
/* 19 */     this.b = ☃;
/* 20 */     this.c = i;
/*    */   }
/*    */   
/*    */   public int b() {
/* 24 */     return this.c;
/*    */   }
/*    */   
/*    */   public Supplier<cok> c() {
/* 28 */     return this.b;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cmc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */