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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class to
/*     */   implements oj<sa>
/*     */ {
/*     */   private fx a;
/*     */   private cdj.a b;
/*     */   private cfo c;
/*     */   private String d;
/*     */   private fx e;
/*     */   private fx f;
/*     */   private byg g;
/*     */   private bzm h;
/*     */   private String i;
/*     */   private boolean j;
/*     */   private boolean k;
/*     */   private boolean l;
/*     */   private float m;
/*     */   private long n;
/*     */   
/*     */   public to() {}
/*     */   
/*     */   public to(fx ☃, cdj.a a1, cfo cfo1, String str1, fx fx1, fx fx2, byg byg1, bzm bzm1, String str2, boolean bool1, boolean bool2, boolean bool3, float f, long l) {
/*  38 */     this.a = ☃;
/*  39 */     this.b = a1;
/*  40 */     this.c = cfo1;
/*  41 */     this.d = str1;
/*  42 */     this.e = fx1;
/*  43 */     this.f = fx2;
/*  44 */     this.g = byg1;
/*  45 */     this.h = bzm1;
/*  46 */     this.i = str2;
/*  47 */     this.j = bool1;
/*  48 */     this.k = bool2;
/*  49 */     this.l = bool3;
/*  50 */     this.m = f;
/*  51 */     this.n = l;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(nf ☃) throws IOException {
/*  56 */     this.a = ☃.e();
/*  57 */     this.b = ☃.<cdj.a>a(cdj.a.class);
/*  58 */     this.c = ☃.<cfo>a(cfo.class);
/*  59 */     this.d = ☃.e(32767);
/*  60 */     int i = 48;
/*  61 */     this.e = new fx(afm.a(☃.readByte(), -48, 48), afm.a(☃.readByte(), -48, 48), afm.a(☃.readByte(), -48, 48));
/*  62 */     int j = 48;
/*  63 */     this.f = new fx(afm.a(☃.readByte(), 0, 48), afm.a(☃.readByte(), 0, 48), afm.a(☃.readByte(), 0, 48));
/*  64 */     this.g = ☃.<byg>a(byg.class);
/*  65 */     this.h = ☃.<bzm>a(bzm.class);
/*  66 */     this.i = ☃.e(12);
/*  67 */     this.m = afm.a(☃.readFloat(), 0.0F, 1.0F);
/*  68 */     this.n = ☃.j();
/*  69 */     int k = ☃.readByte();
/*  70 */     this.j = ((k & 0x1) != 0);
/*  71 */     this.k = ((k & 0x2) != 0);
/*  72 */     this.l = ((k & 0x4) != 0);
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(nf ☃) throws IOException {
/*  77 */     ☃.a(this.a);
/*  78 */     ☃.a(this.b);
/*  79 */     ☃.a(this.c);
/*  80 */     ☃.a(this.d);
/*  81 */     ☃.writeByte(this.e.u());
/*  82 */     ☃.writeByte(this.e.v());
/*  83 */     ☃.writeByte(this.e.w());
/*  84 */     ☃.writeByte(this.f.u());
/*  85 */     ☃.writeByte(this.f.v());
/*  86 */     ☃.writeByte(this.f.w());
/*  87 */     ☃.a(this.g);
/*  88 */     ☃.a(this.h);
/*  89 */     ☃.a(this.i);
/*  90 */     ☃.writeFloat(this.m);
/*  91 */     ☃.b(this.n);
/*     */     
/*  93 */     int i = 0;
/*  94 */     if (this.j) {
/*  95 */       i |= 0x1;
/*     */     }
/*  97 */     if (this.k) {
/*  98 */       i |= 0x2;
/*     */     }
/* 100 */     if (this.l) {
/* 101 */       i |= 0x4;
/*     */     }
/* 103 */     ☃.writeByte(i);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(sa ☃) {
/* 108 */     ☃.a(this);
/*     */   }
/*     */   
/*     */   public fx b() {
/* 112 */     return this.a;
/*     */   }
/*     */   
/*     */   public cdj.a c() {
/* 116 */     return this.b;
/*     */   }
/*     */   
/*     */   public cfo d() {
/* 120 */     return this.c;
/*     */   }
/*     */   
/*     */   public String e() {
/* 124 */     return this.d;
/*     */   }
/*     */   
/*     */   public fx f() {
/* 128 */     return this.e;
/*     */   }
/*     */   
/*     */   public fx g() {
/* 132 */     return this.f;
/*     */   }
/*     */   
/*     */   public byg h() {
/* 136 */     return this.g;
/*     */   }
/*     */   
/*     */   public bzm i() {
/* 140 */     return this.h;
/*     */   }
/*     */   
/*     */   public String j() {
/* 144 */     return this.i;
/*     */   }
/*     */   
/*     */   public boolean k() {
/* 148 */     return this.j;
/*     */   }
/*     */   
/*     */   public boolean l() {
/* 152 */     return this.k;
/*     */   }
/*     */   
/*     */   public boolean m() {
/* 156 */     return this.l;
/*     */   }
/*     */   
/*     */   public float n() {
/* 160 */     return this.m;
/*     */   }
/*     */   
/*     */   public long o() {
/* 164 */     return this.n;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\to.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */