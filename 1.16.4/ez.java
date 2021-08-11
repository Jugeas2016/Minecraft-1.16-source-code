/*     */ import com.mojang.brigadier.Message;
/*     */ import com.mojang.brigadier.StringReader;
/*     */ import com.mojang.brigadier.arguments.ArgumentType;
/*     */ import com.mojang.brigadier.context.CommandContext;
/*     */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*     */ import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
/*     */ import com.mojang.brigadier.suggestion.Suggestions;
/*     */ import com.mojang.brigadier.suggestion.SuggestionsBuilder;
/*     */ import java.util.Arrays;
/*     */ import java.util.Collection;
/*     */ import java.util.concurrent.CompletableFuture;
/*     */ import java.util.function.Predicate;
/*     */ import javax.annotation.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ez
/*     */   implements ArgumentType<ez.b>
/*     */ {
/*     */   private static final DynamicCommandExceptionType b;
/*  27 */   private static final Collection<String> a = Arrays.asList(new String[] { "stick", "minecraft:stick", "#stick", "#stick{foo=bar}" }); static {
/*  28 */     b = new DynamicCommandExceptionType(☃ -> new of("arguments.item.tag.unknown", new Object[] { ☃ }));
/*     */   }
/*     */   public static ez a() {
/*  31 */     return new ez();
/*     */   }
/*     */ 
/*     */   
/*     */   public b a(StringReader ☃) throws CommandSyntaxException {
/*  36 */     ey ey = (new ey(☃, true)).h();
/*     */     
/*  38 */     if (ey.b() != null) {
/*  39 */       a a = new a(ey.b(), ey.c());
/*  40 */       return commandContext -> ☃;
/*     */     } 
/*  42 */     vk vk = ey.d();
/*  43 */     return commandContext -> {
/*     */         ael<blx> ael = ((db)commandContext.getSource()).j().aG().b().a(☃);
/*     */         if (ael == null) {
/*     */           throw b.create(☃.toString());
/*     */         }
/*     */         return new c(ael, ey1.c());
/*     */       };
/*     */   }
/*     */ 
/*     */   
/*     */   public static Predicate<bmb> a(CommandContext<db> ☃, String str) throws CommandSyntaxException {
/*  54 */     return ((b)☃.getArgument(str, b.class)).create(☃);
/*     */   }
/*     */ 
/*     */   
/*     */   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> ☃, SuggestionsBuilder suggestionsBuilder) {
/*  59 */     StringReader stringReader = new StringReader(suggestionsBuilder.getInput());
/*  60 */     stringReader.setCursor(suggestionsBuilder.getStart());
/*  61 */     ey ey = new ey(stringReader, true);
/*     */     try {
/*  63 */       ey.h();
/*  64 */     } catch (CommandSyntaxException commandSyntaxException) {}
/*     */     
/*  66 */     return ey.a(suggestionsBuilder, aeg.a());
/*     */   }
/*     */ 
/*     */   
/*     */   public Collection<String> getExamples() {
/*  71 */     return a;
/*     */   }
/*     */   
/*     */   public static interface b {
/*     */     Predicate<bmb> create(CommandContext<db> param1CommandContext) throws CommandSyntaxException;
/*     */   }
/*     */   
/*     */   static class a implements Predicate<bmb> {
/*     */     private final blx a;
/*     */     @Nullable
/*     */     private final md b;
/*     */     
/*     */     public a(blx ☃, @Nullable md md1) {
/*  84 */       this.a = ☃;
/*  85 */       this.b = md1;
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean a(bmb ☃) {
/*  90 */       return (☃.b() == this.a && mp.a(this.b, ☃.o(), true));
/*     */     }
/*     */   }
/*     */   
/*     */   static class c implements Predicate<bmb> {
/*     */     private final ael<blx> a;
/*     */     @Nullable
/*     */     private final md b;
/*     */     
/*     */     public c(ael<blx> ☃, @Nullable md md1) {
/* 100 */       this.a = ☃;
/* 101 */       this.b = md1;
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean a(bmb ☃) {
/* 106 */       return (this.a.a(☃.b()) && mp.a(this.b, ☃.o(), true));
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ez.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */