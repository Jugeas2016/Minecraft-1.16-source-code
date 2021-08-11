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
/*     */ public class oz
/*     */   implements oj<om>
/*     */ {
/*     */   private UUID a;
/*     */   private a b;
/*     */   private nr c;
/*     */   private float d;
/*     */   private aok.a e;
/*     */   private aok.b f;
/*     */   private boolean g;
/*     */   private boolean h;
/*     */   private boolean i;
/*     */   
/*     */   public oz() {}
/*     */   
/*     */   public oz(a ☃, aok aok1) {
/*  30 */     this.b = ☃;
/*  31 */     this.a = aok1.i();
/*  32 */     this.c = aok1.j();
/*  33 */     this.d = aok1.k();
/*  34 */     this.e = aok1.l();
/*  35 */     this.f = aok1.m();
/*  36 */     this.g = aok1.n();
/*  37 */     this.h = aok1.o();
/*  38 */     this.i = aok1.p();
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(nf ☃) throws IOException {
/*  43 */     this.a = ☃.k();
/*  44 */     this.b = ☃.<a>a(a.class);
/*     */     
/*  46 */     switch (null.a[this.b.ordinal()]) {
/*     */       case 1:
/*  48 */         this.c = ☃.h();
/*  49 */         this.d = ☃.readFloat();
/*  50 */         this.e = ☃.<aok.a>a(aok.a.class);
/*  51 */         this.f = ☃.<aok.b>a(aok.b.class);
/*  52 */         a(☃.readUnsignedByte());
/*     */         break;
/*     */ 
/*     */       
/*     */       case 3:
/*  57 */         this.d = ☃.readFloat();
/*     */         break;
/*     */       case 4:
/*  60 */         this.c = ☃.h();
/*     */         break;
/*     */       case 5:
/*  63 */         this.e = ☃.<aok.a>a(aok.a.class);
/*  64 */         this.f = ☃.<aok.b>a(aok.b.class);
/*     */         break;
/*     */       case 6:
/*  67 */         a(☃.readUnsignedByte());
/*     */         break;
/*     */     } 
/*     */   }
/*     */   
/*     */   private void a(int ☃) {
/*  73 */     this.g = ((☃ & 0x1) > 0);
/*  74 */     this.h = ((☃ & 0x2) > 0);
/*  75 */     this.i = ((☃ & 0x4) > 0);
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(nf ☃) throws IOException {
/*  80 */     ☃.a(this.a);
/*  81 */     ☃.a(this.b);
/*     */     
/*  83 */     switch (null.a[this.b.ordinal()]) {
/*     */       case 1:
/*  85 */         ☃.a(this.c);
/*  86 */         ☃.writeFloat(this.d);
/*  87 */         ☃.a(this.e);
/*  88 */         ☃.a(this.f);
/*  89 */         ☃.writeByte(k());
/*     */         break;
/*     */ 
/*     */       
/*     */       case 3:
/*  94 */         ☃.writeFloat(this.d);
/*     */         break;
/*     */       case 4:
/*  97 */         ☃.a(this.c);
/*     */         break;
/*     */       case 5:
/* 100 */         ☃.a(this.e);
/* 101 */         ☃.a(this.f);
/*     */         break;
/*     */       case 6:
/* 104 */         ☃.writeByte(k());
/*     */         break;
/*     */     } 
/*     */   }
/*     */   
/*     */   private int k() {
/* 110 */     int ☃ = 0;
/* 111 */     if (this.g) {
/* 112 */       ☃ |= 0x1;
/*     */     }
/* 114 */     if (this.h) {
/* 115 */       ☃ |= 0x2;
/*     */     }
/* 117 */     if (this.i) {
/* 118 */       ☃ |= 0x4;
/*     */     }
/* 120 */     return ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(om ☃) {
/* 125 */     ☃.a(this);
/*     */   }
/*     */   
/*     */   public UUID b() {
/* 129 */     return this.a;
/*     */   }
/*     */   
/*     */   public a c() {
/* 133 */     return this.b;
/*     */   }
/*     */   
/*     */   public nr d() {
/* 137 */     return this.c;
/*     */   }
/*     */   
/*     */   public float e() {
/* 141 */     return this.d;
/*     */   }
/*     */   
/*     */   public aok.a f() {
/* 145 */     return this.e;
/*     */   }
/*     */   
/*     */   public aok.b g() {
/* 149 */     return this.f;
/*     */   }
/*     */   
/*     */   public boolean h() {
/* 153 */     return this.g;
/*     */   }
/*     */   
/*     */   public boolean i() {
/* 157 */     return this.h;
/*     */   }
/*     */   
/*     */   public boolean j() {
/* 161 */     return this.i;
/*     */   }
/*     */   
/*     */   public enum a {
/* 165 */     a,
/* 166 */     b,
/* 167 */     c,
/* 168 */     d,
/* 169 */     e,
/* 170 */     f;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\oz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */