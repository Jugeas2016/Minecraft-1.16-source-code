/*    */ import java.util.function.Function;
/*    */ 
/*    */ public class cmr implements cma {
/*    */   public static final Codec<cmr> a;
/*    */   
/*    */   static {
/*  7 */     a = ckp.b.h.fieldOf("portal_type").xmap(cmr::new, ☃ -> ☃.b).codec();
/*    */   }
/*    */   public final ckp.b b;
/*    */   
/*    */   public cmr(ckp.b ☃) {
/* 12 */     this.b = ☃;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cmr.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */