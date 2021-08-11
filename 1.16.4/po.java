/*     */ import com.google.common.collect.Lists;
/*     */ import java.io.IOException;
/*     */ import java.util.List;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class po
/*     */   implements oj<om>
/*     */ {
/*     */   private double a;
/*     */   private double b;
/*     */   private double c;
/*     */   private float d;
/*     */   private List<fx> e;
/*     */   private float f;
/*     */   private float g;
/*     */   private float h;
/*     */   
/*     */   public po() {}
/*     */   
/*     */   public po(double ☃, double d1, double d2, float f, List<fx> list, dcn dcn1) {
/*  28 */     this.a = ☃;
/*  29 */     this.b = d1;
/*  30 */     this.c = d2;
/*  31 */     this.d = f;
/*  32 */     this.e = Lists.newArrayList(list);
/*     */     
/*  34 */     if (dcn1 != null) {
/*  35 */       this.f = (float)dcn1.b;
/*  36 */       this.g = (float)dcn1.c;
/*  37 */       this.h = (float)dcn1.d;
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(nf ☃) throws IOException {
/*  43 */     this.a = ☃.readFloat();
/*  44 */     this.b = ☃.readFloat();
/*  45 */     this.c = ☃.readFloat();
/*  46 */     this.d = ☃.readFloat();
/*  47 */     int i = ☃.readInt();
/*     */     
/*  49 */     this.e = Lists.newArrayListWithCapacity(i);
/*     */     
/*  51 */     int j = afm.c(this.a);
/*  52 */     int k = afm.c(this.b);
/*  53 */     int m = afm.c(this.c);
/*  54 */     for (int n = 0; n < i; n++) {
/*  55 */       int i1 = ☃.readByte() + j;
/*  56 */       int i2 = ☃.readByte() + k;
/*  57 */       int i3 = ☃.readByte() + m;
/*  58 */       this.e.add(new fx(i1, i2, i3));
/*     */     } 
/*     */     
/*  61 */     this.f = ☃.readFloat();
/*  62 */     this.g = ☃.readFloat();
/*  63 */     this.h = ☃.readFloat();
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(nf ☃) throws IOException {
/*  68 */     ☃.writeFloat((float)this.a);
/*  69 */     ☃.writeFloat((float)this.b);
/*  70 */     ☃.writeFloat((float)this.c);
/*  71 */     ☃.writeFloat(this.d);
/*  72 */     ☃.writeInt(this.e.size());
/*     */     
/*  74 */     int i = afm.c(this.a);
/*  75 */     int j = afm.c(this.b);
/*  76 */     int k = afm.c(this.c);
/*  77 */     for (fx fx : this.e) {
/*  78 */       int m = fx.u() - i;
/*  79 */       int n = fx.v() - j;
/*  80 */       int i1 = fx.w() - k;
/*  81 */       ☃.writeByte(m);
/*  82 */       ☃.writeByte(n);
/*  83 */       ☃.writeByte(i1);
/*     */     } 
/*     */     
/*  86 */     ☃.writeFloat(this.f);
/*  87 */     ☃.writeFloat(this.g);
/*  88 */     ☃.writeFloat(this.h);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(om ☃) {
/*  93 */     ☃.a(this);
/*     */   }
/*     */   
/*     */   public float b() {
/*  97 */     return this.f;
/*     */   }
/*     */   
/*     */   public float c() {
/* 101 */     return this.g;
/*     */   }
/*     */   
/*     */   public float d() {
/* 105 */     return this.h;
/*     */   }
/*     */   
/*     */   public double e() {
/* 109 */     return this.a;
/*     */   }
/*     */   
/*     */   public double f() {
/* 113 */     return this.b;
/*     */   }
/*     */   
/*     */   public double g() {
/* 117 */     return this.c;
/*     */   }
/*     */   
/*     */   public float h() {
/* 121 */     return this.d;
/*     */   }
/*     */   
/*     */   public List<fx> i() {
/* 125 */     return this.e;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\po.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */