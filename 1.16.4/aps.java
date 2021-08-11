/*     */ import com.google.common.collect.Maps;
/*     */ import java.util.Map;
/*     */ import java.util.UUID;
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
/*     */ public class aps
/*     */ {
/*     */   @Nullable
/*     */   public static aps a(int ☃) {
/*  25 */     return gm.P.a(☃);
/*     */   }
/*     */   
/*     */   public static int a(aps ☃) {
/*  29 */     return gm.P.a(☃);
/*     */   }
/*     */   
/*  32 */   private final Map<arg, arj> a = Maps.newHashMap();
/*     */   private final apt b;
/*     */   private final int c;
/*     */   @Nullable
/*     */   private String d;
/*     */   
/*     */   protected aps(apt ☃, int i) {
/*  39 */     this.b = ☃;
/*  40 */     this.c = i;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(aqm ☃, int i) {
/*  56 */     if (this == apw.j) {
/*  57 */       if (☃.dk() < ☃.dx()) {
/*  58 */         ☃.b(1.0F);
/*     */       }
/*  60 */     } else if (this == apw.s) {
/*  61 */       if (☃.dk() > 1.0F) {
/*  62 */         ☃.a(apk.o, 1.0F);
/*     */       }
/*  64 */     } else if (this == apw.t) {
/*  65 */       ☃.a(apk.p, 1.0F);
/*  66 */     } else if (this == apw.q && ☃ instanceof bfw) {
/*     */ 
/*     */       
/*  69 */       ((bfw)☃).t(0.005F * (i + 1));
/*  70 */     } else if (this == apw.w && ☃ instanceof bfw) {
/*  71 */       if (!☃.l.v) {
/*  72 */         ((bfw)☃).eI().a(i + 1, 1.0F);
/*     */       }
/*  74 */     } else if ((this == apw.f && !☃.dj()) || (this == apw.g && ☃.dj())) {
/*  75 */       ☃.b(Math.max(4 << i, 0));
/*  76 */     } else if ((this == apw.g && !☃.dj()) || (this == apw.f && ☃.dj())) {
/*  77 */       ☃.a(apk.o, (6 << i));
/*     */     } 
/*     */   }
/*     */   
/*     */   public void a(@Nullable aqa ☃, @Nullable aqa aqa1, aqm aqm1, int i, double d) {
/*  82 */     if ((this == apw.f && !aqm1.dj()) || (this == apw.g && aqm1.dj())) {
/*  83 */       int j = (int)(d * (4 << i) + 0.5D);
/*  84 */       aqm1.b(j);
/*  85 */     } else if ((this == apw.g && !aqm1.dj()) || (this == apw.f && aqm1.dj())) {
/*  86 */       int j = (int)(d * (6 << i) + 0.5D);
/*  87 */       if (☃ == null) {
/*  88 */         aqm1.a(apk.o, j);
/*     */       } else {
/*  90 */         aqm1.a(apk.c(☃, aqa1), j);
/*     */       } 
/*     */     } else {
/*  93 */       a(aqm1, i);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a(int ☃, int i) {
/* 108 */     if (this == apw.j) {
/* 109 */       int j = 50 >> i;
/* 110 */       if (j > 0) {
/* 111 */         return (☃ % j == 0);
/*     */       }
/* 113 */       return true;
/* 114 */     }  if (this == apw.s) {
/* 115 */       int j = 25 >> i;
/* 116 */       if (j > 0) {
/* 117 */         return (☃ % j == 0);
/*     */       }
/* 119 */       return true;
/* 120 */     }  if (this == apw.t) {
/* 121 */       int j = 40 >> i;
/* 122 */       if (j > 0) {
/* 123 */         return (☃ % j == 0);
/*     */       }
/* 125 */       return true;
/* 126 */     }  if (this == apw.q) {
/* 127 */       return true;
/*     */     }
/*     */     
/* 130 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean a() {
/* 135 */     return false;
/*     */   }
/*     */   
/*     */   protected String b() {
/* 139 */     if (this.d == null) {
/* 140 */       this.d = x.a("effect", gm.P.b(this));
/*     */     }
/* 142 */     return this.d;
/*     */   }
/*     */   
/*     */   public String c() {
/* 146 */     return b();
/*     */   }
/*     */   
/*     */   public nr d() {
/* 150 */     return new of(c());
/*     */   }
/*     */   
/*     */   public apt e() {
/* 154 */     return this.b;
/*     */   }
/*     */   
/*     */   public int f() {
/* 158 */     return this.c;
/*     */   }
/*     */   
/*     */   public aps a(arg ☃, String str, double d, arj.a a1) {
/* 162 */     arj arj = new arj(UUID.fromString(str), this::c, d, a1);
/* 163 */     this.a.put(☃, arj);
/* 164 */     return this;
/*     */   }
/*     */   
/*     */   public Map<arg, arj> g() {
/* 168 */     return this.a;
/*     */   }
/*     */   
/*     */   public void a(aqm ☃, ari ari1, int i) {
/* 172 */     for (Map.Entry<arg, arj> entry : this.a.entrySet()) {
/* 173 */       arh arh = ari1.a(entry.getKey());
/*     */       
/* 175 */       if (arh != null) {
/* 176 */         arh.d(entry.getValue());
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   public void b(aqm ☃, ari ari1, int i) {
/* 182 */     for (Map.Entry<arg, arj> entry : this.a.entrySet()) {
/* 183 */       arh arh = ari1.a(entry.getKey());
/*     */       
/* 185 */       if (arh != null) {
/* 186 */         arj arj = entry.getValue();
/* 187 */         arh.d(arj);
/* 188 */         arh.c(new arj(arj.a(), c() + " " + i, a(i, arj), arj.c()));
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public double a(int ☃, arj arj1) {
/* 194 */     return arj1.d() * (☃ + 1);
/*     */   }
/*     */   
/*     */   public boolean h() {
/* 198 */     return (this.b == apt.a);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\aps.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */