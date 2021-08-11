/*    */ import com.mojang.datafixers.kinds.App;
/*    */ import com.mojang.datafixers.kinds.Applicative;
/*    */ import com.mojang.datafixers.util.Function4;
/*    */ import com.mojang.serialization.Codec;
/*    */ import com.mojang.serialization.codecs.RecordCodecBuilder;
/*    */ 
/*    */ public class bst
/*    */ {
/*    */   static {
/* 10 */     a = RecordCodecBuilder.create(☃ -> ☃.group((App)adp.a.fieldOf("sound").forGetter(()), (App)Codec.INT.fieldOf("tick_delay").forGetter(()), (App)Codec.INT.fieldOf("block_search_extent").forGetter(()), (App)Codec.DOUBLE.fieldOf("offset").forGetter(())).apply((Applicative)☃, bst::new));
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public static final Codec<bst> a;
/*    */   
/* 17 */   public static final bst b = new bst(adq.a, 6000, 8, 2.0D);
/*    */ 
/*    */   
/*    */   private adp c;
/*    */   
/*    */   private int d;
/*    */   
/*    */   private int e;
/*    */   
/*    */   private double f;
/*    */ 
/*    */   
/*    */   public bst(adp ☃, int i, int j, double d) {
/* 30 */     this.c = ☃;
/* 31 */     this.d = i;
/* 32 */     this.e = j;
/* 33 */     this.f = d;
/*    */   }
/*    */   
/*    */   public adp a() {
/* 37 */     return this.c;
/*    */   }
/*    */   
/*    */   public int b() {
/* 41 */     return this.d;
/*    */   }
/*    */   
/*    */   public int c() {
/* 45 */     return this.e;
/*    */   }
/*    */   
/*    */   public double d() {
/* 49 */     return this.f;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bst.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */