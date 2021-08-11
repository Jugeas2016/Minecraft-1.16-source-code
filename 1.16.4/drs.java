/*     */ import com.google.common.collect.Lists;
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
/*     */ 
/*     */ 
/*     */ public class drs
/*     */   extends dlh
/*     */ {
/*  23 */   private static final vk a = new vk("textures/gui/recipe_book.png");
/*     */ 
/*     */ 
/*     */   
/*  27 */   private static final nr b = new of("gui.recipebook.moreRecipes");
/*     */   
/*     */   private bjj<?> c;
/*     */   
/*     */   private adt d;
/*     */   private drt e;
/*     */   private float s;
/*     */   private float t;
/*     */   private int u;
/*     */   
/*     */   public drs() {
/*  38 */     super(0, 0, 25, 25, oe.d);
/*     */   }
/*     */   
/*     */   public void a(drt ☃, drq drq1) {
/*  42 */     this.e = ☃;
/*  43 */     this.c = (bjj)(drq1.d()).s.bp;
/*  44 */     this.d = drq1.e();
/*     */     
/*  46 */     List<boq<?>> list = ☃.a(this.d.a(this.c));
/*  47 */     for (boq<?> boq : list) {
/*  48 */       if (this.d.d(boq)) {
/*  49 */         drq1.a(list);
/*  50 */         this.t = 15.0F;
/*     */         break;
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public drt a() {
/*  57 */     return this.e;
/*     */   }
/*     */   
/*     */   public void a(int ☃, int i) {
/*  61 */     this.l = ☃;
/*  62 */     this.m = i;
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(dfm ☃, int i, int j, float f) {
/*  67 */     if (!dot.x()) {
/*  68 */       this.s += f;
/*     */     }
/*     */     
/*  71 */     djz djz = djz.C();
/*  72 */     djz.M().a(a);
/*     */     
/*  74 */     int k = 29;
/*  75 */     if (!this.e.b()) {
/*  76 */       k += 25;
/*     */     }
/*  78 */     int m = 206;
/*  79 */     if (this.e.a(this.d.a(this.c)).size() > 1) {
/*  80 */       m += 25;
/*     */     }
/*     */     
/*  83 */     boolean bool = (this.t > 0.0F);
/*  84 */     if (bool) {
/*  85 */       float f1 = 1.0F + 0.1F * (float)Math.sin((this.t / 15.0F * 3.1415927F));
/*  86 */       RenderSystem.pushMatrix();
/*  87 */       RenderSystem.translatef((this.l + 8), (this.m + 12), 0.0F);
/*  88 */       RenderSystem.scalef(f1, f1, 1.0F);
/*  89 */       RenderSystem.translatef(-(this.l + 8), -(this.m + 12), 0.0F);
/*     */       
/*  91 */       this.t -= f;
/*     */     } 
/*     */     
/*  94 */     b(☃, this.l, this.m, k, m, this.j, this.k);
/*     */     
/*  96 */     List<boq<?>> list = k();
/*  97 */     this.u = afm.d(this.s / 30.0F) % list.size();
/*     */     
/*  99 */     bmb bmb = ((boq)list.get(this.u)).c();
/* 100 */     int n = 4;
/* 101 */     if (this.e.e() && k().size() > 1) {
/* 102 */       djz.ad().b(bmb, this.l + n + 1, this.m + n + 1);
/* 103 */       n--;
/*     */     } 
/*     */     
/* 106 */     djz.ad().c(bmb, this.l + n, this.m + n);
/*     */     
/* 108 */     if (bool) {
/* 109 */       RenderSystem.popMatrix();
/*     */     }
/*     */   }
/*     */   
/*     */   private List<boq<?>> k() {
/* 114 */     List<boq<?>> ☃ = this.e.b(true);
/* 115 */     if (!this.d.a(this.c)) {
/* 116 */       ☃.addAll(this.e.b(false));
/*     */     }
/* 118 */     return ☃;
/*     */   }
/*     */   
/*     */   public boolean b() {
/* 122 */     return (k().size() == 1);
/*     */   }
/*     */   
/*     */   public boq<?> d() {
/* 126 */     List<boq<?>> ☃ = k();
/* 127 */     return ☃.get(this.u);
/*     */   }
/*     */   
/*     */   public List<nr> a(dot ☃) {
/* 131 */     bmb bmb = ((boq)k().get(this.u)).c();
/*     */     
/* 133 */     List<nr> list = Lists.newArrayList(☃.a(bmb));
/* 134 */     if (this.e.a(this.d.a(this.c)).size() > 1) {
/* 135 */       list.add(b);
/*     */     }
/*     */     
/* 138 */     return list;
/*     */   }
/*     */ 
/*     */   
/*     */   public int h() {
/* 143 */     return 25;
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean a(int ☃) {
/* 148 */     return (☃ == 0 || ☃ == 1);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\drs.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */