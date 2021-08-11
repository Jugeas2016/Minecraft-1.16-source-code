/*    */ import com.mojang.serialization.Codec;
/*    */ import java.util.Random;
/*    */ import java.util.function.Function;
/*    */ 
/*    */ public class csh extends csu {
/*    */   public static final Codec<csh> a;
/*    */   
/*    */   static {
/*  9 */     a = ceh.b.fieldOf("block_state").xmap(csh::new, ☃ -> ☃.b).codec();
/*    */   }
/*    */   private final ceh b;
/*    */   
/*    */   public csh(ceh ☃) {
/* 14 */     this.b = ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(ceh ☃, Random random) {
/* 19 */     return (☃ == this.b);
/*    */   }
/*    */ 
/*    */   
/*    */   protected csv<?> a() {
/* 24 */     return csv.c;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\csh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */