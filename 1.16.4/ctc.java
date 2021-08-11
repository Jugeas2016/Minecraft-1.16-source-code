/*    */ import com.mojang.serialization.Codec;
/*    */ import java.util.Random;
/*    */ import java.util.function.Function;
/*    */ 
/*    */ public class ctc
/*    */   extends csu
/*    */ {
/*    */   public static final Codec<ctc> a;
/*    */   private final ael<buo> b;
/*    */   
/*    */   static {
/* 12 */     a = ael.<T>a(() -> aeh.a().a()).fieldOf("tag").xmap(ctc::new, ☃ -> ☃.b).codec();
/*    */   }
/*    */ 
/*    */   
/*    */   public ctc(ael<buo> ☃) {
/* 17 */     this.b = ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(ceh ☃, Random random) {
/* 22 */     return ☃.a(this.b);
/*    */   }
/*    */ 
/*    */   
/*    */   protected csv<?> a() {
/* 27 */     return csv.d;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ctc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */