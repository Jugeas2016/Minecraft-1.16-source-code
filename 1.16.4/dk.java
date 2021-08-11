/*     */ import com.google.common.collect.Iterables;
/*     */ import com.google.gson.JsonObject;
/*     */ import com.mojang.brigadier.StringReader;
/*     */ import com.mojang.brigadier.arguments.ArgumentType;
/*     */ import com.mojang.brigadier.context.CommandContext;
/*     */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*     */ import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
/*     */ import com.mojang.brigadier.suggestion.Suggestions;
/*     */ import com.mojang.brigadier.suggestion.SuggestionsBuilder;
/*     */ import java.util.Arrays;
/*     */ import java.util.Collection;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class dk
/*     */   implements ArgumentType<fc>
/*     */ {
/*  29 */   private static final Collection<String> g = Arrays.asList(new String[] { "Player", "0123", "@e", "@e[type=foo]", "dd12be42-52a9-4a91-a8a1-11c01849e498" });
/*  30 */   public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(new of("argument.entity.toomany"));
/*  31 */   public static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(new of("argument.player.toomany"));
/*  32 */   public static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(new of("argument.player.entities"));
/*  33 */   public static final SimpleCommandExceptionType d = new SimpleCommandExceptionType(new of("argument.entity.notfound.entity"));
/*  34 */   public static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(new of("argument.entity.notfound.player"));
/*  35 */   public static final SimpleCommandExceptionType f = new SimpleCommandExceptionType(new of("argument.entity.selector.not_allowed"));
/*     */ 
/*     */   
/*     */   private final boolean h;
/*     */   
/*     */   private final boolean i;
/*     */ 
/*     */   
/*     */   protected dk(boolean ☃, boolean bool1) {
/*  44 */     this.h = ☃;
/*  45 */     this.i = bool1;
/*     */   }
/*     */   
/*     */   public static dk a() {
/*  49 */     return new dk(true, false);
/*     */   }
/*     */   
/*     */   public static aqa a(CommandContext<db> ☃, String str) throws CommandSyntaxException {
/*  53 */     return ((fc)☃.getArgument(str, fc.class)).a((db)☃.getSource());
/*     */   }
/*     */   
/*     */   public static dk b() {
/*  57 */     return new dk(false, false);
/*     */   }
/*     */   
/*     */   public static Collection<? extends aqa> b(CommandContext<db> ☃, String str) throws CommandSyntaxException {
/*  61 */     Collection<? extends aqa> collection = c(☃, str);
/*  62 */     if (collection.isEmpty()) {
/*  63 */       throw d.create();
/*     */     }
/*  65 */     return collection;
/*     */   }
/*     */   
/*     */   public static Collection<? extends aqa> c(CommandContext<db> ☃, String str) throws CommandSyntaxException {
/*  69 */     return ((fc)☃.getArgument(str, fc.class)).b((db)☃.getSource());
/*     */   }
/*     */   
/*     */   public static Collection<aah> d(CommandContext<db> ☃, String str) throws CommandSyntaxException {
/*  73 */     return ((fc)☃.getArgument(str, fc.class)).d((db)☃.getSource());
/*     */   }
/*     */   
/*     */   public static dk c() {
/*  77 */     return new dk(true, true);
/*     */   }
/*     */   
/*     */   public static aah e(CommandContext<db> ☃, String str) throws CommandSyntaxException {
/*  81 */     return ((fc)☃.getArgument(str, fc.class)).c((db)☃.getSource());
/*     */   }
/*     */   
/*     */   public static dk d() {
/*  85 */     return new dk(false, true);
/*     */   }
/*     */   
/*     */   public static Collection<aah> f(CommandContext<db> ☃, String str) throws CommandSyntaxException {
/*  89 */     List<aah> list = ((fc)☃.getArgument(str, fc.class)).d((db)☃.getSource());
/*  90 */     if (list.isEmpty()) {
/*  91 */       throw e.create();
/*     */     }
/*  93 */     return list;
/*     */   }
/*     */ 
/*     */   
/*     */   public fc a(StringReader ☃) throws CommandSyntaxException {
/*  98 */     int i = 0;
/*  99 */     fd fd = new fd(☃);
/* 100 */     fc fc = fd.t();
/* 101 */     if (fc.a() > 1 && this.h) {
/* 102 */       if (this.i) {
/* 103 */         ☃.setCursor(0);
/* 104 */         throw b.createWithContext(☃);
/*     */       } 
/* 106 */       ☃.setCursor(0);
/* 107 */       throw a.createWithContext(☃);
/*     */     } 
/*     */     
/* 110 */     if (fc.b() && this.i && !fc.c()) {
/* 111 */       ☃.setCursor(0);
/* 112 */       throw c.createWithContext(☃);
/*     */     } 
/*     */     
/* 115 */     return fc;
/*     */   }
/*     */ 
/*     */   
/*     */   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> ☃, SuggestionsBuilder suggestionsBuilder) {
/* 120 */     if (☃.getSource() instanceof dd) {
/* 121 */       StringReader stringReader = new StringReader(suggestionsBuilder.getInput());
/* 122 */       stringReader.setCursor(suggestionsBuilder.getStart());
/* 123 */       dd dd = (dd)☃.getSource();
/* 124 */       fd fd = new fd(stringReader, dd.c(2));
/*     */       try {
/* 126 */         fd.t();
/* 127 */       } catch (CommandSyntaxException commandSyntaxException) {}
/*     */       
/* 129 */       return fd.a(suggestionsBuilder, suggestionsBuilder -> {
/*     */             Collection<String> collection = ☃.l();
/*     */             Iterable<String> iterable = this.i ? collection : Iterables.concat(collection, ☃.r());
/*     */             dd.b(iterable, suggestionsBuilder);
/*     */           });
/*     */     } 
/* 135 */     return Suggestions.empty();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Collection<String> getExamples() {
/* 141 */     return g;
/*     */   }
/*     */   
/*     */   public static class a
/*     */     implements fj<dk> {
/*     */     public void a(dk ☃, nf nf1) {
/* 147 */       byte b = 0;
/* 148 */       if (dk.a(☃)) {
/* 149 */         b = (byte)(b | 0x1);
/*     */       }
/* 151 */       if (dk.b(☃)) {
/* 152 */         b = (byte)(b | 0x2);
/*     */       }
/* 154 */       nf1.writeByte(b);
/*     */     }
/*     */ 
/*     */     
/*     */     public dk a(nf ☃) {
/* 159 */       byte b = ☃.readByte();
/* 160 */       return new dk(((b & 0x1) != 0), ((b & 0x2) != 0));
/*     */     }
/*     */ 
/*     */     
/*     */     public void a(dk ☃, JsonObject jsonObject) {
/* 165 */       jsonObject.addProperty("amount", dk.a(☃) ? "single" : "multiple");
/* 166 */       jsonObject.addProperty("type", dk.b(☃) ? "players" : "entities");
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\dk.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */