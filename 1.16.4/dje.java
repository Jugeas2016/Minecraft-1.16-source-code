/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class dje
/*    */   extends dja
/*    */ {
/*    */   private final long c;
/*    */   private final dhe d;
/*    */   private final dhs e;
/*    */   
/*    */   public dje(long ☃, dhe dhe1, dhs dhs1) {
/* 15 */     this.c = ☃;
/* 16 */     this.d = dhe1;
/* 17 */     this.e = dhs1;
/*    */   }
/*    */ 
/*    */   
/*    */   public void run() {
/* 22 */     dgb ☃ = dgb.a();
/* 23 */     b(new of("mco.minigame.world.starting.screen.title"));
/*    */     
/* 25 */     for (int i = 0; i < 25; i++) {
/*    */       try {
/* 27 */         if (c()) {
/*    */           return;
/*    */         }
/*    */         
/* 31 */         if (☃.d(this.c, this.d.a).booleanValue()) {
/* 32 */           a(this.e);
/*    */           break;
/*    */         } 
/* 35 */       } catch (dhj dhj) {
/* 36 */         if (c()) {
/*    */           return;
/*    */         }
/* 39 */         a(dhj.e);
/* 40 */       } catch (Exception exception) {
/* 41 */         if (c()) {
/*    */           return;
/*    */         }
/* 44 */         a.error("Couldn't start mini game!");
/* 45 */         a(exception.toString());
/*    */       } 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dje.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */