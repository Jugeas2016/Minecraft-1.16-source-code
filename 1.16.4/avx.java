/*     */ import java.util.List;
/*     */ import java.util.stream.Collectors;
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
/*     */ public class avx
/*     */   extends awt
/*     */ {
/*     */   public avx(aqu ☃, double d) {
/*  25 */     super(☃, d, 240, false);
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   protected dcn g() {
/*     */     dcn ☃;
/*  32 */     float f = this.a.l.t.nextFloat();
/*  33 */     if (this.a.l.t.nextFloat() < 0.3F) {
/*  34 */       return j();
/*     */     }
/*     */     
/*  37 */     if (f < 0.7F) {
/*  38 */       ☃ = k();
/*  39 */       if (☃ == null) {
/*  40 */         ☃ = l();
/*     */       }
/*     */     } else {
/*  43 */       ☃ = l();
/*  44 */       if (☃ == null) {
/*  45 */         ☃ = k();
/*     */       }
/*     */     } 
/*     */     
/*  49 */     return (☃ == null) ? j() : ☃;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   private dcn j() {
/*  54 */     return azj.b(this.a, 10, 7);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   private dcn k() {
/*  59 */     aag ☃ = (aag)this.a.l;
/*  60 */     List<bfj> list = ☃.a(aqe.aP, this.a.cc().g(32.0D), this::a);
/*  61 */     if (list.isEmpty()) {
/*  62 */       return null;
/*     */     }
/*  64 */     bfj bfj = list.get(this.a.l.t.nextInt(list.size()));
/*  65 */     dcn dcn = bfj.cA();
/*  66 */     return azj.a(this.a, 10, 7, dcn);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   private dcn l() {
/*  71 */     gp ☃ = m();
/*  72 */     if (☃ == null) {
/*  73 */       return null;
/*     */     }
/*     */     
/*  76 */     fx fx = a(☃);
/*  77 */     if (fx == null)
/*     */     {
/*  79 */       return null;
/*     */     }
/*     */     
/*  82 */     return azj.a(this.a, 10, 7, dcn.c(fx));
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   private gp m() {
/*  87 */     aag ☃ = (aag)this.a.l;
/*     */ 
/*     */ 
/*     */     
/*  91 */     List<gp> list = (List<gp>)gp.a(gp.a(this.a), 2).filter(gp1 -> (☃.b(gp1) == 0)).collect(Collectors.toList());
/*     */     
/*  93 */     if (list.isEmpty()) {
/*  94 */       return null;
/*     */     }
/*  96 */     return list.get(☃.t.nextInt(list.size()));
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   private fx a(gp ☃) {
/* 102 */     aag aag = (aag)this.a.l;
/* 103 */     azo azo = aag.y();
/*     */ 
/*     */     
/* 106 */     List<fx> list = (List<fx>)azo.c(☃ -> true, ☃.q(), 8, azo.b.b).map(azp::f).collect(Collectors.toList());
/*     */     
/* 108 */     if (list.isEmpty()) {
/* 109 */       return null;
/*     */     }
/* 111 */     return list.get(aag.t.nextInt(list.size()));
/*     */   }
/*     */   
/*     */   private boolean a(bfj ☃) {
/* 115 */     return ☃.a(this.a.l.T());
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\avx.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */