/*     */ import com.google.common.collect.ImmutableMap;
/*     */ import com.google.common.collect.Maps;
/*     */ import com.mojang.brigadier.CommandDispatcher;
/*     */ import com.mojang.datafixers.util.Pair;
/*     */ import java.io.IOException;
/*     */ import java.nio.charset.StandardCharsets;
/*     */ import java.util.Collection;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Optional;
/*     */ import java.util.concurrent.CompletableFuture;
/*     */ import java.util.concurrent.CompletionException;
/*     */ import java.util.concurrent.CompletionStage;
/*     */ import java.util.concurrent.Executor;
/*     */ import org.apache.commons.io.IOUtils;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class vw
/*     */   implements acc
/*     */ {
/*  35 */   private static final Logger a = LogManager.getLogger();
/*     */ 
/*     */   
/*  38 */   private static final int b = "functions/".length();
/*  39 */   private static final int c = ".mcfunction".length();
/*     */   
/*  41 */   private volatile Map<vk, cy> d = (Map<vk, cy>)ImmutableMap.of();
/*  42 */   private final aeo<cy> e = new aeo<>(this::a, "tags/functions", "function");
/*  43 */   private volatile aem<cy> f = aem.c();
/*     */   
/*     */   private final int g;
/*     */   private final CommandDispatcher<db> h;
/*     */   
/*     */   public Optional<cy> a(vk ☃) {
/*  49 */     return Optional.ofNullable(this.d.get(☃));
/*     */   }
/*     */   
/*     */   public Map<vk, cy> a() {
/*  53 */     return this.d;
/*     */   }
/*     */   
/*     */   public aem<cy> b() {
/*  57 */     return this.f;
/*     */   }
/*     */   
/*     */   public ael<cy> b(vk ☃) {
/*  61 */     return this.f.b(☃);
/*     */   }
/*     */   
/*     */   public vw(int ☃, CommandDispatcher<db> commandDispatcher) {
/*  65 */     this.g = ☃;
/*  66 */     this.h = commandDispatcher;
/*     */   }
/*     */ 
/*     */   
/*     */   public CompletableFuture<Void> a(acc.a ☃, ach ach1, anw anw1, anw anw2, Executor executor1, Executor executor2) {
/*  71 */     CompletableFuture<Map<vk, ael.a>> completableFuture = this.e.a(ach1, executor1);
/*     */ 
/*     */ 
/*     */     
/*  75 */     CompletableFuture<Map<vk, CompletableFuture<cy>>> completableFuture1 = CompletableFuture.supplyAsync(() -> ☃.a("functions", ()), executor1).thenCompose(collection -> {
/*     */           Map<vk, CompletableFuture<cy>> map = Maps.newHashMap();
/*     */ 
/*     */           
/*     */           db db = new db(da.a_, dcn.a, dcm.a, null, this.g, "", oe.d, null, null);
/*     */ 
/*     */           
/*     */           for (vk vk1 : collection) {
/*     */             String str = vk1.a();
/*     */             
/*     */             vk vk2 = new vk(vk1.b(), str.substring(b, str.length() - c));
/*     */             
/*     */             map.put(vk2, CompletableFuture.supplyAsync((), executor));
/*     */           } 
/*     */           
/*     */           CompletableFuture[] arrayOfCompletableFuture = (CompletableFuture[])map.values().toArray((Object[])new CompletableFuture[0]);
/*     */           
/*     */           return CompletableFuture.allOf((CompletableFuture<?>[])arrayOfCompletableFuture).handle(());
/*     */         });
/*     */     
/*  95 */     return completableFuture.thenCombine(completableFuture1, Pair::of)
/*  96 */       .thenCompose(☃::a)
/*  97 */       .thenAcceptAsync(☃ -> {
/*     */           Map<vk, CompletableFuture<cy>> map = (Map<vk, CompletableFuture<cy>>)☃.getSecond();
/*     */           ImmutableMap.Builder<vk, cy> builder = ImmutableMap.builder();
/*     */           map.forEach(());
/*     */           this.d = (Map<vk, cy>)builder.build();
/*     */           this.f = this.e.a((Map<vk, ael.a>)☃.getFirst());
/*     */         }executor2);
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
/*     */   private static List<String> a(ach ☃, vk vk1) {
/* 117 */     try (acg ☃ = ☃.a(vk1)) {
/* 118 */       return IOUtils.readLines(acg.b(), StandardCharsets.UTF_8);
/* 119 */     } catch (IOException iOException) {
/* 120 */       throw new CompletionException(iOException);
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\vw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */