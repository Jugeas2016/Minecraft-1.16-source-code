/*    */ import com.mojang.serialization.Codec;
/*    */ import java.util.Random;
/*    */ import java.util.function.Function;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class cnx
/*    */   extends cnt
/*    */ {
/*    */   public static final Codec<cnx> b;
/*    */   private final buo c;
/*    */   
/*    */   static {
/* 16 */     b = ceh.b.fieldOf("state").xmap(ceg.a::b, buo::n).xmap(cnx::new, ☃ -> ☃.c).codec();
/*    */   }
/*    */ 
/*    */   
/*    */   public cnx(buo ☃) {
/* 21 */     this.c = ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   protected cnu<?> a() {
/* 26 */     return cnu.e;
/*    */   }
/*    */ 
/*    */   
/*    */   public ceh a(Random ☃, fx fx1) {
/* 31 */     gc.a a = gc.a.a(☃);
/* 32 */     return this.c.n().a(bzl.e, a);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cnx.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */