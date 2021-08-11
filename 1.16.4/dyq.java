/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class dyq
/*    */   extends dyg
/*    */ {
/*    */   protected float B;
/*    */   
/*    */   protected dyq(dwt ☃, double d1, double d2, double d3) {
/* 15 */     super(☃, d1, d2, d3);
/* 16 */     this.B = 0.1F * (this.r.nextFloat() * 0.5F + 0.5F) * 2.0F;
/*    */   }
/*    */   
/*    */   protected dyq(dwt ☃, double d1, double d2, double d3, double d4, double d5, double d6) {
/* 20 */     super(☃, d1, d2, d3, d4, d5, d6);
/* 21 */     this.B = 0.1F * (this.r.nextFloat() * 0.5F + 0.5F) * 2.0F;
/*    */   }
/*    */   
/*    */   public void a(dfq ☃, djk djk1, float f) {
/*    */     d d;
/* 26 */     dcn dcn = djk1.b();
/*    */     
/* 28 */     float f1 = (float)(afm.d(f, this.d, this.g) - dcn.a());
/* 29 */     float f2 = (float)(afm.d(f, this.e, this.h) - dcn.b());
/* 30 */     float f3 = (float)(afm.d(f, this.f, this.i) - dcn.c());
/*    */ 
/*    */     
/* 33 */     if (this.z == 0.0F) {
/* 34 */       d = djk1.f();
/*    */     } else {
/* 36 */       d = new d(djk1.f());
/*    */       
/* 38 */       float f9 = afm.g(f, this.A, this.z);
/* 39 */       d.a(g.f.c(f9));
/*    */     } 
/*    */     
/* 42 */     g g = new g(-1.0F, -1.0F, 0.0F);
/* 43 */     g.a(d);
/*    */     
/* 45 */     g[] arrayOfG = { new g(-1.0F, -1.0F, 0.0F), new g(-1.0F, 1.0F, 0.0F), new g(1.0F, 1.0F, 0.0F), new g(1.0F, -1.0F, 0.0F) };
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 52 */     float f4 = b(f);
/*    */     
/* 54 */     for (int i = 0; i < 4; i++) {
/* 55 */       g g1 = arrayOfG[i];
/*    */       
/* 57 */       g1.a(d);
/* 58 */       g1.b(f4);
/* 59 */       g1.c(f1, f2, f3);
/*    */     } 
/*    */     
/* 62 */     float f5 = c();
/* 63 */     float f6 = d();
/* 64 */     float f7 = e();
/* 65 */     float f8 = f();
/*    */     
/* 67 */     int j = a(f);
/*    */     
/* 69 */     ☃.a(arrayOfG[0].a(), arrayOfG[0].b(), arrayOfG[0].c()).a(f6, f8).a(this.v, this.w, this.x, this.y).a(j).d();
/* 70 */     ☃.a(arrayOfG[1].a(), arrayOfG[1].b(), arrayOfG[1].c()).a(f6, f7).a(this.v, this.w, this.x, this.y).a(j).d();
/* 71 */     ☃.a(arrayOfG[2].a(), arrayOfG[2].b(), arrayOfG[2].c()).a(f5, f7).a(this.v, this.w, this.x, this.y).a(j).d();
/* 72 */     ☃.a(arrayOfG[3].a(), arrayOfG[3].b(), arrayOfG[3].c()).a(f5, f8).a(this.v, this.w, this.x, this.y).a(j).d();
/*    */   }
/*    */   
/*    */   public float b(float ☃) {
/* 76 */     return this.B;
/*    */   }
/*    */ 
/*    */   
/*    */   public dyg d(float ☃) {
/* 81 */     this.B *= ☃;
/* 82 */     return super.d(☃);
/*    */   }
/*    */   
/*    */   protected abstract float c();
/*    */   
/*    */   protected abstract float d();
/*    */   
/*    */   protected abstract float e();
/*    */   
/*    */   protected abstract float f();
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dyq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */