/*     */ import javax.annotation.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class cgb
/*     */ {
/*     */   @Nullable
/*     */   protected byte[] a;
/*     */   
/*     */   public cgb() {}
/*     */   
/*     */   public cgb(byte[] ☃) {
/*  18 */     this.a = ☃;
/*     */     
/*  20 */     if (☃.length != 2048) {
/*  21 */       throw (IllegalArgumentException)x.c(new IllegalArgumentException("ChunkNibbleArrays should be 2048 bytes not: " + ☃.length));
/*     */     }
/*     */   }
/*     */   
/*     */   protected cgb(int ☃) {
/*  26 */     this.a = new byte[☃];
/*     */   }
/*     */   
/*     */   public int a(int ☃, int i, int j) {
/*  30 */     return b(b(☃, i, j));
/*     */   }
/*     */   
/*     */   public void a(int ☃, int i, int j, int k) {
/*  34 */     a(b(☃, i, j), k);
/*     */   }
/*     */   
/*     */   protected int b(int ☃, int i, int j) {
/*  38 */     return i << 8 | j << 4 | ☃;
/*     */   }
/*     */   
/*     */   private int b(int ☃) {
/*  42 */     if (this.a == null) {
/*  43 */       return 0;
/*     */     }
/*  45 */     int i = d(☃);
/*     */     
/*  47 */     if (c(☃)) {
/*  48 */       return this.a[i] & 0xF;
/*     */     }
/*  50 */     return this.a[i] >> 4 & 0xF;
/*     */   }
/*     */ 
/*     */   
/*     */   private void a(int ☃, int i) {
/*  55 */     if (this.a == null) {
/*  56 */       this.a = new byte[2048];
/*     */     }
/*  58 */     int j = d(☃);
/*     */     
/*  60 */     if (c(☃)) {
/*  61 */       this.a[j] = (byte)(this.a[j] & 0xF0 | i & 0xF);
/*     */     } else {
/*  63 */       this.a[j] = (byte)(this.a[j] & 0xF | (i & 0xF) << 4);
/*     */     } 
/*     */   }
/*     */   
/*     */   private boolean c(int ☃) {
/*  68 */     return ((☃ & 0x1) == 0);
/*     */   }
/*     */   
/*     */   private int d(int ☃) {
/*  72 */     return ☃ >> 1;
/*     */   }
/*     */   
/*     */   public byte[] a() {
/*  76 */     if (this.a == null) {
/*  77 */       this.a = new byte[2048];
/*     */     }
/*  79 */     return this.a;
/*     */   }
/*     */   
/*     */   public cgb b() {
/*  83 */     if (this.a == null) {
/*  84 */       return new cgb();
/*     */     }
/*  86 */     return new cgb((byte[])this.a.clone());
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/*  91 */     StringBuilder ☃ = new StringBuilder();
/*  92 */     for (int i = 0; i < 4096; i++) {
/*  93 */       ☃.append(Integer.toHexString(b(i)));
/*  94 */       if ((i & 0xF) == 15) {
/*  95 */         ☃.append("\n");
/*     */       }
/*  97 */       if ((i & 0xFF) == 255) {
/*  98 */         ☃.append("\n");
/*     */       }
/*     */     } 
/* 101 */     return ☃.toString();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean c() {
/* 117 */     return (this.a == null);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cgb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */