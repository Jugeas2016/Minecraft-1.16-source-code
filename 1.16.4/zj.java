/*     */ import com.google.common.collect.Streams;
/*     */ import java.io.File;
/*     */ import java.lang.management.ManagementFactory;
/*     */ import java.lang.management.ThreadInfo;
/*     */ import java.lang.management.ThreadMXBean;
/*     */ import java.text.SimpleDateFormat;
/*     */ import java.util.Date;
/*     */ import java.util.Locale;
/*     */ import java.util.Timer;
/*     */ import java.util.TimerTask;
/*     */ import java.util.stream.Collectors;
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
/*     */ public class zj
/*     */   implements Runnable
/*     */ {
/*  25 */   private static final Logger a = LogManager.getLogger();
/*     */   
/*     */   private final zg b;
/*     */   
/*     */   private final long c;
/*     */ 
/*     */   
/*     */   public zj(zg ☃) {
/*  33 */     this.b = ☃;
/*  34 */     this.c = ☃.bf();
/*     */   }
/*     */ 
/*     */   
/*     */   public void run() {
/*  39 */     while (this.b.v()) {
/*  40 */       long ☃ = this.b.ay();
/*  41 */       long l1 = x.b();
/*  42 */       long l2 = l1 - ☃;
/*     */       
/*  44 */       if (l2 > this.c) {
/*  45 */         a.fatal("A single server tick took {} seconds (should be max {})", String.format(Locale.ROOT, "%.2f", new Object[] { Float.valueOf((float)l2 / 1000.0F) }), String.format(Locale.ROOT, "%.2f", new Object[] { Float.valueOf(0.05F) }));
/*  46 */         a.fatal("Considering it to be crashed, server will forcibly shutdown.");
/*     */         
/*  48 */         ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();
/*  49 */         ThreadInfo[] arrayOfThreadInfo = threadMXBean.dumpAllThreads(true, true);
/*     */         
/*  51 */         StringBuilder stringBuilder = new StringBuilder();
/*  52 */         Error error = new Error("Watchdog");
/*     */         
/*  54 */         for (ThreadInfo threadInfo : arrayOfThreadInfo) {
/*  55 */           if (threadInfo.getThreadId() == this.b.aw().getId()) {
/*  56 */             error.setStackTrace(threadInfo.getStackTrace());
/*     */           }
/*     */           
/*  59 */           stringBuilder.append(threadInfo);
/*  60 */           stringBuilder.append("\n");
/*     */         } 
/*     */         
/*  63 */         l l = new l("Watching Server", error);
/*  64 */         this.b.b(l);
/*  65 */         m m1 = l.a("Thread Dump");
/*  66 */         m1.a("Threads", stringBuilder);
/*     */         
/*  68 */         m m2 = l.a("Performance stats");
/*  69 */         m2.a("Random tick rate", () -> ((brt.d)this.b.aX().q().<brt.d>a(brt.m)).toString());
/*  70 */         m2.a("Level stats", () -> (String)Streams.stream(this.b.G()).map(()).collect(Collectors.joining(",\n")));
/*     */         
/*  72 */         vm.a("Crash report:\n" + l.e());
/*     */         
/*  74 */         File file = new File(new File(this.b.B(), "crash-reports"), "crash-" + (new SimpleDateFormat("yyyy-MM-dd_HH.mm.ss")).format(new Date()) + "-server.txt");
/*  75 */         if (l.a(file)) {
/*  76 */           a.error("This crash report has been saved to: {}", file.getAbsolutePath());
/*     */         } else {
/*  78 */           a.error("We were unable to save this crash report to disk.");
/*     */         } 
/*     */         
/*  81 */         a();
/*     */       } 
/*     */       
/*     */       try {
/*  85 */         Thread.sleep(☃ + this.c - l1);
/*  86 */       } catch (InterruptedException interruptedException) {}
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   private void a() {
/*     */     try {
/*  93 */       Timer ☃ = new Timer();
/*  94 */       ☃.schedule(new TimerTask(this)
/*     */           {
/*     */             public void run() {
/*  97 */               Runtime.getRuntime().halt(1);
/*     */             }
/*     */           },  10000L);
/*     */       
/* 101 */       System.exit(1);
/* 102 */     } catch (Throwable ☃) {
/* 103 */       Runtime.getRuntime().halt(1);
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\zj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */