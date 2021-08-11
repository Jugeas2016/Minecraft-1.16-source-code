/*    */ import java.util.Random;
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
/*    */ public class bca
/*    */   extends bbt
/*    */ {
/*    */   private dcn b;
/*    */   
/*    */   public bca(bbr ☃) {
/* 18 */     super(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public void b() {
/* 23 */     dcn ☃ = this.a.x(1.0F).d();
/* 24 */     ☃.b(-0.7853982F);
/*    */     
/* 26 */     double d1 = this.a.bo.cD();
/* 27 */     double d2 = this.a.bo.e(0.5D);
/* 28 */     double d3 = this.a.bo.cH();
/* 29 */     for (int i = 0; i < 8; i++) {
/* 30 */       Random random = this.a.cY();
/* 31 */       double d4 = d1 + random.nextGaussian() / 2.0D;
/* 32 */       double d5 = d2 + random.nextGaussian() / 2.0D;
/* 33 */       double d6 = d3 + random.nextGaussian() / 2.0D;
/* 34 */       dcn dcn1 = this.a.cC();
/* 35 */       this.a.l.a(hh.i, d4, d5, d6, -☃.b * 0.07999999821186066D + dcn1.b, -☃.c * 0.30000001192092896D + dcn1.c, -☃.d * 0.07999999821186066D + dcn1.d);
/* 36 */       ☃.b(0.19634955F);
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public void c() {
/* 42 */     if (this.b == null) {
/* 43 */       this.b = dcn.c(this.a.l.a(chn.a.f, cjk.a));
/*    */     }
/*    */     
/* 46 */     if (this.b.c(this.a.cD(), this.a.cE(), this.a.cH()) < 1.0D) {
/* 47 */       ((bcd)this.a.eK().<bcd>b(bch.f)).j();
/* 48 */       this.a.eK().a(bch.g);
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public float f() {
/* 54 */     return 1.5F;
/*    */   }
/*    */ 
/*    */   
/*    */   public float h() {
/* 59 */     float ☃ = afm.a(aqa.c(this.a.cC())) + 1.0F;
/* 60 */     float f1 = Math.min(☃, 40.0F);
/*    */     
/* 62 */     return f1 / ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   public void d() {
/* 67 */     this.b = null;
/*    */   }
/*    */ 
/*    */   
/*    */   @Nullable
/*    */   public dcn g() {
/* 73 */     return this.b;
/*    */   }
/*    */ 
/*    */   
/*    */   public bch<bca> i() {
/* 78 */     return bch.d;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bca.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */