/*     */ import java.util.Random;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/*     */ {
/*     */   private final Random a;
/*     */   private long b;
/*     */   private long c;
/*     */   private int d;
/*     */   
/*     */   a(Random ☃, long l) {
/* 138 */     this.a = ☃;
/* 139 */     a(l);
/*     */   }
/*     */   
/*     */   public void a(long ☃) {
/* 143 */     this.b = ☃;
/* 144 */     int i = this.d + this.a.nextInt(40) + 40;
/* 145 */     this.d = Math.min(i, 400);
/* 146 */     this.c = ☃ + this.d;
/*     */   }
/*     */   
/*     */   public boolean b(long ☃) {
/* 150 */     return (☃ - this.b < 400L);
/*     */   }
/*     */   
/*     */   public boolean c(long ☃) {
/* 154 */     return (☃ >= this.c);
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/* 159 */     return "RetryMarker{, previousAttemptAt=" + this.b + ", nextScheduledAttemptAt=" + this.c + ", currentDelay=" + this.d + '}';
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\arp$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */