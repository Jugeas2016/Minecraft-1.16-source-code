/*     */ import java.util.Collections;
/*     */ import java.util.List;
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
/*     */ public class dwz
/*     */ {
/*     */   public String a;
/*     */   public String b;
/*     */   public nr c;
/*     */   public nr d;
/*     */   public long e;
/*  20 */   public int f = w.a().getProtocolVersion();
/*  21 */   public nr g = new oe(w.a().getName());
/*     */   public boolean h;
/*  23 */   public List<nr> i = Collections.emptyList();
/*  24 */   private a j = a.c;
/*     */   @Nullable
/*     */   private String k;
/*     */   private boolean l;
/*     */   
/*     */   public dwz(String ☃, String str1, boolean bool) {
/*  30 */     this.a = ☃;
/*  31 */     this.b = str1;
/*  32 */     this.l = bool;
/*     */   }
/*     */   
/*     */   public md a() {
/*  36 */     md ☃ = new md();
/*  37 */     ☃.a("name", this.a);
/*  38 */     ☃.a("ip", this.b);
/*     */     
/*  40 */     if (this.k != null) {
/*  41 */       ☃.a("icon", this.k);
/*     */     }
/*     */     
/*  44 */     if (this.j == a.a) {
/*  45 */       ☃.a("acceptTextures", true);
/*  46 */     } else if (this.j == a.b) {
/*  47 */       ☃.a("acceptTextures", false);
/*     */     } 
/*     */     
/*  50 */     return ☃;
/*     */   }
/*     */   
/*     */   public a b() {
/*  54 */     return this.j;
/*     */   }
/*     */   
/*     */   public void a(a ☃) {
/*  58 */     this.j = ☃;
/*     */   }
/*     */   
/*     */   public static dwz a(md ☃) {
/*  62 */     dwz dwz1 = new dwz(☃.l("name"), ☃.l("ip"), false);
/*     */     
/*  64 */     if (☃.c("icon", 8)) {
/*  65 */       dwz1.a(☃.l("icon"));
/*     */     }
/*     */     
/*  68 */     if (☃.c("acceptTextures", 1)) {
/*  69 */       if (☃.q("acceptTextures")) {
/*  70 */         dwz1.a(a.a);
/*     */       } else {
/*  72 */         dwz1.a(a.b);
/*     */       } 
/*     */     } else {
/*  75 */       dwz1.a(a.c);
/*     */     } 
/*     */     
/*  78 */     return dwz1;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public String c() {
/*  83 */     return this.k;
/*     */   }
/*     */   
/*     */   public void a(@Nullable String ☃) {
/*  87 */     this.k = ☃;
/*     */   }
/*     */   
/*     */   public boolean d() {
/*  91 */     return this.l;
/*     */   }
/*     */   
/*     */   public void a(dwz ☃) {
/*  95 */     this.b = ☃.b;
/*  96 */     this.a = ☃.a;
/*  97 */     a(☃.b());
/*  98 */     this.k = ☃.k;
/*  99 */     this.l = ☃.l;
/*     */   }
/*     */   
/*     */   public enum a {
/* 103 */     a("enabled"),
/* 104 */     b("disabled"),
/* 105 */     c("prompt");
/*     */     
/*     */     private final nr d;
/*     */ 
/*     */     
/*     */     a(String ☃) {
/* 111 */       this.d = new of("addServer.resourcePack." + ☃);
/*     */     }
/*     */     
/*     */     public nr a() {
/* 115 */       return this.d;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dwz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */