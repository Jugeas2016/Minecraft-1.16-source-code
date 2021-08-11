/*    */ import com.google.common.collect.ImmutableList;
/*    */ import java.util.Arrays;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class dtm<T extends aqa>
/*    */   extends dur<T>
/*    */ {
/*    */   private final dwn[] a;
/*    */   private final dwn b;
/*    */   private final ImmutableList<dwn> f;
/*    */   
/*    */   public dtm() {
/* 17 */     this.b = new dwn(this, 0, 0);
/* 18 */     this.b.a(-4.0F, -4.0F, -4.0F, 8.0F, 8.0F, 8.0F);
/*    */     
/* 20 */     this.a = new dwn[12];
/*    */     
/* 22 */     for (int i = 0; i < this.a.length; i++) {
/* 23 */       this.a[i] = new dwn(this, 0, 16);
/* 24 */       this.a[i].a(0.0F, 0.0F, 0.0F, 2.0F, 8.0F, 2.0F);
/*    */     } 
/*    */     
/* 27 */     ImmutableList.Builder<dwn> ☃ = ImmutableList.builder();
/*    */     
/* 29 */     ☃.add(this.b);
/* 30 */     ☃.addAll(Arrays.asList(this.a));
/* 31 */     this.f = ☃.build();
/*    */   }
/*    */ 
/*    */   
/*    */   public Iterable<dwn> a() {
/* 36 */     return (Iterable<dwn>)this.f;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(T ☃, float f1, float f2, float f3, float f4, float f5) {
/* 41 */     float f = f3 * 3.1415927F * -0.1F; int i;
/* 42 */     for (i = 0; i < 4; i++) {
/* 43 */       (this.a[i]).b = -2.0F + afm.b(((i * 2) + f3) * 0.25F);
/* 44 */       (this.a[i]).a = afm.b(f) * 9.0F;
/* 45 */       (this.a[i]).c = afm.a(f) * 9.0F;
/* 46 */       f += 1.5707964F;
/*    */     } 
/*    */     
/* 49 */     f = 0.7853982F + f3 * 3.1415927F * 0.03F;
/* 50 */     for (i = 4; i < 8; i++) {
/* 51 */       (this.a[i]).b = 2.0F + afm.b(((i * 2) + f3) * 0.25F);
/* 52 */       (this.a[i]).a = afm.b(f) * 7.0F;
/* 53 */       (this.a[i]).c = afm.a(f) * 7.0F;
/* 54 */       f += 1.5707964F;
/*    */     } 
/*    */     
/* 57 */     f = 0.47123894F + f3 * 3.1415927F * -0.05F;
/* 58 */     for (i = 8; i < 12; i++) {
/* 59 */       (this.a[i]).b = 11.0F + afm.b((i * 1.5F + f3) * 0.5F);
/* 60 */       (this.a[i]).a = afm.b(f) * 5.0F;
/* 61 */       (this.a[i]).c = afm.a(f) * 5.0F;
/* 62 */       f += 1.5707964F;
/*    */     } 
/*    */     
/* 65 */     this.b.e = f4 * 0.017453292F;
/* 66 */     this.b.d = f5 * 0.017453292F;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dtm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */