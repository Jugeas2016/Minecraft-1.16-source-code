/*     */ import com.google.common.collect.Lists;
/*     */ import com.mojang.blaze3d.systems.RenderSystem;
/*     */ import java.util.List;
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
/*     */ public class drn
/*     */ {
/*     */   private boq<?> a;
/*  21 */   private final List<a> b = Lists.newArrayList();
/*     */   private float c;
/*     */   
/*     */   public void a() {
/*  25 */     this.a = null;
/*  26 */     this.b.clear();
/*  27 */     this.c = 0.0F;
/*     */   }
/*     */   
/*     */   public void a(bon ☃, int i, int j) {
/*  31 */     this.b.add(new a(this, ☃, i, j));
/*     */   }
/*     */   
/*     */   public a a(int ☃) {
/*  35 */     return this.b.get(☃);
/*     */   }
/*     */   
/*     */   public int b() {
/*  39 */     return this.b.size();
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public boq<?> c() {
/*  44 */     return this.a;
/*     */   }
/*     */   
/*     */   public void a(boq<?> ☃) {
/*  48 */     this.a = ☃;
/*     */   }
/*     */   
/*     */   public void a(dfm ☃, djz djz1, int i, int j, boolean bool, float f) {
/*  52 */     if (!dot.x()) {
/*  53 */       this.c += f;
/*     */     }
/*     */     
/*  56 */     for (int k = 0; k < this.b.size(); k++) {
/*  57 */       a a = this.b.get(k);
/*     */       
/*  59 */       int m = a.a() + i;
/*  60 */       int n = a.b() + j;
/*     */       
/*  62 */       if (k == 0 && bool) {
/*  63 */         dkw.a(☃, m - 4, n - 4, m + 20, n + 20, 822018048);
/*     */       } else {
/*  65 */         dkw.a(☃, m, n, m + 16, n + 16, 822018048);
/*     */       } 
/*     */       
/*  68 */       bmb bmb = a.c();
/*     */       
/*  70 */       efo efo = djz1.ad();
/*     */       
/*  72 */       efo.c(bmb, m, n);
/*     */       
/*  74 */       RenderSystem.depthFunc(516);
/*  75 */       dkw.a(☃, m, n, m + 16, n + 16, 822083583);
/*  76 */       RenderSystem.depthFunc(515);
/*     */       
/*  78 */       if (k == 0)
/*  79 */         efo.a(djz1.g, bmb, m, n); 
/*     */     } 
/*     */   }
/*     */   
/*     */   public class a
/*     */   {
/*     */     private final bon b;
/*     */     private final int c;
/*     */     private final int d;
/*     */     
/*     */     public a(drn ☃, bon bon1, int i, int j) {
/*  90 */       this.b = bon1;
/*  91 */       this.c = i;
/*  92 */       this.d = j;
/*     */     }
/*     */     
/*     */     public int a() {
/*  96 */       return this.c;
/*     */     }
/*     */     
/*     */     public int b() {
/* 100 */       return this.d;
/*     */     }
/*     */     
/*     */     public bmb c() {
/* 104 */       bmb[] ☃ = this.b.a();
/* 105 */       return ☃[afm.d(drn.a(this.a) / 30.0F) % ☃.length];
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\drn.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */