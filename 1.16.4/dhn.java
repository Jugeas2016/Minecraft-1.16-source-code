/*    */ import java.util.List;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class dhn
/*    */ {
/*    */   public final int a;
/*    */   public final int b;
/*    */   public final int c;
/*    */   public final int d;
/*    */   
/*    */   public dhn(int ☃, int i, int j, int k) {
/* 17 */     this.a = ☃;
/* 18 */     this.b = i;
/* 19 */     this.c = j;
/* 20 */     this.d = k;
/*    */   }
/*    */   
/*    */   public void a(dfm ☃, int i, int j, int k, int m) {
/* 24 */     int n = i + this.c;
/* 25 */     int i1 = j + this.d;
/* 26 */     boolean bool = false;
/* 27 */     if (k >= n && k <= n + this.a && m >= i1 && m <= i1 + this.b) {
/* 28 */       bool = true;
/*    */     }
/* 30 */     a(☃, n, i1, bool);
/*    */   }
/*    */   
/*    */   protected abstract void a(dfm paramdfm, int paramInt1, int paramInt2, boolean paramBoolean);
/*    */   
/*    */   public int a() {
/* 36 */     return this.c + this.a;
/*    */   }
/*    */   
/*    */   public int b() {
/* 40 */     return this.d + this.b;
/*    */   }
/*    */   
/*    */   public abstract void a(int paramInt);
/*    */   
/*    */   public static void a(dfm ☃, List<dhn> list, eon<?> eon1, int i, int j, int k, int m) {
/* 46 */     for (dhn dhn1 : list) {
/* 47 */       if (eon1.d() > dhn1.a()) {
/* 48 */         dhn1.a(☃, i, j, k, m);
/*    */       }
/*    */     } 
/*    */   }
/*    */   
/*    */   public static void a(eon<?> ☃, dlv.a<?> a1, List<dhn> list, int i, double d1, double d2) {
/* 54 */     if (i == 0) {
/* 55 */       int j = ☃.au_().indexOf(a1);
/* 56 */       if (j > -1) {
/*    */         
/* 58 */         ☃.a(j);
/* 59 */         int k = ☃.q();
/* 60 */         int m = ☃.h(j);
/* 61 */         int n = (int)(d1 - k);
/* 62 */         int i1 = (int)(d2 - m);
/*    */         
/* 64 */         for (dhn dhn1 : list) {
/* 65 */           if (n >= dhn1.c && n <= dhn1.a() && i1 >= dhn1.d && i1 <= dhn1.b())
/* 66 */             dhn1.a(j); 
/*    */         } 
/*    */       } 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dhn.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */