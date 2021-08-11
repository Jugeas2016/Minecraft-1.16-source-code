/*     */ import com.google.common.collect.Ordering;
/*     */ import com.mojang.blaze3d.systems.RenderSystem;
/*     */ import java.util.Collection;
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
/*     */ public abstract class dqe<T extends bic>
/*     */   extends dpp<T>
/*     */ {
/*     */   protected boolean A;
/*     */   
/*     */   public dqe(T ☃, bfv bfv1, nr nr1) {
/*  22 */     super(☃, bfv1, nr1);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void b() {
/*  27 */     super.b();
/*  28 */     i();
/*     */   }
/*     */   
/*     */   protected void i() {
/*  32 */     if (this.i.s.dh().isEmpty()) {
/*  33 */       this.w = (this.k - this.b) / 2;
/*  34 */       this.A = false;
/*     */     } else {
/*  36 */       this.w = 160 + (this.k - this.b - 200) / 2;
/*  37 */       this.A = true;
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(dfm ☃, int i, int j, float f) {
/*  43 */     super.a(☃, i, j, f);
/*  44 */     if (this.A) {
/*  45 */       b(☃);
/*     */     }
/*     */   }
/*     */   
/*     */   private void b(dfm ☃) {
/*  50 */     int i = this.w - 124;
/*     */     
/*  52 */     Collection<apu> collection = this.i.s.dh();
/*     */     
/*  54 */     if (collection.isEmpty()) {
/*     */       return;
/*     */     }
/*     */     
/*  58 */     RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
/*     */     
/*  60 */     int j = 33;
/*  61 */     if (collection.size() > 5) {
/*  62 */       j = 132 / (collection.size() - 1);
/*     */     }
/*     */     
/*  65 */     Iterable<apu> iterable = Ordering.natural().sortedCopy(collection);
/*     */     
/*  67 */     a(☃, i, j, iterable);
/*  68 */     b(☃, i, j, iterable);
/*  69 */     c(☃, i, j, iterable);
/*     */   }
/*     */   
/*     */   private void a(dfm ☃, int i, int j, Iterable<apu> iterable) {
/*  73 */     this.i.M().a(a);
/*  74 */     int k = this.x;
/*  75 */     for (apu apu : iterable) {
/*  76 */       RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
/*  77 */       b(☃, i, k, 0, 166, 140, 32);
/*  78 */       k += j;
/*     */     } 
/*     */   }
/*     */   
/*     */   private void b(dfm ☃, int i, int j, Iterable<apu> iterable) {
/*  83 */     ekp ekp = this.i.at();
/*  84 */     int k = this.x;
/*  85 */     for (apu apu : iterable) {
/*  86 */       aps aps = apu.a();
/*  87 */       ekc ekc = ekp.a(aps);
/*  88 */       this.i.M().a(ekc.m().g());
/*  89 */       a(☃, i + 6, k + 7, v(), 18, 18, ekc);
/*  90 */       k += j;
/*     */     } 
/*     */   }
/*     */   
/*     */   private void c(dfm ☃, int i, int j, Iterable<apu> iterable) {
/*  95 */     int k = this.x;
/*  96 */     for (apu apu : iterable) {
/*  97 */       String str1 = ekx.a(apu.a().c(), new Object[0]);
/*  98 */       if (apu.c() >= 1 && apu.c() <= 9) {
/*  99 */         str1 = str1 + ' ' + ekx.a("enchantment.level." + (apu.c() + 1), new Object[0]);
/*     */       }
/*     */       
/* 102 */       this.o.a(☃, str1, (i + 10 + 18), (k + 6), 16777215);
/*     */       
/* 104 */       String str2 = apv.a(apu, 1.0F);
/* 105 */       this.o.a(☃, str2, (i + 10 + 18), (k + 6 + 10), 8355711);
/*     */       
/* 107 */       k += j;
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dqe.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */