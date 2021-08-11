/*    */ import com.google.common.collect.ImmutableList;
/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class duf<T extends aqa>
/*    */   extends dur<T>
/*    */ {
/* 11 */   private final dwn[] a = new dwn[9];
/*    */   private final ImmutableList<dwn> b;
/*    */   
/*    */   public duf() {
/* 15 */     ImmutableList.Builder<dwn> ☃ = ImmutableList.builder();
/*    */     
/* 17 */     dwn dwn1 = new dwn(this, 0, 0);
/* 18 */     dwn1.a(-8.0F, -8.0F, -8.0F, 16.0F, 16.0F, 16.0F);
/* 19 */     dwn1.b = 17.6F;
/*    */     
/* 21 */     ☃.add(dwn1);
/*    */     
/* 23 */     Random random = new Random(1660L);
/* 24 */     for (int i = 0; i < this.a.length; i++) {
/* 25 */       this.a[i] = new dwn(this, 0, 0);
/*    */       
/* 27 */       float f1 = (((i % 3) - (i / 3 % 2) * 0.5F + 0.25F) / 2.0F * 2.0F - 1.0F) * 5.0F;
/* 28 */       float f2 = ((i / 3) / 2.0F * 2.0F - 1.0F) * 5.0F;
/* 29 */       int j = random.nextInt(7) + 8;
/* 30 */       this.a[i].a(-1.0F, 0.0F, -1.0F, 2.0F, j, 2.0F);
/*    */       
/* 32 */       (this.a[i]).a = f1;
/* 33 */       (this.a[i]).c = f2;
/* 34 */       (this.a[i]).b = 24.6F;
/*    */       
/* 36 */       ☃.add(this.a[i]);
/*    */     } 
/* 38 */     this.b = ☃.build();
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(T ☃, float f1, float f2, float f3, float f4, float f5) {
/* 43 */     for (int i = 0; i < this.a.length; i++) {
/* 44 */       (this.a[i]).d = 0.2F * afm.a(f3 * 0.3F + i) + 0.4F;
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   public Iterable<dwn> a() {
/* 50 */     return (Iterable<dwn>)this.b;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\duf.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */