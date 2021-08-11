/*     */ import com.mojang.blaze3d.systems.RenderSystem;
/*     */ import java.util.Locale;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class dfc
/*     */ {
/*     */   private static dfc a;
/*     */   private final int b;
/*     */   private final int c;
/*     */   private final int d;
/*     */   private final int e;
/*     */   private final int f;
/*     */   private final boolean g;
/*     */   private final boolean h;
/*     */   
/*     */   private dfc(boolean ☃, boolean bool1, int i, int j, int k, int m, int n) {
/*  20 */     this.g = ☃;
/*     */     
/*  22 */     this.b = i;
/*  23 */     this.d = j;
/*     */     
/*  25 */     this.c = k;
/*  26 */     this.e = m;
/*     */     
/*  28 */     this.h = bool1;
/*  29 */     this.f = n;
/*     */   }
/*     */   
/*     */   public dfc() {
/*  33 */     this(false, true, 1, 0, 1, 0, 32774);
/*     */   }
/*     */   
/*     */   public dfc(int ☃, int i, int j) {
/*  37 */     this(false, false, ☃, i, ☃, i, j);
/*     */   }
/*     */   
/*     */   public dfc(int ☃, int i, int j, int k, int m) {
/*  41 */     this(true, false, ☃, i, j, k, m);
/*     */   }
/*     */   
/*     */   public void a() {
/*  45 */     if (equals(a)) {
/*     */       return;
/*     */     }
/*     */     
/*  49 */     if (a == null || this.h != a.b()) {
/*  50 */       a = this;
/*  51 */       if (this.h) {
/*  52 */         RenderSystem.disableBlend();
/*     */         return;
/*     */       } 
/*  55 */       RenderSystem.enableBlend();
/*     */     } 
/*     */     
/*  58 */     RenderSystem.blendEquation(this.f);
/*     */     
/*  60 */     if (this.g) {
/*  61 */       RenderSystem.blendFuncSeparate(this.b, this.d, this.c, this.e);
/*     */     } else {
/*  63 */       RenderSystem.blendFunc(this.b, this.d);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean equals(Object ☃) {
/*  69 */     if (this == ☃) {
/*  70 */       return true;
/*     */     }
/*  72 */     if (!(☃ instanceof dfc)) {
/*  73 */       return false;
/*     */     }
/*     */     
/*  76 */     dfc dfc1 = (dfc)☃;
/*     */     
/*  78 */     if (this.f != dfc1.f) {
/*  79 */       return false;
/*     */     }
/*  81 */     if (this.e != dfc1.e) {
/*  82 */       return false;
/*     */     }
/*  84 */     if (this.d != dfc1.d) {
/*  85 */       return false;
/*     */     }
/*  87 */     if (this.h != dfc1.h) {
/*  88 */       return false;
/*     */     }
/*  90 */     if (this.g != dfc1.g) {
/*  91 */       return false;
/*     */     }
/*  93 */     if (this.c != dfc1.c) {
/*  94 */       return false;
/*     */     }
/*  96 */     return (this.b == dfc1.b);
/*     */   }
/*     */ 
/*     */   
/*     */   public int hashCode() {
/* 101 */     int ☃ = this.b;
/* 102 */     ☃ = 31 * ☃ + this.c;
/* 103 */     ☃ = 31 * ☃ + this.d;
/* 104 */     ☃ = 31 * ☃ + this.e;
/* 105 */     ☃ = 31 * ☃ + this.f;
/* 106 */     ☃ = 31 * ☃ + (this.g ? 1 : 0);
/* 107 */     ☃ = 31 * ☃ + (this.h ? 1 : 0);
/* 108 */     return ☃;
/*     */   }
/*     */   
/*     */   public boolean b() {
/* 112 */     return this.h;
/*     */   }
/*     */   
/*     */   public static int a(String ☃) {
/* 116 */     String str = ☃.trim().toLowerCase(Locale.ROOT);
/*     */     
/* 118 */     if ("add".equals(str))
/* 119 */       return 32774; 
/* 120 */     if ("subtract".equals(str))
/* 121 */       return 32778; 
/* 122 */     if ("reversesubtract".equals(str))
/* 123 */       return 32779; 
/* 124 */     if ("reverse_subtract".equals(str))
/* 125 */       return 32779; 
/* 126 */     if ("min".equals(str))
/* 127 */       return 32775; 
/* 128 */     if ("max".equals(str)) {
/* 129 */       return 32776;
/*     */     }
/*     */     
/* 132 */     return 32774;
/*     */   }
/*     */   
/*     */   public static int b(String ☃) {
/* 136 */     String str = ☃.trim().toLowerCase(Locale.ROOT);
/* 137 */     str = str.replaceAll("_", "");
/* 138 */     str = str.replaceAll("one", "1");
/* 139 */     str = str.replaceAll("zero", "0");
/* 140 */     str = str.replaceAll("minus", "-");
/*     */     
/* 142 */     if ("0".equals(str))
/* 143 */       return 0; 
/* 144 */     if ("1".equals(str))
/* 145 */       return 1; 
/* 146 */     if ("srccolor".equals(str))
/* 147 */       return 768; 
/* 148 */     if ("1-srccolor".equals(str))
/* 149 */       return 769; 
/* 150 */     if ("dstcolor".equals(str))
/* 151 */       return 774; 
/* 152 */     if ("1-dstcolor".equals(str))
/* 153 */       return 775; 
/* 154 */     if ("srcalpha".equals(str))
/* 155 */       return 770; 
/* 156 */     if ("1-srcalpha".equals(str))
/* 157 */       return 771; 
/* 158 */     if ("dstalpha".equals(str))
/* 159 */       return 772; 
/* 160 */     if ("1-dstalpha".equals(str)) {
/* 161 */       return 773;
/*     */     }
/* 163 */     return -1;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dfc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */