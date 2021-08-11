/*    */ import com.google.common.collect.Maps;
/*    */ import com.mojang.brigadier.Message;
/*    */ import com.mojang.brigadier.StringReader;
/*    */ import com.mojang.brigadier.arguments.ArgumentType;
/*    */ import com.mojang.brigadier.context.CommandContext;
/*    */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*    */ import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
/*    */ import com.mojang.brigadier.suggestion.Suggestions;
/*    */ import com.mojang.brigadier.suggestion.SuggestionsBuilder;
/*    */ import java.util.Arrays;
/*    */ import java.util.Collection;
/*    */ import java.util.HashMap;
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
/*    */ public class eb
/*    */   implements ArgumentType<Integer>
/*    */ {
/* 27 */   private static final Collection<String> a = Arrays.asList(new String[] { "container.5", "12", "weapon" }); static {
/* 28 */     b = new DynamicCommandExceptionType(☃ -> new of("slot.unknown", new Object[] { ☃ }));
/* 29 */     c = x.<Map<String, Integer>>a(Maps.newHashMap(), ☃ -> {
/*    */           int i;
/*    */           for (i = 0; i < 54; i++) {
/*    */             ☃.put("container." + i, Integer.valueOf(i));
/*    */           }
/*    */           for (i = 0; i < 9; i++)
/*    */             ☃.put("hotbar." + i, Integer.valueOf(i)); 
/*    */           for (i = 0; i < 27; i++)
/*    */             ☃.put("inventory." + i, Integer.valueOf(9 + i)); 
/*    */           for (i = 0; i < 27; i++)
/*    */             ☃.put("enderchest." + i, Integer.valueOf(200 + i)); 
/*    */           for (i = 0; i < 8; i++)
/*    */             ☃.put("villager." + i, Integer.valueOf(300 + i)); 
/*    */           for (i = 0; i < 15; i++)
/*    */             ☃.put("horse." + i, Integer.valueOf(500 + i)); 
/*    */           ☃.put("weapon", Integer.valueOf(98));
/*    */           ☃.put("weapon.mainhand", Integer.valueOf(98));
/*    */           ☃.put("weapon.offhand", Integer.valueOf(99));
/*    */           ☃.put("armor.head", Integer.valueOf(100 + aqf.f.b()));
/*    */           ☃.put("armor.chest", Integer.valueOf(100 + aqf.e.b()));
/*    */           ☃.put("armor.legs", Integer.valueOf(100 + aqf.d.b()));
/*    */           ☃.put("armor.feet", Integer.valueOf(100 + aqf.c.b()));
/*    */           ☃.put("horse.saddle", Integer.valueOf(400));
/*    */           ☃.put("horse.armor", Integer.valueOf(401));
/*    */           ☃.put("horse.chest", Integer.valueOf(499));
/*    */         });
/*    */   }
/*    */   
/*    */   private static final DynamicCommandExceptionType b;
/*    */   private static final Map<String, Integer> c;
/*    */   
/*    */   public static eb a() {
/* 61 */     return new eb();
/*    */   }
/*    */   
/*    */   public static int a(CommandContext<db> ☃, String str) {
/* 65 */     return ((Integer)☃.getArgument(str, Integer.class)).intValue();
/*    */   }
/*    */ 
/*    */   
/*    */   public Integer a(StringReader ☃) throws CommandSyntaxException {
/* 70 */     String str = ☃.readUnquotedString();
/* 71 */     if (!c.containsKey(str)) {
/* 72 */       throw b.create(str);
/*    */     }
/* 74 */     return c.get(str);
/*    */   }
/*    */ 
/*    */   
/*    */   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> ☃, SuggestionsBuilder suggestionsBuilder) {
/* 79 */     return dd.b(c.keySet(), suggestionsBuilder);
/*    */   }
/*    */ 
/*    */   
/*    */   public Collection<String> getExamples() {
/* 84 */     return a;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\eb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */