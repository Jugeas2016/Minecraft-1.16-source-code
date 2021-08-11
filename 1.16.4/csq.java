/*    */ import com.mojang.datafixers.kinds.App;
/*    */ import com.mojang.datafixers.kinds.Applicative;
/*    */ import com.mojang.datafixers.util.Function5;
/*    */ import com.mojang.serialization.Codec;
/*    */ import com.mojang.serialization.codecs.RecordCodecBuilder;
/*    */ import java.util.Optional;
/*    */ import java.util.Random;
/*    */ import javax.annotation.Nullable;
/*    */ 
/*    */ public class csq
/*    */ {
/*    */   public static final Codec<csq> a;
/*    */   private final csu b;
/*    */   private final csu c;
/*    */   
/*    */   static {
/* 17 */     a = RecordCodecBuilder.create(☃ -> ☃.group((App)csu.c.fieldOf("input_predicate").forGetter(()), (App)csu.c.fieldOf("location_predicate").forGetter(()), (App)cso.c.optionalFieldOf("position_predicate", csn.b).forGetter(()), (App)ceh.b.fieldOf("output_state").forGetter(()), (App)md.a.optionalFieldOf("output_nbt").forGetter(())).apply((Applicative)☃, csq::new));
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   private final cso d;
/*    */ 
/*    */ 
/*    */   
/*    */   private final ceh e;
/*    */ 
/*    */ 
/*    */   
/*    */   @Nullable
/*    */   private final md f;
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public csq(csu ☃, csu csu1, ceh ceh1) {
/* 38 */     this(☃, csu1, csn.b, ceh1, Optional.empty());
/*    */   }
/*    */   
/*    */   public csq(csu ☃, csu csu1, cso cso1, ceh ceh1) {
/* 42 */     this(☃, csu1, cso1, ceh1, Optional.empty());
/*    */   }
/*    */   
/*    */   public csq(csu ☃, csu csu1, cso cso1, ceh ceh1, Optional<md> optional) {
/* 46 */     this.b = ☃;
/* 47 */     this.c = csu1;
/* 48 */     this.d = cso1;
/* 49 */     this.e = ceh1;
/* 50 */     this.f = optional.orElse(null);
/*    */   }
/*    */   
/*    */   public boolean a(ceh ☃, ceh ceh1, fx fx1, fx fx2, fx fx3, Random random) {
/* 54 */     return (this.b.a(☃, random) && this.c.a(ceh1, random) && this.d.a(fx1, fx2, fx3, random));
/*    */   }
/*    */   
/*    */   public ceh a() {
/* 58 */     return this.e;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public md b() {
/* 63 */     return this.f;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\csq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */