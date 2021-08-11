/*    */ import com.mojang.datafixers.kinds.App;
/*    */ import com.mojang.datafixers.util.Function3;
/*    */ import com.mojang.serialization.Codec;
/*    */ import com.mojang.serialization.codecs.RecordCodecBuilder;
/*    */ 
/*    */ public class cmb implements cma {
/*    */   static {
/*  8 */     a = RecordCodecBuilder.create(☃ -> ☃.group((App)cnt.a.fieldOf("cap_provider").forGetter(()), (App)cnt.a.fieldOf("stem_provider").forGetter(()), (App)Codec.INT.fieldOf("foliage_radius").orElse(Integer.valueOf(2)).forGetter(())).apply((Applicative)☃, cmb::new));
/*    */   }
/*    */ 
/*    */   
/*    */   public static final Codec<cmb> a;
/*    */   
/*    */   public final cnt b;
/*    */   public final cnt c;
/*    */   public final int d;
/*    */   
/*    */   public cmb(cnt ☃, cnt cnt1, int i) {
/* 19 */     this.b = ☃;
/* 20 */     this.c = cnt1;
/* 21 */     this.d = i;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cmb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */