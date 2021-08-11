/*     */ import com.google.common.collect.Iterables;
/*     */ import com.google.common.collect.Maps;
/*     */ import java.util.Map;
/*     */ import java.util.Objects;
/*     */ import java.util.Optional;
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
/*     */ public class bna
/*     */   extends blx
/*     */ {
/*  39 */   private static final Map<aqe<?>, bna> a = Maps.newIdentityHashMap();
/*     */   
/*     */   private final int b;
/*     */   private final int c;
/*     */   private final aqe<?> d;
/*     */   
/*     */   public bna(aqe<?> ☃, int i, int j, blx.a a1) {
/*  46 */     super(a1);
/*  47 */     this.d = ☃;
/*  48 */     this.b = i;
/*  49 */     this.c = j;
/*     */     
/*  51 */     a.put(☃, this);
/*     */   }
/*     */   
/*     */   public aou a(boa ☃) {
/*     */     fx fx2;
/*  56 */     brx brx = ☃.p();
/*  57 */     if (!(brx instanceof aag)) {
/*  58 */       return aou.a;
/*     */     }
/*     */     
/*  61 */     bmb bmb = ☃.m();
/*  62 */     fx fx1 = ☃.a();
/*  63 */     gc gc = ☃.j();
/*     */     
/*  65 */     ceh ceh = brx.d_(fx1);
/*  66 */     if (ceh.a(bup.bP)) {
/*  67 */       ccj ccj = brx.c(fx1);
/*  68 */       if (ccj instanceof cdi) {
/*  69 */         bqz bqz = ((cdi)ccj).d();
/*  70 */         aqe<?> aqe2 = a(bmb.o());
/*  71 */         bqz.a(aqe2);
/*  72 */         ccj.X_();
/*  73 */         brx.a(fx1, ceh, ceh, 3);
/*  74 */         bmb.g(1);
/*  75 */         return aou.b;
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/*  80 */     if (ceh.k(brx, fx1).b()) {
/*  81 */       fx2 = fx1;
/*     */     } else {
/*  83 */       fx2 = fx1.a(gc);
/*     */     } 
/*     */     
/*  86 */     aqe<?> aqe1 = a(bmb.o());
/*  87 */     if (aqe1.a((aag)brx, bmb, ☃.n(), fx2, aqp.m, true, (!Objects.equals(fx1, fx2) && gc == gc.b)) != null) {
/*  88 */       bmb.g(1);
/*     */     }
/*     */     
/*  91 */     return aou.b;
/*     */   }
/*     */ 
/*     */   
/*     */   public aov<bmb> a(brx ☃, bfw bfw1, aot aot1) {
/*  96 */     bmb bmb = bfw1.b(aot1);
/*     */     
/*  98 */     dcl dcl = a(☃, bfw1, brf.b.b);
/*  99 */     if (dcl.c() != dcl.a.b) {
/* 100 */       return aov.c(bmb);
/*     */     }
/*     */     
/* 103 */     if (!(☃ instanceof aag)) {
/* 104 */       return aov.a(bmb);
/*     */     }
/*     */     
/* 107 */     dcj dcj = (dcj)dcl;
/* 108 */     fx fx = dcj.a();
/* 109 */     if (!(☃.d_(fx).b() instanceof byb)) {
/* 110 */       return aov.c(bmb);
/*     */     }
/* 112 */     if (!☃.a(bfw1, fx) || !bfw1.a(fx, dcj.b(), bmb)) {
/* 113 */       return aov.d(bmb);
/*     */     }
/* 115 */     aqe<?> aqe1 = a(bmb.o());
/* 116 */     if (aqe1.a((aag)☃, bmb, bfw1, fx, aqp.m, false, false) == null) {
/* 117 */       return aov.c(bmb);
/*     */     }
/* 119 */     if (!bfw1.bC.d) {
/* 120 */       bmb.g(1);
/*     */     }
/* 122 */     bfw1.b(aea.c.b(this));
/* 123 */     return aov.b(bmb);
/*     */   }
/*     */   
/*     */   public boolean a(@Nullable md ☃, aqe<?> aqe1) {
/* 127 */     return Objects.equals(a(☃), aqe1);
/*     */   }
/*     */   
/*     */   public int a(int ☃) {
/* 131 */     return (☃ == 0) ? this.b : this.c;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public static bna a(@Nullable aqe<?> ☃) {
/* 136 */     return a.get(☃);
/*     */   }
/*     */   
/*     */   public static Iterable<bna> f() {
/* 140 */     return Iterables.unmodifiableIterable(a.values());
/*     */   }
/*     */   
/*     */   public aqe<?> a(@Nullable md ☃) {
/* 144 */     if (☃ != null && 
/* 145 */       ☃.c("EntityTag", 10)) {
/* 146 */       md md1 = ☃.p("EntityTag");
/* 147 */       if (md1.c("id", 8)) {
/* 148 */         return aqe.a(md1.l("id")).orElse(this.d);
/*     */       }
/*     */     } 
/*     */     
/* 152 */     return this.d;
/*     */   }
/*     */   public Optional<aqn> a(bfw ☃, aqn aqn1, aqe<? extends aqn> aqe1, aag aag1, dcn dcn1, bmb bmb1) {
/*     */     aqn aqn2;
/* 156 */     if (!a(bmb1.o(), aqe1)) {
/* 157 */       return Optional.empty();
/*     */     }
/*     */ 
/*     */     
/* 161 */     if (aqn1 instanceof apy) {
/* 162 */       aqn2 = ((apy)aqn1).a(aag1, (apy)aqn1);
/*     */     } else {
/* 164 */       aqn2 = aqe1.a(aag1);
/*     */     } 
/* 166 */     if (aqn2 == null) {
/* 167 */       return Optional.empty();
/*     */     }
/*     */     
/* 170 */     aqn2.a(true);
/* 171 */     if (!aqn2.w_()) {
/* 172 */       return Optional.empty();
/*     */     }
/*     */     
/* 175 */     aqn2.b(dcn1.a(), dcn1.b(), dcn1.c(), 0.0F, 0.0F);
/*     */     
/* 177 */     aag1.l(aqn2);
/*     */     
/* 179 */     if (bmb1.t()) {
/* 180 */       aqn2.a(bmb1.r());
/*     */     }
/* 182 */     if (!☃.bC.d) {
/* 183 */       bmb1.g(1);
/*     */     }
/* 185 */     return Optional.of(aqn2);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bna.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */