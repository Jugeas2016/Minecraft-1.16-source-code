/*     */ import com.google.common.collect.Maps;
/*     */ import java.util.EnumSet;
/*     */ import java.util.Map;
/*     */ import java.util.Random;
/*     */ import java.util.function.Predicate;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class bef
/*     */   extends bcy
/*     */ {
/*     */   private static final Predicate<aor> b;
/*     */   private boolean bo;
/*     */   
/*     */   static {
/*  53 */     b = (☃ -> (☃ == aor.c || ☃ == aor.d));
/*     */   }
/*     */ 
/*     */   
/*     */   public bef(aqe<? extends bef> ☃, brx brx1) {
/*  58 */     super((aqe)☃, brx1);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void o() {
/*  63 */     super.o();
/*     */     
/*  65 */     this.bk.a(0, new avp(this));
/*  66 */     this.bk.a(1, new a(this));
/*  67 */     this.bk.a(2, new bcy.b(this, this));
/*  68 */     this.bk.a(3, new bhc.a(this, this, 10.0F));
/*  69 */     this.bk.a(4, new c(this, this));
/*  70 */     this.bl.a(1, (new axp(this, new Class[] { bhc.class })).a(new Class[0]));
/*  71 */     this.bl.a(2, new axq<>(this, bfw.class, true));
/*  72 */     this.bl.a(3, new axq<>(this, bfe.class, true));
/*  73 */     this.bl.a(3, new axq<>(this, bai.class, true));
/*  74 */     this.bl.a(4, new b(this));
/*  75 */     this.bk.a(8, new awt(this, 0.6D));
/*  76 */     this.bk.a(9, new awd(this, (Class)bfw.class, 3.0F, 1.0F));
/*  77 */     this.bk.a(10, new awd(this, (Class)aqn.class, 8.0F));
/*     */   }
/*     */   
/*     */   class c extends awf {
/*     */     public c(bef this$0, bef ☃) {
/*  82 */       super(☃, 1.0D, false);
/*     */     }
/*     */ 
/*     */     
/*     */     protected double a(aqm ☃) {
/*  87 */       if (this.a.ct() instanceof bdv) {
/*     */         
/*  89 */         float f = this.a.ct().cy() - 0.1F;
/*  90 */         return (f * 2.0F * f * 2.0F + ☃.cy());
/*     */       } 
/*  92 */       return super.a(☃);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   protected void N() {
/*  98 */     if (!eD() && 
/*  99 */       azi.a(this)) {
/* 100 */       boolean ☃ = ((aag)this.l).c_(cB());
/* 101 */       ((ayi)x()).a(☃);
/*     */     } 
/*     */ 
/*     */     
/* 105 */     super.N();
/*     */   }
/*     */   
/*     */   public static ark.a eK() {
/* 109 */     return bdq.eR()
/* 110 */       .a(arl.d, 0.3499999940395355D)
/* 111 */       .a(arl.b, 12.0D)
/* 112 */       .a(arl.a, 24.0D)
/* 113 */       .a(arl.f, 5.0D);
/*     */   }
/*     */ 
/*     */   
/*     */   public void b(md ☃) {
/* 118 */     super.b(☃);
/*     */     
/* 120 */     if (this.bo) {
/* 121 */       ☃.a("Johnny", true);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public bcy.a m() {
/* 127 */     if (eF())
/* 128 */       return bcy.a.b; 
/* 129 */     if (fd()) {
/* 130 */       return bcy.a.g;
/*     */     }
/* 132 */     return bcy.a.a;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(md ☃) {
/* 137 */     super.a(☃);
/*     */     
/* 139 */     if (☃.c("Johnny", 99)) {
/* 140 */       this.bo = ☃.q("Johnny");
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public adp eL() {
/* 146 */     return adq.qn;
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public arc a(bsk ☃, aos aos1, aqp aqp1, @Nullable arc arc1, @Nullable md md1) {
/* 152 */     arc arc2 = super.a(☃, aos1, aqp1, arc1, md1);
/*     */     
/* 154 */     ((ayi)x()).a(true);
/*     */     
/* 156 */     a(aos1);
/* 157 */     b(aos1);
/*     */     
/* 159 */     return arc2;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void a(aos ☃) {
/* 164 */     if (fa() == null) {
/* 165 */       a(aqf.a, new bmb(bmd.kD));
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean r(aqa ☃) {
/* 171 */     if (super.r(☃)) {
/* 172 */       return true;
/*     */     }
/* 174 */     if (☃ instanceof aqm && ((aqm)☃).dC() == aqq.d)
/*     */     {
/* 176 */       return (bG() == null && ☃.bG() == null);
/*     */     }
/* 178 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(@Nullable nr ☃) {
/* 183 */     super.a(☃);
/* 184 */     if (!this.bo && ☃ != null && ☃.getString().equals("Johnny")) {
/* 185 */       this.bo = true;
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   protected adp I() {
/* 191 */     return adq.qm;
/*     */   }
/*     */ 
/*     */   
/*     */   protected adp dq() {
/* 196 */     return adq.qo;
/*     */   }
/*     */ 
/*     */   
/*     */   protected adp e(apk ☃) {
/* 201 */     return adq.qp;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(int ☃, boolean bool) {
/* 206 */     bmb bmb = new bmb(bmd.kD);
/* 207 */     bhb bhb = fa();
/* 208 */     int i = 1;
/* 209 */     if (☃ > bhb.a(aor.c)) {
/* 210 */       i = 2;
/*     */     }
/*     */     
/* 213 */     boolean bool1 = (this.J.nextFloat() <= bhb.w());
/* 214 */     if (bool1) {
/* 215 */       Map<bps, Integer> map = Maps.newHashMap();
/* 216 */       map.put(bpw.m, Integer.valueOf(i));
/* 217 */       bpu.a(map, bmb);
/*     */     } 
/*     */     
/* 220 */     a(aqf.a, bmb);
/*     */   }
/*     */   
/*     */   static class a extends avg {
/*     */     public a(aqn ☃) {
/* 225 */       super(☃, 6, bef.eM());
/* 226 */       a(EnumSet.of(avv.a.a));
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean b() {
/* 231 */       bef ☃ = (bef)this.d;
/* 232 */       return (☃.fb() && super.b());
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean a() {
/* 237 */       bef ☃ = (bef)this.d;
/* 238 */       return (☃.fb() && bef.a(☃).nextInt(10) == 0 && super.a());
/*     */     }
/*     */ 
/*     */     
/*     */     public void c() {
/* 243 */       super.c();
/* 244 */       this.d.n(0);
/*     */     }
/*     */   }
/*     */   
/*     */   static class b extends axq<aqm> {
/*     */     public b(bef ☃) {
/* 250 */       super(☃, aqm.class, 0, true, true, aqm::ei);
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean a() {
/* 255 */       return (bef.b((bef)this.e) && super.a());
/*     */     }
/*     */ 
/*     */     
/*     */     public void c() {
/* 260 */       super.c();
/* 261 */       this.e.n(0);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bef.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */