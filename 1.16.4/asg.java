/*     */ import com.google.common.collect.ImmutableList;
/*     */ import com.google.common.collect.ImmutableMap;
/*     */ import com.google.common.collect.Maps;
/*     */ import java.util.HashMap;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Optional;
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
/*     */ public class asg
/*     */   extends arv<bfj>
/*     */ {
/*     */   private static final Map<bfm, vk> b;
/*     */   
/*     */   static {
/*  39 */     b = x.<Map<bfm, vk>>a(Maps.newHashMap(), ☃ -> {
/*     */           ☃.put(bfm.b, cyq.al);
/*     */           ☃.put(bfm.c, cyq.am);
/*     */           ☃.put(bfm.d, cyq.an);
/*     */           ☃.put(bfm.e, cyq.ao);
/*     */           ☃.put(bfm.f, cyq.ap);
/*     */           ☃.put(bfm.g, cyq.aq);
/*     */           ☃.put(bfm.h, cyq.ar);
/*     */           ☃.put(bfm.i, cyq.as);
/*     */           ☃.put(bfm.j, cyq.at);
/*     */           ☃.put(bfm.k, cyq.au);
/*     */           ☃.put(bfm.m, cyq.av);
/*     */           ☃.put(bfm.n, cyq.aw);
/*     */           ☃.put(bfm.o, cyq.ax);
/*     */         });
/*     */   }
/*     */   
/*  56 */   private int c = 600;
/*     */   private boolean d;
/*     */   private long e;
/*     */   
/*     */   public asg(int ☃) {
/*  61 */     super(
/*  62 */         (Map<ayd<?>, aye>)ImmutableMap.of(ayd.m, aye.c, ayd.n, aye.c, ayd.q, aye.c, ayd.k, aye.a), ☃);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean a(aag ☃, bfj bfj1) {
/*  74 */     if (!b(bfj1)) {
/*  75 */       return false;
/*     */     }
/*     */     
/*  78 */     if (this.c > 0) {
/*  79 */       this.c--;
/*  80 */       return false;
/*     */     } 
/*     */     
/*  83 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(aag ☃, bfj bfj1, long l) {
/*  88 */     this.d = false;
/*  89 */     this.e = l;
/*  90 */     bfw bfw = c(bfj1).get();
/*  91 */     bfj1.cJ().a(ayd.q, bfw);
/*  92 */     arw.a(bfj1, bfw);
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean b(aag ☃, bfj bfj1, long l) {
/*  97 */     return (b(bfj1) && !this.d);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void c(aag ☃, bfj bfj1, long l) {
/* 102 */     bfw bfw = c(bfj1).get();
/* 103 */     arw.a(bfj1, bfw);
/*     */     
/* 105 */     if (a(bfj1, bfw)) {
/* 106 */       if (l - this.e > 20L) {
/* 107 */         a(bfj1, bfw);
/* 108 */         this.d = true;
/*     */       } 
/*     */     } else {
/* 111 */       arw.a(bfj1, bfw, 0.5F, 5);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   protected void d(aag ☃, bfj bfj1, long l) {
/* 117 */     this.c = a(☃);
/* 118 */     bfj1.cJ().b(ayd.q);
/* 119 */     bfj1.cJ().b(ayd.m);
/* 120 */     bfj1.cJ().b(ayd.n);
/*     */   }
/*     */   
/*     */   private void a(bfj ☃, aqm aqm1) {
/* 124 */     List<bmb> list = a(☃);
/* 125 */     for (bmb bmb : list) {
/* 126 */       arw.a(☃, bmb, aqm1.cA());
/*     */     }
/*     */   }
/*     */   
/*     */   private List<bmb> a(bfj ☃) {
/* 131 */     if (☃.w_()) {
/* 132 */       return (List<bmb>)ImmutableList.of(new bmb(bmd.bi));
/*     */     }
/*     */     
/* 135 */     bfm bfm = ☃.eX().b();
/* 136 */     if (b.containsKey(bfm)) {
/* 137 */       cyy cyy = ☃.l.l().aJ().a(b.get(bfm));
/*     */ 
/*     */ 
/*     */       
/* 141 */       cyv.a a = (new cyv.a((aag)☃.l)).<dcn>a(dbc.f, ☃.cA()).<aqa>a(dbc.a, ☃).a(☃.cY());
/*     */       
/* 143 */       return cyy.a(a.a(dbb.g));
/*     */     } 
/*     */     
/* 146 */     return (List<bmb>)ImmutableList.of(new bmb(bmd.kV));
/*     */   }
/*     */   
/*     */   private boolean b(bfj ☃) {
/* 150 */     return c(☃).isPresent();
/*     */   }
/*     */   
/*     */   private Optional<bfw> c(bfj ☃) {
/* 154 */     return ☃.cJ().<bfw>c(ayd.k)
/* 155 */       .filter(this::a);
/*     */   }
/*     */   
/*     */   private boolean a(bfw ☃) {
/* 159 */     return ☃.a(apw.F);
/*     */   }
/*     */   
/*     */   private boolean a(bfj ☃, bfw bfw1) {
/* 163 */     fx fx1 = bfw1.cB();
/* 164 */     fx fx2 = ☃.cB();
/* 165 */     return fx2.a(fx1, 5.0D);
/*     */   }
/*     */   
/*     */   private static int a(aag ☃) {
/* 169 */     return 600 + ☃.t.nextInt(6001);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\asg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */