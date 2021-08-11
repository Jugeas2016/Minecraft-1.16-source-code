/*    */ import com.mojang.brigadier.Message;
/*    */ import com.mojang.brigadier.StringReader;
/*    */ import com.mojang.brigadier.arguments.ArgumentType;
/*    */ import com.mojang.brigadier.context.CommandContext;
/*    */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*    */ import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
/*    */ import com.mojang.datafixers.util.Either;
/*    */ import com.mojang.datafixers.util.Pair;
/*    */ import java.util.Arrays;
/*    */ import java.util.Collection;
/*    */ import java.util.Collections;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ev
/*    */   implements ArgumentType<ev.a>
/*    */ {
/*    */   private static final DynamicCommandExceptionType b;
/*    */   private static final DynamicCommandExceptionType c;
/* 21 */   private static final Collection<String> a = Arrays.asList(new String[] { "foo", "foo:bar", "#foo" }); static {
/* 22 */     b = new DynamicCommandExceptionType(☃ -> new of("arguments.function.tag.unknown", new Object[] { ☃ }));
/* 23 */     c = new DynamicCommandExceptionType(☃ -> new of("arguments.function.unknown", new Object[] { ☃ }));
/*    */   }
/*    */   public static ev a() {
/* 26 */     return new ev();
/*    */   }
/*    */ 
/*    */   
/*    */   public a a(StringReader ☃) throws CommandSyntaxException {
/* 31 */     if (☃.canRead() && ☃.peek() == '#') {
/* 32 */       ☃.skip();
/* 33 */       vk vk1 = vk.a(☃);
/* 34 */       return new a(this, vk1)
/*    */         {
/*    */           public Collection<cy> a(CommandContext<db> ☃) throws CommandSyntaxException {
/* 37 */             ael<cy> ael = ev.a(☃, this.a);
/* 38 */             return ael.b();
/*    */           }
/*    */ 
/*    */           
/*    */           public Pair<vk, Either<cy, ael<cy>>> b(CommandContext<db> ☃) throws CommandSyntaxException {
/* 43 */             return Pair.of(this.a, Either.right(ev.a(☃, this.a)));
/*    */           }
/*    */         };
/*    */     } 
/*    */     
/* 48 */     vk vk = vk.a(☃);
/* 49 */     return new a(this, vk)
/*    */       {
/*    */         public Collection<cy> a(CommandContext<db> ☃) throws CommandSyntaxException {
/* 52 */           return Collections.singleton(ev.b(☃, this.a));
/*    */         }
/*    */ 
/*    */         
/*    */         public Pair<vk, Either<cy, ael<cy>>> b(CommandContext<db> ☃) throws CommandSyntaxException {
/* 57 */           return Pair.of(this.a, Either.left(ev.b(☃, this.a)));
/*    */         }
/*    */       };
/*    */   }
/*    */   
/*    */   private static cy c(CommandContext<db> ☃, vk vk1) throws CommandSyntaxException {
/* 63 */     return ((db)☃.getSource()).j().aB().a(vk1)
/* 64 */       .<Throwable>orElseThrow(() -> c.create(☃.toString()));
/*    */   }
/*    */   
/*    */   private static ael<cy> d(CommandContext<db> ☃, vk vk1) throws CommandSyntaxException {
/* 68 */     ael<cy> ael = ((db)☃.getSource()).j().aB().b(vk1);
/* 69 */     if (ael == null) {
/* 70 */       throw b.create(vk1.toString());
/*    */     }
/* 72 */     return ael;
/*    */   }
/*    */   
/*    */   public static Collection<cy> a(CommandContext<db> ☃, String str) throws CommandSyntaxException {
/* 76 */     return ((a)☃.getArgument(str, a.class)).a(☃);
/*    */   }
/*    */   
/*    */   public static Pair<vk, Either<cy, ael<cy>>> b(CommandContext<db> ☃, String str) throws CommandSyntaxException {
/* 80 */     return ((a)☃.getArgument(str, a.class)).b(☃);
/*    */   }
/*    */ 
/*    */   
/*    */   public Collection<String> getExamples() {
/* 85 */     return a;
/*    */   }
/*    */   
/*    */   public static interface a {
/*    */     Collection<cy> a(CommandContext<db> param1CommandContext) throws CommandSyntaxException;
/*    */     
/*    */     Pair<vk, Either<cy, ael<cy>>> b(CommandContext<db> param1CommandContext) throws CommandSyntaxException;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ev.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */