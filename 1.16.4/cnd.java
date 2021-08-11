/*    */ import com.mojang.datafixers.kinds.App;
/*    */ import com.mojang.datafixers.kinds.Applicative;
/*    */ import com.mojang.datafixers.util.Function6;
/*    */ import com.mojang.serialization.Codec;
/*    */ import com.mojang.serialization.codecs.RecordCodecBuilder;
/*    */ import java.util.OptionalInt;
/*    */ 
/*    */ public class cnd extends cnb {
/*    */   static {
/* 10 */     c = RecordCodecBuilder.create(☃ -> ☃.group((App)Codec.intRange(0, 80).fieldOf("limit").orElse(Integer.valueOf(1)).forGetter(()), (App)Codec.intRange(0, 80).fieldOf("upper_limit").orElse(Integer.valueOf(1)).forGetter(()), (App)Codec.intRange(0, 16).fieldOf("lower_size").orElse(Integer.valueOf(0)).forGetter(()), (App)Codec.intRange(0, 16).fieldOf("middle_size").orElse(Integer.valueOf(1)).forGetter(()), (App)Codec.intRange(0, 16).fieldOf("upper_size").orElse(Integer.valueOf(1)).forGetter(()), (App)a()).apply((Applicative)☃, cnd::new));
/*    */   }
/*    */ 
/*    */   
/*    */   public static final Codec<cnd> c;
/*    */   
/*    */   private final int d;
/*    */   
/*    */   private final int e;
/*    */   
/*    */   private final int f;
/*    */   
/*    */   private final int g;
/*    */   private final int h;
/*    */   
/*    */   public cnd(int ☃, int i, int j, int k, int m, OptionalInt optionalInt) {
/* 26 */     super(optionalInt);
/* 27 */     this.d = ☃;
/* 28 */     this.e = i;
/* 29 */     this.f = j;
/* 30 */     this.g = k;
/* 31 */     this.h = m;
/*    */   }
/*    */ 
/*    */   
/*    */   protected cnc<?> b() {
/* 36 */     return cnc.b;
/*    */   }
/*    */ 
/*    */   
/*    */   public int a(int ☃, int i) {
/* 41 */     if (i < this.d) {
/* 42 */       return this.f;
/*    */     }
/* 44 */     if (i >= ☃ - this.e) {
/* 45 */       return this.h;
/*    */     }
/* 47 */     return this.g;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cnd.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */