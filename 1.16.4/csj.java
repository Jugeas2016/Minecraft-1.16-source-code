/*    */ import com.mojang.brigadier.StringReader;
/*    */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*    */ import com.mojang.serialization.Codec;
/*    */ import javax.annotation.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class csj
/*    */   extends csy
/*    */ {
/* 17 */   public static final Codec<csj> a = Codec.unit(() -> b);
/*    */   
/* 19 */   public static final csj b = new csj();
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @Nullable
/*    */   public ctb.c a(brz ☃, fx fx1, fx fx2, ctb.c c1, ctb.c c2, csx csx1) {
/* 27 */     ceh ceh = c2.b;
/* 28 */     if (ceh.a(bup.mZ)) {
/*    */ 
/*    */ 
/*    */       
/* 32 */       String str = c2.c.l("final_state");
/* 33 */       ei ei = new ei(new StringReader(str), false);
/*    */       try {
/* 35 */         ei.a(true);
/* 36 */       } catch (CommandSyntaxException commandSyntaxException) {
/* 37 */         throw new RuntimeException(commandSyntaxException);
/*    */       } 
/* 39 */       if (ei.b().a(bup.iN)) {
/* 40 */         return null;
/*    */       }
/* 42 */       return new ctb.c(c2.a, ei.b(), null);
/*    */     } 
/*    */     return c2;
/*    */   }
/*    */   protected cta<?> a() {
/* 47 */     return cta.d;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\csj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */