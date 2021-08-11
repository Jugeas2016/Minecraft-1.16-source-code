/*     */ import java.util.Optional;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class bip
/*     */   extends bjj<bio>
/*     */ {
/*  27 */   private final bio c = new bio(this, 3, 3);
/*  28 */   private final bjm d = new bjm();
/*     */   
/*     */   private final bim e;
/*     */   private final bfw f;
/*     */   
/*     */   public bip(int ☃, bfv bfv1) {
/*  34 */     this(☃, bfv1, bim.a);
/*     */   }
/*     */   
/*     */   public bip(int ☃, bfv bfv1, bim bim1) {
/*  38 */     super(bje.l, ☃);
/*  39 */     this.e = bim1;
/*  40 */     this.f = bfv1.e;
/*  41 */     a(new bjn(bfv1.e, this.c, this.d, 0, 124, 35));
/*     */     int i;
/*  43 */     for (i = 0; i < 3; i++) {
/*  44 */       for (int j = 0; j < 3; j++) {
/*  45 */         a(new bjr(this.c, j + i * 3, 30 + j * 18, 17 + i * 18));
/*     */       }
/*     */     } 
/*     */     
/*  49 */     for (i = 0; i < 3; i++) {
/*  50 */       for (int j = 0; j < 9; j++) {
/*  51 */         a(new bjr(bfv1, j + i * 9 + 9, 8 + j * 18, 84 + i * 18));
/*     */       }
/*     */     } 
/*  54 */     for (i = 0; i < 9; i++) {
/*  55 */       a(new bjr(bfv1, i, 8 + i * 18, 142));
/*     */     }
/*     */   }
/*     */   
/*     */   protected static void a(int ☃, brx brx1, bfw bfw1, bio bio1, bjm bjm1) {
/*  60 */     if (brx1.v) {
/*     */       return;
/*     */     }
/*     */     
/*  64 */     aah aah = (aah)bfw1;
/*  65 */     bmb bmb = bmb.b;
/*  66 */     Optional<boi> optional = brx1.l().aF().a(bot.a, bio1, brx1);
/*  67 */     if (optional.isPresent()) {
/*  68 */       boi boi = optional.get();
/*  69 */       if (bjm1.a(brx1, aah, boi)) {
/*  70 */         bmb = boi.a(bio1);
/*     */       }
/*     */     } 
/*     */     
/*  74 */     bjm1.a(0, bmb);
/*  75 */     aah.b.a(new pi(☃, 0, bmb));
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(aon ☃) {
/*  80 */     this.e.a((☃, fx1) -> a(this.b, ☃, this.f, this.c, this.d));
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(bfy ☃) {
/*  85 */     this.c.a(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public void e() {
/*  90 */     this.c.Y_();
/*  91 */     this.d.Y_();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(boq<? super bio> ☃) {
/*  96 */     return ☃.a(this.c, this.f.l);
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(bfw ☃) {
/* 101 */     super.b(☃);
/* 102 */     this.e.a((brx1, fx1) -> a(☃, brx1, this.c));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(bfw ☃) {
/* 107 */     return a(this.e, ☃, bup.bV);
/*     */   }
/*     */ 
/*     */   
/*     */   public bmb b(bfw ☃, int i) {
/* 112 */     bmb bmb = bmb.b;
/* 113 */     bjr bjr = this.a.get(i);
/* 114 */     if (bjr != null && bjr.f()) {
/* 115 */       bmb bmb1 = bjr.e();
/* 116 */       bmb = bmb1.i();
/*     */       
/* 118 */       if (i == 0) {
/* 119 */         this.e.a((brx1, fx1) -> ☃.b().b(☃, brx1, bfw1));
/* 120 */         if (!a(bmb1, 10, 46, true)) {
/* 121 */           return bmb.b;
/*     */         }
/* 123 */         bjr.a(bmb1, bmb);
/* 124 */       } else if (i >= 10 && i < 46) {
/* 125 */         if (!a(bmb1, 1, 10, false)) {
/* 126 */           if (i < 37) {
/* 127 */             if (!a(bmb1, 37, 46, false)) {
/* 128 */               return bmb.b;
/*     */             }
/*     */           }
/* 131 */           else if (!a(bmb1, 10, 37, false)) {
/* 132 */             return bmb.b;
/*     */           }
/*     */         
/*     */         }
/*     */       }
/* 137 */       else if (!a(bmb1, 10, 46, false)) {
/* 138 */         return bmb.b;
/*     */       } 
/*     */       
/* 141 */       if (bmb1.a()) {
/* 142 */         bjr.d(bmb.b);
/*     */       } else {
/* 144 */         bjr.d();
/*     */       } 
/* 146 */       if (bmb1.E() == bmb.E())
/*     */       {
/* 148 */         return bmb.b;
/*     */       }
/* 150 */       bmb bmb2 = bjr.a(☃, bmb1);
/* 151 */       if (i == 0) {
/* 152 */         ☃.a(bmb2, false);
/*     */       }
/*     */     } 
/*     */     
/* 156 */     return bmb;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(bmb ☃, bjr bjr1) {
/* 161 */     return (bjr1.c != this.d && super.a(☃, bjr1));
/*     */   }
/*     */ 
/*     */   
/*     */   public int f() {
/* 166 */     return 0;
/*     */   }
/*     */ 
/*     */   
/*     */   public int g() {
/* 171 */     return this.c.g();
/*     */   }
/*     */ 
/*     */   
/*     */   public int h() {
/* 176 */     return this.c.f();
/*     */   }
/*     */ 
/*     */   
/*     */   public int i() {
/* 181 */     return 10;
/*     */   }
/*     */ 
/*     */   
/*     */   public bjk m() {
/* 186 */     return bjk.a;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bip.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */