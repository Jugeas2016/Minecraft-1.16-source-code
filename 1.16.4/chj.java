/*     */ import com.mojang.serialization.Codec;
/*     */ import java.util.List;
/*     */ import java.util.function.Function;
/*     */ import java.util.stream.Collectors;
/*     */ import java.util.stream.Stream;
/*     */ import java.util.stream.StreamSupport;
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
/*     */ public class chj
/*     */   extends cfy
/*     */ {
/*  32 */   public static final Codec<chj> d = vg.<bsv>a(gm.ay).xmap(chj::new, chj::g).stable().codec(); private static final List<ceh> g;
/*     */   
/*     */   static {
/*  35 */     g = (List<ceh>)StreamSupport.stream(gm.Q.spliterator(), false).flatMap(☃ -> ☃.m().a().stream()).collect(Collectors.toList());
/*  36 */   } private static final int h = afm.f(afm.c(g.size()));
/*  37 */   private static final int i = afm.f(g.size() / h);
/*     */   
/*  39 */   protected static final ceh e = bup.a.n();
/*  40 */   protected static final ceh f = bup.go.n();
/*     */   
/*     */   private final gm<bsv> j;
/*     */   
/*     */   public chj(gm<bsv> ☃) {
/*  45 */     super(new btd(☃.d(btb.b)), new chv(false));
/*  46 */     this.j = ☃;
/*     */   }
/*     */   
/*     */   public gm<bsv> g() {
/*  50 */     return this.j;
/*     */   }
/*     */ 
/*     */   
/*     */   protected Codec<? extends cfy> a() {
/*  55 */     return (Codec)d;
/*     */   }
/*     */ 
/*     */   
/*     */   public cfy a(long ☃) {
/*  60 */     return this;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(aam ☃, cfw cfw1) {}
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(long ☃, bsx bsx1, cfw cfw1, chm.a a1) {}
/*     */ 
/*     */   
/*     */   public void a(aam ☃, bsn bsn1) {
/*  73 */     fx.a a = new fx.a();
/*     */     
/*  75 */     int i = ☃.a();
/*  76 */     int j = ☃.b();
/*     */     
/*  78 */     for (int k = 0; k < 16; k++) {
/*  79 */       for (int m = 0; m < 16; m++) {
/*  80 */         int n = (i << 4) + k;
/*  81 */         int i1 = (j << 4) + m;
/*  82 */         ☃.a(a.d(n, 60, i1), f, 2);
/*  83 */         ceh ceh1 = b(n, i1);
/*  84 */         if (ceh1 != null) {
/*  85 */           ☃.a(a.d(n, 70, i1), ceh1, 2);
/*     */         }
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(bry ☃, bsn bsn1, cfw cfw1) {}
/*     */ 
/*     */   
/*     */   public int a(int ☃, int i, chn.a a1) {
/*  97 */     return 0;
/*     */   }
/*     */ 
/*     */   
/*     */   public brc a(int ☃, int i) {
/* 102 */     return new bsh(new ceh[0]);
/*     */   }
/*     */   
/*     */   public static ceh b(int ☃, int i) {
/* 106 */     ceh ceh1 = e;
/*     */     
/* 108 */     if (☃ > 0 && i > 0 && ☃ % 2 != 0 && i % 2 != 0) {
/* 109 */       ☃ /= 2;
/* 110 */       i /= 2;
/*     */       
/* 112 */       if (☃ <= h && i <= i) {
/* 113 */         int j = afm.a(☃ * h + i);
/* 114 */         if (j < g.size()) {
/* 115 */           ceh1 = g.get(j);
/*     */         }
/*     */       } 
/*     */     } 
/*     */     
/* 120 */     return ceh1;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\chj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */