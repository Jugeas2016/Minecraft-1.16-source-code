/*    */ import io.netty.util.concurrent.Future;
/*    */ import org.apache.logging.log4j.LogManager;
/*    */ import org.apache.logging.log4j.Logger;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class nj
/*    */   extends nd
/*    */ {
/* 11 */   private static final Logger g = LogManager.getLogger();
/* 12 */   private static final nr h = new of("disconnect.exceeded_packet_rate");
/*    */   
/*    */   private final int i;
/*    */   
/*    */   public nj(int ☃) {
/* 17 */     super(ok.a);
/* 18 */     this.i = ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   protected void b() {
/* 23 */     super.b();
/*    */     
/* 25 */     float ☃ = n();
/* 26 */     if (☃ > this.i) {
/* 27 */       g.warn("Player exceeded rate-limit (sent {} packets per second)", Float.valueOf(☃));
/*    */       
/* 29 */       a(new pm(h), ☃ -> a(h));
/* 30 */       l();
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\nj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */