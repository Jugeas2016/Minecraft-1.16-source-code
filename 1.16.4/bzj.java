/*     */ import com.google.common.collect.ImmutableList;
/*     */ import com.google.common.collect.UnmodifiableIterator;
/*     */ import java.util.Optional;
/*     */ import java.util.Random;
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
/*     */ public class bzj
/*     */   extends buo
/*     */ {
/*  42 */   public static final cfg a = cex.aC;
/*     */   
/*  44 */   private static final ImmutableList<gr> b = ImmutableList.of(new gr(0, 0, -1), new gr(-1, 0, 0), new gr(0, 0, 1), new gr(1, 0, 0), new gr(-1, 0, -1), new gr(1, 0, -1), new gr(-1, 0, 1), new gr(1, 0, 1));
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
/*  55 */   private static final ImmutableList<gr> c = (new ImmutableList.Builder())
/*  56 */     .addAll((Iterable)b)
/*  57 */     .addAll(b.stream().map(gr::n).iterator())
/*  58 */     .addAll(b.stream().map(gr::o).iterator())
/*  59 */     .add(new gr(0, 1, 0))
/*  60 */     .build();
/*     */   
/*     */   public bzj(ceg.c ☃) {
/*  63 */     super(☃);
/*  64 */     j(((ceh)this.n.b()).a(a, Integer.valueOf(0)));
/*     */   }
/*     */ 
/*     */   
/*     */   public aou a(ceh ☃, brx brx1, fx fx1, bfw bfw1, aot aot1, dcj dcj1) {
/*  69 */     bmb bmb = bfw1.b(aot1);
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  74 */     if (aot1 == aot.a && 
/*  75 */       !a(bmb) && 
/*  76 */       a(bfw1.b(aot.b))) {
/*  77 */       return aou.c;
/*     */     }
/*     */     
/*  80 */     if (a(bmb) && 
/*  81 */       h(☃)) {
/*  82 */       a(brx1, fx1, ☃);
/*  83 */       if (!bfw1.bC.d) {
/*  84 */         bmb.g(1);
/*     */       }
/*     */       
/*  87 */       return aou.a(brx1.v);
/*     */     } 
/*     */ 
/*     */     
/*  91 */     if (((Integer)☃.c(a)).intValue() == 0) {
/*  92 */       return aou.c;
/*     */     }
/*     */     
/*  95 */     if (a(brx1)) {
/*  96 */       if (!brx1.v) {
/*  97 */         aah aah = (aah)bfw1;
/*  98 */         if (aah.M() != brx1.Y() || !aah.K().equals(fx1)) {
/*  99 */           aah.a(brx1.Y(), fx1, 0.0F, false, true);
/* 100 */           brx1.a((bfw)null, fx1.u() + 0.5D, fx1.v() + 0.5D, fx1.w() + 0.5D, adq.mA, adr.e, 1.0F, 1.0F);
/* 101 */           return aou.a;
/*     */         } 
/*     */       } 
/*     */       
/* 105 */       return aou.b;
/*     */     } 
/* 107 */     if (!brx1.v) {
/* 108 */       d(☃, brx1, fx1);
/*     */     }
/* 110 */     return aou.a(brx1.v);
/*     */   }
/*     */ 
/*     */   
/*     */   private static boolean a(bmb ☃) {
/* 115 */     return (☃.b() == bmd.dq);
/*     */   }
/*     */   
/*     */   private static boolean h(ceh ☃) {
/* 119 */     return (((Integer)☃.c(a)).intValue() < 4);
/*     */   }
/*     */   
/*     */   private static boolean a(fx ☃, brx brx1) {
/* 123 */     cux cux1 = brx1.b(☃);
/* 124 */     if (!cux1.a(aef.b)) {
/* 125 */       return false;
/*     */     }
/* 127 */     if (cux1.b()) {
/* 128 */       return true;
/*     */     }
/* 130 */     float f = cux1.e();
/* 131 */     if (f < 2.0F) {
/* 132 */       return false;
/*     */     }
/*     */ 
/*     */     
/* 136 */     cux cux2 = brx1.b(☃.c());
/* 137 */     return !cux2.a(aef.b);
/*     */   }
/*     */   
/*     */   private void d(ceh ☃, brx brx1, fx fx1) {
/* 141 */     brx1.a(fx1, false);
/*     */     
/* 143 */     boolean bool1 = gc.c.a.a().map(fx1::a).anyMatch(fx1 -> a(fx1, ☃));
/* 144 */     boolean bool2 = (bool1 || brx1.b(fx1.b()).a(aef.b));
/* 145 */     brq brq = new brq(this, fx1, bool2)
/*     */       {
/*     */         public Optional<Float> a(brp ☃, brc brc1, fx fx1, ceh ceh1, cux cux1) {
/* 148 */           if (fx1.equals(this.a) && this.b)
/*     */           {
/* 150 */             return Optional.of(Float.valueOf(bup.A.f()));
/*     */           }
/* 152 */           return super.a(☃, brc1, fx1, ceh1, cux1);
/*     */         }
/*     */       };
/* 155 */     brx1.a(null, apk.a(), brq, fx1.u() + 0.5D, fx1.v() + 0.5D, fx1.w() + 0.5D, 5.0F, true, brp.a.c);
/*     */   }
/*     */   
/*     */   public static boolean a(brx ☃) {
/* 159 */     return ☃.k().i();
/*     */   }
/*     */   
/*     */   public static void a(brx ☃, fx fx1, ceh ceh1) {
/* 163 */     ☃.a(fx1, ceh1.a(a, Integer.valueOf(((Integer)ceh1.c(a)).intValue() + 1)), 3);
/* 164 */     ☃.a((bfw)null, fx1.u() + 0.5D, fx1.v() + 0.5D, fx1.w() + 0.5D, adq.my, adr.e, 1.0F, 1.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(ceh ☃, brx brx1, fx fx1, Random random) {
/* 169 */     if (((Integer)☃.c(a)).intValue() == 0) {
/*     */       return;
/*     */     }
/*     */     
/* 173 */     if (random.nextInt(100) == 0) {
/* 174 */       brx1.a((bfw)null, fx1.u() + 0.5D, fx1.v() + 0.5D, fx1.w() + 0.5D, adq.mx, adr.e, 1.0F, 1.0F);
/*     */     }
/*     */     
/* 177 */     double d1 = fx1.u() + 0.5D + 0.5D - random.nextDouble();
/* 178 */     double d2 = fx1.v() + 1.0D;
/* 179 */     double d3 = fx1.w() + 0.5D + 0.5D - random.nextDouble();
/* 180 */     double d4 = random.nextFloat() * 0.04D;
/*     */     
/* 182 */     brx1.a(hh.as, d1, d2, d3, 0.0D, d4, 0.0D);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(cei.a<buo, ceh> ☃) {
/* 187 */     ☃.a((cfj<?>[])new cfj[] { a });
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(ceh ☃) {
/* 192 */     return true;
/*     */   }
/*     */   
/*     */   public static int a(ceh ☃, int i) {
/* 196 */     return afm.d((((Integer)☃.c(a)).intValue() - 0) / 4.0F * i);
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(ceh ☃, brx brx1, fx fx1) {
/* 201 */     return a(☃, 15);
/*     */   }
/*     */   
/*     */   public static Optional<dcn> a(aqe<?> ☃, brg brg1, fx fx1) {
/* 205 */     Optional<dcn> optional = a(☃, brg1, fx1, true);
/* 206 */     if (optional.isPresent()) {
/* 207 */       return optional;
/*     */     }
/* 209 */     return a(☃, brg1, fx1, false);
/*     */   }
/*     */   
/*     */   private static Optional<dcn> a(aqe<?> ☃, brg brg1, fx fx1, boolean bool) {
/* 213 */     fx.a a = new fx.a();
/* 214 */     for (UnmodifiableIterator<gr> unmodifiableIterator = c.iterator(); unmodifiableIterator.hasNext(); ) { gr gr = unmodifiableIterator.next();
/* 215 */       a.g(fx1).h(gr);
/*     */       
/* 217 */       dcn dcn = bho.a(☃, brg1, a, bool);
/* 218 */       if (dcn != null) {
/* 219 */         return Optional.of(dcn);
/*     */       } }
/*     */     
/* 222 */     return Optional.empty();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(ceh ☃, brc brc1, fx fx1, cxe cxe1) {
/* 227 */     return false;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bzj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */