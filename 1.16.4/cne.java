/*    */ import com.mojang.datafixers.kinds.App;
/*    */ import com.mojang.datafixers.kinds.Applicative;
/*    */ import com.mojang.datafixers.util.Function4;
/*    */ import com.mojang.serialization.Codec;
/*    */ import com.mojang.serialization.codecs.RecordCodecBuilder;
/*    */ import java.util.OptionalInt;
/*    */ 
/*    */ public class cne
/*    */   extends cnb {
/*    */   static {
/* 11 */     c = RecordCodecBuilder.create(☃ -> ☃.group((App)Codec.intRange(0, 81).fieldOf("limit").orElse(Integer.valueOf(1)).forGetter(()), (App)Codec.intRange(0, 16).fieldOf("lower_size").orElse(Integer.valueOf(0)).forGetter(()), (App)Codec.intRange(0, 16).fieldOf("upper_size").orElse(Integer.valueOf(1)).forGetter(()), (App)a()).apply((Applicative)☃, cne::new));
/*    */   }
/*    */ 
/*    */   
/*    */   public static final Codec<cne> c;
/*    */   
/*    */   private final int d;
/*    */   
/*    */   private final int e;
/*    */   
/*    */   private final int f;
/*    */   
/*    */   public cne(int ☃, int i, int j) {
/* 24 */     this(☃, i, j, OptionalInt.empty());
/*    */   }
/*    */   
/*    */   public cne(int ☃, int i, int j, OptionalInt optionalInt) {
/* 28 */     super(optionalInt);
/* 29 */     this.d = ☃;
/* 30 */     this.e = i;
/* 31 */     this.f = j;
/*    */   }
/*    */ 
/*    */   
/*    */   protected cnc<?> b() {
/* 36 */     return cnc.a;
/*    */   }
/*    */ 
/*    */   
/*    */   public int a(int ☃, int i) {
/* 41 */     return (i < this.d) ? this.e : this.f;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cne.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */