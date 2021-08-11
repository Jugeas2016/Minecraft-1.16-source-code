/*    */ import com.google.common.collect.ImmutableMap;
/*    */ import com.google.gson.Gson;
/*    */ import com.google.gson.JsonElement;
/*    */ import java.util.Collections;
/*    */ import java.util.Map;
/*    */ import java.util.Set;
/*    */ import java.util.function.Predicate;
/*    */ import javax.annotation.Nullable;
/*    */ import org.apache.logging.log4j.LogManager;
/*    */ import org.apache.logging.log4j.Logger;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class cza
/*    */   extends acj
/*    */ {
/* 24 */   private static final Logger a = LogManager.getLogger(); private Map<vk, dbo> c;
/* 25 */   private static final Gson b = cys.a().create();
/*    */   
/*    */   public cza() {
/* 28 */     super(b, "predicates");
/*    */ 
/*    */     
/* 31 */     this.c = (Map<vk, dbo>)ImmutableMap.of();
/*    */   }
/*    */   @Nullable
/*    */   public dbo a(vk ☃) {
/* 35 */     return this.c.get(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   protected void a(Map<vk, JsonElement> ☃, ach ach1, anw anw1) {
/* 40 */     ImmutableMap.Builder<vk, dbo> builder = ImmutableMap.builder();
/* 41 */     ☃.forEach((vk1, jsonElement) -> {
/*    */           try {
/*    */             if (jsonElement.isJsonArray()) {
/*    */               dbo[] arrayOfDbo = (dbo[])b.fromJson(jsonElement, dbo[].class);
/*    */               ☃.put(vk1, new a(arrayOfDbo));
/*    */             } else {
/*    */               dbo dbo = (dbo)b.fromJson(jsonElement, dbo.class);
/*    */               ☃.put(vk1, dbo);
/*    */             } 
/* 50 */           } catch (Exception exception) {
/*    */             a.error("Couldn't parse loot table {}", vk1, exception);
/*    */           } 
/*    */         });
/*    */     
/* 55 */     ImmutableMap immutableMap = builder.build();
/* 56 */     czg czg = new czg(dbb.k, immutableMap::get, ☃ -> null);
/* 57 */     immutableMap.forEach((vk1, dbo1) -> dbo1.a(☃.b("{" + vk1 + "}", vk1)));
/* 58 */     czg.a().forEach((☃, str1) -> a.warn("Found validation problem in " + ☃ + ": " + str1));
/*    */     
/* 60 */     this.c = (Map<vk, dbo>)immutableMap;
/*    */   }
/*    */   
/*    */   public Set<vk> a() {
/* 64 */     return Collections.unmodifiableSet(this.c.keySet());
/*    */   }
/*    */   
/*    */   static class a implements dbo {
/*    */     private final dbo[] a;
/*    */     private final Predicate<cyv> b;
/*    */     
/*    */     private a(dbo[] ☃) {
/* 72 */       this.a = ☃;
/* 73 */       this.b = dbq.a((Predicate<cyv>[])☃);
/*    */     }
/*    */ 
/*    */     
/*    */     public final boolean a(cyv ☃) {
/* 78 */       return this.b.test(☃);
/*    */     }
/*    */ 
/*    */     
/*    */     public void a(czg ☃) {
/* 83 */       super.a(☃);
/*    */       
/* 85 */       for (int i = 0; i < this.a.length; i++) {
/* 86 */         this.a[i].a(☃.b(".term[" + i + "]"));
/*    */       }
/*    */     }
/*    */ 
/*    */     
/*    */     public dbp b() {
/* 92 */       throw new UnsupportedOperationException();
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cza.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */