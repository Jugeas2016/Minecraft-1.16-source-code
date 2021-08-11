/*    */ import com.mojang.datafixers.kinds.App;
/*    */ import com.mojang.datafixers.util.Function3;
/*    */ import com.mojang.serialization.Codec;
/*    */ import com.mojang.serialization.codecs.RecordCodecBuilder;
/*    */ 
/*    */ public class chs {
/*    */   static {
/*  8 */     a = RecordCodecBuilder.create(☃ -> ☃.group((App)Codec.INT.fieldOf("target").forGetter(chs::a), (App)Codec.intRange(0, 256).fieldOf("size").forGetter(chs::b), (App)Codec.INT.fieldOf("offset").forGetter(chs::c)).apply((Applicative)☃, chs::new));
/*    */   }
/*    */ 
/*    */   
/*    */   public static final Codec<chs> a;
/*    */   
/*    */   private final int b;
/*    */   private final int c;
/*    */   private final int d;
/*    */   
/*    */   public chs(int ☃, int i, int j) {
/* 19 */     this.b = ☃;
/* 20 */     this.c = i;
/* 21 */     this.d = j;
/*    */   }
/*    */   
/*    */   public int a() {
/* 25 */     return this.b;
/*    */   }
/*    */   
/*    */   public int b() {
/* 29 */     return this.c;
/*    */   }
/*    */   
/*    */   public int c() {
/* 33 */     return this.d;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\chs.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */