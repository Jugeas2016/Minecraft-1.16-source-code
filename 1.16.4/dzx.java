/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public enum dzx
/*    */ {
/*  7 */   a(new b[] { new b(a.f, a.e, a.a), new b(a.f, a.e, a.d), new b(a.c, a.e, a.d), new b(a.c, a.e, a.a)
/*    */ 
/*    */     
/*    */     }),
/* 11 */   b(new b[] { new b(a.f, a.b, a.d), new b(a.f, a.b, a.a), new b(a.c, a.b, a.a), new b(a.c, a.b, a.d)
/*    */ 
/*    */     
/*    */     }),
/* 15 */   c(new b[] { new b(a.c, a.b, a.d), new b(a.c, a.e, a.d), new b(a.f, a.e, a.d), new b(a.f, a.b, a.d)
/*    */ 
/*    */     
/*    */     }),
/* 19 */   d(new b[] { new b(a.f, a.b, a.a), new b(a.f, a.e, a.a), new b(a.c, a.e, a.a), new b(a.c, a.b, a.a)
/*    */ 
/*    */     
/*    */     }),
/* 23 */   e(new b[] { new b(a.f, a.b, a.d), new b(a.f, a.e, a.d), new b(a.f, a.e, a.a), new b(a.f, a.b, a.a)
/*    */ 
/*    */     
/*    */     }),
/* 27 */   f(new b[] { new b(a.c, a.b, a.a), new b(a.c, a.e, a.a), new b(a.c, a.e, a.d), new b(a.c, a.b, a.d) });
/*    */   
/*    */   private static final dzx[] g;
/*    */   
/*    */   private final b[] h;
/*    */   
/*    */   public static final class a
/*    */   {
/* 35 */     public static final int a = gc.d.c();
/* 36 */     public static final int b = gc.b.c();
/* 37 */     public static final int c = gc.f.c();
/* 38 */     public static final int d = gc.c.c();
/* 39 */     public static final int e = gc.a.c();
/* 40 */     public static final int f = gc.e.c(); }
/*    */   
/*    */   static {
/* 43 */     g = x.<dzx[]>a(new dzx[6], ☃ -> {
/*    */           ☃[a.e] = a;
/*    */           ☃[a.b] = b;
/*    */           ☃[a.d] = c;
/*    */           ☃[a.a] = d;
/*    */           ☃[a.f] = e;
/*    */           ☃[a.c] = f;
/*    */         });
/*    */   }
/*    */ 
/*    */   
/*    */   public static dzx a(gc ☃) {
/* 55 */     return g[☃.c()];
/*    */   }
/*    */   
/*    */   dzx(b... ☃) {
/* 59 */     this.h = ☃;
/*    */   }
/*    */   
/*    */   public b a(int ☃) {
/* 63 */     return this.h[☃];
/*    */   }
/*    */   
/*    */   public static class b {
/*    */     public final int a;
/*    */     public final int b;
/*    */     public final int c;
/*    */     
/*    */     private b(int ☃, int i, int j) {
/* 72 */       this.a = ☃;
/* 73 */       this.b = i;
/* 74 */       this.c = j;
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dzx.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */