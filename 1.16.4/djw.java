/*     */ import com.google.common.collect.Maps;
/*     */ import com.google.common.collect.Sets;
/*     */ import java.util.HashMap;
/*     */ import java.util.Map;
/*     */ import java.util.Set;
/*     */ import java.util.function.Supplier;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class djw
/*     */   implements Comparable<djw>
/*     */ {
/*  16 */   private static final Map<String, djw> a = Maps.newHashMap();
/*  17 */   private static final Map<deo.a, djw> b = Maps.newHashMap();
/*  18 */   private static final Set<String> c = Sets.newHashSet();
/*     */   
/*     */   private static final Map<String, Integer> d;
/*     */   private final String e;
/*     */   private final deo.a f;
/*     */   private final String g;
/*     */   private deo.a h;
/*     */   private boolean i;
/*     */   private int j;
/*     */   
/*     */   static {
/*  29 */     d = x.<Map<String, Integer>>a(Maps.newHashMap(), ☃ -> {
/*     */           ☃.put("key.categories.movement", Integer.valueOf(1));
/*     */           ☃.put("key.categories.gameplay", Integer.valueOf(2));
/*     */           ☃.put("key.categories.inventory", Integer.valueOf(3));
/*     */           ☃.put("key.categories.creative", Integer.valueOf(4));
/*     */           ☃.put("key.categories.multiplayer", Integer.valueOf(5));
/*     */           ☃.put("key.categories.ui", Integer.valueOf(6));
/*     */           ☃.put("key.categories.misc", Integer.valueOf(7));
/*     */         });
/*     */   }
/*     */   public static void a(deo.a ☃) {
/*  40 */     djw djw1 = b.get(☃);
/*  41 */     if (djw1 != null) {
/*  42 */       djw1.j++;
/*     */     }
/*     */   }
/*     */   
/*     */   public static void a(deo.a ☃, boolean bool) {
/*  47 */     djw djw1 = b.get(☃);
/*  48 */     if (djw1 != null) {
/*  49 */       djw1.a(bool);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public static void a() {
/*  55 */     for (djw ☃ : a.values()) {
/*  56 */       if (☃.h.a() == deo.b.a && ☃.h.b() != deo.a.b()) {
/*  57 */         ☃.a(deo.a(djz.C().aD().i(), ☃.h.b()));
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   public static void b() {
/*  63 */     for (djw ☃ : a.values()) {
/*  64 */       ☃.m();
/*     */     }
/*     */   }
/*     */   
/*     */   public static void c() {
/*  69 */     b.clear();
/*  70 */     for (djw ☃ : a.values()) {
/*  71 */       b.put(☃.h, ☃);
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
/*     */   public djw(String ☃, int i, String str1) {
/*  83 */     this(☃, deo.b.a, i, str1);
/*     */   }
/*     */   
/*     */   public djw(String ☃, deo.b b1, int i, String str1) {
/*  87 */     this.e = ☃;
/*  88 */     this.h = b1.a(i);
/*  89 */     this.f = this.h;
/*  90 */     this.g = str1;
/*     */     
/*  92 */     a.put(☃, this);
/*  93 */     b.put(this.h, this);
/*  94 */     c.add(str1);
/*     */   }
/*     */   
/*     */   public boolean d() {
/*  98 */     return this.i;
/*     */   }
/*     */   
/*     */   public String e() {
/* 102 */     return this.g;
/*     */   }
/*     */   
/*     */   public boolean f() {
/* 106 */     if (this.j == 0) {
/* 107 */       return false;
/*     */     }
/* 109 */     this.j--;
/* 110 */     return true;
/*     */   }
/*     */   
/*     */   private void m() {
/* 114 */     this.j = 0;
/* 115 */     a(false);
/*     */   }
/*     */   
/*     */   public String g() {
/* 119 */     return this.e;
/*     */   }
/*     */   
/*     */   public deo.a h() {
/* 123 */     return this.f;
/*     */   }
/*     */   
/*     */   public void b(deo.a ☃) {
/* 127 */     this.h = ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public int a(djw ☃) {
/* 132 */     if (this.g.equals(☃.g)) {
/* 133 */       return ekx.a(this.e, new Object[0]).compareTo(ekx.a(☃.e, new Object[0]));
/*     */     }
/* 135 */     return ((Integer)d.get(this.g)).compareTo(d.get(☃.g));
/*     */   }
/*     */   
/*     */   public static Supplier<nr> a(String ☃) {
/* 139 */     djw djw1 = a.get(☃);
/* 140 */     if (djw1 == null) {
/* 141 */       return () -> new of(☃);
/*     */     }
/* 143 */     return djw1::j;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean b(djw ☃) {
/* 148 */     return this.h.equals(☃.h);
/*     */   }
/*     */   
/*     */   public boolean i() {
/* 152 */     return this.h.equals(deo.a);
/*     */   }
/*     */   
/*     */   public boolean a(int ☃, int i) {
/* 156 */     if (☃ == deo.a.b()) {
/* 157 */       return (this.h.a() == deo.b.b && this.h.b() == i);
/*     */     }
/* 159 */     return (this.h.a() == deo.b.a && this.h.b() == ☃);
/*     */   }
/*     */   
/*     */   public boolean a(int ☃) {
/* 163 */     return (this.h.a() == deo.b.c && this.h.b() == ☃);
/*     */   }
/*     */   
/*     */   public nr j() {
/* 167 */     return this.h.d();
/*     */   }
/*     */   
/*     */   public boolean k() {
/* 171 */     return this.h.equals(this.f);
/*     */   }
/*     */   
/*     */   public String l() {
/* 175 */     return this.h.c();
/*     */   }
/*     */   
/*     */   public void a(boolean ☃) {
/* 179 */     this.i = ☃;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\djw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */