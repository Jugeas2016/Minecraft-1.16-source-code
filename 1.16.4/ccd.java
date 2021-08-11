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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class ccd
/*    */   extends ccj
/*    */   implements aon, aox, aoy
/*    */ {
/* 21 */   private aow a = aow.a;
/*    */   private nr b;
/*    */   
/*    */   protected ccd(cck<?> ☃) {
/* 25 */     super(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(ceh ☃, md md1) {
/* 30 */     super.a(☃, md1);
/*    */     
/* 32 */     this.a = aow.b(md1);
/*    */     
/* 34 */     if (md1.c("CustomName", 8)) {
/* 35 */       this.b = nr.a.a(md1.l("CustomName"));
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   public md a(md ☃) {
/* 41 */     super.a(☃);
/* 42 */     this.a.a(☃);
/*    */     
/* 44 */     if (this.b != null) {
/* 45 */       ☃.a("CustomName", nr.a.a(this.b));
/*    */     }
/*    */     
/* 48 */     return ☃;
/*    */   }
/*    */   
/*    */   public void a(nr ☃) {
/* 52 */     this.b = ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   public nr R() {
/* 57 */     if (this.b != null) {
/* 58 */       return this.b;
/*    */     }
/* 60 */     return g();
/*    */   }
/*    */ 
/*    */   
/*    */   public nr d() {
/* 65 */     return R();
/*    */   }
/*    */ 
/*    */   
/*    */   @Nullable
/*    */   public nr T() {
/* 71 */     return this.b;
/*    */   }
/*    */   
/*    */   protected abstract nr g();
/*    */   
/*    */   public boolean e(bfw ☃) {
/* 77 */     return a(☃, this.a, d());
/*    */   }
/*    */   
/*    */   public static boolean a(bfw ☃, aow aow1, nr nr1) {
/* 81 */     if (☃.a_() || aow1.a(☃.dD())) {
/* 82 */       return true;
/*    */     }
/*    */     
/* 85 */     ☃.a(new of("container.isLocked", new Object[] { nr1 }), true);
/* 86 */     ☃.a(adq.bF, adr.e, 1.0F, 1.0F);
/* 87 */     return false;
/*    */   }
/*    */ 
/*    */   
/*    */   @Nullable
/*    */   public bic createMenu(int ☃, bfv bfv1, bfw bfw1) {
/* 93 */     if (e(bfw1)) {
/* 94 */       return a(☃, bfv1);
/*    */     }
/*    */     
/* 97 */     return null;
/*    */   }
/*    */   
/*    */   protected abstract bic a(int paramInt, bfv parambfv);
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ccd.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */