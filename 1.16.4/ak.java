/*     */ import com.google.common.collect.Lists;
/*     */ import java.util.List;
/*     */ import javax.annotation.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ak
/*     */ {
/*     */   private final y a;
/*     */   private final ak b;
/*     */   private final ak c;
/*     */   private final int d;
/*  13 */   private final List<ak> e = Lists.newArrayList();
/*     */   private ak f;
/*     */   private ak g;
/*     */   private int h;
/*     */   private float i;
/*     */   private float j;
/*     */   private float k;
/*     */   private float l;
/*     */   
/*     */   public ak(y ☃, @Nullable ak ak1, @Nullable ak ak2, int i, int j) {
/*  23 */     if (☃.c() == null) {
/*  24 */       throw new IllegalArgumentException("Can't position an invisible advancement!");
/*     */     }
/*  26 */     this.a = ☃;
/*  27 */     this.b = ak1;
/*  28 */     this.c = ak2;
/*  29 */     this.d = i;
/*  30 */     this.f = this;
/*  31 */     this.h = j;
/*  32 */     this.i = -1.0F;
/*     */     
/*  34 */     ak ak3 = null;
/*  35 */     for (y y1 : ☃.e()) {
/*  36 */       ak3 = a(y1, ak3);
/*     */     }
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   private ak a(y ☃, @Nullable ak ak1) {
/*  42 */     if (☃.c() != null) {
/*  43 */       ak1 = new ak(☃, this, ak1, this.e.size() + 1, this.h + 1);
/*  44 */       this.e.add(ak1);
/*     */     } else {
/*  46 */       for (y y1 : ☃.e()) {
/*  47 */         ak1 = a(y1, ak1);
/*     */       }
/*     */     } 
/*  50 */     return ak1;
/*     */   }
/*     */   
/*     */   private void a() {
/*  54 */     if (this.e.isEmpty()) {
/*  55 */       if (this.c != null) {
/*  56 */         this.c.i++;
/*     */       } else {
/*  58 */         this.i = 0.0F;
/*     */       } 
/*     */       
/*     */       return;
/*     */     } 
/*  63 */     ak ☃ = null;
/*  64 */     for (ak ak1 : this.e) {
/*  65 */       ak1.a();
/*  66 */       ☃ = ak1.a((☃ == null) ? ak1 : ☃);
/*     */     } 
/*  68 */     b();
/*     */     
/*  70 */     float f = (((ak)this.e.get(0)).i + ((ak)this.e.get(this.e.size() - 1)).i) / 2.0F;
/*  71 */     if (this.c != null) {
/*  72 */       this.c.i++;
/*  73 */       this.j = this.i - f;
/*     */     } else {
/*  75 */       this.i = f;
/*     */     } 
/*     */   }
/*     */   
/*     */   private float a(float ☃, int i, float f1) {
/*  80 */     this.i += ☃;
/*  81 */     this.h = i;
/*     */     
/*  83 */     if (this.i < f1) {
/*  84 */       f1 = this.i;
/*     */     }
/*     */     
/*  87 */     for (ak ak1 : this.e) {
/*  88 */       f1 = ak1.a(☃ + this.j, i + 1, f1);
/*     */     }
/*     */     
/*  91 */     return f1;
/*     */   }
/*     */   
/*     */   private void a(float ☃) {
/*  95 */     this.i += ☃;
/*  96 */     for (ak ak1 : this.e) {
/*  97 */       ak1.a(☃);
/*     */     }
/*     */   }
/*     */   
/*     */   private void b() {
/* 102 */     float ☃ = 0.0F;
/* 103 */     float f1 = 0.0F;
/* 104 */     for (int i = this.e.size() - 1; i >= 0; i--) {
/* 105 */       ak ak1 = this.e.get(i);
/* 106 */       ak1.i += ☃;
/* 107 */       ak1.j += ☃;
/* 108 */       f1 += ak1.k;
/* 109 */       ☃ += ak1.l + f1;
/*     */     } 
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   private ak c() {
/* 115 */     if (this.g != null) {
/* 116 */       return this.g;
/*     */     }
/* 118 */     if (!this.e.isEmpty()) {
/* 119 */       return this.e.get(0);
/*     */     }
/* 121 */     return null;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   private ak d() {
/* 126 */     if (this.g != null) {
/* 127 */       return this.g;
/*     */     }
/* 129 */     if (!this.e.isEmpty()) {
/* 130 */       return this.e.get(this.e.size() - 1);
/*     */     }
/* 132 */     return null;
/*     */   }
/*     */   
/*     */   private ak a(ak ☃) {
/* 136 */     if (this.c == null) {
/* 137 */       return ☃;
/*     */     }
/*     */ 
/*     */ 
/*     */     
/* 142 */     ak ak1 = this;
/* 143 */     ak ak2 = this;
/* 144 */     ak ak3 = this.c;
/* 145 */     ak ak4 = this.b.e.get(0);
/* 146 */     float f1 = this.j;
/* 147 */     float f2 = this.j;
/* 148 */     float f3 = ak3.j;
/* 149 */     float f4 = ak4.j;
/*     */     
/* 151 */     while (ak3.d() != null && ak1.c() != null) {
/* 152 */       ak3 = ak3.d();
/* 153 */       ak1 = ak1.c();
/* 154 */       ak4 = ak4.c();
/* 155 */       ak2 = ak2.d();
/* 156 */       ak2.f = this;
/* 157 */       float f = ak3.i + f3 - ak1.i + f1 + 1.0F;
/* 158 */       if (f > 0.0F) {
/* 159 */         ak3.a(this, ☃).a(this, f);
/* 160 */         f1 += f;
/* 161 */         f2 += f;
/*     */       } 
/* 163 */       f3 += ak3.j;
/* 164 */       f1 += ak1.j;
/* 165 */       f4 += ak4.j;
/* 166 */       f2 += ak2.j;
/*     */     } 
/* 168 */     if (ak3.d() != null && ak2.d() == null) {
/* 169 */       ak2.g = ak3.d();
/* 170 */       ak2.j += f3 - f2;
/*     */     } else {
/* 172 */       if (ak1.c() != null && ak4.c() == null) {
/* 173 */         ak4.g = ak1.c();
/* 174 */         ak4.j += f1 - f4;
/*     */       } 
/* 176 */       ☃ = this;
/*     */     } 
/*     */     
/* 179 */     return ☃;
/*     */   }
/*     */   
/*     */   private void a(ak ☃, float f) {
/* 183 */     float f1 = (☃.d - this.d);
/* 184 */     if (f1 != 0.0F) {
/* 185 */       ☃.k -= f / f1;
/* 186 */       this.k += f / f1;
/*     */     } 
/* 188 */     ☃.l += f;
/* 189 */     ☃.i += f;
/* 190 */     ☃.j += f;
/*     */   }
/*     */   
/*     */   private ak a(ak ☃, ak ak1) {
/* 194 */     if (this.f != null && ☃.b.e.contains(this.f)) {
/* 195 */       return this.f;
/*     */     }
/* 197 */     return ak1;
/*     */   }
/*     */ 
/*     */   
/*     */   private void e() {
/* 202 */     if (this.a.c() != null) {
/* 203 */       this.a.c().a(this.h, this.i);
/*     */     }
/*     */     
/* 206 */     if (!this.e.isEmpty()) {
/* 207 */       for (ak ☃ : this.e) {
/* 208 */         ☃.e();
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public static void a(y ☃) {
/* 214 */     if (☃.c() == null) {
/* 215 */       throw new IllegalArgumentException("Can't position children of an invisible root!");
/*     */     }
/* 217 */     ak ak1 = new ak(☃, null, null, 1, 0);
/* 218 */     ak1.a();
/* 219 */     float f = ak1.a(0.0F, 0, ak1.i);
/* 220 */     if (f < 0.0F) {
/* 221 */       ak1.a(-f);
/*     */     }
/* 223 */     ak1.e();
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ak.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */