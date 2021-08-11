/*     */ import javax.annotation.Nullable;
/*     */ 
/*     */ public class cxu {
/*     */   private final a a;
/*     */   private byte b;
/*     */   private byte c;
/*     */   private byte d;
/*     */   private final nr e;
/*     */   
/*     */   public enum a {
/*  11 */     a(false),
/*  12 */     b(true),
/*  13 */     c(false),
/*  14 */     d(false),
/*  15 */     e(true),
/*  16 */     f(true),
/*  17 */     g(false),
/*  18 */     h(false),
/*  19 */     i(true, 5393476),
/*  20 */     j(true, 3830373),
/*  21 */     k(true),
/*  22 */     l(true),
/*  23 */     m(true),
/*  24 */     n(true),
/*  25 */     o(true),
/*  26 */     p(true),
/*  27 */     q(true),
/*  28 */     r(true),
/*  29 */     s(true),
/*  30 */     t(true),
/*  31 */     u(true),
/*  32 */     v(true),
/*  33 */     w(true),
/*  34 */     x(true),
/*  35 */     y(true),
/*  36 */     z(true),
/*  37 */     A(true);
/*     */ 
/*     */     
/*     */     private final byte B;
/*     */ 
/*     */     
/*     */     private final boolean C;
/*     */     
/*     */     private final int D;
/*     */ 
/*     */     
/*     */     a(boolean ☃, int i) {
/*  49 */       this.B = (byte)ordinal();
/*  50 */       this.C = ☃;
/*  51 */       this.D = i;
/*     */     }
/*     */     
/*     */     public byte a() {
/*  55 */       return this.B;
/*     */     }
/*     */     
/*     */     public boolean b() {
/*  59 */       return this.C;
/*     */     }
/*     */     
/*     */     public boolean c() {
/*  63 */       return (this.D >= 0);
/*     */     }
/*     */     
/*     */     public int d() {
/*  67 */       return this.D;
/*     */     }
/*     */     
/*     */     public static a a(byte ☃) {
/*  71 */       return values()[afm.a(☃, 0, (values()).length - 1)];
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public cxu(a ☃, byte b1, byte b2, byte b3, @Nullable nr nr1) {
/*  82 */     this.a = ☃;
/*  83 */     this.b = b1;
/*  84 */     this.c = b2;
/*  85 */     this.d = b3;
/*  86 */     this.e = nr1;
/*     */   }
/*     */   
/*     */   public byte a() {
/*  90 */     return this.a.a();
/*     */   }
/*     */   
/*     */   public a b() {
/*  94 */     return this.a;
/*     */   }
/*     */   
/*     */   public byte c() {
/*  98 */     return this.b;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public byte d() {
/* 106 */     return this.c;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public byte e() {
/* 114 */     return this.d;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean f() {
/* 122 */     return this.a.b();
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public nr g() {
/* 127 */     return this.e;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean equals(Object ☃) {
/* 132 */     if (this == ☃) {
/* 133 */       return true;
/*     */     }
/* 135 */     if (!(☃ instanceof cxu)) {
/* 136 */       return false;
/*     */     }
/*     */     
/* 139 */     cxu cxu1 = (cxu)☃;
/*     */     
/* 141 */     if (this.a != cxu1.a) {
/* 142 */       return false;
/*     */     }
/* 144 */     if (this.d != cxu1.d) {
/* 145 */       return false;
/*     */     }
/* 147 */     if (this.b != cxu1.b) {
/* 148 */       return false;
/*     */     }
/* 150 */     if (this.c != cxu1.c) {
/* 151 */       return false;
/*     */     }
/* 153 */     if (!Objects.equals(this.e, cxu1.e)) {
/* 154 */       return false;
/*     */     }
/*     */     
/* 157 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public int hashCode() {
/* 162 */     int ☃ = this.a.a();
/* 163 */     ☃ = 31 * ☃ + this.b;
/* 164 */     ☃ = 31 * ☃ + this.c;
/* 165 */     ☃ = 31 * ☃ + this.d;
/* 166 */     ☃ = 31 * ☃ + Objects.hashCode(this.e);
/* 167 */     return ☃;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cxu.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */