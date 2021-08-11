/*    */ import com.google.common.collect.ImmutableMap;
/*    */ import java.util.Map;
/*    */ import java.util.Optional;
/*    */ import net.minecraft.server.MinecraftServer;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class arr
/*    */   extends arv<bfj>
/*    */ {
/*    */   public arr() {
/* 25 */     super((Map<ayd<?>, aye>)ImmutableMap.of(ayd.d, aye.a));
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   protected boolean a(aag ☃, bfj bfj1) {
/* 32 */     fx fx = ((gf)bfj1.cJ().<gf>c(ayd.d).get()).b();
/* 33 */     return (fx.a(bfj1.cA(), 2.0D) || bfj1.eZ());
/*    */   }
/*    */ 
/*    */   
/*    */   protected void a(aag ☃, bfj bfj1, long l) {
/* 38 */     gf gf = bfj1.cJ().<gf>c(ayd.d).get();
/* 39 */     bfj1.cJ().b(ayd.d);
/* 40 */     bfj1.cJ().a(ayd.c, gf);
/*    */     
/* 42 */     ☃.a(bfj1, (byte)14);
/*    */     
/* 44 */     if (bfj1.eX().b() != bfm.a) {
/*    */       return;
/*    */     }
/* 47 */     MinecraftServer minecraftServer = ☃.l();
/* 48 */     Optional.<aag>ofNullable(minecraftServer.a(gf.a()))
/* 49 */       .flatMap(aag1 -> aag1.y().c(☃.b()))
/* 50 */       .flatMap(☃ -> gm.ai.g().filter(()).findFirst())
/* 51 */       .ifPresent(bfm1 -> {
/*    */           ☃.a(☃.eX().a(bfm1));
/*    */           ☃.c(aag1);
/*    */         });
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\arr.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */