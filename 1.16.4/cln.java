/*    */ import com.mojang.datafixers.kinds.App;
/*    */ import com.mojang.datafixers.kinds.Applicative;
/*    */ import com.mojang.serialization.Codec;
/*    */ import com.mojang.serialization.codecs.RecordCodecBuilder;
/*    */ import java.util.Random;
/*    */ import java.util.function.BiFunction;
/*    */ 
/*    */ public class cln extends cll {
/*    */   public static final Codec<cln> b;
/*    */   private final int c;
/*    */   private final int d;
/*    */   
/*    */   static {
/* 14 */     b = RecordCodecBuilder.create(☃ -> ☃.group((App)Codec.INT.fieldOf("min_size").forGetter(()), (App)Codec.INT.fieldOf("extra_size").forGetter(())).apply((Applicative)☃, cln::new));
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public cln(int ☃, int i) {
/* 23 */     this.c = ☃;
/* 24 */     this.d = i;
/*    */   }
/*    */ 
/*    */   
/*    */   protected clm<?> a() {
/* 29 */     return clm.c;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(bry ☃, fx fx1, ceh ceh1, Random random) {
/* 34 */     fx.a a = fx1.i();
/* 35 */     int i = this.c + random.nextInt(random.nextInt(this.d + 1) + 1);
/* 36 */     for (int j = 0; j < i; j++) {
/* 37 */       ☃.a(a, ceh1, 2);
/* 38 */       a.c(gc.b);
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cln.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */