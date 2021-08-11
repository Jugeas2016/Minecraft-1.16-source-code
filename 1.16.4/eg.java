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
/*     */ import java.util.Map;
/*     */ import java.util.Set;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class eg
/*     */   implements ArgumentType<eg.b>
/*     */ {
/*     */   private static final DynamicCommandExceptionType b;
/*  33 */   private static final Collection<String> a = Arrays.asList(new String[] { "stone", "minecraft:stone", "stone[foo=bar]", "#stone", "#stone[foo=bar]{baz=nbt}" }); static {
/*  34 */     b = new DynamicCommandExceptionType(☃ -> new of("arguments.block.tag.unknown", new Object[] { ☃ }));
/*     */   }
/*     */   public static eg a() {
/*  37 */     return new eg();
/*     */   }
/*     */ 
/*     */   
/*     */   public b a(StringReader ☃) throws CommandSyntaxException {
/*  42 */     ei ei = (new ei(☃, true)).a(true);
/*     */     
/*  44 */     if (ei.b() != null) {
/*  45 */       a a = new a(ei.b(), ei.a().keySet(), ei.c());
/*  46 */       return aen1 -> ☃;
/*     */     } 
/*  48 */     vk vk = ei.d();
/*  49 */     return aen1 -> {
/*     */         ael<buo> ael = aen1.a().a(☃);
/*     */         if (ael == null) {
/*     */           throw b.create(☃.toString());
/*     */         }
/*     */         return new c(ael, ei1.j(), ei1.c());
/*     */       };
/*     */   }
/*     */ 
/*     */   
/*     */   public static Predicate<cel> a(CommandContext<db> ☃, String str) throws CommandSyntaxException {
/*  60 */     return ((b)☃.getArgument(str, b.class)).create(((db)☃.getSource()).j().aG());
/*     */   }
/*     */ 
/*     */   
/*     */   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> ☃, SuggestionsBuilder suggestionsBuilder) {
/*  65 */     StringReader stringReader = new StringReader(suggestionsBuilder.getInput());
/*  66 */     stringReader.setCursor(suggestionsBuilder.getStart());
/*  67 */     ei ei = new ei(stringReader, true);
/*     */     try {
/*  69 */       ei.a(true);
/*  70 */     } catch (CommandSyntaxException commandSyntaxException) {}
/*     */     
/*  72 */     return ei.a(suggestionsBuilder, aed.a());
/*     */   }
/*     */ 
/*     */   
/*     */   public Collection<String> getExamples() {
/*  77 */     return a;
/*     */   }
/*     */   
/*     */   public static interface b {
/*     */     Predicate<cel> create(aen param1aen) throws CommandSyntaxException;
/*     */   }
/*     */   
/*     */   static class a implements Predicate<cel> {
/*     */     private final ceh a;
/*     */     private final Set<cfj<?>> b;
/*     */     @Nullable
/*     */     private final md c;
/*     */     
/*     */     public a(ceh ☃, Set<cfj<?>> set, @Nullable md md1) {
/*  91 */       this.a = ☃;
/*  92 */       this.b = set;
/*  93 */       this.c = md1;
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean a(cel ☃) {
/*  98 */       ceh ceh1 = ☃.a();
/*     */       
/* 100 */       if (!ceh1.a(this.a.b())) {
/* 101 */         return false;
/*     */       }
/*     */       
/* 104 */       for (cfj<?> cfj : this.b) {
/* 105 */         if (ceh1.c(cfj) != this.a.c(cfj)) {
/* 106 */           return false;
/*     */         }
/*     */       } 
/*     */       
/* 110 */       if (this.c != null) {
/* 111 */         ccj ccj = ☃.b();
/* 112 */         return (ccj != null && mp.a(this.c, ccj.a(new md()), true));
/*     */       } 
/*     */       
/* 115 */       return true;
/*     */     }
/*     */   }
/*     */   
/*     */   static class c implements Predicate<cel> {
/*     */     private final ael<buo> a;
/*     */     @Nullable
/*     */     private final md b;
/*     */     private final Map<String, String> c;
/*     */     
/*     */     private c(ael<buo> ☃, Map<String, String> map, @Nullable md md1) {
/* 126 */       this.a = ☃;
/* 127 */       this.c = map;
/* 128 */       this.b = md1;
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean a(cel ☃) {
/* 133 */       ceh ceh = ☃.a();
/*     */       
/* 135 */       if (!ceh.a(this.a)) {
/* 136 */         return false;
/*     */       }
/*     */       
/* 139 */       for (Map.Entry<String, String> entry : this.c.entrySet()) {
/* 140 */         cfj<?> cfj = ceh.b().m().a(entry.getKey());
/* 141 */         if (cfj == null) {
/* 142 */           return false;
/*     */         }
/* 144 */         Comparable<?> comparable = cfj.b(entry.getValue()).orElse(null);
/* 145 */         if (comparable == null) {
/* 146 */           return false;
/*     */         }
/* 148 */         if (ceh.c(cfj) != comparable) {
/* 149 */           return false;
/*     */         }
/*     */       } 
/*     */       
/* 153 */       if (this.b != null) {
/* 154 */         ccj ccj = ☃.b();
/* 155 */         return (ccj != null && mp.a(this.b, ccj.a(new md()), true));
/*     */       } 
/*     */       
/* 158 */       return true;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\eg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */