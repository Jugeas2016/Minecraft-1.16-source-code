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
/*    */ public class enz
/*    */   implements eof
/*    */ {
/* 18 */   private static final nr a = new of("tutorial.craft_planks.title");
/* 19 */   private static final nr b = new of("tutorial.craft_planks.description");
/*    */   
/*    */   private final eoe c;
/*    */   private dms d;
/*    */   private int e;
/*    */   
/*    */   public enz(eoe ☃) {
/* 26 */     this.c = ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a() {
/* 31 */     this.e++;
/*    */     
/* 33 */     if (this.c.f() != bru.b) {
/* 34 */       this.c.a(eog.f);
/*    */       
/*    */       return;
/*    */     } 
/* 38 */     if (this.e == 1) {
/* 39 */       dzm ☃ = (this.c.e()).s;
/* 40 */       if (☃ != null) {
/* 41 */         if (☃.bm.a(aeg.c)) {
/* 42 */           this.c.a(eog.f);
/*    */           return;
/*    */         } 
/* 45 */         if (a(☃, aeg.c)) {
/* 46 */           this.c.a(eog.f);
/*    */           
/*    */           return;
/*    */         } 
/*    */       } 
/*    */     } 
/* 52 */     if (this.e >= 1200 && 
/* 53 */       this.d == null) {
/* 54 */       this.d = new dms(dms.a.e, a, b, false);
/* 55 */       this.c.e().an().a(this.d);
/*    */     } 
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void b() {
/* 62 */     if (this.d != null) {
/* 63 */       this.d.b();
/* 64 */       this.d = null;
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(bmb ☃) {
/* 70 */     blx blx = ☃.b();
/* 71 */     if (aeg.c.a(blx)) {
/* 72 */       this.c.a(eog.f);
/*    */     }
/*    */   }
/*    */   
/*    */   public static boolean a(dzm ☃, ael<blx> ael1) {
/* 77 */     for (blx blx : ael1.b()) {
/* 78 */       if (☃.D().a(aea.b.b(blx)) > 0) {
/* 79 */         return true;
/*    */       }
/*    */     } 
/* 82 */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\enz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */