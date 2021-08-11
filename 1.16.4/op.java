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
/*     */ public class op
/*     */   implements oj<om>
/*     */ {
/*     */   private int a;
/*     */   private UUID b;
/*     */   private int c;
/*     */   private double d;
/*     */   private double e;
/*     */   private double f;
/*     */   private int g;
/*     */   private int h;
/*     */   private int i;
/*     */   private byte j;
/*     */   private byte k;
/*     */   private byte l;
/*     */   
/*     */   public op() {}
/*     */   
/*     */   public op(aqm ☃) {
/*  32 */     this.a = ☃.Y();
/*  33 */     this.b = ☃.bS();
/*     */     
/*  35 */     this.c = gm.S.a(☃.X());
/*  36 */     this.d = ☃.cD();
/*  37 */     this.e = ☃.cE();
/*  38 */     this.f = ☃.cH();
/*  39 */     this.j = (byte)(int)(☃.p * 256.0F / 360.0F);
/*  40 */     this.k = (byte)(int)(☃.q * 256.0F / 360.0F);
/*  41 */     this.l = (byte)(int)(☃.aC * 256.0F / 360.0F);
/*     */ 
/*     */     
/*  44 */     double d1 = 3.9D;
/*     */     
/*  46 */     dcn dcn = ☃.cC();
/*  47 */     double d2 = afm.a(dcn.b, -3.9D, 3.9D);
/*  48 */     double d3 = afm.a(dcn.c, -3.9D, 3.9D);
/*  49 */     double d4 = afm.a(dcn.d, -3.9D, 3.9D);
/*     */     
/*  51 */     this.g = (int)(d2 * 8000.0D);
/*  52 */     this.h = (int)(d3 * 8000.0D);
/*  53 */     this.i = (int)(d4 * 8000.0D);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(nf ☃) throws IOException {
/*  58 */     this.a = ☃.i();
/*  59 */     this.b = ☃.k();
/*  60 */     this.c = ☃.i();
/*  61 */     this.d = ☃.readDouble();
/*  62 */     this.e = ☃.readDouble();
/*  63 */     this.f = ☃.readDouble();
/*  64 */     this.j = ☃.readByte();
/*  65 */     this.k = ☃.readByte();
/*  66 */     this.l = ☃.readByte();
/*  67 */     this.g = ☃.readShort();
/*  68 */     this.h = ☃.readShort();
/*  69 */     this.i = ☃.readShort();
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(nf ☃) throws IOException {
/*  74 */     ☃.d(this.a);
/*  75 */     ☃.a(this.b);
/*  76 */     ☃.d(this.c);
/*  77 */     ☃.writeDouble(this.d);
/*  78 */     ☃.writeDouble(this.e);
/*  79 */     ☃.writeDouble(this.f);
/*  80 */     ☃.writeByte(this.j);
/*  81 */     ☃.writeByte(this.k);
/*  82 */     ☃.writeByte(this.l);
/*  83 */     ☃.writeShort(this.g);
/*  84 */     ☃.writeShort(this.h);
/*  85 */     ☃.writeShort(this.i);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(om ☃) {
/*  90 */     ☃.a(this);
/*     */   }
/*     */   
/*     */   public int b() {
/*  94 */     return this.a;
/*     */   }
/*     */   
/*     */   public UUID c() {
/*  98 */     return this.b;
/*     */   }
/*     */   
/*     */   public int d() {
/* 102 */     return this.c;
/*     */   }
/*     */   
/*     */   public double e() {
/* 106 */     return this.d;
/*     */   }
/*     */   
/*     */   public double f() {
/* 110 */     return this.e;
/*     */   }
/*     */   
/*     */   public double g() {
/* 114 */     return this.f;
/*     */   }
/*     */   
/*     */   public int h() {
/* 118 */     return this.g;
/*     */   }
/*     */   
/*     */   public int i() {
/* 122 */     return this.h;
/*     */   }
/*     */   
/*     */   public int j() {
/* 126 */     return this.i;
/*     */   }
/*     */   
/*     */   public byte k() {
/* 130 */     return this.j;
/*     */   }
/*     */   
/*     */   public byte l() {
/* 134 */     return this.k;
/*     */   }
/*     */   
/*     */   public byte m() {
/* 138 */     return this.l;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\op.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */