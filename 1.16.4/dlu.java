/*     */ import com.google.common.collect.ImmutableList;
/*     */ import java.util.Arrays;
/*     */ import java.util.List;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public interface dlu
/*     */ {
/*  14 */   public static final dlu a = new dlu()
/*     */     {
/*     */       public int a(dfm ☃, int i, int j) {
/*  17 */         return j;
/*     */       }
/*     */ 
/*     */       
/*     */       public int a(dfm ☃, int i, int j, int k, int m) {
/*  22 */         return j;
/*     */       }
/*     */ 
/*     */       
/*     */       public int b(dfm ☃, int i, int j, int k, int m) {
/*  27 */         return j;
/*     */       }
/*     */ 
/*     */       
/*     */       public int c(dfm ☃, int i, int j, int k, int m) {
/*  32 */         return j;
/*     */       }
/*     */ 
/*     */       
/*     */       public int a() {
/*  37 */         return 0;
/*     */       }
/*     */     };
/*     */   
/*     */   static dlu a(dku ☃, nu nu1, int i) {
/*  42 */     return b(☃, (List<a>)☃.b(nu1, i).stream().map(afa1 -> new a(afa1, ☃.a(afa1))).collect(ImmutableList.toImmutableList()));
/*     */   }
/*     */   
/*     */   static dlu a(dku ☃, nu nu1, int i, int j) {
/*  46 */     return b(☃, (List<a>)☃.b(nu1, i).stream().limit(j).map(afa1 -> new a(afa1, ☃.a(afa1))).collect(ImmutableList.toImmutableList()));
/*     */   }
/*     */   
/*     */   static dlu a(dku ☃, nr... arrayOfNr) {
/*  50 */     return b(☃, (List<a>)Arrays.<nr>stream(arrayOfNr).map(nr::f).map(afa1 -> new a(afa1, ☃.a(afa1))).collect(ImmutableList.toImmutableList()));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   static dlu b(dku ☃, List<a> list) {
/*  58 */     if (list.isEmpty()) {
/*  59 */       return a;
/*     */     }
/*     */     
/*  62 */     return new dlu(☃, list)
/*     */       {
/*     */         public int a(dfm ☃, int i, int j) {
/*  65 */           this.b.getClass(); return a(☃, i, j, 9, 16777215);
/*     */         }
/*     */ 
/*     */         
/*     */         public int a(dfm ☃, int i, int j, int k, int m) {
/*  70 */           int n = j;
/*  71 */           for (dlu.a a : this.c) {
/*  72 */             this.b.a(☃, dlu.a.a(a), (i - dlu.a.b(a) / 2), n, m);
/*  73 */             n += k;
/*     */           } 
/*  75 */           return n;
/*     */         }
/*     */ 
/*     */         
/*     */         public int b(dfm ☃, int i, int j, int k, int m) {
/*  80 */           int n = j;
/*  81 */           for (dlu.a a : this.c) {
/*  82 */             this.b.a(☃, dlu.a.a(a), i, n, m);
/*  83 */             n += k;
/*     */           } 
/*  85 */           return n;
/*     */         }
/*     */ 
/*     */         
/*     */         public int c(dfm ☃, int i, int j, int k, int m) {
/*  90 */           int n = j;
/*  91 */           for (dlu.a a : this.c) {
/*  92 */             this.b.b(☃, dlu.a.a(a), i, n, m);
/*  93 */             n += k;
/*     */           } 
/*  95 */           return n;
/*     */         }
/*     */ 
/*     */         
/*     */         public int a() {
/* 100 */           return this.c.size();
/*     */         }
/*     */       };
/*     */   }
/*     */   
/*     */   int a(dfm paramdfm, int paramInt1, int paramInt2);
/*     */   
/*     */   int a(dfm paramdfm, int paramInt1, int paramInt2, int paramInt3, int paramInt4);
/*     */   
/*     */   int b(dfm paramdfm, int paramInt1, int paramInt2, int paramInt3, int paramInt4);
/*     */   
/*     */   int c(dfm paramdfm, int paramInt1, int paramInt2, int paramInt3, int paramInt4);
/*     */   
/*     */   int a();
/*     */   
/*     */   public static class a {
/*     */     private final afa a;
/*     */     private final int b;
/*     */     
/*     */     private a(afa ☃, int i) {
/* 120 */       this.a = ☃;
/* 121 */       this.b = i;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dlu.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */