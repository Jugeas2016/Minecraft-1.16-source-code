/*     */ import com.mojang.blaze3d.systems.RenderSystem;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public interface dyk
/*     */ {
/*  13 */   public static final dyk a = new dyk()
/*     */     {
/*     */       public void a(dfh ☃, ekd ekd1) {
/*  16 */         RenderSystem.enableBlend();
/*  17 */         RenderSystem.defaultBlendFunc();
/*  18 */         RenderSystem.depthMask(true);
/*  19 */         ekd1.a(ekb.d);
/*  20 */         ☃.a(7, dfk.j);
/*     */       }
/*     */ 
/*     */       
/*     */       public void a(dfo ☃) {
/*  25 */         ☃.b();
/*     */       }
/*     */ 
/*     */       
/*     */       public String toString() {
/*  30 */         return "TERRAIN_SHEET";
/*     */       }
/*     */     };
/*     */   
/*  34 */   public static final dyk b = new dyk()
/*     */     {
/*     */       public void a(dfh ☃, ekd ekd1) {
/*  37 */         RenderSystem.disableBlend();
/*  38 */         RenderSystem.depthMask(true);
/*  39 */         ekd1.a(ekb.e);
/*  40 */         ☃.a(7, dfk.j);
/*     */       }
/*     */ 
/*     */       
/*     */       public void a(dfo ☃) {
/*  45 */         ☃.b();
/*     */       }
/*     */ 
/*     */       
/*     */       public String toString() {
/*  50 */         return "PARTICLE_SHEET_OPAQUE";
/*     */       }
/*     */     };
/*     */   
/*  54 */   public static final dyk c = new dyk()
/*     */     {
/*     */       public void a(dfh ☃, ekd ekd1) {
/*  57 */         RenderSystem.depthMask(true);
/*  58 */         ekd1.a(ekb.e);
/*  59 */         RenderSystem.enableBlend();
/*  60 */         RenderSystem.blendFuncSeparate(dem.r.l, dem.j.j, dem.r.e, dem.j.j);
/*  61 */         RenderSystem.alphaFunc(516, 0.003921569F);
/*  62 */         ☃.a(7, dfk.j);
/*     */       }
/*     */ 
/*     */       
/*     */       public void a(dfo ☃) {
/*  67 */         ☃.b();
/*     */       }
/*     */ 
/*     */       
/*     */       public String toString() {
/*  72 */         return "PARTICLE_SHEET_TRANSLUCENT";
/*     */       }
/*     */     };
/*     */   
/*  76 */   public static final dyk d = new dyk()
/*     */     {
/*     */       public void a(dfh ☃, ekd ekd1) {
/*  79 */         RenderSystem.disableBlend();
/*  80 */         RenderSystem.depthMask(true);
/*  81 */         ekd1.a(ekb.e);
/*  82 */         ☃.a(7, dfk.j);
/*     */       }
/*     */ 
/*     */       
/*     */       public void a(dfo ☃) {
/*  87 */         ☃.b();
/*     */       }
/*     */ 
/*     */       
/*     */       public String toString() {
/*  92 */         return "PARTICLE_SHEET_LIT";
/*     */       }
/*     */     };
/*     */   
/*  96 */   public static final dyk e = new dyk()
/*     */     {
/*     */       public void a(dfh ☃, ekd ekd1) {
/*  99 */         RenderSystem.depthMask(true);
/* 100 */         RenderSystem.disableBlend();
/*     */       }
/*     */ 
/*     */ 
/*     */       
/*     */       public void a(dfo ☃) {}
/*     */ 
/*     */ 
/*     */       
/*     */       public String toString() {
/* 110 */         return "CUSTOM";
/*     */       }
/*     */     };
/*     */   
/* 114 */   public static final dyk f = new dyk()
/*     */     {
/*     */       public void a(dfh ☃, ekd ekd1) {}
/*     */ 
/*     */ 
/*     */       
/*     */       public void a(dfo ☃) {}
/*     */ 
/*     */ 
/*     */       
/*     */       public String toString() {
/* 125 */         return "NO_RENDER";
/*     */       }
/*     */     };
/*     */   
/*     */   void a(dfh paramdfh, ekd paramekd);
/*     */   
/*     */   void a(dfo paramdfo);
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dyk.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */