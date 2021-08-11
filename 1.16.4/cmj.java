/*    */ import com.mojang.datafixers.kinds.App;
/*    */ import com.mojang.datafixers.kinds.Applicative;
/*    */ import com.mojang.datafixers.util.Function3;
/*    */ import com.mojang.serialization.Codec;
/*    */ import com.mojang.serialization.codecs.RecordCodecBuilder;
/*    */ 
/*    */ public class cmj
/*    */   implements cma {
/*    */   public static final Codec<cmj> a;
/*    */   public final csu b;
/*    */   
/*    */   static {
/* 13 */     a = RecordCodecBuilder.create(☃ -> ☃.group((App)csu.c.fieldOf("target").forGetter(()), (App)ceh.b.fieldOf("state").forGetter(()), (App)Codec.intRange(0, 64).fieldOf("size").forGetter(())).apply((Applicative)☃, cmj::new));
/*    */   }
/*    */   
/*    */   public final int c;
/*    */   public final ceh d;
/*    */   
/*    */   public static final class a {
/* 20 */     public static final csu a = new ctc(aed.aH);
/* 21 */     public static final csu b = new csf(bup.cL);
/* 22 */     public static final csu c = new ctc(aed.aI);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public cmj(csu ☃, ceh ceh1, int i) {
/* 30 */     this.c = i;
/* 31 */     this.d = ceh1;
/* 32 */     this.b = ☃;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cmj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */