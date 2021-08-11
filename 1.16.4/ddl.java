/*     */ import com.google.common.collect.Sets;
/*     */ import java.util.Collection;
/*     */ import java.util.Set;
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
/*     */ public class ddl
/*     */   extends ddp
/*     */ {
/*     */   private final ddn a;
/*     */   private final String b;
/*  24 */   private final Set<String> c = Sets.newHashSet();
/*     */   private nr d;
/*  26 */   private nr e = oe.d;
/*  27 */   private nr f = oe.d;
/*     */   private boolean g = true;
/*     */   private boolean h = true;
/*  30 */   private ddp.b i = ddp.b.a;
/*  31 */   private ddp.b j = ddp.b.a;
/*  32 */   private k k = k.v;
/*  33 */   private ddp.a l = ddp.a.a;
/*     */   private final ob m;
/*     */   
/*     */   public ddl(ddn ☃, String str) {
/*  37 */     this.a = ☃;
/*  38 */     this.b = str;
/*  39 */     this.d = new oe(str);
/*     */     
/*  41 */     this
/*     */       
/*  43 */       .m = ob.a.a(str).a(new nv((nv.a)nv.a.a, (T)new oe(str)));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String b() {
/*  52 */     return this.b;
/*     */   }
/*     */   
/*     */   public nr c() {
/*  56 */     return this.d;
/*     */   }
/*     */   
/*     */   public nx d() {
/*  60 */     nx ☃ = ns.a(this.d.e().c(this.m));
/*     */     
/*  62 */     k k1 = n();
/*  63 */     if (k1 != k.v) {
/*  64 */       ☃.a(k1);
/*     */     }
/*     */     
/*  67 */     return ☃;
/*     */   }
/*     */   
/*     */   public void a(nr ☃) {
/*  71 */     if (☃ == null) {
/*  72 */       throw new IllegalArgumentException("Name cannot be null");
/*     */     }
/*  74 */     this.d = ☃;
/*  75 */     this.a.b(this);
/*     */   }
/*     */   
/*     */   public void b(@Nullable nr ☃) {
/*  79 */     this.e = (☃ == null) ? oe.d : ☃;
/*  80 */     this.a.b(this);
/*     */   }
/*     */   
/*     */   public nr e() {
/*  84 */     return this.e;
/*     */   }
/*     */   
/*     */   public void c(@Nullable nr ☃) {
/*  88 */     this.f = (☃ == null) ? oe.d : ☃;
/*  89 */     this.a.b(this);
/*     */   }
/*     */   
/*     */   public nr f() {
/*  93 */     return this.f;
/*     */   }
/*     */ 
/*     */   
/*     */   public Collection<String> g() {
/*  98 */     return this.c;
/*     */   }
/*     */ 
/*     */   
/*     */   public nx d(nr ☃) {
/* 103 */     nx nx = (new oe("")).a(this.e).a(☃).a(this.f);
/*     */     
/* 105 */     k k1 = n();
/* 106 */     if (k1 != k.v) {
/* 107 */       nx.a(k1);
/*     */     }
/*     */     
/* 110 */     return nx;
/*     */   }
/*     */   
/*     */   public static nx a(@Nullable ddp ☃, nr nr1) {
/* 114 */     if (☃ == null) {
/* 115 */       return nr1.e();
/*     */     }
/* 117 */     return ☃.d(nr1);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean h() {
/* 122 */     return this.g;
/*     */   }
/*     */   
/*     */   public void a(boolean ☃) {
/* 126 */     this.g = ☃;
/* 127 */     this.a.b(this);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean i() {
/* 132 */     return this.h;
/*     */   }
/*     */   
/*     */   public void b(boolean ☃) {
/* 136 */     this.h = ☃;
/* 137 */     this.a.b(this);
/*     */   }
/*     */ 
/*     */   
/*     */   public ddp.b j() {
/* 142 */     return this.i;
/*     */   }
/*     */ 
/*     */   
/*     */   public ddp.b k() {
/* 147 */     return this.j;
/*     */   }
/*     */   
/*     */   public void a(ddp.b ☃) {
/* 151 */     this.i = ☃;
/* 152 */     this.a.b(this);
/*     */   }
/*     */   
/*     */   public void b(ddp.b ☃) {
/* 156 */     this.j = ☃;
/* 157 */     this.a.b(this);
/*     */   }
/*     */ 
/*     */   
/*     */   public ddp.a l() {
/* 162 */     return this.l;
/*     */   }
/*     */   
/*     */   public void a(ddp.a ☃) {
/* 166 */     this.l = ☃;
/* 167 */     this.a.b(this);
/*     */   }
/*     */   
/*     */   public int m() {
/* 171 */     int ☃ = 0;
/*     */     
/* 173 */     if (h()) {
/* 174 */       ☃ |= 0x1;
/*     */     }
/* 176 */     if (i()) {
/* 177 */       ☃ |= 0x2;
/*     */     }
/*     */     
/* 180 */     return ☃;
/*     */   }
/*     */   
/*     */   public void a(int ☃) {
/* 184 */     a(((☃ & 0x1) > 0));
/* 185 */     b(((☃ & 0x2) > 0));
/*     */   }
/*     */   
/*     */   public void a(k ☃) {
/* 189 */     this.k = ☃;
/* 190 */     this.a.b(this);
/*     */   }
/*     */ 
/*     */   
/*     */   public k n() {
/* 195 */     return this.k;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ddl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */