/*    */ import com.mojang.datafixers.kinds.App;
/*    */ import com.mojang.datafixers.kinds.Applicative;
/*    */ import com.mojang.datafixers.util.Function3;
/*    */ import com.mojang.serialization.Codec;
/*    */ import com.mojang.serialization.codecs.RecordCodecBuilder;
/*    */ 
/*    */ public class cmq implements cma {
/*    */   static {
/*  9 */     a = RecordCodecBuilder.create(☃ -> ☃.group((App)ceh.b.fieldOf("target").forGetter(()), (App)ceh.b.fieldOf("state").forGetter(()), (App)afw.a.fieldOf("radius").forGetter(())).apply((Applicative)☃, cmq::new));
/*    */   }
/*    */ 
/*    */   
/*    */   public static final Codec<cmq> a;
/*    */   
/*    */   public final ceh b;
/*    */   
/*    */   public final ceh c;
/*    */   private final afw d;
/*    */   
/*    */   public cmq(ceh ☃, ceh ceh1, afw afw1) {
/* 21 */     this.b = ☃;
/* 22 */     this.c = ceh1;
/* 23 */     this.d = afw1;
/*    */   }
/*    */   
/*    */   public afw b() {
/* 27 */     return this.d;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cmq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */