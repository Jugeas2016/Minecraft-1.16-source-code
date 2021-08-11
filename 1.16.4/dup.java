/*    */ import com.google.common.collect.ImmutableList;
/*    */ import java.util.Arrays;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class dup<T extends bdz>
/*    */   extends dur<T>
/*    */ {
/* 11 */   private final dwn[] a = new dwn[8];
/*    */   private final dwn b;
/*    */   private final ImmutableList<dwn> f;
/*    */   
/*    */   public dup() {
/* 16 */     for (int i = 0; i < this.a.length; i++) {
/* 17 */       int j = 0;
/* 18 */       int k = i;
/* 19 */       if (i == 2) {
/* 20 */         j = 24;
/* 21 */         k = 10;
/* 22 */       } else if (i == 3) {
/* 23 */         j = 24;
/* 24 */         k = 19;
/*    */       } 
/* 26 */       this.a[i] = new dwn(this, j, k);
/* 27 */       this.a[i].a(-4.0F, (16 + i), -4.0F, 8.0F, 1.0F, 8.0F);
/*    */     } 
/*    */     
/* 30 */     this.b = new dwn(this, 0, 16);
/* 31 */     this.b.a(-2.0F, 18.0F, -2.0F, 4.0F, 4.0F, 4.0F);
/*    */     
/* 33 */     ImmutableList.Builder<dwn> ☃ = ImmutableList.builder();
/* 34 */     ☃.add(this.b);
/* 35 */     ☃.addAll(Arrays.asList(this.a));
/* 36 */     this.f = ☃.build();
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void a(T ☃, float f1, float f2, float f3, float f4, float f5) {}
/*    */ 
/*    */   
/*    */   public void a(T ☃, float f1, float f2, float f3) {
/* 45 */     float f = afm.g(f3, ((bdz)☃).d, ((bdz)☃).c);
/* 46 */     if (f < 0.0F) {
/* 47 */       f = 0.0F;
/*    */     }
/*    */     
/* 50 */     for (int i = 0; i < this.a.length; i++) {
/* 51 */       (this.a[i]).b = -(4 - i) * f * 1.7F;
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   public ImmutableList<dwn> b() {
/* 57 */     return this.f;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dup.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */