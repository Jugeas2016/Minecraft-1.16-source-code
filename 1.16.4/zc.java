/*    */ import com.mojang.brigadier.builder.ArgumentBuilder;
/*    */ import com.mojang.brigadier.builder.RequiredArgumentBuilder;
/*    */ import com.mojang.brigadier.context.CommandContext;
/*    */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*    */ import com.mojang.brigadier.suggestion.SuggestionProvider;
/*    */ import com.mojang.brigadier.suggestion.SuggestionsBuilder;
/*    */ import java.util.Locale;
/*    */ import java.util.concurrent.CompletableFuture;
/*    */ import java.util.function.Function;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class zc
/*    */   implements yz
/*    */ {
/*    */   private static final SuggestionProvider<db> b;
/*    */   public static final Function<String, za.c> a;
/*    */   private final cya c;
/*    */   private final vk d;
/*    */   
/*    */   static {
/* 25 */     b = ((☃, suggestionsBuilder) -> dd.a(b(☃).a(), suggestionsBuilder));
/*    */ 
/*    */     
/* 28 */     a = (☃ -> new za.c(☃)
/*    */       {
/*    */         public yz a(CommandContext<db> ☃) {
/* 31 */           return new zc(zc.a(☃), dy.e(☃, this.a));
/*    */         }
/*    */ 
/*    */         
/*    */         public ArgumentBuilder<db, ?> a(ArgumentBuilder ☃, Function<RequiredArgumentBuilder, ArgumentBuilder> function) {
/* 36 */           return ☃.then(dc.a("storage").then(function.apply(dc.<T>a(this.a, dy.a()).suggests(zc.c()))));
/*    */         }
/*    */       });
/*    */   }
/*    */   private static cya b(CommandContext<db> ☃) {
/* 41 */     return ((db)☃.getSource()).j().aI();
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   private zc(cya ☃, vk vk1) {
/* 48 */     this.c = ☃;
/* 49 */     this.d = vk1;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(md ☃) {
/* 54 */     this.c.a(this.d, ☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public md a() {
/* 59 */     return this.c.a(this.d);
/*    */   }
/*    */ 
/*    */   
/*    */   public nr b() {
/* 64 */     return new of("commands.data.storage.modified", new Object[] { this.d });
/*    */   }
/*    */ 
/*    */   
/*    */   public nr a(mt ☃) {
/* 69 */     return new of("commands.data.storage.query", new Object[] { this.d, ☃.l() });
/*    */   }
/*    */ 
/*    */   
/*    */   public nr a(dr.h ☃, double d, int i) {
/* 74 */     return new of("commands.data.storage.get", new Object[] { ☃, this.d, String.format(Locale.ROOT, "%.2f", new Object[] { Double.valueOf(d) }), Integer.valueOf(i) });
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\zc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */