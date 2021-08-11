/*    */ import com.mojang.serialization.Codec;
/*    */ 
/*    */ 
/*    */ public abstract class hg<T extends hf>
/*    */ {
/*    */   private final boolean a;
/*    */   private final hf.a<T> b;
/*    */   
/*    */   protected hg(boolean ☃, hf.a<T> a1) {
/* 10 */     this.a = ☃;
/* 11 */     this.b = a1;
/*    */   }
/*    */   
/*    */   public boolean c() {
/* 15 */     return this.a;
/*    */   }
/*    */   
/*    */   public hf.a<T> d() {
/* 19 */     return this.b;
/*    */   }
/*    */   
/*    */   public abstract Codec<T> e();
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\hg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */