/*    */ import com.mojang.datafixers.kinds.App;
/*    */ import com.mojang.datafixers.kinds.Applicative;
/*    */ import com.mojang.serialization.Codec;
/*    */ import com.mojang.serialization.codecs.RecordCodecBuilder;
/*    */ import java.util.function.BiFunction;
/*    */ import javax.annotation.Nullable;
/*    */ 
/*    */ public class csi
/*    */   extends csy {
/*    */   public static final Codec<csi> a;
/*    */   
/*    */   static {
/* 13 */     a = RecordCodecBuilder.create(☃ -> ☃.group((App)chn.a.g.fieldOf("heightmap").orElse(chn.a.a).forGetter(()), (App)Codec.INT.fieldOf("offset").orElse(Integer.valueOf(0)).forGetter(())).apply((Applicative)☃, csi::new));
/*    */   }
/*    */ 
/*    */   
/*    */   private final chn.a b;
/*    */   
/*    */   private final int c;
/*    */   
/*    */   public csi(chn.a ☃, int i) {
/* 22 */     this.b = ☃;
/* 23 */     this.c = i;
/*    */   }
/*    */ 
/*    */   
/*    */   @Nullable
/*    */   public ctb.c a(brz ☃, fx fx1, fx fx2, ctb.c c1, ctb.c c2, csx csx1) {
/*    */     chn.a a1;
/* 30 */     if (☃ instanceof aag) {
/*    */       
/* 32 */       if (this.b == chn.a.a) {
/* 33 */         a1 = chn.a.b;
/* 34 */       } else if (this.b == chn.a.c) {
/* 35 */         a1 = chn.a.d;
/*    */       } else {
/* 37 */         a1 = this.b;
/*    */       } 
/*    */     } else {
/* 40 */       a1 = this.b;
/*    */     } 
/* 42 */     int i = ☃.a(a1, c2.a.u(), c2.a.w()) + this.c;
/* 43 */     int j = c1.a.v();
/* 44 */     return new ctb.c(new fx(c2.a.u(), i + j, c2.a.w()), c2.b, c2.c);
/*    */   }
/*    */ 
/*    */   
/*    */   protected cta<?> a() {
/* 49 */     return cta.c;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\csi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */