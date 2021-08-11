/*     */ import com.google.common.collect.Maps;
/*     */ import java.net.MalformedURLException;
/*     */ import java.net.URL;
/*     */ import java.util.Map;
/*     */ import java.util.Timer;
/*     */ import java.util.UUID;
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
/*     */ public class apc
/*     */ {
/*  21 */   private final Map<String, Object> a = Maps.newHashMap();
/*  22 */   private final Map<String, Object> b = Maps.newHashMap();
/*     */   
/*  24 */   private final String c = UUID.randomUUID().toString();
/*     */   private final URL d;
/*     */   private final apd e;
/*  27 */   private final Timer f = new Timer("Snooper Timer", true);
/*  28 */   private final Object g = new Object();
/*     */   
/*     */   private final long h;
/*     */   private boolean i;
/*     */   
/*     */   public apc(String ☃, apd apd1, long l) {
/*     */     try {
/*  35 */       this.d = new URL("http://snoop.minecraft.net/" + ☃ + "?version=" + '\002');
/*  36 */     } catch (MalformedURLException malformedURLException) {
/*  37 */       throw new IllegalArgumentException();
/*     */     } 
/*     */     
/*  40 */     this.e = apd1;
/*  41 */     this.h = l;
/*     */   }
/*     */   
/*     */   public void a() {
/*  45 */     if (!this.i);
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
/*     */   public void b() {
/*  96 */     b("memory_total", Long.valueOf(Runtime.getRuntime().totalMemory()));
/*  97 */     b("memory_max", Long.valueOf(Runtime.getRuntime().maxMemory()));
/*  98 */     b("memory_free", Long.valueOf(Runtime.getRuntime().freeMemory()));
/*  99 */     b("cpu_cores", Integer.valueOf(Runtime.getRuntime().availableProcessors()));
/*     */     
/* 101 */     this.e.a(this);
/*     */   }
/*     */   
/*     */   public void a(String ☃, Object object) {
/* 105 */     synchronized (this.g) {
/* 106 */       this.b.put(☃, object);
/*     */     } 
/*     */   }
/*     */   
/*     */   public void b(String ☃, Object object) {
/* 111 */     synchronized (this.g) {
/* 112 */       this.a.put(☃, object);
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean d() {
/* 135 */     return this.i;
/*     */   }
/*     */   
/*     */   public void e() {
/* 139 */     this.f.cancel();
/*     */   }
/*     */   
/*     */   public String f() {
/* 143 */     return this.c;
/*     */   }
/*     */   
/*     */   public long g() {
/* 147 */     return this.h;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\apc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */