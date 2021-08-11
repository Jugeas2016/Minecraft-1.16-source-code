/*     */ import com.google.common.base.Strings;
/*     */ import com.google.common.collect.Lists;
/*     */ import com.mojang.brigadier.Message;
/*     */ import com.mojang.brigadier.context.CommandContext;
/*     */ import com.mojang.brigadier.suggestion.Suggestions;
/*     */ import com.mojang.brigadier.suggestion.SuggestionsBuilder;
/*     */ import java.util.Collection;
/*     */ import java.util.Collections;
/*     */ import java.util.List;
/*     */ import java.util.Locale;
/*     */ import java.util.Set;
/*     */ import java.util.concurrent.CompletableFuture;
/*     */ import java.util.function.Consumer;
/*     */ import java.util.function.Function;
/*     */ import java.util.function.Predicate;
/*     */ import java.util.stream.Stream;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public interface dd
/*     */ {
/*     */   public static class a
/*     */   {
/*  27 */     public static final a a = new a("^", "^", "^");
/*     */     
/*  29 */     public static final a b = new a("~", "~", "~");
/*     */     
/*     */     public final String c;
/*     */     
/*     */     public final String d;
/*     */     
/*     */     public final String e;
/*     */     
/*     */     public a(String ☃, String str1, String str2) {
/*  38 */       this.c = ☃;
/*  39 */       this.d = str1;
/*  40 */       this.e = str2;
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   default Collection<String> r() {
/*  47 */     return Collections.emptyList();
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
/*     */   default Collection<a> s() {
/*  59 */     return Collections.singleton(a.b);
/*     */   }
/*     */   
/*     */   default Collection<a> t() {
/*  63 */     return Collections.singleton(a.b);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   static <T> void a(Iterable<T> ☃, String str, Function<T, vk> function, Consumer<T> consumer) {
/*  73 */     boolean bool = (str.indexOf(':') > -1);
/*  74 */     for (T t : ☃) {
/*  75 */       vk vk = function.apply(t);
/*  76 */       if (bool) {
/*  77 */         String str1 = vk.toString();
/*  78 */         if (a(str, str1))
/*  79 */           consumer.accept(t); 
/*     */         continue;
/*     */       } 
/*  82 */       if (a(str, vk.b()) || (vk.b().equals("minecraft") && a(str, vk.a()))) {
/*  83 */         consumer.accept(t);
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   static <T> void a(Iterable<T> ☃, String str1, String str2, Function<T, vk> function, Consumer<T> consumer) {
/*  90 */     if (str1.isEmpty()) {
/*  91 */       ☃.forEach(consumer);
/*     */     } else {
/*  93 */       String str = Strings.commonPrefix(str1, str2);
/*  94 */       if (!str.isEmpty()) {
/*  95 */         String str3 = str1.substring(str.length());
/*  96 */         a(☃, str3, function, consumer);
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   static CompletableFuture<Suggestions> a(Iterable<vk> ☃, SuggestionsBuilder suggestionsBuilder, String str) {
/* 102 */     String str1 = suggestionsBuilder.getRemaining().toLowerCase(Locale.ROOT);
/* 103 */     a(☃, str1, str, ☃ -> ☃, vk1 -> ☃.suggest(str + vk1));
/* 104 */     return suggestionsBuilder.buildFuture();
/*     */   }
/*     */   
/*     */   static CompletableFuture<Suggestions> a(Iterable<vk> ☃, SuggestionsBuilder suggestionsBuilder) {
/* 108 */     String str = suggestionsBuilder.getRemaining().toLowerCase(Locale.ROOT);
/* 109 */     a(☃, str, ☃ -> ☃, vk1 -> ☃.suggest(vk1.toString()));
/* 110 */     return suggestionsBuilder.buildFuture();
/*     */   }
/*     */   
/*     */   static <T> CompletableFuture<Suggestions> a(Iterable<T> ☃, SuggestionsBuilder suggestionsBuilder, Function<T, vk> function, Function<T, Message> function1) {
/* 114 */     String str = suggestionsBuilder.getRemaining().toLowerCase(Locale.ROOT);
/* 115 */     a(☃, str, function, object -> ☃.suggest(((vk)function.apply(object)).toString(), function1.apply(object)));
/* 116 */     return suggestionsBuilder.buildFuture();
/*     */   }
/*     */   
/*     */   static CompletableFuture<Suggestions> a(Stream<vk> ☃, SuggestionsBuilder suggestionsBuilder) {
/* 120 */     return a(☃::iterator, suggestionsBuilder);
/*     */   }
/*     */   
/*     */   static <T> CompletableFuture<Suggestions> a(Stream<T> ☃, SuggestionsBuilder suggestionsBuilder, Function<T, vk> function, Function<T, Message> function1) {
/* 124 */     return a(☃::iterator, suggestionsBuilder, function, function1);
/*     */   }
/*     */   
/*     */   static CompletableFuture<Suggestions> a(String ☃, Collection<a> collection, SuggestionsBuilder suggestionsBuilder, Predicate<String> predicate) {
/* 128 */     List<String> list = Lists.newArrayList();
/*     */     
/* 130 */     if (Strings.isNullOrEmpty(☃)) {
/* 131 */       for (a a : collection) {
/* 132 */         String str = a.c + " " + a.d + " " + a.e;
/* 133 */         if (predicate.test(str)) {
/* 134 */           list.add(a.c);
/* 135 */           list.add(a.c + " " + a.d);
/* 136 */           list.add(str);
/*     */         } 
/*     */       } 
/*     */     } else {
/* 140 */       String[] arrayOfString = ☃.split(" ");
/*     */       
/* 142 */       if (arrayOfString.length == 1) {
/* 143 */         for (a a : collection) {
/* 144 */           String str = arrayOfString[0] + " " + a.d + " " + a.e;
/* 145 */           if (predicate.test(str)) {
/* 146 */             list.add(arrayOfString[0] + " " + a.d);
/* 147 */             list.add(str);
/*     */           } 
/*     */         } 
/* 150 */       } else if (arrayOfString.length == 2) {
/* 151 */         for (a a : collection) {
/* 152 */           String str = arrayOfString[0] + " " + arrayOfString[1] + " " + a.e;
/* 153 */           if (predicate.test(str)) {
/* 154 */             list.add(str);
/*     */           }
/*     */         } 
/*     */       } 
/*     */     } 
/* 159 */     return b(list, suggestionsBuilder);
/*     */   }
/*     */   
/*     */   static CompletableFuture<Suggestions> b(String ☃, Collection<a> collection, SuggestionsBuilder suggestionsBuilder, Predicate<String> predicate) {
/* 163 */     List<String> list = Lists.newArrayList();
/*     */     
/* 165 */     if (Strings.isNullOrEmpty(☃)) {
/* 166 */       for (a a : collection) {
/* 167 */         String str = a.c + " " + a.e;
/* 168 */         if (predicate.test(str)) {
/* 169 */           list.add(a.c);
/* 170 */           list.add(str);
/*     */         } 
/*     */       } 
/*     */     } else {
/* 174 */       String[] arrayOfString = ☃.split(" ");
/* 175 */       if (arrayOfString.length == 1) {
/* 176 */         for (a a : collection) {
/* 177 */           String str = arrayOfString[0] + " " + a.e;
/* 178 */           if (predicate.test(str)) {
/* 179 */             list.add(str);
/*     */           }
/*     */         } 
/*     */       }
/*     */     } 
/* 184 */     return b(list, suggestionsBuilder);
/*     */   }
/*     */   
/*     */   static CompletableFuture<Suggestions> b(Iterable<String> ☃, SuggestionsBuilder suggestionsBuilder) {
/* 188 */     String str = suggestionsBuilder.getRemaining().toLowerCase(Locale.ROOT);
/* 189 */     for (String str1 : ☃) {
/* 190 */       if (a(str, str1.toLowerCase(Locale.ROOT))) {
/* 191 */         suggestionsBuilder.suggest(str1);
/*     */       }
/*     */     } 
/* 194 */     return suggestionsBuilder.buildFuture();
/*     */   }
/*     */   
/*     */   static CompletableFuture<Suggestions> b(Stream<String> ☃, SuggestionsBuilder suggestionsBuilder) {
/* 198 */     String str = suggestionsBuilder.getRemaining().toLowerCase(Locale.ROOT);
/* 199 */     ☃.filter(str1 -> a(☃, str1.toLowerCase(Locale.ROOT))).forEach(suggestionsBuilder::suggest);
/* 200 */     return suggestionsBuilder.buildFuture();
/*     */   }
/*     */   
/*     */   static CompletableFuture<Suggestions> a(String[] ☃, SuggestionsBuilder suggestionsBuilder) {
/* 204 */     String str = suggestionsBuilder.getRemaining().toLowerCase(Locale.ROOT);
/* 205 */     for (String str1 : ☃) {
/* 206 */       if (a(str, str1.toLowerCase(Locale.ROOT))) {
/* 207 */         suggestionsBuilder.suggest(str1);
/*     */       }
/*     */     } 
/* 210 */     return suggestionsBuilder.buildFuture();
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
/*     */   
/*     */   static boolean a(String ☃, String str1) {
/* 225 */     int i = 0;
/* 226 */     while (!str1.startsWith(☃, i)) {
/* 227 */       i = str1.indexOf('_', i);
/* 228 */       if (i < 0) {
/* 229 */         return false;
/*     */       }
/*     */       
/* 232 */       i++;
/*     */     } 
/*     */     
/* 235 */     return true;
/*     */   }
/*     */   
/*     */   Collection<String> l();
/*     */   
/*     */   Collection<String> m();
/*     */   
/*     */   Collection<vk> n();
/*     */   
/*     */   Stream<vk> o();
/*     */   
/*     */   CompletableFuture<Suggestions> a(CommandContext<dd> paramCommandContext, SuggestionsBuilder paramSuggestionsBuilder);
/*     */   
/*     */   Set<vj<brx>> p();
/*     */   
/*     */   gn q();
/*     */   
/*     */   boolean c(int paramInt);
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dd.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */