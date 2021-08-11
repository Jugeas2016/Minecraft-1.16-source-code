/*     */ import java.util.Map;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ class c
/*     */   implements Predicate<cel>
/*     */ {
/*     */   private final ael<buo> a;
/*     */   @Nullable
/*     */   private final md b;
/*     */   private final Map<String, String> c;
/*     */   
/*     */   private c(ael<buo> ☃, Map<String, String> map, @Nullable md md1) {
/* 126 */     this.a = ☃;
/* 127 */     this.c = map;
/* 128 */     this.b = md1;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(cel ☃) {
/* 133 */     ceh ceh = ☃.a();
/*     */     
/* 135 */     if (!ceh.a(this.a)) {
/* 136 */       return false;
/*     */     }
/*     */     
/* 139 */     for (Map.Entry<String, String> entry : this.c.entrySet()) {
/* 140 */       cfj<?> cfj = ceh.b().m().a(entry.getKey());
/* 141 */       if (cfj == null) {
/* 142 */         return false;
/*     */       }
/* 144 */       Comparable<?> comparable = cfj.b(entry.getValue()).orElse(null);
/* 145 */       if (comparable == null) {
/* 146 */         return false;
/*     */       }
/* 148 */       if (ceh.c(cfj) != comparable) {
/* 149 */         return false;
/*     */       }
/*     */     } 
/*     */     
/* 153 */     if (this.b != null) {
/* 154 */       ccj ccj = ☃.b();
/* 155 */       return (ccj != null && mp.a(this.b, ccj.a(new md()), true));
/*     */     } 
/*     */     
/* 158 */     return true;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\eg$c.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */