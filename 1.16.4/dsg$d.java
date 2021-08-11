/*     */ import com.google.common.collect.Lists;
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
/*     */ public abstract class d
/*     */   extends dsg.f
/*     */ {
/*     */   private final List<afa> a;
/* 137 */   protected final List<dmi> b = Lists.newArrayList();
/*     */   
/*     */   public d(dsg ☃, @Nullable List<afa> list, nr nr1) {
/* 140 */     super(☃, list);
/* 141 */     this.a = (dsg.b(☃)).g.b(nr1, 175);
/*     */   }
/*     */ 
/*     */   
/*     */   public List<? extends dmi> au_() {
/* 146 */     return this.b;
/*     */   }
/*     */   
/*     */   protected void a(dfm ☃, int i, int j) {
/* 150 */     if (this.a.size() == 1) {
/* 151 */       (dsg.c(this.c)).g.b(☃, this.a.get(0), j, (i + 5), 16777215);
/* 152 */     } else if (this.a.size() >= 2) {
/* 153 */       (dsg.d(this.c)).g.b(☃, this.a.get(0), j, i, 16777215);
/* 154 */       (dsg.e(this.c)).g.b(☃, this.a.get(1), j, (i + 10), 16777215);
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dsg$d.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */