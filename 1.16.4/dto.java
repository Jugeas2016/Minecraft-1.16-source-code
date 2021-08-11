/*    */ import com.google.common.collect.ImmutableList;
/*    */ import java.util.List;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class dto
/*    */   extends duv
/*    */ {
/*    */   private final dwn a;
/*    */   private final dwn b;
/*    */   private final dwn c;
/*    */   private final dwn d;
/*    */   private final dwn e;
/*    */   private final dwn f;
/*    */   private final dwn g;
/*    */   private final List<dwn> h;
/*    */   
/*    */   public dto() {
/* 23 */     super(eao::b);
/* 24 */     this.a = (new dwn(64, 32, 0, 0)).a(-6.0F, -5.0F, -0.005F, 6.0F, 10.0F, 0.005F);
/* 25 */     this.b = (new dwn(64, 32, 16, 0)).a(0.0F, -5.0F, -0.005F, 6.0F, 10.0F, 0.005F);
/*    */     
/* 27 */     this.g = (new dwn(64, 32, 12, 0)).a(-1.0F, -5.0F, 0.0F, 2.0F, 10.0F, 0.005F);
/*    */     
/* 29 */     this.c = (new dwn(64, 32, 0, 10)).a(0.0F, -4.0F, -0.99F, 5.0F, 8.0F, 1.0F);
/* 30 */     this.d = (new dwn(64, 32, 12, 10)).a(0.0F, -4.0F, -0.01F, 5.0F, 8.0F, 1.0F);
/*    */     
/* 32 */     this.e = (new dwn(64, 32, 24, 10)).a(0.0F, -4.0F, 0.0F, 5.0F, 8.0F, 0.005F);
/* 33 */     this.f = (new dwn(64, 32, 24, 10)).a(0.0F, -4.0F, 0.0F, 5.0F, 8.0F, 0.005F);
/*    */     
/* 35 */     this.h = (List<dwn>)ImmutableList.of(this.a, this.b, this.g, this.c, this.d, this.e, this.f);
/*    */     
/* 37 */     this.a.a(0.0F, 0.0F, -1.0F);
/* 38 */     this.b.a(0.0F, 0.0F, 1.0F);
/*    */     
/* 40 */     this.g.e = 1.5707964F;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(dfm ☃, dfq dfq1, int i, int j, float f1, float f2, float f3, float f4) {
/* 45 */     b(☃, dfq1, i, j, f1, f2, f3, f4);
/*    */   }
/*    */   
/*    */   public void b(dfm ☃, dfq dfq1, int i, int j, float f1, float f2, float f3, float f4) {
/* 49 */     this.h.forEach(dwn1 -> dwn1.a(☃, dfq1, i, j, f1, f2, f3, f4));
/*    */   }
/*    */   
/*    */   public void a(float ☃, float f1, float f2, float f3) {
/* 53 */     float f = (afm.a(☃ * 0.02F) * 0.1F + 1.25F) * f3;
/*    */     
/* 55 */     this.a.e = 3.1415927F + f;
/* 56 */     this.b.e = -f;
/* 57 */     this.c.e = f;
/* 58 */     this.d.e = -f;
/*    */     
/* 60 */     this.e.e = f - f * 2.0F * f1;
/* 61 */     this.f.e = f - f * 2.0F * f2;
/*    */     
/* 63 */     this.c.a = afm.a(f);
/* 64 */     this.d.a = afm.a(f);
/* 65 */     this.e.a = afm.a(f);
/* 66 */     this.f.a = afm.a(f);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dto.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */