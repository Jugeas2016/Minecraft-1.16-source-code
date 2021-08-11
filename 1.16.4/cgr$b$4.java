/*     */ import com.google.common.collect.Lists;
/*     */ import it.unimi.dsi.fastutil.objects.ObjectIterator;
/*     */ import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
/*     */ import it.unimi.dsi.fastutil.objects.ObjectSet;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ enum null
/*     */ {
/*     */   private final ThreadLocal<List<ObjectSet<fx>>> g;
/*     */   
/*     */   null(boolean ☃, buo... arrayOfBuo) {
/* 266 */     this.g = ThreadLocal.withInitial(() -> Lists.newArrayListWithCapacity(7));
/*     */   }
/*     */   
/*     */   public ceh a(ceh ☃, gc gc1, ceh ceh1, bry bry1, fx fx1, fx fx2) {
/* 270 */     ceh ceh2 = ☃.a(gc1, bry1.d_(fx2), bry1, fx1, fx2);
/* 271 */     if (☃ != ceh2) {
/* 272 */       int i = ((Integer)ceh2.c(cex.an)).intValue();
/* 273 */       List<ObjectSet<fx>> list = this.g.get();
/* 274 */       if (list.isEmpty()) {
/* 275 */         for (int j = 0; j < 7; j++) {
/* 276 */           list.add(new ObjectOpenHashSet());
/*     */         }
/*     */       }
/* 279 */       ((ObjectSet)list.get(i)).add(fx1.h());
/*     */     } 
/* 281 */     return ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(bry ☃) {
/* 286 */     fx.a a = new fx.a();
/*     */     
/* 288 */     List<ObjectSet<fx>> list = this.g.get();
/* 289 */     for (int i = 2; i < list.size(); i++) {
/* 290 */       int j = i - 1;
/* 291 */       ObjectSet<fx> objectSet1 = list.get(j);
/* 292 */       ObjectSet<fx> objectSet2 = list.get(i);
/*     */       
/* 294 */       for (ObjectIterator<fx> objectIterator = objectSet1.iterator(); objectIterator.hasNext(); ) { fx fx = objectIterator.next();
/* 295 */         ceh ceh = ☃.d_(fx);
/* 296 */         if (((Integer)ceh.c(cex.an)).intValue() < j) {
/*     */           continue;
/*     */         }
/*     */         
/* 300 */         ☃.a(fx, ceh.a(cex.an, Integer.valueOf(j)), 18);
/*     */         
/* 302 */         if (i != 7) {
/* 303 */           for (gc gc : f) {
/* 304 */             a.a(fx, gc);
/* 305 */             ceh ceh1 = ☃.d_(a);
/*     */             
/* 307 */             if (ceh1.b(cex.an) && ((Integer)ceh.c(cex.an)).intValue() > i) {
/* 308 */               objectSet2.add(a.h());
/*     */             }
/*     */           } 
/*     */         } }
/*     */     
/*     */     } 
/*     */     
/* 315 */     list.clear();
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cgr$b$4.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */