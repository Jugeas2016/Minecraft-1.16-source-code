/*     */ import com.mojang.datafixers.util.Pair;
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
/*     */ 
/*     */ 
/*     */ public class biz
/*     */   extends bjj<bio>
/*     */ {
/*  29 */   public static final vk c = new vk("textures/atlas/blocks.png");
/*     */   
/*  31 */   public static final vk d = new vk("item/empty_armor_slot_helmet");
/*  32 */   public static final vk e = new vk("item/empty_armor_slot_chestplate");
/*  33 */   public static final vk f = new vk("item/empty_armor_slot_leggings");
/*  34 */   public static final vk g = new vk("item/empty_armor_slot_boots");
/*  35 */   public static final vk h = new vk("item/empty_armor_slot_shield");
/*     */ 
/*     */   
/*  38 */   private static final vk[] j = new vk[] { g, f, e, d };
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  45 */   private static final aqf[] k = new aqf[] { aqf.f, aqf.e, aqf.d, aqf.c };
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  52 */   private final bio l = new bio(this, 2, 2);
/*  53 */   private final bjm m = new bjm();
/*     */   public final boolean i;
/*     */   private final bfw n;
/*     */   
/*     */   public biz(bfv ☃, boolean bool, bfw bfw1) {
/*  58 */     super((bje<?>)null, 0);
/*  59 */     this.i = bool;
/*  60 */     this.n = bfw1;
/*  61 */     a(new bjn(☃.e, this.l, this.m, 0, 154, 28));
/*     */     int i;
/*  63 */     for (i = 0; i < 2; i++) {
/*  64 */       for (int j = 0; j < 2; j++) {
/*  65 */         a(new bjr(this.l, j + i * 2, 98 + j * 18, 18 + i * 18));
/*     */       }
/*     */     } 
/*     */     
/*  69 */     for (i = 0; i < 4; i++) {
/*  70 */       aqf aqf1 = k[i];
/*  71 */       a(new bjr(this, ☃, 39 - i, 8, 8 + i * 18, aqf1)
/*     */           {
/*     */             public int a() {
/*  74 */               return 1;
/*     */             }
/*     */ 
/*     */             
/*     */             public boolean a(bmb ☃) {
/*  79 */               return (this.a == aqn.j(☃));
/*     */             }
/*     */ 
/*     */             
/*     */             public boolean a(bfw ☃) {
/*  84 */               bmb bmb = e();
/*  85 */               if (!bmb.a() && !☃.b_() && bpu.d(bmb)) {
/*  86 */                 return false;
/*     */               }
/*  88 */               return super.a(☃);
/*     */             }
/*     */ 
/*     */             
/*     */             public Pair<vk, vk> c() {
/*  93 */               return Pair.of(biz.c, biz.k()[this.a.b()]);
/*     */             }
/*     */           });
/*     */     } 
/*  97 */     for (i = 0; i < 3; i++) {
/*  98 */       for (int j = 0; j < 9; j++) {
/*  99 */         a(new bjr(☃, j + (i + 1) * 9, 8 + j * 18, 84 + i * 18));
/*     */       }
/*     */     } 
/* 102 */     for (i = 0; i < 9; i++) {
/* 103 */       a(new bjr(☃, i, 8 + i * 18, 142));
/*     */     }
/*     */     
/* 106 */     a(new bjr(this, ☃, 40, 77, 62)
/*     */         {
/*     */           public Pair<vk, vk> c() {
/* 109 */             return Pair.of(biz.c, biz.h);
/*     */           }
/*     */         });
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(bfy ☃) {
/* 116 */     this.l.a(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public void e() {
/* 121 */     this.m.Y_();
/* 122 */     this.l.Y_();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(boq<? super bio> ☃) {
/* 127 */     return ☃.a(this.l, this.n.l);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(aon ☃) {
/* 134 */     bip.a(this.b, this.n.l, this.n, this.l, this.m);
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(bfw ☃) {
/* 139 */     super.b(☃);
/*     */     
/* 141 */     this.m.Y_();
/*     */     
/* 143 */     if (☃.l.v) {
/*     */       return;
/*     */     }
/*     */     
/* 147 */     a(☃, ☃.l, this.l);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(bfw ☃) {
/* 152 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public bmb b(bfw ☃, int i) {
/* 157 */     bmb bmb = bmb.b;
/* 158 */     bjr bjr = this.a.get(i);
/* 159 */     if (bjr != null && bjr.f()) {
/* 160 */       bmb bmb1 = bjr.e();
/* 161 */       bmb = bmb1.i();
/*     */       
/* 163 */       aqf aqf1 = aqn.j(bmb);
/*     */       
/* 165 */       if (i == 0) {
/* 166 */         if (!a(bmb1, 9, 45, true)) {
/* 167 */           return bmb.b;
/*     */         }
/* 169 */         bjr.a(bmb1, bmb);
/* 170 */       } else if (i >= 1 && i < 5) {
/* 171 */         if (!a(bmb1, 9, 45, false)) {
/* 172 */           return bmb.b;
/*     */         }
/* 174 */       } else if (i >= 5 && i < 9) {
/* 175 */         if (!a(bmb1, 9, 45, false)) {
/* 176 */           return bmb.b;
/*     */         }
/* 178 */       } else if (aqf1.a() == aqf.a.b && !((bjr)this.a.get(8 - aqf1.b())).f()) {
/* 179 */         int j = 8 - aqf1.b();
/* 180 */         if (!a(bmb1, j, j + 1, false)) {
/* 181 */           return bmb.b;
/*     */         }
/* 183 */       } else if (aqf1 == aqf.b && !((bjr)this.a.get(45)).f()) {
/* 184 */         if (!a(bmb1, 45, 46, false)) {
/* 185 */           return bmb.b;
/*     */         }
/* 187 */       } else if (i >= 9 && i < 36) {
/* 188 */         if (!a(bmb1, 36, 45, false)) {
/* 189 */           return bmb.b;
/*     */         }
/* 191 */       } else if (i >= 36 && i < 45) {
/* 192 */         if (!a(bmb1, 9, 36, false)) {
/* 193 */           return bmb.b;
/*     */         }
/*     */       }
/* 196 */       else if (!a(bmb1, 9, 45, false)) {
/* 197 */         return bmb.b;
/*     */       } 
/*     */       
/* 200 */       if (bmb1.a()) {
/* 201 */         bjr.d(bmb.b);
/*     */       } else {
/* 203 */         bjr.d();
/*     */       } 
/* 205 */       if (bmb1.E() == bmb.E())
/*     */       {
/* 207 */         return bmb.b;
/*     */       }
/* 209 */       bmb bmb2 = bjr.a(☃, bmb1);
/* 210 */       if (i == 0) {
/* 211 */         ☃.a(bmb2, false);
/*     */       }
/*     */     } 
/*     */     
/* 215 */     return bmb;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(bmb ☃, bjr bjr1) {
/* 220 */     return (bjr1.c != this.m && super.a(☃, bjr1));
/*     */   }
/*     */ 
/*     */   
/*     */   public int f() {
/* 225 */     return 0;
/*     */   }
/*     */ 
/*     */   
/*     */   public int g() {
/* 230 */     return this.l.g();
/*     */   }
/*     */ 
/*     */   
/*     */   public int h() {
/* 235 */     return this.l.f();
/*     */   }
/*     */ 
/*     */   
/*     */   public int i() {
/* 240 */     return 5;
/*     */   }
/*     */   
/*     */   public bio j() {
/* 244 */     return this.l;
/*     */   }
/*     */ 
/*     */   
/*     */   public bjk m() {
/* 249 */     return bjk.a;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\biz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */