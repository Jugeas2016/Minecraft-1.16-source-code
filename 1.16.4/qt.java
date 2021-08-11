/*     */ import java.io.IOException;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class qt
/*     */   implements oj<om>
/*     */ {
/*     */   private a a;
/*     */   private int b;
/*     */   private double c;
/*     */   private double d;
/*     */   private double e;
/*     */   private double f;
/*     */   private long g;
/*     */   private int h;
/*     */   private int i;
/*     */   
/*     */   public qt() {}
/*     */   
/*     */   public qt(cfu ☃, a a1) {
/*  24 */     this.a = a1;
/*  25 */     this.c = ☃.a();
/*  26 */     this.d = ☃.b();
/*  27 */     this.f = ☃.i();
/*  28 */     this.e = ☃.k();
/*  29 */     this.g = ☃.j();
/*  30 */     this.b = ☃.m();
/*  31 */     this.i = ☃.r();
/*  32 */     this.h = ☃.q();
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(nf ☃) throws IOException {
/*  37 */     this.a = ☃.<a>a(a.class);
/*     */     
/*  39 */     switch (null.a[this.a.ordinal()]) {
/*     */       case 1:
/*  41 */         this.e = ☃.readDouble();
/*     */         break;
/*     */       case 2:
/*  44 */         this.f = ☃.readDouble();
/*  45 */         this.e = ☃.readDouble();
/*  46 */         this.g = ☃.j();
/*     */         break;
/*     */       case 3:
/*  49 */         this.c = ☃.readDouble();
/*  50 */         this.d = ☃.readDouble();
/*     */         break;
/*     */       case 4:
/*  53 */         this.i = ☃.i();
/*     */         break;
/*     */       case 5:
/*  56 */         this.h = ☃.i();
/*     */         break;
/*     */       case 6:
/*  59 */         this.c = ☃.readDouble();
/*  60 */         this.d = ☃.readDouble();
/*  61 */         this.f = ☃.readDouble();
/*  62 */         this.e = ☃.readDouble();
/*  63 */         this.g = ☃.j();
/*  64 */         this.b = ☃.i();
/*  65 */         this.i = ☃.i();
/*  66 */         this.h = ☃.i();
/*     */         break;
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(nf ☃) throws IOException {
/*  73 */     ☃.a(this.a);
/*     */     
/*  75 */     switch (null.a[this.a.ordinal()]) {
/*     */       case 1:
/*  77 */         ☃.writeDouble(this.e);
/*     */         break;
/*     */       case 2:
/*  80 */         ☃.writeDouble(this.f);
/*  81 */         ☃.writeDouble(this.e);
/*  82 */         ☃.b(this.g);
/*     */         break;
/*     */       case 3:
/*  85 */         ☃.writeDouble(this.c);
/*  86 */         ☃.writeDouble(this.d);
/*     */         break;
/*     */       case 5:
/*  89 */         ☃.d(this.h);
/*     */         break;
/*     */       case 4:
/*  92 */         ☃.d(this.i);
/*     */         break;
/*     */       case 6:
/*  95 */         ☃.writeDouble(this.c);
/*  96 */         ☃.writeDouble(this.d);
/*  97 */         ☃.writeDouble(this.f);
/*  98 */         ☃.writeDouble(this.e);
/*  99 */         ☃.b(this.g);
/* 100 */         ☃.d(this.b);
/* 101 */         ☃.d(this.i);
/* 102 */         ☃.d(this.h);
/*     */         break;
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(om ☃) {
/* 109 */     ☃.a(this);
/*     */   }
/*     */   
/*     */   public void a(cfu ☃) {
/* 113 */     switch (null.a[this.a.ordinal()]) {
/*     */       case 1:
/* 115 */         ☃.a(this.e);
/*     */         break;
/*     */       case 2:
/* 118 */         ☃.a(this.f, this.e, this.g);
/*     */         break;
/*     */       case 3:
/* 121 */         ☃.c(this.c, this.d);
/*     */         break;
/*     */       case 6:
/* 124 */         ☃.c(this.c, this.d);
/*     */         
/* 126 */         if (this.g > 0L) {
/* 127 */           ☃.a(this.f, this.e, this.g);
/*     */         } else {
/* 129 */           ☃.a(this.e);
/*     */         } 
/*     */         
/* 132 */         ☃.a(this.b);
/* 133 */         ☃.c(this.i);
/* 134 */         ☃.b(this.h);
/*     */         break;
/*     */       case 5:
/* 137 */         ☃.b(this.h);
/*     */         break;
/*     */       case 4:
/* 140 */         ☃.c(this.i);
/*     */         break;
/*     */     } 
/*     */   }
/*     */   
/*     */   public enum a {
/* 146 */     a,
/* 147 */     b,
/* 148 */     c,
/* 149 */     d,
/* 150 */     e,
/* 151 */     f;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\qt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */