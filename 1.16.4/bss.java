/*    */ import com.mojang.datafixers.kinds.App;
/*    */ import com.mojang.datafixers.kinds.Applicative;
/*    */ import com.mojang.serialization.Codec;
/*    */ import com.mojang.serialization.codecs.RecordCodecBuilder;
/*    */ 
/*    */ public class bss {
/*    */   static {
/*  8 */     a = RecordCodecBuilder.create(☃ -> ☃.group((App)adp.a.fieldOf("sound").forGetter(()), (App)Codec.DOUBLE.fieldOf("tick_chance").forGetter(())).apply((Applicative)☃, bss::new));
/*    */   }
/*    */ 
/*    */   
/*    */   public static final Codec<bss> a;
/*    */   private adp b;
/*    */   private double c;
/*    */   
/*    */   public bss(adp ☃, double d) {
/* 17 */     this.b = ☃;
/* 18 */     this.c = d;
/*    */   }
/*    */   
/*    */   public adp a() {
/* 22 */     return this.b;
/*    */   }
/*    */   
/*    */   public double b() {
/* 26 */     return this.c;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bss.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */