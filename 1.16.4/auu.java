/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class auu
/*    */ {
/*    */   private final aqn a;
/*    */   private int b;
/*    */   private float c;
/*    */   
/*    */   public auu(aqn ☃) {
/* 17 */     this.a = ☃;
/*    */   }
/*    */   
/*    */   public void a() {
/* 21 */     if (f()) {
/* 22 */       this.a.aA = this.a.p;
/* 23 */       c();
/*    */       
/* 25 */       this.c = this.a.aC;
/* 26 */       this.b = 0;
/*    */       
/*    */       return;
/*    */     } 
/* 30 */     if (e()) {
/* 31 */       if (Math.abs(this.a.aC - this.c) > 15.0F) {
/*    */ 
/*    */         
/* 34 */         this.b = 0;
/* 35 */         this.c = this.a.aC;
/* 36 */         b();
/*    */       } else {
/* 38 */         this.b++;
/* 39 */         if (this.b > 10)
/*    */         {
/*    */           
/* 42 */           d();
/*    */         }
/*    */       } 
/*    */     }
/*    */   }
/*    */   
/*    */   private void b() {
/* 49 */     this.a.aA = afm.b(this.a.aA, this.a.aC, this.a.Q());
/*    */   }
/*    */   
/*    */   private void c() {
/* 53 */     this.a.aC = afm.b(this.a.aC, this.a.aA, this.a.Q());
/*    */   }
/*    */   
/*    */   private void d() {
/* 57 */     int ☃ = this.b - 10;
/*    */ 
/*    */     
/* 60 */     float f1 = afm.a(☃ / 10.0F, 0.0F, 1.0F);
/*    */     
/* 62 */     float f2 = this.a.Q() * (1.0F - f1);
/*    */     
/* 64 */     this.a.aA = afm.b(this.a.aA, this.a.aC, f2);
/*    */   }
/*    */   
/*    */   private boolean e() {
/* 68 */     return (this.a.cn().isEmpty() || !(this.a.cn().get(0) instanceof aqn));
/*    */   }
/*    */   
/*    */   private boolean f() {
/* 72 */     double ☃ = this.a.cD() - this.a.m;
/* 73 */     double d1 = this.a.cH() - this.a.o;
/*    */     
/* 75 */     return (☃ * ☃ + d1 * d1 > 2.500000277905201E-7D);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\auu.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */