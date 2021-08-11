/*     */ import java.io.IOException;
/*     */ import java.util.UUID;
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
/*     */ public class on
/*     */   implements oj<om>
/*     */ {
/*     */   private int a;
/*     */   private UUID b;
/*     */   private double c;
/*     */   private double d;
/*     */   private double e;
/*     */   private int f;
/*     */   private int g;
/*     */   private int h;
/*     */   private int i;
/*     */   private int j;
/*     */   private aqe<?> k;
/*     */   private int l;
/*     */   
/*     */   public on() {}
/*     */   
/*     */   public on(int ☃, UUID uUID, double d1, double d2, double d3, float f1, float f2, aqe<?> aqe1, int i, dcn dcn1) {
/*  35 */     this.a = ☃;
/*  36 */     this.b = uUID;
/*  37 */     this.c = d1;
/*  38 */     this.d = d2;
/*  39 */     this.e = d3;
/*  40 */     this.i = afm.d(f1 * 256.0F / 360.0F);
/*  41 */     this.j = afm.d(f2 * 256.0F / 360.0F);
/*  42 */     this.k = aqe1;
/*  43 */     this.l = i;
/*     */     
/*  45 */     this.f = (int)(afm.a(dcn1.b, -3.9D, 3.9D) * 8000.0D);
/*  46 */     this.g = (int)(afm.a(dcn1.c, -3.9D, 3.9D) * 8000.0D);
/*  47 */     this.h = (int)(afm.a(dcn1.d, -3.9D, 3.9D) * 8000.0D);
/*     */   }
/*     */   
/*     */   public on(aqa ☃) {
/*  51 */     this(☃, 0);
/*     */   }
/*     */   
/*     */   public on(aqa ☃, int i) {
/*  55 */     this(☃.Y(), ☃.bS(), ☃.cD(), ☃.cE(), ☃.cH(), ☃.q, ☃.p, ☃.X(), i, ☃.cC());
/*     */   }
/*     */   
/*     */   public on(aqa ☃, aqe<?> aqe1, int i, fx fx1) {
/*  59 */     this(☃.Y(), ☃.bS(), fx1.u(), fx1.v(), fx1.w(), ☃.q, ☃.p, aqe1, i, ☃.cC());
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(nf ☃) throws IOException {
/*  64 */     this.a = ☃.i();
/*  65 */     this.b = ☃.k();
/*  66 */     this.k = gm.S.a(☃.i());
/*  67 */     this.c = ☃.readDouble();
/*  68 */     this.d = ☃.readDouble();
/*  69 */     this.e = ☃.readDouble();
/*  70 */     this.i = ☃.readByte();
/*  71 */     this.j = ☃.readByte();
/*  72 */     this.l = ☃.readInt();
/*     */     
/*  74 */     this.f = ☃.readShort();
/*  75 */     this.g = ☃.readShort();
/*  76 */     this.h = ☃.readShort();
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(nf ☃) throws IOException {
/*  81 */     ☃.d(this.a);
/*  82 */     ☃.a(this.b);
/*  83 */     ☃.d(gm.S.a(this.k));
/*  84 */     ☃.writeDouble(this.c);
/*  85 */     ☃.writeDouble(this.d);
/*  86 */     ☃.writeDouble(this.e);
/*  87 */     ☃.writeByte(this.i);
/*  88 */     ☃.writeByte(this.j);
/*  89 */     ☃.writeInt(this.l);
/*     */     
/*  91 */     ☃.writeShort(this.f);
/*  92 */     ☃.writeShort(this.g);
/*  93 */     ☃.writeShort(this.h);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(om ☃) {
/*  98 */     ☃.a(this);
/*     */   }
/*     */   
/*     */   public int b() {
/* 102 */     return this.a;
/*     */   }
/*     */   
/*     */   public UUID c() {
/* 106 */     return this.b;
/*     */   }
/*     */   
/*     */   public double d() {
/* 110 */     return this.c;
/*     */   }
/*     */   
/*     */   public double e() {
/* 114 */     return this.d;
/*     */   }
/*     */   
/*     */   public double f() {
/* 118 */     return this.e;
/*     */   }
/*     */   
/*     */   public double g() {
/* 122 */     return this.f / 8000.0D;
/*     */   }
/*     */   
/*     */   public double h() {
/* 126 */     return this.g / 8000.0D;
/*     */   }
/*     */   
/*     */   public double i() {
/* 130 */     return this.h / 8000.0D;
/*     */   }
/*     */   
/*     */   public int j() {
/* 134 */     return this.i;
/*     */   }
/*     */   
/*     */   public int k() {
/* 138 */     return this.j;
/*     */   }
/*     */   
/*     */   public aqe<?> l() {
/* 142 */     return this.k;
/*     */   }
/*     */   
/*     */   public int m() {
/* 146 */     return this.l;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\on.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */