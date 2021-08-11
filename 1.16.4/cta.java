/*    */ import com.mojang.datafixers.util.Either;
/*    */ import com.mojang.serialization.Codec;
/*    */ import java.util.function.Function;
/*    */ import java.util.function.Supplier;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public interface cta<P extends csy>
/*    */ {
/* 11 */   public static final cta<cse> a = a("block_ignore", cse.a);
/* 12 */   public static final cta<csg> b = a("block_rot", csg.a);
/* 13 */   public static final cta<csi> c = a("gravity", csi.a);
/* 14 */   public static final cta<csj> d = a("jigsaw_replacement", csj.a);
/* 15 */   public static final cta<cst> e = a("rule", cst.a);
/* 16 */   public static final cta<csm> f = a("nop", csm.a);
/* 17 */   public static final cta<csd> g = a("block_age", csd.a);
/* 18 */   public static final cta<csc> h = a("blackstone_replace", csc.a);
/* 19 */   public static final cta<csk> i = a("lava_submerged_block", csk.a);
/*    */   
/* 21 */   public static final Codec<csy> j = gm.bd.dispatch("processor_type", csy::a, cta::codec);
/*    */   
/* 23 */   public static final Codec<csz> k = j.listOf().xmap(csz::new, csz::a);
/*    */   
/*    */   public static final Codec<csz> l;
/*    */ 
/*    */   
/*    */   static {
/* 29 */     l = Codec.either(k.fieldOf("processors").codec(), k).xmap(☃ -> (csz)☃.map((), ()), Either::left);
/*    */   }
/*    */ 
/*    */   
/* 33 */   public static final Codec<Supplier<csz>> m = vf.a(gm.aw, l);
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   static <P extends csy> cta<P> a(String ☃, Codec<P> codec) {
/* 39 */     return (cta<P>)gm.<cta<?>>a(gm.bd, ☃, () -> ☃);
/*    */   }
/*    */   
/*    */   Codec<P> codec();
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cta.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */