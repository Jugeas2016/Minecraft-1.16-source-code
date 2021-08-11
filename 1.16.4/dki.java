/*    */ import com.mojang.bridge.game.GameSession;
/*    */ import java.util.UUID;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class dki
/*    */   implements GameSession
/*    */ {
/*    */   private final int a;
/*    */   private final boolean b;
/*    */   private final String c;
/*    */   private final String d;
/*    */   private final UUID e;
/*    */   
/*    */   public dki(dwt ☃, dzm dzm1, dwu dwu1) {
/* 19 */     this.a = dwu1.e().size();
/* 20 */     this.b = !dwu1.a().d();
/* 21 */     this.c = ☃.ad().c();
/* 22 */     dwx dwx = dwu1.a(dzm1.bS());
/* 23 */     if (dwx != null) {
/* 24 */       this.d = dwx.b().b();
/*    */     } else {
/* 26 */       this.d = "unknown";
/*    */     } 
/* 28 */     this.e = dwu1.m();
/*    */   }
/*    */ 
/*    */   
/*    */   public int getPlayerCount() {
/* 33 */     return this.a;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean isRemoteServer() {
/* 38 */     return this.b;
/*    */   }
/*    */ 
/*    */   
/*    */   public String getDifficulty() {
/* 43 */     return this.c;
/*    */   }
/*    */ 
/*    */   
/*    */   public String getGameMode() {
/* 48 */     return this.d;
/*    */   }
/*    */ 
/*    */   
/*    */   public UUID getSessionId() {
/* 53 */     return this.e;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dki.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */