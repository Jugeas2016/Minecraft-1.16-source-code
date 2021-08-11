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
/*     */ public abstract class c
/*     */   extends avv
/*     */ {
/*     */   protected int b;
/*     */   protected int c;
/*     */   
/*     */   protected c(bea ☃) {}
/*     */   
/*     */   public boolean a() {
/* 150 */     aqm ☃ = this.d.A();
/* 151 */     if (☃ == null || !☃.aX()) {
/* 152 */       return false;
/*     */     }
/* 154 */     if (this.d.eW())
/*     */     {
/* 156 */       return false;
/*     */     }
/* 158 */     if (this.d.K < this.c) {
/* 159 */       return false;
/*     */     }
/* 161 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean b() {
/* 166 */     aqm ☃ = this.d.A();
/* 167 */     return (☃ != null && ☃.aX() && this.b > 0);
/*     */   }
/*     */ 
/*     */   
/*     */   public void c() {
/* 172 */     this.b = m();
/* 173 */     this.d.b = g();
/* 174 */     this.c = this.d.K + h();
/* 175 */     adp ☃ = k();
/* 176 */     if (☃ != null) {
/* 177 */       this.d.a(☃, 1.0F, 1.0F);
/*     */     }
/* 179 */     this.d.a(l());
/*     */   }
/*     */ 
/*     */   
/*     */   public void e() {
/* 184 */     this.b--;
/* 185 */     if (this.b == 0) {
/* 186 */       j();
/* 187 */       this.d.a(this.d.eM(), 1.0F, 1.0F);
/*     */     } 
/*     */   }
/*     */   
/*     */   protected abstract void j();
/*     */   
/*     */   protected int m() {
/* 194 */     return 20;
/*     */   }
/*     */   
/*     */   protected abstract int g();
/*     */   
/*     */   protected abstract int h();
/*     */   
/*     */   @Nullable
/*     */   protected abstract adp k();
/*     */   
/*     */   protected abstract bea.a l();
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bea$c.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */