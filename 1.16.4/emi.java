/*     */ import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
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
/*     */ public class emi
/*     */   implements eme
/*     */ {
/*     */   private final dzm a;
/*     */   private final enu b;
/*     */   private final bsx c;
/*     */   private final Random d;
/*  30 */   private Object2ObjectArrayMap<bsv, a> e = new Object2ObjectArrayMap();
/*  31 */   private Optional<bst> f = Optional.empty();
/*  32 */   private Optional<bss> g = Optional.empty();
/*     */   
/*     */   private float h;
/*     */   private bsv i;
/*     */   
/*     */   public emi(dzm ☃, enu enu1, bsx bsx1) {
/*  38 */     this.d = ☃.l.u_();
/*     */     
/*  40 */     this.a = ☃;
/*  41 */     this.b = enu1;
/*  42 */     this.c = bsx1;
/*     */   }
/*     */   
/*     */   public float b() {
/*  46 */     return this.h;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a() {
/*  51 */     this.e.values().removeIf(emd::n);
/*     */     
/*  53 */     bsv ☃ = this.c.a(this.a.cD(), this.a.cE(), this.a.cH());
/*  54 */     if (☃ != this.i) {
/*  55 */       this.i = ☃;
/*     */       
/*  57 */       this.f = ☃.q();
/*  58 */       this.g = ☃.r();
/*     */       
/*  60 */       this.e.values().forEach(a::p);
/*     */       
/*  62 */       ☃.p().ifPresent(adp1 -> (a)this.e.compute(☃, ()));
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  72 */     this.g.ifPresent(☃ -> {
/*     */           if (this.d.nextDouble() < ☃.b()) {
/*     */             this.b.a(emp.b(☃.a()));
/*     */           }
/*     */         });
/*     */     
/*  78 */     this.f.ifPresent(☃ -> {
/*     */           brx brx = this.a.l;
/*     */           int i = ☃.c() * 2 + 1;
/*     */           fx fx = new fx(this.a.cD() + this.d.nextInt(i) - ☃.c(), this.a.cG() + this.d.nextInt(i) - ☃.c(), this.a.cH() + this.d.nextInt(i) - ☃.c());
/*     */           int j = brx.a(bsf.a, fx);
/*     */           if (j > 0) {
/*     */             this.h -= j / brx.K() * 0.001F;
/*     */           } else {
/*     */             this.h -= (brx.a(bsf.b, fx) - 1) / ☃.b();
/*     */           } 
/*     */           if (this.h >= 1.0F) {
/*     */             double d1 = fx.u() + 0.5D;
/*     */             double d2 = fx.v() + 0.5D;
/*     */             double d3 = fx.w() + 0.5D;
/*     */             double d4 = d1 - this.a.cD();
/*     */             double d5 = d2 - this.a.cG();
/*     */             double d6 = d3 - this.a.cH();
/*     */             double d7 = afm.a(d4 * d4 + d5 * d5 + d6 * d6);
/*     */             double d8 = d7 + ☃.d();
/*     */             emp emp = emp.b(☃.a(), this.a.cD() + d4 / d7 * d8, this.a.cG() + d5 / d7 * d8, this.a.cH() + d6 / d7 * d8);
/*     */             this.b.a(emp);
/*     */             this.h = 0.0F;
/*     */           } else {
/*     */             this.h = Math.max(this.h, 0.0F);
/*     */           } 
/*     */         });
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static class a
/*     */     extends emd
/*     */   {
/*     */     private int n;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     private int o;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public a(adp ☃) {
/* 127 */       super(☃, adr.i);
/*     */       
/* 129 */       this.i = true;
/* 130 */       this.j = 0;
/* 131 */       this.d = 1.0F;
/* 132 */       this.m = true;
/*     */     }
/*     */ 
/*     */     
/*     */     public void r() {
/* 137 */       if (this.o < 0) {
/* 138 */         o();
/*     */       }
/*     */       
/* 141 */       this.o += this.n;
/* 142 */       this.d = afm.a(this.o / 40.0F, 0.0F, 1.0F);
/*     */     }
/*     */     
/*     */     public void p() {
/* 146 */       this.o = Math.min(this.o, 40);
/* 147 */       this.n = -1;
/*     */     }
/*     */     
/*     */     public void q() {
/* 151 */       this.o = Math.max(0, this.o);
/* 152 */       this.n = 1;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\emi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */