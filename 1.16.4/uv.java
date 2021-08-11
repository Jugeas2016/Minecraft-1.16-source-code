/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.collect.Maps;
/*     */ import io.netty.handler.codec.DecoderException;
/*     */ import io.netty.handler.codec.EncoderException;
/*     */ import java.io.IOException;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Objects;
/*     */ import java.util.concurrent.locks.ReadWriteLock;
/*     */ import java.util.concurrent.locks.ReentrantReadWriteLock;
/*     */ import javax.annotation.Nullable;
/*     */ import org.apache.commons.lang3.ObjectUtils;
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
/*     */ public class uv
/*     */ {
/*  25 */   private static final Logger a = LogManager.getLogger();
/*  26 */   private static final Map<Class<? extends aqa>, Integer> b = Maps.newHashMap();
/*     */ 
/*     */   
/*     */   private final aqa c;
/*     */   
/*  31 */   private final Map<Integer, a<?>> d = Maps.newHashMap();
/*  32 */   private final ReadWriteLock e = new ReentrantReadWriteLock();
/*     */   
/*     */   private boolean f = true;
/*     */   private boolean g;
/*     */   
/*     */   public uv(aqa ☃) {
/*  38 */     this.c = ☃;
/*     */   }
/*     */   public static <T> us<T> a(Class<? extends aqa> ☃, ut<T> ut1) {
/*     */     int i;
/*  42 */     if (a.isDebugEnabled()) {
/*     */       try {
/*  44 */         Class<?> clazz = Class.forName(Thread.currentThread().getStackTrace()[2].getClassName());
/*  45 */         if (!clazz.equals(☃)) {
/*  46 */           a.debug("defineId called for: {} from {}", ☃, clazz, new RuntimeException());
/*     */         }
/*  48 */       } catch (ClassNotFoundException classNotFoundException) {}
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*  53 */     if (b.containsKey(☃)) {
/*  54 */       i = ((Integer)b.get(☃)).intValue() + 1;
/*     */     } else {
/*  56 */       int j = 0;
/*  57 */       Class<?> clazz = ☃;
/*  58 */       while (clazz != aqa.class) {
/*  59 */         clazz = clazz.getSuperclass();
/*  60 */         if (b.containsKey(clazz)) {
/*  61 */           j = ((Integer)b.get(clazz)).intValue() + 1;
/*     */           break;
/*     */         } 
/*     */       } 
/*  65 */       i = j;
/*     */     } 
/*  67 */     if (i > 254) {
/*  68 */       throw new IllegalArgumentException("Data value id is too big with " + i + "! (Max is " + 'þ' + ")");
/*     */     }
/*  70 */     b.put(☃, Integer.valueOf(i));
/*  71 */     return ut1.a(i);
/*     */   }
/*     */   
/*     */   public <T> void a(us<T> ☃, T t) {
/*  75 */     int i = ☃.a();
/*  76 */     if (i > 254) {
/*  77 */       throw new IllegalArgumentException("Data value id is too big with " + i + "! (Max is " + 'þ' + ")");
/*     */     }
/*  79 */     if (this.d.containsKey(Integer.valueOf(i))) {
/*  80 */       throw new IllegalArgumentException("Duplicate id value for " + i + "!");
/*     */     }
/*  82 */     if (uu.b(☃.b()) < 0) {
/*  83 */       throw new IllegalArgumentException("Unregistered serializer " + ☃.b() + " for " + i + "!");
/*     */     }
/*     */     
/*  86 */     c(☃, t);
/*     */   }
/*     */   
/*     */   private <T> void c(us<T> ☃, T t) {
/*  90 */     a<T> a = new a<>(☃, t);
/*  91 */     this.e.writeLock().lock();
/*  92 */     this.d.put(Integer.valueOf(☃.a()), a);
/*  93 */     this.f = false;
/*  94 */     this.e.writeLock().unlock();
/*     */   }
/*     */ 
/*     */   
/*     */   private <T> a<T> b(us<T> ☃) {
/*     */     a<T> a;
/* 100 */     this.e.readLock().lock();
/*     */     
/*     */     try {
/* 103 */       a = (a<T>)this.d.get(Integer.valueOf(☃.a()));
/* 104 */     } catch (Throwable throwable) {
/* 105 */       l l = l.a(throwable, "Getting synched entity data");
/* 106 */       m m = l.a("Synched entity data");
/*     */       
/* 108 */       m.a("Data ID", ☃);
/* 109 */       throw new u(l);
/*     */     } finally {
/* 111 */       this.e.readLock().unlock();
/*     */     } 
/* 113 */     return a;
/*     */   }
/*     */   
/*     */   public <T> T a(us<T> ☃) {
/* 117 */     return b(☃).b();
/*     */   }
/*     */   
/*     */   public <T> void b(us<T> ☃, T t) {
/* 121 */     a<T> a = b(☃);
/*     */ 
/*     */     
/* 124 */     if (ObjectUtils.notEqual(t, a.b())) {
/* 125 */       a.a(t);
/* 126 */       this.c.a(☃);
/* 127 */       a.a(true);
/* 128 */       this.g = true;
/*     */     } 
/*     */   }
/*     */   
/*     */   public boolean a() {
/* 133 */     return this.g;
/*     */   }
/*     */   
/*     */   public static void a(List<a<?>> ☃, nf nf1) throws IOException {
/* 137 */     if (☃ != null) {
/* 138 */       for (int i = 0, j = ☃.size(); i < j; i++) {
/* 139 */         a(nf1, ☃.get(i));
/*     */       }
/*     */     }
/*     */ 
/*     */     
/* 144 */     nf1.writeByte(255);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public List<a<?>> b() {
/* 149 */     List<a<?>> ☃ = null;
/*     */     
/* 151 */     if (this.g) {
/* 152 */       this.e.readLock().lock();
/* 153 */       for (a<?> a : this.d.values()) {
/* 154 */         if (a.c()) {
/* 155 */           a.a(false);
/*     */           
/* 157 */           if (☃ == null) {
/* 158 */             ☃ = Lists.newArrayList();
/*     */           }
/* 160 */           ☃.add(a.d());
/*     */         } 
/*     */       } 
/* 163 */       this.e.readLock().unlock();
/*     */     } 
/* 165 */     this.g = false;
/*     */     
/* 167 */     return ☃;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public List<a<?>> c() {
/* 172 */     List<a<?>> ☃ = null;
/*     */     
/* 174 */     this.e.readLock().lock();
/* 175 */     for (a<?> a : this.d.values()) {
/* 176 */       if (☃ == null) {
/* 177 */         ☃ = Lists.newArrayList();
/*     */       }
/* 179 */       ☃.add(a.d());
/*     */     } 
/* 181 */     this.e.readLock().unlock();
/*     */     
/* 183 */     return ☃;
/*     */   }
/*     */   
/*     */   private static <T> void a(nf ☃, a<T> a1) throws IOException {
/* 187 */     us<T> us = a1.a();
/* 188 */     int i = uu.b(us.b());
/* 189 */     if (i < 0) {
/* 190 */       throw new EncoderException("Unknown serializer type " + us.b());
/*     */     }
/* 192 */     ☃.writeByte(us.a());
/* 193 */     ☃.d(i);
/* 194 */     us.b().a(☃, a1.b());
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public static List<a<?>> a(nf ☃) throws IOException {
/* 199 */     List<a<?>> list = null;
/*     */     
/*     */     int i;
/* 202 */     while ((i = ☃.readUnsignedByte()) != 255) {
/* 203 */       if (list == null) {
/* 204 */         list = Lists.newArrayList();
/*     */       }
/*     */       
/* 207 */       int j = ☃.i();
/* 208 */       ut<?> ut = uu.a(j);
/* 209 */       if (ut == null) {
/* 210 */         throw new DecoderException("Unknown serializer type " + j);
/*     */       }
/*     */       
/* 213 */       list.add(a(☃, i, ut));
/*     */     } 
/*     */     
/* 216 */     return list;
/*     */   }
/*     */   
/*     */   private static <T> a<T> a(nf ☃, int i, ut<T> ut1) {
/* 220 */     return new a<>(ut1.a(i), ut1.a(☃));
/*     */   }
/*     */   
/*     */   public void a(List<a<?>> ☃) {
/* 224 */     this.e.writeLock().lock();
/* 225 */     for (a<?> a1 : ☃) {
/* 226 */       a<?> a2 = this.d.get(Integer.valueOf(a1.a().a()));
/* 227 */       if (a2 != null) {
/* 228 */         a(a2, a1);
/* 229 */         this.c.a(a1.a());
/*     */       } 
/*     */     } 
/* 232 */     this.e.writeLock().unlock();
/*     */ 
/*     */     
/* 235 */     this.g = true;
/*     */   }
/*     */ 
/*     */   
/*     */   private <T> void a(a<T> ☃, a<?> a1) {
/* 240 */     if (!Objects.equals(a.a(a1).b(), a.a(☃).b())) {
/* 241 */       throw new IllegalStateException(String.format("Invalid entity data item type for field %d on entity %s: old=%s(%s), new=%s(%s)", new Object[] { Integer.valueOf(a.a(☃).a()), this.c, a.b(☃), a.b(☃).getClass(), a.b(a1), a.b(a1).getClass() }));
/*     */     }
/* 243 */     ☃.a((T)a1.b());
/*     */   }
/*     */   
/*     */   public boolean d() {
/* 247 */     return this.f;
/*     */   }
/*     */   
/*     */   public void e() {
/* 251 */     this.g = false;
/*     */     
/* 253 */     this.e.readLock().lock();
/* 254 */     for (a<?> ☃ : this.d.values()) {
/* 255 */       ☃.a(false);
/*     */     }
/* 257 */     this.e.readLock().unlock();
/*     */   }
/*     */   
/*     */   public static class a<T> {
/*     */     private final us<T> a;
/*     */     private T b;
/*     */     private boolean c;
/*     */     
/*     */     public a(us<T> ☃, T t) {
/* 266 */       this.a = ☃;
/* 267 */       this.b = t;
/* 268 */       this.c = true;
/*     */     }
/*     */     
/*     */     public us<T> a() {
/* 272 */       return this.a;
/*     */     }
/*     */     
/*     */     public void a(T ☃) {
/* 276 */       this.b = ☃;
/*     */     }
/*     */     
/*     */     public T b() {
/* 280 */       return this.b;
/*     */     }
/*     */     
/*     */     public boolean c() {
/* 284 */       return this.c;
/*     */     }
/*     */     
/*     */     public void a(boolean ☃) {
/* 288 */       this.c = ☃;
/*     */     }
/*     */     
/*     */     public a<T> d() {
/* 292 */       return new a(this.a, this.a.b().a(this.b));
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip\\uv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */