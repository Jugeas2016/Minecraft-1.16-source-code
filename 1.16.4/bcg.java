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
/*    */ public class bcg
/*    */   extends bbt
/*    */ {
/*    */   private boolean b;
/*    */   private cxd c;
/*    */   private dcn d;
/*    */   
/*    */   public bcg(bbr ☃) {
/* 19 */     super(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public void c() {
/* 24 */     if (this.b || this.c == null) {
/* 25 */       this.b = false;
/* 26 */       j();
/*    */     } else {
/* 28 */       fx ☃ = this.a.l.a(chn.a.f, cjk.a);
/* 29 */       if (!☃.a(this.a.cA(), 10.0D)) {
/* 30 */         this.a.eK().a(bch.a);
/*    */       }
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public void d() {
/* 37 */     this.b = true;
/* 38 */     this.c = null;
/* 39 */     this.d = null;
/*    */   }
/*    */   
/*    */   private void j() {
/* 43 */     int ☃ = this.a.eI();
/* 44 */     dcn dcn1 = this.a.x(1.0F);
/* 45 */     int i = this.a.p(-dcn1.b * 40.0D, 105.0D, -dcn1.d * 40.0D);
/*    */     
/* 47 */     if (this.a.eL() == null || this.a.eL().c() <= 0) {
/*    */       
/* 49 */       i -= 12;
/* 50 */       i &= 0x7;
/* 51 */       i += 12;
/*    */     } else {
/*    */       
/* 54 */       i %= 12;
/* 55 */       if (i < 0) {
/* 56 */         i += 12;
/*    */       }
/*    */     } 
/*    */     
/* 60 */     this.c = this.a.a(☃, i, (cxb)null);
/*    */     
/* 62 */     k();
/*    */   }
/*    */   
/*    */   private void k() {
/* 66 */     if (this.c != null) {
/* 67 */       this.c.a();
/* 68 */       if (!this.c.c()) {
/* 69 */         double d; gr ☃ = this.c.g();
/* 70 */         this.c.a();
/*    */ 
/*    */         
/*    */         do {
/* 74 */           d = (☃.v() + this.a.cY().nextFloat() * 20.0F);
/* 75 */         } while (d < ☃.v());
/*    */         
/* 77 */         this.d = new dcn(☃.u(), d, ☃.w());
/*    */       } 
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   @Nullable
/*    */   public dcn g() {
/* 85 */     return this.d;
/*    */   }
/*    */ 
/*    */   
/*    */   public bch<bcg> i() {
/* 90 */     return bch.e;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bcg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */