/*     */ import java.util.List;
/*     */ import java.util.Random;
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
/*     */ public abstract class buv
/*     */   extends bwn
/*     */ {
/*  31 */   public static final cey a = cex.w;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  39 */   protected static final ddh b = buo.a(6.0D, 14.0D, 5.0D, 10.0D, 16.0D, 11.0D);
/*  40 */   protected static final ddh c = buo.a(5.0D, 14.0D, 6.0D, 11.0D, 16.0D, 10.0D);
/*  41 */   protected static final ddh d = buo.a(6.0D, 0.0D, 5.0D, 10.0D, 2.0D, 11.0D);
/*  42 */   protected static final ddh e = buo.a(5.0D, 0.0D, 6.0D, 11.0D, 2.0D, 10.0D);
/*  43 */   protected static final ddh f = buo.a(5.0D, 6.0D, 14.0D, 11.0D, 10.0D, 16.0D);
/*  44 */   protected static final ddh g = buo.a(5.0D, 6.0D, 0.0D, 11.0D, 10.0D, 2.0D);
/*  45 */   protected static final ddh h = buo.a(14.0D, 6.0D, 5.0D, 16.0D, 10.0D, 11.0D);
/*  46 */   protected static final ddh i = buo.a(0.0D, 6.0D, 5.0D, 2.0D, 10.0D, 11.0D);
/*     */   
/*  48 */   protected static final ddh j = buo.a(6.0D, 15.0D, 5.0D, 10.0D, 16.0D, 11.0D);
/*  49 */   protected static final ddh k = buo.a(5.0D, 15.0D, 6.0D, 11.0D, 16.0D, 10.0D);
/*  50 */   protected static final ddh o = buo.a(6.0D, 0.0D, 5.0D, 10.0D, 1.0D, 11.0D);
/*  51 */   protected static final ddh p = buo.a(5.0D, 0.0D, 6.0D, 11.0D, 1.0D, 10.0D);
/*  52 */   protected static final ddh q = buo.a(5.0D, 6.0D, 15.0D, 11.0D, 10.0D, 16.0D);
/*  53 */   protected static final ddh r = buo.a(5.0D, 6.0D, 0.0D, 11.0D, 10.0D, 1.0D);
/*  54 */   protected static final ddh s = buo.a(15.0D, 6.0D, 5.0D, 16.0D, 10.0D, 11.0D);
/*  55 */   protected static final ddh t = buo.a(0.0D, 6.0D, 5.0D, 1.0D, 10.0D, 11.0D);
/*     */   
/*     */   private final boolean v;
/*     */ 
/*     */   
/*     */   protected buv(boolean ☃, ceg.c c1) {
/*  61 */     super(c1);
/*  62 */     j(((ceh)this.n.b()).a(aq, gc.c).a(a, Boolean.valueOf(false)).a(u, cet.b));
/*  63 */     this.v = ☃;
/*     */   }
/*     */   
/*     */   private int c() {
/*  67 */     return this.v ? 30 : 20;
/*     */   }
/*     */ 
/*     */   
/*     */   public ddh b(ceh ☃, brc brc1, fx fx1, dcs dcs1) {
/*  72 */     gc gc = (gc)☃.c(aq);
/*  73 */     boolean bool = ((Boolean)☃.c(a)).booleanValue();
/*     */     
/*  75 */     switch (null.b[((cet)☃.c(u)).ordinal()]) {
/*     */       case 1:
/*  77 */         if (gc.n() == gc.a.a) {
/*  78 */           return bool ? o : d;
/*     */         }
/*  80 */         return bool ? p : e;
/*     */       
/*     */       case 2:
/*  83 */         switch (null.a[gc.ordinal()]) {
/*     */           case 1:
/*  85 */             return bool ? t : i;
/*     */           case 2:
/*  87 */             return bool ? s : h;
/*     */           case 3:
/*  89 */             return bool ? r : g;
/*     */         } 
/*     */         
/*  92 */         return bool ? q : f;
/*     */     } 
/*     */ 
/*     */     
/*  96 */     if (gc.n() == gc.a.a) {
/*  97 */       return bool ? j : b;
/*     */     }
/*  99 */     return bool ? k : c;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public aou a(ceh ☃, brx brx1, fx fx1, bfw bfw1, aot aot1, dcj dcj1) {
/* 106 */     if (((Boolean)☃.c(a)).booleanValue()) {
/* 107 */       return aou.b;
/*     */     }
/* 109 */     d(☃, brx1, fx1);
/* 110 */     a(bfw1, brx1, fx1, true);
/* 111 */     return aou.a(brx1.v);
/*     */   }
/*     */   
/*     */   public void d(ceh ☃, brx brx1, fx fx1) {
/* 115 */     brx1.a(fx1, ☃.a(a, Boolean.valueOf(true)), 3);
/* 116 */     f(☃, brx1, fx1);
/* 117 */     brx1.J().a(fx1, this, c());
/*     */   }
/*     */   
/*     */   protected void a(@Nullable bfw ☃, bry bry1, fx fx1, boolean bool) {
/* 121 */     bry1.a(bool ? ☃ : null, fx1, a(bool), adr.e, 0.3F, bool ? 0.6F : 0.5F);
/*     */   }
/*     */ 
/*     */   
/*     */   protected abstract adp a(boolean paramBoolean);
/*     */   
/*     */   public void a(ceh ☃, brx brx1, fx fx1, ceh ceh1, boolean bool) {
/* 128 */     if (bool || ☃.a(ceh1.b())) {
/*     */       return;
/*     */     }
/* 131 */     if (((Boolean)☃.c(a)).booleanValue()) {
/* 132 */       f(☃, brx1, fx1);
/*     */     }
/* 134 */     super.a(☃, brx1, fx1, ceh1, bool);
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(ceh ☃, brc brc1, fx fx1, gc gc1) {
/* 139 */     return ((Boolean)☃.c(a)).booleanValue() ? 15 : 0;
/*     */   }
/*     */ 
/*     */   
/*     */   public int b(ceh ☃, brc brc1, fx fx1, gc gc1) {
/* 144 */     if (((Boolean)☃.c(a)).booleanValue() && h(☃) == gc1) {
/* 145 */       return 15;
/*     */     }
/* 147 */     return 0;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean b_(ceh ☃) {
/* 152 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(ceh ☃, aag aag1, fx fx1, Random random) {
/* 157 */     if (!((Boolean)☃.c(a)).booleanValue()) {
/*     */       return;
/*     */     }
/*     */     
/* 161 */     if (this.v) {
/* 162 */       e(☃, aag1, fx1);
/*     */     } else {
/* 164 */       aag1.a(fx1, ☃.a(a, Boolean.valueOf(false)), 3);
/*     */       
/* 166 */       f(☃, aag1, fx1);
/*     */       
/* 168 */       a((bfw)null, aag1, fx1, false);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(ceh ☃, brx brx1, fx fx1, aqa aqa1) {
/* 174 */     if (brx1.v || !this.v || ((Boolean)☃.c(a)).booleanValue()) {
/*     */       return;
/*     */     }
/*     */     
/* 178 */     e(☃, brx1, fx1);
/*     */   }
/*     */   
/*     */   private void e(ceh ☃, brx brx1, fx fx1) {
/* 182 */     List<? extends aqa> list = brx1.a((Class)bga.class, ☃.j(brx1, fx1).a().a(fx1));
/* 183 */     boolean bool1 = !list.isEmpty();
/* 184 */     boolean bool2 = ((Boolean)☃.c(a)).booleanValue();
/*     */     
/* 186 */     if (bool1 != bool2) {
/* 187 */       brx1.a(fx1, ☃.a(a, Boolean.valueOf(bool1)), 3);
/* 188 */       f(☃, brx1, fx1);
/* 189 */       a((bfw)null, brx1, fx1, bool1);
/*     */     } 
/*     */     
/* 192 */     if (bool1) {
/* 193 */       brx1.J().a(new fx(fx1), this, c());
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   private void f(ceh ☃, brx brx1, fx fx1) {
/* 199 */     brx1.b(fx1, this);
/* 200 */     brx1.b(fx1.a(h(☃).f()), this);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(cei.a<buo, ceh> ☃) {
/* 205 */     ☃.a((cfj<?>[])new cfj[] { aq, a, u });
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\buv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */