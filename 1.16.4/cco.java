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
/*     */ public class cco
/*     */   extends ccj
/*     */ {
/*     */   private boolean a;
/*     */   private boolean b;
/*     */   private boolean c;
/*     */   private boolean g;
/*     */   private final bqy h;
/*     */   
/*     */   public cco() {
/*  26 */     super(cck.v);
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
/* 163 */     this.h = new bqy(this)
/*     */       {
/*     */         public void a(String ☃) {
/* 166 */           super.a(☃);
/* 167 */           this.b.X_();
/*     */         }
/*     */ 
/*     */         
/*     */         public aag d() {
/* 172 */           return (aag)this.b.d;
/*     */         }
/*     */ 
/*     */         
/*     */         public void e() {
/* 177 */           ceh ☃ = this.b.d.d_(this.b.e);
/* 178 */           d().a(this.b.e, ☃, ☃, 3);
/*     */         }
/*     */ 
/*     */         
/*     */         public dcn f() {
/* 183 */           return dcn.a(this.b.e);
/*     */         }
/*     */ 
/*     */         
/*     */         public db h() {
/* 188 */           return new db(this, dcn.a(this.b.e), dcm.a, d(), 2, l().getString(), l(), d().l(), null);
/*     */         }
/*     */       };
/*     */   }
/*     */   
/*     */   public md a(md ☃) {
/*     */     super.a(☃);
/*     */     this.h.a(☃);
/*     */     ☃.a("powered", f());
/*     */     ☃.a("conditionMet", j());
/*     */     ☃.a("auto", g());
/*     */     return ☃;
/*     */   }
/*     */   
/*     */   public void a(ceh ☃, md md1) {
/*     */     super.a(☃, md1);
/*     */     this.h.b(md1);
/*     */     this.a = md1.q("powered");
/*     */     this.c = md1.q("conditionMet");
/*     */     b(md1.q("auto"));
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public ow a() {
/*     */     if (l()) {
/*     */       c(false);
/*     */       md ☃ = a(new md());
/*     */       return new ow(this.e, 2, ☃);
/*     */     } 
/*     */     return null;
/*     */   }
/*     */   
/*     */   public boolean t() {
/*     */     return true;
/*     */   }
/*     */   
/*     */   public bqy d() {
/*     */     return this.h;
/*     */   }
/*     */   
/*     */   public void a(boolean ☃) {
/*     */     this.a = ☃;
/*     */   }
/*     */   
/*     */   public boolean f() {
/*     */     return this.a;
/*     */   }
/*     */   
/*     */   public boolean g() {
/*     */     return this.b;
/*     */   }
/*     */   
/*     */   public void b(boolean ☃) {
/*     */     boolean bool = this.b;
/*     */     this.b = ☃;
/*     */     if (!bool && ☃ && !this.a && this.d != null && m() != a.a)
/*     */       y(); 
/*     */   }
/*     */   
/*     */   public void h() {
/*     */     a ☃ = m();
/*     */     if (☃ == a.b && (this.a || this.b) && this.d != null)
/*     */       y(); 
/*     */   }
/*     */   
/*     */   private void y() {
/*     */     buo ☃ = p().b();
/*     */     if (☃ instanceof bvi) {
/*     */       k();
/*     */       this.d.J().a(this.e, ☃, 1);
/*     */     } 
/*     */   }
/*     */   
/*     */   public boolean j() {
/*     */     return this.c;
/*     */   }
/*     */   
/*     */   public boolean k() {
/*     */     this.c = true;
/*     */     if (x()) {
/*     */       fx ☃ = this.e.a(((gc)this.d.d_(this.e).c(bvi.a)).f());
/*     */       if (this.d.d_(☃).b() instanceof bvi) {
/*     */         ccj ccj1 = this.d.c(☃);
/*     */         this.c = (ccj1 instanceof cco && ((cco)ccj1).d().i() > 0);
/*     */       } else {
/*     */         this.c = false;
/*     */       } 
/*     */     } 
/*     */     return this.c;
/*     */   }
/*     */   
/*     */   public boolean l() {
/*     */     return this.g;
/*     */   }
/*     */   
/*     */   public void c(boolean ☃) {
/*     */     this.g = ☃;
/*     */   }
/*     */   
/*     */   public a m() {
/*     */     ceh ☃ = p();
/*     */     if (☃.a(bup.er))
/*     */       return a.c; 
/*     */     if (☃.a(bup.iG))
/*     */       return a.b; 
/*     */     if (☃.a(bup.iH))
/*     */       return a.a; 
/*     */     return a.c;
/*     */   }
/*     */   
/*     */   public boolean x() {
/*     */     ceh ☃ = this.d.d_(o());
/*     */     if (☃.b() instanceof bvi)
/*     */       return ((Boolean)☃.c(bvi.b)).booleanValue(); 
/*     */     return false;
/*     */   }
/*     */   
/*     */   public void r() {
/*     */     s();
/*     */     super.r();
/*     */   }
/*     */   
/*     */   public enum a {
/*     */     a, b, c;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cco.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */