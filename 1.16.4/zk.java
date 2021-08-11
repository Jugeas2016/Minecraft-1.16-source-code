/*     */ import com.google.common.base.MoreObjects;
/*     */ import java.io.IOException;
/*     */ import java.io.InputStream;
/*     */ import java.io.OutputStream;
/*     */ import java.nio.file.Files;
/*     */ import java.nio.file.Path;
/*     */ import java.util.Objects;
/*     */ import java.util.Properties;
/*     */ import java.util.function.Function;
/*     */ import java.util.function.IntFunction;
/*     */ import java.util.function.Supplier;
/*     */ import java.util.function.UnaryOperator;
/*     */ import javax.annotation.Nullable;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
/*     */ 
/*     */ 
/*     */ public abstract class zk<T extends zk<T>>
/*     */ {
/*     */   public class a<V>
/*     */     implements Supplier<V>
/*     */   {
/*     */     private final String b;
/*     */     private final V c;
/*     */     private final Function<V, String> d;
/*     */     
/*     */     private a(zk ☃, String str, V v, Function<V, String> function) {
/*  28 */       this.b = str;
/*  29 */       this.c = v;
/*  30 */       this.d = function;
/*     */     }
/*     */ 
/*     */     
/*     */     public V get() {
/*  35 */       return this.c;
/*     */     }
/*     */     
/*     */     public T a(gn ☃, V v) {
/*  39 */       Properties properties = this.a.a();
/*  40 */       properties.put(this.b, this.d.apply(v));
/*  41 */       return this.a.b(☃, properties);
/*     */     }
/*     */   }
/*     */   
/*  45 */   private static final Logger a = LogManager.getLogger();
/*     */   
/*     */   private final Properties b;
/*     */   
/*     */   public zk(Properties ☃) {
/*  50 */     this.b = ☃;
/*     */   }
/*     */   
/*     */   public static Properties a(Path ☃) {
/*  54 */     Properties properties = new Properties();
/*  55 */     try (InputStream ☃ = Files.newInputStream(☃, new java.nio.file.OpenOption[0])) {
/*  56 */       properties.load(inputStream);
/*  57 */     } catch (IOException iOException) {
/*  58 */       a.error("Failed to load properties from file: " + ☃);
/*     */     } 
/*  60 */     return properties;
/*     */   }
/*     */   
/*     */   public void b(Path ☃) {
/*  64 */     try (OutputStream ☃ = Files.newOutputStream(☃, new java.nio.file.OpenOption[0])) {
/*  65 */       this.b.store(outputStream, "Minecraft server properties");
/*  66 */     } catch (IOException iOException) {
/*  67 */       a.error("Failed to store properties to file: " + ☃);
/*     */     } 
/*     */   }
/*     */   
/*     */   private static <V extends Number> Function<String, V> a(Function<String, V> ☃) {
/*  72 */     return str -> {
/*     */         try {
/*     */           return ☃.apply(str);
/*  75 */         } catch (NumberFormatException numberFormatException) {
/*     */           return null;
/*     */         } 
/*     */       };
/*     */   }
/*     */   
/*     */   protected static <V> Function<String, V> a(IntFunction<V> ☃, Function<String, V> function) {
/*  82 */     return str -> {
/*     */         try {
/*     */           return ☃.apply(Integer.parseInt(str));
/*  85 */         } catch (NumberFormatException numberFormatException) {
/*     */           return function.apply(str);
/*     */         } 
/*     */       };
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   private String c(String ☃) {
/*  93 */     return (String)this.b.get(☃);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   protected <V> V a(String ☃, Function<String, V> function) {
/*  98 */     String str = c(☃);
/*  99 */     if (str == null) {
/* 100 */       return null;
/*     */     }
/* 102 */     this.b.remove(☃);
/* 103 */     return function.apply(str);
/*     */   }
/*     */   
/*     */   protected <V> V a(String ☃, Function<String, V> function, Function<V, String> function1, V v) {
/* 107 */     String str = c(☃);
/* 108 */     V v1 = (V)MoreObjects.firstNonNull((str != null) ? function.apply(str) : null, v);
/* 109 */     this.b.put(☃, function1.apply(v1));
/* 110 */     return v1;
/*     */   }
/*     */   
/*     */   protected <V> a<V> b(String ☃, Function<String, V> function, Function<V, String> function1, V v) {
/* 114 */     String str = c(☃);
/* 115 */     V v1 = (V)MoreObjects.firstNonNull((str != null) ? function.apply(str) : null, v);
/* 116 */     this.b.put(☃, function1.apply(v1));
/* 117 */     return new a<>(☃, v1, function1);
/*     */   }
/*     */   
/*     */   protected <V> V a(String ☃, Function<String, V> function, UnaryOperator<V> unaryOperator, Function<V, String> function1, V v) {
/* 121 */     return a(☃, str -> { V v = ☃.apply(str); return (v != null) ? unaryOperator.apply(v) : null; }function1, v);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected <V> V a(String ☃, Function<String, V> function, V v) {
/* 128 */     return a(☃, function, Objects::toString, v);
/*     */   }
/*     */   
/*     */   protected <V> a<V> b(String ☃, Function<String, V> function, V v) {
/* 132 */     return b(☃, function, Objects::toString, v);
/*     */   }
/*     */   
/*     */   protected String a(String ☃, String str1) {
/* 136 */     return a(☃, Function.identity(), Function.identity(), str1);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   protected String a(String ☃) {
/* 141 */     return a(☃, Function.identity());
/*     */   }
/*     */   
/*     */   protected int a(String ☃, int i) {
/* 145 */     return ((Integer)a(☃, a(Integer::parseInt), Integer.valueOf(i))).intValue();
/*     */   }
/*     */   
/*     */   protected a<Integer> b(String ☃, int i) {
/* 149 */     return b(☃, a(Integer::parseInt), Integer.valueOf(i));
/*     */   }
/*     */   
/*     */   protected int a(String ☃, UnaryOperator<Integer> unaryOperator, int i) {
/* 153 */     return ((Integer)a(☃, a(Integer::parseInt), unaryOperator, Objects::toString, Integer.valueOf(i))).intValue();
/*     */   }
/*     */   
/*     */   protected long a(String ☃, long l) {
/* 157 */     return ((Long)a(☃, a(Long::parseLong), Long.valueOf(l))).longValue();
/*     */   }
/*     */   
/*     */   protected boolean a(String ☃, boolean bool) {
/* 161 */     return ((Boolean)a(☃, Boolean::valueOf, Boolean.valueOf(bool))).booleanValue();
/*     */   }
/*     */   
/*     */   protected a<Boolean> b(String ☃, boolean bool) {
/* 165 */     return b(☃, Boolean::valueOf, Boolean.valueOf(bool));
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   protected Boolean b(String ☃) {
/* 170 */     return a(☃, Boolean::valueOf);
/*     */   }
/*     */   
/*     */   protected Properties a() {
/* 174 */     Properties ☃ = new Properties();
/* 175 */     ☃.putAll(this.b);
/* 176 */     return ☃;
/*     */   }
/*     */   
/*     */   protected abstract T b(gn paramgn, Properties paramProperties);
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\zk.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */