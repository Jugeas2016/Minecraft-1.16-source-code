/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public interface aen
/*    */ {
/* 12 */   public static final aen a = a(aem.c(), aem.c(), aem.c(), aem.c());
/*    */   
/*    */   aem<buo> a();
/*    */   
/*    */   aem<blx> b();
/*    */   
/*    */   aem<cuw> c();
/*    */   
/*    */   aem<aqe<?>> d();
/*    */   
/*    */   default void e() {
/* 23 */     aek.a(this);
/* 24 */     bup.a();
/*    */   }
/*    */   
/*    */   default void a(nf ☃) {
/* 28 */     a().a(☃, gm.Q);
/* 29 */     b().a(☃, gm.T);
/* 30 */     c().a(☃, gm.O);
/* 31 */     d().a(☃, gm.S);
/*    */   }
/*    */   
/*    */   static aen b(nf ☃) {
/* 35 */     aem<buo> aem = aem.a(☃, gm.Q);
/* 36 */     aem<blx> aem1 = aem.a(☃, gm.T);
/* 37 */     aem<cuw> aem2 = aem.a(☃, gm.O);
/* 38 */     aem<aqe<?>> aem3 = aem.a(☃, gm.S);
/* 39 */     return a(aem, aem1, aem2, aem3);
/*    */   }
/*    */   
/*    */   static aen a(aem<buo> ☃, aem<blx> aem1, aem<cuw> aem2, aem<aqe<?>> aem3) {
/* 43 */     return new aen(☃, aem1, aem2, aem3)
/*    */       {
/*    */         public aem<buo> a() {
/* 46 */           return this.b;
/*    */         }
/*    */ 
/*    */         
/*    */         public aem<blx> b() {
/* 51 */           return this.c;
/*    */         }
/*    */ 
/*    */         
/*    */         public aem<cuw> c() {
/* 56 */           return this.d;
/*    */         }
/*    */ 
/*    */         
/*    */         public aem<aqe<?>> d() {
/* 61 */           return this.e;
/*    */         }
/*    */       };
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\aen.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */