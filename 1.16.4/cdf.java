/*     */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*     */ import java.util.function.Function;
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
/*     */ public class cdf
/*     */   extends ccj
/*     */ {
/*  30 */   private final nr[] a = new nr[] { oe.d, oe.d, oe.d, oe.d };
/*     */   
/*     */   private boolean b = true;
/*     */   
/*     */   private bfw c;
/*     */   
/*  36 */   private final afa[] g = new afa[4];
/*  37 */   private bkx h = bkx.p;
/*     */   
/*     */   public cdf() {
/*  40 */     super(cck.h);
/*     */   }
/*     */ 
/*     */   
/*     */   public md a(md ☃) {
/*  45 */     super.a(☃);
/*  46 */     for (int i = 0; i < 4; i++) {
/*  47 */       String str = nr.a.a(this.a[i]);
/*  48 */       ☃.a("Text" + (i + 1), str);
/*     */     } 
/*  50 */     ☃.a("Color", this.h.c());
/*     */     
/*  52 */     return ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(ceh ☃, md md1) {
/*  57 */     this.b = false;
/*  58 */     super.a(☃, md1);
/*     */     
/*  60 */     this.h = bkx.a(md1.l("Color"), bkx.p);
/*     */     
/*  62 */     for (int i = 0; i < 4; i++) {
/*  63 */       String str = md1.l("Text" + (i + 1));
/*  64 */       nr nr1 = nr.a.a(str.isEmpty() ? "\"\"" : str);
/*  65 */       if (this.d instanceof aag) {
/*     */         try {
/*  67 */           this.a[i] = ns.a(a((aah)null), nr1, (aqa)null, 0);
/*  68 */         } catch (CommandSyntaxException commandSyntaxException) {
/*  69 */           this.a[i] = nr1;
/*     */         } 
/*     */       } else {
/*  72 */         this.a[i] = nr1;
/*     */       } 
/*  74 */       this.g[i] = null;
/*     */     } 
/*     */   }
/*     */   
/*     */   public nr a(int ☃) {
/*  79 */     return this.a[☃];
/*     */   }
/*     */   
/*     */   public void a(int ☃, nr nr1) {
/*  83 */     this.a[☃] = nr1;
/*  84 */     this.g[☃] = null;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public afa a(int ☃, Function<nr, afa> function) {
/*  89 */     if (this.g[☃] == null && this.a[☃] != null) {
/*  90 */       this.g[☃] = function.apply(this.a[☃]);
/*     */     }
/*  92 */     return this.g[☃];
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public ow a() {
/*  98 */     return new ow(this.e, 9, b());
/*     */   }
/*     */ 
/*     */   
/*     */   public md b() {
/* 103 */     return a(new md());
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean t() {
/* 108 */     return true;
/*     */   }
/*     */   
/*     */   public boolean d() {
/* 112 */     return this.b;
/*     */   }
/*     */   
/*     */   public void a(boolean ☃) {
/* 116 */     this.b = ☃;
/* 117 */     if (!☃) {
/* 118 */       this.c = null;
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(bfw ☃) {
/* 123 */     this.c = ☃;
/*     */   }
/*     */   
/*     */   public bfw f() {
/* 127 */     return this.c;
/*     */   }
/*     */   
/*     */   public boolean b(bfw ☃) {
/* 131 */     for (nr nr1 : this.a) {
/* 132 */       ob ob = (nr1 == null) ? null : nr1.c();
/* 133 */       if (ob != null && ob.h() != null) {
/*     */ 
/*     */ 
/*     */         
/* 137 */         np np = ob.h();
/* 138 */         if (np.a() == np.a.c)
/* 139 */           ☃.ch().aD().a(a((aah)☃), np.b()); 
/*     */       } 
/*     */     } 
/* 142 */     return true;
/*     */   }
/*     */   
/*     */   public db a(@Nullable aah ☃) {
/* 146 */     String str = (☃ == null) ? "Sign" : ☃.R().getString();
/* 147 */     nr nr1 = (☃ == null) ? new oe("Sign") : ☃.d();
/* 148 */     return new db(da.a_, dcn.a(this.e), dcm.a, (aag)this.d, 2, str, nr1, this.d.l(), ☃);
/*     */   }
/*     */   
/*     */   public bkx g() {
/* 152 */     return this.h;
/*     */   }
/*     */   
/*     */   public boolean a(bkx ☃) {
/* 156 */     if (☃ != g()) {
/* 157 */       this.h = ☃;
/* 158 */       X_();
/* 159 */       this.d.a(o(), p(), p(), 3);
/* 160 */       return true;
/*     */     } 
/* 162 */     return false;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cdf.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */