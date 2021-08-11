/*    */ import com.mojang.datafixers.kinds.App;
/*    */ import com.mojang.datafixers.kinds.Applicative;
/*    */ import com.mojang.datafixers.util.Function5;
/*    */ import com.mojang.serialization.Codec;
/*    */ import com.mojang.serialization.codecs.RecordCodecBuilder;
/*    */ 
/*    */ public class cjq
/*    */   implements cma {
/*    */   static {
/* 10 */     a = RecordCodecBuilder.create(☃ -> ☃.group((App)ceh.b.fieldOf("valid_base_block").forGetter(()), (App)ceh.b.fieldOf("stem_state").forGetter(()), (App)ceh.b.fieldOf("hat_state").forGetter(()), (App)ceh.b.fieldOf("decor_state").forGetter(()), (App)Codec.BOOL.fieldOf("planted").orElse(Boolean.valueOf(false)).forGetter(())).apply((Applicative)☃, cjq::new));
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public static final Codec<cjq> a;
/*    */ 
/*    */   
/* 18 */   public static final cjq b = new cjq(bup.mu.n(), bup.mq.n(), bup.iK.n(), bup.mw.n(), true);
/* 19 */   public static final cjq c = new cjq(b.f, b.g, b.h, b.i, false);
/* 20 */   public static final cjq d = new cjq(bup.ml.n(), bup.mh.n(), bup.mn.n(), bup.mw.n(), true);
/* 21 */   public static final cjq e = new cjq(d.f, d.g, d.h, d.i, false);
/*    */   
/*    */   public final ceh f;
/*    */   public final ceh g;
/*    */   public final ceh h;
/*    */   public final ceh i;
/*    */   public final boolean j;
/*    */   
/*    */   public cjq(ceh ☃, ceh ceh1, ceh ceh2, ceh ceh3, boolean bool) {
/* 30 */     this.f = ☃;
/* 31 */     this.g = ceh1;
/* 32 */     this.h = ceh2;
/* 33 */     this.i = ceh3;
/* 34 */     this.j = bool;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cjq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */