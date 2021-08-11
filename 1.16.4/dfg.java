/*     */ import com.mojang.blaze3d.systems.RenderSystem;
/*     */ import java.nio.FloatBuffer;
/*     */ import java.nio.IntBuffer;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
/*     */ import org.lwjgl.system.MemoryUtil;
/*     */ 
/*     */ 
/*     */ 
/*     */ public class dfg
/*     */   extends dfb
/*     */   implements AutoCloseable
/*     */ {
/*  14 */   private static final Logger a = LogManager.getLogger();
/*     */ 
/*     */ 
/*     */   
/*     */   private int b;
/*     */ 
/*     */ 
/*     */   
/*     */   private final int c;
/*     */ 
/*     */   
/*     */   private final int d;
/*     */ 
/*     */   
/*     */   private final IntBuffer e;
/*     */ 
/*     */   
/*     */   private final FloatBuffer f;
/*     */ 
/*     */   
/*     */   private final String g;
/*     */ 
/*     */   
/*     */   private boolean h;
/*     */ 
/*     */   
/*     */   private final dfd i;
/*     */ 
/*     */ 
/*     */   
/*     */   public dfg(String ☃, int i, int j, dfd dfd1) {
/*  45 */     this.g = ☃;
/*  46 */     this.c = j;
/*  47 */     this.d = i;
/*  48 */     this.i = dfd1;
/*  49 */     if (i <= 3) {
/*  50 */       this.e = MemoryUtil.memAllocInt(j);
/*  51 */       this.f = null;
/*     */     } else {
/*  53 */       this.e = null;
/*  54 */       this.f = MemoryUtil.memAllocFloat(j);
/*     */     } 
/*  56 */     this.b = -1;
/*  57 */     c();
/*     */   }
/*     */   
/*     */   public static int a(int ☃, CharSequence charSequence) {
/*  61 */     return dem.b(☃, charSequence);
/*     */   }
/*     */   
/*     */   public static void a(int ☃, int i) {
/*  65 */     RenderSystem.glUniform1i(☃, i);
/*     */   }
/*     */   
/*     */   public static int b(int ☃, CharSequence charSequence) {
/*  69 */     return dem.c(☃, charSequence);
/*     */   }
/*     */ 
/*     */   
/*     */   public void close() {
/*  74 */     if (this.e != null) {
/*  75 */       MemoryUtil.memFree(this.e);
/*     */     }
/*  77 */     if (this.f != null) {
/*  78 */       MemoryUtil.memFree(this.f);
/*     */     }
/*     */   }
/*     */   
/*     */   private void c() {
/*  83 */     this.h = true;
/*  84 */     if (this.i != null) {
/*  85 */       this.i.b();
/*     */     }
/*     */   }
/*     */   
/*     */   public static int a(String ☃) {
/*  90 */     int i = -1;
/*     */     
/*  92 */     if ("int".equals(☃)) {
/*  93 */       i = 0;
/*  94 */     } else if ("float".equals(☃)) {
/*  95 */       i = 4;
/*  96 */     } else if (☃.startsWith("matrix")) {
/*  97 */       if (☃.endsWith("2x2")) {
/*  98 */         i = 8;
/*  99 */       } else if (☃.endsWith("3x3")) {
/* 100 */         i = 9;
/* 101 */       } else if (☃.endsWith("4x4")) {
/* 102 */         i = 10;
/*     */       } 
/*     */     } 
/*     */     
/* 106 */     return i;
/*     */   }
/*     */   
/*     */   public void a(int ☃) {
/* 110 */     this.b = ☃;
/*     */   }
/*     */   
/*     */   public String a() {
/* 114 */     return this.g;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(float ☃) {
/* 119 */     this.f.position(0);
/* 120 */     this.f.put(0, ☃);
/* 121 */     c();
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(float ☃, float f1) {
/* 126 */     this.f.position(0);
/* 127 */     this.f.put(0, ☃);
/* 128 */     this.f.put(1, f1);
/* 129 */     c();
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
/*     */ 
/*     */   
/*     */   public void a(float ☃, float f1, float f2) {
/* 147 */     this.f.position(0);
/* 148 */     this.f.put(0, ☃);
/* 149 */     this.f.put(1, f1);
/* 150 */     this.f.put(2, f2);
/* 151 */     c();
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
/*     */   public void a(float ☃, float f1, float f2, float f3) {
/* 164 */     this.f.position(0);
/* 165 */     this.f.put(☃);
/* 166 */     this.f.put(f1);
/* 167 */     this.f.put(f2);
/* 168 */     this.f.put(f3);
/* 169 */     this.f.flip();
/* 170 */     c();
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
/*     */   public void b(float ☃, float f1, float f2, float f3) {
/* 184 */     this.f.position(0);
/* 185 */     if (this.d >= 4) {
/* 186 */       this.f.put(0, ☃);
/*     */     }
/* 188 */     if (this.d >= 5) {
/* 189 */       this.f.put(1, f1);
/*     */     }
/* 191 */     if (this.d >= 6) {
/* 192 */       this.f.put(2, f2);
/*     */     }
/* 194 */     if (this.d >= 7) {
/* 195 */       this.f.put(3, f3);
/*     */     }
/* 197 */     c();
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(int ☃, int i, int j, int k) {
/* 202 */     this.e.position(0);
/* 203 */     if (this.d >= 0) {
/* 204 */       this.e.put(0, ☃);
/*     */     }
/* 206 */     if (this.d >= 1) {
/* 207 */       this.e.put(1, i);
/*     */     }
/* 209 */     if (this.d >= 2) {
/* 210 */       this.e.put(2, j);
/*     */     }
/* 212 */     if (this.d >= 3) {
/* 213 */       this.e.put(3, k);
/*     */     }
/* 215 */     c();
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(float[] ☃) {
/* 254 */     if (☃.length < this.c) {
/* 255 */       a.warn("Uniform.set called with a too-small value array (expected {}, got {}). Ignoring.", Integer.valueOf(this.c), Integer.valueOf(☃.length));
/*     */       
/*     */       return;
/*     */     } 
/* 259 */     this.f.position(0);
/* 260 */     this.f.put(☃);
/* 261 */     this.f.position(0);
/* 262 */     c();
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(b ☃) {
/* 435 */     this.f.position(0);
/* 436 */     ☃.a(this.f);
/* 437 */     c();
/*     */   }
/*     */   
/*     */   public void b() {
/* 441 */     if (!this.h);
/*     */ 
/*     */ 
/*     */     
/* 445 */     this.h = false;
/*     */     
/* 447 */     if (this.d <= 3) {
/* 448 */       d();
/* 449 */     } else if (this.d <= 7) {
/* 450 */       e();
/* 451 */     } else if (this.d <= 10) {
/* 452 */       f();
/*     */     } else {
/* 454 */       a.warn("Uniform.upload called, but type value ({}) is not a valid type. Ignoring.", Integer.valueOf(this.d));
/*     */       return;
/*     */     } 
/*     */   }
/*     */   
/*     */   private void d() {
/* 460 */     this.f.clear();
/* 461 */     switch (this.d) {
/*     */       case 0:
/* 463 */         RenderSystem.glUniform1(this.b, this.e);
/*     */         return;
/*     */       case 1:
/* 466 */         RenderSystem.glUniform2(this.b, this.e);
/*     */         return;
/*     */       case 2:
/* 469 */         RenderSystem.glUniform3(this.b, this.e);
/*     */         return;
/*     */       case 3:
/* 472 */         RenderSystem.glUniform4(this.b, this.e);
/*     */         return;
/*     */     } 
/* 475 */     a.warn("Uniform.upload called, but count value ({}) is  not in the range of 1 to 4. Ignoring.", Integer.valueOf(this.c));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private void e() {
/* 481 */     this.f.clear();
/* 482 */     switch (this.d) {
/*     */       case 4:
/* 484 */         RenderSystem.glUniform1(this.b, this.f);
/*     */         return;
/*     */       case 5:
/* 487 */         RenderSystem.glUniform2(this.b, this.f);
/*     */         return;
/*     */       case 6:
/* 490 */         RenderSystem.glUniform3(this.b, this.f);
/*     */         return;
/*     */       case 7:
/* 493 */         RenderSystem.glUniform4(this.b, this.f);
/*     */         return;
/*     */     } 
/* 496 */     a.warn("Uniform.upload called, but count value ({}) is not in the range of 1 to 4. Ignoring.", Integer.valueOf(this.c));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private void f() {
/* 502 */     this.f.clear();
/* 503 */     switch (this.d) {
/*     */       case 8:
/* 505 */         RenderSystem.glUniformMatrix2(this.b, false, this.f);
/*     */         break;
/*     */       case 9:
/* 508 */         RenderSystem.glUniformMatrix3(this.b, false, this.f);
/*     */         break;
/*     */       case 10:
/* 511 */         RenderSystem.glUniformMatrix4(this.b, false, this.f);
/*     */         break;
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dfg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */