/*    */ import com.mojang.brigadier.StringReader;
/*    */ import com.mojang.brigadier.arguments.ArgumentType;
/*    */ import com.mojang.brigadier.context.CommandContext;
/*    */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*    */ import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
/*    */ import java.util.Arrays;
/*    */ import java.util.Collection;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class de
/*    */   implements ArgumentType<de.a>
/*    */ {
/* 17 */   private static final Collection<String> b = Arrays.asList(new String[] { "0", "~", "~-5" });
/* 18 */   public static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(new of("argument.angle.incomplete"));
/*    */   
/*    */   public static de a() {
/* 21 */     return new de();
/*    */   }
/*    */   
/*    */   public static float a(CommandContext<db> ☃, String str) {
/* 25 */     return ((a)☃.getArgument(str, a.class)).a((db)☃.getSource());
/*    */   }
/*    */ 
/*    */   
/*    */   public a a(StringReader ☃) throws CommandSyntaxException {
/* 30 */     if (!☃.canRead()) {
/* 31 */       throw a.createWithContext(☃);
/*    */     }
/*    */     
/* 34 */     boolean bool = es.b(☃);
/* 35 */     float f = (☃.canRead() && ☃.peek() != ' ') ? ☃.readFloat() : 0.0F;
/* 36 */     return new a(f, bool);
/*    */   }
/*    */ 
/*    */   
/*    */   public Collection<String> getExamples() {
/* 41 */     return b;
/*    */   }
/*    */   
/*    */   public static final class a {
/*    */     private final float a;
/*    */     private final boolean b;
/*    */     
/*    */     private a(float ☃, boolean bool) {
/* 49 */       this.a = ☃;
/* 50 */       this.b = bool;
/*    */     }
/*    */     
/*    */     public float a(db ☃) {
/* 54 */       return afm.g(this.b ? (this.a + (☃.i()).j) : this.a);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\de.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */