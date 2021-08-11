/*    */ import com.google.common.collect.ImmutableList;
/*    */ import com.google.common.collect.ImmutableSet;
/*    */ import com.mojang.datafixers.kinds.App;
/*    */ import com.mojang.datafixers.kinds.Applicative;
/*    */ import com.mojang.datafixers.util.Function5;
/*    */ import com.mojang.serialization.Codec;
/*    */ import com.mojang.serialization.codecs.RecordCodecBuilder;
/*    */ import java.util.Set;
/*    */ 
/*    */ public class cmw implements cma {
/*    */   public static final Codec<cmw> a;
/*    */   
/*    */   static {
/* 14 */     a = RecordCodecBuilder.create(☃ -> ☃.group((App)cux.a.fieldOf("state").forGetter(()), (App)Codec.BOOL.fieldOf("requires_block_below").orElse(Boolean.valueOf(true)).forGetter(()), (App)Codec.INT.fieldOf("rock_count").orElse(Integer.valueOf(4)).forGetter(()), (App)Codec.INT.fieldOf("hole_count").orElse(Integer.valueOf(1)).forGetter(()), (App)gm.Q.listOf().fieldOf("valid_blocks").xmap(ImmutableSet::copyOf, ImmutableList::copyOf).forGetter(())).apply((Applicative)☃, cmw::new));
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public final cux b;
/*    */   
/*    */   public final boolean c;
/*    */   
/*    */   public final int d;
/*    */   
/*    */   public final int e;
/*    */   
/*    */   public final Set<buo> f;
/*    */ 
/*    */   
/*    */   public cmw(cux ☃, boolean bool, int i, int j, Set<buo> set) {
/* 31 */     this.b = ☃;
/* 32 */     this.c = bool;
/* 33 */     this.d = i;
/* 34 */     this.e = j;
/* 35 */     this.f = set;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cmw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */