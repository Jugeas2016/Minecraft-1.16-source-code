/*     */ import com.google.common.collect.Lists;
/*     */ import java.io.File;
/*     */ import java.io.FileOutputStream;
/*     */ import java.io.OutputStreamWriter;
/*     */ import java.io.PrintWriter;
/*     */ import java.io.StringWriter;
/*     */ import java.io.Writer;
/*     */ import java.nio.charset.StandardCharsets;
/*     */ import java.text.SimpleDateFormat;
/*     */ import java.util.Date;
/*     */ import java.util.List;
/*     */ import java.util.stream.Collector;
/*     */ import java.util.stream.Collectors;
/*     */ import org.apache.commons.io.IOUtils;
/*     */ import org.apache.commons.lang3.ArrayUtils;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
/*     */ 
/*     */ 
/*     */ 
/*     */ public class l
/*     */ {
/*  23 */   private static final Logger a = LogManager.getLogger();
/*     */   
/*     */   private final String b;
/*     */   private final Throwable c;
/*  27 */   private final m d = new m(this, "System Details");
/*  28 */   private final List<m> e = Lists.newArrayList();
/*     */   private File f;
/*     */   private boolean g = true;
/*  31 */   private StackTraceElement[] h = new StackTraceElement[0];
/*     */   
/*     */   public l(String ☃, Throwable throwable) {
/*  34 */     this.b = ☃;
/*  35 */     this.c = throwable;
/*     */     
/*  37 */     i();
/*     */   }
/*     */   
/*     */   private void i() {
/*  41 */     this.d.a("Minecraft Version", () -> w.a().getName());
/*  42 */     this.d.a("Minecraft Version ID", () -> w.a().getId());
/*  43 */     this.d.a("Operating System", () -> System.getProperty("os.name") + " (" + System.getProperty("os.arch") + ") version " + System.getProperty("os.version"));
/*  44 */     this.d.a("Java Version", () -> System.getProperty("java.version") + ", " + System.getProperty("java.vendor"));
/*  45 */     this.d.a("Java VM Version", () -> System.getProperty("java.vm.name") + " (" + System.getProperty("java.vm.info") + "), " + System.getProperty("java.vm.vendor"));
/*     */     
/*  47 */     this.d.a("Memory", () -> {
/*     */           Runtime ☃ = Runtime.getRuntime();
/*     */           
/*     */           long l1 = ☃.maxMemory();
/*     */           
/*     */           long l2 = ☃.totalMemory();
/*     */           long l3 = ☃.freeMemory();
/*     */           long l4 = l1 / 1024L / 1024L;
/*     */           long l5 = l2 / 1024L / 1024L;
/*     */           long l6 = l3 / 1024L / 1024L;
/*     */           return l3 + " bytes (" + l6 + " MB) / " + l2 + " bytes (" + l5 + " MB) up to " + l1 + " bytes (" + l4 + " MB)";
/*     */         });
/*  59 */     this.d.a("CPUs", Integer.valueOf(Runtime.getRuntime().availableProcessors()));
/*     */     
/*  61 */     this.d.a("JVM Flags", () -> {
/*     */           List<String> ☃ = x.j().collect((Collector)Collectors.toList());
/*     */           return String.format("%d total; %s", new Object[] { Integer.valueOf(☃.size()), ☃.stream().collect(Collectors.joining(" ")) });
/*     */         });
/*     */   }
/*     */   
/*     */   public String a() {
/*  68 */     return this.b;
/*     */   }
/*     */   
/*     */   public Throwable b() {
/*  72 */     return this.c;
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
/*     */   public void a(StringBuilder ☃) {
/*  84 */     if ((this.h == null || this.h.length <= 0) && !this.e.isEmpty()) {
/*  85 */       this.h = (StackTraceElement[])ArrayUtils.subarray((Object[])((m)this.e.get(0)).a(), 0, 1);
/*     */     }
/*     */     
/*  88 */     if (this.h != null && this.h.length > 0) {
/*  89 */       ☃.append("-- Head --\n");
/*  90 */       ☃.append("Thread: ").append(Thread.currentThread().getName()).append("\n");
/*  91 */       ☃.append("Stacktrace:\n");
/*     */       
/*  93 */       for (StackTraceElement stackTraceElement : this.h) {
/*  94 */         ☃.append("\t").append("at ").append(stackTraceElement);
/*  95 */         ☃.append("\n");
/*     */       } 
/*  97 */       ☃.append("\n");
/*     */     } 
/*     */     
/* 100 */     for (m m1 : this.e) {
/* 101 */       m1.a(☃);
/* 102 */       ☃.append("\n\n");
/*     */     } 
/*     */     
/* 105 */     this.d.a(☃);
/*     */   }
/*     */   
/*     */   public String d() {
/* 109 */     StringWriter ☃ = null;
/* 110 */     PrintWriter printWriter = null;
/* 111 */     Throwable throwable = this.c;
/*     */     
/* 113 */     if (throwable.getMessage() == null) {
/*     */       
/* 115 */       if (throwable instanceof NullPointerException) {
/* 116 */         throwable = new NullPointerException(this.b);
/* 117 */       } else if (throwable instanceof StackOverflowError) {
/* 118 */         throwable = new StackOverflowError(this.b);
/* 119 */       } else if (throwable instanceof OutOfMemoryError) {
/* 120 */         throwable = new OutOfMemoryError(this.b);
/*     */       } 
/*     */       
/* 123 */       throwable.setStackTrace(this.c.getStackTrace());
/*     */     } 
/*     */     
/*     */     try {
/* 127 */       ☃ = new StringWriter();
/* 128 */       printWriter = new PrintWriter(☃);
/* 129 */       throwable.printStackTrace(printWriter);
/* 130 */       return ☃.toString();
/*     */     } finally {
/* 132 */       IOUtils.closeQuietly(☃);
/* 133 */       IOUtils.closeQuietly(printWriter);
/*     */     } 
/*     */   }
/*     */   
/*     */   public String e() {
/* 138 */     StringBuilder ☃ = new StringBuilder();
/*     */     
/* 140 */     ☃.append("---- Minecraft Crash Report ----\n");
/* 141 */     ☃.append("// ");
/* 142 */     ☃.append(j());
/* 143 */     ☃.append("\n\n");
/*     */     
/* 145 */     ☃.append("Time: ");
/* 146 */     ☃.append((new SimpleDateFormat()).format(new Date()));
/* 147 */     ☃.append("\n");
/*     */     
/* 149 */     ☃.append("Description: ");
/* 150 */     ☃.append(this.b);
/* 151 */     ☃.append("\n\n");
/*     */     
/* 153 */     ☃.append(d());
/* 154 */     ☃.append("\n\nA detailed walkthrough of the error, its code path and all known details is as follows:\n");
/*     */     
/* 156 */     for (int i = 0; i < 87; i++) {
/* 157 */       ☃.append("-");
/*     */     }
/* 159 */     ☃.append("\n\n");
/* 160 */     a(☃);
/*     */     
/* 162 */     return ☃.toString();
/*     */   }
/*     */   
/*     */   public File f() {
/* 166 */     return this.f;
/*     */   }
/*     */   
/*     */   public boolean a(File ☃) {
/* 170 */     if (this.f != null) {
/* 171 */       return false;
/*     */     }
/* 173 */     if (☃.getParentFile() != null) {
/* 174 */       ☃.getParentFile().mkdirs();
/*     */     }
/*     */     
/* 177 */     Writer writer = null;
/*     */     try {
/* 179 */       writer = new OutputStreamWriter(new FileOutputStream(☃), StandardCharsets.UTF_8);
/* 180 */       writer.write(e());
/*     */       
/* 182 */       this.f = ☃;
/* 183 */       return true;
/* 184 */     } catch (Throwable throwable) {
/* 185 */       a.error("Could not save crash report to {}", ☃, throwable);
/* 186 */       return false;
/*     */     } finally {
/* 188 */       IOUtils.closeQuietly(writer);
/*     */     } 
/*     */   }
/*     */   
/*     */   public m g() {
/* 193 */     return this.d;
/*     */   }
/*     */   
/*     */   public m a(String ☃) {
/* 197 */     return a(☃, 1);
/*     */   }
/*     */   
/*     */   public m a(String ☃, int i) {
/* 201 */     m m1 = new m(this, ☃);
/*     */     
/* 203 */     if (this.g) {
/* 204 */       int j = m1.a(i);
/* 205 */       StackTraceElement[] arrayOfStackTraceElement = this.c.getStackTrace();
/* 206 */       StackTraceElement stackTraceElement1 = null;
/* 207 */       StackTraceElement stackTraceElement2 = null;
/*     */       
/* 209 */       int k = arrayOfStackTraceElement.length - j;
/* 210 */       if (k < 0) {
/* 211 */         System.out.println("Negative index in crash report handler (" + arrayOfStackTraceElement.length + "/" + j + ")");
/*     */       }
/*     */       
/* 214 */       if (arrayOfStackTraceElement != null && 0 <= k && k < arrayOfStackTraceElement.length) {
/* 215 */         stackTraceElement1 = arrayOfStackTraceElement[k];
/*     */         
/* 217 */         if (arrayOfStackTraceElement.length + 1 - j < arrayOfStackTraceElement.length) {
/* 218 */           stackTraceElement2 = arrayOfStackTraceElement[arrayOfStackTraceElement.length + 1 - j];
/*     */         }
/*     */       } 
/*     */       
/* 222 */       this.g = m1.a(stackTraceElement1, stackTraceElement2);
/*     */       
/* 224 */       if (j > 0 && !this.e.isEmpty()) {
/* 225 */         m m2 = this.e.get(this.e.size() - 1);
/* 226 */         m2.b(j);
/* 227 */       } else if (arrayOfStackTraceElement != null && arrayOfStackTraceElement.length >= j && 0 <= k && k < arrayOfStackTraceElement.length) {
/* 228 */         this.h = new StackTraceElement[k];
/* 229 */         System.arraycopy(arrayOfStackTraceElement, 0, this.h, 0, this.h.length);
/*     */       } else {
/* 231 */         this.g = false;
/*     */       } 
/*     */     } 
/*     */     
/* 235 */     this.e.add(m1);
/* 236 */     return m1;
/*     */   }
/*     */ 
/*     */   
/*     */   private static String j() {
/* 241 */     String[] ☃ = { "Who set us up the TNT?", "Everything's going to plan. No, really, that was supposed to happen.", "Uh... Did I do that?", "Oops.", "Why did you do that?", "I feel sad now :(", "My bad.", "I'm sorry, Dave.", "I let you down. Sorry :(", "On the bright side, I bought you a teddy bear!", "Daisy, daisy...", "Oh - I know what I did wrong!", "Hey, that tickles! Hehehe!", "I blame Dinnerbone.", "You should try our sister game, Minceraft!", "Don't be sad. I'll do better next time, I promise!", "Don't be sad, have a hug! <3", "I just don't know what went wrong :(", "Shall we play a game?", "Quite honestly, I wouldn't worry myself about that.", "I bet Cylons wouldn't have this problem.", "Sorry :(", "Surprise! Haha. Well, this is awkward.", "Would you like a cupcake?", "Hi. I'm Minecraft, and I'm a crashaholic.", "Ooh. Shiny.", "This doesn't make any sense!", "Why is it breaking :(", "Don't do that.", "Ouch. That hurt :(", "You're mean.", "This is a token for 1 free hug. Redeem at your nearest Mojangsta: [~~HUG~~]", "There are four lights!", "But it works on my machine." };
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
/*     */ 
/*     */     
/*     */     try {
/* 279 */       return ☃[(int)(x.c() % ☃.length)];
/* 280 */     } catch (Throwable throwable) {
/* 281 */       return "Witty comment unavailable :(";
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public static l a(Throwable ☃, String str) {
/*     */     l l1;
/* 288 */     while (☃ instanceof java.util.concurrent.CompletionException && ☃.getCause() != null) {
/* 289 */       ☃ = ☃.getCause();
/*     */     }
/*     */     
/* 292 */     if (☃ instanceof u) {
/* 293 */       l1 = ((u)☃).a();
/*     */     } else {
/* 295 */       l1 = new l(str, ☃);
/*     */     } 
/*     */     
/* 298 */     return l1;
/*     */   }
/*     */   
/*     */   public static void h() {
/* 302 */     (new l("Don't panic!", new Throwable())).e();
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\l.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */