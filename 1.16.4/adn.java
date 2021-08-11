/*    */ import com.mojang.datafixers.kinds.App;
/*    */ import com.mojang.serialization.Codec;
/*    */ import com.mojang.serialization.codecs.RecordCodecBuilder;
/*    */ 
/*    */ public class adn {
/*    */   static {
/*  7 */     a = RecordCodecBuilder.create(☃ -> ☃.group((App)adp.a.fieldOf("sound").forGetter(()), (App)Codec.INT.fieldOf("min_delay").forGetter(()), (App)Codec.INT.fieldOf("max_delay").forGetter(()), (App)Codec.BOOL.fieldOf("replace_current_music").forGetter(())).apply((Applicative)☃, adn::new));
/*    */   }
/*    */ 
/*    */   
/*    */   public static final Codec<adn> a;
/*    */   
/*    */   private final adp b;
/*    */   
/*    */   private final int c;
/*    */   private final int d;
/*    */   private final boolean e;
/*    */   
/*    */   public adn(adp ☃, int i, int j, boolean bool) {
/* 20 */     this.b = ☃;
/* 21 */     this.c = i;
/* 22 */     this.d = j;
/* 23 */     this.e = bool;
/*    */   }
/*    */   
/*    */   public adp a() {
/* 27 */     return this.b;
/*    */   }
/*    */   
/*    */   public int b() {
/* 31 */     return this.c;
/*    */   }
/*    */   
/*    */   public int c() {
/* 35 */     return this.d;
/*    */   }
/*    */   
/*    */   public boolean d() {
/* 39 */     return this.e;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\adn.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */