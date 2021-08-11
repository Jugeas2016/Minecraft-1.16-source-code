/*    */ import com.mojang.datafixers.kinds.App;
/*    */ import com.mojang.datafixers.kinds.Applicative;
/*    */ import com.mojang.datafixers.util.Function5;
/*    */ import com.mojang.serialization.Codec;
/*    */ import com.mojang.serialization.codecs.RecordCodecBuilder;
/*    */ import java.util.Random;
/*    */ 
/*    */ public class csb extends cso {
/*    */   public static final Codec<csb> a;
/*    */   
/*    */   static {
/* 12 */     a = RecordCodecBuilder.create(☃ -> ☃.group((App)Codec.FLOAT.fieldOf("min_chance").orElse(Float.valueOf(0.0F)).forGetter(()), (App)Codec.FLOAT.fieldOf("max_chance").orElse(Float.valueOf(0.0F)).forGetter(()), (App)Codec.INT.fieldOf("min_dist").orElse(Integer.valueOf(0)).forGetter(()), (App)Codec.INT.fieldOf("max_dist").orElse(Integer.valueOf(0)).forGetter(()), (App)gc.a.d.fieldOf("axis").orElse(gc.a.b).forGetter(())).apply((Applicative)☃, csb::new));
/*    */   }
/*    */ 
/*    */   
/*    */   private final float b;
/*    */   
/*    */   private final float d;
/*    */   
/*    */   private final int e;
/*    */   
/*    */   private final int f;
/*    */   
/*    */   private final gc.a g;
/*    */   
/*    */   public csb(float ☃, float f1, int i, int j, gc.a a1) {
/* 27 */     if (i >= j) {
/* 28 */       throw new IllegalArgumentException("Invalid range: [" + i + "," + j + "]");
/*    */     }
/* 30 */     this.b = ☃;
/* 31 */     this.d = f1;
/* 32 */     this.e = i;
/* 33 */     this.f = j;
/* 34 */     this.g = a1;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(fx ☃, fx fx1, fx fx2, Random random) {
/* 39 */     gc gc = gc.a(gc.b.a, this.g);
/* 40 */     float f1 = Math.abs((fx1.u() - fx2.u()) * gc.i());
/* 41 */     float f2 = Math.abs((fx1.v() - fx2.v()) * gc.j());
/* 42 */     float f3 = Math.abs((fx1.w() - fx2.w()) * gc.k());
/* 43 */     int i = (int)(f1 + f2 + f3);
/*    */     
/* 45 */     float f4 = random.nextFloat();
/* 46 */     return (f4 <= afm.b(this.b, this.d, afm.c(i, this.e, this.f)));
/*    */   }
/*    */ 
/*    */   
/*    */   protected csp<?> a() {
/* 51 */     return csp.c;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\csb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */