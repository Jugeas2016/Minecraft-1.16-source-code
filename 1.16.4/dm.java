/*     */ import com.google.common.collect.Lists;
/*     */ import com.mojang.authlib.GameProfile;
/*     */ import com.mojang.brigadier.StringReader;
/*     */ import com.mojang.brigadier.arguments.ArgumentType;
/*     */ import com.mojang.brigadier.context.CommandContext;
/*     */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*     */ import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
/*     */ import com.mojang.brigadier.suggestion.Suggestions;
/*     */ import com.mojang.brigadier.suggestion.SuggestionsBuilder;
/*     */ import java.util.Arrays;
/*     */ import java.util.Collection;
/*     */ import java.util.Collections;
/*     */ import java.util.List;
/*     */ import java.util.concurrent.CompletableFuture;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class dm
/*     */   implements ArgumentType<dm.a>
/*     */ {
/*  26 */   private static final Collection<String> b = Arrays.asList(new String[] { "Player", "0123", "dd12be42-52a9-4a91-a8a1-11c01849e498", "@e" });
/*  27 */   public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(new of("argument.player.unknown"));
/*     */   
/*     */   public static Collection<GameProfile> a(CommandContext<db> ☃, String str) throws CommandSyntaxException {
/*  30 */     return ((a)☃.getArgument(str, a.class)).getNames((db)☃.getSource());
/*     */   }
/*     */   
/*     */   public static dm a() {
/*  34 */     return new dm();
/*     */   }
/*     */ 
/*     */   
/*     */   public a a(StringReader ☃) throws CommandSyntaxException {
/*  39 */     if (☃.canRead() && ☃.peek() == '@') {
/*  40 */       fd fd = new fd(☃);
/*  41 */       fc fc = fd.t();
/*  42 */       if (fc.b()) {
/*  43 */         throw dk.c.create();
/*     */       }
/*  45 */       return new b(fc);
/*     */     } 
/*     */     
/*  48 */     int i = ☃.getCursor();
/*  49 */     while (☃.canRead() && ☃.peek() != ' ') {
/*  50 */       ☃.skip();
/*     */     }
/*  52 */     String str = ☃.getString().substring(i, ☃.getCursor());
/*  53 */     return db1 -> {
/*     */         GameProfile gameProfile = db1.j().ar().a(☃);
/*     */         if (gameProfile == null) {
/*     */           throw a.create();
/*     */         }
/*     */         return Collections.singleton(gameProfile);
/*     */       };
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static class b
/*     */     implements a
/*     */   {
/*     */     private final fc a;
/*     */ 
/*     */     
/*     */     public b(fc ☃) {
/*  71 */       this.a = ☃;
/*     */     }
/*     */ 
/*     */     
/*     */     public Collection<GameProfile> getNames(db ☃) throws CommandSyntaxException {
/*  76 */       List<aah> list = this.a.d(☃);
/*  77 */       if (list.isEmpty()) {
/*  78 */         throw dk.e.create();
/*     */       }
/*  80 */       List<GameProfile> list1 = Lists.newArrayList();
/*  81 */       for (aah aah : list) {
/*  82 */         list1.add(aah.eA());
/*     */       }
/*  84 */       return list1;
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> ☃, SuggestionsBuilder suggestionsBuilder) {
/*  90 */     if (☃.getSource() instanceof dd) {
/*  91 */       StringReader stringReader = new StringReader(suggestionsBuilder.getInput());
/*  92 */       stringReader.setCursor(suggestionsBuilder.getStart());
/*  93 */       fd fd = new fd(stringReader);
/*     */       try {
/*  95 */         fd.t();
/*  96 */       } catch (CommandSyntaxException commandSyntaxException) {}
/*     */       
/*  98 */       return fd.a(suggestionsBuilder, suggestionsBuilder -> dd.b(((dd)☃.getSource()).l(), suggestionsBuilder));
/*     */     } 
/* 100 */     return Suggestions.empty();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Collection<String> getExamples() {
/* 106 */     return b;
/*     */   }
/*     */   
/*     */   @FunctionalInterface
/*     */   public static interface a {
/*     */     Collection<GameProfile> getNames(db param1db) throws CommandSyntaxException;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */