/*     */ import com.google.common.collect.ImmutableMap;
/*     */ import com.google.common.collect.Lists;
/*     */ import java.util.List;
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
/*     */ 
/*     */ 
/*     */ public class asm
/*     */   extends arv<bfj>
/*     */ {
/*     */   @Nullable
/*     */   private fx b;
/*     */   private long c;
/*     */   private int d;
/*  37 */   private final List<fx> e = Lists.newArrayList();
/*     */   
/*     */   public asm() {
/*  40 */     super((Map<ayd<?>, aye>)ImmutableMap.of(ayd.n, aye.b, ayd.m, aye.b, ayd.f, aye.a));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean a(aag ☃, bfj bfj1) {
/*  49 */     if (!☃.V().b(brt.b)) {
/*  50 */       return false;
/*     */     }
/*     */     
/*  53 */     if (bfj1.eX().b() != bfm.f) {
/*  54 */       return false;
/*     */     }
/*     */     
/*  57 */     fx.a a = bfj1.cB().i();
/*     */     
/*  59 */     this.e.clear();
/*  60 */     for (int i = -1; i <= 1; i++) {
/*  61 */       for (int j = -1; j <= 1; j++) {
/*  62 */         for (int k = -1; k <= 1; k++) {
/*  63 */           a.c(bfj1.cD() + i, bfj1.cE() + j, bfj1.cH() + k);
/*  64 */           if (a(a, ☃)) {
/*  65 */             this.e.add(new fx(a));
/*     */           }
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/*  71 */     this.b = a(☃);
/*  72 */     return (this.b != null);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   private fx a(aag ☃) {
/*  77 */     return this.e.isEmpty() ? null : this.e.get(☃.u_().nextInt(this.e.size()));
/*     */   }
/*     */   
/*     */   private boolean a(fx ☃, aag aag1) {
/*  81 */     ceh ceh = aag1.d_(☃);
/*  82 */     buo buo1 = ceh.b();
/*  83 */     buo buo2 = aag1.d_(☃.c()).b();
/*  84 */     return ((buo1 instanceof bvs && ((bvs)buo1).h(ceh)) || (ceh
/*  85 */       .g() && buo2 instanceof bwp));
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(aag ☃, bfj bfj1, long l) {
/*  90 */     if (l > this.c && this.b != null) {
/*  91 */       bfj1.cJ().a(ayd.n, new arx(this.b));
/*  92 */       bfj1.cJ().a(ayd.m, new ayf(new arx(this.b), 0.5F, 1));
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   protected void b(aag ☃, bfj bfj1, long l) {
/*  98 */     bfj1.cJ().b(ayd.n);
/*  99 */     bfj1.cJ().b(ayd.m);
/* 100 */     this.d = 0;
/* 101 */     this.c = l + 40L;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void c(aag ☃, bfj bfj1, long l) {
/* 106 */     if (this.b != null && !this.b.a(bfj1.cA(), 1.0D)) {
/*     */       return;
/*     */     }
/*     */     
/* 110 */     if (this.b != null && l > this.c) {
/* 111 */       ceh ceh = ☃.d_(this.b);
/* 112 */       buo buo1 = ceh.b();
/* 113 */       buo buo2 = ☃.d_(this.b.c()).b();
/*     */       
/* 115 */       if (buo1 instanceof bvs && ((bvs)buo1).h(ceh)) {
/* 116 */         ☃.a(this.b, true, bfj1);
/*     */       }
/*     */       
/* 119 */       if (ceh.g() && buo2 instanceof bwp && bfj1.fi()) {
/* 120 */         apa apa = bfj1.eU();
/* 121 */         for (int i = 0; i < apa.Z_(); i++) {
/* 122 */           bmb bmb = apa.a(i);
/* 123 */           boolean bool = false;
/* 124 */           if (!bmb.a()) {
/* 125 */             if (bmb.b() == bmd.kV) {
/* 126 */               ☃.a(this.b, bup.bW.n(), 3);
/* 127 */               bool = true;
/* 128 */             } else if (bmb.b() == bmd.oZ) {
/* 129 */               ☃.a(this.b, bup.eV.n(), 3);
/* 130 */               bool = true;
/* 131 */             } else if (bmb.b() == bmd.oY) {
/* 132 */               ☃.a(this.b, bup.eU.n(), 3);
/* 133 */               bool = true;
/* 134 */             } else if (bmb.b() == bmd.qg) {
/* 135 */               ☃.a(this.b, bup.iD.n(), 3);
/* 136 */               bool = true;
/*     */             } 
/*     */           }
/* 139 */           if (bool) {
/* 140 */             ☃.a((bfw)null, this.b.u(), this.b.v(), this.b.w(), adq.cr, adr.e, 1.0F, 1.0F);
/* 141 */             bmb.g(1);
/* 142 */             if (bmb.a()) {
/* 143 */               apa.a(i, bmb.b);
/*     */             }
/*     */             
/*     */             break;
/*     */           } 
/*     */         } 
/*     */       } 
/* 150 */       if (buo1 instanceof bvs && !((bvs)buo1).h(ceh)) {
/* 151 */         this.e.remove(this.b);
/*     */         
/* 153 */         this.b = a(☃);
/* 154 */         if (this.b != null) {
/* 155 */           this.c = l + 20L;
/* 156 */           bfj1.cJ().a(ayd.m, new ayf(new arx(this.b), 0.5F, 1));
/* 157 */           bfj1.cJ().a(ayd.n, new arx(this.b));
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 162 */     this.d++;
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean d(aag ☃, bfj bfj1, long l) {
/* 167 */     return (this.d < 200);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\asm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */