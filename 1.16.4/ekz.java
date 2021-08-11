/*    */ import com.google.common.collect.ImmutableMap;
/*    */ import com.google.common.collect.Lists;
/*    */ import com.google.common.collect.Maps;
/*    */ import com.google.common.collect.Sets;
/*    */ import java.util.List;
/*    */ import java.util.Map;
/*    */ import java.util.SortedSet;
/*    */ import java.util.stream.Stream;
/*    */ import org.apache.logging.log4j.LogManager;
/*    */ import org.apache.logging.log4j.Logger;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ekz
/*    */   implements aci
/*    */ {
/* 21 */   private static final Logger a = LogManager.getLogger();
/*    */   
/* 23 */   private static final eky b = new eky("en_us", "US", "English", false);
/*    */   
/* 25 */   private Map<String, eky> c = (Map<String, eky>)ImmutableMap.of("en_us", b);
/*    */   private String d;
/* 27 */   private eky e = b;
/*    */ 
/*    */   
/*    */   public ekz(String ☃) {
/* 31 */     this.d = ☃;
/*    */   }
/*    */   
/*    */   private static Map<String, eky> a(Stream<abj> ☃) {
/* 35 */     Map<String, eky> map = Maps.newHashMap();
/*    */     
/* 37 */     ☃.forEach(abj1 -> {
/*    */           try {
/*    */             elh elh = abj1.<elh>a(elh.a);
/*    */             
/*    */             if (elh != null) {
/*    */               for (eky eky1 : elh.a()) {
/*    */                 ☃.putIfAbsent(eky1.getCode(), eky1);
/*    */               }
/*    */             }
/* 46 */           } catch (RuntimeException|java.io.IOException exception) {
/*    */             a.warn("Unable to parse language metadata section of resourcepack: {}", abj1.a(), exception);
/*    */           } 
/*    */         });
/*    */     
/* 51 */     return (Map<String, eky>)ImmutableMap.copyOf(map);
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(ach ☃) {
/* 56 */     this.c = a(☃.b());
/* 57 */     eky eky1 = this.c.getOrDefault("en_us", b);
/* 58 */     this.e = this.c.getOrDefault(this.d, eky1);
/*    */     
/* 60 */     List<eky> list = Lists.newArrayList((Object[])new eky[] { eky1 });
/* 61 */     if (this.e != eky1) {
/* 62 */       list.add(this.e);
/*    */     }
/*    */     
/* 65 */     ekv ekv = ekv.a(☃, list);
/*    */     
/* 67 */     ekx.a(ekv);
/*    */     
/* 69 */     ly.a(ekv);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void a(eky ☃) {
/* 77 */     this.d = ☃.getCode();
/* 78 */     this.e = ☃;
/*    */   }
/*    */   
/*    */   public eky b() {
/* 82 */     return this.e;
/*    */   }
/*    */   
/*    */   public SortedSet<eky> d() {
/* 86 */     return Sets.newTreeSet(this.c.values());
/*    */   }
/*    */   
/*    */   public eky a(String ☃) {
/* 90 */     return this.c.get(☃);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ekz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */