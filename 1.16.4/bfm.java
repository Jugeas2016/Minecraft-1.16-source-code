/*    */ import com.google.common.collect.ImmutableSet;
/*    */ import javax.annotation.Nullable;
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
/*    */ public class bfm
/*    */ {
/* 17 */   public static final bfm a = a("none", azr.c, null);
/* 18 */   public static final bfm b = a("armorer", azr.d, adq.pZ);
/* 19 */   public static final bfm c = a("butcher", azr.e, adq.qa);
/* 20 */   public static final bfm d = a("cartographer", azr.f, adq.qb);
/* 21 */   public static final bfm e = a("cleric", azr.g, adq.qc);
/* 22 */   public static final bfm f = a("farmer", azr.h, ImmutableSet.of(bmd.kW, bmd.kV, bmd.qg, bmd.mK), ImmutableSet.of(bup.bX), adq.qd);
/* 23 */   public static final bfm g = a("fisherman", azr.i, adq.qe);
/* 24 */   public static final bfm h = a("fletcher", azr.j, adq.qf);
/* 25 */   public static final bfm i = a("leatherworker", azr.k, adq.qg);
/* 26 */   public static final bfm j = a("librarian", azr.l, adq.qh);
/* 27 */   public static final bfm k = a("mason", azr.m, adq.qi);
/* 28 */   public static final bfm l = a("nitwit", azr.n, null);
/* 29 */   public static final bfm m = a("shepherd", azr.o, adq.qj);
/* 30 */   public static final bfm n = a("toolsmith", azr.p, adq.qk);
/* 31 */   public static final bfm o = a("weaponsmith", azr.q, adq.ql);
/*    */   
/*    */   private final String p;
/*    */   private final azr q;
/*    */   private final ImmutableSet<blx> r;
/*    */   private final ImmutableSet<buo> s;
/*    */   @Nullable
/*    */   private final adp t;
/*    */   
/*    */   private bfm(String ☃, azr azr1, ImmutableSet<blx> immutableSet, ImmutableSet<buo> immutableSet1, @Nullable adp adp1) {
/* 41 */     this.p = ☃;
/* 42 */     this.q = azr1;
/* 43 */     this.r = immutableSet;
/* 44 */     this.s = immutableSet1;
/* 45 */     this.t = adp1;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public azr b() {
/* 53 */     return this.q;
/*    */   }
/*    */   
/*    */   public ImmutableSet<blx> c() {
/* 57 */     return this.r;
/*    */   }
/*    */   
/*    */   public ImmutableSet<buo> d() {
/* 61 */     return this.s;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public adp e() {
/* 66 */     return this.t;
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 71 */     return this.p;
/*    */   }
/*    */   
/*    */   static bfm a(String ☃, azr azr1, @Nullable adp adp1) {
/* 75 */     return a(☃, azr1, ImmutableSet.of(), ImmutableSet.of(), adp1);
/*    */   }
/*    */   
/*    */   static bfm a(String ☃, azr azr1, ImmutableSet<blx> immutableSet, ImmutableSet<buo> immutableSet1, @Nullable adp adp1) {
/* 79 */     return gm.<bfm, bfm>a(gm.ai, new vk(☃), new bfm(☃, azr1, immutableSet, immutableSet1, adp1));
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bfm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */