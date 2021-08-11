/*     */ import com.google.common.collect.Lists;
/*     */ import com.mojang.blaze3d.systems.RenderSystem;
/*     */ import java.io.IOException;
/*     */ import java.util.List;
/*     */ import java.util.function.IntSupplier;
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
/*     */ public class eak
/*     */   implements AutoCloseable
/*     */ {
/*     */   private final dzw c;
/*     */   public final deg a;
/*     */   public final deg b;
/*  23 */   private final List<IntSupplier> d = Lists.newArrayList();
/*  24 */   private final List<String> e = Lists.newArrayList();
/*  25 */   private final List<Integer> f = Lists.newArrayList();
/*  26 */   private final List<Integer> g = Lists.newArrayList();
/*     */   private b h;
/*     */   
/*     */   public eak(ach ☃, String str, deg deg1, deg deg2) throws IOException {
/*  30 */     this.c = new dzw(☃, str);
/*  31 */     this.a = deg1;
/*  32 */     this.b = deg2;
/*     */   }
/*     */ 
/*     */   
/*     */   public void close() {
/*  37 */     this.c.close();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(String ☃, IntSupplier intSupplier, int i, int j) {
/*  45 */     this.e.add(this.e.size(), ☃);
/*  46 */     this.d.add(this.d.size(), intSupplier);
/*  47 */     this.f.add(this.f.size(), Integer.valueOf(i));
/*  48 */     this.g.add(this.g.size(), Integer.valueOf(j));
/*     */   }
/*     */   
/*     */   public void a(b ☃) {
/*  52 */     this.h = ☃;
/*     */   }
/*     */   
/*     */   public void a(float ☃) {
/*  56 */     this.a.e();
/*     */     
/*  58 */     float f1 = this.b.a;
/*  59 */     float f2 = this.b.b;
/*  60 */     RenderSystem.viewport(0, 0, (int)f1, (int)f2);
/*     */     
/*  62 */     this.c.a("DiffuseSampler", this.a::f);
/*     */ 
/*     */     
/*  65 */     for (int i = 0; i < this.d.size(); i++) {
/*  66 */       this.c.a(this.e.get(i), this.d.get(i));
/*  67 */       this.c.b("AuxSize" + i).a(((Integer)this.f.get(i)).intValue(), ((Integer)this.g.get(i)).intValue());
/*     */     } 
/*     */     
/*  70 */     this.c.b("ProjMat").a(this.h);
/*  71 */     this.c.b("InSize").a(this.a.a, this.a.b);
/*  72 */     this.c.b("OutSize").a(f1, f2);
/*  73 */     this.c.b("Time").a(☃);
/*     */     
/*  75 */     djz djz = djz.C();
/*  76 */     this.c.b("ScreenSize").a(djz.aD().k(), djz.aD().l());
/*  77 */     this.c.f();
/*  78 */     this.b.b(djz.a);
/*  79 */     this.b.a(false);
/*     */     
/*  81 */     RenderSystem.depthFunc(519);
/*     */ 
/*     */     
/*  84 */     dfh dfh = dfo.a().c();
/*  85 */     dfh.a(7, dfk.l);
/*     */     
/*  87 */     dfh.a(0.0D, 0.0D, 500.0D).a(255, 255, 255, 255).d();
/*  88 */     dfh.a(f1, 0.0D, 500.0D).a(255, 255, 255, 255).d();
/*  89 */     dfh.a(f1, f2, 500.0D).a(255, 255, 255, 255).d();
/*  90 */     dfh.a(0.0D, f2, 500.0D).a(255, 255, 255, 255).d();
/*  91 */     dfh.c();
/*  92 */     dfi.a(dfh);
/*     */     
/*  94 */     RenderSystem.depthFunc(515);
/*     */     
/*  96 */     this.c.e();
/*  97 */     this.b.e();
/*  98 */     this.a.d();
/*  99 */     for (IntSupplier intSupplier : this.d) {
/* 100 */       if (intSupplier instanceof deg) {
/* 101 */         ((deg)intSupplier).d();
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   public dzw b() {
/* 107 */     return this.c;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\eak.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */