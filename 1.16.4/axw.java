/*    */ import java.util.List;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class axw<T extends aqn & aqs>
/*    */   extends avv
/*    */ {
/*    */   private final T a;
/*    */   private final boolean b;
/*    */   private int c;
/*    */   
/*    */   public axw(T ☃, boolean bool) {
/* 32 */     this.a = ☃;
/* 33 */     this.b = bool;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a() {
/* 38 */     return (((aqn)this.a).l.V().b(brt.G) && g());
/*    */   }
/*    */   
/*    */   private boolean g() {
/* 42 */     return (this.a.cZ() != null && this.a
/* 43 */       .cZ().X() == aqe.bc && this.a
/* 44 */       .da() > this.c);
/*    */   }
/*    */ 
/*    */   
/*    */   public void c() {
/* 49 */     this.c = this.a.da();
/* 50 */     ((aqs)this.a).I_();
/* 51 */     if (this.b) {
/* 52 */       h().stream()
/* 53 */         .filter(☃ -> (☃ != this.a))
/* 54 */         .map(☃ -> (aqs)☃)
/* 55 */         .forEach(aqs::I_);
/*    */     }
/* 57 */     super.c();
/*    */   }
/*    */   
/*    */   private List<aqn> h() {
/* 61 */     double ☃ = this.a.b(arl.b);
/* 62 */     dci dci = dci.a(this.a.cA()).c(☃, 10.0D, ☃);
/* 63 */     return (List)((aqn)this.a).l.b(this.a.getClass(), dci);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\axw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */