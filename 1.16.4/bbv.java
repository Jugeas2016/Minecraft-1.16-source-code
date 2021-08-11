/*    */ import javax.annotation.Nullable;
/*    */ import org.apache.logging.log4j.LogManager;
/*    */ import org.apache.logging.log4j.Logger;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bbv
/*    */   extends bbt
/*    */ {
/* 11 */   private static final Logger b = LogManager.getLogger();
/*    */   
/*    */   private dcn c;
/*    */   
/*    */   private int d;
/*    */   
/*    */   public bbv(bbr ☃) {
/* 18 */     super(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public void c() {
/* 23 */     if (this.c == null) {
/* 24 */       b.warn("Aborting charge player as no target was set.");
/* 25 */       this.a.eK().a(bch.a);
/*    */       
/*    */       return;
/*    */     } 
/* 29 */     if (this.d > 0 && 
/* 30 */       this.d++ >= 10) {
/* 31 */       this.a.eK().a(bch.a);
/*    */       
/*    */       return;
/*    */     } 
/*    */     
/* 36 */     double ☃ = this.c.c(this.a.cD(), this.a.cE(), this.a.cH());
/* 37 */     if (☃ < 100.0D || ☃ > 22500.0D || this.a.u || this.a.v) {
/* 38 */       this.d++;
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   public void d() {
/* 44 */     this.c = null;
/* 45 */     this.d = 0;
/*    */   }
/*    */   
/*    */   public void a(dcn ☃) {
/* 49 */     this.c = ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   public float f() {
/* 54 */     return 3.0F;
/*    */   }
/*    */ 
/*    */   
/*    */   @Nullable
/*    */   public dcn g() {
/* 60 */     return this.c;
/*    */   }
/*    */ 
/*    */   
/*    */   public bch<bbv> i() {
/* 65 */     return bch.i;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bbv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */