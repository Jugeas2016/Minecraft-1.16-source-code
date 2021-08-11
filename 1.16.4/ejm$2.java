/*     */ import java.util.Optional;
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
/*     */ final class null
/*     */   implements ejn
/*     */ {
/* 134 */   private final ejm.a a = new ejm.a(null);
/* 135 */   private final ejm.a b = new ejm.a(null);
/*     */   
/*     */   public float call(bmb ☃, @Nullable dwt dwt1, @Nullable aqm aqm1) {
/*     */     double d3;
/* 139 */     aqa aqa = (aqm1 != null) ? aqm1 : ☃.A();
/*     */     
/* 141 */     if (aqa == null) {
/* 142 */       return 0.0F;
/*     */     }
/* 144 */     if (dwt1 == null && aqa.l instanceof dwt) {
/* 145 */       dwt1 = (dwt)aqa.l;
/*     */     }
/*     */     
/* 148 */     fx fx = bkq.d(☃) ? a(dwt1, ☃.p()) : a(dwt1);
/* 149 */     long l = dwt1.T();
/*     */     
/* 151 */     if (fx == null || aqa.cA().c(fx.u() + 0.5D, aqa.cA().b(), fx.w() + 0.5D) < 9.999999747378752E-6D) {
/* 152 */       if (ejm.a.a(this.b, l)) {
/* 153 */         ejm.a.a(this.b, l, Math.random());
/*     */       }
/* 155 */       double d = ejm.a.a(this.b) + (☃.hashCode() / 2.14748365E9F);
/* 156 */       return afm.b((float)d, 1.0F);
/*     */     } 
/*     */     
/* 159 */     boolean bool = (aqm1 instanceof bfw && ((bfw)aqm1).ez());
/* 160 */     double d1 = 0.0D;
/* 161 */     if (bool) {
/* 162 */       d1 = aqm1.p;
/* 163 */     } else if (aqa instanceof bcp) {
/* 164 */       d1 = a((bcp)aqa);
/* 165 */     } else if (aqa instanceof bcv) {
/* 166 */       d1 = (180.0F - ((bcv)aqa).a(0.5F) / 6.2831855F * 360.0F);
/* 167 */     } else if (aqm1 != null) {
/* 168 */       d1 = aqm1.aA;
/*     */     } 
/* 170 */     d1 = afm.c(d1 / 360.0D, 1.0D);
/* 171 */     double d2 = a(dcn.a(fx), aqa) / 6.2831854820251465D;
/*     */ 
/*     */     
/* 174 */     if (bool) {
/* 175 */       if (ejm.a.a(this.a, l)) {
/* 176 */         ejm.a.a(this.a, l, 0.5D - d1 - 0.25D);
/*     */       }
/* 178 */       d3 = d2 + ejm.a.a(this.a);
/*     */     } else {
/* 180 */       d3 = 0.5D - d1 - 0.25D - d2;
/*     */     } 
/* 182 */     return afm.b((float)d3, 1.0F);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   private fx a(dwt ☃) {
/* 187 */     return ☃.k().e() ? ☃.u() : null;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   private fx a(brx ☃, md md1) {
/* 192 */     boolean bool1 = md1.e("LodestonePos");
/* 193 */     boolean bool2 = md1.e("LodestoneDimension");
/* 194 */     if (bool1 && bool2) {
/* 195 */       Optional<vj<brx>> optional = bkq.a(md1);
/* 196 */       if (optional.isPresent() && ☃.Y() == optional.get()) {
/* 197 */         return mp.b(md1.p("LodestonePos"));
/*     */       }
/*     */     } 
/* 200 */     return null;
/*     */   }
/*     */   
/*     */   private double a(bcp ☃) {
/* 204 */     gc gc = ☃.bZ();
/* 205 */     int i = gc.n().c() ? (90 * gc.e().a()) : 0;
/* 206 */     return afm.b(180 + gc.d() * 90 + ☃.p() * 45 + i);
/*     */   }
/*     */   
/*     */   private double a(dcn ☃, aqa aqa1) {
/* 210 */     return Math.atan2(☃.c() - aqa1.cH(), ☃.a() - aqa1.cD());
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ejm$2.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */