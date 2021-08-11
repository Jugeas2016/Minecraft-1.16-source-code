/*     */ import java.io.File;
/*     */ import javax.annotation.Nullable;
/*     */ import org.apache.commons.lang3.StringUtils;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class cyh
/*     */   implements Comparable<cyh>
/*     */ {
/*     */   private final bsa a;
/*     */   private final cyi b;
/*     */   private final String c;
/*     */   private final boolean d;
/*     */   private final boolean e;
/*     */   private final File f;
/*     */   @Nullable
/*     */   private nr g;
/*     */   
/*     */   public cyh(bsa ☃, cyi cyi1, String str, boolean bool1, boolean bool2, File file) {
/*  28 */     this.a = ☃;
/*  29 */     this.b = cyi1;
/*  30 */     this.c = str;
/*  31 */     this.e = bool2;
/*  32 */     this.f = file;
/*  33 */     this.d = bool1;
/*     */   }
/*     */   
/*     */   public String a() {
/*  37 */     return this.c;
/*     */   }
/*     */   
/*     */   public String b() {
/*  41 */     return StringUtils.isEmpty(this.a.a()) ? this.c : this.a.a();
/*     */   }
/*     */   
/*     */   public File c() {
/*  45 */     return this.f;
/*     */   }
/*     */   
/*     */   public boolean d() {
/*  49 */     return this.d;
/*     */   }
/*     */   
/*     */   public long e() {
/*  53 */     return this.b.b();
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(cyh ☃) {
/*  58 */     if (this.b.b() < ☃.b.b()) {
/*  59 */       return 1;
/*     */     }
/*  61 */     if (this.b.b() > ☃.b.b()) {
/*  62 */       return -1;
/*     */     }
/*  64 */     return this.c.compareTo(☃.c);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public bru g() {
/*  72 */     return this.a.b();
/*     */   }
/*     */   
/*     */   public boolean h() {
/*  76 */     return this.a.c();
/*     */   }
/*     */   
/*     */   public boolean i() {
/*  80 */     return this.a.e();
/*     */   }
/*     */   
/*     */   public nx j() {
/*  84 */     if (aft.b(this.b.c())) {
/*  85 */       return new of("selectWorld.versionUnknown");
/*     */     }
/*  87 */     return new oe(this.b.c());
/*     */   }
/*     */   
/*     */   public cyi k() {
/*  91 */     return this.b;
/*     */   }
/*     */   
/*     */   public boolean l() {
/*  95 */     return (m() || (!w.a().isStable() && !this.b.e()) || n());
/*     */   }
/*     */   
/*     */   public boolean m() {
/*  99 */     return (this.b.d() > w.a().getWorldVersion());
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean n() {
/* 104 */     return (this.b.d() < w.a().getWorldVersion());
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean o() {
/* 109 */     return this.e;
/*     */   }
/*     */   
/*     */   public nr p() {
/* 113 */     if (this.g == null) {
/* 114 */       this.g = q();
/*     */     }
/*     */     
/* 117 */     return this.g;
/*     */   }
/*     */   
/*     */   private nr q() {
/* 121 */     if (o()) {
/* 122 */       return (new of("selectWorld.locked")).a(k.m);
/*     */     }
/*     */     
/* 125 */     if (d()) {
/* 126 */       return new of("selectWorld.conversion");
/*     */     }
/*     */ 
/*     */ 
/*     */     
/* 131 */     nx ☃ = h() ? (new oe("")).a((new of("gameMode.hardcore")).a(k.e)) : new of("gameMode." + g().b());
/*     */     
/* 133 */     if (i()) {
/* 134 */       ☃.c(", ").a(new of("selectWorld.cheats"));
/*     */     }
/*     */     
/* 137 */     nx nx1 = j();
/* 138 */     nx nx2 = (new oe(", ")).a(new of("selectWorld.version")).c(" ");
/* 139 */     if (l()) {
/* 140 */       nx2.a(nx1.a(m() ? k.m : k.u));
/*     */     } else {
/* 142 */       nx2.a(nx1);
/*     */     } 
/* 144 */     ☃.a(nx2);
/* 145 */     return ☃;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cyh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */