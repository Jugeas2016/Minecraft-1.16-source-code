/*     */ import java.util.Set;
/*     */ import java.util.function.Predicate;
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
/*     */ class a
/*     */   implements Predicate<cel>
/*     */ {
/*     */   private final ceh a;
/*     */   private final Set<cfj<?>> b;
/*     */   @Nullable
/*     */   private final md c;
/*     */   
/*     */   public a(ceh ☃, Set<cfj<?>> set, @Nullable md md1) {
/*  91 */     this.a = ☃;
/*  92 */     this.b = set;
/*  93 */     this.c = md1;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(cel ☃) {
/*  98 */     ceh ceh1 = ☃.a();
/*     */     
/* 100 */     if (!ceh1.a(this.a.b())) {
/* 101 */       return false;
/*     */     }
/*     */     
/* 104 */     for (cfj<?> cfj : this.b) {
/* 105 */       if (ceh1.c(cfj) != this.a.c(cfj)) {
/* 106 */         return false;
/*     */       }
/*     */     } 
/*     */     
/* 110 */     if (this.c != null) {
/* 111 */       ccj ccj = ☃.b();
/* 112 */       return (ccj != null && mp.a(this.c, ccj.a(new md()), true));
/*     */     } 
/*     */     
/* 115 */     return true;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\eg$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */