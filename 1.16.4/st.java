/*     */ import java.io.IOException;
/*     */ 
/*     */ 
/*     */ public class st
/*     */   implements oj<sa>
/*     */ {
/*     */   protected double a;
/*     */   protected double b;
/*     */   protected double c;
/*     */   protected float d;
/*     */   protected float e;
/*     */   protected boolean f;
/*     */   protected boolean g;
/*     */   protected boolean h;
/*     */   
/*     */   public static class b
/*     */     extends st
/*     */   {
/*     */     public b() {
/*  20 */       this.g = true;
/*  21 */       this.h = true;
/*     */     }
/*     */     
/*     */     public b(double ☃, double d1, double d2, float f1, float f2, boolean bool) {
/*  25 */       this.a = ☃;
/*  26 */       this.b = d1;
/*  27 */       this.c = d2;
/*  28 */       this.d = f1;
/*  29 */       this.e = f2;
/*  30 */       this.f = bool;
/*  31 */       this.h = true;
/*  32 */       this.g = true;
/*     */     }
/*     */ 
/*     */     
/*     */     public void a(nf ☃) throws IOException {
/*  37 */       this.a = ☃.readDouble();
/*  38 */       this.b = ☃.readDouble();
/*  39 */       this.c = ☃.readDouble();
/*  40 */       this.d = ☃.readFloat();
/*  41 */       this.e = ☃.readFloat();
/*  42 */       super.a(☃);
/*     */     }
/*     */ 
/*     */     
/*     */     public void b(nf ☃) throws IOException {
/*  47 */       ☃.writeDouble(this.a);
/*  48 */       ☃.writeDouble(this.b);
/*  49 */       ☃.writeDouble(this.c);
/*  50 */       ☃.writeFloat(this.d);
/*  51 */       ☃.writeFloat(this.e);
/*  52 */       super.b(☃);
/*     */     }
/*     */   }
/*     */   
/*     */   public static class a extends st {
/*     */     public a() {
/*  58 */       this.g = true;
/*     */     }
/*     */     
/*     */     public a(double ☃, double d1, double d2, boolean bool) {
/*  62 */       this.a = ☃;
/*  63 */       this.b = d1;
/*  64 */       this.c = d2;
/*  65 */       this.f = bool;
/*  66 */       this.g = true;
/*     */     }
/*     */ 
/*     */     
/*     */     public void a(nf ☃) throws IOException {
/*  71 */       this.a = ☃.readDouble();
/*  72 */       this.b = ☃.readDouble();
/*  73 */       this.c = ☃.readDouble();
/*  74 */       super.a(☃);
/*     */     }
/*     */ 
/*     */     
/*     */     public void b(nf ☃) throws IOException {
/*  79 */       ☃.writeDouble(this.a);
/*  80 */       ☃.writeDouble(this.b);
/*  81 */       ☃.writeDouble(this.c);
/*  82 */       super.b(☃);
/*     */     }
/*     */   }
/*     */   
/*     */   public static class c extends st {
/*     */     public c() {
/*  88 */       this.h = true;
/*     */     }
/*     */     
/*     */     public c(float ☃, float f1, boolean bool) {
/*  92 */       this.d = ☃;
/*  93 */       this.e = f1;
/*  94 */       this.f = bool;
/*  95 */       this.h = true;
/*     */     }
/*     */ 
/*     */     
/*     */     public void a(nf ☃) throws IOException {
/* 100 */       this.d = ☃.readFloat();
/* 101 */       this.e = ☃.readFloat();
/* 102 */       super.a(☃);
/*     */     }
/*     */ 
/*     */     
/*     */     public void b(nf ☃) throws IOException {
/* 107 */       ☃.writeFloat(this.d);
/* 108 */       ☃.writeFloat(this.e);
/* 109 */       super.b(☃);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public st() {}
/*     */   
/*     */   public st(boolean ☃) {
/* 117 */     this.f = ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(sa ☃) {
/* 122 */     ☃.a(this);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(nf ☃) throws IOException {
/* 127 */     this.f = (☃.readUnsignedByte() != 0);
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(nf ☃) throws IOException {
/* 132 */     ☃.writeByte(this.f ? 1 : 0);
/*     */   }
/*     */   
/*     */   public double a(double ☃) {
/* 136 */     return this.g ? this.a : ☃;
/*     */   }
/*     */   
/*     */   public double b(double ☃) {
/* 140 */     return this.g ? this.b : ☃;
/*     */   }
/*     */   
/*     */   public double c(double ☃) {
/* 144 */     return this.g ? this.c : ☃;
/*     */   }
/*     */   
/*     */   public float a(float ☃) {
/* 148 */     return this.h ? this.d : ☃;
/*     */   }
/*     */   
/*     */   public float b(float ☃) {
/* 152 */     return this.h ? this.e : ☃;
/*     */   }
/*     */   
/*     */   public boolean b() {
/* 156 */     return this.f;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\st.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */