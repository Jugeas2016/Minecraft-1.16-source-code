/*    */ import com.mojang.datafixers.kinds.App;
/*    */ import com.mojang.datafixers.kinds.Applicative;
/*    */ import com.mojang.datafixers.util.Function3;
/*    */ import com.mojang.serialization.Codec;
/*    */ import com.mojang.serialization.codecs.RecordCodecBuilder;
/*    */ import java.util.List;
/*    */ import java.util.Optional;
/*    */ import javax.annotation.Nullable;
/*    */ 
/*    */ public class cmv
/*    */   implements cma {
/*    */   static {
/* 13 */     a = RecordCodecBuilder.create(☃ -> ☃.group((App)Codec.BOOL.fieldOf("crystal_invulnerable").orElse(Boolean.valueOf(false)).forGetter(()), (App)ckx.a.a.listOf().fieldOf("spikes").forGetter(()), (App)fx.a.optionalFieldOf("crystal_beam_target").forGetter(())).apply((Applicative)☃, cmv::new));
/*    */   }
/*    */ 
/*    */   
/*    */   public static final Codec<cmv> a;
/*    */   
/*    */   private final boolean b;
/*    */   private final List<ckx.a> c;
/*    */   @Nullable
/*    */   private final fx d;
/*    */   
/*    */   public cmv(boolean ☃, List<ckx.a> list, @Nullable fx fx1) {
/* 25 */     this(☃, list, Optional.ofNullable(fx1));
/*    */   }
/*    */   
/*    */   private cmv(boolean ☃, List<ckx.a> list, Optional<fx> optional) {
/* 29 */     this.b = ☃;
/* 30 */     this.c = list;
/* 31 */     this.d = optional.orElse(null);
/*    */   }
/*    */   
/*    */   public boolean b() {
/* 35 */     return this.b;
/*    */   }
/*    */   
/*    */   public List<ckx.a> c() {
/* 39 */     return this.c;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public fx d() {
/* 44 */     return this.d;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cmv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */