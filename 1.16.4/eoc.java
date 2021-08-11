/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class eoc
/*    */   implements eof
/*    */ {
/* 12 */   private static final nr a = new of("tutorial.open_inventory.title");
/* 13 */   private static final nr b = new of("tutorial.open_inventory.description", new Object[] { eoe.a("inventory") });
/*    */   
/*    */   private final eoe c;
/*    */   private dms d;
/*    */   private int e;
/*    */   
/*    */   public eoc(eoe ☃) {
/* 20 */     this.c = ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a() {
/* 25 */     this.e++;
/*    */     
/* 27 */     if (this.c.f() != bru.b) {
/* 28 */       this.c.a(eog.f);
/*    */       
/*    */       return;
/*    */     } 
/* 32 */     if (this.e >= 600 && 
/* 33 */       this.d == null) {
/* 34 */       this.d = new dms(dms.a.d, a, b, false);
/* 35 */       this.c.e().an().a(this.d);
/*    */     } 
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void b() {
/* 42 */     if (this.d != null) {
/* 43 */       this.d.b();
/* 44 */       this.d = null;
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public void c() {
/* 50 */     this.c.a(eog.e);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\eoc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */