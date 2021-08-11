/*     */ import com.google.common.collect.Lists;
/*     */ import java.util.List;
/*     */ import java.util.Locale;
/*     */ import javax.annotation.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class m
/*     */ {
/*     */   private final l a;
/*     */   private final String b;
/*  14 */   private final List<a> c = Lists.newArrayList();
/*  15 */   private StackTraceElement[] d = new StackTraceElement[0];
/*     */   
/*     */   public m(l ☃, String str) {
/*  18 */     this.a = ☃;
/*  19 */     this.b = str;
/*     */   }
/*     */   
/*     */   public static String a(double ☃, double d1, double d2) {
/*  23 */     return String.format(Locale.ROOT, "%.2f,%.2f,%.2f - %s", new Object[] { Double.valueOf(☃), Double.valueOf(d1), Double.valueOf(d2), a(new fx(☃, d1, d2)) });
/*     */   }
/*     */   
/*     */   public static String a(fx ☃) {
/*  27 */     return a(☃.u(), ☃.v(), ☃.w());
/*     */   }
/*     */   
/*     */   public static String a(int ☃, int i, int j) {
/*  31 */     StringBuilder stringBuilder = new StringBuilder();
/*     */     
/*     */     try {
/*  34 */       stringBuilder.append(String.format("World: (%d,%d,%d)", new Object[] { Integer.valueOf(☃), Integer.valueOf(i), Integer.valueOf(j) }));
/*  35 */     } catch (Throwable throwable) {
/*  36 */       stringBuilder.append("(Error finding world loc)");
/*     */     } 
/*     */     
/*  39 */     stringBuilder.append(", ");
/*     */     
/*     */     try {
/*  42 */       int k = ☃ >> 4;
/*  43 */       int n = j >> 4;
/*  44 */       int i1 = ☃ & 0xF;
/*  45 */       int i2 = i >> 4;
/*  46 */       int i3 = j & 0xF;
/*  47 */       int i4 = k << 4;
/*  48 */       int i5 = n << 4;
/*  49 */       int i6 = (k + 1 << 4) - 1;
/*  50 */       int i7 = (n + 1 << 4) - 1;
/*  51 */       stringBuilder.append(String.format("Chunk: (at %d,%d,%d in %d,%d; contains blocks %d,0,%d to %d,255,%d)", new Object[] { Integer.valueOf(i1), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(k), Integer.valueOf(n), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7) }));
/*  52 */     } catch (Throwable throwable) {
/*  53 */       stringBuilder.append("(Error finding chunk loc)");
/*     */     } 
/*     */     
/*  56 */     stringBuilder.append(", ");
/*     */     
/*     */     try {
/*  59 */       int k = ☃ >> 9;
/*  60 */       int n = j >> 9;
/*  61 */       int i1 = k << 5;
/*  62 */       int i2 = n << 5;
/*  63 */       int i3 = (k + 1 << 5) - 1;
/*  64 */       int i4 = (n + 1 << 5) - 1;
/*  65 */       int i5 = k << 9;
/*  66 */       int i6 = n << 9;
/*  67 */       int i7 = (k + 1 << 9) - 1;
/*  68 */       int i8 = (n + 1 << 9) - 1;
/*  69 */       stringBuilder.append(String.format("Region: (%d,%d; contains chunks %d,%d to %d,%d, blocks %d,0,%d to %d,255,%d)", new Object[] { Integer.valueOf(k), Integer.valueOf(n), Integer.valueOf(i1), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8) }));
/*  70 */     } catch (Throwable throwable) {
/*  71 */       stringBuilder.append("(Error finding world loc)");
/*     */     } 
/*     */     
/*  74 */     return stringBuilder.toString();
/*     */   }
/*     */   
/*     */   public m a(String ☃, n<String> n1) {
/*     */     try {
/*  79 */       a(☃, n1.call());
/*  80 */     } catch (Throwable throwable) {
/*  81 */       a(☃, throwable);
/*     */     } 
/*  83 */     return this;
/*     */   }
/*     */   
/*     */   public m a(String ☃, Object object) {
/*  87 */     this.c.add(new a(☃, object));
/*  88 */     return this;
/*     */   }
/*     */   
/*     */   public void a(String ☃, Throwable throwable) {
/*  92 */     a(☃, throwable);
/*     */   }
/*     */   
/*     */   public int a(int ☃) {
/*  96 */     StackTraceElement[] arrayOfStackTraceElement = Thread.currentThread().getStackTrace();
/*     */ 
/*     */     
/*  99 */     if (arrayOfStackTraceElement.length <= 0) {
/* 100 */       return 0;
/*     */     }
/*     */     
/* 103 */     this.d = new StackTraceElement[arrayOfStackTraceElement.length - 3 - ☃];
/* 104 */     System.arraycopy(arrayOfStackTraceElement, 3 + ☃, this.d, 0, this.d.length);
/* 105 */     return this.d.length;
/*     */   }
/*     */   
/*     */   public boolean a(StackTraceElement ☃, StackTraceElement stackTraceElement1) {
/* 109 */     if (this.d.length == 0 || ☃ == null) {
/* 110 */       return false;
/*     */     }
/*     */     
/* 113 */     StackTraceElement stackTraceElement = this.d[0];
/*     */ 
/*     */     
/* 116 */     if (stackTraceElement.isNativeMethod() != ☃.isNativeMethod() || 
/* 117 */       !stackTraceElement.getClassName().equals(☃.getClassName()) || 
/* 118 */       !stackTraceElement.getFileName().equals(☃.getFileName()) || 
/* 119 */       !stackTraceElement.getMethodName().equals(☃.getMethodName()))
/*     */     {
/* 121 */       return false;
/*     */     }
/*     */     
/* 124 */     if (((stackTraceElement1 != null) ? true : false) != ((this.d.length > 1) ? true : false)) {
/* 125 */       return false;
/*     */     }
/* 127 */     if (stackTraceElement1 != null && !this.d[1].equals(stackTraceElement1)) {
/* 128 */       return false;
/*     */     }
/*     */     
/* 131 */     this.d[0] = ☃;
/*     */     
/* 133 */     return true;
/*     */   }
/*     */   
/*     */   public void b(int ☃) {
/* 137 */     StackTraceElement[] arrayOfStackTraceElement = new StackTraceElement[this.d.length - ☃];
/* 138 */     System.arraycopy(this.d, 0, arrayOfStackTraceElement, 0, arrayOfStackTraceElement.length);
/* 139 */     this.d = arrayOfStackTraceElement;
/*     */   }
/*     */   
/*     */   public void a(StringBuilder ☃) {
/* 143 */     ☃.append("-- ").append(this.b).append(" --\n");
/* 144 */     ☃.append("Details:");
/*     */     
/* 146 */     for (a a : this.c) {
/* 147 */       ☃.append("\n\t");
/* 148 */       ☃.append(a.a());
/* 149 */       ☃.append(": ");
/* 150 */       ☃.append(a.b());
/*     */     } 
/*     */     
/* 153 */     if (this.d != null && this.d.length > 0) {
/* 154 */       ☃.append("\nStacktrace:");
/*     */       
/* 156 */       for (StackTraceElement stackTraceElement : this.d) {
/* 157 */         ☃.append("\n\tat ");
/* 158 */         ☃.append(stackTraceElement);
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public StackTraceElement[] a() {
/* 164 */     return this.d;
/*     */   }
/*     */   
/*     */   public static void a(m ☃, fx fx1, @Nullable ceh ceh1) {
/* 168 */     if (ceh1 != null) {
/* 169 */       ☃.a("Block", ceh1::toString);
/*     */     }
/*     */     
/* 172 */     ☃.a("Block location", () -> a(☃));
/*     */   }
/*     */   
/*     */   static class a {
/*     */     private final String a;
/*     */     private final String b;
/*     */     
/*     */     public a(String ☃, @Nullable Object object) {
/* 180 */       this.a = ☃;
/*     */       
/* 182 */       if (object == null) {
/* 183 */         this.b = "~~NULL~~";
/* 184 */       } else if (object instanceof Throwable) {
/* 185 */         Throwable throwable = (Throwable)object;
/* 186 */         this.b = "~~ERROR~~ " + throwable.getClass().getSimpleName() + ": " + throwable.getMessage();
/*     */       } else {
/* 188 */         this.b = object.toString();
/*     */       } 
/*     */     }
/*     */     
/*     */     public String a() {
/* 193 */       return this.a;
/*     */     }
/*     */     
/*     */     public String b() {
/* 197 */       return this.b;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\m.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */