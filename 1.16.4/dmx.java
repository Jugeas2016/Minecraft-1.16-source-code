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
/*     */ public class dmx
/*     */   extends ejq
/*     */ {
/*     */   private final vk d;
/*     */   private final eao e;
/*     */   private final eao f;
/*     */   private final boolean g;
/*     */   private final a h;
/*     */   
/*     */   public dmx(vk ☃, boolean bool) {
/*  24 */     this.d = ☃;
/*  25 */     this.g = bool;
/*  26 */     this.h = new a(0, 0, 256, 256);
/*  27 */     dex.a(bool ? det.b.a : det.b.e, b(), 256, 256);
/*  28 */     this.e = eao.p(☃);
/*  29 */     this.f = eao.q(☃);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(ach ☃) {}
/*     */ 
/*     */ 
/*     */   
/*     */   public void close() {
/*  39 */     c();
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public dmz a(dec ☃) {
/*  44 */     if (☃.f() != this.g) {
/*  45 */       return null;
/*     */     }
/*     */     
/*  48 */     a a1 = this.h.a(☃);
/*     */     
/*  50 */     if (a1 != null) {
/*  51 */       d();
/*  52 */       ☃.a(a.a(a1), a.b(a1));
/*     */       
/*  54 */       float f1 = 256.0F;
/*  55 */       float f2 = 256.0F;
/*     */ 
/*     */ 
/*     */       
/*  59 */       float f3 = 0.01F;
/*     */       
/*  61 */       return new dmz(this.e, this.f, (
/*  62 */           a.a(a1) + 0.01F) / 256.0F, (
/*  63 */           a.a(a1) - 0.01F + ☃.d()) / 256.0F, (
/*  64 */           a.b(a1) + 0.01F) / 256.0F, (
/*  65 */           a.b(a1) - 0.01F + ☃.e()) / 256.0F, ☃
/*     */           
/*  67 */           .h(), ☃
/*  68 */           .i(), ☃
/*  69 */           .j(), ☃
/*  70 */           .k());
/*     */     } 
/*     */ 
/*     */     
/*  74 */     return null;
/*     */   }
/*     */   
/*     */   public vk a() {
/*  78 */     return this.d;
/*     */   }
/*     */   
/*     */   static class a {
/*     */     private final int a;
/*     */     private final int b;
/*     */     private final int c;
/*     */     private final int d;
/*     */     private a e;
/*     */     private a f;
/*     */     private boolean g;
/*     */     
/*     */     private a(int ☃, int i, int j, int k) {
/*  91 */       this.a = ☃;
/*  92 */       this.b = i;
/*  93 */       this.c = j;
/*  94 */       this.d = k;
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     a a(dec ☃) {
/*  99 */       if (this.e != null && this.f != null) {
/* 100 */         a a1 = this.e.a(☃);
/* 101 */         if (a1 == null) {
/* 102 */           a1 = this.f.a(☃);
/*     */         }
/* 104 */         return a1;
/*     */       } 
/*     */       
/* 107 */       if (this.g) {
/* 108 */         return null;
/*     */       }
/* 110 */       int i = ☃.d();
/* 111 */       int j = ☃.e();
/*     */       
/* 113 */       if (i > this.c || j > this.d) {
/* 114 */         return null;
/*     */       }
/* 116 */       if (i == this.c && j == this.d) {
/* 117 */         this.g = true;
/* 118 */         return this;
/*     */       } 
/*     */       
/* 121 */       int k = this.c - i;
/* 122 */       int m = this.d - j;
/*     */       
/* 124 */       if (k > m) {
/* 125 */         this.e = new a(this.a, this.b, i, this.d);
/* 126 */         this.f = new a(this.a + i + 1, this.b, this.c - i - 1, this.d);
/*     */       } else {
/* 128 */         this.e = new a(this.a, this.b, this.c, j);
/* 129 */         this.f = new a(this.a, this.b + j + 1, this.c, this.d - j - 1);
/*     */       } 
/* 131 */       return this.e.a(☃);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dmx.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */