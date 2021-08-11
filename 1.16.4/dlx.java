/*    */ import com.google.common.collect.ImmutableList;
/*    */ import java.util.List;
/*    */ import java.util.Optional;
/*    */ import javax.annotation.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class dlx
/*    */   extends dlo<dlx.a>
/*    */ {
/*    */   public dlx(djz ☃, int i, int j, int k, int m, int n) {
/* 16 */     super(☃, i, j, k, m, n);
/* 17 */     this.m = false;
/*    */   }
/*    */   
/*    */   public int a(dkc ☃) {
/* 21 */     return b(a.a(this.b.k, this.d, ☃));
/*    */   }
/*    */   
/*    */   public void a(dkc ☃, @Nullable dkc dkc1) {
/* 25 */     b(a.a(this.b.k, this.d, ☃, dkc1));
/*    */   }
/*    */   
/*    */   public void a(dkc[] ☃) {
/* 29 */     for (int i = 0; i < ☃.length; i += 2) {
/* 30 */       a(☃[i], (i < ☃.length - 1) ? ☃[i + 1] : null);
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   public int d() {
/* 36 */     return 400;
/*    */   }
/*    */ 
/*    */   
/*    */   protected int e() {
/* 41 */     return super.e() + 32;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public dlh b(dkc ☃) {
/* 46 */     for (a a : au_()) {
/* 47 */       for (dlh dlh : a.a(a)) {
/* 48 */         if (dlh instanceof dlw && ((dlw)dlh).a() == ☃) {
/* 49 */           return dlh;
/*    */         }
/*    */       } 
/*    */     } 
/* 53 */     return null;
/*    */   }
/*    */   
/*    */   public Optional<dlh> c(double ☃, double d1) {
/* 57 */     for (a a : au_()) {
/* 58 */       for (dlh dlh : a.a(a)) {
/* 59 */         if (dlh.b(☃, d1)) {
/* 60 */           return Optional.of(dlh);
/*    */         }
/*    */       } 
/*    */     } 
/* 64 */     return Optional.empty();
/*    */   }
/*    */   
/*    */   public static class a extends dlo.a<a> {
/*    */     private final List<dlh> a;
/*    */     
/*    */     private a(List<dlh> ☃) {
/* 71 */       this.a = ☃;
/*    */     }
/*    */     
/*    */     public static a a(dkd ☃, int i, dkc dkc1) {
/* 75 */       return new a((List<dlh>)ImmutableList.of(dkc1.a(☃, i / 2 - 155, 0, 310)));
/*    */     }
/*    */     
/*    */     public static a a(dkd ☃, int i, dkc dkc1, @Nullable dkc dkc2) {
/* 79 */       dlh dlh = dkc1.a(☃, i / 2 - 155, 0, 150);
/* 80 */       if (dkc2 == null) {
/* 81 */         return new a((List<dlh>)ImmutableList.of(dlh));
/*    */       }
/* 83 */       return new a((List<dlh>)ImmutableList.of(dlh, dkc2.a(☃, i / 2 - 155 + 160, 0, 150)));
/*    */     }
/*    */ 
/*    */     
/*    */     public void a(dfm ☃, int i, int j, int k, int m, int n, int i1, int i2, boolean bool, float f) {
/* 88 */       this.a.forEach(dlh1 -> {
/*    */             dlh1.m = ☃;
/*    */             dlh1.a(dfm1, i, j, f);
/*    */           });
/*    */     }
/*    */ 
/*    */     
/*    */     public List<? extends dmi> au_() {
/* 96 */       return (List)this.a;
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dlx.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */