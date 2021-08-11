/*     */ import java.util.List;
/*     */ import java.util.stream.Stream;
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
/*     */ public abstract class azy
/*     */   extends azw
/*     */ {
/*     */   private azy b;
/*  18 */   private int c = 1;
/*     */   
/*     */   public azy(aqe<? extends azy> ☃, brx brx1) {
/*  21 */     super((aqe)☃, brx1);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void o() {
/*  26 */     super.o();
/*     */     
/*  28 */     this.bk.a(5, new avr(this));
/*     */   }
/*     */ 
/*     */   
/*     */   public int eq() {
/*  33 */     return eN();
/*     */   }
/*     */   
/*     */   public int eN() {
/*  37 */     return super.eq();
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean eL() {
/*  42 */     return !eO();
/*     */   }
/*     */   
/*     */   public boolean eO() {
/*  46 */     return (this.b != null && this.b.aX());
/*     */   }
/*     */   
/*     */   public azy a(azy ☃) {
/*  50 */     this.b = ☃;
/*  51 */     ☃.eU();
/*     */     
/*  53 */     return ☃;
/*     */   }
/*     */   
/*     */   public void eP() {
/*  57 */     this.b.eV();
/*  58 */     this.b = null;
/*     */   }
/*     */   
/*     */   private void eU() {
/*  62 */     this.c++;
/*     */   }
/*     */   
/*     */   private void eV() {
/*  66 */     this.c--;
/*     */   }
/*     */   
/*     */   public boolean eQ() {
/*  70 */     return (eR() && this.c < eN());
/*     */   }
/*     */ 
/*     */   
/*     */   public void j() {
/*  75 */     super.j();
/*     */ 
/*     */     
/*  78 */     if (eR() && this.l.t.nextInt(200) == 1) {
/*  79 */       List<azw> ☃ = (List)this.l.a(getClass(), cc().c(8.0D, 8.0D, 8.0D));
/*  80 */       if (☃.size() <= 1) {
/*  81 */         this.c = 1;
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   public boolean eR() {
/*  87 */     return (this.c > 1);
/*     */   }
/*     */   
/*     */   public boolean eS() {
/*  91 */     return (h(this.b) <= 121.0D);
/*     */   }
/*     */   
/*     */   public void eT() {
/*  95 */     if (eO()) {
/*  96 */       x().a(this.b, 1.0D);
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(Stream<azy> ☃) {
/* 101 */     ☃.limit((eN() - this.c)).filter(☃ -> (☃ != this)).forEach(☃ -> ☃.a(this));
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public arc a(bsk ☃, aos aos1, aqp aqp1, @Nullable arc arc1, @Nullable md md1) {
/* 107 */     super.a(☃, aos1, aqp1, arc1, md1);
/*     */     
/* 109 */     if (arc1 == null) {
/* 110 */       arc1 = new a(this);
/*     */     } else {
/* 112 */       a(((a)arc1).a);
/*     */     } 
/*     */     
/* 115 */     return arc1;
/*     */   }
/*     */   
/*     */   public static class a implements arc {
/*     */     public final azy a;
/*     */     
/*     */     public a(azy ☃) {
/* 122 */       this.a = ☃;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\azy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */