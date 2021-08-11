/*    */ import it.unimi.dsi.fastutil.longs.Long2ObjectLinkedOpenHashMap;
/*    */ import java.util.Arrays;
/*    */ import java.util.concurrent.locks.ReentrantReadWriteLock;
/*    */ import java.util.function.IntSupplier;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class dkp
/*    */ {
/*    */   static class a
/*    */   {
/*    */     private a() {}
/*    */     
/* 15 */     public int a = Integer.MIN_VALUE;
/* 16 */     public int b = Integer.MIN_VALUE;
/*    */     
/*    */     public int[] c;
/*    */   }
/*    */ 
/*    */   
/* 22 */   private final ThreadLocal<a> a = ThreadLocal.withInitial(() -> new a());
/* 23 */   private final Long2ObjectLinkedOpenHashMap<int[]> b = new Long2ObjectLinkedOpenHashMap(256, 0.25F);
/* 24 */   private final ReentrantReadWriteLock c = new ReentrantReadWriteLock();
/*    */   
/*    */   public int a(fx ☃, IntSupplier intSupplier) {
/* 27 */     int i = ☃.u() >> 4;
/* 28 */     int j = ☃.w() >> 4;
/*    */     
/* 30 */     a a = this.a.get();
/* 31 */     if (a.a != i || a.b != j) {
/* 32 */       a.a = i;
/* 33 */       a.b = j;
/* 34 */       a.c = b(i, j);
/*    */     } 
/* 36 */     int k = ☃.u() & 0xF;
/* 37 */     int m = ☃.w() & 0xF;
/* 38 */     int n = m << 4 | k;
/* 39 */     int i1 = a.c[n];
/* 40 */     if (i1 != -1) {
/* 41 */       return i1;
/*    */     }
/* 43 */     int i2 = intSupplier.getAsInt();
/* 44 */     a.c[n] = i2;
/* 45 */     return i2;
/*    */   }
/*    */   
/*    */   public void a(int ☃, int i) {
/*    */     try {
/* 50 */       this.c.writeLock().lock();
/*    */       
/* 52 */       for (int j = -1; j <= 1; j++) {
/* 53 */         for (int k = -1; k <= 1; k++) {
/* 54 */           long l = brd.a(☃ + j, i + k);
/* 55 */           this.b.remove(l);
/*    */         } 
/*    */       } 
/*    */     } finally {
/* 59 */       this.c.writeLock().unlock();
/*    */     } 
/*    */   }
/*    */   
/*    */   public void a() {
/*    */     try {
/* 65 */       this.c.writeLock().lock();
/* 66 */       this.b.clear();
/*    */     } finally {
/* 68 */       this.c.writeLock().unlock();
/*    */     } 
/*    */   }
/*    */   private int[] b(int ☃, int i) {
/*    */     int[] arrayOfInt1;
/* 73 */     long l = brd.a(☃, i);
/* 74 */     this.c.readLock().lock();
/*    */     
/*    */     try {
/* 77 */       arrayOfInt1 = (int[])this.b.get(l);
/*    */     } finally {
/* 79 */       this.c.readLock().unlock();
/*    */     } 
/* 81 */     if (arrayOfInt1 != null) {
/* 82 */       return arrayOfInt1;
/*    */     }
/*    */ 
/*    */     
/* 86 */     int[] arrayOfInt2 = new int[256];
/* 87 */     Arrays.fill(arrayOfInt2, -1);
/*    */     try {
/* 89 */       this.c.writeLock().lock();
/* 90 */       if (this.b.size() >= 256) {
/* 91 */         this.b.removeFirst();
/*    */       }
/* 93 */       this.b.put(l, arrayOfInt2);
/*    */     } finally {
/* 95 */       this.c.writeLock().unlock();
/*    */     } 
/* 97 */     return arrayOfInt2;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dkp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */