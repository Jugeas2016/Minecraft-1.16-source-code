/*     */ import java.util.EnumSet;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class a
/*     */   extends axx
/*     */ {
/*     */   private final bbe b;
/*     */   private aqm c;
/*     */   private int d;
/*     */   
/*     */   public a(bbj ☃, bbe bbe1) {
/* 134 */     super(bbe1, false);
/* 135 */     this.b = bbe1;
/* 136 */     a(EnumSet.of(avv.a.d));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a() {
/* 141 */     if (!this.b.eB()) {
/* 142 */       return false;
/*     */     }
/* 144 */     aqa ☃ = this.b.eC();
/* 145 */     if (!(☃ instanceof bfp)) {
/* 146 */       return false;
/*     */     }
/*     */     
/* 149 */     bfp bfp = (bfp)☃;
/* 150 */     this.c = bfp.cZ();
/* 151 */     int i = bfp.da();
/* 152 */     return (i != this.d && a(this.c, azg.a));
/*     */   }
/*     */ 
/*     */   
/*     */   public void c() {
/* 157 */     this.e.h(this.c);
/*     */     
/* 159 */     aqa ☃ = this.b.eC();
/* 160 */     if (☃ instanceof bfp) {
/* 161 */       this.d = ((bfp)☃).da();
/*     */     }
/*     */     
/* 164 */     super.c();
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bbj$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */