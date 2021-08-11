/*     */ import java.io.IOException;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class pv
/*     */   implements oj<om>
/*     */ {
/*     */   private double a;
/*     */   private double b;
/*     */   private double c;
/*     */   private float d;
/*     */   private float e;
/*     */   private float f;
/*     */   private float g;
/*     */   private int h;
/*     */   private boolean i;
/*     */   private hf j;
/*     */   
/*     */   public pv() {}
/*     */   
/*     */   public <T extends hf> pv(T ☃, boolean bool, double d1, double d2, double d3, float f1, float f2, float f3, float f4, int i) {
/*  29 */     this.j = (hf)☃;
/*  30 */     this.i = bool;
/*  31 */     this.a = d1;
/*  32 */     this.b = d2;
/*  33 */     this.c = d3;
/*  34 */     this.d = f1;
/*  35 */     this.e = f2;
/*  36 */     this.f = f3;
/*  37 */     this.g = f4;
/*  38 */     this.h = i;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(nf ☃) throws IOException {
/*  43 */     hg<?> hg = gm.V.a(☃.readInt());
/*  44 */     if (hg == null) {
/*  45 */       hg = hh.c;
/*     */     }
/*  47 */     this.i = ☃.readBoolean();
/*  48 */     this.a = ☃.readDouble();
/*  49 */     this.b = ☃.readDouble();
/*  50 */     this.c = ☃.readDouble();
/*  51 */     this.d = ☃.readFloat();
/*  52 */     this.e = ☃.readFloat();
/*  53 */     this.f = ☃.readFloat();
/*  54 */     this.g = ☃.readFloat();
/*  55 */     this.h = ☃.readInt();
/*  56 */     this.j = a(☃, hg);
/*     */   }
/*     */   
/*     */   private <T extends hf> T a(nf ☃, hg<T> hg1) {
/*  60 */     return hg1.d().b(hg1, ☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(nf ☃) throws IOException {
/*  65 */     ☃.writeInt(gm.V.a(this.j.b()));
/*  66 */     ☃.writeBoolean(this.i);
/*  67 */     ☃.writeDouble(this.a);
/*  68 */     ☃.writeDouble(this.b);
/*  69 */     ☃.writeDouble(this.c);
/*  70 */     ☃.writeFloat(this.d);
/*  71 */     ☃.writeFloat(this.e);
/*  72 */     ☃.writeFloat(this.f);
/*  73 */     ☃.writeFloat(this.g);
/*  74 */     ☃.writeInt(this.h);
/*  75 */     this.j.a(☃);
/*     */   }
/*     */   
/*     */   public boolean b() {
/*  79 */     return this.i;
/*     */   }
/*     */   
/*     */   public double c() {
/*  83 */     return this.a;
/*     */   }
/*     */   
/*     */   public double d() {
/*  87 */     return this.b;
/*     */   }
/*     */   
/*     */   public double e() {
/*  91 */     return this.c;
/*     */   }
/*     */   
/*     */   public float f() {
/*  95 */     return this.d;
/*     */   }
/*     */   
/*     */   public float g() {
/*  99 */     return this.e;
/*     */   }
/*     */   
/*     */   public float h() {
/* 103 */     return this.f;
/*     */   }
/*     */   
/*     */   public float i() {
/* 107 */     return this.g;
/*     */   }
/*     */   
/*     */   public int j() {
/* 111 */     return this.h;
/*     */   }
/*     */   
/*     */   public hf k() {
/* 115 */     return this.j;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(om ☃) {
/* 120 */     ☃.a(this);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\pv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */