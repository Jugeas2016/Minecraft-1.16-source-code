/*    */ import com.mojang.authlib.GameProfile;
/*    */ import java.net.SocketAddress;
/*    */ import net.minecraft.server.MinecraftServer;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class enf
/*    */   extends acu
/*    */ {
/*    */   private md a;
/*    */   
/*    */   public enf(eng ☃, gn.b b1, cyk cyk1) {
/* 18 */     super(☃, b1, cyk1, 8);
/*    */     
/* 20 */     a(10);
/*    */   }
/*    */ 
/*    */   
/*    */   protected void b(aah ☃) {
/* 25 */     if (☃.R().getString().equals(b().N())) {
/* 26 */       this.a = ☃.e(new md());
/*    */     }
/*    */     
/* 29 */     super.b(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public nr a(SocketAddress ☃, GameProfile gameProfile) {
/* 34 */     if (gameProfile.getName().equalsIgnoreCase(b().N()) && a(gameProfile.getName()) != null) {
/* 35 */       return new of("multiplayer.disconnect.name_taken");
/*    */     }
/*    */     
/* 38 */     return super.a(☃, gameProfile);
/*    */   }
/*    */ 
/*    */   
/*    */   public eng b() {
/* 43 */     return (eng)super.c();
/*    */   }
/*    */ 
/*    */   
/*    */   public md q() {
/* 48 */     return this.a;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\enf.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */