/*     */ import com.google.common.collect.Lists;
/*     */ import com.mojang.brigadier.context.CommandContext;
/*     */ import com.mojang.brigadier.suggestion.Suggestions;
/*     */ import com.mojang.brigadier.suggestion.SuggestionsBuilder;
/*     */ import java.util.Collection;
/*     */ import java.util.Collections;
/*     */ import java.util.List;
/*     */ import java.util.Locale;
/*     */ import java.util.Set;
/*     */ import java.util.concurrent.CompletableFuture;
/*     */ import java.util.stream.Stream;
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
/*     */ public class dwv
/*     */   implements dd
/*     */ {
/*     */   private final dwu a;
/*     */   private final djz b;
/*  33 */   private int c = -1;
/*     */   private CompletableFuture<Suggestions> d;
/*     */   
/*     */   public dwv(dwu ☃, djz djz1) {
/*  37 */     this.a = ☃;
/*  38 */     this.b = djz1;
/*     */   }
/*     */ 
/*     */   
/*     */   public Collection<String> l() {
/*  43 */     List<String> ☃ = Lists.newArrayList();
/*     */     
/*  45 */     for (dwx dwx : this.a.e()) {
/*  46 */       ☃.add(dwx.a().getName());
/*     */     }
/*     */     
/*  49 */     return ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public Collection<String> r() {
/*  54 */     if (this.b.v != null && this.b.v.c() == dcl.a.c) {
/*  55 */       return Collections.singleton(((dck)this.b.v).a().bT());
/*     */     }
/*  57 */     return Collections.emptyList();
/*     */   }
/*     */ 
/*     */   
/*     */   public Collection<String> m() {
/*  62 */     return this.a.j().G().f();
/*     */   }
/*     */ 
/*     */   
/*     */   public Collection<vk> n() {
/*  67 */     return this.b.W().a();
/*     */   }
/*     */ 
/*     */   
/*     */   public Stream<vk> o() {
/*  72 */     return this.a.d().d();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean c(int ☃) {
/*  77 */     dzm dzm = this.b.s;
/*  78 */     return (dzm != null) ? dzm.k(☃) : ((☃ == 0));
/*     */   }
/*     */ 
/*     */   
/*     */   public CompletableFuture<Suggestions> a(CommandContext<dd> ☃, SuggestionsBuilder suggestionsBuilder) {
/*  83 */     if (this.d != null) {
/*  84 */       this.d.cancel(false);
/*     */     }
/*  86 */     this.d = new CompletableFuture<>();
/*  87 */     int i = ++this.c;
/*  88 */     this.a.a(new sh(i, ☃.getInput()));
/*  89 */     return this.d;
/*     */   }
/*     */   
/*     */   private static String a(double ☃) {
/*  93 */     return String.format(Locale.ROOT, "%.2f", new Object[] { Double.valueOf(☃) });
/*     */   }
/*     */   
/*     */   private static String a(int ☃) {
/*  97 */     return Integer.toString(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public Collection<dd.a> s() {
/* 102 */     dcl ☃ = this.b.v;
/* 103 */     if (☃ == null || ☃.c() != dcl.a.b) {
/* 104 */       return super.s();
/*     */     }
/*     */     
/* 107 */     fx fx = ((dcj)☃).a();
/* 108 */     return Collections.singleton(new dd.a(a(fx.u()), a(fx.v()), a(fx.w())));
/*     */   }
/*     */ 
/*     */   
/*     */   public Collection<dd.a> t() {
/* 113 */     dcl ☃ = this.b.v;
/* 114 */     if (☃ == null || ☃.c() != dcl.a.b) {
/* 115 */       return super.t();
/*     */     }
/*     */     
/* 118 */     dcn dcn = ☃.e();
/* 119 */     return Collections.singleton(new dd.a(a(dcn.b), a(dcn.c), a(dcn.d)));
/*     */   }
/*     */ 
/*     */   
/*     */   public Set<vj<brx>> p() {
/* 124 */     return this.a.n();
/*     */   }
/*     */ 
/*     */   
/*     */   public gn q() {
/* 129 */     return this.a.o();
/*     */   }
/*     */   
/*     */   public void a(int ☃, Suggestions suggestions) {
/* 133 */     if (☃ == this.c) {
/* 134 */       this.d.complete(suggestions);
/* 135 */       this.d = null;
/* 136 */       this.c = -1;
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dwv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */