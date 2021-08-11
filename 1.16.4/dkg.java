/*    */ import com.google.common.collect.ImmutableList;
/*    */ import com.google.common.collect.ImmutableMap;
/*    */ import java.util.List;
/*    */ import java.util.Map;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public enum dkg
/*    */ {
/*    */   public static final List<dkg> s;
/*    */   public static final List<dkg> t;
/* 14 */   a(new bmb[] { new bmb(bmd.mh) }),
/* 15 */   b(new bmb[] { new bmb(bup.bG) }),
/* 16 */   c(new bmb[] { new bmb(bmd.lP) }),
/* 17 */   d(new bmb[] { new bmb(bmd.kD), new bmb(bmd.kv) }),
/* 18 */   e(new bmb[] { new bmb(bmd.lM), new bmb(bmd.kb)
/*    */     }),
/* 20 */   f(new bmb[] { new bmb(bmd.mh) }),
/* 21 */   g(new bmb[] { new bmb(bmd.lx) }),
/* 22 */   h(new bmb[] { new bmb(bup.b) }),
/* 23 */   i(new bmb[] { new bmb(bmd.lM), new bmb(bmd.oV)
/*    */     }),
/* 25 */   j(new bmb[] { new bmb(bmd.mh) }),
/* 26 */   k(new bmb[] { new bmb(bup.cy) }),
/* 27 */   l(new bmb[] { new bmb(bmd.kB), new bmb(bmd.lq)
/*    */     }),
/* 29 */   m(new bmb[] { new bmb(bmd.mh) }),
/* 30 */   n(new bmb[] { new bmb(bmd.lx)
/*    */     }),
/* 32 */   o(new bmb[] { new bmb(bmd.dJ)
/*    */     }),
/* 34 */   p(new bmb[] { new bmb(bmd.lt)
/*    */     }),
/* 36 */   q(new bmb[] { new bmb(bmd.lx)
/*    */     }),
/* 38 */   r(new bmb[] { new bmb(bmd.fJ) }); public static final List<dkg> u;
/*    */   
/*    */   static {
/* 41 */     s = (List<dkg>)ImmutableList.of(m, n);
/* 42 */     t = (List<dkg>)ImmutableList.of(j, k, l);
/* 43 */     u = (List<dkg>)ImmutableList.of(f, g, h, i);
/* 44 */     v = (List<dkg>)ImmutableList.of(a, d, b, e, c);
/*    */     
/* 46 */     w = (Map<dkg, List<dkg>>)ImmutableMap.of(a, 
/* 47 */         ImmutableList.of(d, b, e, c), f, 
/* 48 */         ImmutableList.of(g, h, i), j, 
/* 49 */         ImmutableList.of(k, l), m, 
/* 50 */         ImmutableList.of(n));
/*    */   }
/*    */   
/*    */   public static final List<dkg> v;
/*    */   
/*    */   dkg(bmb... ☃) {
/* 56 */     this.x = (List<bmb>)ImmutableList.copyOf((Object[])☃);
/*    */   }
/*    */   public static final Map<dkg, List<dkg>> w; private final List<bmb> x;
/*    */   public static List<dkg> a(bjk ☃) {
/* 60 */     switch (null.a[☃.ordinal()]) {
/*    */       case 1:
/* 62 */         return v;
/*    */       case 2:
/* 64 */         return u;
/*    */       case 3:
/* 66 */         return t;
/*    */       case 4:
/* 68 */         return s;
/*    */     } 
/* 70 */     return (List<dkg>)ImmutableList.of();
/*    */   }
/*    */ 
/*    */   
/*    */   public List<bmb> a() {
/* 75 */     return this.x;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dkg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */