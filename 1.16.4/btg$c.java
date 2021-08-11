/*    */ import com.mojang.datafixers.kinds.App;
/*    */ import com.mojang.datafixers.kinds.Applicative;
/*    */ import com.mojang.datafixers.util.Function4;
/*    */ import com.mojang.serialization.Codec;
/*    */ import com.mojang.serialization.codecs.RecordCodecBuilder;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class c
/*    */   extends afz.a
/*    */ {
/*    */   public static final Codec<c> b;
/*    */   public final aqe<?> c;
/*    */   public final int d;
/*    */   public final int e;
/*    */   
/*    */   static {
/* 74 */     b = RecordCodecBuilder.create(☃ -> ☃.group((App)gm.S.fieldOf("type").forGetter(()), (App)Codec.INT.fieldOf("weight").forGetter(()), (App)Codec.INT.fieldOf("minCount").forGetter(()), (App)Codec.INT.fieldOf("maxCount").forGetter(())).apply((Applicative)☃, c::new));
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public c(aqe<?> ☃, int i, int j, int k) {
/* 86 */     super(i);
/* 87 */     this.c = (☃.e() == aqo.f) ? aqe.ah : ☃;
/* 88 */     this.d = j;
/* 89 */     this.e = k;
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 94 */     return aqe.a(this.c) + "*(" + this.d + "-" + this.e + "):" + this.a;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\btg$c.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */