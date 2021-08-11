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
/*    */ public class bgk
/*    */   extends bgg
/*    */ {
/* 16 */   public int e = 1;
/*    */   
/*    */   public bgk(aqe<? extends bgk> ☃, brx brx1) {
/* 19 */     super((aqe)☃, brx1);
/*    */   }
/*    */   
/*    */   public bgk(brx ☃, double d1, double d2, double d3, double d4, double d5, double d6) {
/* 23 */     super((aqe)aqe.N, d1, d2, d3, d4, d5, d6, ☃);
/*    */   }
/*    */   
/*    */   public bgk(brx ☃, aqm aqm1, double d1, double d2, double d3) {
/* 27 */     super((aqe)aqe.N, aqm1, d1, d2, d3, ☃);
/*    */   }
/*    */ 
/*    */   
/*    */   protected void a(dcl ☃) {
/* 32 */     super.a(☃);
/* 33 */     if (!this.l.v) {
/* 34 */       boolean bool = this.l.V().b(brt.b);
/* 35 */       this.l.a((aqa)null, cD(), cE(), cH(), this.e, bool, bool ? brp.a.c : brp.a.a);
/* 36 */       ad();
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   protected void a(dck ☃) {
/* 42 */     super.a(☃);
/* 43 */     if (this.l.v)
/* 44 */       return;  aqa aqa1 = ☃.a();
/* 45 */     aqa aqa2 = v();
/* 46 */     aqa1.a(apk.a(this, aqa2), 6.0F);
/* 47 */     if (aqa2 instanceof aqm) {
/* 48 */       a((aqm)aqa2, aqa1);
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   public void b(md ☃) {
/* 54 */     super.b(☃);
/* 55 */     ☃.b("ExplosionPower", this.e);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(md ☃) {
/* 60 */     super.a(☃);
/* 61 */     if (☃.c("ExplosionPower", 99))
/* 62 */       this.e = ☃.h("ExplosionPower"); 
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bgk.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */