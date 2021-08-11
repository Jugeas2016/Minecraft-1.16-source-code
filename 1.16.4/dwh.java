/*    */ import com.google.common.collect.ImmutableList;
/*    */ import java.util.Arrays;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class dwh<T extends bcl>
/*    */   extends dur<T>
/*    */ {
/*    */   private final dwn[] a;
/*    */   private final dwn[] b;
/*    */   private final ImmutableList<dwn> f;
/*    */   
/*    */   public dwh(float ☃) {
/* 16 */     this.r = 64;
/* 17 */     this.s = 64;
/*    */     
/* 19 */     this.a = new dwn[3];
/*    */     
/* 21 */     this.a[0] = new dwn(this, 0, 16);
/* 22 */     this.a[0].a(-10.0F, 3.9F, -0.5F, 20.0F, 3.0F, 3.0F, ☃);
/*    */     
/* 24 */     this.a[1] = (new dwn(this)).b(this.r, this.s);
/* 25 */     this.a[1].a(-2.0F, 6.9F, -0.5F);
/* 26 */     this.a[1].a(0, 22).a(0.0F, 0.0F, 0.0F, 3.0F, 10.0F, 3.0F, ☃);
/* 27 */     this.a[1].a(24, 22).a(-4.0F, 1.5F, 0.5F, 11.0F, 2.0F, 2.0F, ☃);
/* 28 */     this.a[1].a(24, 22).a(-4.0F, 4.0F, 0.5F, 11.0F, 2.0F, 2.0F, ☃);
/* 29 */     this.a[1].a(24, 22).a(-4.0F, 6.5F, 0.5F, 11.0F, 2.0F, 2.0F, ☃);
/*    */     
/* 31 */     this.a[2] = new dwn(this, 12, 22);
/* 32 */     this.a[2].a(0.0F, 0.0F, 0.0F, 3.0F, 6.0F, 3.0F, ☃);
/*    */     
/* 34 */     this.b = new dwn[3];
/* 35 */     this.b[0] = new dwn(this, 0, 0);
/* 36 */     this.b[0].a(-4.0F, -4.0F, -4.0F, 8.0F, 8.0F, 8.0F, ☃);
/* 37 */     this.b[1] = new dwn(this, 32, 0);
/* 38 */     this.b[1].a(-4.0F, -4.0F, -4.0F, 6.0F, 6.0F, 6.0F, ☃);
/* 39 */     (this.b[1]).a = -8.0F;
/* 40 */     (this.b[1]).b = 4.0F;
/* 41 */     this.b[2] = new dwn(this, 32, 0);
/* 42 */     this.b[2].a(-4.0F, -4.0F, -4.0F, 6.0F, 6.0F, 6.0F, ☃);
/* 43 */     (this.b[2]).a = 10.0F;
/* 44 */     (this.b[2]).b = 4.0F;
/*    */     
/* 46 */     ImmutableList.Builder<dwn> builder = ImmutableList.builder();
/* 47 */     builder.addAll(Arrays.asList(this.b));
/* 48 */     builder.addAll(Arrays.asList(this.a));
/* 49 */     this.f = builder.build();
/*    */   }
/*    */ 
/*    */   
/*    */   public ImmutableList<dwn> b() {
/* 54 */     return this.f;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(T ☃, float f1, float f2, float f3, float f4, float f5) {
/* 59 */     float f = afm.b(f3 * 0.1F);
/* 60 */     (this.a[1]).d = (0.065F + 0.05F * f) * 3.1415927F;
/*    */     
/* 62 */     this.a[2].a(-2.0F, 6.9F + afm.b((this.a[1]).d) * 10.0F, -0.5F + afm.a((this.a[1]).d) * 10.0F);
/* 63 */     (this.a[2]).d = (0.265F + 0.1F * f) * 3.1415927F;
/*    */     
/* 65 */     (this.b[0]).e = f4 * 0.017453292F;
/* 66 */     (this.b[0]).d = f5 * 0.017453292F;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(T ☃, float f1, float f2, float f3) {
/* 71 */     for (int i = 1; i < 3; i++) {
/* 72 */       (this.b[i]).e = (☃.a(i - 1) - ((bcl)☃).aA) * 0.017453292F;
/* 73 */       (this.b[i]).d = ☃.b(i - 1) * 0.017453292F;
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dwh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */