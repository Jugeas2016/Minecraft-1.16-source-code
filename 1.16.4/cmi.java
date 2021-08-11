/*    */ import com.mojang.datafixers.kinds.App;
/*    */ import com.mojang.datafixers.util.Function3;
/*    */ import com.mojang.serialization.Codec;
/*    */ import com.mojang.serialization.codecs.RecordCodecBuilder;
/*    */ 
/*    */ public class cmi implements cma {
/*    */   static {
/*  8 */     a = RecordCodecBuilder.create(☃ -> ☃.group((App)crm.b.c.fieldOf("biome_temp").forGetter(()), (App)Codec.floatRange(0.0F, 1.0F).fieldOf("large_probability").forGetter(()), (App)Codec.floatRange(0.0F, 1.0F).fieldOf("cluster_probability").forGetter(())).apply((Applicative)☃, cmi::new));
/*    */   }
/*    */ 
/*    */   
/*    */   public static final Codec<cmi> a;
/*    */   
/*    */   public final crm.b b;
/*    */   public final float c;
/*    */   public final float d;
/*    */   
/*    */   public cmi(crm.b ☃, float f1, float f2) {
/* 19 */     this.b = ☃;
/* 20 */     this.c = f1;
/* 21 */     this.d = f2;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cmi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */