/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.gson.JsonObject;
/*     */ import com.mojang.brigadier.StringReader;
/*     */ import com.mojang.brigadier.arguments.ArgumentType;
/*     */ import com.mojang.brigadier.context.CommandContext;
/*     */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*     */ import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
/*     */ import com.mojang.brigadier.suggestion.SuggestionProvider;
/*     */ import com.mojang.brigadier.suggestion.SuggestionsBuilder;
/*     */ import java.util.Arrays;
/*     */ import java.util.Collection;
/*     */ import java.util.Collections;
/*     */ import java.util.List;
/*     */ import java.util.concurrent.CompletableFuture;
/*     */ import java.util.function.Supplier;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class dz
/*     */   implements ArgumentType<dz.a>
/*     */ {
/*     */   public static final SuggestionProvider<db> a;
/*     */   
/*     */   static {
/*  27 */     a = ((☃, suggestionsBuilder) -> {
/*     */         StringReader stringReader = new StringReader(suggestionsBuilder.getInput());
/*     */         stringReader.setCursor(suggestionsBuilder.getStart());
/*     */         fd fd = new fd(stringReader);
/*     */         try {
/*     */           fd.t();
/*  33 */         } catch (CommandSyntaxException commandSyntaxException) {}
/*     */         return fd.a(suggestionsBuilder, ());
/*     */       });
/*     */   }
/*     */   
/*  38 */   private static final Collection<String> b = Arrays.asList(new String[] { "Player", "0123", "*", "@e" });
/*  39 */   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(new of("argument.scoreHolder.empty"));
/*     */ 
/*     */   
/*     */   private final boolean d;
/*     */ 
/*     */   
/*     */   public dz(boolean ☃) {
/*  46 */     this.d = ☃;
/*     */   }
/*     */   
/*     */   public static String a(CommandContext<db> ☃, String str) throws CommandSyntaxException {
/*  50 */     return b(☃, str).iterator().next();
/*     */   }
/*     */   
/*     */   public static Collection<String> b(CommandContext<db> ☃, String str) throws CommandSyntaxException {
/*  54 */     return a(☃, str, Collections::emptyList);
/*     */   }
/*     */   
/*     */   public static Collection<String> c(CommandContext<db> ☃, String str) throws CommandSyntaxException {
/*  58 */     return a(☃, str, ((db)☃.getSource()).j().aH()::e);
/*     */   }
/*     */   
/*     */   public static Collection<String> a(CommandContext<db> ☃, String str, Supplier<Collection<String>> supplier) throws CommandSyntaxException {
/*  62 */     Collection<String> collection = ((a)☃.getArgument(str, a.class)).getNames((db)☃.getSource(), supplier);
/*  63 */     if (collection.isEmpty()) {
/*  64 */       throw dk.d.create();
/*     */     }
/*  66 */     return collection;
/*     */   }
/*     */   
/*     */   public static dz a() {
/*  70 */     return new dz(false);
/*     */   }
/*     */   
/*     */   public static dz b() {
/*  74 */     return new dz(true);
/*     */   }
/*     */ 
/*     */   
/*     */   public a a(StringReader ☃) throws CommandSyntaxException {
/*  79 */     if (☃.canRead() && ☃.peek() == '@') {
/*  80 */       fd fd = new fd(☃);
/*  81 */       fc fc = fd.t();
/*  82 */       if (!this.d && fc.a() > 1) {
/*  83 */         throw dk.a.create();
/*     */       }
/*  85 */       return new b(fc);
/*     */     } 
/*  87 */     int i = ☃.getCursor();
/*  88 */     while (☃.canRead() && ☃.peek() != ' ') {
/*  89 */       ☃.skip();
/*     */     }
/*  91 */     String str = ☃.getString().substring(i, ☃.getCursor());
/*  92 */     if (str.equals("*")) {
/*  93 */       return (☃, supplier) -> {
/*     */           Collection<String> collection = supplier.get();
/*     */           if (collection.isEmpty()) {
/*     */             throw c.create();
/*     */           }
/*     */           return collection;
/*     */         };
/*     */     }
/* 101 */     Collection<String> collection = Collections.singleton(str);
/* 102 */     return (db1, supplier) -> ☃;
/*     */   }
/*     */ 
/*     */   
/*     */   public Collection<String> getExamples() {
/* 107 */     return b;
/*     */   }
/*     */   
/*     */   @FunctionalInterface
/*     */   public static interface a {
/*     */     Collection<String> getNames(db param1db, Supplier<Collection<String>> param1Supplier) throws CommandSyntaxException;
/*     */   }
/*     */   
/*     */   public static class b implements a {
/*     */     private final fc a;
/*     */     
/*     */     public b(fc ☃) {
/* 119 */       this.a = ☃;
/*     */     }
/*     */ 
/*     */     
/*     */     public Collection<String> getNames(db ☃, Supplier<Collection<String>> supplier) throws CommandSyntaxException {
/* 124 */       List<? extends aqa> list = this.a.b(☃);
/* 125 */       if (list.isEmpty()) {
/* 126 */         throw dk.d.create();
/*     */       }
/* 128 */       List<String> list1 = Lists.newArrayList();
/* 129 */       for (aqa aqa : list) {
/* 130 */         list1.add(aqa.bU());
/*     */       }
/* 132 */       return list1;
/*     */     }
/*     */   }
/*     */   
/*     */   public static class c
/*     */     implements fj<dz> {
/*     */     public void a(dz ☃, nf nf1) {
/* 139 */       byte b = 0;
/* 140 */       if (dz.a(☃)) {
/* 141 */         b = (byte)(b | 0x1);
/*     */       }
/* 143 */       nf1.writeByte(b);
/*     */     }
/*     */ 
/*     */     
/*     */     public dz a(nf ☃) {
/* 148 */       byte b = ☃.readByte();
/* 149 */       boolean bool = ((b & 0x1) != 0);
/* 150 */       return new dz(bool);
/*     */     }
/*     */ 
/*     */     
/*     */     public void a(dz ☃, JsonObject jsonObject) {
/* 155 */       jsonObject.addProperty("amount", dz.a(☃) ? "multiple" : "single");
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */