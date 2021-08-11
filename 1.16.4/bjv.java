/*     */ import com.google.common.collect.Lists;
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
/*     */ public class bjv
/*     */   extends bic
/*     */ {
/*     */   private final bim f;
/*  28 */   private final biq g = biq.a();
/*     */   
/*     */   private final brx h;
/*  31 */   private List<bpe> i = Lists.newArrayList();
/*  32 */   private bmb j = bmb.b;
/*     */   private long k;
/*     */   final bjr c;
/*     */   final bjr d;
/*     */   private Runnable l = () -> {
/*     */     
/*     */     };
/*     */   
/*  40 */   public final aon e = new apa(this, 1)
/*     */     {
/*     */       public void X_() {
/*  43 */         super.X_();
/*  44 */         this.a.a(this);
/*  45 */         bjv.a(this.a).run();
/*     */       }
/*     */     };
/*  48 */   private final bjm m = new bjm();
/*     */   
/*     */   public bjv(int ☃, bfv bfv1) {
/*  51 */     this(☃, bfv1, bim.a);
/*     */   }
/*     */   
/*     */   public bjv(int ☃, bfv bfv1, bim bim1) {
/*  55 */     super(bje.x, ☃);
/*     */     
/*  57 */     this.f = bim1;
/*  58 */     this.h = bfv1.e.l;
/*     */     
/*  60 */     this.c = a(new bjr(this.e, 0, 20, 33));
/*     */     
/*  62 */     this.d = a(new bjr(this, this.m, 1, 143, 33, bim1)
/*     */         {
/*     */           public boolean a(bmb ☃) {
/*  65 */             return false;
/*     */           }
/*     */ 
/*     */           
/*     */           public bmb a(bfw ☃, bmb bmb1) {
/*  70 */             bmb1.a(☃.l, ☃, bmb1.E());
/*  71 */             bjv.b(this.b).b(☃);
/*     */ 
/*     */             
/*  74 */             bmb bmb2 = this.b.c.a(1);
/*  75 */             if (!bmb2.a()) {
/*  76 */               bjv.c(this.b);
/*     */             }
/*     */             
/*  79 */             this.a.a((☃, fx1) -> {
/*     */                   long l = ☃.T();
/*     */                   
/*     */                   if (bjv.d(this.b) != l) {
/*     */                     ☃.a((bfw)null, fx1, adq.pJ, adr.e, 1.0F, 1.0F);
/*     */                     
/*     */                     bjv.a(this.b, l);
/*     */                   } 
/*     */                 });
/*  88 */             return super.a(☃, bmb1);
/*     */           }
/*     */         });
/*     */     int i;
/*  92 */     for (i = 0; i < 3; i++) {
/*  93 */       for (int j = 0; j < 9; j++) {
/*  94 */         a(new bjr(bfv1, j + i * 9 + 9, 8 + j * 18, 84 + i * 18));
/*     */       }
/*     */     } 
/*  97 */     for (i = 0; i < 9; i++) {
/*  98 */       a(new bjr(bfv1, i, 8 + i * 18, 142));
/*     */     }
/*     */     
/* 101 */     a(this.g);
/*     */   }
/*     */   
/*     */   public int e() {
/* 105 */     return this.g.b();
/*     */   }
/*     */   
/*     */   public List<bpe> f() {
/* 109 */     return this.i;
/*     */   }
/*     */   
/*     */   public int g() {
/* 113 */     return this.i.size();
/*     */   }
/*     */   
/*     */   public boolean h() {
/* 117 */     return (this.c.f() && !this.i.isEmpty());
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(bfw ☃) {
/* 122 */     return a(this.f, ☃, bup.ma);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(bfw ☃, int i) {
/* 127 */     if (d(i)) {
/* 128 */       this.g.a(i);
/* 129 */       i();
/*     */     } 
/*     */     
/* 132 */     return true;
/*     */   }
/*     */   
/*     */   private boolean d(int ☃) {
/* 136 */     return (☃ >= 0 && ☃ < this.i.size());
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(aon ☃) {
/* 141 */     bmb bmb1 = this.c.e();
/* 142 */     if (bmb1.b() != this.j.b()) {
/* 143 */       this.j = bmb1.i();
/* 144 */       a(☃, bmb1);
/*     */     } 
/*     */   }
/*     */   
/*     */   private void a(aon ☃, bmb bmb1) {
/* 149 */     this.i.clear();
/* 150 */     this.g.a(-1);
/* 151 */     this.d.d(bmb.b);
/*     */     
/* 153 */     if (!bmb1.a()) {
/* 154 */       this.i = this.h.o().b(bot.f, ☃, this.h);
/*     */     }
/*     */   }
/*     */   
/*     */   private void i() {
/* 159 */     if (!this.i.isEmpty() && d(this.g.b())) {
/* 160 */       bpe ☃ = this.i.get(this.g.b());
/* 161 */       this.m.a(☃);
/* 162 */       this.d.d(☃.a(this.e));
/*     */     } else {
/* 164 */       this.d.d(bmb.b);
/*     */     } 
/*     */     
/* 167 */     c();
/*     */   }
/*     */ 
/*     */   
/*     */   public bje<?> a() {
/* 172 */     return bje.x;
/*     */   }
/*     */   
/*     */   public void a(Runnable ☃) {
/* 176 */     this.l = ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(bmb ☃, bjr bjr1) {
/* 181 */     return (bjr1.c != this.m && super.a(☃, bjr1));
/*     */   }
/*     */ 
/*     */   
/*     */   public bmb b(bfw ☃, int i) {
/* 186 */     bmb bmb1 = bmb.b;
/* 187 */     bjr bjr1 = this.a.get(i);
/* 188 */     if (bjr1 != null && bjr1.f()) {
/* 189 */       bmb bmb2 = bjr1.e();
/* 190 */       blx blx = bmb2.b();
/* 191 */       bmb1 = bmb2.i();
/*     */       
/* 193 */       if (i == 1) {
/* 194 */         blx.b(bmb2, ☃.l, ☃);
/* 195 */         if (!a(bmb2, 2, 38, true)) {
/* 196 */           return bmb.b;
/*     */         }
/* 198 */         bjr1.a(bmb2, bmb1);
/* 199 */       } else if (i == 0) {
/* 200 */         if (!a(bmb2, 2, 38, false)) {
/* 201 */           return bmb.b;
/*     */         }
/* 203 */       } else if (this.h.o().<apa, bpe>a(bot.f, new apa(new bmb[] { bmb2 }, ), this.h).isPresent()) {
/* 204 */         if (!a(bmb2, 0, 1, false)) {
/* 205 */           return bmb.b;
/*     */         }
/* 207 */       } else if (i >= 2 && i < 29) {
/* 208 */         if (!a(bmb2, 29, 38, false)) {
/* 209 */           return bmb.b;
/*     */         }
/* 211 */       } else if (i >= 29 && i < 38 && 
/* 212 */         !a(bmb2, 2, 29, false)) {
/* 213 */         return bmb.b;
/*     */       } 
/*     */ 
/*     */       
/* 217 */       if (bmb2.a()) {
/* 218 */         bjr1.d(bmb.b);
/*     */       }
/*     */       
/* 221 */       bjr1.d();
/*     */       
/* 223 */       if (bmb2.E() == bmb1.E()) {
/* 224 */         return bmb.b;
/*     */       }
/* 226 */       bjr1.a(☃, bmb2);
/* 227 */       c();
/*     */     } 
/*     */     
/* 230 */     return bmb1;
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(bfw ☃) {
/* 235 */     super.b(☃);
/*     */     
/* 237 */     this.m.b(1);
/* 238 */     this.f.a((brx1, fx1) -> a(☃, ☃.l, this.e));
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bjv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */