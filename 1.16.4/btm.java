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
/*    */ 
/*    */ 
/*    */ public abstract class btm
/*    */   extends bud
/*    */ {
/*    */   private final bkx a;
/*    */   
/*    */   protected btm(bkx ☃, ceg.c c1) {
/* 19 */     super(c1);
/* 20 */     this.a = ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean ai_() {
/* 25 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public ccj a(brc ☃) {
/* 30 */     return new cca(this.a);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(brx ☃, fx fx1, ceh ceh1, @Nullable aqm aqm1, bmb bmb1) {
/* 35 */     if (bmb1.t()) {
/* 36 */       ccj ccj = ☃.c(fx1);
/* 37 */       if (ccj instanceof cca) {
/* 38 */         ((cca)ccj).a(bmb1.r());
/*    */       }
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public bmb a(brc ☃, fx fx1, ceh ceh1) {
/* 45 */     ccj ccj = ☃.c(fx1);
/* 46 */     if (ccj instanceof cca) {
/* 47 */       return ((cca)ccj).a(ceh1);
/*    */     }
/*    */     
/* 50 */     return super.a(☃, fx1, ceh1);
/*    */   }
/*    */   
/*    */   public bkx b() {
/* 54 */     return this.a;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\btm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */