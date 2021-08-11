/*     */ import com.mojang.blaze3d.systems.RenderSystem;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.Set;
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
/*     */ public abstract class drl
/*     */   extends drp
/*     */ {
/*     */   private Iterator<blx> i;
/*     */   private Set<blx> j;
/*     */   private bjr k;
/*     */   private blx l;
/*     */   private float m;
/*     */   
/*     */   protected void a() {
/*  30 */     this.c.a(152, 182, 28, 18, a);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(@Nullable bjr ☃) {
/*  35 */     super.a(☃);
/*     */     
/*  37 */     if (☃ != null && ☃.d < this.d.i()) {
/*  38 */       this.k = null;
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(boq<?> ☃, List<bjr> list) {
/*  44 */     bmb bmb = ☃.c();
/*  45 */     this.b.a(☃);
/*  46 */     this.b.a(bon.a(new bmb[] { bmb }, ), ((bjr)list.get(2)).e, ((bjr)list.get(2)).f);
/*     */     
/*  48 */     gj<bon> gj = ☃.a();
/*     */     
/*  50 */     this.k = list.get(1);
/*  51 */     if (this.j == null) {
/*  52 */       this.j = b();
/*     */     }
/*  54 */     this.i = this.j.iterator();
/*  55 */     this.l = null;
/*     */     
/*  57 */     Iterator<bon> iterator = gj.iterator();
/*  58 */     for (int i = 0; i < 2; i++) {
/*  59 */       if (!iterator.hasNext()) {
/*     */         return;
/*     */       }
/*     */       
/*  63 */       bon bon = iterator.next();
/*  64 */       if (!bon.d()) {
/*  65 */         bjr bjr1 = list.get(i);
/*  66 */         this.b.a(bon, bjr1.e, bjr1.f);
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   protected abstract Set<blx> b();
/*     */   
/*     */   public void a(dfm ☃, int i, int j, boolean bool, float f) {
/*  75 */     super.a(☃, i, j, bool, f);
/*     */ 
/*     */     
/*  78 */     if (this.k == null) {
/*     */       return;
/*     */     }
/*     */     
/*  82 */     if (!dot.x()) {
/*  83 */       this.m += f;
/*     */     }
/*     */     
/*  86 */     int k = this.k.e + i;
/*  87 */     int m = this.k.f + j;
/*     */     
/*  89 */     dkw.a(☃, k, m, k + 16, m + 16, 822018048);
/*     */     
/*  91 */     this.e.ad().a(this.e.s, j().r(), k, m);
/*     */     
/*  93 */     RenderSystem.depthFunc(516);
/*  94 */     dkw.a(☃, k, m, k + 16, m + 16, 822083583);
/*  95 */     RenderSystem.depthFunc(515);
/*     */   }
/*     */   
/*     */   private blx j() {
/*  99 */     if (this.l == null || this.m > 30.0F) {
/* 100 */       this.m = 0.0F;
/*     */       
/* 102 */       if (this.i == null || !this.i.hasNext()) {
/* 103 */         if (this.j == null) {
/* 104 */           this.j = b();
/*     */         }
/* 106 */         this.i = this.j.iterator();
/*     */       } 
/*     */       
/* 109 */       this.l = this.i.next();
/*     */     } 
/*     */     
/* 112 */     return this.l;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\drl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */