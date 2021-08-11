/*     */ import com.google.common.collect.Lists;
/*     */ import java.text.DateFormat;
/*     */ import java.text.SimpleDateFormat;
/*     */ import java.util.Arrays;
/*     */ import java.util.Date;
/*     */ import java.util.List;
/*     */ import java.util.stream.Collectors;
/*     */ import javax.annotation.Nullable;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class dih
/*     */   extends eoo
/*     */ {
/*  31 */   private static final Logger a = LogManager.getLogger();
/*     */   
/*  33 */   private static final nr b = new of("selectWorld.world");
/*  34 */   private static final nr c = new of("selectWorld.conversion");
/*  35 */   private static final nr p = (new of("mco.upload.hardcore")).a(k.e);
/*  36 */   private static final nr q = new of("selectWorld.cheats");
/*     */   
/*  38 */   private static final DateFormat r = new SimpleDateFormat();
/*     */   
/*     */   private final dif s;
/*     */   
/*     */   private final long t;
/*     */   
/*     */   private final int u;
/*     */   private dlj v;
/*  46 */   private List<cyh> w = Lists.newArrayList();
/*  47 */   private int x = -1;
/*     */   
/*     */   private b y;
/*     */   private eom z;
/*     */   private eom A;
/*     */   private eom B;
/*     */   private final Runnable C;
/*     */   
/*     */   public dih(long ☃, int i, dif dif1, Runnable runnable) {
/*  56 */     this.s = dif1;
/*  57 */     this.t = ☃;
/*  58 */     this.u = i;
/*  59 */     this.C = runnable;
/*     */   }
/*     */ 
/*     */   
/*     */   private void h() throws Exception {
/*  64 */     this
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*  72 */       .w = (List<cyh>)this.i.k().b().stream().sorted((☃, cyh1) -> (☃.e() < cyh1.e()) ? 1 : ((☃.e() > cyh1.e()) ? -1 : ☃.a().compareTo(cyh1.a()))).collect(Collectors.toList());
/*     */     
/*  74 */     for (cyh ☃ : this.w) {
/*  75 */       this.y.a(☃);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void b() {
/*  81 */     this.i.m.a(true);
/*  82 */     this.y = new b(this);
/*     */     
/*     */     try {
/*  85 */       h();
/*  86 */     } catch (Exception ☃) {
/*  87 */       a.error("Couldn't load level list", ☃);
/*  88 */       this.i.a(new dhw(new oe("Unable to load worlds"), nr.a(☃.getMessage()), this.s));
/*     */       
/*     */       return;
/*     */     } 
/*  92 */     d(this.y);
/*     */     
/*  94 */     this.v = a(new dlj(this.k / 2 - 154, this.l - 32, 153, 20, new of("mco.upload.button.name"), ☃ -> i()));
/*     */     
/*  96 */     this.v.o = (this.x >= 0 && this.x < this.w.size());
/*     */     
/*  98 */     a(new dlj(this.k / 2 + 6, this.l - 32, 153, 20, nq.h, ☃ -> this.i.a(this.s)));
/*     */ 
/*     */ 
/*     */     
/* 102 */     this.z = d(new eom(new of("mco.upload.select.world.title"), this.k / 2, 13, 16777215));
/* 103 */     this.A = d(new eom(new of("mco.upload.select.world.subtitle"), this.k / 2, j(-1), 10526880));
/* 104 */     if (this.w.isEmpty()) {
/* 105 */       this.B = d(new eom(new of("mco.upload.select.world.none"), this.k / 2, this.l / 2 - 20, 16777215));
/*     */     } else {
/* 107 */       this.B = null;
/*     */     } 
/* 109 */     A();
/*     */   }
/*     */ 
/*     */   
/*     */   public void e() {
/* 114 */     this.i.m.a(false);
/*     */   }
/*     */   
/*     */   private void i() {
/* 118 */     if (this.x != -1 && !((cyh)this.w.get(this.x)).h()) {
/* 119 */       cyh ☃ = this.w.get(this.x);
/* 120 */       this.i.a(new din(this.t, this.u, this.s, ☃, this.C));
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(dfm ☃, int i, int j, float f) {
/* 126 */     a(☃);
/*     */     
/* 128 */     this.y.a(☃, i, j, f);
/*     */     
/* 130 */     this.z.a(this, ☃);
/* 131 */     this.A.a(this, ☃);
/*     */     
/* 133 */     if (this.B != null) {
/* 134 */       this.B.a(this, ☃);
/*     */     }
/*     */     
/* 137 */     super.a(☃, i, j, f);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(int ☃, int i, int j) {
/* 142 */     if (☃ == 256) {
/* 143 */       this.i.a(this.s);
/* 144 */       return true;
/*     */     } 
/* 146 */     return super.a(☃, i, j);
/*     */   }
/*     */   
/*     */   class b extends eon<a> {
/*     */     public b(dih this$0) {
/* 151 */       super(this$0.k, this$0.l, dih.a(0), this$0.l - 40, 36);
/*     */     }
/*     */     
/*     */     public void a(cyh ☃) {
/* 155 */       a(new dih.a(this.a, ☃));
/*     */     }
/*     */ 
/*     */     
/*     */     public int c() {
/* 160 */       return dih.a(this.a).size() * 36;
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean b() {
/* 165 */       return (this.a.aw_() == this);
/*     */     }
/*     */ 
/*     */     
/*     */     public void a(dfm ☃) {
/* 170 */       this.a.a(☃);
/*     */     }
/*     */ 
/*     */     
/*     */     public void a(int ☃) {
/* 175 */       j(☃);
/* 176 */       if (☃ != -1) {
/* 177 */         cyh cyh = dih.a(this.a).get(☃);
/* 178 */         String str1 = ekx.a("narrator.select.list.position", new Object[] { Integer.valueOf(☃ + 1), Integer.valueOf(dih.a(this.a).size()) });
/* 179 */         String str2 = eoj.b(Arrays.asList(new String[] { cyh.b(), dih.a(cyh), dih.b(cyh).getString(), str1 }));
/* 180 */         eoj.a(ekx.a("narrator.select", new Object[] { str2 }));
/*     */       } 
/*     */     }
/*     */ 
/*     */     
/*     */     public void a(@Nullable dih.a ☃) {
/* 186 */       super.a(☃);
/*     */       
/* 188 */       dih.a(this.a, au_().indexOf(☃));
/* 189 */       (dih.b(this.a)).o = (dih.c(this.a) >= 0 && dih.c(this.a) < l() && !((cyh)dih.a(this.a).get(dih.c(this.a))).h());
/*     */     }
/*     */   }
/*     */   
/*     */   class a
/*     */     extends dlv.a<a> {
/*     */     private final cyh b;
/*     */     private final String c;
/*     */     private final String d;
/*     */     private final nr e;
/*     */     
/*     */     public a(dih this$0, cyh ☃) {
/* 201 */       this.b = ☃;
/* 202 */       this.c = ☃.b();
/* 203 */       this.d = ☃.a() + " (" + dih.a(☃) + ")";
/*     */       
/* 205 */       if (☃.d()) {
/* 206 */         this.e = dih.a();
/*     */       } else {
/*     */         nr nr1;
/* 209 */         if (☃.h()) {
/* 210 */           nr1 = dih.c();
/*     */         } else {
/* 212 */           nr1 = dih.b(☃);
/*     */         } 
/*     */         
/* 215 */         if (☃.i()) {
/* 216 */           nr1 = nr1.e().c(", ").a(dih.f());
/*     */         }
/*     */         
/* 219 */         this.e = nr1;
/*     */       } 
/*     */     }
/*     */ 
/*     */     
/*     */     public void a(dfm ☃, int i, int j, int k, int m, int n, int i1, int i2, boolean bool, float f) {
/* 225 */       a(☃, this.b, i, k, j);
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean a(double ☃, double d1, int i) {
/* 230 */       dih.d(this.a).a(dih.a(this.a).indexOf(this.b));
/* 231 */       return true;
/*     */     }
/*     */     
/*     */     protected void a(dfm ☃, cyh cyh1, int i, int j, int k) {
/*     */       String str;
/* 236 */       if (this.c.isEmpty()) {
/* 237 */         str = dih.g() + " " + (i + 1);
/*     */       } else {
/* 239 */         str = this.c;
/*     */       } 
/*     */       
/* 242 */       dih.e(this.a).b(☃, str, (j + 2), (k + 1), 16777215);
/* 243 */       dih.f(this.a).b(☃, this.d, (j + 2), (k + 12), 8421504);
/* 244 */       dih.g(this.a).b(☃, this.e, (j + 2), (k + 12 + 10), 8421504);
/*     */     }
/*     */   }
/*     */   
/*     */   private static nr c(cyh ☃) {
/* 249 */     return ☃.g().c();
/*     */   }
/*     */   
/*     */   private static String d(cyh ☃) {
/* 253 */     return r.format(new Date(☃.e()));
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dih.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */