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
/*     */ public abstract class bks
/*     */ {
/*  15 */   public static final bks[] a = new bks[12];
/*  16 */   public static final bks b = (new bks(0, "buildingBlocks")
/*     */     {
/*     */       public bmb e() {
/*  19 */         return new bmb(bup.bG);
/*     */       }
/*  21 */     }).b("building_blocks");
/*  22 */   public static final bks c = new bks(1, "decorations")
/*     */     {
/*     */       public bmb e() {
/*  25 */         return new bmb(bup.gX);
/*     */       }
/*     */     };
/*  28 */   public static final bks d = new bks(2, "redstone")
/*     */     {
/*     */       public bmb e() {
/*  31 */         return new bmb(bmd.lP);
/*     */       }
/*     */     };
/*  34 */   public static final bks e = new bks(3, "transportation")
/*     */     {
/*     */       public bmb e() {
/*  37 */         return new bmb(bup.aN);
/*     */       }
/*     */     };
/*  40 */   public static final bks f = new bks(6, "misc")
/*     */     {
/*     */       public bmb e() {
/*  43 */         return new bmb(bmd.lM);
/*     */       }
/*     */     };
/*  46 */   public static final bks g = (new bks(5, "search")
/*     */     {
/*     */       public bmb e() {
/*  49 */         return new bmb(bmd.mh);
/*     */       }
/*  51 */     }).a("item_search.png");
/*     */   
/*  53 */   public static final bks h = new bks(7, "food")
/*     */     {
/*     */       public bmb e() {
/*  56 */         return new bmb(bmd.kb);
/*     */       }
/*     */     };
/*  59 */   public static final bks i = (new bks(8, "tools")
/*     */     {
/*     */       public bmb e() {
/*  62 */         return new bmb(bmd.kD);
/*     */       }
/*  64 */     }).a(new bpt[] { bpt.n, bpt.g, bpt.h, bpt.j });
/*  65 */   public static final bks j = (new bks(9, "combat")
/*     */     {
/*     */       public bmb e() {
/*  68 */         return new bmb(bmd.kv);
/*     */       }
/*  70 */     }).a(new bpt[] { bpt.n, bpt.a, bpt.b, bpt.e, bpt.c, bpt.d, bpt.k, bpt.f, bpt.l, bpt.j, 
/*  71 */         bpt.i, bpt.m }); public static final bks k = new bks(10, "brewing")
/*     */     {
/*     */       public bmb e() {
/*  74 */         return bnv.a(new bmb(bmd.nv), bnw.b);
/*     */       }
/*     */     };
/*  77 */   public static final bks l = f;
/*  78 */   public static final bks m = new bks(4, "hotbar")
/*     */     {
/*     */       public bmb e() {
/*  81 */         return new bmb(bup.bI);
/*     */       }
/*     */ 
/*     */       
/*     */       public void a(gj<bmb> ☃) {
/*  86 */         throw new RuntimeException("Implement exception client-side.");
/*     */       }
/*     */ 
/*     */       
/*     */       public boolean m() {
/*  91 */         return true;
/*     */       }
/*     */     };
/*  94 */   public static final bks n = (new bks(11, "inventory")
/*     */     {
/*     */       public bmb e() {
/*  97 */         return new bmb(bup.bR);
/*     */       }
/*  99 */     }).a("inventory.png").j().h();
/*     */   
/*     */   private final int o;
/*     */   private final String p;
/*     */   private final nr q;
/*     */   private String r;
/* 105 */   private String s = "items.png";
/*     */   private boolean t = true;
/*     */   private boolean u = true;
/* 108 */   private bpt[] v = new bpt[0];
/*     */   private bmb w;
/*     */   
/*     */   public bks(int ☃, String str) {
/* 112 */     this.o = ☃;
/* 113 */     this.p = str;
/* 114 */     this.q = new of("itemGroup." + str);
/* 115 */     this.w = bmb.b;
/*     */     
/* 117 */     a[☃] = this;
/*     */   }
/*     */   
/*     */   public int a() {
/* 121 */     return this.o;
/*     */   }
/*     */   
/*     */   public String b() {
/* 125 */     return (this.r == null) ? this.p : this.r;
/*     */   }
/*     */   
/*     */   public nr c() {
/* 129 */     return this.q;
/*     */   }
/*     */   
/*     */   public bmb d() {
/* 133 */     if (this.w.a()) {
/* 134 */       this.w = e();
/*     */     }
/* 136 */     return this.w;
/*     */   }
/*     */   
/*     */   public abstract bmb e();
/*     */   
/*     */   public String f() {
/* 142 */     return this.s;
/*     */   }
/*     */   
/*     */   public bks a(String ☃) {
/* 146 */     this.s = ☃;
/* 147 */     return this;
/*     */   }
/*     */   
/*     */   public bks b(String ☃) {
/* 151 */     this.r = ☃;
/* 152 */     return this;
/*     */   }
/*     */   
/*     */   public boolean g() {
/* 156 */     return this.u;
/*     */   }
/*     */   
/*     */   public bks h() {
/* 160 */     this.u = false;
/* 161 */     return this;
/*     */   }
/*     */   
/*     */   public boolean i() {
/* 165 */     return this.t;
/*     */   }
/*     */   
/*     */   public bks j() {
/* 169 */     this.t = false;
/* 170 */     return this;
/*     */   }
/*     */   
/*     */   public int k() {
/* 174 */     return this.o % 6;
/*     */   }
/*     */   
/*     */   public boolean l() {
/* 178 */     return (this.o < 6);
/*     */   }
/*     */   
/*     */   public boolean m() {
/* 182 */     return (k() == 5);
/*     */   }
/*     */   
/*     */   public bpt[] n() {
/* 186 */     return this.v;
/*     */   }
/*     */   
/*     */   public bks a(bpt... ☃) {
/* 190 */     this.v = ☃;
/* 191 */     return this;
/*     */   }
/*     */   
/*     */   public boolean a(@Nullable bpt ☃) {
/* 195 */     if (☃ != null) {
/* 196 */       for (bpt bpt1 : this.v) {
/* 197 */         if (bpt1 == ☃) {
/* 198 */           return true;
/*     */         }
/*     */       } 
/*     */     }
/*     */     
/* 203 */     return false;
/*     */   }
/*     */   
/*     */   public void a(gj<bmb> ☃) {
/* 207 */     for (blx blx : gm.T)
/* 208 */       blx.a(this, ☃); 
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bks.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */