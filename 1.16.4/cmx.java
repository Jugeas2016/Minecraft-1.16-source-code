/*    */ import com.mojang.datafixers.kinds.App;
/*    */ import com.mojang.serialization.Codec;
/*    */ import com.mojang.serialization.codecs.RecordCodecBuilder;
/*    */ 
/*    */ public class cmx {
/*    */   static {
/*  7 */     a = RecordCodecBuilder.create(☃ -> ☃.group((App)Codec.intRange(0, 1023).fieldOf("distance").forGetter(cmx::a), (App)Codec.intRange(0, 1023).fieldOf("spread").forGetter(cmx::b), (App)Codec.intRange(1, 4095).fieldOf("count").forGetter(cmx::c)).apply((Applicative)☃, cmx::new));
/*    */   }
/*    */ 
/*    */   
/*    */   public static final Codec<cmx> a;
/*    */   
/*    */   private final int b;
/*    */   private final int c;
/*    */   private final int d;
/*    */   
/*    */   public cmx(int ☃, int i, int j) {
/* 18 */     this.b = ☃;
/* 19 */     this.c = i;
/* 20 */     this.d = j;
/*    */   }
/*    */   
/*    */   public int a() {
/* 24 */     return this.b;
/*    */   }
/*    */   
/*    */   public int b() {
/* 28 */     return this.c;
/*    */   }
/*    */   
/*    */   public int c() {
/* 32 */     return this.d;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cmx.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */