/*    */ import java.util.Map;
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
/*    */ public class bnd
/*    */   extends bkh
/*    */ {
/*    */   protected final buo a;
/*    */   
/*    */   public bnd(buo ☃, buo buo1, blx.a a1) {
/* 18 */     super(☃, a1);
/* 19 */     this.a = buo1;
/*    */   }
/*    */ 
/*    */   
/*    */   @Nullable
/*    */   protected ceh c(bny ☃) {
/* 25 */     ceh ceh1 = this.a.a(☃);
/*    */     
/* 27 */     ceh ceh2 = null;
/*    */     
/* 29 */     brz brz = ☃.p();
/* 30 */     fx fx = ☃.a();
/* 31 */     for (gc gc : ☃.e()) {
/* 32 */       if (gc != gc.b) {
/*    */ 
/*    */ 
/*    */         
/* 36 */         ceh ceh = (gc == gc.a) ? e().a(☃) : ceh1;
/* 37 */         if (ceh != null && ceh.a(brz, fx)) {
/* 38 */           ceh2 = ceh;
/*    */           break;
/*    */         } 
/*    */       } 
/*    */     } 
/* 43 */     return (ceh2 != null && brz.a(ceh2, fx, dcs.a())) ? ceh2 : null;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(Map<buo, blx> ☃, blx blx1) {
/* 48 */     super.a(☃, blx1);
/*    */     
/* 50 */     ☃.put(this.a, blx1);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bnd.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */