/*     */ import java.util.Locale;
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
/*     */ public class dho
/*     */   extends eoo
/*     */ {
/*     */   private final dot a;
/*     */   private final dgg b;
/*     */   private a c;
/*     */   
/*     */   public dho(dot ☃, dgg dgg1) {
/*  26 */     this.a = ☃;
/*  27 */     this.b = dgg1;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void d() {}
/*     */ 
/*     */   
/*     */   public void b() {
/*  36 */     this.i.m.a(true);
/*     */     
/*  38 */     a(new dlj(this.k / 2 - 100, this.l / 4 + 120 + 24, 200, 20, nq.h, ☃ -> this.i.a(this.a)));
/*     */ 
/*     */ 
/*     */     
/*  42 */     this.c = new a(this, this.i);
/*  43 */     d(this.c);
/*  44 */     c(this.c);
/*     */   }
/*     */ 
/*     */   
/*     */   public void e() {
/*  49 */     this.i.m.a(false);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(int ☃, int i, int j) {
/*  54 */     if (☃ == 256) {
/*  55 */       this.i.a(this.a);
/*  56 */       return true;
/*     */     } 
/*  58 */     return super.a(☃, i, j);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(dfm ☃, int i, int j, float f) {
/*  63 */     a(☃);
/*     */     
/*  65 */     a(☃, this.o, "Changes from last backup", this.k / 2, 10, 16777215);
/*     */     
/*  67 */     this.c.a(☃, i, j, f);
/*     */     
/*  69 */     super.a(☃, i, j, f);
/*     */   }
/*     */   
/*     */   private nr a(String ☃, String str1) {
/*  73 */     String str = ☃.toLowerCase(Locale.ROOT);
/*  74 */     if (str.contains("game") && str.contains("mode"))
/*  75 */       return c(str1); 
/*  76 */     if (str.contains("game") && str.contains("difficulty")) {
/*  77 */       return b(str1);
/*     */     }
/*  79 */     return new oe(str1);
/*     */   }
/*     */   
/*     */   private nr b(String ☃) {
/*     */     try {
/*  84 */       return dik.a[Integer.parseInt(☃)];
/*  85 */     } catch (Exception exception) {
/*  86 */       return new oe("UNKNOWN");
/*     */     } 
/*     */   }
/*     */   
/*     */   private nr c(String ☃) {
/*     */     try {
/*  92 */       return dik.b[Integer.parseInt(☃)];
/*  93 */     } catch (Exception exception) {
/*  94 */       return new oe("UNKNOWN");
/*     */     } 
/*     */   }
/*     */   
/*     */   class b extends dlv.a<b> {
/*     */     private final String b;
/*     */     private final String c;
/*     */     
/*     */     public b(dho this$0, String ☃, String str1) {
/* 103 */       this.b = ☃;
/* 104 */       this.c = str1;
/*     */     }
/*     */ 
/*     */     
/*     */     public void a(dfm ☃, int i, int j, int k, int m, int n, int i1, int i2, boolean bool, float f) {
/* 109 */       dku dku = (dho.a(this.a)).g;
/* 110 */       dkw.b(☃, dku, this.b, k, j, 10526880);
/* 111 */       dkw.b(☃, dku, dho.a(this.a, this.b, this.c), k, j + 12, 16777215);
/*     */     }
/*     */   }
/*     */   
/*     */   class a extends dlv<b> {
/*     */     public a(dho this$0, djz ☃) {
/* 117 */       super(☃, this$0.k, this$0.l, 32, this$0.l - 64, 36);
/* 118 */       a(false);
/* 119 */       if ((dho.b(this$0)).e != null)
/* 120 */         (dho.b(this$0)).e.forEach((☃, str1) -> b(new dho.b(this.a, ☃, str1))); 
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dho.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */