/*    */ import com.mojang.datafixers.kinds.App;
/*    */ import com.mojang.datafixers.kinds.Applicative;
/*    */ import com.mojang.datafixers.util.Function3;
/*    */ import com.mojang.serialization.Codec;
/*    */ import com.mojang.serialization.codecs.RecordCodecBuilder;
/*    */ 
/*    */ 
/*    */ public class bfk
/*    */ {
/* 10 */   private static final int[] b = new int[] { 0, 10, 70, 150, 250 };
/*    */   static {
/* 12 */     a = RecordCodecBuilder.create(☃ -> ☃.group((App)gm.ah.fieldOf("type").orElseGet(()).forGetter(()), (App)gm.ai.fieldOf("profession").orElseGet(()).forGetter(()), (App)Codec.INT.fieldOf("level").orElse(Integer.valueOf(1)).forGetter(())).apply((Applicative)☃, bfk::new));
/*    */   }
/*    */ 
/*    */   
/*    */   public static final Codec<bfk> a;
/*    */   
/*    */   private final bfo c;
/*    */   private final bfm d;
/*    */   private final int e;
/*    */   
/*    */   public bfk(bfo ☃, bfm bfm1, int i) {
/* 23 */     this.c = ☃;
/* 24 */     this.d = bfm1;
/* 25 */     this.e = Math.max(1, i);
/*    */   }
/*    */   
/*    */   public bfo a() {
/* 29 */     return this.c;
/*    */   }
/*    */   
/*    */   public bfm b() {
/* 33 */     return this.d;
/*    */   }
/*    */   
/*    */   public int c() {
/* 37 */     return this.e;
/*    */   }
/*    */   
/*    */   public bfk a(bfo ☃) {
/* 41 */     return new bfk(☃, this.d, this.e);
/*    */   }
/*    */   
/*    */   public bfk a(bfm ☃) {
/* 45 */     return new bfk(this.c, ☃, this.e);
/*    */   }
/*    */   
/*    */   public bfk a(int ☃) {
/* 49 */     return new bfk(this.c, this.d, ☃);
/*    */   }
/*    */   
/*    */   public static int b(int ☃) {
/* 53 */     return d(☃) ? b[☃ - 1] : 0;
/*    */   }
/*    */   
/*    */   public static int c(int ☃) {
/* 57 */     return d(☃) ? b[☃] : 0;
/*    */   }
/*    */   
/*    */   public static boolean d(int ☃) {
/* 61 */     return (☃ >= 1 && ☃ < 5);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bfk.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */