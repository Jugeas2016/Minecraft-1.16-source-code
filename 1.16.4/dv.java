/*     */ import com.mojang.brigadier.StringReader;
/*     */ import com.mojang.brigadier.arguments.ArgumentType;
/*     */ import com.mojang.brigadier.context.CommandContext;
/*     */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*     */ import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
/*     */ import com.mojang.brigadier.suggestion.Suggestions;
/*     */ import com.mojang.brigadier.suggestion.SuggestionsBuilder;
/*     */ import java.util.Arrays;
/*     */ import java.util.Collection;
/*     */ import java.util.concurrent.CompletableFuture;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class dv
/*     */   implements ArgumentType<dv.a>
/*     */ {
/*  21 */   private static final Collection<String> a = Arrays.asList(new String[] { "=", ">", "<" });
/*  22 */   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(new of("arguments.operation.invalid"));
/*  23 */   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(new of("arguments.operation.div0"));
/*     */   
/*     */   public static dv a() {
/*  26 */     return new dv();
/*     */   }
/*     */   
/*     */   public static a a(CommandContext<db> ☃, String str) throws CommandSyntaxException {
/*  30 */     return (a)☃.getArgument(str, a.class);
/*     */   }
/*     */ 
/*     */   
/*     */   public a a(StringReader ☃) throws CommandSyntaxException {
/*  35 */     if (☃.canRead()) {
/*  36 */       int i = ☃.getCursor();
/*  37 */       while (☃.canRead() && ☃.peek() != ' ') {
/*  38 */         ☃.skip();
/*     */       }
/*  40 */       return a(☃.getString().substring(i, ☃.getCursor()));
/*     */     } 
/*     */     
/*  43 */     throw b.create();
/*     */   }
/*     */ 
/*     */   
/*     */   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> ☃, SuggestionsBuilder suggestionsBuilder) {
/*  48 */     return dd.a(new String[] { "=", "+=", "-=", "*=", "/=", "%=", "<", ">", "><" }, suggestionsBuilder);
/*     */   }
/*     */ 
/*     */   
/*     */   public Collection<String> getExamples() {
/*  53 */     return a;
/*     */   }
/*     */   
/*     */   private static a a(String ☃) throws CommandSyntaxException {
/*  57 */     if (☃.equals("><")) {
/*  58 */       return (☃, ddm1) -> {
/*     */           int i = ☃.b();
/*     */           
/*     */           ☃.c(ddm1.b());
/*     */           ddm1.c(i);
/*     */         };
/*     */     }
/*  65 */     return b(☃);
/*     */   }
/*     */   
/*     */   private static b b(String ☃) throws CommandSyntaxException {
/*  69 */     switch (☃) {
/*     */       case "=":
/*  71 */         return (☃, i) -> i;
/*     */       case "+=":
/*  73 */         return (☃, i) -> ☃ + i;
/*     */       case "-=":
/*  75 */         return (☃, i) -> ☃ - i;
/*     */       case "*=":
/*  77 */         return (☃, i) -> ☃ * i;
/*     */       case "/=":
/*  79 */         return (☃, i) -> {
/*     */             if (i == 0) {
/*     */               throw c.create();
/*     */             }
/*     */             return afm.a(☃, i);
/*     */           };
/*     */       case "%=":
/*  86 */         return (☃, i) -> {
/*     */             if (i == 0) {
/*     */               throw c.create();
/*     */             }
/*     */             return afm.b(☃, i);
/*     */           };
/*     */       case "<":
/*  93 */         return Math::min;
/*     */       case ">":
/*  95 */         return Math::max;
/*     */     } 
/*  97 */     throw b.create();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   @FunctionalInterface
/*     */   static interface b
/*     */     extends a
/*     */   {
/*     */     int apply(int param1Int1, int param1Int2) throws CommandSyntaxException;
/*     */ 
/*     */ 
/*     */     
/*     */     default void apply(ddm ☃, ddm ddm1) throws CommandSyntaxException {
/* 111 */       ☃.c(apply(☃.b(), ddm1.b()));
/*     */     }
/*     */   }
/*     */   
/*     */   @FunctionalInterface
/*     */   public static interface a {
/*     */     void apply(ddm param1ddm1, ddm param1ddm2) throws CommandSyntaxException;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */