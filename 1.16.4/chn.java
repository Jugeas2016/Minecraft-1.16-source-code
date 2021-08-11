/*     */ import com.google.common.collect.Maps;
/*     */ import com.mojang.serialization.Codec;
/*     */ import it.unimi.dsi.fastutil.objects.ObjectArrayList;
/*     */ import it.unimi.dsi.fastutil.objects.ObjectListIterator;
/*     */ import java.util.HashMap;
/*     */ import java.util.Map;
/*     */ import java.util.Set;
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
/*     */ public class chn
/*     */ {
/*     */   private static final Predicate<ceh> a;
/*     */   private static final Predicate<ceh> b;
/*     */   
/*     */   static {
/*  24 */     a = (☃ -> !☃.g());
/*  25 */     b = (☃ -> ☃.c().c());
/*     */   }
/*     */   
/*  28 */   public enum b { a,
/*  29 */     b,
/*  30 */     c; }
/*     */ 
/*     */   
/*     */   public enum a
/*     */     implements afs {
/*  35 */     a("WORLD_SURFACE_WG", chn.b.a, (String)chn.b()),
/*  36 */     b("WORLD_SURFACE", chn.b.c, (String)chn.b()),
/*  37 */     c("OCEAN_FLOOR_WG", chn.b.a, (String)chn.c()),
/*  38 */     d("OCEAN_FLOOR", chn.b.b, (String)chn.c()), e("OCEAN_FLOOR", chn.b.b, (String)chn.c()), f("OCEAN_FLOOR", chn.b.b, (String)chn.c()); public static final Codec<a> g; private final String h; static {
/*  39 */       e = new a("MOTION_BLOCKING", 4, "MOTION_BLOCKING", chn.b.c, ☃ -> (☃.c().c() || !☃.m().c()));
/*  40 */       f = new a("MOTION_BLOCKING_NO_LEAVES", 5, "MOTION_BLOCKING_NO_LEAVES", chn.b.b, ☃ -> ((☃.c().c() || !☃.m().c()) && !(☃.b() instanceof bxx)));
/*     */     }
/*     */     private final chn.b i; private final Predicate<ceh> j; private static final Map<String, a> k;
/*     */     static {
/*  44 */       g = afs.a(a::values, a::a);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*  50 */       k = x.<Map<String, a>>a(Maps.newHashMap(), ☃ -> {
/*     */             for (a a1 : values())
/*     */               ☃.put(a1.h, a1); 
/*     */           });
/*     */     }
/*     */     
/*     */     a(String ☃, chn.b b1, Predicate<ceh> predicate) {
/*  57 */       this.h = ☃;
/*  58 */       this.i = b1;
/*  59 */       this.j = predicate;
/*     */     }
/*     */     
/*     */     public String b() {
/*  63 */       return this.h;
/*     */     }
/*     */     
/*     */     public boolean c() {
/*  67 */       return (this.i == chn.b.c);
/*     */     }
/*     */     
/*     */     public boolean d() {
/*  71 */       return (this.i != chn.b.a);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public static a a(String ☃) {
/*  76 */       return k.get(☃);
/*     */     }
/*     */     
/*     */     public Predicate<ceh> e() {
/*  80 */       return this.j;
/*     */     }
/*     */ 
/*     */     
/*     */     public String a() {
/*  85 */       return this.h;
/*     */     }
/*     */   }
/*     */   
/*  89 */   private final aer c = new aer(9, 256);
/*     */   private final Predicate<ceh> d;
/*     */   private final cfw e;
/*     */   
/*     */   public chn(cfw ☃, a a1) {
/*  94 */     this.d = a1.e();
/*  95 */     this.e = ☃;
/*     */   }
/*     */   
/*     */   public static void a(cfw ☃, Set<a> set) {
/*  99 */     int i = set.size();
/* 100 */     ObjectArrayList objectArrayList = new ObjectArrayList(i);
/* 101 */     ObjectListIterator<chn> objectListIterator = objectArrayList.iterator();
/*     */     
/* 103 */     int j = ☃.b() + 16;
/* 104 */     fx.a a = new fx.a();
/* 105 */     for (int k = 0; k < 16; k++) {
/* 106 */       for (int m = 0; m < 16; m++) {
/* 107 */         for (a a1 : set) {
/* 108 */           objectArrayList.add(☃.a(a1));
/*     */         }
/*     */         
/* 111 */         for (int n = j - 1; n >= 0; n--) {
/* 112 */           a.d(k, n, m);
/* 113 */           ceh ceh = ☃.d_(a);
/* 114 */           if (!ceh.a(bup.a)) {
/*     */ 
/*     */             
/* 117 */             while (objectListIterator.hasNext()) {
/* 118 */               chn chn1 = (chn)objectListIterator.next();
/* 119 */               if (chn1.d.test(ceh)) {
/* 120 */                 chn1.a(k, m, n + 1);
/* 121 */                 objectListIterator.remove();
/*     */               } 
/*     */             } 
/* 124 */             if (objectArrayList.isEmpty()) {
/*     */               break;
/*     */             }
/* 127 */             objectListIterator.back(i);
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */   public boolean a(int ☃, int i, int j, ceh ceh1) {
/* 134 */     int k = a(☃, j);
/* 135 */     if (i <= k - 2)
/*     */     {
/* 137 */       return false;
/*     */     }
/*     */     
/* 140 */     if (this.d.test(ceh1)) {
/*     */       
/* 142 */       if (i >= k) {
/* 143 */         a(☃, j, i + 1);
/* 144 */         return true;
/*     */       }
/*     */     
/*     */     }
/* 148 */     else if (k - 1 == i) {
/* 149 */       fx.a a = new fx.a();
/* 150 */       for (int m = i - 1; m >= 0; m--) {
/* 151 */         a.d(☃, m, j);
/* 152 */         if (this.d.test(this.e.d_(a))) {
/* 153 */           a(☃, j, m + 1);
/* 154 */           return true;
/*     */         } 
/*     */       } 
/* 157 */       a(☃, j, 0);
/* 158 */       return true;
/*     */     } 
/*     */     
/* 161 */     return false;
/*     */   }
/*     */   
/*     */   public int a(int ☃, int i) {
/* 165 */     return a(c(☃, i));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private int a(int ☃) {
/* 173 */     return this.c.a(☃);
/*     */   }
/*     */   
/*     */   private void a(int ☃, int i, int j) {
/* 177 */     this.c.b(c(☃, i), j);
/*     */   }
/*     */   
/*     */   public void a(long[] ☃) {
/* 181 */     System.arraycopy(☃, 0, this.c.a(), 0, ☃.length);
/*     */   }
/*     */   
/*     */   public long[] a() {
/* 185 */     return this.c.a();
/*     */   }
/*     */   
/*     */   private static int c(int ☃, int i) {
/* 189 */     return ☃ + i * 16;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\chn.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */