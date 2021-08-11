/*    */ import com.mojang.brigadier.StringReader;
/*    */ import com.mojang.brigadier.arguments.ArgumentType;
/*    */ import com.mojang.brigadier.context.CommandContext;
/*    */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*    */ import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
/*    */ import java.util.Arrays;
/*    */ import java.util.Collection;
/*    */ import java.util.EnumSet;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ep
/*    */   implements ArgumentType<EnumSet<gc.a>>
/*    */ {
/* 17 */   private static final Collection<String> a = Arrays.asList(new String[] { "xyz", "x" });
/* 18 */   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(new of("arguments.swizzle.invalid"));
/*    */   
/*    */   public static ep a() {
/* 21 */     return new ep();
/*    */   }
/*    */ 
/*    */   
/*    */   public static EnumSet<gc.a> a(CommandContext<db> ☃, String str) {
/* 26 */     return (EnumSet<gc.a>)☃.getArgument(str, EnumSet.class);
/*    */   }
/*    */ 
/*    */   
/*    */   public EnumSet<gc.a> a(StringReader ☃) throws CommandSyntaxException {
/* 31 */     EnumSet<gc.a> enumSet = EnumSet.noneOf(gc.a.class);
/*    */     
/* 33 */     while (☃.canRead() && ☃.peek() != ' ') {
/* 34 */       gc.a a; char c = ☃.read();
/*    */ 
/*    */       
/* 37 */       switch (c) {
/*    */         case 'x':
/* 39 */           a = gc.a.a;
/*    */           break;
/*    */         case 'y':
/* 42 */           a = gc.a.b;
/*    */           break;
/*    */         case 'z':
/* 45 */           a = gc.a.c;
/*    */           break;
/*    */         default:
/* 48 */           throw b.create();
/*    */       } 
/*    */       
/* 51 */       if (enumSet.contains(a)) {
/* 52 */         throw b.create();
/*    */       }
/* 54 */       enumSet.add(a);
/*    */     } 
/*    */     
/* 57 */     return enumSet;
/*    */   }
/*    */ 
/*    */   
/*    */   public Collection<String> getExamples() {
/* 62 */     return a;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\ep.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */