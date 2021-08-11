/*     */ import com.google.common.collect.Lists;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/*     */   implements dag<cyx.a>, dbh<cyx.a>
/*     */ {
/* 114 */   private final List<czq> a = Lists.newArrayList();
/* 115 */   private final List<dbo> b = Lists.newArrayList();
/* 116 */   private final List<daj> c = Lists.newArrayList();
/* 117 */   private czb d = new czd(1.0F);
/* 118 */   private czd e = new czd(0.0F, 0.0F);
/*     */   
/*     */   public a a(czb ☃) {
/* 121 */     this.d = ☃;
/* 122 */     return this;
/*     */   }
/*     */ 
/*     */   
/*     */   public a a() {
/* 127 */     return this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public a a(czq.a<?> ☃) {
/* 136 */     this.a.add(☃.b());
/* 137 */     return this;
/*     */   }
/*     */ 
/*     */   
/*     */   public a a(dbo.a ☃) {
/* 142 */     this.b.add(☃.build());
/* 143 */     return this;
/*     */   }
/*     */ 
/*     */   
/*     */   public a a(daj.a ☃) {
/* 148 */     this.c.add(☃.b());
/* 149 */     return this;
/*     */   }
/*     */   
/*     */   public cyx b() {
/* 153 */     if (this.d == null) {
/* 154 */       throw new IllegalArgumentException("Rolls not set");
/*     */     }
/*     */     
/* 157 */     return new cyx(this.a.<czq>toArray(new czq[0]), this.b.<dbo>toArray(new dbo[0]), this.c.<daj>toArray(new daj[0]), this.d, this.e, null);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cyx$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */