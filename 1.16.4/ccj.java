/*     */ import javax.annotation.Nullable;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
/*     */ import org.apache.logging.log4j.util.Supplier;
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
/*     */ public abstract class ccj
/*     */ {
/*  19 */   private static final Logger a = LogManager.getLogger();
/*     */   
/*     */   private final cck<?> b;
/*     */   @Nullable
/*     */   protected brx d;
/*  24 */   protected fx e = fx.b;
/*     */   
/*     */   protected boolean f;
/*     */   
/*     */   @Nullable
/*     */   private ceh c;
/*     */   private boolean g;
/*     */   
/*     */   public ccj(cck<?> ☃) {
/*  33 */     this.b = ☃;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public brx v() {
/*  38 */     return this.d;
/*     */   }
/*     */   
/*     */   public void a(brx ☃, fx fx1) {
/*  42 */     this.d = ☃;
/*  43 */     this.e = fx1.h();
/*     */   }
/*     */   
/*     */   public boolean n() {
/*  47 */     return (this.d != null);
/*     */   }
/*     */   
/*     */   public void a(ceh ☃, md md1) {
/*  51 */     this.e = new fx(md1.h("x"), md1.h("y"), md1.h("z"));
/*     */   }
/*     */   
/*     */   public md a(md ☃) {
/*  55 */     return b(☃);
/*     */   }
/*     */   
/*     */   private md b(md ☃) {
/*  59 */     vk vk = cck.a(u());
/*  60 */     if (vk == null) {
/*  61 */       throw new RuntimeException(getClass() + " is missing a mapping! This is a bug!");
/*     */     }
/*  63 */     ☃.a("id", vk.toString());
/*  64 */     ☃.b("x", this.e.u());
/*  65 */     ☃.b("y", this.e.v());
/*  66 */     ☃.b("z", this.e.w());
/*     */     
/*  68 */     return ☃;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public static ccj b(ceh ☃, md md1) {
/*  73 */     String str = md1.l("id");
/*     */     
/*  75 */     return gm.W.b(new vk(str))
/*  76 */       .map(cck1 -> {
/*     */           try {
/*     */             return cck1.a();
/*  79 */           } catch (Throwable throwable) {
/*     */             a.error("Failed to create block entity {}", ☃, throwable);
/*     */             
/*     */             return null;
/*     */           } 
/*  84 */         }).map(ccj1 -> {
/*     */           try {
/*     */             ccj1.a(☃, md1);
/*     */             return ccj1;
/*  88 */           } catch (Throwable throwable) {
/*     */             a.error("Failed to load data for block entity {}", str, throwable);
/*     */             
/*     */             return null;
/*     */           } 
/*  93 */         }).orElseGet(() -> {
/*     */           a.warn("Skipping BlockEntity with id {}", ☃);
/*     */           return null;
/*     */         });
/*     */   }
/*     */   
/*     */   public void X_() {
/* 100 */     if (this.d != null) {
/* 101 */       this.c = this.d.d_(this.e);
/* 102 */       this.d.b(this.e, this);
/*     */       
/* 104 */       if (!this.c.g()) {
/* 105 */         this.d.c(this.e, this.c.b());
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public double i() {
/* 112 */     return 64.0D;
/*     */   }
/*     */   
/*     */   public fx o() {
/* 116 */     return this.e;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ceh p() {
/* 123 */     if (this.c == null) {
/* 124 */       this.c = this.d.d_(this.e);
/*     */     }
/* 126 */     return this.c;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public ow a() {
/* 131 */     return null;
/*     */   }
/*     */   
/*     */   public md b() {
/* 135 */     return b(new md());
/*     */   }
/*     */   
/*     */   public boolean q() {
/* 139 */     return this.f;
/*     */   }
/*     */   
/*     */   public void al_() {
/* 143 */     this.f = true;
/*     */   }
/*     */   
/*     */   public void r() {
/* 147 */     this.f = false;
/*     */   }
/*     */   
/*     */   public boolean a_(int ☃, int i) {
/* 151 */     return false;
/*     */   }
/*     */   
/*     */   public void s() {
/* 155 */     this.c = null;
/*     */   }
/*     */   
/*     */   public void a(m ☃) {
/* 159 */     ☃.a("Name", () -> gm.W.b(u()) + " // " + getClass().getCanonicalName());
/*     */     
/* 161 */     if (this.d == null) {
/*     */       return;
/*     */     }
/*     */     
/* 165 */     m.a(☃, this.e, p());
/*     */     
/* 167 */     m.a(☃, this.e, this.d.d_(this.e));
/*     */   }
/*     */   
/*     */   public void a(fx ☃) {
/* 171 */     this.e = ☃.h();
/*     */   }
/*     */   
/*     */   public boolean t() {
/* 175 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(bzm ☃) {}
/*     */ 
/*     */   
/*     */   public void a(byg ☃) {}
/*     */   
/*     */   public cck<?> u() {
/* 185 */     return this.b;
/*     */   }
/*     */   
/*     */   public void w() {
/* 189 */     if (this.g) {
/*     */       return;
/*     */     }
/*     */     
/* 193 */     this.g = true;
/* 194 */     a.warn("Block entity invalid: {} @ {}", new Supplier[] { () -> gm.W.b(u()), this::o });
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ccj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */