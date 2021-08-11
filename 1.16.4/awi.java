/*     */ import com.google.common.collect.Lists;
/*     */ import java.util.EnumSet;
/*     */ import java.util.List;
/*     */ import java.util.Objects;
/*     */ import java.util.Optional;
/*     */ import java.util.function.BooleanSupplier;
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
/*     */ public class awi
/*     */   extends avv
/*     */ {
/*     */   protected final aqu a;
/*     */   private final double b;
/*     */   private cxd c;
/*     */   private fx d;
/*     */   private final boolean e;
/*  29 */   private final List<fx> f = Lists.newArrayList();
/*     */   private final int g;
/*     */   private final BooleanSupplier h;
/*     */   
/*     */   public awi(aqu ☃, double d, boolean bool, int i, BooleanSupplier booleanSupplier) {
/*  34 */     this.a = ☃;
/*  35 */     this.b = d;
/*  36 */     this.e = bool;
/*  37 */     this.g = i;
/*  38 */     this.h = booleanSupplier;
/*  39 */     a(EnumSet.of(avv.a.a));
/*     */     
/*  41 */     if (!azi.a(☃)) {
/*  42 */       throw new IllegalArgumentException("Unsupported mob for MoveThroughVillageGoal");
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a() {
/*  48 */     if (!azi.a(this.a)) {
/*  49 */       return false;
/*     */     }
/*  51 */     g();
/*     */     
/*  53 */     if (this.e && this.a.l.M()) {
/*  54 */       return false;
/*     */     }
/*     */     
/*  57 */     aag ☃ = (aag)this.a.l;
/*  58 */     fx fx1 = this.a.cB();
/*     */     
/*  60 */     if (!☃.a(fx1, 6)) {
/*  61 */       return false;
/*     */     }
/*     */     
/*  64 */     dcn dcn = azj.a(this.a, 15, 7, fx2 -> {
/*     */           if (!☃.a_(fx2)) {
/*     */             return Double.NEGATIVE_INFINITY;
/*     */           }
/*     */           
/*     */           Optional<fx> optional = ☃.y().c(azr.b, this::a, fx2, 10, azo.b.b);
/*     */           
/*     */           return !optional.isPresent() ? Double.NEGATIVE_INFINITY : -((fx)optional.get()).j(fx1);
/*     */         });
/*     */     
/*  74 */     if (dcn == null) {
/*  75 */       return false;
/*     */     }
/*  77 */     Optional<fx> optional = ☃.y().c(azr.b, this::a, new fx(dcn), 10, azo.b.b);
/*  78 */     if (!optional.isPresent()) {
/*  79 */       return false;
/*     */     }
/*  81 */     this.d = ((fx)optional.get()).h();
/*     */     
/*  83 */     ayi ayi = (ayi)this.a.x();
/*  84 */     boolean bool = ayi.f();
/*  85 */     ayi.a(this.h.getAsBoolean());
/*  86 */     this.c = ayi.a(this.d, 0);
/*  87 */     ayi.a(bool);
/*  88 */     if (this.c == null) {
/*  89 */       dcn dcn1 = azj.b(this.a, 10, 7, dcn.c(this.d));
/*  90 */       if (dcn1 == null) {
/*  91 */         return false;
/*     */       }
/*  93 */       ayi.a(this.h.getAsBoolean());
/*  94 */       this.c = this.a.x().a(dcn1.b, dcn1.c, dcn1.d, 0);
/*  95 */       ayi.a(bool);
/*  96 */       if (this.c == null) {
/*  97 */         return false;
/*     */       }
/*     */     } 
/*     */     
/* 101 */     for (int i = 0; i < this.c.e(); i++) {
/* 102 */       cxb cxb = this.c.a(i);
/* 103 */       fx fx2 = new fx(cxb.a, cxb.b + 1, cxb.c);
/* 104 */       if (bwb.a(this.a.l, fx2)) {
/*     */         
/* 106 */         this.c = this.a.x().a(cxb.a, cxb.b, cxb.c, 0);
/*     */         
/*     */         break;
/*     */       } 
/*     */     } 
/* 111 */     return (this.c != null);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean b() {
/* 116 */     if (this.a.x().m()) {
/* 117 */       return false;
/*     */     }
/* 119 */     return !this.d.a(this.a.cA(), (this.a.cy() + this.g));
/*     */   }
/*     */ 
/*     */   
/*     */   public void c() {
/* 124 */     this.a.x().a(this.c, this.b);
/*     */   }
/*     */ 
/*     */   
/*     */   public void d() {
/* 129 */     if (this.a.x().m() || this.d.a(this.a.cA(), this.g)) {
/* 130 */       this.f.add(this.d);
/*     */     }
/*     */   }
/*     */   
/*     */   private boolean a(fx ☃) {
/* 135 */     for (fx fx1 : this.f) {
/* 136 */       if (Objects.equals(☃, fx1)) {
/* 137 */         return false;
/*     */       }
/*     */     } 
/* 140 */     return true;
/*     */   }
/*     */   
/*     */   private void g() {
/* 144 */     if (this.f.size() > 15)
/* 145 */       this.f.remove(0); 
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\awi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */