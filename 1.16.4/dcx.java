/*    */ import java.util.function.Predicate;
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
/*    */ public class dcx
/*    */   implements dcs
/*    */ {
/* 17 */   protected static final dcs a = new dcx(false, -1.7976931348623157E308D, bmd.a, ☃ -> false)
/*    */     {
/*    */       public boolean a(ddh ☃, fx fx1, boolean bool) {
/* 20 */         return bool;
/*    */       }
/*    */     };
/*    */   
/*    */   private final boolean b;
/*    */   private final double c;
/*    */   private final blx d;
/*    */   private final Predicate<cuw> e;
/*    */   
/*    */   protected dcx(boolean ☃, double d, blx blx1, Predicate<cuw> predicate) {
/* 30 */     this.b = ☃;
/* 31 */     this.c = d;
/* 32 */     this.d = blx1;
/* 33 */     this.e = predicate;
/*    */   }
/*    */ 
/*    */   
/*    */   @Deprecated
/*    */   protected dcx(aqa ☃) {
/* 39 */     this(☃
/* 40 */         .by(), ☃
/* 41 */         .cE(), (☃ instanceof aqm) ? ((aqm)☃)
/* 42 */         .dD().b() : bmd.a, (☃ instanceof aqm) ? (aqm)☃::a : (☃ -> false));
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean a(blx ☃) {
/* 49 */     return (this.d == ☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(cux ☃, cuv cuv1) {
/* 54 */     return (this.e.test(cuv1) && !☃.a().a(cuv1));
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean b() {
/* 59 */     return this.b;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a(ddh ☃, fx fx1, boolean bool) {
/* 64 */     return (this.c > fx1.v() + ☃.c(gc.a.b) - 9.999999747378752E-6D);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dcx.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */