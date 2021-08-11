/*    */ import com.mojang.datafixers.kinds.App;
/*    */ import com.mojang.datafixers.kinds.Applicative;
/*    */ import com.mojang.datafixers.util.Function4;
/*    */ import com.mojang.serialization.Codec;
/*    */ import com.mojang.serialization.codecs.RecordCodecBuilder;
/*    */ import java.util.List;
/*    */ 
/*    */ public class cmt implements cma {
/*    */   static {
/* 10 */     a = RecordCodecBuilder.create(☃ -> ☃.group((App)ceh.b.fieldOf("to_place").forGetter(()), (App)ceh.b.listOf().fieldOf("place_on").forGetter(()), (App)ceh.b.listOf().fieldOf("place_in").forGetter(()), (App)ceh.b.listOf().fieldOf("place_under").forGetter(())).apply((Applicative)☃, cmt::new));
/*    */   }
/*    */ 
/*    */   
/*    */   public static final Codec<cmt> a;
/*    */   
/*    */   public final ceh b;
/*    */   
/*    */   public final List<ceh> c;
/*    */   public final List<ceh> d;
/*    */   public final List<ceh> e;
/*    */   
/*    */   public cmt(ceh ☃, List<ceh> list1, List<ceh> list2, List<ceh> list3) {
/* 23 */     this.b = ☃;
/* 24 */     this.c = list1;
/* 25 */     this.d = list2;
/* 26 */     this.e = list3;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cmt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */