/*     */ import com.google.common.collect.Lists;
/*     */ import com.mojang.blaze3d.systems.RenderSystem;
/*     */ import java.util.List;
/*     */ import java.util.Random;
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
/*     */ public class dsw
/*     */   implements dsr, dss
/*     */ {
/*  25 */   private static final nr a = new of("spectatorMenu.team_teleport");
/*  26 */   private static final nr b = new of("spectatorMenu.team_teleport.prompt");
/*     */   
/*  28 */   private final List<dss> c = Lists.newArrayList();
/*     */   
/*     */   public dsw() {
/*  31 */     djz ☃ = djz.C();
/*  32 */     for (ddl ddl : ☃.r.G().g()) {
/*  33 */       this.c.add(new a(this, ddl));
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public List<dss> a() {
/*  39 */     return this.c;
/*     */   }
/*     */ 
/*     */   
/*     */   public nr b() {
/*  44 */     return b;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(dsq ☃) {
/*  49 */     ☃.a(this);
/*     */   }
/*     */ 
/*     */   
/*     */   public nr aA_() {
/*  54 */     return a;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(dfm ☃, float f, int i) {
/*  59 */     djz.C().M().a(dml.a);
/*  60 */     dkw.a(☃, 0, 0, 16.0F, 0.0F, 16, 16, 256, 256);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean aB_() {
/*  65 */     for (dss ☃ : this.c) {
/*  66 */       if (☃.aB_()) {
/*  67 */         return true;
/*     */       }
/*     */     } 
/*  70 */     return false;
/*     */   }
/*     */   
/*     */   class a implements dss {
/*     */     private final ddl b;
/*     */     private final vk c;
/*     */     private final List<dwx> d;
/*     */     
/*     */     public a(dsw this$0, ddl ☃) {
/*  79 */       this.b = ☃;
/*     */       
/*  81 */       this.d = Lists.newArrayList();
/*     */       
/*  83 */       for (String str : ☃.g()) {
/*  84 */         dwx dwx = djz.C().w().a(str);
/*     */         
/*  86 */         if (dwx != null) {
/*  87 */           this.d.add(dwx);
/*     */         }
/*     */       } 
/*     */       
/*  91 */       if (this.d.isEmpty()) {
/*  92 */         this.c = ekj.a();
/*     */       } else {
/*  94 */         String str = ((dwx)this.d.get((new Random()).nextInt(this.d.size()))).a().getName();
/*  95 */         this.c = dzj.d(str);
/*  96 */         dzj.a(this.c, str);
/*     */       } 
/*     */     }
/*     */ 
/*     */     
/*     */     public void a(dsq ☃) {
/* 102 */       ☃.a(new dsv(this.d));
/*     */     }
/*     */ 
/*     */     
/*     */     public nr aA_() {
/* 107 */       return this.b.c();
/*     */     }
/*     */ 
/*     */     
/*     */     public void a(dfm ☃, float f, int i) {
/* 112 */       Integer integer = this.b.n().e();
/*     */       
/* 114 */       if (integer != null) {
/* 115 */         float f1 = (integer.intValue() >> 16 & 0xFF) / 255.0F;
/* 116 */         float f2 = (integer.intValue() >> 8 & 0xFF) / 255.0F;
/* 117 */         float f3 = (integer.intValue() & 0xFF) / 255.0F;
/* 118 */         dkw.a(☃, 1, 1, 15, 15, afm.e(f1 * f, f2 * f, f3 * f) | i << 24);
/*     */       } 
/*     */       
/* 121 */       djz.C().M().a(this.c);
/* 122 */       RenderSystem.color4f(f, f, f, i / 255.0F);
/* 123 */       dkw.a(☃, 2, 2, 12, 12, 8.0F, 8.0F, 8, 8, 64, 64);
/* 124 */       dkw.a(☃, 2, 2, 12, 12, 40.0F, 8.0F, 8, 8, 64, 64);
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean aB_() {
/* 129 */       return !this.d.isEmpty();
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dsw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */