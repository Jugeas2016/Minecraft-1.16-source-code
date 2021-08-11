/*    */ import com.google.common.base.Stopwatch;
/*    */ import com.google.common.collect.Lists;
/*    */ import java.io.IOException;
/*    */ import java.nio.file.Path;
/*    */ import java.util.Collection;
/*    */ import java.util.List;
/*    */ import java.util.concurrent.TimeUnit;
/*    */ import org.apache.logging.log4j.LogManager;
/*    */ import org.apache.logging.log4j.Logger;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class hl
/*    */ {
/* 16 */   private static final Logger a = LogManager.getLogger();
/*    */   
/*    */   private final Collection<Path> b;
/*    */   private final Path c;
/* 20 */   private final List<hm> d = Lists.newArrayList();
/*    */   
/*    */   static {
/* 23 */     vm.a();
/*    */   }
/*    */   
/*    */   public hl(Path ☃, Collection<Path> collection) {
/* 27 */     this.c = ☃;
/* 28 */     this.b = collection;
/*    */   }
/*    */   
/*    */   public Collection<Path> a() {
/* 32 */     return this.b;
/*    */   }
/*    */   
/*    */   public Path b() {
/* 36 */     return this.c;
/*    */   }
/*    */   
/*    */   public void c() throws IOException {
/* 40 */     hn ☃ = new hn(this.c, "cache");
/* 41 */     ☃.c(b().resolve("version.json"));
/*    */     
/* 43 */     Stopwatch stopwatch1 = Stopwatch.createStarted();
/* 44 */     Stopwatch stopwatch2 = Stopwatch.createUnstarted();
/* 45 */     for (hm hm : this.d) {
/* 46 */       a.info("Starting provider: {}", hm.a());
/* 47 */       stopwatch2.start();
/* 48 */       hm.a(☃);
/* 49 */       stopwatch2.stop();
/* 50 */       a.info("{} finished after {} ms", hm.a(), Long.valueOf(stopwatch2.elapsed(TimeUnit.MILLISECONDS)));
/* 51 */       stopwatch2.reset();
/*    */     } 
/* 53 */     a.info("All providers took: {} ms", Long.valueOf(stopwatch1.elapsed(TimeUnit.MILLISECONDS)));
/*    */     
/* 55 */     ☃.a();
/*    */   }
/*    */   
/*    */   public void a(hm ☃) {
/* 59 */     this.d.add(☃);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\hl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */