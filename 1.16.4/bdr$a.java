/*     */ import java.util.EnumSet;
/*     */ import java.util.List;
/*     */ import java.util.Random;
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
/*     */ public class a<T extends bdr>
/*     */   extends avv
/*     */ {
/*     */   private final T a;
/*     */   private final double b;
/*     */   private final double c;
/*     */   private long d;
/*     */   
/*     */   public a(T ☃, double d1, double d2) {
/* 159 */     this.a = ☃;
/* 160 */     this.b = d1;
/* 161 */     this.c = d2;
/* 162 */     this.d = -1L;
/* 163 */     a(EnumSet.of(avv.a.a));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a() {
/* 168 */     boolean ☃ = (((bdr)this.a).l.T() < this.d);
/* 169 */     return (this.a.eV() && this.a.A() == null && !this.a.bs() && this.a.eP() && !☃);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void c() {}
/*     */ 
/*     */ 
/*     */   
/*     */   public void d() {}
/*     */ 
/*     */   
/*     */   public void e() {
/* 182 */     boolean ☃ = this.a.eS();
/* 183 */     ayj ayj = this.a.x();
/* 184 */     if (ayj.m()) {
/* 185 */       List<bdr> list = g();
/* 186 */       if (this.a.eV() && list.isEmpty()) {
/* 187 */         this.a.u(false);
/* 188 */       } else if (!☃ || !this.a.eO().a(this.a.cA(), 10.0D)) {
/* 189 */         dcn dcn1 = dcn.c(this.a.eO());
/*     */ 
/*     */         
/* 192 */         dcn dcn2 = this.a.cA();
/* 193 */         dcn dcn3 = dcn2.d(dcn1);
/*     */         
/* 195 */         dcn1 = dcn3.b(90.0F).a(0.4D).e(dcn1);
/*     */         
/* 197 */         dcn dcn4 = dcn1.d(dcn2).d().a(10.0D).e(dcn2);
/* 198 */         fx fx = new fx(dcn4);
/* 199 */         fx = ((bdr)this.a).l.a(chn.a.f, fx);
/*     */         
/* 201 */         if (!ayj.a(fx.u(), fx.v(), fx.w(), ☃ ? this.c : this.b)) {
/*     */           
/* 203 */           h();
/* 204 */           this.d = ((bdr)this.a).l.T() + 200L;
/* 205 */         } else if (☃) {
/* 206 */           for (bdr bdr1 : list) {
/* 207 */             bdr1.g(fx);
/*     */           }
/*     */         } 
/*     */       } else {
/* 211 */         this.a.eU();
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   private List<bdr> g() {
/* 217 */     return ((bdr)this.a).l.a(bdr.class, this.a.cc().g(16.0D), ☃ -> (☃.eT() && !☃.s((aqa)this.a)));
/*     */   }
/*     */   
/*     */   private boolean h() {
/* 221 */     Random ☃ = this.a.cY();
/* 222 */     fx fx = ((bdr)this.a).l.a(chn.a.f, this.a.cB().b(-8 + ☃.nextInt(16), 0, -8 + ☃.nextInt(16)));
/* 223 */     return this.a.x().a(fx.u(), fx.v(), fx.w(), this.b);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bdr$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */