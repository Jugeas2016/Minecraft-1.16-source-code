/*     */ import com.google.common.collect.Maps;
/*     */ import java.util.Map;
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
/*     */ public class ecd
/*     */ {
/*  28 */   private final Map<cck<?>, ece<?>> f = Maps.newHashMap();
/*     */   
/*  30 */   public static final ecd a = new ecd();
/*  31 */   private final dfh g = new dfh(256);
/*     */   
/*     */   private dku h;
/*     */   
/*     */   public ekd b;
/*     */   public brx c;
/*     */   public djk d;
/*     */   public dcl e;
/*     */   
/*     */   private ecd() {
/*  41 */     a(cck.h, new ecn(this));
/*  42 */     a(cck.i, new ecp(this));
/*  43 */     a(cck.j, new ecl(this));
/*  44 */     a(cck.b, new ech<>(this));
/*  45 */     a(cck.d, new ech<>(this));
/*  46 */     a(cck.c, new ech<>(this));
/*  47 */     a(cck.l, new ecj(this));
/*  48 */     a(cck.C, new eck(this));
/*  49 */     a(cck.m, new ecs<>(this));
/*  50 */     a(cck.u, new ecr(this));
/*  51 */     a(cck.n, new eca(this));
/*  52 */     a(cck.o, new eco(this));
/*  53 */     a(cck.s, new ebz(this));
/*  54 */     a(cck.t, new ecq(this));
/*  55 */     a(cck.w, new ecm(new dvq(), this));
/*  56 */     a(cck.x, new ecb(this));
/*  57 */     a(cck.y, new eci(this));
/*  58 */     a(cck.D, new ecc(this));
/*  59 */     a(cck.F, new ecg(this));
/*     */   }
/*     */   
/*     */   private <E extends ccj> void a(cck<E> ☃, ece<E> ece1) {
/*  63 */     this.f.put(☃, ece1);
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public <E extends ccj> ece<E> a(E ☃) {
/*  69 */     return (ece<E>)this.f.get(☃.u());
/*     */   }
/*     */   
/*     */   public void a(brx ☃, ekd ekd1, dku dku1, djk djk1, dcl dcl1) {
/*  73 */     if (this.c != ☃) {
/*  74 */       a(☃);
/*     */     }
/*  76 */     this.b = ekd1;
/*  77 */     this.d = djk1;
/*  78 */     this.h = dku1;
/*  79 */     this.e = dcl1;
/*     */   }
/*     */   
/*     */   public <E extends ccj> void a(E ☃, float f, dfm dfm1, eag eag1) {
/*  83 */     if (!dcn.a(☃.o()).a(this.d.b(), ☃.i())) {
/*     */       return;
/*     */     }
/*  86 */     ece<E> ece = a(☃);
/*  87 */     if (ece == null) {
/*     */       return;
/*     */     }
/*     */ 
/*     */     
/*  92 */     if (!☃.n() || !☃.u().a(☃.p().b())) {
/*     */       return;
/*     */     }
/*     */     
/*  96 */     a((ccj)☃, () -> a(☃, ccj1, f, dfm1, eag1));
/*     */   }
/*     */   
/*     */   private static <T extends ccj> void a(ece<T> ☃, T t, float f, dfm dfm1, eag eag1) {
/*     */     int i;
/* 101 */     brx brx1 = t.v();
/* 102 */     if (brx1 != null) {
/* 103 */       i = eae.a(brx1, t.o());
/*     */     } else {
/* 105 */       i = 15728880;
/*     */     } 
/* 107 */     ☃.a(t, f, dfm1, eag1, i, ejw.a);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public <E extends ccj> boolean a(E ☃, dfm dfm1, eag eag1, int i, int j) {
/* 118 */     ece<E> ece = a(☃);
/* 119 */     if (ece == null) {
/* 120 */       return true;
/*     */     }
/* 122 */     a((ccj)☃, () -> ☃.a(ccj1, 0.0F, dfm1, eag1, i, j));
/* 123 */     return false;
/*     */   }
/*     */   
/*     */   private static void a(ccj ☃, Runnable runnable) {
/*     */     try {
/* 128 */       runnable.run();
/* 129 */     } catch (Throwable throwable) {
/* 130 */       l l = l.a(throwable, "Rendering Block Entity");
/* 131 */       m m = l.a("Block Entity Details");
/*     */       
/* 133 */       ☃.a(m);
/*     */       
/* 135 */       throw new u(l);
/*     */     } 
/*     */   }
/*     */   
/*     */   public void a(@Nullable brx ☃) {
/* 140 */     this.c = ☃;
/* 141 */     if (☃ == null) {
/* 142 */       this.d = null;
/*     */     }
/*     */   }
/*     */   
/*     */   public dku a() {
/* 147 */     return this.h;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ecd.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */