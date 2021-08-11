/*     */ import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
/*     */ import java.net.IDN;
/*     */ import java.util.function.Predicate;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class dob
/*     */   extends dot
/*     */ {
/*  18 */   private static final nr a = new of("addServer.enterName");
/*  19 */   private static final nr b = new of("addServer.enterIp");
/*     */ 
/*     */   
/*     */   private dlj c;
/*     */ 
/*     */   
/*     */   private final BooleanConsumer p;
/*     */ 
/*     */   
/*     */   private final dwz q;
/*     */ 
/*     */   
/*     */   private dlq r;
/*     */ 
/*     */   
/*     */   private dlq s;
/*     */ 
/*     */   
/*     */   private dlj t;
/*     */ 
/*     */   
/*     */   private final dot u;
/*     */ 
/*     */   
/*     */   private final Predicate<String> v;
/*     */ 
/*     */ 
/*     */   
/*     */   public dob(dot ☃, BooleanConsumer booleanConsumer, dwz dwz1) {
/*  48 */     super(new of("addServer.title")); this.v = (☃ -> { if (aft.b(☃)) return true;  String[] arrayOfString = ☃.split(":"); if (arrayOfString.length == 0)
/*  49 */           return true;  try { String str = IDN.toASCII(arrayOfString[0]); return true; } catch (IllegalArgumentException illegalArgumentException) { return false; }  }); this.u = ☃;
/*  50 */     this.p = booleanConsumer;
/*  51 */     this.q = dwz1;
/*     */   }
/*     */ 
/*     */   
/*     */   public void d() {
/*  56 */     this.s.a();
/*  57 */     this.r.a();
/*     */   }
/*     */ 
/*     */   
/*     */   protected void b() {
/*  62 */     this.i.m.a(true);
/*     */     
/*  64 */     this.s = new dlq(this.o, this.k / 2 - 100, 66, 200, 20, new of("addServer.enterName"));
/*  65 */     this.s.e(true);
/*  66 */     this.s.a(this.q.a);
/*  67 */     this.s.a(this::b);
/*  68 */     this.e.add(this.s);
/*     */     
/*  70 */     this.r = new dlq(this.o, this.k / 2 - 100, 106, 200, 20, new of("addServer.enterIp"));
/*  71 */     this.r.k(128);
/*  72 */     this.r.a(this.q.b);
/*  73 */     this.r.a(this.v);
/*  74 */     this.r.a(this::b);
/*  75 */     this.e.add(this.r);
/*     */     
/*  77 */     this.t = a(new dlj(this.k / 2 - 100, this.l / 4 + 72, 200, 20, a(this.q.b()), ☃ -> {
/*     */             this.q.a(dwz.a.values()[(this.q.b().ordinal() + 1) % (dwz.a.values()).length]);
/*     */             this.t.a(a(this.q.b()));
/*     */           }));
/*  81 */     this.c = a(new dlj(this.k / 2 - 100, this.l / 4 + 96 + 18, 200, 20, new of("addServer.add"), ☃ -> h()));
/*  82 */     a(new dlj(this.k / 2 - 100, this.l / 4 + 120 + 18, 200, 20, nq.d, ☃ -> this.p.accept(false)));
/*     */     
/*  84 */     i();
/*     */   }
/*     */   
/*     */   private static nr a(dwz.a ☃) {
/*  88 */     return (new of("addServer.resourcePack")).c(": ").a(☃.a());
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(djz ☃, int i, int j) {
/*  93 */     String str1 = this.r.b();
/*  94 */     String str2 = this.s.b();
/*  95 */     b(☃, i, j);
/*  96 */     this.r.a(str1);
/*  97 */     this.s.a(str2);
/*     */   }
/*     */   
/*     */   private void b(String ☃) {
/* 101 */     i();
/*     */   }
/*     */ 
/*     */   
/*     */   public void e() {
/* 106 */     this.i.m.a(false);
/*     */   }
/*     */   
/*     */   private void h() {
/* 110 */     this.q.a = this.s.b();
/* 111 */     this.q.b = this.r.b();
/* 112 */     this.p.accept(true);
/*     */   }
/*     */ 
/*     */   
/*     */   public void at_() {
/* 117 */     i();
/*     */     
/* 119 */     this.i.a(this.u);
/*     */   }
/*     */   
/*     */   private void i() {
/* 123 */     String ☃ = this.r.b();
/* 124 */     boolean bool = (!☃.isEmpty() && (☃.split(":")).length > 0 && ☃.indexOf(' ') == -1);
/* 125 */     this.c.o = (bool && !this.s.b().isEmpty());
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(dfm ☃, int i, int j, float f) {
/* 130 */     a(☃);
/*     */     
/* 132 */     a(☃, this.o, this.d, this.k / 2, 17, 16777215);
/* 133 */     b(☃, this.o, a, this.k / 2 - 100, 53, 10526880);
/* 134 */     b(☃, this.o, b, this.k / 2 - 100, 94, 10526880);
/*     */     
/* 136 */     this.s.a(☃, i, j, f);
/* 137 */     this.r.a(☃, i, j, f);
/*     */     
/* 139 */     super.a(☃, i, j, f);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dob.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */