/*     */ import java.util.Optional;
/*     */ import java.util.Random;
/*     */ import java.util.UUID;
/*     */ import org.apache.commons.lang3.tuple.Pair;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ public class baj
/*     */   extends bae
/*     */   implements arb
/*     */ {
/*  45 */   private static final us<String> bo = uv.a((Class)baj.class, uu.d);
/*     */   
/*     */   private aps bp;
/*     */   
/*     */   private int bq;
/*     */   private UUID br;
/*     */   
/*     */   public baj(aqe<? extends baj> ☃, brx brx1) {
/*  53 */     super((aqe)☃, brx1);
/*     */   }
/*     */ 
/*     */   
/*     */   public float a(fx ☃, brz brz1) {
/*  58 */     if (brz1.d_(☃.c()).a(bup.dT)) {
/*  59 */       return 10.0F;
/*     */     }
/*  61 */     return brz1.y(☃) - 0.5F;
/*     */   }
/*     */   
/*     */   public static boolean c(aqe<baj> ☃, bry bry1, aqp aqp1, fx fx1, Random random) {
/*  65 */     return (bry1.d_(fx1.c()).a(bup.dT) && bry1
/*  66 */       .b(fx1, 0) > 8);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(aag ☃, aql aql1) {
/*  71 */     UUID uUID = aql1.bS();
/*  72 */     if (!uUID.equals(this.br)) {
/*  73 */       a((eL() == a.a) ? a.b : a.a);
/*  74 */       this.br = uUID;
/*  75 */       a(adq.hK, 2.0F, 1.0F);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   protected void e() {
/*  81 */     super.e();
/*     */     
/*  83 */     this.R.a(bo, a.a(a.a));
/*     */   }
/*     */ 
/*     */   
/*     */   public aou b(bfw ☃, aot aot1) {
/*  88 */     bmb bmb = ☃.b(aot1);
/*  89 */     if (bmb.b() == bmd.kQ && !w_()) {
/*     */       bmb bmb1; adp adp;
/*  91 */       boolean bool = false;
/*     */       
/*  93 */       if (this.bp != null) {
/*  94 */         bool = true;
/*  95 */         bmb1 = new bmb(bmd.qR);
/*  96 */         bne.a(bmb1, this.bp, this.bq);
/*  97 */         this.bp = null;
/*  98 */         this.bq = 0;
/*     */       } else {
/* 100 */         bmb1 = new bmb(bmd.kR);
/*     */       } 
/*     */       
/* 103 */       bmb bmb2 = bmc.a(bmb, ☃, bmb1, false);
/* 104 */       ☃.a(aot1, bmb2);
/*     */ 
/*     */       
/* 107 */       if (bool) {
/* 108 */         adp = adq.hN;
/*     */       } else {
/* 110 */         adp = adq.hM;
/*     */       } 
/*     */       
/* 113 */       a(adp, 1.0F, 1.0F);
/*     */       
/* 115 */       return aou.a(this.l.v);
/*     */     } 
/*     */     
/* 118 */     if (bmb.b() == bmd.ng && K_()) {
/* 119 */       a(adr.h);
/* 120 */       if (!this.l.v) {
/* 121 */         bmb.a(1, ☃, bfw1 -> bfw1.d(☃));
/*     */       }
/* 123 */       return aou.a(this.l.v);
/*     */     } 
/*     */ 
/*     */     
/* 127 */     if (eL() == a.b && bmb.b().a(aeg.I)) {
/* 128 */       if (this.bp != null) {
/* 129 */         for (int i = 0; i < 2; i++) {
/* 130 */           this.l.a(hh.S, cD() + this.J.nextDouble() / 2.0D, e(0.5D), cH() + this.J.nextDouble() / 2.0D, 0.0D, this.J.nextDouble() / 5.0D, 0.0D);
/*     */         }
/*     */       } else {
/* 133 */         Optional<Pair<aps, Integer>> optional = l(bmb);
/* 134 */         if (!optional.isPresent()) {
/* 135 */           return aou.c;
/*     */         }
/*     */         
/* 138 */         Pair<aps, Integer> pair = optional.get();
/* 139 */         if (!☃.bC.d) {
/* 140 */           bmb.g(1);
/*     */         }
/* 142 */         for (int i = 0; i < 4; i++) {
/* 143 */           this.l.a(hh.p, cD() + this.J.nextDouble() / 2.0D, e(0.5D), cH() + this.J.nextDouble() / 2.0D, 0.0D, this.J.nextDouble() / 5.0D, 0.0D);
/*     */         }
/* 145 */         this.bp = (aps)pair.getLeft();
/* 146 */         this.bq = ((Integer)pair.getRight()).intValue();
/* 147 */         a(adq.hL, 2.0F, 1.0F);
/*     */       } 
/* 149 */       return aou.a(this.l.v);
/*     */     } 
/*     */     
/* 152 */     return super.b(☃, aot1);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(adr ☃) {
/* 157 */     this.l.a((bfw)null, this, adq.hO, ☃, 1.0F, 1.0F);
/*     */     
/* 159 */     if (!this.l.s_()) {
/* 160 */       ((aag)this.l).a(hh.w, cD(), e(0.5D), cH(), 1, 0.0D, 0.0D, 0.0D, 0.0D);
/*     */       
/* 162 */       ad();
/* 163 */       bae bae1 = aqe.l.a(this.l);
/* 164 */       bae1.b(cD(), cE(), cH(), this.p, this.q);
/* 165 */       bae1.c(dk());
/* 166 */       bae1.aA = this.aA;
/* 167 */       if (S()) {
/* 168 */         bae1.a(T());
/* 169 */         bae1.n(bX());
/*     */       } 
/* 171 */       if (eu()) {
/* 172 */         bae1.es();
/*     */       }
/* 174 */       bae1.m(bM());
/*     */       
/* 176 */       this.l.c(bae1);
/* 177 */       for (int i = 0; i < 5; i++) {
/* 178 */         this.l.c(new bcv(this.l, cD(), e(1.0D), cH(), new bmb(a.b(eL()).b())));
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean K_() {
/* 185 */     return (aX() && !w_());
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(md ☃) {
/* 190 */     super.b(☃);
/* 191 */     ☃.a("Type", a.a(eL()));
/*     */     
/* 193 */     if (this.bp != null) {
/* 194 */       ☃.a("EffectId", (byte)aps.a(this.bp));
/* 195 */       ☃.b("EffectDuration", this.bq);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(md ☃) {
/* 201 */     super.a(☃);
/* 202 */     a(a.a(☃.l("Type")));
/*     */     
/* 204 */     if (☃.c("EffectId", 1)) {
/* 205 */       this.bp = aps.a(☃.f("EffectId"));
/*     */     }
/*     */     
/* 208 */     if (☃.c("EffectDuration", 3)) {
/* 209 */       this.bq = ☃.h("EffectDuration");
/*     */     }
/*     */   }
/*     */   
/*     */   private Optional<Pair<aps, Integer>> l(bmb ☃) {
/* 214 */     blx blx = ☃.b();
/* 215 */     if (blx instanceof bkh) {
/* 216 */       buo buo = ((bkh)blx).e();
/* 217 */       if (buo instanceof bwu) {
/* 218 */         bwu bwu = (bwu)buo;
/* 219 */         return Optional.of(Pair.of(bwu.c(), Integer.valueOf(bwu.d())));
/*     */       } 
/*     */     } 
/* 222 */     return Optional.empty();
/*     */   }
/*     */   
/*     */   private void a(a ☃) {
/* 226 */     this.R.b(bo, a.a(☃));
/*     */   }
/*     */   
/*     */   public a eL() {
/* 230 */     return a.a(this.R.<String>a(bo));
/*     */   }
/*     */ 
/*     */   
/*     */   public baj c(aag ☃, apy apy1) {
/* 235 */     baj baj1 = aqe.ab.a(☃);
/* 236 */     baj1.a(a((baj)apy1));
/* 237 */     return baj1;
/*     */   }
/*     */   
/*     */   private a a(baj ☃) {
/* 241 */     a a3, a1 = eL();
/* 242 */     a a2 = ☃.eL();
/*     */ 
/*     */     
/* 245 */     if (a1 == a2 && this.J.nextInt(1024) == 0) {
/* 246 */       a3 = (a1 == a.b) ? a.a : a.b;
/*     */     } else {
/* 248 */       a3 = this.J.nextBoolean() ? a1 : a2;
/*     */     } 
/* 250 */     return a3;
/*     */   }
/*     */   
/*     */   public enum a {
/* 254 */     a("red", bup.bD.n()),
/* 255 */     b("brown", bup.bC.n());
/*     */     
/*     */     private final String c;
/*     */     private final ceh d;
/*     */     
/*     */     a(String ☃, ceh ceh1) {
/* 261 */       this.c = ☃;
/* 262 */       this.d = ceh1;
/*     */     }
/*     */     
/*     */     public ceh a() {
/* 266 */       return this.d;
/*     */     }
/*     */     
/*     */     private static a b(String ☃) {
/* 270 */       for (a a1 : values()) {
/* 271 */         if (a1.c.equals(☃)) {
/* 272 */           return a1;
/*     */         }
/*     */       } 
/*     */       
/* 276 */       return a;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\baj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */