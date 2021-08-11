/*     */ import com.google.common.collect.Maps;
/*     */ import com.mojang.brigadier.ImmutableStringReader;
/*     */ import com.mojang.brigadier.Message;
/*     */ import com.mojang.brigadier.StringReader;
/*     */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*     */ import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
/*     */ import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
/*     */ import com.mojang.brigadier.suggestion.Suggestions;
/*     */ import com.mojang.brigadier.suggestion.SuggestionsBuilder;
/*     */ import java.util.Map;
/*     */ import java.util.concurrent.CompletableFuture;
/*     */ import java.util.function.BiFunction;
/*     */ import javax.annotation.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ey
/*     */ {
/*     */   public static final DynamicCommandExceptionType b;
/*     */   private static final BiFunction<SuggestionsBuilder, aem<blx>, CompletableFuture<Suggestions>> c;
/*  26 */   public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(new of("argument.item.tag.disallowed")); static {
/*  27 */     b = new DynamicCommandExceptionType(☃ -> new of("argument.item.id.invalid", new Object[] { ☃ }));
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  32 */     c = ((☃, aem1) -> ☃.buildFuture());
/*     */   }
/*     */   private final StringReader d;
/*     */   private final boolean e;
/*  36 */   private final Map<cfj<?>, Comparable<?>> f = Maps.newHashMap();
/*     */   private blx g;
/*     */   @Nullable
/*     */   private md h;
/*  40 */   private vk i = new vk("");
/*     */   private int j;
/*  42 */   private BiFunction<SuggestionsBuilder, aem<blx>, CompletableFuture<Suggestions>> k = c;
/*     */   
/*     */   public ey(StringReader ☃, boolean bool) {
/*  45 */     this.d = ☃;
/*  46 */     this.e = bool;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public blx b() {
/*  54 */     return this.g;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public md c() {
/*  59 */     return this.h;
/*     */   }
/*     */   
/*     */   public vk d() {
/*  63 */     return this.i;
/*     */   }
/*     */   
/*     */   public void e() throws CommandSyntaxException {
/*  67 */     int ☃ = this.d.getCursor();
/*  68 */     vk vk1 = vk.a(this.d);
/*  69 */     this.g = (blx)gm.T.b(vk1).orElseThrow(() -> {
/*     */           this.d.setCursor(☃);
/*     */           return b.createWithContext((ImmutableStringReader)this.d, vk1.toString());
/*     */         });
/*     */   }
/*     */   
/*     */   public void f() throws CommandSyntaxException {
/*  76 */     if (!this.e) {
/*  77 */       throw a.create();
/*     */     }
/*     */     
/*  80 */     this.k = this::c;
/*  81 */     this.d.expect('#');
/*  82 */     this.j = this.d.getCursor();
/*  83 */     this.i = vk.a(this.d);
/*     */   }
/*     */   
/*     */   public void g() throws CommandSyntaxException {
/*  87 */     this.h = (new mu(this.d)).f();
/*     */   }
/*     */   
/*     */   public ey h() throws CommandSyntaxException {
/*  91 */     this.k = this::d;
/*  92 */     if (this.d.canRead() && this.d.peek() == '#') {
/*  93 */       f();
/*     */     } else {
/*  95 */       e();
/*  96 */       this.k = this::b;
/*     */     } 
/*  98 */     if (this.d.canRead() && this.d.peek() == '{') {
/*  99 */       this.k = c;
/* 100 */       g();
/*     */     } 
/* 102 */     return this;
/*     */   }
/*     */   
/*     */   private CompletableFuture<Suggestions> b(SuggestionsBuilder ☃, aem<blx> aem1) {
/* 106 */     if (☃.getRemaining().isEmpty()) {
/* 107 */       ☃.suggest(String.valueOf('{'));
/*     */     }
/* 109 */     return ☃.buildFuture();
/*     */   }
/*     */   
/*     */   private CompletableFuture<Suggestions> c(SuggestionsBuilder ☃, aem<blx> aem1) {
/* 113 */     return dd.a(aem1.b(), ☃.createOffset(this.j));
/*     */   }
/*     */   
/*     */   private CompletableFuture<Suggestions> d(SuggestionsBuilder ☃, aem<blx> aem1) {
/* 117 */     if (this.e) {
/* 118 */       dd.a(aem1.b(), ☃, String.valueOf('#'));
/*     */     }
/* 120 */     return dd.a(gm.T.c(), ☃);
/*     */   }
/*     */   
/*     */   public CompletableFuture<Suggestions> a(SuggestionsBuilder ☃, aem<blx> aem1) {
/* 124 */     return this.k.apply(☃.createOffset(this.d.getCursor()), aem1);
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ey.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */