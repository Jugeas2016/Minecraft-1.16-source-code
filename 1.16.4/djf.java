/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class djf
/*    */   extends dja
/*    */ {
/*    */   private final long c;
/*    */   private final int d;
/*    */   private final Runnable e;
/*    */   
/*    */   public djf(long ☃, int i, Runnable runnable) {
/* 13 */     this.c = ☃;
/* 14 */     this.d = i;
/* 15 */     this.e = runnable;
/*    */   }
/*    */ 
/*    */   
/*    */   public void run() {
/* 20 */     dgb ☃ = dgb.a();
/*    */     
/* 22 */     b(new of("mco.minigame.world.slot.screen.title"));
/*    */     
/* 24 */     for (int i = 0; i < 25; i++) {
/*    */       try {
/* 26 */         if (c()) {
/*    */           return;
/*    */         }
/*    */         
/* 30 */         if (☃.a(this.c, this.d)) {
/* 31 */           this.e.run();
/*    */           break;
/*    */         } 
/* 34 */       } catch (dhj dhj) {
/* 35 */         if (c()) {
/*    */           return;
/*    */         }
/* 38 */         a(dhj.e);
/* 39 */       } catch (Exception exception) {
/* 40 */         if (c()) {
/*    */           return;
/*    */         }
/* 43 */         a.error("Couldn't switch world!");
/* 44 */         a(exception.toString());
/*    */       } 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\djf.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */