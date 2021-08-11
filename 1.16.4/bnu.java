/*     */ import com.google.common.collect.Lists;
/*     */ import java.util.List;
/*     */ import java.util.function.Predicate;
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
/*     */ public class bnu
/*     */ {
/*  17 */   private static final List<a<bnt>> a = Lists.newArrayList();
/*  18 */   private static final List<a<blx>> b = Lists.newArrayList();
/*     */   
/*  20 */   private static final List<bon> c = Lists.newArrayList(); static {
/*  21 */     d = (☃ -> {
/*     */         for (bon bon : c) {
/*     */           if (bon.a(☃))
/*     */             return true; 
/*     */         } 
/*     */         return false;
/*     */       });
/*     */   }
/*     */   private static final Predicate<bmb> d;
/*     */   public static boolean a(bmb ☃) {
/*  31 */     return (b(☃) || c(☃));
/*     */   }
/*     */   
/*     */   protected static boolean b(bmb ☃) {
/*  35 */     for (int i = 0, j = b.size(); i < j; i++) {
/*  36 */       if (a.a(b.get(i)).a(☃)) {
/*  37 */         return true;
/*     */       }
/*     */     } 
/*  40 */     return false;
/*     */   }
/*     */   
/*     */   protected static boolean c(bmb ☃) {
/*  44 */     for (int i = 0, j = a.size(); i < j; i++) {
/*  45 */       if (a.a(a.get(i)).a(☃)) {
/*  46 */         return true;
/*     */       }
/*     */     } 
/*  49 */     return false;
/*     */   }
/*     */   
/*     */   public static boolean a(bnt ☃) {
/*  53 */     for (int i = 0, j = a.size(); i < j; i++) {
/*  54 */       if (a.b(a.get(i)) == ☃) {
/*  55 */         return true;
/*     */       }
/*     */     } 
/*  58 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public static boolean a(bmb ☃, bmb bmb1) {
/*  63 */     if (!d.test(☃)) {
/*  64 */       return false;
/*     */     }
/*     */     
/*  67 */     return (b(☃, bmb1) || c(☃, bmb1));
/*     */   }
/*     */   
/*     */   protected static boolean b(bmb ☃, bmb bmb1) {
/*  71 */     blx blx = ☃.b();
/*  72 */     for (int i = 0, j = b.size(); i < j; i++) {
/*  73 */       a<blx> a = b.get(i);
/*  74 */       if (a.c(a) == blx && a.a(a).a(bmb1)) {
/*  75 */         return true;
/*     */       }
/*     */     } 
/*  78 */     return false;
/*     */   }
/*     */   
/*     */   protected static boolean c(bmb ☃, bmb bmb1) {
/*  82 */     bnt bnt = bnv.d(☃);
/*  83 */     for (int i = 0, j = a.size(); i < j; i++) {
/*  84 */       a<bnt> a = a.get(i);
/*  85 */       if (a.c(a) == bnt && a.a(a).a(bmb1)) {
/*  86 */         return true;
/*     */       }
/*     */     } 
/*  89 */     return false;
/*     */   }
/*     */   
/*     */   public static bmb d(bmb ☃, bmb bmb1) {
/*  93 */     if (!bmb1.a()) {
/*  94 */       bnt bnt = bnv.d(bmb1);
/*  95 */       blx blx = bmb1.b(); int i, j;
/*  96 */       for (i = 0, j = b.size(); i < j; i++) {
/*  97 */         a<blx> a = b.get(i);
/*  98 */         if (a.c(a) == blx && a.a(a).a(☃)) {
/*  99 */           return bnv.a(new bmb((brw)a.b(a)), bnt);
/*     */         }
/*     */       } 
/*     */       
/* 103 */       for (i = 0, j = a.size(); i < j; i++) {
/* 104 */         a<bnt> a = a.get(i);
/* 105 */         if (a.c(a) == bnt && a.a(a).a(☃)) {
/* 106 */           return bnv.a(new bmb(blx), (bnt)a.b(a));
/*     */         }
/*     */       } 
/*     */     } 
/*     */     
/* 111 */     return bmb1;
/*     */   }
/*     */   
/*     */   public static void a() {
/* 115 */     a(bmd.nv);
/* 116 */     a(bmd.qj);
/* 117 */     a(bmd.qm);
/*     */     
/* 119 */     a(bmd.nv, bmd.kU, bmd.qj);
/* 120 */     a(bmd.qj, bmd.qi, bmd.qm);
/*     */     
/* 122 */     a(bnw.b, bmd.nE, bnw.c);
/* 123 */     a(bnw.b, bmd.ns, bnw.c);
/* 124 */     a(bnw.b, bmd.pA, bnw.c);
/* 125 */     a(bnw.b, bmd.nz, bnw.c);
/* 126 */     a(bnw.b, bmd.nx, bnw.c);
/* 127 */     a(bnw.b, bmd.mM, bnw.c);
/* 128 */     a(bnw.b, bmd.nA, bnw.c);
/*     */     
/* 130 */     a(bnw.b, bmd.mk, bnw.d);
/*     */     
/* 132 */     a(bnw.b, bmd.lP, bnw.c);
/*     */     
/* 134 */     a(bnw.b, bmd.nu, bnw.e);
/*     */     
/* 136 */     a(bnw.e, bmd.pd, bnw.f);
/* 137 */     a(bnw.f, bmd.lP, bnw.g);
/*     */     
/* 139 */     a(bnw.f, bmd.ny, bnw.h);
/* 140 */     a(bnw.g, bmd.ny, bnw.i);
/*     */     
/* 142 */     a(bnw.h, bmd.lP, bnw.i);
/*     */     
/* 144 */     a(bnw.e, bmd.nA, bnw.m);
/* 145 */     a(bnw.m, bmd.lP, bnw.n);
/*     */     
/* 147 */     a(bnw.e, bmd.pA, bnw.j);
/* 148 */     a(bnw.j, bmd.lP, bnw.k);
/* 149 */     a(bnw.j, bmd.mk, bnw.l);
/*     */     
/* 151 */     a(bnw.j, bmd.ny, bnw.r);
/* 152 */     a(bnw.k, bmd.ny, bnw.s);
/*     */     
/* 154 */     a(bnw.r, bmd.lP, bnw.s);
/*     */     
/* 156 */     a(bnw.r, bmd.mk, bnw.t);
/* 157 */     a(bnw.e, bmd.jY, bnw.u);
/* 158 */     a(bnw.u, bmd.lP, bnw.v);
/* 159 */     a(bnw.u, bmd.mk, bnw.w);
/*     */     
/* 161 */     a(bnw.o, bmd.ny, bnw.r);
/* 162 */     a(bnw.p, bmd.ny, bnw.s);
/*     */     
/* 164 */     a(bnw.e, bmd.mM, bnw.o);
/* 165 */     a(bnw.o, bmd.lP, bnw.p);
/* 166 */     a(bnw.o, bmd.mk, bnw.q);
/*     */     
/* 168 */     a(bnw.e, bmd.mo, bnw.x);
/* 169 */     a(bnw.x, bmd.lP, bnw.y);
/*     */     
/* 171 */     a(bnw.e, bmd.nE, bnw.z);
/* 172 */     a(bnw.z, bmd.mk, bnw.A);
/*     */     
/* 174 */     a(bnw.z, bmd.ny, bnw.B);
/* 175 */     a(bnw.A, bmd.ny, bnw.C);
/*     */     
/* 177 */     a(bnw.B, bmd.mk, bnw.C);
/*     */     
/* 179 */     a(bnw.D, bmd.ny, bnw.B);
/* 180 */     a(bnw.E, bmd.ny, bnw.B);
/* 181 */     a(bnw.F, bmd.ny, bnw.C);
/*     */     
/* 183 */     a(bnw.e, bmd.nx, bnw.D);
/* 184 */     a(bnw.D, bmd.lP, bnw.E);
/* 185 */     a(bnw.D, bmd.mk, bnw.F);
/*     */     
/* 187 */     a(bnw.e, bmd.ns, bnw.G);
/* 188 */     a(bnw.G, bmd.lP, bnw.H);
/* 189 */     a(bnw.G, bmd.mk, bnw.I);
/*     */     
/* 191 */     a(bnw.e, bmd.nz, bnw.J);
/* 192 */     a(bnw.J, bmd.lP, bnw.K);
/* 193 */     a(bnw.J, bmd.mk, bnw.L);
/*     */     
/* 195 */     a(bnw.b, bmd.ny, bnw.M);
/* 196 */     a(bnw.M, bmd.lP, bnw.N);
/*     */     
/* 198 */     a(bnw.e, bmd.qN, bnw.P);
/* 199 */     a(bnw.P, bmd.lP, bnw.Q);
/*     */   }
/*     */   
/*     */   private static void a(blx ☃, blx blx1, blx blx2) {
/* 203 */     if (!(☃ instanceof bmn)) {
/* 204 */       throw new IllegalArgumentException("Expected a potion, got: " + gm.T.b(☃));
/*     */     }
/* 206 */     if (!(blx2 instanceof bmn)) {
/* 207 */       throw new IllegalArgumentException("Expected a potion, got: " + gm.T.b(blx2));
/*     */     }
/* 209 */     b.add(new a<>(☃, bon.a(new brw[] { blx1 }, ), blx2));
/*     */   }
/*     */   
/*     */   private static void a(blx ☃) {
/* 213 */     if (!(☃ instanceof bmn)) {
/* 214 */       throw new IllegalArgumentException("Expected a potion, got: " + gm.T.b(☃));
/*     */     }
/* 216 */     c.add(bon.a(new brw[] { ☃ }));
/*     */   }
/*     */   
/*     */   private static void a(bnt ☃, blx blx1, bnt bnt1) {
/* 220 */     a.add(new a<>(☃, bon.a(new brw[] { blx1 }, ), bnt1));
/*     */   }
/*     */   
/*     */   static class a<T> {
/*     */     private final T a;
/*     */     private final bon b;
/*     */     private final T c;
/*     */     
/*     */     public a(T ☃, bon bon1, T t1) {
/* 229 */       this.a = ☃;
/* 230 */       this.b = bon1;
/* 231 */       this.c = t1;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bnu.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */