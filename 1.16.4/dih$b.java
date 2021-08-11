/*     */ import java.util.Arrays;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ class b
/*     */   extends eon<dih.a>
/*     */ {
/*     */   public b(dih paramdih) {
/* 151 */     super(paramdih.k, paramdih.l, dih.a(0), paramdih.l - 40, 36);
/*     */   }
/*     */   
/*     */   public void a(cyh ☃) {
/* 155 */     a(new dih.a(this.a, ☃));
/*     */   }
/*     */ 
/*     */   
/*     */   public int c() {
/* 160 */     return dih.a(this.a).size() * 36;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean b() {
/* 165 */     return (this.a.aw_() == this);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(dfm ☃) {
/* 170 */     this.a.a(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(int ☃) {
/* 175 */     j(☃);
/* 176 */     if (☃ != -1) {
/* 177 */       cyh cyh = dih.a(this.a).get(☃);
/* 178 */       String str1 = ekx.a("narrator.select.list.position", new Object[] { Integer.valueOf(☃ + 1), Integer.valueOf(dih.a(this.a).size()) });
/* 179 */       String str2 = eoj.b(Arrays.asList(new String[] { cyh.b(), dih.a(cyh), dih.b(cyh).getString(), str1 }));
/* 180 */       eoj.a(ekx.a("narrator.select", new Object[] { str2 }));
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(@Nullable dih.a ☃) {
/* 186 */     super.a(☃);
/*     */     
/* 188 */     dih.a(this.a, au_().indexOf(☃));
/* 189 */     (dih.b(this.a)).o = (dih.c(this.a) >= 0 && dih.c(this.a) < l() && !((cyh)dih.a(this.a).get(dih.c(this.a))).h());
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dih$b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */