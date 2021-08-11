/*     */ import java.text.DateFormat;
/*     */ import java.util.Calendar;
/*     */ import java.util.GregorianCalendar;
/*     */ import java.util.TimeZone;
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
/*     */ 
/*     */ public class dil
/*     */   extends eoo
/*     */ {
/*  28 */   private static final Logger a = LogManager.getLogger();
/*     */   
/*  30 */   private static final nr b = new of("mco.configure.world.subscription.title");
/*  31 */   private static final nr c = new of("mco.configure.world.subscription.start");
/*  32 */   private static final nr p = new of("mco.configure.world.subscription.timeleft");
/*  33 */   private static final nr q = new of("mco.configure.world.subscription.recurring.daysleft");
/*  34 */   private static final nr r = new of("mco.configure.world.subscription.expired");
/*  35 */   private static final nr s = new of("mco.configure.world.subscription.less_than_a_day");
/*  36 */   private static final nr t = new of("mco.configure.world.subscription.month");
/*  37 */   private static final nr u = new of("mco.configure.world.subscription.months");
/*  38 */   private static final nr v = new of("mco.configure.world.subscription.day");
/*  39 */   private static final nr w = new of("mco.configure.world.subscription.days");
/*     */   
/*     */   private final dot x;
/*     */   
/*     */   private final dgq y;
/*     */   
/*     */   private final dot z;
/*     */   
/*     */   private nr A;
/*     */   private String B;
/*     */   private dha.a C;
/*     */   
/*     */   public dil(dot ☃, dgq dgq1, dot dot1) {
/*  52 */     this.x = ☃;
/*  53 */     this.y = dgq1;
/*  54 */     this.z = dot1;
/*     */   }
/*     */ 
/*     */   
/*     */   public void b() {
/*  59 */     a(this.y.a);
/*     */     
/*  61 */     eoj.a(new String[] { b.getString(), c.getString(), this.B, p.getString(), this.A.getString() });
/*     */     
/*  63 */     this.i.m.a(true);
/*     */     
/*  65 */     a(new dlj(this.k / 2 - 100, j(6), 200, 20, new of("mco.configure.world.subscription.extend"), ☃ -> {
/*     */             String str = "https://aka.ms/ExtendJavaRealms?subscriptionId=" + this.y.b + "&profileId=" + this.i.J().b();
/*     */             
/*     */             this.i.m.a(str);
/*     */             x.i().a(str);
/*     */           }));
/*  71 */     a(new dlj(this.k / 2 - 100, j(12), 200, 20, nq.h, ☃ -> this.i.a(this.x)));
/*     */     
/*  73 */     if (this.y.j) {
/*  74 */       a(new dlj(this.k / 2 - 100, j(10), 200, 20, new of("mco.configure.world.delete.button"), ☃ -> {
/*     */               nr nr1 = new of("mco.configure.world.delete.question.line1");
/*     */               nr nr2 = new of("mco.configure.world.delete.question.line2");
/*     */               this.i.a(new dhy(this::c, dhy.a.a, nr1, nr2, true));
/*     */             }));
/*     */     }
/*     */   }
/*     */   
/*     */   private void c(boolean ☃) {
/*  83 */     if (☃) {
/*  84 */       (new Thread(this, "Realms-delete-realm")
/*     */         {
/*     */           public void run() {
/*     */             try {
/*  88 */               dgb ☃ = dgb.a();
/*  89 */               ☃.h((dil.a(this.a)).a);
/*  90 */             } catch (dhi ☃) {
/*  91 */               dil.a().error("Couldn't delete world");
/*  92 */               dil.a().error(☃);
/*     */             } 
/*     */             
/*  95 */             dil.b(this.a).execute(() -> dil.d(this.a).a(dil.c(this.a)));
/*     */           }
/*  97 */         }).start();
/*     */     }
/*     */     
/* 100 */     this.i.a(this);
/*     */   }
/*     */   
/*     */   private void a(long ☃) {
/* 104 */     dgb dgb = dgb.a();
/*     */     try {
/* 106 */       dha dha = dgb.g(☃);
/* 107 */       this.A = a(dha.b);
/* 108 */       this.B = b(dha.a);
/* 109 */       this.C = dha.c;
/* 110 */     } catch (dhi dhi) {
/* 111 */       a.error("Couldn't get subscription");
/* 112 */       this.i.a(new dhw(dhi, this.x));
/*     */     } 
/*     */   }
/*     */   
/*     */   private static String b(long ☃) {
/* 117 */     Calendar calendar = new GregorianCalendar(TimeZone.getDefault());
/*     */     
/* 119 */     calendar.setTimeInMillis(☃);
/* 120 */     return DateFormat.getDateTimeInstance().format(calendar.getTime());
/*     */   }
/*     */ 
/*     */   
/*     */   public void e() {
/* 125 */     this.i.m.a(false);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a(int ☃, int i, int j) {
/* 130 */     if (☃ == 256) {
/* 131 */       this.i.a(this.x);
/* 132 */       return true;
/*     */     } 
/* 134 */     return super.a(☃, i, j);
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(dfm ☃, int i, int j, float f) {
/* 139 */     a(☃);
/*     */     
/* 141 */     int k = this.k / 2 - 100;
/*     */     
/* 143 */     a(☃, this.o, b, this.k / 2, 17, 16777215);
/* 144 */     this.o.b(☃, c, k, j(0), 10526880);
/* 145 */     this.o.b(☃, this.B, k, j(1), 16777215);
/*     */     
/* 147 */     if (this.C == dha.a.a) {
/* 148 */       this.o.b(☃, p, k, j(3), 10526880);
/* 149 */     } else if (this.C == dha.a.b) {
/* 150 */       this.o.b(☃, q, k, j(3), 10526880);
/*     */     } 
/*     */     
/* 153 */     this.o.b(☃, this.A, k, j(4), 16777215);
/*     */     
/* 155 */     super.a(☃, i, j, f);
/*     */   }
/*     */   
/*     */   private nr a(int ☃) {
/* 159 */     if (☃ < 0 && this.y.j) {
/* 160 */       return r;
/*     */     }
/*     */     
/* 163 */     if (☃ <= 1) {
/* 164 */       return s;
/*     */     }
/*     */     
/* 167 */     int i = ☃ / 30;
/* 168 */     int j = ☃ % 30;
/*     */     
/* 170 */     nx nx = new oe("");
/* 171 */     if (i > 0) {
/* 172 */       nx.c(Integer.toString(i)).c(" ");
/* 173 */       if (i == 1) {
/* 174 */         nx.a(t);
/*     */       } else {
/* 176 */         nx.a(u);
/*     */       } 
/*     */     } 
/*     */     
/* 180 */     if (j > 0) {
/* 181 */       if (i > 0) {
/* 182 */         nx.c(", ");
/*     */       }
/* 184 */       nx.c(Integer.toString(j)).c(" ");
/* 185 */       if (j == 1) {
/* 186 */         nx.a(v);
/*     */       } else {
/* 188 */         nx.a(w);
/*     */       } 
/*     */     } 
/*     */     
/* 192 */     return nx;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dil.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */