/*    */ import com.mojang.serialization.Codec;
/*    */ import java.util.Random;
/*    */ import java.util.function.Function;
/*    */ 
/*    */ public class csf
/*    */   extends csu {
/*    */   public static final Codec<csf> a;
/*    */   private final buo b;
/*    */   
/*    */   static {
/* 11 */     a = gm.Q.fieldOf("block").xmap(csf::new, ☃ -> ☃.b).codec();
/*    */   }
/*    */ 
/*    */   
/*    */   public csf(buo ☃) {
/* 16 */     this.b = ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(ceh ☃, Random random) {
/* 21 */     return ☃.a(this.b);
/*    */   }
/*    */ 
/*    */   
/*    */   protected csv<?> a() {
/* 26 */     return csv.b;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\csf.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */