/*     */ import com.google.common.collect.Maps;
/*     */ import com.mojang.blaze3d.systems.RenderSystem;
/*     */ import java.util.Map;
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
/*     */ public class dpi
/*     */   extends dot
/*     */   implements dwq.a
/*     */ {
/*  23 */   private static final vk a = new vk("textures/gui/advancements/window.png");
/*  24 */   private static final vk b = new vk("textures/gui/advancements/tabs.png");
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
/*  43 */   private static final nr c = new of("advancements.sad_label");
/*  44 */   private static final nr p = new of("advancements.empty");
/*  45 */   private static final nr q = new of("gui.advancements");
/*     */   
/*     */   private final dwq r;
/*  48 */   private final Map<y, dpe> s = Maps.newLinkedHashMap();
/*     */   private dpe t;
/*     */   private boolean u;
/*     */   
/*     */   public dpi(dwq ☃) {
/*  53 */     super(dkz.a);
/*  54 */     this.r = ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void b() {
/*  59 */     this.s.clear();
/*  60 */     this.t = null;
/*  61 */     this.r.a(this);
/*  62 */     if (this.t == null && !this.s.isEmpty()) {
/*  63 */       this.r.a(((dpe)this.s.values().iterator().next()).c(), true);
/*     */     } else {
/*     */       
/*  66 */       this.r.a((this.t == null) ? null : this.t.c(), true);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void e() {
/*  72 */     this.r.a((dwq.a)null);
/*  73 */     dwu ☃ = this.i.w();
/*  74 */     if (☃ != null) {
/*  75 */       ☃.a(tg.b());
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(double ☃, double d1, int i) {
/*  81 */     if (i == 0) {
/*  82 */       int j = (this.k - 252) / 2;
/*  83 */       int k = (this.l - 140) / 2;
/*     */       
/*  85 */       for (dpe dpe1 : this.s.values()) {
/*  86 */         if (dpe1.a(j, k, ☃, d1)) {
/*  87 */           this.r.a(dpe1.c(), true);
/*     */           break;
/*     */         } 
/*     */       } 
/*     */     } 
/*  92 */     return super.a(☃, d1, i);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(int ☃, int i, int j) {
/*  97 */     if (this.i.k.aB.a(☃, i)) {
/*  98 */       this.i.a((dot)null);
/*  99 */       this.i.l.i();
/* 100 */       return true;
/*     */     } 
/* 102 */     return super.a(☃, i, j);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(dfm ☃, int i, int j, float f) {
/* 107 */     int k = (this.k - 252) / 2;
/* 108 */     int m = (this.l - 140) / 2;
/*     */     
/* 110 */     a(☃);
/* 111 */     c(☃, i, j, k, m);
/* 112 */     a(☃, k, m);
/* 113 */     d(☃, i, j, k, m);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(double ☃, double d1, int i, double d2, double d3) {
/* 118 */     if (i != 0) {
/* 119 */       this.u = false;
/* 120 */       return false;
/*     */     } 
/*     */     
/* 123 */     if (!this.u) {
/* 124 */       this.u = true;
/* 125 */     } else if (this.t != null) {
/* 126 */       this.t.a(d2, d3);
/*     */     } 
/* 128 */     return true;
/*     */   }
/*     */   
/*     */   private void c(dfm ☃, int i, int j, int k, int m) {
/* 132 */     dpe dpe1 = this.t;
/* 133 */     if (dpe1 == null) {
/* 134 */       a(☃, k + 9, m + 18, k + 9 + 234, m + 18 + 113, -16777216);
/* 135 */       int n = k + 9 + 117;
/* 136 */       this.o.getClass(); a(☃, this.o, p, n, m + 18 + 56 - 9 / 2, -1);
/* 137 */       this.o.getClass(); a(☃, this.o, c, n, m + 18 + 113 - 9, -1);
/*     */       return;
/*     */     } 
/* 140 */     RenderSystem.pushMatrix();
/* 141 */     RenderSystem.translatef((k + 9), (m + 18), 0.0F);
/*     */     
/* 143 */     dpe1.a(☃);
/*     */     
/* 145 */     RenderSystem.popMatrix();
/* 146 */     RenderSystem.depthFunc(515);
/* 147 */     RenderSystem.disableDepthTest();
/*     */   }
/*     */   
/*     */   public void a(dfm ☃, int i, int j) {
/* 151 */     RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 152 */     RenderSystem.enableBlend();
/*     */     
/* 154 */     this.i.M().a(a);
/* 155 */     b(☃, i, j, 0, 0, 252, 140);
/*     */     
/* 157 */     if (this.s.size() > 1) {
/* 158 */       this.i.M().a(b);
/* 159 */       for (dpe dpe1 : this.s.values()) {
/* 160 */         dpe1.a(☃, i, j, (dpe1 == this.t));
/*     */       }
/*     */       
/* 163 */       RenderSystem.enableRescaleNormal();
/* 164 */       RenderSystem.defaultBlendFunc();
/* 165 */       for (dpe dpe1 : this.s.values()) {
/* 166 */         dpe1.a(i, j, this.j);
/*     */       }
/* 168 */       RenderSystem.disableBlend();
/*     */     } 
/*     */     
/* 171 */     this.o.b(☃, q, (i + 8), (j + 6), 4210752);
/*     */   }
/*     */   
/*     */   private void d(dfm ☃, int i, int j, int k, int m) {
/* 175 */     RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
/*     */     
/* 177 */     if (this.t != null) {
/* 178 */       RenderSystem.pushMatrix();
/* 179 */       RenderSystem.enableDepthTest();
/* 180 */       RenderSystem.translatef((k + 9), (m + 18), 400.0F);
/* 181 */       this.t.c(☃, i - k - 9, j - m - 18, k, m);
/* 182 */       RenderSystem.disableDepthTest();
/* 183 */       RenderSystem.popMatrix();
/*     */     } 
/*     */     
/* 186 */     if (this.s.size() > 1) {
/* 187 */       for (dpe dpe1 : this.s.values()) {
/* 188 */         if (dpe1.a(k, m, i, j)) {
/* 189 */           b(☃, dpe1.d(), i, j);
/*     */         }
/*     */       } 
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(y ☃) {
/* 197 */     dpe dpe1 = dpe.a(this.i, this, this.s.size(), ☃);
/* 198 */     if (dpe1 == null) {
/*     */       return;
/*     */     }
/* 201 */     this.s.put(☃, dpe1);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void b(y ☃) {}
/*     */ 
/*     */   
/*     */   public void c(y ☃) {
/* 210 */     dpe dpe1 = g(☃);
/* 211 */     if (dpe1 != null) {
/* 212 */       dpe1.a(☃);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void d(y ☃) {}
/*     */ 
/*     */   
/*     */   public void a(y ☃, aa aa1) {
/* 222 */     dpg dpg = f(☃);
/* 223 */     if (dpg != null) {
/* 224 */       dpg.a(aa1);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void e(@Nullable y ☃) {
/* 230 */     this.t = this.s.get(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a() {
/* 235 */     this.s.clear();
/* 236 */     this.t = null;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public dpg f(y ☃) {
/* 241 */     dpe dpe1 = g(☃);
/* 242 */     return (dpe1 == null) ? null : dpe1.b(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   private dpe g(y ☃) {
/* 248 */     while (☃.b() != null) {
/* 249 */       ☃ = ☃.b();
/*     */     }
/* 251 */     return this.s.get(☃);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dpi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */