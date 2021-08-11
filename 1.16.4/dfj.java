/*     */ 
/*     */ 
/*     */ 
/*     */ public interface dfj
/*     */   extends dfq
/*     */ {
/*     */   dfs i();
/*     */   
/*     */   void e();
/*     */   
/*     */   void a(int paramInt, byte paramByte);
/*     */   
/*     */   void a(int paramInt, short paramShort);
/*     */   
/*     */   void a(int paramInt, float paramFloat);
/*     */   
/*     */   default dfq a(double ☃, double d1, double d2) {
/*  18 */     if (i().a() != dfs.a.a) {
/*  19 */       throw new IllegalStateException();
/*     */     }
/*  21 */     a(0, (float)☃);
/*  22 */     a(4, (float)d1);
/*  23 */     a(8, (float)d2);
/*  24 */     e();
/*  25 */     return this;
/*     */   }
/*     */ 
/*     */   
/*     */   default dfq a(int ☃, int i, int j, int k) {
/*  30 */     dfs dfs = i();
/*  31 */     if (dfs.b() != dfs.b.c) {
/*  32 */       return this;
/*     */     }
/*     */     
/*  35 */     if (dfs.a() != dfs.a.b) {
/*  36 */       throw new IllegalStateException();
/*     */     }
/*  38 */     a(0, (byte)☃);
/*  39 */     a(1, (byte)i);
/*  40 */     a(2, (byte)j);
/*  41 */     a(3, (byte)k);
/*  42 */     e();
/*  43 */     return this;
/*     */   }
/*     */ 
/*     */   
/*     */   default dfq a(float ☃, float f1) {
/*  48 */     dfs dfs = i();
/*  49 */     if (dfs.b() != dfs.b.d || dfs.c() != 0) {
/*  50 */       return this;
/*     */     }
/*  52 */     if (dfs.a() != dfs.a.a) {
/*  53 */       throw new IllegalStateException();
/*     */     }
/*  55 */     a(0, ☃);
/*  56 */     a(4, f1);
/*  57 */     e();
/*  58 */     return this;
/*     */   }
/*     */ 
/*     */   
/*     */   default dfq a(int ☃, int i) {
/*  63 */     return a((short)☃, (short)i, 1);
/*     */   }
/*     */ 
/*     */   
/*     */   default dfq b(int ☃, int i) {
/*  68 */     return a((short)☃, (short)i, 2);
/*     */   }
/*     */ 
/*     */   
/*     */   default dfq a(short ☃, short s1, int i) {
/*  73 */     dfs dfs = i();
/*  74 */     if (dfs.b() != dfs.b.d || dfs.c() != i) {
/*  75 */       return this;
/*     */     }
/*  77 */     if (dfs.a() != dfs.a.e) {
/*  78 */       throw new IllegalStateException();
/*     */     }
/*  80 */     a(0, ☃);
/*  81 */     a(2, s1);
/*  82 */     e();
/*  83 */     return this;
/*     */   }
/*     */ 
/*     */   
/*     */   default dfq b(float ☃, float f1, float f2) {
/*  88 */     dfs dfs = i();
/*  89 */     if (dfs.b() != dfs.b.b) {
/*  90 */       return this;
/*     */     }
/*  92 */     if (dfs.a() != dfs.a.c) {
/*  93 */       throw new IllegalStateException();
/*     */     }
/*  95 */     a(0, a(☃));
/*  96 */     a(1, a(f1));
/*  97 */     a(2, a(f2));
/*  98 */     e();
/*  99 */     return this;
/*     */   }
/*     */   
/*     */   static byte a(float ☃) {
/* 103 */     return (byte)((int)(afm.a(☃, -1.0F, 1.0F) * 127.0F) & 0xFF);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dfj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */