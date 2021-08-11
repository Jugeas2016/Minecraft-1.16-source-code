/*    */ import com.mojang.brigadier.builder.ArgumentBuilder;
/*    */ import com.mojang.brigadier.context.CommandContext;
/*    */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*    */ import java.util.function.Function;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ final class null
/*    */   implements za.c
/*    */ {
/*    */   null(String paramString) {}
/*    */   
/*    */   public yz a(CommandContext<db> ☃) throws CommandSyntaxException {
/* 32 */     return new zb(dk.a(☃, this.a));
/*    */   }
/*    */ 
/*    */   
/*    */   public ArgumentBuilder<db, ?> a(ArgumentBuilder ☃, Function function) {
/* 37 */     return ☃.then(dc.a("entity").then((ArgumentBuilder)function.apply(dc.a(this.a, dk.a()))));
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\zb$1.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */