/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class emj
/*    */   implements eme
/*    */ {
/*    */   private final dzm a;
/*    */   private boolean b;
/*    */   private boolean c = true;
/*    */   
/*    */   public emj(dzm ☃) {
/* 16 */     this.a = ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a() {
/* 21 */     brx ☃ = this.a.l;
/* 22 */     ceh ceh = ☃.c(this.a.cc().c(0.0D, -0.4000000059604645D, 0.0D).h(0.001D)).filter(☃ -> ☃.a(bup.lc)).findFirst().orElse(null);
/* 23 */     if (ceh != null) {
/* 24 */       if (!this.b && !this.c && 
/* 25 */         ceh.a(bup.lc) && !this.a.a_()) {
/* 26 */         boolean bool = ((Boolean)ceh.c(bus.a)).booleanValue();
/* 27 */         if (bool) {
/* 28 */           this.a.a(adq.bi, 1.0F, 1.0F);
/*    */         } else {
/* 30 */           this.a.a(adq.bg, 1.0F, 1.0F);
/*    */         } 
/*    */       } 
/*    */       
/* 34 */       this.b = true;
/*    */     } else {
/* 36 */       this.b = false;
/*    */     } 
/* 38 */     this.c = false;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\emj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */