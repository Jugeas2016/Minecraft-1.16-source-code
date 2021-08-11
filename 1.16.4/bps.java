/*     */ import com.google.common.collect.Maps;
/*     */ import java.util.Map;
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
/*     */ public abstract class bps
/*     */ {
/*     */   private final aqf[] a;
/*     */   private final a d;
/*     */   public final bpt b;
/*     */   @Nullable
/*     */   protected String c;
/*     */   
/*     */   @Nullable
/*     */   public static bps c(int ☃) {
/*  25 */     return gm.R.a(☃);
/*     */   }
/*     */   
/*     */   public enum a {
/*  29 */     a(10),
/*  30 */     b(5),
/*  31 */     c(2),
/*  32 */     d(1);
/*     */     
/*     */     private final int e;
/*     */     
/*     */     a(int ☃) {
/*  37 */       this.e = ☃;
/*     */     }
/*     */     
/*     */     public int a() {
/*  41 */       return this.e;
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected bps(a ☃, bpt bpt1, aqf[] arrayOfAqf) {
/*  52 */     this.d = ☃;
/*  53 */     this.b = bpt1;
/*  54 */     this.a = arrayOfAqf;
/*     */   }
/*     */   
/*     */   public Map<aqf, bmb> a(aqm ☃) {
/*  58 */     Map<aqf, bmb> map = Maps.newEnumMap(aqf.class);
/*  59 */     for (aqf aqf1 : this.a) {
/*  60 */       bmb bmb = ☃.b(aqf1);
/*  61 */       if (!bmb.a()) {
/*  62 */         map.put(aqf1, bmb);
/*     */       }
/*     */     } 
/*  65 */     return map;
/*     */   }
/*     */   
/*     */   public a d() {
/*  69 */     return this.d;
/*     */   }
/*     */   
/*     */   public int e() {
/*  73 */     return 1;
/*     */   }
/*     */   
/*     */   public int a() {
/*  77 */     return 1;
/*     */   }
/*     */   
/*     */   public int a(int ☃) {
/*  81 */     return 1 + ☃ * 10;
/*     */   }
/*     */   
/*     */   public int b(int ☃) {
/*  85 */     return a(☃) + 5;
/*     */   }
/*     */   
/*     */   public int a(int ☃, apk apk1) {
/*  89 */     return 0;
/*     */   }
/*     */   
/*     */   public float a(int ☃, aqq aqq1) {
/*  93 */     return 0.0F;
/*     */   }
/*     */   
/*     */   public final boolean b(bps ☃) {
/*  97 */     return (a(☃) && ☃.a(this));
/*     */   }
/*     */   
/*     */   protected boolean a(bps ☃) {
/* 101 */     return (this != ☃);
/*     */   }
/*     */   
/*     */   protected String f() {
/* 105 */     if (this.c == null) {
/* 106 */       this.c = x.a("enchantment", gm.R.b(this));
/*     */     }
/* 108 */     return this.c;
/*     */   }
/*     */   
/*     */   public String g() {
/* 112 */     return f();
/*     */   }
/*     */   
/*     */   public nr d(int ☃) {
/* 116 */     nx nx = new of(g());
/* 117 */     if (c()) {
/* 118 */       nx.a(k.m);
/*     */     } else {
/* 120 */       nx.a(k.h);
/*     */     } 
/* 122 */     if (☃ != 1 || a() != 1) {
/* 123 */       nx.c(" ").a(new of("enchantment.level." + ☃));
/*     */     }
/* 125 */     return nx;
/*     */   }
/*     */   
/*     */   public boolean a(bmb ☃) {
/* 129 */     return this.b.a(☃.b());
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(aqm ☃, aqa aqa1, int i) {}
/*     */ 
/*     */   
/*     */   public void b(aqm ☃, aqa aqa1, int i) {}
/*     */   
/*     */   public boolean b() {
/* 139 */     return false;
/*     */   }
/*     */   
/*     */   public boolean c() {
/* 143 */     return false;
/*     */   }
/*     */   public boolean h() {
/* 146 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean i() {
/* 154 */     return true;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\bps.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */