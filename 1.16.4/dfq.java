/*     */ import java.nio.ByteBuffer;
/*     */ import java.nio.IntBuffer;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
/*     */ import org.lwjgl.system.MemoryStack;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public interface dfq
/*     */ {
/*  17 */   public static final Logger f = LogManager.getLogger();
/*     */   
/*     */   dfq a(double paramDouble1, double paramDouble2, double paramDouble3);
/*     */   
/*     */   dfq a(int paramInt1, int paramInt2, int paramInt3, int paramInt4);
/*     */   
/*     */   dfq a(float paramFloat1, float paramFloat2);
/*     */   
/*     */   dfq a(int paramInt1, int paramInt2);
/*     */   
/*     */   dfq b(int paramInt1, int paramInt2);
/*     */   
/*     */   dfq b(float paramFloat1, float paramFloat2, float paramFloat3);
/*     */   
/*     */   void d();
/*     */   
/*     */   default void a(float ☃, float f1, float f2, float f3, float f4, float f5, float f6, float f7, float f8, int i, int j, float f9, float f10, float f11) {
/*  34 */     a(☃, f1, f2);
/*  35 */     a(f3, f4, f5, f6);
/*  36 */     a(f7, f8);
/*  37 */     b(i);
/*  38 */     a(j);
/*  39 */     b(f9, f10, f11);
/*  40 */     d();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   default dfq a(float ☃, float f1, float f2, float f3) {
/*  51 */     return a((int)(☃ * 255.0F), (int)(f1 * 255.0F), (int)(f2 * 255.0F), (int)(f3 * 255.0F));
/*     */   }
/*     */   
/*     */   default dfq a(int ☃) {
/*  55 */     return b(☃ & 0xFFFF, ☃ >> 16 & 0xFFFF);
/*     */   }
/*     */   
/*     */   default dfq b(int ☃) {
/*  59 */     return a(☃ & 0xFFFF, ☃ >> 16 & 0xFFFF);
/*     */   }
/*     */   
/*     */   default void a(dfm.a ☃, eba eba1, float f1, float f2, float f3, int i, int j) {
/*  63 */     a(☃, eba1, new float[] { 1.0F, 1.0F, 1.0F, 1.0F }, f1, f2, f3, new int[] { i, i, i, i }, j, false);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   default void a(dfm.a ☃, eba eba1, float[] arrayOfFloat, float f1, float f2, float f3, int[] arrayOfInt, int i, boolean bool) {
/*  70 */     int[] arrayOfInt1 = eba1.b();
/*  71 */     gr gr = eba1.e().p();
/*  72 */     g g = new g(gr.u(), gr.v(), gr.w());
/*     */     
/*  74 */     b b = ☃.a();
/*  75 */     g.a(☃.b());
/*     */     
/*  77 */     int j = 8;
/*  78 */     int k = arrayOfInt1.length / 8;
/*     */     
/*  80 */     try (MemoryStack ☃ = MemoryStack.stackPush()) {
/*  81 */       ByteBuffer byteBuffer = memoryStack.malloc(dfk.h.b());
/*  82 */       IntBuffer intBuffer = byteBuffer.asIntBuffer();
/*     */       
/*  84 */       for (int m = 0; m < k; m++) {
/*  85 */         float f7, f8, f9; intBuffer.clear();
/*  86 */         intBuffer.put(arrayOfInt1, m * 8, 8);
/*     */         
/*  88 */         float f4 = byteBuffer.getFloat(0);
/*  89 */         float f5 = byteBuffer.getFloat(4);
/*  90 */         float f6 = byteBuffer.getFloat(8);
/*     */ 
/*     */ 
/*     */ 
/*     */         
/*  95 */         if (bool) {
/*  96 */           float f12 = (byteBuffer.get(12) & 0xFF) / 255.0F;
/*  97 */           float f13 = (byteBuffer.get(13) & 0xFF) / 255.0F;
/*  98 */           float f14 = (byteBuffer.get(14) & 0xFF) / 255.0F;
/*     */           
/* 100 */           f7 = f12 * arrayOfFloat[m] * f1;
/* 101 */           f8 = f13 * arrayOfFloat[m] * f2;
/* 102 */           f9 = f14 * arrayOfFloat[m] * f3;
/*     */         } else {
/* 104 */           f7 = arrayOfFloat[m] * f1;
/* 105 */           f8 = arrayOfFloat[m] * f2;
/* 106 */           f9 = arrayOfFloat[m] * f3;
/*     */         } 
/*     */         
/* 109 */         int n = arrayOfInt[m];
/* 110 */         float f10 = byteBuffer.getFloat(16);
/* 111 */         float f11 = byteBuffer.getFloat(20);
/*     */         
/* 113 */         h h = new h(f4, f5, f6, 1.0F);
/* 114 */         h.a(b);
/*     */         
/* 116 */         a(h.a(), h.b(), h.c(), f7, f8, f9, 1.0F, f10, f11, i, n, g.a(), g.b(), g.c());
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   default dfq a(b ☃, float f1, float f2, float f3) {
/* 122 */     h h = new h(f1, f2, f3, 1.0F);
/* 123 */     h.a(☃);
/* 124 */     return a(h.a(), h.b(), h.c());
/*     */   }
/*     */   
/*     */   default dfq a(a ☃, float f1, float f2, float f3) {
/* 128 */     g g = new g(f1, f2, f3);
/* 129 */     g.a(☃);
/* 130 */     return b(g.a(), g.b(), g.c());
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dfq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */