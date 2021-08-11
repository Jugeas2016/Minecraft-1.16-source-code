/*     */ import java.util.Arrays;
/*     */ import java.util.List;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/*     */   extends eon<dic.a>
/*     */ {
/*     */   public b(dic paramdic) {
/* 200 */     super(paramdic.k, paramdic.l, 32, paramdic.l - 40, 36);
/*     */   }
/*     */   
/*     */   public void b(int ☃) {
/* 204 */     i(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public int c() {
/* 209 */     return l() * 36;
/*     */   }
/*     */ 
/*     */   
/*     */   public int d() {
/* 214 */     return 260;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean b() {
/* 219 */     return (this.a.aw_() == this);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(dfm ☃) {
/* 224 */     this.a.a(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(int ☃) {
/* 229 */     j(☃);
/* 230 */     if (☃ != -1) {
/* 231 */       List<dic.a> list = dic.b(this.a).au_();
/* 232 */       dgk dgk = dic.a.a(list.get(☃));
/* 233 */       String str1 = ekx.a("narrator.select.list.position", new Object[] { Integer.valueOf(☃ + 1), Integer.valueOf(list.size()) });
/* 234 */       String str2 = eoj.b(Arrays.asList(new String[] { dgk.b, dgk.c, dis.a(dgk.e), str1 }));
/* 235 */       eoj.a(ekx.a("narrator.select", new Object[] { str2 }));
/*     */     } 
/* 237 */     c(☃);
/*     */   }
/*     */   
/*     */   public void c(int ☃) {
/* 241 */     dic.b(this.a, ☃);
/* 242 */     dic.e(this.a);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(@Nullable dic.a ☃) {
/* 247 */     super.a(☃);
/*     */     
/* 249 */     dic.b(this.a, au_().indexOf(☃));
/* 250 */     dic.e(this.a);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dic$b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */