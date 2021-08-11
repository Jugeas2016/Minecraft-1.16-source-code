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
/*     */ class a
/*     */   extends dlv.a<dnv.a.a>
/*     */ {
/*     */   private a(dnv.a parama) {}
/*     */   
/*     */   public void a(dfm ☃, int i, int j, int k, int m, int n, int i1, int i2, boolean bool, float f) {
/*     */     String str;
/* 178 */     cpe cpe = dnv.a(this.a.a).f().get(dnv.a(this.a.a).f().size() - i - 1);
/* 179 */     ceh ceh = cpe.b();
/*     */     
/* 181 */     blx blx = ceh.b().h();
/* 182 */     if (blx == bmd.a) {
/* 183 */       if (ceh.a(bup.A)) {
/* 184 */         blx = bmd.lL;
/* 185 */       } else if (ceh.a(bup.B)) {
/* 186 */         blx = bmd.lM;
/*     */       } 
/*     */     }
/* 189 */     bmb bmb = new bmb(blx);
/* 190 */     a(☃, k, j, bmb);
/* 191 */     this.a.a.o.b(☃, blx.h(bmb), (k + 18 + 5), (j + 3), 16777215);
/*     */ 
/*     */ 
/*     */     
/* 195 */     if (i == 0) {
/* 196 */       str = ekx.a("createWorld.customize.flat.layer.top", new Object[] { Integer.valueOf(cpe.a()) });
/* 197 */     } else if (i == dnv.a(this.a.a).f().size() - 1) {
/* 198 */       str = ekx.a("createWorld.customize.flat.layer.bottom", new Object[] { Integer.valueOf(cpe.a()) });
/*     */     } else {
/* 200 */       str = ekx.a("createWorld.customize.flat.layer", new Object[] { Integer.valueOf(cpe.a()) });
/*     */     } 
/*     */     
/* 203 */     this.a.a.o.b(☃, str, (k + 2 + 213 - this.a.a.o.b(str)), (j + 3), 16777215);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(double ☃, double d1, int i) {
/* 208 */     if (i == 0) {
/* 209 */       this.a.a(this);
/* 210 */       return true;
/*     */     } 
/* 212 */     return false;
/*     */   }
/*     */   
/*     */   private void a(dfm ☃, int i, int j, bmb bmb1) {
/* 216 */     a(☃, i + 1, j + 1);
/*     */     
/* 218 */     RenderSystem.enableRescaleNormal();
/*     */     
/* 220 */     if (!bmb1.a()) {
/* 221 */       this.a.a.j.a(bmb1, i + 2, j + 2);
/*     */     }
/*     */     
/* 224 */     RenderSystem.disableRescaleNormal();
/*     */   }
/*     */   
/*     */   private void a(dfm ☃, int i, int j) {
/* 228 */     RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
/* 229 */     dnv.a.a(this.a).M().a(dkw.g);
/*     */     
/* 231 */     dkw.a(☃, i, j, this.a.a.v(), 0.0F, 0.0F, 18, 18, 128, 128);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dnv$a$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */