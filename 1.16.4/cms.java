/*    */ 
/*    */ public class cms implements cma {
/*    */   public static final Codec<cms> a;
/*    */   
/*    */   static {
/*  6 */     a = Codec.BOOL.fieldOf("is_beached").orElse(Boolean.valueOf(false)).xmap(cms::new, ☃ -> Boolean.valueOf(☃.b)).codec();
/*    */   }
/*    */   public final boolean b;
/*    */   
/*    */   public cms(boolean ☃) {
/* 11 */     this.b = ☃;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cms.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */