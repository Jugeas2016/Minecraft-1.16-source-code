/*     */ import com.google.common.collect.Maps;
/*     */ import java.util.Map;
/*     */ import java.util.Random;
/*     */ import javax.annotation.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ard
/*     */ {
/*     */   @FunctionalInterface
/*     */   public static interface b<T extends aqa>
/*     */   {
/*     */     boolean test(aqe<T> param1aqe, bsk param1bsk, aqp param1aqp, fx param1fx, Random param1Random);
/*     */   }
/*     */   
/*     */   static class a
/*     */   {
/*     */     private final chn.a a;
/*     */     private final ard.c b;
/*     */     private final ard.b<?> c;
/*     */     
/*     */     public a(chn.a ☃, ard.c c1, ard.b<?> b1) {
/*  53 */       this.a = ☃;
/*  54 */       this.b = c1;
/*  55 */       this.c = b1;
/*     */     }
/*     */   }
/*     */   
/*  59 */   private static final Map<aqe<?>, a> a = Maps.newHashMap();
/*     */   
/*     */   private static <T extends aqn> void a(aqe<T> ☃, c c1, chn.a a1, b<T> b1) {
/*  62 */     a a2 = a.put(☃, new a(a1, c1, b1));
/*  63 */     if (a2 != null) {
/*  64 */       throw new IllegalStateException("Duplicate registration for type " + gm.S.b(☃));
/*     */     }
/*     */   }
/*     */   
/*     */   static {
/*  69 */     a(aqe.k, c.b, chn.a.f, azw::b);
/*  70 */     a(aqe.n, c.b, chn.a.f, baf::b);
/*  71 */     a(aqe.q, c.b, chn.a.f, bde::a);
/*  72 */     a(aqe.F, c.b, chn.a.f, bdm::b);
/*  73 */     a(aqe.an, c.b, chn.a.f, azw::b);
/*  74 */     a(aqe.aq, c.b, chn.a.f, azw::b);
/*  75 */     a(aqe.aD, c.b, chn.a.f, bav::b);
/*  76 */     a(aqe.aM, c.b, chn.a.f, azw::b);
/*     */     
/*  78 */     a(aqe.d, c.a, chn.a.f, azu::b);
/*  79 */     a(aqe.f, c.a, chn.a.f, bdq::c);
/*  80 */     a(aqe.i, c.a, chn.a.f, bdq::b);
/*  81 */     a(aqe.j, c.a, chn.a.f, azz::b);
/*  82 */     a(aqe.l, c.a, chn.a.f, azz::b);
/*  83 */     a(aqe.m, c.a, chn.a.f, bdq::b);
/*  84 */     a(aqe.o, c.a, chn.a.f, azz::b);
/*  85 */     a(aqe.u, c.a, chn.a.f, bdq::b);
/*  86 */     a(aqe.v, c.a, chn.a.f, bdh::b);
/*  87 */     a(aqe.t, c.a, chn.a.f, aqn::a);
/*  88 */     a(aqe.D, c.a, chn.a.f, bdk::b);
/*  89 */     a(aqe.E, c.a, chn.a.f, bdq::b);
/*  90 */     a(aqe.H, c.a, chn.a.f, azz::b);
/*  91 */     a(aqe.I, c.a, chn.a.f, bdn::a);
/*  92 */     a(aqe.K, c.a, chn.a.f, aqn::a);
/*  93 */     a(aqe.Q, c.a, chn.a.f, azz::b);
/*  94 */     a(aqe.S, c.a, chn.a.f, bdp::b);
/*  95 */     a(aqe.ab, c.a, chn.a.f, baj::c);
/*  96 */     a(aqe.aa, c.a, chn.a.f, azz::b);
/*  97 */     a(aqe.ac, c.a, chn.a.e, bak::c);
/*  98 */     a(aqe.af, c.a, chn.a.e, bam::c);
/*  99 */     a(aqe.ah, c.a, chn.a.f, azz::b);
/* 100 */     a(aqe.G, c.a, chn.a.f, bem::c);
/* 101 */     a(aqe.ai, c.a, chn.a.f, bes::b);
/* 102 */     a(aqe.ak, c.a, chn.a.f, bdr::b);
/* 103 */     a(aqe.al, c.a, chn.a.f, bao::c);
/* 104 */     a(aqe.ao, c.a, chn.a.f, baq::c);
/* 105 */     a(aqe.ar, c.a, chn.a.f, azz::b);
/* 106 */     a(aqe.au, c.a, chn.a.f, bdx::b);
/* 107 */     a(aqe.av, c.a, chn.a.f, bdq::b);
/* 108 */     a(aqe.aw, c.a, chn.a.f, azz::b);
/* 109 */     a(aqe.ax, c.a, chn.a.f, bdz::c);
/* 110 */     a(aqe.az, c.a, chn.a.f, aqn::a);
/* 111 */     a(aqe.aC, c.a, chn.a.f, bdq::b);
/* 112 */     a(aqe.aE, c.a, chn.a.f, bec::a);
/* 113 */     a(aqe.aF, c.d, chn.a.f, bed::c);
/* 114 */     a(aqe.aN, c.a, chn.a.f, bax::c);
/* 115 */     a(aqe.aP, c.a, chn.a.f, aqn::a);
/* 116 */     a(aqe.aS, c.a, chn.a.f, bdq::b);
/* 117 */     a(aqe.aT, c.a, chn.a.f, bdq::b);
/* 118 */     a(aqe.aU, c.a, chn.a.f, bdq::b);
/* 119 */     a(aqe.aW, c.a, chn.a.f, azz::b);
/* 120 */     a(aqe.aY, c.a, chn.a.f, bdq::b);
/* 121 */     a(aqe.aZ, c.a, chn.a.f, azz::b);
/* 122 */     a(aqe.bb, c.a, chn.a.f, bel::b);
/* 123 */     a(aqe.ba, c.a, chn.a.f, bdq::b);
/*     */ 
/*     */     
/* 126 */     a(aqe.h, c.a, chn.a.f, azz::b);
/* 127 */     a(aqe.r, c.b, chn.a.f, bdm::b);
/* 128 */     a(aqe.w, c.c, chn.a.f, bdq::b);
/* 129 */     a(aqe.C, c.c, chn.a.f, azz::b);
/* 130 */     a(aqe.J, c.c, chn.a.f, bdq::b);
/* 131 */     a(aqe.ae, c.c, chn.a.f, azz::b);
/* 132 */     a(aqe.ag, c.c, chn.a.f, aqn::a);
/* 133 */     a(aqe.ap, c.c, chn.a.f, bdq::b);
/* 134 */     a(aqe.as, c.c, chn.a.f, aqn::a);
/* 135 */     a(aqe.aL, c.c, chn.a.f, azz::b);
/* 136 */     a(aqe.aO, c.c, chn.a.f, bdq::b);
/* 137 */     a(aqe.aQ, c.c, chn.a.f, bdq::b);
/* 138 */     a(aqe.aR, c.c, chn.a.f, aqn::a);
/*     */   }
/*     */   
/*     */   public static c a(aqe<?> ☃) {
/* 142 */     a a = a.get(☃);
/* 143 */     return (a == null) ? c.c : a.a(a);
/*     */   }
/*     */   
/*     */   public static chn.a b(@Nullable aqe<?> ☃) {
/* 147 */     a a = a.get(☃);
/* 148 */     return (a == null) ? chn.a.f : a.b(a);
/*     */   }
/*     */ 
/*     */   
/*     */   public static <T extends aqa> boolean a(aqe<T> ☃, bsk bsk1, aqp aqp1, fx fx1, Random random) {
/* 153 */     a a = a.get(☃);
/* 154 */     return (a == null || a.c(a).test(☃, bsk1, aqp1, fx1, random));
/*     */   }
/*     */   
/*     */   public enum c {
/* 158 */     a,
/* 159 */     b,
/* 160 */     c,
/* 161 */     d;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ard.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */