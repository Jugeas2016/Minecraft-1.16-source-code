/*     */ import it.unimi.dsi.fastutil.ints.Int2IntMap;
/*     */ import it.unimi.dsi.fastutil.ints.Int2IntOpenHashMap;
/*     */ import java.util.Arrays;
/*     */ import java.util.Objects;
/*     */ import java.util.concurrent.locks.ReentrantLock;
/*     */ import java.util.function.Function;
/*     */ import java.util.function.Predicate;
/*     */ import java.util.stream.Collectors;
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
/*     */ public class cgo<T>
/*     */   implements cgn<T>
/*     */ {
/*     */   private final cgm<T> b;
/*     */   private final cgn<T> c = (☃, object) -> 0;
/*     */   private final gh<T> d;
/*     */   private final Function<md, T> e;
/*     */   private final Function<T, md> f;
/*     */   private final T g;
/*     */   protected aer a;
/*     */   private cgm<T> h;
/*     */   private int i;
/*  38 */   private final ReentrantLock j = new ReentrantLock();
/*     */   
/*     */   public void a() {
/*  41 */     if (this.j.isLocked() && !this.j.isHeldByCurrentThread()) {
/*     */ 
/*     */       
/*  44 */       String ☃ = Thread.getAllStackTraces().keySet().stream().filter(Objects::nonNull).map(☃ -> ☃.getName() + ": \n\tat " + (String)Arrays.<StackTraceElement>stream(☃.getStackTrace()).map(Object::toString).collect(Collectors.joining("\n\tat "))).collect(Collectors.joining("\n"));
/*  45 */       l l = new l("Writing into PalettedContainer from multiple threads", new IllegalStateException());
/*  46 */       m m = l.a("Thread dumps");
/*  47 */       m.a("Thread dumps", ☃);
/*  48 */       throw new u(l);
/*     */     } 
/*  50 */     this.j.lock();
/*     */   }
/*     */   
/*     */   public void b() {
/*  54 */     this.j.unlock();
/*     */   }
/*     */   
/*     */   public cgo(cgm<T> ☃, gh<T> gh1, Function<md, T> function, Function<T, md> function1, T t) {
/*  58 */     this.b = ☃;
/*  59 */     this.d = gh1;
/*  60 */     this.e = function;
/*  61 */     this.f = function1;
/*  62 */     this.g = t;
/*  63 */     b(4);
/*     */   }
/*     */   
/*     */   private static int b(int ☃, int i, int j) {
/*  67 */     return i << 8 | j << 4 | ☃;
/*     */   }
/*     */   
/*     */   private void b(int ☃) {
/*  71 */     if (☃ == this.i) {
/*     */       return;
/*     */     }
/*     */     
/*  75 */     this.i = ☃;
/*     */     
/*  77 */     if (this.i <= 4) {
/*  78 */       this.i = 4;
/*  79 */       this.h = new cgk<>(this.d, this.i, this, this.e);
/*  80 */     } else if (this.i < 9) {
/*  81 */       this.h = new cgf<>(this.d, this.i, this, this.e, this.f);
/*     */     } else {
/*  83 */       this.h = this.b;
/*  84 */       this.i = afm.e(this.d.a());
/*     */     } 
/*  86 */     this.h.a(this.g);
/*     */     
/*  88 */     this.a = new aer(this.i, 4096);
/*     */   }
/*     */ 
/*     */   
/*     */   public int onResize(int ☃, T t) {
/*  93 */     a();
/*  94 */     aer aer1 = this.a;
/*  95 */     cgm<T> cgm1 = this.h;
/*     */     
/*  97 */     b(☃);
/*     */     int i;
/*  99 */     for (i = 0; i < aer1.b(); i++) {
/* 100 */       T t1 = cgm1.a(aer1.a(i));
/* 101 */       if (t1 != null) {
/* 102 */         b(i, t1);
/*     */       }
/*     */     } 
/*     */     
/* 106 */     i = this.h.a(t);
/* 107 */     b();
/* 108 */     return i;
/*     */   }
/*     */   
/*     */   public T a(int ☃, int i, int j, T t) {
/* 112 */     a();
/* 113 */     T t1 = a(b(☃, i, j), t);
/* 114 */     b();
/* 115 */     return t1;
/*     */   }
/*     */   
/*     */   public T b(int ☃, int i, int j, T t) {
/* 119 */     return a(b(☃, i, j), t);
/*     */   }
/*     */   
/*     */   protected T a(int ☃, T t) {
/* 123 */     int i = this.h.a(t);
/* 124 */     int j = this.a.a(☃, i);
/* 125 */     T t1 = this.h.a(j);
/* 126 */     return (t1 == null) ? this.g : t1;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void b(int ☃, T t) {
/* 136 */     int i = this.h.a(t);
/* 137 */     this.a.b(☃, i);
/*     */   }
/*     */   
/*     */   public T a(int ☃, int i, int j) {
/* 141 */     return a(b(☃, i, j));
/*     */   }
/*     */   
/*     */   protected T a(int ☃) {
/* 145 */     T t = this.h.a(this.a.a(☃));
/* 146 */     return (t == null) ? this.g : t;
/*     */   }
/*     */   
/*     */   public void a(nf ☃) {
/* 150 */     a();
/* 151 */     int i = ☃.readByte();
/*     */     
/* 153 */     if (this.i != i) {
/* 154 */       b(i);
/*     */     }
/*     */     
/* 157 */     this.h.a(☃);
/* 158 */     ☃.b(this.a.a());
/* 159 */     b();
/*     */   }
/*     */   
/*     */   public void b(nf ☃) {
/* 163 */     a();
/* 164 */     ☃.writeByte(this.i);
/* 165 */     this.h.b(☃);
/* 166 */     ☃.a(this.a.a());
/* 167 */     b();
/*     */   }
/*     */   
/*     */   public void a(mj ☃, long[] arrayOfLong) {
/* 171 */     a();
/*     */ 
/*     */     
/* 174 */     int i = Math.max(4, afm.e(☃.size()));
/* 175 */     if (i != this.i) {
/* 176 */       b(i);
/*     */     }
/*     */     
/* 179 */     this.h.a(☃);
/*     */     
/* 181 */     int j = arrayOfLong.length * 64 / 4096;
/* 182 */     if (this.h == this.b) {
/* 183 */       cgm<T> cgm1 = new cgf<>(this.d, i, this.c, this.e, this.f);
/* 184 */       cgm1.a(☃);
/*     */       
/* 186 */       aer aer1 = new aer(i, 4096, arrayOfLong);
/* 187 */       for (int k = 0; k < 4096; k++) {
/* 188 */         this.a.b(k, this.b.a(cgm1.a(aer1.a(k))));
/*     */       }
/*     */     }
/* 191 */     else if (j == this.i) {
/* 192 */       System.arraycopy(arrayOfLong, 0, this.a.a(), 0, arrayOfLong.length);
/*     */     } else {
/*     */       
/* 195 */       aer aer1 = new aer(j, 4096, arrayOfLong);
/* 196 */       for (int k = 0; k < 4096; k++) {
/* 197 */         this.a.b(k, aer1.a(k));
/*     */       }
/*     */     } 
/*     */     
/* 201 */     b();
/*     */   }
/*     */   
/*     */   public void a(md ☃, String str1, String str2) {
/* 205 */     a();
/* 206 */     cgf<T> cgf = new cgf<>(this.d, this.i, this.c, this.e, this.f);
/*     */     
/* 208 */     T t = this.g;
/* 209 */     int i = cgf.a(this.g);
/*     */     
/* 211 */     int[] arrayOfInt = new int[4096];
/* 212 */     for (int j = 0; j < 4096; j++) {
/* 213 */       T t1 = a(j);
/* 214 */       if (t1 != t) {
/* 215 */         t = t1;
/* 216 */         i = cgf.a(t1);
/*     */       } 
/* 218 */       arrayOfInt[j] = i;
/*     */     } 
/*     */     
/* 221 */     mj mj = new mj();
/* 222 */     cgf.b(mj);
/* 223 */     ☃.a(str1, mj);
/*     */     
/* 225 */     int k = Math.max(4, afm.e(mj.size()));
/* 226 */     aer aer1 = new aer(k, 4096);
/* 227 */     for (int m = 0; m < arrayOfInt.length; m++) {
/* 228 */       aer1.b(m, arrayOfInt[m]);
/*     */     }
/* 230 */     ☃.a(str2, aer1.a());
/* 231 */     b();
/*     */   }
/*     */   
/*     */   public int c() {
/* 235 */     return 1 + this.h.a() + nf.a(this.a.b()) + (this.a.a()).length * 8;
/*     */   }
/*     */   
/*     */   public boolean a(Predicate<T> ☃) {
/* 239 */     return this.h.a(☃);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a(a<T> ☃) {
/* 248 */     Int2IntOpenHashMap int2IntOpenHashMap = new Int2IntOpenHashMap();
/* 249 */     this.a.a(i -> ☃.put(i, ☃.get(i) + 1));
/* 250 */     int2IntOpenHashMap.int2IntEntrySet().forEach(entry -> ☃.accept(this.h.a(entry.getIntKey()), entry.getIntValue()));
/*     */   }
/*     */   
/*     */   @FunctionalInterface
/*     */   public static interface a<T> {
/*     */     void accept(T param1T, int param1Int);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cgo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */