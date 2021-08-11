/*    */ import com.mojang.datafixers.kinds.App;
/*    */ import com.mojang.datafixers.kinds.Applicative;
/*    */ import com.mojang.datafixers.util.Function4;
/*    */ import com.mojang.serialization.Codec;
/*    */ import com.mojang.serialization.codecs.RecordCodecBuilder;
/*    */ import java.util.List;
/*    */ 
/*    */ public class cly
/*    */   implements cma {
/*    */   static {
/* 11 */     a = RecordCodecBuilder.create(☃ -> ☃.group((App)ceh.b.fieldOf("state").forGetter(()), (App)afw.a(0, 4, 4).fieldOf("radius").forGetter(()), (App)Codec.intRange(0, 4).fieldOf("half_height").forGetter(()), (App)ceh.b.listOf().fieldOf("targets").forGetter(())).apply((Applicative)☃, cly::new));
/*    */   }
/*    */ 
/*    */   
/*    */   public static final Codec<cly> a;
/*    */   
/*    */   public final ceh b;
/*    */   
/*    */   public final afw c;
/*    */   public final int d;
/*    */   public final List<ceh> e;
/*    */   
/*    */   public cly(ceh ☃, afw afw1, int i, List<ceh> list) {
/* 24 */     this.b = ☃;
/* 25 */     this.c = afw1;
/* 26 */     this.d = i;
/* 27 */     this.e = list;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cly.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */