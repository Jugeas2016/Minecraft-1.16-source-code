/*    */ import it.unimi.dsi.fastutil.longs.Long2IntLinkedOpenHashMap;
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class cvh
/*    */   implements cvf
/*    */ {
/*    */   private final cwv a;
/*    */   private final Long2IntLinkedOpenHashMap b;
/*    */   private final int c;
/*    */   
/*    */   public cvh(Long2IntLinkedOpenHashMap ☃, int i, cwv cwv1) {
/* 13 */     this.b = ☃;
/* 14 */     this.c = i;
/* 15 */     this.a = cwv1;
/*    */   }
/*    */ 
/*    */   
/*    */   public int a(int ☃, int i) {
/* 20 */     long l = brd.a(☃, i);
/* 21 */     synchronized (this.b) {
/* 22 */       int j = this.b.get(l);
/* 23 */       if (j != Integer.MIN_VALUE) {
/* 24 */         return j;
/*    */       }
/* 26 */       int k = this.a.apply(☃, i);
/* 27 */       this.b.put(l, k);
/* 28 */       if (this.b.size() > this.c) {
/* 29 */         for (int m = 0; m < this.c / 16; m++) {
/* 30 */           this.b.removeFirstInt();
/*    */         }
/*    */       }
/* 33 */       return k;
/*    */     } 
/*    */   }
/*    */   
/*    */   public int a() {
/* 38 */     return this.c;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cvh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */