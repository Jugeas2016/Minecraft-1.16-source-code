/*    */ import com.google.common.collect.Multimap;
/*    */ import java.util.Map;
/*    */ import java.util.concurrent.CompletableFuture;
/*    */ import java.util.concurrent.Executor;
/*    */ import java.util.stream.Collectors;
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
/*    */ 
/*    */ public class aep
/*    */   implements acc
/*    */ {
/* 20 */   private final aeo<buo> a = new aeo<>(gm.Q::b, "tags/blocks", "block");
/* 21 */   private final aeo<blx> b = new aeo<>(gm.T::b, "tags/items", "item");
/* 22 */   private final aeo<cuw> c = new aeo<>(gm.O::b, "tags/fluids", "fluid");
/* 23 */   private final aeo<aqe<?>> d = new aeo<>(gm.S::b, "tags/entity_types", "entity_type");
/*    */   
/* 25 */   private aen e = aen.a;
/*    */   
/*    */   public aen a() {
/* 28 */     return this.e;
/*    */   }
/*    */ 
/*    */   
/*    */   public CompletableFuture<Void> a(acc.a ☃, ach ach1, anw anw1, anw anw2, Executor executor1, Executor executor2) {
/* 33 */     CompletableFuture<Map<vk, ael.a>> completableFuture1 = this.a.a(ach1, executor1);
/* 34 */     CompletableFuture<Map<vk, ael.a>> completableFuture2 = this.b.a(ach1, executor1);
/* 35 */     CompletableFuture<Map<vk, ael.a>> completableFuture3 = this.c.a(ach1, executor1);
/* 36 */     CompletableFuture<Map<vk, ael.a>> completableFuture4 = this.d.a(ach1, executor1);
/* 37 */     return CompletableFuture.allOf((CompletableFuture<?>[])new CompletableFuture[] { completableFuture1, completableFuture2, completableFuture3, completableFuture4
/* 38 */         }).thenCompose(☃::a)
/* 39 */       .thenAcceptAsync(void_ -> {
/*    */           aem<buo> aem = this.a.a(☃.join());
/*    */           aem<blx> aem1 = this.b.a(completableFuture1.join());
/*    */           aem<cuw> aem2 = this.c.a(completableFuture2.join());
/*    */           aem<aqe<?>> aem3 = this.d.a(completableFuture3.join());
/*    */           aen aen1 = aen.a(aem, aem1, aem2, aem3);
/*    */           Multimap<vk, vk> multimap = aek.b(aen1);
/*    */           if (!multimap.isEmpty())
/*    */             throw new IllegalStateException("Missing required tags: " + (String)multimap.entries().stream().map(()).sorted().collect(Collectors.joining(","))); 
/*    */           aeh.a(aen1);
/*    */           this.e = aen1;
/*    */         }executor2);
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\aep.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */