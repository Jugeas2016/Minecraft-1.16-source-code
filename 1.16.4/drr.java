/*     */ import com.mojang.blaze3d.systems.RenderSystem;
/*     */ import java.util.List;
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
/*     */ public class drr
/*     */   extends dma
/*     */ {
/*     */   private final dkg t;
/*     */   private float u;
/*     */   
/*     */   public drr(dkg ☃) {
/*  24 */     super(0, 0, 35, 27, false);
/*  25 */     this.t = ☃;
/*     */     
/*  27 */     a(153, 2, 35, 0, drp.a);
/*     */   }
/*     */   
/*     */   public void a(djz ☃) {
/*  31 */     djm djm = ☃.s.F();
/*  32 */     List<drt> list = djm.a(this.t);
/*  33 */     if (!(☃.s.bp instanceof bjj)) {
/*     */       return;
/*     */     }
/*  36 */     for (drt drt : list) {
/*  37 */       for (boq<?> boq : drt.a(djm.a((bjj)☃.s.bp))) {
/*  38 */         if (djm.d(boq)) {
/*  39 */           this.u = 15.0F;
/*     */           return;
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void b(dfm ☃, int i, int j, float f) {
/*  49 */     if (this.u > 0.0F) {
/*  50 */       float f1 = 1.0F + 0.1F * (float)Math.sin((this.u / 15.0F * 3.1415927F));
/*  51 */       RenderSystem.pushMatrix();
/*  52 */       RenderSystem.translatef((this.l + 8), (this.m + 12), 0.0F);
/*  53 */       RenderSystem.scalef(1.0F, f1, 1.0F);
/*  54 */       RenderSystem.translatef(-(this.l + 8), -(this.m + 12), 0.0F);
/*     */     } 
/*     */     
/*  57 */     djz djz = djz.C();
/*  58 */     djz.M().a(this.a);
/*  59 */     RenderSystem.disableDepthTest();
/*     */     
/*  61 */     int k = this.c;
/*  62 */     int m = this.d;
/*  63 */     if (this.b) {
/*  64 */       k += this.e;
/*     */     }
/*  66 */     if (g()) {
/*  67 */       m += this.s;
/*     */     }
/*     */     
/*  70 */     int n = this.l;
/*  71 */     if (this.b) {
/*  72 */       n -= 2;
/*     */     }
/*     */     
/*  75 */     RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
/*  76 */     b(☃, n, this.m, k, m, this.j, this.k);
/*  77 */     RenderSystem.enableDepthTest();
/*     */     
/*  79 */     a(djz.ad());
/*     */     
/*  81 */     if (this.u > 0.0F) {
/*  82 */       RenderSystem.popMatrix();
/*  83 */       this.u -= f;
/*     */     } 
/*     */   }
/*     */   
/*     */   private void a(efo ☃) {
/*  88 */     List<bmb> list = this.t.a();
/*     */     
/*  90 */     int i = this.b ? -2 : 0;
/*     */     
/*  92 */     if (list.size() == 1) {
/*  93 */       ☃.c(list.get(0), this.l + 9 + i, this.m + 5);
/*  94 */     } else if (list.size() == 2) {
/*  95 */       ☃.c(list.get(0), this.l + 3 + i, this.m + 5);
/*  96 */       ☃.c(list.get(1), this.l + 14 + i, this.m + 5);
/*     */     } 
/*     */   }
/*     */   
/*     */   public dkg b() {
/* 101 */     return this.t;
/*     */   }
/*     */   
/*     */   public boolean a(djm ☃) {
/* 105 */     List<drt> list = ☃.a(this.t);
/* 106 */     this.p = false;
/*     */     
/* 108 */     if (list != null) {
/* 109 */       for (drt drt : list) {
/* 110 */         if (drt.a() && drt.c()) {
/* 111 */           this.p = true;
/*     */           
/*     */           break;
/*     */         } 
/*     */       } 
/*     */     }
/* 117 */     return this.p;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\drr.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */