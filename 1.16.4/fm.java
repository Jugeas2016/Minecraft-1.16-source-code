/*    */ import com.google.common.collect.Maps;
/*    */ import com.mojang.brigadier.Message;
/*    */ import com.mojang.brigadier.context.CommandContext;
/*    */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*    */ import com.mojang.brigadier.suggestion.SuggestionProvider;
/*    */ import com.mojang.brigadier.suggestion.Suggestions;
/*    */ import com.mojang.brigadier.suggestion.SuggestionsBuilder;
/*    */ import java.util.Map;
/*    */ import java.util.concurrent.CompletableFuture;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class fm
/*    */ {
/* 21 */   private static final Map<vk, SuggestionProvider<dd>> f = Maps.newHashMap();
/* 22 */   private static final vk g = new vk("ask_server"); public static final SuggestionProvider<dd> a; public static final SuggestionProvider<db> b;
/*    */   static {
/* 24 */     a = a(g, (☃, suggestionsBuilder) -> ((dd)☃.getSource()).a(☃, suggestionsBuilder));
/* 25 */     b = a(new vk("all_recipes"), (☃, suggestionsBuilder) -> dd.a(((dd)☃.getSource()).o(), suggestionsBuilder));
/* 26 */     c = a(new vk("available_sounds"), (☃, suggestionsBuilder) -> dd.a(((dd)☃.getSource()).n(), suggestionsBuilder));
/* 27 */     d = a(new vk("available_biomes"), (☃, suggestionsBuilder) -> dd.a(((dd)☃.getSource()).q().<bsv>b(gm.ay).c(), suggestionsBuilder));
/* 28 */     e = a(new vk("summonable_entities"), (☃, suggestionsBuilder) -> dd.a(gm.S.g().filter(aqe::b), suggestionsBuilder, aqe::a, ()));
/*    */   }
/*    */   public static final SuggestionProvider<db> c; public static final SuggestionProvider<db> d; public static final SuggestionProvider<db> e;
/*    */   public static <S extends dd> SuggestionProvider<S> a(vk ☃, SuggestionProvider<dd> suggestionProvider) {
/* 32 */     if (f.containsKey(☃)) {
/* 33 */       throw new IllegalArgumentException("A command suggestion provider is already registered with the name " + ☃);
/*    */     }
/* 35 */     f.put(☃, suggestionProvider);
/* 36 */     return new a(☃, suggestionProvider);
/*    */   }
/*    */   
/*    */   public static SuggestionProvider<dd> a(vk ☃) {
/* 40 */     return f.getOrDefault(☃, a);
/*    */   }
/*    */   
/*    */   public static vk a(SuggestionProvider<dd> ☃) {
/* 44 */     if (☃ instanceof a) {
/* 45 */       return a.a((a)☃);
/*    */     }
/* 47 */     return g;
/*    */   }
/*    */ 
/*    */   
/*    */   public static SuggestionProvider<dd> b(SuggestionProvider<dd> ☃) {
/* 52 */     if (☃ instanceof a) {
/* 53 */       return ☃;
/*    */     }
/* 55 */     return a;
/*    */   }
/*    */   
/*    */   public static class a
/*    */     implements SuggestionProvider<dd> {
/*    */     private final SuggestionProvider<dd> a;
/*    */     private final vk b;
/*    */     
/*    */     public a(vk ☃, SuggestionProvider<dd> suggestionProvider) {
/* 64 */       this.a = suggestionProvider;
/* 65 */       this.b = ☃;
/*    */     }
/*    */ 
/*    */     
/*    */     public CompletableFuture<Suggestions> getSuggestions(CommandContext<dd> ☃, SuggestionsBuilder suggestionsBuilder) throws CommandSyntaxException {
/* 70 */       return this.a.getSuggestions(☃, suggestionsBuilder);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\fm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */