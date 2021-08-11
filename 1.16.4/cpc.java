/*    */ import com.mojang.serialization.Codec;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class cpc<P extends cpb>
/*    */ {
/*  7 */   public static final cpc<cpa> a = a("straight_trunk_placer", cpa.a);
/*  8 */   public static final cpc<cox> b = a("forking_trunk_placer", cox.a);
/*  9 */   public static final cpc<coy> c = a("giant_trunk_placer", coy.a);
/* 10 */   public static final cpc<coz> d = a("mega_jungle_trunk_placer", coz.b);
/* 11 */   public static final cpc<cov> e = a("dark_oak_trunk_placer", cov.a);
/* 12 */   public static final cpc<cow> f = a("fancy_trunk_placer", cow.a);
/*    */   
/*    */   private static <P extends cpb> cpc<P> a(String ☃, Codec<P> codec) {
/* 15 */     return (cpc<P>)gm.<cpc<?>>a(gm.aY, ☃, new cpc(codec));
/*    */   }
/*    */   
/*    */   private final Codec<P> g;
/*    */   
/*    */   private cpc(Codec<P> ☃) {
/* 21 */     this.g = ☃;
/*    */   }
/*    */   
/*    */   public Codec<P> a() {
/* 25 */     return this.g;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cpc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */