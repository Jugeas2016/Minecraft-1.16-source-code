/*    */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*    */ 
/*    */ 
/*    */ public class cz
/*    */   extends RuntimeException
/*    */ {
/*    */   private final nr a;
/*    */   
/*    */   public cz(nr ☃) {
/* 10 */     super(☃.getString(), null, CommandSyntaxException.ENABLE_COMMAND_STACK_TRACES, CommandSyntaxException.ENABLE_COMMAND_STACK_TRACES);
/* 11 */     this.a = ☃;
/*    */   }
/*    */   
/*    */   public nr a() {
/* 15 */     return this.a;
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\cz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */