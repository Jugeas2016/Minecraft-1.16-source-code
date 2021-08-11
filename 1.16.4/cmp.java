/*    */ import com.mojang.datafixers.kinds.App;
/*    */ import com.mojang.datafixers.kinds.Applicative;
/*    */ import com.mojang.serialization.codecs.RecordCodecBuilder;
/*    */ import java.util.function.BiFunction;
/*    */ 
/*    */ public class cmp implements cma {
/*    */   static {
/*  8 */     a = RecordCodecBuilder.create(☃ -> ☃.group((App)ceh.b.fieldOf("target").forGetter(()), (App)ceh.b.fieldOf("state").forGetter(())).apply((Applicative)☃, cmp::new));
/*    */   }
/*    */ 
/*    */   
/*    */   public static final Codec<cmp> a;
/*    */   public final ceh b;
/*    */   public final ceh c;
/*    */   
/*    */   public cmp(ceh ☃, ceh ceh1) {
/* 17 */     this.b = ☃;
/* 18 */     this.c = ceh1;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cmp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */