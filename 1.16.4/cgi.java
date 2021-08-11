/*     */ import java.util.function.Predicate;
/*     */ import javax.annotation.Nullable;
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
/*     */ public class cgi
/*     */ {
/*  18 */   private static final cgm<ceh> a = new cge<>(buo.m, bup.a.n());
/*     */   
/*     */   private final int b;
/*     */   private short c;
/*     */   private short d;
/*     */   private short e;
/*     */   private final cgo<ceh> f;
/*     */   
/*     */   public cgi(int ☃) {
/*  27 */     this(☃, (short)0, (short)0, (short)0);
/*     */   }
/*     */   
/*     */   public cgi(int ☃, short s1, short s2, short s3) {
/*  31 */     this.b = ☃;
/*  32 */     this.c = s1;
/*  33 */     this.d = s2;
/*  34 */     this.e = s3;
/*  35 */     this.f = new cgo<>(a, buo.m, mp::c, mp::a, bup.a.n());
/*     */   }
/*     */   
/*     */   public ceh a(int ☃, int i, int j) {
/*  39 */     return this.f.a(☃, i, j);
/*     */   }
/*     */   
/*     */   public cux b(int ☃, int i, int j) {
/*  43 */     return ((ceh)this.f.a(☃, i, j)).m();
/*     */   }
/*     */   
/*     */   public void a() {
/*  47 */     this.f.a();
/*     */   }
/*     */   
/*     */   public void b() {
/*  51 */     this.f.b();
/*     */   }
/*     */   
/*     */   public ceh a(int ☃, int i, int j, ceh ceh1) {
/*  55 */     return a(☃, i, j, ceh1, true);
/*     */   }
/*     */   
/*     */   public ceh a(int ☃, int i, int j, ceh ceh1, boolean bool) {
/*     */     ceh ceh2;
/*  60 */     if (bool) {
/*  61 */       ceh2 = this.f.a(☃, i, j, ceh1);
/*     */     } else {
/*  63 */       ceh2 = this.f.b(☃, i, j, ceh1);
/*     */     } 
/*  65 */     cux cux1 = ceh2.m();
/*  66 */     cux cux2 = ceh1.m();
/*     */     
/*  68 */     if (!ceh2.g()) {
/*  69 */       this.c = (short)(this.c - 1);
/*  70 */       if (ceh2.n()) {
/*  71 */         this.d = (short)(this.d - 1);
/*     */       }
/*     */     } 
/*     */     
/*  75 */     if (!cux1.c()) {
/*  76 */       this.e = (short)(this.e - 1);
/*     */     }
/*     */     
/*  79 */     if (!ceh1.g()) {
/*  80 */       this.c = (short)(this.c + 1);
/*  81 */       if (ceh1.n()) {
/*  82 */         this.d = (short)(this.d + 1);
/*     */       }
/*     */     } 
/*     */     
/*  86 */     if (!cux2.c()) {
/*  87 */       this.e = (short)(this.e + 1);
/*     */     }
/*     */     
/*  90 */     return ceh2;
/*     */   }
/*     */   
/*     */   public boolean c() {
/*  94 */     return (this.c == 0);
/*     */   }
/*     */   
/*     */   public static boolean a(@Nullable cgi ☃) {
/*  98 */     return (☃ == cgh.a || ☃.c());
/*     */   }
/*     */   
/*     */   public boolean d() {
/* 102 */     return (e() || f());
/*     */   }
/*     */   
/*     */   public boolean e() {
/* 106 */     return (this.d > 0);
/*     */   }
/*     */   
/*     */   public boolean f() {
/* 110 */     return (this.e > 0);
/*     */   }
/*     */   
/*     */   public int g() {
/* 114 */     return this.b;
/*     */   }
/*     */   
/*     */   public void h() {
/* 118 */     this.c = 0;
/* 119 */     this.d = 0;
/* 120 */     this.e = 0;
/*     */     
/* 122 */     this.f.a((☃, i) -> {
/*     */           cux cux = ☃.m();
/*     */           if (!☃.g()) {
/*     */             this.c = (short)(this.c + i);
/*     */             if (☃.n()) {
/*     */               this.d = (short)(this.d + i);
/*     */             }
/*     */           } 
/*     */           if (!cux.c()) {
/*     */             this.c = (short)(this.c + i);
/*     */             if (cux.f()) {
/*     */               this.e = (short)(this.e + i);
/*     */             }
/*     */           } 
/*     */         });
/*     */   }
/*     */ 
/*     */   
/*     */   public cgo<ceh> i() {
/* 141 */     return this.f;
/*     */   }
/*     */   
/*     */   public void a(nf ☃) {
/* 145 */     this.c = ☃.readShort();
/* 146 */     this.f.a(☃);
/*     */   }
/*     */   
/*     */   public void b(nf ☃) {
/* 150 */     ☃.writeShort(this.c);
/* 151 */     this.f.b(☃);
/*     */   }
/*     */   
/*     */   public int j() {
/* 155 */     return 2 + this.f.c();
/*     */   }
/*     */   
/*     */   public boolean a(Predicate<ceh> ☃) {
/* 159 */     return this.f.a(☃);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cgi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */