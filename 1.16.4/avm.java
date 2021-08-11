/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class avm
/*    */   extends avv
/*    */ {
/*    */   protected aqn d;
/* 14 */   protected fx e = fx.b;
/*    */   protected boolean f;
/*    */   private boolean a;
/*    */   private float b;
/*    */   private float c;
/*    */   
/*    */   public avm(aqn ☃) {
/* 21 */     this.d = ☃;
/* 22 */     if (!azi.a(☃)) {
/* 23 */       throw new IllegalArgumentException("Unsupported mob type for DoorInteractGoal");
/*    */     }
/*    */   }
/*    */   
/*    */   protected boolean g() {
/* 28 */     if (!this.f) {
/* 29 */       return false;
/*    */     }
/* 31 */     ceh ☃ = this.d.l.d_(this.e);
/* 32 */     if (!(☃.b() instanceof bwb)) {
/* 33 */       this.f = false;
/* 34 */       return false;
/*    */     } 
/* 36 */     return ((Boolean)☃.c(bwb.b)).booleanValue();
/*    */   }
/*    */   
/*    */   protected void a(boolean ☃) {
/* 40 */     if (this.f) {
/* 41 */       ceh ceh = this.d.l.d_(this.e);
/* 42 */       if (ceh.b() instanceof bwb) {
/* 43 */         ((bwb)ceh.b()).a(this.d.l, ceh, this.e, ☃);
/*    */       }
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean a() {
/* 50 */     if (!azi.a(this.d)) {
/* 51 */       return false;
/*    */     }
/* 53 */     if (!this.d.u) {
/* 54 */       return false;
/*    */     }
/* 56 */     ayi ☃ = (ayi)this.d.x();
/* 57 */     cxd cxd = ☃.k();
/* 58 */     if (cxd == null || cxd.c() || !☃.f()) {
/* 59 */       return false;
/*    */     }
/*    */     
/* 62 */     for (int i = 0; i < Math.min(cxd.f() + 2, cxd.e()); i++) {
/* 63 */       cxb cxb = cxd.a(i);
/* 64 */       this.e = new fx(cxb.a, cxb.b + 1, cxb.c);
/* 65 */       if (this.d.h(this.e.u(), this.d.cE(), this.e.w()) <= 2.25D) {
/*    */ 
/*    */         
/* 68 */         this.f = bwb.a(this.d.l, this.e);
/* 69 */         if (this.f) {
/* 70 */           return true;
/*    */         }
/*    */       } 
/*    */     } 
/* 74 */     this.e = this.d.cB().b();
/* 75 */     this.f = bwb.a(this.d.l, this.e);
/* 76 */     return this.f;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean b() {
/* 81 */     return !this.a;
/*    */   }
/*    */ 
/*    */   
/*    */   public void c() {
/* 86 */     this.a = false;
/* 87 */     this.b = (float)(this.e.u() + 0.5D - this.d.cD());
/* 88 */     this.c = (float)(this.e.w() + 0.5D - this.d.cH());
/*    */   }
/*    */ 
/*    */   
/*    */   public void e() {
/* 93 */     float ☃ = (float)(this.e.u() + 0.5D - this.d.cD());
/* 94 */     float f1 = (float)(this.e.w() + 0.5D - this.d.cH());
/* 95 */     float f2 = this.b * ☃ + this.c * f1;
/* 96 */     if (f2 < 0.0F)
/* 97 */       this.a = true; 
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\avm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */