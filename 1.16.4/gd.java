/*    */ import com.google.common.collect.Sets;
/*    */ import java.util.Arrays;
/*    */ import java.util.Set;
/*    */ 
/*    */ 
/*    */ 
/*    */ public enum gd
/*    */ {
/*  9 */   a(new gc[] { gc.c }),
/* 10 */   b(new gc[] { gc.c, gc.f }),
/* 11 */   c(new gc[] { gc.f }),
/* 12 */   d(new gc[] { gc.d, gc.f }),
/* 13 */   e(new gc[] { gc.d }),
/* 14 */   f(new gc[] { gc.d, gc.e }),
/* 15 */   g(new gc[] { gc.e }),
/* 16 */   h(new gc[] { gc.c, gc.e }); private static final int i; private static final int j; private static final int k; private static final int l;
/*    */   static {
/* 18 */     i = 1 << h.ordinal();
/* 19 */     j = 1 << g.ordinal();
/* 20 */     k = 1 << f.ordinal();
/* 21 */     l = 1 << e.ordinal();
/* 22 */     m = 1 << d.ordinal();
/* 23 */     n = 1 << c.ordinal();
/* 24 */     o = 1 << b.ordinal();
/* 25 */     p = 1 << a.ordinal();
/*    */   }
/*    */   private static final int m; private static final int n; private static final int o; private static final int p; private final Set<gc> q;
/*    */   
/*    */   gd(gc... ☃) {
/* 30 */     this.q = (Set<gc>)Sets.immutableEnumSet(Arrays.asList(☃));
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public Set<gc> a() {
/* 60 */     return this.q;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\gd.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */